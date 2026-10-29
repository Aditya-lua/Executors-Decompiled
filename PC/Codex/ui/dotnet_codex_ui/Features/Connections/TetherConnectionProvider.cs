using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Sockets;
using System.Threading;
using System.Threading.Tasks;
using Tether;
using dotnet_codex_ui.Configuration;
using dotnet_codex_ui.Infrastructure.Logging;

namespace dotnet_codex_ui.Features.Connections;

internal sealed class TetherConnectionProvider : IConnectionProvider
{
	private static readonly TimeSpan StopTimeout = TimeSpan.FromSeconds(5L);

	private readonly SemaphoreSlim Gate = new SemaphoreSlim(1, 1);

	private TetherServer? ServerField;

	private ConnectionProviderState StateField;

	private string? MessageField;

	private int PortField;

	private int ReportedErrors;

	private EncryptionMode Mode;

	public ConnectionProviderState State => StateField;

	public string? Message => MessageField;

	public int Port => PortField;

	public int RejectedHandshakes { get; private set; }

	internal Action<TetherServerOptions>? ConfigureOptions { get; set; }

	internal Func<int, bool>? AcceptProcess { get; set; }

	public IReadOnlyList<ConnectedClientInfo> Clients => ServerField?.Clients.Select(Describe).ToArray() ?? Array.Empty<ConnectedClientInfo>();

	public byte[]? EncryptionKey
	{
		get
		{
			if (Mode != EncryptionMode.Shared)
			{
				return null;
			}
			return ServerField?.SharedKeyCopy;
		}
	}

	public event Action? StateChanged;

	public event Action<ConnectedClientInfo>? ClientConnected;

	public event Action<ClientDisconnection>? ClientDisconnected;

	public static void SetDiagnostics(bool Value)
	{
		if (TetherDiagnostics.Sink == null)
		{
			TetherDiagnostics.Sink = (string Line) =>
			{
				AppLog.Debug("{Line}", Line);
			};
		}
		TetherDiagnostics.Enabled = Value;
	}

	public async Task StartAsync(TetherSettings Settings)
	{
		await Gate.WaitAsync();
		try
		{
			await StopCoreAsync();
			if (!Settings.Enabled)
			{
				Set(ConnectionProviderState.Disabled, "The connection server is turned off in Settings.", 0);
				return;
			}
			string text = Settings.Validate();
			if (text != null)
			{
				Set(ConnectionProviderState.Failed, text, 0);
				return;
			}
			Set(ConnectionProviderState.Starting, null, 0);
			Mode = Settings.Encryption;
			TetherServerOptions tetherServerOptions = Settings.ToOptions();
			SetDiagnostics(RegistryConfiguration.TetherDiagnostics);
			ConfigureOptions?.Invoke(tetherServerOptions);
			TetherServer Server = new TetherServer(tetherServerOptions);
			Server.ClientConnecting += OnConnecting;
			Server.ClientConnected += OnConnected;
			Server.ClientDisconnected += OnDisconnected;
			Server.HandshakeRejected += OnRejected;
			Server.Error += OnError;
			ReportedErrors = 0;
			RejectedHandshakes = 0;
			try
			{
				int port = await Server.StartAsync();
				ServerField = Server;
				Set(ConnectionProviderState.Running, null, port);
			}
			catch (Exception ex)
			{
				Detach(Server);
				await DisposeQuietly(Server);
				AppLog.Error(ex, null, "StartAsync", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Features\\Connections\\ConnectionProvider.cs");
				Set(ConnectionProviderState.Failed, Explain(ex, Settings.Port), 0);
			}
		}
		finally
		{
			Gate.Release();
		}
	}

	public async Task StopAsync()
	{
		await Gate.WaitAsync();
		try
		{
			await StopCoreAsync();
			ConnectionProviderState stateField = StateField;
			if ((uint)(stateField - 1) <= 1u)
			{
				Set(ConnectionProviderState.Disabled, "Stopped.", 0);
			}
		}
		finally
		{
			Gate.Release();
		}
	}

	public int Broadcast(string Text)
	{
		return ServerField?.Broadcast(Text) ?? 0;
	}

	public bool Send(string Id, string Text)
	{
		if (uint.TryParse(Id, out var result))
		{
			TetherServer serverField = ServerField;
			if (serverField != null)
			{
				return serverField.Send(result, Text);
			}
		}
		return false;
	}

	public bool Kick(string Id, string? Reason = null)
	{
		if (uint.TryParse(Id, out var result))
		{
			TetherServer serverField = ServerField;
			if (serverField != null)
			{
				return serverField.Kick(result, Reason);
			}
		}
		return false;
	}

	private async Task StopCoreAsync()
	{
		TetherServer Server = ServerField;
		ServerField = null;
		if (Server != null)
		{
			try
			{
				await Server.StopAsync().WaitAsync(StopTimeout);
			}
			catch (Exception failure)
			{
				AppLog.Error(failure, null, "StopCoreAsync", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Features\\Connections\\ConnectionProvider.cs");
			}
			Detach(Server);
			await DisposeQuietly(Server);
		}
	}

	private void Detach(TetherServer Server)
	{
		Server.ClientConnecting -= OnConnecting;
		Server.ClientConnected -= OnConnected;
		Server.ClientDisconnected -= OnDisconnected;
		Server.HandshakeRejected -= OnRejected;
		Server.Error -= OnError;
	}

	private static async Task DisposeQuietly(TetherServer Server)
	{
		try
		{
			await Server.DisposeAsync().AsTask().WaitAsync(StopTimeout);
		}
		catch (Exception failure)
		{
			AppLog.Error(failure, null, "DisposeQuietly", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Features\\Connections\\ConnectionProvider.cs");
		}
	}

	private void Set(ConnectionProviderState State, string? Message, int Port)
	{
		StateField = State;
		MessageField = Message;
		PortField = Port;
		AppLog.Information("Connection server {State} (port {Port}) {Reason}", State, Port, Message ?? "");
		StateChanged?.Invoke();
	}

	private void OnConnecting(object? Sender, TetherClientConnectingEventArgs Args)
	{
		Func<int, bool> acceptProcess = AcceptProcess;
		if (acceptProcess != null && !acceptProcess(Args.Hello.ProcessID))
		{
			Args.Reject("This process is not an active Roblox client that Codex is watching.");
		}
	}

	private void OnConnected(object? Sender, TetherClient Client)
	{
		ConnectedClientInfo connectedClientInfo = Describe(Client);
		AppLog.Information("Client connected: session {Session}, process {Process}, encryption {Encryption}", connectedClientInfo.Id, connectedClientInfo.ProcessId, connectedClientInfo.Encryption);
		ClientConnected?.Invoke(connectedClientInfo);
	}

	private void OnDisconnected(object? Sender, TetherClientDisconnectedEventArgs Args)
	{
		bool flag;
		switch (Args.Reason)
		{
		case TetherDisconnectReason.ClientClosed:
		case TetherDisconnectReason.Kicked:
		case TetherDisconnectReason.Terminated:
		case TetherDisconnectReason.ProcessExited:
		case TetherDisconnectReason.Replaced:
		case TetherDisconnectReason.ServerStopping:
			flag = true;
			break;
		default:
			flag = false;
			break;
		}
		bool flag2 = flag;
		ConnectedClientInfo connectedClientInfo = Describe(Args.Client);
		AppLog.Information("Client disconnected: session {Session}, reason {Reason}, expected {Expected}", connectedClientInfo.Id, Args.Reason, flag2);
		ClientDisconnected?.Invoke(new ClientDisconnection(connectedClientInfo, ReasonText(Args.Reason), flag2));
	}

	private void OnRejected(object? Sender, TetherHandshakeRejectedEventArgs Args)
	{
		RejectedHandshakes++;
		if (RejectedHandshakes <= 20 || RejectedHandshakes % 100 == 0)
		{
			AppLog.Warning("Connection refused ({Count} so far): {Reason}", RejectedHandshakes, Args.Reason);
		}
	}

	private void OnError(object? Sender, TetherErrorEventArgs Args)
	{
		if (Interlocked.Increment(ref ReportedErrors) <= 20)
		{
			AppLog.Error(Args.Exception ?? new InvalidOperationException(Args.Message), null, "OnError", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Features\\Connections\\ConnectionProvider.cs");
		}
	}

	private ConnectedClientInfo Describe(TetherClient Client)
	{
		return new ConnectedClientInfo(Client.SessionId.ToString(), Client.ProcessId, Client.ConnectedAt, Client.IsEncrypted ? ((Mode == EncryptionMode.Shared) ? ClientEncryption.Shared : ((Mode == EncryptionMode.PerClient) ? ClientEncryption.Unique : ClientEncryption.None)) : ClientEncryption.None);
	}

	private static string ReasonText(TetherDisconnectReason Reason)
	{
		return Reason switch
		{
			TetherDisconnectReason.ClientClosed => "the game closed the connection", 
			TetherDisconnectReason.ConnectionLost => "the connection was lost", 
			TetherDisconnectReason.HeartbeatTimeout => "it stopped responding", 
			TetherDisconnectReason.Kicked => "it was disconnected", 
			TetherDisconnectReason.Terminated => "it was disconnected", 
			TetherDisconnectReason.ProcessExited => "the game closed", 
			TetherDisconnectReason.ProtocolViolation => "it sent invalid data", 
			TetherDisconnectReason.DecryptionFailed => "its data could not be decrypted", 
			TetherDisconnectReason.Replaced => "the same game connected again", 
			TetherDisconnectReason.SlowConsumer => "it could not keep up", 
			TetherDisconnectReason.ServerStopping => "the connection server stopped", 
			_ => "it disconnected", 
		};
	}

	private static string Explain(Exception Error, int Port)
	{
		for (Exception ex = Error; ex != null; ex = ex.InnerException)
		{
			if ((ex is SocketException { SocketErrorCode: var socketErrorCode } && (socketErrorCode == SocketError.AccessDenied || socketErrorCode == SocketError.AddressAlreadyInUse)) ? true : false)
			{
				return $"Port {Port} is already in use or not allowed. Close the program using it or choose another port in Settings.";
			}
		}
		if (!(Error is TetherServerException))
		{
			return "The connection server could not start: " + Error.Message;
		}
		return Error.Message;
	}
}
