using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel;
using System.Runtime.CompilerServices;
using System.Threading;
using System.Threading.Tasks;
using ScriptEditor.Models;

namespace ScriptEditor.Services;

public sealed class ScriptHub : INotifyPropertyChanged
{
	private const int PageSize = 24;

	private readonly AppSettings _settings;

	private readonly ScriptHubClient _client;

	private CancellationTokenSource? _inFlight;

	private string _query = string.Empty;

	private bool _isLoading;

	private string? _error;

	private int _page = 1;

	private int _totalPages = 1;

	private int _total;

	private bool _hasSearched;

	public ObservableCollection<HubScript> Results { get; } = new ObservableCollection<HubScript>();

	public IReadOnlyList<string> SortOptions => ScriptHubClient.SortOptions;

	public string DashboardUrl => "https://rscripts.net/dashboard/api";

	public string Query
	{
		get
		{
			return _query;
		}
		set
		{
			Set(ref _query, value ?? string.Empty, "Query");
		}
	}

	public string Sort
	{
		get
		{
			return _settings.HubSort;
		}
		set
		{
			if (!(_settings.HubSort == value))
			{
				_settings.HubSort = value;
				OnPropertyChanged("Sort");
			}
		}
	}

	public bool IsLoading
	{
		get
		{
			return _isLoading;
		}
		private set
		{
			if (Set(ref _isLoading, value, "IsLoading"))
			{
				OnPropertyChanged("ShowResults");
				OnPropertyChanged("ShowEmpty");
			}
		}
	}

	public string? Error
	{
		get
		{
			return _error;
		}
		private set
		{
			if (Set(ref _error, value, "Error"))
			{
				OnPropertyChanged("HasError");
				OnPropertyChanged("ShowResults");
				OnPropertyChanged("ShowEmpty");
			}
		}
	}

	public bool HasError => !string.IsNullOrEmpty(_error);

	public bool HasApiKey => _settings.HasScriptHubApiKey;

	public int Page
	{
		get
		{
			return _page;
		}
		private set
		{
			if (Set(ref _page, value, "Page"))
			{
				OnPropertyChanged("PageText");
			}
		}
	}

	public int TotalPages
	{
		get
		{
			return _totalPages;
		}
		private set
		{
			if (Set(ref _totalPages, value, "TotalPages"))
			{
				OnPropertyChanged("PageText");
			}
		}
	}

	public int Total
	{
		get
		{
			return _total;
		}
		private set
		{
			if (Set(ref _total, value, "Total"))
			{
				OnPropertyChanged("ResultsText");
			}
		}
	}

	public string PageText => $"Page {Page} of {Math.Max(TotalPages, 1)}";

	public string ResultsText
	{
		get
		{
			if (Total <= 0)
			{
				return string.Empty;
			}
			return $"{Total:N0} scripts";
		}
	}

	public bool CanGoBack
	{
		get
		{
			if (Page > 1)
			{
				return !IsLoading;
			}
			return false;
		}
	}

	public bool CanGoForward
	{
		get
		{
			if (Page < TotalPages)
			{
				return !IsLoading;
			}
			return false;
		}
	}

	public bool ShowKeyPrompt => !HasApiKey;

	public bool ShowResults
	{
		get
		{
			if (HasApiKey && !IsLoading && !HasError)
			{
				return Results.Count > 0;
			}
			return false;
		}
	}

	public bool ShowEmpty
	{
		get
		{
			if (HasApiKey && !IsLoading && !HasError && Results.Count == 0)
			{
				return _hasSearched;
			}
			return false;
		}
	}

	public event PropertyChangedEventHandler? PropertyChanged;

	public ScriptHub(AppSettings settings)
	{
		ScriptHub scriptHub = this;
		_settings = settings;
		_client = new ScriptHubClient(() => settings.ScriptHubApiKey);
		settings.PropertyChanged += (object? _, PropertyChangedEventArgs e) =>
		{
			string propertyName = e.PropertyName;
			if ((propertyName == "ScriptHubApiKey" || propertyName == "ScriptHubApiKeyProtected") ? true : false)
			{
				scriptHub.OnPropertyChanged("HasApiKey");
				scriptHub.OnPropertyChanged("ShowResults");
				scriptHub.OnPropertyChanged("ShowKeyPrompt");
			}
		};
	}

	public Task SearchAsync()
	{
		return LoadAsync(1);
	}

	public Task NextPageAsync()
	{
		if (Page >= TotalPages)
		{
			return Task.CompletedTask;
		}
		return LoadAsync(Page + 1);
	}

	public Task PreviousPageAsync()
	{
		if (Page <= 1)
		{
			return Task.CompletedTask;
		}
		return LoadAsync(Page - 1);
	}

	public async Task<HubScript> LoadScriptAsync(HubScript summary)
	{
		HubScript detail = await _client.GetScriptAsync(summary.Slug);
		if (!string.IsNullOrEmpty(detail.Script))
		{
			return detail;
		}
		string raw = detail.RawScript ?? summary.RawScript;
		if (string.IsNullOrEmpty(raw))
		{
			throw new ScriptHubException("That script has no downloadable source.");
		}
		string script = await _client.DownloadRawAsync(raw);
		return new HubScript
		{
			Id = detail.Id,
			Title = detail.Title,
			Slug = detail.Slug,
			Description = detail.Description,
			Views = detail.Views,
			Likes = detail.Likes,
			IsKeySystem = detail.IsKeySystem,
			IsPaid = detail.IsPaid,
			RawScript = raw,
			Script = script,
			Game = detail.Game,
			Creator = detail.Creator,
			Risk = detail.Risk
		};
	}

	private async Task LoadAsync(int page)
	{
		if (!HasApiKey)
		{
			OnPropertyChanged("ShowKeyPrompt");
			return;
		}
		_inFlight?.Cancel();
		CancellationTokenSource cts = (_inFlight = new CancellationTokenSource());
		IsLoading = true;
		Error = null;
		try
		{
			HubPage hubPage = await _client.BrowseAsync(Query, Sort, page, 24, new HubFilters(_settings.HubNoKeySystem, _settings.HubMobileOnly, _settings.HubFreeOnly, _settings.HubVerifiedOnly), cts.Token);
			if (cts.IsCancellationRequested)
			{
				return;
			}
			Results.Clear();
			foreach (HubScript script in hubPage.Scripts)
			{
				Results.Add(script);
			}
			Page = hubPage.Page;
			TotalPages = hubPage.TotalPages;
			Total = hubPage.Total;
			_hasSearched = true;
		}
		catch (OperationCanceledException)
		{
		}
		catch (ScriptHubException ex2)
		{
			Results.Clear();
			Error = ex2.Message;
			_hasSearched = true;
		}
		finally
		{
			if (_inFlight == cts)
			{
				IsLoading = false;
				_inFlight = null;
			}
			OnPropertyChanged("CanGoBack");
			OnPropertyChanged("CanGoForward");
			OnPropertyChanged("ShowResults");
			OnPropertyChanged("ShowEmpty");
		}
	}

	private bool Set<T>(ref T field, T value, [CallerMemberName] string? name = null)
	{
		if (EqualityComparer<T>.Default.Equals(field, value))
		{
			return false;
		}
		field = value;
		OnPropertyChanged(name);
		return true;
	}

	private void OnPropertyChanged([CallerMemberName] string? name = null)
	{
		PropertyChanged?.Invoke(this, new PropertyChangedEventArgs(name));
	}
}
