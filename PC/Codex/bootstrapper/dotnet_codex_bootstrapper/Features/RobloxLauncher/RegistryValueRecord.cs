using Microsoft.Win32;

namespace dotnet_codex_bootstrapper.Features.RobloxLauncher;

public sealed record RegistryValueRecord(string Name, RegistryValueKind Kind, string? Text = null, long? Number = null, string[]? Lines = null, string? Bytes = null);
