using System;
using System.Collections.Generic;
using System.Globalization;
using System.Windows;
using System.Windows.Automation.Peers;
using System.Windows.Controls;
using System.Windows.Documents;
using System.Windows.Media;

namespace dotnet_codex_ui.Controls;

public class SpacedTextBlock : FrameworkElement
{
	private sealed class SpacedTextBlockPeer(SpacedTextBlock Block) : FrameworkElementAutomationPeer(Block)
	{
		protected override string GetClassNameCore()
		{
			return "SpacedTextBlock";
		}

		protected override AutomationControlType GetAutomationControlTypeCore()
		{
			return AutomationControlType.Text;
		}

		protected override bool IsContentElementCore()
		{
			return true;
		}

		protected override bool IsControlElementCore()
		{
			return true;
		}

		protected override string GetNameCore()
		{
			string nameCore = base.GetNameCore();
			if (!string.IsNullOrEmpty(nameCore))
			{
				return nameCore;
			}
			return Block.Text ?? string.Empty;
		}
	}

	private struct GlyphInfo
	{
		internal string Text;

		internal double Width;

		internal double Height;

		internal double Baseline;
	}

	private struct LineInfo
	{
		internal List<GlyphInfo> Glyphs;

		internal double Width;

		internal double Height;

		internal double Baseline;
	}

	public static readonly DependencyProperty TextProperty = DependencyProperty.Register("Text", typeof(string), typeof(SpacedTextBlock), new FrameworkPropertyMetadata(string.Empty, FrameworkPropertyMetadataOptions.AffectsMeasure | FrameworkPropertyMetadataOptions.AffectsRender));

	public static readonly DependencyProperty CharacterSpacingProperty = DependencyProperty.Register("CharacterSpacing", typeof(double), typeof(SpacedTextBlock), new FrameworkPropertyMetadata(0.0, FrameworkPropertyMetadataOptions.AffectsMeasure | FrameworkPropertyMetadataOptions.AffectsRender));

	public static readonly DependencyProperty FontFamilyProperty = TextElement.FontFamilyProperty.AddOwner(typeof(SpacedTextBlock), new FrameworkPropertyMetadata(SystemFonts.MessageFontFamily, FrameworkPropertyMetadataOptions.AffectsMeasure | FrameworkPropertyMetadataOptions.AffectsRender));

	public static readonly DependencyProperty FontSizeProperty = TextElement.FontSizeProperty.AddOwner(typeof(SpacedTextBlock), new FrameworkPropertyMetadata(SystemFonts.MessageFontSize, FrameworkPropertyMetadataOptions.AffectsMeasure | FrameworkPropertyMetadataOptions.AffectsRender));

	public static readonly DependencyProperty FontWeightProperty = TextElement.FontWeightProperty.AddOwner(typeof(SpacedTextBlock), new FrameworkPropertyMetadata(FontWeights.Normal, FrameworkPropertyMetadataOptions.AffectsMeasure | FrameworkPropertyMetadataOptions.AffectsRender));

	public static readonly DependencyProperty FontStyleProperty = TextElement.FontStyleProperty.AddOwner(typeof(SpacedTextBlock), new FrameworkPropertyMetadata(FontStyles.Normal, FrameworkPropertyMetadataOptions.AffectsMeasure | FrameworkPropertyMetadataOptions.AffectsRender));

	public static readonly DependencyProperty ForegroundProperty = TextElement.ForegroundProperty.AddOwner(typeof(SpacedTextBlock), new FrameworkPropertyMetadata(Brushes.Black, FrameworkPropertyMetadataOptions.AffectsRender));

	public static readonly DependencyProperty TextAlignmentProperty = TextBlock.TextAlignmentProperty.AddOwner(typeof(SpacedTextBlock), new FrameworkPropertyMetadata(TextAlignment.Left, FrameworkPropertyMetadataOptions.AffectsRender));

	public static readonly DependencyProperty TextWrappingProperty = TextBlock.TextWrappingProperty.AddOwner(typeof(SpacedTextBlock), new FrameworkPropertyMetadata(TextWrapping.NoWrap, FrameworkPropertyMetadataOptions.AffectsMeasure | FrameworkPropertyMetadataOptions.AffectsRender));

	public static readonly DependencyProperty TextTrimmingProperty = TextBlock.TextTrimmingProperty.AddOwner(typeof(SpacedTextBlock), new FrameworkPropertyMetadata(TextTrimming.None, FrameworkPropertyMetadataOptions.AffectsMeasure | FrameworkPropertyMetadataOptions.AffectsRender));

	public TextTrimming TextTrimming
	{
		get
		{
			return (TextTrimming)GetValue(TextTrimmingProperty);
		}
		set
		{
			SetValue(TextTrimmingProperty, value);
		}
	}

	public string Text
	{
		get
		{
			return (string)GetValue(TextProperty);
		}
		set
		{
			SetValue(TextProperty, value);
		}
	}

	public double CharacterSpacing
	{
		get
		{
			return (double)GetValue(CharacterSpacingProperty);
		}
		set
		{
			SetValue(CharacterSpacingProperty, value);
		}
	}

	public FontFamily FontFamily
	{
		get
		{
			return (FontFamily)GetValue(FontFamilyProperty);
		}
		set
		{
			SetValue(FontFamilyProperty, value);
		}
	}

	public double FontSize
	{
		get
		{
			return (double)GetValue(FontSizeProperty);
		}
		set
		{
			SetValue(FontSizeProperty, value);
		}
	}

	public FontWeight FontWeight
	{
		get
		{
			return (FontWeight)GetValue(FontWeightProperty);
		}
		set
		{
			SetValue(FontWeightProperty, value);
		}
	}

	public FontStyle FontStyle
	{
		get
		{
			return (FontStyle)GetValue(FontStyleProperty);
		}
		set
		{
			SetValue(FontStyleProperty, value);
		}
	}

	public Brush Foreground
	{
		get
		{
			return (Brush)GetValue(ForegroundProperty);
		}
		set
		{
			SetValue(ForegroundProperty, value);
		}
	}

	public TextAlignment TextAlignment
	{
		get
		{
			return (TextAlignment)GetValue(TextAlignmentProperty);
		}
		set
		{
			SetValue(TextAlignmentProperty, value);
		}
	}

	public TextWrapping TextWrapping
	{
		get
		{
			return (TextWrapping)GetValue(TextWrappingProperty);
		}
		set
		{
			SetValue(TextWrappingProperty, value);
		}
	}

	protected override AutomationPeer OnCreateAutomationPeer()
	{
		return new SpacedTextBlockPeer(this);
	}

	private string Trim(string Text, double AvailableWidth)
	{
		if (TextTrimming == TextTrimming.None || TextWrapping == TextWrapping.Wrap || Text.Length == 0 || Text.Contains('\n') || double.IsInfinity(AvailableWidth) || AvailableWidth <= 0.0)
		{
			return Text;
		}
		double Spacing = FontSize * CharacterSpacing / 100.0;
		if (WidthOf(Text) <= AvailableWidth)
		{
			return Text;
		}
		for (int num = Text.Length - 1; num > 0; num--)
		{
			string text = Text.Substring(0, num).TrimEnd() + "…";
			if (WidthOf(text) <= AvailableWidth)
			{
				return text;
			}
		}
		return "…";
		double WidthOf(string Value)
		{
			double num2 = 0.0;
			for (int i = 0; i < Value.Length; i++)
			{
				num2 += CreateFormattedText(Value[i].ToString()).WidthIncludingTrailingWhitespace + Spacing;
			}
			return num2 - Spacing;
		}
	}

	private List<LineInfo> BuildLines(double AvailableWidth)
	{
		List<LineInfo> list = new List<LineInfo>();
		string text = Trim(Text ?? string.Empty, AvailableWidth);
		if (text.Length == 0)
		{
			list.Add(new LineInfo
			{
				Glyphs = new List<GlyphInfo>(),
				Width = 0.0,
				Height = FontSize,
				Baseline = FontSize
			});
			return list;
		}
		double num = FontSize * CharacterSpacing / 100.0;
		List<GlyphInfo> list2 = new List<GlyphInfo>();
		double num2 = 0.0;
		double num3 = 0.0;
		double num4 = 0.0;
		string text2 = text;
		for (int i = 0; i < text2.Length; i++)
		{
			char c = text2[i];
			switch (c)
			{
			case '\n':
				list.Add(new LineInfo
				{
					Glyphs = list2,
					Width = Math.Max(0.0, num2),
					Height = Math.Max(FontSize, num3),
					Baseline = num4
				});
				list2 = new List<GlyphInfo>();
				num2 = 0.0;
				num3 = 0.0;
				num4 = 0.0;
				continue;
			case '\r':
				continue;
			}
			string text3 = c.ToString();
			FormattedText formattedText = CreateFormattedText(text3);
			double widthIncludingTrailingWhitespace = formattedText.WidthIncludingTrailingWhitespace;
			double num5 = ((list2.Count > 0) ? num : 0.0);
			double num6 = num2 + num5 + widthIncludingTrailingWhitespace;
			if (TextWrapping == TextWrapping.Wrap && AvailableWidth > 0.0 && c != ' ' && list2.Count > 0 && num6 > AvailableWidth)
			{
				int num7 = list2.FindLastIndex((GlyphInfo G) => G.Text == " ");
				List<GlyphInfo> list3 = new List<GlyphInfo>();
				if (num7 >= 0 && c != ' ')
				{
					list3 = list2.GetRange(num7 + 1, list2.Count - num7 - 1);
					list2.RemoveRange(num7, list2.Count - num7);
				}
				double num8 = 0.0;
				double num9 = 0.0;
				double num10 = 0.0;
				foreach (GlyphInfo item in list2)
				{
					num8 += item.Width + num;
					num9 = Math.Max(num9, item.Height);
					num10 = Math.Max(num10, item.Baseline);
				}
				list.Add(new LineInfo
				{
					Glyphs = list2,
					Width = Math.Max(0.0, num8 - num),
					Height = Math.Max(FontSize, num9),
					Baseline = num10
				});
				list2 = list3;
				num2 = 0.0;
				num3 = 0.0;
				num4 = 0.0;
				foreach (GlyphInfo item2 in list3)
				{
					num2 += item2.Width + num;
					num3 = Math.Max(num3, item2.Height);
					num4 = Math.Max(num4, item2.Baseline);
				}
				if (list3.Count > 0)
				{
					num2 -= num;
				}
				num5 = ((list3.Count > 0) ? num : 0.0);
				num6 = num2 + num5 + widthIncludingTrailingWhitespace;
			}
			list2.Add(new GlyphInfo
			{
				Text = text3,
				Width = widthIncludingTrailingWhitespace,
				Height = formattedText.Height,
				Baseline = formattedText.Baseline
			});
			num2 = num6;
			num3 = Math.Max(num3, formattedText.Height);
			num4 = Math.Max(num4, formattedText.Baseline);
		}
		list.Add(new LineInfo
		{
			Glyphs = list2,
			Width = Math.Max(0.0, num2),
			Height = Math.Max(FontSize, num3),
			Baseline = num4
		});
		return list;
	}

	protected override Size MeasureOverride(Size AvailableSize)
	{
		double availableWidth = (double.IsInfinity(AvailableSize.Width) ? double.PositiveInfinity : Math.Max(0.0, AvailableSize.Width));
		List<LineInfo> list = BuildLines(availableWidth);
		double num = 0.0;
		double num2 = 0.0;
		foreach (LineInfo item in list)
		{
			num = Math.Max(num, item.Width);
			num2 += item.Height;
		}
		if (!double.IsInfinity(AvailableSize.Width))
		{
			num = Math.Min(num, AvailableSize.Width);
		}
		if (!double.IsInfinity(AvailableSize.Height))
		{
			num2 = Math.Min(num2, AvailableSize.Height);
		}
		return new Size(num, num2);
	}

	protected override void OnRender(DrawingContext DrawingContext)
	{
		base.OnRender(DrawingContext);
		if (string.IsNullOrEmpty(Text ?? string.Empty))
		{
			return;
		}
		double actualWidth = ActualWidth;
		List<LineInfo> list = BuildLines(actualWidth);
		double num = 0.0;
		double num2 = FontSize * (CharacterSpacing / 100.0);
		foreach (LineInfo item in list)
		{
			double num3 = CalculateLineX(item.Width);
			foreach (GlyphInfo glyph in item.Glyphs)
			{
				FormattedText formattedText = CreateFormattedText(glyph.Text);
				DrawingContext.DrawText(formattedText, new Point(num3, num));
				num3 += glyph.Width + num2;
			}
			num += item.Height;
		}
	}

	private double CalculateLineX(double LineWidth)
	{
		return TextAlignment switch
		{
			TextAlignment.Center => Math.Max(0.0, (ActualWidth - LineWidth) / 2.0), 
			TextAlignment.Right => Math.Max(0.0, ActualWidth - LineWidth), 
			_ => 0.0, 
		};
	}

	private FormattedText CreateFormattedText(string Text)
	{
		return new FormattedText(Text, CultureInfo.CurrentUICulture, FlowDirection.LeftToRight, new Typeface(FontFamily, FontStyle, FontWeight, FontStretches.Normal), FontSize, Foreground, VisualTreeHelper.GetDpi(this).PixelsPerDip);
	}
}
