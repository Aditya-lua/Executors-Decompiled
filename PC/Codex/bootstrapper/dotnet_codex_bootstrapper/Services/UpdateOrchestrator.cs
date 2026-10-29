using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Net.Http;
using System.Threading;
using System.Threading.Tasks;
using dotnet_codex_bootstrapper.Core.Configuration;
using dotnet_codex_bootstrapper.Core.Manifest;
using dotnet_codex_bootstrapper.Core.Versioning;
using dotnet_codex_bootstrapper.Features.Bootstrapping;
using dotnet_codex_bootstrapper.Infrastructure;

namespace dotnet_codex_bootstrapper.Services;

public sealed class UpdateOrchestrator(OrchestratorOptions Options) : IBootstrapperFlow
{
	private sealed class Immediate<T>(Action<T> Handler) : IProgress<T>
	{
		public void Report(T Value)
		{
			Handler(Value);
		}
	}

	private IProgress<BootstrapperSnapshot> Output;

	private BootstrapperSnapshot Last = BootstrapperSnapshot.Initial;

	public async Task RunAsync(IProgress<BootstrapperSnapshot> Progress, CancellationToken Cancel)
	{
		Output = Progress;
		try
		{
			await RunCoreAsync(Cancel);
		}
		catch (OperationCanceledException) when (Cancel.IsCancellationRequested)
		{
			throw;
		}
		catch (ManifestException ex2)
		{
			AppLog.Error(ex2, "The update data was rejected ({Code})", ex2.Code);
			Fail("Update data rejected", ex2.Message, "E-MANIFEST");
		}
		catch (UpdateException ex3)
		{
			AppLog.Error(ex3, "The update failed ({Code})", ex3.Code);
			Fail(TitleFor(ex3.Code), ex3.Message, ex3.Code);
		}
		catch (Exception error)
		{
			AppLog.Error(error, "The update failed unexpectedly");
			Fail("Something went wrong", "An unexpected error stopped the update. Details were written to the log.", "E-UNEXPECTED");
		}
	}

	private static string TitleFor(string Code)
	{
		return Code switch
		{
			"E-RUNNING" => "Close Codex to continue", 
			"E-NET" => "Couldn't reach the update service", 
			"E-MISSING" => "The update is incomplete on the server", 
			"E-HASH" => "A download failed verification", 
			"E-ACCESS" => "Couldn't write to the install folder", 
			"E-LOCKED" => "A file is in use", 
			"E-RUNTIME" => ".NET runtime problem", 
			"E-LAUNCH" => "Couldn't start Codex", 
			"E-OFFLINE" => "You appear to be offline", 
			"E-VERIFY" => "The installed files failed verification", 
			_ => "Update failed", 
		};
	}

	private void Publish(BootstrapperSnapshot Next)
	{
		Last = Next;
		Output.Report(Next);
	}

	private void Fail(string Title, string Description, string Code)
	{
		Publish(Last with
		{
			Title = Title,
			Description = Description,
			Outcome = BootstrapperOutcome.Failed,
			Operation = "Stopped",
			Footer = "Error " + Code + ((AppLog.Directory == null) ? string.Empty : " · details are in the log"),
			DownloadBytesPerSecond = null,
			ExtractionBytesPerSecond = null,
			ExtractionFilesPerSecond = null,
			ExitRequested = false
		});
	}

	private BootstrapperSnapshot Snap(BootstrapperStage Stage, string Title, string Description, double? Progress, string Operation, string Footer, string? File = null, double? Download = null, string? Target = null, string? Current = null)
	{
		return new BootstrapperSnapshot(Stage, Title, Description, Progress, Operation, Footer, BootstrapperOutcome.Running, File, Download, null, null, Current ?? Options.CurrentVersionText, Target);
	}

	private static RemoteInfo? FromState(InstallState? State, FileEntry File0)
	{
		if ((object)State == null || !State.Files.TryGetValue(File0.Path, out FileRecord value) || !(value.Package == File0.Package))
		{
			return null;
		}
		return new RemoteInfo(value.Md5, value.Length);
	}

	private async Task RunCoreAsync(CancellationToken Cancel)
	{
		string ChannelName = Channels.NameOf(Options.Channel);
		Publish(Snap(BootstrapperStage.Checking, "Checking for updates", "Contacting the update service.", null, "Preparing", "Channel: " + ChannelName));
		try
		{
			Options.Paths.EnsureDirectories();
		}
		catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException) ? true : false)
		{
			throw new UpdateException("E-ACCESS", "Codex could not prepare its install folder.", ex);
		}
		Options.Installer.RecoverInterrupted();
		SelfUpdater.CleanupOld(Options.CurrentExecutable);
		FetchedManifest Fetched;
		try
		{
			Fetched = await Options.Fetcher.FetchAsync(Options.Channel, Cancel);
		}
		catch (Exception ex2) when (IsTransport(ex2, Cancel))
		{
			await RunOfflineAsync(ex2, Cancel);
			return;
		}
		UpdateManifest Manifest = Fetched.Manifest;
		AppLog.Information("Manifest accepted: channel {Channel}, app {App}, bootstrapper {Bootstrapper}, {Count} files", ChannelName, Manifest.App.Version, Manifest.Bootstrapper.Version, Manifest.App.Files.Count);
		InstallState State = Options.State.Load();
		ReleaseVersion releaseVersion = (ReleaseVersion.TryParse(Options.CurrentVersionText, out ReleaseVersion Version) ? Version : null);
		bool BootstrapperUpdate = Options.AllowSelfUpdate && (releaseVersion == null || ReleaseVersion.Parse(Manifest.Bootstrapper.Version) > releaseVersion);
		UpdateOrchestrator updateOrchestrator = this;
		UpdateOrchestrator updateOrchestrator2 = this;
		string description = (BootstrapperUpdate ? "A bootstrapper update is available." : "The bootstrapper is up to date.");
		string footer = "Channel: " + ChannelName;
		string target = (BootstrapperUpdate ? Manifest.Bootstrapper.Version : null);
		updateOrchestrator.Publish(updateOrchestrator2.Snap(BootstrapperStage.Checking, "Checking for updates", description, null, "Comparing versions", footer, null, null, target));
		string AppVersionNote;
		if ((object)State == null)
		{
			AppVersionNote = "first install";
		}
		else
		{
			AppVersionNote = ((State.AppVersion == Manifest.App.Version) ? "up to date" : (State.AppVersion + " to " + Manifest.App.Version));
		}
		CdnClient Cdn = Options.Fetcher.Cdn;
		CdnEndpoints Endpoints = Options.Fetcher.Endpoints;
		IntegrityReport Report = await Options.Integrity.CheckAsync(Options.Paths.AppDirectory, Manifest.App.Files, Lookup, new Immediate<(int, int, string)>(((int Done, int Total, string File) Item) =>
		{
			UpdateOrchestrator updateOrchestrator9 = this;
			UpdateOrchestrator updateOrchestrator10 = this;
			double? progress2 = (double)Item.Done * 100.0 / (double)Item.Total;
			string footer4 = $"Verified {Item.Done} of {Item.Total} · {AppVersionNote}";
			string item = Item.File;
			string version = Manifest.App.Version;
			string current5 = State?.AppVersion;
			updateOrchestrator9.Publish(updateOrchestrator10.Snap(BootstrapperStage.Integrity, "Checking file integrity", "Comparing installed files with the update server.", progress2, "Verifying file", footer4, item, null, version, current5));
		}), Cancel);
		List<FileEntry> Fetch = Report.NeedsFetch.ToList();
		AppLog.Information("Integrity: {Valid} valid, {Missing} missing, {Damaged} damaged", Report.Valid.Count, Report.Missing.Count, Report.Damaged.Count);
		RuntimeEntry runtime = Manifest.Runtime;
		int num = (((object)runtime != null && ReleaseVersion.TryParse(runtime.MinVersion, out ReleaseVersion Version2)) ? Version2.Major : 10);
		bool NeedRuntime = !Options.RuntimeDetector.IsInstalled(num);
		AppLog.Information("Runtime check: .NET Desktop Runtime {Major} installed = {Installed}; bootstrapper update = {Update}", num, !NeedRuntime, BootstrapperUpdate);
		if (NeedRuntime && (object)Manifest.Runtime == null)
		{
			throw new UpdateException("E-RUNTIME", $"The .NET {num} Desktop Runtime is required but is not installed, and the update data has no installer for it.");
		}
		UpdateOrchestrator updateOrchestrator3 = this;
		UpdateOrchestrator updateOrchestrator4 = this;
		string description2 = ((Fetch.Count == 0) ? "All files are intact." : $"{Fetch.Count} files need to be downloaded.");
		double? progress = 100.0;
		string footer2 = $"{Report.Valid.Count} valid · {Report.Missing.Count} missing · {Report.Damaged.Count} damaged";
		target = Manifest.App.Version;
		string current = State?.AppVersion;
		updateOrchestrator3.Publish(updateOrchestrator4.Snap(BootstrapperStage.Integrity, "Checking file integrity", description2, progress, "Verification complete", footer2, null, null, target, current));
		string StageRoot = Path.Combine(Options.Paths.StagingDirectory, "files");
		string StagedBootstrapper = Path.Combine(Options.Paths.StagingDirectory, "bootstrapper", "dotnet-codex-bootstrapper.exe");
		List<FileEntry> NuGetFiles = Fetch.Where((FileEntry fileEntry) => fileEntry.Source == "nuget").ToList();
		List<(PackageEntry Package, long Size, List<FileEntry> Files)> Packages = new List<(PackageEntry, long, List<FileEntry>)>();
		foreach (IGrouping<string, FileEntry> Group in NuGetFiles.GroupBy((FileEntry fileEntry) => fileEntry.Package, StringComparer.OrdinalIgnoreCase))
		{
			PackageEntry Package = Manifest.Packages.First((PackageEntry Entry) => string.Equals(NuGetFetcher.KeyOf(Entry), Group.Key, StringComparison.OrdinalIgnoreCase));
			Packages.Add((Package, (await Cdn.HeadAsync(Endpoints.NuGetPackageUrl(Package.Id, Package.Version), Cancel)).Length, Group.ToList()));
		}
		RemoteInfo BootstrapperInfo = null;
		if (BootstrapperUpdate)
		{
			try
			{
				BootstrapperInfo = await Cdn.HeadAsync(Endpoints.BootstrapperUrl(Options.Channel, Manifest.Bootstrapper.Version), Cancel);
				if (BootstrapperInfo.Md5 == null || BootstrapperInfo.Length <= 0)
				{
					AppLog.Warning("The bootstrapper update has no usable MD5 on the server and was skipped");
					BootstrapperInfo = null;
				}
			}
			catch (UpdateException error)
			{
				AppLog.Warning(error, "The bootstrapper update could not be checked; continuing with the current version");
			}
		}
		RemoteInfo remoteInfo = ((!NeedRuntime) ? null : (await Cdn.HeadAsync(new Uri(Manifest.Runtime.InstallerUrl), Cancel)));
		RemoteInfo RuntimeInfo = remoteInfo;
		long Total = Fetch.Where((FileEntry fileEntry) => fileEntry.Source != "nuget").Sum((FileEntry fileEntry) => Math.Max(0L, Report.Expected[fileEntry.Path]?.Length ?? 0)) + Packages.Sum(((PackageEntry Package, long Size, List<FileEntry> Files) tuple) => Math.Max(0L, tuple.Size)) + (BootstrapperInfo?.Length ?? 0) + (RuntimeInfo?.Length ?? 0);
		long Before = 0L;
		int Index = 0;
		string RuntimeInstaller0 = null;
		if (NeedRuntime)
		{
			RuntimeInstaller0 = await Options.RuntimeInstaller.DownloadAsync(Manifest.Runtime, Options.Paths.StagingDirectory, RuntimeInfo.Length, DownloadProgress("Downloading updates", ".NET Desktop Runtime installer", () => Before, Total, 0, 0, Manifest.App.Version, State?.AppVersion), Cancel);
			Before += Math.Max(0L, RuntimeInfo.Length);
		}
		HashSet<string> Skipped = new HashSet<string>(StringComparer.OrdinalIgnoreCase);
		Dictionary<string, LocalFile> Extracted = new Dictionary<string, LocalFile>(StringComparer.OrdinalIgnoreCase);
		NuGetFetcher NuGet = new NuGetFetcher(Options.Downloader);
		int PackageIndex = 0;
		foreach (var Group2 in Packages)
		{
			PackageIndex++;
			await NuGet.DownloadAsync(Endpoints, Group2.Package, Options.Paths.StagingDirectory, Group2.Size, DownloadProgress("Downloading updates", Group2.Package.Id + " " + Group2.Package.Version + " (NuGet)", () => Before, Total, PackageIndex, Packages.Count, Manifest.App.Version, State?.AppVersion), Cancel);
			Before += Math.Max(0L, Group2.Size);
			string packagePath = NuGetFetcher.PackageFile(Options.Paths.StagingDirectory, Group2.Package);
			List<(FileEntry, string)> list = new List<(FileEntry, string)>();
			list.AddRange(Group2.Files.Select((FileEntry fileEntry) => (File0: fileEntry, Installer.StageFile(StageRoot, fileEntry.Path))));
			foreach (KeyValuePair<string, LocalFile> item2 in await NuGetFetcher.ExtractAsync(packagePath, new _003C_003Ez__ReadOnlyList<(FileEntry, string)>(list), Cancel))
			{
				Extracted[item2.Key] = item2.Value;
			}
			DeleteQuietly(Path.Combine(Options.Paths.StagingDirectory, "nuget"));
		}
		foreach (FileEntry File0 in Fetch.Where((FileEntry fileEntry) => fileEntry.Source != "nuget").ToList())
		{
			Index++;
			RemoteInfo Remote = Report.Expected[File0.Path];
			try
			{
				await Options.Downloader.DownloadAsync(UrlFor(File0), Installer.StageFile(StageRoot, File0.Path), Remote.Length, Remote.Md5, null, DownloadProgress("Downloading updates", File0.Path, () => Before, Total, Index, Fetch.Count - NuGetFiles.Count, Manifest.App.Version, State?.AppVersion), Cancel);
			}
			catch (UpdateException error2) when (!File0.Required)
			{
				AppLog.Warning(error2, "Optional file {Path} could not be downloaded and was skipped", File0.Path);
				Skipped.Add(File0.Path);
				Fetch.Remove(File0);
			}
			Before += Math.Max(0L, Remote.Length);
		}
		bool BootstrapperReady = false;
		if ((object)BootstrapperInfo != null)
		{
			try
			{
				await Options.Downloader.DownloadAsync(Endpoints.BootstrapperUrl(Options.Channel, Manifest.Bootstrapper.Version), StagedBootstrapper, BootstrapperInfo.Length, BootstrapperInfo.Md5, null, DownloadProgress("Downloading bootstrapper update", "dotnet-codex-bootstrapper.exe", () => Before, Total, 1, 1, Manifest.Bootstrapper.Version, Options.CurrentVersionText), Cancel);
				BootstrapperReady = true;
			}
			catch (UpdateException error3)
			{
				AppLog.Warning(error3, "The bootstrapper update could not be downloaded; continuing with the current version");
			}
		}
		if (RuntimeInstaller0 != null)
		{
			UpdateOrchestrator updateOrchestrator5 = this;
			UpdateOrchestrator updateOrchestrator6 = this;
			current = Manifest.App.Version;
			target = State?.AppVersion;
			updateOrchestrator5.Publish(updateOrchestrator6.Snap(BootstrapperStage.Installing, "Installing updates", "Installing the .NET Desktop Runtime. Windows may ask for approval.", null, "Installing .NET Desktop Runtime", "Required to run Codex", null, null, current, target));
			await Options.RuntimeInstaller.RunInstallerAsync(RuntimeInstaller0, Cancel);
		}
		IReadOnlyDictionary<string, LocalFile> FinalLocal = Report.Local;
		if (Fetch.Count > 0)
		{
			await WaitForAppToCloseAsync(Manifest.App.Executable, Cancel);
			UpdateOrchestrator updateOrchestrator7 = this;
			UpdateOrchestrator updateOrchestrator8 = this;
			string footer3 = $"{Fetch.Count} files";
			target = Manifest.App.Version;
			current = State?.AppVersion;
			updateOrchestrator7.Publish(updateOrchestrator8.Snap(BootstrapperStage.Installing, "Installing updates", "Replacing files with the verified downloads.", null, "Applying files", footer3, null, null, target, current));
			string Operation = AppLog.NewOperationId();
			await Task.Run(() =>
			{
				Options.Installer.Apply(Operation, StageRoot, Fetch, Manifest.App.Executable);
			}, Cancel);
			Dictionary<string, RemoteInfo?> Expect = new Dictionary<string, RemoteInfo>(Report.Expected, StringComparer.OrdinalIgnoreCase);
			foreach (KeyValuePair<string, LocalFile> item3 in Extracted)
			{
				Expect[item3.Key] = new RemoteInfo(item3.Value.Md5, item3.Value.Length);
			}
			List<FileEntry> files = Manifest.App.Files.Where((FileEntry fileEntry) => !Skipped.Contains(fileEntry.Path)).ToList();
			IntegrityReport integrityReport = await Options.Integrity.CheckAsync(Options.Paths.AppDirectory, files, (FileEntry fileEntry, CancellationToken _) => Task.FromResult(Expect.GetValueOrDefault(fileEntry.Path)), new Immediate<(int, int, string)>(((int Done, int Total, string File) Item) =>
			{
				UpdateOrchestrator updateOrchestrator9 = this;
				UpdateOrchestrator updateOrchestrator10 = this;
				double? progress2 = (double)Item.Done * 100.0 / (double)Item.Total;
				string footer4 = $"{Item.Done} of {Item.Total}";
				string item = Item.File;
				string version = Manifest.App.Version;
				string current5 = State?.AppVersion;
				updateOrchestrator9.Publish(updateOrchestrator10.Snap(BootstrapperStage.Installing, "Installing updates", "Verifying the installed files.", progress2, "Verifying installation", footer4, item, null, version, current5));
			}), Cancel);
			if (!integrityReport.IsClean)
			{
				Options.Installer.RollbackOperation(Operation);
				throw new UpdateException("E-VERIFY", "The installed files did not match what the update server reports, so the update was rolled back.");
			}
			FinalLocal = integrityReport.Local;
			List<string> list2 = State?.Files.Keys.Except(Manifest.App.Files.Select((FileEntry fileEntry) => fileEntry.Path), StringComparer.OrdinalIgnoreCase).ToList() ?? new List<string>();
			Options.Installer.Commit(Operation, list2);
			AppLog.Information("Installed {Count} files and removed {Orphans} obsolete files", Fetch.Count, list2.Count);
		}
		Dictionary<string, FileRecord> dictionary = new Dictionary<string, FileRecord>(StringComparer.OrdinalIgnoreCase);
		foreach (FileEntry item4 in Manifest.App.Files.Where((FileEntry fileEntry) => !Skipped.Contains(fileEntry.Path) && FinalLocal.ContainsKey(fileEntry.Path)))
		{
			dictionary[item4.Path] = new FileRecord(FinalLocal[item4.Path].Md5, FinalLocal[item4.Path].Length, item4.Package);
		}
		Options.State.Save(new InstallState(Manifest.App.Version, Manifest.App.Executable, Options.CurrentVersionText, ChannelName, dictionary, DateTimeOffset.UtcNow));
		Options.State.SaveManifest(Fetched.Bytes);
		DeleteQuietly(StageRoot);
		await EnsureLoaderAsync(Manifest, Cancel);
		bool flag = BootstrapperReady;
		if (flag)
		{
			flag = await TrySelfUpdateAsync(Manifest, StagedBootstrapper);
		}
		if (!flag)
		{
			await LaunchAsync(Manifest.App.Executable, Manifest.App.Version, Offline: false);
		}
		async Task<RemoteInfo?> Lookup(FileEntry fileEntry, CancellationToken Token)
		{
			if (fileEntry.Source == "nuget")
			{
				return FromState(State, fileEntry);
			}
			try
			{
				return await Cdn.HeadAsync(UrlFor(fileEntry), Token);
			}
			catch (CdnException ex3) when (ex3.StatusCode is 403 or 404)
			{
				AppLog.Error(ex3, "'{Path}' was refused with HTTP {Status} at {Url}", fileEntry.Path, ex3.StatusCode, UrlFor(fileEntry));
				throw new UpdateException("E-MISSING", "'" + fileEntry.Path + "' is missing on the update server.", ex3);
			}
		}
		Uri UrlFor(FileEntry fileEntry)
		{
			if (!(fileEntry.Source == "static"))
			{
				return Endpoints.AppFileUrl(Options.Channel, Manifest.App.Version, fileEntry.Path);
			}
			return Endpoints.StaticFileUrl(fileEntry.RemotePath ?? fileEntry.Path);
		}
	}

	private async Task EnsureLoaderAsync(UpdateManifest Manifest, CancellationToken Cancel)
	{
		LoaderUpdater Loaders = Options.Loaders;
		if (Loaders == null)
		{
			return;
		}
		Func<TimeSpan, CancellationToken, Task> Delay = Options.Delay ?? ((Func<TimeSpan, CancellationToken, Task>)((TimeSpan Span, CancellationToken Token) => Task.Delay(Span, Token)));
		UpdateManifest Current = Manifest;
		while (true)
		{
			LoaderResult loaderResult = await Loaders.EnsureAsync(Current, DownloadProgress("Downloading updates", "Loader", () => 0L, 0L, 1, 1, null, null), Cancel);
			if (loaderResult.Status != LoaderStatus.Outdated)
			{
				break;
			}
			Publish(Snap(BootstrapperStage.Checking, "Codex is outdated", "Codex doesn't support the current Roblox version (" + loaderResult.RobloxVersion + ") yet. Waiting for an update.", null, "Waiting for an update", "Checking again automatically"));
			await Delay(TimeSpan.FromSeconds(30L), Cancel);
			try
			{
				Current = (await Options.Fetcher.FetchAsync(Options.Channel, Cancel)).Manifest;
			}
			catch (Exception error) when (IsTransport(error, Cancel))
			{
				AppLog.Warning(error, "The manifest could not be refreshed while waiting for a loader");
			}
		}
	}

	private async Task<bool> TrySelfUpdateAsync(UpdateManifest Manifest, string Staged)
	{
		UpdateOrchestrator updateOrchestrator = this;
		UpdateOrchestrator updateOrchestrator2 = this;
		string footer = Options.CurrentVersionText + " to " + Manifest.Bootstrapper.Version;
		string version = Manifest.Bootstrapper.Version;
		updateOrchestrator.Publish(updateOrchestrator2.Snap(BootstrapperStage.Installing, "Updating the bootstrapper", "Switching to the new bootstrapper.", null, "Replacing the bootstrapper", footer, null, null, version));
		try
		{
			SelfUpdater.ValidateStagedExecutable(Staged, Manifest.Bootstrapper.Version);
		}
		catch (Exception ex) when ((ex is UpdateException || ex is IOException) ? true : false)
		{
			AppLog.Warning(ex, "The downloaded bootstrapper was rejected");
			return false;
		}
		SelfUpdateResult selfUpdateResult = await Task.Run(() => Options.SelfUpdater.ReplaceAndRestart(Options.CurrentExecutable, Staged, Manifest.Bootstrapper.Version, AppLog.NewOperationId(), Options.HandoffArguments));
		if (!selfUpdateResult.Success)
		{
			AppLog.Warning("Self-update failed: {Message}", selfUpdateResult.Message);
			return false;
		}
		UpdateOrchestrator updateOrchestrator3 = this;
		UpdateOrchestrator updateOrchestrator4 = this;
		string message = selfUpdateResult.Message;
		double? progress = 100.0;
		version = Manifest.Bootstrapper.Version;
		updateOrchestrator3.Publish(updateOrchestrator4.Snap(BootstrapperStage.Launching, "Restarting", message, progress, "Handing over", "Bootstrapper updated", null, null, version)with
		{
			Outcome = BootstrapperOutcome.Completed,
			ExitRequested = true
		});
		return true;
	}

	private async Task LaunchAsync(string Executable, string AppVersion, bool Offline)
	{
		ShortcutService Shortcuts = Options.Shortcuts;
		if (Shortcuts != null)
		{
			await Task.Run(() => Shortcuts.Ensure(Options.Paths, Executable, Options.State.Load()));
		}
		string current;
		if (!Options.LaunchApp)
		{
			UpdateOrchestrator updateOrchestrator = this;
			UpdateOrchestrator updateOrchestrator2 = this;
			double? progress = 100.0;
			string footer = "Version " + AppVersion;
			current = AppVersion;
			updateOrchestrator.Publish(updateOrchestrator2.Snap(BootstrapperStage.Launching, "Up to date", "Codex is installed and verified.", progress, "Finished", footer, null, null, null, current)with
			{
				Outcome = BootstrapperOutcome.Completed
			});
			return;
		}
		UpdateOrchestrator updateOrchestrator3 = this;
		UpdateOrchestrator updateOrchestrator4 = this;
		string description = (Offline ? "The update service can't be reached. Launching the installed version." : "Starting Codex.");
		string footer2 = (Offline ? ("Offline · using version " + AppVersion) : ("Version " + AppVersion));
		current = AppVersion;
		updateOrchestrator3.Publish(updateOrchestrator4.Snap(BootstrapperStage.Launching, "Launching", description, null, "Starting Codex", footer2, null, null, null, current));
		await Task.Run(() => Options.Launcher.Launch(Options.Paths.AppDirectory, Executable));
		UpdateOrchestrator updateOrchestrator5 = this;
		UpdateOrchestrator updateOrchestrator6 = this;
		double? progress2 = 100.0;
		string footer3 = (Offline ? ("Offline · using version " + AppVersion) : ("Version " + AppVersion));
		current = AppVersion;
		updateOrchestrator5.Publish(updateOrchestrator6.Snap(BootstrapperStage.Launching, "Launching", "Codex is running.", progress2, "Finished", footer3, null, null, null, current)with
		{
			Outcome = BootstrapperOutcome.Completed,
			ExitRequested = true
		});
	}

	private async Task RunOfflineAsync(Exception Reason, CancellationToken Cancel)
	{
		AppLog.Warning(Reason, "The update service could not be reached");
		UpdateManifest updateManifest = Options.State.LoadCachedManifest(Options.Channel);
		InstallState State = Options.State.Load();
		if ((object)updateManifest == null || (object)State == null || State.AppVersion != updateManifest.App.Version)
		{
			throw new UpdateException("E-OFFLINE", "The update service can't be reached and Codex isn't installed yet. Check your connection and try again.", Reason);
		}
		if (!(await Options.Integrity.CheckAsync(Options.Paths.AppDirectory, updateManifest.App.Files, (FileEntry File0, CancellationToken _) => Task.FromResult(FromState(State, File0)), null, Cancel)).IsClean)
		{
			throw new UpdateException("E-OFFLINE", "The update service can't be reached and the installed files can't be verified. Check your connection and try again.", Reason);
		}
		await LaunchAsync(State.Executable, State.AppVersion, Offline: true);
	}

	private async Task WaitForAppToCloseAsync(string Executable, CancellationToken Cancel)
	{
		Func<TimeSpan, CancellationToken, Task> Delay = Options.Delay ?? ((Func<TimeSpan, CancellationToken, Task>)((TimeSpan Span, CancellationToken Token) => Task.Delay(Span, Token)));
		int Attempt = 0;
		while (Options.Installer.IsAppRunning(Executable))
		{
			if (Attempt >= Options.CloseWaitAttempts)
			{
				throw new UpdateException("E-RUNNING", "Codex is running. Close it and try again.");
			}
			Publish(Last with
			{
				Stage = BootstrapperStage.Installing,
				Title = "Close Codex to continue",
				Description = "Codex must be closed before its files can be updated.",
				Progress = null,
				Operation = "Waiting for Codex to close",
				Footer = "The update continues automatically",
				DownloadBytesPerSecond = null
			});
			await Delay(TimeSpan.FromSeconds(2L), Cancel);
			Attempt++;
		}
	}

	private IProgress<DownloadProgress> DownloadProgress(string Title, string File, Func<long> Before, long Total, int Index, int Count, string? Target, string? Current)
	{
		return new Immediate<DownloadProgress>((DownloadProgress Item) =>
		{
			long num = Before() + Item.BytesDone;
			Publish(Snap(BootstrapperStage.Downloading, Title, "Downloading and verifying files.", (Total <= 0) ? ((double?)null) : new double?(Math.Min(100.0, (double)num * 100.0 / (double)Total)), "Downloading file", ((Count > 0) ? $"File {Index} of {Count} · " : string.Empty) + BootstrapperSnapshot.FormatBytes(num) + " of " + BootstrapperSnapshot.FormatBytes(Math.Max(Total, num)), File, (Item.BytesPerSecond > 0.0) ? new double?(Item.BytesPerSecond) : ((double?)null), Target, Current));
		});
	}

	private static bool IsTransport(Exception Error, CancellationToken Cancel)
	{
		if (!(Error is CdnException))
		{
			if (!(Error is HttpRequestException))
			{
				if (!(Error is TimeoutException))
				{
					if (Error is OperationCanceledException)
					{
						return !Cancel.IsCancellationRequested;
					}
					return false;
				}
				return true;
			}
			return true;
		}
		return true;
	}

	private static void DeleteQuietly(string Directory0)
	{
		try
		{
			if (Directory.Exists(Directory0))
			{
				Directory.Delete(Directory0, recursive: true);
			}
		}
		catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException) ? true : false)
		{
			AppLog.Warning(ex, "Could not clean the staging folder");
		}
	}
}
