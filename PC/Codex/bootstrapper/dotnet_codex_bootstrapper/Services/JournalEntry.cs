namespace dotnet_codex_bootstrapper.Services;

public sealed record JournalEntry(string Path, bool HadOriginal, string Backup);
