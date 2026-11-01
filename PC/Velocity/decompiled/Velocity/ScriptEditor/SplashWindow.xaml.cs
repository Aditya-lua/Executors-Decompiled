using System;
using System.CodeDom.Compiler;
using System.ComponentModel;
using System.Diagnostics;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Markup;
using System.Windows.Media.Animation;
using System.Windows.Shapes;

namespace ScriptEditor;

public partial class SplashWindow : Window, IComponentConnector
{
	internal Border Root;

	internal Ellipse Glow;

	internal Image Logo;

	internal TextBlock Wordmark;

	internal Border ProgressTrack;

	internal Rectangle ProgressSweep;

	internal TextBlock Status;

	public SplashWindow()
	{
		InitializeComponent();
	}

	public void SetStatus(string text)
	{
		Status.Text = text;
	}

	public Task FadeOutAsync()
	{
		//IL_0013: Unknown result type (might be due to invalid IL or missing references)
		//IL_0018: Unknown result type (might be due to invalid IL or missing references)
		//IL_002c: Unknown result type (might be due to invalid IL or missing references)
		//IL_0038: Unknown result type (might be due to invalid IL or missing references)
		//IL_0042: Unknown result type (might be due to invalid IL or missing references)
		//IL_0043: Unknown result type (might be due to invalid IL or missing references)
		//IL_0048: Unknown result type (might be due to invalid IL or missing references)
		//IL_0054: Expected Obj, but got Unknown
		//IL_0055: Expected Obj, but got Unknown
		TaskCompletionSource done = new TaskCompletionSource(TaskCreationOptions.RunContinuationsAsynchronously);
		DoubleAnimation val = new DoubleAnimation
		{
			To = 0.0,
			Duration = new Duration(TimeSpan.FromMilliseconds(220L)),
			EasingFunction = (IEasingFunction)new QuadraticEase
			{
				EasingMode = (EasingMode)0
			}
		};
		((Timeline)val).Completed += (object? _, EventArgs _) =>
		{
			done.TrySetResult();
		};
		((UIElement)Glow).BeginAnimation(UIElement.OpacityProperty, (AnimationTimeline)null);
		((UIElement)Root).BeginAnimation(UIElement.OpacityProperty, (AnimationTimeline)(object)val);
		return done.Task;
	}

	[DebuggerNonUserCode]
	[GeneratedCode("PresentationBuildTasks", "10.0.12.0")]
	[EditorBrowsable(EditorBrowsableState.Never)]
	void IComponentConnector.Connect(int connectionId, object target)
	{
		//IL_0028: Unknown result type (might be due to invalid IL or missing references)
		//IL_0032: Expected Obj, but got Unknown
		//IL_0035: Unknown result type (might be due to invalid IL or missing references)
		//IL_003f: Expected Obj, but got Unknown
		//IL_0042: Unknown result type (might be due to invalid IL or missing references)
		//IL_004c: Expected Obj, but got Unknown
		//IL_004f: Unknown result type (might be due to invalid IL or missing references)
		//IL_0059: Expected Obj, but got Unknown
		//IL_005c: Unknown result type (might be due to invalid IL or missing references)
		//IL_0066: Expected Obj, but got Unknown
		//IL_0069: Unknown result type (might be due to invalid IL or missing references)
		//IL_0073: Expected Obj, but got Unknown
		//IL_0076: Unknown result type (might be due to invalid IL or missing references)
		//IL_0080: Expected Obj, but got Unknown
		switch (connectionId)
		{
		case 1:
			Root = (Border)target;
			break;
		case 2:
			Glow = (Ellipse)target;
			break;
		case 3:
			Logo = (Image)target;
			break;
		case 4:
			Wordmark = (TextBlock)target;
			break;
		case 5:
			ProgressTrack = (Border)target;
			break;
		case 6:
			ProgressSweep = (Rectangle)target;
			break;
		case 7:
			Status = (TextBlock)target;
			break;
		default:
			_contentLoaded = true;
			break;
		}
	}
}
