namespace Tether;

public enum TetherError
{
	None,
	InvalidMessageFormat,
	InvalidHmacLength,
	HmacVerificationFailed,
	InvalidNonceLength,
	InvalidAuthenticationTagLength,
	AesGcmAuthenticationFailed,
	PayloadDecodingFailed,
	ProtocolVersionMismatch,
	ReplayRejected,
	UnexpectedProtocolState,
	TransportFailed,
	RequestTimedOut,
	InternalProcessingError
}
