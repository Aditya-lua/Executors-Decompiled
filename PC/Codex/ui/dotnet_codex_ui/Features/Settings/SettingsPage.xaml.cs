using System;
using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.Diagnostics;
using System.Globalization;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Automation;
using System.Windows.Controls;
using System.Windows.Input;
using System.Windows.Markup;
using System.Windows.Media;
using Tether;
using dotnet_codex_ui.Configuration;
using dotnet_codex_ui.Controls;
using dotnet_codex_ui.Controls.Settings;
using dotnet_codex_ui.Core.Versioning;
using dotnet_codex_ui.Features.Auth;
using dotnet_codex_ui.Features.Clients;
using dotnet_codex_ui.Features.Connections;
using dotnet_codex_ui.Features.Editor;
using dotnet_codex_ui.Infrastructure.Logging;
using dotnet_codex_ui.Services;

namespace dotnet_codex_ui.Features.Settings;

public partial class SettingsPage : UserControl, IComponentConnector
{
	private bool Syncing;

	private static readonly Dictionary<string, (Func<bool> Get, Func<bool, bool> Set)> Bools = new Dictionary<string, (Func<bool>, Func<bool, bool>)>
	{
		["AlwaysOnTop"] = (() => RegistryConfiguration.AlwaysOnTop, RegistryConfiguration.SetAlwaysOnTop),
		["ShowNavigationTooltips"] = (() => RegistryConfiguration.ShowNavigationTooltips, RegistryConfiguration.SetShowNavigationTooltips),
		["InlayHints"] = (() => RegistryConfiguration.InlayHints, RegistryConfiguration.SetInlayHints),
		["AutoSaveTabs"] = (() => RegistryConfiguration.AutoSaveTabs, RegistryConfiguration.SetAutoSaveTabs),
		["ContinueWhereYouLeftOff"] = (() => RegistryConfiguration.ContinueWhereYouLeftOff, RegistryConfiguration.SetContinueWhereYouLeftOff),
		["FpsBoost"] = (() => RegistryConfiguration.FpsBoost, RegistryConfiguration.SetFpsBoost),
		["AutoInject"] = (() => RegistryConfiguration.AutoInject, RegistryConfiguration.SetAutoInject),
		["AutoSelectInjected"] = (() => RegistryConfiguration.AutoSelectInjected, RegistryConfiguration.SetAutoSelectInjected),
		["RakNet"] = (() => RegistryConfiguration.RakNet, RegistryConfiguration.SetRakNet),
		["Prereplicated"] = (() => RegistryConfiguration.Prereplicated, RegistryConfiguration.SetPrereplicated),
		["TetherEnabled"] = (() => RegistryConfiguration.TetherEnabled, RegistryConfiguration.SetTetherEnabled),
		["TetherDiagnostics"] = (() => RegistryConfiguration.TetherDiagnostics, (bool Value) =>
		{
			TetherConnectionProvider.SetDiagnostics(Value);
			return RegistryConfiguration.SetTetherDiagnostics(Value);
		}),
		["TetherRequireEncryption"] = (() => RegistryConfiguration.TetherRequireEncryption, RegistryConfiguration.SetTetherRequireEncryption)
	};

	private IEnumerable<CheckBox> BoolToggles => new _003C_003Ez__ReadOnlyArray<CheckBox>(new CheckBox[13]
	{
		AlwaysOnTopToggle, NavTooltipsToggle, InlayHintsToggle, AutoSaveToggle, ContinueToggle, FpsBoostToggle, AutoInjectToggle, AutoSelectInjectedToggle, RakNetToggle, PrereplicatedToggle,
		TetherEnabledToggle, TetherDiagnosticsToggle, TetherRequireEncryptionToggle
	});

	public SettingsPage()
	{
		InitializeComponent();
		if (AuthModePolicy.DevModesAllowed)
		{
			DevCard.Child = new DevAuthPanel();
			DevSection.Visibility = Visibility.Visible;
		}
		MemorySlider.Maximum = SettingLimits.MemoryMaxMb;
		EditorFontSlider.Committed += EditorFont_Committed;
		FpsSlider.Committed += Fps_Committed;
		CpuSlider.Committed += Cpu_Committed;
		MemorySlider.Committed += Memory_Committed;
		BuildSwatches();
		LoadValues();
		Loaded += (object _, RoutedEventArgs _) =>
		{
			AccentTheme.Changed += SyncAccent;
			ClientService.ProviderChanged += ShowTetherStatus;
			ClientService.ProviderChanged += ShowTetherKeys;
			ShowTetherStatus();
			VersionService.Changed += ShowVersions;
			SyncAccent();
			ShowVersions();
		};
		Unloaded += (object _, RoutedEventArgs _) =>
		{
			AccentTheme.Changed -= SyncAccent;
			ClientService.ProviderChanged -= ShowTetherStatus;
			ClientService.ProviderChanged -= ShowTetherKeys;
			TetherShowAccessKeyToggle.IsChecked = false;
			TetherShowEncryptionKeyToggle.IsChecked = false;
			VersionService.Changed -= ShowVersions;
		};
		IsVisibleChanged += async (object _, DependencyPropertyChangedEventArgs _) =>
		{
			if (IsVisible)
			{
				await RefreshAsync();
			}
		};
	}

	private void BuildSwatches()
	{
		foreach (AccentOption item in AccentTheme.Palette)
		{
			RadioButton radioButton = new RadioButton
			{
				Style = (Style)FindResource("AccentSwatch"),
				Background = new SolidColorBrush(item.Accent),
				GroupName = "AccentColor",
				Tag = item.Id,
				ToolTip = item.Name,
				IsChecked = (item.Id == AccentTheme.Current.Id)
			};
			AutomationProperties.SetName(radioButton, item.Name + " accent color");
			radioButton.Checked += AccentSwatch_Checked;
			AccentPanel.Children.Add(radioButton);
		}
	}

	private void AccentSwatch_Checked(object Sender, RoutedEventArgs E)
	{
		if (!Syncing && ((RadioButton)Sender).Tag is string text)
		{
			AccentTheme.Apply(text);
			if (!RegistryConfiguration.SetAccent(text))
			{
				ToastService.ShowWarning("Accent Not Saved", "The accent was applied but couldn't be stored, so it won't persist after a restart.");
			}
		}
	}

	private void ResetAccent_Click(object Sender, RoutedEventArgs E)
	{
		AccentTheme.Apply("coral");
		RegistryConfiguration.SetAccent("coral");
	}

	private void SyncAccent()
	{
		Syncing = true;
		try
		{
			foreach (RadioButton child in AccentPanel.Children)
			{
				child.IsChecked = (string)child.Tag == AccentTheme.Current.Id;
			}
		}
		finally
		{
			Syncing = false;
		}
	}

	private void SetToggle(CheckBox Toggle, bool Value)
	{
		Syncing = true;
		try
		{
			Toggle.IsChecked = Value;
		}
		finally
		{
			Syncing = false;
		}
	}

	private void LoadValues()
	{
		SetToggle(ConfirmToggle, RegistryConfiguration.ConfirmBeforeClosing);
		SetToggle(RandomTitleToggle, RegistryConfiguration.RandomWindowTitle);
		foreach (CheckBox boolToggle in BoolToggles)
		{
			SetToggle(boolToggle, Bools[(string)boolToggle.Tag].Get());
		}
		LoadTetherValues();
		LoadAutoInjectDelay();
		Syncing = true;
		try
		{
			MinimapBox.SelectedIndex = Array.IndexOf(SettingLimits.MinimapModes, RegistryConfiguration.Minimap);
			EditorFontSlider.Value = RegistryConfiguration.EditorFontSize;
			int fpsLimit = RegistryConfiguration.FpsLimit;
			FpsSlider.Value = ((fpsLimit == 0) ? 60 : fpsLimit);
			FpsSlider.IsOff = fpsLimit == 0;
			CpuSlider.Value = RegistryConfiguration.CpuLimitPercent;
			int memoryLimitMb = RegistryConfiguration.MemoryLimitMb;
			MemorySlider.Value = ((memoryLimitMb == 0) ? Math.Clamp(4096, MemorySlider.Minimum, MemorySlider.Maximum) : memoryLimitMb);
			MemorySlider.IsOff = memoryLimitMb == 0;
		}
		finally
		{
			Syncing = false;
		}
	}

	internal async Task RefreshAsync()
	{
		try
		{
			await VersionService.RefreshAsync();
			ShowVersions();
		}
		catch (Exception failure)
		{
			AppLog.Error(failure, null, "RefreshAsync", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Features\\Settings\\SettingsPage.xaml.cs");
		}
	}

	private void ShowVersions()
	{
		VersionSnapshot snapshot = VersionService.Snapshot;
		CodexManifest codexManifest = snapshot?.Manifest;
		VersionState state = VersionService.State;
		bool flag = (uint)state <= 1u;
		string text = (flag ? "Checking…" : "Unavailable");
		BootstrapperVersionText.Text = codexManifest?.Bootstrapper ?? text;
		ModuleVersionText.Text = codexManifest?.Module ?? text;
		LoaderVersionText.Text = codexManifest?.Loader ?? text;
		RobloxVersionText.Text = snapshot?.Roblox ?? text;
		UiVersionText.Text = AppVersions.UI;
		ShowUiVersionIndicator(VersionService.Update);
		SettingsRow versionStatusRow = VersionStatusRow;
		state = VersionService.State;
		flag = (uint)(state - 3) <= 1u;
		versionStatusRow.Visibility = ((!flag) ? Visibility.Collapsed : Visibility.Visible);
		TextBlock versionStatusText = VersionStatusText;
		versionStatusText.Text = VersionService.State switch
		{
			VersionState.Stale => $"Showing older data, last updated {snapshot.FetchedAtUtc.ToLocalTime():t}. Couldn't reach the version servers.", 
			VersionState.Failed => "Couldn't reach the version servers.", 
			_ => "", 
		};
	}

	private void ShowUiVersionIndicator(UpdateResult Update)
	{
		var (text, resourceKey, text2) = Update.Status switch
		{
			UpdateStatus.UpdateAvailable => ("M6,2 L6,10 M2.5,6.5 L6,10 L9.5,6.5", "Toast.Warning", "Older than the published version (" + Update.Published + ")"), 
			UpdateStatus.LocalIsNewer => ("M6,10 L6,2 M2.5,5.5 L6,2 L9.5,5.5", "Toast.Info", "Newer than the published version (" + Update.Published + ")"), 
			UpdateStatus.UpToDate => ("M2,6.5 L5,9.5 L10,3", "Toast.Success", "Same as the published version (" + Update.Published + ")"), 
			_ => (null, "", ""), 
		};
		if (text == null)
		{
			UiVersionIcon.Visibility = Visibility.Collapsed;
			UiVersionIcon.ToolTip = null;
			return;
		}
		UiVersionIconPath.Data = Geometry.Parse(text);
		UiVersionIconPath.Stroke = (Brush)FindResource(resourceKey);
		UiVersionIcon.ToolTip = text2;
		AutomationProperties.SetName(UiVersionIcon, text2);
		UiVersionIcon.Visibility = Visibility.Visible;
	}

	private void Confirm_Changed(object Sender, RoutedEventArgs E)
	{
		if (!Syncing)
		{
			bool valueOrDefault = ConfirmToggle.IsChecked == true;
			if (!RegistryConfiguration.SetConfirmBeforeClosing(valueOrDefault))
			{
				SetToggle(ConfirmToggle, !valueOrDefault);
				ToastService.ShowError("Confirm Before Closing", "The setting couldn't be saved.");
			}
		}
	}

	private void Bool_Changed(object Sender, RoutedEventArgs E)
	{
		if (!Syncing && Sender is CheckBox { Tag: string tag, IsChecked: var isChecked } checkBox)
		{
			bool valueOrDefault = isChecked == true;
			if (!Bools[tag].Set(valueOrDefault))
			{
				SetToggle(checkBox, !valueOrDefault);
				ToastService.ShowError("Setting Not Saved", "The setting couldn't be stored.");
			}
		}
	}

	private void Minimap_SelectionChanged(object Sender, SelectionChangedEventArgs E)
	{
		if (!Syncing && MinimapBox.SelectedItem is ComboBoxItem { Content: string content } && !RegistryConfiguration.SetMinimap(content))
		{
			LoadValues();
			ToastService.ShowError("Setting Not Saved", "The minimap setting couldn't be stored.");
		}
	}

	private void LoadAutoInjectDelay()
	{
		AutoInjectDelayBox.Text = RegistryConfiguration.AutoInjectDelaySeconds.ToString(CultureInfo.InvariantCulture);
	}

	private void AutoInjectDelayBox_PreviewKeyDown(object Sender, KeyEventArgs E)
	{
		if (E.Key == Key.Enter)
		{
			E.Handled = true;
			CommitAutoInjectDelay();
		}
		else if (E.Key == Key.Escape)
		{
			E.Handled = true;
			LoadAutoInjectDelay();
			Keyboard.ClearFocus();
		}
	}

	private void AutoInjectDelayBox_LostKeyboardFocus(object Sender, KeyboardFocusChangedEventArgs E)
	{
		CommitAutoInjectDelay();
	}

	private void CommitAutoInjectDelay()
	{
		if (!int.TryParse(AutoInjectDelayBox.Text.Trim(), NumberStyles.None, CultureInfo.InvariantCulture, out var result) || result < 1 || result > 300 || (result != RegistryConfiguration.AutoInjectDelaySeconds && !RegistryConfiguration.SetAutoInjectDelaySeconds(result)))
		{
			ToastService.ShowWarning("Setting Not Saved", $"The auto inject delay must be a number from {1} to {300} (seconds).");
			LoadAutoInjectDelay();
		}
	}

	private void LoadTetherValues()
	{
		TetherPortBox.Text = RegistryConfiguration.TetherPort.ToString(CultureInfo.InvariantCulture);
		TetherHandshakeBox.Text = RegistryConfiguration.TetherHandshakeTimeoutMs.ToString(CultureInfo.InvariantCulture);
		SetToggle(TetherRequireEncryptionToggle, RegistryConfiguration.TetherRequireEncryption);
		TetherRequireEncryptionToggle.IsEnabled = RegistryConfiguration.TetherEncryption != EncryptionMode.Disabled;
		Syncing = true;
		try
		{
			ComboBox tetherEncryptionBox = TetherEncryptionBox;
			tetherEncryptionBox.SelectedIndex = RegistryConfiguration.TetherEncryption switch
			{
				EncryptionMode.Disabled => 0, 
				EncryptionMode.Shared => 1, 
				_ => 2, 
			};
		}
		finally
		{
			Syncing = false;
		}
	}

	private void ShowTetherStatus()
	{
		TextBlock tetherStatusText = TetherStatusText;
		tetherStatusText.Text = ClientService.ProviderState switch
		{
			ConnectionProviderState.Running => $"Running on 127.0.0.1:{ClientService.ProviderPort}", 
			ConnectionProviderState.Starting => "Starting…", 
			ConnectionProviderState.Failed => ClientService.ProviderMessage ?? "Not running", 
			_ => "Off", 
		};
	}

	private void TetherBox_PreviewKeyDown(object Sender, KeyEventArgs E)
	{
		if (E.Key == Key.Enter)
		{
			E.Handled = true;
			CommitTetherBox((TextBox)Sender);
		}
		else if (E.Key == Key.Escape)
		{
			E.Handled = true;
			LoadTetherValues();
			Keyboard.ClearFocus();
		}
	}

	private void TetherBox_LostKeyboardFocus(object Sender, KeyboardFocusChangedEventArgs E)
	{
		CommitTetherBox((TextBox)Sender);
	}

	private void CommitTetherBox(TextBox Box)
	{
		bool flag = (string)Box.Tag == "Port";
		int num = (flag ? 1024 : 500);
		int num2 = (flag ? 65535 : 30000);
		int num3 = (flag ? RegistryConfiguration.TetherPort : RegistryConfiguration.TetherHandshakeTimeoutMs);
		if (!int.TryParse(Box.Text.Trim(), NumberStyles.None, CultureInfo.InvariantCulture, out var result) || result < num || result > num2 || (result != num3 && !(flag ? RegistryConfiguration.SetTetherPort(result) : RegistryConfiguration.SetTetherHandshakeTimeoutMs(result))))
		{
			ToastService.ShowWarning("Setting Not Saved", flag ? $"The port must be a number from {num} to {num2}." : $"The handshake timeout must be a number from {num} to {num2} (milliseconds).");
			LoadTetherValues();
		}
	}

	private void TetherEncryption_SelectionChanged(object Sender, SelectionChangedEventArgs E)
	{
		if (!Syncing && TetherEncryptionBox.SelectedItem is ComboBoxItem { Tag: string tag })
		{
			EncryptionMode encryptionMode = ((tag == "Shared") ? EncryptionMode.Shared : ((tag == "PerClient") ? EncryptionMode.PerClient : EncryptionMode.Disabled));
			EncryptionMode encryptionMode2 = encryptionMode;
			if (encryptionMode2 != RegistryConfiguration.TetherEncryption && !RegistryConfiguration.SetTetherEncryption(encryptionMode2))
			{
				ToastService.ShowError("Setting Not Saved", "The encryption setting couldn't be stored.");
			}
			LoadTetherValues();
			ShowTetherKeys();
		}
	}

	private void TetherShowKeys_Changed(object Sender, RoutedEventArgs E)
	{
		ShowTetherKeys();
	}

	private void ShowTetherKeys()
	{
		bool valueOrDefault = TetherShowAccessKeyToggle.IsChecked == true;
		TetherAccessKeyBox.Visibility = ((!valueOrDefault) ? Visibility.Collapsed : Visibility.Visible);
		TetherAccessKeyBox.Text = (valueOrDefault ? TetherAccessKey.Display(TetherAccessKey.GetOrCreate()) : string.Empty);
		bool valueOrDefault2 = TetherShowEncryptionKeyToggle.IsChecked == true;
		TetherEncryptionKeyBox.Visibility = ((!valueOrDefault2) ? Visibility.Collapsed : Visibility.Visible);
		TextBox tetherEncryptionKeyBox = TetherEncryptionKeyBox;
		string text;
		if (!valueOrDefault2)
		{
			text = string.Empty;
		}
		else
		{
			string text2;
			switch (RegistryConfiguration.TetherEncryption)
			{
			case EncryptionMode.Disabled:
				text2 = "Encryption is off.";
				break;
			case EncryptionMode.PerClient:
				text2 = "Per game: every connection has its own key, which is never stored.";
				break;
			default:
			{
				byte[] providerEncryptionKey = ClientService.ProviderEncryptionKey;
				text2 = ((providerEncryptionKey != null) ? TetherAccessKey.Display(providerEncryptionKey) : "The server is not running.");
				break;
			}
			}
			text = text2;
		}
		tetherEncryptionKeyBox.Text = text;
	}

	private void TetherCopyKey_Click(object Sender, RoutedEventArgs E)
	{
		try
		{
			Clipboard.SetText(TetherAccessKey.Display(TetherAccessKey.GetOrCreate()));
			ToastService.ShowSuccess("Access Key Copied", "Paste it into the game's connection settings.");
		}
		catch (Exception failure)
		{
			AppLog.Error(failure, null, "TetherCopyKey_Click", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Features\\Settings\\SettingsPage.xaml.cs");
			ToastService.ShowError("Couldn't Copy", "The clipboard is in use by another program.");
		}
	}

	private async void TetherRegenerateKey_Click(object Sender, RoutedEventArgs E)
	{
		ConfirmDialog dialog = AccountActions.Dialog;
		bool flag = dialog == null;
		if (!flag)
		{
			flag = !(await dialog.ShowAsync("Regenerate Access Key?", "A new key is created and every connected game is disconnected. Games must be given the new key before they can connect again.", "Icon.Alert", "Regenerate", Danger: true));
		}
		if (!flag)
		{
			TetherAccessKey.Regenerate();
			await ConnectionManager.RestartAsync();
			ToastService.ShowSuccess("New Access Key", "Copy the new key into the games.");
		}
	}

	private void EditorFont_Committed(SliderSetting Slider)
	{
		StoreLimit(RegistryConfiguration.SetEditorFontSize(Slider.Value), "Editor Font Size");
	}

	private void Fps_Committed(SliderSetting Slider)
	{
		StoreLimit(RegistryConfiguration.SetFpsLimit((!Slider.IsOff) ? Slider.Value : 0), "FPS Limit");
	}

	private void Cpu_Committed(SliderSetting Slider)
	{
		StoreLimit(RegistryConfiguration.SetCpuLimitPercent(Slider.Value), "CPU Limit");
	}

	private void Memory_Committed(SliderSetting Slider)
	{
		StoreLimit(RegistryConfiguration.SetMemoryLimitMb((!Slider.IsOff) ? Slider.Value : 0), "Memory Limit");
	}

	private void StoreLimit(bool Stored, string Name)
	{
		if (!Stored)
		{
			LoadValues();
			ToastService.ShowError("Setting Not Saved", Name + " couldn't be stored.");
		}
	}

	private void RandomTitle_Changed(object Sender, RoutedEventArgs E)
	{
		if (!Syncing)
		{
			bool valueOrDefault = RandomTitleToggle.IsChecked == true;
			if (!RegistryConfiguration.SetRandomWindowTitle(valueOrDefault))
			{
				SetToggle(RandomTitleToggle, !valueOrDefault);
				ToastService.ShowError("Random Window Title", "The setting couldn't be saved.");
			}
		}
	}

	private async void ResetSettings_Click(object Sender, RoutedEventArgs E)
	{
		ConfirmDialog dialog = AccountActions.Dialog;
		bool flag = dialog == null;
		if (!flag)
		{
			flag = !(await dialog.ShowAsync("Reset UI Settings?", "This restores Codex's own interface settings (accent, window, editor, limits and the saved tabs backup) to their defaults. Other components' settings and your sign-in are not affected.", "Icon.Trash", "Reset", Danger: true));
		}
		if (!flag)
		{
			bool Stored = RegistryConfiguration.ResetAll();
			TabStore.Delete();
			AccentTheme.Apply("coral");
			LoadValues();
			await RefreshAsync();
			if (Stored)
			{
				ToastService.ShowSuccess("UI Settings Reset", "Defaults restored.");
			}
			else
			{
				ToastService.ShowError("Reset Incomplete", "Some settings couldn't be cleared.");
			}
		}
	}

}
