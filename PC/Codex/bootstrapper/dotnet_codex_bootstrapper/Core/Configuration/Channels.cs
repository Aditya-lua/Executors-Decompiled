namespace dotnet_codex_bootstrapper.Core.Configuration;

public static class Channels
{
	public static Channel Default => Channel.Stable;

	public static string NameOf(Channel Value)
	{
		if (Value != Channel.Canary)
		{
			return "stable";
		}
		return "canary";
	}

	public static bool TryParse(string? Text, out Channel Value)
	{
		string text = Text?.Trim().ToLowerInvariant();
		if (!(text == "canary"))
		{
			if (text == "stable")
			{
				Value = Channel.Stable;
				return true;
			}
			Value = Default;
			return false;
		}
		Value = Channel.Canary;
		return true;
	}
}
