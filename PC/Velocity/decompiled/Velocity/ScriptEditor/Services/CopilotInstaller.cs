using System;
using System.Formats.Tar;
using System.IO;
using System.IO.Compression;
using System.Net.Http;
using System.Threading.Tasks;
using ScriptEditor.Models;

namespace ScriptEditor.Services;

public static class CopilotInstaller
{
	private const string Version = "1.527.1";

	private const string PackageUrl = "https://registry.npmjs.org/@github/copilot-language-server-win32-x64/-/copilot-language-server-win32-x64-1.527.1.tgz";

	public static string ServerPath => Path.Combine(AppPaths.DataFolder, "copilot", "1.527.1", "copilot-language-server.exe");

	public static bool IsInstalled => File.Exists(ServerPath);

	public static async Task<bool> EnsureInstalledAsync(Action<string, OutputKind> report, IProgress<int>? progress = null)
	{
		if (IsInstalled)
		{
			return true;
		}
		string target = Path.GetDirectoryName(ServerPath);
		string staging = target + ".downloading";
		report("Downloading GitHub Copilot language server (1.527.1)…", OutputKind.Info);
		try
		{
			if (Directory.Exists(staging))
			{
				Directory.Delete(staging, recursive: true);
			}
			Directory.CreateDirectory(staging);
			using HttpClient http = new HttpClient
			{
				Timeout = TimeSpan.FromMinutes(10L)
			};
			using HttpResponseMessage response = await http.GetAsync("https://registry.npmjs.org/@github/copilot-language-server-win32-x64/-/copilot-language-server-win32-x64-1.527.1.tgz", HttpCompletionOption.ResponseHeadersRead);
			if (!response.IsSuccessStatusCode)
			{
				report($"Copilot download failed: {(int)response.StatusCode}.", OutputKind.Error);
				return false;
			}
			string archive = Path.Combine(staging, "package.tgz");
			await SaveAsync(response, archive, progress);
			await using (FileStream tgz = File.OpenRead(archive))
			{
				await using GZipStream gzip = new GZipStream(tgz, CompressionMode.Decompress);
				await TarFile.ExtractToDirectoryAsync(gzip, staging, overwriteFiles: true);
			}
			File.Delete(archive);
			string text = Path.Combine(staging, "package");
			if (!File.Exists(Path.Combine(text, "copilot-language-server.exe")))
			{
				report("Copilot download did not contain the expected binary.", OutputKind.Error);
				return false;
			}
			Directory.CreateDirectory(Path.GetDirectoryName(target));
			Directory.Move(text, target);
			report("Copilot language server installed.", OutputKind.Success);
			return true;
		}
		catch (Exception ex) when ((ex is HttpRequestException || ex is IOException || ex is UnauthorizedAccessException || ex is TaskCanceledException) ? true : false)
		{
			report("Copilot download failed: " + ex.Message, OutputKind.Error);
			return false;
		}
		finally
		{
			TryDelete(staging);
		}
	}

	private static async Task SaveAsync(HttpResponseMessage response, string path, IProgress<int>? progress)
	{
		long? total = response.Content.Headers.ContentLength;
		await using Stream source = await response.Content.ReadAsStreamAsync();
		await using FileStream destination = File.Create(path);
		byte[] buffer = new byte[81920];
		long written = 0L;
		int lastPercent = -1;
		while (true)
		{
			int num;
			int read = (num = await source.ReadAsync(buffer));
			if (num <= 0)
			{
				break;
			}
			await destination.WriteAsync(buffer.AsMemory(0, read));
			written += read;
			if (progress != null && total.HasValue && total.GetValueOrDefault() > 0)
			{
				int num2 = (int)(written * 100 / total.Value);
				if (num2 != lastPercent)
				{
					lastPercent = num2;
					progress.Report(num2);
				}
			}
		}
	}

	private static void TryDelete(string dir)
	{
		try
		{
			if (Directory.Exists(dir))
			{
				Directory.Delete(dir, recursive: true);
			}
		}
		catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException) ? true : false)
		{
		}
	}
}
