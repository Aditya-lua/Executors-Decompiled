using System;
using System.Globalization;
using System.Windows;
using System.Windows.Data;

namespace ScriptEditor;

public class NotEmptyToVisibilityConverter : IValueConverter
{
	public object Convert(object value, Type targetType, object parameter, CultureInfo culture)
	{
		return (object)(Visibility)(string.IsNullOrEmpty(value as string) ? 2 : 0);
	}

	public object ConvertBack(object value, Type targetType, object parameter, CultureInfo culture)
	{
		throw new NotSupportedException();
	}
}
