using System;
using System.ComponentModel;
using System.Linq;
using System.Threading;

namespace dotnet_codex_ui.Services;

internal sealed class ToastNotification : INotifyPropertyChanged
{
	public ToastType Type { get; private set; }

	public string Title { get; private set; } = "";

	public string Message { get; private set; } = "";

	public string? ErrorCode { get; private set; }

	public string? ExceptionType { get; private set; }

	public string? Details { get; private set; }

	public TimeSpan? Lifetime { get; private set; }

	public string? ActionText { get; private set; }

	internal Action? ActionCallback { get; private set; }

	public bool HasAction => ActionCallback != null;

	public bool HasDetails => !string.IsNullOrWhiteSpace(Details);

	public string? Meta
	{
		get
		{
			if (string.IsNullOrWhiteSpace(ErrorCode))
			{
				if (string.IsNullOrWhiteSpace(ExceptionType))
				{
					return null;
				}
				return "Exception: " + ExceptionType;
			}
			return "Error code: " + ErrorCode;
		}
	}

	public bool HasMeta => Meta != null;

	public string DiagnosticText => string.Join(Environment.NewLine, new string[4] { Title, Message, Meta, Details }.Where((string S) => !string.IsNullOrWhiteSpace(S)));

	public event PropertyChangedEventHandler? PropertyChanged;

	internal void SetAction(string Text, Action Callback)
	{
		ActionText = Text;
		ActionCallback = Callback;
		PropertyChanged?.Invoke(this, new PropertyChangedEventArgs(string.Empty));
	}

	public ToastNotification(ToastType TypeValue, string TitleValue, string MessageValue, string? ErrorCodeValue, Exception? ExceptionValue, TimeSpan? LifetimeValue)
	{
		Apply(TypeValue, TitleValue, MessageValue, ErrorCodeValue, ExceptionValue, LifetimeValue);
	}

	internal void Apply(ToastType TypeValue, string TitleValue, string MessageValue, string? ErrorCodeValue, Exception? ExceptionValue, TimeSpan? LifetimeValue)
	{
		Type = TypeValue;
		Title = TitleValue;
		Message = MessageValue;
		ErrorCode = ErrorCodeValue;
		ExceptionType = ExceptionValue?.GetType().Name;
		bool flag = (uint)(TypeValue - 2) <= 1u;
		Details = ((!flag) ? null : ExceptionValue?.ToString());
		Lifetime = ResolveLifetime(TypeValue, LifetimeValue);
		PropertyChanged?.Invoke(this, new PropertyChangedEventArgs(string.Empty));
	}

	private static TimeSpan? ResolveLifetime(ToastType TypeValue, TimeSpan? Requested)
	{
		if (Requested == Timeout.InfiniteTimeSpan)
		{
			return null;
		}
		return Requested ?? (TypeValue switch
		{
			ToastType.Success => (TimeSpan?)TimeSpan.FromSeconds(3.5), 
			ToastType.Info => TimeSpan.FromSeconds(4.5), 
			ToastType.Warning => TimeSpan.FromSeconds(6L), 
			ToastType.Error => TimeSpan.FromSeconds(7L), 
			_ => null, 
		});
	}
}
