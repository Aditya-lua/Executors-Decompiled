using System.Collections.Generic;
using System.Linq;

namespace dotnet_codex_ui.Infrastructure.Processes;

internal sealed record KillResult(IReadOnlyDictionary<string, int> Ended, IReadOnlyList<string> Failed)
{
	public int Total => Ended.Values.Sum();

	public string Title
	{
		get
		{
			if (Failed.Count <= 0)
			{
				if (Total <= 0)
				{
					return "Roblox Isn't Running";
				}
				return "Roblox Closed";
			}
			if (Total <= 0)
			{
				return "Couldn't Close Roblox";
			}
			return "Roblox Partly Closed";
		}
	}

	public string Message
	{
		get
		{
			List<string> list = new List<string>();
			if (Total > 0)
			{
				list.Add($"Ended {Total} process{((Total == 1) ? "" : "es")}: " + string.Join(", ", Ended.Select((KeyValuePair<string, int> P) => (P.Value > 1) ? $"{P.Key} ×{P.Value}" : P.Key)) + ".");
			}
			if (Failed.Count > 0)
			{
				list.Add("Couldn't end: " + string.Join(", ", Failed) + ".");
			}
			if (list.Count <= 0)
			{
				return "No Roblox processes were found.";
			}
			return string.Join(" ", list);
		}
	}
}
