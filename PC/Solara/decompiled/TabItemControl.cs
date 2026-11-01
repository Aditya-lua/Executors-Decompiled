using System;
using System.CodeDom.Compiler;
using System.ComponentModel;
using System.Diagnostics;
using System.Runtime.CompilerServices;
using System.Threading;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Controls.Primitives;
using System.Windows.Markup;
using Wpf.Ui.Controls;

namespace SolaraUI;

public class TabItemControl : UserControl, IComponentConnector
{
	public static readonly DependencyProperty TabTitleProperty = DependencyProperty.Register("TabTitle", typeof(string), typeof(TabItemControl), new PropertyMetadata((object)"Tab"));

	public static readonly DependencyProperty IsSelectedProperty = DependencyProperty.Register("IsSelected", typeof(bool), typeof(TabItemControl), new PropertyMetadata((object)false, new PropertyChangedCallback(OnIsSelectedChanged)));

	[CompilerGenerated]
	private RoutedEventHandler m_CloseTab;

	private bool _contentLoaded;

	public bool IsSelected
	{
		get
		{
			return (bool)((DependencyObject)this).GetValue(IsSelectedProperty);
		}
		set
		{
			((DependencyObject)this).SetValue(IsSelectedProperty, (object)value);
		}
	}

	public string TabTitle
	{
		get
		{
			return (string)((DependencyObject)this).GetValue(TabTitleProperty);
		}
		set
		{
			((DependencyObject)this).SetValue(TabTitleProperty, (object)value);
		}
	}

	public event RoutedEventHandler CloseTab
	{
		[CompilerGenerated]
		add
		{
			//IL_0010: Unknown result type (might be due to invalid IL or missing references)
			//IL_0016: Expected O, but got Unknown
			RoutedEventHandler val = this.m_CloseTab;
			RoutedEventHandler val2;
			do
			{
				val2 = val;
				RoutedEventHandler value2 = (RoutedEventHandler)Delegate.Combine((Delegate?)(object)val2, (Delegate?)(object)value);
				val = Interlocked.CompareExchange(ref this.m_CloseTab, value2, val2);
			}
			while (val != val2);
		}
		[CompilerGenerated]
		remove
		{
			//IL_0010: Unknown result type (might be due to invalid IL or missing references)
			//IL_0016: Expected O, but got Unknown
			RoutedEventHandler val = this.m_CloseTab;
			RoutedEventHandler val2;
			do
			{
				val2 = val;
				RoutedEventHandler value2 = (RoutedEventHandler)Delegate.Remove((Delegate?)(object)val2, (Delegate?)(object)value);
				val = Interlocked.CompareExchange(ref this.m_CloseTab, value2, val2);
			}
			while (val != val2);
		}
	}

	public TabItemControl()
	{
		InitializeComponent();
	}

	private static void OnIsSelectedChanged(DependencyObject d, DependencyPropertyChangedEventArgs e)
	{
		if (d is TabItemControl tabItemControl)
		{
			tabItemControl.UpdateVisualState((bool)((DependencyPropertyChangedEventArgs)(ref e)).NewValue);
		}
	}

	private void UpdateVisualState(bool isSelected)
	{
		if (isSelected)
		{
			((UIElement)this).Opacity = 1.0;
		}
		else
		{
			((UIElement)this).Opacity = 0.4;
		}
	}

	private void CloseButton_Click(object sender, RoutedEventArgs e)
	{
		//IL_000d: Unknown result type (might be due to invalid IL or missing references)
		//IL_0012: Unknown result type (might be due to invalid IL or missing references)
		//IL_0013: Unknown result type (might be due to invalid IL or missing references)
		//IL_0015: Invalid comparison between Unknown and I4
		MessageBoxResult val = MessageBox.Show("Are you sure you want to close this tab?", "Confirm Close", (MessageBoxButton)4, (MessageBoxImage)32);
		if ((int)val == 6)
		{
			RoutedEventHandler obj = this.CloseTab;
			if (obj != null)
			{
				obj.Invoke((object)this, e);
			}
		}
	}

	[DebuggerNonUserCode]
	[GeneratedCode("PresentationBuildTasks", "4.0.0.0")]
	public void InitializeComponent()
	{
		if (!_contentLoaded)
		{
			_contentLoaded = true;
			Uri uri = new Uri("/Solara;component/tabitemcontrol.xaml", UriKind.Relative);
			Application.LoadComponent((object)this, uri);
		}
	}

	[DebuggerNonUserCode]
	[GeneratedCode("PresentationBuildTasks", "4.0.0.0")]
	[EditorBrowsable(EditorBrowsableState.Never)]
	void IComponentConnector.Connect(int connectionId, object target)
	{
		//IL_0011: Unknown result type (might be due to invalid IL or missing references)
		//IL_001b: Expected O, but got Unknown
		if (connectionId == 1)
		{
			((ButtonBase)(Button)target).Click += new RoutedEventHandler(CloseButton_Click);
		}
		else
		{
			_contentLoaded = true;
		}
	}
}
