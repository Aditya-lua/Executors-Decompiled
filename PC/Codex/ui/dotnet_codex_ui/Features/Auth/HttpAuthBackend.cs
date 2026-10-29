using System;
using System.Net;
using System.Net.Http;
using System.Net.Http.Headers;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using Newtonsoft.Json;
using Newtonsoft.Json.Linq;

namespace dotnet_codex_ui.Features.Auth;

internal sealed class HttpAuthBackend(AuthConfig Config) : IAuthBackend
{
	private static readonly HttpClient Http = new HttpClient
	{
		Timeout = TimeSpan.FromSeconds(10L)
	};

	public bool IsConfigured => Config.IsApiConfigured;

	public bool UsesCallback => true;

	public async Task<LinkOutcome> RequestLinkAsync(string Email, string RedirectUri, string State, CancellationToken Ct)
	{
		try
		{
			using HttpRequestMessage Request = new HttpRequestMessage(HttpMethod.Post, Config.RequestLinkUri)
			{
				Content = Json(new
				{
					email = Email,
					redirectUri = RedirectUri,
					state = State
				})
			};
			using HttpResponseMessage response = await Http.SendAsync(Request, Ct);
			return Map(response);
		}
		catch (OperationCanceledException) when (Ct.IsCancellationRequested)
		{
			return new LinkOutcome(LinkResult.Cancelled);
		}
		catch (TaskCanceledException)
		{
			return new LinkOutcome(LinkResult.Timeout);
		}
		catch (HttpRequestException)
		{
			return new LinkOutcome(LinkResult.Network);
		}
	}

	private static LinkOutcome Map(HttpResponseMessage Response)
	{
		int statusCode = (int)Response.StatusCode;
		if (statusCode >= 200 && statusCode < 300)
		{
			return new LinkOutcome(LinkResult.Sent);
		}
		bool flag;
		switch (statusCode)
		{
		case 429:
		{
			TimeSpan timeSpan = TimeSpan.FromSeconds(60L);
			TimeSpan? timeSpan2 = Response.Headers.RetryAfter?.Delta;
			if (timeSpan2.HasValue)
			{
				TimeSpan valueOrDefault = timeSpan2.GetValueOrDefault();
				timeSpan = valueOrDefault;
			}
			else
			{
				DateTimeOffset? dateTimeOffset = Response.Headers.RetryAfter?.Date;
				if (dateTimeOffset.HasValue)
				{
					DateTimeOffset valueOrDefault2 = dateTimeOffset.GetValueOrDefault();
					timeSpan = valueOrDefault2 - DateTimeOffset.UtcNow;
				}
			}
			return new LinkOutcome(LinkResult.RateLimited, TimeSpan.FromSeconds(Math.Clamp(timeSpan.TotalSeconds, 1.0, 3600.0)));
		}
		case 400:
		case 422:
			flag = true;
			break;
		default:
			flag = false;
			break;
		}
		if (flag)
		{
			return new LinkOutcome(LinkResult.InvalidEmail);
		}
		return new LinkOutcome((statusCode >= 500) ? LinkResult.Server : LinkResult.InvalidResponse);
	}

	public async Task<ExchangeResult> ExchangeAsync(string Token, CancellationToken Ct)
	{
		_ = 1;
		try
		{
			using HttpRequestMessage Request = new HttpRequestMessage(HttpMethod.Post, Config.ExchangeUri)
			{
				Content = Json(new
				{
					token = Token
				})
			};
			using HttpResponseMessage Response = await Http.SendAsync(Request, Ct);
			int statusCode = (int)Response.StatusCode;
			if ((statusCode < 200 || statusCode >= 300) ? true : false)
			{
				AuthError value;
				switch (statusCode)
				{
				case 410:
					value = AuthError.LinkExpired;
					break;
				case 409:
					value = AuthError.LinkUsed;
					break;
				case 400:
				case 401:
				case 403:
				case 404:
				case 422:
					value = AuthError.LinkInvalid;
					break;
				default:
					value = AuthError.ValidationFailed;
					break;
				}
				return new ExchangeResult(value);
			}
			JObject jObject = JObject.Parse(await Response.Content.ReadAsStringAsync(Ct));
			string text = (string?)jObject["accessToken"];
			if (string.IsNullOrWhiteSpace(text))
			{
				return new ExchangeResult(AuthError.ValidationFailed);
			}
			return new ExchangeResult(null, text, (DateTimeOffset?)jObject["expiresAt"], ReadUser(jObject["user"]));
		}
		catch (Exception ex) when ((ex is HttpRequestException || ex is TaskCanceledException) ? true : false)
		{
			return new ExchangeResult(AuthError.Network);
		}
		catch (Exception ex2) when ((ex2 is JsonException || ex2 is FormatException || ex2 is InvalidCastException) ? true : false)
		{
			return new ExchangeResult(AuthError.ValidationFailed);
		}
	}

	public async Task<SessionFetch> GetSessionAsync(string AccessToken, CancellationToken Ct)
	{
		_ = 1;
		try
		{
			using HttpRequestMessage Request = new HttpRequestMessage(HttpMethod.Get, Config.SessionUri);
			Request.Headers.Authorization = new AuthenticationHeaderValue("Bearer", AccessToken);
			using HttpResponseMessage Response = await Http.SendAsync(Request, Ct);
			HttpStatusCode statusCode = Response.StatusCode;
			if ((statusCode == HttpStatusCode.Unauthorized || statusCode == HttpStatusCode.Forbidden) ? true : false)
			{
				return new SessionFetch(SessionStatus.Unauthorized);
			}
			if (!Response.IsSuccessStatusCode)
			{
				return new SessionFetch(SessionStatus.Unreachable);
			}
			JObject jObject = JObject.Parse(await Response.Content.ReadAsStringAsync(Ct));
			return new SessionFetch(SessionStatus.Ok, ReadUser(jObject["user"]), ParseStatus((string?)jObject["subscription"]?["status"]));
		}
		catch (Exception ex) when ((ex is HttpRequestException || ex is TaskCanceledException) ? true : false)
		{
			return new SessionFetch(SessionStatus.Unreachable);
		}
		catch (Exception ex2) when ((ex2 is JsonException || ex2 is FormatException || ex2 is InvalidCastException) ? true : false)
		{
			return new SessionFetch(SessionStatus.Invalid);
		}
	}

	public async Task<bool> LogoutAsync(string AccessToken, CancellationToken Ct)
	{
		try
		{
			using CancellationTokenSource Cts = CancellationTokenSource.CreateLinkedTokenSource(Ct);
			Cts.CancelAfter(TimeSpan.FromSeconds(5L));
			using HttpRequestMessage Request = new HttpRequestMessage(HttpMethod.Post, Config.LogoutUri);
			Request.Headers.Authorization = new AuthenticationHeaderValue("Bearer", AccessToken);
			using HttpResponseMessage httpResponseMessage = await Http.SendAsync(Request, Cts.Token);
			return httpResponseMessage.IsSuccessStatusCode || httpResponseMessage.StatusCode == HttpStatusCode.Unauthorized;
		}
		catch (Exception ex) when ((ex is HttpRequestException || ex is OperationCanceledException) ? true : false)
		{
			return false;
		}
	}

	private static AuthUser? ReadUser(JToken? Node)
	{
		if (!(Node is JObject))
		{
			return null;
		}
		return new AuthUser((string?)Node["id"], (string?)Node["email"], (string?)Node["name"]);
	}

	private static SubscriptionStatus ParseStatus(string? Value)
	{
		switch (Value?.Trim().ToLowerInvariant())
		{
		case "active":
			return SubscriptionStatus.Active;
		case "none":
		case "inactive":
			return SubscriptionStatus.None;
		case "expired":
			return SubscriptionStatus.Expired;
		case "pending":
		case "verification_required":
			return SubscriptionStatus.Pending;
		default:
			return SubscriptionStatus.Unverified;
		}
	}

	private static StringContent Json(object Value)
	{
		return new StringContent(JsonConvert.SerializeObject(Value), Encoding.UTF8, "application/json");
	}
}
