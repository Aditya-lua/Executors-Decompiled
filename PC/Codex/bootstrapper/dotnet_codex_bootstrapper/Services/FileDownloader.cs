using System;
using System.Diagnostics;
using System.IO;
using System.Net;
using System.Net.Http;
using System.Net.Http.Headers;
using System.Security.Cryptography;
using System.Threading;
using System.Threading.Tasks;

namespace dotnet_codex_bootstrapper.Services;

public sealed class FileDownloader(CdnClient Client)
{
	public static readonly TimeSpan StallTimeout = TimeSpan.FromSeconds(30L);

	public static async Task<string> Md5OfAsync(string Path0, CancellationToken Cancel)
	{
		string result;
		await using (FileStream Stream = OpenForHash(Path0))
		{
			result = Convert.ToHexStringLower(await MD5.HashDataAsync(Stream, Cancel));
		}
		return result;
	}

	public static async Task<string> Sha256OfAsync(string Path0, CancellationToken Cancel)
	{
		string result;
		await using (FileStream Stream = OpenForHash(Path0))
		{
			result = Convert.ToHexStringLower(await SHA256.HashDataAsync(Stream, Cancel));
		}
		return result;
	}

	public static async Task<bool> MatchesAsync(string Path0, long ExpectedSize, string? ExpectedMd5, string? ExpectedSha256, CancellationToken Cancel)
	{
		if (ExpectedSize >= 0 && new FileInfo(Path0).Length != ExpectedSize)
		{
			return false;
		}
		bool flag = ExpectedMd5 != null;
		if (flag)
		{
			flag = !string.Equals(await Md5OfAsync(Path0, Cancel), ExpectedMd5, StringComparison.OrdinalIgnoreCase);
		}
		if (flag)
		{
			return false;
		}
		flag = ExpectedSha256 == null;
		if (!flag)
		{
			flag = string.Equals(await Sha256OfAsync(Path0, Cancel), ExpectedSha256, StringComparison.OrdinalIgnoreCase);
		}
		return flag;
	}

	public async Task DownloadAsync(Uri Url, string Destination, long ExpectedSize, string? ExpectedMd5, string? ExpectedSha256, IProgress<DownloadProgress>? Progress, CancellationToken Cancel)
	{
		Directory.CreateDirectory(Path.GetDirectoryName(Destination));
		if (File.Exists(Destination))
		{
			if (await MatchesAsync(Destination, ExpectedSize, ExpectedMd5, ExpectedSha256, Cancel))
			{
				Progress?.Report(new DownloadProgress(ExpectedSize, ExpectedSize, 0.0));
				return;
			}
			File.Delete(Destination);
		}
		string Part = Destination + ".part";
		await Client.Retry.RunAsync((int Attempt) => AttemptAsync(Url, Destination, Part, ExpectedSize, ExpectedMd5, ExpectedSha256, Progress, Cancel), Cancel, "Download " + Path.GetFileName(Destination));
	}

	private static FileStream OpenForHash(string Path0)
	{
		return new FileStream(Path0, FileMode.Open, FileAccess.Read, FileShare.ReadWrite | FileShare.Delete, 81920, FileOptions.Asynchronous | FileOptions.SequentialScan);
	}

	private async Task<bool> AttemptAsync(Uri Url, string Destination, string Part, long ExpectedSize, string? ExpectedMd5, string? ExpectedSha256, IProgress<DownloadProgress>? Progress, CancellationToken Cancel)
	{
		long num = (File.Exists(Part) ? new FileInfo(Part).Length : 0);
		if (ExpectedSize >= 0 && num > ExpectedSize)
		{
			File.Delete(Part);
			num = 0L;
		}
		if (ExpectedSize < 0 || num < ExpectedSize)
		{
			await TransferAsync(Url, Part, num, ExpectedSize, Progress, Cancel);
		}
		long length = new FileInfo(Part).Length;
		if (ExpectedSize >= 0 && length != ExpectedSize)
		{
			if (length > ExpectedSize)
			{
				File.Delete(Part);
			}
			throw new IOException($"The download ended early ({length} of {ExpectedSize} bytes).");
		}
		if (!(await MatchesAsync(Part, -1L, ExpectedMd5, ExpectedSha256, Cancel)))
		{
			File.Delete(Part);
			throw new HashMismatchException("'" + Path.GetFileName(Destination) + "' failed its integrity check.");
		}
		File.Move(Part, Destination, overwrite: true);
		return true;
	}

	private async Task TransferAsync(Uri Url, string Part, long Have, long ExpectedSize, IProgress<DownloadProgress>? Progress, CancellationToken Cancel)
	{
		using HttpResponseMessage Response = await Client.OpenAsync(Url, (Have > 0) ? new long?(Have) : ((long?)null), Cancel);
		int num;
		if (Have > 0 && Response.StatusCode == HttpStatusCode.PartialContent)
		{
			ContentRangeHeaderValue? contentRange = Response.Content.Headers.ContentRange;
			num = ((contentRange != null && contentRange.From == Have) ? 1 : 0);
		}
		else
		{
			num = 0;
		}
		bool Resumed = (byte)num != 0;
		if (!Resumed)
		{
			Have = 0L;
		}
		long num2 = Response.Content.Headers.ContentLength ?? (-1);
		if (ExpectedSize >= 0 && num2 >= 0 && Have + num2 > ExpectedSize)
		{
			throw new UpdateException("E-NET", "The server sent more data than expected.");
		}
		using CancellationTokenSource Stall = CancellationTokenSource.CreateLinkedTokenSource(Cancel);
		await using Stream Source = await Response.Content.ReadAsStreamAsync(Stall.Token);
		await using FileStream Target = new FileStream(Part, Resumed ? FileMode.Append : FileMode.Create, FileAccess.Write, FileShare.Read, 81920, FileOptions.Asynchronous);
		byte[] Buffer = new byte[81920];
		Stopwatch Clock = Stopwatch.StartNew();
		long Window = 0L;
		long WindowStart = 0L;
		double Speed = 0.0;
		long Done = Have;
		while (true)
		{
			Stall.CancelAfter(StallTimeout);
			int Read = await Source.ReadAsync(Buffer, Stall.Token);
			if (Read == 0)
			{
				break;
			}
			if (ExpectedSize >= 0 && Done + Read > ExpectedSize)
			{
				throw new UpdateException("E-NET", "The server sent more data than expected.");
			}
			await Target.WriteAsync(Buffer.AsMemory(0, Read), Cancel);
			Done += Read;
			Window += Read;
			long num3 = Clock.ElapsedMilliseconds - WindowStart;
			if (num3 >= 250)
			{
				double num4 = (double)Window * 1000.0 / (double)num3;
				Speed = ((Speed == 0.0) ? num4 : (Speed * 0.7 + num4 * 0.3));
				Window = 0L;
				WindowStart = Clock.ElapsedMilliseconds;
				Progress?.Report(new DownloadProgress(Done, Math.Max(ExpectedSize, Done), Speed));
			}
		}
		await Target.FlushAsync(Cancel);
		Progress?.Report(new DownloadProgress(Done, Math.Max(ExpectedSize, Done), Speed));
	}
}
