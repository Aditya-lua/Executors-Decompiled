using System;
using System.IO;
using System.Security;
using Microsoft.Win32;

namespace dotnet_codex_bootstrapper.Core.Configuration;

public static class Channels
{
	public const string DefaultKeyPath = "Software\\Codex\\Bootstrapper";

	public static Channel Default => Channel.Stable;

	public static string KeyPath { get; set; } = "Software\\Codex\\Bootstrapper";

	public static string? OfVersion(string? Version)
	{
		int num = Version?.IndexOf('-') ?? (-1);
		if (num < 0)
		{
			return null;
		}
		string text = Version.Substring(num + 1);
		int num2 = text.LastIndexOf('.');
		return ((num2 > 0) ? text.Substring(0, num2) : text).ToLowerInvariant();
	}

	public static Channel Stored()
	{
		try
		{
			using RegistryKey registryKey = Registry.CurrentUser.OpenSubKey(KeyPath);
			Channel Value;
			return TryParse(registryKey?.GetValue("Channel") as string, out Value) ? Value : Default;
		}
		catch (Exception ex) when ((ex is SecurityException || ex is IOException || ex is UnauthorizedAccessException) ? true : false)
		{
			return Default;
		}
	}

	public static string NameOf(Channel Value)
	{
		if (Value != Channel.Canary)
		{
			return "stable";
		}
		return "canary";
	}

	public static bool TryParse(string? Text, out Channel Value)
	{
		string text = Text?.Trim().ToLowerInvariant();
		if (!(text == "canary"))
		{
			if (text == "stable")
			{
				Value = Channel.Stable;
				return true;
			}
			Value = Default;
			return false;
		}
		Value = Channel.Canary;
		return true;
	}
}
