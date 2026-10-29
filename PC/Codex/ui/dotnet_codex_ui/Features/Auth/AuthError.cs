namespace dotnet_codex_ui.Features.Auth;

public enum AuthError
{
	None,
	NotConfigured,
	ModeNotAllowed,
	LinkExpired,
	LinkUsed,
	LinkInvalid,
	LinkTimeout,
	ValidationFailed,
	Network,
	SessionExpired
}
