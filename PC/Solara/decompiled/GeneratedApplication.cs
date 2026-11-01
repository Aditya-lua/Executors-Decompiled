using System;
using System.CodeDom.Compiler;
using System.Diagnostics;
using System.Windows;

namespace XamlGeneratedNamespace;

public class GeneratedApplication : Application
{
	private bool _contentLoaded;

	[DebuggerNonUserCode]
	[GeneratedCode("PresentationBuildTasks", "4.0.0.0")]
	public void InitializeComponent()
	{
		if (!_contentLoaded)
		{
			_contentLoaded = true;
			((Application)this).StartupUri = new Uri("MainWindow.xaml", UriKind.Relative);
			Uri uri = new Uri("/Solara;component/app.xaml", UriKind.Relative);
			Application.LoadComponent((object)this, uri);
		}
	}

	[STAThread]
	[DebuggerNonUserCode]
	[GeneratedCode("PresentationBuildTasks", "4.0.0.0")]
	public static void Main()
	{
		GeneratedApplication generatedApplication = new GeneratedApplication();
		generatedApplication.InitializeComponent();
		((Application)generatedApplication).Run();
	}
}
