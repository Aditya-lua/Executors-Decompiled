using System;
using System.IO;

namespace dotnet_codex_bootstrapper.Core.Manifest;

public static class SafePath
{
	public static readonly string[] ProtectedNames = new string[6] { "cef", "logs", "scripts", "workspace", "autoexec", "auth.json" };

	private static readonly string[] ReservedDevices = new string[22]
	{
		"CON", "PRN", "AUX", "NUL", "COM1", "COM2", "COM3", "COM4", "COM5", "COM6",
		"COM7", "COM8", "COM9", "LPT1", "LPT2", "LPT3", "LPT4", "LPT5", "LPT6", "LPT7",
		"LPT8", "LPT9"
	};

	public static bool IsSafeRelative(string? Path)
	{
		if (string.IsNullOrWhiteSpace(Path) || Path.Length > 240 || Path.StartsWith('/') || Path.EndsWith('/'))
		{
			return false;
		}
		string[] array = Path.Split('/');
		for (int i = 0; i < array.Length; i++)
		{
			if (!IsSafeSegment(array[i]))
			{
				return false;
			}
		}
		return true;
	}

	public static bool IsProtected(string Path)
	{
		return ProtectedNames.Contains(Path.Split('/')[0], StringComparer.OrdinalIgnoreCase);
	}

	public static string Resolve(string Root, string RelativePath)
	{
		if (!IsSafeRelative(RelativePath))
		{
			throw new ManifestException("path", "'" + RelativePath + "' is not a safe relative path.");
		}
		string text = Path.GetFullPath(Root).TrimEnd(Path.DirectorySeparatorChar) + Path.DirectorySeparatorChar;
		string fullPath = Path.GetFullPath(Path.Combine(text, RelativePath.Replace('/', Path.DirectorySeparatorChar)));
		if (!fullPath.StartsWith(text, StringComparison.OrdinalIgnoreCase))
		{
			throw new ManifestException("path", "'" + RelativePath + "' escapes the install folder.");
		}
		return fullPath;
	}

	private static bool IsSafeSegment(string Segment)
	{
		bool flag = Segment.Length == 0;
		if (!flag)
		{
			bool flag2 = ((Segment == "." || Segment == "..") ? true : false);
			flag = flag2;
		}
		if (flag || Segment.EndsWith('.') || Segment.EndsWith(' ') || Segment.StartsWith(' '))
		{
			return false;
		}
		if (Segment.IndexOfAny(Path.GetInvalidFileNameChars()) >= 0 || Segment.Contains('\\') || Segment.Contains(':'))
		{
			return false;
		}
		string value = Segment.Split('.')[0].ToUpperInvariant();
		return !ReservedDevices.Contains(value);
	}
}
