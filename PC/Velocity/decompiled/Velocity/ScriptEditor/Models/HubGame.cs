namespace ScriptEditor.Models;

public sealed class HubGame
{
	public string? PlaceId { get; init; }

	public string Title { get; init; } = string.Empty;

	public string? ThumbnailUrl { get; init; }
}
