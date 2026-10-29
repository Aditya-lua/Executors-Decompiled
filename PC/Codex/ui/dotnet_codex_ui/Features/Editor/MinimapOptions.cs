using Newtonsoft.Json;

namespace dotnet_codex_ui.Features.Editor;

internal class MinimapOptions
{
	[JsonProperty("enabled")]
	internal bool Enabled { get; set; }

	[JsonProperty("side")]
	internal string? Side { get; set; }

	internal MinimapOptions(bool Enabled)
	{
		this.Enabled = Enabled;
	}
}
