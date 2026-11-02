using System;
using System.ComponentModel;
using System.IO;
using System.Security.Cryptography;
using dotnet_codex_bootstrapper.Core.Configuration;

namespace dotnet_codex_bootstrapper.Infrastructure;

public static class FirstRun
{
	public static FirstRunOutcome EnsureInstalled(string CurrentExecutable, BootstrapperPaths Paths, IProcessLauncher Launcher, string Arguments)
	{
		string fullPath = Path.GetFullPath(Paths.InstalledBootstrapper);
		if (string.Equals(Path.GetFullPath(CurrentExecutable), fullPath, StringComparison.OrdinalIgnoreCase))
		{
			return FirstRunOutcome.RunInPlace;
		}
		string text = Path.Combine(Path.GetDirectoryName(Path.GetFullPath(CurrentExecutable)) ?? string.Empty, typeof(FirstRun).Assembly.GetName().Name + ".dll");
		if (File.Exists(text))
		{
			AppLog.Warning("This bootstrapper is not a single file ({Path} sits next to it), so it was not installed; running in place", text);
			return FirstRunOutcome.CouldNotInstall;
		}
		try
		{
			Directory.CreateDirectory(Paths.Root);
			bool flag = File.Exists(fullPath);
			if (!flag || !SameContent(fullPath, CurrentExecutable))
			{
				string text2 = fullPath + "." + Guid.NewGuid().ToString("N").Substring(0, 8) + ".tmp";
				File.Copy(CurrentExecutable, text2, overwrite: false);
				File.Move(text2, fullPath, overwrite: true);
				AppLog.Information(flag ? "The outdated bootstrapper at {Path} was replaced" : "The bootstrapper was copied to {Path}", fullPath);
			}
			using IStartedProcess startedProcess = Launcher.Start(fullPath, Arguments, Paths.Root, RequireElevation: false);
			if (startedProcess.WaitForExit(2000) && startedProcess.ExitCode != 0)
			{
				AppLog.Error("The installed bootstrapper at {Path} exited right away with code {Code}; running in place", fullPath, startedProcess.ExitCode);
				return FirstRunOutcome.CouldNotInstall;
			}
			return FirstRunOutcome.HandedOver;
		}
		catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException || ex is Win32Exception || ex is InvalidOperationException) ? true : false)
		{
			AppLog.Error(ex, "The bootstrapper could not install itself to {Path}; running in place", fullPath);
			return FirstRunOutcome.CouldNotInstall;
		}
	}

	private static bool SameContent(string First, string Second)
	{
		try
		{
			if (new FileInfo(First).Length != new FileInfo(Second).Length)
			{
				return false;
			}
			using FileStream source = new FileStream(First, FileMode.Open, FileAccess.Read, FileShare.ReadWrite | FileShare.Delete);
			using FileStream source2 = new FileStream(Second, FileMode.Open, FileAccess.Read, FileShare.ReadWrite | FileShare.Delete);
			return ((ReadOnlySpan<byte>)SHA256.HashData(source).AsSpan()).SequenceEqual((ReadOnlySpan<byte>)SHA256.HashData(source2));
		}
		catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException) ? true : false)
		{
			return false;
		}
	}
}
