using System.Collections.Generic;

namespace dotnet_codex_ui.Features.Explorer;

internal sealed record ExplorerChanges(IReadOnlyList<string> Modified, IReadOnlyList<string> Deleted, IReadOnlyList<(string Old, string New)> Renamed);
