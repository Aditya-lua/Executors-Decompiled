using dotnet_codex_bootstrapper.Core.Manifest;

namespace dotnet_codex_bootstrapper.Services;

public sealed record FetchedManifest(UpdateManifest Manifest, byte[] Bytes);
