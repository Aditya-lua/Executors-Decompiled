using System;
using dotnet_codex_ui.Infrastructure.Windows;

namespace dotnet_codex_ui.Configuration;

internal static class SettingLimits
{
	public const int FpsMin = 10;

	public const int FpsMax = 360;

	public const int FpsDefault = 60;

	public const int CpuMin = 5;

	public const int CpuMax = 100;

	public const int EditorFontMin = 8;

	public const int EditorFontMax = 24;

	public const int EditorFontDefault = 12;

	public const int MemoryMinMb = 512;

	public const int MemoryStepMb = 64;

	public const int TetherPortMin = 1024;

	public const int TetherPortMax = 65535;

	public const int TetherPortDefault = 47100;

	public const int TetherHandshakeMinMs = 500;

	public const int TetherHandshakeMaxMs = 30000;

	public const int TetherHandshakeDefaultMs = 3000;

	public const int AutoInjectDelayMin = 1;

	public const int AutoInjectDelayMax = 300;

	public const int AutoInjectDelayDefault = 5;

	public static readonly string[] MinimapModes = new string[3] { "Off", "Left", "Right" };

	public static int MemoryMaxMb => Math.Max(512, HardwareInfo.InstalledMemoryMb / 64 * 64);
}
