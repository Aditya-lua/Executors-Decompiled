using System;
using System.Reflection;
using System.Text;
using System.Threading;
using System.Windows;
using dotnet_codex_ui.Services;

namespace dotnet_codex_ui.Core.Lifecycle;

internal static class FatalErrorCoordinator
{
	private static int Entered;

	private static volatile bool Shown;

	public static bool IsFatal => Volatile.Read(in Entered) == 1;

	public static bool Enter(Exception ExceptionValue, string Source, string? LogPath = null)
	{
		try
		{
			Application current = Application.Current;
			if (current == null || current.Dispatcher.HasShutdownStarted)
			{
				return false;
			}
			if (!current.Dispatcher.CheckAccess())
			{
				current.Dispatcher.BeginInvoke((Func<bool>)(() => Enter(ExceptionValue, Source, LogPath)));
				return false;
			}
			if (Interlocked.Exchange(ref Entered, 1) == 1)
			{
				return Shown;
			}
			ToastService.Suspend();
			if (current.MainWindow is MainWindow mainWindow)
			{
				Shown = mainWindow.ShowFatal(Build(ExceptionValue, Source, LogPath));
			}
			return Shown;
		}
		catch
		{
			return false;
		}
	}

	private static FatalErrorInfo Build(Exception ExceptionValue, string Source, string? LogPath)
	{
		DateTime utcNow = DateTime.UtcNow;
		string text = Assembly.GetEntryAssembly()?.GetName().Version?.ToString() ?? "unknown";
		StringBuilder stringBuilder = new StringBuilder();
		StringBuilder.AppendInterpolatedStringHandler handler = new StringBuilder.AppendInterpolatedStringHandler(18, 2, stringBuilder);
		handler.AppendLiteral("Fatal error (");
		handler.AppendFormatted(Source);
		handler.AppendLiteral(") at ");
		handler.AppendFormatted(utcNow, "u");
		StringBuilder stringBuilder2 = stringBuilder.AppendLine(ref handler);
		StringBuilder.AppendInterpolatedStringHandler handler2 = new StringBuilder.AppendInterpolatedStringHandler(9, 1, stringBuilder2);
		handler2.AppendLiteral("Version: ");
		handler2.AppendFormatted(text);
		StringBuilder stringBuilder3 = stringBuilder2.AppendLine(ref handler2);
		StringBuilder.AppendInterpolatedStringHandler handler3 = new StringBuilder.AppendInterpolatedStringHandler(6, 1, stringBuilder3);
		handler3.AppendLiteral("Type: ");
		handler3.AppendFormatted(ExceptionValue.GetType().FullName);
		StringBuilder stringBuilder4 = stringBuilder3.AppendLine(ref handler3);
		StringBuilder.AppendInterpolatedStringHandler handler4 = new StringBuilder.AppendInterpolatedStringHandler(9, 1, stringBuilder4);
		handler4.AppendLiteral("Message: ");
		handler4.AppendFormatted(ExceptionValue.Message);
		string diagnostics = stringBuilder4.AppendLine(ref handler4).AppendLine().Append(ExceptionValue)
			.ToString();
		return new FatalErrorInfo(ExceptionValue.Message, ExceptionValue.GetType().Name, utcNow, text, diagnostics, LogPath);
	}
}
