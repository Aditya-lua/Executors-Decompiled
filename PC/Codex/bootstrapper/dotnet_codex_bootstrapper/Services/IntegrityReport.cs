using System.Collections.Generic;
using dotnet_codex_bootstrapper.Core.Manifest;

namespace dotnet_codex_bootstrapper.Services;

public sealed record IntegrityReport(IReadOnlyList<FileEntry> Valid, IReadOnlyList<FileEntry> Missing, IReadOnlyList<FileEntry> Damaged, IReadOnlyDictionary<string, RemoteInfo?> Expected, IReadOnlyDictionary<string, LocalFile> Local)
{
	public IReadOnlyList<FileEntry> NeedsFetch
	{
		get
		{
			IReadOnlyList<FileEntry> missing = Missing;
			IReadOnlyList<FileEntry> damaged = Damaged;
			int num = 0;
			FileEntry[] array = new FileEntry[missing.Count + damaged.Count];
			foreach (FileEntry item in missing)
			{
				array[num] = item;
				num++;
			}
			foreach (FileEntry item2 in damaged)
			{
				array[num] = item2;
				num++;
			}
			return new _003C_003Ez__ReadOnlyArray<FileEntry>(array);
		}
	}

	public bool IsClean
	{
		get
		{
			if (Missing.Count == 0)
			{
				return Damaged.Count == 0;
			}
			return false;
		}
	}
}
