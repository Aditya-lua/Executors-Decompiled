using System;
using System.Windows;

namespace dotnet_codex_ui.Services;

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

	public static Duration Press
	{
		get
		{
			if (!MotionPolicy.Enabled)
			{
				return new Duration(TimeSpan.Zero);
			}
			return new Duration(TimeSpan.FromMilliseconds(70L));
		}
	}

	public static Duration Navigation
	{
		get
		{
			if (!MotionPolicy.Enabled)
			{
				return new Duration(TimeSpan.Zero);
			}
			return new Duration(TimeSpan.FromMilliseconds(500L));
		}
	}

	public static Duration Tooltip
	{
		get
		{
			if (!MotionPolicy.Enabled)
			{
				return new Duration(TimeSpan.Zero);
			}
			return new Duration(TimeSpan.FromMilliseconds(500L));
		}
	}

	public static Duration Exit
	{
		get
		{
			if (!MotionPolicy.Enabled)
			{
				return new Duration(TimeSpan.Zero);
			}
			return new Duration(TimeSpan.FromMilliseconds(200L));
		}
	}
}
