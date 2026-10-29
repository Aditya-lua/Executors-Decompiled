using System;
using System.Linq;
using Tether;
using dotnet_codex_ui.Infrastructure.Logging;
using dotnet_codex_ui.Services;

namespace dotnet_codex_ui.Configuration;

internal static class RegistryConfiguration
{
	public static string Accent => AccentTheme.Resolve(UiRegistry.GetString("Accent")).Id;

	public static bool ConfirmBeforeClosing => UiRegistry.GetBool("ConfirmBeforeClosing", Default: false);

	public static bool RandomWindowTitle => UiRegistry.GetBool("RandomWindowTitle", Default: false);

	public static bool AlwaysOnTop => UiRegistry.GetBool("AlwaysOnTop", Default: false);

	public static bool ShowNavigationTooltips => UiRegistry.GetBool("ShowNavigationTooltips", Default: true);

	public static bool InlayHints => UiRegistry.GetBool("InlayHints", Default: false);

	public static int EditorFontSize
	{
		get
		{
			int num = UiRegistry.GetInt("EditorFontSize", 12);
			if (num < 8 || num > 24)
			{
				return 12;
			}
			return num;
		}
	}

	public static string Minimap => NormalizeMinimap(UiRegistry.GetString("Minimap"));

	public static bool AutoSaveTabs => UiRegistry.GetBool("AutoSaveTabs", Default: false);

	public static bool ContinueWhereYouLeftOff => UiRegistry.GetBool("ContinueWhereYouLeftOff", Default: false);

	public static bool AutoInject => UiRegistry.GetBool("AutoInject", Default: true);

	public static int AutoInjectDelaySeconds
	{
		get
		{
			int num = UiRegistry.GetInt("AutoInjectDelaySeconds", 5);
			if (num < 1 || num > 300)
			{
				return 5;
			}
			return num;
		}
	}

	public static bool AutoSelectInjected => UiRegistry.GetBool("AutoSelectInjected", Default: true);

	public static int FpsLimit
	{
		get
		{
			int num = UiRegistry.GetInt("FpsLimit", 60);
			if (num != 0 && (num < 10 || num > 360))
			{
				return 60;
			}
			return num;
		}
	}

	public static int CpuLimitPercent
	{
		get
		{
			int num = UiRegistry.GetInt("CpuLimitPercent", 100);
			if (num < 5 || num > 100)
			{
				return 100;
			}
			return num;
		}
	}

	public static int MemoryLimitMb
	{
		get
		{
			int num = UiRegistry.GetInt("MemoryLimitMb", 0);
			if (num != 0 && (num < 512 || num > SettingLimits.MemoryMaxMb))
			{
				return 0;
			}
			return num;
		}
	}

	public static bool RakNet => UiRegistry.GetBool("RakNet", Default: false);

	public static bool Prereplicated => UiRegistry.GetBool("Prereplicated", Default: false);

	public static bool FpsBoost => UiRegistry.GetBool("FpsBoost", Default: false);

	public static bool TetherEnabled => UiRegistry.GetBool("TetherEnabled", Default: true);

	public static bool TetherDiagnostics => UiRegistry.GetBool("TetherDiagnostics", Default: false);

	public static int TetherPort
	{
		get
		{
			int num = UiRegistry.GetInt("TetherPort", 47100);
			if (num < 1024 || num > 65535)
			{
				return 47100;
			}
			return num;
		}
	}

	public static EncryptionMode TetherEncryption
	{
		get
		{
			string text = UiRegistry.GetString("TetherEncryption");
			if (!(text == "Shared"))
			{
				if (text == "PerClient")
				{
					return EncryptionMode.PerClient;
				}
				return EncryptionMode.Disabled;
			}
			return EncryptionMode.Shared;
		}
	}

	public static bool TetherRequireEncryption
	{
		get
		{
			if (TetherEncryption != EncryptionMode.Disabled)
			{
				return UiRegistry.GetBool("TetherRequireEncryption", Default: false);
			}
			return false;
		}
	}

	public static int TetherHandshakeTimeoutMs
	{
		get
		{
			int num = UiRegistry.GetInt("TetherHandshakeTimeoutMs", 3000);
			if (num < 500 || num > 30000)
			{
				return 3000;
			}
			return num;
		}
	}

	public static event Action? Changed;

	private static bool Done(bool Ok)
	{
		if (Ok)
		{
			Changed?.Invoke();
		}
		return Ok;
	}

	public static bool SetAccent(string Id)
	{
		return Done(UiRegistry.SetString("Accent", AccentTheme.Resolve(Id).Id));
	}

	public static bool SetConfirmBeforeClosing(bool Value)
	{
		return Done(UiRegistry.SetBool("ConfirmBeforeClosing", Value));
	}

	public static bool SetRandomWindowTitle(bool Value)
	{
		return Done(UiRegistry.SetBool("RandomWindowTitle", Value));
	}

	public static bool SetAlwaysOnTop(bool Value)
	{
		return Done(UiRegistry.SetBool("AlwaysOnTop", Value));
	}

	public static bool SetShowNavigationTooltips(bool Value)
	{
		return Done(UiRegistry.SetBool("ShowNavigationTooltips", Value));
	}

	public static bool SetInlayHints(bool Value)
	{
		return Done(UiRegistry.SetBool("InlayHints", Value));
	}

	public static bool SetEditorFontSize(int Value)
	{
		return Done(UiRegistry.SetInt("EditorFontSize", Math.Clamp(Value, 8, 24)));
	}

	public static bool SetMinimap(string Mode)
	{
		return Done(UiRegistry.SetString("Minimap", NormalizeMinimap(Mode)));
	}

	public static string NormalizeMinimap(string? Mode)
	{
		return SettingLimits.MinimapModes.FirstOrDefault((string Known) => string.Equals(Known, Mode?.Trim(), StringComparison.OrdinalIgnoreCase)) ?? "Off";
	}

	public static bool SetAutoSaveTabs(bool Value)
	{
		return Done(UiRegistry.SetBool("AutoSaveTabs", Value));
	}

	public static bool SetContinueWhereYouLeftOff(bool Value)
	{
		return Done(UiRegistry.SetBool("ContinueWhereYouLeftOff", Value));
	}

	public static bool SetAutoInject(bool Value)
	{
		return Done(UiRegistry.SetBool("AutoInject", Value));
	}

	public static bool SetAutoInjectDelaySeconds(int Value)
	{
		return Done(UiRegistry.SetInt("AutoInjectDelaySeconds", Math.Clamp(Value, 1, 300)));
	}

	public static bool SetAutoSelectInjected(bool Value)
	{
		return Done(UiRegistry.SetBool("AutoSelectInjected", Value));
	}

	public static bool SetFpsLimit(int Value)
	{
		return Done(UiRegistry.SetInt("FpsLimit", (Value != 0) ? Math.Clamp(Value, 10, 360) : 0));
	}

	public static bool SetCpuLimitPercent(int Value)
	{
		return Done(UiRegistry.SetInt("CpuLimitPercent", Math.Clamp(Value, 5, 100)));
	}

	public static bool SetMemoryLimitMb(int Value)
	{
		return Done(UiRegistry.SetInt("MemoryLimitMb", (Value != 0) ? Math.Clamp(Value, 512, SettingLimits.MemoryMaxMb) : 0));
	}

	public static bool SetRakNet(bool Value)
	{
		return Done(UiRegistry.SetBool("RakNet", Value));
	}

	public static bool SetPrereplicated(bool Value)
	{
		return Done(UiRegistry.SetBool("Prereplicated", Value));
	}

	public static bool SetFpsBoost(bool Value)
	{
		return Done(UiRegistry.SetBool("FpsBoost", Value));
	}

	public static bool SetTetherEnabled(bool Value)
	{
		return Done(UiRegistry.SetBool("TetherEnabled", Value));
	}

	public static bool SetTetherDiagnostics(bool Value)
	{
		return Done(UiRegistry.SetBool("TetherDiagnostics", Value));
	}

	public static void EnsureDefaults()
	{
		if (UiRegistry.GetInt("TetherPort", -1) == -1)
		{
			UiRegistry.SetInt("TetherPort", 47100);
		}
	}

	public static bool SetTetherPort(int Value)
	{
		return Done(UiRegistry.SetInt("TetherPort", Math.Clamp(Value, 1024, 65535)));
	}

	public static bool SetTetherEncryption(EncryptionMode Mode)
	{
		if (Mode == EncryptionMode.Disabled)
		{
			UiRegistry.SetBool("TetherRequireEncryption", Value: false);
		}
		return Done(UiRegistry.SetString("TetherEncryption", Mode.ToString()));
	}

	public static bool SetTetherRequireEncryption(bool Value)
	{
		return Done(UiRegistry.SetBool("TetherRequireEncryption", Value));
	}

	public static bool SetTetherHandshakeTimeoutMs(int Value)
	{
		return Done(UiRegistry.SetInt("TetherHandshakeTimeoutMs", Math.Clamp(Value, 500, 30000)));
	}

	public static bool ResetAll()
	{
		AppLog.Information("Settings reset to defaults");
		return Done(UiRegistry.DeleteAll());
	}
}
