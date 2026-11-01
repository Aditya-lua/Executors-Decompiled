using System;
using System.Globalization;
using System.IO;
using System.Windows.Data;
using System.Windows.Media.Imaging;

namespace ScriptEditor;

public class ThumbnailConverter : IValueConverter
{
	private const int DecodeWidth = 480;

	public object? Convert(object value, Type targetType, object parameter, CultureInfo culture)
	{
		//IL_0018: Unknown result type (might be due to invalid IL or missing references)
		//IL_001d: Unknown result type (might be due to invalid IL or missing references)
		//IL_0023: Unknown result type (might be due to invalid IL or missing references)
		//IL_002a: Unknown result type (might be due to invalid IL or missing references)
		//IL_0035: Unknown result type (might be due to invalid IL or missing references)
		//IL_003c: Unknown result type (might be due to invalid IL or missing references)
		//IL_0043: Unknown result type (might be due to invalid IL or missing references)
		//IL_004a: Expected Obj, but got Unknown
		if (!(value is string uriString) || !Uri.TryCreate(uriString, UriKind.Absolute, out Uri result))
		{
			return null;
		}
		try
		{
			BitmapImage val = new BitmapImage();
			val.BeginInit();
			val.UriSource = result;
			val.DecodePixelWidth = 480;
			val.CacheOption = (BitmapCacheOption)1;
			val.CreateOptions = (BitmapCreateOptions)8;
			val.EndInit();
			return (object?)val;
		}
		catch (Exception ex) when ((ex is NotSupportedException || ex is IOException || ex is UriFormatException) ? true : false)
		{
			return null;
		}
	}

	public object ConvertBack(object value, Type targetType, object parameter, CultureInfo culture)
	{
		throw new NotSupportedException();
	}
}
