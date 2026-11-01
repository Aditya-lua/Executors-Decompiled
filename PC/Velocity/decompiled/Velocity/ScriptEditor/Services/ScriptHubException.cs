using System;

namespace ScriptEditor.Services;

public sealed class ScriptHubException : Exception
{
	public ScriptHubException(string message)
		: base(message)
	{
	}
}
