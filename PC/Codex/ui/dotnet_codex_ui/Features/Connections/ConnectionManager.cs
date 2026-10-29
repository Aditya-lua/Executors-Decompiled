using System;
using System.Net;
using System.Net.Sockets;
using System.Threading;
using System.Threading.Tasks;
using Tether;
using dotnet_codex_ui.Configuration;
using dotnet_codex_ui.Features.Clients;
using dotnet_codex_ui.Infrastructure.Logging;
using dotnet_codex_ui.Infrastructure.Processes;

namespace dotnet_codex_ui.Features.Connections;

internal static class ConnectionManager
{
	private static readonly TimeSpan SettleDelay = TimeSpan.FromMilliseconds(400L);

	private static readonly TimeSpan NoticeFlushDelay = TimeSpan.FromMilliseconds(350L);

	private static readonly SemaphoreSlim Gate = new SemaphoreSlim(1, 1);

	private static TetherConnectionProvider? ProviderField;

	private static TetherSettings? AppliedField;

	private static CancellationTokenSource? Pending;

	private static bool Started;

	internal static TetherSettings? Applied => AppliedField;

	internal static Action<TetherServerOptions>? ConfigureOptions { get; set; }

	internal static bool AllowAnyProcess { get; set; } = true;

	internal static bool AllowAnyClient { get; set; } = false;

	internal static Func<int, bool> AcceptProcess { get; set; } = (int Pid) => AllowAnyProcess || AllowAnyClient || RobloxProfiles.IsActive(Pid);

	public static async Task StartAsync()
	{
		if (!Started)
		{
			Started = true;
			ProviderField = new TetherConnectionProvider
			{
				ConfigureOptions = ConfigureOptions,
				AcceptProcess = AcceptProcess
			};
			ClientService.Attach(ProviderField);
			if (ClientService.Injector == null)
			{
				ClientService.Injector = LoaderLauncher.InjectAsync;
			}
			RegistryConfiguration.Changed += OnSettingsChanged;
			await ApplyAsync(Force: true);
		}
	}

	public static Task RestartAsync()
	{
		return ApplyAsync(Force: true);
	}

	public static async Task StopAsync()
	{
		if (!Started)
		{
			return;
		}
		Started = false;
		RegistryConfiguration.Changed -= OnSettingsChanged;
		Pending?.Cancel();
		await Gate.WaitAsync();
		try
		{
			TetherConnectionProvider providerField = ProviderField;
			if (providerField != null)
			{
				await providerField.StopAsync();
			}
			ClientService.Detach();
			ProviderField = null;
			AppliedField = null;
		}
		finally
		{
			Gate.Release();
		}
	}

	private static async void OnSettingsChanged()
	{
		Pending?.Cancel();
		CancellationTokenSource cancellationTokenSource = (Pending = new CancellationTokenSource());
		try
		{
			await Task.Delay(SettleDelay, cancellationTokenSource.Token);
			await ApplyAsync(Force: false);
		}
		catch (OperationCanceledException)
		{
		}
		catch (Exception failure)
		{
			AppLog.Error(failure, null, "OnSettingsChanged", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Features\\Connections\\ConnectionManager.cs");
		}
	}

	private static async Task TellClientsAboutNewPortAsync(TetherSettings? Old, TetherSettings New)
	{
		if ((object)Old != null && Old.Enabled && New.Enabled && New.Port != Old.Port)
		{
			TetherConnectionProvider providerField = ProviderField;
			if (providerField != null && providerField.State == ConnectionProviderState.Running && providerField.Clients.Count != 0 && PortIsFree(New.Port))
			{
				providerField.Broadcast(ControlMessages.PortChanged(New.Port));
				await Task.Delay(NoticeFlushDelay);
			}
		}
	}

	private static bool PortIsFree(int Port)
	{
		try
		{
			TcpListener tcpListener = new TcpListener(IPAddress.Loopback, Port);
			tcpListener.ExclusiveAddressUse = true;
			tcpListener.Start();
			tcpListener.Stop();
			return true;
		}
		catch (SocketException)
		{
			return false;
		}
	}

	private static async Task ApplyAsync(bool Force)
	{
		await Gate.WaitAsync();
		try
		{
			if (ProviderField == null)
			{
				return;
			}
			TetherSettings Settings = TetherSettings.Load();
			if (Force || !Settings.SameAs(AppliedField))
			{
				await TellClientsAboutNewPortAsync(AppliedField, Settings);
				AppLog.Information("Applying connection settings: enabled {Enabled}, port {Port}, encryption {Encryption}, require encryption {Require}", Settings.Enabled, Settings.Port, Settings.Encryption, Settings.RequireEncryption);
				if (AllowAnyClient)
				{
					AppLog.Warning("AllowAnyClient is on: the connection server accepts any client without authentication, encryption or process checks.");
				}
				AppliedField = Settings;
				await ProviderField.StartAsync(Settings);
			}
		}
		catch (Exception failure)
		{
			AppLog.Error(failure, null, "ApplyAsync", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Features\\Connections\\ConnectionManager.cs");
		}
		finally
		{
			Gate.Release();
		}
	}
}
