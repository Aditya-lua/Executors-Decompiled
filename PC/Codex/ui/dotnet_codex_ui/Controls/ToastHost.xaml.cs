using System;
using System.CodeDom.Compiler;
using System.Diagnostics;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Input;
using System.Windows.Markup;
using System.Windows.Media;
using System.Windows.Media.Animation;
using dotnet_codex_ui.Infrastructure.Logging;
using dotnet_codex_ui.Services;

namespace dotnet_codex_ui.Controls;

public partial class ToastHost : UserControl, IComponentConnector
{
	private enum Phase
	{
		Idle,
		Entering,
		Visible,
		Exiting
	}

	private Phase PhaseField;

	private ToastHandle? Current;

	private AnimationClock? LifeClock;

	private int EpochField;

	private bool ShutdownField;

	private static bool ReducedMotion => !SystemParameters.ClientAreaAnimation;

	public ToastHost()
	{
		InitializeComponent();
		Loaded += (object _, RoutedEventArgs _) =>
		{
			ToastService.Attach(this);
		};
	}

	private static TimeSpan Ms(double Milliseconds)
	{
		return TimeSpan.FromMilliseconds(ReducedMotion ? 0.0 : Milliseconds);
	}

	internal void Pump()
	{
		if (ShutdownField || PhaseField != Phase.Idle || !ToastService.TryTake(out ToastHandle Handle))
		{
			return;
		}
		Current = Handle;
		Card.DataContext = Handle.Notification;
		DetailsToggle.IsChecked = false;
		CopyButton.Content = "Copy";
		LifeBar.Visibility = Visibility.Collapsed;
		Card.Visibility = Visibility.Visible;
		PhaseField = Phase.Entering;
		Handle.MarkShown();
		int Epoch = ++EpochField;
		CubicEase easingFunction = new CubicEase
		{
			EasingMode = EasingMode.EaseOut
		};
		DoubleAnimation animation = new DoubleAnimation(0.0, 1.0, Ms(220.0))
		{
			EasingFunction = easingFunction
		};
		DoubleAnimation doubleAnimation = new DoubleAnimation(24.0, 0.0, Ms(220.0))
		{
			EasingFunction = easingFunction
		};
		doubleAnimation.Completed += (object? _, EventArgs _) =>
		{
			if (Epoch == EpochField && Current != null)
			{
				Settle(1.0, 0.0);
				PhaseField = Phase.Visible;
				StartLife();
			}
		};
		Card.BeginAnimation(UIElement.OpacityProperty, animation);
		CardShift.BeginAnimation(TranslateTransform.XProperty, doubleAnimation);
	}

	internal void Dismiss(ToastHandle Handle)
	{
		if (Handle == Current)
		{
			BeginExit();
		}
	}

	internal void OnUpdated(ToastHandle Handle)
	{
		if (Handle == Current && PhaseField == Phase.Visible)
		{
			StartLife();
		}
	}

	internal void HideImmediately()
	{
		EpochField++;
		StopLife();
		Settle(0.0, 0.0);
		Card.Visibility = Visibility.Collapsed;
		Card.DataContext = null;
		ToastHandle? current = Current;
		Current = null;
		PhaseField = Phase.Idle;
		current?.MarkClosed();
	}

	internal void Shutdown()
	{
		ShutdownField = true;
		HideImmediately();
	}

	private void BeginExit()
	{
		bool flag = Current == null;
		if (!flag)
		{
			Phase phaseField = PhaseField;
			bool flag2 = ((phaseField == Phase.Idle || phaseField == Phase.Exiting) ? true : false);
			flag = flag2;
		}
		if (flag)
		{
			return;
		}
		ToastHandle Handle = Current;
		PhaseField = Phase.Exiting;
		int Epoch = ++EpochField;
		StopLife();
		CubicEase easingFunction = new CubicEase
		{
			EasingMode = EasingMode.EaseIn
		};
		DoubleAnimation animation = new DoubleAnimation
		{
			To = 0.0,
			Duration = Ms(180.0),
			EasingFunction = easingFunction
		};
		DoubleAnimation doubleAnimation = new DoubleAnimation
		{
			To = 16.0,
			Duration = Ms(180.0),
			EasingFunction = easingFunction
		};
		doubleAnimation.Completed += (object? _, EventArgs _) =>
		{
			if (Epoch == EpochField)
			{
				Settle(0.0, 0.0);
				Card.Visibility = Visibility.Collapsed;
				Card.DataContext = null;
				Current = null;
				PhaseField = Phase.Idle;
				Handle.MarkClosed();
				Pump();
			}
		};
		Card.BeginAnimation(UIElement.OpacityProperty, animation);
		CardShift.BeginAnimation(TranslateTransform.XProperty, doubleAnimation);
	}

	private void Settle(double Opacity, double X)
	{
		Card.BeginAnimation(UIElement.OpacityProperty, null);
		Card.Opacity = Opacity;
		CardShift.BeginAnimation(TranslateTransform.XProperty, null);
		CardShift.X = X;
	}

	private void StartLife()
	{
		StopLife();
		ToastNotification toastNotification = Current?.Notification;
		if (toastNotification != null)
		{
			TimeSpan? lifetime = toastNotification.Lifetime;
			if (lifetime.HasValue)
			{
				TimeSpan valueOrDefault = lifetime.GetValueOrDefault();
				if (toastNotification.Type != ToastType.Loading)
				{
					LifeBar.Visibility = Visibility.Visible;
					AnimationClock animationClock = new DoubleAnimation(1.0, 0.0, valueOrDefault).CreateClock();
					animationClock.Completed += LifeClock_Completed;
					LifeClock = animationClock;
					LifeScale.ApplyAnimationClock(ScaleTransform.ScaleXProperty, animationClock);
					UpdatePause();
					return;
				}
			}
		}
		LifeBar.Visibility = Visibility.Collapsed;
	}

	private void StopLife()
	{
		AnimationClock lifeClock = LifeClock;
		if (lifeClock != null)
		{
			lifeClock.Completed -= LifeClock_Completed;
			LifeScale.ApplyAnimationClock(ScaleTransform.ScaleXProperty, null);
			LifeClock = null;
		}
		LifeScale.ScaleX = 1.0;
	}

	private void LifeClock_Completed(object? Sender, EventArgs E)
	{
		if (Sender == LifeClock)
		{
			BeginExit();
		}
	}

	private void UpdatePause()
	{
		ClockController clockController = LifeClock?.Controller;
		if (clockController == null)
		{
			return;
		}
		try
		{
			if (Card.IsMouseOver || DetailsToggle.IsChecked == true)
			{
				clockController.Pause();
			}
			else
			{
				clockController.Resume();
			}
		}
		catch (InvalidOperationException)
		{
		}
	}

	private void Card_MouseChanged(object Sender, MouseEventArgs E)
	{
		UpdatePause();
	}

	private void Details_Changed(object Sender, RoutedEventArgs E)
	{
		UpdatePause();
	}

	private void Details_PreviewMouseWheel(object Sender, MouseWheelEventArgs E)
	{
		TextBox textBox = (TextBox)Sender;
		bool flag = textBox.ExtentHeight > textBox.ViewportHeight;
		bool flag2 = textBox.ExtentWidth > textBox.ViewportWidth;
		bool num;
		if ((Keyboard.Modifiers & ModifierKeys.Control) == 0)
		{
			if (flag)
			{
				return;
			}
			num = !flag2;
		}
		else
		{
			num = !flag2;
		}
		if (!num)
		{
			textBox.ScrollToHorizontalOffset(textBox.HorizontalOffset - (double)E.Delta);
			E.Handled = true;
		}
	}

	private void Close_Click(object Sender, RoutedEventArgs E)
	{
		BeginExit();
	}

	private void Action_Click(object Sender, RoutedEventArgs E)
	{
		Action action = (Card.DataContext as ToastNotification)?.ActionCallback;
		BeginExit();
		try
		{
			action?.Invoke();
		}
		catch (Exception failure)
		{
			AppLog.Error(failure, null, "Action_Click", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Controls\\ToastHost.xaml.cs");
		}
	}

	private void Copy_Click(object Sender, RoutedEventArgs E)
	{
		if (!(Card.DataContext is ToastNotification toastNotification))
		{
			return;
		}
		try
		{
			Clipboard.SetText(toastNotification.DiagnosticText);
			CopyButton.Content = "Copied";
		}
		catch (Exception)
		{
			CopyButton.Content = "Copy Failed";
		}
	}

}
