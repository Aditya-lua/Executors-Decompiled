using System;
using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.Diagnostics;
using System.Globalization;
using System.Threading;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Input;
using System.Windows.Markup;
using System.Windows.Threading;
using dotnet_codex_ui.Controls;
using dotnet_codex_ui.Features.Clients;
using dotnet_codex_ui.Infrastructure.Logging;
using dotnet_codex_ui.Services;

namespace dotnet_codex_ui.Features.Internet;

public partial class ScriptDetailOverlay : UserControl, IComponentConnector
{
	private CancellationTokenSource? Load;

	private ScriptResult? Current;

	private ScriptDetail? Detail;

	private FrameworkElement? Origin;

	private int Generation;

	private bool OpenField;

	private bool Busy;

	internal IScriptDetailSource Details { get; set; } = ScriptBloxProvider.Shared;

	internal Func<string, string, bool>? OpenInTabHook { get; set; }

	internal Func<string, ExecuteResult>? ExecuteHook { get; set; }

	public bool IsOpen => OpenField;

	internal bool CanAct
	{
		get
		{
			if ((object)Detail != null)
			{
				return !Busy;
			}
			return false;
		}
	}

	public event EventHandler? OpenChanged;

	public ScriptDetailOverlay()
	{
		InitializeComponent();
		Scrim.SizeChanged += (object _, SizeChangedEventArgs E) =>
		{
			BodyScroll.MaxHeight = Math.Max(120.0, E.NewSize.Height - 48.0 - 36.0 - 76.0 - 16.0 - 32.0 - 16.0 - 16.0);
		};
		IsVisibleChanged += (object _, DependencyPropertyChangedEventArgs E) =>
		{
			object newValue = E.NewValue;
			if (newValue is bool && !(bool)newValue)
			{
				CancelLoad();
			}
		};
	}

	internal void Open(ScriptResult Item, FrameworkElement? From)
	{
		if (!OpenField || !(Current?.Id == Item.Id))
		{
			Current = Item;
			Origin = From;
			Detail = null;
			Busy = false;
			string text = (string.IsNullOrWhiteSpace(Item.Title) ? "Untitled script" : Item.Title);
			TitleText.Text = text;
			Letter.Text = Item.Initial;
			TextBlock subtitleText = SubtitleText;
			string gameName = Item.GameName;
			subtitleText.Text = ((gameName != null && gameName.Length > 0) ? (Item.GameName + " · ScriptBlox") : "ScriptBlox");
			Thumbnail.SetUrl(Picture, Item.ThumbnailUrl);
			ApplyPills(Item.Verified, Item.RequiresKey, Item.IsUniversal, Item.IsPatched);
			bool openField = OpenField;
			OpenField = true;
			OverlayMotion.Enabled = MotionPolicy.Enabled;
			OverlayMotion.Show(this, Scrim, Card);
			Dispatcher.BeginInvoke((Func<IInputElement>)(() => Keyboard.Focus(CloseButton)), DispatcherPriority.Loaded);
			AppLog.Information("Script detail opened for {Slug}", Item.Slug);
			if (!openField)
			{
				OpenChanged?.Invoke(this, EventArgs.Empty);
			}
			LoadAsync();
		}
	}

	internal void Close()
	{
		if (!OpenField)
		{
			return;
		}
		OpenField = false;
		CancelLoad();
		Busy = false;
		Detail = null;
		ExecuteButton.IsLoading = false;
		UpdateActions();
		AppLog.Information("Script detail closed for {Slug}", Current?.Slug);
		FrameworkElement Back = Origin;
		OverlayMotion.Hide(this, Scrim, Card);
		OpenChanged?.Invoke(this, EventArgs.Empty);
		if (Back != null && Back.IsVisible)
		{
			Dispatcher.BeginInvoke((Func<bool>)(() => Back.Focus()), DispatcherPriority.Loaded);
		}
	}

	private void CancelLoad()
	{
		Generation++;
		CancellationTokenSource load = Load;
		Load = null;
		if (load != null)
		{
			load.Cancel();
			load.Dispose();
		}
	}

	private async Task LoadAsync()
	{
		CancelLoad();
		CancellationTokenSource Source = (Load = new CancellationTokenSource());
		int Mine = Generation;
		ScriptResult current = Current;
		ShowLoading();
		try
		{
			string text = current?.Slug;
			if (text == null || !ScriptBloxApi.IsValidSlug(text))
			{
				throw new ScriptBloxException("This script can't be opened.");
			}
			ScriptDetail scriptDetail = await Details.GetDetailAsync(text, Source.Token);
			if (Mine == Generation && OpenField)
			{
				Detail = scriptDetail;
				ShowDetail(scriptDetail);
			}
		}
		catch (OperationCanceledException) when (Source.IsCancellationRequested)
		{
		}
		catch (ScriptBloxException ex2)
		{
			if (Mine == Generation && OpenField)
			{
				ShowError(ex2.Message);
			}
		}
		catch (Exception failure)
		{
			AppLog.Error(failure, null, "LoadAsync", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Features\\Internet\\ScriptDetailOverlay.xaml.cs");
			if (Mine == Generation && OpenField)
			{
				ShowError("Something went wrong while loading this script.");
			}
		}
	}

	private void ShowLoading()
	{
		Detail = null;
		LoadingPanel.Visibility = Visibility.Visible;
		ErrorPanel.Visibility = Visibility.Collapsed;
		DetailPanel.Visibility = Visibility.Collapsed;
		UpdateActions();
	}

	private void ShowError(string Message)
	{
		Detail = null;
		LoadingPanel.Visibility = Visibility.Collapsed;
		DetailPanel.Visibility = Visibility.Collapsed;
		ErrorPanel.Visibility = Visibility.Visible;
		ErrorText.Text = Message;
		UpdateActions();
	}

	private void ShowDetail(ScriptDetail D)
	{
		TitleText.Text = D.Title;
		TextBlock subtitleText = SubtitleText;
		string gameName = D.GameName;
		subtitleText.Text = ((gameName != null && gameName.Length > 0) ? (D.GameName + " · ScriptBlox") : "ScriptBlox");
		if (D.ThumbnailUrl != null && D.ThumbnailUrl != Thumbnail.GetUrl(Picture))
		{
			Thumbnail.SetUrl(Picture, D.ThumbnailUrl);
		}
		ApplyPills(D.Verified, D.RequiresKey, D.IsUniversal, D.IsPatched);
		AboutSection.Visibility = ((D.Features == null) ? Visibility.Collapsed : Visibility.Visible);
		FeaturesText.Text = D.Features ?? string.Empty;
		TagsList.ItemsSource = D.Tags;
		StackPanel tagsSection = TagsSection;
		IReadOnlyList<string> tags = D.Tags;
		tagsSection.Visibility = ((tags == null || tags.Count <= 0) ? Visibility.Collapsed : Visibility.Visible);
		Fill(OwnerText, (D.OwnerName == null) ? null : ("Posted by " + D.OwnerName + (D.OwnerVerified ? " (verified)" : string.Empty)));
		List<string> list = new List<string>();
		long? views = D.Views;
		if (views.HasValue)
		{
			long valueOrDefault = views.GetValueOrDefault();
			list.Add(ScriptResult.Compact(valueOrDefault) + " views");
		}
		views = D.Executes;
		if (views.HasValue)
		{
			long valueOrDefault2 = views.GetValueOrDefault();
			list.Add(ScriptResult.Compact(valueOrDefault2) + " executes");
		}
		views = D.Likes;
		if (views.HasValue)
		{
			long valueOrDefault3 = views.GetValueOrDefault();
			list.Add(ScriptResult.Compact(valueOrDefault3) + " likes");
		}
		views = D.Dislikes;
		if (views.HasValue)
		{
			long valueOrDefault4 = views.GetValueOrDefault();
			list.Add(ScriptResult.Compact(valueOrDefault4) + " dislikes");
		}
		Fill(StatsText, (list.Count == 0) ? null : string.Join(" · ", list));
		TextBlock createdText = CreatedText;
		DateTimeOffset? created = D.Created;
		Fill(createdText, (!created.HasValue) ? null : ("Posted " + created.GetValueOrDefault().ToLocalTime().ToString("d", CultureInfo.CurrentCulture)));
		Fill(KeyLinkText, (D.KeyLink == null) ? null : ("Key link: " + D.KeyLink));
		Fill(DiscordText, (D.Discord == null) ? null : ("Discord: " + D.Discord));
		LoadingPanel.Visibility = Visibility.Collapsed;
		ErrorPanel.Visibility = Visibility.Collapsed;
		DetailPanel.Visibility = Visibility.Visible;
		UpdateActions();
	}

	private static void Fill(TextBlock Target, string? Text)
	{
		Target.Text = Text ?? string.Empty;
		Target.Visibility = ((Text == null) ? Visibility.Collapsed : Visibility.Visible);
	}

	private void ApplyPills(bool? Verified, bool? Key, bool? Universal, bool? Patched)
	{
		VerifiedPill.Visibility = ((Verified != true) ? Visibility.Collapsed : Visibility.Visible);
		KeyPill.Visibility = ((Key != true) ? Visibility.Collapsed : Visibility.Visible);
		UniversalPill.Visibility = ((Universal != true) ? Visibility.Collapsed : Visibility.Visible);
		PatchedPill.Visibility = ((Patched != true) ? Visibility.Collapsed : Visibility.Visible);
	}

	private void UpdateActions()
	{
		bool isEnabled = (object)Detail != null && !Busy;
		ExecuteButton.IsEnabled = isEnabled;
		OpenButton.IsEnabled = isEnabled;
	}

	private async void Execute_Click(object Sender, RoutedEventArgs E)
	{
		if (Busy || (object)Detail == null)
		{
			return;
		}
		ScriptDetail Script = Detail;
		Busy = true;
		ExecuteButton.IsLoading = true;
		UpdateActions();
		try
		{
			Func<string, ExecuteResult> Hook = ExecuteHook ?? ScriptActions.Execute;
			if (Hook == null)
			{
				ToastService.ShowError("Execute Unavailable", "The script executor isn't ready yet.");
				return;
			}
			await Task.Yield();
			ExecuteResult executeResult = Hook(Script.Source);
			AppLog.Information("Script {Slug} execute result: {Type}", Script.Slug, executeResult.Type);
			if (executeResult.Type == ToastType.Success)
			{
				ToastService.ShowSuccess(executeResult.Title, executeResult.Message);
				Close();
			}
		}
		catch (Exception ex)
		{
			AppLog.Error(ex, null, "Execute_Click", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Features\\Internet\\ScriptDetailOverlay.xaml.cs");
			ToastService.ShowError("Execute Failed", ex.Message, null, ex);
		}
		finally
		{
			Busy = false;
			ExecuteButton.IsLoading = false;
			UpdateActions();
		}
	}

	private void OpenTab_Click(object Sender, RoutedEventArgs E)
	{
		if (Busy || (object)Detail == null)
		{
			return;
		}
		ScriptDetail detail = Detail;
		Busy = true;
		UpdateActions();
		try
		{
			Func<string, string, bool> func = OpenInTabHook ?? ScriptActions.OpenInTab;
			if (func != null && func(ScriptActions.TabTitle(detail.Title), detail.Source))
			{
				AppLog.Information("Script {Slug} opened in a new tab", detail.Slug);
				Close();
			}
			else
			{
				ToastService.ShowError("Couldn't Open Tab", "The editor isn't ready yet. Try again in a moment.");
			}
		}
		catch (Exception ex)
		{
			AppLog.Error(ex, null, "OpenTab_Click", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Features\\Internet\\ScriptDetailOverlay.xaml.cs");
			ToastService.ShowError("Couldn't Open Tab", ex.Message, null, ex);
		}
		finally
		{
			Busy = false;
			UpdateActions();
		}
	}

	private void Retry_Click(object Sender, RoutedEventArgs E)
	{
		AppLog.Information("Script detail retry for {Slug}", Current?.Slug);
		LoadAsync();
	}

	private void Close_Click(object Sender, RoutedEventArgs E)
	{
		Close();
	}

	private void Scrim_MouseLeftButtonDown(object Sender, MouseButtonEventArgs E)
	{
		if (E.OriginalSource == Scrim)
		{
			E.Handled = true;
			Close();
		}
	}

	protected override void OnPreviewKeyDown(KeyEventArgs E)
	{
		if (OpenField && E.Key == Key.Escape)
		{
			E.Handled = true;
			Close();
		}
		else
		{
			base.OnPreviewKeyDown(E);
		}
	}

}
