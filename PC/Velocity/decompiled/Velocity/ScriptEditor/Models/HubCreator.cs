namespace ScriptEditor.Models;

public sealed class HubCreator
{
	public string Username { get; init; } = string.Empty;

	public bool IsVerified { get; init; }

	public bool IsPro { get; init; }
}
