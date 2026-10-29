namespace dotnet_codex_bootstrapper.Services;

public sealed record ShortcutResult(string Location, ShortcutOutcome Outcome, string? Detail = null);
