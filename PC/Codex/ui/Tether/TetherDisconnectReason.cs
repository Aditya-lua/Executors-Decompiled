namespace Tether;

public enum TetherDisconnectReason
{
	None,
	ClientClosed,
	ConnectionLost,
	HeartbeatTimeout,
	Kicked,
	Terminated,
	ProcessExited,
	ProtocolViolation,
	DecryptionFailed,
	Replaced,
	SlowConsumer,
	ServerStopping
}
