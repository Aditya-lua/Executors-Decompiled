using System.IO;
using dotnet_codex_bootstrapper.Infrastructure;

namespace dotnet_codex_bootstrapper.Core.Configuration;

public sealed class BootstrapperPaths(string Root)
{
	public const string BootstrapperName = "Codex Bootstrapper.exe";

	public string Root { get; } = Root;

	public string AppDirectory => Path.Combine(Root, "app");

	public string StateDirectory => Path.Combine(Root, "state");

	public string StagingDirectory => Path.Combine(Root, "staging");

	public string RollbackDirectory => Path.Combine(Root, "rollback");

	public string LogDirectory => Path.Combine(Root, "bootstrapper", "logs");

	public string InstalledBootstrapper => Path.Combine(Root, "Codex Bootstrapper.exe");

	public string InstallStateFile => Path.Combine(StateDirectory, "install-state.json");

	public string CachedManifestFile => Path.Combine(StateDirectory, "manifest.json");

	public string JournalFile => Path.Combine(StateDirectory, "install-journal.json");

	public string LoaderFile(string RobloxVersion, string Md5)
	{
		return Path.Combine(AppDirectory, "bin", RobloxVersion, Md5 + ".exe");
	}

	public static BootstrapperPaths Default()
	{
		return new BootstrapperPaths(Path.Combine(InteractiveProfile.LocalAppData, "Codex"));
	}

	public void EnsureDirectories()
	{
		string[] array = new string[5] { Root, AppDirectory, StateDirectory, StagingDirectory, RollbackDirectory };
		for (int i = 0; i < array.Length; i++)
		{
			Directory.CreateDirectory(array[i]);
		}
	}
}
