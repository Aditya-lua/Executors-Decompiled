using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace dotnet_codex_ui.Core.Integrity;

internal sealed class StartupReport
{
	public IReadOnlyList<CheckResult> Results { get; }

	public IEnumerable<CheckResult> BlockingFailures => Results.Where((CheckResult R) => !R.Passed && R.Severity == CheckSeverity.Required);

	public IEnumerable<CheckResult> OptionalFailures => Results.Where((CheckResult R) => !R.Passed && R.Severity == CheckSeverity.Optional);

	public bool CanStart => !BlockingFailures.Any();

	public StartupReport(IReadOnlyList<CheckResult> Results)
	{
		this.Results = Results;
	}

	public string ToText()
	{
		StringBuilder stringBuilder = new StringBuilder();
		foreach (CheckResult result in Results)
		{
			string value;
			if (result.Passed)
			{
				value = "OK  ";
			}
			else
			{
				value = ((result.Severity == CheckSeverity.Required) ? "FAIL" : "WARN");
			}
			stringBuilder.Append('[').Append(value).Append("] ")
				.Append(result.Name);
			if (result.Detail.Length > 0)
			{
				stringBuilder.Append(" - ").Append(result.Detail);
			}
			stringBuilder.AppendLine();
		}
		return stringBuilder.ToString();
	}
}
