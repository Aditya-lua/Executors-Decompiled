using System;
using System.Diagnostics;
using System.IO;
using System.Runtime.InteropServices;
using System.Security.Principal;
using Microsoft.Win32;

namespace dotnet_codex_bootstrapper.Infrastructure;

public static class InteractiveProfile
{
	private enum TOKEN_INFORMATION_CLASS
	{
		TokenUser = 1
	}

	private enum WTS_INFO_CLASS
	{
		WTSUserName = 5,
		WTSDomainName = 7
	}

	private static readonly Lazy<string> ProfileValue = new Lazy<string>(() => Resolve(), isThreadSafe: true);

	private const uint PROCESS_QUERY_LIMITED_INFORMATION = 4096u;

	private const uint TOKEN_QUERY = 8u;

	public static string Profile => ProfileValue.Value;

	public static string LocalAppData
	{
		get
		{
			string text = Path.Combine(Profile, "AppData", "Local");
			if (!Directory.Exists(text))
			{
				return Environment.GetFolderPath(Environment.SpecialFolder.LocalApplicationData);
			}
			return text;
		}
	}

	public static string Resolve(Func<string?>? ProcessSid = null, Func<string?>? InteractiveSid = null, Func<string, string?>? ProfileOfSid = null, string? Fallback = null, Func<string, bool>? DirectoryExists = null, Action<string>? Log = null)
	{
		if (ProcessSid == null)
		{
			ProcessSid = CurrentProcessSid;
		}
		if (InteractiveSid == null)
		{
			InteractiveSid = ActiveConsoleUserSid;
		}
		if (ProfileOfSid == null)
		{
			ProfileOfSid = ProfileFromRegistry;
		}
		if (Fallback == null)
		{
			Fallback = Environment.GetFolderPath(Environment.SpecialFolder.UserProfile);
		}
		if (DirectoryExists == null)
		{
			DirectoryExists = Directory.Exists;
		}
		if (Log == null)
		{
			Log = (string Message) =>
			{
				AppLog.Warning(Message);
			};
		}
		try
		{
			string text = ProcessSid();
			string text2 = InteractiveSid();
			if (string.IsNullOrEmpty(text) || string.IsNullOrEmpty(text2))
			{
				return Fallback;
			}
			if (string.Equals(text, text2, StringComparison.OrdinalIgnoreCase))
			{
				return Fallback;
			}
			string text3 = ProfileOfSid(text2);
			if (string.IsNullOrWhiteSpace(text3) || !DirectoryExists(text3))
			{
				Log($"The signed-in user ({text2}) has no usable profile folder ('{text3}'); using the current account's profile instead.");
				return Fallback;
			}
			return text3;
		}
		catch (Exception ex)
		{
			Log($"Resolving the signed-in user's profile failed ({ex.GetType().Name}: {ex.Message}); using the current account's profile instead.");
			return Fallback;
		}
	}

	private static string? CurrentProcessSid()
	{
		using WindowsIdentity windowsIdentity = WindowsIdentity.GetCurrent();
		return windowsIdentity.User?.Value;
	}

	private static string? ActiveConsoleUserSid()
	{
		uint num = WTSGetActiveConsoleSessionId();
		if (num == uint.MaxValue)
		{
			return null;
		}
		Process[] processesByName = Process.GetProcessesByName("explorer");
		foreach (Process process in processesByName)
		{
			using (process)
			{
				if (process.SessionId == num)
				{
					string text = SidOfProcess(process.Id);
					if (text != null)
					{
						return text;
					}
				}
			}
		}
		return SidOfSessionUserName((int)num);
	}

	private static string? SidOfProcess(int ProcessId)
	{
		nint num = OpenProcess(4096u, Inherit: false, ProcessId);
		if (num == IntPtr.Zero)
		{
			return null;
		}
		try
		{
			if (!OpenProcessToken(num, 8u, out var Token))
			{
				return null;
			}
			try
			{
				GetTokenInformation(Token, TOKEN_INFORMATION_CLASS.TokenUser, IntPtr.Zero, 0, out var ReturnLength);
				if (ReturnLength <= 0)
				{
					return null;
				}
				nint num2 = Marshal.AllocHGlobal(ReturnLength);
				try
				{
					if (!GetTokenInformation(Token, TOKEN_INFORMATION_CLASS.TokenUser, num2, ReturnLength, out var _))
					{
						return null;
					}
					return new SecurityIdentifier(Marshal.ReadIntPtr(num2)).Value;
				}
				finally
				{
					Marshal.FreeHGlobal(num2);
				}
			}
			finally
			{
				CloseHandle(Token);
			}
		}
		finally
		{
			CloseHandle(num);
		}
	}

	private static string? SidOfSessionUserName(int Session)
	{
		string text = QuerySessionString(Session, WTS_INFO_CLASS.WTSUserName);
		if (string.IsNullOrWhiteSpace(text))
		{
			return null;
		}
		string text2 = QuerySessionString(Session, WTS_INFO_CLASS.WTSDomainName);
		return ((string.IsNullOrWhiteSpace(text2) ? new NTAccount(text) : new NTAccount(text2, text)).Translate(typeof(SecurityIdentifier)) as SecurityIdentifier)?.Value;
	}

	private static string? QuerySessionString(int Session, WTS_INFO_CLASS Info)
	{
		if (!WTSQuerySessionInformation(IntPtr.Zero, Session, Info, out var Buffer, out var _))
		{
			return null;
		}
		try
		{
			return Marshal.PtrToStringUni(Buffer);
		}
		finally
		{
			WTSFreeMemory(Buffer);
		}
	}

	private static string? ProfileFromRegistry(string Sid)
	{
		using RegistryKey registryKey = Registry.LocalMachine.OpenSubKey("SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion\\ProfileList\\" + Sid);
		return (registryKey?.GetValue("ProfileImagePath") is string name) ? Environment.ExpandEnvironmentVariables(name) : null;
	}

	[DllImport("kernel32.dll")]
	private static extern uint WTSGetActiveConsoleSessionId();

	[DllImport("kernel32.dll", SetLastError = true)]
	private static extern nint OpenProcess(uint Access, bool Inherit, int ProcessId);

	[DllImport("kernel32.dll", SetLastError = true)]
	[return: MarshalAs(UnmanagedType.Bool)]
	private static extern bool CloseHandle(nint Handle);

	[DllImport("advapi32.dll", SetLastError = true)]
	[return: MarshalAs(UnmanagedType.Bool)]
	private static extern bool OpenProcessToken(nint Process, uint Access, out nint Token);

	[DllImport("advapi32.dll", SetLastError = true)]
	[return: MarshalAs(UnmanagedType.Bool)]
	private static extern bool GetTokenInformation(nint Token, TOKEN_INFORMATION_CLASS Class, nint Info, int Length, out int ReturnLength);

	[DllImport("wtsapi32.dll", EntryPoint = "WTSQuerySessionInformationW", SetLastError = true)]
	[return: MarshalAs(UnmanagedType.Bool)]
	private static extern bool WTSQuerySessionInformation(nint Server, int Session, WTS_INFO_CLASS Class, out nint Buffer, out int Bytes);

	[DllImport("wtsapi32.dll")]
	private static extern void WTSFreeMemory(nint Memory);
}
