using System;
using System.CodeDom.Compiler;
using System.IO;
using System.Text.RegularExpressions;
using System.Text.RegularExpressions.Generated;
using dotnet_codex_ui.Infrastructure.FileSystem;

namespace dotnet_codex_ui.Core.Versioning;

internal static class LoaderCheck
{
	[GeneratedCode("System.Text.RegularExpressions.Generator", "10.0.14.42308")]
	private static Regex Md5Pattern()
	{
		return _003CRegexGenerator_g_003EF65865DE7B97CDDC52A42F7FDE7D76E652A8AEA0D8E88870867D5A1597FC0B3FE__Md5Pattern_0.Instance;
	}

	public static bool IsMd5(string? Value)
	{
		if (Value != null)
		{
			return Md5Pattern().IsMatch(Value);
		}
		return false;
	}

	public static bool IsSafeVersion(string? Value)
	{
		bool flag = !string.IsNullOrWhiteSpace(Value) && Value.Length <= 64 && Value.IndexOfAny(Path.GetInvalidFileNameChars()) < 0;
		if (flag)
		{
			bool flag2 = ((Value == "." || Value == "..") ? true : false);
			flag = !flag2;
		}
		return flag;
	}

	public static string PathFor(string RobloxVersion, string Md5)
	{
		return Path.Combine(AppDirectories.Bin, RobloxVersion, Md5.ToLowerInvariant() + ".exe");
	}

	public static LoaderResult Evaluate(string? Live, CodexManifest? Manifest, VersionState State, Func<string, bool>? Exists = null)
	{
		if ((uint)State <= 1u)
		{
			return new LoaderResult(LoaderStatus.Checking, Live, null, null);
		}
		if ((object)Manifest == null || string.IsNullOrWhiteSpace(Live))
		{
			return new LoaderResult(LoaderStatus.Unknown, Live, null, null);
		}
		if (!IsSafeVersion(Live) || !IsMd5(Manifest.LoaderMd5) || !string.Equals(Manifest.RobloxVersion, Live, StringComparison.OrdinalIgnoreCase))
		{
			return new LoaderResult(LoaderStatus.Outdated, Live, null, null);
		}
		string text = PathFor(Live, Manifest.LoaderMd5);
		return new LoaderResult((Exists ?? new Func<string, bool>(File.Exists))(text) ? LoaderStatus.Ready : LoaderStatus.Missing, Live, Manifest.LoaderMd5.ToLowerInvariant(), text);
	}
}
