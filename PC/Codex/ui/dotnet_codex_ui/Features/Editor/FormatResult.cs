namespace dotnet_codex_ui.Features.Editor;

internal sealed record FormatResult(bool Ok, bool Changed, string? Reason, string? Message);
