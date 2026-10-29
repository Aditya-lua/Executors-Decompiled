using System;
using System.Collections.Generic;
using System.IO;
using System.Security.Cryptography;
using System.Threading;
using System.Threading.Tasks;
using dotnet_codex_bootstrapper.Core.Manifest;

namespace dotnet_codex_bootstrapper.Services;

public sealed class IntegrityChecker
{
	public async Task<IntegrityReport> CheckAsync(string AppDirectory, IReadOnlyList<FileEntry> Files, ExpectedLookup Lookup, IProgress<(int Done, int Total, string File)>? Progress, CancellationToken Cancel)
	{
		List<FileEntry> Valid = new List<FileEntry>();
		List<FileEntry> Missing = new List<FileEntry>();
		List<FileEntry> Damaged = new List<FileEntry>();
		Dictionary<string, RemoteInfo?> Expected = new Dictionary<string, RemoteInfo>(StringComparer.OrdinalIgnoreCase);
		Dictionary<string, LocalFile> Local = new Dictionary<string, LocalFile>(StringComparer.OrdinalIgnoreCase);
		int Done = 0;
		object Gate = new object();
		await Parallel.ForEachAsync(Files, new ParallelOptions
		{
			MaxDegreeOfParallelism = 6,
			CancellationToken = Cancel
		}, async (FileEntry Entry, CancellationToken Token) =>
		{
			string Full = SafePath.Resolve(AppDirectory, Entry.Path);
			RemoteInfo Remote = await Lookup(Entry, Token);
			List<FileEntry> Bucket = Valid;
			LocalFile Found = null;
			try
			{
				if (!File.Exists(Full))
				{
					Bucket = Missing;
				}
				else
				{
					long Length = new FileInfo(Full).Length;
					string text = await FileDownloader.Md5OfAsync(Full, Token);
					Found = new LocalFile(text, Length);
					if ((object)Remote == null || (Remote.Length >= 0 && Remote.Length != Length) || (Remote.Md5 != null && !string.Equals(Remote.Md5, text, StringComparison.OrdinalIgnoreCase)))
					{
						Bucket = Damaged;
					}
				}
			}
			catch (IOException)
			{
				Bucket = Damaged;
			}
			catch (UnauthorizedAccessException)
			{
				Bucket = Damaged;
			}
			int item;
			lock (Gate)
			{
				Bucket.Add(Entry);
				Expected[Entry.Path] = Remote;
				if ((object)Found != null)
				{
					Local[Entry.Path] = Found;
				}
				item = ++Done;
			}
			Progress?.Report((item, Files.Count, Entry.Path));
		});
		return new IntegrityReport(Valid, Missing, Damaged, Expected, Local);
	}

	public static string Md5Of(byte[] Data)
	{
		return Convert.ToHexStringLower(MD5.HashData(Data));
	}
}
