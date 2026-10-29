using System;
using System.ComponentModel;
using System.IO;
using System.Security.Cryptography;
using System.Security.Cryptography.X509Certificates;
using System.Threading;
using System.Threading.Tasks;
using dotnet_codex_bootstrapper.Core.Manifest;
using dotnet_codex_bootstrapper.Infrastructure;

namespace dotnet_codex_bootstrapper.Services;

public sealed class RuntimeInstaller(FileDownloader Downloader, IProcessLauncher Launcher, Func<string, bool>? SignerCheck = null)
{
	public static readonly TimeSpan InstallTimeout = TimeSpan.FromMinutes(15L);

	private readonly Func<string, bool> Signer = SignerCheck ?? new Func<string, bool>(IsMicrosoftSigned);

	public static string InstallerPath(string StagingDirectory)
	{
		return Path.Combine(StagingDirectory, "runtime", "windowsdesktop-runtime-win-x64.exe");
	}

	public async Task<string> DownloadAsync(RuntimeEntry Runtime, string StagingDirectory, long Size, IProgress<DownloadProgress>? Progress, CancellationToken Cancel)
	{
		string Installer0 = InstallerPath(StagingDirectory);
		await Downloader.DownloadAsync(new Uri(Runtime.InstallerUrl), Installer0, Size, null, Runtime.Sha256, Progress, Cancel);
		if (!Signer(Installer0))
		{
			File.Delete(Installer0);
			throw new UpdateException("E-RUNTIME", "The .NET runtime installer is not signed by Microsoft.");
		}
		return Installer0;
	}

	public async Task RunInstallerAsync(string Installer0, CancellationToken Cancel)
	{
		AppLog.Information("Running the .NET Desktop Runtime installer");
		IStartedProcess Process;
		try
		{
			Process = Launcher.Start(Installer0, "/install /quiet /norestart", Path.GetDirectoryName(Installer0), RequireElevation: true);
		}
		catch (Exception ex) when ((ex is Win32Exception || ex is InvalidOperationException) ? true : false)
		{
			throw new UpdateException("E-RUNTIME", "The .NET runtime installer could not be started (administrator approval is required).", ex);
		}
		using (Process)
		{
			if (!(await Task.Run(() => Process.WaitForExit((int)InstallTimeout.TotalMilliseconds), Cancel)))
			{
				Process.Kill();
				throw new UpdateException("E-RUNTIME", "The .NET runtime installer timed out.");
			}
			int exitCode = Process.ExitCode;
			if ((exitCode != 0 && exitCode != 1638 && exitCode != 3010) || 1 == 0)
			{
				throw new UpdateException("E-RUNTIME", $"The .NET runtime installer failed (exit code {Process.ExitCode}).");
			}
		}
		File.Delete(Installer0);
	}

	public async Task InstallAsync(RuntimeEntry Runtime, string StagingDirectory, long Size, IProgress<DownloadProgress>? Progress, CancellationToken Cancel)
	{
		await RunInstallerAsync(await DownloadAsync(Runtime, StagingDirectory, Size, Progress, Cancel), Cancel);
	}

	public static bool IsMicrosoftSigned(string Path0)
	{
		try
		{
			using X509Certificate2 x509Certificate = new X509Certificate2(X509Certificate.CreateFromSignedFile(Path0));
			using X509Chain x509Chain = new X509Chain();
			x509Chain.ChainPolicy.RevocationMode = X509RevocationMode.NoCheck;
			return x509Certificate.Subject.Contains("O=Microsoft Corporation", StringComparison.OrdinalIgnoreCase) && x509Chain.Build(x509Certificate);
		}
		catch (CryptographicException)
		{
			return false;
		}
	}
}
