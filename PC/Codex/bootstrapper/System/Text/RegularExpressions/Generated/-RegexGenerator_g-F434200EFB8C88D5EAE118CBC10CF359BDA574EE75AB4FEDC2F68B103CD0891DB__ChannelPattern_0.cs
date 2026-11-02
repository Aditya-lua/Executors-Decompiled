using System.CodeDom.Compiler;
using System.Runtime.CompilerServices;

namespace System.Text.RegularExpressions.Generated;

[GeneratedCode("System.Text.RegularExpressions.Generator", "10.0.14.42308")]
internal sealed class _003CRegexGenerator_g_003EF434200EFB8C88D5EAE118CBC10CF359BDA574EE75AB4FEDC2F68B103CD0891DB__ChannelPattern_0 : Regex
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
					if (_003CRegexGenerator_g_003EF434200EFB8C88D5EAE118CBC10CF359BDA574EE75AB4FEDC2F68B103CD0891DB__Utilities.s_hasTimeout)
					{
						CheckTimeout();
					}
				}
			}

			private bool TryFindNextPossibleStartingPosition(ReadOnlySpan<char> inputSpan)
			{
				int num = runtextpos;
				if (num <= inputSpan.Length - 9)
				{
					int num2 = inputSpan.Slice(num).IndexOfAny('+', 'R', 'r');
					if (num2 >= 0)
					{
						runtextpos = num + num2;
						return true;
					}
				}
				runtextpos = inputSpan.Length;
				return false;
			}

			private bool TryMatchAtCurrentPosition(ReadOnlySpan<char> inputSpan)
			{
				int num = runtextpos;
				int start = num;
				int num2 = 0;
				int num3 = 0;
				int num4 = 0;
				int num5 = 0;
				int num6 = 0;
				ReadOnlySpan<char> span = inputSpan.Slice(num);
				num5 = num;
				num4 = num;
				num3 = Crawlpos();
				if (num != 0 || (uint)span.Length < 14u || !span.StartsWith("roblox-player:", StringComparison.OrdinalIgnoreCase))
				{
					goto IL_0062;
				}
				num2 = 0;
				num += 14;
				span = inputSpan.Slice(num);
				goto IL_00c4;
				IL_0062:
				num = num4;
				span = inputSpan.Slice(num);
				UncaptureUntil(num3);
				if (span.IsEmpty || span[0] != '+')
				{
					UncaptureUntil(0);
					return false;
				}
				num2 = 1;
				num++;
				span = inputSpan.Slice(num);
				goto IL_00c4;
				IL_00c4:
				while (true)
				{
					Capture(1, num5, num);
					if ((uint)span.Length < 8u || !span.StartsWith("channel:", StringComparison.OrdinalIgnoreCase))
					{
						if (_003CRegexGenerator_g_003EF434200EFB8C88D5EAE118CBC10CF359BDA574EE75AB4FEDC2F68B103CD0891DB__Utilities.s_hasTimeout)
						{
							CheckTimeout();
						}
						if (num2 == 0)
						{
							break;
						}
						if (num2 == 1)
						{
							UncaptureUntil(0);
							return false;
						}
						continue;
					}
					num += 8;
					span = inputSpan.Slice(num);
					num6 = num;
					int num7 = span.IndexOfAnyExcept(_003CRegexGenerator_g_003EF434200EFB8C88D5EAE118CBC10CF359BDA574EE75AB4FEDC2F68B103CD0891DB__Utilities.s_asciiLettersAndDigitsAndDashUnderscoreKelvinSign);
					if (num7 < 0)
					{
						num7 = span.Length;
					}
					span = span.Slice(num7);
					num += num7;
					Capture(2, num6, num);
					runtextpos = num;
					Capture(0, start, num);
					return true;
				}
				goto IL_0062;
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

	internal static readonly _003CRegexGenerator_g_003EF434200EFB8C88D5EAE118CBC10CF359BDA574EE75AB4FEDC2F68B103CD0891DB__ChannelPattern_0 Instance = new _003CRegexGenerator_g_003EF434200EFB8C88D5EAE118CBC10CF359BDA574EE75AB4FEDC2F68B103CD0891DB__ChannelPattern_0();

	private _003CRegexGenerator_g_003EF434200EFB8C88D5EAE118CBC10CF359BDA574EE75AB4FEDC2F68B103CD0891DB__ChannelPattern_0()
	{
		pattern = "(^roblox-player:|\\+)channel:([A-Za-z0-9_-]*)";
		roptions = RegexOptions.IgnoreCase | RegexOptions.CultureInvariant;
		Regex.ValidateMatchTimeout(_003CRegexGenerator_g_003EF434200EFB8C88D5EAE118CBC10CF359BDA574EE75AB4FEDC2F68B103CD0891DB__Utilities.s_defaultTimeout);
		internalMatchTimeout = _003CRegexGenerator_g_003EF434200EFB8C88D5EAE118CBC10CF359BDA574EE75AB4FEDC2F68B103CD0891DB__Utilities.s_defaultTimeout;
		factory = new RunnerFactory();
		capsize = 3;
	}
}
