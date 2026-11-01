using System.Buffers;
using System.CodeDom.Compiler;
using System.Globalization;
using System.Runtime.CompilerServices;

namespace System.Text.RegularExpressions.Generated;

[GeneratedCode("System.Text.RegularExpressions.Generator", "10.0.14.42308")]
internal static class _003CRegexGenerator_g_003EFA251AADB9E03EF446FCD0759C00EE760FBD8C21C70B8CF7E07181132AE6A3335__Utilities
{
	internal static readonly TimeSpan s_defaultTimeout = ((AppContext.GetData("REGEX_DEFAULT_MATCH_TIMEOUT") is TimeSpan timeSpan) ? timeSpan : Regex.InfiniteMatchTimeout);

	internal static readonly bool s_hasTimeout = s_defaultTimeout != Regex.InfiniteMatchTimeout;

	private const int WordCategoriesMask = 262463;

	internal static readonly SearchValues<string> s_indexOfString_784D3D46623D4F6B8DB78AB1DE7EA0390D177D0F57581139738E33D0F705B75F = SearchValues.Create(new ReadOnlySpan<string>("declare "), StringComparison.Ordinal);

	internal static readonly SearchValues<string> s_indexOfString_A791FC0E0A40F1D881573E52479F8AE771891C6F1D35A83E45AD7C8EDE230C72 = SearchValues.Create(new ReadOnlySpan<string>("declare function "), StringComparison.Ordinal);

	private static ReadOnlySpan<byte> WordCharBitmap => new byte[16]
	{
		0, 0, 0, 0, 0, 0, 255, 3, 254, 255,
		255, 135, 254, 255, 255, 7
	};

	[MethodImpl(MethodImplOptions.AggressiveInlining)]
	internal static bool IsWordChar(char ch)
	{
		ReadOnlySpan<byte> wordCharBitmap = WordCharBitmap;
		int num = (int)ch >> 3;
		if ((uint)num >= (uint)wordCharBitmap.Length)
		{
			return (0x4013F & (1 << (int)CharUnicodeInfo.GetUnicodeCategory(ch))) != 0;
		}
		return (wordCharBitmap[num] & (1 << (ch & 7))) != 0;
	}
}
