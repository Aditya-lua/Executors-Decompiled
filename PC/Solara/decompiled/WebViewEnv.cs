using System;
using System.IO;
using System.Threading.Tasks;
using Microsoft.Web.WebView2.Core;
using Microsoft.Web.WebView2.Wpf;

internal static class WebViewEnv
{
	private static Task<CoreWebView2Environment> _envTask;

	private static readonly object _lock = new object();

	public static Task<CoreWebView2Environment> GetAsync()
	{
		Task<CoreWebView2Environment> envTask = _envTask;
		if (envTask != null)
		{
			return envTask;
		}
		lock (_lock)
		{
			if (_envTask == null)
			{
				_envTask = CoreWebView2Environment.CreateAsync(null, Path.Combine(Environment.GetFolderPath(Environment.SpecialFolder.LocalApplicationData), "SolaraWebView2"));
			}
			return _envTask;
		}
	}

	public static async void InitializeWebViewAsync(WebView2 webView)
	{
		_ = 1;
		try
		{
			await webView.EnsureCoreWebView2Async(await GetAsync());
			webView.CoreWebView2.Settings.IsPasswordAutosaveEnabled = false;
			webView.CoreWebView2.Settings.IsGeneralAutofillEnabled = false;
			webView.CoreWebView2.SetVirtualHostNameToFolderMapping("app.solara", Path.Combine(AppDomain.CurrentDomain.BaseDirectory, "Monaco"), CoreWebView2HostResourceAccessKind.Allow);
			webView.Source = new Uri("https://app.solara/index.html");
		}
		catch (Exception ex)
		{
			SimpleLogger.Log("WebView init failed: " + ex);
		}
	}
}
