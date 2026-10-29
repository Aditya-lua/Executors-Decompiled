using System;
using System.ComponentModel;
using System.Diagnostics;
using System.IO;
using System.Linq;
using System.Threading;
using dotnet_codex_bootstrapper.Infrastructure;

namespace dotnet_codex_bootstrapper.Services;

public sealed class SelfUpdater(IProcessLauncher Launcher, TimeSpan? HandoffTimeout = null)
{
	public static readonly string[] AllowedSwitches = new string[4] { "--after-update", "--op", "--parent", "--expect" };

	private readonly TimeSpan Timeout0 = HandoffTimeout ?? TimeSpan.FromSeconds(15L);

	public static string HandoffName(string Operation)
	{
		return "Local\\CodexBootstrapperHandoff-" + Operation;
	}

	public static bool IsValidOperation(string? Operation)
	{
		if (Operation != null)
		{
			int length = Operation.Length;
			if (length >= 6 && length <= 32)
			{
				return Operation.All(char.IsAsciiLetterOrDigit);
			}
		}
		return false;
	}

	public static void ValidateStagedExecutable(string StagedPath, string ExpectedVersion)
	{
		using (FileStream fileStream = File.OpenRead(StagedPath))
		{
			int num = fileStream.ReadByte();
			int num2 = fileStream.ReadByte();
			if (num != 77 || num2 != 90)
			{
				throw new UpdateException("E-SELF", "The downloaded bootstrapper is not a Windows program.");
			}
		}
		string productVersion = FileVersionInfo.GetVersionInfo(StagedPath).ProductVersion;
		int num3 = productVersion?.IndexOf('+') ?? (-1);
		string text;
		if (productVersion == null)
		{
			text = string.Empty;
		}
		else
		{
			text = ((num3 >= 0) ? productVersion.Substring(0, num3) : productVersion);
		}
		if (!string.Equals(text, ExpectedVersion, StringComparison.Ordinal))
		{
			throw new UpdateException("E-SELF", $"The downloaded bootstrapper reports version '{text}', not '{ExpectedVersion}'.");
		}
	}

	public SelfUpdateResult ReplaceAndRestart(string CurrentExecutable, string StagedExecutable, string TargetVersion, string Operation, string ExtraArguments = "")
	{
		if (!IsValidOperation(Operation))
		{
			return new SelfUpdateResult(Success: false, "The update operation id is invalid.");
		}
		string directoryName = Path.GetDirectoryName(CurrentExecutable);
		string text = CurrentExecutable + "." + Operation + ".old";
		try
		{
			File.Move(CurrentExecutable, text);
		}
		catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException) ? true : false)
		{
			AppLog.Error(ex, "The running bootstrapper could not be renamed");
			return new SelfUpdateResult(Success: false, "The bootstrapper could not be prepared for replacement.");
		}
		try
		{
			File.Move(StagedExecutable, CurrentExecutable);
		}
		catch (Exception ex2) when ((ex2 is IOException || ex2 is UnauthorizedAccessException) ? true : false)
		{
			AppLog.Error(ex2, "The new bootstrapper could not be put in place");
			Restore(CurrentExecutable, text, Operation);
			return new SelfUpdateResult(Success: false, "The new bootstrapper could not be put in place.");
		}
		IStartedProcess startedProcess = null;
		try
		{
			using EventWaitHandle eventWaitHandle = new EventWaitHandle(initialState: false, EventResetMode.ManualReset, HandoffName(Operation));
			startedProcess = Launcher.Start(CurrentExecutable, $"--after-update --op {Operation} --parent {Environment.ProcessId} --expect {TargetVersion}{(string.IsNullOrWhiteSpace(ExtraArguments) ? string.Empty : (" " + ExtraArguments.Trim()))}", directoryName, RequireElevation: false);
			if (!eventWaitHandle.WaitOne(Timeout0))
			{
				AppLog.Error("The new bootstrapper did not confirm the handoff in time");
				startedProcess.Kill();
				startedProcess.WaitForExit(5000);
				Restore(CurrentExecutable, text, Operation);
				return new SelfUpdateResult(Success: false, "The new bootstrapper did not start correctly. The current version was kept.");
			}
			return new SelfUpdateResult(Success: true, "Restarting with the new bootstrapper.");
		}
		catch (Exception ex3) when ((ex3 is Win32Exception || ex3 is InvalidOperationException || ex3 is IOException) ? true : false)
		{
			AppLog.Error(ex3, "The new bootstrapper could not be launched");
			startedProcess?.Kill();
			Restore(CurrentExecutable, text, Operation);
			return new SelfUpdateResult(Success: false, "The new bootstrapper could not be launched. The current version was kept.");
		}
		finally
		{
			startedProcess?.Dispose();
		}
	}

	public static bool CompleteHandoff(string CurrentExecutable, string Operation, int ParentId, string? ExpectedVersion, string RunningVersion)
	{
		if (!IsValidOperation(Operation))
		{
			return false;
		}
		if (ExpectedVersion != null && !string.Equals(ExpectedVersion, RunningVersion, StringComparison.Ordinal))
		{
			AppLog.Error("Handoff refused: expected version {Expected} but this is {Running}", ExpectedVersion, RunningVersion);
			return false;
		}
		using (EventWaitHandle eventWaitHandle = new EventWaitHandle(initialState: false, EventResetMode.ManualReset, HandoffName(Operation)))
		{
			eventWaitHandle.Set();
		}
		try
		{
			using Process process = Process.GetProcessById(ParentId);
			process.WaitForExit(20000);
		}
		catch (ArgumentException)
		{
		}
		CleanupOld(CurrentExecutable);
		return true;
	}

	public static void CleanupOld(string CurrentExecutable)
	{
		string directoryName = Path.GetDirectoryName(CurrentExecutable);
		if (directoryName == null || !Directory.Exists(directoryName))
		{
			return;
		}
		foreach (string item in Directory.EnumerateFiles(directoryName, Path.GetFileName(CurrentExecutable) + ".*.old"))
		{
			try
			{
				File.Delete(item);
			}
			catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException) ? true : false)
			{
				AppLog.Warning(ex, "A previous bootstrapper copy could not be removed yet");
			}
		}
	}

	private static void Restore(string Current, string Old, string Operation)
	{
		try
		{
			if (File.Exists(Current))
			{
				try
				{
					File.Delete(Current);
				}
				catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException) ? true : false)
				{
					File.Move(Current, Current + "." + Operation + ".failed", overwrite: true);
				}
			}
			File.Move(Old, Current, overwrite: true);
		}
		catch (Exception ex2) when ((ex2 is IOException || ex2 is UnauthorizedAccessException) ? true : false)
		{
			AppLog.Error(ex2, "Restoring the previous bootstrapper failed");
		}
	}
}
