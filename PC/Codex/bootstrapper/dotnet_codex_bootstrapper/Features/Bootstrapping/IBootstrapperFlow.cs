using System;
using System.Threading;
using System.Threading.Tasks;

namespace dotnet_codex_bootstrapper.Features.Bootstrapping;

public interface IBootstrapperFlow
{
	Task RunAsync(IProgress<BootstrapperSnapshot> Progress, CancellationToken Cancel);
}
