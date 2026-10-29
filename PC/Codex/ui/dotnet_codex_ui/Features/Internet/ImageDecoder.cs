using System;
using System.IO;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using dotnet_codex_ui.Infrastructure.Logging;

namespace dotnet_codex_ui.Features.Internet;

internal static class ImageDecoder
{
	public const int MaxDimension = 4096;

	public static ImageKind Sniff(ReadOnlySpan<byte> Bytes)
	{
		if (Bytes.Length >= 12 && Bytes.Slice(0, 4).SequenceEqual("RIFF"u8) && Bytes.Slice(8, 4).SequenceEqual("WEBP"u8))
		{
			return ImageKind.WebP;
		}
		if (Bytes.Length >= 8 && Bytes.Slice(0, 8).SequenceEqual(new byte[8] { 137, 80, 78, 71, 13, 10, 26, 10 }))
		{
			return ImageKind.Png;
		}
		if (Bytes.Length >= 3 && Bytes[0] == byte.MaxValue && Bytes[1] == 216 && Bytes[2] == byte.MaxValue)
		{
			return ImageKind.Jpeg;
		}
		if (Bytes.Length >= 6 && (Bytes.Slice(0, 6).SequenceEqual("GIF87a"u8) || Bytes.Slice(0, 6).SequenceEqual("GIF89a"u8)))
		{
			return ImageKind.Gif;
		}
		if (Bytes.Length >= 2 && Bytes[0] == 66 && Bytes[1] == 77)
		{
			return ImageKind.Bmp;
		}
		return ImageKind.Unknown;
	}

	public static ImageSource? Decode(byte[] Bytes, int MaxWidth)
	{
		try
		{
			return Sniff(Bytes) switch
			{
				ImageKind.Unknown => (ImageSource?)null, 
				ImageKind.WebP => DecodeWebP(Bytes, MaxWidth), 
				_ => DecodeWpf(Bytes, MaxWidth), 
			};
		}
		catch (Exception failure)
		{
			AppLog.Warning(failure, "Image decode failed");
			return null;
		}
	}

	private static BitmapSource? DecodeWebP(byte[] Bytes, int MaxWidth)
	{
		if (!WebPNative.TryGetSize(Bytes, out var Width, out var Height) || Width <= 0 || Height <= 0 || Width > 4096 || Height > 4096)
		{
			return null;
		}
		byte[] array = WebPNative.DecodeBgra(Bytes, Width, Height);
		if (array == null)
		{
			return null;
		}
		BitmapSource bitmapSource = BitmapSource.Create(Width, Height, 96.0, 96.0, PixelFormats.Bgra32, null, array, Width * 4);
		if (Width > MaxWidth)
		{
			bitmapSource = new TransformedBitmap(bitmapSource, new ScaleTransform((double)MaxWidth / (double)Width, (double)MaxWidth / (double)Width));
		}
		bitmapSource.Freeze();
		return bitmapSource;
	}

	private static BitmapSource? DecodeWpf(byte[] Bytes, int MaxWidth)
	{
		int pixelWidth;
		using (MemoryStream bitmapStream = new MemoryStream(Bytes))
		{
			BitmapFrame bitmapFrame = BitmapDecoder.Create(bitmapStream, BitmapCreateOptions.IgnoreColorProfile, BitmapCacheOption.None).Frames[0];
			if (bitmapFrame.PixelWidth <= 0 || bitmapFrame.PixelHeight <= 0 || bitmapFrame.PixelWidth > 4096 || bitmapFrame.PixelHeight > 4096)
			{
				return null;
			}
			pixelWidth = bitmapFrame.PixelWidth;
		}
		BitmapImage bitmapImage = new BitmapImage();
		bitmapImage.BeginInit();
		bitmapImage.CacheOption = BitmapCacheOption.OnLoad;
		if (pixelWidth > MaxWidth)
		{
			bitmapImage.DecodePixelWidth = MaxWidth;
		}
		bitmapImage.StreamSource = new MemoryStream(Bytes);
		bitmapImage.EndInit();
		bitmapImage.Freeze();
		return bitmapImage;
	}
}
