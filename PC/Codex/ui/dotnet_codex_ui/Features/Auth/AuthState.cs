namespace dotnet_codex_ui.Features.Auth;

public enum AuthState
{
	SignedOut,
	AwaitingLink,
	Completing,
	SignedIn,
	SessionExpired
}
