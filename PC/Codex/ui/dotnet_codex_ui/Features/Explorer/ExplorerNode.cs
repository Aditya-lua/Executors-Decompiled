using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Collections.Specialized;
using System.ComponentModel;

namespace dotnet_codex_ui.Features.Explorer;

internal sealed class ExplorerNode : INotifyPropertyChanged
{
	private string NameField;

	private string FullPathField;

	private bool IsExpandedField;

	private bool IsSelectedField;

	private bool IsRenamingField;

	private string EditNameField = "";

	private bool IsDropTargetField;

	private int LeafCountField;

	public ExplorerNode? Parent { get; internal set; }

	public bool IsDirectory { get; }

	public bool IsNote { get; }

	public ObservableCollection<ExplorerNode> Children { get; }

	public bool IsLoaded { get; internal set; }

	public string Name
	{
		get
		{
			return NameField;
		}
		internal set
		{
			Set(ref NameField, value, "Name");
		}
	}

	public string FullPath
	{
		get
		{
			return FullPathField;
		}
		internal set
		{
			Set(ref FullPathField, value, "FullPath");
		}
	}

	public bool IsExpanded
	{
		get
		{
			return IsExpandedField;
		}
		set
		{
			if (Set(ref IsExpandedField, value, "IsExpanded") & value)
			{
				Expanded?.Invoke(this);
			}
		}
	}

	public bool IsSelected
	{
		get
		{
			return IsSelectedField;
		}
		set
		{
			Set(ref IsSelectedField, value, "IsSelected");
		}
	}

	public bool IsRenaming
	{
		get
		{
			return IsRenamingField;
		}
		internal set
		{
			Set(ref IsRenamingField, value, "IsRenaming");
		}
	}

	public string EditName
	{
		get
		{
			return EditNameField;
		}
		set
		{
			Set(ref EditNameField, value, "EditName");
		}
	}

	public bool IsDropTarget
	{
		get
		{
			return IsDropTargetField;
		}
		internal set
		{
			Set(ref IsDropTargetField, value, "IsDropTarget");
		}
	}

	public int LeafCount
	{
		get
		{
			return LeafCountField;
		}
		private set
		{
			if (Set(ref LeafCountField, value, "LeafCount"))
			{
				PropertyChanged?.Invoke(this, new PropertyChangedEventArgs("HasLeaves"));
			}
		}
	}

	public bool HasLeaves => LeafCountField > 0;

	public static event Action<ExplorerNode>? Expanded;

	public event PropertyChangedEventHandler? PropertyChanged;

	public ExplorerNode(string Name, string FullPath, bool IsDirectory, ExplorerNode? Parent, bool IsNote = false)
	{
		NameField = Name;
		FullPathField = FullPath;
		this.IsDirectory = IsDirectory;
		this.Parent = Parent;
		this.IsNote = IsNote;
		Children = new ObservableCollection<ExplorerNode>();
		Children.CollectionChanged += (object? _, NotifyCollectionChangedEventArgs _) =>
		{
			Recount();
		};
	}

	private void Recount()
	{
		int num = 0;
		foreach (ExplorerNode child in Children)
		{
			num += ((!child.IsNote) ? ((!child.IsDirectory) ? 1 : child.LeafCount) : 0);
		}
		if (num != LeafCountField)
		{
			LeafCount = num;
			Parent?.Recount();
		}
	}

	private bool Set<T>(ref T Field, T Value, string Property)
	{
		if (EqualityComparer<T>.Default.Equals(Field, Value))
		{
			return false;
		}
		Field = Value;
		PropertyChanged?.Invoke(this, new PropertyChangedEventArgs(Property));
		return true;
	}

	public override string ToString()
	{
		return Name;
	}
}
