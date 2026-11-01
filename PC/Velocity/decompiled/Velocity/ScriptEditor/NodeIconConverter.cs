using System;
using System.Globalization;
using System.Windows.Data;
using System.Windows.Media;

namespace ScriptEditor;

public class NodeIconConverter : IValueConverter
{
	public Geometry? Folder { get; set; }

	public Geometry? File { get; set; }

	public object? Convert(object value, Type targetType, object parameter, CultureInfo culture)
	{
		if (!(value is bool) || !(bool)value)
		{
			return File;
		}
		return Folder;
	}

	public object ConvertBack(object value, Type targetType, object parameter, CultureInfo culture)
	{
		throw new NotSupportedException();
	}
}
