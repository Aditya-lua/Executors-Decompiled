using System;
using System.CodeDom.Compiler;
using System.ComponentModel;
using System.Diagnostics;
using System.IO;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Controls.Primitives;
using System.Windows.Markup;
using Microsoft.Win32;
using ScriptEditor.Models;
using ScriptEditor.Services;

namespace ScriptEditor.Controls;

public partial class SettingsView : UserControl, IComponentConnector
{
	private bool _seedingApiKey;

	private bool _claudeConnected;

	internal PasswordBox ApiKeyBox;

	internal PasswordBox AiKeyBox;

	internal TextBlock ClaudeAccountLine;

	internal TextBlock ClaudeAccountDetail;

	internal Button ClaudeConnectButton;

	private AppSettings? Settings => ((FrameworkElement)this).DataContext as AppSettings;

	public SettingsView()
	{
		InitializeComponent();
	}

	private void FontSizeDown_Click(object sender, RoutedEventArgs e)
	{
		AppSettings settings = Settings;
		if (settings != null)
		{
			settings.FontSize--;
		}
	}

	private void FontSizeUp_Click(object sender, RoutedEventArgs e)
	{
		AppSettings settings = Settings;
		if (settings != null)
		{
			settings.FontSize++;
		}
	}

	private void AutoInjectDelayDown_Click(object sender, RoutedEventArgs e)
	{
		AppSettings settings = Settings;
		if (settings != null)
		{
			settings.AutoInjectDelaySeconds--;
		}
	}

	private void AutoInjectDelayUp_Click(object sender, RoutedEventArgs e)
	{
		AppSettings settings = Settings;
		if (settings != null)
		{
			settings.AutoInjectDelaySeconds++;
		}
	}

	private void AutoSaveDelayDown_Click(object sender, RoutedEventArgs e)
	{
		AppSettings settings = Settings;
		if (settings != null)
		{
			settings.AutoSaveDelaySeconds--;
		}
	}

	private void AutoSaveDelayUp_Click(object sender, RoutedEventArgs e)
	{
		AppSettings settings = Settings;
		if (settings != null)
		{
			settings.AutoSaveDelaySeconds++;
		}
	}

	private void BrowseScriptsFolder_Click(object sender, RoutedEventArgs e)
	{
		//IL_000b: Unknown result type (might be due to invalid IL or missing references)
		//IL_0010: Unknown result type (might be due to invalid IL or missing references)
		//IL_001b: Unknown result type (might be due to invalid IL or missing references)
		//IL_0038: Expected Obj, but got Unknown
		AppSettings settings = Settings;
		if (settings != null)
		{
			OpenFolderDialog val = new OpenFolderDialog
			{
				Title = "Choose scripts folder",
				InitialDirectory = (Directory.Exists(settings.ScriptsFolder) ? settings.ScriptsFolder : null)
			};
			if (((CommonDialog)val).ShowDialog(Window.GetWindow((DependencyObject)(object)this)) == true)
			{
				settings.ScriptsFolder = val.FolderName;
			}
		}
	}

	private void ResetScriptsFolder_Click(object sender, RoutedEventArgs e)
	{
		AppSettings settings = Settings;
		if (settings != null)
		{
			settings.ScriptsFolder = AppSettings.DefaultScriptsFolder;
		}
	}

	private void OpenScriptsFolder_Click(object sender, RoutedEventArgs e)
	{
		AppSettings settings = Settings;
		if (settings != null)
		{
			Reveal(settings.ScriptsFolder, createIfMissing: true);
		}
	}

	private void OpenSettingsFolder_Click(object sender, RoutedEventArgs e)
	{
		AppSettings settings = Settings;
		if (settings != null)
		{
			string directoryName = Path.GetDirectoryName(settings.SettingsFilePath);
			if (directoryName != null)
			{
				Reveal(directoryName, createIfMissing: true);
			}
		}
	}

	private void ResetDefaults_Click(object sender, RoutedEventArgs e)
	{
		Settings?.ResetToDefaults();
	}

	private void ApiKeyBox_PasswordChanged(object sender, RoutedEventArgs e)
	{
		if (!_seedingApiKey)
		{
			AppSettings settings = Settings;
			if (settings != null)
			{
				settings.ScriptHubApiKey = ApiKeyBox.Password;
			}
		}
	}

	private void OpenApiDashboard_Click(object sender, RoutedEventArgs e)
	{
		//IL_0061: Unknown result type (might be due to invalid IL or missing references)
		try
		{
			Process.Start(new ProcessStartInfo("https://rscripts.net/dashboard/api")
			{
				UseShellExecute = true
			});
		}
		catch (Exception ex) when ((ex is Win32Exception || ex is InvalidOperationException) ? true : false)
		{
			MessageBox.Show(Window.GetWindow((DependencyObject)(object)this), "Could not open the browser:\n" + ex.Message, "Velocity", (MessageBoxButton)0, (MessageBoxImage)48);
		}
	}

	private void ClearApiKey_Click(object sender, RoutedEventArgs e)
	{
		AppSettings settings = Settings;
		if (settings != null)
		{
			settings.ScriptHubApiKey = string.Empty;
			SeedApiKeyBox();
		}
	}

	public void SeedApiKeyBox()
	{
		AppSettings settings = Settings;
		if (settings == null)
		{
			return;
		}
		_seedingApiKey = true;
		try
		{
			ApiKeyBox.Password = settings.ScriptHubApiKey;
			AiKeyBox.Password = settings.AiApiKey;
		}
		finally
		{
			_seedingApiKey = false;
		}
	}

	private void AiKeyBox_PasswordChanged(object sender, RoutedEventArgs e)
	{
		if (!_seedingApiKey)
		{
			AppSettings settings = Settings;
			if (settings != null)
			{
				settings.AiApiKey = AiKeyBox.Password;
			}
		}
	}

	private void ClearAiKey_Click(object sender, RoutedEventArgs e)
	{
		AppSettings settings = Settings;
		if (settings != null)
		{
			settings.AiApiKey = string.Empty;
			SeedApiKeyBox();
		}
	}

	private void ClaudeConnect_Click(object sender, RoutedEventArgs e)
	{
		if (Window.GetWindow((DependencyObject)(object)this) is MainWindow mainWindow)
		{
			if (_claudeConnected)
			{
				DisconnectClaudeAsync(mainWindow);
			}
			else if (mainWindow.Claude.Connect())
			{
				PollClaudeAccountAsync(mainWindow);
			}
		}
	}

	private async Task DisconnectClaudeAsync(MainWindow main)
	{
		await main.Claude.DisconnectAsync();
		await RefreshClaudeAccountAsync();
	}

	private async Task PollClaudeAccountAsync(MainWindow main)
	{
		for (int attempt = 0; attempt < 60; attempt++)
		{
			await Task.Delay(2000);
			if ((await main.Claude.GetAccountAsync()).LoggedIn)
			{
				await RefreshClaudeAccountAsync();
				break;
			}
		}
	}

	private async void ClaudeRefreshAccount_Click(object sender, RoutedEventArgs e)
	{
		await RefreshClaudeAccountAsync();
	}

	public async Task RefreshClaudeAccountAsync()
	{
		if (!(Window.GetWindow((DependencyObject)(object)this) is MainWindow mainWindow))
		{
			return;
		}
		if (!ClaudeService.IsAvailable)
		{
			_claudeConnected = false;
			ClaudeAccountLine.Text = "Claude Code is not installed";
			ClaudeAccountDetail.Text = "The panel needs the Claude Code CLI on this machine. Install it, then Refresh.";
			((UIElement)ClaudeConnectButton).IsEnabled = false;
			return;
		}
		((UIElement)ClaudeConnectButton).IsEnabled = true;
		ClaudeService.Account account = await mainWindow.Claude.GetAccountAsync();
		_claudeConnected = account.LoggedIn;
		if (!account.LoggedIn)
		{
			ClaudeAccountLine.Text = "Not connected";
			ClaudeAccountDetail.Text = "Connect to sign in with your Anthropic account.";
			((ContentControl)ClaudeConnectButton).Content = "Connect";
		}
		else
		{
			ClaudeAccountLine.Text = account.Email ?? "Connected";
			string plan = account.Plan;
			string text = ((plan != null && plan.Length > 0) ? (char.ToUpperInvariant(plan[0]) + plan.Substring(1)) : "Connected");
			ClaudeAccountDetail.Text = ((account.Method == "claude.ai") ? (text + " subscription — no API key, nothing billed per message.") : (text + " — signed in via " + account.Method + "."));
			((ContentControl)ClaudeConnectButton).Content = "Disconnect";
		}
	}

	private async void CopilotSignIn_Click(object sender, RoutedEventArgs e)
	{
		if (Window.GetWindow((DependencyObject)(object)this) is MainWindow mainWindow)
		{
			await mainWindow.SignInToCopilotAsync();
		}
	}

	private async void CopilotSignOut_Click(object sender, RoutedEventArgs e)
	{
		if (Window.GetWindow((DependencyObject)(object)this) is MainWindow mainWindow)
		{
			await mainWindow.Copilot.SignOutAsync();
		}
	}

	private void AiDebounceDown_Click(object sender, RoutedEventArgs e)
	{
		AppSettings settings = Settings;
		if (settings != null)
		{
			settings.AiDebounceMs -= 50;
		}
	}

	private void AiDebounceUp_Click(object sender, RoutedEventArgs e)
	{
		AppSettings settings = Settings;
		if (settings != null)
		{
			settings.AiDebounceMs += 50;
		}
	}

	private void Reveal(string path, bool createIfMissing)
	{
		//IL_006f: Unknown result type (might be due to invalid IL or missing references)
		try
		{
			if (createIfMissing)
			{
				Directory.CreateDirectory(path);
			}
			Process.Start(new ProcessStartInfo(path)
			{
				UseShellExecute = true
			});
		}
		catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException || ex is Win32Exception) ? true : false)
		{
			MessageBox.Show(Window.GetWindow((DependencyObject)(object)this), "Could not open the folder:\n" + ex.Message, "Velocity", (MessageBoxButton)0, (MessageBoxImage)48);
		}
	}

	[DebuggerNonUserCode]
	[GeneratedCode("PresentationBuildTasks", "10.0.12.0")]
	[EditorBrowsable(EditorBrowsableState.Never)]
	void IComponentConnector.Connect(int connectionId, object target)
	{
		//IL_006e: Unknown result type (might be due to invalid IL or missing references)
		//IL_007a: Unknown result type (might be due to invalid IL or missing references)
		//IL_0084: Expected Obj, but got Unknown
		//IL_0086: Unknown result type (might be due to invalid IL or missing references)
		//IL_0092: Unknown result type (might be due to invalid IL or missing references)
		//IL_009c: Expected Obj, but got Unknown
		//IL_009e: Unknown result type (might be due to invalid IL or missing references)
		//IL_00aa: Unknown result type (might be due to invalid IL or missing references)
		//IL_00b4: Expected Obj, but got Unknown
		//IL_00b6: Unknown result type (might be due to invalid IL or missing references)
		//IL_00c2: Unknown result type (might be due to invalid IL or missing references)
		//IL_00cc: Expected Obj, but got Unknown
		//IL_00ce: Unknown result type (might be due to invalid IL or missing references)
		//IL_00da: Unknown result type (might be due to invalid IL or missing references)
		//IL_00e4: Expected Obj, but got Unknown
		//IL_00e6: Unknown result type (might be due to invalid IL or missing references)
		//IL_00f2: Unknown result type (might be due to invalid IL or missing references)
		//IL_00fc: Expected Obj, but got Unknown
		//IL_00fe: Unknown result type (might be due to invalid IL or missing references)
		//IL_010a: Unknown result type (might be due to invalid IL or missing references)
		//IL_0114: Expected Obj, but got Unknown
		//IL_0116: Unknown result type (might be due to invalid IL or missing references)
		//IL_0122: Unknown result type (might be due to invalid IL or missing references)
		//IL_012c: Expected Obj, but got Unknown
		//IL_012e: Unknown result type (might be due to invalid IL or missing references)
		//IL_013a: Unknown result type (might be due to invalid IL or missing references)
		//IL_0144: Expected Obj, but got Unknown
		//IL_0146: Unknown result type (might be due to invalid IL or missing references)
		//IL_0152: Unknown result type (might be due to invalid IL or missing references)
		//IL_015c: Expected Obj, but got Unknown
		//IL_015f: Unknown result type (might be due to invalid IL or missing references)
		//IL_0169: Expected Obj, but got Unknown
		//IL_0176: Unknown result type (might be due to invalid IL or missing references)
		//IL_0180: Expected Obj, but got Unknown
		//IL_0182: Unknown result type (might be due to invalid IL or missing references)
		//IL_018e: Unknown result type (might be due to invalid IL or missing references)
		//IL_0198: Expected Obj, but got Unknown
		//IL_019a: Unknown result type (might be due to invalid IL or missing references)
		//IL_01a6: Unknown result type (might be due to invalid IL or missing references)
		//IL_01b0: Expected Obj, but got Unknown
		//IL_01b2: Unknown result type (might be due to invalid IL or missing references)
		//IL_01be: Unknown result type (might be due to invalid IL or missing references)
		//IL_01c8: Expected Obj, but got Unknown
		//IL_01ca: Unknown result type (might be due to invalid IL or missing references)
		//IL_01d6: Unknown result type (might be due to invalid IL or missing references)
		//IL_01e0: Expected Obj, but got Unknown
		//IL_01e3: Unknown result type (might be due to invalid IL or missing references)
		//IL_01ed: Expected Obj, but got Unknown
		//IL_01fa: Unknown result type (might be due to invalid IL or missing references)
		//IL_0204: Expected Obj, but got Unknown
		//IL_0206: Unknown result type (might be due to invalid IL or missing references)
		//IL_0212: Unknown result type (might be due to invalid IL or missing references)
		//IL_021c: Expected Obj, but got Unknown
		//IL_021e: Unknown result type (might be due to invalid IL or missing references)
		//IL_022a: Unknown result type (might be due to invalid IL or missing references)
		//IL_0234: Expected Obj, but got Unknown
		//IL_0236: Unknown result type (might be due to invalid IL or missing references)
		//IL_0242: Unknown result type (might be due to invalid IL or missing references)
		//IL_024c: Expected Obj, but got Unknown
		//IL_024f: Unknown result type (might be due to invalid IL or missing references)
		//IL_0259: Expected Obj, but got Unknown
		//IL_025c: Unknown result type (might be due to invalid IL or missing references)
		//IL_0266: Expected Obj, but got Unknown
		//IL_0269: Unknown result type (might be due to invalid IL or missing references)
		//IL_0273: Expected Obj, but got Unknown
		//IL_0280: Unknown result type (might be due to invalid IL or missing references)
		//IL_028a: Expected Obj, but got Unknown
		//IL_028c: Unknown result type (might be due to invalid IL or missing references)
		//IL_0298: Unknown result type (might be due to invalid IL or missing references)
		//IL_02a2: Expected Obj, but got Unknown
		//IL_02a4: Unknown result type (might be due to invalid IL or missing references)
		//IL_02b0: Unknown result type (might be due to invalid IL or missing references)
		//IL_02ba: Expected Obj, but got Unknown
		switch (connectionId)
		{
		case 1:
			((ButtonBase)(Button)target).Click += AutoInjectDelayDown_Click;
			break;
		case 2:
			((ButtonBase)(Button)target).Click += AutoInjectDelayUp_Click;
			break;
		case 3:
			((ButtonBase)(Button)target).Click += FontSizeDown_Click;
			break;
		case 4:
			((ButtonBase)(Button)target).Click += FontSizeUp_Click;
			break;
		case 5:
			((ButtonBase)(Button)target).Click += ResetDefaults_Click;
			break;
		case 6:
			((ButtonBase)(Button)target).Click += BrowseScriptsFolder_Click;
			break;
		case 7:
			((ButtonBase)(Button)target).Click += ResetScriptsFolder_Click;
			break;
		case 8:
			((ButtonBase)(Button)target).Click += OpenScriptsFolder_Click;
			break;
		case 9:
			((ButtonBase)(Button)target).Click += AutoSaveDelayDown_Click;
			break;
		case 10:
			((ButtonBase)(Button)target).Click += AutoSaveDelayUp_Click;
			break;
		case 11:
			ApiKeyBox = (PasswordBox)target;
			ApiKeyBox.PasswordChanged += ApiKeyBox_PasswordChanged;
			break;
		case 12:
			((ButtonBase)(Button)target).Click += OpenApiDashboard_Click;
			break;
		case 13:
			((ButtonBase)(Button)target).Click += ClearApiKey_Click;
			break;
		case 14:
			((ButtonBase)(Button)target).Click += CopilotSignIn_Click;
			break;
		case 15:
			((ButtonBase)(Button)target).Click += CopilotSignOut_Click;
			break;
		case 16:
			AiKeyBox = (PasswordBox)target;
			AiKeyBox.PasswordChanged += AiKeyBox_PasswordChanged;
			break;
		case 17:
			((ButtonBase)(Button)target).Click += ClearAiKey_Click;
			break;
		case 18:
			((ButtonBase)(Button)target).Click += AiDebounceDown_Click;
			break;
		case 19:
			((ButtonBase)(Button)target).Click += AiDebounceUp_Click;
			break;
		case 20:
			ClaudeAccountLine = (TextBlock)target;
			break;
		case 21:
			ClaudeAccountDetail = (TextBlock)target;
			break;
		case 22:
			ClaudeConnectButton = (Button)target;
			((ButtonBase)ClaudeConnectButton).Click += ClaudeConnect_Click;
			break;
		case 23:
			((ButtonBase)(Button)target).Click += ClaudeRefreshAccount_Click;
			break;
		case 24:
			((ButtonBase)(Button)target).Click += OpenSettingsFolder_Click;
			break;
		default:
			_contentLoaded = true;
			break;
		}
	}
}
