using System;
using System.Collections.Generic;
using System.IO;
using System.Windows;
using dotnet_codex_bootstrapper.Core.Configuration;
using dotnet_codex_bootstrapper.Core.Versioning;
using dotnet_codex_bootstrapper.Features.Bootstrapping;
using dotnet_codex_bootstrapper.Features.Bootstrapping.Demo;
using dotnet_codex_bootstrapper.Infrastructure;
using dotnet_codex_bootstrapper.Services;

namespace dotnet_codex_bootstrapper;

public partial class App : Application
{
	public const string ScenarioArgument = "--scenario";

	private InstanceGuard? Guard;

	public static DemoScenario ScenarioFrom(IReadOnlyList<string> Arguments)
	{
		return StartupOptions.Parse(Arguments).Scenario;
	}

	protected override void OnStartup(StartupEventArgs E)
	{
		base.OnStartup(E);
		StartupOptions Options = StartupOptions.Parse(E.Args);
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
			MessageBox.Show("The Codex bootstrapper is already running.", "Codex Bootstrapper", MessageBoxButton.OK, MessageBoxImage.Asterisk);
			Shutdown(0);
			return;
		}
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
