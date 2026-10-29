using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.InteropServices;
using System.Threading;
using System.Threading.Tasks;
using dotnet_codex_bootstrapper.Services;

namespace dotnet_codex_bootstrapper.Features.Bootstrapping.Demo;

public sealed class DemoBootstrapperFlow : IBootstrapperFlow
{
	public const int TickMilliseconds = 50;

	private const double TickSeconds = 0.05;

	private readonly DemoScenario Scenario;

	private readonly Func<CancellationToken, Task> Wait;

	private string CurrentVersion
	{
		get
		{
			if (!Scenario.BootstrapperUpdate)
			{
				return "4.4.0-stable.20260907";
			}
			return "1.4.2-stable.20261024";
		}
	}

	private string TargetVersion
	{
		get
		{
			if (!Scenario.BootstrapperUpdate)
			{
				return "4.5.0-stable.20261101";
			}
			return "1.5.0-stable.20261101";
		}
	}

	public DemoBootstrapperFlow(DemoScenario Scenario, Func<CancellationToken, Task>? Wait = null)
	{
		Scenario.Validate();
		this.Scenario = Scenario;
		this.Wait = Wait ?? ((Func<CancellationToken, Task>)((CancellationToken Cancel) => Task.Delay(50, Cancel)));
	}

	public async Task RunAsync(IProgress<BootstrapperSnapshot> Progress, CancellationToken Cancel)
	{
		Random Random = new Random(Scenario.Name.Sum((char Letter) => Letter));
		DemoLog.Write("Scenario " + Scenario.Name + " started");
		await CheckAsync(Progress, Cancel);
		List<DemoFile> Downloads = PlanDownloads(await VerifyAsync(Progress, Cancel));
		if (Downloads.Count > 0)
		{
			if (!(await DownloadAsync(Downloads, Random, Progress, Cancel)))
			{
				DemoLog.Write("Scenario " + Scenario.Name + " failed (simulated)");
				return;
			}
			await InstallAsync(Downloads, Random, Progress, Cancel);
		}
		await LaunchAsync(Downloads.Count > 0, Progress, Cancel);
		DemoLog.Write("Scenario " + Scenario.Name + " completed");
	}

	private async Task Tick(int Count, CancellationToken Cancel)
	{
		for (int Index = 0; Index < Count; Index++)
		{
			Cancel.ThrowIfCancellationRequested();
			await Wait(Cancel);
		}
		Cancel.ThrowIfCancellationRequested();
	}

	private async Task CheckAsync(IProgress<BootstrapperSnapshot> Progress, CancellationToken Cancel)
	{
		Progress.Report(new BootstrapperSnapshot(BootstrapperStage.Checking, "Checking for updates", "Asking the update service which versions are current.", null, "Contacting the update service", "Simulated check · no network is used", BootstrapperOutcome.Running, null, null, null, null, "1.4.2-stable.20261024"));
		await Tick(12, Cancel);
		string description = (Scenario.BootstrapperUpdate ? "A bootstrapper update is available." : "The bootstrapper is up to date.");
		string targetVersion = (Scenario.BootstrapperUpdate ? "1.5.0-stable.20261101" : null);
		Progress.Report(new BootstrapperSnapshot(BootstrapperStage.Checking, "Checking for updates", description, null, "Comparing versions", "Simulated check · no network is used", BootstrapperOutcome.Running, null, null, null, null, "1.4.2-stable.20261024", targetVersion));
		await Tick(12, Cancel);
	}

	private async Task<IReadOnlyList<string>> VerifyAsync(IProgress<BootstrapperSnapshot> Progress, CancellationToken Cancel)
	{
		List<string> Files = DemoFileCatalog.IntegrityPool.Take(Scenario.IntegrityFiles).ToList();
		HashSet<int> Damaged = (from Slot in Enumerable.Range(0, Scenario.MalformedFiles)
			select (Slot * Files.Count / Math.Max(1, Scenario.MalformedFiles) + 2) % Files.Count).ToHashSet();
		List<string> Repairs = new List<string>();
		for (int Index = 0; Index < Files.Count; Index++)
		{
			await Tick(2, Cancel);
			bool flag = Damaged.Contains(Index);
			if (flag)
			{
				Repairs.Add(Files[Index]);
			}
			Progress.Report(new BootstrapperSnapshot(BootstrapperStage.Integrity, "Checking file integrity", "Comparing installed files with the expected hashes.", (double)(Index + 1) * 100.0 / (double)Files.Count, flag ? "Hash mismatch, queued for repair" : "Verifying file", $"Verified {Index + 1} of {Files.Count} · {Repairs.Count} need repair", BootstrapperOutcome.Running, Files[Index], null, null, null, "4.4.0-stable.20260907"));
		}
		Progress.Report(new BootstrapperSnapshot(BootstrapperStage.Integrity, "Checking file integrity", (Repairs.Count == 0) ? "All files are intact." : $"{Repairs.Count} damaged files will be repaired.", 100.0, "Verification complete", $"Verified {Files.Count} of {Files.Count} · {Repairs.Count} need repair", BootstrapperOutcome.Running, null, null, null, null, "4.4.0-stable.20260907"));
		await Tick(8, Cancel);
		return Repairs;
	}

	private List<DemoFile> PlanDownloads(IReadOnlyList<string> Repairs)
	{
		if (Scenario.BootstrapperUpdate)
		{
			int num = 1;
			List<DemoFile> list = new List<DemoFile>(num);
			CollectionsMarshal.SetCount(list, num);
			CollectionsMarshal.AsSpan(list)[0] = DemoFileCatalog.Bootstrapper;
			return list;
		}
		List<DemoFile> list2 = Repairs.Select((string Name) => new DemoFile(Name, DemoFileCatalog.SizeOf(Name))).ToList();
		foreach (DemoFile Update in DemoFileCatalog.UpdatePool.Take(Scenario.UpdatedFiles))
		{
			if (list2.All((DemoFile Existing) => Existing.Name != Update.Name))
			{
				list2.Add(Update);
			}
		}
		return list2;
	}

	private async Task<bool> DownloadAsync(List<DemoFile> Files, Random Random, IProgress<BootstrapperSnapshot> Progress, CancellationToken Cancel)
	{
		long Total = Files.Sum((DemoFile File) => File.Bytes);
		double Base = (Scenario.BootstrapperUpdate ? 2306867.2 : 16777216.0);
		double Done = 0.0;
		for (int Index = 0; Index < Files.Count; Index++)
		{
			double FileDone = 0.0;
			int Ticks = 0;
			while (FileDone < (double)Files[Index].Bytes)
			{
				await Tick(1, Cancel);
				double num = Base * (0.7 + 0.6 * Random.NextDouble());
				double num2 = Math.Min(num * 0.05, (double)Files[Index].Bytes - FileDone);
				FileDone += num2;
				Done += num2;
				Ticks++;
				double num3 = Math.Min(100.0, Done * 100.0 / (double)Total);
				double? failAtDownloadPercent = Scenario.FailAtDownloadPercent;
				if (failAtDownloadPercent.HasValue)
				{
					double valueOrDefault = failAtDownloadPercent.GetValueOrDefault();
					if (num3 >= valueOrDefault)
					{
						string description = "Couldn't download " + Files[Index].Name + ". This failure is simulated.";
						double? progress = num3;
						string name = Files[Index].Name;
						string currentVersion = CurrentVersion;
						string targetVersion = TargetVersion;
						Progress.Report(new BootstrapperSnapshot(BootstrapperStage.Downloading, "Update failed", description, progress, "Stopped", "Nothing was changed", BootstrapperOutcome.Failed, name, null, null, null, currentVersion, targetVersion));
						return false;
					}
				}
				if (Ticks % 2 == 0 || FileDone >= (double)Files[Index].Bytes)
				{
					string title = (Scenario.BootstrapperUpdate ? "Downloading bootstrapper update" : "Downloading updates");
					string description2 = (Scenario.BootstrapperUpdate ? "Fetching the new bootstrapper executable." : "Fetching changed application files.");
					double? progress2 = num3;
					string operation = (Scenario.BootstrapperUpdate ? "Downloading executable" : "Downloading file");
					string footer = $"File {Index + 1} of {Files.Count} · {BootstrapperSnapshot.FormatBytes(Done)} of {BootstrapperSnapshot.FormatBytes(Total)}";
					string name2 = Files[Index].Name;
					double? downloadBytesPerSecond = num;
					string targetVersion = CurrentVersion;
					string currentVersion = TargetVersion;
					Progress.Report(new BootstrapperSnapshot(BootstrapperStage.Downloading, title, description2, progress2, operation, footer, BootstrapperOutcome.Running, name2, downloadBytesPerSecond, null, null, targetVersion, currentVersion));
				}
			}
		}
		return true;
	}

	private async Task InstallAsync(List<DemoFile> Files, Random Random, IProgress<BootstrapperSnapshot> Progress, CancellationToken Cancel)
	{
		long Total = Files.Sum((DemoFile File) => File.Bytes);
		double Base = 41943040.0;
		double Done = 0.0;
		for (int Index = 0; Index < Files.Count; Index++)
		{
			double FileDone = 0.0;
			int Ticks = 0;
			while (FileDone < (double)Files[Index].Bytes)
			{
				await Tick(1, Cancel);
				double num = Base * (0.8 + 0.4 * Random.NextDouble());
				double num2 = Math.Min(num * 0.05, (double)Files[Index].Bytes - FileDone);
				FileDone += num2;
				Done += num2;
				Ticks++;
				if (Ticks % 2 == 0 || FileDone >= (double)Files[Index].Bytes)
				{
					double? progress = Math.Min(100.0, Done * 100.0 / (double)Total);
					string operation = (Scenario.BootstrapperUpdate ? "Preparing bootstrapper update" : "Extracting package");
					string footer = $"Entry {Index + 1} of {Files.Count} · {BootstrapperSnapshot.FormatBytes(Done)} of {BootstrapperSnapshot.FormatBytes(Total)}";
					string name = Files[Index].Name;
					double? extractionBytesPerSecond = num;
					double? extractionFilesPerSecond = 3.0 + 6.0 * Random.NextDouble();
					string currentVersion = CurrentVersion;
					string targetVersion = TargetVersion;
					Progress.Report(new BootstrapperSnapshot(BootstrapperStage.Installing, "Installing updates", "Applying the downloaded files.", progress, operation, footer, BootstrapperOutcome.Running, name, null, extractionBytesPerSecond, extractionFilesPerSecond, currentVersion, targetVersion));
				}
			}
		}
		await Tick(6, Cancel);
	}

	private async Task LaunchAsync(bool Installed, IProgress<BootstrapperSnapshot> Progress, CancellationToken Cancel)
	{
		string Detail;
		if (Scenario.BootstrapperUpdate)
		{
			Detail = "The new bootstrapper would launch now and this instance would close.";
		}
		else
		{
			Detail = (Installed ? "Everything is ready. Nothing is launched in this simulation." : "Nothing needed updating. Nothing is launched in this simulation.");
		}
		string operation = (Scenario.BootstrapperUpdate ? "Handing over (simulated)" : "Finishing up (simulated)");
		string footer = (Installed ? "Updates applied in the simulation" : "Download and install were skipped");
		string currentVersion = (Scenario.BootstrapperUpdate ? "1.5.0-stable.20261101" : "4.4.0-stable.20260907");
		Progress.Report(new BootstrapperSnapshot(BootstrapperStage.Launching, "Launching", Detail, null, operation, footer, BootstrapperOutcome.Running, null, null, null, null, currentVersion));
		await Tick(14, Cancel);
		double? progress = 100.0;
		currentVersion = (Scenario.BootstrapperUpdate ? "1.5.0-stable.20261101" : "4.4.0-stable.20260907");
		Progress.Report(new BootstrapperSnapshot(BootstrapperStage.Launching, "Launching", Detail, progress, "Finished", "Completed · simulation only", BootstrapperOutcome.Completed, null, null, null, null, currentVersion));
	}
}
