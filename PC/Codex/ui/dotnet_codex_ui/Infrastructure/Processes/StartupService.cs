using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Threading;
using System.Threading.Tasks;
using dotnet_codex_ui.Configuration;
using dotnet_codex_ui.Infrastructure.Logging;

namespace dotnet_codex_ui.Infrastructure.Processes;

internal static class StartupService
{
	public const string DefaultTaskName = "Codex UI Startup";

	private const string DoneKey = "LegacyStartupTaskChecked";

	internal static string TaskName { get; set; } = "Codex UI Startup";

	public static async Task RemoveLegacyTaskAsync()
	{
		_ = 1;
		try
		{
			if (UiRegistry.GetBool("LegacyStartupTaskChecked", Default: false))
			{
				return;
			}
			(int, string) tuple = await RunAsync(new _003C_003Ez__ReadOnlyArray<string>(new string[3] { "/Query", "/TN", TaskName }));
			if (tuple.Item1 == 0)
			{
				(int, string) tuple2 = await RunAsync(new _003C_003Ez__ReadOnlyArray<string>(new string[4] { "/Delete", "/TN", TaskName, "/F" }));
				if (tuple2.Item1 != 0)
				{
					AppLog.Error(new InvalidOperationException("Couldn't remove the old startup task '" + TaskName + "': " + tuple2.Item2), null, "RemoveLegacyTaskAsync", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Infrastructure\\Processes\\StartupService.cs");
					return;
				}
			}
			else if (tuple.Item1 != 1)
			{
				AppLog.Error(new InvalidOperationException("Couldn't check for the old startup task '" + TaskName + "': " + tuple.Item2), null, "RemoveLegacyTaskAsync", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Infrastructure\\Processes\\StartupService.cs");
				return;
			}
			UiRegistry.SetBool("LegacyStartupTaskChecked", Value: true);
		}
		catch (Exception failure)
		{
			AppLog.Error(failure, null, "RemoveLegacyTaskAsync", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Infrastructure\\Processes\\StartupService.cs");
		}
	}

	private static async Task<(int ExitCode, string Message)> RunAsync(IEnumerable<string> Arguments)
	{
		ProcessStartInfo processStartInfo = new ProcessStartInfo("schtasks.exe")
		{
			UseShellExecute = false,
			CreateNoWindow = true,
			RedirectStandardOutput = true,
			RedirectStandardError = true
		};
		foreach (string Argument in Arguments)
		{
			processStartInfo.ArgumentList.Add(Argument);
		}
		using Process Process = Process.Start(processStartInfo);
		using CancellationTokenSource Timeout = new CancellationTokenSource(TimeSpan.FromSeconds(20L));
		_ = 2;
		try
		{
			string Output = await Process.StandardOutput.ReadToEndAsync(Timeout.Token);
			string Error = await Process.StandardError.ReadToEndAsync(Timeout.Token);
			await Process.WaitForExitAsync(Timeout.Token);
			string text = ((Error.Length > 0) ? Error : Output).Trim();
			return (ExitCode: Process.ExitCode, Message: (text.Length > 0) ? text : $"schtasks exited with code {Process.ExitCode}.");
		}
		catch (OperationCanceledException)
		{
			try
			{
				Process.Kill(entireProcessTree: true);
			}
			catch (InvalidOperationException)
			{
			}
			return (ExitCode: -1, Message: "Windows Task Scheduler did not respond.");
		}
	}
}
