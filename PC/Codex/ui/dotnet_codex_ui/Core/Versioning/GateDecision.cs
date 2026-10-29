namespace dotnet_codex_ui.Core.Versioning;

internal sealed record GateDecision(GateOutcome Outcome, string Title, string Summary, string Details, bool CanRetry)
{
	public bool Allowed => Outcome == GateOutcome.Allowed;
}
