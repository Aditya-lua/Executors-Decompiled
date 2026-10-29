using System;
using System.Collections.Concurrent;
using System.Net.Http;
using System.Text.Json;
using System.Threading.Tasks;
using dotnet_codex_ui.Infrastructure.Logging;

namespace dotnet_codex_ui.Features.Clients;

internal static class GameNames
{
	private static readonly HttpClient Http = new HttpClient
	{
		Timeout = TimeSpan.FromSeconds(10L)
	};

	private static readonly ConcurrentDictionary<long, Task<string?>> Cache = new ConcurrentDictionary<long, Task<string>>();

	internal static Func<long, long, Task<string?>> Lookup { get; set; } = Fetch;

	public static Task<string?> GetAsync(long PlaceId, long UniverseId)
	{
		return Cache.GetOrAdd(PlaceId, (long Id) => Resolve(Id, UniverseId));
	}

	private static async Task<string?> Resolve(long PlaceId, long UniverseId)
	{
		string Name = null;
		try
		{
			Name = await Lookup(PlaceId, UniverseId).ConfigureAwait(continueOnCapturedContext: false);
		}
		catch (Exception ex)
		{
			AppLog.Debug("Game name lookup for place {PlaceId} failed: {Reason}", PlaceId, ex.Message);
		}
		if (string.IsNullOrWhiteSpace(Name))
		{
			Cache.TryRemove(PlaceId, out Task<string> _);
			return null;
		}
		return Name;
	}

	private static async Task<string?> Fetch(long PlaceId, long UniverseId)
	{
		if (UniverseId <= 0)
		{
			using JsonDocument jsonDocument = JsonDocument.Parse(await Http.GetStringAsync($"https://apis.roblox.com/universes/v1/places/{PlaceId}/universe").ConfigureAwait(continueOnCapturedContext: false));
			if (!jsonDocument.RootElement.TryGetProperty("universeId", out var value) || !value.TryGetInt64(out UniverseId))
			{
				return null;
			}
		}
		using JsonDocument jsonDocument2 = JsonDocument.Parse(await Http.GetStringAsync($"https://games.roblox.com/v1/games?universeIds={UniverseId}").ConfigureAwait(continueOnCapturedContext: false));
		JsonElement value2;
		JsonElement value3;
		return (jsonDocument2.RootElement.TryGetProperty("data", out value2) && value2.GetArrayLength() > 0 && value2[0].TryGetProperty("name", out value3)) ? value3.GetString() : null;
	}
}
