using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using Microsoft.VisualBasic.FileIO;
using dotnet_codex_ui.Infrastructure.FileSystem;
using dotnet_codex_ui.Infrastructure.Logging;

namespace dotnet_codex_ui.Features.Explorer;

internal sealed class FileSystemProvider
{
	public static readonly StringComparison PathComparison = StringComparison.OrdinalIgnoreCase;

	private static readonly HashSet<string> Reserved = new HashSet<string>(StringComparer.OrdinalIgnoreCase)
	{
		"CON", "PRN", "AUX", "NUL", "COM1", "COM2", "COM3", "COM4", "COM5", "COM6",
		"COM7", "COM8", "COM9", "LPT1", "LPT2", "LPT3", "LPT4", "LPT5", "LPT6", "LPT7",
		"LPT8", "LPT9"
	};

	public const long MaxOpenBytes = 5242880L;

	public string Root { get; }

	public static string DefaultRoot => AppDirectories.Scripts;

	public FileSystemProvider(string Root)
	{
		this.Root = Normalize(Root);
	}

	private static string Normalize(string Path0)
	{
		return Path.TrimEndingDirectorySeparator(Path.GetFullPath(Path0));
	}

	public bool IsInside(string Path0)
	{
		try
		{
			string text = Normalize(Path0);
			return text.Equals(Root, PathComparison) || text.StartsWith(Root + Path.DirectorySeparatorChar, PathComparison);
		}
		catch (Exception)
		{
			return false;
		}
	}

	public bool IsRoot(string Path0)
	{
		try
		{
			return Normalize(Path0).Equals(Root, PathComparison);
		}
		catch (Exception)
		{
			return false;
		}
	}

	public bool IsDescendantOrSelf(string Ancestor, string Path0)
	{
		string text = Normalize(Ancestor);
		string text2 = Normalize(Path0);
		if (!text2.Equals(text, PathComparison))
		{
			return text2.StartsWith(text + Path.DirectorySeparatorChar, PathComparison);
		}
		return true;
	}

	public bool EnsureRoot()
	{
		try
		{
			Directory.CreateDirectory(Root);
			return true;
		}
		catch (Exception failure)
		{
			AppLog.Error(failure, null, "EnsureRoot", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Features\\Explorer\\FileSystemProvider.cs");
			return false;
		}
	}

	public Task<EnumerateResult> EnumerateAsync(string Dir, CancellationToken Cancel = default(CancellationToken))
	{
		return Task.Run(() => Enumerate(Dir, Cancel), Cancel);
	}

	public EnumerateResult Enumerate(string Dir, CancellationToken Cancel = default(CancellationToken))
	{
		if (!IsInside(Dir))
		{
			return new EnumerateResult(EntryState.Failed, Array.Empty<FsEntry>(), "That folder is outside the scripts folder.");
		}
		try
		{
			DirectoryInfo directoryInfo = new DirectoryInfo(Dir);
			if (!directoryInfo.Exists)
			{
				return new EnumerateResult(EntryState.Missing, Array.Empty<FsEntry>(), "This folder no longer exists.");
			}
			List<FsEntry> list = new List<FsEntry>();
			List<FsEntry> list2 = new List<FsEntry>();
			foreach (FileSystemInfo item in directoryInfo.EnumerateFileSystemInfos())
			{
				Cancel.ThrowIfCancellationRequested();
				try
				{
					if (!item.Attributes.HasFlag(FileAttributes.ReparsePoint))
					{
						if (item.Attributes.HasFlag(FileAttributes.Directory))
						{
							list.Add(new FsEntry(item.Name, item.FullName, IsDirectory: true));
						}
						else
						{
							list2.Add(new FsEntry(item.Name, item.FullName, IsDirectory: false));
						}
					}
				}
				catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException) ? true : false)
				{
				}
			}
			list.Sort(CompareNames);
			list2.Sort(CompareNames);
			List<FsEntry> list3 = list.Concat(list2).ToList();
			return new EnumerateResult((list3.Count == 0) ? EntryState.Empty : EntryState.Ok, list3);
		}
		catch (UnauthorizedAccessException)
		{
			return new EnumerateResult(EntryState.Denied, Array.Empty<FsEntry>(), "You don't have permission to open this folder.");
		}
		catch (DirectoryNotFoundException)
		{
			return new EnumerateResult(EntryState.Missing, Array.Empty<FsEntry>(), "This folder no longer exists.");
		}
		catch (OperationCanceledException)
		{
			throw;
		}
		catch (Exception ex5)
		{
			AppLog.Error(ex5, null, "Enumerate", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Features\\Explorer\\FileSystemProvider.cs");
			return new EnumerateResult(EntryState.Failed, Array.Empty<FsEntry>(), ex5.Message);
		}
	}

	private static int CompareNames(FsEntry A, FsEntry B)
	{
		return string.Compare(A.Name, B.Name, StringComparison.OrdinalIgnoreCase);
	}

	public static FsResult ValidateName(string? Name)
	{
		if (string.IsNullOrWhiteSpace(Name))
		{
			return new FsResult(FsError.InvalidName, "Enter a name.");
		}
		if (Name != Name.Trim() || Name.EndsWith('.'))
		{
			return new FsResult(FsError.InvalidName, "A name can't start or end with a space, or end with a dot.");
		}
		if (Name.Length > 200)
		{
			return new FsResult(FsError.InvalidName, "That name is too long.");
		}
		if (Name.IndexOfAny(Path.GetInvalidFileNameChars()) >= 0)
		{
			return new FsResult(FsError.InvalidName, "A name can't contain any of these characters: \\ / : * ? \" < > |");
		}
		if (Reserved.Contains(Path.GetFileNameWithoutExtension(Name)))
		{
			return new FsResult(FsError.InvalidName, "That name is reserved by Windows.");
		}
		return FsResult.Success;
	}

	private static bool Exists(string Path0)
	{
		if (!File.Exists(Path0))
		{
			return Directory.Exists(Path0);
		}
		return true;
	}

	public Task<FsResult> RenameAsync(string Path0, string NewName)
	{
		return Task.Run(() => Rename(Path0, NewName));
	}

	public FsResult Rename(string Path0, string NewName)
	{
		return Logged("Rename", Path0, RenameCore(Path0, NewName));
	}

	public FsResult Move(string Path0, string TargetDir)
	{
		return Logged("Move", Path0, MoveCore(Path0, TargetDir));
	}

	public FsResult Delete(string Path0)
	{
		return Logged("Delete", Path0, DeleteCore(Path0));
	}

	public (FsResult Result, string? Path) CreateFile(string Dir, string BaseName = "untitled", string Extension = ".luau")
	{
		(FsResult, string) result = CreateFileCore(Dir, BaseName, Extension);
		Logged("CreateFile", result.Item2 ?? Dir, result.Item1);
		return result;
	}

	private static FsResult Logged(string Operation, string Path0, FsResult Result)
	{
		if (Result.Ok)
		{
			AppLog.Information("Explorer {Operation} {Path}", Operation, Path0);
		}
		else
		{
			AppLog.Warning("Explorer {Operation} {Path} refused: {Error} {Message}", Operation, Path0, Result.Error, Result.Message);
		}
		return Result;
	}

	private FsResult RenameCore(string Path0, string NewName)
	{
		FsResult result = ValidateName(NewName);
		if (!result.Ok)
		{
			return result;
		}
		if (!IsInside(Path0) || IsRoot(Path0))
		{
			return new FsResult(FsError.OutsideRoot, "That item can't be renamed.");
		}
		string target = Path.Combine(Path.GetDirectoryName(Normalize(Path0)), NewName);
		return MoveCore(Path0, target, AllowCaseChange: true);
	}

	public Task<FsResult> MoveAsync(string Path0, string TargetDir)
	{
		return Task.Run(() => Move(Path0, TargetDir));
	}

	private FsResult MoveCore(string Path0, string TargetDir)
	{
		if (!IsInside(Path0) || IsRoot(Path0) || !IsInside(TargetDir))
		{
			return new FsResult(FsError.OutsideRoot, "Items can only be moved inside the scripts folder.");
		}
		if (Directory.Exists(Path0) && IsDescendantOrSelf(Path0, TargetDir))
		{
			return new FsResult(FsError.Invalid, "A folder can't be moved into itself.");
		}
		if (!Directory.Exists(TargetDir))
		{
			return new FsResult(FsError.Missing, "The destination folder no longer exists.");
		}
		string text = Path.Combine(Normalize(TargetDir), Path.GetFileName(Normalize(Path0)));
		if (text.Equals(Normalize(Path0), PathComparison))
		{
			return new FsResult(FsError.Invalid, "It is already in that folder.");
		}
		return MoveCore(Path0, text, AllowCaseChange: false);
	}

	private FsResult MoveCore(string Source, string Target, bool AllowCaseChange)
	{
		try
		{
			bool flag = Directory.Exists(Source);
			if (!flag && !File.Exists(Source))
			{
				return new FsResult(FsError.Missing, "It no longer exists.");
			}
			bool flag2 = Normalize(Source).Equals(Normalize(Target), PathComparison);
			if (flag2 && (!AllowCaseChange || Normalize(Source) == Normalize(Target)))
			{
				return FsResult.Success;
			}
			if (!flag2 && Exists(Target))
			{
				return new FsResult(FsError.Exists, "Something with that name already exists there.");
			}
			if (flag)
			{
				Directory.Move(Source, Target);
			}
			else
			{
				File.Move(Source, Target, overwrite: false);
			}
			return FsResult.Success;
		}
		catch (UnauthorizedAccessException)
		{
			return new FsResult(FsError.Denied, "You don't have permission to change this item.");
		}
		catch (FileNotFoundException)
		{
			return new FsResult(FsError.Missing, "It no longer exists.");
		}
		catch (DirectoryNotFoundException)
		{
			return new FsResult(FsError.Missing, "It no longer exists.");
		}
		catch (IOException ex4) when (IsSharingViolation(ex4))
		{
			return new FsResult(FsError.Busy, "It is in use by another program.");
		}
		catch (IOException ex5)
		{
			return new FsResult((File.Exists(Target) || Directory.Exists(Target)) ? FsError.Exists : FsError.Failed, ex5.Message);
		}
		catch (Exception ex6)
		{
			AppLog.Error(ex6, null, "MoveCore", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Features\\Explorer\\FileSystemProvider.cs");
			return new FsResult(FsError.Failed, ex6.Message);
		}
	}

	public Task<FsResult> DeleteAsync(string Path0)
	{
		return Task.Run(() => Delete(Path0));
	}

	private FsResult DeleteCore(string Path0)
	{
		if (!IsInside(Path0) || IsRoot(Path0))
		{
			return new FsResult(FsError.OutsideRoot, "That item can't be deleted.");
		}
		try
		{
			if (File.Exists(Path0))
			{
				FileSystem.DeleteFile(Path0, UIOption.OnlyErrorDialogs, RecycleOption.SendToRecycleBin, UICancelOption.ThrowException);
			}
			else
			{
				if (!Directory.Exists(Path0))
				{
					return new FsResult(FsError.Missing, "It no longer exists.");
				}
				FileSystem.DeleteDirectory(Path0, UIOption.OnlyErrorDialogs, RecycleOption.SendToRecycleBin, UICancelOption.ThrowException);
			}
			return FsResult.Success;
		}
		catch (UnauthorizedAccessException)
		{
			return new FsResult(FsError.Denied, "You don't have permission to delete this item.");
		}
		catch (OperationCanceledException)
		{
			return new FsResult(FsError.Failed, "Deleting was cancelled.");
		}
		catch (IOException ex3) when (IsSharingViolation(ex3))
		{
			return new FsResult(FsError.Busy, "It is in use by another program.");
		}
		catch (Exception ex4)
		{
			AppLog.Error(ex4, null, "DeleteCore", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Features\\Explorer\\FileSystemProvider.cs");
			return new FsResult(FsError.Failed, ex4.Message);
		}
	}

	public Task<(FsResult Result, string? Path)> CreateFileAsync(string Dir, string BaseName = "untitled", string Extension = ".luau")
	{
		return Task.Run(() => CreateFile(Dir, BaseName, Extension));
	}

	private (FsResult Result, string? Path) CreateFileCore(string Dir, string BaseName = "untitled", string Extension = ".luau")
	{
		if (!IsInside(Dir))
		{
			return (Result: new FsResult(FsError.OutsideRoot, "Files can only be created inside the scripts folder."), Path: null);
		}
		try
		{
			if (!Directory.Exists(Dir))
			{
				return (Result: new FsResult(FsError.Missing, "The folder no longer exists."), Path: null);
			}
			for (int i = 1; i < 1000; i++)
			{
				string text = Path.Combine(Normalize(Dir), (i == 1) ? (BaseName + Extension) : $"{BaseName} {i}{Extension}");
				try
				{
					using (new FileStream(text, FileMode.CreateNew, FileAccess.Write))
					{
					}
					return (Result: FsResult.Success, Path: text);
				}
				catch (IOException) when (File.Exists(text) || Directory.Exists(text))
				{
				}
			}
			return (Result: new FsResult(FsError.Exists, "Couldn't find a free file name."), Path: null);
		}
		catch (UnauthorizedAccessException)
		{
			return (Result: new FsResult(FsError.Denied, "You don't have permission to create files here."), Path: null);
		}
		catch (Exception ex3)
		{
			AppLog.Error(ex3, null, "CreateFileCore", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Features\\Explorer\\FileSystemProvider.cs");
			return (Result: new FsResult(FsError.Failed, ex3.Message), Path: null);
		}
	}

	private static bool IsSharingViolation(IOException Ex)
	{
		int num = Ex.HResult & 0xFFFF;
		if ((uint)(num - 32) <= 1u)
		{
			return true;
		}
		return false;
	}

	public async Task<(FsResult Result, string? Text)> ReadTextAsync(string Path0, CancellationToken Cancel = default(CancellationToken))
	{
		try
		{
			FileInfo fileInfo = new FileInfo(Path0);
			if (!fileInfo.Exists)
			{
				return (Result: new FsResult(FsError.Missing, "The file no longer exists."), Text: null);
			}
			if (fileInfo.Length > 5242880)
			{
				return (Result: new FsResult(FsError.Invalid, "This file is too large to open in the editor (over 5 MB)."), Text: null);
			}
			byte[] Bytes;
			using (FileStream Stream = new FileStream(Path0, FileMode.Open, FileAccess.Read, FileShare.ReadWrite | FileShare.Delete, 4096, useAsync: true))
			{
				Bytes = new byte[Stream.Length];
				int Read;
				int num;
				for (Read = 0; Read < Bytes.Length; Read += num)
				{
					num = await Stream.ReadAsync(Bytes.AsMemory(Read), Cancel);
					if (num == 0)
					{
						break;
					}
				}
				if (Read < Bytes.Length)
				{
					Array.Resize(ref Bytes, Read);
				}
			}
			if (Array.IndexOf(Bytes, (byte)0, 0, Math.Min(Bytes.Length, 8192)) >= 0)
			{
				return (Result: new FsResult(FsError.Invalid, "This looks like a binary file, so it can't be opened in the editor."), Text: null);
			}
			string text = new UTF8Encoding(encoderShouldEmitUTF8Identifier: false).GetString(Bytes);
			if (text.Length > 0 && text[0] == '\ufeff')
			{
				text = text.Substring(1);
			}
			return (Result: FsResult.Success, Text: text.Replace("\r\n", "\n"));
		}
		catch (UnauthorizedAccessException)
		{
			return (Result: new FsResult(FsError.Denied, "You don't have permission to read this file."), Text: null);
		}
		catch (FileNotFoundException)
		{
			return (Result: new FsResult(FsError.Missing, "The file no longer exists."), Text: null);
		}
		catch (DirectoryNotFoundException)
		{
			return (Result: new FsResult(FsError.Missing, "The file no longer exists."), Text: null);
		}
		catch (IOException ex4) when (IsSharingViolation(ex4))
		{
			return (Result: new FsResult(FsError.Busy, "The file is in use by another program."), Text: null);
		}
		catch (OperationCanceledException)
		{
			throw;
		}
		catch (Exception ex6)
		{
			AppLog.Error(ex6, null, "ReadTextAsync", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Features\\Explorer\\FileSystemProvider.cs");
			return (Result: new FsResult(FsError.Failed, ex6.Message), Text: null);
		}
	}
}
