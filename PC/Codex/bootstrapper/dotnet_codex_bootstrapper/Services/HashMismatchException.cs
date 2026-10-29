namespace dotnet_codex_bootstrapper.Services;

public sealed class HashMismatchException : UpdateException
{
	public HashMismatchException(string Message)
		: base("E-HASH", Message)
	{
	}
}
