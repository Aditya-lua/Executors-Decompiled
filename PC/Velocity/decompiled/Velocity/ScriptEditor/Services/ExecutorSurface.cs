using System;
using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Text.RegularExpressions.Generated;

namespace ScriptEditor.Services;

public static class ExecutorSurface
{
	private static readonly Lazy<string> Summary = new Lazy<string>(Build);

	public static string Text => Summary.Value;

	private static string Build()
	{
		string path = Path.Combine(AppPaths.LanguageServerFolder, "velocity.d.luau");
		if (!File.Exists(path))
		{
			return string.Empty;
		}
		string input;
		try
		{
			input = File.ReadAllText(path);
		}
		catch (IOException)
		{
			return string.Empty;
		}
		List<string> list = new List<string>();
		foreach (Match item in GlobalFunction().Matches(input))
		{
			list.Add(item.Groups[1].Value);
		}
		List<string> list2 = new List<string>();
		foreach (Match item2 in LibraryTable().Matches(input))
		{
			list2.Add(item2.Groups[1].Value);
		}
		if (list.Count == 0 && list2.Count == 0)
		{
			return string.Empty;
		}
		StringBuilder stringBuilder = new StringBuilder();
		if (list.Count > 0)
		{
			stringBuilder.Append("Executor globals: ");
			stringBuilder.AppendJoin(", ", list);
			stringBuilder.Append('.');
		}
		if (list2.Count > 0)
		{
			if (stringBuilder.Length > 0)
			{
				stringBuilder.Append(' ');
			}
			stringBuilder.Append("Executor libraries: ");
			stringBuilder.AppendJoin(", ", list2);
			stringBuilder.Append('.');
		}
		return stringBuilder.ToString();
	}

	[GeneratedCode("System.Text.RegularExpressions.Generator", "10.0.14.42308")]
	private static Regex GlobalFunction()
	{
		return _003CRegexGenerator_g_003EFA251AADB9E03EF446FCD0759C00EE760FBD8C21C70B8CF7E07181132AE6A3335__GlobalFunction_0.Instance;
	}

	[GeneratedCode("System.Text.RegularExpressions.Generator", "10.0.14.42308")]
	private static Regex LibraryTable()
	{
		return _003CRegexGenerator_g_003EFA251AADB9E03EF446FCD0759C00EE760FBD8C21C70B8CF7E07181132AE6A3335__LibraryTable_1.Instance;
	}
}
