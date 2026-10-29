using System;
using System.Collections.Generic;
using System.Collections.Specialized;
using System.Linq;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Controls.Primitives;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Animation;
using System.Windows.Media.Effects;
using System.Windows.Media.Media3D;
using System.Windows.Threading;
using dotnet_codex_ui.Infrastructure.Logging;
using dotnet_codex_ui.Services;

namespace dotnet_codex_ui.Controls;

internal class TabControl : System.Windows.Controls.TabControl
{
	internal static readonly DependencyProperty ContentProperty = DependencyProperty.Register("Content", typeof(FrameworkElement), typeof(TabControl), new FrameworkPropertyMetadata(null));

	private static readonly DependencyPropertyKey HasTabsPropertyKey = DependencyProperty.RegisterReadOnly("HasTabs", typeof(bool), typeof(TabControl), new FrameworkPropertyMetadata(false));

	public static readonly DependencyProperty HasTabsProperty = HasTabsPropertyKey.DependencyProperty;

	private static readonly DependencyProperty ScrollOffsetProperty = DependencyProperty.Register("ScrollOffset", typeof(double), typeof(TabControl), new PropertyMetadata(0.0, (DependencyObject D, DependencyPropertyChangedEventArgs E) =>
	{
		((TabControl)D).Scroller?.ScrollToHorizontalOffset((double)E.NewValue);
	}));

	public static readonly RoutedUICommand NewTabCommand = new RoutedUICommand("New Tab", "NewTabCommand", typeof(TabControl));

	private readonly HashSet<TabItem> Closing = new HashSet<TabItem>();

	private ScrollViewer? Scroller;

	private FrameworkElement? HeaderHost;

	private FrameworkElement? DropIndicator;

	private double ScrollTarget;

	private bool ScrollAnimating;

	private int ScrollVersion;

	private TabItem? DragTab;

	private Point DragOrigin;

	private bool Dragging;

	private int InsertIndex;

	private readonly DispatcherTimer DragTimer = new DispatcherTimer
	{
		Interval = TimeSpan.FromMilliseconds(16L)
	};

	private static readonly Duration SlideDuration = new Duration(TimeSpan.FromMilliseconds(140L));

	private FrameworkElement? TabPanel;

	private readonly Dictionary<TabItem, double> ShiftTargets = new Dictionary<TabItem, double>();

	private double PressPanelX;

	private double GrabOffset;

	private double DragWidth;

	private int FromIndex;

	private int DragVersion;

	private bool Settling;

	internal FrameworkElement Content
	{
		get
		{
			return (FrameworkElement)GetValue(ContentProperty);
		}
		set
		{
			SetValue(ContentProperty, value);
		}
	}

	public bool HasTabs => (bool)GetValue(HasTabsProperty);

	internal bool IsReordering { get; private set; }

	internal Func<TabItem, Task<bool>>? CloseGuard { get; set; }

	internal Func<double>? PointerProbe { get; set; }

	internal event Action<System.Windows.Controls.TabItem>? TabClosed;

	private async Task CloseWithGuardAsync(TabItem Tab)
	{
		if (!Closing.Add(Tab))
		{
			return;
		}
		try
		{
			bool flag = CloseGuard == null;
			if (!flag)
			{
				flag = await CloseGuard(Tab);
			}
			if (flag)
			{
				CloseTab(Tab);
			}
		}
		catch (Exception failure)
		{
			AppLog.Error(failure, null, "CloseWithGuardAsync", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Controls\\TabControl.cs");
		}
		finally
		{
			Closing.Remove(Tab);
		}
	}

	public TabControl()
	{
		CommandBindings.Add(new CommandBinding(NewTabCommand, (object _, ExecutedRoutedEventArgs _) =>
		{
			NewTab();
		}));
		AddHandler(TabItem.CloseRequestedEvent, (RoutedEventHandler)((object _, RoutedEventArgs E) =>
		{
			if (E.Source is TabItem tab)
			{
				_ = CloseWithGuardAsync(tab);
			}
		}));
		AddHandler(TabItem.RenameCommittedEvent, (RoutedEventHandler)((object _, RoutedEventArgs E) =>
		{
			if (E.Source is TabItem tab)
			{
				EnsureVisible(tab);
			}
		}));
		DragTimer.Tick += (object? _, EventArgs _) =>
		{
			UpdateDrag();
		};
	}

	public override void OnApplyTemplate()
	{
		base.OnApplyTemplate();
		Scroller = GetTemplateChild("PART_TabScroller") as ScrollViewer;
		HeaderHost = GetTemplateChild("PART_HeaderHost") as FrameworkElement;
		DropIndicator = GetTemplateChild("PART_DropIndicator") as FrameworkElement;
		TabPanel = GetTemplateChild("PART_TabPanel") as FrameworkElement;
	}

	protected override void OnItemsChanged(NotifyCollectionChangedEventArgs E)
	{
		base.OnItemsChanged(E);
		SetValue(HasTabsPropertyKey, Items.Count > 0);
	}

	protected override void OnSelectionChanged(SelectionChangedEventArgs E)
	{
		base.OnSelectionChanged(E);
		if (!IsReordering && SelectedItem is TabItem tab)
		{
			EnsureVisible(tab);
		}
	}

	internal TabItem NewTab(Action<TabItem>? Init = null)
	{
		TabItem tabItem = new TabItem
		{
			Header = NextTitle()
		};
		Init?.Invoke(tabItem);
		Items.Add(tabItem);
		SelectedItem = tabItem;
		EnsureVisible(tabItem);
		return tabItem;
	}

	private string NextTitle()
	{
		HashSet<string> hashSet = (from T in Items.OfType<TabItem>()
			select T.Header as string).ToHashSet();
		if (!hashSet.Contains("Untitled Tab"))
		{
			return "Untitled Tab";
		}
		int num = 2;
		string text;
		while (true)
		{
			text = $"Untitled Tab {num}";
			if (!hashSet.Contains(text))
			{
				break;
			}
			num++;
		}
		return text;
	}

	internal void CloseTab(TabItem Tab)
	{
		int num = Items.IndexOf(Tab);
		if (num >= 0)
		{
			if (SelectedItem == Tab && Items.Count > 1)
			{
				SelectedItem = Items[(num < Items.Count - 1) ? (num + 1) : (num - 1)];
			}
			Items.RemoveAt(num);
			TabClosed?.Invoke(Tab);
		}
	}

	protected override void OnPreviewMouseWheel(MouseWheelEventArgs E)
	{
		if (Scroller != null)
		{
			FrameworkElement headerHost = HeaderHost;
			if (headerHost != null && headerHost.IsMouseOver)
			{
				double num = (ScrollAnimating ? ScrollTarget : Scroller.HorizontalOffset);
				ScrollTo(num - (double)E.Delta * 0.8);
				E.Handled = true;
				return;
			}
		}
		base.OnPreviewMouseWheel(E);
	}

	private void ScrollTo(double Target, bool Animate = true)
	{
		if (Scroller == null)
		{
			return;
		}
		Target = Math.Clamp(Target, 0.0, Scroller.ScrollableWidth);
		ScrollTarget = Target;
		int VersionValue = ++ScrollVersion;
		BeginAnimation(ScrollOffsetProperty, null);
		SetValue(ScrollOffsetProperty, Scroller.HorizontalOffset);
		if (!Animate || Math.Abs(Target - Scroller.HorizontalOffset) < 0.5)
		{
			ScrollAnimating = false;
			SetValue(ScrollOffsetProperty, Target);
			return;
		}
		ScrollAnimating = true;
		DoubleAnimation doubleAnimation = new DoubleAnimation(Target, TimeSpan.FromMilliseconds(160L))
		{
			EasingFunction = new CubicEase
			{
				EasingMode = EasingMode.EaseOut
			},
			FillBehavior = FillBehavior.HoldEnd
		};
		doubleAnimation.Completed += (object? _, EventArgs _) =>
		{
			if (VersionValue == ScrollVersion)
			{
				ScrollAnimating = false;
				BeginAnimation(ScrollOffsetProperty, null);
				SetValue(ScrollOffsetProperty, Target);
			}
		};
		BeginAnimation(ScrollOffsetProperty, doubleAnimation);
	}

	private void EnsureVisible(TabItem Tab)
	{
		Dispatcher.BeginInvoke(DispatcherPriority.Loaded, (Action)(() =>
		{
			if (Scroller != null && Tab.IsLoaded && IsLoaded)
			{
				double x = Tab.TranslatePoint(new Point(0.0, 0.0), Scroller).X;
				double num = x + Tab.ActualWidth;
				double num2 = (ScrollAnimating ? ScrollTarget : Scroller.HorizontalOffset);
				if (x < 0.0)
				{
					ScrollTo(num2 + x - 4.0);
				}
				else if (num > Scroller.ViewportWidth)
				{
					ScrollTo(num2 + num - Scroller.ViewportWidth + 4.0);
				}
			}
		}));
	}

	private double PointerX()
	{
		Func<double>? pointerProbe = PointerProbe;
		if (pointerProbe == null)
		{
			if (TabPanel != null)
			{
				return Mouse.GetPosition(TabPanel).X;
			}
			return 0.0;
		}
		return pointerProbe();
	}

	private static Rect SlotOf(TabItem Tab)
	{
		return LayoutInformation.GetLayoutSlot(Tab);
	}

	private static (ScaleTransform Scale, TranslateTransform Shift) TransformsOf(TabItem Tab)
	{
		if (Tab.RenderTransform is TransformGroup { Children: { Count: 2 } } transformGroup && transformGroup.Children[0] is ScaleTransform item && transformGroup.Children[1] is TranslateTransform item2)
		{
			return (Scale: item, Shift: item2);
		}
		ScaleTransform scaleTransform = new ScaleTransform(1.0, 1.0);
		TranslateTransform translateTransform = new TranslateTransform();
		Tab.RenderTransformOrigin = new Point(0.5, 0.5);
		Tab.RenderTransform = new TransformGroup
		{
			Children = 
			{
				(Transform)scaleTransform,
				(Transform)translateTransform
			}
		};
		return (Scale: scaleTransform, Shift: translateTransform);
	}

	private static void Glide(Animatable Target, DependencyProperty Property, double To, Action? Completed = null)
	{
		if (!MotionPolicy.Enabled)
		{
			Target.BeginAnimation(Property, null);
			Target.SetValue(Property, To);
			Completed?.Invoke();
			return;
		}
		DoubleAnimation doubleAnimation = new DoubleAnimation(To, SlideDuration)
		{
			EasingFunction = new CubicEase
			{
				EasingMode = EasingMode.EaseOut
			},
			FillBehavior = FillBehavior.HoldEnd
		};
		if (Completed != null)
		{
			doubleAnimation.Completed += (object? _, EventArgs _) =>
			{
				Completed();
			};
		}
		Target.BeginAnimation(Property, doubleAnimation, HandoffBehavior.SnapshotAndReplace);
	}

	protected override void OnPreviewMouseLeftButtonDown(MouseButtonEventArgs E)
	{
		base.OnPreviewMouseLeftButtonDown(E);
		DragTab = null;
		if (!Settling && E.OriginalSource is DependencyObject node && HeaderHost != null && HeaderHost.IsMouseOver)
		{
			TabItem tabItem = FindAncestor<TabItem>(node);
			if (tabItem != null && !tabItem.IsEditing && FindAncestor<ButtonBase>(node) == null)
			{
				DragTab = tabItem;
				DragOrigin = E.GetPosition(this);
				PressPanelX = PointerX();
			}
		}
	}

	protected override void OnPreviewMouseMove(MouseEventArgs E)
	{
		base.OnPreviewMouseMove(E);
		if (DragTab != null && !Dragging && E.LeftButton == MouseButtonState.Pressed && !(Math.Abs((E.GetPosition(this) - DragOrigin).X) < SystemParameters.MinimumHorizontalDragDistance))
		{
			BeginDragCore();
		}
	}

	private void BeginDragCore()
	{
		if (DragTab != null && TabPanel != null)
		{
			TabItem dragTab = DragTab;
			Rect rect = SlotOf(dragTab);
			Dragging = true;
			IsReordering = true;
			DragVersion++;
			FromIndex = Items.IndexOf(dragTab);
			InsertIndex = FromIndex;
			DragWidth = rect.Width;
			GrabOffset = Math.Clamp(PressPanelX - rect.X, 0.0, rect.Width);
			ShiftTargets.Clear();
			Panel.SetZIndex(dragTab, 50);
			dragTab.Effect = new DropShadowEffect
			{
				BlurRadius = 10.0,
				ShadowDepth = 0.0,
				Opacity = 0.55,
				Color = Colors.Black
			};
			ScaleTransform item = TransformsOf(dragTab).Scale;
			Glide(item, ScaleTransform.ScaleXProperty, 1.03);
			Glide(item, ScaleTransform.ScaleYProperty, 1.03);
			dragTab.Opacity = 0.95;
			if (DropIndicator != null)
			{
				DropIndicator.Visibility = Visibility.Collapsed;
			}
			Cursor = Cursors.SizeWE;
			CaptureMouse();
			DragTimer.Start();
			UpdateDrag();
		}
	}

	protected override void OnPreviewMouseLeftButtonUp(MouseButtonEventArgs E)
	{
		base.OnPreviewMouseLeftButtonUp(E);
		if (Dragging)
		{
			EndDrag(Commit: true);
		}
		DragTab = null;
	}

	protected override void OnLostMouseCapture(MouseEventArgs E)
	{
		base.OnLostMouseCapture(E);
		if (Dragging)
		{
			EndDrag(Commit: false);
		}
	}

	protected override void OnPreviewKeyDown(KeyEventArgs E)
	{
		if (Dragging && E.Key == Key.Escape)
		{
			E.Handled = true;
			EndDrag(Commit: false);
		}
		else
		{
			base.OnPreviewKeyDown(E);
		}
	}

	private void UpdateDrag()
	{
		if (!Dragging || DragTab == null || Scroller == null || TabPanel == null)
		{
			return;
		}
		if (PointerProbe == null)
		{
			double x = Mouse.GetPosition(Scroller).X;
			if (x < 24.0)
			{
				ScrollTo(Scroller.HorizontalOffset - 14.0, Animate: false);
			}
			else if (x > Scroller.ViewportWidth - 24.0)
			{
				ScrollTo(Scroller.HorizontalOffset + 14.0, Animate: false);
			}
		}
		List<TabItem> list = Items.OfType<TabItem>().ToList();
		if (list.Count == 0)
		{
			return;
		}
		Rect rect = SlotOf(DragTab);
		double x2 = SlotOf(list[0]).X;
		double max = Math.Max(x2, SlotOf(list[list.Count - 1]).Right - DragWidth);
		double num = Math.Clamp(PointerX() - GrabOffset, x2, max);
		TranslateTransform item = TransformsOf(DragTab).Shift;
		item.BeginAnimation(TranslateTransform.XProperty, null);
		item.X = num - rect.X;
		double num2 = num + DragWidth / 2.0;
		int num3 = 0;
		foreach (TabItem item2 in list)
		{
			if (item2 != DragTab && SlotOf(item2).X + SlotOf(item2).Width / 2.0 <= num2 + 0.01)
			{
				num3++;
			}
		}
		InsertIndex = num3;
		for (int i = 0; i < list.Count; i++)
		{
			TabItem tabItem = list[i];
			if (tabItem != DragTab)
			{
				double num4;
				if (i > FromIndex && i <= num3)
				{
					num4 = 0.0 - DragWidth;
				}
				else
				{
					num4 = ((i < FromIndex && i >= num3) ? DragWidth : 0.0);
				}
				if (!ShiftTargets.TryGetValue(tabItem, out var value) || value != num4)
				{
					ShiftTargets[tabItem] = num4;
					Glide(TransformsOf(tabItem).Shift, TranslateTransform.XProperty, num4);
				}
			}
		}
	}

	private void EndDrag(bool Commit)
	{
		TabItem Tab = DragTab;
		Dragging = false;
		DragTimer.Stop();
		Cursor = null;
		if (IsMouseCaptured)
		{
			ReleaseMouseCapture();
		}
		if (Tab == null || !Items.Contains(Tab))
		{
			FinishDrag(Tab, Commit: false, -1, -1);
			return;
		}
		int From = Items.IndexOf(Tab);
		int To = (Commit ? Math.Clamp(InsertIndex, 0, Items.Count - 1) : From);
		List<TabItem> list = Items.OfType<TabItem>().ToList();
		(ScaleTransform Scale, TranslateTransform Shift) tuple = TransformsOf(Tab);
		ScaleTransform item = tuple.Scale;
		TranslateTransform item2 = tuple.Shift;
		double to = 0.0;
		if (To > From)
		{
			to = SlotOf(list[To]).Right - DragWidth - SlotOf(Tab).X;
		}
		else if (To < From)
		{
			to = SlotOf(list[To]).X - SlotOf(Tab).X;
		}
		Settling = true;
		int VersionValue = DragVersion;
		Glide(item, ScaleTransform.ScaleXProperty, 1.0);
		Glide(item, ScaleTransform.ScaleYProperty, 1.0);
		Tab.Opacity = 1.0;
		if (!Commit || To == From)
		{
			foreach (TabItem item3 in list.Where((TabItem T) => T != Tab))
			{
				Glide(TransformsOf(item3).Shift, TranslateTransform.XProperty, 0.0);
			}
		}
		Glide(item2, TranslateTransform.XProperty, to, () =>
		{
			if (VersionValue == DragVersion)
			{
				FinishDrag(Tab, Commit, From, To);
			}
		});
	}

	private void FinishDrag(TabItem? Tab, bool Commit, int From, int To)
	{
		try
		{
			if (Commit && Tab != null && From >= 0 && To != From && Items.Contains(Tab))
			{
				object selectedItem = SelectedItem;
				Items.RemoveAt(From);
				Items.Insert(To, Tab);
				SelectedItem = selectedItem;
			}
			UpdateLayout();
		}
		finally
		{
			foreach (TabItem item in Items.OfType<TabItem>())
			{
				var (scaleTransform, translateTransform) = TransformsOf(item);
				scaleTransform.BeginAnimation(ScaleTransform.ScaleXProperty, null);
				scaleTransform.BeginAnimation(ScaleTransform.ScaleYProperty, null);
				translateTransform.BeginAnimation(TranslateTransform.XProperty, null);
				double scaleX = (scaleTransform.ScaleY = 1.0);
				scaleTransform.ScaleX = scaleX;
				translateTransform.X = 0.0;
				item.Opacity = 1.0;
				item.Effect = null;
				Panel.SetZIndex(item, item.IsSelected ? 1 : 0);
			}
			if (Tab != null)
			{
				Tab.Effect = null;
				Tab.Opacity = 1.0;
			}
			ShiftTargets.Clear();
			if (DropIndicator != null)
			{
				DropIndicator.Visibility = Visibility.Collapsed;
			}
			IsReordering = false;
			Settling = false;
			if (Tab != null)
			{
				EnsureVisible(Tab);
			}
		}
	}

	private static T? FindAncestor<T>(DependencyObject? Node) where T : DependencyObject
	{
		while (Node != null)
		{
			if (Node is T result)
			{
				return result;
			}
			bool flag = ((Node is Visual || Node is Visual3D) ? true : false);
			Node = (flag ? VisualTreeHelper.GetParent(Node) : LogicalTreeHelper.GetParent(Node));
		}
		return null;
	}
}
