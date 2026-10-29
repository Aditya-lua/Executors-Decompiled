using System;
using System.Globalization;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;

namespace dotnet_codex_ui.Features.Explorer;

public sealed class TreeConnectorVisibilityConverter : IValueConverter
{
	public object Convert(object? Value, Type TargetType, object? Parameter, CultureInfo Culture)
	{
		if (!(Value is TreeViewItem container))
		{
			return Visibility.Collapsed;
		}
		ItemsControl itemsControl = ItemsControl.ItemsControlFromItemContainer(container);
		bool flag = itemsControl is TreeView;
		string text = Parameter?.ToString() ?? string.Empty;
		if (text.Equals("Horizontal", StringComparison.OrdinalIgnoreCase))
		{
			return flag ? Visibility.Collapsed : Visibility.Visible;
		}
		if (text.Equals("Top", StringComparison.OrdinalIgnoreCase))
		{
			return flag ? Visibility.Collapsed : Visibility.Visible;
		}
		if (text.Equals("Bottom", StringComparison.OrdinalIgnoreCase))
		{
			if ((itemsControl == null) | flag)
			{
				return Visibility.Collapsed;
			}
			int num = itemsControl.ItemContainerGenerator.IndexFromContainer(container);
			return (num < 0 || num >= itemsControl.Items.Count - 1) ? Visibility.Collapsed : Visibility.Visible;
		}
		return Visibility.Collapsed;
	}

	public object ConvertBack(object? Value, Type TargetType, object? Parameter, CultureInfo Culture)
	{
		throw new NotSupportedException();
	}
}
