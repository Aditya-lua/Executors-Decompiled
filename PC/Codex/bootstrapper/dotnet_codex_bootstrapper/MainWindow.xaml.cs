using System;
using System.ComponentModel;
using System.Windows;
using System.Windows.Controls.Primitives;
using System.Windows.Markup;
using System.Windows.Media;
using System.Windows.Media.Animation;
using System.Windows.Threading;
using dotnet_codex_bootstrapper.Features.Bootstrapping;
using dotnet_codex_bootstrapper.Features.Bootstrapping.Demo;
using dotnet_codex_bootstrapper.Services;

namespace dotnet_codex_bootstrapper;

public partial class MainWindow : Window, IComponentConnector
{
	private const double SweepWidth = 90.0;

	private const double FallbackTrackWidth = 380.0;

	private readonly BootstrapperViewModel Model;

	private readonly DemoController? Demo;

	private BootstrapperSnapshot Previous = BootstrapperSnapshot.Initial;

	private bool SweepRunning;

	private DispatcherTimer? ExitTimer;

	public MainWindow()
		: this(new BootstrapperViewModel(() => new DemoBootstrapperFlow(DemoScenarios.Default)))
	{
	}

	public MainWindow(BootstrapperViewModel Model, DemoController? Demo = null)
	{
		MainWindow mainWindow = this;
		this.Model = Model;
		this.Demo = Demo;
		InitializeComponent();
		DataContext = Model;
		if (Demo != null)
		{
			DemoBar.DataContext = Demo;
			DemoBar.Visibility = Visibility.Visible;
		}
		Model.PropertyChanged += OnModelChanged;
		Loaded += (object _, RoutedEventArgs _) =>
		{
			mainWindow.Present(Model.Snapshot, Initial: true);
		};
		Activated += (object? _, EventArgs _) =>
		{
			AccentTheme.Apply(AccentTheme.ReadStored());
		};
		Closed += OnClosed;
	}

	private void OnModelChanged(object? Sender, PropertyChangedEventArgs E)
	{
		if (E.PropertyName == "Snapshot" && IsLoaded)
		{
			Present(Model.Snapshot, Initial: false);
		}
	}

	private void Present(BootstrapperSnapshot Next, bool Initial)
	{
		BootstrapperSnapshot previous = Previous;
		Previous = Next;
		if (!Initial && (previous.Title != Next.Title || previous.Description != Next.Description))
		{
			Fade(TitleText, 0.35, MotionDurations.Normal);
			Fade(DescriptionText, 0.35, MotionDurations.Normal);
		}
		if (!Initial && previous.CurrentFile != Next.CurrentFile)
		{
			Fade(FileText, 0.55, MotionDurations.Fast);
		}
		ShowProgress(Next);
		ShowSweep(Next.IsIndeterminate);
		if (Next.ExitRequested)
		{
			CloseSoon();
		}
	}

	private void CloseSoon()
	{
		if (ExitTimer == null)
		{
			ExitTimer = new DispatcherTimer
			{
				Interval = TimeSpan.FromMilliseconds(MotionPolicy.Enabled ? 1100 : 300)
			};
			ExitTimer.Tick += (object? _, EventArgs _) =>
			{
				ExitTimer.Stop();
				Close();
			};
			ExitTimer.Start();
		}
	}

	private static void Fade(UIElement Target, double From, Duration Length)
	{
		if (MotionPolicy.Enabled)
		{
			Target.BeginAnimation(UIElement.OpacityProperty, new DoubleAnimation(From, 1.0, Length));
		}
	}

	private void ShowProgress(BootstrapperSnapshot Next)
	{
		if (Next.IsIndeterminate)
		{
			Bar.BeginAnimation(RangeBase.ValueProperty, null);
			Bar.Value = 0.0;
			return;
		}
		double progressValue = Next.ProgressValue;
		if (!MotionPolicy.Enabled || progressValue < Bar.Value - 1.0)
		{
			Bar.BeginAnimation(RangeBase.ValueProperty, null);
			Bar.Value = progressValue;
		}
		else
		{
			Bar.BeginAnimation(RangeBase.ValueProperty, new DoubleAnimation(progressValue, MotionDurations.Fast));
		}
	}

	private void ShowSweep(bool On)
	{
		Bar.ApplyTemplate();
		if (Bar.Template.FindName("SweepShift", Bar) is TranslateTransform translateTransform)
		{
			double num = ((Bar.ActualWidth > 0.0) ? Bar.ActualWidth : 380.0);
			if (!On)
			{
				translateTransform.BeginAnimation(TranslateTransform.XProperty, null);
				translateTransform.X = -90.0;
				SweepRunning = false;
			}
			else if (!MotionPolicy.Enabled)
			{
				translateTransform.BeginAnimation(TranslateTransform.XProperty, null);
				translateTransform.X = (num - 90.0) / 2.0;
				SweepRunning = false;
			}
			else if (!SweepRunning)
			{
				SweepRunning = true;
				translateTransform.BeginAnimation(TranslateTransform.XProperty, new DoubleAnimation(-90.0, num, MotionDurations.Sweep)
				{
					RepeatBehavior = RepeatBehavior.Forever,
					EasingFunction = new SineEase
					{
						EasingMode = EasingMode.EaseInOut
					}
				});
			}
		}
	}

	private void OnClosed(object? Sender, EventArgs E)
	{
		Model.PropertyChanged -= OnModelChanged;
		ExitTimer?.Stop();
		Bar.BeginAnimation(RangeBase.ValueProperty, null);
		ShowSweep(On: false);
		TitleText.BeginAnimation(UIElement.OpacityProperty, null);
		DescriptionText.BeginAnimation(UIElement.OpacityProperty, null);
		FileText.BeginAnimation(UIElement.OpacityProperty, null);
		Model.Dispose();
	}

	private void Minimize_Click(object Sender, RoutedEventArgs E)
	{
		WindowState = WindowState.Minimized;
	}

	private void Close_Click(object Sender, RoutedEventArgs E)
	{
		Close();
	}

	private void PreviousScenario_Click(object Sender, RoutedEventArgs E)
	{
		Demo?.Previous();
		Model.Restart();
	}

	private void NextScenario_Click(object Sender, RoutedEventArgs E)
	{
		Demo?.Next();
		Model.Restart();
	}

	private void Replay_Click(object Sender, RoutedEventArgs E)
	{
		Model.Restart();
	}
}
