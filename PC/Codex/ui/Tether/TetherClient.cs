using System;
using System.Buffers;
using System.Buffers.Binary;
using System.Diagnostics;
using System.IO;
using System.Net.WebSockets;
using System.Text;
using System.Threading;
using System.Threading.Channels;
using System.Threading.Tasks;

namespace Tether;

public sealed class TetherClient
{
	private readonly TetherServer Server;

	private readonly TetherServerOptions Options;

	private readonly WebSocket Socket;

	private readonly SessionCipher? Cipher;

	private readonly Channel<Outgoing> QueueField;

	private readonly CancellationTokenSource Cts = new CancellationTokenSource();

	private readonly TaskCompletionSource CompletionField = new TaskCompletionSource(TaskCreationOptions.RunContinuationsAsynchronously);

	private readonly object EncryptionLock = new object();

	private Process? ProcessField;

	private Task SendTask = Task.CompletedTask;

	private string? ReasonDetail;

	private int Reason;

	private int Started;

	private int CleanedUp;

	private volatile bool EncryptDesired;

	private bool EncryptOutbound;

	private ulong SendCounter;

	private ulong ReceiveCounter;

	private long LastSeen;

	private long LastPingSent;

	private long RoundTripTicks = -1L;

	private long BytesIn;

	private long BytesOut;

	private long MessagesIn;

	private long MessagesOut;

	public uint SessionId { get; }

	public int ProcessId { get; }

	public TetherHello Info { get; }

	public string? ExecutablePath { get; }

	public bool IsProcessVerified { get; }

	public DateTimeOffset ConnectedAt { get; }

	public bool IsConnected => Volatile.Read(in Reason) == 0;

	public bool IsEncryptionAvailable => Cipher != null;

	public bool IsEncrypted => EncryptDesired;

	public TimeSpan? RoundTripTime
	{
		get
		{
			long num = Interlocked.Read(in RoundTripTicks);
			if (num >= 0)
			{
				return TimeSpan.FromSeconds((double)num / (double)Stopwatch.Frequency);
			}
			return null;
		}
	}

	public TimeSpan TimeSinceLastSeen => Stopwatch.GetElapsedTime(Interlocked.Read(in LastSeen));

	public long BytesReceived => Interlocked.Read(in BytesIn);

	public long BytesSent => Interlocked.Read(in BytesOut);

	public long MessagesReceived => Interlocked.Read(in MessagesIn);

	public long MessagesSent => Interlocked.Read(in MessagesOut);

	public int QueuedMessages => QueueField.Reader.Count;

	public TetherDisconnectReason DisconnectReason => (TetherDisconnectReason)Volatile.Read(in Reason);

	public string? DisconnectDetail => ReasonDetail;

	public Task Completion => CompletionField.Task;

	public object? Tag { get; set; }

	internal TetherClient(TetherServer Server, WebSocket Socket, SessionCipher? Cipher, uint SessionId, TetherHello Hello, string? ExecutablePath, bool ProcessVerified, bool Encrypt)
	{
		this.Server = Server;
		Options = Server.Options;
		this.Socket = Socket;
		this.Cipher = Cipher;
		Info = Hello;
		EncryptDesired = (EncryptOutbound = Encrypt && Cipher != null);
		this.SessionId = SessionId;
		ProcessId = Hello.ProcessID;
		this.ExecutablePath = ExecutablePath;
		IsProcessVerified = ProcessVerified;
		ConnectedAt = DateTimeOffset.Now;
		LastSeen = (LastPingSent = Stopwatch.GetTimestamp());
		QueueField = Channel.CreateBounded<Outgoing>(new BoundedChannelOptions(Options.SendQueueCapacity)
		{
			SingleReader = true,
			SingleWriter = false,
			FullMode = BoundedChannelFullMode.Wait,
			AllowSynchronousContinuations = false
		});
	}

	public override string ToString()
	{
		return $"#{SessionId} {Info}";
	}

	public bool Send(ReadOnlySpan<byte> Data)
	{
		return Enqueue(Op.Data, Data, OutKind.Normal);
	}

	public bool Send(string Text)
	{
		ArgumentNullException.ThrowIfNull(Text, "Text");
		if (!IsConnected)
		{
			return false;
		}
		byte[] array = ArrayPool<byte>.Shared.Rent(Frame.RentSize(Encoding.UTF8.GetMaxByteCount(Text.Length)));
		int bytes = Encoding.UTF8.GetBytes(Text, array.AsSpan(10));
		if (bytes > Options.MaxMessageSize)
		{
			ArrayPool<byte>.Shared.Return(array);
			throw new ArgumentOutOfRangeException("Text", "Message exceeds MaxMessageSize.");
		}
		return TryQueue(new Outgoing(array, bytes, Op.Data, OutKind.Normal));
	}

	public async ValueTask<bool> SendAsync(ReadOnlyMemory<byte> Data, CancellationToken CancellationToken = default(CancellationToken))
	{
		if (!IsConnected)
		{
			return false;
		}
		if (Data.Length > Options.MaxMessageSize)
		{
			throw new ArgumentOutOfRangeException("Data", "Message exceeds MaxMessageSize.");
		}
		byte[] Buffer = ArrayPool<byte>.Shared.Rent(Frame.RentSize(Data.Length));
		Data.Span.CopyTo(Buffer.AsSpan(10));
		try
		{
			await QueueField.Writer.WriteAsync(new Outgoing(Buffer, Data.Length, Op.Data, OutKind.Normal), CancellationToken).ConfigureAwait(continueOnCapturedContext: false);
			return true;
		}
		catch (ChannelClosedException)
		{
			ArrayPool<byte>.Shared.Return(Buffer);
			return false;
		}
		catch (OperationCanceledException)
		{
			ArrayPool<byte>.Shared.Return(Buffer);
			throw;
		}
	}

	public void SetEncryption(bool Enabled)
	{
		if (Cipher == null)
		{
			if (Enabled)
			{
				throw new InvalidOperationException("Encryption is disabled on this server (EncryptionMode.Disabled).");
			}
			return;
		}
		if (!Enabled && Options.RequireEncryption)
		{
			throw new InvalidOperationException("Encryption cannot be turned off while RequireEncryption is enabled.");
		}
		lock (EncryptionLock)
		{
			if (EncryptDesired != Enabled && IsConnected)
			{
				EncryptDesired = Enabled;
				Span<byte> span = stackalloc byte[1];
				span[0] = (Enabled ? ((byte)1) : ((byte)0));
				Enqueue(Op.SetEncryption, span, Enabled ? OutKind.EncryptOn : OutKind.EncryptOff);
			}
		}
	}

	public bool Kick(string? Reason = null)
	{
		return Kick(Reason, TetherDisconnectReason.Kicked);
	}

	public void Terminate()
	{
		Terminate(TetherDisconnectReason.Terminated, null);
	}

	internal bool Kick(string? Message, TetherDisconnectReason Reason)
	{
		if (!TrySetReason(Reason, Message))
		{
			return false;
		}
		if (Message == null)
		{
			Message = string.Empty;
		}
		if (Message.Length > 256)
		{
			Message = Message.Substring(0, 256);
		}
		byte[] array = ArrayPool<byte>.Shared.Rent(Frame.RentSize(Encoding.UTF8.GetMaxByteCount(Message.Length)));
		int bytes = Encoding.UTF8.GetBytes(Message, array.AsSpan(10));
		if (!QueueField.Writer.TryWrite(new Outgoing(array, bytes, Op.Kick, OutKind.Kick)))
		{
			ArrayPool<byte>.Shared.Return(array);
			Terminate(Reason, Message);
			return true;
		}
		Task.Delay(Options.KickTimeout).ContinueWith((Task _, object? State) =>
		{
			((TetherClient)State).Terminate(TetherDisconnectReason.Kicked, null);
		}, this, CancellationToken.None, TaskContinuationOptions.ExecuteSynchronously, TaskScheduler.Default);
		return true;
	}

	internal void Terminate(TetherDisconnectReason Reason, string? Detail)
	{
		TrySetReason(Reason, Detail);
		try
		{
			Cts.Cancel();
		}
		catch (ObjectDisposedException)
		{
		}
		try
		{
			Socket.Abort();
		}
		catch
		{
		}
		QueueField.Writer.TryComplete();
	}

	private bool TrySetReason(TetherDisconnectReason Reason, string? Detail)
	{
		if (Interlocked.CompareExchange(ref this.Reason, (int)Reason, 0) != 0)
		{
			return false;
		}
		ReasonDetail = Detail;
		return true;
	}

	internal void Start()
	{
		Interlocked.Exchange(ref LastSeen, Stopwatch.GetTimestamp());
		Volatile.Write(ref Started, 1);
		SendTask = Task.Run((Func<Task?>)SendLoopAsync);
		Task.Run((Func<Task?>)ReceiveLoopAsync);
		if (Options.MonitorProcessExit)
		{
			WatchProcess();
		}
	}

	internal void OnHeartbeatTick(long Now, long IntervalTicks, long TimeoutTicks)
	{
		if (Volatile.Read(in Started) != 0 && Volatile.Read(in Reason) == 0)
		{
			long num = Now - Interlocked.Read(in LastSeen);
			if (num > TimeoutTicks)
			{
				Terminate(TetherDisconnectReason.HeartbeatTimeout, $"No traffic for {num * 1000 / Stopwatch.Frequency} ms.");
			}
			else if (Now - LastPingSent >= IntervalTicks)
			{
				LastPingSent = Now;
				Span<byte> span = stackalloc byte[8];
				BinaryPrimitives.WriteInt64LittleEndian(span, Now);
				Enqueue(Op.Ping, span, OutKind.Normal);
			}
		}
	}

	private void WatchProcess()
	{
		try
		{
			Process processById = Process.GetProcessById(ProcessId);
			processById.EnableRaisingEvents = true;
			processById.Exited += (object? _, EventArgs _) =>
			{
				Terminate(TetherDisconnectReason.ProcessExited, null);
			};
			ProcessField = processById;
			if (processById.HasExited)
			{
				Terminate(TetherDisconnectReason.ProcessExited, null);
			}
		}
		catch (ArgumentException)
		{
			Terminate(TetherDisconnectReason.ProcessExited, "Process is not running.");
		}
		catch
		{
		}
	}

	private bool Enqueue(Op Op, ReadOnlySpan<byte> Payload, OutKind Kind)
	{
		if (Volatile.Read(in Reason) != 0)
		{
			return false;
		}
		if (Payload.Length > Options.MaxMessageSize)
		{
			throw new ArgumentOutOfRangeException("Payload", "Message exceeds MaxMessageSize.");
		}
		byte[] array = ArrayPool<byte>.Shared.Rent(Frame.RentSize(Payload.Length));
		Payload.CopyTo(array.AsSpan(10));
		return TryQueue(new Outgoing(array, Payload.Length, Op, Kind));
	}

	private bool TryQueue(in Outgoing Message)
	{
		if (QueueField.Writer.TryWrite(Message))
		{
			return true;
		}
		ArrayPool<byte>.Shared.Return(Message.Buffer);
		if (Options.DisconnectSlowClients && Volatile.Read(in Reason) == 0)
		{
			Terminate(TetherDisconnectReason.SlowConsumer, $"Send queue full ({Options.SendQueueCapacity}).");
		}
		return false;
	}

	private async Task SendLoopAsync()
	{
		ChannelReader<Outgoing> Reader = QueueField.Reader;
		CancellationToken Token = Cts.Token;
		try
		{
			while (await Reader.WaitToReadAsync(Token).ConfigureAwait(continueOnCapturedContext: false))
			{
				Outgoing Message;
				while (Reader.TryRead(out Message))
				{
					try
					{
						await WriteFrameAsync(Message, Token).ConfigureAwait(continueOnCapturedContext: false);
					}
					finally
					{
						ArrayPool<byte>.Shared.Return(Message.Buffer);
					}
					switch (Message.Kind)
					{
					case OutKind.EncryptOn:
						EncryptOutbound = true;
						break;
					case OutKind.EncryptOff:
						EncryptOutbound = false;
						break;
					case OutKind.Kick:
						await CloseQuietlyAsync().ConfigureAwait(continueOnCapturedContext: false);
						Terminate(TetherDisconnectReason.Kicked, null);
						return;
					}
				}
			}
		}
		catch (OperationCanceledException)
		{
		}
		catch (ObjectDisposedException)
		{
		}
		catch (Exception ex3) when ((ex3 is WebSocketException || ex3 is IOException) ? true : false)
		{
			Terminate(TetherDisconnectReason.ConnectionLost, ex3.Message);
		}
		catch (Exception ex4)
		{
			Server.ReportError("Send loop failed.", ex4, this);
			Terminate(TetherDisconnectReason.ConnectionLost, ex4.Message);
		}
	}

	private ValueTask WriteFrameAsync(Outgoing Message, CancellationToken Token)
	{
		byte[] buffer = Message.Buffer;
		int length = Message.Length;
		Interlocked.Increment(ref MessagesOut);
		if (EncryptOutbound && Cipher != null)
		{
			buffer[0] = (byte)Message.Op;
			buffer[1] = 1;
			ulong num = ++SendCounter;
			BinaryPrimitives.WriteUInt64LittleEndian(buffer.AsSpan(2, 8), num);
			Cipher.Encrypt(num, buffer.AsSpan(0, 2), buffer.AsSpan(10, length), buffer.AsSpan(10 + length, 16));
			int num2 = 10 + length + 16;
			Interlocked.Add(ref BytesOut, num2);
			if (TetherDiagnostics.Enabled)
			{
				TetherDiagnostics.Server(SessionId, TetherStage.FrameSend, TetherError.None, null, $"op={Message.Op} encrypted=True counter={num} payloadLength={length}");
			}
			return Socket.SendAsync(buffer.AsMemory(0, num2), WebSocketMessageType.Binary, endOfMessage: true, Token);
		}
		buffer[8] = (byte)Message.Op;
		buffer[9] = 0;
		Interlocked.Add(ref BytesOut, length + 2);
		return Socket.SendAsync(buffer.AsMemory(8, length + 2), WebSocketMessageType.Binary, endOfMessage: true, Token);
	}

	private async Task CloseQuietlyAsync()
	{
		try
		{
			using CancellationTokenSource Timeout = new CancellationTokenSource(Options.KickTimeout);
			await Socket.CloseOutputAsync(WebSocketCloseStatus.NormalClosure, "kicked", Timeout.Token).ConfigureAwait(continueOnCapturedContext: false);
		}
		catch
		{
		}
	}

	private async Task ReceiveLoopAsync()
	{
		ArrayPool<byte> Pool = ArrayPool<byte>.Shared;
		int DefaultSize = Options.ReceiveBufferSize;
		int MaxFrame = Options.MaxMessageSize + 26;
		byte[] Buffer = Pool.Rent(DefaultSize);
		int Count = 0;
		CancellationToken Token = Cts.Token;
		try
		{
			while (true)
			{
				if (Count == Buffer.Length)
				{
					if (Count >= MaxFrame)
					{
						Terminate(TetherDisconnectReason.ProtocolViolation, "Message exceeds MaxMessageSize.");
						break;
					}
					byte[] array = Pool.Rent(Math.Min(Buffer.Length * 2, MaxFrame));
					System.Buffer.BlockCopy(Buffer, 0, array, 0, Count);
					Pool.Return(Buffer);
					Buffer = array;
				}
				ValueWebSocketReceiveResult valueWebSocketReceiveResult = await Socket.ReceiveAsync(Buffer.AsMemory(Count), Token).ConfigureAwait(continueOnCapturedContext: false);
				if (valueWebSocketReceiveResult.MessageType == WebSocketMessageType.Close)
				{
					Terminate(TetherDisconnectReason.ClientClosed, null);
					break;
				}
				if (valueWebSocketReceiveResult.MessageType != WebSocketMessageType.Binary)
				{
					Terminate(TetherDisconnectReason.ProtocolViolation, "Text frames are not part of the protocol.");
					break;
				}
				Count += valueWebSocketReceiveResult.Count;
				if (Count > MaxFrame)
				{
					Terminate(TetherDisconnectReason.ProtocolViolation, "Message exceeds MaxMessageSize.");
					break;
				}
				if (valueWebSocketReceiveResult.EndOfMessage)
				{
					Interlocked.Exchange(ref LastSeen, Stopwatch.GetTimestamp());
					Interlocked.Add(ref BytesIn, Count);
					if (!HandleFrame(Buffer, Count))
					{
						break;
					}
					Count = 0;
					if (Buffer.Length > DefaultSize * 4)
					{
						Pool.Return(Buffer);
						Buffer = Pool.Rent(DefaultSize);
					}
				}
			}
		}
		catch (OperationCanceledException)
		{
		}
		catch (ObjectDisposedException)
		{
			Terminate(TetherDisconnectReason.ConnectionLost, null);
		}
		catch (WebSocketException ex3)
		{
			Terminate(TetherDisconnectReason.ConnectionLost, ex3.Message);
		}
		catch (Exception ex4)
		{
			Server.ReportError("Receive loop failed.", ex4, this);
			Terminate(TetherDisconnectReason.ConnectionLost, ex4.Message);
		}
		finally
		{
			Pool.Return(Buffer);
			await CleanupAsync().ConfigureAwait(continueOnCapturedContext: false);
		}
	}

	private bool HandleFrame(byte[] Buffer, int Count)
	{
		if (Count < 2)
		{
			return Violation("Frame too short.");
		}
		Op op = (Op)Buffer[0];
		byte b = Buffer[1];
		if (TetherDiagnostics.Enabled && op != Op.Ping && op != Op.Pong)
		{
			TetherDiagnostics.Server(SessionId, TetherStage.FrameReceive, TetherError.None, null, $"clientSent: op={op} flags=0x{b:X2} total={Count} | serverExpects: flags={((Cipher != null && (Options.RequireEncryption || EncryptDesired)) ? "0x01 (encrypted)" : "0x00 or 0x01")} nextCounter={ReceiveCounter + 1} minEncrypted={26}");
		}
		int num;
		int num2;
		switch (b)
		{
		case 1:
		{
			if (Cipher == null)
			{
				return Violation("Encrypted frame, but encryption is disabled.");
			}
			if (Count < 26)
			{
				return Violation("Encrypted frame too short.");
			}
			ulong num3 = BinaryPrimitives.ReadUInt64LittleEndian(Buffer.AsSpan(2, 8));
			if (num3 != ReceiveCounter + 1)
			{
				if (TetherDiagnostics.Enabled)
				{
					TetherDiagnostics.Server(SessionId, TetherStage.FrameDecrypt, TetherError.ReplayRejected, null, $"op={op} expectedCounter={ReceiveCounter + 1} receivedCounter={num3} length={Count}");
				}
				return Violation("Replayed or out-of-order frame.");
			}
			num = 10;
			num2 = Count - 26;
			if (!Cipher.TryDecrypt(num3, Buffer.AsSpan(0, 2), Buffer.AsSpan(num, num2), Buffer.AsSpan(num + num2, 16)))
			{
				if (TetherDiagnostics.Enabled)
				{
					TetherDiagnostics.Server(SessionId, TetherStage.FrameDecrypt, TetherError.AesGcmAuthenticationFailed, null, $"op={op} counter={num3} ciphertextLength={num2} tagLength={16} aadLength={2} totalLength={Count}");
				}
				Terminate(TetherDisconnectReason.DecryptionFailed, "Frame failed authentication.");
				return false;
			}
			ReceiveCounter = num3;
			break;
		}
		case 0:
			if (Options.RequireEncryption && Cipher != null)
			{
				return Violation("Plaintext frame rejected: encryption is required.");
			}
			num = 2;
			num2 = Count - 2;
			break;
		default:
			return Violation("Unknown frame flags.");
		}
		if (Volatile.Read(in Reason) != 0)
		{
			return true;
		}
		Interlocked.Increment(ref MessagesIn);
		switch (op)
		{
		case Op.Data:
			Server.DispatchMessage(this, new ReadOnlyMemory<byte>(Buffer, num, num2));
			return true;
		case Op.Ping:
			if (num2 > 64)
			{
				return Violation("Ping body too large.");
			}
			Enqueue(Op.Pong, Buffer.AsSpan(num, num2), OutKind.Normal);
			return true;
		case Op.Pong:
			if (num2 == 8)
			{
				long num4 = BinaryPrimitives.ReadInt64LittleEndian(Buffer.AsSpan(num, 8));
				long timestamp = Stopwatch.GetTimestamp();
				if (num4 > 0 && num4 <= timestamp)
				{
					Interlocked.Exchange(ref RoundTripTicks, timestamp - num4);
				}
			}
			return true;
		default:
			return Violation($"Unexpected opcode 0x{(byte)op:X2}.");
		}
	}

	private bool Violation(string Detail)
	{
		Terminate(TetherDisconnectReason.ProtocolViolation, Detail);
		return false;
	}

	private async Task CleanupAsync()
	{
		if (Interlocked.Exchange(ref CleanedUp, 1) != 0)
		{
			return;
		}
		Terminate(TetherDisconnectReason.ConnectionLost, null);
		try
		{
			await SendTask.ConfigureAwait(continueOnCapturedContext: false);
		}
		catch
		{
		}
		Outgoing item;
		while (QueueField.Reader.TryRead(out item))
		{
			ArrayPool<byte>.Shared.Return(item.Buffer);
		}
		Cipher?.Dispose();
		try
		{
			Socket.Dispose();
		}
		catch
		{
		}
		if (ProcessField != null)
		{
			try
			{
				ProcessField.EnableRaisingEvents = false;
			}
			catch
			{
			}
			ProcessField.Dispose();
		}
		Server.OnClientClosed(this);
		CompletionField.TrySetResult();
	}
}
