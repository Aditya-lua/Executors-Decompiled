using System;
using System.Collections.Generic;
using System.Linq;
using System.Windows;
using System.Windows.Media;
using Microsoft.Win32;

namespace dotnet_codex_bootstrapper.Services;

public static class AccentTheme
{
	public const string DefaultId = "coral";

	public const string RegistryPath = "Software\\Codex\\UI";

	public const string RegistryValue = "Accent";

	public static IReadOnlyList<AccentOption> Palette { get; } = new _003C_003Ez__ReadOnlyArray<AccentOption>(new AccentOption[7]
	{
		new AccentOption("coral", "Coral", Color.FromRgb(241, 128, 129), Color.FromRgb(74, 40, 44), Color.FromRgb(94, 50, 56), Color.FromRgb(228, 109, 103)),
		Derive("violet", "Violet", "#9C8CF0"),
		Derive("mint", "Mint", "#6CC4A8"),
		Derive("teal", "Teal", "#4FC8C0"),
		Derive("amber", "Amber", "#E8B06A"),
		Derive("sky", "Sky", "#6CB4F0"),
		Derive("rose", "Rose", "#E87AA8")
	});

	public static AccentOption Current { get; private set; } = Palette[0];

	public static event Action? Changed;

	public static AccentOption Resolve(string? Id)
	{
		return Palette.FirstOrDefault((AccentOption Option) => string.Equals(Option.Id, Id, StringComparison.OrdinalIgnoreCase)) ?? Palette[0];
	}

	public static string? ReadStored(string KeyPath = "Software\\Codex\\UI")
	{
		try
		{
			using RegistryKey registryKey = Registry.CurrentUser.OpenSubKey(KeyPath);
			return registryKey?.GetValue("Accent") as string;
		}
		catch (Exception)
		{
			return null;
		}
	}

	public static void Apply(string? Id)
	{
		AccentOption accentOption = (Current = Resolve(Id));
		Set("Page.Accent", accentOption.Accent);
		Set("Page.AccentSurface", accentOption.Surface);
		Set("Page.AccentBorder", accentOption.Border);
		Set("Page.AccentStrong", accentOption.Strong);
		Changed?.Invoke();
	}

	private static AccentOption Derive(string Id, string Name, string Hex)
	{
		Color color = (Color)ColorConverter.ConvertFromString(Hex);
		var (h, s, num) = ToHsl(color);
		return new AccentOption(Id, Name, color, FromHsl(h, 0.3, 0.22), FromHsl(h, 0.3, 0.28), FromHsl(h, s, Math.Max(0.0, num - 0.08)));
	}

	private static void Set(string Key, Color Value)
	{
		ResourceDictionary resourceDictionary = Application.Current?.Resources;
		if (resourceDictionary != null)
		{
			if (resourceDictionary[Key] is SolidColorBrush { IsFrozen: false } solidColorBrush)
			{
				solidColorBrush.Color = Value;
			}
			else
			{
				Replace(resourceDictionary, Key, new SolidColorBrush(Value));
			}
		}
	}

	private static bool Replace(ResourceDictionary Dictionary, string Key, SolidColorBrush Brush)
	{
		if (Dictionary.Contains(Key))
		{
			Dictionary[Key] = Brush;
			return true;
		}
		return Dictionary.MergedDictionaries.Any((ResourceDictionary Merged) => Replace(Merged, Key, Brush));
	}

	private static (double H, double S, double L) ToHsl(Color Value)
	{
		double num = (double)(int)Value.R / 255.0;
		double num2 = (double)(int)Value.G / 255.0;
		double num3 = (double)(int)Value.B / 255.0;
		double num4 = Math.Max(num, Math.Max(num2, num3));
		double num5 = Math.Min(num, Math.Min(num2, num3));
		double num6 = (num4 + num5) / 2.0;
		double item = 0.0;
		double item2 = 0.0;
		double num7 = num4 - num5;
		if (num7 > 0.0)
		{
			item2 = ((num6 > 0.5) ? (num7 / (2.0 - num4 - num5)) : (num7 / (num4 + num5)));
			if (num4 == num)
			{
				item = (num2 - num3) / num7 + (double)((num2 < num3) ? 6 : 0);
			}
			else
			{
				item = ((num4 == num2) ? ((num3 - num) / num7 + 2.0) : ((num - num2) / num7 + 4.0));
			}
			item /= 6.0;
		}
		return (H: item, S: item2, L: num6);
	}

	private static Color FromHsl(double H, double S, double L)
	{
		double num;
		double num2;
		double num3;
		if (S == 0.0)
		{
			num = (num2 = (num3 = L));
		}
		else
		{
			double num4 = ((L < 0.5) ? (L * (1.0 + S)) : (L + S - L * S));
			double p = 2.0 * L - num4;
			num = Hue(p, num4, H + 1.0 / 3.0);
			num2 = Hue(p, num4, H);
			num3 = Hue(p, num4, H - 1.0 / 3.0);
		}
		return Color.FromRgb((byte)Math.Round(num * 255.0), (byte)Math.Round(num2 * 255.0), (byte)Math.Round(num3 * 255.0));
		static double Hue(double P, double Q, double T)
		{
			if (T < 0.0)
			{
				T++;
			}
			if (T > 1.0)
			{
				T--;
			}
			if (T < 1.0 / 6.0)
			{
				return P + (Q - P) * 6.0 * T;
			}
			if (T < 0.5)
			{
				return Q;
			}
			if (T < 2.0 / 3.0)
			{
				return P + (Q - P) * (2.0 / 3.0 - T) * 6.0;
			}
			return P;
		}
	}
}
