namespace dotnet_codex_ui.Features.Connections;

internal sealed record ClientDisconnection(ConnectedClientInfo Client, string Reason, bool Expected);
