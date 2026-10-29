using System.Collections.Generic;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace dotnet_codex_bootstrapper.Core.Manifest;

public sealed record UpdateManifest(int SchemaVersion, string Channel, BootstrapperEntry Bootstrapper, AppEntry App, RuntimeEntry? Runtime = null, IReadOnlyList<PackageEntry>? Packages = null, IReadOnlyList<LoaderEntry>? Loaders = null)
{
	public static JsonSerializerOptions Options { get; } = new JsonSerializerOptions(JsonSerializerDefaults.Web)
	{
		WriteIndented = true,
		DefaultIgnoreCondition = JsonIgnoreCondition.WhenWritingNull
	};

	public const int CurrentSchema = 1;

	public const string ChannelSource = "channel";

	public const string StaticSource = "static";

	public const string NuGetSource = "nuget";
}
