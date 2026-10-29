namespace dotnet_codex_bootstrapper.Core.Manifest;

public sealed record RuntimeEntry(string Name, string MinVersion, string InstallerUrl, string Architecture, string? Sha256 = null);
