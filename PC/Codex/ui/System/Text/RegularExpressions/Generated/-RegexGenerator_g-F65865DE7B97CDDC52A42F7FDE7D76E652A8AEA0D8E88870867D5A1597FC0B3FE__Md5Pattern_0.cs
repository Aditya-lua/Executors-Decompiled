using System.CodeDom.Compiler;
using System.Runtime.CompilerServices;

namespace System.Text.RegularExpressions.Generated;

[GeneratedCode("System.Text.RegularExpressions.Generator", "10.0.14.42308")]
[SkipLocalsInit]
internal sealed class _003CRegexGenerator_g_003EF65865DE7B97CDDC52A42F7FDE7D76E652A8AEA0D8E88870867D5A1597FC0B3FE__Md5Pattern_0 : Regex
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
				if (num <= inputSpan.Length - 32 && num == 0)
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
				ReadOnlySpan<char> readOnlySpan = inputSpan.Slice(num);
				if (num != 0)
				{
					return false;
				}
				if ((uint)readOnlySpan.Length < 32u || readOnlySpan.Slice(0, 32).ContainsAnyExcept(_003CRegexGenerator_g_003EF65865DE7B97CDDC52A42F7FDE7D76E652A8AEA0D8E88870867D5A1597FC0B3FE__Utilities.s_asciiHexDigits))
				{
					return false;
				}
				if (33 < readOnlySpan.Length || (32 < readOnlySpan.Length && readOnlySpan[32] != '\n'))
				{
					return false;
				}
				Capture(0, start, runtextpos = num + 32);
				return true;
			}
		}

		protected override RegexRunner CreateInstance()
		{
			return new Runner();
		}
	}

	internal static readonly _003CRegexGenerator_g_003EF65865DE7B97CDDC52A42F7FDE7D76E652A8AEA0D8E88870867D5A1597FC0B3FE__Md5Pattern_0 Instance = new _003CRegexGenerator_g_003EF65865DE7B97CDDC52A42F7FDE7D76E652A8AEA0D8E88870867D5A1597FC0B3FE__Md5Pattern_0();

	private _003CRegexGenerator_g_003EF65865DE7B97CDDC52A42F7FDE7D76E652A8AEA0D8E88870867D5A1597FC0B3FE__Md5Pattern_0()
	{
		pattern = "^[0-9a-fA-F]{32}$";
		roptions = RegexOptions.None;
		Regex.ValidateMatchTimeout(_003CRegexGenerator_g_003EF65865DE7B97CDDC52A42F7FDE7D76E652A8AEA0D8E88870867D5A1597FC0B3FE__Utilities.s_defaultTimeout);
		internalMatchTimeout = _003CRegexGenerator_g_003EF65865DE7B97CDDC52A42F7FDE7D76E652A8AEA0D8E88870867D5A1597FC0B3FE__Utilities.s_defaultTimeout;
		factory = new RunnerFactory();
		capsize = 1;
	}
}
