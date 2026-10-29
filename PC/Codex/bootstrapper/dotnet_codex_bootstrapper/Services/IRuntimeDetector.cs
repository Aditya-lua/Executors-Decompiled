namespace dotnet_codex_bootstrapper.Services;

public interface IRuntimeDetector
{
	bool IsInstalled(int MinimumMajor);
}
