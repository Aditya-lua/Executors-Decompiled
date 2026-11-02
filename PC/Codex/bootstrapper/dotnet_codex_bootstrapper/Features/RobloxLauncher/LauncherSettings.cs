using System;
using System.IO;
using System.Security;
using Microsoft.Win32;

namespace dotnet_codex_bootstrapper.Features.RobloxLauncher;

public sealed record LauncherSettings(bool Enabled, LauncherChannel Channel, ProgressMode ShowProgress, bool StartCodex)
{
	public static string KeyPath { get; set; } = "Software\\Codex\\Launcher";

	public static LauncherSettings Default { get; } = new LauncherSettings(Enabled: true, LauncherChannel.ForceLive, ProgressMode.Always, StartCodex: false);

	public const string DefaultKeyPath = "Software\\Codex\\Launcher";

	public static LauncherSettings Read()
	{
		try
		{
			using RegistryKey registryKey = Registry.CurrentUser.OpenSubKey(KeyPath);
			if (registryKey == null)
			{
				return Default;
			}
			return new LauncherSettings((registryKey.GetValue("Enabled") is int num) ? (num != 0) : Default.Enabled, Parse(registryKey.GetValue("Channel"), Default.Channel), Parse(registryKey.GetValue("ShowProgress"), Default.ShowProgress), (registryKey.GetValue("StartCodex") is int num2) ? (num2 != 0) : Default.StartCodex);
		}
		catch (Exception ex) when ((ex is SecurityException || ex is IOException || ex is UnauthorizedAccessException) ? true : false)
		{
			return Default;
		}
	}

	public static void Disable()
	{
		using RegistryKey registryKey = Registry.CurrentUser.CreateSubKey(KeyPath);
		registryKey.SetValue("Enabled", 0, RegistryValueKind.DWord);
	}

	private static T Parse<T>(object? Value, T Fallback) where T : struct, Enum
	{
		if (!(Value is string value) || !Enum.TryParse<T>(value, ignoreCase: false, out var result) || !Enum.IsDefined(result))
		{
			return Fallback;
		}
		return result;
	}
}
