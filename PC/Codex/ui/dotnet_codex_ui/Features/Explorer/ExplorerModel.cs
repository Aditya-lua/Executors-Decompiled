using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.IO;
using System.Linq;
using System.Threading;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Threading;
using dotnet_codex_ui.Infrastructure.Logging;

namespace dotnet_codex_ui.Features.Explorer;

internal sealed class ExplorerModel : IDisposable
{
	private static readonly TimeSpan Debounce = TimeSpan.FromMilliseconds(150L);

	private readonly Dictionary<string, ExplorerNode> Nodes = new Dictionary<string, ExplorerNode>(StringComparer.OrdinalIgnoreCase);

	private readonly SemaphoreSlim Gate = new SemaphoreSlim(1, 1);

	private readonly CancellationTokenSource Lifetime = new CancellationTokenSource();

	private readonly object PendingLock = new object();

	private readonly Timer TimerField;

	private FileSystemWatcher? WatcherField;

	private HashSet<string> DirtyDirs = new HashSet<string>(StringComparer.OrdinalIgnoreCase);

	private HashSet<string> ModifiedField = new HashSet<string>(StringComparer.OrdinalIgnoreCase);

	private HashSet<string> DeletedField = new HashSet<string>(StringComparer.OrdinalIgnoreCase);

	private List<(string Old, string New)> RenamedField = new List<(string, string)>();

	private bool OverflowField;

	private bool Disposed;

	public FileSystemProvider Provider { get; }

	public ExplorerNode RootNode { get; }

	public ObservableCollection<ExplorerNode> Items => RootNode.Children;

	public event Action<ExplorerChanges>? Changes;

	public event Action<string>? Problem;

	public ExplorerModel(FileSystemProvider Provider)
	{
		this.Provider = Provider;
		RootNode = new ExplorerNode(Path.GetFileName(Provider.Root), Provider.Root, IsDirectory: true, null)
		{
			IsLoaded = false
		};
		Nodes[Provider.Root] = RootNode;
		TimerField = new Timer((object? _) =>
		{
			OnTimer();
		}, null, -1, -1);
		ExplorerNode.Expanded += OnExpanded;
	}

	public bool TryGetNode(string Path0, out ExplorerNode Node)
	{
		return Nodes.TryGetValue(Normalize(Path0), out Node);
	}

	private static string Normalize(string Path0)
	{
		return Path.TrimEndingDirectorySeparator(Path.GetFullPath(Path0));
	}

	public async Task InitializeAsync()
	{
		if (!Provider.EnsureRoot())
		{
			Problem?.Invoke("The scripts folder couldn't be created.");
			return;
		}
		await LoadAsync(RootNode);
		StartWatcher();
	}

	public void Dispose()
	{
		if (!Disposed)
		{
			Disposed = true;
			ExplorerNode.Expanded -= OnExpanded;
			Lifetime.Cancel();
			TimerField.Dispose();
			StopWatcher();
			Lifetime.Dispose();
		}
	}

	private async void OnExpanded(ExplorerNode Node)
	{
		if (Disposed || Node.IsNote || !Node.IsDirectory || Node.IsLoaded || !Nodes.ContainsKey(Normalize(Node.FullPath)))
		{
			return;
		}
		try
		{
			await LoadAsync(Node);
		}
		catch (OperationCanceledException)
		{
		}
		catch (Exception failure)
		{
			AppLog.Error(failure, null, "OnExpanded", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Features\\Explorer\\ExplorerModel.cs");
		}
	}

	public Task RefreshAsync(ExplorerNode? Node = null)
	{
		if (Node != null)
		{
			return LoadAsync(Node);
		}
		return RefreshAllAsync();
	}

	private async Task LoadAsync(ExplorerNode Node)
	{
		await Gate.WaitAsync(Lifetime.Token);
		try
		{
			if (!Disposed && Nodes.ContainsKey(Normalize(Node.FullPath)))
			{
				EnumerateResult result = await Provider.EnumerateAsync(Node.FullPath, Lifetime.Token);
				if (!Disposed && Nodes.ContainsKey(Normalize(Node.FullPath)))
				{
					Apply(Node, result);
				}
			}
		}
		finally
		{
			Gate.Release();
		}
	}

	private async Task RefreshAllAsync()
	{
		Queue<ExplorerNode> Queue = new Queue<ExplorerNode>();
		Queue.Enqueue(RootNode);
		while (Queue.Count > 0)
		{
			ExplorerNode Node = Queue.Dequeue();
			if (Node != RootNode && !Node.IsLoaded)
			{
				continue;
			}
			await LoadAsync(Node);
			foreach (ExplorerNode item in Node.Children.Where((ExplorerNode C) => C.IsDirectory && !C.IsNote).ToList())
			{
				Queue.Enqueue(item);
			}
		}
	}

	private void Apply(ExplorerNode Folder, EnumerateResult Result)
	{
		Folder.IsLoaded = true;
		IReadOnlyList<FsEntry> entries = Result.Entries;
		Dictionary<string, ExplorerNode> dictionary = Folder.Children.Where((ExplorerNode C) => !C.IsNote).ToDictionary((ExplorerNode C) => C.Name, StringComparer.OrdinalIgnoreCase);
		HashSet<string> hashSet = new HashSet<string>(entries.Select((FsEntry E) => E.Name), StringComparer.OrdinalIgnoreCase);
		foreach (ExplorerNode item in Folder.Children.ToList())
		{
			if (item.IsNote || !hashSet.Contains(item.Name))
			{
				Forget(item);
				Folder.Children.Remove(item);
			}
		}
		for (int num = 0; num < entries.Count; num++)
		{
			FsEntry fsEntry = entries[num];
			if (dictionary.TryGetValue(fsEntry.Name, out var value) && Folder.Children.Contains(value))
			{
				if (value.Name != fsEntry.Name)
				{
					value.Name = fsEntry.Name;
					value.FullPath = fsEntry.FullPath;
				}
				int num2 = Folder.Children.IndexOf(value);
				if (num2 != num)
				{
					Folder.Children.Move(num2, num);
				}
			}
			else
			{
				Folder.Children.Insert(num, Create(Folder, fsEntry));
			}
		}
		if (entries.Count == 0)
		{
			string name = Result.State switch
			{
				EntryState.Denied => "Access denied", 
				EntryState.Missing => "Folder not found", 
				EntryState.Failed => "Can't read this folder", 
				_ => (Folder.Parent == null) ? "No scripts yet" : "Empty", 
			};
			Folder.Children.Add(new ExplorerNode(name, "", IsDirectory: false, Folder, IsNote: true));
		}
	}

	private ExplorerNode Create(ExplorerNode Parent, FsEntry Entry)
	{
		ExplorerNode explorerNode = new ExplorerNode(Entry.Name, Entry.FullPath, Entry.IsDirectory, Parent);
		Nodes[Normalize(Entry.FullPath)] = explorerNode;
		if (Entry.IsDirectory)
		{
			explorerNode.Children.Add(new ExplorerNode("Loading…", "", IsDirectory: false, explorerNode, IsNote: true));
		}
		return explorerNode;
	}

	private void Forget(ExplorerNode Node)
	{
		if (!Node.IsNote)
		{
			Nodes.Remove(Normalize(Node.FullPath));
		}
		foreach (ExplorerNode child in Node.Children)
		{
			Forget(child);
		}
	}

	private void StartWatcher()
	{
		StopWatcher();
		try
		{
			FileSystemWatcher fileSystemWatcher = new FileSystemWatcher(Provider.Root)
			{
				IncludeSubdirectories = true,
				NotifyFilter = (NotifyFilters.FileName | NotifyFilters.DirectoryName | NotifyFilters.Size | NotifyFilters.LastWrite),
				InternalBufferSize = 65536
			};
			fileSystemWatcher.Created += (object _, FileSystemEventArgs E) =>
			{
				Queue(E.FullPath, Created: true);
			};
			fileSystemWatcher.Deleted += (object _, FileSystemEventArgs E) =>
			{
				Queue(E.FullPath, Created: false, Deleted: true);
			};
			fileSystemWatcher.Changed += (object _, FileSystemEventArgs E) =>
			{
				Queue(E.FullPath, Created: false, Deleted: false, Modified: true);
			};
			fileSystemWatcher.Renamed += (object _, RenamedEventArgs E) =>
			{
				QueueRename(E.OldFullPath, E.FullPath);
			};
			fileSystemWatcher.Error += (object _, ErrorEventArgs E) =>
			{
				AppLog.Error(E.GetException(), null, "StartWatcher", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Features\\Explorer\\ExplorerModel.cs");
				lock (PendingLock)
				{
					OverflowField = true;
				}
				TimerField.Change(Debounce, Timeout.InfiniteTimeSpan);
			};
			fileSystemWatcher.EnableRaisingEvents = true;
			WatcherField = fileSystemWatcher;
		}
		catch (Exception failure)
		{
			AppLog.Error(failure, null, "StartWatcher", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Features\\Explorer\\ExplorerModel.cs");
			Problem?.Invoke("Changes made outside Codex won't show up automatically. Use Refresh.");
		}
	}

	private void StopWatcher()
	{
		FileSystemWatcher watcherField = WatcherField;
		WatcherField = null;
		if (watcherField != null)
		{
			watcherField.EnableRaisingEvents = false;
			watcherField.Dispose();
		}
	}

	private static string? ParentOf(string Path0)
	{
		return Path.GetDirectoryName(Path0);
	}

	private void Queue(string Path0, bool Created = false, bool Deleted = false, bool Modified = false)
	{
		lock (PendingLock)
		{
			string text = ParentOf(Path0);
			if (text != null)
			{
				DirtyDirs.Add(text);
			}
			if (Deleted)
			{
				DeletedField.Add(Path0);
				ModifiedField.Remove(Path0);
			}
			else if (Modified && !Directory.Exists(Path0))
			{
				ModifiedField.Add(Path0);
				if (Created)
				{
					DeletedField.Remove(Path0);
				}
			}
			else if (Created)
			{
				DeletedField.Remove(Path0);
			}
		}
		TimerField.Change(Debounce, Timeout.InfiniteTimeSpan);
	}

	private void QueueRename(string Old, string New)
	{
		lock (PendingLock)
		{
			string text = ParentOf(Old);
			if (text != null)
			{
				DirtyDirs.Add(text);
			}
			string text2 = ParentOf(New);
			if (text2 != null)
			{
				DirtyDirs.Add(text2);
			}
			RenamedField.Add((Old, New));
		}
		TimerField.Change(Debounce, Timeout.InfiniteTimeSpan);
	}

	private void OnTimer()
	{
		if (!Disposed)
		{
			Dispatcher dispatcher = Application.Current?.Dispatcher;
			if (dispatcher != null)
			{
				dispatcher.BeginInvoke(new Func<Task>(Run));
			}
			else
			{
				Run();
			}
		}
		async Task Run()
		{
			try
			{
				await ProcessPendingAsync();
			}
			catch (OperationCanceledException)
			{
			}
			catch (Exception failure)
			{
				AppLog.Error(failure, null, "OnTimer", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Features\\Explorer\\ExplorerModel.cs");
			}
		}
	}

	private async Task ProcessPendingAsync()
	{
		bool overflowField;
		List<(string Old, string New)> Renamed;
		HashSet<string> Deleted;
		HashSet<string> Modified;
		HashSet<string> hashSet;
		lock (PendingLock)
		{
			HashSet<string> dirtyDirs = DirtyDirs;
			HashSet<string> modifiedField = ModifiedField;
			HashSet<string> deletedField = DeletedField;
			List<(string, string)> renamedField = RenamedField;
			overflowField = OverflowField;
			Renamed = renamedField;
			Deleted = deletedField;
			Modified = modifiedField;
			hashSet = dirtyDirs;
			DirtyDirs = new HashSet<string>(StringComparer.OrdinalIgnoreCase);
			ModifiedField = new HashSet<string>(StringComparer.OrdinalIgnoreCase);
			DeletedField = new HashSet<string>(StringComparer.OrdinalIgnoreCase);
			RenamedField = new List<(string, string)>();
			OverflowField = false;
		}
		if (overflowField)
		{
			if (!Directory.Exists(Provider.Root))
			{
				Provider.EnsureRoot();
			}
			StartWatcher();
			await RefreshAllAsync();
		}
		else
		{
			foreach (var item3 in Renamed)
			{
				string item = item3.Old;
				string item2 = item3.New;
				string text = ParentOf(item);
				if (text != null)
				{
					string text2 = ParentOf(item2);
					if (text2 != null && Normalize(text).Equals(Normalize(text2), StringComparison.OrdinalIgnoreCase) && Nodes.TryGetValue(Normalize(item), out ExplorerNode value) && !Nodes.ContainsKey(Normalize(item2)))
					{
						Relocate(value, item2);
					}
				}
			}
			foreach (string item4 in hashSet)
			{
				if (Nodes.TryGetValue(Normalize(item4), out ExplorerNode value2) && (value2 == RootNode || value2.IsLoaded))
				{
					await LoadAsync(value2);
				}
			}
		}
		List<string> Gone = Deleted.Concat(Renamed.Select(((string Old, string New) R) => R.Old)).ToList();
		List<string> list = Modified.Where((string P) => !Gone.Contains(P, StringComparer.OrdinalIgnoreCase) && File.Exists(P)).ToList();
		if (list.Count > 0 || Gone.Count > 0 || Renamed.Count > 0)
		{
			Changes?.Invoke(new ExplorerChanges(list, Deleted.ToList(), Renamed));
		}
	}

	private void Relocate(ExplorerNode Node, string NewPath)
	{
		string fullPath = Node.FullPath;
		Rekey(Node, fullPath, NewPath);
		Node.Name = Path.GetFileName(Normalize(NewPath));
	}

	private void Rekey(ExplorerNode Node, string OldPrefix, string NewPrefix)
	{
		if (!Node.IsNote)
		{
			Nodes.Remove(Normalize(Node.FullPath));
			string path = (Node.FullPath = NewPrefix + Node.FullPath.Substring(OldPrefix.Length));
			Nodes[Normalize(path)] = Node;
		}
		foreach (ExplorerNode child in Node.Children)
		{
			Rekey(child, OldPrefix, NewPrefix);
		}
	}

	public async Task<FsResult> RenameAsync(ExplorerNode Node, string NewName)
	{
		if (Node.IsNote || Node == RootNode)
		{
			return new FsResult(FsError.Invalid, "That can't be renamed.");
		}
		string Old = Node.FullPath;
		FsResult result = await Provider.RenameAsync(Old, NewName);
		if (result.Ok && Nodes.ContainsKey(Normalize(Old)))
		{
			string text = Path.Combine(Path.GetDirectoryName(Normalize(Old)), NewName);
			if (!Normalize(Old).Equals(Normalize(text), StringComparison.Ordinal))
			{
				Relocate(Node, text);
				Changes?.Invoke(new ExplorerChanges(Array.Empty<string>(), Array.Empty<string>(), new _003C_003Ez__ReadOnlySingleElementList<(string, string)>((Old, text))));
			}
		}
		return result;
	}

	public async Task<FsResult> DeleteAsync(ExplorerNode Node)
	{
		if (Node.IsNote || Node == RootNode)
		{
			return new FsResult(FsError.Invalid, "That can't be deleted.");
		}
		string Old = Node.FullPath;
		FsResult result = await Provider.DeleteAsync(Old);
		if (result.Ok)
		{
			ExplorerNode parent = Node.Parent;
			if (parent != null && parent.Children.Remove(Node))
			{
				Forget(Node);
				if (parent.Children.Count == 0)
				{
					parent.Children.Add(new ExplorerNode("Empty", "", IsDirectory: false, parent, IsNote: true));
				}
			}
			Changes?.Invoke(new ExplorerChanges(Array.Empty<string>(), new _003C_003Ez__ReadOnlySingleElementList<string>(Old), Array.Empty<(string, string)>()));
		}
		return result;
	}

	public async Task<FsResult> MoveAsync(ExplorerNode Node, ExplorerNode TargetFolder)
	{
		if (Node.IsNote || Node == RootNode || !TargetFolder.IsDirectory || TargetFolder.IsNote)
		{
			return new FsResult(FsError.Invalid, "That can't be moved there.");
		}
		string Old = Node.FullPath;
		FsResult Result = await Provider.MoveAsync(Old, TargetFolder.FullPath);
		if (Result.Ok)
		{
			string New = Path.Combine(Normalize(TargetFolder.FullPath), Path.GetFileName(Normalize(Old)));
			ExplorerNode parent = Node.Parent;
			parent?.Children.Remove(Node);
			if (parent != null && parent.Children.Count == 0)
			{
				parent.Children.Add(new ExplorerNode("Empty", "", IsDirectory: false, parent, IsNote: true));
			}
			Forget(Node);
			if (TargetFolder.IsLoaded)
			{
				await LoadAsync(TargetFolder);
			}
			Changes?.Invoke(new ExplorerChanges(Array.Empty<string>(), Array.Empty<string>(), new _003C_003Ez__ReadOnlySingleElementList<(string, string)>((Old, New))));
		}
		return Result;
	}

	public async Task<(FsResult Result, string? Path)> CreateFileAsync(ExplorerNode Folder)
	{
		(FsResult Result, string? Path) Created = await Provider.CreateFileAsync(Folder.FullPath);
		if (Created.Result.Ok)
		{
			Folder.IsExpanded = true;
			await LoadAsync(Folder);
		}
		return Created;
	}
}
