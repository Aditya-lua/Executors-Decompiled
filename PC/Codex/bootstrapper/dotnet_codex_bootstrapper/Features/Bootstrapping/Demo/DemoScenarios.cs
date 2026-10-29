using System;
using System.Collections.Generic;
using System.Linq;

namespace dotnet_codex_bootstrapper.Features.Bootstrapping.Demo;

public static class DemoScenarios
{
	public static IReadOnlyList<DemoScenario> All { get; } = new _003C_003Ez__ReadOnlyArray<DemoScenario>(new DemoScenario[5]
	{
		new DemoScenario("Normal", "No bootstrapper update, repairs damaged files, installs an update", BootstrapperUpdate: false, 24, 3, 4),
		new DemoScenario("BootstrapperUpdate", "A new bootstrapper is downloaded and handed over", BootstrapperUpdate: true, 24, 0, 0),
		new DemoScenario("CleanIntegrity", "Everything is intact and up to date", BootstrapperUpdate: false, 24, 0, 0),
		new DemoScenario("RepairAndInstall", "Many damaged files are repaired and installed", BootstrapperUpdate: false, 30, 8, 6),
		new DemoScenario("Failure", "A download fails part way through", BootstrapperUpdate: false, 24, 3, 4, 62.0)
	});

	public static DemoScenario Default => All[0];

	public static DemoScenario? Find(string? Name)
	{
		return All.FirstOrDefault((DemoScenario Scenario) => string.Equals(Scenario.Name, Name, StringComparison.OrdinalIgnoreCase));
	}
}
