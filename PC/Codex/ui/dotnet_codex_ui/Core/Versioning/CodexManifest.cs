namespace dotnet_codex_ui.Core.Versioning;

internal sealed record CodexManifest(string? Bootstrapper, string? UI, string? Loader, string? Module, string? RobloxVersion = null, string? LoaderMd5 = null);
