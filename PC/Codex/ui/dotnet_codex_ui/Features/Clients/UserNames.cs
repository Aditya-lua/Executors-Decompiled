using System;
using System.Collections.Concurrent;
using System.Net.Http;
using System.Text.Json;
using System.Threading.Tasks;
using dotnet_codex_ui.Infrastructure.Logging;

namespace dotnet_codex_ui.Features.Clients;

internal static class UserNames
{
	private static readonly HttpClient Http = new HttpClient
	{
		Timeout = TimeSpan.FromSeconds(10L)
	};

	private static readonly ConcurrentDictionary<long, Task<string?>> Cache = new ConcurrentDictionary<long, Task<string>>();

	private static readonly ConcurrentDictionary<long, Task<string?>> AvatarCache = new ConcurrentDictionary<long, Task<string>>();

	internal static Func<long, Task<string?>> Lookup { get; set; } = Fetch;

	internal static Func<long, Task<string?>> AvatarLookup { get; set; } = FetchAvatar;

	public static Task<string?> GetAvatarUrlAsync(long UserId)
	{
		return AvatarCache.GetOrAdd(UserId, async (long Id) =>
		{
			Task<string> value;
			try
			{
				string text = await AvatarLookup(Id).ConfigureAwait(continueOnCapturedContext: false);
				if (string.IsNullOrWhiteSpace(text))
				{
					AvatarCache.TryRemove(Id, out value);
				}
				return text;
			}
			catch (Exception ex)
			{
				AppLog.Debug("Avatar lookup for user {UserId} failed: {Reason}", Id, ex.Message);
				AvatarCache.TryRemove(Id, out value);
				return (string?)null;
			}
		});
	}

	private static async Task<string?> FetchAvatar(long UserId)
	{
		using JsonDocument jsonDocument = JsonDocument.Parse(await Http.GetStringAsync($"https://thumbnails.roblox.com/v1/users/avatar-headshot?userIds={UserId}&size=150x150&format=Png").ConfigureAwait(continueOnCapturedContext: false));
		JsonElement value;
		JsonElement value2;
		return (jsonDocument.RootElement.TryGetProperty("data", out value) && value.GetArrayLength() > 0 && value[0].TryGetProperty("imageUrl", out value2)) ? value2.GetString() : null;
	}

	public static Task<string?> GetAsync(long UserId)
	{
		return Cache.GetOrAdd(UserId, (long Id) => Resolve(Id));
	}

	private static async Task<string?> Resolve(long UserId)
	{
		string Name = null;
		try
		{
			Name = await Lookup(UserId).ConfigureAwait(continueOnCapturedContext: false);
		}
		catch (Exception ex)
		{
			AppLog.Debug("Name lookup for user {UserId} failed: {Reason}", UserId, ex.Message);
		}
		if (string.IsNullOrWhiteSpace(Name))
		{
			Cache.TryRemove(UserId, out Task<string> _);
			return null;
		}
		return Name;
	}

	private static async Task<string?> Fetch(long UserId)
	{
		using JsonDocument jsonDocument = JsonDocument.Parse(await Http.GetStringAsync($"https://users.roblox.com/v1/users/{UserId}").ConfigureAwait(continueOnCapturedContext: false));
		JsonElement value;
		return jsonDocument.RootElement.TryGetProperty("name", out value) ? value.GetString() : null;
	}
}
