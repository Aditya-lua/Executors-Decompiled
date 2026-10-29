namespace dotnet_codex_bootstrapper.Infrastructure;

public interface IProcessLauncher
{
	IStartedProcess Start(string FileName, string Arguments, string WorkingDirectory, bool RequireElevation);
}
