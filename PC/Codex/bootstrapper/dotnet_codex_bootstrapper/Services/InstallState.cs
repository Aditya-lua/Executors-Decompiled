using System;
using System.Collections.Generic;

namespace dotnet_codex_bootstrapper.Services;

public sealed record InstallState(string AppVersion, string Executable, string BootstrapperVersion, string Channel, IReadOnlyDictionary<string, FileRecord> Files, DateTimeOffset UpdatedUtc);
