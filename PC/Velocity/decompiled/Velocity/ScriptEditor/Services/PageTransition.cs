using System;
using System.Windows;
using System.Windows.Media;
using System.Windows.Media.Animation;

namespace ScriptEditor.Services;

public static class PageTransition
{
	private const double RiseDistance = 10.0;

	public static void Play(FrameworkElement page)
	{
		//IL_000d: Unknown result type (might be due to invalid IL or missing references)
		//IL_0013: Expected Obj, but got Unknown
		//IL_0025: Unknown result type (might be due to invalid IL or missing references)
		//IL_002a: Unknown result type (might be due to invalid IL or missing references)
		//IL_003b: Unknown result type (might be due to invalid IL or missing references)
		//IL_0047: Expected Obj, but got Unknown
		//IL_0064: Unknown result type (might be due to invalid IL or missing references)
		//IL_0069: Unknown result type (might be due to invalid IL or missing references)
		//IL_006f: Expected Obj, but got Unknown
		//IL_00b5: Unknown result type (might be due to invalid IL or missing references)
		//IL_00ba: Unknown result type (might be due to invalid IL or missing references)
		//IL_00bf: Unknown result type (might be due to invalid IL or missing references)
		//IL_00c0: Unknown result type (might be due to invalid IL or missing references)
		//IL_00c5: Unknown result type (might be due to invalid IL or missing references)
		//IL_00d1: Expected Obj, but got Unknown
		//IL_00d6: Expected Obj, but got Unknown
		TranslateTransform val = new TranslateTransform();
		((UIElement)page).RenderTransform = (Transform)(object)val;
		((UIElement)page).CacheMode = (CacheMode)new BitmapCache
		{
			RenderAtScale = ScaleOf((Visual)(object)page),
			SnapsToDevicePixels = true
		};
		DoubleAnimation val2 = new DoubleAnimation(0.0, 1.0, new Duration(TimeSpan.FromMilliseconds(180L)));
		((Timeline)val2).Completed += (object? _, EventArgs _) =>
		{
			((UIElement)page).CacheMode = null;
		};
		((UIElement)page).BeginAnimation(UIElement.OpacityProperty, (AnimationTimeline)(object)val2);
		((Animatable)val).BeginAnimation(TranslateTransform.YProperty, (AnimationTimeline)new DoubleAnimation(10.0, 0.0, new Duration(TimeSpan.FromMilliseconds(240L)))
		{
			EasingFunction = (IEasingFunction)new QuadraticEase
			{
				EasingMode = (EasingMode)1
			}
		});
	}

	private static double ScaleOf(Visual visual)
	{
		//IL_0029: Unknown result type (might be due to invalid IL or missing references)
		//IL_002e: Unknown result type (might be due to invalid IL or missing references)
		PresentationSource val = PresentationSource.FromVisual(visual);
		double? num;
		if (val == null)
		{
			num = null;
		}
		else
		{
			CompositionTarget compositionTarget = val.CompositionTarget;
			if (compositionTarget == null)
			{
				num = null;
			}
			else
			{
				Matrix transformToDevice = compositionTarget.TransformToDevice;
				num = transformToDevice.M11;
			}
		}
		return num ?? 1.0;
	}
}
