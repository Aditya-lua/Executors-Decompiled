using System.Threading;
using System.Threading.Tasks;

namespace dotnet_codex_ui.Features.Internet;

internal abstract class PendingScriptProvider : IScriptProvider
{
	public abstract string Id { get; }

	public abstract string DisplayName { get; }

	public string Tagline => "API not connected yet";

	public bool IsConfigured => false;

	public Task<ProviderResult> SearchAsync(ScriptQuery Query, CancellationToken Cancel)
	{
		return Task.FromResult(ProviderResult.NotConfigured(DisplayName + " hasn't been connected to Codex yet, so there is nothing to search. No results are shown until it is."));
	}
}
