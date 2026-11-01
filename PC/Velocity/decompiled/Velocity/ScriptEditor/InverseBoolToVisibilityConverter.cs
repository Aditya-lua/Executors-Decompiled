using System;
using System.Globalization;
using System.Windows;
using System.Windows.Data;

namespace ScriptEditor;

public class InverseBoolToVisibilityConverter : IValueConverter
{
	public object Convert(object value, Type targetType, object parameter, CultureInfo culture)
	{
		return (object)(Visibility)((value is bool && (bool)value) ? 2 : 0);
	}

	public object ConvertBack(object value, Type targetType, object parameter, CultureInfo culture)
	{
		throw new NotSupportedException();
	}
}
