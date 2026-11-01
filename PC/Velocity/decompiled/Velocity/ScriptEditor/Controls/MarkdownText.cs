using System;
using System.Collections.Generic;
using System.Text;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Documents;
using System.Windows.Media;

namespace ScriptEditor.Controls;

public static class MarkdownText
{
	public readonly record struct Palette(FontFamily Body, FontFamily Mono, Brush Foreground, Brush Muted, Brush CodeForeground, Brush CodeBackground);

	public static IEnumerable<UIElement> Build(string text, Palette palette)
	{
		List<string> paragraph = new List<string>();
		string[] array = text.ReplaceLineEndings("\n").Split('\n');
		foreach (string text2 in array)
		{
			string line = text2.TrimEnd();
			string trimmed = line.TrimStart();
			bool isBullet = trimmed.StartsWith("- ", StringComparison.Ordinal) || trimmed.StartsWith("* ", StringComparison.Ordinal);
			bool isHeading = trimmed.StartsWith('#');
			if ((isBullet | isHeading) || trimmed.Length == 0)
			{
				if (paragraph.Count > 0)
				{
					yield return Paragraph(string.Join(" ", paragraph), palette);
					paragraph.Clear();
				}
				if (isBullet)
				{
					yield return Bullet(trimmed.Substring(2), line.Length - trimmed.Length, palette);
				}
				else if (isHeading)
				{
					yield return Heading(trimmed.TrimStart('#').Trim(), palette);
				}
			}
			else
			{
				paragraph.Add(trimmed);
			}
		}
		if (paragraph.Count > 0)
		{
			yield return Paragraph(string.Join(" ", paragraph), palette);
		}
	}

	private static UIElement Paragraph(string text, Palette palette)
	{
		//IL_002b: Unknown result type (might be due to invalid IL or missing references)
		TextBlock val = NewBlock(palette);
		((FrameworkElement)val).Margin = new Thickness(0.0, 0.0, 0.0, 6.0);
		Fill(val, text, palette);
		return (UIElement)(object)val;
	}

	private static UIElement Heading(string text, Palette palette)
	{
		//IL_002b: Unknown result type (might be due to invalid IL or missing references)
		//IL_0036: Unknown result type (might be due to invalid IL or missing references)
		TextBlock val = NewBlock(palette);
		((FrameworkElement)val).Margin = new Thickness(0.0, 4.0, 0.0, 4.0);
		val.FontWeight = FontWeights.SemiBold;
		val.Foreground = palette.CodeForeground;
		Fill(val, text, palette);
		return (UIElement)(object)val;
	}

	private static UIElement Bullet(string text, int indent, Palette palette)
	{
		//IL_0000: Unknown result type (might be due to invalid IL or missing references)
		//IL_0005: Unknown result type (might be due to invalid IL or missing references)
		//IL_002b: Unknown result type (might be due to invalid IL or missing references)
		//IL_0035: Unknown result type (might be due to invalid IL or missing references)
		//IL_003b: Unknown result type (might be due to invalid IL or missing references)
		//IL_0040: Unknown result type (might be due to invalid IL or missing references)
		//IL_004a: Unknown result type (might be due to invalid IL or missing references)
		//IL_0059: Expected Obj, but got Unknown
		//IL_0059: Unknown result type (might be due to invalid IL or missing references)
		//IL_005f: Unknown result type (might be due to invalid IL or missing references)
		//IL_0064: Unknown result type (might be due to invalid IL or missing references)
		//IL_006f: Unknown result type (might be due to invalid IL or missing references)
		//IL_007e: Expected Obj, but got Unknown
		//IL_007e: Unknown result type (might be due to invalid IL or missing references)
		//IL_0083: Unknown result type (might be due to invalid IL or missing references)
		//IL_008e: Unknown result type (might be due to invalid IL or missing references)
		//IL_009b: Unknown result type (might be due to invalid IL or missing references)
		//IL_00aa: Unknown result type (might be due to invalid IL or missing references)
		//IL_00b7: Unknown result type (might be due to invalid IL or missing references)
		//IL_00bf: Expected Obj, but got Unknown
		//IL_00c6: Unknown result type (might be due to invalid IL or missing references)
		//IL_00e9: Unknown result type (might be due to invalid IL or missing references)
		//IL_00f7: Expected Obj, but got Unknown
		Grid val = new Grid
		{
			Margin = new Thickness((double)((indent > 1) ? 14 : 0), 0.0, 0.0, 4.0)
		};
		val.ColumnDefinitions.Add(new ColumnDefinition
		{
			Width = new GridLength(13.0)
		});
		val.ColumnDefinitions.Add(new ColumnDefinition
		{
			Width = new GridLength(1.0, (GridUnitType)2)
		});
		TextBlock val2 = new TextBlock
		{
			Text = "•",
			FontFamily = palette.Body,
			FontSize = 11.5,
			Foreground = palette.Muted,
			VerticalAlignment = (VerticalAlignment)0
		};
		Grid.SetColumn((UIElement)(object)val2, 0);
		((Panel)val).Children.Add((UIElement)(object)val2);
		TextBlock val3 = NewBlock(palette);
		Fill(val3, text, palette);
		Grid.SetColumn((UIElement)(object)val3, 1);
		((Panel)val).Children.Add((UIElement)(object)val3);
		return (UIElement)val;
	}

	private static TextBlock NewBlock(Palette palette)
	{
		//IL_0000: Unknown result type (might be due to invalid IL or missing references)
		//IL_0005: Unknown result type (might be due to invalid IL or missing references)
		//IL_000c: Unknown result type (might be due to invalid IL or missing references)
		//IL_0019: Unknown result type (might be due to invalid IL or missing references)
		//IL_0028: Unknown result type (might be due to invalid IL or missing references)
		//IL_0036: Expected Obj, but got Unknown
		return new TextBlock
		{
			TextWrapping = (TextWrapping)2,
			FontFamily = palette.Body,
			FontSize = 11.5,
			Foreground = palette.Foreground
		};
	}

	private static void Fill(TextBlock block, string text, Palette palette)
	{
		//IL_0102: Unknown result type (might be due to invalid IL or missing references)
		//IL_010c: Expected Obj, but got Unknown
		//IL_0107: Unknown result type (might be due to invalid IL or missing references)
		//IL_0111: Expected Obj, but got Unknown
		//IL_00b0: Unknown result type (might be due to invalid IL or missing references)
		//IL_00ba: Expected Obj, but got Unknown
		//IL_00b5: Unknown result type (might be due to invalid IL or missing references)
		//IL_00bf: Expected Obj, but got Unknown
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < text.Length; i++)
		{
			if (text[i] == '`')
			{
				int num = text.IndexOf('`', i + 1);
				if (num > i + 1)
				{
					Flush(block, stringBuilder, palette);
					InlineCollection inlines = block.Inlines;
					int num2 = i + 1;
					((TextElementCollection<Inline>)(object)inlines).Add(Code(text.Substring(num2, num - num2), palette));
					i = num;
					continue;
				}
			}
			if (text[i] == '*' && i + 1 < text.Length && text[i + 1] == '*')
			{
				int num3 = text.IndexOf("**", i + 2, StringComparison.Ordinal);
				if (num3 > i + 2)
				{
					Flush(block, stringBuilder, palette);
					InlineCollection inlines2 = block.Inlines;
					int num2 = i + 2;
					((TextElementCollection<Inline>)(object)inlines2).Add((Inline)new Bold((Inline)new Run(text.Substring(num2, num3 - num2))));
					i = num3 + 1;
					continue;
				}
			}
			if (text[i] == '*')
			{
				int num4 = text.IndexOf('*', i + 1);
				if (num4 > i + 1)
				{
					Flush(block, stringBuilder, palette);
					InlineCollection inlines3 = block.Inlines;
					int num2 = i + 1;
					((TextElementCollection<Inline>)(object)inlines3).Add((Inline)new Italic((Inline)new Run(text.Substring(num2, num4 - num2))));
					i = num4;
					continue;
				}
			}
			stringBuilder.Append(text[i]);
		}
		Flush(block, stringBuilder, palette);
	}

	private static void Flush(TextBlock block, StringBuilder plain, Palette palette)
	{
		//IL_0015: Unknown result type (might be due to invalid IL or missing references)
		//IL_001f: Expected Obj, but got Unknown
		if (plain.Length != 0)
		{
			((TextElementCollection<Inline>)(object)block.Inlines).Add((Inline)new Run(plain.ToString()));
			plain.Clear();
		}
	}

	private static Inline Code(string text, Palette palette)
	{
		//IL_0001: Unknown result type (might be due to invalid IL or missing references)
		//IL_0006: Unknown result type (might be due to invalid IL or missing references)
		//IL_0013: Unknown result type (might be due to invalid IL or missing references)
		//IL_0022: Unknown result type (might be due to invalid IL or missing references)
		//IL_002f: Unknown result type (might be due to invalid IL or missing references)
		//IL_003d: Expected Obj, but got Unknown
		return (Inline)new Run(text)
		{
			FontFamily = palette.Mono,
			FontSize = 11.0,
			Foreground = palette.CodeForeground,
			Background = palette.CodeBackground
		};
	}
}
