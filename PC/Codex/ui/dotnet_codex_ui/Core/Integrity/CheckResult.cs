namespace dotnet_codex_ui.Core.Integrity;

internal sealed record CheckResult(string Name, CheckSeverity Severity, bool Passed, string Detail);
