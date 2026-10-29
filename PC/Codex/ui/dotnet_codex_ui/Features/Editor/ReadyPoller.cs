using System;
using System.Threading;
using System.Threading.Tasks;

namespace dotnet_codex_ui.Features.Editor;

internal static class ReadyPoller
{
	internal static readonly TimeSpan DefaultTimeout = TimeSpan.FromSeconds(30L);

	internal static readonly TimeSpan DefaultInterval = TimeSpan.FromMilliseconds(250L);

	public static async Task RunAsync(Func<Task<bool?>> Probe, TimeSpan Timeout, TimeSpan Interval, int MaxConsecutiveFailures, CancellationToken Cancel)
	{
		using CancellationTokenSource Deadline = CancellationTokenSource.CreateLinkedTokenSource(Cancel);
		Deadline.CancelAfter(Timeout);
		int Failures = 0;
		try
		{
			while (true)
			{
				Deadline.Token.ThrowIfCancellationRequested();
				bool? flag;
				try
				{
					flag = await Probe().WaitAsync(Deadline.Token);
				}
				catch (Exception ex) when (!(ex is OperationCanceledException))
				{
					throw new EditorReadyException(ReadyFailure.InitFailed, "The editor readiness check threw: " + ex.Message, ex);
				}
				if (flag == true)
				{
					return;
				}
				Failures = ((!flag.HasValue) ? (Failures + 1) : 0);
				if (Failures >= MaxConsecutiveFailures)
				{
					break;
				}
				await Task.Delay(Interval, Deadline.Token);
			}
			throw new EditorReadyException(ReadyFailure.InitFailed, $"The editor page failed its readiness check {Failures} times in a row.");
		}
		catch (OperationCanceledException)
		{
			throw Cancel.IsCancellationRequested ? new EditorReadyException(ReadyFailure.Cancelled, "Waiting for the editor was cancelled.") : new EditorReadyException(ReadyFailure.Timeout, $"The editor was not ready after {Timeout.TotalSeconds:0} seconds.");
		}
	}
}
