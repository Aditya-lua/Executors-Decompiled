using System;
using System.Diagnostics;
using System.Runtime.InteropServices;
using System.Threading;
using dotnet_codex_ui.Infrastructure.Logging;

namespace dotnet_codex_ui.Core.Lifecycle;

internal sealed class SingleInstance : IDisposable
{
	internal const string DefaultName = "Global\\CodexMutex";

	private const int SwRestore = 9;

	private readonly string NameField;

	private Mutex? MutexField;

	private bool Owned;

	public SingleInstance(string Name = "Global\\CodexMutex")
	{
		NameField = Name;
	}

	public InstanceResult TryAcquire()
	{
		try
		{
			MutexField = new Mutex(initiallyOwned: true, NameField, out var createdNew);
			if (createdNew)
			{
				Owned = true;
				AppLog.Information("Single instance: mutex {Name} acquired", NameField);
				return InstanceResult.Acquired;
			}
			try
			{
				if (MutexField.WaitOne(0))
				{
					Owned = true;
					AppLog.Information("Single instance: mutex {Name} acquired", NameField);
					return InstanceResult.Acquired;
				}
			}
			catch (AbandonedMutexException)
			{
				Owned = true;
				AppLog.Warning("Single instance: mutex {Name} was abandoned by a previous instance and is now owned", NameField);
				return InstanceResult.Recovered;
			}
			MutexField.Dispose();
			MutexField = null;
			AppLog.Warning("Single instance: another Codex already owns mutex {Name}", NameField);
			return InstanceResult.AlreadyRunning;
		}
		catch (Exception failure)
		{
			AppLog.Error(failure, null, "TryAcquire", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Core\\Lifecycle\\SingleInstance.cs");
			return InstanceResult.Failed;
		}
	}

	public static bool FocusExisting()
	{
		try
		{
			Process[] processesByName = Process.GetProcessesByName(Process.GetCurrentProcess().ProcessName);
			foreach (Process process in processesByName)
			{
				using (process)
				{
					if (process.Id == Environment.ProcessId || process.MainWindowHandle == IntPtr.Zero)
					{
						continue;
					}
					ShowWindow(process.MainWindowHandle, 9);
					SetForegroundWindow(process.MainWindowHandle);
					AppLog.Information("Single instance: focused the running instance (pid {Pid})", process.Id);
					return true;
				}
			}
		}
		catch (Exception failure)
		{
			AppLog.Error(failure, null, "FocusExisting", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Core\\Lifecycle\\SingleInstance.cs");
		}
		return false;
	}

	public void Dispose()
	{
		Mutex mutexField = MutexField;
		if (mutexField == null)
		{
			return;
		}
		try
		{
			if (Owned)
			{
				mutexField.ReleaseMutex();
			}
			AppLog.Information("Single instance: mutex {Name} released", NameField);
		}
		catch (ApplicationException)
		{
			AppLog.Warning("Single instance: mutex {Name} could not be released from this thread", NameField);
		}
		finally
		{
			mutexField.Dispose();
			MutexField = null;
			Owned = false;
		}
	}

	[DllImport("user32.dll")]
	private static extern bool ShowWindow(nint Window, int Command);

	[DllImport("user32.dll")]
	private static extern bool SetForegroundWindow(nint Window);
}
