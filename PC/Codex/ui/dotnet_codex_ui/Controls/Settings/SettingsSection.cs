using System.Windows;
using System.Windows.Controls;
using System.Windows.Media;

namespace dotnet_codex_ui.Controls.Settings;

public class SettingsSection : HeaderedContentControl
{
	public static readonly DependencyProperty IconProperty = DependencyProperty.Register("Icon", typeof(Geometry), typeof(SettingsSection));

	public static readonly DependencyProperty DescriptionProperty = DependencyProperty.Register("Description", typeof(string), typeof(SettingsSection), new PropertyMetadata(""));

	public Geometry? Icon
	{
		get
		{
			return (Geometry)GetValue(IconProperty);
		}
		set
		{
			SetValue(IconProperty, value);
		}
	}

	public string Description
	{
		get
		{
			return (string)GetValue(DescriptionProperty);
		}
		set
		{
			SetValue(DescriptionProperty, value);
		}
	}
}
