using System.Collections.Generic;

namespace dotnet_codex_bootstrapper.Features.RobloxLauncher;

public sealed record RegistryKeyRecord(List<RegistryValueRecord> Values, Dictionary<string, RegistryKeyRecord> Children);
