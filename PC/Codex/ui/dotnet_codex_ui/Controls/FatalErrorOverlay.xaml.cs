using System;
using System.CodeDom.Compiler;
using System.Diagnostics;
using System.IO;
using System.Threading;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Input;
using System.Windows.Markup;
using System.Windows.Threading;
using dotnet_codex_ui.Core.Lifecycle;

namespace dotnet_codex_ui.Controls;

public partial class FatalErrorOverlay : UserControl, IComponentConnector
{
	private string DiagnosticsField = "";

	private string? LogPathField;

	private int Exiting;

	public FatalErrorOverlay()
	{
		InitializeComponent();
	}

	internal void Show(FatalErrorInfo Info)
	{
		DiagnosticsField = Info.Diagnostics;
		LogPathField = Info.LogPath;
		SummaryText.Text = Info.Summary;
		MetaText.Text = $"{Info.ExceptionType}  ·  {Info.Timestamp:u}  ·  v{Info.Version}";
		DiagBox.Text = Info.Diagnostics;
		OpenLogButton.Visibility = ((LogPathField == null || !File.Exists(LogPathField)) ? Visibility.Collapsed : Visibility.Visible);
		OverlayMotion.Show(this, Scrim, Card);
		Visibility = Visibility.Visible;
		Dispatcher.BeginInvoke((Func<IInputElement>)(() => Keyboard.Focus(ExitButton)), DispatcherPriority.Loaded);
	}

	protected override void OnPreviewKeyDown(KeyEventArgs E)
	{
		if (E.Key == Key.Escape)
		{
			E.Handled = true;
		}
		else
		{
			base.OnPreviewKeyDown(E);
		}
	}

	private void Copy_Click(object Sender, RoutedEventArgs E)
	{
		try
		{
			Clipboard.SetText(DiagnosticsField);
			CopyButton.Content = "Copied";
		}
		catch (Exception)
		{
			CopyButton.Content = "Copy Failed";
		}
	}

	private void OpenLog_Click(object Sender, RoutedEventArgs E)
	{
		try
		{
			if (LogPathField != null && File.Exists(LogPathField))
			{
				Process.Start(new ProcessStartInfo("explorer.exe", "/select,\"" + LogPathField + "\"")
				{
					UseShellExecute = true
				});
			}
		}
		catch (Exception)
		{
		}
	}

	private void Exit_Click(object Sender, RoutedEventArgs E)
	{
		if (Interlocked.Exchange(ref Exiting, 1) != 1)
		{
			ExitButton.IsEnabled = false;
			Application.Current.Shutdown();
		}
	}

}
