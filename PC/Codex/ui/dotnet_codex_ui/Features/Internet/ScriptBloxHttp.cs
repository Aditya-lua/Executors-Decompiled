using System;
using System.Net.Http;

namespace dotnet_codex_ui.Features.Internet;

internal static class ScriptBloxHttp
{
	public static readonly HttpClient Client = Create();

	private static HttpClient Create()
	{
		HttpClient httpClient = new HttpClient();
		httpClient.Timeout = TimeSpan.FromSeconds(10L);
		httpClient.DefaultRequestHeaders.UserAgent.ParseAdd("Codex");
		return httpClient;
	}
}
