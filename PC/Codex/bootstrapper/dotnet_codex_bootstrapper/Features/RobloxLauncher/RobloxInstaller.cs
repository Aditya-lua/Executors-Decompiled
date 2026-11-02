using System;
using System.Collections.Concurrent;
using System.Collections.Generic;
using System.Diagnostics;
using System.IO;
using System.IO.Compression;
using System.Linq;
using System.Runtime.InteropServices;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using dotnet_codex_bootstrapper.Features.Bootstrapping;
using dotnet_codex_bootstrapper.Infrastructure;
using dotnet_codex_bootstrapper.Services;

namespace dotnet_codex_bootstrapper.Features.RobloxLauncher;

public sealed class RobloxInstaller(string Root, FileDownloader? Downloader, Func<string, bool>? IsSigned = null, Func<IReadOnlyCollection<string>?>? RunningImages = null)
{
	private sealed class Immediate(Action<DownloadProgress> Handler) : IProgress<DownloadProgress>
	{
		public void Report(DownloadProgress Value)
		{
			Handler(Value);
		}
	}

	public const string Marker = ".codex-installed";

	public const int Parallel = 4;

	public const string AppSettings = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n<Settings>\r\n\t<ContentFolder>content</ContentFolder>\r\n\t<BaseUrl>http://www.roblox.com</BaseUrl>\r\n</Settings>\r\n";

	private readonly Func<string, bool> Signed = IsSigned ?? new Func<string, bool>(RobloxSignature.IsRobloxSigned);

	private readonly Func<IReadOnlyCollection<string>?> Running = RunningImages ?? new Func<IReadOnlyCollection<string>>(RunningRobloxImages);

	public string Versions => Path.Combine(Root, "versions");

	public string Downloads => Path.Combine(Root, "downloads");

	public string Staging => Path.Combine(Root, "staging");

	public string FolderOf(string Guid)
	{
		if (!RobloxDeployment.GuidPattern().IsMatch(Guid))
		{
			throw new RobloxLauncherException("The Roblox version name is not valid.");
		}
		return Path.Combine(Versions, Guid);
	}

	public string ExecutableOf(string Guid)
	{
		return Path.Combine(FolderOf(Guid), "RobloxPlayerBeta.exe");
	}

	public bool IsInstalled(string Guid)
	{
		if (File.Exists(ExecutableOf(Guid)))
		{
			return File.Exists(Path.Combine(FolderOf(Guid), ".codex-installed"));
		}
		return false;
	}

	public bool Verify(string Guid)
	{
		return Signed(ExecutableOf(Guid));
	}

	public async Task InstallAsync(RobloxBuild Build, IReadOnlyList<RobloxPackage> Packages, IProgress<InstallProgress>? Progress, CancellationToken Cancel)
	{
		if (Downloader == null)
		{
			throw new InvalidOperationException("No downloader was given.");
		}
		IReadOnlyList<RobloxPackage> Wanted = RobloxDeployment.Installable(Packages);
		string Final = FolderOf(Build.Guid);
		Directory.CreateDirectory(Downloads);
		long num = Wanted.Where((RobloxPackage Package) => !File.Exists(Path.Combine(Downloads, Package.Md5))).Sum((RobloxPackage Package) => Package.PackedSize) + Wanted.Sum((RobloxPackage Package) => Package.Size);
		long availableFreeSpace = new DriveInfo(Path.GetPathRoot(Path.GetFullPath(Root))).AvailableFreeSpace;
		if (availableFreeSpace < num)
		{
			throw new RobloxLauncherException($"Not enough disk space to install Roblox ({BootstrapperFormat(num)} needed, {BootstrapperFormat(availableFreeSpace)} free).");
		}
		long Total = Wanted.Sum((RobloxPackage Package) => Package.PackedSize);
		ConcurrentDictionary<string, long> Done = new ConcurrentDictionary<string, long>();
		double Speed = 0.0;
		await System.Threading.Tasks.Parallel.ForEachAsync(Wanted.OrderByDescending((RobloxPackage Package) => Package.PackedSize), new ParallelOptions
		{
			MaxDegreeOfParallelism = 4,
			CancellationToken = Cancel
		}, async (RobloxPackage Package, CancellationToken Token) =>
		{
			Immediate progress = new Immediate((DownloadProgress Item) =>
			{
				Done[Package.Name] = Item.BytesDone;
				Speed = ((Item.BytesPerSecond > 0.0) ? Item.BytesPerSecond : Speed);
				Progress?.Report(new InstallProgress(Done.Values.Sum(), Total, Speed, Package.Name));
			});
			await Downloader.DownloadAsync(RobloxDeployment.PackageUrl(Build, Package.Name), Path.Combine(Downloads, Package.Md5), Package.PackedSize, Package.Md5, null, progress, Token);
		});
		string Stage = Path.Combine(Staging, Build.Guid);
		DeleteDirectory(Stage);
		Directory.CreateDirectory(Stage);
		foreach (RobloxPackage item in Wanted)
		{
			Cancel.ThrowIfCancellationRequested();
			Progress?.Report(new InstallProgress(Total, Total, 0.0, "Extracting " + item.Name));
			Extract(Path.Combine(Downloads, item.Md5), Stage, RobloxDeployment.PackageFolders[item.Name]);
		}
		await File.WriteAllTextAsync(Path.Combine(Stage, "AppSettings.xml"), "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n<Settings>\r\n\t<ContentFolder>content</ContentFolder>\r\n\t<BaseUrl>http://www.roblox.com</BaseUrl>\r\n</Settings>\r\n", Cancel);
		if (!Signed(Path.Combine(Stage, "RobloxPlayerBeta.exe")))
		{
			DeleteDirectory(Stage);
			throw new RobloxLauncherException("The downloaded Roblox player is not signed by Roblox Corporation.");
		}
		await File.WriteAllTextAsync(Path.Combine(Stage, ".codex-installed"), Build.Version + " " + Build.Guid, Cancel);
		if (Directory.Exists(Final))
		{
			if (InUse(Final, Running()))
			{
				throw new RobloxLauncherException("An unfinished copy of this Roblox version is in use.");
			}
			DeleteDirectory(Final);
		}
		Directory.CreateDirectory(Versions);
		Directory.Move(Stage, Final);
		AppLog.Information("Roblox {Version} ({Guid}) installed", Build.Version, Build.Guid);
		DeleteDirectory(Downloads);
	}

	public static void Extract(string Archive, string Stage, string Folder)
	{
		string text = Path.GetFullPath(Stage).TrimEnd(Path.DirectorySeparatorChar) + Path.DirectorySeparatorChar;
		using ZipArchive zipArchive = ZipFile.OpenRead(Archive);
		foreach (ZipArchiveEntry entry in zipArchive.Entries)
		{
			string text2 = entry.FullName.Replace('\\', '/');
			if (text2.Length != 0 && !text2.EndsWith('/'))
			{
				string text3 = SafeTarget(text, Folder + text2) ?? throw new RobloxLauncherException("A Roblox package contains an unsafe path (" + text2 + ").");
				Directory.CreateDirectory(Path.GetDirectoryName(text3));
				entry.ExtractToFile(text3, overwrite: true);
			}
		}
	}

	public static string? SafeTarget(string Base, string Relative)
	{
		if (Relative.Contains(':') || Relative.StartsWith('/') || Path.IsPathRooted(Relative))
		{
			return null;
		}
		string fullPath = Path.GetFullPath(Path.Combine(Base, Relative.Replace('/', Path.DirectorySeparatorChar)));
		if (!fullPath.StartsWith(Base, StringComparison.OrdinalIgnoreCase) || fullPath.Length <= Base.Length)
		{
			return null;
		}
		return fullPath;
	}

	public void Remove(string Guid)
	{
		string folder = FolderOf(Guid);
		if (!InUse(folder, Running()))
		{
			DeleteDirectory(folder);
		}
	}

	public void Cleanup(string Keep)
	{
		DeleteDirectory(Staging);
		if (!Directory.Exists(Versions))
		{
			return;
		}
		IReadOnlyCollection<string> images = Running();
		foreach (string item in Directory.EnumerateDirectories(Versions))
		{
			string fileName = Path.GetFileName(item);
			if (!fileName.Equals(Keep, StringComparison.OrdinalIgnoreCase) && RobloxDeployment.GuidPattern().IsMatch(fileName) && !InUse(item, images))
			{
				DeleteDirectory(item);
				AppLog.Information("Removed the old Roblox version {Guid}", fileName);
			}
		}
	}

	public static bool InUse(string Folder, IReadOnlyCollection<string>? Images)
	{
		if (Images == null)
		{
			return true;
		}
		string Prefix = Path.GetFullPath(Folder).TrimEnd(Path.DirectorySeparatorChar) + Path.DirectorySeparatorChar;
		return Images.Any((string Image) => Image.StartsWith(Prefix, StringComparison.OrdinalIgnoreCase));
	}

	public static IReadOnlyCollection<string>? RunningRobloxImages()
	{
		List<string> list = new List<string>();
		Process[] processesByName = Process.GetProcessesByName(Path.GetFileNameWithoutExtension("RobloxPlayerBeta.exe"));
		foreach (Process process in processesByName)
		{
			using (process)
			{
				string text = ImageOf(process.Id);
				if (text == null)
				{
					return null;
				}
				list.Add(text);
			}
		}
		return list;
	}

	private static string? ImageOf(int ProcessId)
	{
		nint num = OpenProcess(4096, Inherit: false, ProcessId);
		if (num == IntPtr.Zero)
		{
			return null;
		}
		try
		{
			StringBuilder stringBuilder = new StringBuilder(1024);
			int Size = stringBuilder.Capacity;
			return QueryFullProcessImageName(num, 0, stringBuilder, ref Size) ? stringBuilder.ToString(0, Size) : null;
		}
		finally
		{
			CloseHandle(num);
		}
	}

	private static void DeleteDirectory(string Folder)
	{
		try
		{
			if (Directory.Exists(Folder))
			{
				Directory.Delete(Folder, recursive: true);
			}
		}
		catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException) ? true : false)
		{
			AppLog.Warning(ex, "Could not delete {Path}", Folder);
		}
	}

	private static string BootstrapperFormat(long Bytes)
	{
		return BootstrapperSnapshot.FormatBytes(Bytes);
	}

	[DllImport("kernel32.dll", SetLastError = true)]
	private static extern nint OpenProcess(int Access, bool Inherit, int ProcessId);

	[DllImport("kernel32.dll", CharSet = CharSet.Unicode, SetLastError = true)]
	private static extern bool QueryFullProcessImageName(nint Process, int Flags, StringBuilder Name, ref int Size);

	[DllImport("kernel32.dll")]
	private static extern bool CloseHandle(nint Handle);
}
