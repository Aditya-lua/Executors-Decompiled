using System;
using System.Collections.Generic;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Text.Json;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using Microsoft.Web.WebView2.Core;
using Microsoft.Web.WebView2.Wpf;
using ScriptEditor.Models;
using ScriptEditor.Services;

namespace ScriptEditor.Controls;

public class MonacoEditor : ContentControl
{
	public readonly record struct InlineCompletionRequest(int Id, string Prefix, string Suffix);

	private const string VirtualHost = "scripteditor.assets";

	private readonly WebView2CompositionControl _web = new WebView2CompositionControl();

	private readonly TaskCompletionSource _ready = new TaskCompletionSource(TaskCreationOptions.RunContinuationsAsynchronously);

	private readonly HashSet<string> _openTabs = new HashSet<string>();

	public Task Ready => _ready.Task;

	public event EventHandler<string>? ContentChanged;

	public event EventHandler<string>? SaveRequested;

	public event EventHandler<(int Line, int Column)>? CursorMoved;

	public event EventHandler<string>? CommandRequested;

	public event EventHandler<string>? LspPayloadOutgoing;

	public event EventHandler<InlineCompletionRequest>? InlineCompletionRequested;

	public MonacoEditor()
	{
		//IL_0058: Unknown result type (might be due to invalid IL or missing references)
		//IL_0062: Expected Obj, but got Unknown
		((ContentControl)this).Content = _web;
		_web.DefaultBackgroundColor = Color.FromArgb(255, 20, 20, 25);
		((FrameworkElement)this).Loaded += OnLoaded;
	}

	private async void OnLoaded(object sender, RoutedEventArgs e)
	{
		((FrameworkElement)this).Loaded -= OnLoaded;
		await InitializeAsync();
	}

	private async Task InitializeAsync()
	{
		string text = Path.Combine(Environment.GetFolderPath(Environment.SpecialFolder.LocalApplicationData), "Velocity", "WebView2");
		Directory.CreateDirectory(text);
		CoreWebView2Environment environment = await CoreWebView2Environment.CreateAsync(null, text);
		await _web.EnsureCoreWebView2Async(environment);
		CoreWebView2 core = _web.CoreWebView2;
		core.SetVirtualHostNameToFolderMapping("scripteditor.assets", AppPaths.AssetFolder, CoreWebView2HostResourceAccessKind.Allow);
		CoreWebView2Settings settings = core.Settings;
		settings.AreDefaultContextMenusEnabled = false;
		settings.AreBrowserAcceleratorKeysEnabled = false;
		settings.IsZoomControlEnabled = false;
		settings.IsStatusBarEnabled = false;
		settings.AreDevToolsEnabled = true;
		settings.IsSwipeNavigationEnabled = false;
		core.WebMessageReceived += OnWebMessage;
		TaskCompletionSource loaded = new TaskCompletionSource();
		core.NavigationCompleted += OnNavigationCompleted;
		core.Navigate("https://scripteditor.assets/editor/index.html");
		await loaded.Task;
		void OnNavigationCompleted(object? s, CoreWebView2NavigationCompletedEventArgs args)
		{
			core.NavigationCompleted -= OnNavigationCompleted;
			if (args.IsSuccess)
			{
				loaded.TrySetResult();
			}
			else
			{
				loaded.TrySetException(new InvalidOperationException($"Editor host failed to load: {args.WebErrorStatus}"));
			}
		}
	}

	private void OnWebMessage(object? sender, CoreWebView2WebMessageReceivedEventArgs e)
	{
		JsonElement rootElement;
		try
		{
			rootElement = JsonDocument.Parse(e.TryGetWebMessageAsString()).RootElement;
		}
		catch (JsonException)
		{
			return;
		}
		if (!rootElement.TryGetProperty("type", out var value))
		{
			return;
		}
		string text = value.GetString();
		if (text == null)
		{
			return;
		}
		switch (text.Length)
		{
		case 5:
			if (text == "ready")
			{
				_ready.TrySetResult();
			}
			break;
		case 14:
		{
			if (text == "contentChanged" && rootElement.TryGetProperty("tabId", out var value10))
			{
				string text4 = value10.GetString();
				if (text4 != null)
				{
					ContentChanged?.Invoke(this, text4);
				}
			}
			break;
		}
		case 13:
		{
			if (text == "saveRequested" && rootElement.TryGetProperty("tabId", out var value5))
			{
				string text2 = value5.GetString();
				if (text2 != null)
				{
					SaveRequested?.Invoke(this, text2);
				}
			}
			break;
		}
		case 11:
		{
			if (text == "cursorMoved" && rootElement.TryGetProperty("line", out var value6) && rootElement.TryGetProperty("column", out var value7))
			{
				CursorMoved?.Invoke(this, (value6.GetInt32(), value7.GetInt32()));
			}
			break;
		}
		case 7:
		{
			if (text == "command" && rootElement.TryGetProperty("name", out var value8))
			{
				string text3 = value8.GetString();
				if (text3 != null)
				{
					CommandRequested?.Invoke(this, text3);
				}
			}
			break;
		}
		case 3:
		{
			if (text == "lsp" && rootElement.TryGetProperty("payload", out var value9))
			{
				LspPayloadOutgoing?.Invoke(this, value9.GetRawText());
			}
			break;
		}
		case 16:
		{
			if (text == "inlineCompletion" && rootElement.TryGetProperty("id", out var value2) && rootElement.TryGetProperty("prefix", out var value3) && rootElement.TryGetProperty("suffix", out var value4))
			{
				InlineCompletionRequested?.Invoke(this, new InlineCompletionRequest(value2.GetInt32(), value3.GetString() ?? string.Empty, value4.GetString() ?? string.Empty));
			}
			break;
		}
		}
	}

	public async Task DeliverInlineCompletionAsync(int id, IReadOnlyList<VelocityCompletionServer.InlineCompletionItem> items)
	{
		await Ready;
		_web.CoreWebView2.PostWebMessageAsJson(JsonSerializer.Serialize(new
		{
			type = "inlineCompletion",
			id = id,
			items = items.Select((VelocityCompletionServer.InlineCompletionItem i) =>
			{
				string insertText = i.InsertText;
				VelocityCompletionServer.InlineRange? range = i.Range;
				object range2;
				if (range.HasValue)
				{
					VelocityCompletionServer.InlineRange valueOrDefault = range.GetValueOrDefault();
					range2 = new
					{
						start = new
						{
							line = valueOrDefault.StartLine,
							character = valueOrDefault.StartCharacter
						},
						end = new
						{
							line = valueOrDefault.EndLine,
							character = valueOrDefault.EndCharacter
						}
					};
				}
				else
				{
					range2 = null;
				}
				return new
				{
					insertText = insertText,
					range = range2
				};
			})
		}));
	}

	public Task SetAiCompletionAsync(bool enabled, int debounceMs)
	{
		return InvokeAsync("setAiCompletion", enabled, debounceMs);
	}

	public async Task DeliverLspPayloadAsync(string payload)
	{
		await Ready;
		_web.CoreWebView2.PostWebMessageAsJson("{\"type\":\"lsp\",\"payload\":" + payload + "}");
	}

	public Task SetLspAvailableAsync(bool available)
	{
		return InvokeAsync("setLspAvailable", available);
	}

	private async Task<string> InvokeAsync(string function, params object?[] args)
	{
		await Ready;
		string value = string.Join(",", args.Select((object a) => JsonSerializer.Serialize(a)));
		return await _web.CoreWebView2.ExecuteScriptAsync($"window.host.{function}({value})");
	}

	public async Task OpenTabAsync(string tabId, string language, string content)
	{
		if (_openTabs.Add(tabId))
		{
			await InvokeAsync("openTab", tabId, language, content);
		}
	}

	public Task ActivateTabAsync(string? tabId)
	{
		return InvokeAsync("activateTab", tabId);
	}

	public async Task CloseTabAsync(string tabId)
	{
		_openTabs.Remove(tabId);
		await InvokeAsync("closeTab", tabId);
	}

	public Task SetContentAsync(string tabId, string content)
	{
		return InvokeAsync("setContent", tabId, content);
	}

	public Task SetLanguageAsync(string tabId, string language)
	{
		return InvokeAsync("setLanguage", tabId, language);
	}

	public Task FocusEditorAsync()
	{
		return InvokeAsync("focusEditor");
	}

	public Task ApplySettingsAsync(AppSettings settings)
	{
		return InvokeAsync("applyOptions", new
		{
			fontFamily = settings.FontFamily,
			fontSize = settings.FontSize,
			tabSize = settings.TabSize,
			wordWrap = settings.WordWrap,
			showMinimap = settings.ShowMinimap,
			showLineNumbers = settings.ShowLineNumbers,
			showWhitespace = settings.ShowWhitespace,
			fontLigatures = settings.FontLigatures,
			smoothScrolling = settings.SmoothScrolling,
			bracketColorization = settings.BracketColorization,
			autoClosingBrackets = settings.AutoClosingBrackets
		});
	}

	public async Task<string> GetContentAsync(string tabId)
	{
		return JsonSerializer.Deserialize<string>(await InvokeAsync("getContent", tabId)) ?? string.Empty;
	}
}
