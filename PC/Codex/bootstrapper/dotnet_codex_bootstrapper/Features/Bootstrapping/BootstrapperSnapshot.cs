using System;
using System.Collections.Generic;

namespace dotnet_codex_bootstrapper.Features.Bootstrapping;

public sealed record BootstrapperSnapshot(BootstrapperStage Stage, string Title, string Description, double? Progress, string Operation, string Footer, BootstrapperOutcome Outcome = BootstrapperOutcome.Running, string? CurrentFile = null, double? DownloadBytesPerSecond = null, double? ExtractionBytesPerSecond = null, double? ExtractionFilesPerSecond = null, string? CurrentVersion = null, string? TargetVersion = null, bool ExitRequested = false)
{
	public static BootstrapperSnapshot Initial { get; } = new BootstrapperSnapshot(BootstrapperStage.Checking, "Starting", "Preparing the bootstrapper.", null, "Starting", string.Empty);

	public double ProgressValue => Math.Clamp(Progress.GetValueOrDefault(), 0.0, 100.0);

	public bool IsIndeterminate
	{
		get
		{
			if (!Progress.HasValue)
			{
				return Outcome == BootstrapperOutcome.Running;
			}
			return false;
		}
	}

	public bool IsFailed => Outcome == BootstrapperOutcome.Failed;

	public bool IsCompleted => Outcome == BootstrapperOutcome.Completed;

	public string PercentText
	{
		get
		{
			if (Progress.HasValue)
			{
				return $"{Math.Round(ProgressValue):0}%";
			}
			return string.Empty;
		}
	}

	public string FileText
	{
		get
		{
			if (!string.IsNullOrWhiteSpace(CurrentFile))
			{
				return CurrentFile;
			}
			return "—";
		}
	}

	public string DownloadText
	{
		get
		{
			double? downloadBytesPerSecond = DownloadBytesPerSecond;
			if (downloadBytesPerSecond.HasValue)
			{
				double valueOrDefault = downloadBytesPerSecond.GetValueOrDefault();
				if (valueOrDefault > 0.0)
				{
					return FormatBytes(valueOrDefault) + "/s";
				}
			}
			return "—";
		}
	}

	public string ExtractionText
	{
		get
		{
			List<string> list = new List<string>();
			double? extractionBytesPerSecond = ExtractionBytesPerSecond;
			if (extractionBytesPerSecond.HasValue)
			{
				double valueOrDefault = extractionBytesPerSecond.GetValueOrDefault();
				if (valueOrDefault > 0.0)
				{
					list.Add(FormatBytes(valueOrDefault) + "/s");
				}
			}
			extractionBytesPerSecond = ExtractionFilesPerSecond;
			if (extractionBytesPerSecond.HasValue)
			{
				double valueOrDefault2 = extractionBytesPerSecond.GetValueOrDefault();
				if (valueOrDefault2 > 0.0)
				{
					list.Add($"{valueOrDefault2:0} files/s");
				}
			}
			if (list.Count != 0)
			{
				return string.Join(" · ", list);
			}
			return "—";
		}
	}

	public string TargetText
	{
		get
		{
			if (!string.IsNullOrWhiteSpace(TargetVersion))
			{
				return TargetVersion;
			}
			return "—";
		}
	}

	public bool HasCurrentVersion
	{
		get
		{
			if (!string.IsNullOrWhiteSpace(TargetVersion))
			{
				return !string.IsNullOrWhiteSpace(CurrentVersion);
			}
			return false;
		}
	}

	public string CurrentVersionText
	{
		get
		{
			if (!HasCurrentVersion)
			{
				return string.Empty;
			}
			return "from " + CurrentVersion;
		}
	}

	public string StepText
	{
		get
		{
			if (Outcome != BootstrapperOutcome.Failed)
			{
				return $"Step {(int)(Stage + 1)} of {5}";
			}
			return "Stopped";
		}
	}

	public string StatusText => Outcome switch
	{
		BootstrapperOutcome.Failed => "Failed", 
		BootstrapperOutcome.Completed => "Done", 
		_ => "Working", 
	};

	public const string Placeholder = "—";

	public const int StageCount = 5;

	public static string FormatBytes(double Bytes)
	{
		if (!(Bytes >= 1073741824.0))
		{
			if (!(Bytes >= 1048576.0))
			{
				if (Bytes >= 1024.0)
				{
					return $"{Bytes / 1024.0:0} KB";
				}
				return $"{Bytes:0} B";
			}
			return $"{Bytes / 1048576.0:0.0} MB";
		}
		return $"{Bytes / 1073741824.0:0.0} GB";
	}
}
