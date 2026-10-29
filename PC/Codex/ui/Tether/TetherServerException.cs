using System;

namespace Tether;

public sealed class TetherServerException : Exception
{
	public TetherServerException(string Message, Exception? Inner = null)
		: base(Message, Inner)
	{
	}
}
