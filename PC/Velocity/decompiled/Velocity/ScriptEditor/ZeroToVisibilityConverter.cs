using System;
using System.Globalization;
using System.Windows;
using System.Windows.Data;

namespace ScriptEditor;

public class ZeroToVisibilityConverter : IValueConverter
{
	public object Convert(object value, Type targetType, object parameter, CultureInfo culture)
	{
		return (object)(Visibility)((!(value is int) || (int)value != 0) ? 2 : 0);
	}

	public object ConvertBack(object value, Type targetType, object parameter, CultureInfo culture)
	{
		throw new NotSupportedException();
	}
}
