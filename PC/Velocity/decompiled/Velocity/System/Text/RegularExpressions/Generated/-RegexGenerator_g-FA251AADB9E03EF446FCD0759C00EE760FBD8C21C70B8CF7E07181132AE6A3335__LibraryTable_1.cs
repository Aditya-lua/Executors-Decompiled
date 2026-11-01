using System.CodeDom.Compiler;
using System.Runtime.CompilerServices;

namespace System.Text.RegularExpressions.Generated;

[GeneratedCode("System.Text.RegularExpressions.Generator", "10.0.14.42308")]
internal sealed class _003CRegexGenerator_g_003EFA251AADB9E03EF446FCD0759C00EE760FBD8C21C70B8CF7E07181132AE6A3335__LibraryTable_1 : Regex
{
	private sealed class RunnerFactory : RegexRunnerFactory
	{
		private sealed class Runner : RegexRunner
		{
			protected override void Scan(ReadOnlySpan<char> inputSpan)
			{
				while (TryFindNextPossibleStartingPosition(inputSpan) && !TryMatchAtCurrentPosition(inputSpan) && runtextpos != inputSpan.Length)
				{
					runtextpos++;
					if (_003CRegexGenerator_g_003EFA251AADB9E03EF446FCD0759C00EE760FBD8C21C70B8CF7E07181132AE6A3335__Utilities.s_hasTimeout)
					{
						CheckTimeout();
					}
				}
			}

			private bool TryFindNextPossibleStartingPosition(ReadOnlySpan<char> inputSpan)
			{
				int num = runtextpos;
				if (num <= inputSpan.Length - 12)
				{
					if (num <= 0 || inputSpan[num - 1] == '\n')
					{
						goto IL_005a;
					}
					int num2 = inputSpan.Slice(num).IndexOf('\n');
					if ((uint)num2 <= inputSpan.Length - num - 1)
					{
						num += num2 + 1;
						if (num <= inputSpan.Length - 12)
						{
							goto IL_005a;
						}
					}
				}
				goto IL_007c;
				IL_005a:
				int num3 = inputSpan.Slice(num).IndexOfAny(_003CRegexGenerator_g_003EFA251AADB9E03EF446FCD0759C00EE760FBD8C21C70B8CF7E07181132AE6A3335__Utilities.s_indexOfString_784D3D46623D4F6B8DB78AB1DE7EA0390D177D0F57581139738E33D0F705B75F);
				if (num3 >= 0)
				{
					runtextpos = num + num3;
					return true;
				}
				goto IL_007c;
				IL_007c:
				runtextpos = inputSpan.Length;
				return false;
			}

			private bool TryMatchAtCurrentPosition(ReadOnlySpan<char> inputSpan)
			{
				int num = runtextpos;
				int start = num;
				int num2 = 0;
				ReadOnlySpan<char> span = inputSpan.Slice(num);
				if (num > 0 && inputSpan[num - 1] != '\n')
				{
					UncaptureUntil(0);
					return false;
				}
				if (!span.StartsWith("declare "))
				{
					UncaptureUntil(0);
					return false;
				}
				num += 8;
				span = inputSpan.Slice(num);
				num2 = num;
				int i;
				for (i = 0; (uint)i < (uint)span.Length && _003CRegexGenerator_g_003EFA251AADB9E03EF446FCD0759C00EE760FBD8C21C70B8CF7E07181132AE6A3335__Utilities.IsWordChar(span[i]); i++)
				{
				}
				if (i == 0)
				{
					UncaptureUntil(0);
					return false;
				}
				span = span.Slice(i);
				num += i;
				Capture(1, num2, num);
				if (!span.StartsWith(": {"))
				{
					UncaptureUntil(0);
					return false;
				}
				Capture(0, start, runtextpos = num + 3);
				return true;
				[MethodImpl(MethodImplOptions.AggressiveInlining)]
				void UncaptureUntil(int capturePosition)
				{
					while (Crawlpos() > capturePosition)
					{
						Uncapture();
					}
				}
			}
		}

		protected override RegexRunner CreateInstance()
		{
			return new Runner();
		}
	}

	internal static readonly _003CRegexGenerator_g_003EFA251AADB9E03EF446FCD0759C00EE760FBD8C21C70B8CF7E07181132AE6A3335__LibraryTable_1 Instance = new _003CRegexGenerator_g_003EFA251AADB9E03EF446FCD0759C00EE760FBD8C21C70B8CF7E07181132AE6A3335__LibraryTable_1();

	private _003CRegexGenerator_g_003EFA251AADB9E03EF446FCD0759C00EE760FBD8C21C70B8CF7E07181132AE6A3335__LibraryTable_1()
	{
		pattern = "^declare (\\w+): \\{";
		roptions = RegexOptions.Multiline;
		Regex.ValidateMatchTimeout(_003CRegexGenerator_g_003EFA251AADB9E03EF446FCD0759C00EE760FBD8C21C70B8CF7E07181132AE6A3335__Utilities.s_defaultTimeout);
		internalMatchTimeout = _003CRegexGenerator_g_003EFA251AADB9E03EF446FCD0759C00EE760FBD8C21C70B8CF7E07181132AE6A3335__Utilities.s_defaultTimeout;
		factory = new RunnerFactory();
		capsize = 2;
	}
}
