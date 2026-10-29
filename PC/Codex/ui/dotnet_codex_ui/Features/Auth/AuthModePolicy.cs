using System;

namespace dotnet_codex_ui.Features.Auth;

public static class AuthModePolicy
{
	public static readonly bool BackendEnabled;

	public static readonly bool DevModesAllowed;

	public const string DevModesDisabledMessage = "Development authentication modes aren't available in this build.";

	public static (AuthMode Mode, string? Error) Resolve(string? Requested, bool DevAllowed)
	{
		if (!BackendEnabled)
		{
			return (Mode: AuthMode.Disabled, Error: null);
		}
		if (!DevAllowed)
		{
			if (!string.IsNullOrWhiteSpace(Requested) && !Requested.Trim().Equals("Real", StringComparison.OrdinalIgnoreCase))
			{
				return (Mode: AuthMode.Real, Error: "Development authentication modes aren't available in this build.");
			}
			return (Mode: AuthMode.Real, Error: null);
		}
		AuthMode item = AuthMode.Mock;
		if (string.IsNullOrWhiteSpace(Requested))
		{
			return (Mode: item, Error: null);
		}
		if (!Enum.TryParse<AuthMode>(Requested.Trim(), ignoreCase: true, out var result) || !Enum.IsDefined(result))
		{
			return (Mode: AuthMode.Real, Error: "Unknown authentication mode '" + Requested.Trim() + "'. Use Mock, Disabled or Real.");
		}
		if (result != AuthMode.Real && !DevAllowed)
		{
			return (Mode: AuthMode.Real, Error: "Development authentication modes aren't available in this build.");
		}
		return (Mode: result, Error: null);
	}
}
