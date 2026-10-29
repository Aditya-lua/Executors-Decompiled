using System.Threading;
using System.Threading.Tasks;

namespace dotnet_codex_ui.Features.Internet;

internal interface IScriptDetailSource
{
	Task<ScriptDetail> GetDetailAsync(string Slug, CancellationToken Cancel);
}
