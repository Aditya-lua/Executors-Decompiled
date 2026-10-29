using System;
using System.Runtime.InteropServices;

namespace dotnet_codex_ui.Infrastructure.Windows;

internal static class HardwareInfo
{
	[StructLayout(LayoutKind.Sequential, CharSet = CharSet.Auto)]
	private struct MemoryStatusEx
	{
		public uint Length;

		public uint MemoryLoad;

		public ulong TotalPhys;

		public ulong AvailPhys;

		public ulong TotalPageFile;

		public ulong AvailPageFile;

		public ulong TotalVirtual;

		public ulong AvailVirtual;

		public ulong AvailExtendedVirtual;
	}

	internal static int? OverrideMb { get; set; }

	public static int InstalledMemoryMb
	{
		get
		{
			int? overrideMb = OverrideMb;
			if (overrideMb.HasValue)
			{
				return overrideMb.GetValueOrDefault();
			}
			MemoryStatusEx Buffer = new MemoryStatusEx
			{
				Length = (uint)Marshal.SizeOf<MemoryStatusEx>()
			};
			if (!GlobalMemoryStatusEx(ref Buffer))
			{
				return 0;
			}
			return (int)Math.Min(2147483647uL, Buffer.TotalPhys / 1048576);
		}
	}

	[DllImport("kernel32.dll", SetLastError = true)]
	[return: MarshalAs(UnmanagedType.Bool)]
	private static extern bool GlobalMemoryStatusEx(ref MemoryStatusEx Buffer);
}
