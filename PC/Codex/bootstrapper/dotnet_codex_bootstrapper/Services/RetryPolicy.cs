using System;
using System.IO;
using System.Net.Http;
using System.Threading;
using System.Threading.Tasks;
using dotnet_codex_bootstrapper.Infrastructure;

namespace dotnet_codex_bootstrapper.Services;

public sealed class RetryPolicy(int MaxAttempts = 4, TimeSpan? BaseDelay = null, Func<TimeSpan, CancellationToken, Task>? Delay = null)
{
	private readonly TimeSpan Base = BaseDelay ?? TimeSpan.FromMilliseconds(600L);

	private readonly Func<TimeSpan, CancellationToken, Task> Wait = Delay ?? ((Func<TimeSpan, CancellationToken, Task>)((TimeSpan Span, CancellationToken Cancel) => Task.Delay(Span, Cancel)));

	public int MaxAttempts { get; } = Math.Max(1, MaxAttempts);

	public static bool IsTransient(Exception Error)
	{
		if (!(Error is CdnException { IsTransient: var isTransient }))
		{
			if (!(Error is HashMismatchException))
			{
				if (!(Error is HttpRequestException))
				{
					if (!(Error is IOException))
					{
						if (!(Error is TimeoutException))
						{
							if (Error is OperationCanceledException)
							{
								return true;
							}
							return false;
						}
						return true;
					}
					return true;
				}
				return true;
			}
			return true;
		}
		return isTransient;
	}

	public async Task<T> RunAsync<T>(Func<int, Task<T>> Action, CancellationToken Cancel, string Operation)
	{
		int Attempt = 1;
		while (true)
		{
			Cancel.ThrowIfCancellationRequested();
			try
			{
				return await Action(Attempt);
			}
			catch (Exception error) when (!Cancel.IsCancellationRequested && IsTransient(error) && Attempt < MaxAttempts)
			{
				TimeSpan arg = TimeSpan.FromMilliseconds(Base.TotalMilliseconds * Math.Pow(2.0, Attempt - 1) + (double)Random.Shared.Next(0, 250));
				AppLog.Warning(error, "{Operation} failed on attempt {Attempt} of {Max}; retrying in {Pause} ms", Operation, Attempt, MaxAttempts, (int)arg.TotalMilliseconds);
				await Wait(arg, Cancel);
			}
			Attempt++;
		}
	}
}
