using System;
using System.Diagnostics.CodeAnalysis;
using System.Threading;
using System.Windows;
using dotnet_codex_ui.Controls;

namespace dotnet_codex_ui.Services;

internal static class ToastService
{
	private static readonly ToastQueue Queue = new ToastQueue();

	private static ToastHost? Host;

	private static bool Closed;

	public static ToastHandle Show(ToastType TypeValue, string Title, string Message)
	{
		return Show(TypeValue, Title, Message, null, null, null);
	}

	public static ToastHandle ShowSuccess(string Title, string Message, string? ErrorCode = null, Exception? ExceptionValue = null, TimeSpan? Lifetime = null)
	{
		return Show(ToastType.Success, Title, Message, ErrorCode, ExceptionValue, Lifetime);
	}

	public static ToastHandle ShowInfo(string Title, string Message, string? ErrorCode = null, Exception? ExceptionValue = null, TimeSpan? Lifetime = null)
	{
		return Show(ToastType.Info, Title, Message, ErrorCode, ExceptionValue, Lifetime);
	}

	public static ToastHandle ShowWarning(string Title, string Message, string? ErrorCode = null, Exception? ExceptionValue = null, TimeSpan? Lifetime = null)
	{
		return Show(ToastType.Warning, Title, Message, ErrorCode, ExceptionValue, Lifetime);
	}

	public static ToastHandle ShowError(string Title, string Message, string? ErrorCode = null, Exception? ExceptionValue = null, TimeSpan? Lifetime = null)
	{
		return Show(ToastType.Error, Title, Message, ErrorCode, ExceptionValue, Lifetime);
	}

	public static ToastHandle ShowErrorWithAction(string Title, string Message, string ActionText, Action ActionValue, string? ErrorCode = null, Exception? ExceptionValue = null)
	{
		ToastHandle toastHandle = Show(ToastType.Error, Title, Message, ErrorCode, ExceptionValue, Timeout.InfiniteTimeSpan);
		toastHandle.Notification.SetAction(ActionText, ActionValue);
		return toastHandle;
	}

	public static ToastHandle ShowLoading(string Title, string Message)
	{
		return Show(ToastType.Loading, Title, Message, null, null, null);
	}

	internal static void Suspend()
	{
		Post(() =>
		{
			Closed = true;
			foreach (ToastHandle item in Queue.Clear())
			{
				item.MarkClosed();
			}
			Host?.HideImmediately();
		});
	}

	internal static void Attach(ToastHost HostValue)
	{
		Post(() =>
		{
			Host = HostValue;
			HostValue.Pump();
		});
	}

	internal static bool TryTake([NotNullWhen(true)] out ToastHandle? Handle)
	{
		if (Closed)
		{
			Handle = null;
			return false;
		}
		return Queue.TryDequeue(out Handle);
	}

	internal static void Post(Action ActionValue, Action? Dropped = null)
	{
		Application current = Application.Current;
		if (current == null || current.Dispatcher.HasShutdownStarted)
		{
			Dropped?.Invoke();
		}
		else if (current.Dispatcher.CheckAccess())
		{
			ActionValue();
		}
		else
		{
			current.Dispatcher.BeginInvoke(ActionValue);
		}
	}

	internal static void Update(ToastHandle Handle, ToastType TypeValue, string Title, string Message, string? ErrorCode, Exception? ExceptionValue, TimeSpan? Lifetime)
	{
		if (!Handle.IsClosed)
		{
			Handle.Notification.Apply(TypeValue, Title, Message, ErrorCode, ExceptionValue, Lifetime);
			Host?.OnUpdated(Handle);
		}
	}

	internal static void Dismiss(ToastHandle Handle)
	{
		if (!Handle.IsClosed)
		{
			if (Queue.Remove(Handle))
			{
				Handle.MarkClosed();
			}
			else
			{
				Host?.Dismiss(Handle);
			}
		}
	}

	private static ToastHandle Show(ToastType TypeValue, string Title, string Message, string? ErrorCode, Exception? ExceptionValue, TimeSpan? Lifetime)
	{
		ToastHandle Handle = new ToastHandle(new ToastNotification(TypeValue, Title, Message, ErrorCode, ExceptionValue, Lifetime));
		Post(() =>
		{
			if (Closed)
			{
				Handle.MarkClosed();
			}
			else
			{
				Queue.Enqueue(Handle)?.MarkClosed();
				Host?.Pump();
			}
		}, Handle.MarkClosed);
		return Handle;
	}
}
