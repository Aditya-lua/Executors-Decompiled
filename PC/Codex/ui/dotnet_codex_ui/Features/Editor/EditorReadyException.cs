using System;

namespace dotnet_codex_ui.Features.Editor;

internal sealed class EditorReadyException : Exception
{
	public ReadyFailure Reason { get; }

	public EditorReadyException(ReadyFailure Reason, string Message, Exception? Inner = null)
		: base(Message, Inner)
	{
		this.Reason = Reason;
	}
}
