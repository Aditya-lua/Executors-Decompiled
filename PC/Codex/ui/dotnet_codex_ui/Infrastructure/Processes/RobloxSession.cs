namespace dotnet_codex_ui.Infrastructure.Processes;

internal sealed record RobloxSession(int ProcessId, long UserId, long PlaceId, bool Unreadable = false, bool Closing = false, long UniverseId = 0L);
