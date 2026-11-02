using System;
using System.Linq;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Input;
using System.Windows.Markup;
using System.Windows.Media;
using System.Windows.Media.Animation;
using System.Windows.Threading;

namespace dotnet_codex_bootstrapper.Infrastructure;

public sealed class PromptWindow : Window
{
	private const string Layout = "<Border xmlns=\"http://schemas.microsoft.com/winfx/2006/xaml/presentation\" xmlns:x=\"http://schemas.microsoft.com/winfx/2006/xaml\"\r\n        Margin=\"18\" Padding=\"22,20,22,18\" CornerRadius=\"12\" BorderThickness=\"1\"\r\n        Background=\"{DynamicResource Prompt.Card}\" BorderBrush=\"{DynamicResource Prompt.Border}\">\r\n    <Border.Effect>\r\n        <DropShadowEffect BlurRadius=\"24\" ShadowDepth=\"0\" Opacity=\"0.55\" Color=\"#000000\" />\r\n    </Border.Effect>\r\n    <Border.Resources>\r\n        <Style x:Key=\"PromptButton\" TargetType=\"Button\">\r\n            <Setter Property=\"MinWidth\" Value=\"84\" />\r\n            <Setter Property=\"Height\" Value=\"30\" />\r\n            <Setter Property=\"Margin\" Value=\"8,0,0,0\" />\r\n            <Setter Property=\"Padding\" Value=\"14,0\" />\r\n            <Setter Property=\"FontSize\" Value=\"12\" />\r\n            <Setter Property=\"FontWeight\" Value=\"SemiBold\" />\r\n            <Setter Property=\"Cursor\" Value=\"Hand\" />\r\n            <Setter Property=\"Foreground\" Value=\"{DynamicResource Prompt.Foreground}\" />\r\n            <Setter Property=\"Background\" Value=\"{DynamicResource Prompt.Control}\" />\r\n            <Setter Property=\"BorderBrush\" Value=\"{DynamicResource Prompt.ControlBorder}\" />\r\n            <Setter Property=\"Template\">\r\n                <Setter.Value>\r\n                    <ControlTemplate TargetType=\"Button\">\r\n                        <Border x:Name=\"Chrome\" CornerRadius=\"7\" BorderThickness=\"1\" Background=\"{TemplateBinding Background}\" BorderBrush=\"{TemplateBinding BorderBrush}\" Padding=\"{TemplateBinding Padding}\">\r\n                            <ContentPresenter HorizontalAlignment=\"Center\" VerticalAlignment=\"Center\" />\r\n                        </Border>\r\n                        <ControlTemplate.Triggers>\r\n                            <Trigger Property=\"IsMouseOver\" Value=\"True\">\r\n                                <Setter TargetName=\"Chrome\" Property=\"Opacity\" Value=\"0.88\" />\r\n                            </Trigger>\r\n                            <Trigger Property=\"IsKeyboardFocused\" Value=\"True\">\r\n                                <Setter TargetName=\"Chrome\" Property=\"BorderBrush\" Value=\"{DynamicResource Prompt.Accent}\" />\r\n                            </Trigger>\r\n                            <Trigger Property=\"IsPressed\" Value=\"True\">\r\n                                <Setter TargetName=\"Chrome\" Property=\"Opacity\" Value=\"0.75\" />\r\n                            </Trigger>\r\n                        </ControlTemplate.Triggers>\r\n                    </ControlTemplate>\r\n                </Setter.Value>\r\n            </Setter>\r\n        </Style>\r\n    </Border.Resources>\r\n    <StackPanel>\r\n        <StackPanel Orientation=\"Horizontal\">\r\n            <Border x:Name=\"Badge\" Width=\"26\" Height=\"26\" CornerRadius=\"13\" Background=\"{DynamicResource Prompt.BadgeSurface}\" VerticalAlignment=\"Center\">\r\n                <TextBlock x:Name=\"BadgeText\" HorizontalAlignment=\"Center\" VerticalAlignment=\"Center\" FontSize=\"14\" FontWeight=\"Bold\" Foreground=\"{DynamicResource Prompt.Badge}\" />\r\n            </Border>\r\n            <TextBlock x:Name=\"TitleText\" Margin=\"12,0,0,0\" VerticalAlignment=\"Center\" FontSize=\"15\" FontWeight=\"SemiBold\" Foreground=\"{DynamicResource Prompt.Foreground}\" TextWrapping=\"Wrap\" MaxWidth=\"330\" />\r\n        </StackPanel>\r\n        <TextBlock x:Name=\"MessageText\" Margin=\"38,12,0,0\" FontSize=\"12\" LineHeight=\"18\" Foreground=\"{DynamicResource Prompt.Muted}\" TextWrapping=\"Wrap\" />\r\n        <StackPanel Margin=\"0,20,0,0\" HorizontalAlignment=\"Right\" Orientation=\"Horizontal\">\r\n            <Button x:Name=\"SecondaryButton\" Style=\"{StaticResource PromptButton}\" IsCancel=\"True\" />\r\n            <Button x:Name=\"PrimaryButton\" Style=\"{StaticResource PromptButton}\" IsDefault=\"True\" Background=\"{DynamicResource Prompt.Accent}\" BorderBrush=\"{DynamicResource Prompt.Accent}\" Foreground=\"{DynamicResource Prompt.OnAccent}\" />\r\n        </StackPanel>\r\n    </StackPanel>\r\n</Border>";

	public bool Result { get; private set; }

	private PromptWindow(string Title, string Message, PromptKind Kind, string Primary, string? Secondary)
	{
		PromptWindow promptWindow = this;
		base.Title = Title;
		WindowStyle = WindowStyle.None;
		AllowsTransparency = true;
		Background = Brushes.Transparent;
		ResizeMode = ResizeMode.NoResize;
		SizeToContent = SizeToContent.Height;
		Width = 456.0;
		FontFamily = new FontFamily("Segoe UI");
		ShowInTaskbar = true;
		UseLayoutRounding = true;
		Brush brush = Find("Page.Accent", "#F18081");
		Brush brush2 = Find("Page.Error", Find("Toast.Error", "#D26064"));
		Brush brush3 = (((uint)(Kind - 2) <= 1u) ? brush2 : brush);
		Resources["Prompt.Card"] = Find("Page.Card", "#16171D");
		Resources["Prompt.Border"] = Find("Page.ControlBorder", "#2A2C36");
		Resources["Prompt.Foreground"] = Find("Page.Foreground", "#F8F5F2");
		Resources["Prompt.Muted"] = Find("Page.Muted", "#9FA6AF");
		Resources["Prompt.Control"] = Find("Page.Control", "#1E2028");
		Resources["Prompt.ControlBorder"] = Find("Page.ControlBorder", "#2A2C36");
		Resources["Prompt.Accent"] = ((Kind == PromptKind.Error && Secondary != null) ? brush2 : brush);
		Resources["Prompt.OnAccent"] = Find("Page.OnAccent", "#1A0A1A");
		Resources["Prompt.Badge"] = brush3;
		Resources["Prompt.BadgeSurface"] = new SolidColorBrush((brush3 is SolidColorBrush solidColorBrush) ? Color.FromArgb(48, solidColorBrush.Color.R, solidColorBrush.Color.G, solidColorBrush.Color.B) : Color.FromArgb(48, 241, 128, 129));
		Border Root = (Border)XamlReader.Parse("<Border xmlns=\"http://schemas.microsoft.com/winfx/2006/xaml/presentation\" xmlns:x=\"http://schemas.microsoft.com/winfx/2006/xaml\"\r\n        Margin=\"18\" Padding=\"22,20,22,18\" CornerRadius=\"12\" BorderThickness=\"1\"\r\n        Background=\"{DynamicResource Prompt.Card}\" BorderBrush=\"{DynamicResource Prompt.Border}\">\r\n    <Border.Effect>\r\n        <DropShadowEffect BlurRadius=\"24\" ShadowDepth=\"0\" Opacity=\"0.55\" Color=\"#000000\" />\r\n    </Border.Effect>\r\n    <Border.Resources>\r\n        <Style x:Key=\"PromptButton\" TargetType=\"Button\">\r\n            <Setter Property=\"MinWidth\" Value=\"84\" />\r\n            <Setter Property=\"Height\" Value=\"30\" />\r\n            <Setter Property=\"Margin\" Value=\"8,0,0,0\" />\r\n            <Setter Property=\"Padding\" Value=\"14,0\" />\r\n            <Setter Property=\"FontSize\" Value=\"12\" />\r\n            <Setter Property=\"FontWeight\" Value=\"SemiBold\" />\r\n            <Setter Property=\"Cursor\" Value=\"Hand\" />\r\n            <Setter Property=\"Foreground\" Value=\"{DynamicResource Prompt.Foreground}\" />\r\n            <Setter Property=\"Background\" Value=\"{DynamicResource Prompt.Control}\" />\r\n            <Setter Property=\"BorderBrush\" Value=\"{DynamicResource Prompt.ControlBorder}\" />\r\n            <Setter Property=\"Template\">\r\n                <Setter.Value>\r\n                    <ControlTemplate TargetType=\"Button\">\r\n                        <Border x:Name=\"Chrome\" CornerRadius=\"7\" BorderThickness=\"1\" Background=\"{TemplateBinding Background}\" BorderBrush=\"{TemplateBinding BorderBrush}\" Padding=\"{TemplateBinding Padding}\">\r\n                            <ContentPresenter HorizontalAlignment=\"Center\" VerticalAlignment=\"Center\" />\r\n                        </Border>\r\n                        <ControlTemplate.Triggers>\r\n                            <Trigger Property=\"IsMouseOver\" Value=\"True\">\r\n                                <Setter TargetName=\"Chrome\" Property=\"Opacity\" Value=\"0.88\" />\r\n                            </Trigger>\r\n                            <Trigger Property=\"IsKeyboardFocused\" Value=\"True\">\r\n                                <Setter TargetName=\"Chrome\" Property=\"BorderBrush\" Value=\"{DynamicResource Prompt.Accent}\" />\r\n                            </Trigger>\r\n                            <Trigger Property=\"IsPressed\" Value=\"True\">\r\n                                <Setter TargetName=\"Chrome\" Property=\"Opacity\" Value=\"0.75\" />\r\n                            </Trigger>\r\n                        </ControlTemplate.Triggers>\r\n                    </ControlTemplate>\r\n                </Setter.Value>\r\n            </Setter>\r\n        </Style>\r\n    </Border.Resources>\r\n    <StackPanel>\r\n        <StackPanel Orientation=\"Horizontal\">\r\n            <Border x:Name=\"Badge\" Width=\"26\" Height=\"26\" CornerRadius=\"13\" Background=\"{DynamicResource Prompt.BadgeSurface}\" VerticalAlignment=\"Center\">\r\n                <TextBlock x:Name=\"BadgeText\" HorizontalAlignment=\"Center\" VerticalAlignment=\"Center\" FontSize=\"14\" FontWeight=\"Bold\" Foreground=\"{DynamicResource Prompt.Badge}\" />\r\n            </Border>\r\n            <TextBlock x:Name=\"TitleText\" Margin=\"12,0,0,0\" VerticalAlignment=\"Center\" FontSize=\"15\" FontWeight=\"SemiBold\" Foreground=\"{DynamicResource Prompt.Foreground}\" TextWrapping=\"Wrap\" MaxWidth=\"330\" />\r\n        </StackPanel>\r\n        <TextBlock x:Name=\"MessageText\" Margin=\"38,12,0,0\" FontSize=\"12\" LineHeight=\"18\" Foreground=\"{DynamicResource Prompt.Muted}\" TextWrapping=\"Wrap\" />\r\n        <StackPanel Margin=\"0,20,0,0\" HorizontalAlignment=\"Right\" Orientation=\"Horizontal\">\r\n            <Button x:Name=\"SecondaryButton\" Style=\"{StaticResource PromptButton}\" IsCancel=\"True\" />\r\n            <Button x:Name=\"PrimaryButton\" Style=\"{StaticResource PromptButton}\" IsDefault=\"True\" Background=\"{DynamicResource Prompt.Accent}\" BorderBrush=\"{DynamicResource Prompt.Accent}\" Foreground=\"{DynamicResource Prompt.OnAccent}\" />\r\n        </StackPanel>\r\n    </StackPanel>\r\n</Border>");
		Content = Root;
		((TextBlock)Root.FindName("TitleText")).Text = Title;
		((TextBlock)Root.FindName("MessageText")).Text = Message;
		TextBlock textBlock = (TextBlock)Root.FindName("BadgeText");
		textBlock.Text = Kind switch
		{
			PromptKind.Question => "?",
			PromptKind.Information => "i",
			_ => "!",
		};
		Button PrimaryButton = (Button)Root.FindName("PrimaryButton");
		Button SecondaryButton = (Button)Root.FindName("SecondaryButton");
		PrimaryButton.Content = Primary;
		PrimaryButton.Click += (object _, RoutedEventArgs _) =>
		{
			promptWindow.Finish(Value: true);
		};
		if (Secondary == null)
		{
			SecondaryButton.Visibility = Visibility.Collapsed;
			PrimaryButton.IsCancel = true;
		}
		else
		{
			SecondaryButton.Content = Secondary;
			SecondaryButton.Click += (object _, RoutedEventArgs _) =>
			{
				promptWindow.Finish(Value: false);
			};
		}
		MouseLeftButtonDown += (object _, MouseButtonEventArgs E) =>
		{
			if (E.ButtonState == MouseButtonState.Pressed)
			{
				promptWindow.DragMove();
			}
		};
		Loaded += (object _, RoutedEventArgs _) =>
		{
			((Secondary == null) ? PrimaryButton : SecondaryButton).Focus();
			if (SystemParameters.ClientAreaAnimation)
			{
				Root.RenderTransformOrigin = new Point(0.5, 0.5);
				Root.RenderTransform = new ScaleTransform(0.96, 0.96);
				CubicEase easingFunction = new CubicEase
				{
					EasingMode = EasingMode.EaseOut
				};
				Duration duration = new Duration(TimeSpan.FromMilliseconds(160L));
				promptWindow.BeginAnimation(UIElement.OpacityProperty, new DoubleAnimation(0.0, 1.0, duration)
				{
					EasingFunction = easingFunction
				});
				Root.RenderTransform.BeginAnimation(ScaleTransform.ScaleXProperty, new DoubleAnimation(0.96, 1.0, duration)
				{
					EasingFunction = easingFunction
				});
				Root.RenderTransform.BeginAnimation(ScaleTransform.ScaleYProperty, new DoubleAnimation(0.96, 1.0, duration)
				{
					EasingFunction = easingFunction
				});
			}
		};
	}

	public static bool Ask(string Title, string Message, string Yes = "Yes", string No = "No", PromptKind Kind = PromptKind.Question)
	{
		return Run(Title, Message, Kind, Yes, No);
	}

	public static void Show(string Title, string Message, PromptKind Kind = PromptKind.Information, string Ok = "OK")
	{
		Run(Title, Message, Kind, Ok, null);
	}

	private static bool Run(string Title, string Message, PromptKind Kind, string Primary, string? Secondary)
	{
		Dispatcher dispatcher = Application.Current?.Dispatcher;
		if (dispatcher != null && !dispatcher.CheckAccess())
		{
			return dispatcher.Invoke(() => Run(Title, Message, Kind, Primary, Secondary));
		}
		PromptWindow promptWindow = new PromptWindow(Title, Message, Kind, Primary, Secondary);
		Application current = Application.Current;
		object obj = ((current != null) ? current.Windows.OfType<Window>().FirstOrDefault((Window Item) => Item.IsActive && Item.IsVisible && !(Item is PromptWindow)) : null);
		if (obj == null)
		{
			Window window = Application.Current?.MainWindow;
			obj = ((window != null && window.IsVisible) ? window : null);
		}
		Window window2 = (Window)obj;
		if (window2 != null)
		{
			promptWindow.Owner = window2;
			promptWindow.WindowStartupLocation = WindowStartupLocation.CenterOwner;
			promptWindow.ShowInTaskbar = false;
		}
		else
		{
			promptWindow.WindowStartupLocation = WindowStartupLocation.CenterScreen;
			promptWindow.Topmost = true;
		}
		Application current2 = Application.Current;
		ShutdownMode? shutdownMode = current2?.ShutdownMode;
		if (current2 != null)
		{
			current2.ShutdownMode = ShutdownMode.OnExplicitShutdown;
		}
		try
		{
			promptWindow.ShowDialog();
		}
		finally
		{
			if (current2 != null && shutdownMode.HasValue)
			{
				ShutdownMode valueOrDefault = shutdownMode.GetValueOrDefault();
				current2.ShutdownMode = valueOrDefault;
			}
		}
		return promptWindow.Result;
	}

	private void Finish(bool Value)
	{
		Result = Value;
		DialogResult = Value;
	}

	private static Brush Find(string Key, string Fallback)
	{
		return Find(Key, (Brush)new BrushConverter().ConvertFromString(Fallback));
	}

	private static Brush Find(string Key, Brush Fallback)
	{
		return (Application.Current?.TryFindResource(Key) as Brush) ?? Fallback;
	}
}
