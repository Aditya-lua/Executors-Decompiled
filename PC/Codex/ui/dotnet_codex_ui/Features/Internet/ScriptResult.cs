using System;
using System.Collections.Generic;

namespace dotnet_codex_ui.Features.Internet;

internal sealed record ScriptResult(string Id, string Title, string? Description = null, string? Author = null, string? GameName = null, bool? RequiresKey = null, long? Views = null, DateTimeOffset? Updated = null, string? Url = null, string? ThumbnailUrl = null, string? GameImageUrl = null, bool? Verified = null, bool? IsUniversal = null, bool? IsPatched = null, IReadOnlyList<string>? Features = null, string? Access = null, string? Status = null, long? Executes = null, string? Slug = null)
{
	public bool IsHot { get; init; }

	public bool HasFeatures
	{
		get
		{
			IReadOnlyList<string> features = Features;
			if (features != null)
			{
				return features.Count > 0;
			}
			return false;
		}
	}

	public bool HasGame
	{
		get
		{
			string gameName = GameName;
			if (gameName != null)
			{
				return gameName.Length > 0;
			}
			return false;
		}
	}

	public bool HasViews => Views.HasValue;

	public string ViewsText
	{
		get
		{
			long? views = Views;
			if (views.HasValue)
			{
				long valueOrDefault = views.GetValueOrDefault();
				return Compact(valueOrDefault) + " views";
			}
			return string.Empty;
		}
	}

	public string Initial
	{
		get
		{
			if (Title.Length <= 0)
			{
				return "?";
			}
			return char.ToUpperInvariant(Title[0]).ToString();
		}
	}

	public string SourceInitial
	{
		get
		{
			string gameName = GameName;
			if (gameName == null || gameName.Length <= 0)
			{
				return AuthorInitial;
			}
			return char.ToUpperInvariant(GameName[0]).ToString();
		}
	}

	public string AuthorInitial
	{
		get
		{
			string author = Author;
			if (author == null || author.Length <= 0)
			{
				return "?";
			}
			return char.ToUpperInvariant(Author[0]).ToString();
		}
	}

	public static string Compact(long Count)
	{
		if (Count < 1000000)
		{
			if (Count >= 1000)
			{
				return $"{(double)Count / 1000.0:0.#}K";
			}
			return Count.ToString();
		}
		return $"{(double)Count / 1000000.0:0.#}M";
	}
}
