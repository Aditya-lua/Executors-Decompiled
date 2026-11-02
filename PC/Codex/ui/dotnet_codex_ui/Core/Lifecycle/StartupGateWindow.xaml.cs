using System;
using System.CodeDom.Compiler;
using System.Diagnostics;
using System.IO;
using System.Runtime.InteropServices;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Input;
using System.Windows.Markup;
using System.Windows.Media;
using System.Windows.Media.Animation;
using System.Windows.Threading;
using dotnet_codex_ui.Infrastructure.Logging;
using dotnet_codex_ui.Services;

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

	private bool Leaving;
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
		if (MotionPolicy.Enabled)
		{
			Loaded += (object _, RoutedEventArgs _) =>
			{
				Animate(0.0, 1.0, EasingMode.EaseOut);
			};
		}
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

	private void Animate(double From, double To, EasingMode Mode, Action? Done = null)
	{
		//IL_0040: Unknown result type (might be due to invalid IL or missing references)
		//IL_0046: Expected Obj, but got Unknown
		//IL_0059: Unknown result type (might be due to invalid IL or missing references)
		//IL_006a: Unknown result type (might be due to invalid IL or missing references)
		//IL_006f: Unknown result type (might be due to invalid IL or missing references)
		//IL_0070: Unknown result type (might be due to invalid IL or missing references)
		//IL_0075: Unknown result type (might be due to invalid IL or missing references)
		//IL_0076: Unknown result type (might be due to invalid IL or missing references)
		//IL_007e: Expected Obj, but got Unknown
		//IL_0080: Unknown result type (might be due to invalid IL or missing references)
		//IL_0081: Unknown result type (might be due to invalid IL or missing references)
		//IL_0086: Unknown result type (might be due to invalid IL or missing references)
		//IL_0090: Expected Obj, but got Unknown
		//IL_00d5: Unknown result type (might be due to invalid IL or missing references)
		//IL_00d6: Unknown result type (might be due to invalid IL or missing references)
		//IL_00db: Unknown result type (might be due to invalid IL or missing references)
		//IL_00e5: Expected Obj, but got Unknown
		object content = ((ContentControl)this).Content;
		FrameworkElement val = (FrameworkElement)((content is FrameworkElement) ? content : null);
		if (val == null)
		{
			Done?.Invoke();
			return;
		}
		ScaleTransform val2 = new ScaleTransform(1.0, 1.0);
		((UIElement)val).RenderTransformOrigin = new Point(0.5, 0.5);
		((UIElement)val).RenderTransform = (Transform)(object)val2;
		Duration normal = MotionDurations.Normal;
		CubicEase easingFunction = new CubicEase
		{
			EasingMode = Mode
		};
		DoubleAnimation val3 = new DoubleAnimation(From, To, normal)
		{
			EasingFunction = (IEasingFunction)(object)easingFunction
		};
		if (Done != null)
		{
			((Timeline)val3).Completed += (object? _, EventArgs _) =>
			{
				Done();
			};
		}
		DoubleAnimation val4 = new DoubleAnimation(0.96 + From * 0.04, 0.96 + To * 0.04, normal)
		{
			EasingFunction = (IEasingFunction)(object)easingFunction
		};
		((Animatable)val2).BeginAnimation(ScaleTransform.ScaleXProperty, (AnimationTimeline)(object)val4);
		((Animatable)val2).BeginAnimation(ScaleTransform.ScaleYProperty, (AnimationTimeline)(object)val4);
		((UIElement)val).BeginAnimation(UIElement.OpacityProperty, (AnimationTimeline)(object)val3);
	}

	private void Leave(GateChoice Value)
	{
		if (Leaving)
		{
			return;
		}
		Leaving = true;
		Choice = Value;
		if (!MotionPolicy.Enabled)
		{
			((Window)this).DialogResult = Value == GateChoice.Retry;
			return;
		}
		Animate(1.0, 0.0, (EasingMode)0, () =>
		{
			((Window)this).DialogResult = Value == GateChoice.Retry;
		});
	}

	private void Retry_Click(object Sender, RoutedEventArgs E)
	{
		Leave(GateChoice.Retry);
	}

	private void Exit_Click(object Sender, RoutedEventArgs E)
	{
		Leave(GateChoice.Exit);
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
