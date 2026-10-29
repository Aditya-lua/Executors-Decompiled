using System;
using System.Net;
using System.Net.Mail;
using System.Runtime.CompilerServices;
using System.Security.Cryptography;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using System.Windows.Threading;
using dotnet_codex_ui.Infrastructure.Logging;

namespace dotnet_codex_ui.Features.Auth;

public static class AuthService
{
	private static readonly TimeSpan RefreshInterval;

	private static AuthConfig ConfigField;

	private static IAuthBackend? Backend;

	private static MockAuthBackend? MockField;

	private static string? TokenField;

	private static DateTimeOffset? ExpiresField;

	private static bool RequestBusy;

	private static bool RefreshBusy;

	private static bool LoggingOut;

	private static HttpListener? ListenerField;

	private static CancellationTokenSource? ListenCts;

	private static DispatcherTimer? TimerField;

	[CompilerGenerated]
	private static AuthState State__BackingField;

	public static AuthConfig Config => ConfigField;

	public static AuthMode Mode => ConfigField.EffectiveMode;

	public static string? ModeError => ConfigField.ModeError;

	public static bool DevModesAvailable => AuthModePolicy.DevModesAllowed;

	public static MockOptions MockOptions => ConfigField.Mock;

	public static AuthState State
	{
		[CompilerGenerated]
		get
		{
			return State__BackingField;
		}
		[CompilerGenerated]
		private set
		{
			State__BackingField = value;
		}
	}

	public static AuthError Error { get; private set; }

	public static AuthUser? User { get; private set; }

	public static SubscriptionStatus Subscription { get; private set; }

	public static bool IsSignedIn => State == AuthState.SignedIn;

	public static bool IsBypassed
	{
		get
		{
			if (Mode == AuthMode.Disabled)
			{
				return IsSignedIn;
			}
			return false;
		}
	}

	public static bool IsConfigured
	{
		get
		{
			if (ModeError == null)
			{
				if (Mode == AuthMode.Real)
				{
					return Backend?.IsConfigured ?? false;
				}
				return true;
			}
			return false;
		}
	}

	public static bool HasStoredSession
	{
		get
		{
			if (Mode == AuthMode.Real)
			{
				return SessionStore.Load().HasValue;
			}
			return false;
		}
	}

	public static bool IsLoggingOut => LoggingOut;

	public static event Action? Changed;

	public static event Action? ModeChanged;

	static AuthService()
	{
		RefreshInterval = TimeSpan.FromMinutes(5L);
		ConfigField = new AuthConfig();
		State__BackingField = AuthState.SignedOut;
		Configure(AuthConfig.Load());
	}

	public static void Configure(AuthConfig Config)
	{
		StopListener();
		TimerField?.Stop();
		ConfigField = Config;
		TokenField = null;
		ExpiresField = null;
		User = null;
		Subscription = SubscriptionStatus.Unknown;
		MockField = null;
		Backend = Config.EffectiveMode switch
		{
			AuthMode.Real => (IAuthBackend?)new HttpAuthBackend(Config), 
			AuthMode.Mock => MockField = new MockAuthBackend(Config.Mock), 
			_ => null, 
		};
	}

	public static bool IsValidEmail(string? Email)
	{
		if (string.IsNullOrWhiteSpace(Email) || Email.Length > 254)
		{
			return false;
		}
		string text = Email.Trim();
		if (!MailAddress.TryCreate(text, out MailAddress result) || result.Address != text)
		{
			return false;
		}
		if (result.Host.Contains('.') && !result.Host.StartsWith('.'))
		{
			return !result.Host.EndsWith('.');
		}
		return false;
	}

	private static void Set(AuthState NewState, AuthError NewError = AuthError.None)
	{
		State = NewState;
		Error = NewError;
		if (NewState == AuthState.SignedIn && Backend != null)
		{
			StartTimer();
		}
		else
		{
			TimerField?.Stop();
		}
		Changed?.Invoke();
	}

	private static void StartTimer()
	{
		if (TimerField == null)
		{
			TimerField = CreateTimer();
		}
		TimerField.Start();
	}

	private static DispatcherTimer CreateTimer()
	{
		DispatcherTimer dispatcherTimer = new DispatcherTimer();
		dispatcherTimer.Interval = RefreshInterval;
		dispatcherTimer.Tick += async (object? _, EventArgs _) =>
		{
			await RefreshSubscriptionAsync();
		};
		return dispatcherTimer;
	}

	public static async Task SetModeAsync(AuthMode NewMode)
	{
		if (AuthModePolicy.BackendEnabled && AuthModePolicy.DevModesAllowed && (NewMode != Mode || ModeError != null))
		{
			AuthConfig.SaveDevMode(NewMode);
			ConfigField.EffectiveMode = NewMode;
			ConfigField.ModeError = null;
			Configure(ConfigField);
			Set(AuthState.SignedOut);
			ModeChanged?.Invoke();
			await RestoreSessionAsync();
		}
	}

	public static async Task RestoreSessionAsync()
	{
		if (!AuthModePolicy.BackendEnabled)
		{
			TokenField = null;
			User = null;
			Subscription = SubscriptionStatus.Unknown;
			Set(AuthState.SignedOut);
			return;
		}
		if (ModeError != null)
		{
			Set(AuthState.SignedOut, AuthError.ModeNotAllowed);
			return;
		}
		switch (Mode)
		{
		case AuthMode.Disabled:
			User = new AuthUser("dev-auth-disabled", null, "Development (auth disabled)");
			Subscription = ConfigField.Mock.SubscriptionStatus;
			Set(AuthState.SignedIn);
			return;
		case AuthMode.Mock:
			Set(AuthState.SignedOut);
			return;
		}
		if (!IsConfigured)
		{
			Set(AuthState.SignedOut, AuthError.NotConfigured);
			return;
		}
		(string, DateTimeOffset?)? tuple = SessionStore.Load();
		if (!tuple.HasValue)
		{
			Set(AuthState.SignedOut);
			return;
		}
		DateTimeOffset? item = tuple.Value.Item2;
		if (item.HasValue)
		{
			DateTimeOffset valueOrDefault = item.GetValueOrDefault();
			if (valueOrDefault <= DateTimeOffset.UtcNow)
			{
				SessionStore.Delete();
				Set(AuthState.SignedOut, AuthError.SessionExpired);
				return;
			}
		}
		TokenField = tuple.Value.Item1;
		ExpiresField = tuple.Value.Item2;
		Set(AuthState.Completing);
		switch (await FetchSessionAsync())
		{
		case SessionStatus.Ok:
			Set(AuthState.SignedIn);
			break;
		case SessionStatus.Unauthorized:
			Expire();
			break;
		case SessionStatus.Unreachable:
			TokenField = null;
			Set(AuthState.SignedOut, AuthError.Network);
			break;
		default:
			TokenField = null;
			Set(AuthState.SignedOut, AuthError.ValidationFailed);
			break;
		}
	}

	public static async Task<LinkOutcome> RequestLinkAsync(string? Email, CancellationToken Ct = default(CancellationToken))
	{
		if (!AuthModePolicy.BackendEnabled)
		{
			return new LinkOutcome(LinkResult.Disabled);
		}
		if (Backend == null || !IsConfigured)
		{
			return new LinkOutcome(LinkResult.NotConfigured);
		}
		if (!IsValidEmail(Email))
		{
			return new LinkOutcome(LinkResult.InvalidEmail);
		}
		if (RequestBusy)
		{
			return new LinkOutcome(LinkResult.Cancelled);
		}
		RequestBusy = true;
		try
		{
			StopListener();
			string redirectUri = "";
			string state = "";
			if (Backend.UsesCallback)
			{
				try
				{
					(redirectUri, state) = StartListener();
				}
				catch (Exception failure)
				{
					AppLog.Error(failure, null, "RequestLinkAsync", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Features\\Auth\\AuthService.cs");
					return new LinkOutcome(LinkResult.Network);
				}
			}
			LinkOutcome linkOutcome = await Backend.RequestLinkAsync(Email.Trim(), redirectUri, state, Ct);
			if (linkOutcome.Result == LinkResult.Sent)
			{
				Set(AuthState.AwaitingLink);
			}
			else
			{
				StopListener();
			}
			return linkOutcome;
		}
		finally
		{
			RequestBusy = false;
		}
	}

	public static async Task CompleteMockLoginAsync()
	{
		if (Mode == AuthMode.Mock && State == AuthState.AwaitingLink)
		{
			string text = MockField?.PendingToken;
			if (text != null)
			{
				await CompleteAsync(text);
			}
		}
	}

	public static async Task ExpireMockSessionAsync()
	{
		if (Mode == AuthMode.Mock && IsSignedIn)
		{
			MockField?.InvalidateSession();
			await RefreshSubscriptionAsync();
		}
	}

	private static (string RedirectUri, string State) StartListener()
	{
		for (int i = 0; i < 20; i++)
		{
			int num = Random.Shared.Next(49152, 65535);
			HttpListener httpListener = new HttpListener();
			httpListener.Prefixes.Add($"http://127.0.0.1:{num}/callback/");
			try
			{
				httpListener.Start();
			}
			catch (HttpListenerException)
			{
				httpListener.Close();
				continue;
			}
			string text = Convert.ToHexString(RandomNumberGenerator.GetBytes(16));
			ListenerField = httpListener;
			ListenCts = new CancellationTokenSource(TimeSpan.FromMinutes(Math.Max(1, ConfigField.Callback.TimeoutMinutes)));
			ListenAsync(httpListener, text, num, ListenCts.Token);
			return (RedirectUri: $"http://127.0.0.1:{num}/callback", State: text);
		}
		throw new InvalidOperationException("No free loopback port for the sign-in callback.");
	}

	private static void StopListener()
	{
		HttpListener listenerField = ListenerField;
		CancellationTokenSource listenCts = ListenCts;
		ListenerField = null;
		ListenCts = null;
		try
		{
			listenCts?.Cancel();
			listenCts?.Dispose();
		}
		catch (ObjectDisposedException)
		{
		}
		try
		{
			listenerField?.Close();
		}
		catch (ObjectDisposedException)
		{
		}
	}

	private static async Task ListenAsync(HttpListener Listener, string StateNonce, int Port, CancellationToken Ct)
	{
		_ = 2;
		try
		{
			string Token;
			string Failure;
			bool Accepted;
			do
			{
				HttpListenerContext httpListenerContext = await Listener.GetContextAsync().WaitAsync(Ct);
				Token = null;
				Failure = null;
				Accepted = false;
				try
				{
					HttpListenerRequest request = httpListenerContext.Request;
					if (request.UserHostName == $"127.0.0.1:{Port}" && request.HttpMethod == "GET" && request.Url.AbsolutePath.TrimEnd('/') == "/callback" && FixedEquals(request.QueryString["state"], StateNonce))
					{
						Token = request.QueryString["token"];
						Failure = request.QueryString["error"];
						Accepted = !string.IsNullOrEmpty(Token) || !string.IsNullOrEmpty(Failure);
					}
					await Respond(httpListenerContext, Accepted && string.IsNullOrEmpty(Failure));
				}
				catch (Exception)
				{
				}
			}
			while (!Accepted);
			StopListener();
			if (!string.IsNullOrEmpty(Token))
			{
				await CompleteAsync(Token);
			}
			else
			{
				Fail(MapCallbackError(Failure));
			}
		}
		catch (Exception)
		{
			if (ListenerField == Listener)
			{
				StopListener();
				if (State == AuthState.AwaitingLink)
				{
					Set(AuthState.SignedOut, AuthError.LinkTimeout);
				}
			}
		}
	}

	private static AuthError MapCallbackError(string? Code)
	{
		switch (Code?.ToLowerInvariant())
		{
		case "expired":
			return AuthError.LinkExpired;
		case "used":
		case "already_used":
			return AuthError.LinkUsed;
		default:
			return AuthError.LinkInvalid;
		}
	}

	private static bool FixedEquals(string? A, string B)
	{
		if (A != null)
		{
			return CryptographicOperations.FixedTimeEquals(Encoding.UTF8.GetBytes(A), Encoding.UTF8.GetBytes(B));
		}
		return false;
	}

	private static async Task Respond(HttpListenerContext Context, bool Success)
	{
		string value = (Success ? "You're signed in" : "Sign-in could not be completed");
		string value2 = (Success ? "You can close this tab and return to Codex." : "Return to Codex for details.");
		byte[] bytes = Encoding.UTF8.GetBytes($"<!doctype html><meta charset=utf-8><title>Codex</title><body style=\"background:#13141A;color:#F8F5F2;font-family:Segoe UI,sans-serif;display:grid;place-items:center;height:100vh;margin:0\"><div style=\"text-align:center\"><h2>{value}</h2><p style=\"color:#9FA6AF\">{value2}</p></div></body>");
		HttpListenerResponse Response = Context.Response;
		Response.StatusCode = (Success ? 200 : 400);
		Response.ContentType = "text/html; charset=utf-8";
		Response.Headers["Cache-Control"] = "no-store";
		Response.Headers["Referrer-Policy"] = "no-referrer";
		Response.ContentLength64 = bytes.Length;
		await Response.OutputStream.WriteAsync(bytes);
		Response.Close();
	}

	private static async Task CompleteAsync(string MagicToken)
	{
		if (Backend == null)
		{
			return;
		}
		Set(AuthState.Completing);
		ExchangeResult exchangeResult = await Backend.ExchangeAsync(MagicToken, CancellationToken.None);
		AuthError? error = exchangeResult.Error;
		if (error.HasValue)
		{
			AuthError valueOrDefault = error.GetValueOrDefault();
			Fail(valueOrDefault);
			return;
		}
		TokenField = exchangeResult.AccessToken;
		ExpiresField = exchangeResult.Expires;
		User = exchangeResult.User;
		switch (await FetchSessionAsync())
		{
		case SessionStatus.Ok:
			if (Mode == AuthMode.Real)
			{
				SessionStore.Save(TokenField, ExpiresField);
			}
			Set(AuthState.SignedIn);
			break;
		case SessionStatus.Unreachable:
			Fail(AuthError.Network);
			break;
		default:
			Fail(AuthError.ValidationFailed);
			break;
		}
	}

	private static async Task<SessionStatus> FetchSessionAsync()
	{
		if (TokenField == null || Backend == null)
		{
			return SessionStatus.Unauthorized;
		}
		SessionFetch sessionFetch = await Backend.GetSessionAsync(TokenField, CancellationToken.None);
		if (sessionFetch.Status != SessionStatus.Ok)
		{
			return sessionFetch.Status;
		}
		if ((object)sessionFetch.User == null && (object)User == null)
		{
			return SessionStatus.Invalid;
		}
		if ((object)sessionFetch.User != null)
		{
			User = sessionFetch.User;
		}
		Subscription = sessionFetch.Subscription;
		return SessionStatus.Ok;
	}

	public static async Task RefreshSubscriptionAsync()
	{
		if (!IsSignedIn || RefreshBusy)
		{
			return;
		}
		if (Backend == null)
		{
			Subscription = ConfigField.Mock.SubscriptionStatus;
			Changed?.Invoke();
			return;
		}
		RefreshBusy = true;
		try
		{
			SessionStatus sessionStatus = await FetchSessionAsync();
			if (IsSignedIn)
			{
				switch (sessionStatus)
				{
				case SessionStatus.Ok:
					Changed?.Invoke();
					break;
				case SessionStatus.Unauthorized:
					Expire();
					break;
				default:
					Subscription = SubscriptionStatus.Unverified;
					Changed?.Invoke();
					break;
				}
			}
		}
		finally
		{
			RefreshBusy = false;
		}
	}

	public static void CancelPendingLogin()
	{
		StopListener();
		AuthState state = State;
		if ((uint)(state - 1) <= 1u)
		{
			Set(AuthState.SignedOut);
		}
	}

	public static void Expire()
	{
		ClearLocal();
		Set(AuthState.SessionExpired, AuthError.SessionExpired);
	}

	private static void Fail(AuthError Reason)
	{
		StopListener();
		TokenField = null;
		ExpiresField = null;
		User = null;
		Subscription = SubscriptionStatus.Unknown;
		Set(AuthState.SignedOut, Reason);
	}

	private static void ClearLocal()
	{
		StopListener();
		TokenField = null;
		ExpiresField = null;
		User = null;
		Subscription = SubscriptionStatus.Unknown;
		if (Mode == AuthMode.Real)
		{
			SessionStore.Delete();
		}
	}

	public static async Task<bool> LogoutAsync()
	{
		if (LoggingOut || Mode == AuthMode.Disabled)
		{
			return true;
		}
		LoggingOut = true;
		bool result = true;
		try
		{
			if (TokenField != null && Backend != null)
			{
				result = await Backend.LogoutAsync(TokenField, CancellationToken.None);
			}
		}
		finally
		{
			ClearLocal();
			Set(AuthState.SignedOut);
			LoggingOut = false;
		}
		return result;
	}

	public static void Shutdown()
	{
		StopListener();
		TimerField?.Stop();
	}
}
