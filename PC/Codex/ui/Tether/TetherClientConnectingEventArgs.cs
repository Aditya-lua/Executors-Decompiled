using System;
using System.Net;

namespace Tether;

public sealed class TetherClientConnectingEventArgs : EventArgs
{
	public TetherHello Hello { get; }

	public IPEndPoint RemoteEndPoint { get; }

	public int? OwnerProcessId { get; }

	public string? ExecutablePath { get; }

	public bool EncryptionAvailable { get; }

	public bool UseEncryption { get; set; }

	public bool Rejected { get; private set; }

	public string? RejectReason { get; private set; }

	internal TetherClientConnectingEventArgs(TetherHello Hello, IPEndPoint RemoteEndPoint, int? OwnerProcessId, string? ExecutablePath, bool EncryptionAvailable, bool UseEncryption)
	{
		this.Hello = Hello;
		this.RemoteEndPoint = RemoteEndPoint;
		this.OwnerProcessId = OwnerProcessId;
		this.ExecutablePath = ExecutablePath;
		this.EncryptionAvailable = EncryptionAvailable;
		this.UseEncryption = UseEncryption;
	}

	public void Reject(string? Reason = null)
	{
		Rejected = true;
		RejectReason = Reason;
	}
}
