using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Diagnostics;
using System.IO;
using System.Security;
using System.Threading;
using System.Threading.Tasks;
using dotnet_codex_bootstrapper.Core.Manifest;
using dotnet_codex_bootstrapper.Features.Bootstrapping;
using dotnet_codex_bootstrapper.Infrastructure;
using dotnet_codex_bootstrapper.Services;

namespace dotnet_codex_bootstrapper.Features.RobloxLauncher;

public sealed class RobloxLaunchFlow(RobloxLaunchOptions Options) : IBootstrapperFlow
{
	public const string OutdatedTitle = "Codex is outdated";

	public const int OutdatedNoticeSeconds = 3;

	private IProgress<BootstrapperSnapshot> Output;

	private BootstrapperSnapshot Last = BootstrapperSnapshot.Initial;

	public string? Outcome { get; private set; }

	public async Task RunAsync(IProgress<BootstrapperSnapshot> Progress, CancellationToken Cancel)
	{
		Output = Progress;
		AppLog.Information("Roblox launch requested: {Link}", LaunchUri.Redact(Options.Uri));
		if (!LaunchUri.IsValid(Options.Uri))
		{
			AppLog.Warning("The Roblox link was refused because it is not a valid roblox-player: or roblox: link");
			Fail("This link can't be opened", "It is not a valid Roblox link.", "E-LINK");
			return;
		}
		if (!Options.Settings.Enabled)
		{
			if (Options.ManageRegistry)
			{
				Quietly(Options.Registration.Restore, "Restoring the Roblox links");
			}
			HandOff("the Codex Roblox launcher is turned off");
			return;
		}
		if (!Options.ManageRegistry)
		{
			HandOff("this bootstrapper may not manage Roblox for the signed-in user");
			return;
		}
		try
		{
			await LaunchAsync(Cancel);
		}
		catch (OperationCanceledException) when (Cancel.IsCancellationRequested)
		{
			throw;
		}
		catch (Exception error)
		{
			AppLog.Error(error, "The Codex Roblox launcher failed; handing the link to the original Roblox launcher");
			HandOff("the Codex Roblox launcher failed");
		}
	}

	private async Task LaunchAsync(CancellationToken Cancel)
	{
		Quietly(() =>
		{
			Options.Registration.TakeOver((string Handler) => Options.Ask(ProtocolRegistration.TakeOverQuestion(Handler)));
		}, "Registering the Roblox links");
		LauncherSettings Settings = Options.Settings;
		string channel = ((Settings.Channel == LauncherChannel.ForceLive) ? "live" : FollowedChannel());
		Publish(BootstrapperStage.Checking, "Starting Roblox", "Checking for Roblox updates.", null, "Checking Roblox", (Settings.Channel == LauncherChannel.ForceLive) ? "Channel: LIVE" : ("Channel: " + DisplayChannel(channel)));
		RobloxBuild Build = await RobloxDeployment.ResolveAsync(Options.Client, channel, Cancel);
		AppLog.Information("Roblox {Version} ({Guid}) on channel {Channel}", Build.Version, Build.Guid, Build.Channel);
		string version;
		if (!Options.Installer.IsInstalled(Build.Guid))
		{
			RobloxLaunchFlow robloxLaunchFlow = this;
			string description = "Downloading Roblox " + Build.Version + ".";
			string footer = "Version " + Build.Version;
			version = Build.Version;
			robloxLaunchFlow.Publish(BootstrapperStage.Downloading, "Updating Roblox", description, null, "Reading the package list", footer, null, null, version);
			IReadOnlyList<RobloxPackage> Packages = await RobloxDeployment.FetchPackagesAsync(Options.Client, Build, Cancel);
			Progress<InstallProgress> Report = new Progress<InstallProgress>((InstallProgress Item) =>
			{
				Publish(Item.File.StartsWith("Extracting ", StringComparison.Ordinal) ? BootstrapperStage.Installing : BootstrapperStage.Downloading, "Updating Roblox", Item.File.StartsWith("Extracting ", StringComparison.Ordinal) ? ("Installing Roblox " + Build.Version + ".") : ("Downloading Roblox " + Build.Version + "."), (Item.Total <= 0) ? ((double?)null) : new double?(Math.Min(100.0, (double)Item.Done * 100.0 / (double)Item.Total)), Item.File.StartsWith("Extracting ", StringComparison.Ordinal) ? "Extracting" : "Downloading file", BootstrapperSnapshot.FormatBytes(Item.Done) + " of " + BootstrapperSnapshot.FormatBytes(Item.Total), Item.File, (Item.BytesPerSecond > 0.0) ? new double?(Item.BytesPerSecond) : ((double?)null), Build.Version);
			});
			await Task.Run(() => Options.Installer.InstallAsync(Build, Packages, Report, Cancel), Cancel);
		}
		if (!(await Task.Run(() => Options.Installer.Verify(Build.Guid), Cancel)))
		{
			Options.Installer.Remove(Build.Guid);
			throw new RobloxLauncherException("The installed Roblox player is not signed by Roblox Corporation.");
		}
		await NoticeOutdatedAsync(Build, Cancel);
		if (Settings.Channel == LauncherChannel.ForceLive)
		{
			Quietly(Options.Registration.ForceLiveChannel, "Setting the Roblox channel to LIVE");
		}
		string arg = (LaunchUri.IsLive(Build.Channel) ? LaunchUri.WithChannel(Options.Uri, string.Empty) : Options.Uri);
		RobloxLaunchFlow robloxLaunchFlow2 = this;
		string footer2 = "Version " + Build.Version;
		version = Build.Version;
		robloxLaunchFlow2.Publish(BootstrapperStage.Launching, "Starting Roblox", "Roblox is starting.", null, "Starting Roblox", footer2, null, null, version);
		if (!(Options.StartRoblox ?? new Func<string, string, bool>(Start))(Options.Installer.ExecutableOf(Build.Guid), arg))
		{
			throw new RobloxLauncherException("Roblox could not be started.");
		}
		AppLog.Information("Roblox {Version} started", Build.Version);
		Quietly(() =>
		{
			Options.Installer.Cleanup(Build.Guid);
		}, "Removing old Roblox versions");
		if (Settings.StartCodex)
		{
			Action startCodex = Options.StartCodex;
			if (startCodex != null)
			{
				Quietly(startCodex, "Starting Codex");
			}
		}
		Outcome = "launched";
		Complete("Roblox is running", "Version " + Build.Version);
	}

	private async Task NoticeOutdatedAsync(RobloxBuild Build, CancellationToken Cancel)
	{
		if (Options.Manifest == null || Options.Loaders == null)
		{
			return;
		}
		LoaderResult loaderResult;
		try
		{
			UpdateManifest updateManifest = await Options.Manifest(Cancel);
			if ((object)updateManifest == null)
			{
				AppLog.Warning("The Codex manifest is not available; the loader check was skipped");
				return;
			}
			loaderResult = await Options.Loaders(Build.Version).EnsureAsync(updateManifest, null, Cancel);
		}
		catch (Exception ex) when (!(ex is OperationCanceledException) || !Cancel.IsCancellationRequested)
		{
			AppLog.Warning(ex, "The loader check failed; Roblox starts anyway");
			return;
		}
		if (loaderResult.Status == LoaderStatus.Outdated)
		{
			AppLog.Information("No loader for Roblox {Version}; Roblox starts in {Seconds} s without Codex", Build.Version, 3);
			Outcome = "outdated";
			RobloxLaunchFlow robloxLaunchFlow = this;
			string description = "Codex doesn't support Roblox " + Build.Version + " yet, so it can't attach to this game. Roblox starts anyway.";
			string footer = $"Starting in {3} seconds";
			string version = Build.Version;
			robloxLaunchFlow.Publish(BootstrapperStage.Launching, "Codex is outdated", description, null, "Starting Roblox", footer, null, null, version);
			await (Options.Delay ?? ((Func<TimeSpan, CancellationToken, Task>)((TimeSpan Span, CancellationToken Token) => Task.Delay(Span, Token))))(TimeSpan.FromSeconds(3L), Cancel);
		}
	}

	private string FollowedChannel()
	{
		string text = LaunchUri.ChannelOf(Options.Uri);
		if (text.Length > 0)
		{
			return text;
		}
		try
		{
			return Options.Registration.RegisteredChannel()?.ToLowerInvariant() ?? string.Empty;
		}
		catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException || ex is SecurityException) ? true : false)
		{
			return string.Empty;
		}
	}

	private static string DisplayChannel(string Channel)
	{
		if (!LaunchUri.IsLive(Channel))
		{
			return Channel;
		}
		return "LIVE";
	}

	private void HandOff(string Reason)
	{
		string text = null;
		try
		{
			text = Options.Registration.OriginalCommand();
		}
		catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException || ex is SecurityException) ? true : false)
		{
			AppLog.Warning(ex, "The original Roblox launcher could not be looked up");
		}
		if (text == null || ProtocolRegistration.Classify(text) == HandlerOwner.Codex)
		{
			AppLog.Warning("The link could not be handed on ({Reason}): no original Roblox launcher was found", Reason);
			Outcome = "no handler";
			Fail("Roblox isn't installed", "Codex could not start Roblox and no other Roblox launcher was found. Install Roblox from roblox.com, or turn the Codex Roblox launcher on in Codex Settings.", "E-ROBLOX");
			return;
		}
		AppLog.Information("Handing the link to {Handler} because {Reason}", ProtocolRegistration.ExecutableOf(text), Reason);
		bool flag;
		try
		{
			flag = (Options.HandOff ?? new Func<string, string, bool>(ProtocolRegistration.StartWith))(text, Options.Uri);
		}
		catch (Exception ex2) when ((ex2 is Win32Exception || ex2 is InvalidOperationException || ex2 is IOException) ? true : false)
		{
			AppLog.Error(ex2, "The original Roblox launcher could not be started");
			flag = false;
		}
		if (!flag)
		{
			Outcome = "handoff failed";
			Fail("Couldn't start Roblox", "Neither Codex nor the original Roblox launcher could start Roblox. Details are in the log.", "E-ROBLOX");
		}
		else
		{
			Outcome = "handed off";
			Complete("Roblox is starting", "Opened with the original Roblox launcher");
		}
	}

	private static bool Start(string Executable, string Link)
	{
		using Process process = Process.Start(new ProcessStartInfo(Executable)
		{
			UseShellExecute = false,
			WorkingDirectory = Path.GetDirectoryName(Executable),
			ArgumentList = { Link }
		});
		return process != null;
	}

	private static void Quietly(Action Work, string What)
	{
		try
		{
			Work();
		}
		catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException || ex is SecurityException || ex is RobloxLauncherException) ? true : false)
		{
			AppLog.Warning(ex, "{What} failed", What);
		}
	}

	private void Publish(BootstrapperStage Stage, string Title, string Description, double? Progress, string Operation, string Footer, string? File = null, double? Download = null, string? Target = null)
	{
		Last = new BootstrapperSnapshot(Stage, Title, Description, Progress, Operation, Footer, BootstrapperOutcome.Running, File, Download, null, null, null, Target);
		Output.Report(Last);
	}

	private void Complete(string Title, string Footer)
	{
		Last = Last with
		{
			Stage = BootstrapperStage.Launching,
			Title = Title,
			Description = string.Empty,
			Progress = 100.0,
			Operation = "Finished",
			Footer = Footer,
			Outcome = BootstrapperOutcome.Completed,
			DownloadBytesPerSecond = null,
			ExitRequested = true
		};
		Output.Report(Last);
	}

	private void Fail(string Title, string Description, string Code)
	{
		Last = Last with
		{
			Title = Title,
			Description = Description,
			Outcome = BootstrapperOutcome.Failed,
			Operation = "Stopped",
			Footer = "Error " + Code + ((AppLog.Directory == null) ? string.Empty : " · details are in the log"),
			DownloadBytesPerSecond = null,
			ExitRequested = false
		};
		Output.Report(Last);
	}
}
