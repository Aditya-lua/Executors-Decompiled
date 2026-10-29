namespace dotnet_codex_ui.Features.Auth;

public sealed class MockOptions
{
	public int DelayMs { get; set; } = 700;

	public MockLinkScenario LinkScenario { get; set; }

	public MockCompletionScenario CompletionScenario { get; set; }

	public MockSubscription Subscription { get; set; }

	public int RetryAfterSeconds { get; set; } = 10;

	public MockUser User { get; set; } = new MockUser();

	public SubscriptionStatus SubscriptionStatus => Subscription switch
	{
		MockSubscription.Active => SubscriptionStatus.Active, 
		MockSubscription.None => SubscriptionStatus.None, 
		MockSubscription.Expired => SubscriptionStatus.Expired, 
		MockSubscription.Pending => SubscriptionStatus.Pending, 
		_ => SubscriptionStatus.Unverified, 
	};
}
