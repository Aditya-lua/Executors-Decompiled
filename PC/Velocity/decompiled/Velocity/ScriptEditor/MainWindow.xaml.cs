using System;
using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel;
using System.Diagnostics;
using System.IO;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Runtime.InteropServices;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Controls.Primitives;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Interop;
using System.Windows.Markup;
using System.Windows.Media;
using System.Windows.Media.Animation;
using System.Windows.Shapes;
using System.Windows.Threading;
using Microsoft.Win32;
using ScriptEditor.Controls;
using ScriptEditor.Models;
using ScriptEditor.Services;
using IOPath = System.IO.Path;

namespace ScriptEditor;

public partial class MainWindow : Window, IComponentConnector, IStyleConnector
{
	private const int DwmwaWindowCornerPreference = 33;

	private const int DwmwcpRound = 2;

	private const string FileFilter = "Script files|*.lua;*.luau;*.txt;*.js;*.py|Lua scripts|*.lua;*.luau|All files|*.*";

	private readonly TaskCompletionSource _editorReady = new TaskCompletionSource(TaskCreationOptions.RunContinuationsAsynchronously);

	private readonly DispatcherTimer _settingsSave;

	private readonly DispatcherTimer _autoSaveTimer;

	private readonly Task<bool> _productLoad;

	private EditorTab? _activeTab;

	private bool _closeConfirmed;

	private double _expandedConsoleHeight = 210.0;

	private const double SidePanelWidth = 196.0;

	private const double ClaudePanelWidth = 340.0;

	private double _sidePanelWidth = 196.0;

	private bool _sidePanelResized;

	private bool _syncingSidePanel;

	private bool _syncingPages;

	private string? _completionStatus;

	private const double MinSidePanelWidth = 150.0;

	private const double MaxSidePanelWidth = 700.0;

	private Panel? _claudeReply;

	private readonly StringBuilder _claudeReplyText = new StringBuilder();

	private DispatcherTimer? _claudeRender;

	private const string DefaultModelLabel = "Default";

	private bool _loadingClaudeModels;

	private string[] _claudeAliases = ClaudeService.FallbackModels;

	private bool _discoveringModels;

	private MarkdownText.Palette? _markdownPalette;

	internal Border RootBorder;

	internal Button MaximizeButton;

	internal ToggleButton ExplorerToggle;

	internal ToggleButton HubToggle;

	internal ToggleButton ClaudeToggle;

	internal ToggleButton ClientsToggle;

	internal ToggleButton SettingsToggle;

	internal Border SidePanel;

	internal Border SidePanelContent;

	internal TranslateTransform SidePanelSlide;

	internal Grid ExplorerContent;

	internal TreeView ScriptsTree;

	internal Grid ClaudeContent;

	internal ComboBox ClaudeModelPicker;

	internal ScrollViewer ClaudeScroller;

	internal StackPanel ClaudeMessages;

	internal StackPanel ClaudeIntro;

	internal TextBox ClaudePrompt;

	internal TextBlock ClaudeStatus;

	internal Button ClaudeSend;

	internal Grid ClientsContent;

	internal Thumb SidePanelResizer;

	internal RowDefinition OutputRow;

	internal Grid EditorHost;

	internal MonacoEditor Editor;

	internal SettingsView SettingsPage;

	internal ScriptHubView HubPage;

	internal GridSplitter OutputSplitter;

	internal Border ActionBar;

	internal Button ConsoleToggleButton;

	internal System.Windows.Shapes.Path ConsoleChevron;

	internal Grid ConsolePanel;

	internal Grid ConsoleBody;

	internal ScrollViewer OutputScroller;

	internal TextBlock StatusLanguage;

	internal TextBlock StatusCursor;

	internal TextBlock StatusAttached;

	public ObservableCollection<EditorTab> Tabs { get; } = new ObservableCollection<EditorTab>();

	public ScriptTree Scripts { get; }

	public AppSettings AppSettings { get; }

	public OutputConsole Output { get; } = new OutputConsole();

	public ProductInfo Product { get; } = new ProductInfo();

	public VelocityService Velocity { get; } = new VelocityService();

	public LuauLanguageServer Lsp { get; } = new LuauLanguageServer();

	public VelocityCompletionServer Ai { get; }

	public CopilotServer Copilot { get; } = new CopilotServer();

	public ClaudeService Claude { get; } = new ClaudeService();

	public McpHost Mcp { get; }

	public ScriptHub Hub { get; }

	public AppSettings Settings => AppSettings;

	private string CopilotDocumentUri => "file:///velocity/" + (_activeTab?.Id ?? "scratch") + ".lua";

	private ToggleButton[] SidePanelToggles => new ToggleButton[3] { ExplorerToggle, ClaudeToggle, ClientsToggle };

	private FrameworkElement[] SidePanelContents => new FrameworkElement[3]
	{
		(FrameworkElement)ExplorerContent,
		(FrameworkElement)ClaudeContent,
		(FrameworkElement)ClientsContent
	};

	private MarkdownText.Palette MarkdownPalette
	{
		get
		{
			//IL_0026: Unknown result type (might be due to invalid IL or missing references)
			//IL_0030: Unknown result type (might be due to invalid IL or missing references)
			//IL_0040: Unknown result type (might be due to invalid IL or missing references)
			//IL_0050: Unknown result type (might be due to invalid IL or missing references)
			//IL_0060: Unknown result type (might be due to invalid IL or missing references)
			//IL_006b: Unknown result type (might be due to invalid IL or missing references)
			//IL_0070: Unknown result type (might be due to invalid IL or missing references)
			//IL_007a: Expected Obj, but got Unknown
			//IL_007a: Expected Obj, but got Unknown
			//IL_007a: Expected Obj, but got Unknown
			//IL_007a: Expected Obj, but got Unknown
			//IL_007a: Expected Obj, but got Unknown
			//IL_007a: Expected Obj, but got Unknown
			MarkdownText.Palette valueOrDefault = _markdownPalette.GetValueOrDefault();
			if (!_markdownPalette.HasValue)
			{
				valueOrDefault = new MarkdownText.Palette((FontFamily)((FrameworkElement)this).FindResource((object)"BodyFont"), new FontFamily("Cascadia Code, Consolas, monospace"), (Brush)((FrameworkElement)this).FindResource((object)"OutputPrintBrush"), (Brush)((FrameworkElement)this).FindResource((object)"TabForegroundBrush"), (Brush)((FrameworkElement)this).FindResource((object)"TabForegroundActiveBrush"), (Brush)new SolidColorBrush(Color.FromRgb((byte)28, (byte)28, (byte)36)));
				_markdownPalette = valueOrDefault;
				return valueOrDefault;
			}
			return valueOrDefault;
		}
	}

	[DllImport("dwmapi.dll")]
	private static extern int DwmSetWindowAttribute(nint hwnd, int attribute, ref int value, int size);

	public MainWindow()
	{
		//IL_0135: Unknown result type (might be due to invalid IL or missing references)
		//IL_013a: Unknown result type (might be due to invalid IL or missing references)
		//IL_0150: Expected Obj, but got Unknown
		//IL_017f: Unknown result type (might be due to invalid IL or missing references)
		//IL_0184: Unknown result type (might be due to invalid IL or missing references)
		//IL_01a0: Expected Obj, but got Unknown
		//IL_0424: Unknown result type (might be due to invalid IL or missing references)
		//IL_042e: Expected Obj, but got Unknown
		InitializeComponent();
		((FrameworkElement)this).DataContext = this;
		AppSettings = ScriptEditor.Models.AppSettings.Load();
		((FrameworkElement)SettingsPage).DataContext = AppSettings;
		SettingsPage.SeedApiKeyBox();
		Hub = new ScriptHub(AppSettings);
		HubPage.ScriptOpenRequested += OnHubScriptOpenRequested;
		HubPage.ScriptExecuteRequested += OnHubScriptExecuteRequested;
		HubPage.SettingsRequested += (object? _, EventArgs _) =>
		{
			HubToggle.IsChecked = false;
			SettingsToggle.IsChecked = true;
		};
		Scripts = new ScriptTree(AppSettings.ScriptsFolder);
		_settingsSave = new DispatcherTimer
		{
			Interval = TimeSpan.FromMilliseconds(500L)
		};
		_settingsSave.Tick += (object? _, EventArgs _) =>
		{
			_settingsSave.Stop();
			AppSettings.Save();
		};
		AppSettings.PropertyChanged += OnAppSettingsChanged;
		_autoSaveTimer = new DispatcherTimer
		{
			Interval = TimeSpan.FromSeconds(AppSettings.AutoSaveDelaySeconds)
		};
		_autoSaveTimer.Tick += OnAutoSaveTick;
		ApplyAccent();
		ApplyConsoleVisibility(animate: false);
		Velocity.AutoInjectDelaySeconds = AppSettings.AutoInjectDelaySeconds;
		_productLoad = Product.RefreshAsync();
		Output.LineAppended += OnOutputLineAppended;
		Velocity.Message += (string text, OutputKind kind) =>
		{
			((DispatcherObject)this).Dispatcher.Invoke((Action)(() =>
			{
				Output.Append(text, kind);
				UpdateStatusBar();
			}));
		};
		Editor.ContentChanged += OnEditorContentChanged;
		Editor.SaveRequested += OnEditorSaveRequested;
		Editor.CursorMoved += OnEditorCursorMoved;
		Editor.CommandRequested += OnEditorCommandRequested;
		Editor.LspPayloadOutgoing += async (object? _, string payload) =>
		{
			await Lsp.SendAsync(payload);
		};
		Lsp.PayloadReceived += (string payload) =>
		{
			((DispatcherObject)this).Dispatcher.InvokeAsync<Task>((Func<Task>)(() => Editor.DeliverLspPayloadAsync(payload)));
		};
		Lsp.Message += (string text, OutputKind kind) =>
		{
			((DispatcherObject)this).Dispatcher.Invoke((Action)(() =>
			{
				Output.Append(text, kind);
			}));
		};
		Ai = new VelocityCompletionServer(AppSettings);
		Ai.Message += (string text, OutputKind kind) =>
		{
			((DispatcherObject)this).Dispatcher.Invoke((Action)(() =>
			{
				Output.Append(text, kind);
			}));
		};
		Editor.InlineCompletionRequested += OnInlineCompletionRequested;
		Copilot.WorkspaceFolder = AppSettings.ScriptsFolder;
		Copilot.Message += (string text, OutputKind kind) =>
		{
			((DispatcherObject)this).Dispatcher.Invoke((Action)(() =>
			{
				Output.Append(text, kind);
			}));
		};
		Copilot.SignInPrompt += OnCopilotSignInPrompt;
		Mcp = new McpHost(new VelocityMcpServer(ReadActiveScriptAsync, ReplaceActiveScriptAsync, ExecuteForMcpAsync, () => (!Output.IsEmpty) ? Output.ToText() : "(the console is empty)", DescribeClients));
		Claude.SessionStarted += (string id) =>
		{
			((DispatcherObject)this).Dispatcher.Invoke<string>((Func<string>)(() => AppSettings.ClaudeSessionId = id));
		};
		Claude.TextReceived += OnClaudeText;
		Claude.ToolUsed += OnClaudeToolUsed;
		Claude.TurnCompleted += OnClaudeTurnCompleted;
		Claude.Message += (string text, OutputKind kind) =>
		{
			((DispatcherObject)this).Dispatcher.Invoke((Action)(() =>
			{
				Output.Append(text, kind);
			}));
		};
		Copilot.SignedInChanged += (bool signedIn) =>
		{
			((DispatcherObject)this).Dispatcher.Invoke((Action)(() =>
			{
				Output.Append(signedIn ? "Copilot signed in." : "Copilot signed out.", (!signedIn) ? OutputKind.Info : OutputKind.Success);
				if (signedIn)
				{
					AppSettings.AiCompletionEnabled = true;
				}
				ApplyAiCompletionAsync();
			}));
		};
		((FrameworkElement)this).Loaded += OnLoaded;
	}

	private void OnAppSettingsChanged(object? sender, PropertyChangedEventArgs e)
	{
		_settingsSave.Stop();
		_settingsSave.Start();
		switch (e.PropertyName)
		{
		case "ScriptsFolder":
			Scripts.ChangeRoot(AppSettings.ScriptsFolder);
			Copilot.SetWorkspaceFolderAsync(AppSettings.ScriptsFolder);
			break;
		case "AccentColor":
			ApplyAccent();
			break;
		case "AutoInject":
			Velocity.SetAutoInject(AppSettings.AutoInject);
			Output.Info("Auto Inject " + (AppSettings.AutoInject ? "enabled" : "disabled") + ".");
			break;
		case "AutoInjectDelaySeconds":
			Velocity.AutoInjectDelaySeconds = AppSettings.AutoInjectDelaySeconds;
			break;
		case "ConsoleVisible":
			ApplyConsoleVisibility();
			break;
		case "AiProvider":
			ResumeThenApplyAsync();
			break;
		case "AiApiKey":
		case "AiCompletionEnabled":
		case "AiApiKeyProtected":
		case "AiDebounceMs":
		case "AiModel":
		case "AiBaseUrl":
			ApplyAiCompletionAsync();
			break;
		case "ShowSplash":
			break;
		case "AutoSaveDelaySeconds":
			break;
		case "AutoPickClients":
			break;
		case "SaveScripts":
			if (!AppSettings.SaveScripts)
			{
				SessionStore.Clear();
			}
			break;
		case "AutoSave":
			if (!AppSettings.AutoSave)
			{
				_autoSaveTimer.Stop();
			}
			break;
		default:
			Editor.ApplySettingsAsync(AppSettings);
			break;
		}
	}

	private void ApplyAccent()
	{
		//IL_0010: Unknown result type (might be due to invalid IL or missing references)
		//IL_0015: Unknown result type (might be due to invalid IL or missing references)
		//IL_0025: Unknown result type (might be due to invalid IL or missing references)
		//IL_0026: Unknown result type (might be due to invalid IL or missing references)
		//IL_0030: Expected Obj, but got Unknown
		try
		{
			Color val = (Color)ColorConverter.ConvertFromString(AppSettings.AccentColor);
			Application.Current.Resources[(object)"AccentBrush"] = (object)new SolidColorBrush(val);
		}
		catch (FormatException)
		{
			AppSettings.AccentColor = "#C4785C";
		}
	}

	private async void OnLoaded(object sender, RoutedEventArgs e)
	{
		((FrameworkElement)this).Loaded -= OnLoaded;
		Scripts.Start();
		try
		{
			await Editor.Ready;
			await Editor.ApplySettingsAsync(AppSettings);
			Output.Info("Velocity ready.");
			ReportProductInfoAsync();
			StartVelocityAsync();
			_editorReady.TrySetResult();
		}
		catch (Exception ex)
		{
			_editorReady.TrySetException(ex);
			MessageBox.Show((Window)(object)this, "The code editor failed to start:\n" + ex.Message, "Velocity", (MessageBoxButton)0, (MessageBoxImage)16);
		}
	}

	public Task WhenEditorReadyAsync()
	{
		return _editorReady.Task;
	}

	private async Task StartVelocityAsync()
	{
		await Velocity.InitializeAsync();
		if (AppSettings.AutoInject)
		{
			Velocity.SetAutoInject(enabled: true);
		}
	}

	private async Task ReportProductInfoAsync()
	{
		if (await _productLoad)
		{
			Output.Info($"Velocity {Product.Version} — supported {Product.Name} client: " + Product.SupportedVersion);
			if (!string.Equals(Product.Status, "active", StringComparison.OrdinalIgnoreCase))
			{
				Output.Warning("Product status is \"" + Product.Status + "\".");
			}
		}
		else
		{
			Output.Warning($"Could not reach the Velocity API ({Product.Error}). Showing local version {ProductInfo.LocalVersion}.");
		}
	}

	public async Task RevealAsync()
	{
		CenterOnWorkArea();
		((Window)this).Show();
		((Window)this).Activate();
		Task lsp = StartLanguageServerAsync();
		Task tabs = OpenInitialTabAsync();
		DoubleAnimation val = new DoubleAnimation
		{
			To = 1.0,
			Duration = new Duration(TimeSpan.FromMilliseconds(260L)),
			EasingFunction = (IEasingFunction)new QuadraticEase
			{
				EasingMode = (EasingMode)1
			}
		};
		TaskCompletionSource done = new TaskCompletionSource(TaskCreationOptions.RunContinuationsAsynchronously);
		((Timeline)val).Completed += (object? _, EventArgs _) =>
		{
			done.TrySetResult();
		};
		((UIElement)this).BeginAnimation(UIElement.OpacityProperty, (AnimationTimeline)(object)val);
		await done.Task;
		((UIElement)this).BeginAnimation(UIElement.OpacityProperty, (AnimationTimeline)null);
		((UIElement)this).Opacity = 1.0;
		await tabs;
		await lsp;
	}

	private async Task StartLanguageServerAsync()
	{
		bool started = await Task.Run((Func<bool>)Lsp.Start);
		await Editor.SetLspAvailableAsync(started);
		if (started)
		{
			Output.Info("Luau language server ready.");
		}
		await ResumeCopilotAsync();
		await ApplyAiCompletionAsync();
		Mcp.Start();
		RestoreClaudeSession();
		await InitializeClaudeModelsAsync();
		await SettingsPage.RefreshClaudeAccountAsync();
	}

	private async Task ResumeThenApplyAsync()
	{
		await ResumeCopilotAsync();
		await ApplyAiCompletionAsync();
	}

	private async Task ResumeCopilotAsync()
	{
		if (AppSettings.UsesCopilot && CopilotInstaller.IsInstalled && !Copilot.IsSignedIn)
		{
			await Copilot.CheckStatusAsync();
		}
	}

	private async Task ApplyAiCompletionAsync()
	{
		bool on = AppSettings.AiCompletionEnabled && (AppSettings.UsesCopilot ? Copilot.IsSignedIn : Ai.IsConfigured);
		await Editor.SetAiCompletionAsync(on, AppSettings.AiDebounceMs);
		string text;
		if (on)
		{
			text = (AppSettings.UsesCopilot ? "Completions on, using GitHub Copilot." : ("Completions on, using " + AppSettings.AiModel + "."));
		}
		else
		{
			text = "off";
		}
		if (!(text == _completionStatus))
		{
			_completionStatus = text;
			if (on)
			{
				Output.Info(text);
			}
		}
	}

	private async void OnInlineCompletionRequested(object? sender, MonacoEditor.InlineCompletionRequest request)
	{
		IReadOnlyList<VelocityCompletionServer.InlineCompletionItem> readOnlyList = ((!AppSettings.UsesCopilot) ? (await Ai.InlineCompletionAsync(request.Prefix, request.Suffix)) : (await Copilot.InlineCompletionAsync(CopilotDocumentUri, request.Prefix, request.Suffix)));
		IReadOnlyList<VelocityCompletionServer.InlineCompletionItem> items = readOnlyList;
		await Editor.DeliverInlineCompletionAsync(request.Id, items);
	}

	public async Task SignInToCopilotAsync()
	{
		if (!CopilotInstaller.IsInstalled)
		{
			Progress<int> progress = new Progress<int>((int percent) =>
			{
				if (percent % 20 == 0)
				{
					Output.Info($"Copilot download {percent}%…");
				}
			});
			if (!(await CopilotInstaller.EnsureInstalledAsync((string text, OutputKind kind) =>
			{
				((DispatcherObject)this).Dispatcher.Invoke((Action)(() =>
				{
					Output.Append(text, kind);
				}));
			}, progress)))
			{
				return;
			}
		}
		await Copilot.SignInAsync();
	}

	private void OnCopilotSignInPrompt(string userCode, string verificationUri)
	{
		((DispatcherObject)this).Dispatcher.Invoke((Action)(() =>
		{
			Output.Info("Copilot: enter code " + userCode + " at " + verificationUri);
			try
			{
				Clipboard.SetText(userCode);
				Output.Info("The code has been copied to your clipboard.");
			}
			catch (ExternalException)
			{
			}
			try
			{
				Process.Start(new ProcessStartInfo(verificationUri)
				{
					UseShellExecute = true
				});
			}
			catch (Exception ex2) when ((ex2 is Win32Exception || ex2 is InvalidOperationException) ? true : false)
			{
				Output.Warning("Open " + verificationUri + " to finish signing in.");
			}
		}));
	}

	public void CenterOnWorkArea()
	{
		//IL_0000: Unknown result type (might be due to invalid IL or missing references)
		//IL_0005: Unknown result type (might be due to invalid IL or missing references)
		Rect workArea = SystemParameters.WorkArea;
		((Window)this).Left = workArea.Left + (workArea.Width - ((FrameworkElement)this).Width) / 2.0;
		((Window)this).Top = workArea.Top + (workArea.Height - ((FrameworkElement)this).Height) / 2.0;
	}

	public async Task OpenInitialTabAsync()
	{
		if (Tabs.Count <= 0 && !(await RestoreSessionAsync()))
		{
			await NewTabAsync();
		}
	}

	protected override void OnSourceInitialized(EventArgs e)
	{
		//IL_0008: Unknown result type (might be due to invalid IL or missing references)
		base.OnSourceInitialized(e);
		nint handle = new WindowInteropHelper((Window)(object)this).Handle;
		int value = 2;
		DwmSetWindowAttribute(handle, 33, ref value, 4);
	}

	private async Task NewTabAsync(string? filePath = null, string content = "")
	{
		EditorTab tab = new EditorTab(filePath);
		Tabs.Add(tab);
		await Editor.OpenTabAsync(tab.Id, "lua", content);
		await ActivateTabAsync(tab);
	}

	private async Task ActivateTabAsync(EditorTab? tab)
	{
		if (_activeTab == tab)
		{
			return;
		}
		foreach (EditorTab tab2 in Tabs)
		{
			tab2.IsActive = tab2 == tab;
		}
		_activeTab = tab;
		await Editor.ActivateTabAsync(tab?.Id);
		UpdateStatusBar();
	}

	private async Task CloseTabAsync(EditorTab tab)
	{
		bool flag = tab.IsDirty;
		if (flag)
		{
			flag = !(await ConfirmDiscardAsync(tab));
		}
		if (flag)
		{
			return;
		}
		int index = Tabs.IndexOf(tab);
		Tabs.Remove(tab);
		await Editor.CloseTabAsync(tab.Id);
		if (_activeTab == tab)
		{
			_activeTab = null;
			if (Tabs.Count == 0)
			{
				await Editor.ActivateTabAsync(null);
				UpdateStatusBar();
				Keyboard.Focus((IInputElement)(object)this);
			}
			else
			{
				await ActivateTabAsync(Tabs[Math.Min(index, Tabs.Count - 1)]);
			}
		}
	}

	private async Task<bool> ConfirmDiscardAsync(EditorTab tab)
	{
		MessageBoxResult val = MessageBox.Show("Save changes to " + tab.Title + "?", "Velocity", (MessageBoxButton)3, (MessageBoxImage)32);
		return ((int)val == 6) ? (await SaveTabAsync(tab)) : ((int)val == 7);
	}

	private async Task OpenFileAsync()
	{
		OpenFileDialog val = new OpenFileDialog
		{
			Filter = "Script files|*.lua;*.luau;*.txt;*.js;*.py|Lua scripts|*.lua;*.luau|All files|*.*",
			Multiselect = true,
			InitialDirectory = (Directory.Exists(Scripts.RootPath) ? Scripts.RootPath : null)
		};
		if (((CommonDialog)val).ShowDialog((Window)(object)this) == true)
		{
			string[] fileNames = ((FileDialog)val).FileNames;
			foreach (string path in fileNames)
			{
				await OpenPathAsync(path);
			}
		}
	}

	private async Task OpenPathAsync(string path)
	{
		EditorTab editorTab = Tabs.FirstOrDefault((EditorTab t) => t.FilePath != null && string.Equals(t.FilePath, path, StringComparison.OrdinalIgnoreCase));
		if (editorTab != null)
		{
			await ActivateTabAsync(editorTab);
			return;
		}
		try
		{
			string content = await File.ReadAllTextAsync(path);
			await NewTabAsync(path, content);
			Output.Info("Opened " + IOPath.GetFileName(path));
		}
		catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException) ? true : false)
		{
			Output.Error("Could not open " + IOPath.GetFileName(path) + ": " + ex.Message);
			MessageBox.Show((Window)(object)this, "Could not open " + IOPath.GetFileName(path) + ":\n" + ex.Message, "Velocity", (MessageBoxButton)0, (MessageBoxImage)48);
		}
	}

	private async Task<bool> SaveTabAsync(EditorTab tab, bool forcePrompt = false)
	{
		string path = tab.FilePath;
		if ((path == null) | forcePrompt)
		{
			SaveFileDialog val = new SaveFileDialog
			{
				Filter = "Script files|*.lua;*.luau;*.txt;*.js;*.py|Lua scripts|*.lua;*.luau|All files|*.*",
				FileName = ((tab.FilePath == null) ? (tab.Title + ".lua") : IOPath.GetFileName(tab.FilePath)),
				DefaultExt = ".lua",
				InitialDirectory = ((tab.FilePath == null && Directory.Exists(Scripts.RootPath)) ? Scripts.RootPath : null)
			};
			if (((CommonDialog)val).ShowDialog((Window)(object)this) != true)
			{
				return false;
			}
			path = ((FileDialog)val).FileName;
		}
		try
		{
			await File.WriteAllTextAsync(path, await Editor.GetContentAsync(tab.Id));
		}
		catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException) ? true : false)
		{
			Output.Error("Could not save " + IOPath.GetFileName(path) + ": " + ex.Message);
			MessageBox.Show((Window)(object)this, "Could not save:\n" + ex.Message, "Velocity", (MessageBoxButton)0, (MessageBoxImage)48);
			return false;
		}
		tab.FilePath = path;
		tab.IsDirty = false;
		UpdateStatusBar();
		Output.Success("Saved " + IOPath.GetFileName(path));
		return true;
	}

	private void OnEditorContentChanged(object? sender, string tabId)
	{
		EditorTab editorTab = Tabs.FirstOrDefault((EditorTab t) => t.Id == tabId);
		if (editorTab != null)
		{
			editorTab.IsDirty = true;
			if (AppSettings.AutoSave && editorTab.FilePath != null)
			{
				_autoSaveTimer.Interval = TimeSpan.FromSeconds(AppSettings.AutoSaveDelaySeconds);
				_autoSaveTimer.Stop();
				_autoSaveTimer.Start();
			}
		}
	}

	private async void OnAutoSaveTick(object? sender, EventArgs e)
	{
		_autoSaveTimer.Stop();
		if (AppSettings.AutoSave)
		{
			EditorTab[] array = Tabs.Where((EditorTab t) => t.IsDirty && t.FilePath != null).ToArray();
			foreach (EditorTab tab in array)
			{
				await SaveTabAsync(tab);
			}
		}
	}

	private async void OnEditorSaveRequested(object? sender, string tabId)
	{
		EditorTab editorTab = Tabs.FirstOrDefault((EditorTab t) => t.Id == tabId);
		if (editorTab != null)
		{
			await SaveTabAsync(editorTab);
		}
	}

	private void OnEditorCursorMoved(object? sender, (int Line, int Column) position)
	{
		StatusCursor.Text = $"Ln {position.Line}, Col {position.Column}";
	}

	private async void OnEditorCommandRequested(object? sender, string command)
	{
		switch (command)
		{
		case "openFile":
			await OpenFileAsync();
			break;
		case "newTab":
			await NewTabAsync();
			break;
		case "closeTab":
			if (_activeTab != null)
			{
				await CloseTabAsync(_activeTab);
			}
			break;
		case "saveAs":
			if (_activeTab != null)
			{
				await SaveTabAsync(_activeTab, forcePrompt: true);
			}
			break;
		case "nextTab":
			if (Tabs.Count > 1 && _activeTab != null)
			{
				await ActivateTabAsync(Tabs[(Tabs.IndexOf(_activeTab) + 1) % Tabs.Count]);
			}
			break;
		case "toggleConsole":
			AppSettings.ConsoleVisible = !AppSettings.ConsoleVisible;
			break;
		}
	}

	private void UpdateStatusBar()
	{
		StatusLanguage.Text = ((_activeTab == null) ? string.Empty : "lua");
		if (_activeTab == null)
		{
			StatusCursor.Text = string.Empty;
		}
		StatusAttached.Text = (Velocity.IsAttached ? $"Attached ({Velocity.AttachedCount})" : "Not attached");
	}

	protected override async void OnPreviewKeyDown(KeyEventArgs e)
	{
		_003C_003En__0(e);
		if (!((Enum)Keyboard.Modifiers).HasFlag((Enum)(object)(ModifierKeys)2))
		{
			return;
		}
		Key key = e.Key;
		if ((int)key <= 58)
		{
			if ((int)key != 3)
			{
				if ((int)key != 57)
				{
					if ((int)key == 58)
					{
						((RoutedEventArgs)e).Handled = true;
						await OpenFileAsync();
					}
				}
				else
				{
					((RoutedEventArgs)e).Handled = true;
					await NewTabAsync();
				}
			}
			else if (Tabs.Count > 1 && _activeTab != null)
			{
				((RoutedEventArgs)e).Handled = true;
				int index = (Tabs.IndexOf(_activeTab) + 1) % Tabs.Count;
				await ActivateTabAsync(Tabs[index]);
			}
		}
		else if ((int)key != 62)
		{
			if ((int)key != 66)
			{
				if ((int)key == 146)
				{
					((RoutedEventArgs)e).Handled = true;
					AppSettings.ConsoleVisible = !AppSettings.ConsoleVisible;
				}
			}
			else if (_activeTab != null)
			{
				((RoutedEventArgs)e).Handled = true;
				await CloseTabAsync(_activeTab);
			}
		}
		else if (_activeTab != null)
		{
			((RoutedEventArgs)e).Handled = true;
			await SaveTabAsync(_activeTab, ((Enum)Keyboard.Modifiers).HasFlag((Enum)(object)(ModifierKeys)4));
		}
	}

	private async void NewTab_Click(object sender, RoutedEventArgs e)
	{
		await NewTabAsync();
	}

	private async void Tab_Click(object sender, RoutedEventArgs e)
	{
		ToggleButton val = (ToggleButton)((sender is ToggleButton) ? sender : null);
		if (val != null && ((FrameworkElement)val).DataContext is EditorTab tab)
		{
			await ActivateTabAsync(tab);
		}
	}

	private async void Tab_MouseDown(object sender, MouseButtonEventArgs e)
	{
		if ((int)e.ChangedButton == 1)
		{
			ToggleButton val = (ToggleButton)((sender is ToggleButton) ? sender : null);
			if (val != null && ((FrameworkElement)val).DataContext is EditorTab tab)
			{
				await CloseTabAsync(tab);
			}
		}
	}

	private async void CloseTab_Click(object sender, RoutedEventArgs e)
	{
		e.Handled = true;
		Button val = (Button)((sender is Button) ? sender : null);
		if (val != null && ((FrameworkElement)val).DataContext is EditorTab tab)
		{
			await CloseTabAsync(tab);
		}
	}

	private void OpenFile_Click(object sender, RoutedEventArgs e)
	{
		OpenFileAsync();
	}

	private async void ExecuteButton_Click(object sender, RoutedEventArgs e)
	{
		if (_activeTab != null)
		{
			string script = await Editor.GetContentAsync(_activeTab.Id);
			Velocity.Execute(script, AppSettings.ExecuteOnAllClients);
		}
	}

	private async void InjectButton_Click(object sender, RoutedEventArgs e)
	{
		if (Velocity.IsBusy)
		{
			return;
		}
		Velocity.PruneClosedClients();
		List<Process> list = (from c in VelocityService.FindClients()
			where !Velocity.IsAttachedTo(c.Id) && Velocity.IsInjectAllowed(c.Id)
			select c).ToList();
		if (list.Count == 0)
		{
			Output.Warning(Velocity.IsAttached ? "No new clients found — already attached, or injection is off for them." : "No running Roblox client found.");
			return;
		}
		if (!AppSettings.AutoPickClients && list.Count > 1)
		{
			ClientPickerWindow clientPickerWindow = new ClientPickerWindow(list);
			((Window)clientPickerWindow).Owner = (Window)(object)this;
			ClientPickerWindow clientPickerWindow2 = clientPickerWindow;
			if (((Window)clientPickerWindow2).ShowDialog() != true)
			{
				return;
			}
			list = clientPickerWindow2.Selected.ToList();
			if (list.Count == 0)
			{
				return;
			}
		}
		await Velocity.AttachAsync(list);
		UpdateStatusBar();
	}

	private async void ClearScript_Click(object sender, RoutedEventArgs e)
	{
		if (_activeTab != null)
		{
			await Editor.SetContentAsync(_activeTab.Id, string.Empty);
			_activeTab.IsDirty = true;
			await Editor.FocusEditorAsync();
		}
	}

	private async void SaveScript_Click(object sender, RoutedEventArgs e)
	{
		if (_activeTab != null)
		{
			await SaveTabAsync(_activeTab);
		}
	}

	private void ToggleConsole_Click(object sender, RoutedEventArgs e)
	{
		AppSettings.ConsoleVisible = !AppSettings.ConsoleVisible;
	}

	private void ApplyConsoleVisibility(bool animate = true)
	{
		//IL_0015: Unknown result type (might be due to invalid IL or missing references)
		//IL_001a: Unknown result type (might be due to invalid IL or missing references)
		//IL_0071: Unknown result type (might be due to invalid IL or missing references)
		//IL_0076: Unknown result type (might be due to invalid IL or missing references)
		//IL_0078: Expected Obj, but got Unknown
		//IL_007d: Expected Obj, but got Unknown
		//IL_00e6: Unknown result type (might be due to invalid IL or missing references)
		//IL_00eb: Unknown result type (might be due to invalid IL or missing references)
		//IL_00f0: Unknown result type (might be due to invalid IL or missing references)
		//IL_00f1: Unknown result type (might be due to invalid IL or missing references)
		//IL_00f6: Unknown result type (might be due to invalid IL or missing references)
		//IL_0102: Expected Obj, but got Unknown
		//IL_0107: Expected Obj, but got Unknown
		//IL_0121: Unknown result type (might be due to invalid IL or missing references)
		//IL_0167: Unknown result type (might be due to invalid IL or missing references)
		//IL_0177: Unknown result type (might be due to invalid IL or missing references)
		//IL_0249: Unknown result type (might be due to invalid IL or missing references)
		//IL_024e: Unknown result type (might be due to invalid IL or missing references)
		//IL_0253: Unknown result type (might be due to invalid IL or missing references)
		//IL_0254: Unknown result type (might be due to invalid IL or missing references)
		//IL_0259: Unknown result type (might be due to invalid IL or missing references)
		//IL_0265: Expected Obj, but got Unknown
		//IL_0266: Expected Obj, but got Unknown
		//IL_01c9: Unknown result type (might be due to invalid IL or missing references)
		//IL_01ce: Unknown result type (might be due to invalid IL or missing references)
		//IL_01d3: Unknown result type (might be due to invalid IL or missing references)
		//IL_01d4: Unknown result type (might be due to invalid IL or missing references)
		//IL_01d9: Unknown result type (might be due to invalid IL or missing references)
		//IL_01e5: Expected Obj, but got Unknown
		//IL_01e7: Expected Obj, but got Unknown
		bool consoleVisible = AppSettings.ConsoleVisible;
		if (!consoleVisible)
		{
			GridLength height = OutputRow.Height;
			if (height.IsAbsolute && OutputRow.ActualHeight > 0.0)
			{
				_expandedConsoleHeight = OutputRow.ActualHeight;
			}
		}
		((UIElement)OutputSplitter).IsEnabled = false;
		Transform renderTransform = ((UIElement)ConsoleChevron).RenderTransform;
		RotateTransform val = (RotateTransform)(object)((renderTransform is RotateTransform) ? renderTransform : null);
		if (val == null)
		{
			System.Windows.Shapes.Path consoleChevron = ConsoleChevron;
			RotateTransform val2 = new RotateTransform();
			val = val2;
			((UIElement)consoleChevron).RenderTransform = (Transform)val2;
		}
		((FrameworkElement)ConsoleToggleButton).ToolTip = (consoleVisible ? "Hide console (Ctrl+`)" : "Show console (Ctrl+`)");
		if (!animate)
		{
			((Animatable)val).BeginAnimation(RotateTransform.AngleProperty, (AnimationTimeline)null);
			val.Angle = ((!consoleVisible) ? 180 : 0);
			if (consoleVisible)
			{
				FinishConsoleOpen();
			}
			else
			{
				FinishConsoleClose();
			}
			return;
		}
		((Animatable)val).BeginAnimation(RotateTransform.AngleProperty, (AnimationTimeline)new DoubleAnimation((double)((!consoleVisible) ? 180 : 0), new Duration(TimeSpan.FromMilliseconds(200L)))
		{
			EasingFunction = (IEasingFunction)new QuadraticEase
			{
				EasingMode = (EasingMode)1
			}
		});
		OutputRow.MinHeight = 0.0;
		OutputRow.Height = GridLength.Auto;
		if (consoleVisible)
		{
			((UIElement)OutputSplitter).Visibility = (Visibility)0;
			ActionBar.BorderThickness = new Thickness(0.0, 0.0, 0.0, 1.0);
			if ((int)((UIElement)ConsolePanel).Visibility != 0)
			{
				((FrameworkElement)ConsolePanel).Height = 0.0;
				((UIElement)ConsolePanel).Visibility = (Visibility)0;
			}
			DoubleAnimation val3 = new DoubleAnimation(Math.Max(0.0, _expandedConsoleHeight - ((FrameworkElement)ActionBar).Height), new Duration(TimeSpan.FromMilliseconds(200L)))
			{
				EasingFunction = (IEasingFunction)new QuadraticEase
				{
					EasingMode = (EasingMode)1
				}
			};
			((Timeline)val3).Completed += (object? _, EventArgs _) =>
			{
				if (AppSettings.ConsoleVisible)
				{
					FinishConsoleOpen();
				}
			};
			((UIElement)ConsolePanel).BeginAnimation(FrameworkElement.HeightProperty, (AnimationTimeline)(object)val3);
			return;
		}
		if (double.IsNaN(((FrameworkElement)ConsolePanel).Height))
		{
			((FrameworkElement)ConsolePanel).Height = ((FrameworkElement)ConsolePanel).ActualHeight;
		}
		DoubleAnimation val4 = new DoubleAnimation(0.0, new Duration(TimeSpan.FromMilliseconds(160L)))
		{
			EasingFunction = (IEasingFunction)new QuadraticEase
			{
				EasingMode = (EasingMode)0
			}
		};
		((Timeline)val4).Completed += (object? _, EventArgs _) =>
		{
			if (!AppSettings.ConsoleVisible)
			{
				FinishConsoleClose();
			}
		};
		((UIElement)ConsolePanel).BeginAnimation(FrameworkElement.HeightProperty, (AnimationTimeline)(object)val4);
	}

	private void FinishConsoleOpen()
	{
		//IL_004e: Unknown result type (might be due to invalid IL or missing references)
		//IL_009a: Unknown result type (might be due to invalid IL or missing references)
		((UIElement)ConsolePanel).BeginAnimation(FrameworkElement.HeightProperty, (AnimationTimeline)null);
		((DependencyObject)ConsolePanel).ClearValue(FrameworkElement.HeightProperty);
		((UIElement)ConsolePanel).Visibility = (Visibility)0;
		OutputRow.MinHeight = 110.0;
		OutputRow.Height = new GridLength(_expandedConsoleHeight, (GridUnitType)1);
		((UIElement)OutputSplitter).Visibility = (Visibility)0;
		((UIElement)OutputSplitter).IsEnabled = true;
		ActionBar.BorderThickness = new Thickness(0.0, 0.0, 0.0, 1.0);
	}

	private void FinishConsoleClose()
	{
		//IL_004b: Unknown result type (might be due to invalid IL or missing references)
		//IL_0070: Unknown result type (might be due to invalid IL or missing references)
		((UIElement)ConsolePanel).BeginAnimation(FrameworkElement.HeightProperty, (AnimationTimeline)null);
		((FrameworkElement)ConsolePanel).Height = 0.0;
		((UIElement)ConsolePanel).Visibility = (Visibility)2;
		OutputRow.MinHeight = 0.0;
		OutputRow.Height = GridLength.Auto;
		((UIElement)OutputSplitter).Visibility = (Visibility)2;
		ActionBar.BorderThickness = new Thickness(0.0);
	}

	private void ClearOutput_Click(object sender, RoutedEventArgs e)
	{
		Output.Clear();
	}

	private void CopyOutput_Click(object sender, RoutedEventArgs e)
	{
		if (Output.IsEmpty)
		{
			return;
		}
		try
		{
			Clipboard.SetText(Output.ToText());
		}
		catch (ExternalException)
		{
		}
	}

	private void SaveOutput_Click(object sender, RoutedEventArgs e)
	{
		//IL_000e: Unknown result type (might be due to invalid IL or missing references)
		//IL_0013: Unknown result type (might be due to invalid IL or missing references)
		//IL_001e: Unknown result type (might be due to invalid IL or missing references)
		//IL_005e: Unknown result type (might be due to invalid IL or missing references)
		//IL_006a: Expected Obj, but got Unknown
		if (Output.IsEmpty)
		{
			return;
		}
		SaveFileDialog val = new SaveFileDialog
		{
			Filter = "Log files|*.log|Text files|*.txt|All files|*.*",
			FileName = $"output-{DateTime.Now:yyyy-MM-dd-HHmmss}.log",
			DefaultExt = ".log"
		};
		if (((CommonDialog)val).ShowDialog((Window)(object)this) != true)
		{
			return;
		}
		try
		{
			File.WriteAllText(((FileDialog)val).FileName, Output.ToText());
			Output.Info("Output saved to " + ((FileDialog)val).FileName);
		}
		catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException) ? true : false)
		{
			Output.Error("Could not save output: " + ex.Message);
		}
	}

	private void OnOutputLineAppended(object? sender, EventArgs e)
	{
		if (OutputScroller.VerticalOffset >= OutputScroller.ScrollableHeight - 24.0)
		{
			OutputScroller.ScrollToEnd();
		}
	}

	private async void PageToggle_Changed(object sender, RoutedEventArgs e)
	{
		if (!_syncingPages)
		{
			_syncingPages = true;
			try
			{
				if (sender == HubToggle && HubToggle.IsChecked == true)
				{
					SettingsToggle.IsChecked = false;
				}
				else if (sender == SettingsToggle && SettingsToggle.IsChecked == true)
				{
					HubToggle.IsChecked = false;
				}
			}
			finally
			{
				_syncingPages = false;
			}
		}
		if (sender == HubToggle && HubToggle.IsChecked == true)
		{
			PageTransition.Play((FrameworkElement)(object)HubPage);
		}
		else if (sender == SettingsToggle && SettingsToggle.IsChecked == true)
		{
			PageTransition.Play((FrameworkElement)(object)SettingsPage);
		}
		if (HubToggle.IsChecked == true)
		{
			await HubPage.EnsureLoadedAsync();
		}
	}

	private async void OnHubScriptOpenRequested(object? sender, HubScript script)
	{
		HubScript detail = await FetchHubScriptAsync(script);
		if (detail != null)
		{
			HubToggle.IsChecked = false;
			await NewTabAsync(null, detail.Script);
			if (_activeTab != null)
			{
				_activeTab.Title = TabTitleFor(script.Title);
			}
			Output.Success($"Opened \"{script.Title}\" — {detail.RiskText}.");
			WarnAboutKeySystem(detail);
		}
	}

	private async void OnHubScriptExecuteRequested(object? sender, HubScript script)
	{
		if (!Velocity.IsAttached)
		{
			Output.Warning("Not attached to a client. Use Inject first.");
			return;
		}
		HubScript hubScript = await FetchHubScriptAsync(script);
		if (hubScript != null)
		{
			Output.Info($"Running \"{script.Title}\" — {hubScript.RiskText}.");
			WarnAboutKeySystem(hubScript);
			Velocity.Execute(hubScript.Script, AppSettings.ExecuteOnAllClients);
		}
	}

	private async Task<HubScript?> FetchHubScriptAsync(HubScript summary)
	{
		try
		{
			Output.Info("Fetching \"" + summary.Title + "\" from rscripts.net…");
			HubScript hubScript = await Hub.LoadScriptAsync(summary);
			if (!string.IsNullOrEmpty(hubScript.Script))
			{
				return hubScript;
			}
			Output.Warning("That script came back empty.");
			return null;
		}
		catch (ScriptHubException ex)
		{
			Output.Error(ex.Message);
			return null;
		}
	}

	private void WarnAboutKeySystem(HubScript script)
	{
		if (script.IsKeySystem)
		{
			Output.Warning("This script uses a key system; it may prompt for a key when run.");
		}
	}

	private static string TabTitleFor(string title)
	{
		string text = title.Trim();
		if (text.Length > 28)
		{
			return text.Substring(0, 27).TrimEnd() + "…";
		}
		return text;
	}

	private void SidePanelToggle_Changed(object sender, RoutedEventArgs e)
	{
		if (_syncingSidePanel)
		{
			return;
		}
		_syncingSidePanel = true;
		try
		{
			ToggleButton[] sidePanelToggles = SidePanelToggles;
			foreach (ToggleButton val in sidePanelToggles)
			{
				if (sender != val)
				{
					ToggleButton val2 = (ToggleButton)((sender is ToggleButton) ? sender : null);
					if (val2 != null && (val2.IsChecked ?? false))
					{
						val.IsChecked = false;
					}
				}
			}
		}
		finally
		{
			_syncingSidePanel = false;
		}
		UpdateSidePanel();
	}

	private void SidePanelResizer_DragDelta(object sender, DragDeltaEventArgs e)
	{
		double num = Math.Clamp(((FrameworkElement)SidePanel).ActualWidth + e.HorizontalChange, 150.0, 700.0);
		((UIElement)SidePanel).BeginAnimation(FrameworkElement.WidthProperty, (AnimationTimeline)null);
		((FrameworkElement)SidePanel).Width = num;
		_sidePanelWidth = num;
		_sidePanelResized = true;
		FrameworkElement[] sidePanelContents = SidePanelContents;
		for (int i = 0; i < sidePanelContents.Length; i++)
		{
			sidePanelContents[i].Width = num;
		}
	}

	private void UpdateSidePanel()
	{
		bool valueOrDefault = ExplorerToggle.IsChecked == true;
		bool valueOrDefault2 = ClaudeToggle.IsChecked == true;
		bool valueOrDefault3 = ClientsToggle.IsChecked == true;
		bool flag = valueOrDefault | valueOrDefault2 | valueOrDefault3;
		if (flag)
		{
			((UIElement)ExplorerContent).Visibility = (Visibility)((!valueOrDefault) ? 2 : 0);
			((UIElement)ClaudeContent).Visibility = (Visibility)((!valueOrDefault2) ? 2 : 0);
			((UIElement)ClientsContent).Visibility = (Visibility)((!valueOrDefault3) ? 2 : 0);
			if (!_sidePanelResized)
			{
				_sidePanelWidth = (valueOrDefault2 ? 340.0 : 196.0);
			}
			FrameworkElement[] sidePanelContents = SidePanelContents;
			for (int i = 0; i < sidePanelContents.Length; i++)
			{
				sidePanelContents[i].Width = _sidePanelWidth;
			}
		}
		AnimateSidePanel(flag);
		if (valueOrDefault2)
		{
			((UIElement)ClaudePrompt).Focus();
		}
	}

	private void AnimateSidePanel(bool open)
	{
		//IL_0000: Unknown result type (might be due to invalid IL or missing references)
		//IL_0005: Unknown result type (might be due to invalid IL or missing references)
		//IL_0013: Expected Obj, but got Unknown
		//IL_0032: Unknown result type (might be due to invalid IL or missing references)
		//IL_006c: Unknown result type (might be due to invalid IL or missing references)
		//IL_0071: Unknown result type (might be due to invalid IL or missing references)
		//IL_0076: Unknown result type (might be due to invalid IL or missing references)
		//IL_007e: Expected Obj, but got Unknown
		//IL_00c5: Unknown result type (might be due to invalid IL or missing references)
		//IL_00ca: Unknown result type (might be due to invalid IL or missing references)
		//IL_00cf: Unknown result type (might be due to invalid IL or missing references)
		//IL_00db: Expected Obj, but got Unknown
		QuadraticEase easingFunction = new QuadraticEase
		{
			EasingMode = (EasingMode)(open ? 1 : 0)
		};
		TimeSpan timeSpan = TimeSpan.FromMilliseconds(open ? 240 : 200);
		if (open && (int)((UIElement)SidePanel).Visibility != 0)
		{
			SidePanelSlide.X = 0.0 - _sidePanelWidth;
			((UIElement)SidePanel).Visibility = (Visibility)0;
		}
		DoubleAnimation val = new DoubleAnimation(open ? _sidePanelWidth : 0.0, new Duration(timeSpan))
		{
			EasingFunction = (IEasingFunction)(object)easingFunction
		};
		if (!open)
		{
			((Timeline)val).Completed += (object? _, EventArgs _) =>
			{
				if (!SidePanelToggles.Any((ToggleButton t) => t.IsChecked == true))
				{
					((UIElement)SidePanel).Visibility = (Visibility)2;
					((UIElement)ExplorerContent).Visibility = (Visibility)2;
					((UIElement)ClaudeContent).Visibility = (Visibility)2;
					((UIElement)ClientsContent).Visibility = (Visibility)2;
				}
			};
		}
		((UIElement)SidePanel).BeginAnimation(FrameworkElement.WidthProperty, (AnimationTimeline)(object)val);
		((Animatable)SidePanelSlide).BeginAnimation(TranslateTransform.XProperty, (AnimationTimeline)new DoubleAnimation(open ? 0.0 : (0.0 - _sidePanelWidth), new Duration(timeSpan))
		{
			EasingFunction = (IEasingFunction)(object)easingFunction
		});
	}

	private async void TerminateClient_Click(object sender, RoutedEventArgs e)
	{
		FrameworkElement val = (FrameworkElement)((sender is FrameworkElement) ? sender : null);
		if (val != null && val.DataContext is ClientEntry clientEntry && (int)MessageBox.Show((Window)(object)this, $"Force-close Roblox client {clientEntry.Pid}?\n\nAnything unsaved in the game is lost.", "Velocity", (MessageBoxButton)4, (MessageBoxImage)48, (MessageBoxResult)7) == 6)
		{
			await Velocity.TerminateClientAsync(clientEntry.Pid);
		}
	}

	private void ClaudePrompt_PreviewKeyDown(object sender, KeyEventArgs e)
	{
		//IL_0001: Unknown result type (might be due to invalid IL or missing references)
		//IL_0006: Unknown result type (might be due to invalid IL or missing references)
		//IL_0007: Unknown result type (might be due to invalid IL or missing references)
		//IL_000a: Invalid comparison between Unknown and I4
		//IL_000c: Unknown result type (might be due to invalid IL or missing references)
		//IL_0012: Invalid comparison between Unknown and I4
		//IL_0035: Unknown result type (might be due to invalid IL or missing references)
		//IL_003b: Invalid comparison between Unknown and I4
		//IL_001d: Unknown result type (might be due to invalid IL or missing references)
		//IL_0023: Unknown result type (might be due to invalid IL or missing references)
		//IL_003d: Unknown result type (might be due to invalid IL or missing references)
		//IL_0043: Unknown result type (might be due to invalid IL or missing references)
		Key key = e.Key;
		bool flag = (((int)key == 89 || (int)key == 145) ? true : false);
		if (flag && (Keyboard.Modifiers & ModifierKeys.Control) != 0)
		{
			((RoutedEventArgs)e).Handled = true;
			ShowClaudeCommandHelp();
		}
		else if ((int)e.Key == 6 && (Keyboard.Modifiers & ModifierKeys.Shift) == 0)
		{
			((RoutedEventArgs)e).Handled = true;
			SendToClaudeAsync();
		}
	}

	private void ShowClaudeCommandHelp()
	{
		((UIElement)ClaudeIntro).Visibility = (Visibility)2;
		AppendClaudeMessage("Slash commands\n\n/mcp — MCP server status\n/model sonnet — switch model for this turn\n/effort high — low, medium, high, xhigh, max\n/config thinking=false — change a setting\n/fast — toggle fast mode\n/<skill> — run any skill you have installed\n\nTerminal-only commands such as /login do not work here; use the account panel in Settings instead.", mine: false);
	}

	private void ClaudeModel_SelectionChanged(object sender, SelectionChangedEventArgs e)
	{
		if (((FrameworkElement)this).IsLoaded && !_loadingClaudeModels)
		{
			AppSettings.ClaudeModel = ModelValue(((Selector)ClaudeModelPicker).SelectedItem);
		}
	}

	private void ClaudeModel_TextChanged(object sender, RoutedEventArgs e)
	{
		if (((FrameworkElement)this).IsLoaded && !_loadingClaudeModels)
		{
			AppSettings.ClaudeModel = ModelValue(ClaudeModelPicker.Text?.Trim());
		}
	}

	private static string ModelValue(object? item)
	{
		if (!(item is string text) || text.Equals("Default", StringComparison.Ordinal))
		{
			return string.Empty;
		}
		int num = text.LastIndexOf('(');
		int num2 = text.LastIndexOf(')');
		if (num < 0 || num2 <= num)
		{
			return text.Trim();
		}
		int num3 = num + 1;
		return text.Substring(num3, num2 - num3).Trim();
	}

	private async Task InitializeClaudeModelsAsync()
	{
		RebuildModelList();
		if (ClaudeService.IsAvailable)
		{
			_claudeAliases = await Claude.GetModelsAsync();
			RebuildModelList();
			if (AppSettings.ClaudeKnownModels.Length == 0)
			{
				DiscoverClaudeVersionsAsync();
			}
		}
	}

	private async void ClaudeFindModels_Click(object sender, RoutedEventArgs e)
	{
		await DiscoverClaudeVersionsAsync();
	}

	private async Task DiscoverClaudeVersionsAsync()
	{
		if (!ClaudeService.IsAvailable || _discoveringModels)
		{
			return;
		}
		_discoveringModels = true;
		ClaudeStatus.Text = "Finding models…";
		try
		{
			string[] families = _claudeAliases.Where((string a) =>
			{
				bool flag = a.Length > 0 && !a.Contains('[');
				if (flag)
				{
					bool flag2;
					switch (a)
					{
					case "best":
					case "opusplan":
					case "default":
						flag2 = true;
						break;
					default:
						flag2 = false;
						break;
					}
					flag = !flag2;
				}
				return flag;
			}).ToArray();
			ClaudeService.ModelVersion[] array = await Claude.DiscoverVersionsAsync(families);
			AppSettings.ClaudeKnownModels = array.Select((ClaudeService.ModelVersion v) => v.Id + "|" + v.Label).ToArray();
			RebuildModelList();
			ClaudeStatus.Text = $"{array.Length} models available";
		}
		finally
		{
			_discoveringModels = false;
		}
	}

	private void RebuildModelList()
	{
		_loadingClaudeModels = true;
		try
		{
			List<string> list = new List<string> { "Default" };
			list.AddRange(_claudeAliases.Where((string a) => a.Length > 0));
			string[] claudeKnownModels = AppSettings.ClaudeKnownModels;
			for (int num = 0; num < claudeKnownModels.Length; num++)
			{
				string[] array = claudeKnownModels[num].Split('|', 2);
				if (array.Length == 2)
				{
					list.Add(array[1] + "  (" + array[0] + ")");
				}
			}
			((ItemsControl)ClaudeModelPicker).ItemsSource = list;
			string text = AppSettings.ClaudeModel ?? string.Empty;
			ClaudeModelPicker.Text = ((text.Length == 0) ? "Default" : LabelFor(text));
		}
		finally
		{
			_loadingClaudeModels = false;
		}
	}

	private string LabelFor(string model)
	{
		string[] claudeKnownModels = AppSettings.ClaudeKnownModels;
		for (int i = 0; i < claudeKnownModels.Length; i++)
		{
			string[] array = claudeKnownModels[i].Split('|', 2);
			if (array.Length == 2 && array[0] == model)
			{
				return array[1] + "  (" + array[0] + ")";
			}
		}
		return model;
	}

	private void ClaudeSend_Click(object sender, RoutedEventArgs e)
	{
		SendToClaudeAsync();
	}

	private void RestoreClaudeSession()
	{
		string claudeSessionId = AppSettings.ClaudeSessionId;
		if (claudeSessionId.Length == 0 || !ClaudeService.IsAvailable)
		{
			return;
		}
		ClaudeSessions.Message[] array = ClaudeSessions.Read(AppSettings.ScriptsFolder, claudeSessionId);
		if (array.Length != 0)
		{
			Claude.SessionId = claudeSessionId;
			((UIElement)ClaudeIntro).Visibility = (Visibility)2;
			ClaudeSessions.Message[] array2 = array;
			for (int i = 0; i < array2.Length; i++)
			{
				ClaudeSessions.Message message = array2[i];
				ShowClaudeMessage(message.Text, message.Mine);
			}
			ClaudeStatus.Text = "Resumed";
		}
	}

	private void ShowClaudeMessage(string text, bool mine)
	{
		if (mine)
		{
			AppendClaudeMessage(text, mine: true);
			return;
		}
		Panel claudeReply = AppendClaudeReply();
		Panel claudeReply2 = _claudeReply;
		string value = _claudeReplyText.ToString();
		_claudeReply = claudeReply;
		_claudeReplyText.Clear();
		_claudeReplyText.Append(text);
		RenderClaudeReply();
		_claudeReply = claudeReply2;
		_claudeReplyText.Clear();
		_claudeReplyText.Append(value);
	}

	private void ClaudeHistory_Click(object sender, RoutedEventArgs e)
	{
		//IL_0028: Unknown result type (might be due to invalid IL or missing references)
		//IL_002d: Unknown result type (might be due to invalid IL or missing references)
		//IL_0039: Unknown result type (might be due to invalid IL or missing references)
		//IL_0043: Expected Obj, but got Unknown
		//IL_0044: Expected Obj, but got Unknown
		//IL_0062: Unknown result type (might be due to invalid IL or missing references)
		//IL_0067: Unknown result type (might be due to invalid IL or missing references)
		//IL_0077: Expected Obj, but got Unknown
		//IL_008f: Unknown result type (might be due to invalid IL or missing references)
		//IL_0099: Expected Obj, but got Unknown
		//IL_00b3: Unknown result type (might be due to invalid IL or missing references)
		//IL_00bd: Expected Obj, but got Unknown
		ClaudeSessions.Summary[] array = ClaudeSessions.List(AppSettings.ScriptsFolder);
		if (array.Length == 0)
		{
			ClaudeStatus.Text = "No saved conversations";
			return;
		}
		ContextMenu val = new ContextMenu
		{
			Style = (Style)((FrameworkElement)this).FindResource((object)"DarkContextMenuStyle")
		};
		ClaudeSessions.Summary[] array2 = array;
		for (int i = 0; i < array2.Length; i++)
		{
			ClaudeSessions.Summary session = array2[i];
			MenuItem val2 = new MenuItem
			{
				Header = BuildSessionHeader(session)
			};
			string id = session.Id;
			val2.Click += (object _, RoutedEventArgs _) =>
			{
				LoadClaudeSession(id);
			};
			((ItemsControl)val).Items.Add((object)val2);
		}
		val.PlacementTarget = (UIElement)sender;
		val.Placement = (PlacementMode)2;
		val.IsOpen = true;
	}

	private StackPanel BuildSessionHeader(ClaudeSessions.Summary session)
	{
		//IL_0000: Unknown result type (might be due to invalid IL or missing references)
		//IL_0005: Unknown result type (might be due to invalid IL or missing references)
		//IL_000c: Unknown result type (might be due to invalid IL or missing references)
		//IL_0012: Unknown result type (might be due to invalid IL or missing references)
		//IL_0017: Unknown result type (might be due to invalid IL or missing references)
		//IL_0029: Unknown result type (might be due to invalid IL or missing references)
		//IL_0038: Unknown result type (might be due to invalid IL or missing references)
		//IL_0044: Unknown result type (might be due to invalid IL or missing references)
		//IL_004e: Expected Obj, but got Unknown
		//IL_004e: Unknown result type (might be due to invalid IL or missing references)
		//IL_005d: Unknown result type (might be due to invalid IL or missing references)
		//IL_0069: Unknown result type (might be due to invalid IL or missing references)
		//IL_0073: Expected Obj, but got Unknown
		//IL_0073: Unknown result type (might be due to invalid IL or missing references)
		//IL_007f: Expected Obj, but got Unknown
		//IL_0080: Unknown result type (might be due to invalid IL or missing references)
		//IL_0086: Unknown result type (might be due to invalid IL or missing references)
		//IL_008b: Unknown result type (might be due to invalid IL or missing references)
		//IL_0098: Unknown result type (might be due to invalid IL or missing references)
		//IL_00a7: Unknown result type (might be due to invalid IL or missing references)
		//IL_00ae: Unknown result type (might be due to invalid IL or missing references)
		//IL_00ba: Unknown result type (might be due to invalid IL or missing references)
		//IL_00c4: Expected Obj, but got Unknown
		//IL_00c4: Unknown result type (might be due to invalid IL or missing references)
		//IL_00d3: Unknown result type (might be due to invalid IL or missing references)
		//IL_00df: Unknown result type (might be due to invalid IL or missing references)
		//IL_00e9: Expected Obj, but got Unknown
		//IL_00e9: Unknown result type (might be due to invalid IL or missing references)
		//IL_00f5: Expected Obj, but got Unknown
		//IL_00f7: Expected Obj, but got Unknown
		StackPanel val = new StackPanel
		{
			Orientation = (Orientation)0
		};
		((Panel)val).Children.Add((UIElement)new TextBlock
		{
			Text = Humanise(session.Modified),
			Width = 74.0,
			FontFamily = (FontFamily)((FrameworkElement)this).FindResource((object)"BodyFont"),
			FontSize = 10.5,
			Foreground = (Brush)((FrameworkElement)this).FindResource((object)"TabForegroundBrush"),
			VerticalAlignment = (VerticalAlignment)1
		});
		((Panel)val).Children.Add((UIElement)new TextBlock
		{
			Text = session.Preview,
			MaxWidth = 320.0,
			TextTrimming = (TextTrimming)1,
			FontFamily = (FontFamily)((FrameworkElement)this).FindResource((object)"BodyFont"),
			FontSize = 11.5,
			Foreground = (Brush)((FrameworkElement)this).FindResource((object)"TabForegroundActiveBrush"),
			VerticalAlignment = (VerticalAlignment)1
		});
		return val;
	}

	private static string Humanise(DateTime when)
	{
		DateTime today = DateTime.Today;
		if (when.Date == today)
		{
			return when.ToString("HH:mm");
		}
		if (when.Date == today.AddDays(-1.0))
		{
			return "Yesterday";
		}
		if (when.Date > today.AddDays(-7.0))
		{
			return when.ToString("ddd HH:mm");
		}
		return when.ToString("d MMM");
	}

	private void LoadClaudeSession(string id)
	{
		AppSettings.ClaudeSessionId = id;
		((Panel)ClaudeMessages).Children.Clear();
		((Panel)ClaudeMessages).Children.Add((UIElement)(object)ClaudeIntro);
		((UIElement)ClaudeIntro).Visibility = (Visibility)0;
		RestoreClaudeSession();
	}

	private void ClaudeNewChat_Click(object sender, RoutedEventArgs e)
	{
		Claude.ResetConversation();
		AppSettings.ClaudeSessionId = string.Empty;
		((Panel)ClaudeMessages).Children.Clear();
		((UIElement)ClaudeIntro).Visibility = (Visibility)0;
		((Panel)ClaudeMessages).Children.Add((UIElement)(object)ClaudeIntro);
		ClaudeStatus.Text = string.Empty;
	}

	private async Task SendToClaudeAsync()
	{
		string text = ClaudePrompt.Text.Trim();
		if (text.Length == 0 || Claude.IsBusy)
		{
			return;
		}
		((UIElement)ClaudeIntro).Visibility = (Visibility)2;
		ClaudePrompt.Clear();
		AppendClaudeMessage(text, mine: true);
		_claudeReplyText.Clear();
		_claudeReply = AppendClaudeReply();
		ClaudeStatus.Text = "Thinking…";
		((UIElement)ClaudeSend).IsEnabled = false;
		StartClaudeRenderTimer();
		try
		{
			await Claude.SendAsync(text, AppSettings.ScriptsFolder, McpConfigPath(), AllowedClaudeTools(), AppSettings.ClaudeModel);
		}
		finally
		{
			DispatcherTimer? claudeRender = _claudeRender;
			if (claudeRender != null)
			{
				claudeRender.Stop();
			}
			RenderClaudeReply();
			((UIElement)ClaudeSend).IsEnabled = true;
			_claudeReply = null;
		}
	}

	private TextBlock AppendClaudeMessage(string text, bool mine)
	{
		//IL_0000: Unknown result type (might be due to invalid IL or missing references)
		//IL_0005: Unknown result type (might be due to invalid IL or missing references)
		//IL_000c: Unknown result type (might be due to invalid IL or missing references)
		//IL_0013: Unknown result type (might be due to invalid IL or missing references)
		//IL_001f: Unknown result type (might be due to invalid IL or missing references)
		//IL_0029: Expected Obj, but got Unknown
		//IL_0029: Unknown result type (might be due to invalid IL or missing references)
		//IL_0038: Unknown result type (might be due to invalid IL or missing references)
		//IL_004e: Unknown result type (might be due to invalid IL or missing references)
		//IL_0058: Expected Obj, but got Unknown
		//IL_0059: Expected Obj, but got Unknown
		//IL_0059: Unknown result type (might be due to invalid IL or missing references)
		//IL_005e: Unknown result type (might be due to invalid IL or missing references)
		//IL_0083: Unknown result type (might be due to invalid IL or missing references)
		//IL_008d: Unknown result type (might be due to invalid IL or missing references)
		//IL_00b2: Unknown result type (might be due to invalid IL or missing references)
		//IL_00bc: Unknown result type (might be due to invalid IL or missing references)
		//IL_00c6: Unknown result type (might be due to invalid IL or missing references)
		//IL_00d0: Unknown result type (might be due to invalid IL or missing references)
		//IL_00e6: Unknown result type (might be due to invalid IL or missing references)
		//IL_00f0: Unknown result type (might be due to invalid IL or missing references)
		//IL_00f8: Expected Obj, but got Unknown
		TextBlock val = new TextBlock
		{
			Text = text,
			TextWrapping = (TextWrapping)2,
			FontFamily = (FontFamily)((FrameworkElement)this).FindResource((object)"BodyFont"),
			FontSize = 11.5,
			Foreground = (Brush)((FrameworkElement)this).FindResource((object)(mine ? "TabForegroundActiveBrush" : "OutputPrintBrush"))
		};
		Border val2 = new Border
		{
			Margin = new Thickness(0.0, 0.0, 0.0, 10.0),
			Padding = new Thickness(9.0, 7.0, 9.0, 8.0),
			CornerRadius = new CornerRadius(5.0),
			Background = (Brush)(object)((!mine) ? Brushes.Transparent : ((SolidColorBrush)(Brush)((FrameworkElement)this).FindResource((object)"ChromeBackgroundBrush"))),
			Child = (UIElement)(object)val
		};
		((Panel)ClaudeMessages).Children.Add((UIElement)(object)val2);
		ClaudeScroller.ScrollToEnd();
		return val;
	}

	private Panel AppendClaudeReply()
	{
		//IL_0000: Unknown result type (might be due to invalid IL or missing references)
		//IL_0005: Unknown result type (might be due to invalid IL or missing references)
		//IL_002a: Unknown result type (might be due to invalid IL or missing references)
		//IL_0035: Expected Obj, but got Unknown
		StackPanel val = new StackPanel
		{
			Margin = new Thickness(0.0, 0.0, 0.0, 10.0)
		};
		((Panel)ClaudeMessages).Children.Add((UIElement)(object)val);
		ClaudeScroller.ScrollToEnd();
		return (Panel)(object)val;
	}

	private void StartClaudeRenderTimer()
	{
		//IL_0009: Unknown result type (might be due to invalid IL or missing references)
		//IL_000e: Unknown result type (might be due to invalid IL or missing references)
		//IL_0021: Expected Obj, but got Unknown
		if (_claudeRender == null)
		{
			_claudeRender = new DispatcherTimer
			{
				Interval = TimeSpan.FromMilliseconds(90L)
			};
		}
		_claudeRender.Tick -= OnClaudeRenderTick;
		_claudeRender.Tick += OnClaudeRenderTick;
		_claudeRender.Start();
	}

	private void OnClaudeRenderTick(object? sender, EventArgs e)
	{
		RenderClaudeReply();
	}

	private void RenderClaudeReply()
	{
		if (_claudeReply == null)
		{
			return;
		}
		_claudeReply.Children.Clear();
		foreach (var (text, flag) in MarkdownBlocks.Split(_claudeReplyText.ToString()))
		{
			if (text.Length == 0)
			{
				continue;
			}
			if (flag)
			{
				_claudeReply.Children.Add((UIElement)(object)BuildCodeBlock(text));
				continue;
			}
			foreach (UIElement item in MarkdownText.Build(text, MarkdownPalette))
			{
				_claudeReply.Children.Add(item);
			}
		}
		ClaudeScroller.ScrollToEnd();
	}

	private Border BuildCodeBlock(string code)
	{
		//IL_0014: Unknown result type (might be due to invalid IL or missing references)
		//IL_001a: Expected Obj, but got Unknown
		//IL_0020: Unknown result type (might be due to invalid IL or missing references)
		//IL_0025: Unknown result type (might be due to invalid IL or missing references)
		//IL_0026: Unknown result type (might be due to invalid IL or missing references)
		//IL_0035: Expected Obj, but got Unknown
		//IL_003b: Unknown result type (might be due to invalid IL or missing references)
		//IL_0040: Unknown result type (might be due to invalid IL or missing references)
		//IL_0041: Unknown result type (might be due to invalid IL or missing references)
		//IL_0050: Expected Obj, but got Unknown
		//IL_0050: Unknown result type (might be due to invalid IL or missing references)
		//IL_0055: Unknown result type (might be due to invalid IL or missing references)
		//IL_005c: Unknown result type (might be due to invalid IL or missing references)
		//IL_0063: Unknown result type (might be due to invalid IL or missing references)
		//IL_0064: Unknown result type (might be due to invalid IL or missing references)
		//IL_0069: Unknown result type (might be due to invalid IL or missing references)
		//IL_0075: Unknown result type (might be due to invalid IL or missing references)
		//IL_007b: Unknown result type (might be due to invalid IL or missing references)
		//IL_0085: Expected Obj, but got Unknown
		//IL_0085: Unknown result type (might be due to invalid IL or missing references)
		//IL_0094: Unknown result type (might be due to invalid IL or missing references)
		//IL_00a0: Unknown result type (might be due to invalid IL or missing references)
		//IL_00aa: Expected Obj, but got Unknown
		//IL_00aa: Unknown result type (might be due to invalid IL or missing references)
		//IL_00cf: Unknown result type (might be due to invalid IL or missing references)
		//IL_00de: Expected Obj, but got Unknown
		//IL_00df: Expected Obj, but got Unknown
		//IL_00f3: Unknown result type (might be due to invalid IL or missing references)
		//IL_00f8: Unknown result type (might be due to invalid IL or missing references)
		//IL_00ff: Unknown result type (might be due to invalid IL or missing references)
		//IL_0106: Unknown result type (might be due to invalid IL or missing references)
		//IL_012b: Unknown result type (might be due to invalid IL or missing references)
		//IL_0136: Expected Obj, but got Unknown
		//IL_0190: Unknown result type (might be due to invalid IL or missing references)
		//IL_0195: Unknown result type (might be due to invalid IL or missing references)
		//IL_01ba: Unknown result type (might be due to invalid IL or missing references)
		//IL_01c4: Unknown result type (might be due to invalid IL or missing references)
		//IL_01ce: Unknown result type (might be due to invalid IL or missing references)
		//IL_01d8: Unknown result type (might be due to invalid IL or missing references)
		//IL_01e4: Unknown result type (might be due to invalid IL or missing references)
		//IL_01ee: Expected Obj, but got Unknown
		//IL_01ee: Unknown result type (might be due to invalid IL or missing references)
		//IL_01fa: Unknown result type (might be due to invalid IL or missing references)
		//IL_0204: Expected Obj, but got Unknown
		//IL_0204: Unknown result type (might be due to invalid IL or missing references)
		//IL_020e: Unknown result type (might be due to invalid IL or missing references)
		//IL_0218: Unknown result type (might be due to invalid IL or missing references)
		//IL_0220: Expected Obj, but got Unknown
		Grid val = new Grid();
		val.RowDefinitions.Add(new RowDefinition
		{
			Height = GridLength.Auto
		});
		val.RowDefinitions.Add(new RowDefinition
		{
			Height = GridLength.Auto
		});
		ScrollViewer val2 = new ScrollViewer
		{
			HorizontalScrollBarVisibility = (ScrollBarVisibility)1,
			VerticalScrollBarVisibility = (ScrollBarVisibility)0,
			Content = (object)new TextBlock
			{
				Text = code,
				FontFamily = new FontFamily("Cascadia Code, Consolas, monospace"),
				FontSize = 11.0,
				Foreground = (Brush)((FrameworkElement)this).FindResource((object)"TabForegroundActiveBrush"),
				Margin = new Thickness(9.0, 8.0, 9.0, 8.0)
			}
		};
		Grid.SetRow((UIElement)(object)val2, 0);
		((Panel)val).Children.Add((UIElement)(object)val2);
		StackPanel val3 = new StackPanel
		{
			Orientation = (Orientation)0,
			HorizontalAlignment = (HorizontalAlignment)2,
			Margin = new Thickness(0.0, 0.0, 6.0, 5.0)
		};
		((Panel)val3).Children.Add((UIElement)(object)CodeAction("Copy", () =>
		{
			try
			{
				Clipboard.SetText(code);
			}
			catch (ExternalException)
			{
			}
		}));
		((Panel)val3).Children.Add((UIElement)(object)CodeAction("Insert", () =>
		{
			ReplaceActiveScriptAsync(code);
		}));
		Grid.SetRow((UIElement)(object)val3, 1);
		((Panel)val).Children.Add((UIElement)(object)val3);
		return new Border
		{
			Margin = new Thickness(0.0, 2.0, 0.0, 8.0),
			CornerRadius = new CornerRadius(4.0),
			Background = (Brush)((FrameworkElement)this).FindResource((object)"BackgroundPrimaryBrush"),
			BorderBrush = (Brush)((FrameworkElement)this).FindResource((object)"BorderStrokeBrush"),
			BorderThickness = new Thickness(1.0),
			Child = (UIElement)(object)val
		};
	}

	private Button CodeAction(string label, Action onClick)
	{
		//IL_000d: Unknown result type (might be due to invalid IL or missing references)
		//IL_0012: Unknown result type (might be due to invalid IL or missing references)
		//IL_0019: Unknown result type (might be due to invalid IL or missing references)
		//IL_003e: Unknown result type (might be due to invalid IL or missing references)
		//IL_0048: Unknown result type (might be due to invalid IL or missing references)
		//IL_0054: Unknown result type (might be due to invalid IL or missing references)
		//IL_005e: Expected Obj, but got Unknown
		//IL_005e: Unknown result type (might be due to invalid IL or missing references)
		//IL_0066: Unknown result type (might be due to invalid IL or missing references)
		//IL_0070: Expected Obj, but got Unknown
		//IL_0071: Expected Obj, but got Unknown
		Button val = new Button
		{
			Content = label,
			Margin = new Thickness(8.0, 0.0, 0.0, 0.0),
			Style = (Style)((FrameworkElement)this).FindResource((object)"SettingsTextButtonStyle")
		};
		((ButtonBase)val).Click += (object _, RoutedEventArgs _) =>
		{
			onClick();
		};
		return val;
	}

	private void OnClaudeText(string delta)
	{
		((DispatcherObject)this).Dispatcher.Invoke((Action)(() =>
		{
			if (_claudeReply != null)
			{
				_claudeReplyText.Append(delta);
			}
		}));
	}

	private async Task<string?> ReadActiveScriptAsync()
	{
		string id = ((DispatcherObject)this).Dispatcher.Invoke<string>((Func<string>)(() => _activeTab?.Id));
		if (id == null)
		{
			return null;
		}
		return await ((DispatcherObject)this).Dispatcher.Invoke<Task<string>>((Func<Task<string>>)(() => Editor.GetContentAsync(id)));
	}

	private async Task<bool> ReplaceActiveScriptAsync(string content)
	{
		string id = ((DispatcherObject)this).Dispatcher.Invoke<string>((Func<string>)(() => _activeTab?.Id));
		if (id == null)
		{
			return false;
		}
		await ((DispatcherObject)this).Dispatcher.Invoke<Task>((Func<Task>)(() => Editor.SetContentAsync(id, content)));
		((DispatcherObject)this).Dispatcher.Invoke((Action)(() =>
		{
			if (_activeTab != null)
			{
				_activeTab.IsDirty = true;
			}
		}));
		return true;
	}

	private async Task<string> ExecuteForMcpAsync()
	{
		int before = ((DispatcherObject)this).Dispatcher.Invoke<int>((Func<int>)(() => Output.Count));
		await ((DispatcherObject)this).Dispatcher.InvokeAsync((Action)(() =>
		{
			//IL_000c: Unknown result type (might be due to invalid IL or missing references)
			//IL_0016: Expected Obj, but got Unknown
			ExecuteButton_Click(this, new RoutedEventArgs());
		}));
		await Task.Delay(700);
		return ((DispatcherObject)this).Dispatcher.Invoke<string>((Func<string>)(() =>
		{
			string text = Output.ToTextFrom(before);
			return (text.Length <= 0) ? "Executed. The client printed nothing." : text;
		}));
	}

	private string DescribeClients()
	{
		return ((DispatcherObject)this).Dispatcher.Invoke<string>((Func<string>)(() =>
		{
			if (Velocity.Clients.Count == 0)
			{
				return "No Roblox clients are running.";
			}
			IEnumerable<string> values = Velocity.Clients.Select((ClientEntry c) => $"pid {c.Pid} — {c.Title}, {c.MemoryText}, {c.StatusText}, inject {(c.InjectEnabled ? "on" : "off")}, execute {(c.ExecuteEnabled ? "on" : "off")}");
			return string.Join("\n", values);
		}));
	}

	private string? McpConfigPath()
	{
		if (!AppSettings.ClaudeToolsEnabled)
		{
			return null;
		}
		return VelocityMcpServer.WriteConfig(AppSettings.McpServersJson);
	}

	private string[] AllowedClaudeTools()
	{
		if (!AppSettings.ClaudeToolsEnabled)
		{
			return Array.Empty<string>();
		}
		IEnumerable<string> source = VelocityMcpServer.QualifiedToolNames;
		if (!AppSettings.ClaudeMayExecute)
		{
			source = source.Where((string t) => !t.EndsWith("__execute", StringComparison.Ordinal));
		}
		return source.ToArray();
	}

	private void OnClaudeToolUsed(string tool)
	{
		((DispatcherObject)this).Dispatcher.Invoke<string>((Func<string>)(() => ClaudeStatus.Text = "Using " + tool + "…"));
	}

	private void OnClaudeTurnCompleted(double costUsd, string? result)
	{
		((DispatcherObject)this).Dispatcher.Invoke((Action)(() =>
		{
			if (_claudeReplyText.Length == 0 && !string.IsNullOrWhiteSpace(result))
			{
				_claudeReplyText.Append(result);
			}
			DispatcherTimer? claudeRender = _claudeRender;
			if (claudeRender != null)
			{
				claudeRender.Stop();
			}
			RenderClaudeReply();
			ClaudeStatus.Text = ((costUsd > 0.0) ? $"${costUsd:0.0000} this turn" : string.Empty);
		}));
	}

	private void RefreshScripts_Click(object sender, RoutedEventArgs e)
	{
		Scripts.Refresh();
	}

	private void RevealScriptsFolder_Click(object sender, RoutedEventArgs e)
	{
		//IL_007b: Unknown result type (might be due to invalid IL or missing references)
		try
		{
			Directory.CreateDirectory(Scripts.RootPath);
			Process.Start(new ProcessStartInfo(Scripts.RootPath)
			{
				UseShellExecute = true
			});
		}
		catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException || ex is Win32Exception) ? true : false)
		{
			MessageBox.Show((Window)(object)this, "Could not open the scripts folder:\n" + ex.Message, "Velocity", (MessageBoxButton)0, (MessageBoxImage)48);
		}
	}

	private async void ScriptsTree_MouseDoubleClick(object sender, MouseButtonEventArgs e)
	{
		object originalSource = ((RoutedEventArgs)e).OriginalSource;
		DependencyObject val = (DependencyObject)((originalSource is DependencyObject) ? originalSource : null);
		if (val != null && FindAncestor<TreeViewItem>(val) != null && ScriptsTree.SelectedItem is ScriptNode { IsDirectory: false } scriptNode)
		{
			((RoutedEventArgs)e).Handled = true;
			await OpenPathAsync(scriptNode.FullPath);
		}
	}

	private async void ScriptsTree_KeyDown(object sender, KeyEventArgs e)
	{
		if ((int)e.Key == 6 && ScriptsTree.SelectedItem is ScriptNode scriptNode)
		{
			((RoutedEventArgs)e).Handled = true;
			if (scriptNode.IsDirectory)
			{
				scriptNode.IsExpanded = !scriptNode.IsExpanded;
			}
			else
			{
				await OpenPathAsync(scriptNode.FullPath);
			}
		}
	}

	private static T? FindAncestor<T>(DependencyObject? start) where T : DependencyObject
	{
		while (start != null && !(start is T))
		{
			start = VisualTreeHelper.GetParent(start);
		}
		return (T)(object)((start is T) ? start : null);
	}

	private void Minimize_Click(object sender, RoutedEventArgs e)
	{
		((Window)this).WindowState = (WindowState)1;
	}

	private void Maximize_Click(object sender, RoutedEventArgs e)
	{
		//IL_0002: Unknown result type (might be due to invalid IL or missing references)
		//IL_0008: Invalid comparison between Unknown and I4
		((Window)this).WindowState = (WindowState)(((int)((Window)this).WindowState != 2) ? 2 : 0);
	}

	private void Close_Click(object sender, RoutedEventArgs e)
	{
		((Window)this).Close();
	}

	private void Window_StateChanged(object sender, EventArgs e)
	{
		//IL_0001: Unknown result type (might be due to invalid IL or missing references)
		//IL_0007: Invalid comparison between Unknown and I4
		//IL_002c: Unknown result type (might be due to invalid IL or missing references)
		//IL_001c: Unknown result type (might be due to invalid IL or missing references)
		//IL_0058: Unknown result type (might be due to invalid IL or missing references)
		//IL_0048: Unknown result type (might be due to invalid IL or missing references)
		bool flag = (int)((Window)this).WindowState == 2;
		((FrameworkElement)RootBorder).Margin = (flag ? new Thickness(7.0) : new Thickness(0.0));
		RootBorder.BorderThickness = (flag ? new Thickness(0.0) : new Thickness(1.0));
		((ContentControl)MaximizeButton).Content = (flag ? "\ue923" : "\ue922");
	}

	protected override void OnClosing(CancelEventArgs e)
	{
		base.OnClosing(e);
		if (_closeConfirmed)
		{
			FinishShutdown();
			return;
		}
		e.Cancel = true;
		PrepareThenCloseAsync();
	}

	private async Task PrepareThenCloseAsync()
	{
		if (!AppSettings.SaveScripts)
		{
			EditorTab[] array = Tabs.Where((EditorTab t) => t.IsDirty).ToArray();
			foreach (EditorTab tab in array)
			{
				if (!(await ConfirmDiscardAsync(tab)))
				{
					return;
				}
				tab.IsDirty = false;
			}
		}
		await SaveSessionAsync();
		_closeConfirmed = true;
		await ((DispatcherObject)this).Dispatcher.InvokeAsync((Action)base.Close, (DispatcherPriority)4);
	}

	private void FinishShutdown()
	{
		if (_settingsSave.IsEnabled)
		{
			_settingsSave.Stop();
			AppSettings.Save();
		}
		Scripts.Dispose();
		Velocity.Dispose();
		Lsp.Dispose();
		Ai.Dispose();
		Copilot.Dispose();
		Claude.Dispose();
		Mcp.Dispose();
	}

	private async Task SaveSessionAsync()
	{
		if (!AppSettings.SaveScripts)
		{
			SessionStore.Clear();
			return;
		}
		List<SessionStore.TabState> states = new List<SessionStore.TabState>();
		foreach (EditorTab tab in Tabs)
		{
			List<SessionStore.TabState> list = states;
			SessionStore.TabState tabState = new SessionStore.TabState
			{
				FilePath = tab.FilePath
			};
			SessionStore.TabState tabState2 = tabState;
			tabState2.Content = await Editor.GetContentAsync(tab.Id);
			tabState.IsDirty = tab.IsDirty;
			tabState.IsActive = tab == _activeTab;
			list.Add(tabState);
		}
		SessionStore.Save(states);
	}

	private async Task<bool> RestoreSessionAsync()
	{
		if (!AppSettings.SaveScripts)
		{
			return false;
		}
		List<SessionStore.TabState> list = SessionStore.Load();
		if (list.Count == 0)
		{
			return false;
		}
		EditorTab toActivate = null;
		int dropped = 0;
		foreach (SessionStore.TabState state in list)
		{
			bool missing = state.FilePath != null && !File.Exists(state.FilePath);
			if (missing && !state.IsDirty)
			{
				dropped++;
				continue;
			}
			EditorTab tab = new EditorTab(missing ? null : state.FilePath);
			Tabs.Add(tab);
			await Editor.OpenTabAsync(tab.Id, "lua", state.Content);
			tab.IsDirty = missing || state.IsDirty;
			if (missing)
			{
				Output.Warning(IOPath.GetFileName(state.FilePath) + " no longer exists — kept your unsaved changes as an untitled tab.");
			}
			if (state.IsActive)
			{
				toActivate = tab;
			}
		}
		if (dropped > 0)
		{
			Output.Info($"Skipped {dropped} tab{((dropped == 1) ? "" : "s")} whose file no longer exists.");
		}
		if (Tabs.Count == 0)
		{
			return false;
		}
		await ActivateTabAsync(toActivate ?? Tabs.LastOrDefault());
		Output.Info($"Restored {Tabs.Count} script tab{((Tabs.Count == 1) ? "" : "s")}.");
		return true;
	}

	[DebuggerNonUserCode]
	[GeneratedCode("PresentationBuildTasks", "10.0.12.0")]
	internal Delegate _CreateDelegate(Type delegateType, string handler)
	{
		return Delegate.CreateDelegate(delegateType, this, handler);
	}

	[DebuggerNonUserCode]
	[GeneratedCode("PresentationBuildTasks", "10.0.12.0")]
	[EditorBrowsable(EditorBrowsableState.Never)]
	void IComponentConnector.Connect(int connectionId, object target)
	{
		//IL_010f: Unknown result type (might be due to invalid IL or missing references)
		//IL_0119: Expected Obj, but got Unknown
		//IL_011b: Unknown result type (might be due to invalid IL or missing references)
		//IL_0127: Unknown result type (might be due to invalid IL or missing references)
		//IL_0131: Expected Obj, but got Unknown
		//IL_0134: Unknown result type (might be due to invalid IL or missing references)
		//IL_013e: Expected Obj, but got Unknown
		//IL_014b: Unknown result type (might be due to invalid IL or missing references)
		//IL_0155: Expected Obj, but got Unknown
		//IL_0157: Unknown result type (might be due to invalid IL or missing references)
		//IL_0163: Unknown result type (might be due to invalid IL or missing references)
		//IL_016d: Expected Obj, but got Unknown
		//IL_0170: Unknown result type (might be due to invalid IL or missing references)
		//IL_017a: Expected Obj, but got Unknown
		//IL_0187: Unknown result type (might be due to invalid IL or missing references)
		//IL_0191: Expected Obj, but got Unknown
		//IL_019e: Unknown result type (might be due to invalid IL or missing references)
		//IL_01a8: Expected Obj, but got Unknown
		//IL_01ab: Unknown result type (might be due to invalid IL or missing references)
		//IL_01b5: Expected Obj, but got Unknown
		//IL_01c2: Unknown result type (might be due to invalid IL or missing references)
		//IL_01cc: Expected Obj, but got Unknown
		//IL_01d9: Unknown result type (might be due to invalid IL or missing references)
		//IL_01e3: Expected Obj, but got Unknown
		//IL_01e6: Unknown result type (might be due to invalid IL or missing references)
		//IL_01f0: Expected Obj, but got Unknown
		//IL_01fd: Unknown result type (might be due to invalid IL or missing references)
		//IL_0207: Expected Obj, but got Unknown
		//IL_0214: Unknown result type (might be due to invalid IL or missing references)
		//IL_021e: Expected Obj, but got Unknown
		//IL_0221: Unknown result type (might be due to invalid IL or missing references)
		//IL_022b: Expected Obj, but got Unknown
		//IL_0238: Unknown result type (might be due to invalid IL or missing references)
		//IL_0242: Expected Obj, but got Unknown
		//IL_024f: Unknown result type (might be due to invalid IL or missing references)
		//IL_0259: Expected Obj, but got Unknown
		//IL_025c: Unknown result type (might be due to invalid IL or missing references)
		//IL_0266: Expected Obj, but got Unknown
		//IL_0273: Unknown result type (might be due to invalid IL or missing references)
		//IL_027d: Expected Obj, but got Unknown
		//IL_028a: Unknown result type (might be due to invalid IL or missing references)
		//IL_0294: Expected Obj, but got Unknown
		//IL_0297: Unknown result type (might be due to invalid IL or missing references)
		//IL_02a1: Expected Obj, but got Unknown
		//IL_02a4: Unknown result type (might be due to invalid IL or missing references)
		//IL_02ae: Expected Obj, but got Unknown
		//IL_02b1: Unknown result type (might be due to invalid IL or missing references)
		//IL_02bb: Expected Obj, but got Unknown
		//IL_02be: Unknown result type (might be due to invalid IL or missing references)
		//IL_02c8: Expected Obj, but got Unknown
		//IL_02ca: Unknown result type (might be due to invalid IL or missing references)
		//IL_02d6: Unknown result type (might be due to invalid IL or missing references)
		//IL_02e0: Expected Obj, but got Unknown
		//IL_02e2: Unknown result type (might be due to invalid IL or missing references)
		//IL_02ee: Unknown result type (might be due to invalid IL or missing references)
		//IL_02f8: Expected Obj, but got Unknown
		//IL_02fb: Unknown result type (might be due to invalid IL or missing references)
		//IL_0305: Expected Obj, but got Unknown
		//IL_0312: Unknown result type (might be due to invalid IL or missing references)
		//IL_031c: Expected Obj, but got Unknown
		//IL_0329: Unknown result type (might be due to invalid IL or missing references)
		//IL_0333: Expected Obj, but got Unknown
		//IL_0335: Unknown result type (might be due to invalid IL or missing references)
		//IL_0341: Unknown result type (might be due to invalid IL or missing references)
		//IL_034b: Expected Obj, but got Unknown
		//IL_034e: Unknown result type (might be due to invalid IL or missing references)
		//IL_0358: Expected Obj, but got Unknown
		//IL_035b: Unknown result type (might be due to invalid IL or missing references)
		//IL_0365: Expected Obj, but got Unknown
		//IL_0372: Unknown result type (might be due to invalid IL or missing references)
		//IL_037c: Expected Obj, but got Unknown
		//IL_0389: Unknown result type (might be due to invalid IL or missing references)
		//IL_0393: Expected Obj, but got Unknown
		//IL_0395: Unknown result type (might be due to invalid IL or missing references)
		//IL_03a1: Unknown result type (might be due to invalid IL or missing references)
		//IL_03ab: Expected Obj, but got Unknown
		//IL_03ad: Unknown result type (might be due to invalid IL or missing references)
		//IL_03b9: Unknown result type (might be due to invalid IL or missing references)
		//IL_03c3: Expected Obj, but got Unknown
		//IL_03c5: Unknown result type (might be due to invalid IL or missing references)
		//IL_03d1: Unknown result type (might be due to invalid IL or missing references)
		//IL_03db: Expected Obj, but got Unknown
		//IL_03de: Unknown result type (might be due to invalid IL or missing references)
		//IL_03e8: Expected Obj, but got Unknown
		//IL_03eb: Unknown result type (might be due to invalid IL or missing references)
		//IL_03f5: Expected Obj, but got Unknown
		//IL_03f8: Unknown result type (might be due to invalid IL or missing references)
		//IL_0402: Expected Obj, but got Unknown
		//IL_0405: Unknown result type (might be due to invalid IL or missing references)
		//IL_040f: Expected Obj, but got Unknown
		//IL_041c: Unknown result type (might be due to invalid IL or missing references)
		//IL_0426: Expected Obj, but got Unknown
		//IL_0429: Unknown result type (might be due to invalid IL or missing references)
		//IL_0433: Expected Obj, but got Unknown
		//IL_0436: Unknown result type (might be due to invalid IL or missing references)
		//IL_0440: Expected Obj, but got Unknown
		//IL_044d: Unknown result type (might be due to invalid IL or missing references)
		//IL_0457: Expected Obj, but got Unknown
		//IL_045a: Unknown result type (might be due to invalid IL or missing references)
		//IL_0464: Expected Obj, but got Unknown
		//IL_0467: Unknown result type (might be due to invalid IL or missing references)
		//IL_0471: Expected Obj, but got Unknown
		//IL_047e: Unknown result type (might be due to invalid IL or missing references)
		//IL_0488: Expected Obj, but got Unknown
		//IL_048b: Unknown result type (might be due to invalid IL or missing references)
		//IL_0495: Expected Obj, but got Unknown
		//IL_0497: Unknown result type (might be due to invalid IL or missing references)
		//IL_04a3: Unknown result type (might be due to invalid IL or missing references)
		//IL_04ad: Expected Obj, but got Unknown
		//IL_04b0: Unknown result type (might be due to invalid IL or missing references)
		//IL_04ba: Expected Obj, but got Unknown
		//IL_04e4: Unknown result type (might be due to invalid IL or missing references)
		//IL_04ee: Expected Obj, but got Unknown
		//IL_04f1: Unknown result type (might be due to invalid IL or missing references)
		//IL_04fb: Expected Obj, but got Unknown
		//IL_04fd: Unknown result type (might be due to invalid IL or missing references)
		//IL_0509: Unknown result type (might be due to invalid IL or missing references)
		//IL_0513: Expected Obj, but got Unknown
		//IL_0515: Unknown result type (might be due to invalid IL or missing references)
		//IL_0521: Unknown result type (might be due to invalid IL or missing references)
		//IL_052b: Expected Obj, but got Unknown
		//IL_052d: Unknown result type (might be due to invalid IL or missing references)
		//IL_0539: Unknown result type (might be due to invalid IL or missing references)
		//IL_0543: Expected Obj, but got Unknown
		//IL_0545: Unknown result type (might be due to invalid IL or missing references)
		//IL_0551: Unknown result type (might be due to invalid IL or missing references)
		//IL_055b: Expected Obj, but got Unknown
		//IL_055d: Unknown result type (might be due to invalid IL or missing references)
		//IL_0569: Unknown result type (might be due to invalid IL or missing references)
		//IL_0573: Expected Obj, but got Unknown
		//IL_0576: Unknown result type (might be due to invalid IL or missing references)
		//IL_0580: Expected Obj, but got Unknown
		//IL_058d: Unknown result type (might be due to invalid IL or missing references)
		//IL_0597: Expected Obj, but got Unknown
		//IL_059a: Unknown result type (might be due to invalid IL or missing references)
		//IL_05a4: Expected Obj, but got Unknown
		//IL_05a7: Unknown result type (might be due to invalid IL or missing references)
		//IL_05b1: Expected Obj, but got Unknown
		//IL_05b3: Unknown result type (might be due to invalid IL or missing references)
		//IL_05bf: Unknown result type (might be due to invalid IL or missing references)
		//IL_05c9: Expected Obj, but got Unknown
		//IL_05cb: Unknown result type (might be due to invalid IL or missing references)
		//IL_05d7: Unknown result type (might be due to invalid IL or missing references)
		//IL_05e1: Expected Obj, but got Unknown
		//IL_05e3: Unknown result type (might be due to invalid IL or missing references)
		//IL_05ef: Unknown result type (might be due to invalid IL or missing references)
		//IL_05f9: Expected Obj, but got Unknown
		//IL_05fc: Unknown result type (might be due to invalid IL or missing references)
		//IL_0606: Expected Obj, but got Unknown
		//IL_0609: Unknown result type (might be due to invalid IL or missing references)
		//IL_0613: Expected Obj, but got Unknown
		//IL_0616: Unknown result type (might be due to invalid IL or missing references)
		//IL_0620: Expected Obj, but got Unknown
		//IL_0623: Unknown result type (might be due to invalid IL or missing references)
		//IL_062d: Expected Obj, but got Unknown
		//IL_0630: Unknown result type (might be due to invalid IL or missing references)
		//IL_063a: Expected Obj, but got Unknown
		switch (connectionId)
		{
		case 1:
			((Window)(MainWindow)target).StateChanged += Window_StateChanged;
			break;
		case 2:
			RootBorder = (Border)target;
			break;
		case 3:
			((ButtonBase)(Button)target).Click += Minimize_Click;
			break;
		case 4:
			MaximizeButton = (Button)target;
			((ButtonBase)MaximizeButton).Click += Maximize_Click;
			break;
		case 5:
			((ButtonBase)(Button)target).Click += Close_Click;
			break;
		case 6:
			ExplorerToggle = (ToggleButton)target;
			ExplorerToggle.Checked += SidePanelToggle_Changed;
			ExplorerToggle.Unchecked += SidePanelToggle_Changed;
			break;
		case 7:
			HubToggle = (ToggleButton)target;
			HubToggle.Checked += PageToggle_Changed;
			HubToggle.Unchecked += PageToggle_Changed;
			break;
		case 8:
			ClaudeToggle = (ToggleButton)target;
			ClaudeToggle.Checked += SidePanelToggle_Changed;
			ClaudeToggle.Unchecked += SidePanelToggle_Changed;
			break;
		case 9:
			ClientsToggle = (ToggleButton)target;
			ClientsToggle.Checked += SidePanelToggle_Changed;
			ClientsToggle.Unchecked += SidePanelToggle_Changed;
			break;
		case 10:
			SettingsToggle = (ToggleButton)target;
			SettingsToggle.Checked += PageToggle_Changed;
			SettingsToggle.Unchecked += PageToggle_Changed;
			break;
		case 11:
			SidePanel = (Border)target;
			break;
		case 12:
			SidePanelContent = (Border)target;
			break;
		case 13:
			SidePanelSlide = (TranslateTransform)target;
			break;
		case 14:
			ExplorerContent = (Grid)target;
			break;
		case 15:
			((ButtonBase)(Button)target).Click += RevealScriptsFolder_Click;
			break;
		case 16:
			((ButtonBase)(Button)target).Click += RefreshScripts_Click;
			break;
		case 17:
			ScriptsTree = (TreeView)target;
			((Control)ScriptsTree).MouseDoubleClick += ScriptsTree_MouseDoubleClick;
			((UIElement)ScriptsTree).KeyDown += ScriptsTree_KeyDown;
			break;
		case 18:
			((Hyperlink)target).Click += NewTab_Click;
			break;
		case 19:
			ClaudeContent = (Grid)target;
			break;
		case 20:
			ClaudeModelPicker = (ComboBox)target;
			((Selector)ClaudeModelPicker).SelectionChanged += ClaudeModel_SelectionChanged;
			((UIElement)ClaudeModelPicker).LostFocus += ClaudeModel_TextChanged;
			break;
		case 21:
			((ButtonBase)(Button)target).Click += ClaudeFindModels_Click;
			break;
		case 22:
			((ButtonBase)(Button)target).Click += ClaudeHistory_Click;
			break;
		case 23:
			((ButtonBase)(Button)target).Click += ClaudeNewChat_Click;
			break;
		case 24:
			ClaudeScroller = (ScrollViewer)target;
			break;
		case 25:
			ClaudeMessages = (StackPanel)target;
			break;
		case 26:
			ClaudeIntro = (StackPanel)target;
			break;
		case 27:
			ClaudePrompt = (TextBox)target;
			((UIElement)ClaudePrompt).PreviewKeyDown += ClaudePrompt_PreviewKeyDown;
			break;
		case 28:
			ClaudeStatus = (TextBlock)target;
			break;
		case 29:
			ClaudeSend = (Button)target;
			((ButtonBase)ClaudeSend).Click += ClaudeSend_Click;
			break;
		case 30:
			ClientsContent = (Grid)target;
			break;
		case 32:
			SidePanelResizer = (Thumb)target;
			SidePanelResizer.DragDelta += SidePanelResizer_DragDelta;
			break;
		case 33:
			OutputRow = (RowDefinition)target;
			break;
		case 36:
			((ButtonBase)(Button)target).Click += NewTab_Click;
			break;
		case 37:
			EditorHost = (Grid)target;
			break;
		case 38:
			Editor = (MonacoEditor)target;
			break;
		case 39:
			SettingsPage = (SettingsView)target;
			break;
		case 40:
			HubPage = (ScriptHubView)target;
			break;
		case 41:
			OutputSplitter = (GridSplitter)target;
			break;
		case 42:
			ActionBar = (Border)target;
			break;
		case 43:
			((ButtonBase)(Button)target).Click += ExecuteButton_Click;
			break;
		case 44:
			((ButtonBase)(Button)target).Click += ClearScript_Click;
			break;
		case 45:
			((ButtonBase)(Button)target).Click += OpenFile_Click;
			break;
		case 46:
			((ButtonBase)(Button)target).Click += SaveScript_Click;
			break;
		case 47:
			((ButtonBase)(Button)target).Click += InjectButton_Click;
			break;
		case 48:
			ConsoleToggleButton = (Button)target;
			((ButtonBase)ConsoleToggleButton).Click += ToggleConsole_Click;
			break;
		case 49:
			ConsoleChevron = (System.Windows.Shapes.Path)target;
			break;
		case 50:
			ConsolePanel = (Grid)target;
			break;
		case 51:
			((ButtonBase)(Button)target).Click += ClearOutput_Click;
			break;
		case 52:
			((ButtonBase)(Button)target).Click += CopyOutput_Click;
			break;
		case 53:
			((ButtonBase)(Button)target).Click += SaveOutput_Click;
			break;
		case 54:
			ConsoleBody = (Grid)target;
			break;
		case 55:
			OutputScroller = (ScrollViewer)target;
			break;
		case 56:
			StatusLanguage = (TextBlock)target;
			break;
		case 57:
			StatusCursor = (TextBlock)target;
			break;
		case 58:
			StatusAttached = (TextBlock)target;
			break;
		default:
			_contentLoaded = true;
			break;
		}
	}

	[DebuggerNonUserCode]
	[GeneratedCode("PresentationBuildTasks", "10.0.12.0")]
	[EditorBrowsable(EditorBrowsableState.Never)]
	void IStyleConnector.Connect(int connectionId, object target)
	{
		//IL_001f: Unknown result type (might be due to invalid IL or missing references)
		//IL_002b: Unknown result type (might be due to invalid IL or missing references)
		//IL_0035: Expected Obj, but got Unknown
		//IL_0037: Unknown result type (might be due to invalid IL or missing references)
		//IL_0043: Unknown result type (might be due to invalid IL or missing references)
		//IL_004d: Expected Obj, but got Unknown
		//IL_004e: Unknown result type (might be due to invalid IL or missing references)
		//IL_005a: Unknown result type (might be due to invalid IL or missing references)
		//IL_0064: Expected Obj, but got Unknown
		//IL_0066: Unknown result type (might be due to invalid IL or missing references)
		//IL_0072: Unknown result type (might be due to invalid IL or missing references)
		//IL_007c: Expected Obj, but got Unknown
		switch (connectionId)
		{
		case 31:
			((ButtonBase)(Button)target).Click += TerminateClient_Click;
			break;
		case 34:
			((ButtonBase)(ToggleButton)target).Click += Tab_Click;
			((UIElement)(ToggleButton)target).MouseDown += Tab_MouseDown;
			break;
		case 35:
			((ButtonBase)(Button)target).Click += CloseTab_Click;
			break;
		case 32:
		case 33:
			break;
		}
	}

	[CompilerGenerated]
	[DebuggerHidden]
	private void _003C_003En__0(KeyEventArgs e)
	{
		base.OnPreviewKeyDown(e);
	}
}
