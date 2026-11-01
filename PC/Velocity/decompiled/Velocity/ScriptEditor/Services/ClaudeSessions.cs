using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Text.Json;
using System.Text.Json.Nodes;

namespace ScriptEditor.Services;

public static class ClaudeSessions
{
	public readonly record struct Summary(string Id, DateTime Modified, string Preview);

	public readonly record struct Message(bool Mine, string Text);

	public static Summary[] List(string workingDirectory, int limit = 20)
	{
		string path = FolderFor(workingDirectory);
		if (!Directory.Exists(path))
		{
			return Array.Empty<Summary>();
		}
		try
		{
			return (from f in (from f in new DirectoryInfo(path).EnumerateFiles("*.jsonl")
					orderby f.LastWriteTimeUtc descending
					select f).Take(limit)
				select new Summary(Path.GetFileNameWithoutExtension(f.Name), f.LastWriteTime, FirstPrompt(f.FullName)) into s
				where s.Preview.Length > 0
				select s).ToArray();
		}
		catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException) ? true : false)
		{
			return Array.Empty<Summary>();
		}
	}

	public static Message[] Read(string workingDirectory, string sessionId)
	{
		string path = Path.Combine(FolderFor(workingDirectory), sessionId + ".jsonl");
		if (!File.Exists(path))
		{
			return Array.Empty<Message>();
		}
		List<Message> list = new List<Message>();
		try
		{
			foreach (string item in File.ReadLines(path))
			{
				Message? message = Parse(item);
				if (message.HasValue)
				{
					Message valueOrDefault = message.GetValueOrDefault();
					list.Add(valueOrDefault);
				}
			}
		}
		catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException) ? true : false)
		{
			return list.ToArray();
		}
		return list.ToArray();
	}

	private static Message? Parse(string line)
	{
		if (string.IsNullOrWhiteSpace(line))
		{
			return null;
		}
		JsonNode jsonNode;
		try
		{
			jsonNode = JsonNode.Parse(line);
		}
		catch (JsonException)
		{
			return null;
		}
		string text = jsonNode?["type"]?.GetValue<string>();
		if ((!(text == "user") && !(text == "assistant")) || 1 == 0)
		{
			return null;
		}
		string text2 = TextOf(jsonNode["message"]?["content"]);
		if (text2.Length == 0)
		{
			return null;
		}
		if (text == "user" && (text2.StartsWith("<local-command", StringComparison.Ordinal) || text2.StartsWith("<command-", StringComparison.Ordinal) || text2.StartsWith("<system-reminder", StringComparison.Ordinal)))
		{
			return null;
		}
		return new Message(text == "user", text2.Trim());
	}

	private static string TextOf(JsonNode? content)
	{
		if (content == null)
		{
			return string.Empty;
		}
		if (content is JsonValue jsonValue && jsonValue.TryGetValue<string>(out string value))
		{
			return value ?? string.Empty;
		}
		if (!(content is JsonArray jsonArray))
		{
			return string.Empty;
		}
		StringBuilder stringBuilder = new StringBuilder();
		foreach (JsonNode item in jsonArray)
		{
			if (!(item?["type"]?.GetValue<string>() != "text"))
			{
				stringBuilder.Append(item["text"]?.GetValue<string>());
			}
		}
		return stringBuilder.ToString();
	}

	private static string FirstPrompt(string path)
	{
		try
		{
			foreach (string item in File.ReadLines(path))
			{
				Message? message = Parse(item);
				if (message.HasValue)
				{
					Message valueOrDefault = message.GetValueOrDefault();
					if (valueOrDefault.Mine)
					{
						string text = valueOrDefault.Text.ReplaceLineEndings(" ").Trim();
						return (text.Length > 60) ? (text.Substring(0, 60) + "…") : text;
					}
				}
			}
		}
		catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException) ? true : false)
		{
		}
		return string.Empty;
	}

	private static string FolderFor(string workingDirectory)
	{
		StringBuilder stringBuilder = new StringBuilder(workingDirectory.Length);
		foreach (char c in workingDirectory)
		{
			stringBuilder.Append(char.IsLetterOrDigit(c) ? c : '-');
		}
		return Path.Combine(Environment.GetFolderPath(Environment.SpecialFolder.UserProfile), ".claude", "projects", stringBuilder.ToString());
	}
}
