namespace dotnet_codex_bootstrapper.Core.Manifest;

public sealed record PackageEntry(string Id, string Version, string? Sha256 = null);
