namespace dotnet_codex_ui.Features.Auth;

public sealed record SessionFetch(SessionStatus Status, AuthUser? User = null, SubscriptionStatus Subscription = SubscriptionStatus.Unknown);
