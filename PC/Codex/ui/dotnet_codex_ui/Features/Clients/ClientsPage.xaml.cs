using System;
using System.CodeDom.Compiler;
using System.ComponentModel;
using System.Diagnostics;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Controls.Primitives;
using System.Windows.Data;
using System.Windows.Input;
using System.Windows.Markup;
using System.Windows.Media;
using System.Windows.Media.Media3D;
using dotnet_codex_ui.Features.Connections;
using dotnet_codex_ui.Infrastructure.Logging;
using dotnet_codex_ui.Services;

namespace dotnet_codex_ui.Features.Clients;

public partial class ClientsPage : UserControl, IComponentConnector, IStyleConnector
{
	public ClientsPage()
	{
		InitializeComponent();
		ListCollectionView listCollectionView = new ListCollectionView(ClientService.Clients)
		{
			IsLiveSorting = true
		};
		listCollectionView.LiveSortingProperties.Add("IsConnected");
		listCollectionView.SortDescriptions.Add(new SortDescription("IsConnected", ListSortDirection.Ascending));
		listCollectionView.SortDescriptions.Add(new SortDescription("PlayerName", ListSortDirection.Ascending));
		Clients.ItemsSource = listCollectionView;
		ClientService.ProviderChanged += ShowProviderState;
		Unloaded += (object _, RoutedEventArgs _) =>
		{
			ClientService.ProviderChanged -= ShowProviderState;
		};
		Loaded += (object _, RoutedEventArgs _) =>
		{
			ClientService.ProviderChanged -= ShowProviderState;
			ClientService.ProviderChanged += ShowProviderState;
			ShowProviderState();
		};
		ShowProviderState();
	}

	private void ShowProviderState()
	{
		switch (ClientService.ProviderState)
		{
		case ConnectionProviderState.Starting:
			StateView.Title = "Starting…";
			StateView.Message = "Starting the connection server.";
			RetryButton.Visibility = Visibility.Collapsed;
			break;
		case ConnectionProviderState.Running:
			StateView.Title = "No Connected Clients";
			StateView.Message = $"Open Roblox and join a game, or wait for games to connect on 127.0.0.1:{ClientService.ProviderPort}.";
			RetryButton.Visibility = Visibility.Collapsed;
			break;
		case ConnectionProviderState.Failed:
			StateView.Title = "Connection Server Unavailable";
			StateView.Message = ClientService.ProviderMessage ?? "The connection server could not start.";
			RetryButton.Visibility = Visibility.Visible;
			break;
		default:
			StateView.Title = "Connection Server Off";
			StateView.Message = ClientService.ProviderMessage ?? "Turn it on under Settings, Connections.";
			RetryButton.Visibility = Visibility.Collapsed;
			break;
		}
	}

	private void Retry_Click(object Sender, RoutedEventArgs E)
	{
		ConnectionManager.RestartAsync();
	}

	private void Card_MouseLeftButtonDown(object Sender, MouseButtonEventArgs E)
	{
		if (!(Sender is FrameworkElement { DataContext: ClientEntry dataContext } frameworkElement))
		{
			return;
		}
		DependencyObject dependencyObject = E.OriginalSource as DependencyObject;
		while (dependencyObject != null && dependencyObject != frameworkElement)
		{
			if (dependencyObject is ButtonBase)
			{
				return;
			}
			bool flag = ((dependencyObject is Visual || dependencyObject is Visual3D) ? true : false);
			dependencyObject = (flag ? VisualTreeHelper.GetParent(dependencyObject) : LogicalTreeHelper.GetParent(dependencyObject));
		}
		if (dependencyObject != null)
		{
			dataContext.IsSelected = !dataContext.IsSelected;
			E.Handled = true;
		}
	}

	private async void Inject_Click(object Sender, RoutedEventArgs E)
	{
		object dataContext = ((FrameworkElement)Sender).DataContext;
		if (!(dataContext is ClientEntry { CanInject: not false } Entry))
		{
			return;
		}
		ToastHandle Toast = ToastService.ShowLoading("Injecting...", "Connecting " + Entry.PlayerName + ".");
		try
		{
			await ClientService.InjectAsync(Entry);
			if (Entry.IsConnected)
			{
				Toast.Update(ToastType.Success, "Injected", Entry.PlayerName + " is connected.");
			}
			else
			{
				Toast.Dismiss();
			}
		}
		catch (Exception ex)
		{
			AppLog.Error(ex, null, "Inject_Click", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Features\\Clients\\ClientsPage.xaml.cs");
			Toast.Update(ToastType.Error, "Injection failed", ex.Message, null, ex);
		}
	}

	private void Kick_Click(object Sender, RoutedEventArgs E)
	{
		if (((FrameworkElement)Sender).DataContext is ClientEntry clientEntry)
		{
			clientEntry.IsConfirmOpen = true;
		}
	}

	private void CancelKick_Click(object Sender, RoutedEventArgs E)
	{
		if (((FrameworkElement)Sender).DataContext is ClientEntry clientEntry)
		{
			clientEntry.IsConfirmOpen = false;
		}
	}

	private async void ConfirmKick_Click(object Sender, RoutedEventArgs E)
	{
		if (!(((FrameworkElement)Sender).DataContext is ClientEntry clientEntry))
		{
			return;
		}
		clientEntry.IsConfirmOpen = false;
		try
		{
			await ClientService.DisconnectAsync(clientEntry);
		}
		catch (Exception ex)
		{
			AppLog.Error(ex, null, "ConfirmKick_Click", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Features\\Clients\\ClientsPage.xaml.cs");
			ToastService.ShowError("Disconnect Failed", ex.Message, null, ex);
		}
	}

}
