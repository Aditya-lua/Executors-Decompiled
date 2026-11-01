using System;
using System.Globalization;
using System.Windows.Data;

namespace ScriptEditor;

public class IntEqualsConverter : IValueConverter
{
	public object Convert(object value, Type targetType, object parameter, CultureInfo culture)
	{
		int result;
		return value is int num && int.TryParse(parameter?.ToString(), out result) && num == result;
	}

	public object ConvertBack(object value, Type targetType, object parameter, CultureInfo culture)
	{
		if (value is bool && (bool)value && int.TryParse(parameter?.ToString(), out var result))
		{
			return result;
		}
		return Binding.DoNothing;
	}
}
