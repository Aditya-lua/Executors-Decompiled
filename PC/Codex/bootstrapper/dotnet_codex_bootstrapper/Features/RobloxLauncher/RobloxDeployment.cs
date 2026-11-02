using System;
using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.Json;
using System.Text.RegularExpressions;
using System.Text.RegularExpressions.Generated;
using System.Threading;
using System.Threading.Tasks;
using dotnet_codex_bootstrapper.Infrastructure;
using dotnet_codex_bootstrapper.Services;

namespace dotnet_codex_bootstrapper.Features.RobloxLauncher;

public static class RobloxDeployment
{
	public const string LiveChannel = "live";

	public const int MaxSmallResponse = 1048576;

	public static readonly Uri SetupRoot = new Uri("https://setup.rbxcdn.com/");

	public static readonly string[] SkippedEntries = new string[3] { "WebView2RuntimeInstaller.zip", "RobloxPlayerInstaller.exe", "RobloxPlayerLauncher.exe" };

	public static readonly IReadOnlyDictionary<string, string> PackageFolders = new Dictionary<string, string>(StringComparer.OrdinalIgnoreCase)
	{
		["RobloxApp.zip"] = "",
		["Libraries.zip"] = "",
		["redist.zip"] = "",
		["WebView2.zip"] = "",
		["shaders.zip"] = "shaders/",
		["ssl.zip"] = "ssl/",
		["content-avatar.zip"] = "content/avatar/",
		["content-configs.zip"] = "content/configs/",
		["content-fonts.zip"] = "content/fonts/",
		["content-sky.zip"] = "content/sky/",
		["content-sounds.zip"] = "content/sounds/",
		["content-textures2.zip"] = "content/textures/",
		["content-models.zip"] = "content/models/",
		["content-textures3.zip"] = "PlatformContent/pc/textures/",
		["content-terrain.zip"] = "PlatformContent/pc/terrain/",
		["content-platform-fonts.zip"] = "PlatformContent/pc/fonts/",
		["content-platform-dictionaries.zip"] = "PlatformContent/pc/shared_compression_dictionaries/",
		["extracontent-luapackages.zip"] = "ExtraContent/LuaPackages/",
		["extracontent-translations.zip"] = "ExtraContent/translations/",
		["extracontent-models.zip"] = "ExtraContent/models/",
		["extracontent-textures.zip"] = "ExtraContent/textures/",
		["extracontent-places.zip"] = "ExtraContent/places/"
	};

	public static async Task<RobloxBuild> ResolveAsync(CdnClient Client, string Channel, CancellationToken Cancel)
	{
		string Wanted = (LaunchUri.IsLive(Channel) ? "live" : Channel);
		if (!LaunchUri.IsChannelName(Wanted))
		{
			AppLog.Warning("The Roblox channel name is not valid; using LIVE");
			Wanted = "live";
		}
		try
		{
			return await FetchAsync(Client, Wanted, Cancel);
		}
		catch (CdnException ex) when (((Func<bool>)delegate
		{
			// Could not convert BlockContainer to single expression
			bool flag = Wanted != "live";
			if (flag)
			{
				bool flag2 = default;
				switch (ex.StatusCode)
				{
				case 401:
				case 403:
				case 404:
					flag2 = true;
					break;
				default:
					flag2 = false;
					break;
				}
				flag = flag2;
			}
			return flag;
		}).Invoke())
		{
			AppLog.Warning("The Roblox channel {Channel} is not available (HTTP {Status}); using LIVE", Wanted, ex.StatusCode);
			return await FetchAsync(Client, "live", Cancel);
		}
	}

	private static async Task<RobloxBuild> FetchAsync(CdnClient Client, string Channel, CancellationToken Cancel)
	{
		string Suffix = ((Channel == "live") ? string.Empty : ("/channel/" + Channel));
		byte[] Bytes;
		try
		{
			Bytes = await Client.GetBytesAsync(new Uri("https://clientsettingscdn.roblox.com/v2/client-version/WindowsPlayer" + Suffix), 1048576, Cancel);
		}
		catch (CdnException ex) when (((Func<bool>)delegate
		{
			// Could not convert BlockContainer to single expression
			int? statusCode = ex.StatusCode;
			return (!statusCode.HasValue || statusCode.GetValueOrDefault() >= 500) ? true : false;
		}).Invoke())
		{
			AppLog.Warning(ex, "clientsettingscdn did not answer; trying clientsettings");
			Bytes = await Client.GetBytesAsync(new Uri("https://clientsettings.roblox.com/v2/client-version/WindowsPlayer" + Suffix), 1048576, Cancel);
		}
		return ParseVersion(Bytes, Channel);
	}

	public static RobloxBuild ParseVersion(byte[] Bytes, string Channel)
	{
		try
		{
			using JsonDocument jsonDocument = JsonDocument.Parse(Bytes);
			string text = ((jsonDocument.RootElement.TryGetProperty("version", out var value) && value.ValueKind == JsonValueKind.String) ? value.GetString() : null);
			string text2 = ((jsonDocument.RootElement.TryGetProperty("clientVersionUpload", out var value2) && value2.ValueKind == JsonValueKind.String) ? value2.GetString() : null);
			if (text == null || !VersionPattern().IsMatch(text) || text2 == null || !GuidPattern().IsMatch(text2))
			{
				throw new RobloxLauncherException("Roblox reported a version that is not valid.");
			}
			return new RobloxBuild(text, text2, Channel);
		}
		catch (JsonException inner)
		{
			throw new RobloxLauncherException("Roblox's version answer could not be read.", inner);
		}
	}

	public static Uri PackageUrl(RobloxBuild Build, string Name)
	{
		return new Uri(SetupRoot, ((Build.Channel == "live") ? string.Empty : "channel/common/") + Build.Guid + "-" + Name);
	}

	public static async Task<IReadOnlyList<RobloxPackage>> FetchPackagesAsync(CdnClient Client, RobloxBuild Build, CancellationToken Cancel)
	{
		byte[] bytes = await Client.GetBytesAsync(PackageUrl(Build, "rbxPkgManifest.txt"), 1048576, Cancel);
		return ParsePackages(Encoding.UTF8.GetString(bytes));
	}

	public static IReadOnlyList<RobloxPackage> ParsePackages(string Text)
	{
		string[] array = Text.Replace("\r", string.Empty).Split('\n');
		if (array.Length == 0 || array[0].Trim() != "v0")
		{
			throw new RobloxLauncherException("Roblox's package list has an unknown format.");
		}
		List<RobloxPackage> list = new List<RobloxPackage>();
		for (int i = 1; i + 3 < array.Length; i += 4)
		{
			string text = array[i].Trim();
			if (text.Length == 0)
			{
				break;
			}
			string text2 = array[i + 1].Trim().ToLowerInvariant();
			if (!NamePattern().IsMatch(text) || text2.Length != 32 || !text2.All(Uri.IsHexDigit) || !long.TryParse(array[i + 2].Trim(), out var result) || !long.TryParse(array[i + 3].Trim(), out var result2) || result < 0 || result2 < 0)
			{
				throw new RobloxLauncherException("Roblox's package list contains an invalid entry.");
			}
			list.Add(new RobloxPackage(text, text2, result, result2));
		}
		if (!list.Any((RobloxPackage Package) => Package.Name.Equals("RobloxApp.zip", StringComparison.OrdinalIgnoreCase)))
		{
			throw new RobloxLauncherException("Roblox's package list does not contain the player.");
		}
		return list;
	}

	public static IReadOnlyList<RobloxPackage> Installable(IReadOnlyList<RobloxPackage> Packages)
	{
		List<string> list = (from Package in Packages
			where !PackageFolders.ContainsKey(Package.Name) && !SkippedEntries.Contains(Package.Name, StringComparer.OrdinalIgnoreCase)
			select Package.Name).ToList();
		if (list.Count > 0)
		{
			throw new RobloxLauncherException("Roblox ships packages Codex does not know yet: " + string.Join(", ", list));
		}
		return Packages.Where((RobloxPackage Package) => PackageFolders.ContainsKey(Package.Name)).ToList();
	}

	[GeneratedCode("System.Text.RegularExpressions.Generator", "10.0.14.42308")]
	private static Regex VersionPattern()
	{
		return _003CRegexGenerator_g_003EF434200EFB8C88D5EAE118CBC10CF359BDA574EE75AB4FEDC2F68B103CD0891DB__VersionPattern_2.Instance;
	}

	[GeneratedCode("System.Text.RegularExpressions.Generator", "10.0.14.42308")]
	public static Regex GuidPattern()
	{
		return _003CRegexGenerator_g_003EF434200EFB8C88D5EAE118CBC10CF359BDA574EE75AB4FEDC2F68B103CD0891DB__GuidPattern_3.Instance;
	}

	[GeneratedCode("System.Text.RegularExpressions.Generator", "10.0.14.42308")]
	private static Regex NamePattern()
	{
		return _003CRegexGenerator_g_003EF434200EFB8C88D5EAE118CBC10CF359BDA574EE75AB4FEDC2F68B103CD0891DB__NamePattern_4.Instance;
	}
}
