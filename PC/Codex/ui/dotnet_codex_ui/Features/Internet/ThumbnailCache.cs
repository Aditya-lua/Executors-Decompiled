using System;
using System.Collections.Concurrent;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Net.Http;
using System.Security.Cryptography;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using System.Windows.Media;
using dotnet_codex_ui.Infrastructure.FileSystem;
using dotnet_codex_ui.Infrastructure.Logging;

namespace dotnet_codex_ui.Features.Internet;

internal sealed class ThumbnailCache(HttpClient Http, string Directory, int MemoryEntries = 200, long MaxDiskBytes = 104857600L, TimeSpan? DiskTtl = null, Func<DateTime>? Clock = null)
{
	public const int MaxWidth = 320;

	private const int MaxDownloadBytes = 5242880;

	private static readonly Lazy<ThumbnailCache> SharedField = new Lazy<ThumbnailCache>(() => new ThumbnailCache(ScriptBloxHttp.Client, Path.Combine(UserProfilePathResolver.LocalAppData, "Codex", "cache", "thumbs"), 200, 104857600L));

	private readonly Dictionary<string, (ImageSource Image, long Stamp)> Memory = new Dictionary<string, (ImageSource, long)>();

	private readonly ConcurrentDictionary<string, Task<ImageSource?>> InFlight = new ConcurrentDictionary<string, Task<ImageSource>>();

	private readonly Lock Gate = new Lock();

	private readonly TimeSpan Ttl = DiskTtl ?? TimeSpan.FromDays(14);

	private readonly Func<DateTime> Now = Clock ?? ((Func<DateTime>)(() => DateTime.UtcNow));

	private long Counter;

	private int Downloads;

	public static ThumbnailCache Shared => SharedField.Value;

	public int DownloadCount => Volatile.Read(in Downloads);

	public int MemoryCount
	{
		get
		{
			using (Gate.EnterScope())
			{
				return Memory.Count;
			}
		}
	}

	public Task<ImageSource?> GetAsync(string? RawUrl)
	{
		string text = ImageUrl.Normalize(RawUrl);
		if (text == null)
		{
			return Task.FromResult<ImageSource>(null);
		}
		using (Gate.EnterScope())
		{
			if (Memory.TryGetValue(text, out (ImageSource, long) value))
			{
				Memory[text] = (value.Item1, ++Counter);
				return Task.FromResult(value.Item1);
			}
		}
		return InFlight.GetOrAdd(text, (string Key) => Run(Key));
	}

	private async Task<ImageSource?> Run(string Url)
	{
		await Task.Yield();
		try
		{
			ImageSource imageSource = await LoadAsync(Url).ConfigureAwait(continueOnCapturedContext: false);
			if (imageSource != null)
			{
				Remember(Url, imageSource);
			}
			return imageSource;
		}
		finally
		{
			InFlight.TryRemove(Url, out Task<ImageSource> _);
		}
	}

	private async Task<ImageSource?> LoadAsync(string Url)
	{
		string Path = PathFor(Url);
		byte[] Stale = null;
		try
		{
			if (File.Exists(Path))
			{
				byte[] array = await File.ReadAllBytesAsync(Path).ConfigureAwait(continueOnCapturedContext: false);
				ImageSource imageSource = ImageDecoder.Decode(array, 320);
				if (imageSource != null)
				{
					if (Now() - File.GetLastWriteTimeUtc(Path) <= Ttl)
					{
						return imageSource;
					}
					Stale = array;
				}
				else
				{
					File.Delete(Path);
					AppLog.Warning("Discarded corrupt cached thumbnail");
				}
			}
		}
		catch (Exception failure)
		{
			AppLog.Warning(failure, "Thumbnail cache read failed");
		}
		byte[] array2 = await DownloadAsync(Url).ConfigureAwait(continueOnCapturedContext: false);
		if (array2 == null)
		{
			return (Stale == null) ? null : ImageDecoder.Decode(Stale, 320);
		}
		ImageSource imageSource2 = ImageDecoder.Decode(array2, 320);
		if (imageSource2 == null)
		{
			AppLog.Warning("Thumbnail could not be decoded");
			return null;
		}
		Persist(Path, array2);
		return imageSource2;
	}

	private async Task<byte[]?> DownloadAsync(string Url)
	{
		_ = 3;
		try
		{
			Interlocked.Increment(ref Downloads);
			using HttpResponseMessage Response = await Http.GetAsync(Url, HttpCompletionOption.ResponseHeadersRead).ConfigureAwait(continueOnCapturedContext: false);
			if (!Response.IsSuccessStatusCode || Response.Content.Headers.ContentLength > 5242880)
			{
				AppLog.Warning("Thumbnail download refused with status {Status}", (int)Response.StatusCode);
				return null;
			}
			byte[] result;
			await using (Stream Stream = await Response.Content.ReadAsStreamAsync().ConfigureAwait(continueOnCapturedContext: false))
			{
				using MemoryStream Buffer = new MemoryStream();
				byte[] Chunk = new byte[16384];
				while (true)
				{
					int num;
					if ((num = await Stream.ReadAsync(Chunk).ConfigureAwait(continueOnCapturedContext: false)) > 0)
					{
						if (Buffer.Length + num > 5242880)
						{
							result = null;
							break;
						}
						Buffer.Write(Chunk, 0, num);
						continue;
					}
					result = Buffer.ToArray();
					break;
				}
			}
			return result;
		}
		catch (Exception ex) when ((ex is HttpRequestException || ex is TaskCanceledException || ex is IOException) ? true : false)
		{
			AppLog.Warning(ex, "Thumbnail download failed");
			return null;
		}
	}

	private void Persist(string Path, byte[] Bytes)
	{
		try
		{
			System.IO.Directory.CreateDirectory(Directory);
			string text = Path + "." + Guid.NewGuid().ToString("N") + ".tmp";
			File.WriteAllBytes(text, Bytes);
			File.Move(text, Path, overwrite: true);
			EvictDisk();
		}
		catch (Exception failure)
		{
			AppLog.Warning(failure, "Thumbnail cache write failed");
		}
	}

	private void EvictDisk()
	{
		List<FileInfo> list = (from F in new DirectoryInfo(Directory).GetFiles("*.img")
			orderby F.LastWriteTimeUtc
			select F).ToList();
		long num = list.Sum((FileInfo F) => F.Length);
		foreach (FileInfo item in list)
		{
			if (num <= MaxDiskBytes)
			{
				break;
			}
			num -= item.Length;
			item.Delete();
		}
	}

	private void Remember(string Url, ImageSource Image)
	{
		using (Gate.EnterScope())
		{
			Memory[Url] = (Image, ++Counter);
			while (Memory.Count > MemoryEntries)
			{
				Memory.Remove(Memory.MinBy((KeyValuePair<string, (ImageSource Image, long Stamp)> P) => P.Value.Stamp).Key);
			}
		}
	}

	private string PathFor(string Url)
	{
		return Path.Combine(Directory, Convert.ToHexString(SHA256.HashData(Encoding.UTF8.GetBytes(Url))) + ".img");
	}
}
