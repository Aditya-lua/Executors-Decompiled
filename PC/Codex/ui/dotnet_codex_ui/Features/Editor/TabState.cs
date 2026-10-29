using System.Collections.Generic;

namespace dotnet_codex_ui.Features.Editor;

internal sealed record TabState(List<TabSnapshot> Tabs, int Selected);
