namespace dotnet_codex_ui.Features.Editor;

internal sealed record TabSnapshot(string Title, string Text, string? Path, bool Dirty = false);
