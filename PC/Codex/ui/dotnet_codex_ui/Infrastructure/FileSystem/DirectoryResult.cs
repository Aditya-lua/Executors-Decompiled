namespace dotnet_codex_ui.Infrastructure.FileSystem;

internal sealed record DirectoryResult(string Name, string Path, DirectoryOutcome Outcome, string? Error);
