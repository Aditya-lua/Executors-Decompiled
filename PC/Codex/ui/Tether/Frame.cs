namespace Tether;

internal static class Frame
{
	public const byte Version = 1;

	public const byte FlagEncrypted = 1;

	public const int HeaderSize = 2;

	public const int CounterSize = 8;

	public const int TagSize = 16;

	public const int NonceSize = 12;

	public const int EncryptedOverhead = 26;

	public const int PayloadOffset = 10;

	public const int RandomNonceLength = 32;

	public const int SaltLength = 16;

	public const int PublicKeyLength = 65;

	public const int MacLength = 32;

	public const int ChallengeBaseLength = 66;

	public const int WelcomeLength = 39;

	public const int MaxHelloJson = 1024;

	public const int MaxHelloFrame = 1171;

	public static int RentSize(int PayloadLength)
	{
		return 10 + PayloadLength + 16;
	}
}
