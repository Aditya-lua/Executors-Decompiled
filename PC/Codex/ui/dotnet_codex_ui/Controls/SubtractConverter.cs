using System;
using System.Globalization;
using System.Windows.Data;

namespace dotnet_codex_ui.Controls;

internal sealed class SubtractConverter : IValueConverter
{
	public object Convert(object Value, Type TargetType, object Parameter, CultureInfo Culture)
	{
		return Math.Max(0.0, (double)Value - double.Parse((string)Parameter, CultureInfo.InvariantCulture));
	}

	public object ConvertBack(object Value, Type TargetType, object Parameter, CultureInfo Culture)
	{
		throw new NotSupportedException();
	}
}
