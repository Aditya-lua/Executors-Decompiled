using System;
using System.Globalization;
using System.Windows;
using System.Windows.Data;
using ScriptEditor.Models;

namespace ScriptEditor;

public class OutputKindToBrushConverter : IValueConverter
{
	public object? Convert(object value, Type targetType, object parameter, CultureInfo culture)
	{
		if (!(value is OutputKind))
		{
			goto IL_0049;
		}
		switch ((OutputKind)value)
		{
		case OutputKind.Info:
			break;
		case OutputKind.Success:
			goto IL_0031;
		case OutputKind.Warning:
			goto IL_0039;
		case OutputKind.Error:
			goto IL_0041;
		default:
			goto IL_0049;
		}
		string text = "OutputInfoBrush";
		goto IL_004f;
		IL_0049:
		text = "OutputPrintBrush";
		goto IL_004f;
		IL_004f:
		string text2 = text;
		return Application.Current.TryFindResource((object)text2);
		IL_0031:
		text = "OutputSuccessBrush";
		goto IL_004f;
		IL_0039:
		text = "OutputWarningBrush";
		goto IL_004f;
		IL_0041:
		text = "OutputErrorBrush";
		goto IL_004f;
	}

	public object ConvertBack(object value, Type targetType, object parameter, CultureInfo culture)
	{
		throw new NotSupportedException();
	}
}
