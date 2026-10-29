using System.Collections.Generic;
using System.Linq;
using dotnet_codex_ui.Services;

namespace dotnet_codex_ui.Features.Clients;

internal sealed record ExecuteResult(int Selected, IReadOnlyList<string> Sent, IReadOnlyList<(string Name, string Reason)> Failed)
{
	public ToastType Type
	{
		get
		{
			if (Selected != 0)
			{
				if (Failed.Count != 0)
				{
					if (Sent.Count != 0)
					{
						return ToastType.Warning;
					}
					return ToastType.Error;
				}
				return ToastType.Success;
			}
			return ToastType.Warning;
		}
	}

	public string Title
	{
		get
		{
			if (Selected != 0)
			{
				if (Failed.Count != 0)
				{
					if (Sent.Count != 0)
					{
						return $"Sent to {Sent.Count} of {Selected}";
					}
					return "Script Not Sent";
				}
				return "Script Sent";
			}
			return "No Clients Selected";
		}
	}

	public string Message
	{
		get
		{
			if (Selected == 0)
			{
				return "Tick one or more connected clients on the Clients page, then run the script again.";
			}
			List<string> list = new List<string>();
			if (Sent.Count > 0)
			{
				list.Add((Sent.Count == 1) ? ("Sent to " + Sent[0] + ".") : $"Sent to {Sent.Count} clients: {string.Join(", ", Sent)}.");
			}
			list.AddRange(Failed.Select(((string Name, string Reason) F) => F.Name + ": " + F.Reason));
			return string.Join(" ", list);
		}
	}
}
