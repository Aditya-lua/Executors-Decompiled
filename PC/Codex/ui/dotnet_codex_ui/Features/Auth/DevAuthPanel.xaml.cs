using System;
using System.CodeDom.Compiler;
using System.Diagnostics;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Markup;
using dotnet_codex_ui.Controls;

namespace dotnet_codex_ui.Features.Auth;

public partial class DevAuthPanel : UserControl, IComponentConnector
{
	private bool Syncing;

	public DevAuthPanel()
	{
		InitializeComponent();
		if (!AuthModePolicy.DevModesAllowed)
		{
			Visibility = Visibility.Collapsed;
			return;
		}
		Loaded += (object _, RoutedEventArgs _) =>
		{
			AuthService.Changed += Sync;
			AuthService.ModeChanged += Sync;
			Sync();
		};
		Unloaded += (object _, RoutedEventArgs _) =>
		{
			AuthService.Changed -= Sync;
			AuthService.ModeChanged -= Sync;
		};
	}

	private void Sync()
	{
		Syncing = true;
		try
		{
			MockPill.IsChecked = AuthService.Mode == AuthMode.Mock;
			DisabledPill.IsChecked = AuthService.Mode == AuthMode.Disabled;
			RealPill.IsChecked = AuthService.Mode == AuthMode.Real;
		}
		finally
		{
			Syncing = false;
		}
		MockOptions mockOptions = AuthService.MockOptions;
		bool flag = AuthService.Mode == AuthMode.Mock;
		bool flag2 = AuthService.Mode != AuthMode.Real;
		LinkButton.Content = $"Link: {mockOptions.LinkScenario}";
		CompletionButton.Content = $"Completion: {mockOptions.CompletionScenario}";
		SubscriptionButton.Content = $"Subscription: {mockOptions.Subscription}";
		dotnet_codex_ui.Controls.Button linkButton = LinkButton;
		Visibility visibility = (CompletionButton.Visibility = ((!flag) ? Visibility.Collapsed : Visibility.Visible));
		linkButton.Visibility = visibility;
		SubscriptionButton.Visibility = ((!flag2) ? Visibility.Collapsed : Visibility.Visible);
		ScenarioRow.Visibility = ((!flag2) ? Visibility.Collapsed : Visibility.Visible);
		CompleteButton.Visibility = ((!flag || AuthService.State != AuthState.AwaitingLink) ? Visibility.Collapsed : Visibility.Visible);
		ExpireButton.Visibility = ((!flag || !AuthService.IsSignedIn) ? Visibility.Collapsed : Visibility.Visible);
		RefreshButton.Visibility = ((!flag2 || !AuthService.IsSignedIn) ? Visibility.Collapsed : Visibility.Visible);
		ActionRow.Visibility = ((CompleteButton.Visibility != Visibility.Visible && ExpireButton.Visibility != Visibility.Visible && RefreshButton.Visibility != Visibility.Visible) ? Visibility.Collapsed : Visibility.Visible);
	}

	private static T Next<T>(T Value) where T : struct, Enum
	{
		T[] values = Enum.GetValues<T>();
		return values[(Array.IndexOf(values, Value) + 1) % values.Length];
	}

	private async void Mode_Checked(object Sender, RoutedEventArgs E)
	{
		if (!Syncing)
		{
			await AuthService.SetModeAsync((Sender != MockPill) ? ((Sender == DisabledPill) ? AuthMode.Disabled : AuthMode.Real) : AuthMode.Mock);
		}
	}

	private void Link_Click(object Sender, RoutedEventArgs E)
	{
		AuthService.MockOptions.LinkScenario = Next(AuthService.MockOptions.LinkScenario);
		Sync();
	}

	private void Completion_Click(object Sender, RoutedEventArgs E)
	{
		AuthService.MockOptions.CompletionScenario = Next(AuthService.MockOptions.CompletionScenario);
		Sync();
	}

	private async void Subscription_Click(object Sender, RoutedEventArgs E)
	{
		AuthService.MockOptions.Subscription = Next(AuthService.MockOptions.Subscription);
		Sync();
		await AuthService.RefreshSubscriptionAsync();
	}

	private async void Complete_Click(object Sender, RoutedEventArgs E)
	{
		await AuthService.CompleteMockLoginAsync();
	}

	private async void Expire_Click(object Sender, RoutedEventArgs E)
	{
		await AuthService.ExpireMockSessionAsync();
	}

	private async void Refresh_Click(object Sender, RoutedEventArgs E)
	{
		await AuthService.RefreshSubscriptionAsync();
	}

}
