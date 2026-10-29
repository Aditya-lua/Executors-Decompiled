using System;
using System.Security.Principal;
using dotnet_codex_ui.Infrastructure.Logging;

namespace dotnet_codex_ui.Core.Lifecycle;

internal static class ElevationCheck
{
	internal static Func<bool> Probe = () =>
	{
		using WindowsIdentity ntIdentity = WindowsIdentity.GetCurrent();
		return new WindowsPrincipal(ntIdentity).IsInRole(WindowsBuiltInRole.Administrator);
	};

	public static bool IsElevated()
	{
		try
		{
			bool flag = Probe();
			AppLog.Information("Elevation check: elevated {Elevated}, process account {Account}", flag, Environment.UserName);
			return flag;
		}
		catch (Exception failure)
		{
			AppLog.Error(failure, null, "IsElevated", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Core\\Lifecycle\\ElevationCheck.cs");
			return false;
		}
	}
}
