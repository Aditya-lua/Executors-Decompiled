using System;
using System.Buffers.Binary;
using System.Security.Cryptography;

namespace Tether;

internal sealed class SessionCipher : IDisposable
{
	private readonly AesGcm Send;

	private readonly AesGcm Receive;

	private readonly uint SendPrefix;

	private readonly uint ReceivePrefix;

	public SessionCipher(ReadOnlySpan<byte> SendKey, ReadOnlySpan<byte> ReceiveKey, uint SendPrefix, uint ReceivePrefix)
	{
		Send = new AesGcm(SendKey, 16);
		Receive = new AesGcm(ReceiveKey, 16);
		this.SendPrefix = SendPrefix;
		this.ReceivePrefix = ReceivePrefix;
	}

	public void Encrypt(ulong Counter, ReadOnlySpan<byte> Aad, Span<byte> Data, Span<byte> Tag)
	{
		Span<byte> span = stackalloc byte[12];
		WriteNonce(span, SendPrefix, Counter);
		Send.Encrypt(span, Data, Data, Tag, Aad);
	}

	public bool TryDecrypt(ulong Counter, ReadOnlySpan<byte> Aad, Span<byte> Data, ReadOnlySpan<byte> Tag)
	{
		Span<byte> span = stackalloc byte[12];
		WriteNonce(span, ReceivePrefix, Counter);
		try
		{
			Receive.Decrypt(span, Data, Tag, Data, Aad);
			return true;
		}
		catch (CryptographicException)
		{
			CryptographicOperations.ZeroMemory(Data);
			return false;
		}
	}

	private static void WriteNonce(Span<byte> Nonce, uint Prefix, ulong Counter)
	{
		BinaryPrimitives.WriteUInt32LittleEndian(Nonce, Prefix);
		BinaryPrimitives.WriteUInt64LittleEndian(Nonce.Slice(4), Counter);
	}

	public void Dispose()
	{
		Send.Dispose();
		Receive.Dispose();
	}
}
