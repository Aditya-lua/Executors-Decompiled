using System.Threading;
using System.Threading.Tasks;

namespace dotnet_codex_ui.Features.Auth;

internal interface IAuthBackend
{
	bool IsConfigured { get; }

	bool UsesCallback { get; }

	Task<LinkOutcome> RequestLinkAsync(string Email, string RedirectUri, string State, CancellationToken Ct);

	Task<ExchangeResult> ExchangeAsync(string Token, CancellationToken Ct);

	Task<SessionFetch> GetSessionAsync(string AccessToken, CancellationToken Ct);

	Task<bool> LogoutAsync(string AccessToken, CancellationToken Ct);
}
