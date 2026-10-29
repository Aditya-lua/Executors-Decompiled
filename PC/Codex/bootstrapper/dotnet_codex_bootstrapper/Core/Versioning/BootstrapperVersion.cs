using System.Reflection;

namespace dotnet_codex_bootstrapper.Core.Versioning;

public static class BootstrapperVersion
{
	public const string Unknown = "unknown";

	public static string Display { get; } = Read(typeof(BootstrapperVersion).Assembly);

	public static ReleaseVersion? Current
	{
		get
		{
			if (!ReleaseVersion.TryParse(Display, out ReleaseVersion Version))
			{
				return null;
			}
			return Version;
		}
	}

	public static string Read(Assembly Source)
	{
		string text = Source.GetCustomAttribute<AssemblyInformationalVersionAttribute>()?.InformationalVersion;
		if (string.IsNullOrWhiteSpace(text))
		{
			return "unknown";
		}
		int num = text.IndexOf('+');
		string text2 = ((num >= 0) ? text.Substring(0, num) : text);
		if (!ReleaseVersion.TryParse(text2, out ReleaseVersion _))
		{
			return "unknown";
		}
		return text2;
	}
}
