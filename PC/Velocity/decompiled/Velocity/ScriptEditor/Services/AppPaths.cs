using System;
using System.IO;
using System.IO.Compression;
using System.Reflection;

namespace ScriptEditor.Services;

public static class AppPaths
{
	private const string ResourceName = "assets.zip";

	private const string AppFolderName = "Velocity";

	private const string LegacyFolderName = "ScriptEditor";

	public static string DataFolder { get; } = Path.Combine(Environment.GetFolderPath(Environment.SpecialFolder.LocalApplicationData), "Velocity");

	public static string InstallFolder { get; } = ResolveInstallFolder();

	public static string AssetFolder { get; private set; } = Path.Combine(AppContext.BaseDirectory, "Assets");

	public static string LanguageServerFolder => Path.Combine(AssetFolder, "luau-lsp");

	public static void MigrateLegacyData()
	{
		string text = Path.Combine(Environment.GetFolderPath(Environment.SpecialFolder.LocalApplicationData), "ScriptEditor");
		if (!Directory.Exists(text) || Directory.Exists(DataFolder))
		{
			return;
		}
		try
		{
			Directory.Move(text, DataFolder);
		}
		catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException) ? true : false)
		{
		}
	}

	public static void EnsureAssets()
	{
		Assembly executingAssembly = Assembly.GetExecutingAssembly();
		using Stream stream = executingAssembly.GetManifestResourceStream("assets.zip");
		if (stream == null)
		{
			throw new InvalidOperationException("The 'assets.zip' resource is missing from this build, so Monaco and the language server cannot be unpacked. The PackAssets target in the project file did not run, or ran too late to contribute the resource.");
		}
		string text = Path.Combine(DataFolder, "assets");
		string text2 = Path.Combine(text, executingAssembly.ManifestModule.ModuleVersionId.ToString("N"));
		if (!Directory.Exists(text2))
		{
			Extract(stream, text2);
		}
		AssetFolder = text2;
		PruneOldVersions(text, text2);
	}

	private static void Extract(Stream source, string target)
	{
		string text = target + ".unpacking";
		try
		{
			if (Directory.Exists(text))
			{
				Directory.Delete(text, recursive: true);
			}
			Directory.CreateDirectory(text);
			using (ZipArchive source2 = new ZipArchive(source, ZipArchiveMode.Read))
			{
				source2.ExtractToDirectory(text, overwriteFiles: true);
			}
			Directory.Move(text, target);
		}
		catch (IOException) when (Directory.Exists(target))
		{
			TryDelete(text);
		}
		finally
		{
			if (Directory.Exists(text) && Directory.Exists(target))
			{
				TryDelete(text);
			}
		}
	}

	private static void PruneOldVersions(string root, string keep)
	{
		try
		{
			foreach (string item in Directory.EnumerateDirectories(root))
			{
				if (!string.Equals(item, keep, StringComparison.OrdinalIgnoreCase))
				{
					TryDelete(item);
				}
			}
		}
		catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException) ? true : false)
		{
		}
	}

	private static void TryDelete(string dir)
	{
		try
		{
			if (Directory.Exists(dir))
			{
				Directory.Delete(dir, recursive: true);
			}
		}
		catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException) ? true : false)
		{
		}
	}

	private static string ResolveInstallFolder()
	{
		string processPath = Environment.ProcessPath;
		string text = ((processPath == null) ? null : Path.GetDirectoryName(processPath));
		if (!string.IsNullOrEmpty(text))
		{
			return text;
		}
		return AppContext.BaseDirectory;
	}
}
