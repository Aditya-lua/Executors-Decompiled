using System;

namespace dotnet_codex_ui.Core.Versioning;

internal sealed record VersionSnapshot(string? Roblox, CodexManifest? Manifest, DateTime FetchedAtUtc);
