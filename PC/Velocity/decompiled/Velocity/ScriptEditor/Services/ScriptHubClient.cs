using System;
using System.Collections.Generic;
using System.Net;
using System.Net.Http;
using System.Net.Http.Headers;
using System.Text.Json;
using System.Threading;
using System.Threading.Tasks;
using ScriptEditor.Models;

namespace ScriptEditor.Services;

public sealed class ScriptHubClient
{
	public const string DashboardUrl = "https://rscripts.net/dashboard/api";

	private const string BaseUrl = "https://api.rscripts.net";

	public const int MaxPageSize = 48;

	private static readonly HttpClient Http = new HttpClient
	{
		Timeout = TimeSpan.FromSeconds(20L)
	};

	private readonly Func<string?> _apiKey;

	public bool HasApiKey => !string.IsNullOrWhiteSpace(_apiKey());

	public static IReadOnlyList<string> SortOptions { get; } = new _003C_003Ez__ReadOnlyArray<string>(new string[6] { "newest", "oldest", "most-views", "least-views", "most-likes", "trending" });

	public ScriptHubClient(Func<string?> apiKey)
	{
		_apiKey = apiKey;
	}

	public async Task<HubPage> BrowseAsync(string? query, string sort, int page, int limit, HubFilters filters, CancellationToken cancellationToken = default(CancellationToken))
	{
		List<string> list = new List<string>
		{
			$"page={Math.Clamp(page, 1, 200)}",
			$"limit={Math.Clamp(limit, 1, 48)}",
			"sort=" + Uri.EscapeDataString(sort)
		};
		if (!string.IsNullOrWhiteSpace(query))
		{
			list.Add("q=" + Uri.EscapeDataString(query.Trim()));
		}
		if (filters.NoKeySystem)
		{
			list.Add("noKeySystem=true");
		}
		if (filters.MobileOnly)
		{
			list.Add("mobileOnly=true");
		}
		if (filters.FreeOnly)
		{
			list.Add("freeOnly=true");
		}
		if (filters.VerifiedOnly)
		{
			list.Add("verifiedOnly=true");
		}
		using JsonDocument jsonDocument = await GetAsync("/v1/scripts?" + string.Join('&', list), cancellationToken);
		JsonElement rootElement = jsonDocument.RootElement;
		List<HubScript> list2 = new List<HubScript>();
		if (rootElement.TryGetProperty("data", out var value) && value.ValueKind == JsonValueKind.Array)
		{
			foreach (JsonElement item in value.EnumerateArray())
			{
				list2.Add(ReadScript(item));
			}
		}
		JsonElement parent = (rootElement.TryGetProperty("meta", out var value2) ? value2 : default(JsonElement));
		return new HubPage
		{
			Scripts = list2,
			Page = (ReadInt(parent, "page") ?? page),
			TotalPages = (ReadInt(parent, "totalPages") ?? 1),
			Total = (ReadInt(parent, "total") ?? list2.Count),
			HasNextPage = ReadBool(parent, "hasNextPage"),
			HasPrevPage = ReadBool(parent, "hasPrevPage")
		};
	}

	public async Task<HubScript> GetScriptAsync(string slug, CancellationToken cancellationToken = default(CancellationToken))
	{
		using JsonDocument jsonDocument = await GetAsync("/v1/scripts/" + Uri.EscapeDataString(slug), cancellationToken);
		if (!jsonDocument.RootElement.TryGetProperty("data", out var value))
		{
			throw new ScriptHubException("The API returned no script data.");
		}
		return ReadScript(value);
	}

	public async Task<string> DownloadRawAsync(string rawUrl, CancellationToken cancellationToken = default(CancellationToken))
	{
		try
		{
			return await Http.GetStringAsync(rawUrl, cancellationToken);
		}
		catch (HttpRequestException ex)
		{
			throw new ScriptHubException("Could not download the script: " + ex.Message);
		}
	}

	private async Task<JsonDocument> GetAsync(string path, CancellationToken cancellationToken)
	{
		string text = _apiKey();
		if (string.IsNullOrWhiteSpace(text))
		{
			throw new ScriptHubException("No rscripts.net API key set.");
		}
		using HttpRequestMessage request = new HttpRequestMessage(HttpMethod.Get, "https://api.rscripts.net" + path);
		request.Headers.Authorization = new AuthenticationHeaderValue("Bearer", text.Trim());
		HttpResponseMessage response;
		try
		{
			response = await Http.SendAsync(request, cancellationToken);
		}
		catch (HttpRequestException ex)
		{
			throw new ScriptHubException("Could not reach rscripts.net: " + ex.Message);
		}
		catch (TaskCanceledException) when (!cancellationToken.IsCancellationRequested)
		{
			throw new ScriptHubException("rscripts.net timed out.");
		}
		using (response)
		{
			string text2 = await response.Content.ReadAsStringAsync(cancellationToken);
			if (!response.IsSuccessStatusCode)
			{
				throw Describe(response, text2);
			}
			try
			{
				return JsonDocument.Parse(text2);
			}
			catch (JsonException)
			{
				throw new ScriptHubException("rscripts.net returned a malformed response.");
			}
		}
	}

	private static ScriptHubException Describe(HttpResponseMessage response, string body)
	{
		string text = null;
		try
		{
			using JsonDocument jsonDocument = JsonDocument.Parse(body);
			if (jsonDocument.RootElement.TryGetProperty("error", out var value))
			{
				if (value.ValueKind == JsonValueKind.String)
				{
					text = value.GetString();
				}
				else
				{
					text = (value.TryGetProperty("message", out var value2) ? value2.GetString() : null);
				}
			}
		}
		catch (JsonException)
		{
		}
		switch (response.StatusCode)
		{
		case HttpStatusCode.Unauthorized:
			return new ScriptHubException("rscripts.net rejected the API key. Check it in Settings → Script Hub.");
		case HttpStatusCode.NotFound:
			return new ScriptHubException("That script no longer exists.");
		case HttpStatusCode.TooManyRequests:
		{
			TimeSpan? timeSpan = response.Headers.RetryAfter?.Delta;
			string message;
			if (timeSpan.HasValue)
			{
				TimeSpan valueOrDefault = timeSpan.GetValueOrDefault();
				message = $"Rate limited by rscripts.net — try again in {valueOrDefault.TotalSeconds:0}s.";
			}
			else
			{
				message = "Rate limited by rscripts.net — try again shortly.";
			}
			return new ScriptHubException(message);
		}
		case HttpStatusCode.ServiceUnavailable:
			return new ScriptHubException("rscripts.net search is temporarily unavailable.");
		default:
			return new ScriptHubException((text != null && text.Length > 0) ? ("rscripts.net error: " + text) : $"rscripts.net returned {(int)response.StatusCode}.");
		}
	}

	private static HubScript ReadScript(JsonElement item)
	{
		return new HubScript
		{
			Id = (ReadString(item, "id") ?? string.Empty),
			Title = (ReadString(item, "title") ?? "Untitled"),
			Slug = (ReadString(item, "slug") ?? string.Empty),
			Description = (ReadString(item, "description") ?? string.Empty),
			Views = ReadInt(item, "views").GetValueOrDefault(),
			Likes = ReadInt(item, "likes").GetValueOrDefault(),
			Dislikes = ReadInt(item, "dislikes").GetValueOrDefault(),
			IsKeySystem = ReadBool(item, "isKeySystem"),
			IsPaid = ReadBool(item, "isPaid"),
			IsMobileReady = ReadBool(item, "isMobileReady"),
			IsPatched = ReadBool(item, "isPatched"),
			RawScript = ReadString(item, "rawScript"),
			Script = ReadString(item, "script"),
			ImageUrl = ReadString(item, "imageUrl"),
			Game = ReadObject(item, "game", (JsonElement game) => new HubGame
			{
				PlaceId = ReadString(game, "placeId"),
				Title = (ReadString(game, "title") ?? string.Empty),
				ThumbnailUrl = (ReadString(game, "thumbnailUrl") ?? ReadString(game, "logoUrl"))
			}),
			Creator = ReadObject(item, "creator", (JsonElement creator) => new HubCreator
			{
				Username = (ReadString(creator, "username") ?? string.Empty),
				IsVerified = ReadBool(creator, "isVerified"),
				IsPro = ReadBool(creator, "isPro")
			}),
			Risk = ReadObject(item, "risk", (JsonElement risk) => new HubRisk
			{
				Score = ReadInt(risk, "score"),
				Level = (ReadString(risk, "level") ?? string.Empty),
				IsObfuscated = ReadBool(risk, "isObfuscated"),
				ObfuscatorDetected = ReadString(risk, "obfuscatorDetected")
			})
		};
	}

	private static T? ReadObject<T>(JsonElement parent, string name, Func<JsonElement, T> map) where T : class
	{
		if (parent.ValueKind != JsonValueKind.Object || !parent.TryGetProperty(name, out var value) || value.ValueKind != JsonValueKind.Object)
		{
			return null;
		}
		return map(value);
	}

	private static string? ReadString(JsonElement parent, string name)
	{
		if (parent.ValueKind != JsonValueKind.Object || !parent.TryGetProperty(name, out var value) || value.ValueKind != JsonValueKind.String)
		{
			return null;
		}
		return value.GetString();
	}

	private static int? ReadInt(JsonElement parent, string name)
	{
		if (parent.ValueKind != JsonValueKind.Object || !parent.TryGetProperty(name, out var value) || value.ValueKind != JsonValueKind.Number || !value.TryGetInt32(out var value2))
		{
			return null;
		}
		return value2;
	}

	private static bool ReadBool(JsonElement parent, string name)
	{
		if (parent.ValueKind == JsonValueKind.Object && parent.TryGetProperty(name, out var value))
		{
			return value.ValueKind == JsonValueKind.True;
		}
		return false;
	}
}
