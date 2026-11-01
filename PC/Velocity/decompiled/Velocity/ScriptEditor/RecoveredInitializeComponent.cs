using System;
using System.CodeDom.Compiler;
using System.Diagnostics;
using System.Windows;

namespace ScriptEditor;

public partial class App
{
	private bool _contentLoaded;

	[DebuggerNonUserCode]
	[GeneratedCode("RecoveredFromBaml", "1.0")]
	public void InitializeComponent()
	{
		if (_contentLoaded)
		{
			return;
		}
		_contentLoaded = true;
		Application.LoadComponent(this, new Uri("/Velocity;component/app.xaml", UriKind.Relative));
	}

	[STAThread]
	[DebuggerNonUserCode]
	[GeneratedCode("RecoveredFromBaml", "1.0")]
	public static void Main()
	{
		App app = new App();
		app.InitializeComponent();
		app.Run();
	}
}

public partial class MainWindow
{
	private bool _contentLoaded;

	[DebuggerNonUserCode]
	[GeneratedCode("RecoveredFromBaml", "1.0")]
	public void InitializeComponent()
	{
		if (_contentLoaded)
		{
			return;
		}
		_contentLoaded = true;
		Application.LoadComponent(this, new Uri("/Velocity;component/mainwindow.xaml", UriKind.Relative));
	}
}

public partial class SplashWindow
{
	private bool _contentLoaded;

	[DebuggerNonUserCode]
	[GeneratedCode("RecoveredFromBaml", "1.0")]
	public void InitializeComponent()
	{
		if (_contentLoaded)
		{
			return;
		}
		_contentLoaded = true;
		Application.LoadComponent(this, new Uri("/Velocity;component/splashwindow.xaml", UriKind.Relative));
	}
}

