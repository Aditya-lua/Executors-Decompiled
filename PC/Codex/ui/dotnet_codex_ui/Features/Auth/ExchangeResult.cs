using System;

namespace dotnet_codex_ui.Features.Auth;

public sealed record ExchangeResult(AuthError? Error, string? AccessToken = null, DateTimeOffset? Expires = null, AuthUser? User = null);
