using System;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Threading;

namespace dotnet_codex_bootstrapper.Infrastructure;

public static class FatalErrorHandler
{
	public static void Attach(Application App)
	{
		App.DispatcherUnhandledException += OnDispatcherException;
		AppDomain.CurrentDomain.UnhandledException += (object _, UnhandledExceptionEventArgs E) =>
		{
			AppLog.Error((E.ExceptionObject as Exception) ?? new InvalidOperationException("Unknown fatal error"), "Unhandled exception (terminating: {Terminating})", E.IsTerminating);
		};
		TaskScheduler.UnobservedTaskException += (object? _, UnobservedTaskExceptionEventArgs E) =>
		{
			AppLog.Error(E.Exception, "Unobserved task exception");
			E.SetObserved();
		};
	}

	private static void OnDispatcherException(object Sender, DispatcherUnhandledExceptionEventArgs E)
	{
		AppLog.Error(E.Exception, "Unhandled UI exception");
		E.Handled = true;
		try
		{
			MessageBox.Show("The Codex bootstrapper hit an unexpected error and will close.\n\nDetails were written to the log.", "Codex Bootstrapper", MessageBoxButton.OK, MessageBoxImage.Hand);
		}
		catch (Exception)
		{
		}
		AppLog.Close();
		Environment.Exit(1);
	}
}
