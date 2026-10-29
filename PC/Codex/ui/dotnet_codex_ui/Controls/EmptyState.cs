using System.Windows;
using System.Windows.Automation;
using System.Windows.Automation.Peers;
using System.Windows.Controls;
using System.Windows.Media;

namespace dotnet_codex_ui.Controls;

internal class EmptyState : Control
{
	private sealed class EmptyStatePeer(EmptyState State) : FrameworkElementAutomationPeer(State)
	{
		protected override string GetClassNameCore()
		{
			return "EmptyState";
		}

		protected override AutomationControlType GetAutomationControlTypeCore()
		{
			return AutomationControlType.Text;
		}

		protected override bool IsContentElementCore()
		{
			return true;
		}

		protected override bool IsControlElementCore()
		{
			return true;
		}

		protected override string GetNameCore()
		{
			return State.Title ?? string.Empty;
		}

		protected override string GetHelpTextCore()
		{
			return State.Message ?? string.Empty;
		}
	}

	public static readonly DependencyProperty IconProperty;

	public static readonly DependencyProperty TitleProperty;

	public static readonly DependencyProperty MessageProperty;

	public Geometry? Icon
	{
		get
		{
			return (Geometry)GetValue(IconProperty);
		}
		set
		{
			SetValue(IconProperty, value);
		}
	}

	public string? Title
	{
		get
		{
			return (string)GetValue(TitleProperty);
		}
		set
		{
			SetValue(TitleProperty, value);
		}
	}

	public string? Message
	{
		get
		{
			return (string)GetValue(MessageProperty);
		}
		set
		{
			SetValue(MessageProperty, value);
		}
	}

	static EmptyState()
	{
		IconProperty = DependencyProperty.Register("Icon", typeof(Geometry), typeof(EmptyState));
		TitleProperty = DependencyProperty.Register("Title", typeof(string), typeof(EmptyState), new PropertyMetadata(null, Changed));
		MessageProperty = DependencyProperty.Register("Message", typeof(string), typeof(EmptyState), new PropertyMetadata(null, Changed));
		FrameworkElement.DefaultStyleKeyProperty.OverrideMetadata(typeof(EmptyState), new FrameworkPropertyMetadata(typeof(EmptyState)));
	}

	protected override AutomationPeer OnCreateAutomationPeer()
	{
		return new EmptyStatePeer(this);
	}

	private static void Changed(DependencyObject D, DependencyPropertyChangedEventArgs E)
	{
		UIElementAutomationPeer.FromElement((EmptyState)D)?.RaisePropertyChangedEvent((E.Property == TitleProperty) ? AutomationElementIdentifiers.NameProperty : AutomationElementIdentifiers.HelpTextProperty, E.OldValue ?? "", E.NewValue ?? "");
	}
}
