namespace dotnet_codex_ui.Core.Versioning;

internal sealed record LoaderResult(LoaderStatus Status, string? RobloxVersion, string? Md5, string? Path);
