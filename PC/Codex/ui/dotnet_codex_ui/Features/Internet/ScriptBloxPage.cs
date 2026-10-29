using System.Collections.Generic;

namespace dotnet_codex_ui.Features.Internet;

internal sealed record ScriptBloxPage(IReadOnlyList<ScriptResult> Items, int? NextPage);
