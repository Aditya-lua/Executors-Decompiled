namespace dotnet_codex_bootstrapper.Features.RobloxLauncher;

public sealed record InstallProgress(long Done, long Total, double BytesPerSecond, string File);
