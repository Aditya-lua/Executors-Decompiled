using System;
using Tether;
using dotnet_codex_ui.Configuration;
using dotnet_codex_ui.Infrastructure.Processes;

namespace dotnet_codex_ui.Features.Connections;

internal sealed record TetherSettings(bool Enabled, int Port, EncryptionMode Encryption, bool RequireEncryption, byte[] AccessKey, int HandshakeTimeoutMs = 3000)
{
	public static TetherSettings Load()
	{
		return new TetherSettings(RegistryConfiguration.TetherEnabled, RegistryConfiguration.TetherPort, RegistryConfiguration.TetherEncryption, RegistryConfiguration.TetherRequireEncryption, TetherAccessKey.GetOrCreate(), RegistryConfiguration.TetherHandshakeTimeoutMs);
	}

	public bool SameAs(TetherSettings? Other)
	{
		if ((object)Other != null && Enabled == Other.Enabled && Port == Other.Port && Encryption == Other.Encryption && RequireEncryption == Other.RequireEncryption && HandshakeTimeoutMs == Other.HandshakeTimeoutMs)
		{
			return ((ReadOnlySpan<byte>)AccessKey.AsSpan()).SequenceEqual((ReadOnlySpan<byte>)Other.AccessKey);
		}
		return false;
	}

	public string? Validate()
	{
		int port = Port;
		if ((port < 1024 || port > 65535) ? true : false)
		{
			return $"The port must be between {1024} and {65535}.";
		}
		if (RequireEncryption && Encryption == EncryptionMode.Disabled)
		{
			return "\"Require encryption\" needs encryption to be turned on.";
		}
		port = HandshakeTimeoutMs;
		if ((port < 500 || port > 30000) ? true : false)
		{
			return $"The handshake timeout must be between {500} and {30000} ms.";
		}
		if (AccessKey.Length < 16)
		{
			return "The access key is missing or too short. Regenerate it.";
		}
		return null;
	}

	public TetherServerOptions ToOptions()
	{
		bool allowAnyClient = ConnectionManager.AllowAnyClient;
		TetherServerOptions tetherServerOptions = new TetherServerOptions
		{
			Port = Port,
			PreSharedKey = AccessKey,
			Encryption = ((!allowAnyClient) ? Encryption : EncryptionMode.Disabled),
			RequireEncryption = (!allowAnyClient && RequireEncryption),
			RequireAuthentication = !allowAnyClient,
			RejectBrowserOrigins = !allowAnyClient,
			VerifyProcess = (!allowAnyClient && !ConnectionManager.AllowAnyProcess),
			HandshakeTimeout = TimeSpan.FromMilliseconds(HandshakeTimeoutMs),
			MaxClients = int.MaxValue,
			DuplicateProcessPolicy = DuplicateProcessPolicy.ReplaceExisting,
			EncryptByDefault = (!allowAnyClient && Encryption != EncryptionMode.Disabled)
		};
		if (!allowAnyClient)
		{
			foreach (string executable in RobloxProcess.Executables)
			{
				tetherServerOptions.AllowedExecutables.Add(executable);
			}
		}
		return tetherServerOptions;
	}
}
