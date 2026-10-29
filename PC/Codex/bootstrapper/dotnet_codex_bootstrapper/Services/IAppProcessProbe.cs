namespace dotnet_codex_bootstrapper.Services;

public interface IAppProcessProbe
{
	bool IsRunning(string ExecutablePath);
}
