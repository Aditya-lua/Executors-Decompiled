using System.Windows;
using System.Windows.Controls;

namespace dotnet_codex_ui.Controls;

internal class Button : System.Windows.Controls.Button
{
	internal static readonly DependencyProperty CornerRadiusProperty = DependencyProperty.Register("CornerRadius", typeof(CornerRadius), typeof(Button), new FrameworkPropertyMetadata(new CornerRadius(0.0)));

	public static readonly DependencyProperty IsLoadingProperty = DependencyProperty.Register("IsLoading", typeof(bool), typeof(Button), new FrameworkPropertyMetadata(false));

	public CornerRadius CornerRadius
	{
		get
		{
			return (CornerRadius)GetValue(CornerRadiusProperty);
		}
		set
		{
			SetValue(CornerRadiusProperty, value);
		}
	}

	public bool IsLoading
	{
		get
		{
			return (bool)GetValue(IsLoadingProperty);
		}
		set
		{
			SetValue(IsLoadingProperty, value);
		}
	}

	protected override void OnClick()
	{
		if (!IsLoading)
		{
			base.OnClick();
		}
	}

	public override void OnApplyTemplate()
	{
		base.OnApplyTemplate();
	}
}
