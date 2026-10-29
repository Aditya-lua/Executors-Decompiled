using System.Collections.Generic;

namespace dotnet_codex_ui.Features.Explorer;

internal sealed record EnumerateResult(EntryState State, IReadOnlyList<FsEntry> Entries, string Message = "");
