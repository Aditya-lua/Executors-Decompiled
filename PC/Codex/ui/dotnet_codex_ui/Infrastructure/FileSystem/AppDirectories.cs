using System;
using System.Collections.Generic;
using System.IO;
using dotnet_codex_ui.Infrastructure.Logging;

namespace dotnet_codex_ui.Infrastructure.FileSystem;

internal static class AppDirectories
{
	public static readonly string[] Names = new string[4] { "bin", "workspace", "scripts", "autoexec" };

	internal static string Root { get; set; } = AppContext.BaseDirectory;

	public static string Bin => Resolve("bin");

	public static string Workspace => Resolve("workspace");

	public static string Scripts => Resolve("scripts");

	public static string AutoExec => Resolve("autoexec");

	public static string Resolve(string Name)
	{
		return Path.GetFullPath(Path.Combine(Root, Name));
	}

	public static IReadOnlyList<DirectoryResult> EnsureAll()
	{
		List<DirectoryResult> list = new List<DirectoryResult>();
		string[] names = Names;
		foreach (string name in names)
		{
			list.Add(Ensure(Root, name));
		}
		return list;
	}

	internal static DirectoryResult Ensure(string Root, string Name)
	{
		string text = Path.GetFullPath(Root).TrimEnd(Path.DirectorySeparatorChar) + Path.DirectorySeparatorChar;
		string fullPath = Path.GetFullPath(Path.Combine(text, Name));
		if (!fullPath.StartsWith(text, StringComparison.OrdinalIgnoreCase))
		{
			AppLog.Error("Directory {Name} was refused: {Path} is outside the app folder", Name, fullPath);
			return new DirectoryResult(Name, fullPath, DirectoryOutcome.Failed, "The path is outside the application folder.");
		}
		try
		{
			if (Directory.Exists(fullPath))
			{
				AppLog.Debug("Directory {Name} exists at {Path}", Name, fullPath);
				return new DirectoryResult(Name, fullPath, DirectoryOutcome.Existing, null);
			}
			Directory.CreateDirectory(fullPath);
			AppLog.Information("Directory {Name} created at {Path}", Name, fullPath);
			return new DirectoryResult(Name, fullPath, DirectoryOutcome.Created, null);
		}
		catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException || ex is NotSupportedException || ex is ArgumentException) ? true : false)
		{
			AppLog.Error(ex, "Create directory " + Name, "Ensure", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Infrastructure\\FileSystem\\AppDirectories.cs");
			return new DirectoryResult(Name, fullPath, DirectoryOutcome.Failed, ex.Message);
		}
	}
}
