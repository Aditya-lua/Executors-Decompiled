using System.Collections.Generic;

namespace dotnet_codex_ui.Features.Internet;

internal static class ScriptProviders
{
	public static readonly IReadOnlyList<IScriptProvider> All = new _003C_003Ez__ReadOnlyArray<IScriptProvider>(new IScriptProvider[2]
	{
		ScriptBloxProvider.Shared,
		new RobloxScriptsProvider()
	});

	public static IScriptProvider Default => All[0];
}
