using System;
using System.Runtime.CompilerServices;
using System.Windows;
using System.Windows.Media;
using System.Windows.Media.Animation;

namespace dotnet_codex_ui.Controls;

internal static class OverlayMotion
{
	private sealed class Version
	{
		public int Value;
	}

	private static readonly ConditionalWeakTable<FrameworkElement, Version> Versions = new ConditionalWeakTable<FrameworkElement, Version>();

	private static readonly Duration OpenDuration = new Duration(TimeSpan.FromMilliseconds(180L));

	private static readonly Duration CloseDuration = new Duration(TimeSpan.FromMilliseconds(130L));

	public static bool Enabled { get; set; } = true;

	private static bool Animate
	{
		get
		{
			if (Enabled)
			{
				return SystemParameters.ClientAreaAnimation;
			}
			return false;
		}
	}

	private static (ScaleTransform Scale, TranslateTransform Shift) TransformsOf(FrameworkElement Card)
	{
		if (Card.RenderTransform is TransformGroup { Children: { Count: 2 } } transformGroup && transformGroup.Children[0] is ScaleTransform item && transformGroup.Children[1] is TranslateTransform item2)
		{
			return (Scale: item, Shift: item2);
		}
		ScaleTransform scaleTransform = new ScaleTransform(1.0, 1.0);
		TranslateTransform translateTransform = new TranslateTransform();
		Card.RenderTransformOrigin = new Point(0.5, 0.5);
		Card.RenderTransform = new TransformGroup
		{
			Children = 
			{
				(Transform)scaleTransform,
				(Transform)translateTransform
			}
		};
		return (Scale: scaleTransform, Shift: translateTransform);
	}

	private static void Rest(FrameworkElement Scrim, FrameworkElement Card)
	{
		var (scaleTransform, translateTransform) = TransformsOf(Card);
		StopAll(Scrim, Card, scaleTransform, translateTransform);
		Scrim.Opacity = 1.0;
		Card.Opacity = 1.0;
		double scaleX = (scaleTransform.ScaleY = 1.0);
		scaleTransform.ScaleX = scaleX;
		translateTransform.Y = 0.0;
	}

	private static void StopAll(FrameworkElement Scrim, FrameworkElement Card, ScaleTransform Scale, TranslateTransform Shift)
	{
		Scrim.BeginAnimation(UIElement.OpacityProperty, null);
		Card.BeginAnimation(UIElement.OpacityProperty, null);
		Scale.BeginAnimation(ScaleTransform.ScaleXProperty, null);
		Scale.BeginAnimation(ScaleTransform.ScaleYProperty, null);
		Shift.BeginAnimation(TranslateTransform.YProperty, null);
	}

	private static DoubleAnimation To(double Value, Duration Length, EasingMode Mode)
	{
		return new DoubleAnimation(Value, Length)
		{
			EasingFunction = new CubicEase
			{
				EasingMode = Mode
			}
		};
	}

	public static void Show(FrameworkElement Overlay, FrameworkElement Scrim, FrameworkElement Card)
	{
		Version orCreateValue = Versions.GetOrCreateValue(Overlay);
		int value = orCreateValue.Value + 1;
		orCreateValue.Value = value;
		try
		{
			var (scaleTransform, translateTransform) = TransformsOf(Card);
			int num;
			double num2;
			if (Overlay.Visibility == Visibility.Visible)
			{
				num = ((Card.Opacity > 0.01) ? 1 : 0);
				if (num != 0)
				{
					num2 = Scrim.Opacity;
					goto IL_005d;
				}
			}
			else
			{
				num = 0;
			}
			num2 = 0.0;
			goto IL_005d;
			IL_005d:
			double opacity = num2;
			double opacity2 = ((num != 0) ? Card.Opacity : 0.0);
			double num3 = ((num != 0) ? scaleTransform.ScaleX : 0.94);
			double y = ((num != 0) ? translateTransform.Y : 10.0);
			StopAll(Scrim, Card, scaleTransform, translateTransform);
			Overlay.Visibility = Visibility.Visible;
			if (!Animate)
			{
				Rest(Scrim, Card);
				return;
			}
			Scrim.Opacity = opacity;
			Card.Opacity = opacity2;
			double scaleX = (scaleTransform.ScaleY = num3);
			scaleTransform.ScaleX = scaleX;
			translateTransform.Y = y;
			Scrim.BeginAnimation(UIElement.OpacityProperty, To(1.0, OpenDuration, EasingMode.EaseOut));
			Card.BeginAnimation(UIElement.OpacityProperty, To(1.0, OpenDuration, EasingMode.EaseOut));
			scaleTransform.BeginAnimation(ScaleTransform.ScaleXProperty, To(1.0, OpenDuration, EasingMode.EaseOut));
			scaleTransform.BeginAnimation(ScaleTransform.ScaleYProperty, To(1.0, OpenDuration, EasingMode.EaseOut));
			translateTransform.BeginAnimation(TranslateTransform.YProperty, To(0.0, OpenDuration, EasingMode.EaseOut));
		}
		catch (Exception)
		{
			Overlay.Visibility = Visibility.Visible;
		}
	}

	public static void Hide(FrameworkElement Overlay, FrameworkElement Scrim, FrameworkElement Card, Action? Done = null)
	{
		int Mine = ++Versions.GetOrCreateValue(Overlay).Value;
		if (!Animate || Overlay.Visibility != Visibility.Visible)
		{
			Finish();
			return;
		}
		try
		{
			(ScaleTransform Scale, TranslateTransform Shift) tuple = TransformsOf(Card);
			ScaleTransform item = tuple.Scale;
			TranslateTransform item2 = tuple.Shift;
			double opacity = Scrim.Opacity;
			double opacity2 = Card.Opacity;
			double scaleX = item.ScaleX;
			double y = item2.Y;
			StopAll(Scrim, Card, item, item2);
			Scrim.Opacity = opacity;
			Card.Opacity = opacity2;
			double scaleX2 = (item.ScaleY = scaleX);
			item.ScaleX = scaleX2;
			item2.Y = y;
			DoubleAnimation doubleAnimation = To(0.0, CloseDuration, EasingMode.EaseIn);
			doubleAnimation.Completed += (object? _, EventArgs _) =>
			{
				Finish();
			};
			Scrim.BeginAnimation(UIElement.OpacityProperty, To(0.0, CloseDuration, EasingMode.EaseIn));
			Card.BeginAnimation(UIElement.OpacityProperty, doubleAnimation);
			item.BeginAnimation(ScaleTransform.ScaleXProperty, To(0.96, CloseDuration, EasingMode.EaseIn));
			item.BeginAnimation(ScaleTransform.ScaleYProperty, To(0.96, CloseDuration, EasingMode.EaseIn));
			item2.BeginAnimation(TranslateTransform.YProperty, To(6.0, CloseDuration, EasingMode.EaseIn));
		}
		catch (Exception)
		{
			Finish();
		}
		void Finish()
		{
			if (Versions.GetOrCreateValue(Overlay).Value == Mine)
			{
				Rest(Scrim, Card);
				Overlay.Visibility = Visibility.Collapsed;
				Done?.Invoke();
			}
		}
	}
}
