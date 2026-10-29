using System;
using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.Collections.Specialized;
using System.ComponentModel;
using System.Diagnostics;
using System.IO;
using System.Linq;
using System.Security.Cryptography;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Controls.Primitives;
using System.Windows.Input;
using System.Windows.Markup;
using System.Windows.Media;
using System.Windows.Media.Animation;
using System.Windows.Media.Media3D;
using System.Windows.Threading;
using Microsoft.Win32;
using Newtonsoft.Json;
using dotnet_codex_ui.Configuration;
using dotnet_codex_ui.Controls;
using dotnet_codex_ui.Core.Lifecycle;
using dotnet_codex_ui.Core.Versioning;
using dotnet_codex_ui.Features.Auth;
using dotnet_codex_ui.Features.Clients;
using dotnet_codex_ui.Features.Connections;
using dotnet_codex_ui.Features.Editor;
using dotnet_codex_ui.Features.Explorer;
using dotnet_codex_ui.Features.Internet;
using dotnet_codex_ui.Infrastructure.Logging;
using dotnet_codex_ui.Infrastructure.Processes;
using dotnet_codex_ui.Services;

namespace dotnet_codex_ui;

public partial class MainWindow : Window, IComponentConnector
{
	private const string DragFormat = "Codex.ExplorerNode";

	private ExplorerModel? Explorer;

	private Point DragStart;

	private ExplorerNode? DragCandidate;

	private ExplorerNode? DropHover;

	private readonly Dictionary<System.Windows.Controls.TabItem, string> DiskText = new Dictionary<System.Windows.Controls.TabItem, string>();

	private readonly HashSet<System.Windows.Controls.TabItem> ExternalWarned = new HashSet<System.Windows.Controls.TabItem>();

	private readonly HashSet<string> Opening = new HashSet<string>(StringComparer.OrdinalIgnoreCase);

	private static readonly Color InactiveForegroundColor = Color.FromRgb(71, 73, 84);

	private static readonly Color InactiveBackgroundColor = Color.FromArgb(0, 0, 0, 0);

	private static readonly Duration ButtonStateDuration = new Duration(TimeSpan.FromMilliseconds(500L));

	private readonly Geometry MaximizeGeometry;

	private UIElement ActivePage;

	private dotnet_codex_ui.Controls.Button ActiveButton;

	private int NavigationVersion;

	private readonly DispatcherTimer ToolTipHideTimer;

	private bool NavigationButtonHovered;

	private dotnet_codex_ui.Controls.Button? ToolTipButton;

	private const double ToolTipGap = 13.0;

	private const string NormalTitle = "Codex";

	private const string TitleAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

	private bool? TitleIsRandom;

	private string? LastEditorOptions;

	private readonly DispatcherTimer TabSaveTimer = new DispatcherTimer
	{
		Interval = TimeSpan.FromSeconds(2L)
	};

	private string? LastSavedTabs;

	private Editor? EditorField;

	private System.Windows.Controls.TabItem? CurrentTab;

	private readonly Dictionary<System.Windows.Controls.TabItem, string> TabText = new Dictionary<System.Windows.Controls.TabItem, string>();

	private readonly Dictionary<System.Windows.Controls.TabItem, string> TabPathField = new Dictionary<System.Windows.Controls.TabItem, string>();

	private readonly Dictionary<System.Windows.Controls.TabItem, string> TabIdField = new Dictionary<System.Windows.Controls.TabItem, string>();

	private readonly HashSet<System.Windows.Controls.TabItem> Opened = new HashSet<System.Windows.Controls.TabItem>();

	private readonly HashSet<System.Windows.Controls.TabItem> RestoreDirty = new HashSet<System.Windows.Controls.TabItem>();

	private bool Formatting;

	private Dictionary<dotnet_codex_ui.Controls.Button, (UIElement Page, string Title, string Description)>? NavigationItemsField;

	private bool IsClosing;

	private bool ExitAllowed;

	private bool CloseConfirmed;

	private bool SkipCloseConfirm;

	private bool CloseFlowRunning;

	private ExplorerNode? SelectedNode => ExplorerTree.SelectedItem as ExplorerNode;

	private static Color ActiveForegroundColor => AccentTheme.Current.Accent;

	private static Color ActiveBackgroundColor => AccentTheme.Current.Surface;

	private bool EditorReady => EditorField?.Ready.IsCompletedSuccessfully ?? false;

	private Dictionary<dotnet_codex_ui.Controls.Button, (UIElement Page, string Title, string Description)> NavigationItems
	{
		get
		{
			Dictionary<dotnet_codex_ui.Controls.Button, (UIElement, string, string)> dictionary = NavigationItemsField;
			if (dictionary == null)
			{
				Dictionary<dotnet_codex_ui.Controls.Button, (UIElement, string, string)> dictionary2 = new Dictionary<dotnet_codex_ui.Controls.Button, (UIElement, string, string)>
				{
					[EditorButton] = (EditorPage, "Editor", "Write and run Luau scripts."),
					[InternetButton] = (InternetPage, "Internet", "Browse and discover scripts online."),
					[ClientsButton] = (ClientsPage, "Clients", "Manage your connected game clients."),
					[SettingsButton] = (SettingsPage, "Settings", "Manage your application preferences.")
				};
				Dictionary<dotnet_codex_ui.Controls.Button, (UIElement, string, string)> dictionary3 = dictionary2;
				NavigationItemsField = dictionary2;
				dictionary = dictionary3;
			}
			return dictionary;
		}
	}

	private async Task StartExplorerAsync()
	{
		try
		{
			ExplorerModel explorerModel = new ExplorerModel(new FileSystemProvider(FileSystemProvider.DefaultRoot));
			explorerModel.Changes += OnExplorerChanges;
			explorerModel.Problem += (string Message) =>
			{
				ToastService.ShowWarning("Explorer", Message);
			};
			Explorer = explorerModel;
			ExplorerTree.ItemsSource = explorerModel.Items;
			ExplorerTree.AddHandler(Keyboard.LostKeyboardFocusEvent, new KeyboardFocusChangedEventHandler(ExplorerTree_LostKeyboardFocus));
			await explorerModel.InitializeAsync();
		}
		catch (Exception ex)
		{
			AppLog.Error(ex, null, "StartExplorerAsync", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Features\\Explorer\\MainWindow.Explorer.cs");
			ToastService.ShowError("Explorer Unavailable", "The scripts folder couldn't be read.", null, ex);
		}
	}

	private static T? FindAncestor<T>(DependencyObject? From) where T : DependencyObject
	{
		DependencyObject dependencyObject = From;
		while (dependencyObject != null)
		{
			if (dependencyObject is T result)
			{
				return result;
			}
			bool flag = ((dependencyObject is Visual || dependencyObject is Visual3D) ? true : false);
			dependencyObject = (flag ? VisualTreeHelper.GetParent(dependencyObject) : LogicalTreeHelper.GetParent(dependencyObject));
		}
		return null;
	}

	private static ExplorerNode? NodeAt(object? Source)
	{
		return FindAncestor<TreeViewItem>(Source as DependencyObject)?.DataContext as ExplorerNode;
	}

	private TreeViewItem? ContainerFor(ExplorerNode Node)
	{
		if (Explorer == null)
		{
			return null;
		}
		Stack<ExplorerNode> stack = new Stack<ExplorerNode>();
		ExplorerNode explorerNode = Node;
		while (explorerNode != null && explorerNode != Explorer.RootNode)
		{
			stack.Push(explorerNode);
			explorerNode = explorerNode.Parent;
		}
		ItemsControl itemsControl = ExplorerTree;
		while (stack.Count > 0)
		{
			itemsControl.UpdateLayout();
			if (!(itemsControl.ItemContainerGenerator.ContainerFromItem(stack.Pop()) is TreeViewItem treeViewItem))
			{
				return null;
			}
			itemsControl = treeViewItem;
		}
		return itemsControl as TreeViewItem;
	}

	private void ExplorerTree_MouseDoubleClick(object Sender, MouseButtonEventArgs E)
	{
		if (E.ChangedButton == MouseButton.Left)
		{
			ExplorerNode explorerNode = NodeAt(E.OriginalSource);
			if (explorerNode != null && explorerNode == SelectedNode && FindAncestor<ToggleButton>(E.OriginalSource as DependencyObject) == null && !explorerNode.IsDirectory)
			{
				E.Handled = true;
				OpenExplorerNodeAsync(explorerNode);
			}
		}
	}

	private async Task OpenExplorerNodeAsync(ExplorerNode Node)
	{
		if (Explorer == null || Node.IsNote)
		{
			return;
		}
		if (Node.IsDirectory)
		{
			Node.IsExpanded = !Node.IsExpanded;
			return;
		}
		if (!EditorReady)
		{
			ToastService.ShowInfo("Editor Not Ready", "Wait for the editor to finish loading, then try again.");
			return;
		}
		string Path0 = Node.FullPath;
		System.Windows.Controls.TabItem tabItem = FindTabByPath(Path0);
		if (tabItem != null)
		{
			EditorTabs.SelectedItem = tabItem;
		}
		else
		{
			if (!Opening.Add(Path0))
			{
				return;
			}
			try
			{
				var (fsResult, Text) = await Explorer.Provider.ReadTextAsync(Path0);
				if (!fsResult.Ok || Text == null)
				{
					ToastService.ShowWarning("Couldn't Open File", fsResult.Message);
					return;
				}
				System.Windows.Controls.TabItem tabItem2 = FindTabByPath(Path0);
				if (tabItem2 != null)
				{
					EditorTabs.SelectedItem = tabItem2;
					return;
				}
				EditorTabs.NewTab((dotnet_codex_ui.Controls.TabItem Tab) =>
				{
					Tab.Header = Node.Name;
					TabText[Tab] = Text;
					TabPathField[Tab] = Path0;
					DiskText[Tab] = Text;
				});
			}
			finally
			{
				Opening.Remove(Path0);
			}
		}
	}

	private System.Windows.Controls.TabItem? FindTabByPath(string Path0)
	{
		foreach (var (result, a) in TabPathField)
		{
			if (SamePath(a, Path0))
			{
				return result;
			}
		}
		return null;
	}

	private static bool SamePath(string A, string B)
	{
		try
		{
			return string.Equals(Path.GetFullPath(A), Path.GetFullPath(B), StringComparison.OrdinalIgnoreCase);
		}
		catch (Exception)
		{
			return false;
		}
	}

	private void ExplorerTree_PreviewKeyDown(object Sender, KeyEventArgs E)
	{
		if (E.OriginalSource is TextBox { Name: "RenameBox" } textBox && FindAncestor<TreeViewItem>(textBox)?.DataContext is ExplorerNode explorerNode)
		{
			if (E.Key == Key.Enter)
			{
				E.Handled = true;
				CommitRenameAsync(explorerNode);
			}
			else if (E.Key == Key.Escape)
			{
				E.Handled = true;
				explorerNode.IsRenaming = false;
				ExplorerTree.Focus();
			}
			return;
		}
		ExplorerNode selectedNode = SelectedNode;
		switch (E.Key)
		{
		case Key.F5:
			E.Handled = true;
			Explorer?.RefreshAsync((selectedNode != null && selectedNode.IsDirectory) ? selectedNode : null);
			break;
		case Key.F2:
			if (selectedNode != null && !selectedNode.IsNote)
			{
				E.Handled = true;
				BeginRename(selectedNode);
			}
			break;
		case Key.Delete:
			if (selectedNode != null && !selectedNode.IsNote)
			{
				E.Handled = true;
				DeleteNodeAsync(selectedNode);
			}
			break;
		case Key.Enter:
			if (selectedNode != null && !selectedNode.IsNote)
			{
				E.Handled = true;
				OpenExplorerNodeAsync(selectedNode);
			}
			break;
		}
	}

	private void ExplorerRefresh_Click(object Sender, RoutedEventArgs E)
	{
		Explorer?.RefreshAsync();
	}

	private void ExplorerTree_PreviewMouseRightButtonDown(object Sender, MouseButtonEventArgs E)
	{
		if (Explorer != null)
		{
			ExplorerNode explorerNode = NodeAt(E.OriginalSource);
			if (explorerNode != null && explorerNode.IsNote)
			{
				explorerNode = null;
			}
			if (explorerNode != null)
			{
				explorerNode.IsSelected = true;
			}
			E.Handled = true;
			ShowExplorerMenu(explorerNode);
		}
	}

	private void ShowExplorerMenu(ExplorerNode? Node)
	{
		if (Explorer == null)
		{
			return;
		}
		ContextMenu Menu = new ContextMenu
		{
			Style = (Style)FindResource("Menu.Dark"),
			PlacementTarget = ExplorerTree
		};
		bool flag = Node != null && !File.Exists(Node.FullPath) && !Directory.Exists(Node.FullPath);
		ExplorerNode Folder;
		if (Node == null)
		{
			Folder = Explorer.RootNode;
		}
		else
		{
			Folder = (Node.IsDirectory ? Node : (Node.Parent ?? Explorer.RootNode));
		}
		if (Node != null && !flag)
		{
			if (Node.IsDirectory)
			{
				Item(Node.IsExpanded ? "Collapse" : "Expand", () =>
				{
					Node.IsExpanded = !Node.IsExpanded;
				});
			}
			else
			{
				Item("Open", () =>
				{
					OpenExplorerNodeAsync(Node);
				});
			}
		}
		if (!flag)
		{
			Item("New File", () =>
			{
				NewFileAsync(Folder);
			});
		}
		if (Node != null && !flag)
		{
			Item("Rename", () =>
			{
				BeginRename(Node);
			});
			Menu.Items.Add(new Separator());
			Item("Delete", () =>
			{
				DeleteNodeAsync(Node);
			}, Danger: true);
			Menu.Items.Add(new Separator());
			Item("Show in File Explorer", () =>
			{
				Reveal(Node.FullPath);
			});
		}
		Item("Refresh", () =>
		{
			Explorer.RefreshAsync((Folder == Explorer.RootNode) ? null : Folder);
		});
		Menu.IsOpen = true;
		MenuItem Item(string Header, Action Click, bool Danger = false)
		{
			MenuItem menuItem = new MenuItem
			{
				Header = Header,
				Tag = (Danger ? "danger" : null)
			};
			menuItem.Click += (object _, RoutedEventArgs _) =>
			{
				Click();
			};
			Menu.Items.Add(menuItem);
			return menuItem;
		}
	}

	private static void Reveal(string Path0)
	{
		try
		{
			Process.Start(new ProcessStartInfo("explorer.exe", "/select,\"" + Path0 + "\"")
			{
				UseShellExecute = true
			});
		}
		catch (Exception ex)
		{
			AppLog.Error(ex, null, "Reveal", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Features\\Explorer\\MainWindow.Explorer.cs");
			ToastService.ShowError("Couldn't Open File Explorer", ex.Message, null, ex);
		}
	}

	private async Task NewFileAsync(ExplorerNode Folder)
	{
		if (Explorer != null)
		{
			var (fsResult, text) = await Explorer.CreateFileAsync(Folder);
			ExplorerNode Node;
			if (!fsResult.Ok || text == null)
			{
				ToastService.ShowWarning("Couldn't Create File", fsResult.Message);
			}
			else if (Explorer.TryGetNode(text, out Node))
			{
				Node.IsSelected = true;
				BeginRename(Node);
			}
		}
	}

	private void BeginRename(ExplorerNode Node)
	{
		if (Node.IsNote || Explorer == null || Node == Explorer.RootNode)
		{
			return;
		}
		Node.EditName = Node.Name;
		Node.IsRenaming = true;
		Dispatcher.BeginInvoke(DispatcherPriority.Loaded, (Action)(() =>
		{
			if (Node.IsRenaming)
			{
				TreeViewItem treeViewItem = ContainerFor(Node);
				if (treeViewItem != null)
				{
					treeViewItem.ApplyTemplate();
					treeViewItem.BringIntoView();
					if (treeViewItem.Template.FindName("RenameBox", treeViewItem) is TextBox textBox)
					{
						textBox.Focus();
						Keyboard.Focus(textBox);
						int num = (Node.IsDirectory ? (-1) : Node.Name.LastIndexOf('.'));
						textBox.Select(0, (num > 0) ? num : Node.Name.Length);
					}
				}
			}
		}));
	}

	private void ExplorerTree_LostKeyboardFocus(object Sender, KeyboardFocusChangedEventArgs E)
	{
		if (E.OriginalSource is TextBox { Name: "RenameBox" } textBox && FindAncestor<TreeViewItem>(textBox)?.DataContext is ExplorerNode { IsRenaming: not false } explorerNode)
		{
			CommitRenameAsync(explorerNode);
		}
	}

	private async Task CommitRenameAsync(ExplorerNode Node)
	{
		if (!Node.IsRenaming || Explorer == null)
		{
			return;
		}
		string text = Node.EditName.Trim();
		Node.IsRenaming = false;
		if (text.Length != 0 && !(text == Node.Name))
		{
			FsResult fsResult = await Explorer.RenameAsync(Node, text);
			if (!fsResult.Ok)
			{
				ToastService.ShowWarning("Couldn't Rename", fsResult.Message);
			}
		}
	}

	private async Task DeleteNodeAsync(ExplorerNode Node)
	{
		if (Explorer == null || Node.IsNote || Node == Explorer.RootNode)
		{
			return;
		}
		int num = TabPathField.Count((KeyValuePair<System.Windows.Controls.TabItem, string> P) => Explorer.Provider.IsDescendantOrSelf(Node.FullPath, P.Value));
		string text = (Node.IsDirectory ? ("\"" + Node.Name + "\" and everything in it will be moved to the Recycle Bin.") : ("\"" + Node.Name + "\" will be moved to the Recycle Bin."));
		if (num > 0)
		{
			text += ((num == 1) ? " It is open in a tab, which stays open." : $" {num} of its files are open in tabs, which stay open.");
		}
		if (await Confirm.ShowAsync(Node.IsDirectory ? "Delete Folder?" : "Delete File?", text, "Icon.Trash", "Delete", Danger: true))
		{
			FsResult fsResult = await Explorer.DeleteAsync(Node);
			if (!fsResult.Ok)
			{
				ToastService.ShowWarning("Couldn't Delete", fsResult.Message);
			}
		}
	}

	private void ExplorerTree_PreviewMouseLeftButtonDown(object Sender, MouseButtonEventArgs E)
	{
		DragStart = E.GetPosition(null);
		bool flag = FindAncestor<ToggleButton>(E.OriginalSource as DependencyObject) != null || E.OriginalSource is TextBox;
		DragCandidate = (flag ? null : NodeAt(E.OriginalSource));
		ExplorerNode dragCandidate = DragCandidate;
		if ((dragCandidate != null && dragCandidate.IsNote) || DragCandidate == Explorer?.RootNode)
		{
			DragCandidate = null;
		}
	}

	private void ExplorerTree_PreviewMouseMove(object Sender, MouseEventArgs E)
	{
		if (E.LeftButton != MouseButtonState.Pressed)
		{
			return;
		}
		ExplorerNode dragCandidate = DragCandidate;
		if (dragCandidate == null || dragCandidate.IsRenaming)
		{
			return;
		}
		Vector vector = E.GetPosition(null) - DragStart;
		if (Math.Abs(vector.X) < SystemParameters.MinimumHorizontalDragDistance && Math.Abs(vector.Y) < SystemParameters.MinimumVerticalDragDistance)
		{
			return;
		}
		DragCandidate = null;
		try
		{
			DragDrop.DoDragDrop(ExplorerTree, new DataObject("Codex.ExplorerNode", dragCandidate), DragDropEffects.Move);
		}
		finally
		{
			SetDropHover(null);
		}
	}

	private ExplorerNode? DropFolderFor(DragEventArgs E)
	{
		ExplorerNode explorerNode = NodeAt(E.OriginalSource);
		if (explorerNode != null)
		{
			if (!explorerNode.IsNote)
			{
				if (!explorerNode.IsDirectory)
				{
					return explorerNode.Parent;
				}
				return explorerNode;
			}
			return explorerNode.Parent;
		}
		return Explorer?.RootNode;
	}

	private string? WhyNotDrop(ExplorerNode Dragged, ExplorerNode Target)
	{
		if (Explorer == null)
		{
			return "The Explorer isn't ready.";
		}
		FileSystemProvider provider = Explorer.Provider;
		if (!provider.IsInside(Target.FullPath))
		{
			return "Items can only be moved inside the scripts folder.";
		}
		if (Dragged.Parent == Target)
		{
			return "It is already in that folder.";
		}
		if (Dragged.IsDirectory && provider.IsDescendantOrSelf(Dragged.FullPath, Target.FullPath))
		{
			return "A folder can't be moved into itself.";
		}
		string path = Path.Combine(Target.FullPath, Dragged.Name);
		if (File.Exists(path) || Directory.Exists(path))
		{
			return "Something with that name is already there.";
		}
		return null;
	}

	private void ExplorerTree_DragOver(object Sender, DragEventArgs E)
	{
		E.Handled = true;
		if (E.Data.GetData("Codex.ExplorerNode") is ExplorerNode dragged)
		{
			ExplorerNode explorerNode = DropFolderFor(E);
			if (explorerNode != null && WhyNotDrop(dragged, explorerNode) == null)
			{
				E.Effects = DragDropEffects.Move;
				SetDropHover((explorerNode == Explorer?.RootNode) ? null : explorerNode);
				return;
			}
		}
		E.Effects = DragDropEffects.None;
		SetDropHover(null);
	}

	private void ExplorerTree_DragLeave(object Sender, DragEventArgs E)
	{
		SetDropHover(null);
	}

	private void SetDropHover(ExplorerNode? Node)
	{
		if (DropHover != Node)
		{
			if (DropHover != null)
			{
				DropHover.IsDropTarget = false;
			}
			DropHover = Node;
			if (Node != null)
			{
				Node.IsDropTarget = true;
			}
		}
	}

	private async void ExplorerTree_Drop(object Sender, DragEventArgs E)
	{
		E.Handled = true;
		SetDropHover(null);
		if (Explorer == null || !(E.Data.GetData("Codex.ExplorerNode") is ExplorerNode explorerNode))
		{
			return;
		}
		ExplorerNode Target = DropFolderFor(E);
		if (Target == null)
		{
			return;
		}
		string text = WhyNotDrop(explorerNode, Target);
		if (text != null)
		{
			ToastService.ShowInfo("Can't Move Here", text);
			return;
		}
		FsResult fsResult = await Explorer.MoveAsync(explorerNode, Target);
		if (!fsResult.Ok)
		{
			ToastService.ShowWarning("Couldn't Move", fsResult.Message);
		}
		else if (!Target.IsExpanded)
		{
			Target.IsExpanded = true;
		}
	}

	private async void OnExplorerChanges(ExplorerChanges Changes)
	{
		try
		{
			foreach (var (old, text) in Changes.Renamed)
			{
				TabsFollowRename(old, text);
			}
			foreach (string item in Changes.Deleted)
			{
				TabsLoseFile(item);
			}
			foreach (string item2 in Changes.Modified)
			{
				await TabReloadIfChangedAsync(item2);
			}
		}
		catch (Exception failure)
		{
			AppLog.Error(failure, null, "OnExplorerChanges", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Features\\Explorer\\MainWindow.Explorer.cs");
		}
	}

	private void TabsFollowRename(string Old, string New)
	{
		foreach (System.Windows.Controls.TabItem item in TabPathField.Keys.ToList())
		{
			string text = TabPathField[item];
			if (Explorer != null && Explorer.Provider.IsDescendantOrSelf(Old, text))
			{
				string text2 = Path.GetFullPath(New) + Path.GetFullPath(text).Substring(Path.GetFullPath(Old).Length);
				TabPathField[item] = text2;
				if (item.Header as string == Path.GetFileName(text))
				{
					item.Header = Path.GetFileName(text2);
				}
			}
		}
	}

	private void TabsLoseFile(string Gone)
	{
		foreach (System.Windows.Controls.TabItem item in TabPathField.Keys.ToList())
		{
			if (Explorer != null && Explorer.Provider.IsDescendantOrSelf(Gone, TabPathField[item]))
			{
				string fileName = Path.GetFileName(TabPathField[item]);
				TabPathField.Remove(item);
				DiskText.Remove(item);
				ToastService.ShowWarning("File Deleted", "\"" + fileName + "\" was deleted. Its tab is still open; saving will ask where to put it.");
			}
		}
	}

	private async Task TabReloadIfChangedAsync(string Path0)
	{
		if (Explorer == null || EditorField == null)
		{
			return;
		}
		System.Windows.Controls.TabItem Tab = FindTabByPath(Path0);
		if (Tab == null)
		{
			return;
		}
		var (fsResult, text) = await Explorer.Provider.ReadTextAsync(Path0);
		if (!fsResult.Ok || text == null || !EditorTabs.Items.Contains(Tab) || (DiskText.TryGetValue(Tab, out string value) && value == text))
		{
			return;
		}
		string text2 = (Tab.Header as string) ?? Path.GetFileName(Path0);
		if (IsDirtyTab(Tab))
		{
			if (ExternalWarned.Add(Tab))
			{
				ToastService.ShowWarning("File Changed on Disk", "\"" + text2 + "\" was changed outside Codex, but this tab has unsaved changes, so it was left as it is. Saving will overwrite the version on disk.");
			}
			return;
		}
		DiskText[Tab] = text;
		ExternalWarned.Remove(Tab);
		if (TextOf(Tab) != text)
		{
			SetTextOf(Tab, text);
			if (Opened.Contains(Tab))
			{
				EditorField.MarkSaved(IdOf(Tab));
			}
			ToastService.ShowInfo("File Reloaded", "\"" + text2 + "\" was changed outside Codex, so the tab was updated.");
		}
	}

	public MainWindow()
	{
		InitializeComponent();
		MaximizeGeometry = MaximizeIcon.Data;
		ActivePage = EditorPage;
		ActiveButton = EditorButton;
		ToolTipHideTimer = new DispatcherTimer
		{
			Interval = TimeSpan.FromMilliseconds(120L)
		};
		ToolTipHideTimer.Tick += ToolTipHideTimer_Tick;
		Root.SizeChanged += (object _, SizeChangedEventArgs _) =>
		{
			RepositionToolTip();
		};
		ApplyButtonState(EditorButton, Active: true, AnimateValue: false);
		ApplyButtonState(InternetButton, Active: false, AnimateValue: false);
		ApplyButtonState(ClientsButton, Active: false, AnimateValue: false);
		ApplyButtonState(SettingsButton, Active: false, AnimateValue: false);
		ResetPage(EditorPage, Visible: true);
		ResetPage(InternetPage, Visible: false);
		ResetPage(ClientsPage, Visible: false);
		ResetPage(SettingsPage, Visible: false);
		ClientService.Clients.CollectionChanged += Clients_CollectionChanged;
		ClientService.ConnectedCountChanged += ConnectedCountChanged;
		EditorTabs.TabClosed += EditorTabs_TabClosed;
		EditorTabs.CloseGuard = ConfirmCloseTabAsync;
		AuthService.Changed += OnAuthChanged;
		AccentTheme.Changed += OnAccentChanged;
		RegistryConfiguration.Changed += OnUiSettingsChanged;
		OnUiSettingsChanged();
		RestoreTabs();
		TabSaveTimer.Tick += (object? _, EventArgs _) =>
		{
			if (RegistryConfiguration.AutoSaveTabs)
			{
				SaveTabs();
			}
		};
		TabSaveTimer.Start();
		AuthService.ModeChanged += OnAuthModeChanged;
		VersionService.Changed += UpdateLoaderBadge;
		AccountActions.Dialog = Confirm;
		AccountActions.ShowLogin = Login.Show;
		ScriptActions.Execute = RunScript;
		ScriptActions.OpenInTab = OpenScriptTab;
		Login.OpenChanged += ApplyAuthBlocking;
		Closed += (object? _, EventArgs _) =>
		{
			AppLog.Information("Main window closed");
			AuthService.Changed -= OnAuthChanged;
			AccentTheme.Changed -= OnAccentChanged;
			RegistryConfiguration.Changed -= OnUiSettingsChanged;
			TabSaveTimer.Stop();
			EditorField?.CancelReady();
			Explorer?.Dispose();
			ClientService.StopWatching();
			try
			{
				ConnectionManager.StopAsync().Wait(TimeSpan.FromSeconds(3L));
			}
			catch (Exception failure)
			{
				AppLog.Error(failure, null, ".ctor", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\MainWindow.xaml.cs");
			}
			AuthService.ModeChanged -= OnAuthModeChanged;
			VersionService.Changed -= UpdateLoaderBadge;
			AuthService.Shutdown();
			ClientService.Clients.CollectionChanged -= Clients_CollectionChanged;
			ClientService.ConnectedCountChanged -= ConnectedCountChanged;
			EditorTabs.TabClosed -= EditorTabs_TabClosed;
			Toasts.Shutdown();
		};
		UpdateClientState(AnimateValue: false);
	}

	private void ConnectedCountChanged()
	{
		UpdateClientState(AnimateValue: true);
	}

	private void OnAccentChanged()
	{
		ApplyButtonState(EditorButton, EditorButton == ActiveButton, AnimateValue: false);
		ApplyButtonState(InternetButton, InternetButton == ActiveButton, AnimateValue: false);
		ApplyButtonState(ClientsButton, ClientsButton == ActiveButton, AnimateValue: false);
		ApplyButtonState(SettingsButton, SettingsButton == ActiveButton, AnimateValue: false);
		UpdateClientState(AnimateValue: false);
	}

	private void OnUiSettingsChanged()
	{
		ApplyWindowTitle();
		Topmost = RegistryConfiguration.AlwaysOnTop;
		if (!RegistryConfiguration.ShowNavigationTooltips)
		{
			HideNavigationToolTip();
		}
		ApplyEditorOptions();
	}

	private void ApplyEditorOptions()
	{
		if (EditorField != null && EditorReady)
		{
			string minimap = RegistryConfiguration.Minimap;
			EditorOptions editorOptions = new EditorOptions
			{
				FontSize = RegistryConfiguration.EditorFontSize,
				InlayHints = new InlayHintsOptions(RegistryConfiguration.InlayHints),
				Minimap = new MinimapOptions(minimap != "Off")
				{
					Side = ((minimap == "Off") ? null : minimap.ToLowerInvariant())
				}
			};
			string text = editorOptions.ToString();
			if (!(text == LastEditorOptions))
			{
				LastEditorOptions = text;
				EditorField.UpdateOptions(editorOptions);
			}
		}
	}

	private TabState? CaptureTabs()
	{
		List<dotnet_codex_ui.Controls.TabItem> list = EditorTabs.Items.OfType<dotnet_codex_ui.Controls.TabItem>().ToList();
		if (list.Count == 0)
		{
			return null;
		}
		if (EditorField != null && EditorReady && Opened.Count > 0)
		{
			Dictionary<string, string> dictionary = EditorField.Snapshot();
			if (dictionary != null)
			{
				foreach (dotnet_codex_ui.Controls.TabItem item2 in list)
				{
					if (Opened.Contains(item2) && dictionary.TryGetValue(IdOf(item2), out var value))
					{
						TabText[item2] = value;
					}
				}
			}
		}
		return new TabState(list.Select((dotnet_codex_ui.Controls.TabItem Tab) => new TabSnapshot((Tab.Header as string) ?? "Untitled Tab", TabText.TryGetValue(Tab, out string value2) ? value2 : "", TabPathField.TryGetValue(Tab, out string value3) ? value3 : null, Tab.IsDirty)).ToList(), Math.Max(0, (EditorTabs.SelectedItem is dotnet_codex_ui.Controls.TabItem item) ? list.IndexOf(item) : 0));
	}

	internal void SaveTabs(bool Force = false)
	{
		try
		{
			TabState tabState = CaptureTabs();
			if ((object)tabState != null)
			{
				string text = JsonConvert.SerializeObject(tabState);
				if ((Force || !(text == LastSavedTabs)) && TabStore.Save(tabState))
				{
					LastSavedTabs = text;
				}
			}
		}
		catch (Exception failure)
		{
			AppLog.Error(failure, null, "SaveTabs", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\MainWindow.xaml.cs");
		}
	}

	private void RestoreTabs()
	{
		if (!RegistryConfiguration.ContinueWhereYouLeftOff)
		{
			return;
		}
		TabState tabState = TabStore.Load();
		if ((object)tabState == null)
		{
			return;
		}
		dotnet_codex_ui.Controls.TabItem tabItem = EditorTabs.Items.OfType<dotnet_codex_ui.Controls.TabItem>().FirstOrDefault();
		dotnet_codex_ui.Controls.TabItem tabItem2 = null;
		for (int i = 0; i < tabState.Tabs.Count; i++)
		{
			TabSnapshot tabSnapshot = tabState.Tabs[i];
			dotnet_codex_ui.Controls.TabItem tabItem3 = EditorTabs.NewTab();
			tabItem3.Header = tabSnapshot.Title;
			TabText[tabItem3] = tabSnapshot.Text;
			if (tabSnapshot.Path != null)
			{
				TabPathField[tabItem3] = tabSnapshot.Path;
			}
			if (tabSnapshot.Dirty)
			{
				RestoreDirty.Add(tabItem3);
			}
			if (i == tabState.Selected)
			{
				tabItem2 = tabItem3;
			}
		}
		if (tabItem != null)
		{
			EditorTabs.CloseTab(tabItem);
		}
		EditorTabs.SelectedItem = tabItem2 ?? EditorTabs.Items.OfType<dotnet_codex_ui.Controls.TabItem>().LastOrDefault();
	}

	private void ApplyWindowTitle()
	{
		bool randomWindowTitle = RegistryConfiguration.RandomWindowTitle;
		if (TitleIsRandom == randomWindowTitle)
		{
			return;
		}
		TitleIsRandom = randomWindowTitle;
		Title = (randomWindowTitle ? string.Create(12, 0, (Span<char> Span, int _) =>
		{
			for (int i = 0; i < Span.Length; i++)
			{
				Span[i] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"[RandomNumberGenerator.GetInt32("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".Length)];
			}
		}) : "Codex");
	}

	private async Task RestoreAuthAsync()
	{
		try
		{
			await AuthService.RestoreSessionAsync();
			if (!AuthService.IsSignedIn && AuthService.Mode != AuthMode.Disabled)
			{
				Login.Show();
			}
		}
		catch (Exception failure)
		{
			AppLog.Error(failure, null, "RestoreAuthAsync", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\MainWindow.xaml.cs");
		}
	}

	private void ApplyAuthBlocking()
	{
		bool isOpen = Login.IsOpen;
		PageHost.IsEnabled = !isOpen;
		NavRail.IsEnabled = !isOpen;
		LogoutButton.IsEnabled = !isOpen;
		UIElement[] array = new UIElement[5] { MinimizeButton, MaximizeButton, ExitButton, ClientBadge, SubscriptionBadge };
		for (int i = 0; i < array.Length; i++)
		{
			array[i].IsEnabled = !isOpen;
		}
	}

	private void OnAuthModeChanged()
	{
		if (!AuthService.IsSignedIn && AuthService.Mode != AuthMode.Disabled)
		{
			Login.Show();
		}
		UpdateModeBadge();
	}

	private void UpdateModeBadge()
	{
		bool flag = AuthService.Mode != AuthMode.Real;
		ModeBadgeText.Text = ((AuthService.Mode == AuthMode.Mock) ? "MOCK AUTH" : "AUTH OFF");
		ModeBadge.ToolTip = ((AuthService.Mode == AuthMode.Mock) ? RichTip("Mock authentication", "Development only: sign-in and subscription data are simulated.") : RichTip("Authentication disabled", "Sign-in is switched off: no login is required and no account is signed in."));
		ModeBadge.Visibility = ((!flag) ? Visibility.Collapsed : Visibility.Visible);
	}

	private void UpdateLoaderBadge()
	{
		LoaderResult loader = VersionService.Loader;
		LoaderStatus status = loader.Status;
		bool flag = (uint)(status - 2) <= 1u;
		bool flag2 = flag;
		LoaderBadgeText.Text = ((loader.Status == LoaderStatus.Missing) ? "LOADER MISSING" : "CODEX OUTDATED");
		LoaderBadge.ToolTip = ((loader.Status == LoaderStatus.Missing) ? RichTip("Loader missing", "The loader for Roblox " + loader.RobloxVersion + " is not installed. Restart Codex through the bootstrapper to download it.") : RichTip("Codex is outdated", "No loader is published for the current Roblox version (" + loader.RobloxVersion + ") yet. Injection is unavailable until Codex is updated."));
		LoaderBadge.Visibility = ((!flag2) ? Visibility.Collapsed : Visibility.Visible);
	}

	private FrameworkElement RichTip(string Title, string Body, string? Hint = null)
	{
		StackPanel stackPanel = new StackPanel
		{
			MaxWidth = 250.0
		};
		stackPanel.Children.Add(new SpacedTextBlock
		{
			Text = Title,
			CharacterSpacing = 3.0,
			FontFamily = (FontFamily)FindResource("Inter"),
			FontSize = 9.0,
			FontWeight = FontWeights.Bold,
			Foreground = (Brush)FindResource("Page.Foreground")
		});
		stackPanel.Children.Add(new TextBlock
		{
			Text = Body,
			Margin = new Thickness(0.0, 4.0, 0.0, 0.0),
			FontWeight = FontWeights.Medium,
			Foreground = (Brush)FindResource("Page.Muted"),
			TextWrapping = TextWrapping.Wrap
		});
		if (Hint != null)
		{
			stackPanel.Children.Add(new TextBlock
			{
				Text = Hint,
				Margin = new Thickness(0.0, 6.0, 0.0, 0.0),
				FontSize = 8.5,
				Foreground = (Brush)FindResource("Page.Accent")
			});
		}
		return stackPanel;
	}

	private void OnAuthChanged()
	{
		UpdateModeBadge();
		LogoutButton.Visibility = ((!AuthService.IsSignedIn) ? Visibility.Collapsed : Visibility.Visible);
		UpdateSubscriptionBadge();
		ApplyAuthBlocking();
	}

	private void UpdateSubscriptionBadge()
	{
		SubscriptionStatus subscription = AuthService.Subscription;
		bool flag = !AuthService.IsSignedIn;
		if (!flag)
		{
			bool flag2 = (uint)subscription <= 1u;
			flag = flag2;
		}
		if (flag)
		{
			SubscriptionBadge.Visibility = Visibility.Collapsed;
			return;
		}
		flag = (uint)(subscription - 2) <= 1u;
		bool flag3 = flag;
		var (text, text2) = subscription switch
		{
			SubscriptionStatus.None => ("Subscription Required", "An active subscription is needed to use restricted features."), 
			SubscriptionStatus.Expired => ("Subscription expired", "Your subscription has expired. Renew it to use restricted features."), 
			SubscriptionStatus.Pending => ("Verification pending", "Your subscription is being verified."), 
			_ => ("Can't verify subscription", "We couldn't confirm your subscription status. Try again in a moment."), 
		};
		SubscriptionText.Text = ((subscription == SubscriptionStatus.Expired) ? "Subscription Required" : text);
		if (AuthService.Mode != AuthMode.Real)
		{
			text2 += " (simulated)";
		}
		SubscriptionBadge.ToolTip = RichTip(text, text2, "Click to manage your subscription");
		SubscriptionBadge.Foreground = new SolidColorBrush(flag3 ? Color.FromRgb(229, 177, 75) : Color.FromRgb(159, 166, 175));
		SubscriptionBadge.Background = new SolidColorBrush(flag3 ? Color.FromRgb(42, 34, 24) : Color.FromRgb(30, 32, 40));
		SubscriptionBadge.Visibility = Visibility.Visible;
	}

	private async void SubscriptionBadge_Click(object Sender, RoutedEventArgs E)
	{
		await AccountActions.SubscriptionAsync();
	}

	private async void LogoutButton_Click(object Sender, RoutedEventArgs E)
	{
		if (AuthService.Mode == AuthMode.Disabled)
		{
			ToastService.ShowInfo("Authentication Is Disabled", "Development mode: there is no session to end.");
			return;
		}
		bool flag = AuthService.IsLoggingOut;
		if (!flag)
		{
			flag = !(await Confirm.ShowAsync("Log Out?", "You'll need to sign in again with your email to keep using Codex.", "Icon.Logout", "Log Out", Danger: true));
		}
		if (!flag)
		{
			bool flag2 = await AuthService.LogoutAsync();
			Login.Show();
			if (!flag2)
			{
				ToastService.ShowWarning("Signed Out on This Device", "We couldn't reach the server to end the session there.");
			}
		}
	}

	internal bool ShowFatal(FatalErrorInfo Info)
	{
		try
		{
			WindowBackground.IsEnabled = false;
			FatalOverlay.Show(Info);
			return true;
		}
		catch
		{
			WindowBackground.IsEnabled = true;
			return false;
		}
	}

	private void Clients_CollectionChanged(object? Sender, NotifyCollectionChangedEventArgs E)
	{
		UpdateClientState(AnimateValue: true);
	}

	private void UpdateClientState(bool AnimateValue)
	{
		int connectedCount = ClientService.ConnectedCount;
		int unconnectedCount = ClientService.UnconnectedCount;
		ClientCountText.Text = ((unconnectedCount == 0) ? $"{connectedCount} Connected Client{((connectedCount == 1) ? "" : "s")}" : $"{connectedCount} Connected, {unconnectedCount} Not Connected");
		bool flag = connectedCount > 0;
		Color color = (flag ? ActiveForegroundColor : Color.FromRgb(159, 166, 175));
		Color color2 = (flag ? ActiveBackgroundColor : Color.FromRgb(30, 32, 40));
		if (AnimateValue)
		{
			AnimateBrush(ClientBadge, Control.ForegroundProperty, color);
			AnimateBrush(ClientBadge, Control.BackgroundProperty, color2);
		}
		else
		{
			ClientBadge.Foreground = new SolidColorBrush(color);
			ClientBadge.Background = new SolidColorBrush(color2);
		}
		UpdateActionState();
	}

	private async void Window_Loaded(object Sender, RoutedEventArgs E)
	{
		AppLog.Information("Main window loaded");
		UpdateModeBadge();
		UpdateLoaderBadge();
		if (AuthService.Mode != AuthMode.Disabled)
		{
			Login.Show();
		}
		RestoreAuthAsync();
		VersionService.RefreshAsync();
		StartExplorerAsync();
		ConnectionManager.StartAsync();
		ClientService.StartWatching();
		StartupService.RemoveLegacyTaskAsync();
		ApplyButtonState(ActiveButton, Active: true, AnimateValue: false);
		EditorPage.Visibility = Visibility.Visible;
		InternetPage.Visibility = Visibility.Collapsed;
		ClientsPage.Visibility = Visibility.Collapsed;
		SettingsPage.Visibility = Visibility.Collapsed;
		await LanguageServer.StartAsync();
		EditorField = new Editor();
		EditorField.DirtyChanged += Editor_DirtyChanged;
		EditorTabs.Content = EditorField;
		await AwaitEditorAsync();
	}

	private async Task AwaitEditorAsync()
	{
		try
		{
			await EditorField.Ready;
		}
		catch (Exception ex)
		{
			if (!(ex is EditorReadyException { Reason: ReadyFailure.Cancelled }))
			{
				AppLog.Error(ex, null, "AwaitEditorAsync", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\MainWindow.xaml.cs");
			}
			ReportEditorFailure(ex);
		}
		InitializeEditor();
	}

	private void ReportEditorFailure(Exception Ex)
	{
		ReadyFailure? readyFailure = (Ex as EditorReadyException)?.Reason;
		if (readyFailure != ReadyFailure.Cancelled)
		{
			string message = ((readyFailure == ReadyFailure.Timeout) ? "The code editor took too long to start. Your tabs are safe, but editing is unavailable until it loads." : "The code editor couldn't start. Your tabs are safe, but editing is unavailable until it loads.");
			ToastService.ShowErrorWithAction("Editor Unavailable", message, "Retry", RetryEditor, readyFailure?.ToString());
		}
	}

	private async void RetryEditor()
	{
		if (EditorField != null)
		{
			EditorField.Retry();
			Opened.Clear();
			await AwaitEditorAsync();
		}
	}

	private void InitializeEditor()
	{
		if (EditorReady)
		{
			List<System.Windows.Controls.TabItem> list = EditorTabs.Items.OfType<System.Windows.Controls.TabItem>().ToList();
			List<(string Id, string Text)> Pending = new List<(string, string)>();
			EditorField.OpenDocuments(list.Select((System.Windows.Controls.TabItem Tab) =>
			{
				string text2 = (TabText.TryGetValue(Tab, out string value) ? value : "");
				if (RestoreDirty.Contains(Tab))
				{
					string text3 = SavedBaselineOf(Tab);
					if (text3 != text2)
					{
						Pending.Add((IdOf(Tab), text2));
						return (IdOf(Tab), text3);
					}
				}
				return (IdOf(Tab), text2);
			}));
			foreach (var (id, text) in Pending)
			{
				EditorField.SetText(id, text);
			}
			RestoreDirty.Clear();
			foreach (System.Windows.Controls.TabItem item in list)
			{
				Opened.Add(item);
			}
			if (CurrentTab != null)
			{
				EditorField.ShowDocument(IdOf(CurrentTab));
			}
		}
		ApplyEditorOptions();
		UpdateActionState();
	}

	private string IdOf(System.Windows.Controls.TabItem Tab)
	{
		if (!TabIdField.TryGetValue(Tab, out string value))
		{
			value = (TabIdField[Tab] = Guid.NewGuid().ToString("N"));
		}
		return value;
	}

	private string TextOf(System.Windows.Controls.TabItem Tab)
	{
		if (EditorField != null && EditorReady && Opened.Contains(Tab))
		{
			string text = EditorField.GetText(IdOf(Tab));
			if (text != null)
			{
				TabText[Tab] = text;
				return text;
			}
		}
		if (!TabText.TryGetValue(Tab, out string value))
		{
			return "";
		}
		return value;
	}

	private void SetTextOf(System.Windows.Controls.TabItem Tab, string Text)
	{
		TabText[Tab] = Text;
		if (EditorField != null && EditorReady && Opened.Contains(Tab))
		{
			EditorField.SetText(IdOf(Tab), Text);
		}
	}

	private void UpdateActionState()
	{
		dotnet_codex_ui.Controls.Button clearButton = ClearButton;
		dotnet_codex_ui.Controls.Button openButton = OpenButton;
		bool flag = (SaveButton.IsEnabled = EditorReady && EditorTabs.HasTabs);
		bool isEnabled = (openButton.IsEnabled = flag);
		clearButton.IsEnabled = isEnabled;
		FormatButton.IsEnabled = EditorReady && EditorTabs.HasTabs && !Formatting;
		ExecuteButton.IsEnabled = EditorReady && EditorTabs.HasTabs;
	}

	private void EditorTabs_SelectionChanged(object Sender, SelectionChangedEventArgs E)
	{
		if (E.OriginalSource != EditorTabs || EditorTabs.IsReordering)
		{
			return;
		}
		System.Windows.Controls.TabItem tabItem = EditorTabs.SelectedItem as System.Windows.Controls.TabItem;
		if (tabItem != null && EditorField != null && EditorReady)
		{
			if (Opened.Add(tabItem))
			{
				EditorField.OpenDocument(IdOf(tabItem), TabText.TryGetValue(tabItem, out string value) ? value : "");
			}
			EditorField.ShowDocument(IdOf(tabItem));
			EditorField.Focus();
		}
		CurrentTab = tabItem;
		UpdateActionState();
	}

	private void EditorTabs_TabClosed(System.Windows.Controls.TabItem Tab)
	{
		if (Opened.Remove(Tab) && EditorField != null && EditorReady)
		{
			EditorField.CloseDocument(IdOf(Tab));
			EditorField.ForgetDirty(IdOf(Tab));
		}
		TabIdField.Remove(Tab);
		TabText.Remove(Tab);
		TabPathField.Remove(Tab);
		DiskText.Remove(Tab);
		ExternalWarned.Remove(Tab);
		if (CurrentTab == Tab)
		{
			CurrentTab = null;
		}
		UpdateActionState();
	}

	private void Editor_DirtyChanged(string Id, bool Dirty)
	{
		foreach (var (tabItem2, text2) in TabIdField)
		{
			if (text2 == Id)
			{
				if (tabItem2 is dotnet_codex_ui.Controls.TabItem tabItem3)
				{
					tabItem3.IsDirty = Dirty;
				}
				break;
			}
		}
	}

	private bool IsDirtyTab(System.Windows.Controls.TabItem Tab)
	{
		if (EditorField != null && Opened.Contains(Tab))
		{
			return EditorField.IsDirty(IdOf(Tab));
		}
		return false;
	}

	private string SavedBaselineOf(System.Windows.Controls.TabItem Tab)
	{
		try
		{
			if (TabPathField.TryGetValue(Tab, out string value) && File.Exists(value))
			{
				return File.ReadAllText(value);
			}
		}
		catch (Exception failure)
		{
			AppLog.Error(failure, null, "SavedBaselineOf", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\MainWindow.xaml.cs");
		}
		return "";
	}

	private bool SaveTab(System.Windows.Controls.TabItem Tab)
	{
		if (EditorField == null)
		{
			return false;
		}
		TabPathField.TryGetValue(Tab, out string value);
		if (value == null)
		{
			SaveFileDialog saveFileDialog = new SaveFileDialog
			{
				Filter = "Luau script (*.luau)|*.luau|Lua script (*.lua)|*.lua|Text (*.txt)|*.txt",
				DefaultExt = ".luau"
			};
			if (saveFileDialog.ShowDialog(this) != true)
			{
				return false;
			}
			value = saveFileDialog.FileName;
		}
		try
		{
			string text = TextOf(Tab);
			File.WriteAllText(value, text);
			TabPathField[Tab] = value;
			DiskText[Tab] = text;
			ExternalWarned.Remove(Tab);
			if (Opened.Contains(Tab))
			{
				EditorField.MarkSaved(IdOf(Tab));
			}
			return true;
		}
		catch (Exception ex)
		{
			AppLog.Error(ex, null, "SaveTab", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\MainWindow.xaml.cs");
			ToastService.ShowError("Save File Failed", ex.Message, null, ex);
			return false;
		}
	}

	private async Task<bool> ResolveDirtyAsync(System.Windows.Controls.TabItem Tab, string Action)
	{
		if (!IsDirtyTab(Tab))
		{
			return true;
		}
		string value = (Tab.Header as string) ?? "this tab";
		return await Confirm.ShowChoiceAsync("Unsaved Changes", $"\"{value}\" has changes that aren't saved. They will be lost if you don't save them before you {Action}.", "Icon.Alert", "Save", "Don't Save") switch
		{
			DialogChoice.Confirm => SaveTab(Tab), 
			DialogChoice.Discard => true, 
			_ => false, 
		};
	}

	private Task<bool> ConfirmCloseTabAsync(System.Windows.Controls.TabItem Tab)
	{
		return ResolveDirtyAsync(Tab, "close it");
	}

	private async void Clear_Click(object Sender, RoutedEventArgs E)
	{
		System.Windows.Controls.TabItem Tab = CurrentTab;
		if (Tab != null)
		{
			bool flag = IsDirtyTab(Tab);
			if (flag)
			{
				flag = !(await Confirm.ShowAsync("Clear This Tab?", "Unsaved changes in this tab will be lost.", "Icon.Alert", "Clear", Danger: true));
			}
			if (!flag && EditorTabs.Items.Contains(Tab))
			{
				SetTextOf(Tab, "");
			}
		}
	}

	private async void OpenFile_Click(object Sender, RoutedEventArgs E)
	{
		System.Windows.Controls.TabItem Tab = CurrentTab;
		if (EditorField == null || Tab == null)
		{
			return;
		}
		OpenFileDialog Dialog = new OpenFileDialog
		{
			Filter = "Scripts (*.lua;*.luau;*.txt)|*.lua;*.luau;*.txt|All files (*.*)|*.*"
		};
		if (Dialog.ShowDialog(this) != true || !(await ResolveDirtyAsync(Tab, "open another file in it")) || !EditorTabs.Items.Contains(Tab))
		{
			return;
		}
		try
		{
			string text = File.ReadAllText(Dialog.FileName);
			SetTextOf(Tab, text);
			TabPathField[Tab] = Dialog.FileName;
			DiskText[Tab] = text.Replace("\r\n", "\n");
			ExternalWarned.Remove(Tab);
			if (Opened.Contains(Tab))
			{
				EditorField.MarkSaved(IdOf(Tab));
			}
		}
		catch (Exception ex)
		{
			AppLog.Error(ex, null, "OpenFile_Click", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\MainWindow.xaml.cs");
			ToastService.ShowError("Open File Failed", ex.Message, null, ex);
		}
	}

	private async void Format_Click(object Sender, RoutedEventArgs E)
	{
		System.Windows.Controls.TabItem currentTab = CurrentTab;
		if (EditorField == null || currentTab == null || Formatting || !Opened.Contains(currentTab))
		{
			return;
		}
		Formatting = true;
		UpdateActionState();
		FormatButton.IsLoading = true;
		try
		{
			FormatResult formatResult = await EditorField.FormatAsync(IdOf(currentTab));
			if (formatResult.Ok)
			{
				if (!formatResult.Changed)
				{
					ToastService.ShowInfo("Already Formatted", "This script is already formatted.");
				}
				return;
			}
			switch (formatResult.Reason)
			{
			case "comments":
				ToastService.ShowWarning("Can't Format This Script", "It has comments, and the formatter would remove them, so it was left unchanged.");
				break;
			case "syntax":
				ToastService.ShowWarning("Syntax Error", "Fix the syntax error first; the script can't be formatted while it is invalid.");
				break;
			case "stale":
				ToastService.ShowInfo("Script Changed", "The script changed while it was being formatted, so nothing was applied. Try again.");
				break;
			case "timeout":
				ToastService.ShowWarning("Formatting Timed Out", "The formatter took too long. Your script was not changed.");
				break;
			default:
				AppLog.Error(new InvalidOperationException("Format failed: " + formatResult.Reason + ": " + formatResult.Message), null, "Format_Click", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\MainWindow.xaml.cs");
				ToastService.ShowError("Formatter Unavailable", "The script couldn't be formatted. It was not changed.", formatResult.Reason);
				break;
			case "cancelled":
				break;
			}
		}
		finally
		{
			FormatButton.IsLoading = false;
			Formatting = false;
			UpdateActionState();
		}
	}

	private void SaveFile_Click(object Sender, RoutedEventArgs E)
	{
		if (CurrentTab != null)
		{
			SaveTab(CurrentTab);
		}
	}

	private void Execute_Click(object Sender, RoutedEventArgs E)
	{
		if (EditorField == null || CurrentTab == null || !EditorTabs.HasTabs)
		{
			return;
		}
		string text = TextOf(CurrentTab);
		if (string.IsNullOrWhiteSpace(text))
		{
			ToastService.ShowWarning("Nothing to Execute", "This tab is empty.");
			return;
		}
		try
		{
			RunScript(text);
		}
		catch (Exception ex)
		{
			AppLog.Error(ex, null, "Execute_Click", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\MainWindow.xaml.cs");
			ToastService.ShowError("Execute Failed", ex.Message, null, ex);
		}
	}

	private ExecuteResult RunScript(string Script)
	{
		ExecuteResult executeResult = ClientService.Execute(Script);
		if (executeResult.Type != ToastType.Success)
		{
			ToastService.Show(executeResult.Type, executeResult.Title, executeResult.Message);
		}
		return executeResult;
	}

	private bool OpenScriptTab(string Title, string Text)
	{
		if (EditorField == null)
		{
			return false;
		}
		NavigateTo(EditorButton, NavigationItems[EditorButton].Page);
		EditorTabs.NewTab((dotnet_codex_ui.Controls.TabItem Tab) =>
		{
			Tab.Header = Title;
			TabText[Tab] = Text;
		});
		return true;
	}

	private async void KillRoblox_Click(object Sender, RoutedEventArgs E)
	{
		KillRobloxButton.IsLoading = true;
		try
		{
			KillResult killResult = await Task.Run(() => RobloxProcess.KillAll((Exception Failure) =>
			{
				AppLog.Error(Failure, "KillRoblox", "KillRoblox_Click", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\MainWindow.xaml.cs");
			}));
			AppLog.Information("Kill Roblox ended {Ended} processes, {Failed} could not be ended", killResult.Total, killResult.Failed.Count);
			ToastType typeValue;
			if (killResult.Failed.Count <= 0)
			{
				typeValue = ((killResult.Total <= 0) ? ToastType.Info : ToastType.Success);
			}
			else
			{
				typeValue = ((killResult.Total > 0) ? ToastType.Warning : ToastType.Error);
			}
			ToastService.Show(typeValue, killResult.Title, killResult.Message);
		}
		finally
		{
			KillRobloxButton.IsLoading = false;
		}
	}

	private void EditorButton_Click(object Sender, RoutedEventArgs E)
	{
		NavigateTo(EditorButton, NavigationItems[EditorButton].Page);
	}

	private void InternetButton_Click(object Sender, RoutedEventArgs E)
	{
		NavigateTo(InternetButton, NavigationItems[InternetButton].Page);
	}

	private void ClientsButton_Click(object Sender, RoutedEventArgs E)
	{
		NavigateTo(ClientsButton, NavigationItems[ClientsButton].Page);
	}

	private async void ProfileButton_Click(object Sender, RoutedEventArgs E)
	{
		await AccountActions.ProfileAsync();
	}

	private void SettingsButton_Click(object Sender, RoutedEventArgs E)
	{
		NavigateTo(SettingsButton, NavigationItems[SettingsButton].Page);
	}

	private void NavigateTo(dotnet_codex_ui.Controls.Button ButtonValue, UIElement PageValue)
	{
		if (ButtonValue != ActiveButton)
		{
			HideNavigationToolTip();
			NavigationVersion++;
			int navigationVersion = NavigationVersion;
			UIElement activePage = ActivePage;
			ActiveButton = ButtonValue;
			ActivePage = PageValue;
			ApplyButtonState(EditorButton, EditorButton == ButtonValue, AnimateValue: true);
			ApplyButtonState(InternetButton, InternetButton == ButtonValue, AnimateValue: true);
			ApplyButtonState(ClientsButton, ClientsButton == ButtonValue, AnimateValue: true);
			ApplyButtonState(SettingsButton, SettingsButton == ButtonValue, AnimateValue: true);
			StopAnimations(activePage, PreserveCurrentValue: true);
			StopAnimations(PageValue, PreserveCurrentValue: true);
			if (activePage != PageValue)
			{
				AnimatePageOut(activePage, navigationVersion);
			}
			AnimatePageIn(PageValue);
		}
	}

	private void AnimatePageIn(UIElement PageValue)
	{
		bool num = PageValue.Visibility != Visibility.Visible || PageValue.Opacity <= 0.001;
		PageValue.Visibility = Visibility.Visible;
		TranslateTransform transform = GetTransform(PageValue);
		if (num)
		{
			transform.X = 0.0;
			transform.Y = ((PageHost.ActualHeight > 0.0) ? PageHost.ActualHeight : PageHost.Height);
			PageValue.Opacity = 0.0;
		}
		Animate(transform, TranslateTransform.XProperty, 0.0);
		Animate(transform, TranslateTransform.YProperty, 0.0);
		Animate(PageValue, UIElement.OpacityProperty, 1.0);
	}

	private void AnimatePageOut(UIElement PageValue, int TransitionVersion)
	{
		Animate(GetTransform(PageValue), To: (PageHost.ActualWidth > 0.0) ? PageHost.ActualWidth : PageHost.Width, Property: TranslateTransform.XProperty);
		Animate(PageValue, UIElement.OpacityProperty, 0.0, () =>
		{
			if (TransitionVersion == NavigationVersion && PageValue != ActivePage)
			{
				StopAnimations(PageValue, PreserveCurrentValue: false);
				ResetPage(PageValue, Visible: false);
			}
		});
	}

	private static void Animate(DependencyObject Target, DependencyProperty Property, double To, Action? Completed = null, Duration? Length = null)
	{
		if (!MotionPolicy.Enabled)
		{
			if (Target is Animatable animatable)
			{
				animatable.BeginAnimation(Property, null);
			}
			else if (Target is UIElement uIElement)
			{
				uIElement.BeginAnimation(Property, null);
			}
			Target.SetValue(Property, To);
			Completed?.Invoke();
			return;
		}
		DoubleAnimation doubleAnimation = new DoubleAnimation
		{
			To = To,
			Duration = (Length ?? MotionDurations.Navigation),
			EasingFunction = new CubicEase
			{
				EasingMode = EasingMode.EaseOut
			}
		};
		if (Completed != null)
		{
			doubleAnimation.Completed += (object? _, EventArgs _) =>
			{
				Completed();
			};
		}
		if (Target is Animatable animatable2)
		{
			animatable2.BeginAnimation(Property, doubleAnimation, HandoffBehavior.SnapshotAndReplace);
		}
		else if (Target is UIElement uIElement2)
		{
			uIElement2.BeginAnimation(Property, doubleAnimation, HandoffBehavior.SnapshotAndReplace);
		}
	}

	private static void StopAnimations(UIElement PageValue, bool PreserveCurrentValue)
	{
		TranslateTransform transform = GetTransform(PageValue);
		if (PreserveCurrentValue)
		{
			double x = transform.X;
			double y = transform.Y;
			double opacity = PageValue.Opacity;
			transform.BeginAnimation(TranslateTransform.XProperty, null);
			transform.BeginAnimation(TranslateTransform.YProperty, null);
			PageValue.BeginAnimation(UIElement.OpacityProperty, null);
			transform.X = x;
			transform.Y = y;
			PageValue.Opacity = opacity;
		}
		else
		{
			transform.BeginAnimation(TranslateTransform.XProperty, null);
			transform.BeginAnimation(TranslateTransform.YProperty, null);
			PageValue.BeginAnimation(UIElement.OpacityProperty, null);
		}
	}

	private static TranslateTransform GetTransform(UIElement PageValue)
	{
		if (PageValue.RenderTransform is TranslateTransform result)
		{
			return result;
		}
		return (TranslateTransform)(PageValue.RenderTransform = new TranslateTransform());
	}

	private static void ResetPage(UIElement PageValue, bool Visible)
	{
		StopAnimations(PageValue, PreserveCurrentValue: false);
		TranslateTransform transform = GetTransform(PageValue);
		transform.X = 0.0;
		transform.Y = 0.0;
		PageValue.Opacity = (Visible ? 1 : 0);
		PageValue.Visibility = ((!Visible) ? Visibility.Collapsed : Visibility.Visible);
	}

	private static void ApplyButtonState(dotnet_codex_ui.Controls.Button ButtonValue, bool Active, bool AnimateValue)
	{
		Color color = (Active ? ActiveForegroundColor : InactiveForegroundColor);
		Color color2 = (Active ? ActiveBackgroundColor : InactiveBackgroundColor);
		if (!AnimateValue || !MotionPolicy.Enabled)
		{
			ButtonValue.Foreground = new SolidColorBrush(color);
			ButtonValue.Background = new SolidColorBrush(color2);
		}
		else
		{
			AnimateBrush(ButtonValue, Control.ForegroundProperty, color);
			AnimateBrush(ButtonValue, Control.BackgroundProperty, color2);
		}
	}

	private static void AnimateBrush(DependencyObject Target, DependencyProperty Property, Color To)
	{
		SolidColorBrush solidColorBrush = (Target.GetValue(Property) as SolidColorBrush) ?? new SolidColorBrush(Colors.Transparent);
		solidColorBrush = solidColorBrush.CloneCurrentValue();
		Target.SetValue(Property, solidColorBrush);
		solidColorBrush.BeginAnimation(SolidColorBrush.ColorProperty, new ColorAnimation
		{
			To = To,
			Duration = ButtonStateDuration,
			EasingFunction = new CubicEase
			{
				EasingMode = EasingMode.EaseInOut
			}
		}, HandoffBehavior.SnapshotAndReplace);
	}

	private void NavigationButton_MouseEnter(object Sender, MouseEventArgs E)
	{
		if (!(Sender is dotnet_codex_ui.Controls.Button button))
		{
			return;
		}
		if (!RegistryConfiguration.ShowNavigationTooltips)
		{
			HideNavigationToolTip();
			return;
		}
		NavigationButtonHovered = true;
		ToolTipHideTimer.Stop();
		(UIElement, string, string) value;
		if (button == ProfileButton)
		{
			NavigationToolTipTitle.Text = "Profile";
			NavigationToolTipDescription.Text = "Manage your account on the website.";
		}
		else if (NavigationItems.TryGetValue(button, out value))
		{
			NavigationToolTipTitle.Text = value.Item2;
			NavigationToolTipDescription.Text = value.Item3;
		}
		ShowToolTipAt(button);
	}

	private void NavigationButton_MouseLeave(object Sender, MouseEventArgs E)
	{
		NavigationButtonHovered = false;
		ToolTipHideTimer.Stop();
		ToolTipHideTimer.Start();
	}

	private void ShowToolTipAt(dotnet_codex_ui.Controls.Button ButtonValue)
	{
		TranslateTransform translateTransform = (NavigationToolTip.RenderTransform as TranslateTransform) ?? new TranslateTransform();
		NavigationToolTip.RenderTransform = translateTransform;
		bool flag = NavigationToolTip.Visibility != Visibility.Visible;
		NavigationToolTip.Visibility = Visibility.Visible;
		NavigationToolTip.UpdateLayout();
		ToolTipButton = ButtonValue;
		(double X, double Y) tuple = ToolTipPositionFor(ButtonValue);
		double item = tuple.X;
		double item2 = tuple.Y;
		translateTransform.X = item;
		if (flag)
		{
			translateTransform.Y = item2 + 8.0;
			NavigationToolTip.Opacity = 0.0;
			Animate(translateTransform, TranslateTransform.YProperty, item2, null, MotionDurations.Tooltip);
			Animate(NavigationToolTip, UIElement.OpacityProperty, 1.0, null, MotionDurations.Tooltip);
		}
		else
		{
			Animate(translateTransform, TranslateTransform.YProperty, item2, null, MotionDurations.Tooltip);
			Animate(NavigationToolTip, UIElement.OpacityProperty, 1.0, null, MotionDurations.Tooltip);
		}
	}

	private (double X, double Y) ToolTipPositionFor(dotnet_codex_ui.Controls.Button ButtonValue)
	{
		Point point = ButtonValue.TranslatePoint(new Point(ButtonValue.ActualWidth, 0.0), Root);
		double item = Math.Clamp(point.X + 13.0, 0.0, Math.Max(0.0, Root.ActualWidth - NavigationToolTip.ActualWidth));
		double item2 = Math.Clamp(point.Y + (ButtonValue.ActualHeight - NavigationToolTip.ActualHeight) / 2.0, 0.0, Math.Max(0.0, Root.ActualHeight - NavigationToolTip.ActualHeight));
		return (X: item, Y: item2);
	}

	private void RepositionToolTip()
	{
		if (ToolTipButton != null && NavigationToolTip.Visibility == Visibility.Visible && NavigationToolTip.RenderTransform is TranslateTransform translateTransform)
		{
			NavigationToolTip.UpdateLayout();
			var (x, y) = ToolTipPositionFor(ToolTipButton);
			translateTransform.BeginAnimation(TranslateTransform.YProperty, null);
			translateTransform.X = x;
			translateTransform.Y = y;
		}
	}

	private void ToolTipHideTimer_Tick(object? Sender, EventArgs E)
	{
		ToolTipHideTimer.Stop();
		if (NavigationButtonHovered)
		{
			return;
		}
		Animate(NavigationToolTip, UIElement.OpacityProperty, 0.0, () =>
		{
			if (!NavigationButtonHovered)
			{
				NavigationToolTip.Visibility = Visibility.Collapsed;
				ToolTipButton = null;
			}
		}, MotionDurations.Tooltip);
	}

	private void HideNavigationToolTip()
	{
		NavigationButtonHovered = false;
		ToolTipHideTimer.Stop();
		NavigationToolTip.BeginAnimation(UIElement.OpacityProperty, null);
		NavigationToolTip.Opacity = 0.0;
		NavigationToolTip.Visibility = Visibility.Collapsed;
		ToolTipButton = null;
	}

	protected override void OnDeactivated(EventArgs E)
	{
		base.OnDeactivated(E);
		HideNavigationToolTip();
	}

	private void ExitButton_Click(object Sender, RoutedEventArgs E)
	{
		Close();
	}

	private void MaximizeButton_Click(object Sender, RoutedEventArgs E)
	{
		WindowState = ((WindowState != WindowState.Maximized) ? WindowState.Maximized : WindowState.Normal);
	}

	private void MinimizeButton_Click(object Sender, RoutedEventArgs E)
	{
		WindowState = WindowState.Minimized;
	}

	protected override void OnStateChanged(EventArgs E)
	{
		base.OnStateChanged(E);
		if (WindowState != WindowState.Minimized)
		{
			bool flag = WindowState == WindowState.Maximized;
			Root.Margin = (flag ? new Thickness(SystemParameters.WindowResizeBorderThickness.Left + SystemParameters.FixedFrameVerticalBorderWidth) : new Thickness(0.0));
			WindowBackground.CornerRadius = new CornerRadius((!flag) ? 10 : 0);
			LoginOverlay login = Login;
			CornerRadius scrimCornerRadius = (Confirm.ScrimCornerRadius = new CornerRadius((!flag) ? 10 : 0));
			login.ScrimCornerRadius = scrimCornerRadius;
			MaximizeIcon.Data = (flag ? ((Geometry)FindResource("Icon.Restore")) : MaximizeGeometry);
		}
	}

	internal void CloseWithoutConfirm()
	{
		SkipCloseConfirm = true;
		Close();
	}

	protected override void OnClosing(CancelEventArgs E)
	{
		base.OnClosing(E);
		if (!ExitAllowed)
		{
			E.Cancel = true;
			if (!IsClosing && !CloseFlowRunning)
			{
				CloseFlowAsync();
			}
		}
	}

	private async Task CloseFlowAsync()
	{
		CloseFlowRunning = true;
		try
		{
			if (!CloseConfirmed && !SkipCloseConfirm && RegistryConfiguration.ConfirmBeforeClosing && !FatalErrorCoordinator.IsFatal)
			{
				if (!(await Confirm.ShowAsync("Close Codex?", "Open tabs and unsaved scripts will be closed.", "Icon.Alert", "Close Application", Danger: true)))
				{
					return;
				}
				CloseConfirmed = true;
			}
			if (!(await ResolveDirtyTabsAsync()))
			{
				return;
			}
		}
		catch (Exception failure)
		{
			AppLog.Error(failure, null, "CloseFlowAsync", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\MainWindow.xaml.cs");
			return;
		}
		finally
		{
			CloseFlowRunning = false;
		}
		BeginExit();
	}

	private async Task<bool> ResolveDirtyTabsAsync()
	{
		if (FatalErrorCoordinator.IsFatal || RegistryConfiguration.ContinueWhereYouLeftOff)
		{
			return true;
		}
		foreach (System.Windows.Controls.TabItem item in EditorTabs.Items.OfType<System.Windows.Controls.TabItem>().ToList())
		{
			if (IsDirtyTab(item))
			{
				EditorTabs.SelectedItem = item;
				if (!(await ResolveDirtyAsync(item, "close Codex")))
				{
					return false;
				}
			}
		}
		return true;
	}

	private void BeginExit()
	{
		if (RegistryConfiguration.ContinueWhereYouLeftOff || RegistryConfiguration.AutoSaveTabs)
		{
			SaveTabs(Force: true);
		}
		IsClosing = true;
		Root.IsHitTestVisible = false;
		if (!MotionPolicy.Enabled)
		{
			ExitAllowed = true;
			Dispatcher.BeginInvoke(new Action(Close));
			return;
		}
		Duration exit = MotionDurations.Exit;
		CubicEase easingFunction = new CubicEase
		{
			EasingMode = EasingMode.EaseIn
		};
		DoubleAnimation animation = new DoubleAnimation
		{
			To = 0.97,
			Duration = exit,
			EasingFunction = easingFunction
		};
		RootScale.BeginAnimation(ScaleTransform.ScaleXProperty, animation);
		RootScale.BeginAnimation(ScaleTransform.ScaleYProperty, animation);
		DoubleAnimation doubleAnimation = new DoubleAnimation
		{
			To = 0.0,
			Duration = exit,
			EasingFunction = easingFunction
		};
		doubleAnimation.Completed += (object? _, EventArgs _) =>
		{
			ExitAllowed = true;
			Close();
		};
		Root.BeginAnimation(UIElement.OpacityProperty, doubleAnimation);
	}

	protected override void OnSourceInitialized(EventArgs E)
	{
		base.OnSourceInitialized(E);
		Application.Current.SessionEnding += (object _, SessionEndingCancelEventArgs _) =>
		{
			if (RegistryConfiguration.ContinueWhereYouLeftOff || RegistryConfiguration.AutoSaveTabs)
			{
				SaveTabs(Force: true);
			}
			ExitAllowed = true;
		};
	}

}
