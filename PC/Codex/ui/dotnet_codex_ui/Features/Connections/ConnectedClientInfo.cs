using System;

namespace dotnet_codex_ui.Features.Connections;

internal sealed record ConnectedClientInfo(string Id, int ProcessId, DateTimeOffset ConnectedAt, ClientEncryption Encryption)
{
	public bool IsEncrypted => Encryption != ClientEncryption.None;
}
