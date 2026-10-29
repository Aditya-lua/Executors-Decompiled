using System;

namespace Tether;

public sealed class TetherErrorEventArgs : EventArgs
{
	public string Message { get; }

	public Exception? Exception { get; }

	public TetherClient? Client { get; }

	internal TetherErrorEventArgs(string Message, Exception? Exception, TetherClient? Client)
	{
		this.Message = Message;
		this.Exception = Exception;
		this.Client = Client;
	}
}
