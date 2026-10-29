using System;
using System.Net.Http;
using System.Threading;
using System.Threading.Tasks;
using dotnet_codex_ui.Infrastructure.Logging;

namespace dotnet_codex_ui.Features.Internet;

internal sealed class ScriptBloxProvider : IScriptProvider, IScriptDetailSource
{
	public static readonly ScriptBloxProvider Shared = new ScriptBloxProvider(new ScriptBloxApi(ScriptBloxHttp.Client), new PageCache<ProviderResult>(100, TimeSpan.FromMinutes(5L)));

	private readonly ScriptBloxApi Api;

	private readonly PageCache<ProviderResult> Cache;

	private readonly PageCache<ScriptDetail> Details;

	public string Id => "scriptblox";

	public string DisplayName => "ScriptBlox";

	public string Tagline => "Browse and search ScriptBlox";

	public bool IsConfigured => true;

	public ScriptBloxProvider(ScriptBloxApi Api, PageCache<ProviderResult> Cache, PageCache<ScriptDetail>? Details = null)
	{
		this.Api = Api;
		this.Cache = Cache;
		this.Details = Details ?? new PageCache<ScriptDetail>(100, TimeSpan.FromMinutes(10L));
		AppLog.Information("ScriptBlox provider initialised");
	}

	public static string NormalizeQuery(string? Text)
	{
		return string.Join(' ', (Text ?? string.Empty).Split((char[]?)null, StringSplitOptions.RemoveEmptyEntries));
	}

	public async Task<ProviderResult> SearchAsync(ScriptQuery Query, CancellationToken Cancel)
	{
		string Text = NormalizeQuery(Query.Text);
		int Page = Math.Max(1, Query.Page);
		string key = $"scriptblox|{((Text.Length == 0) ? "fetch" : "search")}|{Text.ToLowerInvariant()}|{Page}";
		bool Fetched = false;
		ProviderResult result = await Cache.GetAsync(key, () =>
		{
			Fetched = true;
			return LoadAsync(Text, Page);
		}).WaitAsync(Cancel).ConfigureAwait(continueOnCapturedContext: false);
		if (!Fetched)
		{
			AppLog.Debug("ScriptBlox cache hit for page {Page}", Page);
		}
		return result;
	}

	public async Task<ScriptDetail> GetDetailAsync(string Slug, CancellationToken Cancel)
	{
		bool Fetched = false;
		try
		{
			ScriptDetail result = await Details.GetAsync("detail|" + Slug, async () =>
			{
				Fetched = true;
				return (Value: await Api.GetDetailAsync(Slug, CancellationToken.None).ConfigureAwait(continueOnCapturedContext: false), Cache: true);
			}).WaitAsync(Cancel).ConfigureAwait(continueOnCapturedContext: false);
			AppLog.Debug("ScriptBlox detail {Slug} {Source}", Slug, Fetched ? "fetched" : "from cache");
			return result;
		}
		catch (ScriptBloxException ex)
		{
			AppLog.Warning("ScriptBlox detail {Slug} failed: {Reason}", Slug, ex.Message);
			throw;
		}
		catch (Exception ex2) when (((ex2 is HttpRequestException || ex2 is OperationCanceledException) ? true : false) && !Cancel.IsCancellationRequested)
		{
			AppLog.Warning(ex2, "ScriptBlox detail request failed");
			throw new ScriptBloxException("Couldn't reach ScriptBlox. Check your connection and try again.");
		}
	}

	private async Task<(ProviderResult Value, bool Cache)> LoadAsync(string Text, int Page)
	{
		string Mode = ((Text.Length == 0) ? "fetch" : "search");
		try
		{
			ScriptBloxPage scriptBloxPage = await Api.GetPageAsync(Text, Page, CancellationToken.None).ConfigureAwait(continueOnCapturedContext: false);
			AppLog.Information("ScriptBlox {Mode} page {Page}: {Count} scripts, next page {Next}", Mode, Page, scriptBloxPage.Items.Count, scriptBloxPage.NextPage);
			return (Value: ProviderResult.Of(scriptBloxPage.Items, scriptBloxPage.NextPage), Cache: true);
		}
		catch (ScriptBloxException ex)
		{
			AppLog.Warning("ScriptBlox {Mode} page {Page} failed: {Reason}", Mode, Page, ex.Message);
			return (Value: ProviderResult.Failed(ex.Message), Cache: false);
		}
		catch (Exception ex2) when ((ex2 is HttpRequestException || ex2 is TaskCanceledException) ? true : false)
		{
			AppLog.Warning(ex2, "ScriptBlox request failed");
			return (Value: ProviderResult.Failed("Couldn't reach ScriptBlox. Check your connection and try again."), Cache: false);
		}
	}
}
