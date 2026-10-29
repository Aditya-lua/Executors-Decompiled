using System;
using System.Buffers;
using System.Buffers.Binary;
using System.Collections.Concurrent;
using System.Collections.Generic;
using System.Diagnostics;
using System.Diagnostics.CodeAnalysis;
using System.IO;
using System.Linq;
using System.Net;
using System.Net.Sockets;
using System.Net.WebSockets;
using System.Runtime.CompilerServices;
using System.Security.Cryptography;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace Tether;

public sealed class TetherServer : IAsyncDisposable
{
	private sealed record HelloResult(TetherHello? Hello, SessionCipher? Cipher, byte[]? ServerMac, string? Error);

	private readonly ConcurrentDictionary<uint, TetherClient> ClientsField = new ConcurrentDictionary<uint, TetherClient>();

	private readonly ConcurrentDictionary<int, TetherClient> ByProcess = new ConcurrentDictionary<int, TetherClient>();

	private readonly object RegisterLock = new object();

	private readonly SemaphoreSlim Lifecycle = new SemaphoreSlim(1, 1);

	private TcpListener? Listener;

	private CancellationTokenSource? Cts;

	private SemaphoreSlim? PendingHandshakes;

	private Task AcceptTask = Task.CompletedTask;

	private Task HeartbeatTask = Task.CompletedTask;

	private byte[] AuthKey = Array.Empty<byte>();

	private byte[]? SharedKey;

	private byte[] InstanceSalt = Array.Empty<byte>();

	private int NextSessionId;

	private volatile bool Running;

	public byte[]? SharedKeyCopy => SharedKey?.ToArray();

	public TetherServerOptions Options { get; }

	public bool IsRunning => Running;

	public int Port { get; private set; }

	public int ClientCount => ClientsField.Count;

	public IReadOnlyList<TetherClient> Clients => ClientsField.Values.OrderBy((TetherClient C) => C.SessionId).ToArray();

	public event EventHandler<int>? Started;

	public event EventHandler? Stopped;

	public event EventHandler<TetherClientConnectingEventArgs>? ClientConnecting;

	public event EventHandler<TetherClient>? ClientConnected;

	public event EventHandler<TetherClientDisconnectedEventArgs>? ClientDisconnected;

	public event TetherMessageHandler? MessageReceived;

	public event EventHandler<TetherHandshakeRejectedEventArgs>? HandshakeRejected;

	public event EventHandler<TetherErrorEventArgs>? Error;

	public TetherServer(TetherServerOptions Options)
	{
		this.Options = Options ?? throw new ArgumentNullException("Options");
	}

	public async Task<int> StartAsync(CancellationToken CancellationToken = default(CancellationToken))
	{
		await Lifecycle.WaitAsync(CancellationToken).ConfigureAwait(continueOnCapturedContext: false);
		try
		{
			if (Running)
			{
				return Port;
			}
			Options.Validate();
			AuthKey = TetherCrypto.DeriveAuthKey(Options.PreSharedKey);
			InstanceSalt = RandomNumberGenerator.GetBytes(16);
			SharedKey = ((Options.Encryption == EncryptionMode.Shared) ? TetherCrypto.DeriveSharedKey(Options.PreSharedKey, InstanceSalt) : null);
			NextSessionId = 0;
			TcpListener Listener = new TcpListener(IPAddress.Loopback, Options.Port);
			if (OperatingSystem.IsWindows())
			{
				Listener.ExclusiveAddressUse = true;
			}
			try
			{
				Listener.Start(128);
			}
			catch (SocketException ex)
			{
				throw new TetherServerException(ex.SocketErrorCode switch
				{
					SocketError.AddressAlreadyInUse => $"Port {Options.Port} is already in use. Use Port = 0 to let the OS pick a free one.", 
					SocketError.AccessDenied => $"Access denied binding port {Options.Port} (reserved or blocked by policy).", 
					_ => $"Could not start the server: {ex.SocketErrorCode}.", 
				}, ex);
			}
			this.Listener = Listener;
			Port = ((IPEndPoint)Listener.LocalEndpoint).Port;
			Cts = new CancellationTokenSource();
			PendingHandshakes = new SemaphoreSlim(Options.MaxPendingHandshakes, Options.MaxPendingHandshakes);
			Running = true;
			CancellationToken Token = Cts.Token;
			AcceptTask = Task.Run(() => AcceptLoopAsync(Listener, Token));
			HeartbeatTask = Task.Run(() => HeartbeatLoopAsync(Token));
		}
		finally
		{
			Lifecycle.Release();
		}
		Raise(Started, Port, "Started");
		return Port;
	}

	public async Task StopAsync()
	{
		await Lifecycle.WaitAsync().ConfigureAwait(continueOnCapturedContext: false);
		try
		{
			if (!Running)
			{
				return;
			}
			Running = false;
			Cts.Cancel();
			try
			{
				Listener.Stop();
			}
			catch
			{
			}
			TetherClient[] Clients = ClientsField.Values.ToArray();
			TetherClient[] array = Clients;
			for (int i = 0; i < array.Length; i++)
			{
				array[i].Kick("Server is shutting down.", TetherDisconnectReason.ServerStopping);
			}
			Task All = Task.WhenAll(Clients.Select((TetherClient C) => C.Completion));
			await Task.WhenAny(All, Task.Delay(Options.KickTimeout + TimeSpan.FromSeconds(1L))).ConfigureAwait(continueOnCapturedContext: false);
			array = Clients;
			for (int i = 0; i < array.Length; i++)
			{
				array[i].Terminate(TetherDisconnectReason.ServerStopping, null);
			}
			InlineArray3<Task> buffer = default;
			buffer[0] = All;
			buffer[1] = AcceptTask;
			buffer[2] = HeartbeatTask;
			await Task.WhenAny(Task.WhenAll(buffer), Task.Delay(TimeSpan.FromSeconds(2L))).ConfigureAwait(continueOnCapturedContext: false);
			Listener = null;
			CryptographicOperations.ZeroMemory(AuthKey);
			if (SharedKey != null)
			{
				CryptographicOperations.ZeroMemory(SharedKey);
			}
		}
		finally
		{
			Lifecycle.Release();
		}
		Raise(Stopped, EventArgs.Empty, "Stopped");
	}

	public async ValueTask DisposeAsync()
	{
		await StopAsync().ConfigureAwait(continueOnCapturedContext: false);
	}

	public bool TryGetClient(uint SessionId, [NotNullWhen(true)] out TetherClient? Client)
	{
		return ClientsField.TryGetValue(SessionId, out Client);
	}

	public bool TryGetClientByProcessId(int ProcessId, [NotNullWhen(true)] out TetherClient? Client)
	{
		return ByProcess.TryGetValue(ProcessId, out Client);
	}

	public bool Send(uint SessionId, ReadOnlySpan<byte> Data)
	{
		if (TryGetClient(SessionId, out TetherClient Client))
		{
			return Client.Send(Data);
		}
		return false;
	}

	public bool Send(uint SessionId, string Text)
	{
		if (TryGetClient(SessionId, out TetherClient Client))
		{
			return Client.Send(Text);
		}
		return false;
	}

	public int Broadcast(ReadOnlySpan<byte> Data, Func<TetherClient, bool>? Filter = null)
	{
		int num = 0;
		foreach (KeyValuePair<uint, TetherClient> item in ClientsField)
		{
			TetherClient value = item.Value;
			if ((Filter == null || Filter(value)) && value.Send(Data))
			{
				num++;
			}
		}
		return num;
	}

	public int Broadcast(string Text, Func<TetherClient, bool>? Filter = null)
	{
		ArgumentNullException.ThrowIfNull(Text, "Text");
		byte[] array = ArrayPool<byte>.Shared.Rent(Encoding.UTF8.GetMaxByteCount(Text.Length));
		try
		{
			int bytes = Encoding.UTF8.GetBytes(Text, array);
			return Broadcast(array.AsSpan(0, bytes), Filter);
		}
		finally
		{
			ArrayPool<byte>.Shared.Return(array);
		}
	}

	public bool Kick(uint SessionId, string? Reason = null)
	{
		if (TryGetClient(SessionId, out TetherClient Client))
		{
			return Client.Kick(Reason);
		}
		return false;
	}

	public bool Terminate(uint SessionId)
	{
		if (!TryGetClient(SessionId, out TetherClient Client))
		{
			return false;
		}
		Client.Terminate();
		return true;
	}

	public int KickAll(string? Reason = null)
	{
		int num = 0;
		foreach (KeyValuePair<uint, TetherClient> item in ClientsField)
		{
			if (item.Value.Kick(Reason))
			{
				num++;
			}
		}
		return num;
	}

	public bool SetEncryption(uint SessionId, bool Enabled)
	{
		if (!TryGetClient(SessionId, out TetherClient Client))
		{
			return false;
		}
		Client.SetEncryption(Enabled);
		return true;
	}

	public void SetEncryptionForAll(bool Enabled)
	{
		foreach (KeyValuePair<uint, TetherClient> item in ClientsField)
		{
			item.Value.SetEncryption(Enabled);
		}
	}

	private async Task AcceptLoopAsync(TcpListener Listener, CancellationToken Token)
	{
		SemaphoreSlim Pending = PendingHandshakes;
		while (!Token.IsCancellationRequested)
		{
			Socket Socket;
			try
			{
				Socket = await Listener.AcceptSocketAsync(Token).ConfigureAwait(continueOnCapturedContext: false);
			}
			catch (OperationCanceledException)
			{
				break;
			}
			catch (ObjectDisposedException)
			{
				break;
			}
			catch (SocketException exception)
			{
				if (!Token.IsCancellationRequested)
				{
					ReportError("Accept failed.", exception, null);
					await Task.Delay(50, CancellationToken.None).ConfigureAwait(continueOnCapturedContext: false);
					continue;
				}
				break;
			}
			if (!Pending.Wait(0))
			{
				RejectHandshake(Socket.RemoteEndPoint as IPEndPoint, "Too many pending handshakes.", null);
				Socket.Dispose();
			}
			else
			{
				Task.Run(() => HandshakeAsync(Socket, Pending, Token));
			}
		}
	}

	private async Task HandshakeAsync(Socket Socket, SemaphoreSlim Pending, CancellationToken ServerToken)
	{
		IPEndPoint Remote = null;
		WebSocket Ws = null;
		SessionCipher Cipher = null;
		ECDiffieHellman Ecdh = null;
		byte[] ReceiveBuffer = null;
		bool HandedOff = false;
		int? OwnerPid = null;
		string ExecutablePath = null;
		uint Session = 0u;
		TetherStage Stage = TetherStage.Accept;
		Stopwatch Clock = Stopwatch.StartNew();
		using CancellationTokenSource Timeout = CancellationTokenSource.CreateLinkedTokenSource(ServerToken);
		Timeout.CancelAfter(Options.HandshakeTimeout);
		CancellationToken Ct = Timeout.Token;
		try
		{
			Socket.NoDelay = true;
			Remote = Socket.RemoteEndPoint as IPEndPoint;
			if (Remote == null || !(Socket.LocalEndPoint is IPEndPoint server) || !IPAddress.IsLoopback(Remote.Address))
			{
				RejectHandshake(Remote, "Non-loopback connection.", null);
				return;
			}
			if (Options.VerifyProcess)
			{
				if (!SocketOwner.TryGetOwnerProcessId(Remote, server, out var ProcessId))
				{
					RejectHandshake(Remote, "Could not resolve the process that owns the connection.", null);
					return;
				}
				OwnerPid = ProcessId;
				ExecutablePath = SocketOwner.TryGetExecutablePath(ProcessId);
				if (!IsExecutableAllowed(ExecutablePath))
				{
					RejectHandshake(Remote, $"Process {ProcessId} ({ExecutablePath ?? "unknown"}) is not allowed.", ProcessId);
					return;
				}
			}
			if (TetherDiagnostics.Enabled)
			{
				TetherDiagnostics.Server(0u, TetherStage.Accept, TetherError.None, Clock, $"remote={Remote} ownerPid={OwnerPid?.ToString() ?? "unverified"}");
			}
			Stage = TetherStage.Upgrade;
			NetworkStream Stream = new NetworkStream(Socket, ownsSocket: true);
			WebSocketUpgrade.Result result = await WebSocketUpgrade.AcceptAsync(Stream, Options, Ct).ConfigureAwait(continueOnCapturedContext: false);
			if (!result.Success)
			{
				if (TetherDiagnostics.Enabled)
				{
					TetherDiagnostics.Server(0u, TetherStage.Upgrade, TetherError.InvalidMessageFormat, Clock, "reason=" + result.Error);
				}
				RejectHandshake(Remote, result.Error ?? "Upgrade failed.", OwnerPid);
				return;
			}
			Ws = WebSocket.CreateFromStream(Stream, new WebSocketCreationOptions
			{
				IsServer = true,
				SubProtocol = result.SubProtocol,
				KeepAliveInterval = TimeSpan.Zero
			});
			uint SessionId = (uint)(Interlocked.Increment(ref NextSessionId) & 0x7FFFFFFF);
			Session = SessionId;
			if (TetherDiagnostics.Enabled)
			{
				TetherDiagnostics.Server(Session, TetherStage.Upgrade, TetherError.None, Clock, "subProtocol=" + (result.SubProtocol ?? "none"));
			}
			if (Options.Encryption == EncryptionMode.PerClient)
			{
				Ecdh = TetherCrypto.CreateEphemeral();
			}
			Stage = TetherStage.ChallengeSent;
			byte[] Challenge = BuildChallenge(SessionId, Ecdh);
			await Ws.SendAsync(Challenge.AsMemory(), WebSocketMessageType.Binary, endOfMessage: true, Ct).ConfigureAwait(continueOnCapturedContext: false);
			if (TetherDiagnostics.Enabled)
			{
				TetherDiagnostics.Server(Session, TetherStage.ChallengeSent, TetherError.None, Clock, $"version={1} mode={Options.Encryption} requireEncryption={Options.RequireEncryption} length={Challenge.Length} challengeSha256={TetherDiagnostics.Fingerprint(Challenge)}");
			}
			Stage = TetherStage.HelloReceived;
			if (TetherDiagnostics.Enabled)
			{
				bool flag = Options.Encryption != EncryptionMode.Disabled;
				int num = ((Ecdh != null) ? 65 : 0);
				int num2 = 34 + num + 32;
				TetherDiagnostics.ServerExpected(Session, TetherStage.HelloReceived, Clock, $"op=0x{2:X2} flags=0x00 version={1} mode={Options.Encryption} totalMin={num2 + 2 + (flag ? 16 : 0)} totalMax={num2 + 1024 + (flag ? 16 : 0)} encoding=single-binary-websocket-message fields=ProcessID:integer(1..{int.MaxValue}) jsonEncoding=utf-8 jsonMax={1024} mac=HMAC-SHA256:{32} enforced={Options.RequireAuthentication} cipher={(flag ? "AES-256-GCM" : "none")} nonce={(flag ? 12 : 0)} tag={(flag ? 16 : 0)} aad={(flag ? 2 : 0)} rules=length,op,decrypt,hmac,json,processId challengeSha256={TetherDiagnostics.Fingerprint(Challenge)}");
			}
			ReceiveBuffer = ArrayPool<byte>.Shared.Rent(1171);
			int num3 = await WsUtil.ReceiveSingleAsync(Ws, ReceiveBuffer, 1171, Ct).ConfigureAwait(continueOnCapturedContext: false);
			if (num3 < 0)
			{
				if (TetherDiagnostics.Enabled)
				{
					TetherDiagnostics.Server(Session, TetherStage.HelloReceived, TetherError.InvalidMessageFormat, Clock, $"reason=not a single binary frame within {1171} bytes");
				}
				RejectHandshake(Remote, "Expected a single binary hello frame.", OwnerPid);
				return;
			}
			if (TetherDiagnostics.Enabled)
			{
				TetherDiagnostics.Server(Session, TetherStage.HelloReceived, TetherError.None, Clock, $"length={num3} helloSha256={TetherDiagnostics.Fingerprint(ReceiveBuffer.AsSpan(0, num3))} challengeSha256={TetherDiagnostics.Fingerprint(Challenge)} clientSent={Convert.ToHexString(ReceiveBuffer.AsSpan(0, num3))} challengeSent={Convert.ToHexString(Challenge)}");
			}
			HelloResult helloResult = VerifyHello(ReceiveBuffer, num3, Challenge, SessionId, Ecdh, Clock);
			if (helloResult.Error != null)
			{
				RejectHandshake(Remote, helloResult.Error, OwnerPid);
				await SendRejectionAsync(Ws, helloResult.Error).ConfigureAwait(continueOnCapturedContext: false);
				return;
			}
			Cipher = helloResult.Cipher;
			if (OwnerPid.HasValue)
			{
				int valueOrDefault = OwnerPid.GetValueOrDefault();
				if (helloResult.Hello.ProcessID != valueOrDefault)
				{
					RejectHandshake(Remote, $"Hello claims ProcessID {helloResult.Hello.ProcessID} but the socket belongs to {valueOrDefault}.", OwnerPid);
					return;
				}
			}
			TetherClientConnectingEventArgs Connecting = new TetherClientConnectingEventArgs(helloResult.Hello, Remote, OwnerPid, ExecutablePath, Cipher != null, Cipher != null && (Options.RequireEncryption || Options.EncryptByDefault));
			Raise(ClientConnecting, Connecting, "ClientConnecting");
			if (Connecting.Rejected)
			{
				await SendRejectionAsync(Ws, Connecting.RejectReason ?? "Rejected.").ConfigureAwait(continueOnCapturedContext: false);
				RejectHandshake(Remote, "Rejected by application: " + (Connecting.RejectReason ?? "no reason"), OwnerPid);
				return;
			}
			bool Encrypt = Cipher != null && (Options.RequireEncryption || Connecting.UseEncryption);
			TetherClient Client = new TetherClient(this, Ws, Cipher, SessionId, helloResult.Hello, ExecutablePath, OwnerPid.HasValue, Encrypt);
			string RegisterError = Register(Client, out TetherClient Replaced);
			if (RegisterError != null)
			{
				await SendRejectionAsync(Ws, RegisterError).ConfigureAwait(continueOnCapturedContext: false);
				RejectHandshake(Remote, RegisterError, OwnerPid);
				return;
			}
			Replaced?.Terminate(TetherDisconnectReason.Replaced, $"Replaced by session #{SessionId}.");
			Stage = TetherStage.WelcomeSent;
			byte[] WelcomeFrame = BuildWelcome(helloResult.ServerMac, Encrypt);
			if (TetherDiagnostics.Enabled)
			{
				TetherDiagnostics.ServerExpected(Session, TetherStage.WelcomeSent, Clock, $"op=0x{3:X2} length={39} serverMac=HMAC-SHA256:{32} encryptedFlag={(Encrypt ? 1 : 0)} maxMessageSize={Options.MaxMessageSize} clientShouldVerify=serverMac,length,op");
			}
			try
			{
				await Ws.SendAsync(WelcomeFrame.AsMemory(), WebSocketMessageType.Binary, endOfMessage: true, Ct).ConfigureAwait(continueOnCapturedContext: false);
			}
			catch
			{
				Unregister(Client);
				throw;
			}
			if (TetherDiagnostics.Enabled)
			{
				TetherDiagnostics.Server(Session, TetherStage.WelcomeSent, TetherError.None, Clock, $"pid={Client.ProcessId} encrypted={Encrypt} length={WelcomeFrame.Length} welcomeSha256={TetherDiagnostics.Fingerprint(WelcomeFrame)} handedToTransport=True");
			}
			HandedOff = true;
			Raise(ClientConnected, Client, "ClientConnected");
			Client.Start();
		}
		catch (OperationCanceledException)
		{
			bool isCancellationRequested = ServerToken.IsCancellationRequested;
			if (TetherDiagnostics.Enabled)
			{
				TetherDiagnostics.Server(Session, Stage, isCancellationRequested ? TetherError.UnexpectedProtocolState : TetherError.RequestTimedOut, Clock, isCancellationRequested ? "reason=server stopping" : $"reason=handshake timeout after {Options.HandshakeTimeout.TotalMilliseconds:0} ms, last stage {Stage}");
			}
			RejectHandshake(Remote, isCancellationRequested ? "Server stopping." : $"Handshake timed out at stage {Stage}.", OwnerPid);
		}
		catch (Exception ex2)
		{
			if (TetherDiagnostics.Enabled)
			{
				uint session = Session;
				TetherStage stage = Stage;
				bool flag2 = ((ex2 is WebSocketException || ex2 is IOException || ex2 is SocketException) ? true : false);
				TetherDiagnostics.Server(session, stage, flag2 ? TetherError.TransportFailed : TetherError.InternalProcessingError, Clock, $"exception={ex2.GetType().Name} message={ex2.Message}\n{ex2.StackTrace}");
			}
			RejectHandshake(Remote, "Handshake failed: " + ex2.Message, OwnerPid);
		}
		finally
		{
			if (ReceiveBuffer != null)
			{
				ArrayPool<byte>.Shared.Return(ReceiveBuffer);
			}
			Ecdh?.Dispose();
			if (!HandedOff)
			{
				Cipher?.Dispose();
				try
				{
					Ws?.Abort();
					Ws?.Dispose();
				}
				catch
				{
				}
				try
				{
					Socket.Dispose();
				}
				catch
				{
				}
			}
			Pending.Release();
		}
	}

	private byte[] BuildChallenge(uint SessionId, ECDiffieHellman? Ecdh)
	{
		byte[] array = new byte[66 + ((Ecdh != null) ? 65 : 0)];
		Span<byte> span = array.AsSpan();
		span[0] = 1;
		span[1] = 0;
		span[2] = 1;
		span[3] = (byte)Options.Encryption;
		span[4] = (Options.RequireEncryption ? ((byte)1) : ((byte)0));
		span[5] = 0;
		BinaryPrimitives.WriteUInt32LittleEndian(span.Slice(6), SessionId);
		BinaryPrimitives.WriteUInt32LittleEndian(span.Slice(10), (uint)Options.HeartbeatInterval.TotalMilliseconds);
		BinaryPrimitives.WriteUInt32LittleEndian(span.Slice(14), (uint)Options.HeartbeatTimeout.TotalMilliseconds);
		RandomNumberGenerator.Fill(span.Slice(18, 32));
		InstanceSalt.CopyTo(span.Slice(50, 16));
		if (Ecdh != null)
		{
			TetherCrypto.ExportPublicKey(Ecdh, span.Slice(66, 65));
		}
		return array;
	}

	private HelloResult VerifyHello(byte[] Buffer, int Length, byte[] Challenge, uint SessionId, ECDiffieHellman? Ecdh, Stopwatch Clock)
	{
		Span<byte> span = Buffer.AsSpan(0, Length);
		bool flag = Options.Encryption != EncryptionMode.Disabled;
		int num = ((Ecdh != null) ? 65 : 0);
		int num2 = 34 + num + 32;
		int num3 = num2 + 2 + (flag ? 16 : 0);
		if (span.Length < num3)
		{
			return Fail(SessionId, Clock, TetherStage.HelloReceived, TetherError.InvalidMessageFormat, "Hello too short.", $"length={span.Length} minimum={num3} mode={Options.Encryption}");
		}
		if (span[0] != 2 || span[1] != 0)
		{
			return Fail(SessionId, Clock, TetherStage.HelloReceived, TetherError.UnexpectedProtocolState, "First client frame must be a hello.", $"op=0x{span[0]:X2} flags=0x{span[1]:X2} expectedOp=0x{2:X2} expectedFlags=0x00");
		}
		Span<byte> span2 = span.Slice(2, 32);
		Span<byte> span3 = span.Slice(34, num);
		Span<byte> span4 = span.Slice(num2 - 32, 32);
		Span<byte> span5 = span.Slice(num2);
		SessionCipher sessionCipher = null;
		if (TetherDiagnostics.Enabled)
		{
			TetherDiagnostics.Server(SessionId, TetherStage.HelloReceived, TetherError.None, Clock, $"clientSent: op=0x{span[0]:X2} flags=0x{span[1]:X2} clientNonce={span2.Length} clientPublic={span3.Length} mac={span4.Length} body={span5.Length} total={span.Length} | serverExpects: op=0x{2:X2} flags=0x00 clientNonce={32} clientPublic={num} mac={32} bodyMin={2 + (flag ? 16 : 0)} bodyMax={1024 + (flag ? 16 : 0)} totalMin={num3} mode={Options.Encryption} aad={(flag ? 2 : 0)} tag={(flag ? 16 : 0)}");
		}
		try
		{
			if (flag)
			{
				uint sendPrefix = TetherCrypto.ServerPrefix(SessionId);
				uint receivePrefix = TetherCrypto.ClientPrefix(SessionId);
				if (Ecdh != null)
				{
					byte[] array;
					try
					{
						array = TetherCrypto.DeriveSecret(Ecdh, span3);
					}
					catch (CryptographicException ex)
					{
						return Fail(SessionId, Clock, TetherStage.HelloDecrypt, TetherError.InvalidMessageFormat, "Invalid client public key.", $"publicKeyLength={span3.Length} leadingByte=0x{((span3.Length > 0) ? span3[0] : 0):X2} exception={ex.GetType().Name}");
					}
					Span<byte> span6 = stackalloc byte[64];
					TetherCrypto.DeriveSessionKeys(array, Options.PreSharedKey, Challenge.AsSpan(18, 32), span2, span6);
					CryptographicOperations.ZeroMemory(array);
					sessionCipher = new SessionCipher(span6.Slice(32, 32), span6.Slice(0, 32), sendPrefix, receivePrefix);
					CryptographicOperations.ZeroMemory(span6);
				}
				else
				{
					sessionCipher = new SessionCipher(SharedKey, SharedKey, sendPrefix, receivePrefix);
				}
				int num4 = span5.Length - 16;
				if (num4 < 2)
				{
					sessionCipher.Dispose();
					return Fail(SessionId, Clock, TetherStage.HelloDecrypt, TetherError.InvalidAuthenticationTagLength, "Hello too short.", $"bodyLength={span5.Length} tagLength={16}");
				}
				if (!sessionCipher.TryDecrypt(0uL, span.Slice(0, 2), span5.Slice(0, num4), span5.Slice(num4)))
				{
					sessionCipher.Dispose();
					return Fail(SessionId, Clock, TetherStage.HelloDecrypt, TetherError.AesGcmAuthenticationFailed, "AES-GCM hello decryption failed.", $"mode={Options.Encryption} ciphertextLength={num4} tagLength={16} aadLength={2} counter=0 nonceLength={12} clientNonceSha256={TetherDiagnostics.Fingerprint(span2)}");
				}
				span5 = span5.Slice(0, num4);
				if (TetherDiagnostics.Enabled)
				{
					TetherDiagnostics.Server(SessionId, TetherStage.HelloDecrypt, TetherError.None, Clock, $"mode={Options.Encryption} plaintextLength={span5.Length} tagLength={16}");
				}
			}
			Span<byte> span7 = stackalloc byte[32];
			TetherCrypto.ComputeMac(AuthKey, 67, Challenge, span2, span3, span5, span7);
			bool flag2 = CryptographicOperations.FixedTimeEquals(span7, span4);
			if (TetherDiagnostics.Enabled)
			{
				TetherDiagnostics.Server(SessionId, TetherStage.HelloMac, (!flag2 && Options.RequireAuthentication) ? TetherError.HmacVerificationFailed : TetherError.None, Clock, $"matches={flag2} enforced={Options.RequireAuthentication} receivedMacLength={span4.Length} expectedMacLength={span7.Length} receivedMac={Convert.ToHexString(span4)} expectedMac={Convert.ToHexString(span7)} helloJsonHex={Convert.ToHexString(span5)} challenge={Challenge.Length}:{TetherDiagnostics.Fingerprint(Challenge)} clientNonce={span2.Length}:{TetherDiagnostics.Fingerprint(span2)} clientPublic={span3.Length}:{TetherDiagnostics.Fingerprint(span3)} helloJson={span5.Length}:{TetherDiagnostics.Fingerprint(span5)}");
			}
			if (Options.RequireAuthentication && !flag2)
			{
				sessionCipher?.Dispose();
				return new HelloResult(null, null, null, "Hello HMAC verification failed.");
			}
			if (!TetherHello.TryParse(span5, out TetherHello Hello))
			{
				sessionCipher?.Dispose();
				return Fail(SessionId, Clock, TetherStage.HelloParse, TetherError.PayloadDecodingFailed, "Invalid hello payload.", $"jsonLength={span5.Length} maxJsonLength={1024}");
			}
			if (TetherDiagnostics.Enabled)
			{
				TetherDiagnostics.Server(SessionId, TetherStage.HelloParse, TetherError.None, Clock, $"pid={Hello.ProcessID}");
			}
			byte[] array2 = new byte[32];
			TetherCrypto.ComputeMac(AuthKey, 83, Challenge, span2, span3, span5, array2);
			return new HelloResult(Hello, sessionCipher, array2, null);
		}
		catch
		{
			sessionCipher?.Dispose();
			throw;
		}
		static HelloResult Fail(uint Session, Stopwatch clock, TetherStage Stage, TetherError Category, string Error, string Detail)
		{
			if (TetherDiagnostics.Enabled)
			{
				TetherDiagnostics.Server(Session, Stage, Category, clock, Detail);
			}
			return new HelloResult(null, null, null, Error);
		}
	}

	private byte[] BuildWelcome(byte[] ServerMac, bool Encrypt)
	{
		byte[] array = new byte[39];
		array[0] = 3;
		array[1] = 0;
		ServerMac.CopyTo(array, 2);
		array[34] = (Encrypt ? ((byte)1) : ((byte)0));
		BinaryPrimitives.WriteUInt32LittleEndian(array.AsSpan(35), (uint)Options.MaxMessageSize);
		return array;
	}

	private static async Task SendRejectionAsync(WebSocket Ws, string Reason)
	{
		_ = 1;
		try
		{
			byte[] bytes = Encoding.UTF8.GetBytes((Reason.Length > 256) ? Reason.Substring(0, 256) : Reason);
			byte[] array = new byte[2 + bytes.Length];
			array[0] = 64;
			bytes.CopyTo(array, 2);
			using CancellationTokenSource Timeout = new CancellationTokenSource(TimeSpan.FromMilliseconds(250L));
			await Ws.SendAsync(array.AsMemory(), WebSocketMessageType.Binary, endOfMessage: true, Timeout.Token).ConfigureAwait(continueOnCapturedContext: false);
			await Ws.CloseOutputAsync(WebSocketCloseStatus.PolicyViolation, "rejected", Timeout.Token).ConfigureAwait(continueOnCapturedContext: false);
		}
		catch
		{
		}
	}

	private string? Register(TetherClient Client, out TetherClient? Replaced)
	{
		Replaced = null;
		lock (RegisterLock)
		{
			if (ByProcess.TryGetValue(Client.ProcessId, out TetherClient value))
			{
				if (Options.DuplicateProcessPolicy == DuplicateProcessPolicy.RejectNew)
				{
					return $"Process {Client.ProcessId} already has a connection.";
				}
				Replaced = value;
				ByProcess.TryRemove(new KeyValuePair<int, TetherClient>(value.ProcessId, value));
				ClientsField.TryRemove(new KeyValuePair<uint, TetherClient>(value.SessionId, value));
			}
			if (ClientsField.Count >= Options.MaxClients)
			{
				if (Replaced != null)
				{
					ClientsField[Replaced.SessionId] = Replaced;
					ByProcess[Replaced.ProcessId] = Replaced;
					Replaced = null;
				}
				return "Server is full.";
			}
			ClientsField[Client.SessionId] = Client;
			ByProcess[Client.ProcessId] = Client;
			return null;
		}
	}

	private void Unregister(TetherClient Client)
	{
		ClientsField.TryRemove(new KeyValuePair<uint, TetherClient>(Client.SessionId, Client));
		ByProcess.TryRemove(new KeyValuePair<int, TetherClient>(Client.ProcessId, Client));
	}

	private bool IsExecutableAllowed(string? Path)
	{
		HashSet<string> allowedExecutables = Options.AllowedExecutables;
		if (allowedExecutables.Count == 0)
		{
			return true;
		}
		if (Path != null)
		{
			if (!allowedExecutables.Contains(Path))
			{
				return allowedExecutables.Contains(System.IO.Path.GetFileName(Path));
			}
			return true;
		}
		return false;
	}

	private async Task HeartbeatLoopAsync(CancellationToken Token)
	{
		long Interval = ToStopwatchTicks(Options.HeartbeatInterval);
		long Timeout = ToStopwatchTicks(Options.HeartbeatTimeout);
		TimeSpan period = TimeSpan.FromMilliseconds(Math.Clamp(Options.HeartbeatInterval.TotalMilliseconds / 4.0, 10.0, 250.0));
		using PeriodicTimer Timer = new PeriodicTimer(period);
		try
		{
			while (await Timer.WaitForNextTickAsync(Token).ConfigureAwait(continueOnCapturedContext: false))
			{
				long timestamp = Stopwatch.GetTimestamp();
				foreach (KeyValuePair<uint, TetherClient> item in ClientsField)
				{
					item.Value.OnHeartbeatTick(timestamp, Interval, Timeout);
				}
			}
		}
		catch (OperationCanceledException)
		{
		}
	}

	private static long ToStopwatchTicks(TimeSpan Span)
	{
		return (long)(Span.TotalSeconds * (double)Stopwatch.Frequency);
	}

	internal void OnClientClosed(TetherClient Client)
	{
		Unregister(Client);
		Raise(ClientDisconnected, new TetherClientDisconnectedEventArgs(Client, Client.DisconnectReason, Client.DisconnectDetail), "ClientDisconnected");
	}

	internal void DispatchMessage(TetherClient Client, ReadOnlyMemory<byte> Data)
	{
		TetherMessageHandler tetherMessageHandler = MessageReceived;
		if (tetherMessageHandler == null)
		{
			return;
		}
		try
		{
			tetherMessageHandler(Client, Data);
		}
		catch (Exception exception)
		{
			ReportError("MessageReceived handler threw.", exception, Client);
		}
	}

	internal void ReportError(string Message, Exception? Exception, TetherClient? Client)
	{
		try
		{
			Error?.Invoke(this, new TetherErrorEventArgs(Message, Exception, Client));
		}
		catch
		{
		}
	}

	private void RejectHandshake(IPEndPoint? Remote, string Reason, int? ProcessId)
	{
		Raise(HandshakeRejected, new TetherHandshakeRejectedEventArgs(Remote, Reason, ProcessId), "HandshakeRejected");
	}

	private void Raise<T>(EventHandler<T>? Handler, T Args, string Name)
	{
		if (Handler == null)
		{
			return;
		}
		try
		{
			Handler(this, Args);
		}
		catch (Exception exception)
		{
			ReportError(Name + " handler threw.", exception, Args as TetherClient);
		}
	}

	private void Raise(EventHandler? Handler, EventArgs Args, string Name)
	{
		if (Handler == null)
		{
			return;
		}
		try
		{
			Handler(this, Args);
		}
		catch (Exception exception)
		{
			ReportError(Name + " handler threw.", exception, null);
		}
	}
}
