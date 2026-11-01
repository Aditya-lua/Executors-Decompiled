using System;
using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.ComponentModel;
using System.Diagnostics;
using System.Net.Http;
using System.Net.Http.Headers;
using System.Threading;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Controls.Primitives;
using System.Windows.Markup;
using System.Windows.Media.Animation;
using System.Windows.Threading;
using Newtonsoft.Json;
using Wpf.Ui.Controls;

namespace SolaraUI;

public class ScriptHub : Page, IComponentConnector
{
	public sealed class ScriptBloxSearchResponse
	{
		public sealed class SBResult
		{
			[JsonProperty("totalPages")]
			public int TotalPages { get; set; }

			[JsonProperty("scripts")]
			public List<SBScript> Scripts { get; set; }
		}

		public sealed class SBScript
		{
			[JsonProperty("_id")]
			public string Id { get; set; }

			[JsonProperty("title")]
			public string Title { get; set; }

			[JsonProperty("slug")]
			public string Slug { get; set; }

			[JsonProperty("verified")]
			public bool Verified { get; set; }

			[JsonProperty("key")]
			public bool Key { get; set; }

			[JsonProperty("views")]
			public int Views { get; set; }

			[JsonProperty("scriptType")]
			public string ScriptType { get; set; }

			[JsonProperty("isUniversal")]
			public bool IsUniversal { get; set; }

			[JsonProperty("isPatched")]
			public bool IsPatched { get; set; }

			[JsonProperty("createdAt")]
			public string CreatedAt { get; set; }

			[JsonProperty("updatedAt")]
			public string UpdatedAt { get; set; }

			[JsonProperty("image")]
			public string Image { get; set; }

			[JsonProperty("script")]
			public string Script { get; set; }

			[JsonProperty("game")]
			public SBGame Game { get; set; }

			[JsonProperty("matched")]
			public List<string> Matched { get; set; }
		}

		public sealed class SBGame
		{
			[JsonProperty("_id")]
			public string Id { get; set; }

			[JsonProperty("name")]
			public string Name { get; set; }

			[JsonProperty("imageUrl")]
			public string ImageUrl { get; set; }
		}

		[JsonProperty("result")]
		public SBResult Result { get; set; }
	}

	public sealed class ScriptBloxFetchOptions
	{
		public int Page = 1;

		public int Max = 20;

		public string Mode;

		public int? Patched;

		public int? Key;

		public int? Universal;

		public int? Verified;

		public string SortBy = "updatedAt";

		public string Order = "desc";

		public string Exclude;
	}

	private MainWindow _mainWindow;

	private int _currentPage = 1;

	private int _totalPages = 1;

	private string _currentQuery = string.Empty;

	private bool _isLoading;

	private CancellationTokenSource _searchCts;

	private static readonly HttpClient _http = new HttpClient
	{
		Timeout = TimeSpan.FromSeconds(20.0)
	};

	internal Grid MainGrid;

	internal TextBox SearchBar;

	internal ScrollViewer ScriptScrollViewer;

	internal WrapPanel ScriptPanel;

	private bool _contentLoaded;

	public ScriptHub(MainWindow Main)
	{
		_mainWindow = Main;
		InitializeComponent();
	}

	private static string BuildSearchUrl(string q, int page, int max, bool verifiedOnly, bool strict, string sortBy, string order)
	{
		List<string> list = new List<string>();
		list.Add("q=" + Uri.EscapeDataString(q ?? ""));
		list.Add("page=" + page);
		list.Add("max=" + Math.Max(1, Math.Min(20, max)));
		if (verifiedOnly)
		{
			list.Add("verified=1");
		}
		list.Add("strict=" + (strict ? "true" : "false"));
		if (!string.IsNullOrWhiteSpace(sortBy))
		{
			list.Add("sortBy=" + Uri.EscapeDataString(sortBy));
		}
		if (!string.IsNullOrWhiteSpace(order))
		{
			list.Add("order=" + Uri.EscapeDataString(order));
		}
		return "https://scriptblox.com/api/script/search?" + string.Join("&", list.ToArray());
	}

	public static async Task<(List<ScriptBloxSearchResponse.SBScript> Scripts, int TotalPages)> SearchAsync(string q, int page, int max, CancellationToken ct)
	{
		string text = BuildSearchUrl(q, page, max, verifiedOnly: false, strict: false, "accuracy", "desc");
		HttpRequestMessage req = new HttpRequestMessage(HttpMethod.Get, text);
		try
		{
			((HttpHeaders)req.Headers).TryAddWithoutValidation("Accept", "application/json");
			HttpResponseMessage resp = await _http.SendAsync(req, (HttpCompletionOption)1, ct);
			try
			{
				resp.EnsureSuccessStatusCode();
				ScriptBloxSearchResponse scriptBloxSearchResponse = JsonConvert.DeserializeObject<ScriptBloxSearchResponse>(await resp.Content.ReadAsStringAsync());
				if (scriptBloxSearchResponse?.Result?.Scripts == null)
				{
					return (Scripts: new List<ScriptBloxSearchResponse.SBScript>(), TotalPages: 1);
				}
				List<ScriptBloxSearchResponse.SBScript> list = new List<ScriptBloxSearchResponse.SBScript>();
				for (int i = 0; i < scriptBloxSearchResponse.Result.Scripts.Count; i++)
				{
					ScriptBloxSearchResponse.SBScript sBScript = scriptBloxSearchResponse.Result.Scripts[i];
					if (sBScript != null)
					{
						list.Add(sBScript);
					}
				}
				return (Scripts: list, TotalPages: scriptBloxSearchResponse.Result.TotalPages);
			}
			finally
			{
				((IDisposable)resp)?.Dispose();
			}
		}
		finally
		{
			((IDisposable)req)?.Dispose();
		}
	}

	public async Task LoadFromScriptBloxAsync(string query, int page, bool replaceContent, CancellationToken ct = default(CancellationToken))
	{
		if (_isLoading)
		{
			return;
		}
		_isLoading = true;
		try
		{
			(List<ScriptBloxSearchResponse.SBScript>, int) tuple = await SearchAsync(query, page, 20, ct);
			List<ScriptBloxSearchResponse.SBScript> scripts = tuple.Item1;
			int item = tuple.Item2;
			_totalPages = item;
			_currentPage = page;
			_currentQuery = query;
			double oldScrollOffset = 0.0;
			if (!replaceContent)
			{
				ScriptScrollViewer.ScrollChanged -= new ScrollChangedEventHandler(ScriptScrollViewer_ScrollChanged);
				oldScrollOffset = ScriptScrollViewer.VerticalOffset;
			}
			if (replaceContent)
			{
				await ((DispatcherObject)Application.Current).Dispatcher.InvokeAsync((Action)delegate
				{
					((Panel)ScriptPanel).Children.Clear();
				});
			}
			for (int i = 0; i < scripts.Count; i++)
			{
				ScriptBloxSearchResponse.SBScript sBScript = scripts[i];
				if (sBScript != null)
				{
					string name = (string.IsNullOrWhiteSpace(sBScript.Title) ? "(untitled)" : sBScript.Title);
					string text = ((!string.IsNullOrWhiteSpace(sBScript.Image) && sBScript.Image != "/images/no-script.webp") ? sBScript.Image : ((sBScript.Game != null) ? sBScript.Game.ImageUrl : null));
					text = ((string.IsNullOrWhiteSpace(text) || Uri.IsWellFormedUriString(text, UriKind.Absolute)) ? "https://scriptblox.com/images/no-script.webp" : ((text.StartsWith("/") ? "https://scriptblox.com" : "") + text));
					string code = sBScript.Script ?? string.Empty;
					ScriptItem item2 = new ScriptItem(name, code, sBScript.Verified, sBScript.Key, sBScript.ScriptType, sBScript.IsUniversal);
					await item2.InitializeAsync(text);
					await ((DispatcherObject)Application.Current).Dispatcher.InvokeAsync<int>((Func<int>)(() => ((Panel)ScriptPanel).Children.Add((UIElement)(object)item2)));
				}
			}
			if (!replaceContent)
			{
				await ((DispatcherObject)Application.Current).Dispatcher.BeginInvoke((Delegate)(Action)delegate
				{
					//IL_003c: Unknown result type (might be due to invalid IL or missing references)
					//IL_0046: Expected O, but got Unknown
					ScriptScrollViewer.ScrollToVerticalOffset(oldScrollOffset);
					ScriptScrollViewer.ScrollChanged += new ScrollChangedEventHandler(ScriptScrollViewer_ScrollChanged);
				}, (DispatcherPriority)6, Array.Empty<object>());
			}
		}
		catch (TaskCanceledException)
		{
		}
		catch (Exception ex2)
		{
			Exception ex3 = ex2;
			await ((DispatcherObject)Application.Current).Dispatcher.InvokeAsync((Action)delegate
			{
				//IL_0027: Unknown result type (might be due to invalid IL or missing references)
				if (!ct.IsCancellationRequested)
				{
					MessageBox.Show("Error loading scripts: " + ex3.Message);
				}
			});
		}
		finally
		{
			_isLoading = false;
			if (!replaceContent)
			{
				ScriptScrollViewer.ScrollChanged += new ScrollChangedEventHandler(ScriptScrollViewer_ScrollChanged);
			}
		}
	}

	private async void TextBox_Change(object sender, TextChangedEventArgs e)
	{
		string newQuery = (((TextBox)SearchBar).Text ?? "").Trim();
		if (newQuery.Length < 2)
		{
			await ((DispatcherObject)Application.Current).Dispatcher.InvokeAsync((Action)delegate
			{
				((Panel)ScriptPanel).Children.Clear();
			});
			_currentQuery = string.Empty;
			_currentPage = 1;
			_totalPages = 1;
		}
		else
		{
			if (newQuery == _currentQuery)
			{
				return;
			}
			if (_searchCts != null)
			{
				_searchCts.Cancel();
			}
			_searchCts = new CancellationTokenSource();
			CancellationToken ct = _searchCts.Token;
			try
			{
				await Task.Delay(350, ct);
				await LoadFromScriptBloxAsync(newQuery, 1, replaceContent: true, ct);
			}
			catch (OperationCanceledException)
			{
			}
			finally
			{
				if (!ct.IsCancellationRequested)
				{
					_searchCts.Dispose();
					_searchCts = null;
				}
			}
		}
	}

	private async void ScriptScrollViewer_ScrollChanged(object sender, ScrollChangedEventArgs e)
	{
		if (!(e.VerticalOffset >= e.ExtentHeight - e.ViewportHeight) || !(e.ExtentHeight > 0.0) || _isLoading || _currentPage >= _totalPages || string.IsNullOrWhiteSpace(_currentQuery))
		{
			return;
		}
		if (_searchCts != null)
		{
			_searchCts.Cancel();
		}
		_searchCts = new CancellationTokenSource();
		CancellationToken ct = _searchCts.Token;
		try
		{
			await LoadFromScriptBloxAsync(_currentQuery, _currentPage + 1, replaceContent: false, ct);
		}
		catch (OperationCanceledException)
		{
		}
		finally
		{
			if (!ct.IsCancellationRequested)
			{
				_searchCts.Dispose();
				_searchCts = null;
			}
		}
	}

	private void StartFadeInAnimation()
	{
		object obj = ((FrameworkElement)this).TryFindResource((object)"PageFadeIn");
		Storyboard val = (Storyboard)((obj is Storyboard) ? obj : null);
		if (val != null)
		{
			val.Stop((FrameworkElement)(object)this);
			if (MainGrid != null)
			{
				((UIElement)MainGrid).Opacity = 0.0;
			}
			val.Begin((FrameworkElement)(object)this);
		}
	}

	private void ScriptHub_Loaded(object sender, RoutedEventArgs e)
	{
		StartFadeInAnimation();
	}

	[DebuggerNonUserCode]
	[GeneratedCode("PresentationBuildTasks", "4.0.0.0")]
	public void InitializeComponent()
	{
		if (!_contentLoaded)
		{
			_contentLoaded = true;
			Uri uri = new Uri("/Solara;component/scripthub.xaml", UriKind.Relative);
			Application.LoadComponent((object)this, uri);
		}
	}

	[DebuggerNonUserCode]
	[GeneratedCode("PresentationBuildTasks", "4.0.0.0")]
	[EditorBrowsable(EditorBrowsableState.Never)]
	void IComponentConnector.Connect(int connectionId, object target)
	{
		//IL_002b: Unknown result type (might be due to invalid IL or missing references)
		//IL_0035: Expected O, but got Unknown
		//IL_0038: Unknown result type (might be due to invalid IL or missing references)
		//IL_0042: Expected O, but got Unknown
		//IL_005c: Unknown result type (might be due to invalid IL or missing references)
		//IL_0066: Expected O, but got Unknown
		//IL_0069: Unknown result type (might be due to invalid IL or missing references)
		//IL_0073: Expected O, but got Unknown
		//IL_0080: Unknown result type (might be due to invalid IL or missing references)
		//IL_008a: Expected O, but got Unknown
		//IL_008d: Unknown result type (might be due to invalid IL or missing references)
		//IL_0097: Expected O, but got Unknown
		switch (connectionId)
		{
		case 1:
			((FrameworkElement)(ScriptHub)target).Loaded += new RoutedEventHandler(ScriptHub_Loaded);
			break;
		case 2:
			MainGrid = (Grid)target;
			break;
		case 3:
			SearchBar = (TextBox)target;
			((TextBoxBase)SearchBar).TextChanged += new TextChangedEventHandler(TextBox_Change);
			break;
		case 4:
			ScriptScrollViewer = (ScrollViewer)target;
			ScriptScrollViewer.ScrollChanged += new ScrollChangedEventHandler(ScriptScrollViewer_ScrollChanged);
			break;
		case 5:
			ScriptPanel = (WrapPanel)target;
			break;
		default:
			_contentLoaded = true;
			break;
		}
	}
}
