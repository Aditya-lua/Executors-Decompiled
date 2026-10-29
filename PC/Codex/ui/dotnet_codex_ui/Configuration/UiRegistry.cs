using System;
using Microsoft.Win32;
using dotnet_codex_ui.Infrastructure.Logging;

namespace dotnet_codex_ui.Configuration;

internal static class UiRegistry
{
	public const string DefaultKeyPath = "Software\\Codex\\UI";

	internal static string KeyPath { get; set; } = "Software\\Codex\\UI";

	private static bool IsSafePath(string Path)
	{
		if (Path.StartsWith("Software\\", StringComparison.OrdinalIgnoreCase) && Path.Length > "Software\\".Length && !Path.EndsWith('\\'))
		{
			return !Path.Contains("\\\\");
		}
		return false;
	}

	public static string? GetString(string Name)
	{
		try
		{
			using RegistryKey registryKey = Registry.CurrentUser.OpenSubKey(KeyPath);
			return registryKey?.GetValue(Name) as string;
		}
		catch (Exception)
		{
			return null;
		}
	}

	public static bool GetBool(string Name, bool Default)
	{
		try
		{
			using RegistryKey registryKey = Registry.CurrentUser.OpenSubKey(KeyPath);
			return (registryKey?.GetValue(Name) is int num) ? (num != 0) : Default;
		}
		catch (Exception)
		{
			return Default;
		}
	}

	public static int GetInt(string Name, int Default)
	{
		try
		{
			using RegistryKey registryKey = Registry.CurrentUser.OpenSubKey(KeyPath);
			return (registryKey?.GetValue(Name) is int num) ? num : Default;
		}
		catch (Exception)
		{
			return Default;
		}
	}

	public static bool SetInt(string Name, int Value)
	{
		return Write(Name, Value, RegistryValueKind.DWord);
	}

	public static bool SetString(string Name, string Value)
	{
		return Write(Name, Value, RegistryValueKind.String);
	}

	public static bool SetBool(string Name, bool Value)
	{
		return Write(Name, Value ? 1 : 0, RegistryValueKind.DWord);
	}

	private static bool Write(string Name, object Value, RegistryValueKind Kind)
	{
		if (!IsSafePath(KeyPath))
		{
			return false;
		}
		try
		{
			using RegistryKey registryKey = Registry.CurrentUser.CreateSubKey(KeyPath);
			if (!object.Equals(registryKey.GetValue(Name), Value) || registryKey.GetValueKind(Name) != Kind)
			{
				registryKey.SetValue(Name, Value, Kind);
			}
			return true;
		}
		catch (Exception failure)
		{
			AppLog.Error(failure, null, "Write", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Configuration\\RegistryConfiguration.cs");
			return false;
		}
	}

	public static bool DeleteAll()
	{
		if (!IsSafePath(KeyPath))
		{
			return false;
		}
		try
		{
			Registry.CurrentUser.DeleteSubKeyTree(KeyPath, throwOnMissingSubKey: false);
			return true;
		}
		catch (Exception failure)
		{
			AppLog.Error(failure, null, "DeleteAll", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Configuration\\RegistryConfiguration.cs");
			return false;
		}
	}
}
