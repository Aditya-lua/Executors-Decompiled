using System.Collections.Generic;

namespace dotnet_codex_bootstrapper.Core.Manifest;

public sealed record AppEntry(string Version, string Executable, IReadOnlyList<FileEntry> Files);
