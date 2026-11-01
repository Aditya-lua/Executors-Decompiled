using System;
using System.CodeDom.Compiler;
using System.ComponentModel;
using System.Diagnostics;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Controls.Primitives;
using System.Windows.Input;
using System.Windows.Markup;
using ScriptEditor.Models;
using ScriptEditor.Services;

namespace ScriptEditor.Controls;

public partial class ScriptHubView : UserControl, IComponentConnector, IStyleConnector
{
	private const double MinCardWidth = 236.0;

	public static readonly DependencyProperty ResultColumnsProperty = DependencyProperty.Register("ResultColumns", typeof(int), typeof(ScriptHubView), new PropertyMetadata((object)4));

	internal TextBox SearchBox;

	internal ScrollViewer ResultsScroller;

	public int ResultColumns
	{
		get
		{
			return (int)((DependencyObject)this).GetValue(ResultColumnsProperty);
		}
		set
		{
			((DependencyObject)this).SetValue(ResultColumnsProperty, (object)value);
		}
	}

	private ScriptHub? Hub => (((FrameworkElement)this).DataContext as MainWindow)?.Hub;

	public event EventHandler<HubScript>? ScriptOpenRequested;

	public event EventHandler<HubScript>? ScriptExecuteRequested;

	public event EventHandler? SettingsRequested;

	public ScriptHubView()
	{
		InitializeComponent();
	}

	private void ResultsScroller_SizeChanged(object sender, SizeChangedEventArgs e)
	{
		//IL_000a: Unknown result type (might be due to invalid IL or missing references)
		//IL_000f: Unknown result type (might be due to invalid IL or missing references)
		//IL_001d: Unknown result type (might be due to invalid IL or missing references)
		//IL_0022: Unknown result type (might be due to invalid IL or missing references)
		//IL_0031: Unknown result type (might be due to invalid IL or missing references)
		//IL_0036: Unknown result type (might be due to invalid IL or missing references)
		if (e.WidthChanged)
		{
			Size newSize = e.NewSize;
			double width = newSize.Width;
			Thickness padding = ((Control)ResultsScroller).Padding;
			double num = width - padding.Left;
			padding = ((Control)ResultsScroller).Padding;
			double num2 = num - padding.Right;
			ResultColumns = Math.Clamp((int)(num2 / 236.0), 1, 8);
		}
	}

	public async Task EnsureLoadedAsync()
	{
		ScriptHub hub = Hub;
		if (hub != null && hub.HasApiKey && hub.Results.Count <= 0 && !hub.IsLoading)
		{
			await hub.SearchAsync();
		}
	}

	private async void Search_Click(object sender, RoutedEventArgs e)
	{
		ScriptHub hub = Hub;
		if (hub != null)
		{
			await hub.SearchAsync();
		}
	}

	private async void SearchBox_KeyDown(object sender, KeyEventArgs e)
	{
		if ((int)e.Key == 6)
		{
			((RoutedEventArgs)e).Handled = true;
			ScriptHub hub = Hub;
			if (hub != null)
			{
				await hub.SearchAsync();
			}
		}
	}

	private async void Sort_SelectionChanged(object sender, SelectionChangedEventArgs e)
	{
		if (((FrameworkElement)this).IsLoaded)
		{
			ScriptHub hub = Hub;
			if (hub != null)
			{
				await hub.SearchAsync();
			}
		}
	}

	private async void Filter_Changed(object sender, RoutedEventArgs e)
	{
		ScriptHub hub = Hub;
		if (hub != null)
		{
			await hub.SearchAsync();
		}
	}

	private async void Previous_Click(object sender, RoutedEventArgs e)
	{
		ScriptHub hub = Hub;
		if (hub != null)
		{
			await hub.PreviousPageAsync();
			ResultsScroller.ScrollToTop();
		}
	}

	private async void Next_Click(object sender, RoutedEventArgs e)
	{
		ScriptHub hub = Hub;
		if (hub != null)
		{
			await hub.NextPageAsync();
			ResultsScroller.ScrollToTop();
		}
	}

	private void OpenScript_Click(object sender, RoutedEventArgs e)
	{
		FrameworkElement val = (FrameworkElement)((sender is FrameworkElement) ? sender : null);
		if (val != null && val.DataContext is HubScript e2)
		{
			ScriptOpenRequested?.Invoke(this, e2);
		}
	}

	private void ExecuteScript_Click(object sender, RoutedEventArgs e)
	{
		FrameworkElement val = (FrameworkElement)((sender is FrameworkElement) ? sender : null);
		if (val != null && val.DataContext is HubScript e2)
		{
			ScriptExecuteRequested?.Invoke(this, e2);
		}
	}

	private void OpenScriptPage_Click(object sender, RoutedEventArgs e)
	{
		//IL_0095: Unknown result type (might be due to invalid IL or missing references)
		FrameworkElement val = (FrameworkElement)((sender is FrameworkElement) ? sender : null);
		if (val == null || !(val.DataContext is HubScript hubScript) || string.IsNullOrEmpty(hubScript.Slug))
		{
			return;
		}
		try
		{
			Process.Start(new ProcessStartInfo("https://rscripts.net/script/" + hubScript.Slug)
			{
				UseShellExecute = true
			});
		}
		catch (Exception ex) when ((ex is Win32Exception || ex is InvalidOperationException) ? true : false)
		{
			MessageBox.Show(Window.GetWindow((DependencyObject)(object)this), "Could not open the browser:\n" + ex.Message, "Velocity", (MessageBoxButton)0, (MessageBoxImage)48);
		}
	}

	private void OpenSettings_Click(object sender, RoutedEventArgs e)
	{
		SettingsRequested?.Invoke(this, EventArgs.Empty);
	}

	[DebuggerNonUserCode]
	[GeneratedCode("PresentationBuildTasks", "10.0.12.0")]
	[EditorBrowsable(EditorBrowsableState.Never)]
	void IComponentConnector.Connect(int connectionId, object target)
	{
		//IL_004b: Unknown result type (might be due to invalid IL or missing references)
		//IL_0055: Expected Obj, but got Unknown
		//IL_0062: Unknown result type (might be due to invalid IL or missing references)
		//IL_006c: Expected Obj, but got Unknown
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
		//IL_012f: Unknown result type (might be due to invalid IL or missing references)
		//IL_0139: Expected Obj, but got Unknown
		//IL_0146: Unknown result type (might be due to invalid IL or missing references)
		//IL_0150: Expected Obj, but got Unknown
		//IL_0152: Unknown result type (might be due to invalid IL or missing references)
		//IL_015e: Unknown result type (might be due to invalid IL or missing references)
		//IL_0168: Expected Obj, but got Unknown
		//IL_016a: Unknown result type (might be due to invalid IL or missing references)
		//IL_0176: Unknown result type (might be due to invalid IL or missing references)
		//IL_0180: Expected Obj, but got Unknown
		switch (connectionId)
		{
		case 1:
			SearchBox = (TextBox)target;
			((UIElement)SearchBox).KeyDown += SearchBox_KeyDown;
			break;
		case 2:
			((Selector)(ComboBox)target).SelectionChanged += Sort_SelectionChanged;
			break;
		case 3:
			((ButtonBase)(Button)target).Click += Search_Click;
			break;
		case 4:
			((ButtonBase)(ToggleButton)target).Click += Filter_Changed;
			break;
		case 5:
			((ButtonBase)(ToggleButton)target).Click += Filter_Changed;
			break;
		case 6:
			((ButtonBase)(ToggleButton)target).Click += Filter_Changed;
			break;
		case 7:
			((ButtonBase)(ToggleButton)target).Click += Filter_Changed;
			break;
		case 8:
			((ButtonBase)(Button)target).Click += OpenSettings_Click;
			break;
		case 9:
			((ButtonBase)(Button)target).Click += Search_Click;
			break;
		case 10:
			ResultsScroller = (ScrollViewer)target;
			((FrameworkElement)ResultsScroller).SizeChanged += ResultsScroller_SizeChanged;
			break;
		case 14:
			((ButtonBase)(Button)target).Click += Previous_Click;
			break;
		case 15:
			((ButtonBase)(Button)target).Click += Next_Click;
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
		//IL_0017: Unknown result type (might be due to invalid IL or missing references)
		//IL_0023: Unknown result type (might be due to invalid IL or missing references)
		//IL_002d: Expected Obj, but got Unknown
		//IL_002f: Unknown result type (might be due to invalid IL or missing references)
		//IL_003b: Unknown result type (might be due to invalid IL or missing references)
		//IL_0045: Expected Obj, but got Unknown
		//IL_0047: Unknown result type (might be due to invalid IL or missing references)
		//IL_0053: Unknown result type (might be due to invalid IL or missing references)
		//IL_005d: Expected Obj, but got Unknown
		switch (connectionId)
		{
		case 11:
			((ButtonBase)(Button)target).Click += ExecuteScript_Click;
			break;
		case 12:
			((ButtonBase)(Button)target).Click += OpenScript_Click;
			break;
		case 13:
			((ButtonBase)(Button)target).Click += OpenScriptPage_Click;
			break;
		}
	}

	static ScriptHubView()
	{
		//IL_001f: Unknown result type (might be due to invalid IL or missing references)
		//IL_0029: Expected Obj, but got Unknown
	}
}
