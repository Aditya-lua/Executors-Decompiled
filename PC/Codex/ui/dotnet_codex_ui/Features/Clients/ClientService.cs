using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Collections.Specialized;
using System.IO;
using System.Linq;
using System.Threading;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Threading;
using dotnet_codex_ui.Configuration;
using dotnet_codex_ui.Core.Versioning;
using dotnet_codex_ui.Features.Connections;
using dotnet_codex_ui.Infrastructure.Logging;
using dotnet_codex_ui.Infrastructure.Processes;
using dotnet_codex_ui.Services;

namespace dotnet_codex_ui.Features.Clients;

internal static class ClientService
{
	private static readonly TimeSpan InjectTimeout;

	private static readonly Dictionary<ClientEntry, CancellationTokenSource> Injections;

	private static IConnectionProvider? ProviderField;

	private static readonly Dictionary<ClientEntry, CancellationTokenSource> Countdowns;

	internal static Func<TimeSpan, CancellationToken, Task> CountdownDelay;

	internal static Func<bool> LoaderReady;

	private static HashSet<int> Alive;

	private static CancellationTokenSource? Watching;

	public static ObservableCollection<ClientEntry> Clients { get; }

	public static Func<ClientEntry, Task>? Disconnector { get; set; }

	public static Func<ClientEntry, CancellationToken, Task<bool>>? Injector { get; set; }

	public static int ConnectedCount => Clients.Count((ClientEntry C) => C.IsConnected);

	public static int UnconnectedCount => Clients.Count((ClientEntry C) => !C.IsConnected);

	public static ConnectionProviderState ProviderState => ProviderField?.State ?? ConnectionProviderState.Disabled;

	public static string? ProviderMessage => ProviderField?.Message;

	public static int ProviderPort => ProviderField?.Port ?? 0;

	public static byte[]? ProviderEncryptionKey => (ProviderField as TetherConnectionProvider)?.EncryptionKey;

	public static event Action? ConnectedCountChanged;

	public static event Action? ProviderChanged;

	internal static void Attach(IConnectionProvider Provider)
	{
		Detach();
		ProviderField = Provider;
		Provider.StateChanged += OnProviderStateChanged;
		Provider.ClientConnected += OnClientConnected;
		Provider.ClientDisconnected += OnClientDisconnected;
		Disconnector = (ClientEntry Client) =>
		{
			Provider.Kick(Client.ConnectionId ?? Client.Id, "Disconnected from Codex");
			return Task.CompletedTask;
		};
		Run(() =>
		{
			ProviderChanged?.Invoke();
		});
	}

	internal static void Detach()
	{
		IConnectionProvider providerField = ProviderField;
		if (providerField != null)
		{
			providerField.StateChanged -= OnProviderStateChanged;
			providerField.ClientConnected -= OnClientConnected;
			providerField.ClientDisconnected -= OnClientDisconnected;
			ProviderField = null;
		}
		Disconnector = null;
		Injector = null;
		foreach (CancellationTokenSource item in Countdowns.Values.ToList())
		{
			item.Cancel();
		}
		Run(() =>
		{
			Clients.Clear();
			ProviderChanged?.Invoke();
		});
	}

	private static void OnProviderStateChanged()
	{
		Run(() =>
		{
			ProviderChanged?.Invoke();
		});
	}

	private static void OnClientConnected(ConnectedClientInfo Info)
	{
		Run(() =>
		{
			if (!Clients.Any((ClientEntry C) => C.ConnectionId == Info.Id || C.Id == Info.Id))
			{
				ClientEntry clientEntry = Clients.FirstOrDefault((ClientEntry C) => C.FromProcess && C.ProcessId == Info.ProcessId);
				if (clientEntry != null)
				{
					clientEntry.ConnectionId = Info.Id;
					Apply(clientEntry, Info);
					clientEntry.InjectionError = null;
					clientEntry.State = ConnectionState.Connected;
				}
				else
				{
					ClientEntry clientEntry2 = new ClientEntry
					{
						Id = Info.Id,
						ConnectionId = Info.Id,
						PlayerName = $"Process {Info.ProcessId}",
						State = ConnectionState.Connected
					};
					Apply(clientEntry2, Info);
					Connect(clientEntry2);
				}
			}
		});
	}

	private static void OnClientDisconnected(ClientDisconnection Gone)
	{
		Run(() =>
		{
			ClientEntry clientEntry = Clients.FirstOrDefault((ClientEntry C) => C.ConnectionId == Gone.Client.Id);
			if (clientEntry != null)
			{
				if (clientEntry.FromProcess && Alive.Contains(clientEntry.ProcessId))
				{
					clientEntry.ConnectionId = null;
					clientEntry.AutoInjectDone = Gone.Expected;
					clientEntry.State = ConnectionState.NotConnected;
				}
				else
				{
					Clients.Remove(clientEntry);
				}
				if (!Gone.Expected)
				{
					ToastService.ShowWarning("Client Disconnected", clientEntry.PlayerName + ": " + Gone.Reason + ".");
				}
			}
		});
	}

	private static void Apply(ClientEntry Entry, ConnectedClientInfo Info)
	{
		Entry.ProcessId = Info.ProcessId;
		Entry.EncryptionKind = Info.Encryption.ToString();
	}

	static ClientService()
	{
		Clients = new ObservableCollection<ClientEntry>();
		InjectTimeout = TimeSpan.FromSeconds(30L);
		Injections = new Dictionary<ClientEntry, CancellationTokenSource>();
		Countdowns = new Dictionary<ClientEntry, CancellationTokenSource>();
		CountdownDelay = (TimeSpan Span, CancellationToken Token) => Task.Delay(Span, Token);
		LoaderReady = () => VersionService.Loader.Status == LoaderStatus.Ready;
		Alive = new HashSet<int>();
		Clients.CollectionChanged += (object? _, NotifyCollectionChangedEventArgs E) =>
		{
			if (E.OldItems == null)
			{
				return;
			}
			foreach (ClientEntry oldItem in E.OldItems)
			{
				if (Injections.TryGetValue(oldItem, out CancellationTokenSource value))
				{
					value.Cancel();
				}
				if (Countdowns.TryGetValue(oldItem, out CancellationTokenSource value2))
				{
					value2.Cancel();
				}
			}
		};
	}

	internal static void NotifyStateChanged()
	{
		Run(() =>
		{
			ConnectedCountChanged?.Invoke();
		});
	}

	public static async Task InjectAsync(ClientEntry Client)
	{
		if (!Clients.Contains(Client) || !Client.CanInject)
		{
			return;
		}
		Client.InjectionError = null;
		Client.State = ConnectionState.Injecting;
		using CancellationTokenSource Cts = new CancellationTokenSource(InjectTimeout);
		Injections[Client] = Cts;
		try
		{
			if (Injector == null)
			{
				throw new NotSupportedException("Injection isn't available: games join this list by connecting themselves.");
			}
			bool flag = await Injector(Client, Cts.Token);
			if (Cts.IsCancellationRequested)
			{
				throw new OperationCanceledException(Cts.Token);
			}
			if (!flag && !Client.IsConnected)
			{
				throw new InvalidOperationException("The client did not confirm the connection.");
			}
			Client.State = ConnectionState.Connected;
			AutoSelect(Client);
		}
		catch (OperationCanceledException)
		{
			Client.State = ConnectionState.NotConnected;
			if (Clients.Contains(Client))
			{
				Client.InjectionError = "Injection timed out.";
				throw new TimeoutException(Client.InjectionError);
			}
		}
		catch (Exception ex2)
		{
			Client.State = ConnectionState.NotConnected;
			Client.InjectionError = ex2.Message;
			throw;
		}
		finally
		{
			Injections.Remove(Client);
		}
	}

	private static bool AutoInjectWanted(ClientEntry Client)
	{
		if (Injector != null && RegistryConfiguration.AutoInject && Client.FromProcess && Client.ProcessId > 0 && Client.CanInject && Clients.Contains(Client))
		{
			return LoaderReady();
		}
		return false;
	}

	private static void ConsiderAutoInject(ClientEntry Client)
	{
		if (!Client.AutoInjectDone && !Countdowns.ContainsKey(Client) && AutoInjectWanted(Client))
		{
			AutoInjectCountdownAsync(Client);
		}
	}

	private static async Task AutoInjectCountdownAsync(ClientEntry Client)
	{
		using CancellationTokenSource Cts = new CancellationTokenSource();
		Countdowns[Client] = Cts;
		int autoInjectDelaySeconds = RegistryConfiguration.AutoInjectDelaySeconds;
		AppLog.Information("Auto inject for process {Pid} in {Seconds} s", Client.ProcessId, autoInjectDelaySeconds);
		try
		{
			for (int Left = autoInjectDelaySeconds; Left > 0; Left--)
			{
				Client.AutoInjectSeconds = Left;
				await CountdownDelay(TimeSpan.FromSeconds(1L), Cts.Token);
				if (!Clients.Contains(Client))
				{
					return;
				}
				if (Client.State != ConnectionState.NotConnected || Client.IsBusy)
				{
					Client.AutoInjectDone = true;
					AppLog.Information("Auto inject for process {Pid} stopped: the client is being handled", Client.ProcessId);
					return;
				}
				if (!AutoInjectWanted(Client))
				{
					AppLog.Information("Auto inject for process {Pid} cancelled: the conditions no longer hold", Client.ProcessId);
					return;
				}
			}
			Client.AutoInjectDone = true;
			Client.AutoInjectSeconds = 0;
			await AutoInjectAsync(Client);
		}
		catch (OperationCanceledException)
		{
		}
		finally
		{
			Client.AutoInjectSeconds = 0;
			Countdowns.Remove(Client);
		}
	}

	private static void AutoSelect(ClientEntry Client)
	{
		if (RegistryConfiguration.AutoSelectInjected)
		{
			Client.IsSelected = true;
		}
	}

	public static void Connect(ClientEntry Client)
	{
		Run(() =>
		{
			if (!Clients.Any((ClientEntry C) => C.Id == Client.Id))
			{
				Clients.Add(Client);
				Client.LoadAvatarAsync();
				if (RegistryConfiguration.AutoInject)
				{
					AutoInjectAsync(Client);
				}
			}
		});
	}

	internal static async Task AutoInjectAsync(ClientEntry Client)
	{
		if (Injector == null || !Client.CanInject)
		{
			return;
		}
		ToastHandle Toast = ToastService.ShowLoading("Injecting...", "Connecting " + Client.PlayerName + " (auto inject).");
		try
		{
			await InjectAsync(Client);
			if (Client.IsConnected)
			{
				Toast.Update(ToastType.Success, "Injected", Client.PlayerName + " is connected.");
			}
			else
			{
				Toast.Dismiss();
			}
		}
		catch (Exception ex)
		{
			AppLog.Error(ex, null, "AutoInjectAsync", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Features\\Clients\\ClientService.cs");
			Toast.Update(ToastType.Error, "Injection failed", ex.Message, null, ex);
		}
	}

	public static async Task DisconnectAsync(ClientEntry Client)
	{
		if (Client.IsBusy)
		{
			return;
		}
		Client.IsBusy = true;
		try
		{
			if (Disconnector == null)
			{
				throw new NotSupportedException("The connection server isn't running.");
			}
			await Disconnector(Client);
			Run(() =>
			{
				Clients.Remove(Client);
			});
		}
		finally
		{
			Client.IsBusy = false;
		}
	}

	public static ExecuteResult Execute(string Script)
	{
		List<ClientEntry> list = Clients.Where((ClientEntry C) => C.IsSelected && C.IsConnected).ToList();
		List<string> list2 = new List<string>();
		List<(string, string)> list3 = new List<(string, string)>();
		foreach (ClientEntry item in list)
		{
			try
			{
				if (ProviderField == null)
				{
					list3.Add((item.PlayerName, "The connection server isn't running."));
				}
				else if (ProviderField.Send(item.ConnectionId ?? item.Id, Script))
				{
					list2.Add(item.PlayerName);
				}
				else
				{
					list3.Add((item.PlayerName, "The connection is gone or busy."));
				}
			}
			catch (ArgumentOutOfRangeException)
			{
				list3.Add((item.PlayerName, "The script is too large to send (over 1 MB)."));
			}
		}
		AppLog.Information("Execute: {Selected} selected clients, {Sent} sent, {Failed} failed ({Length} characters)", list.Count, list2.Count, list3.Count, Script.Length);
		return new ExecuteResult(list.Count, list2, list3);
	}

	internal static void StartWatching()
	{
		StopWatching();
		CancellationTokenSource Source = (Watching = new CancellationTokenSource());
		Task.Run(async () =>
		{
			using SemaphoreSlim Signal = new SemaphoreSlim(0, 1);
			using (CreateFileWatcher(Signal))
			{
				_ = 1;
				try
				{
					while (true)
					{
						try
						{
							Sync(RobloxProfiles.Scan());
						}
						catch (Exception failure)
						{
							AppLog.Error(failure, null, "StartWatching", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Features\\Clients\\ClientService.cs");
						}
						await Signal.WaitAsync(TimeSpan.FromSeconds(1L), Source.Token);
						await Task.Delay(50, Source.Token);
					}
				}
				catch (OperationCanceledException)
				{
				}
			}
		});
	}

	private static FileSystemWatcher? CreateFileWatcher(SemaphoreSlim Signal)
	{
		try
		{
			string path = RobloxProfiles.FolderProvider();
			if (!Directory.Exists(path))
			{
				return null;
			}
			FileSystemWatcher fileSystemWatcher = new FileSystemWatcher(path, "memProfStorage*.json");
			fileSystemWatcher.NotifyFilter = NotifyFilters.FileName | NotifyFilters.Size | NotifyFilters.LastWrite;
			FileSystemEventHandler value = (object _, FileSystemEventArgs _) =>
			{
				try
				{
					if (Signal.CurrentCount == 0)
					{
						Signal.Release();
					}
				}
				catch (Exception ex2) when ((ex2 is SemaphoreFullException || ex2 is ObjectDisposedException) ? true : false)
				{
				}
			};
			fileSystemWatcher.Changed += value;
			fileSystemWatcher.Created += value;
			fileSystemWatcher.Deleted += value;
			fileSystemWatcher.EnableRaisingEvents = true;
			return fileSystemWatcher;
		}
		catch (Exception ex)
		{
			AppLog.Warning("Profile file watching is unavailable, polling only: {Reason}", ex.Message);
			return null;
		}
	}

	internal static void StopWatching()
	{
		Watching?.Cancel();
		Watching = null;
	}

	internal static void Sync(IReadOnlyList<RobloxSession> Sessions)
	{
		Run(() =>
		{
			Alive = Sessions.Select((RobloxSession S) => S.ProcessId).ToHashSet();
			foreach (ClientEntry item in Clients.Where((ClientEntry C) => C.FromProcess && C.ConnectionId == null && !Alive.Contains(C.ProcessId)).ToList())
			{
				Clients.Remove(item);
			}
			foreach (RobloxSession Session in Sessions.Where((RobloxSession S) => !S.Unreadable))
			{
				ClientEntry clientEntry = Clients.FirstOrDefault((ClientEntry C) => C.ProcessId == Session.ProcessId);
				if (clientEntry == null)
				{
					if (Session.UserId == 0L)
					{
						continue;
					}
					clientEntry = new ClientEntry
					{
						Id = $"proc:{Session.ProcessId}",
						PlayerName = $"Process {Session.ProcessId}",
						ProcessId = Session.ProcessId,
						EncryptionKind = "None"
					};
					Clients.Add(clientEntry);
				}
				clientEntry.FromProcess = true;
				clientEntry.InGame = Session.UserId > 0 && Session.PlaceId > 0;
				if (clientEntry.PlaceId != Session.PlaceId)
				{
					clientEntry.PlaceId = Session.PlaceId;
					clientEntry.AutoInjectDone = false;
					clientEntry.GameName = ((Session.PlaceId > 0) ? $"Place {Session.PlaceId}" : null);
				}
				if (Session.UserId > 0 && clientEntry.PlayerId != Session.UserId)
				{
					clientEntry.PlayerId = Session.UserId;
					ResolveNameAsync(clientEntry, Session.UserId);
				}
				if (Session.UserId > 0 && clientEntry.AvatarUserId != Session.UserId)
				{
					clientEntry.AvatarUserId = Session.UserId;
					ResolveAvatarAsync(clientEntry, Session.UserId);
				}
				if (Session.PlaceId == 0L)
				{
					clientEntry.ResolvedPlaceId = 0L;
				}
				else if (clientEntry.ResolvedPlaceId != Session.PlaceId && clientEntry.PlaceId == Session.PlaceId)
				{
					clientEntry.ResolvedPlaceId = Session.PlaceId;
					ResolveGameAsync(clientEntry, Session.PlaceId, Session.UniverseId);
				}
				ConsiderAutoInject(clientEntry);
			}
		});
	}

	private static async Task ResolveAvatarAsync(ClientEntry Entry, long UserId)
	{
		string Url = await UserNames.GetAvatarUrlAsync(UserId);
		if (Url == null)
		{
			Run(() =>
			{
				if (Entry.AvatarUserId == UserId)
				{
					Entry.AvatarUserId = 0L;
				}
			});
			return;
		}
		Run(() =>
		{
			if (Entry.AvatarUserId == UserId)
			{
				Entry.AvatarUrl = Url;
				Entry.LoadAvatarAsync();
			}
		});
	}

	private static async Task ResolveGameAsync(ClientEntry Entry, long PlaceId, long UniverseId)
	{
		string Name = await GameNames.GetAsync(PlaceId, UniverseId);
		if (Name == null)
		{
			return;
		}
		Run(() =>
		{
			if (Entry.PlaceId == PlaceId)
			{
				Entry.GameName = Name;
			}
		});
	}

	private static async Task ResolveNameAsync(ClientEntry Entry, long UserId)
	{
		string Name = await UserNames.GetAsync(UserId);
		if (Name == null)
		{
			return;
		}
		Run(() =>
		{
			if (Entry.PlayerId == UserId)
			{
				Entry.PlayerName = Name;
			}
		});
	}

	private static void Run(Action Action)
	{
		Dispatcher dispatcher = Application.Current?.Dispatcher;
		if (dispatcher == null || dispatcher.CheckAccess())
		{
			Action();
		}
		else
		{
			dispatcher.BeginInvoke(Action);
		}
	}
}
