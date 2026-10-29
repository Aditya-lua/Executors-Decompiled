namespace dotnet_codex_ui.Features.Auth;

public enum LinkResult
{
	Sent,
	InvalidEmail,
	RateLimited,
	Network,
	Timeout,
	Server,
	InvalidResponse,
	NotConfigured,
	Cancelled,
	Disabled
}
