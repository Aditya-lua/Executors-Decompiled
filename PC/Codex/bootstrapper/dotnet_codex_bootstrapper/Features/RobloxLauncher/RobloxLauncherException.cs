using System;

namespace dotnet_codex_bootstrapper.Features.RobloxLauncher;

public sealed class RobloxLauncherException : Exception
{
	public RobloxLauncherException(string Message, Exception? Inner = null)
		: base(Message, Inner)
	{
	}
}
