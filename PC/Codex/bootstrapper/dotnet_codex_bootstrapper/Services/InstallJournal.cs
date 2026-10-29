using System.Collections.Generic;

namespace dotnet_codex_bootstrapper.Services;

public sealed record InstallJournal(string Operation, IReadOnlyList<JournalEntry> Entries);
