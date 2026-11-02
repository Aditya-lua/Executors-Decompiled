using System;
using System.Diagnostics;
using System.IO;
using System.IO.Pipes;
using System.Security.Cryptography;
using System.Threading;
using System.Threading.Tasks;
using dotnet_codex_bootstrapper.Infrastructure;

namespace dotnet_codex_bootstrapper.Services;

public sealed class LaunchHandoff : IDisposable
{
	public const string Argument = "--bootstrapper-pipe";

	private readonly NamedPipeServerStream Pipe;

	private readonly CancellationTokenSource Stop = new CancellationTokenSource();

	private readonly Task Serving;

	public string Name { get; }

	public string Arguments => "--bootstrapper-pipe " + Name;

	public bool Delivered => Serving.IsCompletedSuccessfully;

	public LaunchHandoff()
	{
		Name = Convert.ToHexStringLower(RandomNumberGenerator.GetBytes(16));
		Pipe = new NamedPipeServerStream(Name, PipeDirection.Out, 1, PipeTransmissionMode.Byte, PipeOptions.Asynchronous);
		Serving = ServeAsync();
	}

	private async Task ServeAsync()
	{
		_ = 1;
		try
		{
			await Pipe.WaitForConnectionAsync(Stop.Token);
			Pipe.WriteByte(1);
			await Pipe.FlushAsync(Stop.Token);
			Pipe.WaitForPipeDrain();
		}
		catch (Exception ex) when ((ex is OperationCanceledException || ex is IOException || ex is ObjectDisposedException) ? true : false)
		{
			AppLog.Warning("The launch handshake ended without a client ({Reason})", ex.GetType().Name);
		}
	}

	public bool Wait(IStartedProcess Child, int Milliseconds)
	{
		Stopwatch stopwatch = Stopwatch.StartNew();
		while (stopwatch.ElapsedMilliseconds < Milliseconds)
		{
			if (Serving.IsCompleted)
			{
				return Delivered;
			}
			if (Child.HasExited)
			{
				return false;
			}
			Thread.Sleep(25);
		}
		return false;
	}

	public void Dispose()
	{
		Stop.Cancel();
		try
		{
			Pipe.Dispose();
		}
		catch (IOException)
		{
		}
		Stop.Dispose();
	}
}
