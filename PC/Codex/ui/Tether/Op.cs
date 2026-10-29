namespace Tether;

internal enum Op : byte
{
	Challenge = 1,
	Hello = 2,
	Welcome = 3,
	Ping = 16,
	Pong = 17,
	Data = 32,
	SetEncryption = 48,
	Kick = 64
}
