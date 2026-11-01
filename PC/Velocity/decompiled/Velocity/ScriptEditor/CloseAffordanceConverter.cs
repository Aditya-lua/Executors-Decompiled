using System;
using System.Globalization;
using System.Linq;
using System.Windows;
using System.Windows.Data;

namespace ScriptEditor;

public class CloseAffordanceConverter : IMultiValueConverter
{
	public object Convert(object[] values, Type targetType, object parameter, CultureInfo culture)
	{
		object obj = values.ElementAtOrDefault(0);
		bool num = obj is bool && (bool)obj;
		obj = values.ElementAtOrDefault(1);
		bool flag = obj is bool && (bool)obj;
		obj = values.ElementAtOrDefault(2);
		bool flag2 = obj is bool && (bool)obj;
		return (object)(Visibility)((!num && (!flag || flag2)) ? 2 : 0);
	}

	public object[] ConvertBack(object value, Type[] targetTypes, object parameter, CultureInfo culture)
	{
		throw new NotSupportedException();
	}
}
