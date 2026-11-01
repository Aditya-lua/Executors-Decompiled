using System;
using System.CodeDom.Compiler;
using System.ComponentModel;
using System.Diagnostics;
using System.IO;
using System.Net;
using System.Net.Http;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Controls.Primitives;
using System.Windows.Markup;
using System.Windows.Media;
using System.Windows.Media.Animation;
using System.Windows.Media.Imaging;
using System.Windows.Threading;
using Wpf.Ui.Controls;

namespace SolaraUI;

public class ScriptItem : UserControl, IComponentConnector
{
	public string ScriptName;

	public string ScriptCode;

	internal Grid RootGrid;

	internal Image ScriptImage;

	internal Border UniversalBadge;

	internal TextBlock ScriptTitle;

	internal Border VerifiedBadge;

	internal Border ModeBadge;

	internal SymbolIcon ModeIcon;

	internal TextBlock ModeLabel;

	internal Button ActionButton;

	internal Button CopyButton;

	private bool _contentLoaded;

	public ScriptItem(string name, string code, bool verified, bool keyed, string scriptType, bool isUniversal)
	{
		ScriptName = name;
		ScriptCode = code;
		InitializeComponent();
		ScriptTitle.Text = name;
		((UIElement)VerifiedBadge).Visibility = (Visibility)((!verified) ? 2 : 0);
		((UIElement)UniversalBadge).Visibility = (Visibility)((!isUniversal) ? 2 : 0);
		SetMode(keyed, scriptType);
	}

	private void SetMode(bool keyed, string scriptType)
	{
		//IL_0023: Unknown result type (might be due to invalid IL or missing references)
		//IL_0028: Unknown result type (might be due to invalid IL or missing references)
		//IL_0032: Expected O, but got Unknown
		//IL_0052: Unknown result type (might be due to invalid IL or missing references)
		//IL_0057: Unknown result type (might be due to invalid IL or missing references)
		//IL_0061: Expected O, but got Unknown
		//IL_0071: Unknown result type (might be due to invalid IL or missing references)
		//IL_0076: Unknown result type (might be due to invalid IL or missing references)
		//IL_0080: Expected O, but got Unknown
		//IL_0137: Unknown result type (might be due to invalid IL or missing references)
		//IL_013c: Unknown result type (might be due to invalid IL or missing references)
		//IL_0146: Expected O, but got Unknown
		//IL_0166: Unknown result type (might be due to invalid IL or missing references)
		//IL_016b: Unknown result type (might be due to invalid IL or missing references)
		//IL_0175: Expected O, but got Unknown
		//IL_0185: Unknown result type (might be due to invalid IL or missing references)
		//IL_018a: Unknown result type (might be due to invalid IL or missing references)
		//IL_0194: Expected O, but got Unknown
		//IL_00b9: Unknown result type (might be due to invalid IL or missing references)
		//IL_00be: Unknown result type (might be due to invalid IL or missing references)
		//IL_00c8: Expected O, but got Unknown
		//IL_00e8: Unknown result type (might be due to invalid IL or missing references)
		//IL_00ed: Unknown result type (might be due to invalid IL or missing references)
		//IL_00f7: Expected O, but got Unknown
		//IL_0107: Unknown result type (might be due to invalid IL or missing references)
		//IL_010c: Unknown result type (might be due to invalid IL or missing references)
		//IL_0116: Expected O, but got Unknown
		if (keyed)
		{
			ModeIcon.Symbol = SymbolRegular.Key20;
			ModeIcon.Foreground = (Brush)new SolidColorBrush((Color)ColorConverter.ConvertFromString("#E8A96D"));
			ModeLabel.Text = "keyed";
			ModeLabel.Foreground = (Brush)new SolidColorBrush((Color)ColorConverter.ConvertFromString("#E8A96D"));
			ModeBadge.BorderBrush = (Brush)new SolidColorBrush((Color)ColorConverter.ConvertFromString("#8A5A2A"));
		}
		else if (scriptType?.ToLower() == "paid")
		{
			ModeIcon.Symbol = SymbolRegular.Money16;
			ModeIcon.Foreground = (Brush)new SolidColorBrush((Color)ColorConverter.ConvertFromString("#C4A0E8"));
			ModeLabel.Text = "paid";
			ModeLabel.Foreground = (Brush)new SolidColorBrush((Color)ColorConverter.ConvertFromString("#C4A0E8"));
			ModeBadge.BorderBrush = (Brush)new SolidColorBrush((Color)ColorConverter.ConvertFromString("#6A3A9A"));
		}
		else
		{
			ModeIcon.Symbol = SymbolRegular.Gift20;
			ModeIcon.Foreground = (Brush)new SolidColorBrush((Color)ColorConverter.ConvertFromString("#909090"));
			ModeLabel.Text = "free";
			ModeLabel.Foreground = (Brush)new SolidColorBrush((Color)ColorConverter.ConvertFromString("#909090"));
			ModeBadge.BorderBrush = (Brush)new SolidColorBrush((Color)ColorConverter.ConvertFromString("#55555A"));
		}
	}

	public async Task InitializeAsync(string img)
	{
		await LoadImageFromUrl(img);
	}

	private async Task LoadImageFromUrl(string url)
	{
		byte[] array = await TryGetImageData(url);
		if (array == null && url != "https://scriptblox.com/images/no-script.webp")
		{
			array = await TryGetImageData("https://scriptblox.com/images/no-script.webp");
		}
		if (array == null)
		{
			return;
		}
		try
		{
			using MemoryStream streamSource = new MemoryStream(array);
			BitmapImage val = new BitmapImage();
			val.BeginInit();
			val.CacheOption = (BitmapCacheOption)1;
			val.StreamSource = streamSource;
			val.EndInit();
			((Freezable)val).Freeze();
			ScriptImage.Source = (ImageSource)(object)val;
		}
		catch (Exception)
		{
		}
		static async Task<byte[]> TryGetImageData(string imageUrl)
		{
			_ = 1;
			try
			{
				HttpClient client = new HttpClient();
				try
				{
					HttpResponseMessage response = await client.GetAsync(imageUrl);
					try
					{
						if (response.IsSuccessStatusCode)
						{
							return await response.Content.ReadAsByteArrayAsync();
						}
						if (response.StatusCode == HttpStatusCode.NotFound)
						{
							return null;
						}
						response.EnsureSuccessStatusCode();
						return null;
					}
					finally
					{
						((IDisposable)response)?.Dispose();
					}
				}
				finally
				{
					((IDisposable)client)?.Dispose();
				}
			}
			catch (Exception)
			{
				return null;
			}
		}
	}

	private async void ActionButton_Click(object sender, RoutedEventArgs e)
	{
		MainWindow mw = (MainWindow)(object)Application.Current.MainWindow;
		if (((ContentControl)mw.MainFrame).Content != mw._home)
		{
			((ContentControl)mw.MainFrame).Content = mw._home;
		}
		await Dispatcher.Yield((DispatcherPriority)4);
		mw._home.AddTab(ScriptName, ScriptCode);
	}

	private void CopyButton_Click(object sender, RoutedEventArgs e)
	{
		try
		{
			Clipboard.SetText(ScriptCode);
		}
		catch (Exception)
		{
		}
	}

	private void UserControl_Loaded(object sender, RoutedEventArgs e)
	{
		object obj = ((FrameworkElement)this).TryFindResource((object)"FadeInAnimation");
		Storyboard val = (Storyboard)((obj is Storyboard) ? obj : null);
		if (val != null)
		{
			val.Begin((FrameworkElement)(object)this);
		}
	}

	[DebuggerNonUserCode]
	[GeneratedCode("PresentationBuildTasks", "4.0.0.0")]
	public void InitializeComponent()
	{
		if (!_contentLoaded)
		{
			_contentLoaded = true;
			Uri uri = new Uri("/Solara;component/scriptitem.xaml", UriKind.Relative);
			Application.LoadComponent((object)this, uri);
		}
	}

	[DebuggerNonUserCode]
	[GeneratedCode("PresentationBuildTasks", "4.0.0.0")]
	[EditorBrowsable(EditorBrowsableState.Never)]
	void IComponentConnector.Connect(int connectionId, object target)
	{
		//IL_0046: Unknown result type (might be due to invalid IL or missing references)
		//IL_0050: Expected O, but got Unknown
		//IL_0053: Unknown result type (might be due to invalid IL or missing references)
		//IL_005d: Expected O, but got Unknown
		//IL_0060: Unknown result type (might be due to invalid IL or missing references)
		//IL_006a: Expected O, but got Unknown
		//IL_006d: Unknown result type (might be due to invalid IL or missing references)
		//IL_0077: Expected O, but got Unknown
		//IL_007a: Unknown result type (might be due to invalid IL or missing references)
		//IL_0084: Expected O, but got Unknown
		//IL_0087: Unknown result type (might be due to invalid IL or missing references)
		//IL_0091: Expected O, but got Unknown
		//IL_0094: Unknown result type (might be due to invalid IL or missing references)
		//IL_009e: Expected O, but got Unknown
		//IL_00ae: Unknown result type (might be due to invalid IL or missing references)
		//IL_00b8: Expected O, but got Unknown
		//IL_00d2: Unknown result type (might be due to invalid IL or missing references)
		//IL_00dc: Expected O, but got Unknown
		//IL_00f6: Unknown result type (might be due to invalid IL or missing references)
		//IL_0100: Expected O, but got Unknown
		switch (connectionId)
		{
		case 1:
			((FrameworkElement)(ScriptItem)target).Loaded += new RoutedEventHandler(UserControl_Loaded);
			break;
		case 2:
			RootGrid = (Grid)target;
			break;
		case 3:
			ScriptImage = (Image)target;
			break;
		case 4:
			UniversalBadge = (Border)target;
			break;
		case 5:
			ScriptTitle = (TextBlock)target;
			break;
		case 6:
			VerifiedBadge = (Border)target;
			break;
		case 7:
			ModeBadge = (Border)target;
			break;
		case 8:
			ModeIcon = (SymbolIcon)target;
			break;
		case 9:
			ModeLabel = (TextBlock)target;
			break;
		case 10:
			ActionButton = (Button)target;
			((ButtonBase)ActionButton).Click += new RoutedEventHandler(ActionButton_Click);
			break;
		case 11:
			CopyButton = (Button)target;
			((ButtonBase)CopyButton).Click += new RoutedEventHandler(CopyButton_Click);
			break;
		default:
			_contentLoaded = true;
			break;
		}
	}
}
