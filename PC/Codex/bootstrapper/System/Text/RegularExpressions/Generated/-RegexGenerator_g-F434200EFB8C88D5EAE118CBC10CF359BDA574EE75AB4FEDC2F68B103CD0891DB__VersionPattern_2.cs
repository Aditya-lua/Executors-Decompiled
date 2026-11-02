using System.CodeDom.Compiler;

namespace System.Text.RegularExpressions.Generated;

[GeneratedCode("System.Text.RegularExpressions.Generator", "10.0.14.42308")]
internal sealed class _003CRegexGenerator_g_003EF434200EFB8C88D5EAE118CBC10CF359BDA574EE75AB4FEDC2F68B103CD0891DB__VersionPattern_2 : Regex
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
				if (num <= inputSpan.Length - 7 && num == 0)
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
				int num2 = span.IndexOfAnyExceptInRange('0', '9');
				if (num2 < 0)
				{
					num2 = span.Length;
				}
				if (num2 == 0)
				{
					return false;
				}
				span = span.Slice(num2);
				num += num2;
				if (span.IsEmpty || span[0] != '.')
				{
					return false;
				}
				int num3 = span.Slice(1).IndexOfAnyExceptInRange('0', '9');
				if (num3 < 0)
				{
					num3 = span.Length - 1;
				}
				if (num3 == 0)
				{
					return false;
				}
				span = span.Slice(num3);
				num += num3;
				if ((uint)span.Length < 2u || span[1] != '.')
				{
					return false;
				}
				int num4 = span.Slice(2).IndexOfAnyExceptInRange('0', '9');
				if (num4 < 0)
				{
					num4 = span.Length - 2;
				}
				if (num4 == 0)
				{
					return false;
				}
				span = span.Slice(num4);
				num += num4;
				if ((uint)span.Length < 3u || span[2] != '.')
				{
					return false;
				}
				int num5 = span.Slice(3).IndexOfAnyExceptInRange('0', '9');
				if (num5 < 0)
				{
					num5 = span.Length - 3;
				}
				if (num5 == 0)
				{
					return false;
				}
				span = span.Slice(num5);
				num += num5;
				if (4 < span.Length || (3 < span.Length && span[3] != '\n'))
				{
					return false;
				}
				Capture(0, start, runtextpos = num + 3);
				return true;
			}
		}

		protected override RegexRunner CreateInstance()
		{
			return new Runner();
		}
	}

	internal static readonly _003CRegexGenerator_g_003EF434200EFB8C88D5EAE118CBC10CF359BDA574EE75AB4FEDC2F68B103CD0891DB__VersionPattern_2 Instance = new _003CRegexGenerator_g_003EF434200EFB8C88D5EAE118CBC10CF359BDA574EE75AB4FEDC2F68B103CD0891DB__VersionPattern_2();

	private _003CRegexGenerator_g_003EF434200EFB8C88D5EAE118CBC10CF359BDA574EE75AB4FEDC2F68B103CD0891DB__VersionPattern_2()
	{
		pattern = "^[0-9]+\\.[0-9]+\\.[0-9]+\\.[0-9]+$";
		roptions = RegexOptions.CultureInvariant;
		Regex.ValidateMatchTimeout(_003CRegexGenerator_g_003EF434200EFB8C88D5EAE118CBC10CF359BDA574EE75AB4FEDC2F68B103CD0891DB__Utilities.s_defaultTimeout);
		internalMatchTimeout = _003CRegexGenerator_g_003EF434200EFB8C88D5EAE118CBC10CF359BDA574EE75AB4FEDC2F68B103CD0891DB__Utilities.s_defaultTimeout;
		factory = new RunnerFactory();
		capsize = 1;
	}
}
