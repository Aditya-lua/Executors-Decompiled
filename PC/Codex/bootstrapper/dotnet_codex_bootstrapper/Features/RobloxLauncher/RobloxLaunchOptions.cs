using System;
using System.Threading;
using System.Threading.Tasks;
using dotnet_codex_bootstrapper.Core.Manifest;
using dotnet_codex_bootstrapper.Services;

namespace dotnet_codex_bootstrapper.Features.RobloxLauncher;

public sealed record RobloxLaunchOptions(string Uri, LauncherSettings Settings, CdnClient Client, ProtocolRegistration Registration, RobloxInstaller Installer, bool ManageRegistry, Func<string, bool> Ask, Func<CancellationToken, Task<UpdateManifest?>>? Manifest = null, Func<string, LoaderUpdater>? Loaders = null, Action? StartCodex = null, Func<string, string, bool>? StartRoblox = null, Func<string, string, bool>? HandOff = null, Func<TimeSpan, CancellationToken, Task>? Delay = null);
