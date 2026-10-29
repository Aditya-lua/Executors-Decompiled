using System.Threading;
using System.Threading.Tasks;
using dotnet_codex_bootstrapper.Core.Configuration;
using dotnet_codex_bootstrapper.Core.Manifest;

namespace dotnet_codex_bootstrapper.Services;

public sealed class ManifestFetcher(CdnClient Client)
{
	public const int MaxManifestBytes = 4194304;

	public CdnEndpoints Endpoints => Client.Endpoints;

	public CdnClient Cdn => Client;

	public async Task<FetchedManifest> FetchAsync(Channel Channel, CancellationToken Cancel)
	{
		byte[] array = await Client.GetBytesAsync(Client.Endpoints.ManifestUrl(Channel), 4194304, Cancel);
		return new FetchedManifest(ManifestValidator.ParseAndValidate(array, Channel), array);
	}
}
