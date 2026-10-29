using System;
using System.CodeDom.Compiler;
using System.Runtime.CompilerServices;
using System.Runtime.InteropServices;
using System.Runtime.InteropServices.Marshalling;

namespace dotnet_codex_ui.Features.Internet;

internal static class WebPNative
{
	private const string Library = "libwebpdecoder.dll";

	[GeneratedCode("Microsoft.Interop.LibraryImportGenerator", "10.0.14.42308")]
	[SkipLocalsInit]
	private unsafe static int WebPGetInfo(ReadOnlySpan<byte> Data, nuint Size, out int Width, out int Height)
	{
		Width = 0;
		Height = 0;
		int result;
		fixed (int* _Height_native = &Height)
		{
			fixed (int* _Width_native = &Width)
			{
				fixed (byte* ptr = &ReadOnlySpanMarshaller<byte, byte>.ManagedToUnmanagedIn.GetPinnableReference(Data))
				{
					void* _Data_native = ptr;
					result = __PInvoke((byte*)_Data_native, Size, _Width_native, _Height_native);
				}
			}
		}
		return result;
		[DllImport("libwebpdecoder.dll", EntryPoint = "WebPGetInfo", ExactSpelling = true)]
		unsafe static extern int __PInvoke(byte* __Data_native, nuint __Size_native, int* __Width_native, int* __Height_native);
	}

	[GeneratedCode("Microsoft.Interop.LibraryImportGenerator", "10.0.14.42308")]
	[SkipLocalsInit]
	private unsafe static byte* WebPDecodeBGRAInto(ReadOnlySpan<byte> Data, nuint Size, byte* Output, nuint OutputSize, int Stride)
	{
		byte* result;
		fixed (byte* ptr = &ReadOnlySpanMarshaller<byte, byte>.ManagedToUnmanagedIn.GetPinnableReference(Data))
		{
			void* _Data_native = ptr;
			result = __PInvoke((byte*)_Data_native, Size, Output, OutputSize, Stride);
		}
		return result;
		[DllImport("libwebpdecoder.dll", EntryPoint = "WebPDecodeBGRAInto", ExactSpelling = true)]
		unsafe static extern byte* __PInvoke(byte* __Data_native, nuint __Size_native, byte* __Output_native, nuint __OutputSize_native, int __Stride_native);
	}

	public static bool TryGetSize(ReadOnlySpan<byte> Data, out int Width, out int Height)
	{
		Width = (Height = 0);
		return WebPGetInfo(Data, (nuint)Data.Length, out Width, out Height) != 0;
	}

	public unsafe static byte[]? DecodeBgra(ReadOnlySpan<byte> Data, int Width, int Height)
	{
		long num = (long)Width * (long)Height * 4;
		if (num <= 0 || num > int.MaxValue)
		{
			return null;
		}
		byte[] array = new byte[num];
		fixed (byte* output = array)
		{
			if (WebPDecodeBGRAInto(Data, (nuint)Data.Length, output, (nuint)num, Width * 4) != null)
			{
				return array;
			}
			return null;
		}
	}
}
