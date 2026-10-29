using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.IO;
using System.Linq;

namespace dotnet_codex_ui.Infrastructure.Processes;

internal static class RobloxProcess
{
	public static readonly IReadOnlyList<string> Executables = new _003C_003Ez__ReadOnlySingleElementList<string>("RobloxPlayerBeta.exe");

	public static readonly IReadOnlyList<string> KillTargets = new _003C_003Ez__ReadOnlyArray<string>(new string[4] { "RobloxPlayerBeta.exe", "RobloxPlayerLauncher.exe", "RobloxPlayerInstaller.exe", "RobloxCrashHandler.exe" });

	public static IEnumerable<string> ProcessNames => KillTargets.Select(Path.GetFileNameWithoutExtension);

	public static KillResult KillAll(Action<Exception>? OnError = null)
	{
		Dictionary<string, int> dictionary = new Dictionary<string, int>();
		List<string> list = new List<string>();
		foreach (string processName in ProcessNames)
		{
			Process[] processesByName = Process.GetProcessesByName(processName);
			foreach (Process process in processesByName)
			{
				using (process)
				{
					try
					{
						process.Kill(entireProcessTree: true);
						dictionary[processName] = dictionary.GetValueOrDefault(processName) + 1;
					}
					catch (Exception obj)
					{
						OnError?.Invoke(obj);
						list.Add($"{processName} (pid {process.Id})");
					}
				}
			}
		}
		return new KillResult(dictionary, list);
	}
}
