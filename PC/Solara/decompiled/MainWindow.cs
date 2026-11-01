using System;
using System.CodeDom.Compiler;
using System.Collections;
using System.ComponentModel;
using System.Configuration;
using System.Diagnostics;
using System.IO;
using System.Net.Http;
using System.Net.Http.Headers;
using System.Security.AccessControl;
using System.Security.Principal;
using System.Threading;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Controls.Primitives;
using System.Windows.Input;
using System.Windows.Markup;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Shapes;
using System.Windows.Threading;
using SolaraUI.Properties;
using Wpf.Ui.Controls;

namespace SolaraUI;

public class MainWindow : FluentWindow, IComponentConnector
{
	public string GUID = Guid.NewGuid().ToString("N").Substring(0, 16);

	public Settings _settings;

	public Home _home;

	public ScriptHub _scriptHub;

	public MultiClient _multiClient;

	private bool _isClosingConfirmed;

	private static readonly HttpClientHandler handler = new HttpClientHandler
	{
		UseProxy = false
	};

	public readonly HttpClient _httpClient;

	internal MainWindow fluentWindow;

	internal Grid PageLayout;

	internal Frame MainFrame;

	internal Ellipse Status;

	internal Button MinimizeBtn;

	internal Image MaximizeImg;

	private bool _contentLoaded;

	public int BridgePort { get; private set; }

	public async Task StartExitListenerAsync()
	{
		string text = "Global\\SolaraSingleton";
		EventWaitHandleSecurity val = new EventWaitHandleSecurity();
		val.AddAccessRule(new EventWaitHandleAccessRule((IdentityReference)new SecurityIdentifier(WellKnownSidType.WorldSid, null), (EventWaitHandleRights)2031619, AccessControlType.Allow));
		bool flag = default(bool);
		using EventWaitHandle exitEvent = new EventWaitHandle(false, EventResetMode.ManualReset, text, ref flag, val);
		if (!flag)
		{
			exitEvent.Reset();
		}
		SimpleLogger.Log(flag ? "Created new exit signal." : "Opened existing exit signal.");
		await exitEvent.WaitAsync();
		await _home.SaveTabs();
		SimpleLogger.Log("Shutdown complete.");
		_isClosingConfirmed = true;
		await ((DispatcherObject)Application.Current).Dispatcher.BeginInvoke((Delegate)(Action)delegate
		{
			((Window)this).Close();
		}, Array.Empty<object>());
	}

	private void InitializeSettings()
	{
		//IL_0024: Unknown result type (might be due to invalid IL or missing references)
		//IL_002a: Expected O, but got Unknown
		try
		{
			((ApplicationSettingsBase)SolaraUI.Properties.Settings.Default).Reload();
			SettingsPropertyCollection properties = ((SettingsBase)SolaraUI.Properties.Settings.Default).Properties;
			foreach (SettingsProperty item in properties)
			{
				SettingsProperty val = item;
				if (((Hashtable)(object)val.Attributes)[(object)typeof(UserScopedSettingAttribute)] != null && ((SettingsBase)SolaraUI.Properties.Settings.Default)[val.Name] == null)
				{
					((SettingsBase)SolaraUI.Properties.Settings.Default)[val.Name] = val.DefaultValue;
					SimpleLogger.Log($"Setting '{val.Name}' missing, assigning default '{val.DefaultValue}'");
				}
			}
			((SettingsBase)SolaraUI.Properties.Settings.Default).Save();
		}
		catch (Exception arg)
		{
			SimpleLogger.Log($"Error initializing settings: {arg}");
		}
	}

	public MainWindow()
	{
		//IL_0031: Expected O, but got Unknown
		//IL_0093: Unknown result type (might be due to invalid IL or missing references)
		//IL_0098: Unknown result type (might be due to invalid IL or missing references)
		//IL_00bd: Expected O, but got Unknown
		//IL_0150: Unknown result type (might be due to invalid IL or missing references)
		//IL_015a: Expected O, but got Unknown
		try
		{
			ConfigurationManager.OpenExeConfiguration((ConfigurationUserLevel)20);
		}
		catch (ConfigurationErrorsException ex)
		{
			ConfigurationErrorsException ex2 = ex;
			string filename = ((ConfigurationException)ex2).Filename;
			if (string.IsNullOrEmpty(filename))
			{
				Exception? innerException = ((Exception)(object)ex2).InnerException;
				ConfigurationErrorsException ex3 = (ConfigurationErrorsException)(object)((innerException is ConfigurationErrorsException) ? innerException : null);
				if (ex3 != null)
				{
					filename = ((ConfigurationException)ex3).Filename;
				}
			}
			if (!string.IsNullOrEmpty(filename) && File.Exists(filename))
			{
				File.Delete(filename);
			}
		}
		StartExitListenerAsync();
		InitializeSettings();
		BridgePort = StartSocket(GUID);
		_httpClient = new HttpClient((HttpMessageHandler)(object)handler)
		{
			BaseAddress = new Uri($"http://127.0.0.1:{BridgePort}/")
		};
		SimpleLogger.Log($"Bridge HTTP client configured for {_httpClient.BaseAddress}");
		((HttpHeaders)_httpClient.DefaultRequestHeaders).Add("User-Agent", "SolaraUI/3.0");
		((HttpHeaders)_httpClient.DefaultRequestHeaders).Add("GUID", GUID);
		InitializeComponent();
		_home = new Home(this, GUID);
		_scriptHub = new ScriptHub(this);
		_multiClient = new MultiClient(this);
		_settings = new Settings(this);
		((FrameworkElement)this).Loaded += (RoutedEventHandler)delegate(object s, RoutedEventArgs e)
		{
			MainWindow_Loaded(s, e);
		};
		((Window)this).Closed += delegate
		{
		};
		((Window)this).Closing += ClosingEvent;
		((ContentControl)MainFrame).Content = _home;
	}

	private async void ClosingEvent(object sender, CancelEventArgs e)
	{
		if (_isClosingConfirmed)
		{
			return;
		}
		e.Cancel = true;
		MessageBoxResult val = MessageBox.Show("Are you sure you want to close Solara?", "Exit?", (MessageBoxButton)4, (MessageBoxImage)32);
		if ((int)val != 7)
		{
			try
			{
				await _home.SaveTabs();
			}
			catch (Exception ex)
			{
				MessageBox.Show("Failed to save tabs: " + ex.Message, "Error", (MessageBoxButton)0, (MessageBoxImage)16);
			}
			_isClosingConfirmed = true;
			await ((DispatcherObject)Application.Current).Dispatcher.BeginInvoke((Delegate)(Action)delegate
			{
				((Window)this).Close();
			}, Array.Empty<object>());
		}
	}

	private static SolidColorBrush CreateBrush(string hex)
	{
		//IL_0000: Unknown result type (might be due to invalid IL or missing references)
		//IL_000b: Expected O, but got Unknown
		//IL_000b: Unknown result type (might be due to invalid IL or missing references)
		//IL_0011: Expected O, but got Unknown
		SolidColorBrush val = (SolidColorBrush)((TypeConverter)new BrushConverter()).ConvertFromString(hex);
		((Freezable)val).Freeze();
		return val;
	}

	private void MainWindow_Loaded(object sender, RoutedEventArgs e)
	{
	}

	private int StartSocket(string GUID)
	{
		//IL_006b: Unknown result type (might be due to invalid IL or missing references)
		//IL_0037: Unknown result type (might be due to invalid IL or missing references)
		try
		{
			int num = NativeMethods.Start(GUID);
			if (num < 1024 || num > 65535)
			{
				string text = $"Solara's DLL failed to start its local server (Start returned {num}).";
				SimpleLogger.Log(text);
				MessageBox.Show(text, "Error", (MessageBoxButton)0, (MessageBoxImage)16);
				throw new InvalidOperationException(text);
			}
			SimpleLogger.Log($"Solara's DLL returned bridge port {num}.");
			return num;
		}
		catch (DllNotFoundException)
		{
			MessageBox.Show("Solara's DLL was unable to be loaded. Ensure your anti-virus isn't deleting Solara's files & try again.", "Error", (MessageBoxButton)0, (MessageBoxImage)16);
			throw;
		}
	}

	private void fluentWindow_Loaded(object sender, RoutedEventArgs e)
	{
	}

	private async void HomeButtonClicked(object sender, RoutedEventArgs e)
	{
		if (((ContentControl)MainFrame).Content != _home)
		{
			((ContentControl)MainFrame).Content = _home;
			await Dispatcher.Yield((DispatcherPriority)4);
		}
	}

	private async void SettingsButtonClicked(object sender, RoutedEventArgs e)
	{
		if (((ContentControl)MainFrame).Content != _settings)
		{
			((ContentControl)MainFrame).Content = _settings;
			await Dispatcher.Yield((DispatcherPriority)4);
		}
	}

	private async void ScriptHubClicked(object sender, RoutedEventArgs e)
	{
		if (((ContentControl)MainFrame).Content != _scriptHub)
		{
			((ContentControl)MainFrame).Content = _scriptHub;
			await Dispatcher.Yield((DispatcherPriority)4);
		}
	}

	private void Grid_MouseDown(object sender, MouseButtonEventArgs e)
	{
		//IL_0001: Unknown result type (might be due to invalid IL or missing references)
		if ((int)e.ChangedButton == 0)
		{
			((Window)this).DragMove();
		}
	}

	private void MaximieClicked(object sender, RoutedEventArgs e)
	{
		//IL_0000: Unknown result type (might be due to invalid IL or missing references)
		//IL_0006: Expected O, but got Unknown
		//IL_0007: Unknown result type (might be due to invalid IL or missing references)
		BitmapImage val = new BitmapImage();
		if ((int)((Window)this).WindowState == 0)
		{
			((Window)this).WindowState = (WindowState)2;
			val.BeginInit();
			val.UriSource = new Uri("pack://application:,,,/Images/compress_icon.png");
			val.EndInit();
			MaximizeImg.Source = (ImageSource?)(object)val;
		}
		else
		{
			((Window)this).WindowState = (WindowState)0;
			val.BeginInit();
			val.UriSource = new Uri("pack://application:,,,/Images/maximize_icon.png");
			val.EndInit();
			MaximizeImg.Source = (ImageSource?)(object)val;
		}
	}

	private void CloseClicked(object sender, RoutedEventArgs e)
	{
		((Window)this).Close();
	}

	private void MinimizeClicked(object sender, RoutedEventArgs e)
	{
		((Window)this).WindowState = (WindowState)1;
	}

	private async void MultiClientClicked(object sender, RoutedEventArgs e)
	{
		if (((ContentControl)MainFrame).Content != _multiClient)
		{
			((ContentControl)MainFrame).Content = _multiClient;
			await Dispatcher.Yield((DispatcherPriority)4);
		}
	}

	[DebuggerNonUserCode]
	[GeneratedCode("PresentationBuildTasks", "4.0.0.0")]
	public void InitializeComponent()
	{
		if (!_contentLoaded)
		{
			_contentLoaded = true;
			Uri uri = new Uri("/Solara;component/mainwindow.xaml", UriKind.Relative);
			Application.LoadComponent((object)this, uri);
		}
	}

	[DebuggerNonUserCode]
	[GeneratedCode("PresentationBuildTasks", "4.0.0.0")]
	[EditorBrowsable(EditorBrowsableState.Never)]
	void IComponentConnector.Connect(int connectionId, object target)
	{
		//IL_0053: Unknown result type (might be due to invalid IL or missing references)
		//IL_005f: Unknown result type (might be due to invalid IL or missing references)
		//IL_0069: Expected O, but got Unknown
		//IL_006c: Unknown result type (might be due to invalid IL or missing references)
		//IL_0076: Expected O, but got Unknown
		//IL_0084: Unknown result type (might be due to invalid IL or missing references)
		//IL_008e: Expected O, but got Unknown
		//IL_009c: Unknown result type (might be due to invalid IL or missing references)
		//IL_00a6: Expected O, but got Unknown
		//IL_00b4: Unknown result type (might be due to invalid IL or missing references)
		//IL_00be: Expected O, but got Unknown
		//IL_00cc: Unknown result type (might be due to invalid IL or missing references)
		//IL_00d6: Expected O, but got Unknown
		//IL_00d9: Unknown result type (might be due to invalid IL or missing references)
		//IL_00e3: Expected O, but got Unknown
		//IL_00e5: Unknown result type (might be due to invalid IL or missing references)
		//IL_00f1: Unknown result type (might be due to invalid IL or missing references)
		//IL_00fb: Expected O, but got Unknown
		//IL_00fe: Unknown result type (might be due to invalid IL or missing references)
		//IL_0108: Expected O, but got Unknown
		//IL_0122: Unknown result type (might be due to invalid IL or missing references)
		//IL_012c: Expected O, but got Unknown
		//IL_0147: Unknown result type (might be due to invalid IL or missing references)
		//IL_0151: Expected O, but got Unknown
		//IL_015f: Unknown result type (might be due to invalid IL or missing references)
		//IL_0169: Expected O, but got Unknown
		switch (connectionId)
		{
		case 1:
			fluentWindow = (MainWindow)target;
			break;
		case 2:
			((FrameworkElement)(Grid)target).Loaded += new RoutedEventHandler(fluentWindow_Loaded);
			break;
		case 3:
			PageLayout = (Grid)target;
			break;
		case 4:
			((ButtonBase)(Button)target).Click += new RoutedEventHandler(HomeButtonClicked);
			break;
		case 5:
			((ButtonBase)(Button)target).Click += new RoutedEventHandler(ScriptHubClicked);
			break;
		case 6:
			((ButtonBase)(Button)target).Click += new RoutedEventHandler(MultiClientClicked);
			break;
		case 7:
			((ButtonBase)(Button)target).Click += new RoutedEventHandler(SettingsButtonClicked);
			break;
		case 8:
			MainFrame = (Frame)target;
			break;
		case 9:
			((UIElement)(Grid)target).MouseDown += new MouseButtonEventHandler(Grid_MouseDown);
			break;
		case 10:
			Status = (Ellipse)target;
			break;
		case 11:
			MinimizeBtn = (Button)target;
			((ButtonBase)MinimizeBtn).Click += new RoutedEventHandler(MaximieClicked);
			break;
		case 12:
			MaximizeImg = (Image)target;
			break;
		case 13:
			((ButtonBase)(Button)target).Click += new RoutedEventHandler(CloseClicked);
			break;
		case 14:
			((ButtonBase)(Button)target).Click += new RoutedEventHandler(MinimizeClicked);
			break;
		default:
			_contentLoaded = true;
			break;
		}
	}
}
