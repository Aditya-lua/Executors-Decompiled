namespace dotnet_codex_ui.Core.Versioning;

internal sealed record UpdateResult(UpdateStatus Status, string Local, string? Published);
