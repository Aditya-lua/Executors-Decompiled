using System;
using System.Collections.Generic;
using System.IO;
using System.Net;
using System.Net.Http;
using System.Net.Http.Headers;
using System.Text;
using System.Text.Json;
using System.Threading;
using System.Threading.Tasks;
using ScriptEditor.Models;

namespace ScriptEditor.Services;

public sealed class VelocityCompletionServer : IDisposable
{
	public readonly record struct InlineCompletionItem(string InsertText, InlineRange? Range = null);

	public readonly record struct InlineRange(int StartLine, int StartCharacter, int EndLine, int EndCharacter);

	private const int MaxPrefixChars = 4000;

	private const int MaxSuffixChars = 1500;

	private static readonly TimeSpan MinimumSpacing = TimeSpan.FromMilliseconds(1200L);

	private static readonly TimeSpan RateLimitBackoff = TimeSpan.FromSeconds(30L);

	private readonly HttpClient _http = new HttpClient
	{
		Timeout = TimeSpan.FromSeconds(20L)
	};

	private readonly AppSettings _settings;

	private CancellationTokenSource? _inFlight;

	private DateTime _blockedUntil = DateTime.MinValue;

	private DateTime _lastSent = DateTime.MinValue;

	private readonly SemaphoreSlim _sendGate = new SemaphoreSlim(1, 1);

	private bool _useMinimalBody;

	private string? _lastMessage;

	public bool IsConfigured
	{
		get
		{
			if (_settings.AiCompletionEnabled)
			{
				return _settings.HasAiApiKey;
			}
			return false;
		}
	}

	public event Action<string, OutputKind>? Message;

	public VelocityCompletionServer(AppSettings settings)
	{
		_settings = settings;
	}

	public async Task<IReadOnlyList<InlineCompletionItem>> InlineCompletionAsync(string prefix, string suffix)
	{
		if (!IsConfigured)
		{
			return Array.Empty<InlineCompletionItem>();
		}
		if (DateTime.UtcNow < _blockedUntil)
		{
			return Array.Empty<InlineCompletionItem>();
		}
		CancellationTokenSource cts = new CancellationTokenSource();
		Interlocked.Exchange(ref _inFlight, cts)?.Cancel();
		try
		{
			string text = await RequestAsync(prefix, suffix, cts.Token);
			IReadOnlyList<InlineCompletionItem> result;
			if (!string.IsNullOrEmpty(text))
			{
				IReadOnlyList<InlineCompletionItem> readOnlyList = new _003C_003Ez__ReadOnlySingleElementList<InlineCompletionItem>(new InlineCompletionItem(text));
				result = readOnlyList;
			}
			else
			{
				IReadOnlyList<InlineCompletionItem> readOnlyList = Array.Empty<InlineCompletionItem>();
				result = readOnlyList;
			}
			return result;
		}
		catch (OperationCanceledException)
		{
			return Array.Empty<InlineCompletionItem>();
		}
		catch (HttpRequestException ex2)
		{
			Report("Completions unavailable: " + ex2.Message);
			return Array.Empty<InlineCompletionItem>();
		}
		catch (JsonException)
		{
			Report("Completions returned a response that could not be read.");
			return Array.Empty<InlineCompletionItem>();
		}
		finally
		{
			Interlocked.CompareExchange(ref _inFlight, null, cts);
			cts.Dispose();
		}
	}

	private async Task<string> RequestAsync(string prefix, string suffix, CancellationToken token)
	{
		object[] messages = BuildMessages(prefix, suffix);
		object body = (_useMinimalBody ? ((object)new
		{
			model = _settings.AiModel,
			messages = messages,
			max_completion_tokens = 160
		}) : ((object)new
		{
			model = _settings.AiModel,
			messages = messages,
			temperature = 0.1,
			max_tokens = 160,
			stop = new string[1] { "```" }
		}));
		return await SendAsync(body, prefix, suffix, token);
	}

	private object[] BuildMessages(string prefix, string suffix)
	{
		return new object[2]
		{
			new
			{
				role = "system",
				content = BuildSystemPrompt()
			},
			new
			{
				role = "user",
				content = "Continue this Luau script at <CURSOR>. Reply with only the text that comes next — no explanation and no code fences.\n\nYour reply is inserted directly at the cursor, so it must begin exactly where <BEFORE> stops. Never restate any part of <BEFORE>, including a word it ends part-way through: after \"local pla\" the reply starts \"yer\", not \"player\".\n\n<BEFORE>\n" + Tail(prefix, 4000) + "\n</BEFORE>\n<CURSOR>\n<AFTER>\n" + Head(suffix, 1500) + "\n</AFTER>"
			}
		};
	}

	private async Task<string> SendAsync(object body, string prefix, string suffix, CancellationToken token)
	{
		using HttpRequestMessage request = new HttpRequestMessage(HttpMethod.Post, _settings.AiBaseUrl + "/chat/completions")
		{
			Content = new StringContent(JsonSerializer.Serialize(body), Encoding.UTF8, "application/json")
		};
		request.Headers.Authorization = new AuthenticationHeaderValue("Bearer", _settings.AiApiKey);
		using HttpResponseMessage response = await SendThrottledAsync(request, token);
		if (!response.IsSuccessStatusCode)
		{
			if (response.StatusCode == HttpStatusCode.TooManyRequests)
			{
				TimeSpan timeSpan = response.Headers.RetryAfter?.Delta ?? RateLimitBackoff;
				_blockedUntil = DateTime.UtcNow + timeSpan;
				Report($"Completions: rate limited, pausing for {timeSpan.TotalSeconds:0}s.");
				return string.Empty;
			}
			if (response.StatusCode == HttpStatusCode.BadRequest && !_useMinimalBody)
			{
				_useMinimalBody = true;
				return await RequestAsync(prefix, suffix, token);
			}
			string text = await ReadErrorAsync(response, token);
			Report((text == null) ? Describe(response.StatusCode) : ("Completions: " + text));
			return string.Empty;
		}
		string result;
		await using (Stream stream = await response.Content.ReadAsStreamAsync(token))
		{
			using JsonDocument jsonDocument = await JsonDocument.ParseAsync(stream, default, token);
			if (!jsonDocument.RootElement.TryGetProperty("choices", out var value) || value.GetArrayLength() == 0)
			{
				result = string.Empty;
			}
			else
			{
				string completion = Clean(value[0].GetProperty("message").GetProperty("content").GetString());
				result = TrimOverlap(prefix, completion);
			}
		}
		return result;
	}

	private static async Task<string?> ReadErrorAsync(HttpResponseMessage response, CancellationToken token)
	{
		try
		{
			string text = await response.Content.ReadAsStringAsync(token);
			if (string.IsNullOrWhiteSpace(text))
			{
				return null;
			}
			using JsonDocument jsonDocument = JsonDocument.Parse(text);
			string text2;
			if (jsonDocument.RootElement.TryGetProperty("error", out var value))
			{
				text2 = (value.TryGetProperty("message", out var value2) ? value2.GetString() : null);
			}
			else
			{
				text2 = null;
			}
			return string.IsNullOrWhiteSpace(text2) ? null : text2.Trim();
		}
		catch (Exception ex) when ((ex is JsonException || ex is IOException || ex is OperationCanceledException) ? true : false)
		{
			return null;
		}
	}

	private async Task<HttpResponseMessage> SendThrottledAsync(HttpRequestMessage request, CancellationToken token)
	{
		await _sendGate.WaitAsync(token);
		try
		{
			TimeSpan timeSpan = DateTime.UtcNow - _lastSent;
			if (timeSpan < MinimumSpacing)
			{
				await Task.Delay(MinimumSpacing - timeSpan, token);
			}
			_lastSent = DateTime.UtcNow;
			return await _http.SendAsync(request, token);
		}
		finally
		{
			_sendGate.Release();
		}
	}

	private static string BuildSystemPrompt()
	{
		StringBuilder stringBuilder = new StringBuilder("You complete Luau code for Velocity, a Roblox script executor. Output raw code only — no prose, no code fences. Alongside the standard Roblox API these are available; prefer them over reimplementing equivalents. ");
		string text = ExecutorSurface.Text;
		stringBuilder.Append((text.Length > 0) ? text : "Assume only the standard Roblox API is available.");
		return stringBuilder.ToString();
	}

	private static string Clean(string? text)
	{
		if (string.IsNullOrEmpty(text))
		{
			return string.Empty;
		}
		string text2 = text.Replace("\r\n", "\n");
		if (text2.StartsWith("```", StringComparison.Ordinal))
		{
			int num = text2.IndexOf('\n');
			if (num >= 0)
			{
				text2 = text2.Substring(num + 1);
			}
			int num2 = text2.LastIndexOf("```", StringComparison.Ordinal);
			if (num2 >= 0)
			{
				text2 = text2.Substring(0, num2);
			}
		}
		return text2.TrimStart('\n').TrimEnd();
	}

	private static string TrimOverlap(string prefix, string completion)
	{
		if (prefix.Length == 0 || completion.Length == 0)
		{
			return completion;
		}
		for (int num = Math.Min(Math.Min(prefix.Length, completion.Length), 200); num > 0; num--)
		{
			if (prefix.AsSpan(prefix.Length - num).SequenceEqual(completion.AsSpan(0, num)))
			{
				return completion.Substring(num);
			}
		}
		return completion;
	}

	private static string Tail(string value, int max)
	{
		if (value.Length > max)
		{
			return value.Substring(value.Length - max);
		}
		return value;
	}

	private static string Head(string value, int max)
	{
		if (value.Length > max)
		{
			return value.Substring(0, max);
		}
		return value;
	}

	private static string Describe(HttpStatusCode status)
	{
		return status switch
		{
			HttpStatusCode.Unauthorized => "Completions: the API key was rejected.", 
			HttpStatusCode.PaymentRequired => "Completions: the account has no credit.", 
			HttpStatusCode.NotFound => "Completions: the model or endpoint was not found.", 
			HttpStatusCode.TooManyRequests => "Completions: rate limited by the provider.", 
			_ => $"Completions: the provider returned {(int)status}.", 
		};
	}

	private void Report(string message)
	{
		if (!(message == _lastMessage))
		{
			_lastMessage = message;
			Message?.Invoke(message, OutputKind.Warning);
		}
	}

	public void Dispose()
	{
		_inFlight?.Cancel();
		_inFlight?.Dispose();
		_sendGate.Dispose();
		_http.Dispose();
	}
}
