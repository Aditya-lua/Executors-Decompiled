using System.Windows;

namespace dotnet_codex_ui.Features.Explorer;

public static class TreeItemState
{
	public static readonly DependencyProperty IsNoteProperty = DependencyProperty.RegisterAttached("IsNote", typeof(bool), typeof(TreeItemState), new PropertyMetadata(false));

	public static readonly DependencyProperty HasCountProperty = DependencyProperty.RegisterAttached("HasCount", typeof(bool), typeof(TreeItemState), new PropertyMetadata(false));

	public static readonly DependencyProperty IsDropTargetProperty = DependencyProperty.RegisterAttached("IsDropTarget", typeof(bool), typeof(TreeItemState), new PropertyMetadata(false));

	public static readonly DependencyProperty IsRenamingProperty = DependencyProperty.RegisterAttached("IsRenaming", typeof(bool), typeof(TreeItemState), new PropertyMetadata(false));

	public static bool GetIsNote(DependencyObject D)
	{
		return (bool)D.GetValue(IsNoteProperty);
	}

	public static void SetIsNote(DependencyObject D, bool Value)
	{
		D.SetValue(IsNoteProperty, Value);
	}

	public static bool GetHasCount(DependencyObject D)
	{
		return (bool)D.GetValue(HasCountProperty);
	}

	public static void SetHasCount(DependencyObject D, bool Value)
	{
		D.SetValue(HasCountProperty, Value);
	}

	public static bool GetIsDropTarget(DependencyObject D)
	{
		return (bool)D.GetValue(IsDropTargetProperty);
	}

	public static void SetIsDropTarget(DependencyObject D, bool Value)
	{
		D.SetValue(IsDropTargetProperty, Value);
	}

	public static bool GetIsRenaming(DependencyObject D)
	{
		return (bool)D.GetValue(IsRenamingProperty);
	}

	public static void SetIsRenaming(DependencyObject D, bool Value)
	{
		D.SetValue(IsRenamingProperty, Value);
	}
}
