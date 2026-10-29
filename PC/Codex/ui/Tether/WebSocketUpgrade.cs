using System;
using System.Buffers;
using System.Collections.Generic;
using System.IO;
using System.Security.Cryptography;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace Tether;

internal static class WebSocketUpgrade
{
	internal readonly record struct Result(bool Success, string? SubProtocol, string? Error);

	private sealed record Validation(bool Ok, int Status, string StatusText, string? Error, string? Key, string? SubProtocol);

	private const int MaxRequestBytes = 4096;

	private const string AcceptGuid = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";

	public static async Task<Result> AcceptAsync(Stream Stream, TetherServerOptions Options, CancellationToken Ct)
	{
		byte[] Buffer = ArrayPool<byte>.Shared.Rent(4096);
		try
		{
			int Length = 0;
			int End = -1;
			while (End < 0)
			{
				if (Length >= 4096)
				{
					return await FailAsync(Stream, 431, "Request Header Fields Too Large", "Upgrade request too large.", Ct).ConfigureAwait(continueOnCapturedContext: false);
				}
				int num = await Stream.ReadAsync(Buffer.AsMemory(Length, 4096 - Length), Ct).ConfigureAwait(continueOnCapturedContext: false);
				if (num == 0)
				{
					return new Result(Success: false, null, "Connection closed during upgrade.");
				}
				int num2 = Math.Max(0, Length - 3);
				Length += num;
				int num3 = ((ReadOnlySpan<byte>)Buffer.AsSpan(num2, Length - num2)).IndexOf("\r\n\r\n"u8);
				if (num3 >= 0)
				{
					End = num2 + num3;
				}
			}
			if (End + 4 != Length)
			{
				return await FailAsync(Stream, 400, "Bad Request", "Data sent before the upgrade completed.", Ct).ConfigureAwait(continueOnCapturedContext: false);
			}
			Validation Validation = Validate(Encoding.ASCII.GetString(Buffer, 0, End), Options);
			if (!Validation.Ok)
			{
				return await FailAsync(Stream, Validation.Status, Validation.StatusText, Validation.Error, Ct).ConfigureAwait(continueOnCapturedContext: false);
			}
			string value = Convert.ToBase64String(SHA1.HashData(Encoding.ASCII.GetBytes(Validation.Key + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11")));
			StringBuilder stringBuilder = new StringBuilder(192).Append("HTTP/1.1 101 Switching Protocols\r\nUpgrade: websocket\r\nConnection: Upgrade\r\nSec-WebSocket-Accept: ").Append(value).Append("\r\n");
			if (Validation.SubProtocol != null)
			{
				stringBuilder.Append("Sec-WebSocket-Protocol: ").Append(Validation.SubProtocol).Append("\r\n");
			}
			stringBuilder.Append("\r\n");
			await Stream.WriteAsync(Encoding.ASCII.GetBytes(stringBuilder.ToString()), Ct).ConfigureAwait(continueOnCapturedContext: false);
			return new Result(Success: true, Validation.SubProtocol, null);
		}
		finally
		{
			ArrayPool<byte>.Shared.Return(Buffer);
		}
	}

	private static Validation Validate(string Request, TetherServerOptions Options)
	{
		string[] array = Request.Split("\r\n");
		string[] array2 = array[0].Split(' ');
		if (array2.Length != 3 || array2[0] != "GET" || array2[2] != "HTTP/1.1")
		{
			return Bad(400, "Bad Request", "Malformed request line.");
		}
		string text = array2[1];
		int num = text.IndexOf('?');
		if (num >= 0)
		{
			text = text.Substring(0, num);
		}
		if (!string.Equals(text, Options.Path, StringComparison.Ordinal))
		{
			return Bad(404, "Not Found", "Unknown path '" + text + "'.");
		}
		Dictionary<string, string> dictionary = new Dictionary<string, string>(StringComparer.OrdinalIgnoreCase);
		for (int i = 1; i < array.Length; i++)
		{
			string text2 = array[i];
			int num2 = text2.IndexOf(':');
			if (num2 <= 0)
			{
				return Bad(400, "Bad Request", "Malformed header line.");
			}
			string key = text2.Substring(0, num2).Trim();
			string text3 = text2.Substring(num2 + 1).Trim();
			dictionary[key] = (dictionary.TryGetValue(key, out var value) ? (value + ", " + text3) : text3);
		}
		if (Options.RejectBrowserOrigins && dictionary.ContainsKey("Origin"))
		{
			return Bad(403, "Forbidden", "Browser origins are not allowed.");
		}
		if (!HasToken(dictionary, "Upgrade", "websocket") || !HasToken(dictionary, "Connection", "upgrade"))
		{
			return Bad(400, "Bad Request", "Not a WebSocket upgrade request.");
		}
		if (!dictionary.TryGetValue("Sec-WebSocket-Version", out var value2) || value2 != "13")
		{
			return Bad(426, "Upgrade Required", "Unsupported WebSocket version.");
		}
		if (!dictionary.TryGetValue("Sec-WebSocket-Key", out var value3) || !IsValidKey(value3))
		{
			return Bad(400, "Bad Request", "Missing or invalid Sec-WebSocket-Key.");
		}
		string subProtocol = null;
		if (!string.IsNullOrEmpty(Options.SubProtocol))
		{
			if (!HasToken(dictionary, "Sec-WebSocket-Protocol", Options.SubProtocol, StringComparison.Ordinal))
			{
				return Bad(400, "Bad Request", "Missing or unsupported subprotocol.");
			}
			subProtocol = Options.SubProtocol;
		}
		return new Validation(Ok: true, 101, "Switching Protocols", null, value3, subProtocol);
	}

	private static Validation Bad(int Status, string Text, string Error)
	{
		return new Validation(Ok: false, Status, Text, Error, null, null);
	}

	private static bool HasToken(Dictionary<string, string> Headers, string Name, string Token, StringComparison Comparison = StringComparison.OrdinalIgnoreCase)
	{
		if (!Headers.TryGetValue(Name, out string value))
		{
			return false;
		}
		string[] array = value.Split(',');
		for (int i = 0; i < array.Length; i++)
		{
			if (array[i].Trim().Equals(Token, Comparison))
			{
				return true;
			}
		}
		return false;
	}

	private static bool IsValidKey(string Key)
	{
		Span<byte> bytes = stackalloc byte[32];
		if (Convert.TryFromBase64String(Key, bytes, out var bytesWritten))
		{
			return bytesWritten == 16;
		}
		return false;
	}

	private static async Task<Result> FailAsync(Stream Stream, int Status, string Text, string Error, CancellationToken Ct)
	{
		try
		{
			byte[] bytes = Encoding.ASCII.GetBytes($"HTTP/1.1 {Status} {Text}\r\nConnection: close\r\nContent-Length: 0\r\n\r\n");
			await Stream.WriteAsync(bytes, Ct).ConfigureAwait(continueOnCapturedContext: false);
		}
		catch
		{
		}
		return new Result(Success: false, null, Error);
	}
}
