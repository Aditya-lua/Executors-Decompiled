using System;
using System.CodeDom.Compiler;
using System.Collections;
using System.Collections.Generic;
using System.ComponentModel;
using System.Configuration;
using System.Diagnostics;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Net.Http;
using System.Reflection;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Controls.Primitives;
using System.Windows.Forms;
using System.Windows.Input;
using System.Windows.Interop;
using System.Windows.Markup;
using System.Windows.Media;
using System.Windows.Media.Animation;
using System.Windows.Media.Effects;
using System.Windows.Shapes;
using Microsoft.Web.WebView2.Core;
using Microsoft.Web.WebView2.Wpf;
using Newtonsoft.Json;
using SolaraUI.Properties;
using Wpf.Ui.Controls;

namespace SolaraUI;

public class Home : Page, IComponentConnector
{
	private Button _addTabButton;

	private int internalCount;

	private MainWindow _mainWindow;

	private Dictionary<TabItemControl, WebView2> _tabWebViewMap = new Dictionary<TabItemControl, WebView2>();

	private Grid _grid;

	private StackPanel _tabContainer;

	private WebView2 currentTab;

	private Grid _webView2Veil;

	internal Grid MainGrid;

	internal StackPanel TabContainer;

	internal Button AddTabBtn;

	private bool _contentLoaded;

	public Home(MainWindow Main, string GUIDs)
	{
		InitializeComponent();
		_addTabButton = AddTabBtn;
		_tabContainer = TabContainer;
		_grid = MainGrid;
		_mainWindow = Main;
		string folderPath = Environment.GetFolderPath(Environment.SpecialFolder.LocalApplicationData);
		string text = Path.Combine(folderPath, "SolaraTab");
		if (SolaraUI.Properties.Settings.Default == null)
		{
			((ApplicationSettingsBase)SolaraUI.Properties.Settings.Default).Reload();
		}
		bool flag = false;
		try
		{
			flag = SolaraUI.Properties.Settings.Default.LegacyMigrationDone;
		}
		catch (SettingsPropertyNotFoundException)
		{
			SolaraUI.Properties.Settings.Default.LegacyMigrationDone = false;
			((SettingsBase)SolaraUI.Properties.Settings.Default).Save();
			flag = false;
		}
		if (!Directory.Exists(text))
		{
			Directory.CreateDirectory(text);
		}
		if (!flag)
		{
			string systemDirectory = Environment.SystemDirectory;
			string pathRoot = Path.GetPathRoot(systemDirectory);
			string text2 = Path.Combine(pathRoot, "SolaraTab");
			SimpleLogger.Log("Checking Legacy Solara Tabs!");
			if (Directory.Exists(text2))
			{
				SimpleLogger.Log("Legacy Solara Tabs exist!");
				try
				{
					string[] files = Directory.GetFiles(text2);
					foreach (string text3 in files)
					{
						try
						{
							string fileName = Path.GetFileName(text3);
							string text4 = Path.Combine(text, fileName);
							if (!File.Exists(text4) || new FileInfo(text4).Length == 0L)
							{
								File.Copy(text3, text4, overwrite: true);
							}
						}
						catch (UnauthorizedAccessException ex2)
						{
							SimpleLogger.Log("UnauthorizedAccessException copying legacy file '" + text3 + "': " + ex2.Message);
						}
						catch (IOException ex3)
						{
							SimpleLogger.Log("IOException copying legacy file '" + text3 + "': " + ex3.Message);
						}
						catch (Exception ex4)
						{
							SimpleLogger.Log("Unexpected exception copying legacy file '" + text3 + "': " + ex4.Message);
						}
					}
				}
				catch (UnauthorizedAccessException ex5)
				{
					SimpleLogger.Log("UnauthorizedAccessException enumerating legacy folder '" + text2 + "': " + ex5.Message);
				}
				catch (Exception ex6)
				{
					SimpleLogger.Log("Unexpected exception enumerating legacy folder '" + text2 + "': " + ex6.Message);
				}
			}
			SolaraUI.Properties.Settings.Default.LegacyMigrationDone = true;
			((SettingsBase)SolaraUI.Properties.Settings.Default).Save();
		}
		int num = 0;
		if (Directory.Exists(text))
		{
			try
			{
				num = Directory.GetFiles(text).Length;
			}
			catch (UnauthorizedAccessException ex7)
			{
				SimpleLogger.Log("Cannot enumerate folder '" + text + "': " + ex7.Message);
				num = 0;
			}
			catch (IOException ex8)
			{
				SimpleLogger.Log("Error accessing folder '" + text + "': " + ex8.Message);
				num = 0;
			}
		}
		if (num == 0)
		{
			AddTab("Script #0", "--[[ https://getsolara.dev/discord ! ]]");
			return;
		}
		string[] files2 = Directory.GetFiles(text);
		foreach (string path in files2)
		{
			string fileNameWithoutExtension = Path.GetFileNameWithoutExtension(path);
			string content = File.ReadAllText(path);
			AddTab(fileNameWithoutExtension, content, fromFile: true);
		}
	}

	private static string SanitizeFileName(string name)
	{
		char[] invalidFileNameChars = Path.GetInvalidFileNameChars();
		char[] array = invalidFileNameChars;
		foreach (char oldChar in array)
		{
			name = name.Replace(oldChar, '_');
		}
		return name;
	}

	private string GetUniqueTabName(string baseName)
	{
		string text = SanitizeFileName(baseName);
		string folderPath = Environment.GetFolderPath(Environment.SpecialFolder.LocalApplicationData);
		string path = Path.Combine(folderPath, "SolaraTab");
		string path2 = Path.Combine(path, text + ".lua");
		bool flag = ((IEnumerable)((Panel)_tabContainer).Children).OfType<TabItemControl>().Any((TabItemControl t) => string.Equals(t.TabTitle, baseName, StringComparison.OrdinalIgnoreCase));
		int num = 1;
		while (File.Exists(path2) || flag)
		{
			string numberedName = $"{text} ({num++})";
			path2 = Path.Combine(path, numberedName + ".lua");
			flag = ((IEnumerable)((Panel)_tabContainer).Children).OfType<TabItemControl>().Any((TabItemControl t) => string.Equals(t.TabTitle, numberedName, StringComparison.OrdinalIgnoreCase));
			if (!File.Exists(path2) && !flag)
			{
				return numberedName;
			}
		}
		return text;
	}

	public void AddTab(string TabName, string content = "", bool fromFile = false)
	{
		//IL_008e: Unknown result type (might be due to invalid IL or missing references)
		//IL_0093: Unknown result type (might be due to invalid IL or missing references)
		//IL_009d: Unknown result type (might be due to invalid IL or missing references)
		//IL_00a7: Unknown result type (might be due to invalid IL or missing references)
		//IL_00b1: Unknown result type (might be due to invalid IL or missing references)
		//IL_00bb: Unknown result type (might be due to invalid IL or missing references)
		//IL_00bc: Unknown result type (might be due to invalid IL or missing references)
		//IL_00cb: Expected O, but got Unknown
		//IL_00cb: Unknown result type (might be due to invalid IL or missing references)
		//IL_00d5: Expected O, but got Unknown
		//IL_00d5: Unknown result type (might be due to invalid IL or missing references)
		//IL_00fa: Unknown result type (might be due to invalid IL or missing references)
		//IL_0104: Unknown result type (might be due to invalid IL or missing references)
		//IL_010b: Unknown result type (might be due to invalid IL or missing references)
		//IL_0114: Expected O, but got Unknown
		//IL_018d: Unknown result type (might be due to invalid IL or missing references)
		//IL_0197: Expected O, but got Unknown
		//IL_01a4: Unknown result type (might be due to invalid IL or missing references)
		//IL_01ae: Expected O, but got Unknown
		//IL_01f3: Unknown result type (might be due to invalid IL or missing references)
		//IL_020a: Unknown result type (might be due to invalid IL or missing references)
		//IL_0214: Expected O, but got Unknown
		//IL_021d: Unknown result type (might be due to invalid IL or missing references)
		//IL_0227: Expected O, but got Unknown
		internalCount++;
		string uniqueTabName = GetUniqueTabName(TabName);
		string text = SanitizeFileName(uniqueTabName);
		string folderPath = Environment.GetFolderPath(Environment.SpecialFolder.LocalApplicationData);
		string path = Path.Combine(folderPath, "SolaraTab");
		if (!fromFile)
		{
			File.WriteAllText(Path.Combine(path, text + ".lua"), content);
		}
		WebView2 webView = new WebView2();
		((UIElement)webView).Visibility = (Visibility)2;
		webView.DefaultBackgroundColor = Color.Transparent;
		webView.DesignModeForegroundColor = Color.Transparent;
		WebView2 webView2 = webView;
		Border val = new Border
		{
			CornerRadius = new CornerRadius(3.0),
			BorderThickness = new Thickness(0.8),
			BorderBrush = (Brush)(SolidColorBrush)((TypeConverter)new BrushConverter()).ConvertFromString("#2a232f"),
			Margin = new Thickness(0.0, 0.0, 5.0, 48.0),
			ClipToBounds = true,
			Visibility = (Visibility)2
		};
		((Decorator)val).Child = (UIElement)(object)webView2;
		((Panel)_grid).Children.Add((UIElement)(object)val);
		Grid.SetRow((UIElement)(object)val, 1);
		Panel.SetZIndex((UIElement)(object)val, 1);
		EventHandler<CoreWebView2NavigationCompletedEventArgs> navHandler = null;
		navHandler = async delegate(object _, CoreWebView2NavigationCompletedEventArgs args)
		{
			if (args.IsSuccess)
			{
				await webView2.ExecuteScriptAsync("editor.setValue(" + JsonConvert.SerializeObject(content) + ")");
			}
			webView2.NavigationCompleted -= navHandler;
		};
		webView2.NavigationCompleted += navHandler;
		TabItemControl newTab = new TabItemControl
		{
			TabTitle = TabName
		};
		newTab.CloseTab += (RoutedEventHandler)delegate
		{
			DeleteTab(newTab);
		};
		((UIElement)newTab).MouseDown += (MouseButtonEventHandler)delegate
		{
			SelectTab(newTab);
		};
		((Panel)_tabContainer).Children.Add((UIElement)(object)newTab);
		((UIElement)webView2).Clip = (Geometry)new RectangleGeometry(new Rect(0.0, 0.0, ((FrameworkElement)webView2).ActualWidth, ((FrameworkElement)webView2).ActualHeight), 3.0, 3.0);
		((FrameworkElement)val).SizeChanged += (SizeChangedEventHandler)delegate(object s, SizeChangedEventArgs e)
		{
			//IL_0019: Unknown result type (might be due to invalid IL or missing references)
			//IL_001e: Unknown result type (might be due to invalid IL or missing references)
			//IL_0031: Unknown result type (might be due to invalid IL or missing references)
			//IL_0036: Unknown result type (might be due to invalid IL or missing references)
			//IL_0048: Unknown result type (might be due to invalid IL or missing references)
			//IL_005f: Unknown result type (might be due to invalid IL or missing references)
			//IL_0069: Expected O, but got Unknown
			WebView2 webView3 = webView2;
			Size newSize = e.NewSize;
			double num = ((Size)(ref newSize)).Width + 22.0;
			newSize = e.NewSize;
			((UIElement)webView3).Clip = (Geometry)new RectangleGeometry(new Rect(0.0, 0.0, num, ((Size)(ref newSize)).Height + 22.0), 3.0, 3.0);
		};
		_tabWebViewMap[newTab] = webView2;
		WebViewEnv.InitializeWebViewAsync(webView2);
		SelectTab(newTab);
		UpdateAddTabButtonPosition();
	}

	public async Task SaveTabs()
	{
		if (_tabContainer == null || ((Panel)_tabContainer).Children.Count < 2)
		{
			return;
		}
		List<TabItemControl> list = ((IEnumerable)((Panel)_tabContainer).Children).OfType<TabItemControl>().ToList();
		if (list.Count == 0)
		{
			return;
		}
		foreach (TabItemControl tab in list)
		{
			if (!_tabWebViewMap.TryGetValue(tab, out var value) || value == null || value.CoreWebView2 == null || PresentationSource.FromVisual((Visual)(object)value) == null)
			{
				continue;
			}
			string folderPath = Environment.GetFolderPath(Environment.SpecialFolder.LocalApplicationData);
			string solaraFolderPath = Path.Combine(folderPath, "SolaraTab");
			try
			{
				string text = JsonConvert.DeserializeObject<string>(await value.ExecuteScriptAsync("GetText()"));
				string text2 = SanitizeFileName(tab.TabTitle);
				string path = Path.Combine(solaraFolderPath, text2 + ".lua");
				string text3 = (File.Exists(path) ? File.ReadAllText(path) : string.Empty);
				if (string.IsNullOrEmpty(text) && !string.IsNullOrEmpty(text3))
				{
					SimpleLogger.Log("Aborting save for " + text2 + ": WebView likely not loaded.");
					return;
				}
				if (text != text3)
				{
					File.WriteAllText(path, text ?? "");
				}
			}
			catch (Exception ex)
			{
				SimpleLogger.Log("Save error: " + ex.Message);
			}
		}
	}

	private Border GetParentBorder(DependencyObject child)
	{
		DependencyObject parent = VisualTreeHelper.GetParent(child);
		while (parent != null && !(parent is Border))
		{
			parent = VisualTreeHelper.GetParent(parent);
		}
		return (Border)(object)((parent is Border) ? parent : null);
	}

	public async void SelectTab(TabItemControl selectedTab)
	{
		await SaveTabs();
		foreach (WebView2 value2 in _tabWebViewMap.Values)
		{
			Border parentBorder = GetParentBorder((DependencyObject)(object)value2);
			if (parentBorder != null)
			{
				((UIElement)parentBorder).Visibility = (Visibility)2;
				((UIElement)value2).Visibility = (Visibility)2;
			}
		}
		if (_tabWebViewMap.TryGetValue(selectedTab, out var value))
		{
			Border parentBorder2 = GetParentBorder((DependencyObject)(object)value);
			if (parentBorder2 != null)
			{
				((UIElement)parentBorder2).Visibility = (Visibility)0;
				currentTab = value;
				if (currentTab.CoreWebView2 == null)
				{
					InitializeVisibleWebViewAsync();
				}
				((UIElement)currentTab).Visibility = (Visibility)0;
			}
		}
		foreach (object child in ((Panel)_tabContainer).Children)
		{
			if (child is TabItemControl tabItemControl)
			{
				tabItemControl.IsSelected = tabItemControl == selectedTab;
			}
		}
	}

	private async Task InitializeVisibleWebViewAsync()
	{
		if (currentTab != null && currentTab.CoreWebView2 == null)
		{
			try
			{
				await currentTab.EnsureCoreWebView2Async(WebViewEnv.GetAsync().Result);
			}
			catch (Exception)
			{
				SimpleLogger.Log("Failed to initialize WebView2 for the selected tab.");
			}
		}
	}

	public void DeleteTab(TabItemControl tabToDelete)
	{
		if (!_tabWebViewMap.ContainsKey(tabToDelete))
		{
			return;
		}
		WebView2 webView = _tabWebViewMap[tabToDelete];
		((Panel)_grid).Children.Remove((UIElement)(object)webView);
		int num = ((Panel)_tabContainer).Children.IndexOf((UIElement)(object)tabToDelete);
		_tabWebViewMap.Remove(tabToDelete);
		string folderPath = Environment.GetFolderPath(Environment.SpecialFolder.LocalApplicationData);
		string path = Path.Combine(folderPath, "SolaraTab");
		string path2 = Path.Combine(path, tabToDelete.TabTitle + ".lua");
		if (File.Exists(path2))
		{
			File.Delete(path2);
		}
		((HwndHost)webView).Dispose();
		((Panel)_grid).Children.Remove((UIElement)(object)GetParentBorder((DependencyObject)(object)webView));
		((Panel)_tabContainer).Children.Remove((UIElement)(object)tabToDelete);
		if (((Panel)_tabContainer).Children.Count > 1)
		{
			int num2 = ((num < ((Panel)_tabContainer).Children.Count) ? num : (num - 1));
			if (((Panel)_tabContainer).Children[num2] is Button)
			{
				num2--;
			}
			if (num2 >= 0 && num2 < ((Panel)_tabContainer).Children.Count)
			{
				SelectTab((TabItemControl)(object)((Panel)_tabContainer).Children[num2]);
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

	private async void HomeLoaded(object sender, RoutedEventArgs e)
	{
		StartFadeInAnimation();
	}

	private async void ClearButton_Click(object sender, RoutedEventArgs e)
	{
		await currentTab.ExecuteScriptAsync("editor.setValue('')");
	}

	public async void InjectButton_MouseClick1(object sender, RoutedEventArgs e)
	{
		await ClientManager.Instance.ScanAndSyncClientsAsync();
		List<string> clientsToAttach = ClientManager.Instance.GetAllActiveClientIds();
		if (clientsToAttach.Count == 0)
		{
			string firstClientId = ClientManager.Instance.GetFirstClientId();
			if (string.IsNullOrEmpty(firstClientId))
			{
				SimpleLogger.Log("First client is null or empty");
				MessageBox.Show("Open RobloxPlayerBeta.exe");
				return;
			}
			ClientItem firstClient = ClientManager.Instance.GetFirstClient();
			((ToggleButton)firstClient.ActiveCheckBox).Checked -= new RoutedEventHandler(firstClient.ActiveCheckBox_Checked);
			((ToggleButton)firstClient.ActiveCheckBox).IsChecked = true;
			((ToggleButton)firstClient.ActiveCheckBox).Checked += new RoutedEventHandler(firstClient.ActiveCheckBox_Checked);
			clientsToAttach.Add(firstClientId);
		}
		int successCount = 0;
		string lastResponse = "";
		foreach (string clientId in clientsToAttach)
		{
			var value = new
			{
				request = "Attach",
				client_id = clientId
			};
			string text = JsonConvert.SerializeObject(value);
			StringContent val = new StringContent(text, Encoding.UTF8, "application/json");
			try
			{
				lastResponse = await (await _mainWindow._httpClient.PostAsync("request", (HttpContent)(object)val)).Content.ReadAsStringAsync();
				if (lastResponse != "." && lastResponse != ";" && lastResponse != "-" && lastResponse != ">")
				{
					successCount++;
				}
			}
			catch (TaskCanceledException ex)
			{
				if (ex.CancellationToken.IsCancellationRequested)
				{
					SimpleLogger.Log("Request was manually canceled.");
				}
				else
				{
					SimpleLogger.Log($"Request timed out after {_mainWindow._httpClient.Timeout.TotalSeconds} seconds.");
				}
			}
			catch (HttpRequestException ex2)
			{
				HttpRequestException ex3 = ex2;
				SimpleLogger.Log("[Execute] Network error for " + clientId + ": " + ((Exception)(object)ex3).Message);
			}
		}
		if (successCount > 0)
		{
			if (clientsToAttach.Count == 1)
			{
				((Shape)_mainWindow.Status).Fill = ClientManager.Instance.GetClientStatusBrush(clientsToAttach[0]);
				((DependencyObject)((UIElement)_mainWindow.Status).Effect).SetCurrentValue(DropShadowEffect.ColorProperty, (object)ClientManager.Instance.GetBrushB(clientsToAttach[0]).Color);
			}
		}
		else
		{
			switch (lastResponse)
			{
			case ".":
				MessageBox.Show("Already attached.");
				break;
			case ";":
				MessageBox.Show("Open RobloxPlayerBeta.exe");
				break;
			case "-":
				MessageBox.Show("Failed to attach.");
				break;
			case ">":
				MessageBox.Show("Try Settings->[Fix Roblox Version] or installing the latest version from [rdd.WEAO.xyz]", "Roblox version mismatch!");
				break;
			}
		}
		GC.Collect();
	}

	private async void ExecuteClicked(object sender, RoutedEventArgs e)
	{
		string cSharpString = JsonConvert.DeserializeObject<string>(await currentTab.ExecuteScriptAsync("GetText()"));
		if (string.IsNullOrEmpty(cSharpString))
		{
			return;
		}
		List<string> allActiveClientIds = ClientManager.Instance.GetAllActiveClientIds();
		if (allActiveClientIds.Count == 0)
		{
			string firstClientId = ClientManager.Instance.GetFirstClientId();
			if (string.IsNullOrEmpty(firstClientId))
			{
				MessageBox.Show("Attach to ROBLOX first.");
				return;
			}
			((ToggleButton)ClientManager.Instance.GetFirstClient().ActiveCheckBox).IsChecked = true;
			allActiveClientIds.Add(firstClientId);
		}
		int successCount = 0;
		string lastError = "";
		foreach (string clientId in allActiveClientIds)
		{
			var value = new
			{
				script = cSharpString,
				client_id = clientId
			};
			string text = JsonConvert.SerializeObject(value);
			try
			{
				StringContent val = new StringContent(text, Encoding.UTF8, "application/json");
				await (await _mainWindow._httpClient.PostAsync("execute_script", (HttpContent)(object)val)).Content.ReadAsStringAsync();
				successCount++;
			}
			catch (TaskCanceledException ex)
			{
				if (ex.CancellationToken.IsCancellationRequested)
				{
					SimpleLogger.Log("Request was manually canceled.");
				}
				else
				{
					SimpleLogger.Log($"Request timed out after {_mainWindow._httpClient.Timeout.TotalSeconds} seconds.");
				}
			}
			catch (HttpRequestException ex2)
			{
				HttpRequestException ex3 = ex2;
				SimpleLogger.Log("[Execute] Network error for " + clientId + ": " + ((Exception)(object)ex3).Message);
			}
		}
		if (successCount == 0)
		{
			MessageBox.Show("Failed to execute on any client.\n(Error: " + lastError + ")");
		}
		GC.Collect();
	}

	private static string GetBootstrapperPath()
	{
		try
		{
			string environmentVariable = Environment.GetEnvironmentVariable("SOLARA_BOOTSTRAPPER", EnvironmentVariableTarget.User);
			if (!string.IsNullOrEmpty(environmentVariable))
			{
				return Path.GetDirectoryName(environmentVariable);
			}
		}
		catch
		{
			SimpleLogger.Log("Failed to read SOLARA_BOOTSTRAPPER environment variable.");
		}
		string[] commandLineArgs = Environment.GetCommandLineArgs();
		for (int i = 0; i < commandLineArgs.Length; i++)
		{
			if (commandLineArgs[i] == "--bootstrapperPath" && i + 1 < commandLineArgs.Length)
			{
				return commandLineArgs[i + 1];
			}
		}
		return string.Empty;
	}

	private async void OpenFile(object sender, RoutedEventArgs e)
	{
		string text = GetBootstrapperPath();
		if (string.IsNullOrEmpty(text))
		{
			string location = Assembly.GetExecutingAssembly().Location;
			text = Path.GetDirectoryName(location);
		}
		string text2 = Path.Combine(text, "scripts");
		if (!Directory.Exists(text2))
		{
			Directory.CreateDirectory(text2);
		}
		OpenFileDialog val = new OpenFileDialog();
		((FileDialog)val).Title = "Open Script";
		((FileDialog)val).InitialDirectory = text2;
		if ((int)((CommonDialog)val).ShowDialog() == 1)
		{
			string fileName = ((FileDialog)val).FileName;
			string value = File.ReadAllText(fileName);
			await currentTab.ExecuteScriptAsync("editor.setValue(" + JsonConvert.SerializeObject(value) + ")");
		}
		GC.Collect();
	}

	private async void SaveFile(object sender, RoutedEventArgs e)
	{
		string text = GetBootstrapperPath();
		if (string.IsNullOrEmpty(text))
		{
			string location = Assembly.GetExecutingAssembly().Location;
			text = Path.GetDirectoryName(location);
		}
		string text2 = Path.Combine(text, "scripts");
		if (!Directory.Exists(text2))
		{
			Directory.CreateDirectory(text2);
		}
		SaveFileDialog val = new SaveFileDialog();
		((FileDialog)val).InitialDirectory = text2;
		((FileDialog)val).Title = "Save Script";
		((FileDialog)val).DefaultExt = ".lua";
		if ((int)((CommonDialog)val).ShowDialog() == 1)
		{
			string fileName = Path.GetFileName(((FileDialog)val).FileName);
			string filePath = Path.Combine(text2, fileName);
			string contents = JsonConvert.DeserializeObject<string>(await currentTab.ExecuteScriptAsync("GetText()"));
			File.WriteAllText(filePath, contents);
		}
		GC.Collect();
	}

	private void UpdateAddTabButtonPosition()
	{
		((Panel)_tabContainer).Children.Remove((UIElement)(object)_addTabButton);
		((Panel)_tabContainer).Children.Add((UIElement)(object)_addTabButton);
	}

	private void AddTabButton_Click(object sender, RoutedEventArgs e)
	{
		string tabName = $"Script #{internalCount}";
		AddTab(tabName);
		UpdateAddTabButtonPosition();
	}

	[DebuggerNonUserCode]
	[GeneratedCode("PresentationBuildTasks", "4.0.0.0")]
	public void InitializeComponent()
	{
		if (!_contentLoaded)
		{
			_contentLoaded = true;
			Uri uri = new Uri("/Solara;component/home.xaml", UriKind.Relative);
			Application.LoadComponent((object)this, uri);
		}
	}

	[DebuggerNonUserCode]
	[GeneratedCode("PresentationBuildTasks", "4.0.0.0")]
	[EditorBrowsable(EditorBrowsableState.Never)]
	void IComponentConnector.Connect(int connectionId, object target)
	{
		//IL_003e: Unknown result type (might be due to invalid IL or missing references)
		//IL_0048: Expected O, but got Unknown
		//IL_004b: Unknown result type (might be due to invalid IL or missing references)
		//IL_0055: Expected O, but got Unknown
		//IL_0058: Unknown result type (might be due to invalid IL or missing references)
		//IL_0062: Expected O, but got Unknown
		//IL_007c: Unknown result type (might be due to invalid IL or missing references)
		//IL_0086: Expected O, but got Unknown
		//IL_0094: Unknown result type (might be due to invalid IL or missing references)
		//IL_009e: Expected O, but got Unknown
		//IL_00ac: Unknown result type (might be due to invalid IL or missing references)
		//IL_00b6: Expected O, but got Unknown
		//IL_00c4: Unknown result type (might be due to invalid IL or missing references)
		//IL_00ce: Expected O, but got Unknown
		//IL_00dc: Unknown result type (might be due to invalid IL or missing references)
		//IL_00e6: Expected O, but got Unknown
		//IL_00f4: Unknown result type (might be due to invalid IL or missing references)
		//IL_00fe: Expected O, but got Unknown
		switch (connectionId)
		{
		case 1:
			((FrameworkElement)(Home)target).Loaded += new RoutedEventHandler(HomeLoaded);
			break;
		case 2:
			MainGrid = (Grid)target;
			break;
		case 3:
			TabContainer = (StackPanel)target;
			break;
		case 4:
			AddTabBtn = (Button)target;
			((ButtonBase)AddTabBtn).Click += new RoutedEventHandler(AddTabButton_Click);
			break;
		case 5:
			((ButtonBase)(Button)target).Click += new RoutedEventHandler(ExecuteClicked);
			break;
		case 6:
			((ButtonBase)(Button)target).Click += new RoutedEventHandler(ClearButton_Click);
			break;
		case 7:
			((ButtonBase)(Button)target).Click += new RoutedEventHandler(InjectButton_MouseClick1);
			break;
		case 8:
			((ButtonBase)(Button)target).Click += new RoutedEventHandler(OpenFile);
			break;
		case 9:
			((ButtonBase)(Button)target).Click += new RoutedEventHandler(SaveFile);
			break;
		default:
			_contentLoaded = true;
			break;
		}
	}
}
