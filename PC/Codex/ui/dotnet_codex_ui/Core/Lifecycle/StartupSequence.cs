using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using dotnet_codex_ui.Configuration;
using dotnet_codex_ui.Core.Integrity;
using dotnet_codex_ui.Core.Versioning;
using dotnet_codex_ui.Infrastructure.FileSystem;
using dotnet_codex_ui.Infrastructure.Logging;

namespace dotnet_codex_ui.Core.Lifecycle;

internal static class StartupSequence
{
	internal static string InstanceName = "Global\\CodexMutex";

	internal static Func<string, string, string, bool, GateChoice> ShowGate = (string Heading, string Summary, string Details, bool CanRetry) =>
	{
		StartupGateWindow startupGateWindow = new StartupGateWindow(Heading, Summary, Details, CanRetry);
		startupGateWindow.ShowDialog();
		return startupGateWindow.Choice;
	};

	internal static SingleInstance? Instance { get; set; }

	public static async Task<bool> RunAsync()
	{
		using LogOperation Operation = AppLog.Begin("Startup");
		try
		{
			if (!ElevationCheck.IsElevated())
			{
				ShowGate("Administrator Rights Required", "Codex must run as administrator. Start it again from its shortcut and accept the Windows prompt.", "Process account: " + Environment.UserName, arg4: false);
				Operation.Complete("blocked: not elevated");
				return false;
			}
			Instance = new SingleInstance(InstanceName);
			switch (Instance.TryAcquire())
			{
			case InstanceResult.AlreadyRunning:
				SingleInstance.FocusExisting();
				Operation.Complete("another instance is running");
				Instance.Dispose();
				Instance = null;
				return false;
			case InstanceResult.Failed:
				ShowGate("Couldn't Check for Another Codex", "Codex could not tell whether it is already running, so it will not start.", "See the log for details.", arg4: false);
				Instance.Dispose();
				Instance = null;
				Operation.Complete("blocked: mutex failure");
				return false;
			default:
			{
				IReadOnlyList<DirectoryResult> Folders = AppDirectories.EnsureAll();
				RegistryConfiguration.EnsureDefaults();
				while (true)
				{
					GateDecision gateDecision = await VersionGate.EvaluateAsync();
					if (gateDecision.Allowed)
					{
						break;
					}
					AppLog.Warning("Startup blocked by the version gate: {Outcome}", gateDecision.Outcome);
					if (ShowGate(gateDecision.Title, gateDecision.Summary, gateDecision.Details, gateDecision.CanRetry) != GateChoice.Retry)
					{
						Operation.Complete($"blocked: version {gateDecision.Outcome}");
						return false;
					}
				}
				while (true)
				{
					StartupReport startupReport = StartupValidator.Run(null, Folders);
					if (startupReport.CanStart)
					{
						break;
					}
					AppLog.Warning("Startup blocked by validation: {Failures} required checks failed", startupReport.BlockingFailures.Count());
					StringBuilder stringBuilder = new StringBuilder(startupReport.ToText());
					if (ShowGate("Codex Is Missing Required Files", "Codex cannot start because required files or settings are missing or invalid. Reinstall or rebuild Codex, then start it again.", stringBuilder.ToString(), arg4: true) != GateChoice.Retry)
					{
						Operation.Complete("blocked: validation");
						return false;
					}
				}
				Operation.Complete("passed");
				return true;
			}
			}
		}
		catch (Exception ex)
		{
			Operation.Fail(ex);
			ShowGate("Codex Could Not Start", ex.Message, ex.ToString(), arg4: false);
			return false;
		}
	}
}
