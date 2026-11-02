using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Diagnostics;
using System.IO;
using System.Net.Http;
using System.Security;
using System.Threading;
using System.Threading.Tasks;
using System.Windows;
using dotnet_codex_bootstrapper.Core.Configuration;
using dotnet_codex_bootstrapper.Core.Manifest;
using dotnet_codex_bootstrapper.Core.Versioning;
using dotnet_codex_bootstrapper.Features.Bootstrapping;
using dotnet_codex_bootstrapper.Features.Bootstrapping.Demo;
using dotnet_codex_bootstrapper.Features.RobloxLauncher;
using dotnet_codex_bootstrapper.Infrastructure;
using dotnet_codex_bootstrapper.Services;

namespace dotnet_codex_bootstrapper;

public partial class App : Application
{
	public const string ScenarioArgument = "--scenario";

	public const string RobloxGuardName = "Local\\CodexRobloxLauncher";

	private InstanceGuard? Guard;

	public static DemoScenario ScenarioFrom(IReadOnlyList<string> Arguments)
	{
		return StartupOptions.Parse(Arguments).Scenario;
	}

	protected override void OnStartup(StartupEventArgs E)
	{
		base.OnStartup(E);
		StartupOptions Options = StartupOptions.Parse(E.Args, Channels.Stored());
		BootstrapperPaths Paths = BootstrapperPaths.Default();
		AppLog.Initialize(new _003C_003Ez__ReadOnlyArray<string>(new string[2]
		{
			Paths.LogDirectory,
			Path.Combine(Path.GetTempPath(), "CodexBootstrapper", "logs")
		}), BootstrapperVersion.Display, Channels.NameOf(Options.Channel));
		FatalErrorHandler.Attach(this);
		AccentTheme.Apply(AccentTheme.ReadStored());
		AppLog.Information("Bootstrapper {Version} started (channel {Channel}, demo {Demo})", BootstrapperVersion.Display, Channels.NameOf(Options.Channel), Options.Demo);
		if (Options.SelfTestFile != null)
		{
			SelfTest.Run(Options.SelfTestFile);
			Shutdown(0);
			return;
		}
		if (Options.Demo)
		{
			StartDemo(Options);
			return;
		}
		string Current = Environment.ProcessPath ?? string.Empty;
		if (Options.RestoreRoblox)
		{
			RestoreRobloxLinks(Paths);
			Shutdown(0);
			return;
		}
		if (Options.RobloxUri != null)
		{
			StartRoblox(Options, Paths, Current);
			return;
		}
		if (Options.AfterUpdate && !CompleteHandoff(Options, Current))
		{
			Shutdown(1);
			return;
		}
		if (!Options.NoRelocate && !Options.AfterUpdate && ShouldRelocate() && FirstRun.EnsureInstalled(Current, Paths, new ProcessLauncher(), string.Join(' ', E.Args)) == FirstRunOutcome.HandedOver)
		{
			Shutdown(0);
			return;
		}
		if (!InstanceGuard.TryAcquire("Global\\CodexBootstrapperMutex", TimeSpan.FromSeconds(2L), out Guard))
		{
			AppLog.Warning("Another bootstrapper instance is already running");
			PromptWindow.Show("Codex is already updating", "The Codex bootstrapper is already running. It opens Codex when it is done.");
			Shutdown(0);
			return;
		}
		ReconcileRobloxLinks(Paths, Current);
		BootstrapperViewModel bootstrapperViewModel = new BootstrapperViewModel(() => CreateOrchestrator(Options, Paths, Current));
		MainWindow = new MainWindow(bootstrapperViewModel);
		MainWindow.Show();
		bootstrapperViewModel.Start();
	}

	protected override void OnExit(ExitEventArgs E)
	{
		Guard?.Dispose();
		AppLog.Information("Bootstrapper exited with code {Code}", E.ApplicationExitCode);
		AppLog.Close();
		base.OnExit(E);
	}

	public static string HandoffArgumentsFor(StartupOptions Options)
	{
		return "--channel " + Channels.NameOf(Options.Channel) + (Options.NoLaunch ? " --no-launch" : string.Empty) + (Options.NoRelocate ? " --no-relocate" : string.Empty);
	}

	private static string? RobloxHandler(string Current, BootstrapperPaths Paths)
	{
		string text = ProtocolRegistration.HandlerFor(Current, Paths);
		if (text == null)
		{
			AppLog.Warning("The Roblox links are not managed: this bootstrapper runs from a temporary folder");
			return null;
		}
		if (!InteractiveProfile.IsInteractiveUser())
		{
			AppLog.Warning("The Roblox links are not managed: this bootstrapper runs as a different user than the one signed in");
			return null;
		}
		return text;
	}

	private static bool Ask(string Question)
	{
		return PromptWindow.Ask("Codex", Question);
	}

	private static void ReconcileRobloxLinks(BootstrapperPaths Paths, string Current)
	{
		string text = RobloxHandler(Current, Paths);
		if (text == null)
		{
			return;
		}
		try
		{
			LauncherSettings launcherSettings = LauncherSettings.Read();
			ProtocolRegistration protocolRegistration = ProtocolRegistration.For(Paths, text);
			protocolRegistration.Reconcile(launcherSettings.Enabled, (string Other) => Ask(ProtocolRegistration.TakeOverQuestion(Other)));
			AppLog.Information("Roblox launcher {State}; roblox-player links open with {Owner} ({Handler})", launcherSettings.Enabled ? "on" : "off", protocolRegistration.OwnerOf("roblox-player"), ProtocolRegistration.ExecutableOf(protocolRegistration.CommandOf("roblox-player")) ?? "nothing");
		}
		catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException || ex is SecurityException) ? true : false)
		{
			AppLog.Warning(ex, "The Roblox links could not be updated");
		}
	}

	private static void RestoreRobloxLinks(BootstrapperPaths Paths)
	{
		try
		{
			LauncherSettings.Disable();
			ProtocolRegistration.For(Paths).Restore();
			PromptWindow.Show("Roblox launcher turned off", "Roblox links open with Roblox again.");
		}
		catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException || ex is SecurityException) ? true : false)
		{
			AppLog.Error(ex, "The Roblox links could not be restored");
			PromptWindow.Show("Roblox links not restored", "The Roblox links could not be restored: " + ex.Message, PromptKind.Error);
		}
	}

	private void StartRoblox(StartupOptions Options, BootstrapperPaths Paths, string Current)
	{
		ShutdownMode = ShutdownMode.OnExplicitShutdown;
		if (!InstanceGuard.TryAcquire("Local\\CodexRobloxLauncher", TimeSpan.FromSeconds(1L), out Guard))
		{
			AppLog.Warning("Codex is already starting Roblox; the new link was not opened");
			PromptWindow.Show("Roblox is already starting", "Codex is already starting Roblox. Try again in a moment.");
			Shutdown(0);
			return;
		}
		LauncherSettings launcherSettings = LauncherSettings.Read();
		string text = RobloxHandler(Current, Paths);
		CdnEndpoints Endpoints = CdnEndpoints.Create();
		CdnClient Client = new CdnClient(CdnClient.CreateHttpClient(), Endpoints, new RetryPolicy());
		FileDownloader Downloader = new FileDownloader(Client);
		InstallStateStore State = new InstallStateStore(Paths);
		RobloxLaunchFlow Flow = new RobloxLaunchFlow(new RobloxLaunchOptions(Options.RobloxUri, launcherSettings, Client, ProtocolRegistration.For(Paths, text), new RobloxInstaller(Paths.RobloxDirectory, Downloader), text != null, (string Question) => PromptWindow.Ask("Codex Launcher", Question), async (CancellationToken Cancel) =>
		{
			try
			{
				return (await new ManifestFetcher(Client).FetchAsync(Options.Channel, Cancel)).Manifest;
			}
			catch (Exception ex) when (((ex is UpdateException || ex is ManifestException || ex is HttpRequestException || ex is TaskCanceledException) ? true : false) && !Cancel.IsCancellationRequested)
			{
				AppLog.Warning(ex, "The Codex manifest could not be fetched; using the cached one");
				return State.LoadCachedManifest(Options.Channel);
			}
		}, (string Version) => new LoaderUpdater(Paths, Endpoints, Downloader, (CancellationToken _) => Task.FromResult(Version)), () =>
		{
			StartCodexIfClosed(Paths, State);
		}));
		BootstrapperViewModel Model = new BootstrapperViewModel(() => Flow);
		MainWindow Window = new MainWindow(Model)
		{
			Heading = "Codex Launcher"
		};
		MainWindow = Window;
		Window.Closed += (object? _, EventArgs _) =>
		{
			Shutdown(0);
		};
		bool Shown = false;
		if (launcherSettings.Enabled && launcherSettings.ShowProgress == ProgressMode.Always)
		{
			Show();
		}
		Model.PropertyChanged += (object? _, PropertyChangedEventArgs E) =>
		{
			if (!(E.PropertyName != "Snapshot"))
			{
				BootstrapperSnapshot snapshot = Model.Snapshot;
				bool flag = snapshot.IsFailed;
				if (!flag)
				{
					BootstrapperStage stage = snapshot.Stage;
					bool flag2 = (uint)(stage - 2) <= 1u;
					flag = flag2;
				}
				if (flag || snapshot.Title == "Codex is outdated")
				{
					Show();
				}
				if (snapshot.ExitRequested && !Shown)
				{
					Shutdown(0);
				}
			}
		};
		Model.Start();
		void Show()
		{
			if (!Shown)
			{
				Shown = true;
				Window.Show();
			}
		}
	}

	private static void StartCodexIfClosed(BootstrapperPaths Paths, InstallStateStore State)
	{
		InstallState installState = State.Load();
		if ((object)installState == null || new Installer(Paths, new AppProcessProbe()).IsAppRunning(installState.Executable) || !File.Exists(Paths.InstalledBootstrapper))
		{
			return;
		}
		using (Process.Start(new ProcessStartInfo(Paths.InstalledBootstrapper)
		{
			UseShellExecute = false,
			WorkingDirectory = Paths.Root
		}))
		{
			AppLog.Information("Codex was started after Roblox");
		}
	}

	private static bool ShouldRelocate()
	{
		return true;
	}

	private static bool CompleteHandoff(StartupOptions Options, string Current)
	{
		if (Options.Operation == null)
		{
			return false;
		}
		return SelfUpdater.CompleteHandoff(Current, Options.Operation, Options.ParentId, Options.Expect, BootstrapperVersion.Display);
	}

	private void StartDemo(StartupOptions Options)
	{
		DemoController demoController = new DemoController(Options.Scenario);
		BootstrapperViewModel bootstrapperViewModel = new BootstrapperViewModel(demoController.CreateFlow);
		MainWindow = new MainWindow(bootstrapperViewModel, demoController);
		MainWindow.Show();
		bootstrapperViewModel.Start();
	}

	private static IBootstrapperFlow CreateOrchestrator(StartupOptions Options, BootstrapperPaths Paths, string Current)
	{
		CdnEndpoints endpoints = CdnEndpoints.Create();
		CdnClient client = new CdnClient(CdnClient.CreateHttpClient(), endpoints, new RetryPolicy());
		ProcessLauncher launcher = new ProcessLauncher();
		FileDownloader downloader = new FileDownloader(client);
		bool flag = string.Equals(Path.GetFullPath(Current), Path.GetFullPath(Paths.InstalledBootstrapper), StringComparison.OrdinalIgnoreCase);
		return new UpdateOrchestrator(new OrchestratorOptions(Options.Channel, Paths, new ManifestFetcher(client), downloader, new IntegrityChecker(), new InstallStateStore(Paths), new Installer(Paths, new AppProcessProbe()), new RuntimeDetector(), new RuntimeInstaller(downloader, launcher), new SelfUpdater(launcher), new AppLauncher(launcher), Current, BootstrapperVersion.Display, !Options.NoLaunch, flag, HandoffArgumentsFor(Options), 60, null, flag ? new ShortcutService(ShortcutLocations.Resolve()) : null, new LoaderUpdater(Paths, endpoints, downloader)));
	}
}
