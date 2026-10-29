using System;
using System.IO;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Net.Http.Headers;
using System.Threading;
using System.Threading.Tasks;
using dotnet_codex_bootstrapper.Core.Configuration;

namespace dotnet_codex_bootstrapper.Services;

public sealed class CdnClient(HttpClient Http, CdnEndpoints Endpoints, RetryPolicy Retry)
{
	public static readonly TimeSpan SmallRequestTimeout = TimeSpan.FromSeconds(20L);

	public CdnEndpoints Endpoints { get; } = Endpoints;

	public RetryPolicy Retry { get; } = Retry;

	public static HttpClient CreateHttpClient()
	{
		HttpClient httpClient = new HttpClient(new SocketsHttpHandler
		{
			AllowAutoRedirect = true,
			MaxAutomaticRedirections = 3,
			ConnectTimeout = TimeSpan.FromSeconds(15L),
			AutomaticDecompression = (DecompressionMethods.GZip | DecompressionMethods.Deflate)
		});
		httpClient.Timeout = Timeout.InfiniteTimeSpan;
		httpClient.DefaultRequestHeaders.UserAgent.ParseAdd("CodexBootstrapper/1");
		return httpClient;
	}

	public Task<byte[]> GetBytesAsync(Uri Url, int MaxBytes, CancellationToken Cancel)
	{
		return Retry.RunAsync(async (int _) =>
		{
			using CancellationTokenSource Limit = CancellationTokenSource.CreateLinkedTokenSource(Cancel);
			Limit.CancelAfter(SmallRequestTimeout);
			using HttpResponseMessage Response = await SendAsync(Url, null, Limit.Token);
			byte[] result;
			await using (Stream Stream = await Response.Content.ReadAsStreamAsync(Limit.Token))
			{
				using MemoryStream Buffer = new MemoryStream();
				byte[] Chunk = new byte[16384];
				int num;
				while ((num = await Stream.ReadAsync(Chunk, Limit.Token)) > 0)
				{
					if (Buffer.Length + num > MaxBytes)
					{
						throw new UpdateException("E-NET", "The server response is larger than expected.");
					}
					Buffer.Write(Chunk, 0, num);
				}
				result = Buffer.ToArray();
			}
			return result;
		}, Cancel, "GET " + Url.AbsolutePath);
	}

	public Task<RemoteInfo> HeadAsync(Uri Url, CancellationToken Cancel)
	{
		return Retry.RunAsync(async (int _) =>
		{
			using CancellationTokenSource Limit = CancellationTokenSource.CreateLinkedTokenSource(Cancel);
			Limit.CancelAfter(SmallRequestTimeout);
			using HttpResponseMessage httpResponseMessage = await SendAsync(Url, null, Limit.Token, HttpMethod.Head);
			return new RemoteInfo(Md5FromETag(httpResponseMessage.Headers.ETag?.Tag), httpResponseMessage.Content.Headers.ContentLength ?? (-1));
		}, Cancel, "HEAD " + Url.AbsolutePath);
	}

	public static string? Md5FromETag(string? Tag)
	{
		string text = Tag?.Trim();
		if (text != null && text.StartsWith("W/", StringComparison.OrdinalIgnoreCase))
		{
			text = text.Substring(2);
		}
		text = text?.Trim('"');
		if (text == null || text.Length != 32 || !text.All(Uri.IsHexDigit))
		{
			return null;
		}
		return text.ToLowerInvariant();
	}

	public async Task<HttpResponseMessage> OpenAsync(Uri Url, long? RangeFrom, CancellationToken Cancel)
	{
		return await SendAsync(Url, RangeFrom, Cancel);
	}

	private async Task<HttpResponseMessage> SendAsync(Uri Url, long? RangeFrom, CancellationToken Cancel, HttpMethod? Method = null)
	{
		if (!Endpoints.IsAllowed(Url) && !CdnEndpoints.IsAllowedRuntimeUrl(Url.AbsoluteUri) && !CdnEndpoints.IsAllowedNuGetUrl(Url))
		{
			throw new UpdateException("E-NET", "The address is not on the allowed update hosts.");
		}
		using HttpRequestMessage Request = new HttpRequestMessage(Method ?? HttpMethod.Get, Url);
		if (RangeFrom.HasValue)
		{
			long valueOrDefault = RangeFrom.GetValueOrDefault();
			if (valueOrDefault > 0)
			{
				Request.Headers.Range = new RangeHeaderValue(valueOrDefault, null);
			}
		}
		HttpResponseMessage httpResponseMessage;
		try
		{
			httpResponseMessage = await Http.SendAsync(Request, HttpCompletionOption.ResponseHeadersRead, Cancel);
		}
		catch (HttpRequestException inner)
		{
			throw new CdnException("The update server could not be reached.", null, inner);
		}
		Uri uri = httpResponseMessage.RequestMessage?.RequestUri ?? Url;
		if (!Endpoints.IsAllowed(uri) && !CdnEndpoints.IsAllowedRuntimeUrl(uri.AbsoluteUri) && !CdnEndpoints.IsAllowedNuGetUrl(uri))
		{
			httpResponseMessage.Dispose();
			throw new UpdateException("E-NET", "The update server redirected to a host that is not allowed.");
		}
		if (!httpResponseMessage.IsSuccessStatusCode)
		{
			int statusCode = (int)httpResponseMessage.StatusCode;
			httpResponseMessage.Dispose();
			throw new CdnException($"The update server answered with HTTP {statusCode}.", statusCode);
		}
		return httpResponseMessage;
	}
}
