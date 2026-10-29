using System;

namespace dotnet_codex_ui.Features.Internet;

internal static class ImageUrl
{
	public static string? Normalize(string? Raw)
	{
		if (string.IsNullOrWhiteSpace(Raw))
		{
			return null;
		}
		Raw = Raw.Trim();
		if (Raw.StartsWith("//", StringComparison.Ordinal))
		{
			Raw = "https:" + Raw;
		}
		Uri result;
		if (Raw.StartsWith('/'))
		{
			if (!Uri.TryCreate(ScriptBloxApi.Origin, Raw, out result))
			{
				return null;
			}
		}
		else if (!Uri.TryCreate(Raw, UriKind.Absolute, out result) && (Raw.Contains(':') || !Uri.TryCreate(ScriptBloxApi.Origin, Raw, out result)))
		{
			return null;
		}
		if ((result.Scheme != Uri.UriSchemeHttps && result.Scheme != Uri.UriSchemeHttp) || string.IsNullOrEmpty(result.Host))
		{
			return null;
		}
		UriBuilder uriBuilder = new UriBuilder(result)
		{
			Scheme = Uri.UriSchemeHttps
		};
		if (result.Scheme == Uri.UriSchemeHttp)
		{
			uriBuilder.Port = -1;
		}
		return uriBuilder.Uri.AbsoluteUri;
	}
}
