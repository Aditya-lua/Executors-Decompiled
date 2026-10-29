using System;
using System.Threading;
using System.Threading.Tasks;
using dotnet_codex_bootstrapper.Core.Configuration;

namespace dotnet_codex_bootstrapper.Services;

public sealed record OrchestratorOptions(Channel Channel, BootstrapperPaths Paths, ManifestFetcher Fetcher, FileDownloader Downloader, IntegrityChecker Integrity, InstallStateStore State, Installer Installer, IRuntimeDetector RuntimeDetector, RuntimeInstaller RuntimeInstaller, SelfUpdater SelfUpdater, AppLauncher Launcher, string CurrentExecutable, string CurrentVersionText, bool LaunchApp = true, bool AllowSelfUpdate = true, string HandoffArguments = "", int CloseWaitAttempts = 60, Func<TimeSpan, CancellationToken, Task>? Delay = null, ShortcutService? Shortcuts = null, LoaderUpdater? Loaders = null);
