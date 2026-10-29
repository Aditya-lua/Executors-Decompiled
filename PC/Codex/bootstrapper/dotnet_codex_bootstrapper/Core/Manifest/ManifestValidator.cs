using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.Json;
using System.Text.RegularExpressions;
using dotnet_codex_bootstrapper.Core.Configuration;
using dotnet_codex_bootstrapper.Core.Versioning;

namespace dotnet_codex_bootstrapper.Core.Manifest;

public static class ManifestValidator
{
	public const int MaxFiles = 5000;

	private static readonly Regex PackageIdPattern = new Regex("^[A-Za-z0-9][A-Za-z0-9._\\-]{0,99}$", RegexOptions.Compiled | RegexOptions.CultureInvariant);

	private static readonly Regex PackageVersionPattern = new Regex("^[0-9A-Za-z][0-9A-Za-z.\\-]{0,63}$", RegexOptions.Compiled | RegexOptions.CultureInvariant);

	private static readonly Regex Sha256Pattern = new Regex("^[0-9a-fA-F]{64}$", RegexOptions.Compiled | RegexOptions.CultureInvariant);

	public static UpdateManifest Parse(byte[] Json)
	{
		try
		{
			return JsonSerializer.Deserialize<UpdateManifest>(Json, UpdateManifest.Options) ?? throw new ManifestException("empty", "The update manifest is empty.");
		}
		catch (JsonException ex)
		{
			throw new ManifestException("malformed", "The update manifest could not be read: " + ex.Message);
		}
	}

	public static UpdateManifest ParseAndValidate(byte[] Json, Channel Expected)
	{
		UpdateManifest updateManifest = Parse(Json);
		Validate(updateManifest, Expected);
		return updateManifest;
	}

	public static void Validate(UpdateManifest Manifest, Channel Expected)
	{
		if (Manifest.SchemaVersion != 1)
		{
			throw new ManifestException("schema", $"The update manifest uses schema {Manifest.SchemaVersion}, which this bootstrapper does not support.");
		}
		if (!string.Equals(Manifest.Channel, Channels.NameOf(Expected), StringComparison.Ordinal))
		{
			throw new ManifestException("channel", $"The manifest is for channel '{Manifest.Channel}', not '{Channels.NameOf(Expected)}'.");
		}
		if ((object)Manifest.Bootstrapper == null || (object)Manifest.App == null)
		{
			throw new ManifestException("missing", "The manifest is missing required sections.");
		}
		RequireVersion(Manifest.Bootstrapper.Version, "bootstrapper");
		RequireVersion(Manifest.App.Version, "application");
		ValidatePackages(Manifest.Packages);
		ValidateFiles(Manifest.App, Manifest.Packages);
		ValidateLoaders(Manifest.Loaders);
		RuntimeEntry runtime = Manifest.Runtime;
		if ((object)runtime != null)
		{
			ValidateRuntime(runtime);
		}
	}

	public static bool IsLoaderVersion(string? Value)
	{
		if (!string.IsNullOrWhiteSpace(Value) && Value.Length <= 64 && !Value.Contains('/'))
		{
			return SafePath.IsSafeRelative(Value);
		}
		return false;
	}

	public static bool IsMd5(string? Value)
	{
		if (Value != null && Value.Length == 32)
		{
			return Value.All(Uri.IsHexDigit);
		}
		return false;
	}

	private static void ValidateLoaders(IReadOnlyList<LoaderEntry>? Loaders)
	{
		HashSet<string> hashSet = new HashSet<string>(StringComparer.OrdinalIgnoreCase);
		foreach (LoaderEntry item in Loaders ?? Array.Empty<LoaderEntry>())
		{
			if (!IsLoaderVersion(item.RobloxVersion) || !IsMd5(item.Md5) || item.Size <= 0)
			{
				throw new ManifestException("loader", "The loader entry for '" + item.RobloxVersion + "' is invalid.");
			}
			if (!hashSet.Add(item.RobloxVersion))
			{
				throw new ManifestException("duplicate", "The loader for '" + item.RobloxVersion + "' is listed more than once.");
			}
		}
	}

	private static void ValidatePackages(IReadOnlyList<PackageEntry>? Packages)
	{
		HashSet<string> hashSet = new HashSet<string>(StringComparer.OrdinalIgnoreCase);
		foreach (PackageEntry item in Packages ?? Array.Empty<PackageEntry>())
		{
			if (!PackageIdPattern.IsMatch(item.Id ?? string.Empty) || !PackageVersionPattern.IsMatch(item.Version ?? string.Empty))
			{
				throw new ManifestException("package", $"The package '{item.Id}' {item.Version} is invalid.");
			}
			if (!hashSet.Add(item.Id + "/" + item.Version))
			{
				throw new ManifestException("duplicate", "The package '" + item.Id + "' is listed more than once.");
			}
			if (item.Sha256 != null && !Sha256Pattern.IsMatch(item.Sha256))
			{
				throw new ManifestException("hash", "The package '" + item.Id + "' has an invalid SHA-256.");
			}
		}
	}

	private static void ValidateFiles(AppEntry App, IReadOnlyList<PackageEntry>? Packages)
	{
		if (App.Files == null || App.Files.Count == 0 || App.Files.Count > 5000)
		{
			throw new ManifestException("files", "The manifest file list is empty or too large.");
		}
		HashSet<string> hashSet = new HashSet<string>(StringComparer.OrdinalIgnoreCase);
		foreach (FileEntry file in App.Files)
		{
			if (!SafePath.IsSafeRelative(file.Path) || SafePath.IsProtected(file.Path))
			{
				throw new ManifestException("path", "The manifest contains an unsafe path '" + file.Path + "'.");
			}
			if (string.Equals(file.Path, "dotnet-codex-bootstrapper.exe", StringComparison.OrdinalIgnoreCase))
			{
				throw new ManifestException("path", "'" + file.Path + "' would collide with the bootstrapper in the version folder.");
			}
			if (!hashSet.Add(file.Path))
			{
				throw new ManifestException("duplicate", "The manifest lists '" + file.Path + "' more than once.");
			}
			bool flag;
			switch (file.Source)
			{
			case "channel":
			case "static":
			case "nuget":
				flag = true;
				break;
			default:
				flag = false;
				break;
			}
			if (!flag)
			{
				throw new ManifestException("source", $"'{file.Path}' has an unknown source '{file.Source}'.");
			}
			if (file.RemotePath != null && (file.Source != "static" || !SafePath.IsSafeRelative(file.RemotePath)))
			{
				throw new ManifestException("path", "'" + file.Path + "' has an invalid remote path.");
			}
			if (file.Source == "nuget")
			{
				ValidateNuGetFile(file, Packages);
			}
			else if (file.Package != null || file.PackagePath != null)
			{
				throw new ManifestException("source", "'" + file.Path + "' names a package but is not a NuGet file.");
			}
		}
		if (!SafePath.IsSafeRelative(App.Executable) || !App.Files.Any((FileEntry File) => File.Required && string.Equals(File.Path, App.Executable, StringComparison.OrdinalIgnoreCase)))
		{
			throw new ManifestException("executable", "The application executable is not a required file in the manifest.");
		}
	}

	private static void ValidateNuGetFile(FileEntry File, IReadOnlyList<PackageEntry>? Packages)
	{
		string? package = File.Package;
		string Id = ((package != null) ? package.Split('/')[0] : null);
		string Version = File.Package?.Split('/').ElementAtOrDefault(1);
		if (Id == null || Version == null || Packages == null || !Packages.Any((PackageEntry Package) => string.Equals(Package.Id, Id, StringComparison.OrdinalIgnoreCase) && Package.Version == Version))
		{
			throw new ManifestException("package", "'" + File.Path + "' refers to a package that the manifest does not list.");
		}
		if (File.PackagePath == null || !SafePath.IsSafeRelative(File.PackagePath.Replace("%20", "_")))
		{
			throw new ManifestException("path", "'" + File.Path + "' has an unsafe package path.");
		}
	}

	private static void ValidateRuntime(RuntimeEntry Runtime)
	{
		if (!CdnEndpoints.IsAllowedRuntimeUrl(Runtime.InstallerUrl))
		{
			throw new ManifestException("runtime", "The runtime installer address is not allowed.");
		}
		if (Runtime.Sha256 != null && !Sha256Pattern.IsMatch(Runtime.Sha256))
		{
			throw new ManifestException("hash", "The runtime installer has an invalid SHA-256.");
		}
		if (!string.Equals(Runtime.Architecture, "x64", StringComparison.OrdinalIgnoreCase) || !ReleaseVersion.TryParse(Runtime.MinVersion, out ReleaseVersion _))
		{
			throw new ManifestException("runtime", "The runtime requirement is invalid.");
		}
	}

	private static void RequireVersion(string? Value, string Name)
	{
		if (!ReleaseVersion.TryParse(Value, out ReleaseVersion _))
		{
			throw new ManifestException("version", $"The {Name} version '{Value}' is invalid.");
		}
	}
}
