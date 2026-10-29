using System;
using System.Collections.Concurrent;
using System.IO;
using System.Net.Http;
using System.Threading.Tasks;
using System.Windows.Media;
using System.Windows.Media.Imaging;

namespace dotnet_codex_ui.Features.Clients;

internal static class AvatarCache
{
	private static readonly HttpClient Http = new HttpClient
	{
		Timeout = TimeSpan.FromSeconds(10L)
	};

	private static readonly ConcurrentDictionary<string, Task<ImageSource?>> Cache = new ConcurrentDictionary<string, Task<ImageSource>>();

	public static Task<ImageSource?> GetAsync(string Url)
	{
		return Cache.GetOrAdd(Url, Load);
	}

	private static async Task<ImageSource?> Load(string Url)
	{
		try
		{
			byte[] buffer = await Http.GetByteArrayAsync(Url).ConfigureAwait(continueOnCapturedContext: false);
			BitmapImage bitmapImage = new BitmapImage();
			bitmapImage.BeginInit();
			bitmapImage.CacheOption = BitmapCacheOption.OnLoad;
			bitmapImage.DecodePixelWidth = 96;
			bitmapImage.StreamSource = new MemoryStream(buffer);
			bitmapImage.EndInit();
			bitmapImage.Freeze();
			return bitmapImage;
		}
		catch
		{
			Cache.TryRemove(Url, out Task<ImageSource> _);
			return null;
		}
	}
}
