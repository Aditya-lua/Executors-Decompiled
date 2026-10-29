using System;
using System.Net;

namespace Tether;

public sealed class TetherHandshakeRejectedEventArgs : EventArgs
{
	public IPEndPoint? RemoteEndPoint { get; }

	public string Reason { get; }

	public int? ProcessId { get; }

	internal TetherHandshakeRejectedEventArgs(IPEndPoint? RemoteEndPoint, string Reason, int? ProcessId)
	{
		this.RemoteEndPoint = RemoteEndPoint;
		this.Reason = Reason;
		this.ProcessId = ProcessId;
	}
}
