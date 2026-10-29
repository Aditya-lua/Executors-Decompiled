using System;

namespace dotnet_codex_bootstrapper.Infrastructure;

public interface IStartedProcess : IDisposable
{
	int Id { get; }

	bool HasExited { get; }

	int ExitCode { get; }

	bool WaitForExit(int Milliseconds);

	void Kill();
}
