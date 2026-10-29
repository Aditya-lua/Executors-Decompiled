using System;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Media;
using System.Windows.Media.Animation;
using dotnet_codex_ui.Infrastructure.Logging;
using dotnet_codex_ui.Services;

namespace dotnet_codex_ui.Features.Internet;

public static class Thumbnail
{
	public static readonly DependencyProperty UrlProperty = DependencyProperty.RegisterAttached("Url", typeof(string), typeof(Thumbnail), new PropertyMetadata(null, OnUrlChanged));

	public static readonly DependencyProperty StateProperty = DependencyProperty.RegisterAttached("State", typeof(string), typeof(Thumbnail), new PropertyMetadata("loading"));

	public static readonly DependencyProperty ShimmerProperty = DependencyProperty.RegisterAttached("Shimmer", typeof(bool), typeof(Thumbnail), new PropertyMetadata(false, OnShimmerChanged));

	public static readonly DependencyProperty RoundProperty = DependencyProperty.RegisterAttached("Round", typeof(double), typeof(Thumbnail), new PropertyMetadata(0.0, OnRoundChanged));

	public static double GetRound(DependencyObject Element)
	{
		return (double)Element.GetValue(RoundProperty);
	}

	public static void SetRound(DependencyObject Element, double Value)
	{
		Element.SetValue(RoundProperty, Value);
	}

	private static void OnRoundChanged(DependencyObject Element, DependencyPropertyChangedEventArgs E)
	{
		if (Element is FrameworkElement frameworkElement)
		{
			frameworkElement.SizeChanged -= ApplyRound;
			frameworkElement.SizeChanged += ApplyRound;
			ApplyRound(frameworkElement, null);
		}
	}

	private static void ApplyRound(object Sender, SizeChangedEventArgs E)
	{
		FrameworkElement frameworkElement = (FrameworkElement)Sender;
		double round = GetRound(frameworkElement);
		if (round <= 0.0 || frameworkElement.ActualWidth <= 0.0 || frameworkElement.ActualHeight <= 0.0)
		{
			frameworkElement.Clip = null;
			return;
		}
		RectangleGeometry rectangleGeometry = new RectangleGeometry(new Rect(0.0, 0.0, frameworkElement.ActualWidth, frameworkElement.ActualHeight), round, round);
		rectangleGeometry.Freeze();
		frameworkElement.Clip = rectangleGeometry;
	}

	public static string? GetUrl(DependencyObject Element)
	{
		return (string)Element.GetValue(UrlProperty);
	}

	public static void SetUrl(DependencyObject Element, string? Value)
	{
		Element.SetValue(UrlProperty, Value);
	}

	public static string GetState(DependencyObject Element)
	{
		return (string)Element.GetValue(StateProperty);
	}

	public static void SetState(DependencyObject Element, string Value)
	{
		Element.SetValue(StateProperty, Value);
	}

	public static bool GetShimmer(DependencyObject Element)
	{
		return (bool)Element.GetValue(ShimmerProperty);
	}

	public static void SetShimmer(DependencyObject Element, bool Value)
	{
		Element.SetValue(ShimmerProperty, Value);
	}

	private static async void OnUrlChanged(DependencyObject Element, DependencyPropertyChangedEventArgs E)
	{
		if (!(Element is Image Target))
		{
			return;
		}
		Target.Source = null;
		string Url = E.NewValue as string;
		if (string.IsNullOrEmpty(Url))
		{
			SetState(Target, "failed");
			return;
		}
		SetState(Target, "loading");
		try
		{
			ImageSource imageSource = await ThumbnailCache.Shared.GetAsync(Url);
			if (!(GetUrl(Target) != Url))
			{
				Target.Source = imageSource;
				SetState(Target, (imageSource == null) ? "failed" : "loaded");
			}
		}
		catch (Exception failure)
		{
			AppLog.Warning(failure, "Thumbnail binding failed");
			if (GetUrl(Target) == Url)
			{
				SetState(Target, "failed");
			}
		}
	}

	private static void OnShimmerChanged(DependencyObject Element, DependencyPropertyChangedEventArgs E)
	{
		if (Element is UIElement uIElement)
		{
			object newValue = E.NewValue;
			if (newValue is bool && (bool)newValue && MotionPolicy.Enabled)
			{
				uIElement.BeginAnimation(UIElement.OpacityProperty, new DoubleAnimation(0.35, 0.8, TimeSpan.FromMilliseconds(900L))
				{
					AutoReverse = true,
					RepeatBehavior = RepeatBehavior.Forever
				});
			}
			else
			{
				uIElement.BeginAnimation(UIElement.OpacityProperty, null);
				uIElement.Opacity = 0.55;
			}
		}
	}
}
