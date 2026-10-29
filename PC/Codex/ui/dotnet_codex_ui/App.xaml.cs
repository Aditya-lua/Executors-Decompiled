using System;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Threading;
using CefSharp;
using CefSharp.Wpf;
using dotnet_codex_ui.Configuration;
using dotnet_codex_ui.Core.Lifecycle;
using dotnet_codex_ui.Core.Versioning;
using dotnet_codex_ui.Infrastructure.Logging;
using dotnet_codex_ui.Services;

namespace dotnet_codex_ui;

public partial class App : Application
{
	private static readonly TimeSpan CefShutdownTimeout = TimeSpan.FromSeconds(3L);

	private static bool IsCancellation(Exception Ex)
	{
		if (!(Ex is OperationCanceledException))
		{
			if (Ex is AggregateException ex)
			{
				return ex.Flatten().InnerExceptions.All((Exception Inner) => Inner is OperationCanceledException);
			}
			return false;
		}
		return true;
	}

	private string? InterceptException(Exception Ex)
	{
		if (Ex == null)
		{
			return null;
		}
		Exception ex = (Ex as AggregateException)?.Flatten().InnerExceptions.FirstOrDefault() ?? Ex;
		string result = null;
		AppLog.Critical(ex, "Unhandled exception ({Type})", ex.GetType().Name);
		try
		{
			string text = ex.GetType().Name.Replace("Exception", string.Empty, StringComparison.OrdinalIgnoreCase).ToLowerInvariant();
			string source = string.Concat($"{text}-{DateTime.UtcNow:yyyy-MM-dd-HH-mm-ss}-{Guid.NewGuid():N}".AsSpan(0, text.Length + 1 + 19 + 1 + 8), ".log");
			char[] InvalidChars = Path.GetInvalidFileNameChars();
			string path = new string(new ReadOnlySpan<char>(source.Select((char Character) => (!InvalidChars.Contains(Character)) ? Character : '_').ToArray()));
			string text2 = Path.Combine(AppDomain.CurrentDomain.BaseDirectory, "logs");
			if (!Directory.Exists(text2))
			{
				Directory.CreateDirectory(text2);
			}
			string text3 = Path.Combine(text2, path);
			File.WriteAllText(text3, Ex.ToString());
			result = text3;
		}
		catch
		{
		}
		return result;
	}

	private static async Task InitializeCef()
	{
		using LogOperation Operation = AppLog.Begin("CefInitialize");
		string text = Path.Combine(AppDomain.CurrentDomain.BaseDirectory, "cef");
		string cachePath = Path.Combine(text, "cache");
		if (!(await Cef.InitializeAsync(new CefSettings
		{
			RootCachePath = text,
			CachePath = cachePath,
			LogFile = Path.Combine(text, "log.txt"),
			LogSeverity = LogSeverity.Warning,
			Locale = "en-US",
			MultiThreadedMessageLoop = true,
			PersistSessionCookies = true,
			UserAgent = "Wave/4.0 CefSharp",
			WindowlessRenderingEnabled = true,
			CefCommandLineArgs = { "--do-not-de-elevate" }
		})))
		{
			InvalidOperationException ex = new InvalidOperationException("Failed to initialize CefSharp.");
			Operation.Fail(ex);
			throw ex;
		}
	}

	private void InstallExceptionHandlers()
	{
		AppDomain.CurrentDomain.UnhandledException += (object Sender, UnhandledExceptionEventArgs Args) =>
		{
			if (Args.ExceptionObject is Exception ex)
			{
				InterceptException(ex);
				AppLog.Shutdown();
			}
		};
		DispatcherUnhandledException += (object Sender, DispatcherUnhandledExceptionEventArgs Args) =>
		{
			string logPath = InterceptException(Args.Exception);
			if (IsCancellation(Args.Exception))
			{
				Args.Handled = true;
			}
			else
			{
				Args.Handled = FatalErrorCoordinator.Enter(Args.Exception, "Dispatcher", logPath);
			}
		};
		TaskScheduler.UnobservedTaskException += (object? Sender, UnobservedTaskExceptionEventArgs Args) =>
		{
			InterceptException(Args.Exception);
			Exception ex = Args.Exception.Flatten().InnerExceptions.FirstOrDefault() ?? Args.Exception;
			if (!IsCancellation(Args.Exception))
			{
				ToastService.ShowError("Background Task Failed", ex.Message, null, ex);
			}
		};
	}

	private void EndStartup(int ExitCode)
	{
		StartupSequence.Instance?.Dispose();
		StartupSequence.Instance = null;
		AppLog.Shutdown();
		Shutdown(ExitCode);
	}

	protected override async void OnStartup(StartupEventArgs E)
	{
		ShutdownMode = ShutdownMode.OnExplicitShutdown;
		AppLog.Initialize();
		AppLog.Information("Codex {Version} starting (process {Process}, {Arguments} arguments)", AppVersions.UI, Environment.ProcessId, E.Args.Length);
		InstallExceptionHandlers();
		ToolTipService.InitialShowDelayProperty.OverrideMetadata(typeof(FrameworkElement), new FrameworkPropertyMetadata(350));
		ToolTipService.BetweenShowDelayProperty.OverrideMetadata(typeof(FrameworkElement), new FrameworkPropertyMetadata(80));
		ToolTipService.ShowDurationProperty.OverrideMetadata(typeof(FrameworkElement), new FrameworkPropertyMetadata(8000));
		FrameworkElement.FocusVisualStyleProperty.OverrideMetadata(typeof(Control), new FrameworkPropertyMetadata(null));
		AccentTheme.Apply(RegistryConfiguration.Accent);
		base.OnStartup(E);
		Encoding.RegisterProvider(CodePagesEncodingProvider.Instance);
		try
		{
			if (!(await StartupSequence.RunAsync()))
			{
				EndStartup(1);
				return;
			}
			await InitializeCef();
			MainWindow mainWindow = (MainWindow)(MainWindow = new MainWindow());
			ShutdownMode = ShutdownMode.OnMainWindowClose;
			mainWindow.Show();
			AppLog.Information("Main window shown");
		}
		catch (Exception ex)
		{
			AppLog.Critical(ex, "Startup failed");
			InterceptException(ex);
			StartupSequence.ShowGate("Codex Could Not Start", ex.Message, ex.ToString(), arg4: false);
			EndStartup(1);
		}
	}

	protected override void OnExit(ExitEventArgs E)
	{
		AppLog.Information("Codex exiting with code {Code}", E.ApplicationExitCode);
		try
		{
			if (Cef.IsInitialized == true)
			{
				using (new Timer((object? _) =>
				{
					Environment.Exit(E.ApplicationExitCode);
				}, null, CefShutdownTimeout, Timeout.InfiniteTimeSpan))
				{
					Cef.Shutdown();
					AppLog.Information("Chromium shutdown completed");
				}
			}
		}
		catch (Exception failure)
		{
			AppLog.Error(failure, null, "OnExit", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\App.xaml.cs");
		}
		StartupSequence.Instance?.Dispose();
		StartupSequence.Instance = null;
		base.OnExit(E);
		AppLog.Shutdown();
		Environment.Exit(E.ApplicationExitCode);
	}
}
