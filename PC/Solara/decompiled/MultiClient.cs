using System;
using System.CodeDom.Compiler;
using System.ComponentModel;
using System.Diagnostics;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Markup;
using System.Windows.Media;
using System.Windows.Media.Animation;
using System.Windows.Media.Effects;
using System.Windows.Shapes;
using System.Windows.Threading;

namespace SolaraUI;

public class MultiClient : Page, IComponentConnector
{
	private DispatcherTimer _clientScanTimer;

	private MainWindow _mainWindow;

	private SolidColorBrush __brush = new SolidColorBrush(Color.FromRgb(byte.MaxValue, (byte)127, (byte)127));

	internal Grid MultiClientG;

	internal WrapPanel MultiClientPanel;

	private bool _contentLoaded;

	public MultiClient(MainWindow main)
	{
		//IL_000a: Unknown result type (might be due to invalid IL or missing references)
		//IL_000f: Unknown result type (might be due to invalid IL or missing references)
		//IL_0019: Expected O, but got Unknown
		//IL_0049: Unknown result type (might be due to invalid IL or missing references)
		//IL_0053: Expected O, but got Unknown
		//IL_0096: Unknown result type (might be due to invalid IL or missing references)
		//IL_00a0: Expected O, but got Unknown
		_mainWindow = main;
		InitializeComponent();
		((Freezable)__brush).Freeze();
		ClientManager.Instance.Initialize(main, MultiClientPanel);
		_clientScanTimer = new DispatcherTimer();
		_clientScanTimer.Interval = TimeSpan.FromSeconds(2.0);
		_clientScanTimer.Tick += ClientScanTimer_Tick;
		_clientScanTimer.Start();
		((FrameworkElement)this).Loaded += new RoutedEventHandler(MultiClient_Loaded);
	}

	private void StartFadeInAnimation()
	{
		object obj = ((FrameworkElement)this).TryFindResource((object)"PageFadeIn");
		Storyboard val = (Storyboard)((obj is Storyboard) ? obj : null);
		if (val != null)
		{
			val.Stop((FrameworkElement)(object)this);
			if (MultiClientG != null)
			{
				((UIElement)MultiClientG).Opacity = 0.0;
			}
			val.Begin((FrameworkElement)(object)this);
		}
	}

	private void MultiClient_Loaded(object sender, RoutedEventArgs e)
	{
		StartFadeInAnimation();
	}

	private async void ClientScanTimer_Tick(object sender, EventArgs e)
	{
		await ClientManager.Instance.ScanAndSyncClientsAsync();
		ClientItem firstClient = ClientManager.Instance.GetFirstClient();
		if (firstClient != null)
		{
			if (((Shape)_mainWindow.Status).Fill != ((Shape)firstClient.StatusCircle).Fill)
			{
				((Shape)_mainWindow.Status).Fill = ((Shape)firstClient.StatusCircle).Fill;
				((DependencyObject)((UIElement)_mainWindow.Status).Effect).SetCurrentValue(DropShadowEffect.ColorProperty, (object)firstClient._brush.Color);
			}
		}
		else if ((object)((Shape)_mainWindow.Status).Fill != __brush)
		{
			((Shape)_mainWindow.Status).Fill = (Brush)(object)__brush;
			((DependencyObject)((UIElement)_mainWindow.Status).Effect).SetCurrentValue(DropShadowEffect.ColorProperty, (object)__brush.Color);
		}
	}

	[DebuggerNonUserCode]
	[GeneratedCode("PresentationBuildTasks", "4.0.0.0")]
	public void InitializeComponent()
	{
		if (!_contentLoaded)
		{
			_contentLoaded = true;
			Uri uri = new Uri("/Solara;component/multiclient.xaml", UriKind.Relative);
			Application.LoadComponent((object)this, uri);
		}
	}

	[DebuggerNonUserCode]
	[GeneratedCode("PresentationBuildTasks", "4.0.0.0")]
	[EditorBrowsable(EditorBrowsableState.Never)]
	void IComponentConnector.Connect(int connectionId, object target)
	{
		//IL_0023: Unknown result type (might be due to invalid IL or missing references)
		//IL_002d: Expected O, but got Unknown
		//IL_0030: Unknown result type (might be due to invalid IL or missing references)
		//IL_003a: Expected O, but got Unknown
		//IL_003d: Unknown result type (might be due to invalid IL or missing references)
		//IL_0047: Expected O, but got Unknown
		switch (connectionId)
		{
		case 1:
			((FrameworkElement)(MultiClient)target).Loaded += new RoutedEventHandler(MultiClient_Loaded);
			break;
		case 2:
			MultiClientG = (Grid)target;
			break;
		case 3:
			MultiClientPanel = (WrapPanel)target;
			break;
		default:
			_contentLoaded = true;
			break;
		}
	}
}
