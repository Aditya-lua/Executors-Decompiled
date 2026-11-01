namespace ScriptEditor.Models;

public sealed class HubRisk
{
	public int? Score { get; init; }

	public string Level { get; init; } = string.Empty;

	public bool IsObfuscated { get; init; }

	public string? ObfuscatorDetected { get; init; }
}
