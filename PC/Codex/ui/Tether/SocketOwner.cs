using System;
using System.Buffers.Binary;
using System.Diagnostics;
using System.Net;
using System.Runtime.InteropServices;
using System.Text;

namespace Tether;

internal static class SocketOwner
{
	private const int AF_INET = 2;

	private const int TCP_TABLE_OWNER_PID_ALL = 5;

	private const uint NO_ERROR = 0u;

	private const uint ERROR_INSUFFICIENT_BUFFER = 122u;

	private const int RowSize = 24;

	private const uint PROCESS_QUERY_LIMITED_INFORMATION = 4096u;

	[DllImport("iphlpapi.dll", SetLastError = true)]
	private static extern uint GetExtendedTcpTable(nint Table, ref int Size, bool Order, int AddressFamily, int TableClass, uint Reserved);

	[DllImport("kernel32.dll", SetLastError = true)]
	private static extern nint OpenProcess(uint Access, bool InheritHandle, int ProcessId);

	[DllImport("kernel32.dll", CharSet = CharSet.Unicode, EntryPoint = "QueryFullProcessImageNameW", SetLastError = true)]
	private static extern bool QueryFullProcessImageName(nint Process, int Flags, StringBuilder Name, ref int Size);

	[DllImport("kernel32.dll")]
	private static extern bool CloseHandle(nint Handle);

	public static bool TryGetOwnerProcessId(IPEndPoint Client, IPEndPoint Server, out int ProcessId)
	{
		ProcessId = 0;
		if (!OperatingSystem.IsWindows())
		{
			return false;
		}
		uint num = ToRawAddress(Client.Address);
		uint num2 = ToRawAddress(Server.Address);
		int Size = 0;
		GetExtendedTcpTable(IntPtr.Zero, ref Size, Order: false, 2, 5, 0u);
		for (int i = 0; i < 4; i++)
		{
			Size += 384;
			nint num3 = Marshal.AllocHGlobal(Size);
			try
			{
				switch (GetExtendedTcpTable(num3, ref Size, Order: false, 2, 5, 0u))
				{
				case 122u:
					break;
				default:
					return false;
				case 0u:
				{
					int num4 = Marshal.ReadInt32(num3);
					nint num5 = num3 + 4;
					int num6 = 0;
					while (num6 < num4)
					{
						uint num7 = (uint)Marshal.ReadInt32(num5, 4);
						int num8 = DecodePort(Marshal.ReadInt32(num5, 8));
						uint num9 = (uint)Marshal.ReadInt32(num5, 12);
						int num10 = DecodePort(Marshal.ReadInt32(num5, 16));
						if (num8 == Client.Port && num10 == Server.Port && num7 == num && num9 == num2)
						{
							ProcessId = Marshal.ReadInt32(num5, 20);
							return ProcessId > 0;
						}
						num6++;
						num5 += 24;
					}
					return false;
				}
				}
			}
			finally
			{
				Marshal.FreeHGlobal(num3);
			}
		}
		return false;
	}

	public static string? TryGetExecutablePath(int ProcessId)
	{
		if (OperatingSystem.IsWindows())
		{
			nint num = OpenProcess(4096u, InheritHandle: false, ProcessId);
			if (num == IntPtr.Zero)
			{
				return null;
			}
			try
			{
				StringBuilder stringBuilder = new StringBuilder(1024);
				int Size = stringBuilder.Capacity;
				return QueryFullProcessImageName(num, 0, stringBuilder, ref Size) ? stringBuilder.ToString(0, Size) : null;
			}
			finally
			{
				CloseHandle(num);
			}
		}
		try
		{
			using Process process = Process.GetProcessById(ProcessId);
			return process.MainModule?.FileName;
		}
		catch
		{
			return null;
		}
	}

	private static int DecodePort(int Raw)
	{
		return ((Raw & 0xFF) << 8) | ((Raw >> 8) & 0xFF);
	}

	private static uint ToRawAddress(IPAddress Address)
	{
		if (Address.IsIPv4MappedToIPv6)
		{
			Address = Address.MapToIPv4();
		}
		Span<byte> span = stackalloc byte[4];
		if (!Address.TryWriteBytes(span, out var bytesWritten) || bytesWritten != 4)
		{
			return 0u;
		}
		return BinaryPrimitives.ReadUInt32LittleEndian(span);
	}
}
