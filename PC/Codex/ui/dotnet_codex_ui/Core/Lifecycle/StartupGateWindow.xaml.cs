using System;
using System.CodeDom.Compiler;
using System.Diagnostics;
using System.IO;
using System.Runtime.InteropServices;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Input;
using System.Windows.Markup;
using System.Windows.Threading;
using dotnet_codex_ui.Infrastructure.Logging;

namespace dotnet_codex_ui.Core.Lifecycle;

public partial class StartupGateWindow : Window, IComponentConnector
{
	internal static readonly TimeSpan RetryCooldown = TimeSpan.FromSeconds(3L);

	private readonly string DetailsField;

	private readonly DispatcherTimer Cooldown = new DispatcherTimer
	{
		Interval = TimeSpan.FromSeconds(1L)
	};

	private DateTime RetryAt;

	internal GateChoice Choice { get; private set; }

	internal StartupGateWindow(string Heading, string Summary, string Details, bool CanRetry)
	{
		InitializeComponent();
		TitleText.Text = Heading;
		SummaryText.Text = Summary;
		DetailsBox.Text = Details;
		DetailsBox.Visibility = ((Details.Length <= 0) ? Visibility.Collapsed : Visibility.Visible);
		DetailsField = $"{Heading}\r\n{Summary}\r\n\r\n{Details}";
		LogButton.Visibility = ((!AppLog.IsActive) ? Visibility.Collapsed : Visibility.Visible);
		RetryButton.Visibility = ((!CanRetry) ? Visibility.Collapsed : Visibility.Visible);
		if (CanRetry)
		{
			RetryAt = DateTime.UtcNow + RetryCooldown;
			Cooldown.Tick += (object? _, EventArgs _) =>
			{
				UpdateRetry();
			};
			RetryButton.IsEnabled = false;
			UpdateRetry();
			Cooldown.Start();
		}
	}

	private void UpdateRetry()
	{
		double totalSeconds = (RetryAt - DateTime.UtcNow).TotalSeconds;
		if (totalSeconds > 0.0)
		{
			RetryButton.Content = $"Retry ({Math.Ceiling(totalSeconds)})";
		}
		else
		{
			Cooldown.Stop();
			RetryButton.Content = "Retry";
			RetryButton.IsEnabled = true;
		}
	}

	private void Retry_Click(object Sender, RoutedEventArgs E)
	{
		Choice = GateChoice.Retry;
		DialogResult = true;
	}

	private void Exit_Click(object Sender, RoutedEventArgs E)
	{
		Choice = GateChoice.Exit;
		DialogResult = false;
	}

	private void Copy_Click(object Sender, RoutedEventArgs E)
	{
		try
		{
			Clipboard.SetText(DetailsField);
		}
		catch (COMException)
		{
			AppLog.Warning("The clipboard was busy; startup details were not copied.");
		}
	}

	private void Log_Click(object Sender, RoutedEventArgs E)
	{
		try
		{
			string directory = AppLog.Directory;
			if (directory != null && Directory.Exists(directory))
			{
				Process.Start(new ProcessStartInfo("explorer.exe", "\"" + directory + "\"")
				{
					UseShellExecute = true
				});
			}
		}
		catch (Exception failure)
		{
			AppLog.Error(failure, null, "Log_Click", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Core\\Lifecycle\\StartupGateWindow.xaml.cs");
		}
	}

	private void Window_MouseLeftButtonDown(object Sender, MouseButtonEventArgs E)
	{
		if (E.ButtonState == MouseButtonState.Pressed && !(E.OriginalSource is TextBox))
		{
			DragMove();
		}
	}

	private void Window_KeyDown(object Sender, KeyEventArgs E)
	{
		if (E.Key == Key.Escape)
		{
			Exit_Click(Sender, E);
		}
	}

	protected override void OnClosed(EventArgs E)
	{
		Cooldown.Stop();
		base.OnClosed(E);
	}

}
