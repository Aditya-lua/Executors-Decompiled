using System;
using System.IO;
using System.Threading.Tasks;
using System.Windows;
using ScriptEditor.Models;
using ScriptEditor.Services;

namespace ScriptEditor;

public partial class App : Application
{
	private static readonly TimeSpan MinimumSplashTime = TimeSpan.FromMilliseconds(1100L);

	private static readonly TimeSpan EditorReadyTimeout = TimeSpan.FromSeconds(20L);

	protected override void OnStartup(StartupEventArgs e)
	{
		base.OnStartup(e);
		if (e.Args.Contains("--mcp-stdio", StringComparer.OrdinalIgnoreCase))
		{
			RunMcpBridgeAsync();
			return;
		}
		try
		{
			Directory.SetCurrentDirectory(AppPaths.InstallFolder);
		}
		catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException) ? true : false)
		{
		}
		AppPaths.MigrateLegacyData();
		AppPaths.EnsureAssets();
		StartAsync();
	}

	private async Task RunMcpBridgeAsync()
	{
		((Application)this).Shutdown(await McpHost.RunStdioBridgeAsync());
	}

	private async Task StartAsync()
	{
		if (!AppSettings.Load().ShowSplash)
		{
			MainWindow plain = (MainWindow)(object)(((Application)this).MainWindow = (Window)(object)new MainWindow());
			plain.CenterOnWorkArea();
			((Window)plain).Show();
			await plain.WhenEditorReadyAsync();
			await plain.OpenInitialTabAsync();
			return;
		}
		SplashWindow splash = new SplashWindow();
		((Window)splash).Show();
		DateTime shownAt = DateTime.UtcNow;
		MainWindow mainWindow = new MainWindow();
		((UIElement)mainWindow).Opacity = 0.0;
		((Window)mainWindow).ShowActivated = false;
		((Window)mainWindow).WindowStartupLocation = (WindowStartupLocation)0;
		((Window)mainWindow).Left = -32000.0;
		((Window)mainWindow).Top = -32000.0;
		MainWindow main = (MainWindow)(object)(((Application)this).MainWindow = (Window)(object)mainWindow);
		((Window)main).Show();
		splash.SetStatus("Loading editor…");
		Task ready = main.WhenEditorReadyAsync();
		if (await Task.WhenAny(ready, Task.Delay(EditorReadyTimeout)) != ready)
		{
			splash.SetStatus("Editor is taking longer than usual…");
		}
		splash.SetStatus("Ready");
		TimeSpan timeSpan = DateTime.UtcNow - shownAt;
		if (timeSpan < MinimumSplashTime)
		{
			await Task.Delay(MinimumSplashTime - timeSpan);
		}
		await splash.FadeOutAsync();
		((Window)splash).Close();
		await main.RevealAsync();
	}
}
