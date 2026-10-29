using System;

namespace Tether;

public sealed class TetherClientDisconnectedEventArgs : EventArgs
{
	public TetherClient Client { get; }

	public TetherDisconnectReason Reason { get; }

	public string? Detail { get; }

	internal TetherClientDisconnectedEventArgs(TetherClient Client, TetherDisconnectReason Reason, string? Detail)
	{
		this.Client = Client;
		this.Reason = Reason;
		this.Detail = Detail;
	}

	public override string ToString()
	{
		if (Detail != null)
		{
			return $"{Reason}: {Detail}";
		}
		return Reason.ToString();
	}
}
