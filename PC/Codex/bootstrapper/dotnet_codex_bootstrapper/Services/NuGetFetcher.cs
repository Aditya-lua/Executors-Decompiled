using System;
using System.Collections.Generic;
using System.IO;
using System.IO.Compression;
using System.Security.Cryptography;
using System.Threading;
using System.Threading.Tasks;
using dotnet_codex_bootstrapper.Core.Configuration;
using dotnet_codex_bootstrapper.Core.Manifest;

namespace dotnet_codex_bootstrapper.Services;

public sealed class NuGetFetcher(FileDownloader Downloader)
{
	public static string PackageFile(string StagingDirectory, PackageEntry Package)
	{
		return Path.Combine(StagingDirectory, "nuget", (Package.Id + "." + Package.Version + ".nupkg").ToLowerInvariant());
	}

	public static string KeyOf(PackageEntry Package)
	{
		return Package.Id + "/" + Package.Version;
	}

	public Task DownloadAsync(CdnEndpoints Endpoints, PackageEntry Package, string StagingDirectory, long Size, IProgress<DownloadProgress>? Progress, CancellationToken Cancel)
	{
		return Downloader.DownloadAsync(Endpoints.NuGetPackageUrl(Package.Id, Package.Version), PackageFile(StagingDirectory, Package), Size, null, Package.Sha256, Progress, Cancel);
	}

	public static async Task<IReadOnlyDictionary<string, LocalFile>> ExtractAsync(string PackagePath, IReadOnlyList<(FileEntry File, string Destination)> Entries, CancellationToken Cancel)
	{
		Dictionary<string, LocalFile> Result = new Dictionary<string, LocalFile>(StringComparer.OrdinalIgnoreCase);
		ZipArchive Archive;
		try
		{
			Archive = ZipFile.OpenRead(PackagePath);
		}
		catch (InvalidDataException inner)
		{
			throw new UpdateException("E-NUPKG", "A downloaded NuGet package is not a valid archive.", inner);
		}
		using (Archive)
		{
			foreach (var Entry2 in Entries)
			{
				FileEntry File0 = Entry2.File;
				string Destination = Entry2.Destination;
				ZipArchiveEntry Entry = Archive.GetEntry(File0.PackagePath) ?? throw new UpdateException("E-NUPKG", "'" + File0.PackagePath + "' is not inside its NuGet package.");
				Directory.CreateDirectory(Path.GetDirectoryName(Destination));
				string Part = Destination + ".part";
				using IncrementalHash Hash = IncrementalHash.CreateHash(HashAlgorithmName.MD5);
				long Total = 0L;
				await using (Stream Source = Entry.Open())
				{
					await using FileStream Target = new FileStream(Part, FileMode.Create, FileAccess.Write, FileShare.None, 81920, useAsync: true);
					byte[] Buffer = new byte[81920];
					int num;
					while ((num = await Source.ReadAsync(Buffer, Cancel)) > 0)
					{
						Total += num;
						if (Total > Entry.Length)
						{
							throw new UpdateException("E-NUPKG", "'" + File0.Path + "' is larger than its package entry says.");
						}
						Hash.AppendData(Buffer, 0, num);
						await Target.WriteAsync(Buffer.AsMemory(0, num), Cancel);
					}
				}
				if (Total != Entry.Length)
				{
					File.Delete(Part);
					throw new UpdateException("E-NUPKG", "'" + File0.Path + "' could not be read completely from its package.");
				}
				File.Move(Part, Destination, overwrite: true);
				Result[File0.Path] = new LocalFile(Convert.ToHexStringLower(Hash.GetHashAndReset()), Total);
			}
		}
		return Result;
	}
}
