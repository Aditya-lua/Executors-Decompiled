using System;

namespace dotnet_codex_ui.Features.Auth;

public sealed record LinkOutcome(LinkResult Result, TimeSpan? RetryAfter = null);
