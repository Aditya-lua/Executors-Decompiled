using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using dotnet_codex_ui.Configuration;
using dotnet_codex_ui.Features.Connections;
using dotnet_codex_ui.Infrastructure.FileSystem;
using dotnet_codex_ui.Infrastructure.Logging;
using dotnet_codex_ui.Infrastructure.Processes;

namespace dotnet_codex_ui.Core.Integrity;

internal static class StartupValidator
{
	private const string CefNativeFolder = "runtimes\\win-x64\\native";

	internal static readonly string[] CefFiles = new string[7] { "libcef.dll", "chrome_elf.dll", "icudtl.dat", "resources.pak", "v8_context_snapshot.bin", "CefSharp.dll", "CefSharp.BrowserSubprocess.exe" };

	internal static readonly string[] AppFiles = new string[3] { "CefSharp.Wpf.dll", "Newtonsoft.Json.dll", "D2Phap.FileWatcherEx.dll" };

	internal static Func<string?> ConfigurationProblem = () =>
	{
		_ = RegistryConfiguration.Accent;
		return TetherSettings.Load().Validate();
	};

	public static StartupReport Run(string? AppRoot = null, IReadOnlyList<DirectoryResult>? Directories = null)
	{
		string text = AppRoot ?? AppContext.BaseDirectory;
		List<CheckResult> list = new List<CheckResult>();
		using LogOperation logOperation = AppLog.Begin("StartupValidation");
		list.Add(new CheckResult(".NET runtime 10 or newer", CheckSeverity.Required, Environment.Version.Major >= 10, $"running {Environment.Version}"));
		list.Add(new CheckResult("64-bit process", CheckSeverity.Required, Environment.Is64BitProcess, Environment.Is64BitProcess ? "x64" : "this process is not 64-bit"));
		string[] appFiles = AppFiles;
		foreach (string name in appFiles)
		{
			list.Add(CheckFile(name, CheckSeverity.Required, Locate(text, name, Native: false)));
		}
		appFiles = CefFiles;
		foreach (string name2 in appFiles)
		{
			list.Add(CheckFile(name2, CheckSeverity.Required, Locate(text, name2, Native: true)));
		}
		list.Add(CheckArchitecture(Locate(text, "libcef.dll", Native: true)));
		string path = Path.Combine(text, "bin", "language-server");
		appFiles = LanguageServer.Directories;
		foreach (string text2 in appFiles)
		{
			string path2 = Path.Combine(path, text2);
			list.Add(new CheckResult("language-server/" + text2, CheckSeverity.Required, Directory.Exists(path2), Directory.Exists(path2) ? "found" : "folder is missing"));
		}
		appFiles = LanguageServer.Files;
		foreach (string text3 in appFiles)
		{
			list.Add(CheckFile("language-server/" + text3, CheckSeverity.Required, Path.Combine(path, text3)));
		}
		list.Add(CheckFile("language-server/assets/bin/darklua.exe (formatting)", CheckSeverity.Optional, Path.Combine(path, "assets", "bin", "darklua.exe")));
		list.Add(new CheckResult("auth.json (sign-in is off)", CheckSeverity.Optional, File.Exists(Path.Combine(text, "auth.json")), File.Exists(Path.Combine(text, "auth.json")) ? "found" : "not present"));
		foreach (DirectoryResult item in Directories ?? Array.Empty<DirectoryResult>())
		{
			list.Add(new CheckResult("folder " + item.Name, CheckSeverity.Required, item.Outcome != DirectoryOutcome.Failed, (item.Outcome == DirectoryOutcome.Failed) ? (item.Error ?? "could not be created") : item.Outcome.ToString().ToLowerInvariant()));
		}
		list.Add(CheckWritable("logs folder writable", Path.Combine(text, "logs"), CheckSeverity.Optional));
		list.Add(CheckWritable("cef folder writable", Path.Combine(text, "cef"), CheckSeverity.Required));
		list.Add(CheckConfiguration());
		StartupReport startupReport = new StartupReport(list);
		foreach (CheckResult blockingFailure in startupReport.BlockingFailures)
		{
			AppLog.Error("Startup check failed (required): {Check}: {Detail}", blockingFailure.Name, blockingFailure.Detail);
		}
		foreach (CheckResult optionalFailure in startupReport.OptionalFailures)
		{
			AppLog.Warning("Startup check failed (optional, continuing): {Check}: {Detail}", optionalFailure.Name, optionalFailure.Detail);
		}
		logOperation.Complete(startupReport.CanStart ? $"passed, {startupReport.OptionalFailures.Count()} optional warnings" : $"{startupReport.BlockingFailures.Count()} required failures");
		return startupReport;
	}

	private static string Locate(string Root, string Name, bool Native)
	{
		string text = Path.Combine(Root, Name);
		if (File.Exists(text) || !Native)
		{
			return text;
		}
		string text2 = Path.Combine(Root, "runtimes\\win-x64\\native", Name);
		if (!File.Exists(text2))
		{
			return text;
		}
		return text2;
	}

	private static CheckResult CheckFile(string Name, CheckSeverity Severity, string Path0)
	{
		try
		{
			if (!File.Exists(Path0))
			{
				return new CheckResult(Name, Severity, Passed: false, "file is missing");
			}
			using FileStream fileStream = new FileStream(Path0, FileMode.Open, FileAccess.Read, FileShare.ReadWrite);
			if (fileStream.Length == 0L)
			{
				return new CheckResult(Name, Severity, Passed: false, "file is empty");
			}
			string text = Path.GetExtension(Path0).ToLowerInvariant();
			if ((text == ".exe" || text == ".dll") ? true : false)
			{
				Span<byte> buffer = stackalloc byte[2];
				if (fileStream.Read(buffer) != 2 || buffer[0] != 77 || buffer[1] != 90)
				{
					return new CheckResult(Name, Severity, Passed: false, "not a valid Windows program file (bad header)");
				}
			}
			return new CheckResult(Name, Severity, Passed: true, "");
		}
		catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException) ? true : false)
		{
			return new CheckResult(Name, Severity, Passed: false, "cannot be read: " + ex.Message);
		}
	}

	private static CheckResult CheckArchitecture(string Path0)
	{
		try
		{
			using FileStream fileStream = new FileStream(Path0, FileMode.Open, FileAccess.Read, FileShare.ReadWrite);
			using BinaryReader binaryReader = new BinaryReader(fileStream);
			fileStream.Position = 60L;
			int num = binaryReader.ReadInt32();
			fileStream.Position = num;
			if (binaryReader.ReadUInt32() != 17744)
			{
				return new CheckResult("Chromium runtime is x64", CheckSeverity.Required, Passed: false, "libcef.dll has no valid PE header");
			}
			ushort num2 = binaryReader.ReadUInt16();
			return new CheckResult("Chromium runtime is x64", CheckSeverity.Required, num2 == 34404, (num2 == 34404) ? "" : $"libcef.dll is built for machine type 0x{num2:X4}, not x64");
		}
		catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException) ? true : false)
		{
			return new CheckResult("Chromium runtime is x64", CheckSeverity.Required, Passed: false, "libcef.dll cannot be inspected: " + ex.Message);
		}
	}

	private static CheckResult CheckWritable(string Name, string Folder, CheckSeverity Severity)
	{
		string path = Path.Combine(Folder, $".write-test-{Guid.NewGuid():N}");
		try
		{
			Directory.CreateDirectory(Folder);
			File.WriteAllText(path, "x");
			File.Delete(path);
			return new CheckResult(Name, Severity, Passed: true, "");
		}
		catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException) ? true : false)
		{
			return new CheckResult(Name, Severity, Passed: false, ex.Message);
		}
	}

	private static CheckResult CheckConfiguration()
	{
		try
		{
			string text = ConfigurationProblem();
			return new CheckResult("stored settings are valid", CheckSeverity.Optional, text == null, text ?? "");
		}
		catch (Exception ex)
		{
			return new CheckResult("stored settings are valid", CheckSeverity.Optional, Passed: false, ex.Message);
		}
	}
}
