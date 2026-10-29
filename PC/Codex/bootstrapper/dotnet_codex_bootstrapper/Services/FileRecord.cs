namespace dotnet_codex_bootstrapper.Services;

public sealed record FileRecord(string Md5, long Length, string? Package = null);
