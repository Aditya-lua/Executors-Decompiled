using System;
using System.CodeDom.Compiler;
using System.Diagnostics;
using System.Windows;

namespace ScriptEditor.Controls;

public partial class ClientPickerWindow
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
		Application.LoadComponent(this, new Uri("/Velocity;component/controls/clientpickerwindow.xaml", UriKind.Relative));
	}
}

public partial class ScriptHubView
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
		Application.LoadComponent(this, new Uri("/Velocity;component/controls/scripthubview.xaml", UriKind.Relative));
	}
}

public partial class SettingsView
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
		Application.LoadComponent(this, new Uri("/Velocity;component/controls/settingsview.xaml", UriKind.Relative));
	}
}
