using System.Collections.Generic;
using dotnet_codex_bootstrapper.Features.Bootstrapping.Demo;

namespace dotnet_codex_bootstrapper.Core.Configuration;

public sealed record StartupOptions(bool Demo, DemoScenario Scenario, Channel Channel, bool AfterUpdate, string? Operation, int ParentId, string? Expect, string? SelfTestFile, bool NoLaunch, bool NoRelocate)
{
	public static StartupOptions Parse(IReadOnlyList<string> Arguments)
	{
		bool demo = false;
		DemoScenario demoScenario = DemoScenarios.Default;
		Channel channel = Channels.Default;
		bool afterUpdate = false;
		string operation = null;
		int result = 0;
		string expect = null;
		string selfTestFile = null;
		bool noLaunch = false;
		bool noRelocate = false;
		for (int i = 0; i < Arguments.Count; i++)
		{
			string text = ((i + 1 < Arguments.Count) ? Arguments[i + 1] : null);
			switch (Arguments[i].ToLowerInvariant())
			{
			case "--scenario":
			case "--demo":
				demo = true;
				if (text != null && !text.StartsWith("--"))
				{
					demoScenario = DemoScenarios.Find(text) ?? demoScenario;
					i++;
				}
				break;
			case "--channel":
			{
				if (Channels.TryParse(text, out var Value))
				{
					channel = ((Value == Channel.Canary) ? Channels.Default : Value);
					i++;
				}
				break;
			}
			case "--after-update":
				afterUpdate = true;
				break;
			case "--op":
				operation = text;
				i++;
				break;
			case "--parent":
				int.TryParse(text, out result);
				i++;
				break;
			case "--expect":
				expect = text;
				i++;
				break;
			case "--selftest":
				selfTestFile = text;
				i++;
				break;
			case "--no-launch":
				noLaunch = true;
				break;
			case "--no-relocate":
				noRelocate = true;
				break;
			}
		}
		return new StartupOptions(demo, demoScenario, channel, afterUpdate, operation, result, expect, selfTestFile, noLaunch, noRelocate);
	}
}
