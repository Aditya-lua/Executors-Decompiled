namespace dotnet_codex_ui.Features.Auth;

public sealed class MockUser
{
	public string Id { get; set; } = "mock-0001";

	public string Name { get; set; } = "Mock User (simulated)";

	public string Email { get; set; } = "mock.user@example.invalid";
}
