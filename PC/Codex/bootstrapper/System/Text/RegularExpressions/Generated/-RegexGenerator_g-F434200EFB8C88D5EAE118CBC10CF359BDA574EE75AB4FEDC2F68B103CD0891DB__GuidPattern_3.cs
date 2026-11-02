using System.CodeDom.Compiler;

namespace System.Text.RegularExpressions.Generated;

[GeneratedCode("System.Text.RegularExpressions.Generator", "10.0.14.42308")]
internal sealed class _003CRegexGenerator_g_003EF434200EFB8C88D5EAE118CBC10CF359BDA574EE75AB4FEDC2F68B103CD0891DB__GuidPattern_3 : Regex
{
	private sealed class RunnerFactory : RegexRunnerFactory
	{
		private sealed class Runner : RegexRunner
		{
			protected override void Scan(ReadOnlySpan<char> inputSpan)
			{
				if (TryFindNextPossibleStartingPosition(inputSpan) && !TryMatchAtCurrentPosition(inputSpan))
				{
					runtextpos = inputSpan.Length;
				}
			}

			private bool TryFindNextPossibleStartingPosition(ReadOnlySpan<char> inputSpan)
			{
				int num = runtextpos;
				if (num <= inputSpan.Length - 24 && num == 0)
				{
					return true;
				}
				runtextpos = inputSpan.Length;
				return false;
			}

			private bool TryMatchAtCurrentPosition(ReadOnlySpan<char> inputSpan)
			{
				int num = runtextpos;
				int start = num;
				ReadOnlySpan<char> span = inputSpan.Slice(num);
				if (num != 0)
				{
					return false;
				}
				if ((uint)span.Length < 24u || !span.StartsWith("version-") || !char.IsAsciiHexDigitLower(span[8]) || !char.IsAsciiHexDigitLower(span[9]) || !char.IsAsciiHexDigitLower(span[10]) || !char.IsAsciiHexDigitLower(span[11]) || !char.IsAsciiHexDigitLower(span[12]) || !char.IsAsciiHexDigitLower(span[13]) || !char.IsAsciiHexDigitLower(span[14]) || !char.IsAsciiHexDigitLower(span[15]) || !char.IsAsciiHexDigitLower(span[16]) || !char.IsAsciiHexDigitLower(span[17]) || !char.IsAsciiHexDigitLower(span[18]) || !char.IsAsciiHexDigitLower(span[19]) || !char.IsAsciiHexDigitLower(span[20]) || !char.IsAsciiHexDigitLower(span[21]) || !char.IsAsciiHexDigitLower(span[22]) || !char.IsAsciiHexDigitLower(span[23]))
				{
					return false;
				}
				if (25 < span.Length || (24 < span.Length && span[24] != '\n'))
				{
					return false;
				}
				Capture(0, start, runtextpos = num + 24);
				return true;
			}
		}

		protected override RegexRunner CreateInstance()
		{
			return new Runner();
		}
	}

	internal static readonly _003CRegexGenerator_g_003EF434200EFB8C88D5EAE118CBC10CF359BDA574EE75AB4FEDC2F68B103CD0891DB__GuidPattern_3 Instance = new _003CRegexGenerator_g_003EF434200EFB8C88D5EAE118CBC10CF359BDA574EE75AB4FEDC2F68B103CD0891DB__GuidPattern_3();

	private _003CRegexGenerator_g_003EF434200EFB8C88D5EAE118CBC10CF359BDA574EE75AB4FEDC2F68B103CD0891DB__GuidPattern_3()
	{
		pattern = "^version-[0-9a-f]{16}$";
		roptions = RegexOptions.CultureInvariant;
		Regex.ValidateMatchTimeout(_003CRegexGenerator_g_003EF434200EFB8C88D5EAE118CBC10CF359BDA574EE75AB4FEDC2F68B103CD0891DB__Utilities.s_defaultTimeout);
		internalMatchTimeout = _003CRegexGenerator_g_003EF434200EFB8C88D5EAE118CBC10CF359BDA574EE75AB4FEDC2F68B103CD0891DB__Utilities.s_defaultTimeout;
		factory = new RunnerFactory();
		capsize = 1;
	}
}
