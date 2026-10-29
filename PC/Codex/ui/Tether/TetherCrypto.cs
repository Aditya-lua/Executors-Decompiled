using System;
using System.Security.Cryptography;

namespace Tether;

internal static class TetherCrypto
{
	public const byte ClientRole = 67;

	public const byte ServerRole = 83;

	public static uint ClientPrefix(uint SessionId)
	{
		return SessionId & 0x7FFFFFFF;
	}

	public static uint ServerPrefix(uint SessionId)
	{
		return SessionId | 0x80000000u;
	}

	public static byte[] DeriveAuthKey(byte[] Psk)
	{
		byte[] array = new byte[32];
		HKDF.DeriveKey(HashAlgorithmName.SHA256, Psk, array, ReadOnlySpan<byte>.Empty, "tether/1 auth"u8);
		return array;
	}

	public static byte[] DeriveSharedKey(byte[] Psk, ReadOnlySpan<byte> InstanceSalt)
	{
		byte[] array = new byte[32];
		HKDF.DeriveKey(HashAlgorithmName.SHA256, Psk, array, InstanceSalt, "tether/1 shared"u8);
		return array;
	}

	public static void DeriveSessionKeys(ReadOnlySpan<byte> EcdhSecret, byte[] Psk, ReadOnlySpan<byte> ServerNonce, ReadOnlySpan<byte> ClientNonce, Span<byte> Output64)
	{
		Span<byte> span = stackalloc byte[32];
		SHA256.HashData(Psk, span);
		ReadOnlySpan<byte> readOnlySpan = "tether/1 session"u8;
		Span<byte> span2 = stackalloc byte[readOnlySpan.Length + ServerNonce.Length + ClientNonce.Length];
		readOnlySpan.CopyTo(span2);
		ServerNonce.CopyTo(span2.Slice(readOnlySpan.Length));
		ClientNonce.CopyTo(span2.Slice(readOnlySpan.Length + ServerNonce.Length));
		HKDF.DeriveKey(HashAlgorithmName.SHA256, EcdhSecret, Output64, span, span2);
	}

	public static void ComputeMac(byte[] AuthKey, byte Role, ReadOnlySpan<byte> ChallengeFrame, ReadOnlySpan<byte> ClientNonce, ReadOnlySpan<byte> ClientPublicKey, ReadOnlySpan<byte> HelloJson, Span<byte> Mac)
	{
		using IncrementalHash incrementalHash = IncrementalHash.CreateHMAC(HashAlgorithmName.SHA256, AuthKey);
		Span<byte> span = stackalloc byte[1];
		span[0] = Role;
		incrementalHash.AppendData(span);
		incrementalHash.AppendData(ChallengeFrame);
		incrementalHash.AppendData(ClientNonce);
		incrementalHash.AppendData(ClientPublicKey);
		incrementalHash.AppendData(HelloJson);
		incrementalHash.GetHashAndReset(Mac);
	}

	public static ECDiffieHellman CreateEphemeral()
	{
		return ECDiffieHellman.Create(ECCurve.NamedCurves.nistP256);
	}

	public static void ExportPublicKey(ECDiffieHellman Ecdh, Span<byte> Destination65)
	{
		ECParameters eCParameters = Ecdh.ExportParameters(includePrivateParameters: false);
		Destination65[0] = 4;
		eCParameters.Q.X.AsSpan().CopyTo(Destination65.Slice(1, 32));
		eCParameters.Q.Y.AsSpan().CopyTo(Destination65.Slice(33, 32));
	}

	public static byte[] DeriveSecret(ECDiffieHellman Mine, ReadOnlySpan<byte> PeerPublic65)
	{
		if (PeerPublic65.Length != 65 || PeerPublic65[0] != 4)
		{
			throw new CryptographicException("Invalid public key encoding.");
		}
		using ECDiffieHellman eCDiffieHellman = ECDiffieHellman.Create(new ECParameters
		{
			Curve = ECCurve.NamedCurves.nistP256,
			Q = new ECPoint
			{
				X = PeerPublic65.Slice(1, 32).ToArray(),
				Y = PeerPublic65.Slice(33, 32).ToArray()
			}
		});
		using ECDiffieHellmanPublicKey otherPartyPublicKey = eCDiffieHellman.PublicKey;
		return Mine.DeriveRawSecretAgreement(otherPartyPublicKey);
	}
}
