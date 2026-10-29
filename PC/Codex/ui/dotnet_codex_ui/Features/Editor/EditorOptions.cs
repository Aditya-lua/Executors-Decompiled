using Newtonsoft.Json;

namespace dotnet_codex_ui.Features.Editor;

internal class EditorOptions
{
	[JsonProperty("minimap")]
	internal MinimapOptions? Minimap { get; set; }

	[JsonProperty("inlayHints")]
	internal InlayHintsOptions? InlayHints { get; set; }

	[JsonProperty("fontSize")]
	internal int FontSize { get; set; }

	public bool ShouldSerializeFontSize()
	{
		return FontSize != 0;
	}

	public override string ToString()
	{
		return JsonConvert.SerializeObject(this, Formatting.Indented, new JsonSerializerSettings
		{
			NullValueHandling = NullValueHandling.Ignore
		});
	}
}
