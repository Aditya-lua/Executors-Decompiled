namespace dotnet_codex_ui.Features.Auth;

public sealed class WebsiteConfig
{
	public string BaseUrl { get; set; } = "";

	public WebsiteRoutes Routes { get; set; } = new WebsiteRoutes();
}
