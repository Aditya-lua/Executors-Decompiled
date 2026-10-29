using System;
using System.IO;
using System.Runtime.CompilerServices;
using dotnet_codex_bootstrapper.Infrastructure;

namespace dotnet_codex_bootstrapper.Services;

public sealed record ShortcutLocations(string? Desktop, string? StartMenu)
{
	public static ShortcutLocations Resolve()
	{
		try
		{
			string profile = InteractiveProfile.Profile;
			if (string.Equals(profile, Environment.GetFolderPath(Environment.SpecialFolder.UserProfile), StringComparison.OrdinalIgnoreCase))
			{
				return new ShortcutLocations(Environment.GetFolderPath(Environment.SpecialFolder.DesktopDirectory), Environment.GetFolderPath(Environment.SpecialFolder.Programs));
			}
			string desktop = Path.Combine(profile, "Desktop");
			InlineArray7<string> buffer = default;
			buffer[0] = profile;
			buffer[1] = "AppData";
			buffer[2] = "Roaming";
			buffer[3] = "Microsoft";
			buffer[4] = "Windows";
			buffer[5] = "Start Menu";
			buffer[6] = "Programs";
			return new ShortcutLocations(desktop, Path.Combine(buffer));
		}
		catch (Exception error)
		{
			AppLog.Warning(error, "The shortcut folders could not be resolved");
			return new ShortcutLocations(null, null);
		}
	}
}
