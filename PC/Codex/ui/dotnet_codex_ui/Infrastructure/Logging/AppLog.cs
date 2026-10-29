using System;
using System.IO;
using System.Runtime.CompilerServices;
using Serilog;
using Serilog.Configuration;
using Serilog.Core;
using Serilog.Events;

namespace dotnet_codex_ui.Infrastructure.Logging;

internal static class AppLog
{
	internal const int RetainedFiles = 14;

	internal const long MaxFileBytes = 10485760L;

	private const string Template = "{Timestamp:yyyy-MM-dd HH:mm:ss.fff} [{Level:u3}] {Message:lj} {Properties:j}{NewLine}{Exception}";

	private static volatile ILogger LoggerField = Logger.None;

	public static string? Directory { get; private set; }

	public static bool IsActive => Directory != null;

	public static bool Initialize(string? LogDirectory = null, LogEventLevel Minimum = LogEventLevel.Debug)
	{
		Shutdown();
		try
		{
			string Folder = LogDirectory ?? Path.Combine(AppContext.BaseDirectory, "logs");
			System.IO.Directory.CreateDirectory(Folder);
			LoggerField = new LoggerConfiguration().MinimumLevel.Is(Minimum).Enrich.WithProperty("Process", Environment.ProcessId).WriteTo.Async((LoggerSinkConfiguration Sink) =>
			{
				Sink.File(Path.Combine(Folder, "codex-.log"), LogEventLevel.Verbose, "{Timestamp:yyyy-MM-dd HH:mm:ss.fff} [{Level:u3}] {Message:lj} {Properties:j}{NewLine}{Exception}", null, retainedFileCountLimit: 14, fileSizeLimitBytes: 10485760L, levelSwitch: null, buffered: false, shared: true, flushToDiskInterval: TimeSpan.FromSeconds(1L), rollingInterval: RollingInterval.Day, rollOnFileSizeLimit: true);
			}).CreateLogger();
			Directory = Folder;
			return true;
		}
		catch
		{
			LoggerField = Logger.None;
			Directory = null;
			return false;
		}
	}

	public static void Shutdown()
	{
		ILogger loggerField = LoggerField;
		LoggerField = Logger.None;
		Directory = null;
		try
		{
			(loggerField as IDisposable)?.Dispose();
		}
		catch
		{
		}
	}

	public static void Debug(string Message, params object?[] Values)
	{
		Write(LogEventLevel.Debug, null, Message, Values);
	}

	public static void Information(string Message, params object?[] Values)
	{
		Write(LogEventLevel.Information, null, Message, Values);
	}

	public static void Warning(string Message, params object?[] Values)
	{
		Write(LogEventLevel.Warning, null, Message, Values);
	}

	public static void Warning(Exception Failure, string Message, params object?[] Values)
	{
		Write(LogEventLevel.Warning, Failure, Message, Values);
	}

	public static void Error(Exception Failure, string? Operation = null, [CallerMemberName] string Member = "", [CallerFilePath] string File = "")
	{
		Write(LogEventLevel.Error, Failure, "{Operation} failed", new object[1] { Operation ?? Describe(File, Member) });
	}

	public static void Error(string Message, params object?[] Values)
	{
		Write(LogEventLevel.Error, null, Message, Values);
	}

	public static void Critical(Exception Failure, string Message, params object?[] Values)
	{
		Write(LogEventLevel.Fatal, Failure, Message, Values);
	}

	public static LogOperation Begin(string Name)
	{
		LogOperation logOperation = new LogOperation(Name);
		Information("{Operation} started {OperationId}", Name, logOperation.Id);
		return logOperation;
	}

	internal static void Write(LogEventLevel Level, Exception? Failure, string Message, object?[] Values)
	{
		try
		{
			ILogger loggerField = LoggerField;
			if (loggerField.IsEnabled(Level))
			{
				loggerField.Write(Level, Failure, Message, Values);
			}
		}
		catch
		{
		}
	}

	private static string Describe(string File, string Member)
	{
		return Path.GetFileNameWithoutExtension(File) + "." + Member;
	}
}
