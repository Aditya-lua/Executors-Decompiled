using System;
using System.Diagnostics;
using System.Threading.Tasks;
using dotnet_codex_ui.Controls;
using dotnet_codex_ui.Infrastructure.Logging;
using dotnet_codex_ui.Services;

namespace dotnet_codex_ui.Features.Auth;

internal static class AccountActions
{
	public static ConfirmDialog? Dialog { get; set; }

	public static Action? ShowLogin { get; set; }

	public static Task RegisterAsync()
	{
		return ConfirmAndOpenAsync(WebsiteRoute.Register, "You'll be redirected to the main website to create your account in your browser.");
	}

	public static Task ForgotAsync()
	{
		return ConfirmAndOpenAsync(WebsiteRoute.Forgot, "You'll be redirected to the main website to recover access to your account in your browser.");
	}

	public static Task SubscriptionAsync()
	{
		return ConfirmAndOpenAsync(WebsiteRoute.Subscription, "You'll be redirected to the main website to manage your subscription in your browser.");
	}

	public static Task ProfileAsync()
	{
		if (!AuthModePolicy.BackendEnabled)
		{
			ToastService.ShowInfo("Accounts Unavailable", "Sign-in is currently unavailable.");
			return Task.CompletedTask;
		}
		if (!AuthService.IsSignedIn)
		{
			ShowLogin?.Invoke();
			return Task.CompletedTask;
		}
		return ConfirmAndOpenAsync(WebsiteRoute.Profile, "You'll be redirected to the main website to manage your account in your browser.");
	}

	private static async Task ConfirmAndOpenAsync(WebsiteRoute Route, string Message)
	{
		bool flag = Dialog == null;
		if (!flag)
		{
			flag = !(await Dialog.ShowAsync("Continue to the Website?", Message, "Icon.ExternalLink", "Continue"));
		}
		if (flag)
		{
			return;
		}
		Uri uri = AuthService.Config.WebsiteUri(Route);
		if ((object)uri == null)
		{
			ToastService.ShowWarning("Link Not Configured", "This website link isn't set in auth.json.");
			return;
		}
		try
		{
			Process.Start(new ProcessStartInfo(uri.AbsoluteUri)
			{
				UseShellExecute = true
			});
		}
		catch (Exception ex)
		{
			AppLog.Error(ex, null, "ConfirmAndOpenAsync", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Features\\Auth\\AccountActions.cs");
			ToastService.ShowError("Couldn't open the browser", "Open the website manually from your browser.", null, ex);
		}
	}
}
