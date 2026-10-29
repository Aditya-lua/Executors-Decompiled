using System;
using System.IO;
using System.Linq;
using System.Security;
using Microsoft.Win32;
using dotnet_codex_bootstrapper.Infrastructure;

namespace dotnet_codex_bootstrapper.Services;

public sealed class RuntimeDetector : IRuntimeDetector
{
	public bool IsInstalled(int MinimumMajor)
	{
		try
		{
			using RegistryKey registryKey = RegistryKey.OpenBaseKey(RegistryHive.LocalMachine, RegistryView.Registry64);
			using RegistryKey registryKey2 = registryKey.OpenSubKey("SOFTWARE\\dotnet\\Setup\\InstalledVersions\\x64\\sharedfx\\Microsoft.WindowsDesktop.App");
			if (registryKey2 != null && registryKey2.GetValueNames().Any((string Name) => MajorOf(Name) >= MinimumMajor))
			{
				return true;
			}
		}
		catch (Exception ex) when ((ex is SecurityException || ex is UnauthorizedAccessException || ex is IOException) ? true : false)
		{
			AppLog.Warning(ex, "The registry could not be checked for the .NET Desktop Runtime");
		}
		string path = Path.Combine(Environment.GetFolderPath(Environment.SpecialFolder.ProgramFiles), "dotnet", "shared", "Microsoft.WindowsDesktop.App");
		if (Directory.Exists(path))
		{
			return Directory.EnumerateDirectories(path).Any((string Path0) => MajorOf(Path.GetFileName(Path0)) >= MinimumMajor);
		}
		return false;
	}

	public static int MajorOf(string Version)
	{
		if (!int.TryParse(Version.Split('.')[0], out var result))
		{
			return -1;
		}
		return result;
	}
}
