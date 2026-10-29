using System;
using System.Threading.Tasks;

namespace dotnet_codex_ui.Services;

internal sealed class ToastHandle
{
	private readonly TaskCompletionSource ShownField = new TaskCompletionSource(TaskCreationOptions.RunContinuationsAsynchronously);

	private readonly TaskCompletionSource ClosedField = new TaskCompletionSource(TaskCreationOptions.RunContinuationsAsynchronously);

	private volatile bool IsClosedField;

	internal ToastNotification Notification { get; }

	internal bool IsClosed => IsClosedField;

	public Task Shown => ShownField.Task;

	public Task Closed => ClosedField.Task;

	internal ToastHandle(ToastNotification NotificationValue)
	{
		Notification = NotificationValue;
	}

	public void Update(ToastType TypeValue, string Title, string Message, string? ErrorCode = null, Exception? ExceptionValue = null, TimeSpan? Lifetime = null)
	{
		ToastService.Post(() =>
		{
			ToastService.Update(this, TypeValue, Title, Message, ErrorCode, ExceptionValue, Lifetime);
		});
	}

	public void Dismiss()
	{
		ToastService.Post(() =>
		{
			ToastService.Dismiss(this);
		});
	}

	internal void MarkShown()
	{
		ShownField.TrySetResult();
	}

	internal void MarkClosed()
	{
		IsClosedField = true;
		ShownField.TrySetResult();
		ClosedField.TrySetResult();
	}
}
