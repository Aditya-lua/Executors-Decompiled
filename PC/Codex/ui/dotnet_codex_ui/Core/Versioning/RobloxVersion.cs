using System;
using System.Diagnostics;
using System.IO;
using System.Linq;
using dotnet_codex_ui.Infrastructure.FileSystem;

namespace dotnet_codex_ui.Core.Versioning;

public static class RobloxVersion
{
	public static string DefaultRoot => Path.Combine(UserProfilePathResolver.LocalAppData, "Roblox", "Versions");

	public static string? Detect(string? Root = null)
	{
		try
		{
			string path = Root ?? DefaultRoot;
			if (!Directory.Exists(path))
			{
				return null;
			}
			foreach (DirectoryInfo item in from Directory in new DirectoryInfo(path).GetDirectories()
				orderby Directory.LastWriteTimeUtc descending
				select Directory)
			{
				string text = Path.Combine(item.FullName, "RobloxPlayerBeta.exe");
				if (File.Exists(text))
				{
					FileVersionInfo versionInfo = FileVersionInfo.GetVersionInfo(text);
					string text2 = versionInfo.ProductVersion ?? versionInfo.FileVersion;
					if (!string.IsNullOrWhiteSpace(text2))
					{
						return text2.Replace(", ", ".").Replace(",", ".").Trim();
					}
				}
			}
		}
		catch (Exception)
		{
		}
		return null;
	}
}
