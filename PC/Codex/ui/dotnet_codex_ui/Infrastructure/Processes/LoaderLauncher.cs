using System;
using System.ComponentModel;
using System.Diagnostics;
using System.IO;
using System.Security.Cryptography;
using System.Threading;
using System.Threading.Tasks;
using dotnet_codex_ui.Core.Versioning;
using dotnet_codex_ui.Features.Clients;
using dotnet_codex_ui.Infrastructure.Logging;

namespace dotnet_codex_ui.Infrastructure.Processes;

internal static class LoaderLauncher
{
	internal static Func<LoaderResult>? Resolve;

	public static async Task<bool> InjectAsync(ClientEntry Client, CancellationToken Cancel)
	{
		using LogOperation Operation = AppLog.Begin("Inject");
		LoaderResult loaderResult = (Resolve ?? ((Func<LoaderResult>)(() => VersionService.Loader)))();
		string Location = Validate(loaderResult, Client);
		await VerifyHashAsync(Location, loaderResult.Md5, Cancel);
		int num = await RunAsync(Location, Client.ProcessId, Cancel);
		if (num != 0)
		{
			AppLog.Warning("The loader exited with code {Code} for process {Pid}", num, Client.ProcessId);
			throw new InvalidOperationException($"The loader failed (exit code {num}).");
		}
		while (!Client.IsConnected)
		{
			await Task.Delay(100, Cancel);
		}
		Operation.Complete($"Process {Client.ProcessId} connected");
		return true;
	}

	private static string Validate(LoaderResult Loader, ClientEntry Client)
	{
		switch (Loader.Status)
		{
		case LoaderStatus.Outdated:
			throw new InvalidOperationException("Codex is outdated: no loader is published for the current Roblox version yet.");
		case LoaderStatus.Missing:
			throw new InvalidOperationException("The loader for the current Roblox version is not installed. Restart Codex through the bootstrapper to download it.");
		default:
			throw new InvalidOperationException("The loader could not be verified yet. Check your connection and try again.");
		case LoaderStatus.Ready:
			if (Client.ProcessId <= 0)
			{
				throw new InvalidOperationException("This client has no process to inject into.");
			}
			try
			{
				using Process process = Process.GetProcessById(Client.ProcessId);
				if (process.HasExited)
				{
					throw new InvalidOperationException("The Roblox process has already exited.");
				}
			}
			catch (ArgumentException)
			{
				throw new InvalidOperationException("The Roblox process is no longer running.");
			}
			return Loader.Path;
		}
	}

	private static async Task VerifyHashAsync(string Location, string Expected, CancellationToken Cancel)
	{
		_ = 1;
		try
		{
			await using FileStream Stream = new FileStream(Location, FileMode.Open, FileAccess.Read, FileShare.Read, 81920, useAsync: true);
			string text = Convert.ToHexStringLower(await MD5.HashDataAsync(Stream, Cancel));
			if (!string.Equals(text, Expected, StringComparison.OrdinalIgnoreCase))
			{
				AppLog.Warning("The loader file hash {Actual} does not match the published {Expected}", text, Expected);
				throw new InvalidOperationException("The loader file is damaged or was changed. Restart Codex through the bootstrapper to repair it.");
			}
		}
		catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException) ? true : false)
		{
			AppLog.Warning(ex, "The loader file could not be read");
			throw new InvalidOperationException("The loader file could not be read.", ex);
		}
	}

	private static async Task<int> RunAsync(string Location, int ProcessId, CancellationToken Cancel)
	{
		ProcessStartInfo processStartInfo = new ProcessStartInfo
		{
			FileName = Location,
			WorkingDirectory = Path.GetDirectoryName(Location),
			UseShellExecute = false,
			CreateNoWindow = true,
			RedirectStandardOutput = true,
			RedirectStandardError = true
		};
		processStartInfo.ArgumentList.Add(ProcessId.ToString());
		Process Child;
		try
		{
			Child = Process.Start(processStartInfo);
		}
		catch (Exception ex) when ((ex is Win32Exception || ex is InvalidOperationException || ex is IOException) ? true : false)
		{
			AppLog.Error(ex, "The loader could not be started", "RunAsync", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Infrastructure\\Processes\\LoaderLauncher.cs");
			throw new InvalidOperationException("The loader could not be started: " + ex.Message, ex);
		}
		if (Child == null)
		{
			throw new InvalidOperationException("The loader could not be started.");
		}
		using (Child)
		{
			ChildProcess.Attach(Child);
			AppLog.Information("Loader started for process {Pid}", ProcessId);
			Task<string> Output = Child.StandardOutput.ReadToEndAsync(Cancel);
			Task<string> Errors = Child.StandardError.ReadToEndAsync(Cancel);
			try
			{
				await Child.WaitForExitAsync(Cancel);
			}
			catch (OperationCanceledException)
			{
				Kill(Child);
				AppLog.Warning("The loader for process {Pid} was cancelled", ProcessId);
				throw;
			}
			string Text = (await Errors).Trim();
			await Output;
			if (Child.ExitCode != 0 && Text.Length > 0)
			{
				AppLog.Warning("Loader error output: {Text}", (Text.Length > 500) ? Text.Substring(0, 500) : Text);
			}
			AppLog.Information("Loader for process {Pid} exited with code {Code}", ProcessId, Child.ExitCode);
			return Child.ExitCode;
		}
	}

	private static void Kill(Process Child)
	{
		try
		{
			if (!Child.HasExited)
			{
				Child.Kill(entireProcessTree: true);
			}
		}
		catch (Exception ex) when ((ex is InvalidOperationException || ex is Win32Exception) ? true : false)
		{
			AppLog.Warning(ex, "The loader could not be stopped");
		}
	}
}
