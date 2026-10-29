namespace dotnet_codex_bootstrapper.Services;

public sealed record LoaderResult(LoaderStatus Status, string? RobloxVersion, string? Path);
