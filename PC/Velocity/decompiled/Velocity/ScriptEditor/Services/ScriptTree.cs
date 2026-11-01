using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel;
using System.IO;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Windows.Threading;
using ScriptEditor.Models;

namespace ScriptEditor.Services;

public sealed class ScriptTree : INotifyPropertyChanged, IDisposable
{
	private const int MaxDepth = 12;

	private readonly DispatcherTimer _debounce;

	private FileSystemWatcher? _watcher;

	private bool _isEmpty = true;

	public string RootPath { get; private set; }

	public ObservableCollection<ScriptNode> Nodes { get; } = new ObservableCollection<ScriptNode>();

	public bool IsEmpty
	{
		get
		{
			return _isEmpty;
		}
		private set
		{
			if (_isEmpty != value)
			{
				_isEmpty = value;
				OnPropertyChanged("IsEmpty");
			}
		}
	}

	public event PropertyChangedEventHandler? PropertyChanged;

	public ScriptTree(string rootPath)
	{
		//IL_0020: Unknown result type (might be due to invalid IL or missing references)
		//IL_0025: Unknown result type (might be due to invalid IL or missing references)
		//IL_003b: Expected Obj, but got Unknown
		RootPath = rootPath;
		_debounce = new DispatcherTimer
		{
			Interval = TimeSpan.FromMilliseconds(300L)
		};
		_debounce.Tick += (object? _, EventArgs _) =>
		{
			_debounce.Stop();
			Refresh();
		};
	}

	public void ChangeRoot(string rootPath)
	{
		if (!string.Equals(RootPath, rootPath, StringComparison.OrdinalIgnoreCase))
		{
			Dispose();
			RootPath = rootPath;
			Nodes.Clear();
			OnPropertyChanged("RootPath");
			Start();
		}
	}

	public void Start()
	{
		try
		{
			Directory.CreateDirectory(RootPath);
		}
		catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException) ? true : false)
		{
			IsEmpty = true;
			return;
		}
		Refresh();
		StartWatching();
	}

	public void Refresh()
	{
		HashSet<string> hashSet = new HashSet<string>(StringComparer.OrdinalIgnoreCase);
		CollectExpanded(Nodes, hashSet);
		string selected = FindSelected(Nodes)?.FullPath;
		Nodes.Clear();
		foreach (ScriptNode item in Enumerate(RootPath, 0, hashSet, selected))
		{
			Nodes.Add(item);
		}
		IsEmpty = Nodes.Count == 0;
	}

	private static void CollectExpanded(IEnumerable<ScriptNode> nodes, HashSet<string> into)
	{
		foreach (ScriptNode node in nodes)
		{
			if (node.IsExpanded)
			{
				into.Add(node.FullPath);
			}
			CollectExpanded(node.Children, into);
		}
	}

	private static ScriptNode? FindSelected(IEnumerable<ScriptNode> nodes)
	{
		foreach (ScriptNode node in nodes)
		{
			if (node.IsSelected)
			{
				return node;
			}
			ScriptNode scriptNode = FindSelected(node.Children);
			if (scriptNode != null)
			{
				return scriptNode;
			}
		}
		return null;
	}

	private static List<ScriptNode> Enumerate(string directory, int depth, HashSet<string> expanded, string? selected)
	{
		List<ScriptNode> list = new List<ScriptNode>();
		if (depth >= 12)
		{
			return list;
		}
		string[] directories;
		string[] files;
		try
		{
			directories = Directory.GetDirectories(directory);
			files = Directory.GetFiles(directory);
		}
		catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException) ? true : false)
		{
			return list;
		}
		foreach (string item in directories.OrderBy(Path.GetFileName, StringComparer.OrdinalIgnoreCase))
		{
			if (IsHidden(item))
			{
				continue;
			}
			ScriptNode scriptNode = new ScriptNode(item, isDirectory: true)
			{
				IsExpanded = expanded.Contains(item),
				IsSelected = (selected != null && string.Equals(item, selected, StringComparison.OrdinalIgnoreCase))
			};
			foreach (ScriptNode item2 in Enumerate(item, depth + 1, expanded, selected))
			{
				scriptNode.Children.Add(item2);
			}
			list.Add(scriptNode);
		}
		foreach (string item3 in files.OrderBy(Path.GetFileName, StringComparer.OrdinalIgnoreCase))
		{
			if (!IsHidden(item3))
			{
				list.Add(new ScriptNode(item3, isDirectory: false)
				{
					IsSelected = (selected != null && string.Equals(item3, selected, StringComparison.OrdinalIgnoreCase))
				});
			}
		}
		return list;
	}

	private static bool IsHidden(string path)
	{
		try
		{
			FileAttributes attributes = File.GetAttributes(path);
			return attributes.HasFlag(FileAttributes.Hidden) || attributes.HasFlag(FileAttributes.System);
		}
		catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException) ? true : false)
		{
			return true;
		}
	}

	private void StartWatching()
	{
		try
		{
			_watcher = new FileSystemWatcher(RootPath)
			{
				IncludeSubdirectories = true,
				NotifyFilter = (NotifyFilters.FileName | NotifyFilters.DirectoryName)
			};
			_watcher.Created += OnChanged;
			_watcher.Deleted += OnChanged;
			_watcher.Renamed += OnChanged;
			_watcher.EnableRaisingEvents = true;
		}
		catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException) ? true : false)
		{
			_watcher = null;
		}
	}

	private void OnChanged(object sender, FileSystemEventArgs e)
	{
		_debounce.Dispatcher.BeginInvoke((Delegate)(Action)(() =>
		{
			_debounce.Stop();
			_debounce.Start();
		}), Array.Empty<object>());
	}

	private void OnPropertyChanged([CallerMemberName] string? name = null)
	{
		PropertyChanged?.Invoke(this, new PropertyChangedEventArgs(name));
	}

	public void Dispose()
	{
		_debounce.Stop();
		if (_watcher != null)
		{
			_watcher.EnableRaisingEvents = false;
			_watcher.Created -= OnChanged;
			_watcher.Deleted -= OnChanged;
			_watcher.Renamed -= OnChanged;
			_watcher.Dispose();
			_watcher = null;
		}
	}
}
