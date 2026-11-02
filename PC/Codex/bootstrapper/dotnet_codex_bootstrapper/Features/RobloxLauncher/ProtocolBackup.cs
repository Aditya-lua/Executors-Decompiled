using System;
using System.Collections.Generic;

namespace dotnet_codex_bootstrapper.Features.RobloxLauncher;

public sealed class ProtocolBackup
{
	public Dictionary<string, RegistryKeyRecord?> Schemes { get; set; } = new Dictionary<string, RegistryKeyRecord>(StringComparer.OrdinalIgnoreCase);

	public bool ChannelCaptured { get; set; }

	public string? ChannelValue { get; set; }

	public string? DeclinedCommand { get; set; }
}
