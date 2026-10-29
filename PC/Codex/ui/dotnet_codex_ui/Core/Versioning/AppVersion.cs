using System;
using System.Globalization;
using System.Linq;

namespace dotnet_codex_ui.Core.Versioning;

internal sealed class AppVersion : IComparable<AppVersion>
{
	private readonly string[] PrereleaseField;

	public int Major { get; }

	public int Minor { get; }

	public int Patch { get; }

	public string Text { get; }

	public bool IsPrerelease => PrereleaseField.Length != 0;

	private AppVersion(int Major, int Minor, int Patch, string[] Prerelease, string Text)
	{
		this.Major = Major;
		this.Minor = Minor;
		this.Patch = Patch;
		PrereleaseField = Prerelease;
		this.Text = Text;
	}

	public override string ToString()
	{
		return Text;
	}

	public static bool TryParse(string? Value, out AppVersion Version)
	{
		Version = null;
		if (string.IsNullOrWhiteSpace(Value))
		{
			return false;
		}
		string text = Value.Trim();
		string text2 = text;
		int num = text2.IndexOf('+');
		if (num >= 0)
		{
			if (!ValidIdentifiers(text2.Substring(num + 1), AllowLeadingZeros: true))
			{
				return false;
			}
			text2 = text2.Substring(0, num);
		}
		string[] prerelease = Array.Empty<string>();
		int num2 = text2.IndexOf('-');
		if (num2 >= 0)
		{
			string text3 = text2.Substring(num2 + 1);
			if (!ValidIdentifiers(text3, AllowLeadingZeros: false))
			{
				return false;
			}
			prerelease = text3.Split('.');
			text2 = text2.Substring(0, num2);
		}
		string[] array = text2.Split('.');
		if (array.Length != 3 || !TryNumber(array[0], out var Number) || !TryNumber(array[1], out var Number2) || !TryNumber(array[2], out var Number3))
		{
			return false;
		}
		Version = new AppVersion(Number, Number2, Number3, prerelease, text);
		return true;
	}

	private static bool TryNumber(string Part, out int Number)
	{
		Number = 0;
		if (Part.Length > 0 && Part.All(char.IsAsciiDigit) && (Part.Length == 1 || Part[0] != '0'))
		{
			return int.TryParse(Part, NumberStyles.None, CultureInfo.InvariantCulture, out Number);
		}
		return false;
	}

	private static bool ValidIdentifiers(string Text, bool AllowLeadingZeros)
	{
		if (Text.Length == 0)
		{
			return false;
		}
		string[] array = Text.Split('.');
		foreach (string text in array)
		{
			if (text.Length == 0 || !text.All((char C) => char.IsAsciiLetterOrDigit(C) || C == '-'))
			{
				return false;
			}
			if (!AllowLeadingZeros && text.All(char.IsAsciiDigit) && text.Length > 1 && text[0] == '0')
			{
				return false;
			}
		}
		return true;
	}

	public int CompareTo(AppVersion? Other)
	{
		if (Other == null)
		{
			return 1;
		}
		int num = Major.CompareTo(Other.Major);
		if (num == 0)
		{
			num = Minor.CompareTo(Other.Minor);
		}
		if (num == 0)
		{
			num = Patch.CompareTo(Other.Patch);
		}
		if (num != 0)
		{
			return num;
		}
		if (PrereleaseField.Length == 0 || Other.PrereleaseField.Length == 0)
		{
			return Other.PrereleaseField.Length.CompareTo(PrereleaseField.Length);
		}
		for (int i = 0; i < Math.Min(PrereleaseField.Length, Other.PrereleaseField.Length); i++)
		{
			string text = PrereleaseField[i];
			string text2 = Other.PrereleaseField[i];
			bool flag = text.All(char.IsAsciiDigit);
			bool flag2 = text2.All(char.IsAsciiDigit);
			int num2;
			if (flag & flag2)
			{
				num2 = CompareNumbers(text, text2);
			}
			else
			{
				num2 = (flag ? (-1) : (flag2 ? 1 : string.CompareOrdinal(text, text2)));
			}
			if (num2 != 0)
			{
				return Math.Sign(num2);
			}
		}
		return PrereleaseField.Length.CompareTo(Other.PrereleaseField.Length);
	}

	private static int CompareNumbers(string A, string B)
	{
		if (A.Length == B.Length)
		{
			return string.CompareOrdinal(A, B);
		}
		return A.Length.CompareTo(B.Length);
	}
}
