using System;
using System.IO;
using System.Text.Json;
using dotnet_codex_bootstrapper.Core.Configuration;
using dotnet_codex_bootstrapper.Core.Manifest;
using dotnet_codex_bootstrapper.Infrastructure;

namespace dotnet_codex_bootstrapper.Services;

public sealed class InstallStateStore(BootstrapperPaths Paths)
{
	private static readonly JsonSerializerOptions Options = new JsonSerializerOptions(JsonSerializerDefaults.Web)
	{
		WriteIndented = true
	};

	public InstallState? Load()
	{
		try
		{
			if (!File.Exists(Paths.InstallStateFile))
			{
				return null;
			}
			return JsonSerializer.Deserialize<InstallState>(File.ReadAllBytes(Paths.InstallStateFile), Options);
		}
		catch (Exception ex) when ((ex is JsonException || ex is IOException || ex is UnauthorizedAccessException) ? true : false)
		{
			AppLog.Warning(ex, "The install state could not be read and will be rebuilt");
			return null;
		}
	}

	public void Save(InstallState State)
	{
		WriteAtomic(Paths.InstallStateFile, JsonSerializer.SerializeToUtf8Bytes(State, Options));
	}

	public void SaveManifest(byte[] ManifestBytes)
	{
		WriteAtomic(Paths.CachedManifestFile, ManifestBytes);
	}

	public UpdateManifest? LoadCachedManifest(Channel Channel)
	{
		try
		{
			return File.Exists(Paths.CachedManifestFile) ? ManifestValidator.ParseAndValidate(File.ReadAllBytes(Paths.CachedManifestFile), Channel) : null;
		}
		catch (Exception ex) when ((ex is ManifestException || ex is IOException || ex is UnauthorizedAccessException) ? true : false)
		{
			AppLog.Warning(ex, "The cached manifest is not usable");
			return null;
		}
	}

	public static void WriteAtomic(string Path0, byte[] Content)
	{
		Directory.CreateDirectory(Path.GetDirectoryName(Path0));
		string text = Path0 + "." + Guid.NewGuid().ToString("N").Substring(0, 8) + ".tmp";
		File.WriteAllBytes(text, Content);
		File.Move(text, Path0, overwrite: true);
	}
}
