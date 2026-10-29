namespace dotnet_codex_ui.Core.Versioning;

public enum UpdateStatus
{
	Checking,
	UpdateAvailable,
	UpToDate,
	LocalIsNewer,
	CheckFailed,
	Invalid
}
