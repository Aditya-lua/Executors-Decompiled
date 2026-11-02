using System;
using System.Collections.Generic;
using Microsoft.Win32;
using dotnet_codex_ui.Infrastructure.Logging;

namespace dotnet_codex_ui.Configuration;

internal static class LauncherConfiguration
{
	public const string DefaultKeyPath = "Software\\Codex\\Launcher";

	public static readonly IReadOnlyDictionary<string, string[]> Choices = new Dictionary<string, string[]>
	{
		["Channel"] = new string[2] { "ForceLive", "FollowRoblox" },
		["ShowProgress"] = new string[2] { "Always", "WhenUpdating" }
	};

	internal static string KeyPath { get; set; } = "Software\\Codex\\Launcher";

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

	public static string GetChoice(string Name)
	{
		string[] array = Choices[Name];
		try
		{
			using RegistryKey registryKey = Registry.CurrentUser.OpenSubKey(KeyPath);
			return (registryKey?.GetValue(Name) is string text && array.Contains(text)) ? text : array[0];
		}
		catch (Exception)
		{
			return array[0];
		}
	}

	public static bool SetBool(string Name, bool Value)
	{
		return Write(Name, Value ? 1 : 0, RegistryValueKind.DWord);
	}

	public static bool SetChoice(string Name, string Value)
	{
		if (Choices[Name].Contains(Value))
		{
			return Write(Name, Value, RegistryValueKind.String);
		}
		return false;
	}

	private static bool Write(string Name, object Value, RegistryValueKind Kind)
	{
		try
		{
			using RegistryKey registryKey = Registry.CurrentUser.CreateSubKey(KeyPath);
			registryKey.SetValue(Name, Value, Kind);
			return true;
		}
		catch (Exception failure)
		{
			AppLog.Error(failure, null, "Write", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Configuration\\RegistryConfiguration.cs");
			return false;
		}
	}
}
