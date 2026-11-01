using System;
using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.ComponentModel;
using System.Diagnostics;
using System.Linq;
using System.Net.Http;
using System.Runtime.CompilerServices;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Controls.Primitives;
using System.Windows.Markup;
using System.Windows.Media;
using System.Windows.Media.Effects;
using System.Windows.Media.Imaging;
using System.Windows.Shapes;
using Newtonsoft.Json;
using Wpf.Ui.Controls;

namespace SolaraUI;

public class ClientItem : UserControl, IComponentConnector
{
	private class ThumbData
	{
		[JsonProperty("imageUrl")]
		public string ImageUrl { get; set; }
	}

	private class ThumbApiResponse
	{
		[JsonProperty("data")]
		public List<ThumbData> Data { get; set; }
	}

	public MainWindow _mainWindow;

	public SolidColorBrush _brush;

	private static readonly Uri _defaultThumbUri = new Uri("pack://application:,,,/Images/default_user.png");

	private int _currentStatus;

	private string _currentThumbApiUrl;

	private static readonly SolidColorBrush RunningBrush = new SolidColorBrush(Color.FromRgb(byte.MaxValue, (byte)193, (byte)7));

	private static readonly SolidColorBrush InjectedBrush = new SolidColorBrush(Color.FromRgb((byte)40, (byte)167, (byte)69));

	private static readonly SolidColorBrush ErrorBrush = new SolidColorBrush(Color.FromRgb(byte.MaxValue, (byte)127, (byte)127));

	[CompilerGenerated]
	private RoutedEventHandler m_ActiveCheckBox_StateChanged;

	internal Image Thumb;

	internal TextBlock UsernameLabel;

	internal Ellipse StatusCircle;

	internal CheckBox ActiveCheckBox;

	internal Button CloseClient;

	private bool _contentLoaded;

	public string ClientId { get; set; }

	public event RoutedEventHandler ActiveCheckBox_StateChanged
	{
		[CompilerGenerated]
		add
		{
			//IL_0010: Unknown result type (might be due to invalid IL or missing references)
			//IL_0016: Expected O, but got Unknown
			RoutedEventHandler val = this.m_ActiveCheckBox_StateChanged;
			RoutedEventHandler val2;
			do
			{
				val2 = val;
				RoutedEventHandler value2 = (RoutedEventHandler)Delegate.Combine((Delegate?)(object)val2, (Delegate?)(object)value);
				val = Interlocked.CompareExchange(ref this.m_ActiveCheckBox_StateChanged, value2, val2);
			}
			while (val != val2);
		}
		[CompilerGenerated]
		remove
		{
			//IL_0010: Unknown result type (might be due to invalid IL or missing references)
			//IL_0016: Expected O, but got Unknown
			RoutedEventHandler val = this.m_ActiveCheckBox_StateChanged;
			RoutedEventHandler val2;
			do
			{
				val2 = val;
				RoutedEventHandler value2 = (RoutedEventHandler)Delegate.Remove((Delegate?)(object)val2, (Delegate?)(object)value);
				val = Interlocked.CompareExchange(ref this.m_ActiveCheckBox_StateChanged, value2, val2);
			}
			while (val != val2);
		}
	}

	public ClientItem(MainWindow main, string clientId)
	{
		_brush = ErrorBrush;
		_mainWindow = main;
		InitializeComponent();
		ClientId = clientId;
	}

	public void SetUsername(string username)
	{
		if (username.Length > 13)
		{
			UsernameLabel.Text = username.Substring(0, 10) + "...";
		}
		else
		{
			UsernameLabel.Text = username;
		}
	}

	public async Task SetThumb(string apiUrl)
	{
		if (_currentThumbApiUrl == apiUrl || string.IsNullOrEmpty(apiUrl))
		{
			return;
		}
		try
		{
			_currentThumbApiUrl = apiUrl;
			string text = JsonConvert.DeserializeObject<ThumbApiResponse>(await _mainWindow._httpClient.GetStringAsync(apiUrl))?.Data?.FirstOrDefault()?.ImageUrl;
			if (!string.IsNullOrEmpty(text))
			{
				BitmapImage val = new BitmapImage();
				val.BeginInit();
				val.UriSource = new Uri(text, UriKind.Absolute);
				val.CacheOption = (BitmapCacheOption)1;
				val.EndInit();
				((UIElement)Thumb).Opacity = 1.0;
				Thumb.Source = (ImageSource)(object)val;
			}
		}
		catch (Exception)
		{
		}
	}

	public void SetStatus(int status)
	{
		//IL_0082: Unknown result type (might be due to invalid IL or missing references)
		//IL_004c: Unknown result type (might be due to invalid IL or missing references)
		//IL_0051: Unknown result type (might be due to invalid IL or missing references)
		//IL_005b: Expected O, but got Unknown
		if (_currentStatus != status)
		{
			switch (status)
			{
			case 2:
				_brush = RunningBrush;
				break;
			case 1:
				_brush = InjectedBrush;
				break;
			case 0:
				_brush = ErrorBrush;
				break;
			default:
				_brush = new SolidColorBrush(Color.FromRgb((byte)108, (byte)117, (byte)125));
				break;
			}
			((Shape)StatusCircle).Fill = (Brush)(object)_brush;
			((DependencyObject)((UIElement)StatusCircle).Effect).SetCurrentValue(DropShadowEffect.ColorProperty, (object)_brush.Color);
		}
	}

	public void ClientCloseEvent(object sender, RoutedEventArgs e)
	{
		//IL_001d: Unknown result type (might be due to invalid IL or missing references)
		//IL_0022: Unknown result type (might be due to invalid IL or missing references)
		//IL_0023: Unknown result type (might be due to invalid IL or missing references)
		//IL_0025: Invalid comparison between Unknown and I4
		//IL_0066: Unknown result type (might be due to invalid IL or missing references)
		try
		{
			MessageBoxResult val = MessageBox.Show("Are you sure you want to close client " + ClientId + "?", "Confirm Close", (MessageBoxButton)4, (MessageBoxImage)32);
			if ((int)val == 6)
			{
				Process processById = Process.GetProcessById(int.Parse(ClientId));
				processById.Kill();
			}
		}
		catch (Exception ex)
		{
			MessageBox.Show("Failed to close client " + ClientId + ": " + ex.Message, "Error", (MessageBoxButton)0, (MessageBoxImage)16);
		}
	}

	public async void ActiveCheckBox_Checked(object sender, RoutedEventArgs e)
	{
		_ = 1;
		try
		{
			var value = new
			{
				request = "Attach",
				client_id = ClientId
			};
			string text = JsonConvert.SerializeObject(value);
			StringContent val = new StringContent(text, Encoding.UTF8, "application/json");
			switch (await (await _mainWindow._httpClient.PostAsync("request", (HttpContent)(object)val)).Content.ReadAsStringAsync())
			{
			case ";":
			case "-":
			case ">":
				((ToggleButton)ActiveCheckBox).IsChecked = false;
				break;
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
			((ToggleButton)ActiveCheckBox).IsChecked = false;
		}
		catch (HttpRequestException ex2)
		{
			HttpRequestException ex3 = ex2;
			SimpleLogger.Log("HTTP Request Error during Attach: " + ((Exception)(object)ex3).Message);
			((ToggleButton)ActiveCheckBox).IsChecked = false;
		}
	}

	[DebuggerNonUserCode]
	[GeneratedCode("PresentationBuildTasks", "4.0.0.0")]
	public void InitializeComponent()
	{
		if (!_contentLoaded)
		{
			_contentLoaded = true;
			Uri uri = new Uri("/Solara;component/clientitem.xaml", UriKind.Relative);
			Application.LoadComponent((object)this, uri);
		}
	}

	[DebuggerNonUserCode]
	[GeneratedCode("PresentationBuildTasks", "4.0.0.0")]
	[EditorBrowsable(EditorBrowsableState.Never)]
	void IComponentConnector.Connect(int connectionId, object target)
	{
		//IL_0020: Unknown result type (might be due to invalid IL or missing references)
		//IL_002a: Expected O, but got Unknown
		//IL_002d: Unknown result type (might be due to invalid IL or missing references)
		//IL_0037: Expected O, but got Unknown
		//IL_003a: Unknown result type (might be due to invalid IL or missing references)
		//IL_0044: Expected O, but got Unknown
		//IL_0047: Unknown result type (might be due to invalid IL or missing references)
		//IL_0051: Expected O, but got Unknown
		//IL_005e: Unknown result type (might be due to invalid IL or missing references)
		//IL_0068: Expected O, but got Unknown
		//IL_0082: Unknown result type (might be due to invalid IL or missing references)
		//IL_008c: Expected O, but got Unknown
		switch (connectionId)
		{
		case 1:
			Thumb = (Image)target;
			break;
		case 2:
			UsernameLabel = (TextBlock)target;
			break;
		case 3:
			StatusCircle = (Ellipse)target;
			break;
		case 4:
			ActiveCheckBox = (CheckBox)target;
			((ToggleButton)ActiveCheckBox).Checked += new RoutedEventHandler(ActiveCheckBox_Checked);
			break;
		case 5:
			CloseClient = (Button)target;
			((ButtonBase)CloseClient).Click += new RoutedEventHandler(ClientCloseEvent);
			break;
		default:
			_contentLoaded = true;
			break;
		}
	}
}
