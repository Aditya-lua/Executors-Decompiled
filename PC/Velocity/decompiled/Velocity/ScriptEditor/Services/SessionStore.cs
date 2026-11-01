using System;
using System.Collections.Generic;
using System.IO;
using System.Text.Json;

namespace ScriptEditor.Services;

public static class SessionStore
{
	public sealed class TabState
	{
		public string? FilePath { get; set; }

		public string Content { get; set; } = string.Empty;

		public bool IsDirty { get; set; }

		public bool IsActive { get; set; }
	}

	private static string SessionPath => Path.Combine(Environment.GetFolderPath(Environment.SpecialFolder.LocalApplicationData), "Velocity", "session.json");

	public static void Save(IReadOnlyList<TabState> tabs)
	{
		try
		{
			string directoryName = Path.GetDirectoryName(SessionPath);
			if (directoryName != null)
			{
				Directory.CreateDirectory(directoryName);
			}
			File.WriteAllText(SessionPath, JsonSerializer.Serialize(tabs, new JsonSerializerOptions
			{
				WriteIndented = true
			}));
		}
		catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException) ? true : false)
		{
		}
	}

	public static List<TabState> Load()
	{
		try
		{
			if (!File.Exists(SessionPath))
			{
				return new List<TabState>();
			}
			return JsonSerializer.Deserialize<List<TabState>>(File.ReadAllText(SessionPath)) ?? new List<TabState>();
		}
		catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException || ex is JsonException) ? true : false)
		{
			return new List<TabState>();
		}
	}

	public static void Clear()
	{
		try
		{
			if (File.Exists(SessionPath))
			{
				File.Delete(SessionPath);
			}
		}
		catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException) ? true : false)
		{
		}
	}
}
