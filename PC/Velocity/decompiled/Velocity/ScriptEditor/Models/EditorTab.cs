using System.Collections.Generic;
using System.ComponentModel;
using System.IO;
using System.Runtime.CompilerServices;

namespace ScriptEditor.Models;

public class EditorTab : INotifyPropertyChanged
{
	private static int _counter;

	private string _title = "Untitled";

	private string? _filePath;

	private bool _isDirty;

	private bool _isActive;

	public const string Language = "lua";

	public string Id { get; }

	public string Title
	{
		get
		{
			return _title;
		}
		set
		{
			Set(ref _title, value, "Title");
		}
	}

	public string? FilePath
	{
		get
		{
			return _filePath;
		}
		set
		{
			if (Set(ref _filePath, value, "FilePath") && value != null)
			{
				Title = Path.GetFileName(value);
			}
		}
	}

	public bool IsDirty
	{
		get
		{
			return _isDirty;
		}
		set
		{
			Set(ref _isDirty, value, "IsDirty");
		}
	}

	public bool IsActive
	{
		get
		{
			return _isActive;
		}
		set
		{
			Set(ref _isActive, value, "IsActive");
		}
	}

	public event PropertyChangedEventHandler? PropertyChanged;

	public EditorTab(string? filePath = null)
	{
		Id = $"tab{++_counter}";
		if (filePath != null)
		{
			FilePath = filePath;
			Title = Path.GetFileName(filePath);
		}
		else
		{
			Title = $"Untitled {_counter}";
		}
	}

	private bool Set<T>(ref T field, T value, [CallerMemberName] string? name = null)
	{
		if (EqualityComparer<T>.Default.Equals(field, value))
		{
			return false;
		}
		field = value;
		OnPropertyChanged(name);
		return true;
	}

	private void OnPropertyChanged(string? name)
	{
		PropertyChanged?.Invoke(this, new PropertyChangedEventArgs(name));
	}
}
