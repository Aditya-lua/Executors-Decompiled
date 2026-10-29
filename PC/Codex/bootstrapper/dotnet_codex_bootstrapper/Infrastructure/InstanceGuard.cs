using System;
using System.Threading;

namespace dotnet_codex_bootstrapper.Infrastructure;

public sealed class InstanceGuard : IDisposable
{
	public const string DefaultName = "Global\\CodexBootstrapperMutex";

	private Mutex? Handle;

	private InstanceGuard(Mutex Handle)
	{
		this.Handle = Handle;
	}

	public static bool TryAcquire(string Name, TimeSpan Wait, out InstanceGuard? Guard)
	{
		Guard = null;
		Mutex mutex = new Mutex(initiallyOwned: false, Name);
		try
		{
			if (!mutex.WaitOne(Wait))
			{
				mutex.Dispose();
				return false;
			}
		}
		catch (AbandonedMutexException)
		{
		}
		Guard = new InstanceGuard(mutex);
		return true;
	}

	public void Dispose()
	{
		Mutex mutex = Interlocked.Exchange(ref Handle, null);
		if (mutex != null)
		{
			try
			{
				mutex.ReleaseMutex();
			}
			catch (ApplicationException)
			{
			}
			mutex.Dispose();
		}
	}
}
