using System;
using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.ComponentModel;
using System.Diagnostics;
using System.Linq;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Controls.Primitives;
using System.Windows.Markup;

namespace ScriptEditor.Controls;

public partial class ClientPickerWindow : Window, IComponentConnector
{
	private sealed class ClientChoice : INotifyPropertyChanged
	{
		private bool _isSelected = true;

		public Process Process { get; }

		public string Title { get; }

		public string Detail { get; }

		public bool IsSelected
		{
			get
			{
				return _isSelected;
			}
			set
			{
				if (_isSelected != value)
				{
					_isSelected = value;
					PropertyChanged?.Invoke(this, new PropertyChangedEventArgs("IsSelected"));
				}
			}
		}

		public event PropertyChangedEventHandler? PropertyChanged;

		public ClientChoice(Process process)
		{
			Process = process;
			Title = $"{process.ProcessName} — {process.Id}";
			string text;
			try
			{
				text = process.StartTime.ToString("HH:mm:ss");
			}
			catch (Exception ex) when ((ex is InvalidOperationException || ex is Win32Exception) ? true : false)
			{
				text = "unknown";
			}
			Detail = "Started " + text;
		}
	}

	private readonly List<ClientChoice> _choices;

	internal ItemsControl ClientList;

	public IReadOnlyList<Process> Selected { get; private set; } = Array.Empty<Process>();

	public ClientPickerWindow(IEnumerable<Process> clients)
	{
		InitializeComponent();
		_choices = clients.Select((Process c) => new ClientChoice(c)).ToList();
		ClientList.ItemsSource = _choices;
	}

	private void Confirm_Click(object sender, RoutedEventArgs e)
	{
		Selected = (from c in _choices
			where c.IsSelected
			select c.Process).ToList();
		((Window)this).DialogResult = true;
	}

	private void Cancel_Click(object sender, RoutedEventArgs e)
	{
		((Window)this).DialogResult = false;
	}

	[DebuggerNonUserCode]
	[GeneratedCode("PresentationBuildTasks", "10.0.12.0")]
	[EditorBrowsable(EditorBrowsableState.Never)]
	void IComponentConnector.Connect(int connectionId, object target)
	{
		//IL_0018: Unknown result type (might be due to invalid IL or missing references)
		//IL_0022: Expected Obj, but got Unknown
		//IL_0024: Unknown result type (might be due to invalid IL or missing references)
		//IL_0030: Unknown result type (might be due to invalid IL or missing references)
		//IL_003a: Expected Obj, but got Unknown
		//IL_003c: Unknown result type (might be due to invalid IL or missing references)
		//IL_0048: Unknown result type (might be due to invalid IL or missing references)
		//IL_0052: Expected Obj, but got Unknown
		switch (connectionId)
		{
		case 1:
			ClientList = (ItemsControl)target;
			break;
		case 2:
			((ButtonBase)(Button)target).Click += Cancel_Click;
			break;
		case 3:
			((ButtonBase)(Button)target).Click += Confirm_Click;
			break;
		default:
			_contentLoaded = true;
			break;
		}
	}
}
