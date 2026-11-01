using Newtonsoft.Json;

namespace SolaraUI;

public class ClientData
{
	[JsonProperty("username")]
	public string Username { get; set; }

	[JsonProperty("thumb")]
	public string Thumb { get; set; }

	[JsonProperty("status")]
	public int Status { get; set; }
}
