using System;
using System.Runtime.InteropServices;
using dotnet_codex_ui.Infrastructure.Logging;

namespace dotnet_codex_ui.Infrastructure.Windows;

internal static class DisplayRefresh
{
	private struct Point
	{
		public int X;

		public int Y;
	}

	private struct Rect
	{
		public int Left;

		public int Top;

		public int Right;

		public int Bottom;
	}

	[StructLayout(LayoutKind.Sequential, CharSet = CharSet.Unicode)]
	private struct MonitorInfoEx
	{
		public int Size;

		public Rect Monitor;

		public Rect Work;

		public uint Flags;

		[MarshalAs(UnmanagedType.ByValTStr, SizeConst = 32)]
		public string Device;
	}

	[StructLayout(LayoutKind.Sequential, CharSet = CharSet.Unicode)]
	private struct DevMode
	{
		[MarshalAs(UnmanagedType.ByValTStr, SizeConst = 32)]
		public string DeviceName;

		public ushort SpecVersion;

		public ushort DriverVersion;

		public ushort Size;

		public ushort DriverExtra;

		public uint Fields;

		public int PositionX;

		public int PositionY;

		public uint DisplayOrientation;

		public uint DisplayFixedOutput;

		public short Color;

		public short Duplex;

		public short YResolution;

		public short TtOption;

		public short Collate;

		[MarshalAs(UnmanagedType.ByValTStr, SizeConst = 32)]
		public string FormName;

		public ushort LogPixels;

		public uint BitsPerPel;

		public uint PelsWidth;

		public uint PelsHeight;

		public uint DisplayFlags;

		public uint DisplayFrequency;

		public uint IcmMethod;

		public uint IcmIntent;

		public uint MediaType;

		public uint DitherType;

		public uint Reserved1;

		public uint Reserved2;

		public uint PanningWidth;

		public uint PanningHeight;
	}

	internal const int Minimum = 30;

	internal const int Maximum = 240;

	internal const int Fallback = 60;

	private const uint MonitorDefaultToNearest = 2u;

	private const uint MonitorDefaultToPrimary = 1u;

	private const int CurrentSettings = -1;

	[DllImport("user32.dll")]
	private static extern nint MonitorFromWindow(nint Window, uint Flags);

	[DllImport("user32.dll")]
	private static extern nint MonitorFromPoint(Point Position, uint Flags);

	[DllImport("user32.dll", CharSet = CharSet.Unicode)]
	[return: MarshalAs(UnmanagedType.Bool)]
	private static extern bool GetMonitorInfo(nint Monitor, ref MonitorInfoEx Info);

	[DllImport("user32.dll", CharSet = CharSet.Unicode)]
	[return: MarshalAs(UnmanagedType.Bool)]
	private static extern bool EnumDisplaySettings(string Device, int Mode, ref DevMode Settings);

	internal static int Normalize(int Frequency)
	{
		if (Frequency <= 1)
		{
			return 60;
		}
		bool flag;
		switch (Frequency)
		{
		case 59:
		case 119:
		case 143:
		case 164:
		case 239:
			flag = true;
			break;
		default:
			flag = false;
			break;
		}
		return Math.Clamp(flag ? (Frequency + 1) : Frequency, 30, 240);
	}

	internal static nint MonitorOf(nint Window)
	{
		if (Window != IntPtr.Zero)
		{
			return MonitorFromWindow(Window, 2u);
		}
		return IntPtr.Zero;
	}

	internal static int ForWindow(nint Window)
	{
		return ForMonitor(MonitorOf(Window));
	}

	internal static int ForPrimary()
	{
		return ForMonitor(MonitorFromPoint(default, 1u));
	}

	private static int ForMonitor(nint Monitor)
	{
		try
		{
			if (Monitor == IntPtr.Zero)
			{
				return 60;
			}
			MonitorInfoEx Info = new MonitorInfoEx
			{
				Size = Marshal.SizeOf<MonitorInfoEx>()
			};
			if (!GetMonitorInfo(Monitor, ref Info))
			{
				return 60;
			}
			DevMode Settings = new DevMode
			{
				Size = (ushort)Marshal.SizeOf<DevMode>()
			};
			if (!EnumDisplaySettings(Info.Device, -1, ref Settings))
			{
				return 60;
			}
			return Normalize((int)Settings.DisplayFrequency);
		}
		catch (Exception ex) when ((ex is DllNotFoundException || ex is EntryPointNotFoundException || ex is MarshalDirectiveException) ? true : false)
		{
			AppLog.Warning(ex, "The display refresh rate could not be read; assuming {Rate} Hz", 60);
			return 60;
		}
	}
}
