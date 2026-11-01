namespace ScriptEditor.Models;

public sealed class HubScript
{
	public string Id { get; init; } = string.Empty;

	public string Title { get; init; } = string.Empty;

	public string Slug { get; init; } = string.Empty;

	public string Description { get; init; } = string.Empty;

	public int Views { get; init; }

	public int Likes { get; init; }

	public int Dislikes { get; init; }

	public bool IsKeySystem { get; init; }

	public bool IsPaid { get; init; }

	public bool IsMobileReady { get; init; }

	public bool IsPatched { get; init; }

	public string? RawScript { get; init; }

	public string? Script { get; init; }

	public string? ImageUrl { get; init; }

	public HubGame? Game { get; init; }

	public HubCreator? Creator { get; init; }

	public HubRisk? Risk { get; init; }

	public string CreatorText
	{
		get
		{
			string text = Creator?.Username;
			if (text == null || text.Length <= 0)
			{
				return "unknown";
			}
			return text;
		}
	}

	public string GameText
	{
		get
		{
			string text = Game?.Title;
			if (text == null || text.Length <= 0)
			{
				return "Universal";
			}
			return text;
		}
	}

	public string StatsText => Format(Views) + " views · " + Format(Likes) + " likes";

	public string? ThumbnailUrl
	{
		get
		{
			string? text = ImageUrl;
			if (text == null)
			{
				HubGame? game = Game;
				if (game == null)
				{
					return null;
				}
				text = game.ThumbnailUrl;
			}
			return text;
		}
	}

	public bool HasRisk => (Risk?.Score).HasValue;

	public string RiskText
	{
		get
		{
			int? num = Risk?.Score;
			if (num.HasValue)
			{
				int valueOrDefault = num.GetValueOrDefault();
				return $"{valueOrDefault}/10 {Risk.Level}".Trim();
			}
			return "Not scanned";
		}
	}

	private static string Format(int value)
	{
		if (value < 1000000)
		{
			if (value >= 1000)
			{
				return $"{(double)value / 1000.0:0.#}K";
			}
			return value.ToString();
		}
		return $"{(double)value / 1000000.0:0.#}M";
	}
}
