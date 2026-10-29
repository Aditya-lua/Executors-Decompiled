using System;
using System.Globalization;
using System.Windows;
using System.Windows.Automation;
using System.Windows.Controls;
using System.Windows.Input;
using System.Windows.Markup;
using System.Windows.Media;
using System.Windows.Media.Animation;
using System.Windows.Threading;
using dotnet_codex_ui.Services;

namespace dotnet_codex_ui.Controls.Settings;

public partial class SliderSetting : UserControl, IComponentConnector
{
	public static readonly DependencyProperty MinimumProperty = DependencyProperty.Register("Minimum", typeof(int), typeof(SliderSetting), new PropertyMetadata(0, (DependencyObject D, DependencyPropertyChangedEventArgs _) =>
	{
		((SliderSetting)D).Refresh();
	}));

	public static readonly DependencyProperty MaximumProperty = DependencyProperty.Register("Maximum", typeof(int), typeof(SliderSetting), new PropertyMetadata(100, (DependencyObject D, DependencyPropertyChangedEventArgs _) =>
	{
		((SliderSetting)D).Refresh();
	}));

	public static readonly DependencyProperty StepProperty = DependencyProperty.Register("Step", typeof(int), typeof(SliderSetting), new PropertyMetadata(1, (DependencyObject D, DependencyPropertyChangedEventArgs _) =>
	{
		((SliderSetting)D).Refresh();
	}));

	public static readonly DependencyProperty ValueProperty = DependencyProperty.Register("Value", typeof(int), typeof(SliderSetting), new PropertyMetadata(0, (DependencyObject D, DependencyPropertyChangedEventArgs _) =>
	{
		((SliderSetting)D).Refresh();
	}));

	public static readonly DependencyProperty UnitProperty = DependencyProperty.Register("Unit", typeof(string), typeof(SliderSetting), new PropertyMetadata("", (DependencyObject D, DependencyPropertyChangedEventArgs _) =>
	{
		((SliderSetting)D).Refresh();
	}));

	public static readonly DependencyProperty OffTextProperty = DependencyProperty.Register("OffText", typeof(string), typeof(SliderSetting), new PropertyMetadata("", (DependencyObject D, DependencyPropertyChangedEventArgs _) =>
	{
		((SliderSetting)D).Refresh();
	}));

	public static readonly DependencyProperty IsOffProperty = DependencyProperty.Register("IsOff", typeof(bool), typeof(SliderSetting), new PropertyMetadata(false, (DependencyObject D, DependencyPropertyChangedEventArgs _) =>
	{
		((SliderSetting)D).Refresh();
	}));

	private readonly DispatcherTimer HintTimer = new DispatcherTimer
	{
		Interval = TimeSpan.FromSeconds(3L)
	};

	private bool Syncing;

	private bool Dragging;

	private int HintVersion;

	public int Minimum
	{
		get
		{
			return (int)GetValue(MinimumProperty);
		}
		set
		{
			SetValue(MinimumProperty, value);
		}
	}

	public int Maximum
	{
		get
		{
			return (int)GetValue(MaximumProperty);
		}
		set
		{
			SetValue(MaximumProperty, value);
		}
	}

	public int Step
	{
		get
		{
			return (int)GetValue(StepProperty);
		}
		set
		{
			SetValue(StepProperty, value);
		}
	}

	public int Value
	{
		get
		{
			return (int)GetValue(ValueProperty);
		}
		set
		{
			SetValue(ValueProperty, value);
		}
	}

	public string Unit
	{
		get
		{
			return (string)GetValue(UnitProperty);
		}
		set
		{
			SetValue(UnitProperty, value);
		}
	}

	public string OffText
	{
		get
		{
			return (string)GetValue(OffTextProperty);
		}
		set
		{
			SetValue(OffTextProperty, value);
		}
	}

	public bool IsOff
	{
		get
		{
			return (bool)GetValue(IsOffProperty);
		}
		set
		{
			SetValue(IsOffProperty, value);
		}
	}

	public string AccessibleName
	{
		set
		{
			AutomationProperties.SetName(Track, value);
			AutomationProperties.SetName(NumberBox, value + " value");
			AutomationProperties.SetName(OffToggle, value + ": " + OffText);
		}
	}

	public event Action<SliderSetting>? Committed;

	public SliderSetting()
	{
		InitializeComponent();
		HintTimer.Tick += (object? _, EventArgs _) =>
		{
			ClearHint();
		};
		Refresh();
	}

	private int Snap(long Raw)
	{
		int num = Math.Max(1, Step);
		int minimum = Minimum;
		int num2 = Math.Max(Minimum, Maximum);
		long num3 = Math.Clamp(Raw, minimum, num2);
		return (int)Math.Min(minimum + (num3 - minimum + num / 2) / num * num, num2);
	}

	private string Format(int Number)
	{
		if (!(Unit == "MB") || Number < 1024)
		{
			if (!(Unit == "%"))
			{
				if (!string.IsNullOrEmpty(Unit))
				{
					return $"{Number} {Unit}";
				}
				return Number.ToString(CultureInfo.InvariantCulture);
			}
			return $"{Number}%";
		}
		return $"{(double)Number / 1024.0:0.#} GB";
	}

	private void Refresh()
	{
		if (Track == null)
		{
			return;
		}
		Syncing = true;
		try
		{
			Track.Minimum = Minimum;
			Track.Maximum = Math.Max(Minimum, Maximum);
			Track.TickFrequency = Math.Max(1, Step);
			Track.SmallChange = Math.Max(1, Step);
			Track.LargeChange = Math.Max(1, Step) * 10;
			int num = Snap(Value);
			Track.Value = num;
			NumberBox.Text = num.ToString(CultureInfo.InvariantCulture);
			UnitText.Text = ((Unit == "%") ? "%" : Unit);
			MinLabel.Text = Format(Minimum);
			MaxLabel.Text = Format(Maximum);
			OffRow.Visibility = (string.IsNullOrEmpty(OffText) ? Visibility.Collapsed : Visibility.Visible);
			OffLabel.Text = OffText;
			OffToggle.IsChecked = IsOff;
			bool flag = !IsOff || string.IsNullOrEmpty(OffText);
			Slider track = Track;
			bool isEnabled = (NumberBox.IsEnabled = flag);
			track.IsEnabled = isEnabled;
			TextBlock minLabel = MinLabel;
			double opacity = (MaxLabel.Opacity = (flag ? 1.0 : 0.5));
			minLabel.Opacity = opacity;
		}
		finally
		{
			Syncing = false;
		}
	}

	private void Commit()
	{
		Committed?.Invoke(this);
	}

	private void Track_ValueChanged(object Sender, RoutedPropertyChangedEventArgs<double> E)
	{
		if (!Syncing)
		{
			int committed = Snap((long)Math.Round(Track.Value));
			NumberBox.Text = committed.ToString(CultureInfo.InvariantCulture);
			if (!Dragging)
			{
				SetCommitted(committed);
			}
		}
	}

	private void Track_PreviewMouseLeftButtonDown(object Sender, MouseButtonEventArgs E)
	{
		Dragging = true;
	}

	private void Track_PreviewMouseLeftButtonUp(object Sender, MouseButtonEventArgs E)
	{
		if (Dragging)
		{
			Dragging = false;
			SetCommitted(Snap((long)Math.Round(Track.Value)));
		}
	}

	private void SetCommitted(int Picked)
	{
		ClearHint();
		if (Picked != Value)
		{
			SetValue(ValueProperty, Picked);
		}
		Commit();
	}

	private void NumberBox_PreviewKeyDown(object Sender, KeyEventArgs E)
	{
		if (E.Key == Key.Enter)
		{
			E.Handled = true;
			CommitText();
		}
		else if (E.Key == Key.Escape)
		{
			E.Handled = true;
			NumberBox.Text = Snap(Value).ToString(CultureInfo.InvariantCulture);
			ClearHint();
		}
	}

	private void NumberBox_LostKeyboardFocus(object Sender, KeyboardFocusChangedEventArgs E)
	{
		CommitText();
	}

	private void CommitText()
	{
		if (Syncing || (IsOff && !string.IsNullOrEmpty(OffText)))
		{
			return;
		}
		string text = NumberBox.Text.Trim();
		if (!long.TryParse(text, NumberStyles.Integer, CultureInfo.InvariantCulture, out var result))
		{
			NumberBox.Text = Snap(Value).ToString(CultureInfo.InvariantCulture);
			if (text.Length > 0 || NumberBox.IsKeyboardFocused)
			{
				ShowHint($"Enter a whole number from {Minimum} to {Maximum}.");
			}
			return;
		}
		int num = Snap(result);
		NumberBox.Text = num.ToString(CultureInfo.InvariantCulture);
		if (num != result)
		{
			ShowHint($"Adjusted to {num} (allowed {Minimum}–{Maximum}).");
		}
		else
		{
			ClearHint();
		}
		if (num != Value)
		{
			SetValue(ValueProperty, num);
			Commit();
		}
	}

	private void OffToggle_Changed(object Sender, RoutedEventArgs E)
	{
		if (!Syncing)
		{
			SetValue(IsOffProperty, OffToggle.IsChecked == true);
			ClearHint();
			Commit();
		}
	}

	private void ShowHint(string Message)
	{
		HintVersion++;
		Hint.Text = Message;
		Hint.Visibility = Visibility.Visible;
		Hint.BeginAnimation(UIElement.OpacityProperty, null);
		Hint.Opacity = 1.0;
		if (MotionPolicy.Enabled)
		{
			Hint.BeginAnimation(UIElement.OpacityProperty, new DoubleAnimation(0.0, 1.0, TimeSpan.FromMilliseconds(150L)));
		}
		NumberBox.BorderBrush = (Brush)FindResource("Toast.Error");
		HintTimer.Stop();
		HintTimer.Start();
	}

	private void ClearHint()
	{
		HintTimer.Stop();
		NumberBox.ClearValue(Control.BorderBrushProperty);
		if (Hint.Visibility != Visibility.Visible)
		{
			return;
		}
		int Version = ++HintVersion;
		if (!MotionPolicy.Enabled)
		{
			Hint.Visibility = Visibility.Collapsed;
			return;
		}
		DoubleAnimation doubleAnimation = new DoubleAnimation(0.0, TimeSpan.FromMilliseconds(120L));
		doubleAnimation.Completed += (object? _, EventArgs _) =>
		{
			if (Version == HintVersion)
			{
				Hint.BeginAnimation(UIElement.OpacityProperty, null);
				Hint.Visibility = Visibility.Collapsed;
			}
		};
		Hint.BeginAnimation(UIElement.OpacityProperty, doubleAnimation);
	}
}
