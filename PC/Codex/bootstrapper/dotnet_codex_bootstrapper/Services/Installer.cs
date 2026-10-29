using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text.Json;
using dotnet_codex_bootstrapper.Core.Configuration;
using dotnet_codex_bootstrapper.Core.Manifest;
using dotnet_codex_bootstrapper.Infrastructure;

namespace dotnet_codex_bootstrapper.Services;

public sealed class Installer(BootstrapperPaths Paths, IAppProcessProbe Probe)
{
	private static readonly JsonSerializerOptions Options = new JsonSerializerOptions(JsonSerializerDefaults.Web)
	{
		WriteIndented = true
	};

	public static string StageFile(string StageRoot, string RelativePath)
	{
		return SafePath.Resolve(StageRoot, RelativePath);
	}

	public bool IsAppRunning(string ExecutableRelative)
	{
		return Probe.IsRunning(SafePath.Resolve(Paths.AppDirectory, ExecutableRelative));
	}

	public void Apply(string Operation, string StageRoot, IReadOnlyList<FileEntry> Files, string ExecutableRelative)
	{
		EnsureWritable();
		if (IsAppRunning(ExecutableRelative))
		{
			throw new UpdateException("E-RUNNING", "Codex is running. Close it to continue the update.");
		}
		string BackupRoot = Path.Combine(Paths.RollbackDirectory, Operation);
		List<JournalEntry> list = Files.Select((FileEntry File0) => new JournalEntry(File0.Path, File.Exists(SafePath.Resolve(Paths.AppDirectory, File0.Path)), Path.Combine(BackupRoot, File0.Path.Replace('/', Path.DirectorySeparatorChar)))).ToList();
		InstallJournal installJournal = new InstallJournal(Operation, list);
		InstallStateStore.WriteAtomic(Paths.JournalFile, JsonSerializer.SerializeToUtf8Bytes(installJournal, Options));
		try
		{
			foreach (JournalEntry item in list)
			{
				string text = SafePath.Resolve(Paths.AppDirectory, item.Path);
				string sourceFileName = StageFile(StageRoot, item.Path);
				Directory.CreateDirectory(Path.GetDirectoryName(text));
				if (item.HadOriginal)
				{
					Directory.CreateDirectory(Path.GetDirectoryName(item.Backup));
					File.Move(text, item.Backup, overwrite: true);
				}
				File.Move(sourceFileName, text, overwrite: true);
			}
		}
		catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException) ? true : false)
		{
			AppLog.Error(ex, "Installing files failed; rolling back");
			Rollback(installJournal);
			throw new UpdateException((ex is UnauthorizedAccessException) ? "E-ACCESS" : "E-LOCKED", (ex is UnauthorizedAccessException) ? "Codex could not write to its install folder." : "A file is in use and could not be replaced. Close Codex and try again.", ex);
		}
	}

	public void Commit(string Operation, IReadOnlyCollection<string> Orphans)
	{
		foreach (string Orphan in Orphans)
		{
			try
			{
				if (SafePath.IsSafeRelative(Orphan) && !SafePath.IsProtected(Orphan))
				{
					string path = SafePath.Resolve(Paths.AppDirectory, Orphan);
					if (File.Exists(path))
					{
						File.Delete(path);
					}
				}
			}
			catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException || ex is ManifestException) ? true : false)
			{
				AppLog.Warning(ex, "Could not remove an obsolete file");
			}
		}
		TryDelete(Path.Combine(Paths.RollbackDirectory, Operation));
		if (File.Exists(Paths.JournalFile))
		{
			File.Delete(Paths.JournalFile);
		}
	}

	public void RollbackOperation(string Operation)
	{
		InstallJournal installJournal = ReadJournal();
		if ((object)installJournal != null && installJournal.Operation == Operation)
		{
			Rollback(installJournal);
		}
	}

	public bool RecoverInterrupted()
	{
		InstallJournal installJournal = ReadJournal();
		if ((object)installJournal == null)
		{
			return false;
		}
		AppLog.Warning("Recovering an interrupted installation ({Operation})", installJournal.Operation);
		Rollback(installJournal);
		return true;
	}

	private void Rollback(InstallJournal Journal)
	{
		foreach (JournalEntry item in Journal.Entries.Reverse())
		{
			try
			{
				string text = SafePath.Resolve(Paths.AppDirectory, item.Path);
				if (item.HadOriginal)
				{
					if (File.Exists(item.Backup))
					{
						File.Move(item.Backup, text, overwrite: true);
					}
				}
				else if (File.Exists(text))
				{
					File.Delete(text);
				}
			}
			catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException || ex is ManifestException) ? true : false)
			{
				AppLog.Error(ex, "Rollback of {Path} failed", item.Path);
			}
		}
		TryDelete(Path.Combine(Paths.RollbackDirectory, Journal.Operation));
		if (File.Exists(Paths.JournalFile))
		{
			File.Delete(Paths.JournalFile);
		}
	}

	private InstallJournal? ReadJournal()
	{
		try
		{
			return File.Exists(Paths.JournalFile) ? JsonSerializer.Deserialize<InstallJournal>(File.ReadAllBytes(Paths.JournalFile), Options) : null;
		}
		catch (Exception ex) when ((ex is JsonException || ex is IOException) ? true : false)
		{
			AppLog.Warning(ex, "The install journal is unreadable");
			return null;
		}
	}

	private void EnsureWritable()
	{
		try
		{
			Directory.CreateDirectory(Paths.AppDirectory);
			string path = Path.Combine(Paths.AppDirectory, $".write-test-{Guid.NewGuid():N}");
			File.WriteAllText(path, "x");
			File.Delete(path);
		}
		catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException) ? true : false)
		{
			throw new UpdateException("E-ACCESS", "Codex could not write to its install folder.", ex);
		}
	}

	private static void TryDelete(string Directory0)
	{
		try
		{
			if (Directory.Exists(Directory0))
			{
				Directory.Delete(Directory0, recursive: true);
			}
		}
		catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException) ? true : false)
		{
			AppLog.Warning(ex, "Could not remove a temporary folder");
		}
	}
}
