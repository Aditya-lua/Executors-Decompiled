using System;

namespace dotnet_codex_ui.Core.Lifecycle;

internal sealed record FatalErrorInfo(string Summary, string ExceptionType, DateTime Timestamp, string Version, string Diagnostics, string? LogPath);
