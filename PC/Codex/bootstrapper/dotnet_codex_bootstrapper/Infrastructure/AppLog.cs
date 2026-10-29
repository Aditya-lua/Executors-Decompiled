using System;
using System.Collections.Generic;
using System.IO;
using Serilog;
using Serilog.Configuration;
using Serilog.Core;
using Serilog.Events;

namespace dotnet_codex_bootstrapper.Infrastructure;

public static class AppLog
{
	private static ILogger Logger = Serilog.Core.Logger.None;

	public static string? Directory { get; private set; }

	public static string OperationId { get; private set; } = NewOperationId();

	public static string NewOperationId()
	{
		return Guid.NewGuid().ToString("N").Substring(0, 10);
	}

	public static void NewOperation()
	{
		OperationId = NewOperationId();
	}

	public static string? Initialize(IEnumerable<string> Candidates, string Version, string Channel)
	{
		foreach (string Candidate in Candidates)
		{
			try
			{
				System.IO.Directory.CreateDirectory(Candidate);
				string path = Path.Combine(Candidate, $".write-test-{Guid.NewGuid():N}");
				File.WriteAllText(path, "x");
				File.Delete(path);
				Logger logger = new LoggerConfiguration().MinimumLevel.Debug().Enrich.WithProperty("BootstrapperVersion", Version).Enrich.WithProperty("Channel", Channel).WriteTo.Async((LoggerSinkConfiguration Sink) =>
				{
					Sink.File(Path.Combine(Candidate, "bootstrapper-.log"), LogEventLevel.Verbose, "{Timestamp:yyyy-MM-dd HH:mm:ss.fff} [{Level:u3}] {BootstrapperVersion} {Channel} {Message:lj}{NewLine}{Exception}", null, retainedFileCountLimit: 14, fileSizeLimitBytes: 10485760L, levelSwitch: null, buffered: false, shared: true, flushToDiskInterval: null, rollingInterval: RollingInterval.Day, rollOnFileSizeLimit: true);
				}).CreateLogger();
				Close();
				Logger = logger;
				Directory = Candidate;
				return Candidate;
			}
			catch (Exception)
			{
			}
		}
		Logger = Serilog.Core.Logger.None;
		Directory = null;
		return null;
	}

	public static void Close()
	{
		if (Logger is IDisposable disposable)
		{
			try
			{
				disposable.Dispose();
			}
			catch (Exception)
			{
			}
		}
		Logger = Serilog.Core.Logger.None;
	}

	public static void Debug(string Template, params object?[] Values)
	{
		Write(LogEventLevel.Debug, null, Template, Values);
	}

	public static void Information(string Template, params object?[] Values)
	{
		Write(LogEventLevel.Information, null, Template, Values);
	}

	public static void Warning(string Template, params object?[] Values)
	{
		Write(LogEventLevel.Warning, null, Template, Values);
	}

	public static void Warning(Exception Error, string Template, params object?[] Values)
	{
		Write(LogEventLevel.Warning, Error, Template, Values);
	}

	public static void Error(string Template, params object?[] Values)
	{
		Write(LogEventLevel.Error, null, Template, Values);
	}

	public static void Error(Exception Error, string Template, params object?[] Values)
	{
		Write(LogEventLevel.Error, Error, Template, Values);
	}

	private static void Write(LogEventLevel Level, Exception? Error, string Template, object?[] Values)
	{
		try
		{
			ILogger logger = Logger;
			string messageTemplate = "[{OperationId}] " + Template;
			object operationId = OperationId;
			int num = 0;
			object[] array = new object[1 + Values.Length];
			array[num] = operationId;
			num++;
			ReadOnlySpan<object> readOnlySpan = new ReadOnlySpan<object>(Values);
			readOnlySpan.CopyTo(new Span<object>(array).Slice(num, readOnlySpan.Length));
			num += readOnlySpan.Length;
			logger.Write(Level, Error, messageTemplate, array);
		}
		catch (Exception)
		{
		}
	}
}
