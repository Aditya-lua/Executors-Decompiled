using System.CodeDom.Compiler;

namespace System.Text.RegularExpressions.Generated;

[GeneratedCode("System.Text.RegularExpressions.Generator", "10.0.14.42308")]
internal sealed class _003CRegexGenerator_g_003EF434200EFB8C88D5EAE118CBC10CF359BDA574EE75AB4FEDC2F68B103CD0891DB__ChannelNamePattern_1 : Regex
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
				if (runtextpos == 0)
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
				int i;
				for (i = 0; i < 64 && (uint)i < (uint)readOnlySpan.Length; i++)
				{
					char c;
					if ((c = readOnlySpan[i]) >= '{')
					{
						break;
					}
					if (("\0\0\u2000Ͽ\0耀\ufffe߿"[(int)c >> 4] & (1 << (c & 0xF))) == 0)
					{
						break;
					}
				}
				readOnlySpan = readOnlySpan.Slice(i);
				num += i;
				if (num < inputSpan.Length - 1 || ((uint)num < (uint)inputSpan.Length && inputSpan[num] != '\n'))
				{
					return false;
				}
				runtextpos = num;
				Capture(0, start, num);
				return true;
			}
		}

		protected override RegexRunner CreateInstance()
		{
			return new Runner();
		}
	}

	internal static readonly _003CRegexGenerator_g_003EF434200EFB8C88D5EAE118CBC10CF359BDA574EE75AB4FEDC2F68B103CD0891DB__ChannelNamePattern_1 Instance = new _003CRegexGenerator_g_003EF434200EFB8C88D5EAE118CBC10CF359BDA574EE75AB4FEDC2F68B103CD0891DB__ChannelNamePattern_1();

	private _003CRegexGenerator_g_003EF434200EFB8C88D5EAE118CBC10CF359BDA574EE75AB4FEDC2F68B103CD0891DB__ChannelNamePattern_1()
	{
		pattern = "^[a-z0-9_-]{0,64}$";
		roptions = RegexOptions.CultureInvariant;
		Regex.ValidateMatchTimeout(_003CRegexGenerator_g_003EF434200EFB8C88D5EAE118CBC10CF359BDA574EE75AB4FEDC2F68B103CD0891DB__Utilities.s_defaultTimeout);
		internalMatchTimeout = _003CRegexGenerator_g_003EF434200EFB8C88D5EAE118CBC10CF359BDA574EE75AB4FEDC2F68B103CD0891DB__Utilities.s_defaultTimeout;
		factory = new RunnerFactory();
		capsize = 1;
	}
}
