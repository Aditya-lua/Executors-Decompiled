using System.Diagnostics;
using System.Runtime.CompilerServices;
using System.Windows;
using System.Windows.Threading;

namespace SolaraUI;

public class App : Application
{
	protected override void OnStartup(StartupEventArgs e)
	{
		//IL_000f: Unknown result type (might be due to invalid IL or missing references)
		//IL_0019: Expected O, but got Unknown
		//IL_0021: Unknown result type (might be due to invalid IL or missing references)
		//IL_002b: Expected O, but got Unknown
		((Application)this).OnStartup(e);
		((Application)this).Exit += new ExitEventHandler(OnExit);
		((Application)this).DispatcherUnhandledException += new DispatcherUnhandledExceptionEventHandler(OnError);
	}

	protected async void OnExit(object sender, ExitEventArgs e)
	{
		if (Application.Current.MainWindow is MainWindow mainWindow)
		{
			await mainWindow._home.SaveTabs();
		}
		_003C_003En__0(e);
	}

	private async void OnError(object sender, DispatcherUnhandledExceptionEventArgs e)
	{
		if (Application.Current.MainWindow is MainWindow mainWindow)
		{
			await mainWindow._home.SaveTabs();
			e.Handled = true;
		}
	}

	[CompilerGenerated]
	[DebuggerHidden]
	private void _003C_003En__0(ExitEventArgs e)
	{
		((Application)this).OnExit(e);
	}
}
