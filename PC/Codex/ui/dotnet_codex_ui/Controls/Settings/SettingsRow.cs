using System.Windows;
using System.Windows.Controls;

namespace dotnet_codex_ui.Controls.Settings;

public class SettingsRow : HeaderedContentControl
{
	private static readonly DependencyPropertyKey HasStatusKey = DependencyProperty.RegisterReadOnly("HasStatus", typeof(bool), typeof(SettingsRow), new PropertyMetadata(false));

	private static readonly DependencyPropertyKey HasDescriptionKey = DependencyProperty.RegisterReadOnly("HasDescription", typeof(bool), typeof(SettingsRow), new PropertyMetadata(false));

	public static readonly DependencyProperty HasStatusProperty = HasStatusKey.DependencyProperty;

	public static readonly DependencyProperty HasDescriptionProperty = HasDescriptionKey.DependencyProperty;

	public static readonly DependencyProperty DescriptionProperty = DependencyProperty.Register("Description", typeof(string), typeof(SettingsRow), new PropertyMetadata("", (DependencyObject D, DependencyPropertyChangedEventArgs E) =>
	{
		D.SetValue(HasDescriptionKey, !string.IsNullOrEmpty((string)E.NewValue));
	}));

	public static readonly DependencyProperty StatusProperty = DependencyProperty.Register("Status", typeof(string), typeof(SettingsRow), new PropertyMetadata("", (DependencyObject D, DependencyPropertyChangedEventArgs E) =>
	{
		D.SetValue(HasStatusKey, !string.IsNullOrEmpty((string)E.NewValue));
	}));

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

	public string Status
	{
		get
		{
			return (string)GetValue(StatusProperty);
		}
		set
		{
			SetValue(StatusProperty, value);
		}
	}

	public bool HasStatus => (bool)GetValue(HasStatusProperty);

	public bool HasDescription => (bool)GetValue(HasDescriptionProperty);
}
