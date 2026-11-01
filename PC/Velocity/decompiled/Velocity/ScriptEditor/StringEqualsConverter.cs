using System;
using System.Globalization;
using System.Windows.Data;

namespace ScriptEditor;

public class StringEqualsConverter : IValueConverter
{
	public object Convert(object value, Type targetType, object parameter, CultureInfo culture)
	{
		return string.Equals(value?.ToString(), parameter?.ToString(), StringComparison.OrdinalIgnoreCase);
	}

	public object ConvertBack(object value, Type targetType, object parameter, CultureInfo culture)
	{
		if (!(value is bool) || !(bool)value)
		{
			return Binding.DoNothing;
		}
		return parameter?.ToString() ?? string.Empty;
	}
}
