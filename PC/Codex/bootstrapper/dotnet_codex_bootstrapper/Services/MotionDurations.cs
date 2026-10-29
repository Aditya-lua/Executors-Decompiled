using System;
using System.Windows;

namespace dotnet_codex_bootstrapper.Services;

public static class MotionDurations
{
	public static Duration Fast
	{
		get
		{
			if (!MotionPolicy.Enabled)
			{
				return new Duration(TimeSpan.Zero);
			}
			return new Duration(TimeSpan.FromMilliseconds(120L));
		}
	}

	public static Duration Normal
	{
		get
		{
			if (!MotionPolicy.Enabled)
			{
				return new Duration(TimeSpan.Zero);
			}
			return new Duration(TimeSpan.FromMilliseconds(180L));
		}
	}

	public static Duration Sweep
	{
		get
		{
			if (!MotionPolicy.Enabled)
			{
				return new Duration(TimeSpan.Zero);
			}
			return new Duration(TimeSpan.FromMilliseconds(1100L));
		}
	}
}
