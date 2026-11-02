using System;
using System.CodeDom.Compiler;
using System.ComponentModel;
using System.Diagnostics;
using System.IO;
using System.IO.Pipes;
using System.Runtime.InteropServices;
using System.Security.Cryptography;
using System.Security.Cryptography.X509Certificates;
using System.Text.RegularExpressions;
using System.Text.RegularExpressions.Generated;
using Microsoft.Win32.SafeHandles;
using dotnet_codex_ui.Infrastructure.Logging;

namespace dotnet_codex_ui.Core.Lifecycle;

internal static class LaunchGate
{
	private struct ProcessBasicInformation
	{
		public nint ExitStatus;

		public nint PebBaseAddress;

		public nint AffinityMask;

		public nint BasePriority;

		public nint UniqueProcessId;

		public nint InheritedFromUniqueProcessId;
	}

	private struct WinTrustFileInfo
	{
		public uint Size;

		public nint FilePath;

		public nint File;

		public nint KnownSubject;
	}

	private struct WinTrustData
	{
		public uint Size;

		public nint PolicyCallbackData;

		public nint SipClientData;

		public uint UiChoice;

		public uint RevocationChecks;

		public uint UnionChoice;

		public nint FileInfo;

		public uint StateAction;

		public nint StateData;

		public nint UrlReference;

		public uint ProviderFlags;

		public uint UiContext;

		public nint SignatureSettings;
	}

	internal const string PipeArgument = "--bootstrapper-pipe";

	internal const string BootstrapperName = "Codex Bootstrapper.exe";

	internal static Func<bool> Probe = () => DebuggedByVisualStudio() || Verify(Environment.GetCommandLineArgs(), ExpectedBootstrapper());

	private static readonly string[] VisualStudioHosts = new string[3] { "devenv.exe", "VsDebugConsole.exe", "msvsmon.exe" };

	private static readonly Guid GenericVerifyV2 = new Guid("00AAC56B-CD44-11d0-8CC2-00C04FC295EE");

	[DllImport("ntdll.dll")]
	private static extern int NtQueryInformationProcess(nint Process, int InformationClass, out ProcessBasicInformation Information, int Length, out int ReturnLength);

	[DllImport("wintrust.dll")]
	private static extern int WinVerifyTrust(nint Window, ref Guid Action, ref WinTrustData Data);

	internal static bool DebuggedByVisualStudio()
	{
		if (!Debugger.IsAttached)
		{
			return false;
		}
		try
		{
			using Process process = Process.GetCurrentProcess();
			if (NtQueryInformationProcess(process.Handle, 0, out var Information, Marshal.SizeOf<ProcessBasicInformation>(), out var _) != 0)
			{
				return false;
			}
			using Process process2 = Process.GetProcessById((int)Information.InheritedFromUniqueProcessId);
			string text = ((!(process2.StartTime <= process.StartTime)) ? null : process2.MainModule?.FileName);
			bool flag = text != null && VisualStudioHosts.Contains(Path.GetFileName(text), StringComparer.OrdinalIgnoreCase) && IsMicrosoftSigned(text);
			if (!flag)
			{
				AppLog.Warning("A debugger is attached, but Codex was not started by Visual Studio ({Parent})", text ?? "unknown");
			}
			return flag;
		}
		catch (Exception ex) when ((ex is ArgumentException || ex is InvalidOperationException || ex is Win32Exception || ex is NotSupportedException) ? true : false)
		{
			AppLog.Warning("The debugger's host could not be identified ({Reason})", ex.GetType().Name);
			return false;
		}
	}

	internal static bool IsMicrosoftSigned(string Image)
	{
		nint num = Marshal.StringToCoTaskMemUni(Image);
		nint num2 = Marshal.AllocCoTaskMem(Marshal.SizeOf<WinTrustFileInfo>());
		try
		{
			Marshal.StructureToPtr(new WinTrustFileInfo
			{
				Size = (uint)Marshal.SizeOf<WinTrustFileInfo>(),
				FilePath = num
			}, num2, fDeleteOld: false);
			WinTrustData Data = new WinTrustData
			{
				Size = (uint)Marshal.SizeOf<WinTrustData>(),
				UiChoice = 2u,
				UnionChoice = 1u,
				FileInfo = num2,
				StateAction = 1u,
				ProviderFlags = 4096u
			};
			Guid Action = GenericVerifyV2;
			int num3 = WinVerifyTrust(new IntPtr(-1), ref Action, ref Data);
			Data.StateAction = 2u;
			WinVerifyTrust(new IntPtr(-1), ref Action, ref Data);
			if (num3 != 0)
			{
				return false;
			}
			using X509Certificate2 x509Certificate = new X509Certificate2(X509Certificate.CreateFromSignedFile(Image));
			return x509Certificate.Subject.Contains("O=Microsoft Corporation", StringComparison.Ordinal);
		}
		catch (CryptographicException)
		{
			return false;
		}
		finally
		{
			Marshal.FreeCoTaskMem(num2);
			Marshal.FreeCoTaskMem(num);
		}
	}

	[GeneratedCode("System.Text.RegularExpressions.Generator", "10.0.14.42308")]
	private static Regex PipeNamePattern()
	{
		return _003CRegexGenerator_g_003EF65865DE7B97CDDC52A42F7FDE7D76E652A8AEA0D8E88870867D5A1597FC0B3FE__PipeNamePattern_0.Instance;
	}

	[DllImport("kernel32.dll", SetLastError = true)]
	[return: MarshalAs(UnmanagedType.Bool)]
	private static extern bool GetNamedPipeServerProcessId(SafePipeHandle Pipe, out uint ServerProcessId);

	internal static string ExpectedBootstrapper()
	{
		return Path.GetFullPath(Path.Combine(AppContext.BaseDirectory, "..", "Codex Bootstrapper.exe"));
	}

	internal static bool IsAllowed()
	{
		try
		{
			bool flag = Probe();
			if (!flag)
			{
				AppLog.Warning("Startup refused: Codex was not launched by its bootstrapper");
			}
			return flag;
		}
		catch (Exception failure)
		{
			AppLog.Error(failure, null, "IsAllowed", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Core\\Lifecycle\\LaunchGate.cs");
			return false;
		}
	}

	internal static bool Verify(string[] Arguments, string Expected, int TimeoutMilliseconds = 5000)
	{
		int num = Array.IndexOf(Arguments, "--bootstrapper-pipe");
		if (num < 0 || num + 1 >= Arguments.Length || !PipeNamePattern().IsMatch(Arguments[num + 1]))
		{
			return false;
		}
		try
		{
			using NamedPipeClientStream namedPipeClientStream = new NamedPipeClientStream(".", Arguments[num + 1], PipeDirection.In);
			namedPipeClientStream.Connect(TimeoutMilliseconds);
			if (!GetNamedPipeServerProcessId(namedPipeClientStream.SafePipeHandle, out var ServerProcessId))
			{
				return false;
			}
			using Process process = Process.GetProcessById((int)ServerProcessId);
			string text = process.MainModule?.FileName;
			if (text == null || !string.Equals(Path.GetFullPath(text), Path.GetFullPath(Expected), StringComparison.OrdinalIgnoreCase))
			{
				return false;
			}
			return namedPipeClientStream.ReadByte() == 1;
		}
		catch (Exception ex) when ((ex is IOException || ex is TimeoutException || ex is UnauthorizedAccessException || ex is InvalidOperationException || ex is Win32Exception || ex is ArgumentException) ? true : false)
		{
			AppLog.Warning("The launch handshake failed ({Reason})", ex.GetType().Name);
			return false;
		}
	}
}
