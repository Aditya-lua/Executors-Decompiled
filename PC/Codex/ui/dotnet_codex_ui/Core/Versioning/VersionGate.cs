using System;
using System.Threading;
using System.Threading.Tasks;
using dotnet_codex_ui.Infrastructure.Logging;

namespace dotnet_codex_ui.Core.Versioning;

internal static class VersionGate
{
	internal static GateDecision Decide(UpdateResult Result)
	{
		string text = "Installed: " + Result.Local + "\r\nRequired (published): " + (Result.Published ?? "unknown");
		switch (Result.Status)
		{
		case UpdateStatus.UpToDate:
		case UpdateStatus.LocalIsNewer:
			return new GateDecision(GateOutcome.Allowed, "", "", text, CanRetry: false);
		case UpdateStatus.UpdateAvailable:
			return new GateDecision(GateOutcome.Outdated, "Codex Is Out of Date", $"This version of Codex ({Result.Local}) is older than the required version ({Result.Published}). Update Codex, then start it again.", text, CanRetry: false);
		case UpdateStatus.Invalid:
			return new GateDecision(GateOutcome.Invalid, "Version Information Is Not Valid", $"Codex could not compare versions because one of them is not valid (installed '{Result.Local}', published '{Result.Published ?? "none"}').", text, CanRetry: true);
		default:
			return new GateDecision(GateOutcome.Unverified, "Couldn't Verify the Codex Version", "Codex could not check the required version, so it will not start. Check your internet connection and try again.", text + "\r\nReason: " + (VersionService.Error ?? "no answer"), CanRetry: true);
		}
	}

	public static async Task<GateDecision> EvaluateAsync(CancellationToken Cancel = default(CancellationToken))
	{
		using LogOperation Operation = AppLog.Begin("VersionGate");
		try
		{
			await VersionService.RefreshAsync(Force: true, Cancel);
			UpdateResult update = VersionService.Update;
			GateDecision gateDecision = Decide(update);
			AppLog.Information("Version gate: installed {Installed}, required {Required}, status {Status}, outcome {Outcome}", update.Local, update.Published, update.Status, gateDecision.Outcome);
			Operation.Complete(gateDecision.Outcome.ToString());
			return gateDecision;
		}
		catch (Exception ex)
		{
			Operation.Fail(ex);
			return new GateDecision(GateOutcome.Unverified, "Couldn't Verify the Codex Version", "Codex could not check the required version, so it will not start. Check your internet connection and try again.", "Error: " + ex.Message, CanRetry: true);
		}
	}
}
