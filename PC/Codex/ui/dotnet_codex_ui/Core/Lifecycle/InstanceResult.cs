namespace dotnet_codex_ui.Core.Lifecycle;

internal enum InstanceResult
{
	Acquired,
	Recovered,
	AlreadyRunning,
	Failed
}
