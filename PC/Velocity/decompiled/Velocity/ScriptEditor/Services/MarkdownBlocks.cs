using System;
using System.Collections.Generic;

namespace ScriptEditor.Services;

public static class MarkdownBlocks
{
	public static IEnumerable<(string Text, bool IsCode)> Split(string source)
	{
		if (string.IsNullOrEmpty(source))
		{
			yield break;
		}
		int num = 0;
		while (num < source.Length)
		{
			int open = source.IndexOf("```", num, StringComparison.Ordinal);
			if (open < 0)
			{
				yield return (Text: Trim(source.Substring(num)), IsCode: false);
				break;
			}
			int num2;
			if (open > num)
			{
				num2 = num;
				yield return (Text: Trim(source.Substring(num2, open - num2)), IsCode: false);
			}
			int startIndex = open + 3;
			int num3 = source.IndexOf('\n', startIndex);
			int num4 = ((num3 < 0) ? source.Length : (num3 + 1));
			int close = source.IndexOf("```", num4, StringComparison.Ordinal);
			if (close < 0)
			{
				yield return (Text: source.Substring(num4).TrimEnd('\n'), IsCode: true);
				break;
			}
			num2 = num4;
			yield return (Text: source.Substring(num2, close - num2).TrimEnd('\n'), IsCode: true);
			num = close + 3;
			if (num < source.Length && source[num] == '\n')
			{
				num++;
			}
		}
	}

	private static string Trim(string value)
	{
		return value.Trim(new char[2] { '\n', '\r' });
	}
}
