using System;
using System.ComponentModel;
using System.IO;
using dotnet_codex_bootstrapper.Core.Manifest;
using dotnet_codex_bootstrapper.Infrastructure;

namespace dotnet_codex_bootstrapper.Services;

public sealed class AppLauncher(IProcessLauncher Launcher, int EarlyExitMilliseconds = 3000)
{
	public int Launch(string AppDirectory, string ExecutableRelative)
	{
		string text;
		try
		{
			text = SafePath.Resolve(AppDirectory, ExecutableRelative);
		}
		catch (ManifestException inner)
		{
			throw new UpdateException("E-LAUNCH", "The Codex executable path is invalid.", inner);
		}
		if (!File.Exists(text))
		{
			throw new UpdateException("E-LAUNCH", "The Codex executable is missing from the install folder.");
		}
		IStartedProcess startedProcess;
		try
		{
			startedProcess = Launcher.Start(text, string.Empty, AppDirectory, RequireElevation: true);
		}
		catch (Win32Exception ex) when (ex.NativeErrorCode == 1223)
		{
			throw new UpdateException("E-LAUNCH", "Administrator approval was declined, so Codex was not started.", ex);
		}
		catch (Exception ex2) when ((ex2 is Win32Exception || ex2 is InvalidOperationException || ex2 is IOException) ? true : false)
		{
			throw new UpdateException("E-LAUNCH", "Codex could not be started: " + ex2.Message, ex2);
		}
		using (startedProcess)
		{
			if (startedProcess.WaitForExit(EarlyExitMilliseconds))
			{
				int exitCode = startedProcess.ExitCode;
				AppLog.Error("Codex exited immediately with code {Code}", exitCode);
				throw new UpdateException("E-LAUNCH", $"Codex closed right after starting (exit code {exitCode}). See the Codex log for details.");
			}
			AppLog.Information("Codex started (process {Id})", startedProcess.Id);
			return startedProcess.Id;
		}
	}
}
