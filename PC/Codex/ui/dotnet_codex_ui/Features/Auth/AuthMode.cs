using Newtonsoft.Json;
using Newtonsoft.Json.Converters;

namespace dotnet_codex_ui.Features.Auth;

[JsonConverter(typeof(StringEnumConverter))]
public enum AuthMode
{
	Mock,
	Disabled,
	Real
}
