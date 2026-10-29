namespace dotnet_codex_bootstrapper.Services;

public readonly record struct DownloadProgress(long BytesDone, long BytesTotal, double BytesPerSecond);
