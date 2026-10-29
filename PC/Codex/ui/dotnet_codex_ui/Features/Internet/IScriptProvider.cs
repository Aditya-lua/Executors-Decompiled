using System.Threading;
using System.Threading.Tasks;

namespace dotnet_codex_ui.Features.Internet;

internal interface IScriptProvider
{
	string Id { get; }

	string DisplayName { get; }

	string Tagline { get; }

	bool IsConfigured { get; }

	Task<ProviderResult> SearchAsync(ScriptQuery Query, CancellationToken Cancel);
}
