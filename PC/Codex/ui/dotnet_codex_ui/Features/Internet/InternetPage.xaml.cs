using System;
using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel;
using System.Diagnostics;
using System.Threading;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Automation;
using System.Windows.Controls;
using System.Windows.Input;
using System.Windows.Markup;
using System.Windows.Threading;
using dotnet_codex_ui.Infrastructure.Logging;

namespace dotnet_codex_ui.Features.Internet;

public partial class InternetPage : UserControl, IComponentConnector, IStyleConnector
{
	private const double LoadMoreDistance = 300.0;

	private const int MaxAutoFill = 3;

	private static readonly TimeSpan TypingDelay = TimeSpan.FromMilliseconds(350L);

	private static readonly int[] SkeletonSlots = new int[6] { 0, 1, 2, 3, 4, 5 };

	private readonly DispatcherTimer Typing = new DispatcherTimer
	{
		Interval = TypingDelay
	};

	private readonly ScriptPager Pager = new ScriptPager();

	private readonly ObservableCollection<ScriptResult> Items = new ObservableCollection<ScriptResult>();

	private IScriptProvider ProviderField = ScriptProviders.Default;

	private CancellationTokenSource? Search;

	private string QueryText = string.Empty;

	private int AutoFills;

	public InternetPage()
	{
		InitializeComponent();
		Cards.ItemsSource = Items;
		Skeletons.ItemsSource = SkeletonSlots;
		foreach (IScriptProvider item in ScriptProviders.All)
		{
			RadioButton radioButton = new RadioButton
			{
				Style = (Style)FindResource("ProviderCard"),
				GroupName = "Provider",
				Content = item,
				Tag = ((item == ScriptProviders.Default) ? "featured" : null),
				IsChecked = (item == ProviderField)
			};
			if (item is RobloxScriptsProvider)
			{
				radioButton.IsEnabled = false;
				radioButton.Opacity = 0.4;
			}
			AutomationProperties.SetName(radioButton, item.DisplayName);
			radioButton.Checked += ProviderCard_Checked;
			ProviderPanel.Children.Add(radioButton);
		}
		Typing.Tick += (object? _, EventArgs _) =>
		{
			Typing.Stop();
			SearchAsync();
		};
		IsVisibleChanged += (object _, DependencyPropertyChangedEventArgs E) =>
		{
			object newValue = E.NewValue;
			if (newValue is bool && !(bool)newValue)
			{
				Detail.Close();
			}
		};
		Unloaded += (object _, RoutedEventArgs _) =>
		{
			Typing.Stop();
			Detail.Close();
			Search?.Cancel();
		};
		Loaded += (object _, RoutedEventArgs _) =>
		{
			CancellationTokenSource search = Search;
			if (search != null && search.IsCancellationRequested)
			{
				SearchAsync();
			}
		};
		if (!DesignerProperties.GetIsInDesignMode(this))
		{
			SearchAsync();
		}
	}

	private void ProviderCard_Checked(object Sender, RoutedEventArgs E)
	{
		if (((RadioButton)Sender).Content is IScriptProvider scriptProvider && scriptProvider != ProviderField)
		{
			ProviderField = scriptProvider;
			SearchAsync();
		}
	}

	private void Card_MouseLeftButtonUp(object Sender, MouseButtonEventArgs E)
	{
		OpenDetail(Sender);
	}

	private void Card_KeyDown(object Sender, KeyEventArgs E)
	{
		Key key = E.Key;
		if ((key == Key.Enter || key == Key.Space) ? true : false)
		{
			E.Handled = true;
			OpenDetail(Sender);
		}
	}

	private void OpenDetail(object Sender)
	{
		if (Sender is FrameworkElement { DataContext: ScriptResult dataContext } frameworkElement)
		{
			Detail.Open(dataContext, frameworkElement);
		}
	}

	private void SearchBox_TextChanged(object Sender, TextChangedEventArgs E)
	{
		Typing.Stop();
		Typing.Start();
	}

	private void Retry_Click(object Sender, RoutedEventArgs E)
	{
		SearchAsync();
	}

	private void RetryMore_Click(object Sender, RoutedEventArgs E)
	{
		Pager.Retry();
		AutoFills = 0;
		LoadNextAsync();
	}

	private void ResultsScroll_ScrollChanged(object Sender, ScrollChangedEventArgs E)
	{
		if (E.VerticalChange != 0.0 || E.ExtentHeightChange != 0.0 || E.ViewportHeightChange != 0.0)
		{
			if (E.VerticalChange != 0.0)
			{
				AutoFills = 0;
			}
			if (NearEnd())
			{
				LoadNextAsync();
			}
		}
	}

	private bool NearEnd()
	{
		if (IsVisible)
		{
			return ResultsScroll.ExtentHeight - ResultsScroll.VerticalOffset - ResultsScroll.ViewportHeight <= 300.0;
		}
		return false;
	}

	private async Task SearchAsync()
	{
		Search?.Cancel();
		Search = new CancellationTokenSource();
		Pager.Reset();
		Items.Clear();
		AutoFills = 0;
		QueryText = ScriptBloxProvider.NormalizeQuery(SearchBox.Text);
		Attribution.Visibility = ((!(ProviderField is ScriptBloxProvider)) ? Visibility.Collapsed : Visibility.Visible);
		StatePanel.Visibility = Visibility.Collapsed;
		ResultsScroll.Visibility = Visibility.Visible;
		ResultsScroll.ScrollToTop();
		FooterError.Visibility = Visibility.Collapsed;
		Skeletons.Visibility = Visibility.Visible;
		await LoadNextAsync();
	}

	private async Task LoadNextAsync()
	{
		if (!Pager.TryBegin(out var Page, out var Gen))
		{
			return;
		}
		CancellationToken Token = Search.Token;
		IScriptProvider Provider = ProviderField;
		if (Items.Count > 0)
		{
			FooterError.Visibility = Visibility.Collapsed;
			Skeletons.Visibility = Visibility.Visible;
		}
		ProviderResult providerResult;
		try
		{
			providerResult = await Provider.SearchAsync(new ScriptQuery(QueryText, Page), Token);
		}
		catch (OperationCanceledException)
		{
			Pager.Abandon(Gen);
			return;
		}
		catch (Exception failure)
		{
			AppLog.Error(failure, null, "LoadNextAsync", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Features\\Internet\\InternetPage.xaml.cs");
			providerResult = ProviderResult.Failed("Something went wrong while searching.");
		}
		if (Token.IsCancellationRequested || Gen != Pager.Generation)
		{
			return;
		}
		IReadOnlyList<ScriptResult> readOnlyList = Pager.Complete(Gen, Page, providerResult);
		Skeletons.Visibility = Visibility.Collapsed;
		foreach (var (num, value) in Pager.Replaced)
		{
			if (num < Items.Count)
			{
				Items[num] = value;
			}
		}
		foreach (ScriptResult item in readOnlyList)
		{
			Items.Add(item);
		}
		if (Items.Count > 0)
		{
			ResultsScroll.Visibility = Visibility.Visible;
			StatePanel.Visibility = Visibility.Collapsed;
			FooterError.Visibility = ((!Pager.Failed) ? Visibility.Collapsed : Visibility.Visible);
			await FillViewportAsync();
			return;
		}
		switch (providerResult.Kind)
		{
		case ProviderResultKind.Results:
		case ProviderResultKind.Empty:
			ShowState("No Results Found", "Try a different search.", Retry: false);
			break;
		case ProviderResultKind.NotConfigured:
			ShowState(Provider.DisplayName + " Isn't Connected Yet", providerResult.Message ?? "This provider's API hasn't been added to Codex yet.", Retry: false);
			break;
		default:
			ShowState("Couldn't Load Scripts", providerResult.Message ?? "Something went wrong. Try again.", Retry: true);
			break;
		}
	}

	private async Task FillViewportAsync()
	{
		await Dispatcher.InvokeAsync(() =>
		{
		}, DispatcherPriority.Loaded);
		if (AutoFills < 3 && Pager.HasMore && NearEnd())
		{
			AutoFills++;
			await LoadNextAsync();
		}
	}

	private void ShowState(string Title, string Message, bool Retry)
	{
		Items.Clear();
		Skeletons.Visibility = Visibility.Collapsed;
		FooterError.Visibility = Visibility.Collapsed;
		ResultsScroll.Visibility = Visibility.Collapsed;
		StatePanel.Visibility = Visibility.Visible;
		StateView.Title = Title;
		StateView.Message = Message;
		RetryButton.Visibility = ((!Retry) ? Visibility.Collapsed : Visibility.Visible);
	}

}
