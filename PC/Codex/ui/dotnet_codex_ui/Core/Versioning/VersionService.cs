using System;
using System.Net.Http;
using System.Threading;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Threading;
using Newtonsoft.Json;
using Newtonsoft.Json.Linq;
using dotnet_codex_ui.Infrastructure.Logging;

namespace dotnet_codex_ui.Core.Versioning;

internal static class VersionService
{
	internal const string RobloxUrl = "https://clientsettings.roblox.com/v2/client-version/WindowsPlayer";

	internal const string ManifestUrl = "https://cdn.robloxscripts.gg/stable/version.json";

	internal static TimeSpan Timeout = TimeSpan.FromSeconds(10L);

	internal static readonly TimeSpan Ttl = TimeSpan.FromMinutes(5L);

	private static readonly HttpClient Http = new HttpClient
	{
		Timeout = System.Threading.Timeout.InfiniteTimeSpan
	};

	private static readonly object Gate = new object();

	private static Task? Running;

	internal static Func<string, CancellationToken, Task<string>> Fetch = async (string Url, CancellationToken Token) => await Http.GetStringAsync(Url, Token);

	internal static Func<DateTime> Clock = () => DateTime.UtcNow;

	public static VersionState State { get; private set; } = VersionState.Idle;

	public static VersionSnapshot? Snapshot { get; private set; }

	public static string? Error { get; private set; }

	public static bool IsStale => State == VersionState.Stale;

	internal static UpdateResult Update => UpdateCheck.Evaluate(AppVersions.UI, Snapshot?.Manifest?.UI, State);

	internal static LoaderResult Loader => LoaderCheck.Evaluate(Snapshot?.Roblox, Snapshot?.Manifest, State);

	public static event Action? Changed;

	internal static RobloxClientVersion ParseRoblox(string Json)
	{
		JObject root = JObject.Parse(Json);
		return new RobloxClientVersion(Text(root, "version"), Text(root, "clientVersionUpload"));
	}

	internal static CodexManifest ParseManifest(string Json)
	{
		JObject root = JObject.Parse(Json);
		return new CodexManifest(Text(root, "dotnet-codex-bootstrapper"), Text(root, "dotnet-codex-ui"), Text(root, "dotnet-codex-loader"), Text(root, "dotnet-codex-module"), Text(root, "roblox-version"), Text(root, "dotnet-codex-loader-md5"));
	}

	private static string? Text(JObject Root, string Name)
	{
		if (!Root.TryGetValue(Name, out JToken value) || value.Type != JTokenType.String || string.IsNullOrWhiteSpace((string?)value))
		{
			return null;
		}
		return ((string?)value).Trim();
	}

	public static Task RefreshAsync(bool Force = false, CancellationToken Cancel = default(CancellationToken))
	{
		Task task;
		lock (Gate)
		{
			task = Running;
			if (task != null && !task.IsCompleted)
			{
				task = Running;
			}
			else
			{
				if (Force || State != VersionState.Fresh)
				{
					goto IL_0066;
				}
				VersionSnapshot snapshot = Snapshot;
				if ((object)snapshot == null || !(Clock() - snapshot.FetchedAtUtc < Ttl))
				{
					goto IL_0066;
				}
				task = Task.CompletedTask;
			}
			goto end_IL_0008;
			IL_0066:
			Running = RunAsync(Cancel);
			task = Running;
			end_IL_0008:;
		}
		return task;
	}

	private static async Task RunAsync(CancellationToken Cancel)
	{
		await Task.Yield();
		Set(VersionState.Loading, Error);
		try
		{
			using CancellationTokenSource Timeout = CancellationTokenSource.CreateLinkedTokenSource(Cancel);
			Timeout.CancelAfter(VersionService.Timeout);
			Task<string> RobloxTask = Fetch("https://clientsettings.roblox.com/v2/client-version/WindowsPlayer", Timeout.Token);
			CodexManifest manifest = ParseManifest(await Fetch("https://cdn.robloxscripts.gg/stable/version.json", Timeout.Token));
			Snapshot = new VersionSnapshot(Snapshot?.Roblox, manifest, Clock());
			Set(VersionState.Fresh, null);
			ApplyRobloxAsync(RobloxTask);
		}
		catch (OperationCanceledException) when (Cancel.IsCancellationRequested)
		{
			Set(((object)Snapshot != null) ? VersionState.Stale : VersionState.Idle, Error);
		}
		catch (Exception ex2) when ((ex2 is HttpRequestException || ex2 is JsonException || ex2 is OperationCanceledException || ex2 is InvalidOperationException) ? true : false)
		{
			AppLog.Error(ex2, null, "RunAsync", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Core\\Versioning\\VersionService.cs");
			Set(((object)Snapshot == null) ? VersionState.Failed : VersionState.Stale, (ex2 is OperationCanceledException) ? "The version request timed out." : ex2.Message);
		}
		catch (Exception ex3)
		{
			AppLog.Error(ex3, null, "RunAsync", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Core\\Versioning\\VersionService.cs");
			Set(((object)Snapshot == null) ? VersionState.Failed : VersionState.Stale, ex3.Message);
		}
	}

	private static async Task ApplyRobloxAsync(Task<string> RobloxTask)
	{
		try
		{
			string version = ParseRoblox(await RobloxTask.WaitAsync(Timeout)).Version;
			VersionSnapshot snapshot = Snapshot;
			if ((object)snapshot != null)
			{
				Snapshot = snapshot with
				{
					Roblox = version
				};
				Set(State, Error);
			}
		}
		catch (Exception failure)
		{
			AppLog.Warning(failure, "The Roblox version could not be retrieved; the Codex versions are unaffected.");
		}
	}

	private static void Set(VersionState State, string? Error)
	{
		VersionService.State = State;
		VersionService.Error = Error;
		AppLog.Debug("Version service state {State} {Error}", State, Error);
		Action changed = Changed;
		if (changed != null)
		{
			Dispatcher dispatcher = Application.Current?.Dispatcher;
			if (dispatcher == null || dispatcher.CheckAccess())
			{
				changed();
			}
			else
			{
				dispatcher.BeginInvoke(changed);
			}
		}
	}

	internal static void Reset()
	{
		lock (Gate)
		{
			Running = null;
			State = VersionState.Idle;
			Snapshot = null;
			Error = null;
		}
	}
}
