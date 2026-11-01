using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Diagnostics;
using System.Runtime.CompilerServices;

namespace ScriptEditor.Models;

public sealed class ClientEntry : INotifyPropertyChanged
{
	private string _memoryText = "—";

	private string _uptimeText = "—";

	private bool _isAttached;

	private bool _injectEnabled = true;

	private bool _executeEnabled = true;

	private bool _hasExited;

	internal Process Process { get; }

	public int Pid { get; }

	public string ProcessName { get; }

	public DateTime StartTime { get; }

	public string Title => $"PID {Pid}";

	public string MemoryText
	{
		get
		{
			return _memoryText;
		}
		private set
		{
			Set(ref _memoryText, value, "MemoryText");
		}
	}

	public string UptimeText
	{
		get
		{
			return _uptimeText;
		}
		private set
		{
			Set(ref _uptimeText, value, "UptimeText");
		}
	}

	public bool IsAttached
	{
		get
		{
			return _isAttached;
		}
		internal set
		{
			if (Set(ref _isAttached, value, "IsAttached"))
			{
				OnPropertyChanged("StatusText");
			}
		}
	}

	public string StatusText
	{
		get
		{
			if (!_hasExited)
			{
				if (!IsAttached)
				{
					return "Not attached";
				}
				return "Attached";
			}
			return "Closed";
		}
	}

	public bool InjectEnabled
	{
		get
		{
			return _injectEnabled;
		}
		set
		{
			Set(ref _injectEnabled, value, "InjectEnabled");
		}
	}

	public bool ExecuteEnabled
	{
		get
		{
			return _executeEnabled;
		}
		set
		{
			Set(ref _executeEnabled, value, "ExecuteEnabled");
		}
	}

	public event PropertyChangedEventHandler? PropertyChanged;

	public ClientEntry(Process process)
	{
		Process = process;
		Pid = process.Id;
		ProcessName = process.ProcessName;
		try
		{
			StartTime = process.StartTime;
		}
		catch (Exception ex) when ((ex is InvalidOperationException || ex is Win32Exception) ? true : false)
		{
			StartTime = DateTime.Now;
		}
		Refresh();
	}

	public void Refresh()
	{
		try
		{
			Process.Refresh();
			if (Process.HasExited)
			{
				MarkExited();
				return;
			}
			MemoryText = FormatBytes(Process.WorkingSet64);
			UptimeText = FormatUptime(DateTime.Now - StartTime);
		}
		catch (Exception ex) when ((ex is InvalidOperationException || ex is Win32Exception) ? true : false)
		{
			MarkExited();
		}
	}

	private void MarkExited()
	{
		_hasExited = true;
		MemoryText = "—";
		UptimeText = "—";
		OnPropertyChanged("StatusText");
	}

	private static string FormatBytes(long bytes)
	{
		double num = (double)bytes / 1024.0 / 1024.0;
		if (num >= 1024.0)
		{
			return $"{num / 1024.0:0.00} GB";
		}
		return $"{num:0} MB";
	}

	private static string FormatUptime(TimeSpan uptime)
	{
		if (uptime < TimeSpan.Zero)
		{
			uptime = TimeSpan.Zero;
		}
		if (!(uptime.TotalHours >= 1.0))
		{
			if (uptime.TotalMinutes >= 1.0)
			{
				return $"{uptime.Minutes}m {uptime.Seconds}s";
			}
			return $"{uptime.Seconds}s";
		}
		return $"{(int)uptime.TotalHours}h {uptime.Minutes}m";
	}

	private bool Set<T>(ref T field, T value, [CallerMemberName] string? name = null)
	{
		if (EqualityComparer<T>.Default.Equals(field, value))
		{
			return false;
		}
		field = value;
		OnPropertyChanged(name);
		return true;
	}

	private void OnPropertyChanged([CallerMemberName] string? name = null)
	{
		PropertyChanged?.Invoke(this, new PropertyChangedEventArgs(name));
	}
}
