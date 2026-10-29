using System;
using System.Diagnostics;
using System.IO;

namespace dotnet_codex_bootstrapper.Services;

public sealed class AppProcessProbe : IAppProcessProbe
{
	public bool IsRunning(string ExecutablePath)
	{
		Process[] processesByName = Process.GetProcessesByName(Path.GetFileNameWithoutExtension(ExecutablePath));
		foreach (Process process in processesByName)
		{
			using (process)
			{
				try
				{
					if (string.Equals(process.MainModule?.FileName, ExecutablePath, StringComparison.OrdinalIgnoreCase))
					{
						return true;
					}
				}
				catch (Exception)
				{
					return true;
				}
			}
		}
		return false;
	}
}
