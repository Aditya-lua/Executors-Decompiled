using System;
using System.Collections.Generic;
using System.Linq;

namespace dotnet_codex_bootstrapper.Features.Bootstrapping.Demo;

public static class DemoFileCatalog
{
	public const string BootstrapperExecutable = "CodexBootstrapper.exe";

	public static IReadOnlyList<string> IntegrityPool { get; } = new _003C_003Ez__ReadOnlyArray<string>(new string[30]
	{
		"dotnet-codex-ui.dll", "dotnet-codex-ui.exe", "dotnet-codex-ui.deps.json", "dotnet-codex-ui.runtimeconfig.json", "Newtonsoft.Json.dll", "Serilog.dll", "Serilog.Sinks.File.dll", "Serilog.Sinks.Async.dll", "CefSharp.dll", "CefSharp.Core.dll",
		"CefSharp.Wpf.dll", "libcef.dll", "chrome_elf.dll", "icudtl.dat", "resources.pak", "bin/language-server/node.exe", "bin/language-server/luau-lsp.exe", "bin/language-server/darklua.exe", "bin/language-server/dist/server/index.js", "bin/language-server/dist/client/monaco.bundle.js",
		"bin/language-server/dist/client/luau.worker.js", "bin/language-server/dist/client/editor.worker.js", "bin/language-server/dist/client/codicon.ttf", "Assets/Fonts/Inter-VariableFont_opsz,wght.ttf", "Assets/Images/Primary.png", "Assets/Images/Logo.png", "bin/language-server/dist/client/themes/codex-dark-with-a-very-long-descriptive-theme-name-that-keeps-going-and-going.json", "workspace/default.project.json", "scripts/readme.txt", "autoexec/startup.lua"
	});

	public static IReadOnlyList<DemoFile> UpdatePool { get; } = new _003C_003Ez__ReadOnlyArray<DemoFile>(new DemoFile[6]
	{
		new DemoFile("dotnet-codex-ui.dll", 9400000L),
		new DemoFile("bin/language-server/dist/server/index.js", 3200000L),
		new DemoFile("bin/language-server/dist/client/monaco.bundle.js", 14800000L),
		new DemoFile("Assets/Images/Primary.png", 2100000L),
		new DemoFile("CefSharp.Wpf.dll", 640000L),
		new DemoFile("bin/language-server/luau-lsp.exe", 11700000L)
	});

	public static DemoFile Bootstrapper { get; } = new DemoFile("CodexBootstrapper.exe", 4800000L);

	public static long SizeOf(string Name)
	{
		return 120000 + Math.Abs(Name.Aggregate(17, (int Hash, char Letter) => Hash * 31 + Letter)) % 2600000;
	}
}
