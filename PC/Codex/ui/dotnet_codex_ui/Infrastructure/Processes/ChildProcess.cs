using System;
using System.Diagnostics;
using System.Runtime.InteropServices;

namespace dotnet_codex_ui.Infrastructure.Processes;

internal static class ChildProcess
{
	private struct JOBOBJECT_BASIC_LIMIT_INFORMATION
	{
		internal long PerProcessUserTimeLimit;

		internal long PerJobUserTimeLimit;

		internal uint LimitFlags;

		internal nuint MinimumWorkingSetSize;

		internal nuint MaximumWorkingSetSize;

		internal uint ActiveProcessLimit;

		internal long Affinity;

		internal uint PriorityClass;

		internal uint SchedulingClass;
	}

	private struct IO_COUNTERS
	{
		internal ulong ReadOperationCount;

		internal ulong WriteOperationCount;

		internal ulong OtherOperationCount;

		internal ulong ReadTransferCount;

		internal ulong WriteTransferCount;

		internal ulong OtherTransferCount;
	}

	private struct JOBOBJECT_EXTENDED_LIMIT_INFORMATION
	{
		internal JOBOBJECT_BASIC_LIMIT_INFORMATION BasicLimitInformation;

		internal IO_COUNTERS IoInfo;

		internal nuint ProcessMemoryLimit;

		internal nuint JobMemoryLimit;

		internal nuint PeakProcessMemoryUsed;

		internal nuint PeakJobMemoryUsed;
	}

	private static readonly nint JobHandle;

	private const int JobObjectExtendedLimitInformation = 9;

	private const uint JOB_OBJECT_LIMIT_KILL_ON_JOB_CLOSE = 8192u;

	static ChildProcess()
	{
		JobHandle = CreateJobWithKillOnClose();
	}

	internal static void Attach(Process Process)
	{
		if (Process == null || Process.HasExited)
		{
			throw new ArgumentException("Process is null or has already exited.");
		}
		if (!AssignProcessToJobObject(JobHandle, Process.Handle))
		{
			throw new InvalidOperationException("Failed to assign process to job object.");
		}
	}

	[DllImport("kernel32.dll", CharSet = CharSet.Unicode)]
	private static extern nint CreateJobObject(nint LpJobAttributes, string? LpName);

	[DllImport("kernel32.dll")]
	private static extern bool SetInformationJobObject(nint HJob, int JobObjectInfoClass, nint LpJobObjectInfo, uint CbJobObjectInfoLength);

	[DllImport("kernel32.dll")]
	private static extern bool AssignProcessToJobObject(nint Job, nint ProcessValue);

	private static nint CreateJobWithKillOnClose()
	{
		nint num = CreateJobObject(IntPtr.Zero, null);
		JOBOBJECT_EXTENDED_LIMIT_INFORMATION structure = new JOBOBJECT_EXTENDED_LIMIT_INFORMATION
		{
			BasicLimitInformation = 
			{
				LimitFlags = 8192u
			}
		};
		int num2 = Marshal.SizeOf<JOBOBJECT_EXTENDED_LIMIT_INFORMATION>();
		nint num3 = Marshal.AllocHGlobal(num2);
		Marshal.StructureToPtr(structure, num3, fDeleteOld: false);
		if (!SetInformationJobObject(num, 9, num3, (uint)num2))
		{
			Marshal.FreeHGlobal(num3);
			throw new InvalidOperationException("Failed to set job object information.");
		}
		Marshal.FreeHGlobal(num3);
		return num;
	}
}
