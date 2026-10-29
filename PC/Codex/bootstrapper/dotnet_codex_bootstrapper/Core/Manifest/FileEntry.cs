namespace dotnet_codex_bootstrapper.Core.Manifest;

public sealed record FileEntry(string Path, string Source, bool Required = true, string? Package = null, string? PackagePath = null, string? RemotePath = null);
