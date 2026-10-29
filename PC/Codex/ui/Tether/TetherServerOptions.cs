using System;
using System.Collections.Generic;
using System.Security.Cryptography;

namespace Tether;

public sealed class TetherServerOptions
{
	public int Port { get; set; }

	public string Path { get; set; } = "/tether";

	public string? SubProtocol { get; set; } = "tether.v1";

	public byte[] PreSharedKey { get; set; } = Array.Empty<byte>();

	public EncryptionMode Encryption { get; set; } = EncryptionMode.PerClient;

	public bool EncryptByDefault { get; set; } = true;

	public bool RequireEncryption { get; set; }

	public bool RequireAuthentication { get; set; } = true;

	public bool RejectBrowserOrigins { get; set; } = true;

	public bool VerifyProcess { get; set; } = OperatingSystem.IsWindows();

	public HashSet<string> AllowedExecutables { get; } = new HashSet<string>(StringComparer.OrdinalIgnoreCase);

	public bool MonitorProcessExit { get; set; } = true;

	public DuplicateProcessPolicy DuplicateProcessPolicy { get; set; }

	public int MaxClients { get; set; } = 64;

	public int MaxPendingHandshakes { get; set; } = 16;

	public TimeSpan HandshakeTimeout { get; set; } = TimeSpan.FromSeconds(3L);

	public TimeSpan HeartbeatInterval { get; set; } = TimeSpan.FromSeconds(1L);

	public TimeSpan HeartbeatTimeout { get; set; } = TimeSpan.FromSeconds(4L);

	public int MaxMessageSize { get; set; } = 1048576;

	public int ReceiveBufferSize { get; set; } = 16384;

	public int SendQueueCapacity { get; set; } = 4096;

	public bool DisconnectSlowClients { get; set; } = true;

	public TimeSpan KickTimeout { get; set; } = TimeSpan.FromMilliseconds(500L);

	public static byte[] GenerateKey()
	{
		return RandomNumberGenerator.GetBytes(32);
	}

	internal void Validate()
	{
		int port = Port;
		if ((port < 0 || port > 65535) ? true : false)
		{
			throw new ArgumentOutOfRangeException("Port");
		}
		if (string.IsNullOrEmpty(Path) || Path[0] != '/')
		{
			throw new ArgumentException("Path must start with '/'.", "Path");
		}
		if (PreSharedKey == null || PreSharedKey.Length < 16)
		{
			throw new ArgumentException("PreSharedKey must be at least 16 bytes.", "PreSharedKey");
		}
		if (RequireEncryption && Encryption == EncryptionMode.Disabled)
		{
			throw new ArgumentException("RequireEncryption needs an EncryptionMode other than Disabled.");
		}
		if (MaxClients < 1 || MaxPendingHandshakes < 1 || SendQueueCapacity < 8)
		{
			throw new ArgumentException("MaxClients, MaxPendingHandshakes and SendQueueCapacity must be positive.");
		}
		if (MaxMessageSize < 64 || MaxMessageSize > 67108864)
		{
			throw new ArgumentOutOfRangeException("MaxMessageSize", "Use 64 B .. 64 MiB.");
		}
		if (ReceiveBufferSize < 256)
		{
			throw new ArgumentOutOfRangeException("ReceiveBufferSize");
		}
		if (HeartbeatInterval < TimeSpan.FromMilliseconds(50L) || HeartbeatTimeout <= HeartbeatInterval)
		{
			throw new ArgumentException("HeartbeatInterval must be >= 50 ms and HeartbeatTimeout must exceed it.");
		}
		if (HandshakeTimeout <= TimeSpan.Zero || KickTimeout <= TimeSpan.Zero)
		{
			throw new ArgumentException("Timeouts must be positive.");
		}
	}
}
