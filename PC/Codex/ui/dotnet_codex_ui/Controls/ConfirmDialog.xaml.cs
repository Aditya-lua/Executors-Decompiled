using System;
using System.CodeDom.Compiler;
using System.Diagnostics;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Automation;
using System.Windows.Controls;
using System.Windows.Input;
using System.Windows.Markup;
using System.Windows.Media;
using System.Windows.Threading;

namespace dotnet_codex_ui.Controls;

public partial class ConfirmDialog : UserControl, IComponentConnector
{
	private TaskCompletionSource<DialogChoice>? ResultField;

	public bool IsOpen => ResultField != null;

	public CornerRadius ScrimCornerRadius
	{
		set
		{
			Scrim.CornerRadius = value;
		}
	}

	public ConfirmDialog()
	{
		InitializeComponent();
	}

	public async Task<bool> ShowAsync(string Title, string Message, string IconKey, string ConfirmText, bool Danger = false)
	{
		return await ShowChoiceAsync(Title, Message, IconKey, ConfirmText, null, Danger) == DialogChoice.Confirm;
	}

	public Task<DialogChoice> ShowChoiceAsync(string Title, string Message, string IconKey, string ConfirmText, string? DiscardText, bool Danger = false)
	{
		if (ResultField != null)
		{
			return Task.FromResult(DialogChoice.Cancel);
		}
		ResultField = new TaskCompletionSource<DialogChoice>();
		DiscardButton.Content = DiscardText;
		DiscardButton.Visibility = ((DiscardText == null) ? Visibility.Collapsed : Visibility.Visible);
		TitleText.Text = Title;
		MessageText.Text = Message;
		Icon.Data = (Geometry)FindResource(IconKey);
		Icon.Stroke = (Brush)FindResource(Danger ? "Toast.Error" : "Page.Accent");
		ConfirmButton.Content = ConfirmText;
		AutomationProperties.SetName(ConfirmButton, ConfirmText);
		if (DiscardText != null)
		{
			AutomationProperties.SetName(DiscardButton, DiscardText);
		}
		ConfirmButton.Style = (Style)FindResource(Danger ? "ActionBarDanger" : "ActionBarAccent");
		OverlayMotion.Show(this, Scrim, Card);
		Button Initial = (Danger ? CancelButton : ConfirmButton);
		Dispatcher.BeginInvoke((Func<IInputElement>)(() => Keyboard.Focus(Initial)), DispatcherPriority.Loaded);
		return ResultField.Task;
	}

	protected override void OnPreviewKeyDown(KeyEventArgs E)
	{
		if (ResultField != null && E.Key == Key.Escape)
		{
			E.Handled = true;
			Close(DialogChoice.Cancel);
		}
		else
		{
			base.OnPreviewKeyDown(E);
		}
	}

	private void Cancel_Click(object Sender, RoutedEventArgs E)
	{
		Close(DialogChoice.Cancel);
	}

	private void Discard_Click(object Sender, RoutedEventArgs E)
	{
		Close(DialogChoice.Discard);
	}

	private void Confirm_Click(object Sender, RoutedEventArgs E)
	{
		Close(DialogChoice.Confirm);
	}

	private void Close(DialogChoice Result)
	{
		TaskCompletionSource<DialogChoice>? resultField = ResultField;
		ResultField = null;
		OverlayMotion.Hide(this, Scrim, Card);
		resultField?.TrySetResult(Result);
	}

}
