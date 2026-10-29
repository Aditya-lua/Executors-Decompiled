using System;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Input;
using System.Windows.Threading;

namespace dotnet_codex_ui.Controls;

internal class TabItem : System.Windows.Controls.TabItem
{
	public static readonly DependencyProperty IsEditingProperty = DependencyProperty.Register("IsEditing", typeof(bool), typeof(TabItem), new FrameworkPropertyMetadata(false, (DependencyObject D, DependencyPropertyChangedEventArgs E) =>
	{
		((TabItem)D).OnIsEditingChanged((bool)E.NewValue);
	}));

	public static readonly DependencyProperty IsDirtyProperty = DependencyProperty.Register("IsDirty", typeof(bool), typeof(TabItem), new FrameworkPropertyMetadata(false));

	public static readonly RoutedEvent CloseRequestedEvent = EventManager.RegisterRoutedEvent("CloseRequested", RoutingStrategy.Bubble, typeof(RoutedEventHandler), typeof(TabItem));

	public static readonly RoutedEvent RenameCommittedEvent = EventManager.RegisterRoutedEvent("RenameCommitted", RoutingStrategy.Bubble, typeof(RoutedEventHandler), typeof(TabItem));

	private TextBox? Editor;

	private System.Windows.Controls.Button? Close;

	public Guid Id { get; } = Guid.NewGuid();

	public bool IsDirty
	{
		get
		{
			return (bool)GetValue(IsDirtyProperty);
		}
		set
		{
			SetValue(IsDirtyProperty, value);
		}
	}

	public bool IsEditing
	{
		get
		{
			return (bool)GetValue(IsEditingProperty);
		}
		set
		{
			SetValue(IsEditingProperty, value);
		}
	}

	public override void OnApplyTemplate()
	{
		base.OnApplyTemplate();
		if (Editor != null)
		{
			Editor.PreviewKeyDown -= Editor_PreviewKeyDown;
			Editor.LostKeyboardFocus -= Editor_LostKeyboardFocus;
		}
		if (Close != null)
		{
			Close.Click -= Close_Click;
		}
		Editor = GetTemplateChild("PART_Editor") as TextBox;
		Close = GetTemplateChild("PART_Close") as System.Windows.Controls.Button;
		if (Editor != null)
		{
			Editor.PreviewKeyDown += Editor_PreviewKeyDown;
			Editor.LostKeyboardFocus += Editor_LostKeyboardFocus;
		}
		if (Close != null)
		{
			Close.Click += Close_Click;
		}
	}

	private void Close_Click(object Sender, RoutedEventArgs E)
	{
		E.Handled = true;
		RaiseEvent(new RoutedEventArgs(CloseRequestedEvent, this));
	}

	protected override void OnMouseLeftButtonDown(MouseButtonEventArgs E)
	{
		if (E.ClickCount == 2 && !IsEditing)
		{
			IsEditing = true;
			E.Handled = true;
		}
		else
		{
			base.OnMouseLeftButtonDown(E);
		}
	}

	private void OnIsEditingChanged(bool Editing)
	{
		if (!Editing || Editor == null)
		{
			return;
		}
		Editor.Text = (Header as string) ?? "";
		Dispatcher.BeginInvoke(DispatcherPriority.Input, (Action)(() =>
		{
			if (Editor != null && IsEditing)
			{
				Editor.Focus();
				Editor.SelectAll();
			}
		}));
	}

	private void Editor_PreviewKeyDown(object Sender, KeyEventArgs E)
	{
		if (E.Key == Key.Enter)
		{
			Commit();
			E.Handled = true;
		}
		else if (E.Key == Key.Escape)
		{
			IsEditing = false;
			E.Handled = true;
		}
	}

	private void Editor_LostKeyboardFocus(object Sender, KeyboardFocusChangedEventArgs E)
	{
		Commit();
	}

	private void Commit()
	{
		if (IsEditing && Editor != null)
		{
			string text = Editor.Text.Trim();
			IsEditing = false;
			if (text.Length != 0 && !(text == Header as string))
			{
				Header = text;
				RaiseEvent(new RoutedEventArgs(RenameCommittedEvent, this));
			}
		}
	}
}
