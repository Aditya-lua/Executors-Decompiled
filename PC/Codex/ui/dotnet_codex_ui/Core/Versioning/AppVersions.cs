using System.Reflection;

namespace dotnet_codex_ui.Core.Versioning;

public static class AppVersions
{
	public static string UI { get; } = Read();

	public static string Roblox => RobloxVersion.Detect() ?? "Unavailable";

	private static string Read()
	{
		string text = typeof(AppVersions).Assembly.GetCustomAttribute<AssemblyInformationalVersionAttribute>()?.InformationalVersion;
		if (string.IsNullOrWhiteSpace(text))
		{
			return "unknown";
		}
		int num = text.IndexOf('+');
		if (num < 0)
		{
			return text;
		}
		return text.Substring(0, num);
	}
}
