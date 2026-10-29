using System;
using System.Diagnostics;
using Serilog.Events;

namespace dotnet_codex_ui.Infrastructure.Logging;

internal sealed class LogOperation : IDisposable
{
	private readonly Stopwatch Timer = Stopwatch.StartNew();

	private Exception? FailureField;

	private string? ResultField;

	private bool Done;

	public string Name { get; }

	public string Id { get; }

	public LogOperation(string Name)
	{
		this.Name = Name;
		Id = Guid.NewGuid().ToString("N").Substring(0, 8);
	}

	public void Complete(string Result)
	{
		ResultField = Result;
	}

	public void Fail(Exception Failure)
	{
		FailureField = Failure;
	}

	public void Dispose()
	{
		if (!Done)
		{
			Done = true;
			if (FailureField != null)
			{
				AppLog.Write(LogEventLevel.Error, FailureField, "{Operation} failed after {ElapsedMs} ms {OperationId}", new object[3] { Name, Timer.ElapsedMilliseconds, Id });
			}
			else
			{
				AppLog.Write(LogEventLevel.Information, null, "{Operation} finished in {ElapsedMs} ms {Result} {OperationId}", new object[4]
				{
					Name,
					Timer.ElapsedMilliseconds,
					ResultField ?? "ok",
					Id
				});
			}
		}
	}
}
