using System;
using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;
using System.Text.RegularExpressions.Generated;

namespace dotnet_codex_bootstrapper.Features.RobloxLauncher;

public static class LaunchUri
{
	public const int MaxLength = 4096;

	public const string PlayerScheme = "roblox-player:";

	public const string DeepLinkScheme = "roblox:";

	public static bool IsValid(string? Uri)
	{
		if (string.IsNullOrEmpty(Uri) || Uri.Length > 4096)
		{
			return false;
		}
		if (!Uri.StartsWith("roblox-player:", StringComparison.OrdinalIgnoreCase) && !Uri.StartsWith("roblox:", StringComparison.OrdinalIgnoreCase))
		{
			return false;
		}
		foreach (char c in Uri)
		{
			if (c <= ' ' || c == '"' || c == '\u007f' || c > '~')
			{
				return false;
			}
		}
		return true;
	}

	public static string Redact(string Uri)
	{
		if (!Uri.StartsWith("roblox-player:", StringComparison.OrdinalIgnoreCase))
		{
			if (!Uri.StartsWith("roblox:", StringComparison.OrdinalIgnoreCase))
			{
				return "not a Roblox link";
			}
			return "roblox: deep link";
		}
		IEnumerable<string> values = Uri.Substring("roblox-player:".Length).Split('+').Select((string Part) =>
		{
			int num = Part.IndexOf(':');
			string text = ((num < 0) ? "?" : Part.Substring(0, num));
			return (!text.Equals("launchmode", StringComparison.OrdinalIgnoreCase)) ? text : Part;
		});
		return "roblox-player: [" + string.Join(", ", values) + "]";
	}

	public static string ChannelOf(string Uri)
	{
		Match match = ChannelPattern().Match(Uri);
		if (!match.Success)
		{
			return string.Empty;
		}
		return match.Groups[2].Value.ToLowerInvariant();
	}

	public static string WithChannel(string Uri, string Channel)
	{
		if (!Uri.StartsWith("roblox-player:", StringComparison.OrdinalIgnoreCase))
		{
			return Uri;
		}
		return ChannelPattern().Replace(Uri, (Match Match) => Match.Groups[1].Value + "channel:" + Channel, 1);
	}

	public static bool IsChannelName(string? Channel)
	{
		if (Channel != null)
		{
			return ChannelNamePattern().IsMatch(Channel);
		}
		return false;
	}

	public static bool IsLive(string Channel)
	{
		if (Channel.Length != 0 && !Channel.Equals("live", StringComparison.OrdinalIgnoreCase))
		{
			return Channel.Equals("production", StringComparison.OrdinalIgnoreCase);
		}
		return true;
	}

	[GeneratedCode("System.Text.RegularExpressions.Generator", "10.0.14.42308")]
	private static Regex ChannelPattern()
	{
		return _003CRegexGenerator_g_003EF434200EFB8C88D5EAE118CBC10CF359BDA574EE75AB4FEDC2F68B103CD0891DB__ChannelPattern_0.Instance;
	}

	[GeneratedCode("System.Text.RegularExpressions.Generator", "10.0.14.42308")]
	private static Regex ChannelNamePattern()
	{
		return _003CRegexGenerator_g_003EF434200EFB8C88D5EAE118CBC10CF359BDA574EE75AB4FEDC2F68B103CD0891DB__ChannelNamePattern_1.Instance;
	}
}
