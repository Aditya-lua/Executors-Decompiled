using System;

namespace dotnet_codex_bootstrapper.Features.Bootstrapping.Demo;

public sealed record DemoScenario(string Name, string Summary, bool BootstrapperUpdate, int IntegrityFiles, int MalformedFiles, int UpdatedFiles, double? FailAtDownloadPercent = null)
{
	public bool NeedsDownload
	{
		get
		{
			if (!BootstrapperUpdate && MalformedFiles <= 0)
			{
				return UpdatedFiles > 0;
			}
			return true;
		}
	}

	public bool Fails => FailAtDownloadPercent.HasValue;

	public void Validate()
	{
		if (string.IsNullOrWhiteSpace(Name))
		{
			throw new ArgumentException("A demo scenario needs a name.");
		}
		if (IntegrityFiles < 1 || IntegrityFiles > DemoFileCatalog.IntegrityPool.Count)
		{
			throw new ArgumentOutOfRangeException("IntegrityFiles");
		}
		if (MalformedFiles < 0 || MalformedFiles > IntegrityFiles)
		{
			throw new ArgumentOutOfRangeException("MalformedFiles");
		}
		if (UpdatedFiles < 0 || UpdatedFiles > DemoFileCatalog.UpdatePool.Count)
		{
			throw new ArgumentOutOfRangeException("UpdatedFiles");
		}
		double? failAtDownloadPercent = FailAtDownloadPercent;
		if (failAtDownloadPercent.HasValue)
		{
			double valueOrDefault = failAtDownloadPercent.GetValueOrDefault();
			if (valueOrDefault <= 0.0 || valueOrDefault >= 100.0 || !NeedsDownload)
			{
				throw new ArgumentOutOfRangeException("FailAtDownloadPercent");
			}
		}
	}
}
