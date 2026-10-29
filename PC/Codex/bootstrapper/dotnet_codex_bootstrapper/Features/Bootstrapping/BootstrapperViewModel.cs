using System;
using System.ComponentModel;
using System.Runtime.CompilerServices;
using System.Threading;
using System.Threading.Tasks;
using dotnet_codex_bootstrapper.Services;

namespace dotnet_codex_bootstrapper.Features.Bootstrapping;

public sealed class BootstrapperViewModel(Func<IBootstrapperFlow> CreateFlow) : INotifyPropertyChanged, IDisposable
{
	private CancellationTokenSource? Run;

	private BootstrapperSnapshot SnapshotField = BootstrapperSnapshot.Initial;

	private bool IsRunningField;

	private bool Disposed;

	public BootstrapperSnapshot Snapshot
	{
		get
		{
			return SnapshotField;
		}
		private set
		{
			SnapshotField = value;
			Raise("Snapshot");
		}
	}

	public bool IsRunning
	{
		get
		{
			return IsRunningField;
		}
		private set
		{
			if (IsRunningField != value)
			{
				IsRunningField = value;
				Raise("IsRunning");
			}
		}
	}

	public event PropertyChangedEventHandler? PropertyChanged;

	public void Apply(BootstrapperSnapshot Next)
	{
		if (!Disposed)
		{
			Snapshot = Next;
		}
	}

	public bool Start()
	{
		if (Disposed || IsRunning)
		{
			return false;
		}
		CancellationTokenSource source = (Run = new CancellationTokenSource());
		IsRunning = true;
		Snapshot = BootstrapperSnapshot.Initial;
		RunAsync(source);
		return true;
	}

	public void Cancel()
	{
		Run?.Cancel();
	}

	public bool Restart()
	{
		Run?.Cancel();
		Run = null;
		IsRunning = false;
		return Start();
	}

	public void Dispose()
	{
		if (!Disposed)
		{
			Disposed = true;
			Run?.Cancel();
		}
	}

	private async Task RunAsync(CancellationTokenSource Source)
	{
		CancellationToken Token = Source.Token;
		try
		{
			Progress<BootstrapperSnapshot> progress = new Progress<BootstrapperSnapshot>((BootstrapperSnapshot Next) =>
			{
				if (!Token.IsCancellationRequested)
				{
					Apply(Next);
				}
			});
			await CreateFlow().RunAsync(progress, Token);
		}
		catch (OperationCanceledException)
		{
			DemoLog.Write("Run cancelled");
		}
		catch (Exception ex2)
		{
			DemoLog.Write("Run failed: " + ex2.Message);
			if (!Token.IsCancellationRequested)
			{
				Apply(BootstrapperSnapshot.Initial with
				{
					Title = "Something went wrong",
					Description = "The simulation stopped unexpectedly.",
					Outcome = BootstrapperOutcome.Failed,
					Operation = "Stopped",
					Footer = "Simulated run ended"
				});
			}
		}
		finally
		{
			if (Run == Source)
			{
				Run = null;
				IsRunning = false;
			}
			Source.Dispose();
		}
	}

	private void Raise([CallerMemberName] string? Name = null)
	{
		PropertyChanged?.Invoke(this, new PropertyChangedEventArgs(Name));
	}
}
