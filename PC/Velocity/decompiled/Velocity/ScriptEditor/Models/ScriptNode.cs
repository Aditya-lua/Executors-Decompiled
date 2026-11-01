using System.Collections.ObjectModel;
using System.ComponentModel;
using System.IO;
using System.Runtime.CompilerServices;

namespace ScriptEditor.Models;

public class ScriptNode : INotifyPropertyChanged
{
	private bool _isExpanded;

	private bool _isSelected;

	public string Name { get; }

	public string FullPath { get; }

	public bool IsDirectory { get; }

	public ObservableCollection<ScriptNode> Children { get; } = new ObservableCollection<ScriptNode>();

	public bool IsUnreadable { get; set; }

	public bool IsExpanded
	{
		get
		{
			return _isExpanded;
		}
		set
		{
			Set(ref _isExpanded, value, "IsExpanded");
		}
	}

	public bool IsSelected
	{
		get
		{
			return _isSelected;
		}
		set
		{
			Set(ref _isSelected, value, "IsSelected");
		}
	}

	public event PropertyChangedEventHandler? PropertyChanged;

	public ScriptNode(string fullPath, bool isDirectory)
	{
		FullPath = fullPath;
		IsDirectory = isDirectory;
		Name = Path.GetFileName(fullPath);
		if (string.IsNullOrEmpty(Name))
		{
			Name = fullPath;
		}
	}

	private void Set(ref bool field, bool value, [CallerMemberName] string? name = null)
	{
		if (field != value)
		{
			field = value;
			PropertyChanged?.Invoke(this, new PropertyChangedEventArgs(name));
		}
	}
}
