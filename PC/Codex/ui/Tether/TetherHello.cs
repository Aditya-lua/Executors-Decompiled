using System;
using System.Diagnostics.CodeAnalysis;
using System.Globalization;
using System.IO;
using System.Text.Json;

namespace Tether;

public sealed class TetherHello
{
	public required int ProcessID { get; init; }

	public override string ToString()
	{
		return $"pid={ProcessID}";
	}

	internal byte[] ToJson()
	{
		using MemoryStream memoryStream = new MemoryStream(32);
		using (Utf8JsonWriter utf8JsonWriter = new Utf8JsonWriter(memoryStream))
		{
			utf8JsonWriter.WriteStartObject();
			utf8JsonWriter.WriteNumber("ProcessID", ProcessID);
			utf8JsonWriter.WriteEndObject();
		}
		return memoryStream.ToArray();
	}

	internal static bool TryParse(ReadOnlySpan<byte> Json, [NotNullWhen(true)] out TetherHello? Hello)
	{
		Hello = null;
		if (Json.Length < 2 || Json.Length > 1024)
		{
			return false;
		}
		long Value = 0L;
		bool flag = false;
		try
		{
			Utf8JsonReader Reader = new Utf8JsonReader(Json, new JsonReaderOptions
			{
				MaxDepth = 8
			});
			if (!Reader.Read() || Reader.TokenType != JsonTokenType.StartObject)
			{
				return false;
			}
			while (Reader.Read() && Reader.TokenType != JsonTokenType.EndObject)
			{
				if (Reader.TokenType != JsonTokenType.PropertyName)
				{
					return false;
				}
				string a = Reader.GetString();
				if (!Reader.Read())
				{
					return false;
				}
				if (string.Equals(a, "processid", StringComparison.OrdinalIgnoreCase))
				{
					if (!TryReadInteger(ref Reader, out Value))
					{
						return false;
					}
					flag = true;
				}
				else
				{
					Reader.Skip();
				}
			}
		}
		catch (JsonException)
		{
			return false;
		}
		if (!flag || Value <= 0 || Value > int.MaxValue)
		{
			return false;
		}
		Hello = new TetherHello
		{
			ProcessID = (int)Value
		};
		return true;
	}

	private static bool TryReadInteger(ref Utf8JsonReader Reader, out long Value)
	{
		Value = 0L;
		if (Reader.TokenType == JsonTokenType.Number)
		{
			if (Reader.TryGetInt64(out Value))
			{
				return true;
			}
			if (Reader.TryGetDouble(out var value) && value == Math.Floor(value) && value >= -9.2E+18 && value <= 9.2E+18)
			{
				Value = (long)value;
				return true;
			}
			return false;
		}
		if (Reader.TokenType == JsonTokenType.String)
		{
			return long.TryParse(Reader.GetString(), NumberStyles.AllowLeadingSign, CultureInfo.InvariantCulture, out Value);
		}
		return false;
	}
}
