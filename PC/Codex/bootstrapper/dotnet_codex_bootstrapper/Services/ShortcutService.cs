using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.IO;
using System.Runtime.InteropServices;
using System.Text;
using System.Threading;
using dotnet_codex_bootstrapper.Core.Configuration;
using dotnet_codex_bootstrapper.Core.Manifest;
using dotnet_codex_bootstrapper.Infrastructure;

namespace dotnet_codex_bootstrapper.Services;

public sealed class ShortcutService(ShortcutLocations Locations)
{
	private sealed record Wanted(string Target, string WorkingDirectory, string Icon);

	[ComImport]
	[Guid("00021401-0000-0000-C000-000000000046")]
	private class ShellLink
	{
	}

	[ComImport]
	[InterfaceType(ComInterfaceType.InterfaceIsIUnknown)]
	[Guid("000214F9-0000-0000-C000-000000000046")]
	private interface IShellLinkW
	{
		void GetPath([Out][MarshalAs(UnmanagedType.LPWStr)] StringBuilder File, int MaxPath, nint FindData, uint Flags);

		void GetIDList(out nint IdList);

		void SetIDList(nint IdList);

		void GetDescription([Out][MarshalAs(UnmanagedType.LPWStr)] StringBuilder Name, int MaxName);

		void SetDescription([MarshalAs(UnmanagedType.LPWStr)] string Name);

		void GetWorkingDirectory([Out][MarshalAs(UnmanagedType.LPWStr)] StringBuilder Directory, int MaxPath);

		void SetWorkingDirectory([MarshalAs(UnmanagedType.LPWStr)] string Directory);

		void GetArguments([Out][MarshalAs(UnmanagedType.LPWStr)] StringBuilder Arguments, int MaxPath);

		void SetArguments([MarshalAs(UnmanagedType.LPWStr)] string Arguments);

		void GetHotkey(out short Hotkey);

		void SetHotkey(short Hotkey);

		void GetShowCmd(out int ShowCmd);

		void SetShowCmd(int ShowCmd);

		void GetIconLocation([Out][MarshalAs(UnmanagedType.LPWStr)] StringBuilder IconPath, int MaxPath, out int Index);

		void SetIconLocation([MarshalAs(UnmanagedType.LPWStr)] string IconPath, int Index);

		void SetRelativePath([MarshalAs(UnmanagedType.LPWStr)] string RelativePath, uint Reserved);

		void Resolve(nint Window, uint Flags);

		void SetPath([MarshalAs(UnmanagedType.LPWStr)] string File);
	}

	[ComImport]
	[InterfaceType(ComInterfaceType.InterfaceIsIUnknown)]
	[Guid("0000010B-0000-0000-C000-000000000046")]
	private interface IPersistFile
	{
		void GetClassID(out Guid ClassId);

		[PreserveSig]
		int IsDirty();

		void Load([MarshalAs(UnmanagedType.LPWStr)] string FileName, uint Mode);

		void Save([MarshalAs(UnmanagedType.LPWStr)] string FileName, [MarshalAs(UnmanagedType.Bool)] bool Remember);

		void SaveCompleted([MarshalAs(UnmanagedType.LPWStr)] string FileName);

		void GetCurFile([MarshalAs(UnmanagedType.LPWStr)] out string FileName);
	}

	public const string ShortcutName = "Codex.lnk";

	private const string Description = "Codex";

	public IReadOnlyList<ShortcutResult> Ensure(BootstrapperPaths Paths, string ExecutableRelative, InstallState? State)
	{
		try
		{
			if (!OperatingSystem.IsWindows())
			{
				return Array.Empty<ShortcutResult>();
			}
			Wanted Want = ConfirmInstalled(Paths, ExecutableRelative, State);
			if ((object)Want == null)
			{
				return new _003C_003Ez__ReadOnlySingleElementList<ShortcutResult>(new ShortcutResult("all", ShortcutOutcome.Skipped, "Codex is not confirmed installed"));
			}
			List<ShortcutResult> Results = new List<ShortcutResult>();
			Thread thread = new Thread(() =>
			{
				Results.Add(EnsureOne("Desktop", Locations.Desktop, CreateFolder: false, Want));
				Results.Add(EnsureOne("Start Menu", Locations.StartMenu, CreateFolder: true, Want));
			});
			thread.IsBackground = true;
			thread.Name = "Shortcuts";
			thread.SetApartmentState(ApartmentState.STA);
			thread.Start();
			if (!thread.Join(TimeSpan.FromSeconds(15L)))
			{
				AppLog.Warning("Creating the shortcuts timed out");
				return new _003C_003Ez__ReadOnlySingleElementList<ShortcutResult>(new ShortcutResult("all", ShortcutOutcome.Failed, "Timed out"));
			}
			return Results;
		}
		catch (Exception ex)
		{
			AppLog.Error(ex, "Creating the shortcuts failed unexpectedly");
			return new _003C_003Ez__ReadOnlySingleElementList<ShortcutResult>(new ShortcutResult("all", ShortcutOutcome.Failed, ex.Message));
		}
	}

	private static Wanted? ConfirmInstalled(BootstrapperPaths Paths, string ExecutableRelative, InstallState? State)
	{
		try
		{
			if ((object)State == null || string.IsNullOrWhiteSpace(State.AppVersion) || !string.Equals(State.Executable, ExecutableRelative, StringComparison.OrdinalIgnoreCase))
			{
				AppLog.Information("Shortcuts skipped: there is no install record");
				return null;
			}
			string text = SafePath.Resolve(Paths.AppDirectory, ExecutableRelative);
			if (!File.Exists(text) || new FileInfo(text).Length == 0L)
			{
				AppLog.Warning("Shortcuts skipped: {Path} is missing or empty", text);
				return null;
			}
			string fullPath = Path.GetFullPath(Paths.InstalledBootstrapper);
			if (!File.Exists(fullPath))
			{
				AppLog.Warning("Shortcuts skipped: the installed bootstrapper {Path} is missing", fullPath);
				return null;
			}
			return new Wanted(fullPath, Path.GetFullPath(Paths.Root), text);
		}
		catch (Exception error)
		{
			AppLog.Warning(error, "Shortcuts skipped: the installation could not be confirmed");
			return null;
		}
	}

	private static ShortcutResult EnsureOne(string Label, string? Folder, bool CreateFolder, Wanted Want)
	{
		string text = null;
		try
		{
			if (string.IsNullOrWhiteSpace(Folder))
			{
				return new ShortcutResult(Label, ShortcutOutcome.Skipped, "Folder unknown");
			}
			if (!Directory.Exists(Folder))
			{
				if (!CreateFolder)
				{
					return new ShortcutResult(Label, ShortcutOutcome.Skipped, "Folder does not exist");
				}
				Directory.CreateDirectory(Folder);
			}
			string text2 = Path.Combine(Folder, "Codex.lnk");
			bool flag = File.Exists(text2);
			if (flag && IsCorrect(text2, Want))
			{
				return new ShortcutResult(Label, ShortcutOutcome.Unchanged);
			}
			text = Path.Combine(Folder, ".codex-" + Guid.NewGuid().ToString("N").Substring(0, 8) + ".tmp.lnk");
			Write(text, Want);
			if (!IsCorrect(text, Want))
			{
				throw new IOException("The written shortcut did not read back correctly.");
			}
			if (flag)
			{
				File.SetAttributes(text2, FileAttributes.Normal);
			}
			File.Move(text, text2, overwrite: true);
			text = null;
			AppLog.Information("{Label} shortcut {Action}: {Path}", Label, flag ? "repaired" : "created", text2);
			return new ShortcutResult(Label, flag ? ShortcutOutcome.Repaired : ShortcutOutcome.Created);
		}
		catch (Exception ex) when ((ex is UnauthorizedAccessException || ex is IOException || ex is COMException || ex is Win32Exception || ex is InvalidCastException || ex is NotSupportedException) ? true : false)
		{
			AppLog.Warning(ex, "The {Label} shortcut could not be written", Label);
			return new ShortcutResult(Label, ShortcutOutcome.Failed, ex.Message);
		}
		catch (Exception ex2)
		{
			AppLog.Error(ex2, "The {Label} shortcut failed unexpectedly", Label);
			return new ShortcutResult(Label, ShortcutOutcome.Failed, ex2.Message);
		}
		finally
		{
			if (text != null)
			{
				try
				{
					File.Delete(text);
				}
				catch (Exception)
				{
				}
			}
		}
	}

	private static bool IsCorrect(string Link, Wanted Want)
	{
		IShellLinkW shellLinkW = null;
		try
		{
			shellLinkW = (IShellLinkW)new ShellLink();
			((IPersistFile)shellLinkW).Load(Link, 0u);
			StringBuilder stringBuilder = new StringBuilder(1024);
			shellLinkW.GetPath(stringBuilder, stringBuilder.Capacity, IntPtr.Zero, 0u);
			StringBuilder stringBuilder2 = new StringBuilder(1024);
			shellLinkW.GetWorkingDirectory(stringBuilder2, stringBuilder2.Capacity);
			StringBuilder stringBuilder3 = new StringBuilder(1024);
			shellLinkW.GetArguments(stringBuilder3, stringBuilder3.Capacity);
			StringBuilder stringBuilder4 = new StringBuilder(1024);
			shellLinkW.GetIconLocation(stringBuilder4, stringBuilder4.Capacity, out var Index);
			return Same(stringBuilder.ToString(), Want.Target) && Same(stringBuilder2.ToString(), Want.WorkingDirectory) && stringBuilder3.Length == 0 && Same(stringBuilder4.ToString(), Want.Icon) && Index == 0;
		}
		catch (Exception ex) when ((ex is COMException || ex is IOException || ex is InvalidCastException) ? true : false)
		{
			AppLog.Warning(ex, "The existing shortcut {Path} is unreadable and will be rewritten", Link);
			return false;
		}
		finally
		{
			if (shellLinkW != null)
			{
				Marshal.ReleaseComObject(shellLinkW);
			}
		}
	}

	private static bool Same(string Left, string Right)
	{
		return string.Equals(Left.TrimEnd('\\'), Right.TrimEnd('\\'), StringComparison.OrdinalIgnoreCase);
	}

	private static void Write(string Link, Wanted Want)
	{
		IShellLinkW shellLinkW = (IShellLinkW)new ShellLink();
		try
		{
			shellLinkW.SetPath(Want.Target);
			shellLinkW.SetWorkingDirectory(Want.WorkingDirectory);
			shellLinkW.SetArguments(string.Empty);
			shellLinkW.SetDescription("Codex");
			shellLinkW.SetIconLocation(Want.Icon, 0);
			((IPersistFile)shellLinkW).Save(Link, Remember: true);
		}
		finally
		{
			Marshal.ReleaseComObject(shellLinkW);
		}
	}
}
