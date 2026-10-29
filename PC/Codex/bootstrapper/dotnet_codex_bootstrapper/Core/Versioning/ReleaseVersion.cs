using System;
using System.Globalization;
using System.Text.RegularExpressions;

namespace dotnet_codex_bootstrapper.Core.Versioning;

public sealed class ReleaseVersion : IComparable<ReleaseVersion>
{
	private static readonly Regex Pattern = new Regex("^(\\d{1,9})\\.(\\d{1,9})\\.(\\d{1,9})(?:-([0-9A-Za-z\\-]+(?:\\.[0-9A-Za-z\\-]+)*))?$", RegexOptions.Compiled | RegexOptions.CultureInvariant);

	private readonly string[] Prerelease;

	public int Major { get; }

	public int Minor { get; }

	public int Patch { get; }

	public string Text { get; }

	private ReleaseVersion(int Major, int Minor, int Patch, string[] Prerelease, string Text)
	{
		this.Major = Major;
		this.Minor = Minor;
		this.Patch = Patch;
		this.Prerelease = Prerelease;
		this.Text = Text;
	}

	public static bool TryParse(string? Value, out ReleaseVersion Version)
	{
		Version = null;
		Match match = Pattern.Match(Value?.Trim() ?? string.Empty);
		if (!match.Success)
		{
			return false;
		}
		string[] prerelease = (match.Groups[4].Success ? match.Groups[4].Value.Split('.') : Array.Empty<string>());
		Version = new ReleaseVersion(int.Parse(match.Groups[1].Value, CultureInfo.InvariantCulture), int.Parse(match.Groups[2].Value, CultureInfo.InvariantCulture), int.Parse(match.Groups[3].Value, CultureInfo.InvariantCulture), prerelease, Value.Trim());
		return true;
	}

	public static ReleaseVersion Parse(string Value)
	{
		if (!TryParse(Value, out ReleaseVersion Version))
		{
			throw new FormatException("'" + Value + "' is not a valid version.");
		}
		return Version;
	}

	public int CompareTo(ReleaseVersion? Other)
	{
		if (Other == null)
		{
			return 1;
		}
		int num = Major.CompareTo(Other.Major);
		if (num != 0)
		{
			return num;
		}
		num = Minor.CompareTo(Other.Minor);
		if (num != 0)
		{
			return num;
		}
		num = Patch.CompareTo(Other.Patch);
		if (num != 0)
		{
			return num;
		}
		if (Prerelease.Length == 0 || Other.Prerelease.Length == 0)
		{
			return Other.Prerelease.Length.CompareTo(Prerelease.Length);
		}
		for (int i = 0; i < Math.Min(Prerelease.Length, Other.Prerelease.Length); i++)
		{
			bool flag = long.TryParse(Prerelease[i], NumberStyles.None, CultureInfo.InvariantCulture, out var result);
			bool flag2 = long.TryParse(Other.Prerelease[i], NumberStyles.None, CultureInfo.InvariantCulture, out var result2);
			if (flag & flag2)
			{
				num = result.CompareTo(result2);
			}
			else
			{
				num = (flag ? (-1) : (flag2 ? 1 : string.CompareOrdinal(Prerelease[i], Other.Prerelease[i])));
			}
			if (num != 0)
			{
				return num;
			}
		}
		return Prerelease.Length.CompareTo(Other.Prerelease.Length);
	}

	public override string ToString()
	{
		return Text;
	}

	public static bool operator >(ReleaseVersion Left, ReleaseVersion Right)
	{
		return Left.CompareTo(Right) > 0;
	}

	public static bool operator <(ReleaseVersion Left, ReleaseVersion Right)
	{
		return Left.CompareTo(Right) < 0;
	}
}
