using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Interop;
using System.Windows.Media;
using CefSharp;
using CefSharp.Wpf;
using Microsoft.Win32;
using Newtonsoft.Json;
using dotnet_codex_ui.Configuration;
using dotnet_codex_ui.Infrastructure.Logging;
using dotnet_codex_ui.Infrastructure.Processes;
using dotnet_codex_ui.Infrastructure.Windows;
using dotnet_codex_ui.Services;

namespace dotnet_codex_ui.Features.Editor;

internal class Editor : ChromiumWebBrowser
{
	private sealed record SnapshotEntry([property: JsonProperty("id")] string Id, [property: JsonProperty("text")] string Text);

	private const string Api = "window.codexEditor";

	private static readonly TimeSpan ReadTimeout = TimeSpan.FromSeconds(3L);

	private const int MaxLoadRetries = 60;

	private int LoadRetries;

	private int Waiting;

	private readonly HashSet<string> DirtyField = new HashSet<string>();

	private readonly string StartUrlField;

	private int Retries;

	private CancellationTokenSource ReadyCts = new CancellationTokenSource();

	private const int MaxProbeFailures = 20;

	private nint FrameRateMonitor;

	private int FrameRate;

	private TaskCompletionSource<bool> ReadyTaskCompletionSource { get; set; } = new TaskCompletionSource<bool>();

	internal Task Ready => ReadyTaskCompletionSource.Task;

	internal TimeSpan ReadyTimeout { get; set; } = ReadyPoller.DefaultTimeout;

	internal event Action<string, bool>? DirtyChanged;

	internal bool IsDirty(string Id)
	{
		return DirtyField.Contains(Id);
	}

	internal static bool TryParseDirtyMessage(object? Message, out string Id, out bool Dirty)
	{
		Id = "";
		Dirty = false;
		if (!(Message is IDictionary<string, object> map) || Field(map, "type") as string != "document.dirtyChanged" || !(Field(map, "id") is string { Length: not 0 } text) || !(Field(map, "isDirty") is bool flag))
		{
			return false;
		}
		string text2 = text;
		bool flag2 = flag;
		Id = text2;
		Dirty = flag2;
		return true;
		static object? Field(IDictionary<string, object> Map, string Name)
		{
			if (!Map.TryGetValue(Name, out object value))
			{
				return null;
			}
			return value;
		}
	}

	private void OnPageMessage(object? Sender, JavascriptMessageReceivedEventArgs E)
	{
		if (!TryParseDirtyMessage(E.Message, out string Id, out bool Dirty))
		{
			return;
		}
		Dispatcher.BeginInvoke((Action)(() =>
		{
			if (!(Dirty ? (!DirtyField.Add(Id)) : (!DirtyField.Remove(Id))))
			{
				DirtyChanged?.Invoke(Id, Dirty);
			}
		}));
	}

	public Editor()
	{
		string StartUrl = (StartUrlField = $"{LanguageServer.Url}?theme=codex&accent={Uri.EscapeDataString(AccentHex(AccentTheme.Current.Accent))}&fontSize={RegistryConfiguration.EditorFontSize}");
		Address = StartUrl;
		JavascriptMessageReceived += OnPageMessage;
		LoadError += (object? Sender, LoadErrorEventArgs E) =>
		{
			if (E.Frame.IsMain && E.ErrorCode != CefErrorCode.Aborted && ++LoadRetries <= 60)
			{
				Dispatcher.InvokeAsync((Func<Task>)(async () =>
				{
					await Task.Delay(1000);
					Load(StartUrl);
				}));
			}
		};
		LoadingStateChanged += async (object? Sender, LoadingStateChangedEventArgs E) =>
		{
			if (!E.IsLoading && !Ready.IsCompleted && Interlocked.Exchange(ref Waiting, 1) != 1)
			{
				await Dispatcher.InvokeAsync((Func<Task>)(async () =>
				{
					TaskCompletionSource<bool> Source = ReadyTaskCompletionSource;
					try
					{
						await WhenReady(ReadyCts.Token);
						Source.TrySetResult(result: true);
					}
					catch (Exception exception)
					{
						if (Source.TrySetException(exception))
						{
							_ = Source.Task.Exception;
						}
					}
				}));
			}
		};
		Loaded += (object _, RoutedEventArgs _) =>
		{
			AccentTheme.Changed -= OnAccentChanged;
			AccentTheme.Changed += OnAccentChanged;
			OnAccentChanged();
		};
		Unloaded += (object _, RoutedEventArgs _) =>
		{
			AccentTheme.Changed -= OnAccentChanged;
		};
	}

	private static string AccentHex(Color Value)
	{
		return $"#{Value.R:X2}{Value.G:X2}{Value.B:X2}";
	}

	private void OnAccentChanged()
	{
		Execute("window.codexEditor.theme.setAccentColor(" + JsonConvert.ToString(AccentHex(AccentTheme.Current.Accent)) + ")");
	}

	private Task WhenReady(CancellationToken Cancel)
	{
		return ReadyPoller.RunAsync(async () =>
		{
			JavascriptResponse javascriptResponse = await this.EvaluateScriptAsync("typeof window.codexEditor !== 'undefined' && window.codexEditor.runtime.isReady()");
			if (javascriptResponse == null || !javascriptResponse.Success)
			{
				return (bool?)null;
			}
			object result = javascriptResponse.Result;
			return result is bool && (bool)result;
		}, ReadyTimeout, ReadyPoller.DefaultInterval, 20, Cancel);
	}

	internal void Retry()
	{
		if (Ready.IsFaulted || Ready.IsCanceled)
		{
			ReadyCts.Cancel();
			ReadyCts.Dispose();
			ReadyCts = new CancellationTokenSource();
			LoadRetries = 0;
			ReadyTaskCompletionSource = new TaskCompletionSource<bool>();
			Interlocked.Exchange(ref Waiting, 0);
			Load($"{StartUrlField}&retry={++Retries}");
		}
	}

	internal void CancelReady()
	{
		ReadyCts.Cancel();
	}

	private async void Execute(string Script)
	{
		_ = 1;
		try
		{
			if (!Ready.IsFaulted)
			{
				await Ready;
				JavascriptResponse javascriptResponse = await this.EvaluateScriptAsync(Script);
				if (javascriptResponse != null && !javascriptResponse.Success)
				{
					AppLog.Error(new InvalidOperationException("Editor script failed: " + javascriptResponse.Message + "\n" + Script.Substring(0, Math.Min(Script.Length, 300))), null, "Execute", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Features\\Editor\\Editor.cs");
				}
			}
		}
		catch (EditorReadyException)
		{
		}
		catch (Exception failure)
		{
			AppLog.Error(failure, null, "Execute", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Features\\Editor\\Editor.cs");
		}
	}

	private string? Read(string Expression)
	{
		if (!Ready.IsCompletedSuccessfully)
		{
			return null;
		}
		try
		{
			Task<JavascriptResponse> task = this.EvaluateScriptAsync(Expression);
			if (task.Wait(ReadTimeout))
			{
				JavascriptResponse result = task.Result;
				if (result != null && result.Success)
				{
					return result.Result as string;
				}
			}
			return null;
		}
		catch (Exception failure)
		{
			AppLog.Error(failure, null, "Read", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Features\\Editor\\Editor.cs");
			return null;
		}
	}

	private static string Str(string Value)
	{
		return JsonConvert.ToString(Value);
	}

	internal void OpenDocuments(IEnumerable<(string Id, string Text)> Documents)
	{
		var list = Documents.Select(((string Id, string Text) Document) => new
		{
			id = Document.Id,
			text = Document.Text
		}).ToList();
		if (list.Count != 0)
		{
			Execute("window.codexEditor.documents.openMany(" + JsonConvert.SerializeObject(list) + ")");
		}
	}

	internal void OpenDocument(string Id, string Text, bool Show = false)
	{
		Execute($"{"window.codexEditor"}.documents.open({{ id: {Str(Id)}, text: {Str(Text)}, show: {(Show ? "true" : "false")} }})");
	}

	internal void ShowDocument(string Id)
	{
		Execute("window.codexEditor.documents.show(" + Str(Id) + ")");
	}

	internal void CloseDocument(string Id)
	{
		Execute("window.codexEditor.documents.close(" + Str(Id) + ")");
	}

	internal void SetText(string Id, string Text)
	{
		Execute($"{"window.codexEditor"}.documents.setText({Str(Id)}, {Str(Text)})");
	}

	internal async Task<FormatResult> FormatAsync(string Id, CancellationToken Cancel = default(CancellationToken))
	{
		try
		{
			await Ready;
		}
		catch (Exception)
		{
			return new FormatResult(Ok: false, Changed: false, "unavailable", "The editor isn't ready.");
		}
		using (Cancel.Register(() =>
		{
			Execute("if (window.__codexFormat) window.__codexFormat.abort();");
		}))
		{
			_ = 1;
			try
			{
				JavascriptResponse javascriptResponse = await this.EvaluateScriptAsPromiseAsync($"window.__codexFormat = new AbortController(); return {"window.codexEditor"}.documents.format({Str(Id)}, {{ signal: window.__codexFormat.signal }});").WaitAsync(TimeSpan.FromSeconds(20L), Cancel);
				if (!javascriptResponse.Success || !(javascriptResponse.Result is IDictionary<string, object> map))
				{
					return new FormatResult(Ok: false, Changed: false, "failed", javascriptResponse.Message);
				}
				object obj = Field(map, "ok");
				bool ok = obj is bool && (bool)obj;
				obj = Field(map, "changed");
				return new FormatResult(ok, obj is bool && (bool)obj, Field(map, "reason") as string, Field(map, "message") as string);
			}
			catch (OperationCanceledException)
			{
				return new FormatResult(Ok: false, Changed: false, "cancelled", "Formatting was cancelled.");
			}
			catch (TimeoutException)
			{
				Execute("if (window.__codexFormat) window.__codexFormat.abort();");
				return new FormatResult(Ok: false, Changed: false, "timeout", "Formatting took too long.");
			}
			catch (Exception ex4)
			{
				AppLog.Error(ex4, null, "FormatAsync", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Features\\Editor\\Editor.cs");
				return new FormatResult(Ok: false, Changed: false, "failed", ex4.Message);
			}
		}
		static object? Field(IDictionary<string, object> Map, string Name)
		{
			if (!Map.TryGetValue(Name, out object value))
			{
				return null;
			}
			return value;
		}
	}

	internal void ForgetDirty(string Id)
	{
		DirtyField.Remove(Id);
	}

	internal void MarkSaved(string Id)
	{
		Execute("window.codexEditor.documents.markSaved(" + Str(Id) + ")");
	}

	internal string? GetText(string Id)
	{
		return Read("window.codexEditor.documents.getText(" + Str(Id) + ")");
	}

	internal Dictionary<string, string>? Snapshot()
	{
		string text = Read("JSON.stringify(window.codexEditor.documents.snapshot())");
		if (text == null)
		{
			return null;
		}
		try
		{
			return JsonConvert.DeserializeObject<List<SnapshotEntry>>(text)?.ToDictionary((SnapshotEntry Entry) => Entry.Id, (SnapshotEntry Entry) => Entry.Text);
		}
		catch (Exception failure)
		{
			AppLog.Error(failure, null, "Snapshot", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Features\\Editor\\Editor.cs");
			return null;
		}
	}

	internal void GoToLine(int Line)
	{
		Execute($"{"window.codexEditor"}.actions.goTo('main', {{ position: {{ line: {Line}, column: 1 }} }})");
	}

	internal void SetFontSize(int Size)
	{
		UpdateOptions(new EditorOptions
		{
			FontSize = Size
		});
	}

	internal void SetMinimap(bool Enabled)
	{
		UpdateOptions(new EditorOptions
		{
			Minimap = new MinimapOptions(Enabled)
		});
	}

	internal void SetInlayHints(bool Enabled)
	{
		UpdateOptions(new EditorOptions
		{
			InlayHints = new InlayHintsOptions(Enabled)
		});
	}

	internal void UpdateOptions(EditorOptions Options)
	{
		Execute($"{"window.codexEditor"}.editors.setOptions('main', {Options})");
	}

	public override void BeginInit()
	{
		base.BeginInit();
		FrameRate = DisplayRefresh.ForPrimary();
		BrowserSettings = new BrowserSettings
		{
			WindowlessFrameRate = FrameRate
		};
		AppLog.Information("Editor frame rate starts at {Rate} Hz", FrameRate);
		Loaded += (object _, RoutedEventArgs _) =>
		{
			WatchDisplay();
		};
		IsBrowserInitializedChanged += (object _, DependencyPropertyChangedEventArgs _) =>
		{
			MatchDisplayRefresh(Force: true);
		};
	}

	private void WatchDisplay()
	{
		Window window = Window.GetWindow(this);
		if (window != null)
		{
			window.LocationChanged -= OnOwnerMoved;
			window.LocationChanged += OnOwnerMoved;
			window.DpiChanged -= OnOwnerMoved;
			window.DpiChanged += OnOwnerMoved;
			SystemEvents.DisplaySettingsChanged -= OnDisplaySettingsChanged;
			SystemEvents.DisplaySettingsChanged += OnDisplaySettingsChanged;
			Unloaded += (object _, RoutedEventArgs _) =>
			{
				SystemEvents.DisplaySettingsChanged -= OnDisplaySettingsChanged;
			};
			MatchDisplayRefresh(Force: true);
		}
	}

	private void OnOwnerMoved(object? Sender, EventArgs E)
	{
		MatchDisplayRefresh(Force: false);
	}

	private void OnDisplaySettingsChanged(object? Sender, EventArgs E)
	{
		Dispatcher.BeginInvoke((Action)(() =>
		{
			MatchDisplayRefresh(Force: true);
		}));
	}

	internal void MatchDisplayRefresh(bool Force)
	{
		Window window = Window.GetWindow(this);
		if (window == null)
		{
			return;
		}
		nint num = DisplayRefresh.MonitorOf(new WindowInteropHelper(window).Handle);
		if (!Force && num == FrameRateMonitor)
		{
			return;
		}
		FrameRateMonitor = num;
		int num2 = DisplayRefresh.ForWindow(new WindowInteropHelper(window).Handle);
		if (num2 != FrameRate)
		{
			FrameRate = num2;
			IBrowserHost browserHost = this.GetBrowserHost();
			if (browserHost != null)
			{
				browserHost.WindowlessFrameRate = num2;
			}
			AppLog.Information("Editor frame rate set to {Rate} Hz to match the display", num2);
		}
	}
}
