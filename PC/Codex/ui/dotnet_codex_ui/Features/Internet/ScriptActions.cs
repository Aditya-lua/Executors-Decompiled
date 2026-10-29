using System;
using System.Text;
using dotnet_codex_ui.Features.Clients;

namespace dotnet_codex_ui.Features.Internet;

internal static class ScriptActions
{
	public static Func<string, string, bool>? OpenInTab { get; set; }

	public static Func<string, ExecuteResult>? Execute { get; set; }

	public static string TabTitle(string? Title)
	{
		StringBuilder stringBuilder = new StringBuilder();
		string text = Title ?? string.Empty;
		foreach (char c in text)
		{
			if (!char.IsControl(c))
			{
				stringBuilder.Append(c);
			}
		}
		string text2 = string.Join(' ', stringBuilder.ToString().Split((char[]?)null, StringSplitOptions.RemoveEmptyEntries));
		if (text2.Length == 0)
		{
			return "ScriptBlox Script";
		}
		if (text2.Length <= 40)
		{
			return text2;
		}
		return text2.Substring(0, 39).TrimEnd() + "…";
	}
}
