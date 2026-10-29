using System;

namespace dotnet_codex_ui.Features.Internet;

internal sealed class ScriptBloxException : Exception
{
	public ScriptBloxException(string Message)
		: base(Message)
	{
	}
}
