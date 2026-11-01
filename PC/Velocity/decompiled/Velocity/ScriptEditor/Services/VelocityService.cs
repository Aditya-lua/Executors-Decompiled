using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel;
using System.Diagnostics;
using System.IO;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Threading.Tasks;
using System.Windows.Threading;
using ScriptEditor.Models;
using VelocityAPI;

namespace ScriptEditor.Services;

public sealed class VelocityService : INotifyPropertyChanged, IDisposable
{
	private static readonly string[] ClientProcessNames = new string[1] { "RobloxPlayerBeta" };

	private readonly VelAPI _api = new VelAPI();

	private readonly DispatcherTimer _autoInjectTimer;

	private readonly DispatcherTimer _clientsTimer;

	private readonly HashSet<int> _waitingFor = new HashSet<int>();

	private bool _isReady;

	private bool _isBusy;

	private bool _repairAttempted;

	private static string BinDirectory => Path.Combine(AppPaths.InstallFolder, "Bin");

	private static string InjectorPath => Path.Combine(BinDirectory, "erto3e4rortoergn.exe");

	private static string VersionStampPath => Path.Combine(BinDirectory, "current_version.txt");

	public int AutoInjectDelaySeconds { get; set; } = 12;

	public ObservableCollection<ClientEntry> Clients { get; } = new ObservableCollection<ClientEntry>();

	public int ClientCount => Clients.Count;

	public bool IsReady
	{
		get
		{
			return _isReady;
		}
		private set
		{
			Set(ref _isReady, value, "IsReady");
		}
	}

	public bool IsBusy
	{
		get
		{
			return _isBusy;
		}
		private set
		{
			Set(ref _isBusy, value, "IsBusy");
		}
	}

	public int AttachedCount => _api.injected_pids.Count;

	public bool IsAttached => AttachedCount > 0;

	public static bool IsInjectorPresent => File.Exists(InjectorPath);

	public event Action<string, OutputKind>? Message;

	public event PropertyChangedEventHandler? PropertyChanged;

	public VelocityService()
	{
		//IL_0047: Unknown result type (might be due to invalid IL or missing references)
		//IL_004c: Unknown result type (might be due to invalid IL or missing references)
		//IL_005e: Expected Obj, but got Unknown
		//IL_0076: Unknown result type (might be due to invalid IL or missing references)
		//IL_007b: Unknown result type (might be due to invalid IL or missing references)
		//IL_008d: Expected Obj, but got Unknown
		_api.OnError += (string title, string message) =>
		{
			Report(title + ": " + message, OutputKind.Error);
		};
		_autoInjectTimer = new DispatcherTimer
		{
			Interval = TimeSpan.FromSeconds(2L)
		};
		_autoInjectTimer.Tick += async (object? _, EventArgs _) =>
		{
			await AutoInjectTickAsync();
		};
		_clientsTimer = new DispatcherTimer
		{
			Interval = TimeSpan.FromSeconds(1L)
		};
		_clientsTimer.Tick += (object? _, EventArgs _) =>
		{
			RefreshClients();
		};
		_clientsTimer.Start();
		RefreshClients();
	}

	public void RefreshClients()
	{
		IReadOnlyList<Process> readOnlyList = FindClients();
		HashSet<int> seen = new HashSet<int>();
		foreach (Process process in readOnlyList)
		{
			seen.Add(process.Id);
			ClientEntry clientEntry = Clients.FirstOrDefault((ClientEntry c) => c.Pid == process.Id);
			if (clientEntry == null)
			{
				Clients.Add(new ClientEntry(process)
				{
					IsAttached = _api.IsAttached(process.Id)
				});
			}
			else
			{
				clientEntry.Refresh();
				clientEntry.IsAttached = _api.IsAttached(clientEntry.Pid);
			}
		}
		ClientEntry[] array = Clients.Where((ClientEntry c) => !seen.Contains(c.Pid)).ToArray();
		foreach (ClientEntry item in array)
		{
			Clients.Remove(item);
		}
		OnPropertyChanged("ClientCount");
	}

	public bool IsAttachedTo(int pid)
	{
		return _api.IsAttached(pid);
	}

	public bool IsInjectAllowed(int pid)
	{
		return Clients.FirstOrDefault((ClientEntry c) => c.Pid == pid)?.InjectEnabled ?? true;
	}

	public async Task InitializeAsync()
	{
		_ = 1;
		try
		{
			await Task.Run((Action)_api.StartCommunication);
			IsReady = true;
			if (!IsInjectorPresent)
			{
				await TryRepairAsync();
			}
		}
		catch (Exception ex)
		{
			Report("Velocity API failed to start: " + ex.Message, OutputKind.Error);
		}
	}

	public async Task<bool> TryRepairAsync()
	{
		if (IsInjectorPresent)
		{
			return true;
		}
		if (_repairAttempted)
		{
			ReportStillMissing();
			return false;
		}
		_repairAttempted = true;
		Report("Injector binary is missing — re-downloading it.", OutputKind.Warning);
		int[] attachedBefore = _api.injected_pids.ToArray();
		try
		{
			await Task.Run((Action)_api.StopCommunication);
		}
		catch (Exception ex)
		{
			Report("Could not stop the helper processes: " + ex.Message, OutputKind.Error);
			return false;
		}
		try
		{
			if (File.Exists(VersionStampPath))
			{
				File.Delete(VersionStampPath);
			}
		}
		catch (Exception ex2) when ((ex2 is IOException || ex2 is UnauthorizedAccessException) ? true : false)
		{
			Report("Could not clear the version stamp: " + ex2.Message, OutputKind.Error);
			return false;
		}
		try
		{
			await Task.Run((Action)_api.StartCommunication);
		}
		catch (Exception ex3)
		{
			Report("Re-download failed: " + ex3.Message, OutputKind.Error);
			return false;
		}
		RestoreAttachments(attachedBefore);
		if (IsInjectorPresent)
		{
			Report("Injector restored.", OutputKind.Success);
			return true;
		}
		ReportStillMissing();
		return false;
	}

	private void RestoreAttachments(IReadOnlyList<int> pids)
	{
		foreach (int pid in pids)
		{
			if (_api.IsAttached(pid))
			{
				continue;
			}
			try
			{
				using Process process = Process.GetProcessById(pid);
				if (process.HasExited)
				{
					continue;
				}
			}
			catch (ArgumentException)
			{
				continue;
			}
			_api.injected_pids.Add(pid);
		}
		if (pids.Count > 0)
		{
			NotifyAttachmentChanged();
		}
	}

	private void ReportStillMissing()
	{
		Report("The injector did not come back after re-downloading. If your antivirus is quarantining it, allow \"" + BinDirectory + "\" and reopen Velocity.", OutputKind.Error);
	}

	public static IReadOnlyList<Process> FindClients()
	{
		List<Process> list = new List<Process>();
		string[] clientProcessNames = ClientProcessNames;
		foreach (string processName in clientProcessNames)
		{
			try
			{
				list.AddRange(Process.GetProcessesByName(processName));
			}
			catch (InvalidOperationException)
			{
			}
		}
		return list.Where((Process p) => !p.HasExited).OrderByDescending(StartTimeOf).ToList();
	}

	public async Task<int> AttachAsync(IEnumerable<Process> clients)
	{
		if (IsBusy)
		{
			return 0;
		}
		bool flag = !IsInjectorPresent;
		if (flag)
		{
			flag = !(await TryRepairAsync());
		}
		if (flag)
		{
			return 0;
		}
		IsBusy = true;
		try
		{
			int attached = 0;
			foreach (Process client in clients)
			{
				int pid = client.Id;
				if (!_api.IsAttached(pid))
				{
					VelocityStates velocityStates = await Task.Run(() => _api.Attach(pid).GetAwaiter().GetResult());
					if (velocityStates == VelocityStates.Attached)
					{
						attached++;
						Report($"Attached to client {pid}.", OutputKind.Success);
					}
					else
					{
						Report($"Could not attach to client {pid} ({velocityStates}).", OutputKind.Warning);
					}
				}
			}
			if (attached > 0)
			{
				NotifyAttachmentChanged();
			}
			return attached;
		}
		finally
		{
			IsBusy = false;
		}
	}

	public bool Execute(string script, bool executeOnAll)
	{
		if (string.IsNullOrWhiteSpace(script))
		{
			Report("Nothing to execute — the editor is empty.", OutputKind.Warning);
			return false;
		}
		if (!IsAttached)
		{
			Report("Not attached to a client. Use Inject first.", OutputKind.Warning);
			return false;
		}
		int[] array = (from c in Clients
			where c.ExecuteEnabled && _api.IsAttached(c.Pid)
			select c.Pid).ToArray();
		if (array.Length == 0)
		{
			Report("No clients have Execute enabled — turn it on for a client in the client manager.", OutputKind.Warning);
			return false;
		}
		int[] array2 = (executeOnAll ? array : new int[1] { array[0] });
		int[] array3 = array2;
		foreach (int pid in array3)
		{
			_api.Execute(script, pid);
		}
		if (!executeOnAll && array.Length > 1)
		{
			Report($"Executed on client {array2[0]} — \"Execute on all clients\" is off, so {array.Length - 1} other client{((array.Length == 2) ? " was" : "s were")} skipped.", OutputKind.Info);
			return true;
		}
		Report($"Executed on {array2.Length} client{((array2.Length == 1) ? "" : "s")}.", OutputKind.Info);
		return true;
	}

	public void SetAutoInject(bool enabled)
	{
		if (enabled)
		{
			_autoInjectTimer.Start();
			AutoInjectTickAsync();
		}
		else
		{
			_autoInjectTimer.Stop();
		}
	}

	public async Task<bool> TerminateClientAsync(int pid)
	{
		string text = await Task.Run(() =>
		{
			try
			{
				using Process process = Process.GetProcessById(pid);
				process.Kill(entireProcessTree: true);
				process.WaitForExit(4000);
				return (string)null;
			}
			catch (ArgumentException)
			{
				return (string)null;
			}
			catch (Exception ex2) when ((ex2 is Win32Exception || ex2 is InvalidOperationException || ex2 is NotSupportedException) ? true : false)
			{
				return ex2.Message;
			}
		});
		if (text != null)
		{
			Report($"Could not close client {pid}: {text}", OutputKind.Error);
			return false;
		}
		_waitingFor.Remove(pid);
		_api.injected_pids.Remove(pid);
		ClientEntry clientEntry = Clients.FirstOrDefault((ClientEntry c) => c.Pid == pid);
		if (clientEntry != null)
		{
			Clients.Remove(clientEntry);
		}
		OnPropertyChanged("ClientCount");
		NotifyAttachmentChanged();
		Report($"Closed client {pid}.", OutputKind.Info);
		return true;
	}

	public void PruneClosedClients()
	{
		int count = _api.injected_pids.Count;
		int[] array = _api.injected_pids.ToArray();
		foreach (int num in array)
		{
			try
			{
				using Process process = Process.GetProcessById(num);
				if (!process.HasExited)
				{
					continue;
				}
			}
			catch (ArgumentException)
			{
			}
			_api.injected_pids.Remove(num);
			_waitingFor.Remove(num);
		}
		if (_api.injected_pids.Count != count)
		{
			NotifyAttachmentChanged();
		}
	}

	private async Task AutoInjectTickAsync()
	{
		if (IsBusy)
		{
			return;
		}
		PruneClosedClients();
		List<Process> list = (from p in FindClients()
			where !_api.IsAttached(p.Id) && IsInjectAllowed(p.Id)
			select p).ToList();
		if (list.Count == 0)
		{
			return;
		}
		List<Process> list2 = new List<Process>();
		foreach (Process item in list)
		{
			if (IsClientReady(item))
			{
				list2.Add(item);
				_waitingFor.Remove(item.Id);
			}
			else if (_waitingFor.Add(item.Id))
			{
				Report($"Auto Inject: client {item.Id} is still starting up — waiting.", OutputKind.Info);
			}
		}
		if (list2.Count != 0)
		{
			Report($"Auto Inject: {list2.Count} client{((list2.Count == 1) ? "" : "s")} ready.", OutputKind.Info);
			await AttachAsync(list2);
		}
	}

	private bool IsClientReady(Process client)
	{
		try
		{
			client.Refresh();
			if (client.HasExited)
			{
				return false;
			}
			if (client.MainWindowHandle == IntPtr.Zero)
			{
				return false;
			}
			if (!client.Responding)
			{
				return false;
			}
			return DateTime.Now - StartTimeOf(client) >= TimeSpan.FromSeconds(AutoInjectDelaySeconds);
		}
		catch (Exception ex) when ((ex is InvalidOperationException || ex is Win32Exception) ? true : false)
		{
			return false;
		}
	}

	private static DateTime StartTimeOf(Process process)
	{
		try
		{
			return process.StartTime;
		}
		catch (Exception ex) when ((ex is InvalidOperationException || ex is Win32Exception) ? true : false)
		{
			return DateTime.MinValue;
		}
	}

	private void NotifyAttachmentChanged()
	{
		OnPropertyChanged("AttachedCount");
		OnPropertyChanged("IsAttached");
	}

	private void Report(string message, OutputKind kind)
	{
		Message?.Invoke(message, kind);
	}

	private void Set<T>(ref T field, T value, [CallerMemberName] string? name = null)
	{
		if (!EqualityComparer<T>.Default.Equals(field, value))
		{
			field = value;
			OnPropertyChanged(name);
		}
	}

	private void OnPropertyChanged([CallerMemberName] string? name = null)
	{
		PropertyChanged?.Invoke(this, new PropertyChangedEventArgs(name));
	}

	public void Dispose()
	{
		_autoInjectTimer.Stop();
		_clientsTimer.Stop();
		try
		{
			_api.StopCommunication();
		}
		catch (Exception)
		{
		}
	}
}
