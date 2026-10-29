using System;
using System.Collections.Generic;
using System.Threading.Tasks;

namespace dotnet_codex_ui.Features.Connections;

internal interface IConnectionProvider
{
	ConnectionProviderState State { get; }

	string? Message { get; }

	int Port { get; }

	IReadOnlyList<ConnectedClientInfo> Clients { get; }

	event Action? StateChanged;

	event Action<ConnectedClientInfo>? ClientConnected;

	event Action<ClientDisconnection>? ClientDisconnected;

	Task StartAsync(TetherSettings Settings);

	Task StopAsync();

	bool Kick(string Id, string? Reason = null);

	bool Send(string Id, string Text);

	int Broadcast(string Text);
}
