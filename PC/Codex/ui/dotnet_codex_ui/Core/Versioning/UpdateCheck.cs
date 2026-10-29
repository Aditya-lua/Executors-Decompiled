namespace dotnet_codex_ui.Core.Versioning;

internal static class UpdateCheck
{
	public static UpdateResult Evaluate(string? Local, string? Published, VersionState State)
	{
		string local = Local ?? "";
		if ((uint)(State - 3) <= 1u)
		{
			return new UpdateResult(UpdateStatus.CheckFailed, local, Published);
		}
		if ((uint)State <= 1u)
		{
			return new UpdateResult(UpdateStatus.Checking, local, Published);
		}
		if (string.IsNullOrWhiteSpace(Published))
		{
			return new UpdateResult(UpdateStatus.CheckFailed, local, null);
		}
		if (!AppVersion.TryParse(Local, out AppVersion Version) || !AppVersion.TryParse(Published, out AppVersion Version2))
		{
			return new UpdateResult(UpdateStatus.Invalid, local, Published);
		}
		int num = Version.CompareTo(Version2);
		return new UpdateResult((num < 0) ? UpdateStatus.UpdateAvailable : ((num == 0) ? UpdateStatus.UpToDate : UpdateStatus.LocalIsNewer), local, Version2.Text);
	}
}
