using System;
using System.IO;
using System.Linq;
using System.Net.Http;
using System.Text.Json;
using System.Text.RegularExpressions;
using System.Threading;
using System.Threading.Tasks;
using dotnet_codex_bootstrapper.Core.Configuration;
using dotnet_codex_bootstrapper.Core.Manifest;
using dotnet_codex_bootstrapper.Infrastructure;

namespace dotnet_codex_bootstrapper.Services;

public sealed class LoaderUpdater(BootstrapperPaths Paths, CdnEndpoints Endpoints, FileDownloader Downloader, Func<CancellationToken, Task<string?>>? LiveVersion = null)
{
	public const string RobloxUrl = "https://clientsettings.roblox.com/v2/client-version/WindowsPlayer";

	private static readonly HttpClient Http = CdnClient.CreateHttpClient();

	private static readonly Regex LoaderFileName = new Regex("^[0-9a-f]{32}\\.exe$", RegexOptions.IgnoreCase | RegexOptions.Compiled | RegexOptions.CultureInvariant);

	public static async Task<string?> FetchLiveVersionAsync(CancellationToken Cancel)
	{
		using CancellationTokenSource Limit = CancellationTokenSource.CreateLinkedTokenSource(Cancel);
		Limit.CancelAfter(TimeSpan.FromSeconds(15L));
		using HttpResponseMessage Response = await Http.GetAsync("https://clientsettings.roblox.com/v2/client-version/WindowsPlayer", Limit.Token);
		Response.EnsureSuccessStatusCode();
		using JsonDocument jsonDocument = JsonDocument.Parse(await Response.Content.ReadAsStringAsync(Limit.Token));
		JsonElement value;
		return (jsonDocument.RootElement.TryGetProperty("version", out value) && value.ValueKind == JsonValueKind.String) ? value.GetString() : null;
	}

	public async Task<LoaderResult> EnsureAsync(UpdateManifest Manifest, IProgress<DownloadProgress>? Progress, CancellationToken Cancel)
	{
		string Live;
		try
		{
			Live = await (LiveVersion ?? new Func<CancellationToken, Task<string>>(FetchLiveVersionAsync))(Cancel);
		}
		catch (Exception ex) when (((ex is HttpRequestException || ex is JsonException || ex is TaskCanceledException || ex is InvalidOperationException) ? true : false) && !Cancel.IsCancellationRequested)
		{
			AppLog.Warning(ex, "The live Roblox version could not be retrieved; the loader check was skipped");
			return new LoaderResult(LoaderStatus.Unknown, null, null);
		}
		if (!ManifestValidator.IsLoaderVersion(Live))
		{
			AppLog.Warning("The live Roblox version '{Version}' is not usable; the loader check was skipped", Live);
			return new LoaderResult(LoaderStatus.Unknown, Live, null);
		}
		LoaderEntry Entry = Manifest.Loaders?.FirstOrDefault((LoaderEntry Item) => string.Equals(Item.RobloxVersion, Live, StringComparison.OrdinalIgnoreCase));
		if ((object)Entry == null)
		{
			AppLog.Warning("No loader is published for the live Roblox version {Version}", Live);
			return new LoaderResult(LoaderStatus.Outdated, Live, null);
		}
		string Destination = Paths.LoaderFile(Entry.RobloxVersion, Entry.Md5);
		try
		{
			bool flag = File.Exists(Destination);
			if (flag)
			{
				flag = await FileDownloader.MatchesAsync(Destination, Entry.Size, Entry.Md5, null, Cancel);
			}
			if (flag)
			{
				AppLog.Information("Loader {Md5} for Roblox {Version} is already installed", Entry.Md5, Entry.RobloxVersion);
				RemoveOld(Entry.RobloxVersion, Entry.Md5);
				return new LoaderResult(LoaderStatus.Ready, Entry.RobloxVersion, Destination);
			}
			AppLog.Information("Downloading loader {Md5} for Roblox {Version}", Entry.Md5, Entry.RobloxVersion);
			await Downloader.DownloadAsync(Endpoints.LoaderUrl(Entry.RobloxVersion, Entry.Md5), Destination, Entry.Size, Entry.Md5, null, Progress, Cancel);
			AppLog.Information("Loader {Md5} for Roblox {Version} installed", Entry.Md5, Entry.RobloxVersion);
			RemoveOld(Entry.RobloxVersion, Entry.Md5);
			return new LoaderResult(LoaderStatus.Ready, Entry.RobloxVersion, Destination);
		}
		catch (Exception ex2) when ((ex2 is IOException || ex2 is UnauthorizedAccessException) ? true : false)
		{
			throw new UpdateException("E-ACCESS", "Codex could not save the loader for the current Roblox version.", ex2);
		}
	}

	public void RemoveOld(string KeepVersion, string KeepMd5)
	{
		string path = Path.Combine(Paths.AppDirectory, "bin");
		if (!Directory.Exists(path))
		{
			return;
		}
		foreach (string item in Directory.EnumerateDirectories(path))
		{
			try
			{
				string[] files = Directory.GetFiles(item);
				if (files.Length == 0 || Directory.GetDirectories(item).Length != 0 || !files.All((string Item) => LoaderFileName.IsMatch(Path.GetFileName(Item))))
				{
					continue;
				}
				bool flag = string.Equals(Path.GetFileName(item), KeepVersion, StringComparison.OrdinalIgnoreCase);
				string[] array = files;
				foreach (string text in array)
				{
					if (!flag || !string.Equals(Path.GetFileName(text), KeepMd5 + ".exe", StringComparison.OrdinalIgnoreCase))
					{
						File.Delete(text);
						AppLog.Information("Removed the old loader {Path}", text);
					}
				}
				if (!flag && Directory.GetFileSystemEntries(item).Length == 0)
				{
					Directory.Delete(item);
				}
			}
			catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException) ? true : false)
			{
				AppLog.Warning(ex, "The old loader folder {Path} could not be cleaned", item);
			}
		}
	}
}
