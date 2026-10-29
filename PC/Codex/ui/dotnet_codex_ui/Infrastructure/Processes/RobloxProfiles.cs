using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Diagnostics;
using System.IO;
using System.Linq;
using System.Text.Json;
using dotnet_codex_ui.Infrastructure.FileSystem;

namespace dotnet_codex_ui.Infrastructure.Processes;

internal static class RobloxProfiles
{
	public static string Folder => Path.Combine(UserProfilePathResolver.LocalAppData, "Roblox", "LocalStorage");

	internal static Func<IEnumerable<(int Pid, DateTime Started)>> ProcessIds { get; set; } = RunningProcessIds;

	internal static Func<string> FolderProvider { get; set; } = () => Folder;

	public static IReadOnlyList<RobloxSession> Scan()
	{
		string path = FolderProvider();
		List<RobloxSession> list = new List<RobloxSession>();
		foreach (var item3 in ProcessIds())
		{
			int item = item3.Item1;
			DateTime item2 = item3.Item2;
			string path2 = Path.Combine(path, $"memProfStorage{item}.json");
			if (File.Exists(path2) && !(File.GetLastWriteTime(path2) < item2.AddSeconds(-2.0)))
			{
				RobloxSession robloxSession = Read(item, path2);
				if (!robloxSession.Closing)
				{
					list.Add(robloxSession);
				}
			}
		}
		return list;
	}

	public static bool IsActive(int Pid)
	{
		return Scan().Any((RobloxSession S) => S.ProcessId == Pid && (S.Unreadable || S.UserId > 0));
	}

	internal static RobloxSession Read(int Pid, string Path)
	{
		try
		{
			using FileStream stream = new FileStream(Path, FileMode.Open, FileAccess.Read, FileShare.ReadWrite | FileShare.Delete);
			using StreamReader streamReader = new StreamReader(stream);
			return Parse(Pid, streamReader.ReadToEnd());
		}
		catch (IOException)
		{
			return new RobloxSession(Pid, 0L, 0L, Unreadable: true, Closing: false, 0L);
		}
		catch (UnauthorizedAccessException)
		{
			return new RobloxSession(Pid, 0L, 0L, Unreadable: true, Closing: false, 0L);
		}
	}

	internal static RobloxSession Parse(int Pid, string Text)
	{
		try
		{
			using JsonDocument jsonDocument = JsonDocument.Parse(Text.Trim('\0', ' ', '\r', '\n', '\t'));
			bool closing = jsonDocument.RootElement.ValueKind == JsonValueKind.Object && jsonDocument.RootElement.TryGetProperty("ShuttingDown", out var value) && value.GetString() == "1";
			return new RobloxSession(Pid, Number(jsonDocument.RootElement, "UserId"), Number(jsonDocument.RootElement, "LastPlaceId"), Unreadable: false, closing, Number(jsonDocument.RootElement, "UniverseId"));
		}
		catch (JsonException)
		{
			return new RobloxSession(Pid, 0L, 0L, Unreadable: true, Closing: false, 0L);
		}
	}

	private static long Number(JsonElement Root, string Name)
	{
		if (Root.ValueKind != JsonValueKind.Object || !Root.TryGetProperty(Name, out var value) || !long.TryParse(value.GetString(), out var result) || result <= 0)
		{
			return 0L;
		}
		return result;
	}

	private static IEnumerable<(int Pid, DateTime Started)> RunningProcessIds()
	{
		List<(int, DateTime)> list = new List<(int, DateTime)>();
		foreach (string executable in RobloxProcess.Executables)
		{
			Process[] processesByName = Process.GetProcessesByName(Path.GetFileNameWithoutExtension(executable));
			foreach (Process process in processesByName)
			{
				using (process)
				{
					try
					{
						if (!process.HasExited)
						{
							list.Add((process.Id, process.StartTime));
						}
					}
					catch (Exception ex) when ((ex is InvalidOperationException || ex is Win32Exception) ? true : false)
					{
					}
				}
			}
		}
		return list;
	}
}
