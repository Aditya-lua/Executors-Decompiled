using System;
using System.Security.Cryptography;
using System.Threading;
using System.Threading.Tasks;

namespace dotnet_codex_ui.Features.Auth;

internal sealed class MockAuthBackend(MockOptions Options) : IAuthBackend
{
	private string? PendingTokenField;

	private string? PendingEmail;

	private string? SessionToken;

	private string? UserEmail;

	private bool FailSession;

	private bool Invalidated;

	public bool IsConfigured => true;

	public bool UsesCallback => false;

	public string? PendingToken => PendingTokenField;

	private Task Delay(CancellationToken Ct)
	{
		if (Options.DelayMs <= 0)
		{
			return Task.CompletedTask;
		}
		return Task.Delay(Options.DelayMs, Ct);
	}

	public async Task<LinkOutcome> RequestLinkAsync(string Email, string RedirectUri, string State, CancellationToken Ct)
	{
		try
		{
			await Delay(Ct);
		}
		catch (OperationCanceledException)
		{
			return new LinkOutcome(LinkResult.Cancelled);
		}
		switch (Options.LinkScenario)
		{
		case MockLinkScenario.NetworkError:
			return new LinkOutcome(LinkResult.Network);
		case MockLinkScenario.ServerError:
			return new LinkOutcome(LinkResult.Server);
		case MockLinkScenario.InvalidEmail:
			return new LinkOutcome(LinkResult.InvalidEmail);
		case MockLinkScenario.RateLimited:
			return new LinkOutcome(LinkResult.RateLimited, TimeSpan.FromSeconds(Math.Max(1, Options.RetryAfterSeconds)));
		default:
			PendingTokenField = "mock-" + Convert.ToHexString(RandomNumberGenerator.GetBytes(12));
			PendingEmail = Email;
			return new LinkOutcome(LinkResult.Sent);
		}
	}

	public async Task<ExchangeResult> ExchangeAsync(string Token, CancellationToken Ct)
	{
		try
		{
			await Delay(Ct);
		}
		catch (OperationCanceledException)
		{
			return new ExchangeResult(AuthError.Network);
		}
		if (PendingTokenField == null || Token != PendingTokenField)
		{
			return new ExchangeResult(AuthError.LinkInvalid);
		}
		switch (Options.CompletionScenario)
		{
		case MockCompletionScenario.LinkExpired:
			return new ExchangeResult(AuthError.LinkExpired);
		case MockCompletionScenario.LinkUsed:
			return new ExchangeResult(AuthError.LinkUsed);
		case MockCompletionScenario.LinkInvalid:
			return new ExchangeResult(AuthError.LinkInvalid);
		default:
		{
			string text = PendingEmail ?? Options.User.Email;
			PendingTokenField = null;
			PendingEmail = null;
			UserEmail = text;
			SessionToken = "mock-session-" + Convert.ToHexString(RandomNumberGenerator.GetBytes(12));
			Invalidated = false;
			FailSession = Options.CompletionScenario == MockCompletionScenario.AuthFailure;
			return new ExchangeResult(null, SessionToken, DateTimeOffset.UtcNow.AddHours(1.0), new AuthUser(Options.User.Id, text, Options.User.Name));
		}
		}
	}

	public Task<SessionFetch> GetSessionAsync(string AccessToken, CancellationToken Ct)
	{
		if (FailSession || Invalidated || SessionToken == null || AccessToken != SessionToken)
		{
			return Task.FromResult(new SessionFetch(SessionStatus.Unauthorized));
		}
		return Task.FromResult(new SessionFetch(SessionStatus.Ok, new AuthUser(Options.User.Id, UserEmail ?? Options.User.Email, Options.User.Name), Options.SubscriptionStatus));
	}

	public Task<bool> LogoutAsync(string AccessToken, CancellationToken Ct)
	{
		SessionToken = null;
		return Task.FromResult(result: true);
	}

	public void InvalidateSession()
	{
		Invalidated = true;
	}
}
