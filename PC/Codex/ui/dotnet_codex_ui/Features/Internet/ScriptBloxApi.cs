using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using Newtonsoft.Json;
using Newtonsoft.Json.Linq;

namespace dotnet_codex_ui.Features.Internet;

internal sealed class ScriptBloxApi(HttpClient Http)
{
	public const string AttributionHost = "ScriptBlox.com";

	public static readonly Uri Origin = new Uri("https://scriptblox.com");

	public const int MaxSourceBytes = 1048576;

	public static string BuildUrl(string Query, int Page)
	{
		if (Query.Length == 0)
		{
			return $"{Origin}api/script/fetch?page={Page}";
		}
		return $"{Origin}api/script/search?q={Uri.EscapeDataString(Query)}&page={Page}";
	}

	public async Task<ScriptBloxPage> GetPageAsync(string Query, int Page, CancellationToken Cancel)
	{
		using HttpResponseMessage Response = await Http.GetAsync(BuildUrl(Query, Page), Cancel).ConfigureAwait(continueOnCapturedContext: false);
		string text = await Response.Content.ReadAsStringAsync(Cancel).ConfigureAwait(continueOnCapturedContext: false);
		if (!Response.IsSuccessStatusCode)
		{
			throw new ScriptBloxException((Response.StatusCode == HttpStatusCode.TooManyRequests) ? "ScriptBlox is limiting requests right now. Try again in a moment." : (ErrorMessage(text) ?? $"ScriptBlox returned HTTP {(int)Response.StatusCode}."));
		}
		return Parse(text, Page);
	}

	public static bool IsValidSlug(string? Slug)
	{
		if (Slug != null)
		{
			int length = Slug.Length;
			if (length > 0 && length <= 200 && Slug.All((char C) =>
			{
				bool flag = char.IsAsciiLetterOrDigit(C);
				if (!flag)
				{
					bool flag2;
					switch (C)
					{
					case '-':
					case '.':
					case '_':
					case '~':
						flag2 = true;
						break;
					default:
						flag2 = false;
						break;
					}
					flag = flag2;
				}
				return flag;
			}))
			{
				return Slug.Any(char.IsAsciiLetterOrDigit);
			}
		}
		return false;
	}

	public async Task<ScriptDetail> GetDetailAsync(string Slug, CancellationToken Cancel)
	{
		if (!IsValidSlug(Slug))
		{
			throw new ScriptBloxException("This script can't be opened.");
		}
		using HttpResponseMessage Response = await Http.GetAsync($"{Origin}api/script/{Uri.EscapeDataString(Slug)}", Cancel).ConfigureAwait(continueOnCapturedContext: false);
		string text = await Response.Content.ReadAsStringAsync(Cancel).ConfigureAwait(continueOnCapturedContext: false);
		if (!Response.IsSuccessStatusCode)
		{
			throw new ScriptBloxException(Response.StatusCode switch
			{
				HttpStatusCode.NotFound => "This script is no longer available on ScriptBlox.", 
				HttpStatusCode.TooManyRequests => "ScriptBlox is limiting requests right now. Try again in a moment.", 
				_ => ErrorMessage(text) ?? $"ScriptBlox returned HTTP {(int)Response.StatusCode}.", 
			});
		}
		return ParseDetail(text, Slug);
	}

	public static ScriptDetail ParseDetail(string Json, string Slug)
	{
		JObject jObject;
		try
		{
			jObject = Load(Json);
		}
		catch (JsonException)
		{
			throw new ScriptBloxException("ScriptBlox sent a response Codex couldn't read.");
		}
		if (!(jObject["script"] is JObject jObject2))
		{
			throw new ScriptBloxException(ErrorMessage(jObject) ?? "ScriptBlox sent an unexpected response.");
		}
		string text = Str(jObject2["script"]);
		if (string.IsNullOrWhiteSpace(text))
		{
			throw new ScriptBloxException("This script has no usable content.");
		}
		if (Encoding.UTF8.GetByteCount(text) > 1048576)
		{
			throw new ScriptBloxException("This script is too large to load.");
		}
		JObject jObject3 = jObject2["game"] as JObject;
		JObject jObject4 = jObject2["owner"] as JObject;
		List<string> tags = ((jObject2["tags"] is JArray source) ? (from T in source.Select(Str)
			where !string.IsNullOrWhiteSpace(T)
			select T.Trim()).Distinct().Take(24).ToList() : new List<string>());
		string text2 = ImageUrl.Normalize(Str(jObject3?["imageUrl"]));
		string text3 = Str(jObject2["slug"]);
		string slug = ((text3 != null && text3.Length > 0) ? text3 : Slug);
		string text4 = Str(jObject2["title"]);
		string title = ((text4 != null && text4.Length > 0) ? text4 : "Untitled script");
		string? gameName = Str(jObject3?["name"]);
		string? thumbnailUrl = ImageUrl.Normalize(Str(jObject2["image"])) ?? text2;
		string text5 = Str(jObject2["features"]);
		DateTimeOffset result;
		return new ScriptDetail(slug, title, text, gameName, text2, thumbnailUrl, (text5 != null && !string.IsNullOrWhiteSpace(text5)) ? text5.Trim() : null, tags, Str(jObject4?["username"]), Bool(jObject4?["verified"]) == true, Bool(jObject2["verified"]), Long(jObject2["views"]), Long(jObject2["likeCount"]), Long(jObject2["dislikeCount"]), Long(jObject2["executes"]), DateTimeOffset.TryParse(Str(jObject2["createdAt"]), null, DateTimeStyles.AssumeUniversal, out result) ? new DateTimeOffset?(result) : ((DateTimeOffset?)null), Bool(jObject2["isUniversal"]), Bool(jObject2["isPatched"]), Bool(jObject2["key"]), WebLink(Str(jObject2["keyLink"])), WebLink(Str(jObject2["discord"])));
	}

	private static JObject Load(string Json)
	{
		return JsonConvert.DeserializeObject<JObject>(Json, new JsonSerializerSettings
		{
			DateParseHandling = DateParseHandling.None
		}) ?? throw new JsonException("Empty response");
	}

	private static string? WebLink(string? Raw)
	{
		bool flag = Uri.TryCreate(Raw?.Trim(), UriKind.Absolute, out Uri result);
		if (flag)
		{
			string scheme = result.Scheme;
			bool flag2 = ((scheme == "http" || scheme == "https") ? true : false);
			flag = flag2;
		}
		if (!flag)
		{
			return null;
		}
		return result.AbsoluteUri;
	}

	public static ScriptBloxPage Parse(string Json, int Page)
	{
		JObject jObject;
		try
		{
			jObject = Load(Json);
		}
		catch (JsonException)
		{
			throw new ScriptBloxException("ScriptBlox sent a response Codex couldn't read.");
		}
		if (!(jObject["result"] is JObject jObject2))
		{
			throw new ScriptBloxException(ErrorMessage(jObject) ?? "ScriptBlox sent an unexpected response.");
		}
		List<ScriptResult> list = new List<ScriptResult>();
		if (jObject2["scripts"] is JArray jArray)
		{
			foreach (JToken item in jArray)
			{
				if (item is JObject script)
				{
					ScriptResult scriptResult = ToResult(script);
					if ((object)scriptResult != null)
					{
						list.Add(scriptResult);
					}
				}
			}
		}
		int? num = Int(jObject2["nextPage"]);
		int? num2 = Int(jObject2["totalPages"]);
		int num3;
		if (num.HasValue)
		{
			int valueOrDefault = num.GetValueOrDefault();
			if (valueOrDefault > Page)
			{
				if (num2.HasValue)
				{
					int valueOrDefault2 = num2.GetValueOrDefault();
					num3 = ((valueOrDefault <= valueOrDefault2) ? 1 : 0);
				}
				else
				{
					num3 = 1;
				}
				goto IL_00fc;
			}
		}
		num3 = 0;
		goto IL_00fc;
		IL_00fc:
		bool flag = (byte)num3 != 0;
		return new ScriptBloxPage(list, flag ? num : ((int?)null));
	}

	private static ScriptResult? ToResult(JObject Script)
	{
		string text = Str(Script["_id"]);
		if (string.IsNullOrWhiteSpace(text))
		{
			return null;
		}
		JObject jObject = Script["game"] as JObject;
		string text2 = Str(Script["slug"]);
		string text3 = ImageUrl.Normalize(Str(jObject?["imageUrl"]));
		DateTimeOffset? updated = (DateTimeOffset.TryParse(Str(Script["lastBump"]) ?? Str(Script["createdAt"]), null, DateTimeStyles.AssumeUniversal, out var result) ? new DateTimeOffset?(result) : ((DateTimeOffset?)null));
		string text4 = Str(Script["title"]);
		string title = ((text4 != null && text4.Length > 0) ? text4 : "Untitled script");
		string text5 = Str(jObject?["name"]);
		return new ScriptResult(Author: (text5 != null && text5.Length > 0) ? text5 : ((Bool(Script["isUniversal"]) == true) ? "Universal" : "ScriptBlox"), Features: Features(Script, Str(jObject?["name"])), Access: Access(Script), Status: (Bool(Script["isPatched"]) == true) ? "Patched" : "Working", Executes: Long(Script["executes"]), Slug: string.IsNullOrWhiteSpace(text2) ? null : text2, Id: text, Title: title, Description: null, GameName: Str(jObject?["name"]), RequiresKey: Bool(Script["key"]), Views: Long(Script["views"]), Updated: updated, Url: string.IsNullOrWhiteSpace(text2) ? null : $"{Origin}script/{Uri.EscapeDataString(text2)}", ThumbnailUrl: ImageUrl.Normalize(Str(Script["image"])) ?? text3, GameImageUrl: text3, Verified: Bool(Script["verified"]), IsUniversal: Bool(Script["isUniversal"]), IsPatched: Bool(Script["isPatched"]));
	}

	private static List<string> Features(JObject Script, string? Game)
	{
		List<string> list = new List<string>();
		if (!string.IsNullOrWhiteSpace(Game))
		{
			list.Add(Game);
		}
		else if (Bool(Script["isUniversal"]) == true)
		{
			list.Add("Universal script");
		}
		long? num = Long(Script["views"]);
		if (num.HasValue)
		{
			long valueOrDefault = num.GetValueOrDefault();
			list.Add(ScriptResult.Compact(valueOrDefault) + " views");
		}
		num = Long(Script["executes"]);
		if (num.HasValue)
		{
			long valueOrDefault2 = num.GetValueOrDefault();
			list.Add(ScriptResult.Compact(valueOrDefault2) + " executes");
		}
		if (list.Count < 3)
		{
			num = Long(Script["likeCount"]);
			if (num.HasValue)
			{
				long valueOrDefault3 = num.GetValueOrDefault();
				list.Add(ScriptResult.Compact(valueOrDefault3) + " likes");
			}
		}
		return list.Take(3).ToList();
	}

	private static string Access(JObject Script)
	{
		if (Bool(Script["key"]) == true)
		{
			return "Key System";
		}
		if (!(Str(Script["scriptType"])?.ToLowerInvariant() == "paid"))
		{
			return "Free";
		}
		return "Paid";
	}

	private static string? ErrorMessage(string Body)
	{
		try
		{
			return ErrorMessage(Load(Body));
		}
		catch (JsonException)
		{
			return null;
		}
	}

	private static string? ErrorMessage(JObject Root)
	{
		string text = Str(Root["message"]) ?? Str(Root["error"]);
		if (!string.IsNullOrWhiteSpace(text))
		{
			if (text.Length <= 200)
			{
				return text;
			}
			return text.Substring(0, 200);
		}
		return null;
	}

	private static string? Str(JToken? Token)
	{
		if (!(Token is JValue { Type: JTokenType.String } jValue))
		{
			return null;
		}
		return (string)jValue.Value;
	}

	private static bool? Bool(JToken? Token)
	{
		if (!(Token is JValue { Type: JTokenType.Boolean } jValue))
		{
			return null;
		}
		return (bool)jValue.Value;
	}

	private static long? Long(JToken? Token)
	{
		JValue jValue = Token as JValue;
		bool flag;
		if (jValue != null)
		{
			JTokenType type = jValue.Type;
			if ((uint)(type - 6) <= 1u)
			{
				flag = true;
				goto IL_001d;
			}
		}
		flag = false;
		goto IL_001d;
		IL_001d:
		if (!flag)
		{
			return null;
		}
		return Convert.ToInt64(jValue.Value);
	}

	private static int? Int(JToken? Token)
	{
		long? num = Long(Token);
		if (num.HasValue)
		{
			long valueOrDefault = num.GetValueOrDefault();
			if (valueOrDefault >= 0 && valueOrDefault <= int.MaxValue)
			{
				return (int)valueOrDefault;
			}
		}
		return null;
	}
}
