using System;
using dotnet_codex_ui.Configuration;

namespace dotnet_codex_ui.Features.Clients;

internal static class ClientOptions
{
	public static int FpsLimit => RegistryConfiguration.FpsLimit;

	public static int CpuLimitPercent => RegistryConfiguration.CpuLimitPercent;

	public static int MemoryLimitMb => RegistryConfiguration.MemoryLimitMb;

	public static bool RakNet => RegistryConfiguration.RakNet;

	public static bool Prereplicated => RegistryConfiguration.Prereplicated;

	public static bool FpsBoost => RegistryConfiguration.FpsBoost;

	public static bool AutoInject => RegistryConfiguration.AutoInject;

	public static event Action? Changed
	{
		add
		{
			RegistryConfiguration.Changed += value;
		}
		remove
		{
			RegistryConfiguration.Changed -= value;
		}
	}
}
