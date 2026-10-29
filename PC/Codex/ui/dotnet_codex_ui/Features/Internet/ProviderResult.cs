using System;
using System.Collections.Generic;

namespace dotnet_codex_ui.Features.Internet;

internal sealed record ProviderResult(ProviderResultKind Kind, IReadOnlyList<ScriptResult> Items, string? Message = null, int? NextPage = null)
{
	public static ProviderResult Empty => new ProviderResult(ProviderResultKind.Empty, Array.Empty<ScriptResult>());

	public static ProviderResult NotConfigured(string Message)
	{
		return new ProviderResult(ProviderResultKind.NotConfigured, Array.Empty<ScriptResult>(), Message);
	}

	public static ProviderResult Failed(string Message)
	{
		return new ProviderResult(ProviderResultKind.Failed, Array.Empty<ScriptResult>(), Message);
	}

	public static ProviderResult Of(IReadOnlyList<ScriptResult> Items, int? NextPage = null)
	{
		if (Items.Count != 0)
		{
			return new ProviderResult(ProviderResultKind.Results, Items, null, NextPage);
		}
		return Empty;
	}
}
