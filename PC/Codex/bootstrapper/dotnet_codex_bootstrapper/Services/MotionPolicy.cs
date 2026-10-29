using System;
using System.Runtime.InteropServices;
using System.Windows;

namespace dotnet_codex_bootstrapper.Services;

public static class MotionPolicy
{
	private const uint SPI_GETCLIENTAREAANIMATION = 4162u;

	public static bool? Override { get; set; }

	public static bool Enabled => Override ?? SystemAnimationsEnabled();

	[DllImport("user32.dll", EntryPoint = "SystemParametersInfoW", SetLastError = true)]
	private static extern bool SystemParametersInfo(uint Action, uint Param, out int Value, uint Flags);

	private static bool SystemAnimationsEnabled()
	{
		try
		{
			if (SystemParametersInfo(4162u, 0u, out var Value, 0u))
			{
				return Value != 0;
			}
		}
		catch (Exception)
		{
		}
		return SystemParameters.ClientAreaAnimation;
	}
}
