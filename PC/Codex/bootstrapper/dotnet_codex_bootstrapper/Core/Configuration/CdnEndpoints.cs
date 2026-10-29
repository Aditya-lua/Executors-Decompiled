using System;
using System.Linq;

namespace dotnet_codex_bootstrapper.Core.Configuration;

public sealed class CdnEndpoints
{
	public const string ProductionHost = "cdn.robloxscripts.gg";

	public const string ManifestFile = "manifest.json";

	public const string VersionFile = "version.json";

	public const string BootstrapperFile = "dotnet-codex-bootstrapper.exe";

	public static readonly string[] NuGetHosts = new string[2] { "api.nuget.org", "globalcdn.nuget.org" };

	public static readonly string[] RuntimeHosts = new string[4] { "builds.dotnet.microsoft.com", "dotnetcli.azureedge.net", "download.visualstudio.microsoft.com", "dotnetcli.blob.core.windows.net" };

	private readonly Uri Root;

	private readonly bool AllowLoopbackHttp;

	public CdnEndpoints(Uri? Root = null, bool AllowLoopbackHttp = false)
	{
		this.Root = Root ?? new Uri("https://cdn.robloxscripts.gg/");
		this.AllowLoopbackHttp = AllowLoopbackHttp;
		if (!IsAllowed(this.Root))
		{
			throw new ArgumentException("The CDN root must be an HTTPS address.", "Root");
		}
	}

	public static CdnEndpoints Create()
	{
		return new CdnEndpoints();
	}

	public Uri ManifestUrl(Channel Channel)
	{
		return Build(Channels.NameOf(Channel), "manifest.json");
	}

	public Uri VersionUrl(Channel Channel)
	{
		return Build(Channels.NameOf(Channel), "version.json");
	}

	public Uri BootstrapperUrl(Channel Channel, string Version)
	{
		return Build(Channels.NameOf(Channel), Version, "dotnet-codex-bootstrapper.exe");
	}

	public Uri AppFileUrl(Channel Channel, string AppVersion, string RelativePath)
	{
		string text = Channels.NameOf(Channel);
		string[] array = RelativePath.Split('/');
		int num = 0;
		string[] array2 = new string[2 + array.Length];
		array2[num] = text;
		num++;
		array2[num] = AppVersion;
		num++;
		ReadOnlySpan<string> readOnlySpan = new ReadOnlySpan<string>(array);
		readOnlySpan.CopyTo(new Span<string>(array2).Slice(num, readOnlySpan.Length));
		num += readOnlySpan.Length;
		return Build(array2);
	}

	public Uri LoaderUrl(string RobloxVersion, string Md5)
	{
		return Build("build", RobloxVersion, Md5 + ".exe");
	}

	public Uri StaticFileUrl(string RelativePath)
	{
		string text = "static";
		string[] array = RelativePath.Split('/');
		int num = 0;
		string[] array2 = new string[1 + array.Length];
		array2[num] = text;
		num++;
		ReadOnlySpan<string> readOnlySpan = new ReadOnlySpan<string>(array);
		readOnlySpan.CopyTo(new Span<string>(array2).Slice(num, readOnlySpan.Length));
		num += readOnlySpan.Length;
		return Build(array2);
	}

	public bool IsAllowed(Uri Address)
	{
		if (Address.Scheme == Uri.UriSchemeHttps && Address.Host.Equals(Root?.Host ?? "cdn.robloxscripts.gg", StringComparison.OrdinalIgnoreCase))
		{
			return true;
		}
		if (AllowLoopbackHttp && Address.IsLoopback)
		{
			return Address.Scheme == Uri.UriSchemeHttp;
		}
		return false;
	}

	public Uri NuGetPackageUrl(string Id, string Version)
	{
		return new Uri($"https://api.nuget.org/v3-flatcontainer/{Uri.EscapeDataString(Id.ToLowerInvariant())}/{Uri.EscapeDataString(Version.ToLowerInvariant())}/{Uri.EscapeDataString(Id.ToLowerInvariant())}.{Uri.EscapeDataString(Version.ToLowerInvariant())}.nupkg");
	}

	public static bool IsAllowedNuGetUrl(Uri Address)
	{
		if (Address.Scheme == Uri.UriSchemeHttps)
		{
			return NuGetHosts.Contains(Address.Host, StringComparer.OrdinalIgnoreCase);
		}
		return false;
	}

	public static bool IsAllowedRuntimeUrl(string? Text)
	{
		if (Uri.TryCreate(Text, UriKind.Absolute, out Uri result) && result.Scheme == Uri.UriSchemeHttps)
		{
			return RuntimeHosts.Contains(result.Host, StringComparer.OrdinalIgnoreCase);
		}
		return false;
	}

	private Uri Build(params string[] Segments)
	{
		return new Uri(Root, string.Join('/', Segments.Select(Uri.EscapeDataString)));
	}
}
