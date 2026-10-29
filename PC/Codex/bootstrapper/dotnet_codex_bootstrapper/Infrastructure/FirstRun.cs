using System;
using System.ComponentModel;
using System.Diagnostics;
using System.IO;
using dotnet_codex_bootstrapper.Core.Configuration;
using dotnet_codex_bootstrapper.Core.Versioning;

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
		try
		{
			Directory.CreateDirectory(Paths.Root);
			bool flag = File.Exists(fullPath);
			if (!flag || IsOlder(fullPath, CurrentExecutable))
			{
				string text = fullPath + "." + Guid.NewGuid().ToString("N").Substring(0, 8) + ".tmp";
				File.Copy(CurrentExecutable, text, overwrite: false);
				File.Move(text, fullPath, overwrite: true);
				AppLog.Information(flag ? "The outdated bootstrapper at {Path} was replaced" : "The bootstrapper was copied to {Path}", fullPath);
			}
			Launcher.Start(fullPath, Arguments, Paths.Root, RequireElevation: false).Dispose();
			return FirstRunOutcome.HandedOver;
		}
		catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException || ex is Win32Exception || ex is InvalidOperationException) ? true : false)
		{
			AppLog.Error(ex, "The bootstrapper could not install itself to {Path}; running in place", fullPath);
			return FirstRunOutcome.CouldNotInstall;
		}
	}

	private static bool IsOlder(string InstalledPath, string CurrentPath)
	{
		try
		{
			ReleaseVersion releaseVersion = Read(InstalledPath);
			int result;
			if (releaseVersion != null)
			{
				ReleaseVersion releaseVersion2 = Read(CurrentPath);
				if (releaseVersion2 != null)
				{
					result = ((releaseVersion.CompareTo(releaseVersion2) < 0) ? 1 : 0);
					goto IL_0021;
				}
			}
			result = 0;
			goto IL_0021;
			IL_0021:
			return (byte)result != 0;
		}
		catch (IOException)
		{
			return false;
		}
	}

	private static ReleaseVersion? Read(string Path)
	{
		string productVersion = FileVersionInfo.GetVersionInfo(Path).ProductVersion;
		int num = productVersion?.IndexOf('+') ?? (-1);
		if (!ReleaseVersion.TryParse((num >= 0) ? productVersion.Substring(0, num) : productVersion, out ReleaseVersion Version))
		{
			return null;
		}
		return Version;
	}
}
