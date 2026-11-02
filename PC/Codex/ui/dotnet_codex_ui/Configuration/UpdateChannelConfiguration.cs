using System;
using Microsoft.Win32;
using dotnet_codex_ui.Infrastructure.Logging;

namespace dotnet_codex_ui.Configuration;

internal static class UpdateChannelConfiguration
{
	public const string DefaultKeyPath = "Software\\Codex\\Bootstrapper";

	public static readonly string[] Names = new string[2] { "stable", "canary" };

	internal static string KeyPath { get; set; } = "Software\\Codex\\Bootstrapper";

	public static string Name
	{
		get
		{
			try
			{
				using RegistryKey registryKey = Registry.CurrentUser.OpenSubKey(KeyPath);
				return (registryKey?.GetValue("Channel") is string text && Names.Contains(text.Trim().ToLowerInvariant())) ? text.Trim().ToLowerInvariant() : Names[0];
			}
			catch (Exception)
			{
				return Names[0];
			}
		}
	}

	public static bool Set(string Value)
	{
		if (!Names.Contains(Value))
		{
			return false;
		}
		try
		{
			using RegistryKey registryKey = Registry.CurrentUser.CreateSubKey(KeyPath);
			registryKey.SetValue("Channel", Value, RegistryValueKind.String);
			return true;
		}
		catch (Exception failure)
		{
			AppLog.Error(failure, null, "Set", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Configuration\\RegistryConfiguration.cs");
			return false;
		}
	}
}
