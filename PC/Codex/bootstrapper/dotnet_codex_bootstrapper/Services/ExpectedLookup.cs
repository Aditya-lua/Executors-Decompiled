using System.Threading;
using System.Threading.Tasks;
using dotnet_codex_bootstrapper.Core.Manifest;

namespace dotnet_codex_bootstrapper.Services;

public delegate Task<RemoteInfo?> ExpectedLookup(FileEntry File, CancellationToken Cancel);
