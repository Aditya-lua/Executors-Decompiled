using System;
using System.CodeDom.Compiler;
using System.Diagnostics;
using System.Threading;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Input;
using System.Windows.Markup;
using System.Windows.Media;
using System.Windows.Media.Animation;
using System.Windows.Shapes;
using System.Windows.Threading;
using dotnet_codex_ui.Controls;

namespace dotnet_codex_ui.Features.Auth;

public partial class LoginOverlay : UserControl, IComponentConnector
{
	private enum View
	{
		Form,
		Sending,
		Sent,
		Completing
	}

	private static readonly TimeSpan DefaultCooldown = TimeSpan.FromSeconds(30L);

	private readonly DispatcherTimer CooldownTimer = new DispatcherTimer
	{
		Interval = TimeSpan.FromSeconds(1L)
	};

	private View ViewField;

	private CancellationTokenSource? Cts;

	private DateTime CooldownEnd;

	private string EmailField = "";

	private bool Open;

	public bool IsOpen => Open;

	public CornerRadius ScrimCornerRadius
	{
		set
		{
			Scrim.CornerRadius = value;
		}
	}

	public event Action? OpenChanged;

	public LoginOverlay()
	{
		InitializeComponent();
		SetView(View.Form);
		if (AuthModePolicy.DevModesAllowed)
		{
			DevHost.Child = new DevAuthPanel();
			DevArea.Visibility = Visibility.Visible;
		}
		CooldownTimer.Tick += (object? _, EventArgs _) =>
		{
			UpdateCooldown();
		};
		AuthService.Changed += OnAuthChanged;
	}

	public void Show()
	{
		if (AuthService.IsSignedIn)
		{
			return;
		}
		bool open = Open;
		Open = true;
		if (!open)
		{
			OverlayMotion.Show(this, Scrim, Card);
			OpenChanged?.Invoke();
		}
		ApplyAuthState();
		if (ViewField == View.Form)
		{
			Dispatcher.BeginInvoke((Func<IInputElement>)(() => Keyboard.Focus(EmailBox)), DispatcherPriority.Loaded);
		}
	}

	private void Hide()
	{
		if (Open)
		{
			Open = false;
			Cts?.Cancel();
			CooldownTimer.Stop();
			OpenChanged?.Invoke();
			OverlayMotion.Hide(this, Scrim, Card, () =>
			{
				Spin(ContinueSpinner, On: false);
				Spin(CompletingSpinner, On: false);
				ViewField = View.Form;
				SetView(View.Form);
				ClearError();
				EmailBox.Text = "";
			});
		}
	}

	private void OnAuthChanged()
	{
		if (AuthService.IsSignedIn)
		{
			if (IsOpen)
			{
				Hide();
			}
		}
		else if (AuthService.State == AuthState.SessionExpired && !IsOpen)
		{
			Show();
		}
		else if (IsOpen)
		{
			ApplyAuthState();
		}
	}

	private void ApplyAuthState()
	{
		switch (AuthService.State)
		{
		case AuthState.Completing:
			SetView(View.Completing);
			ClearError();
			return;
		case AuthState.AwaitingLink:
			return;
		}
		View viewField = ViewField;
		if ((uint)(viewField - 2) <= 1u)
		{
			SetView(View.Form);
		}
		string modeError = AuthService.ModeError;
		if (modeError != null)
		{
			ShowError(modeError);
		}
		else if (!AuthService.IsConfigured)
		{
			ShowError(MessageFor(AuthError.NotConfigured));
		}
		else if (AuthService.Error != AuthError.None)
		{
			ShowError(MessageFor(AuthService.Error));
		}
		ContinueButton.IsEnabled = AuthService.IsConfigured;
	}

	private static string MessageFor(AuthError Error)
	{
		return Error switch
		{
			AuthError.NotConfigured => "Sign-in isn't configured for this build. Add auth.json next to the app.", 
			AuthError.ModeNotAllowed => AuthService.ModeError ?? "Development authentication modes aren't available in this build.", 
			AuthError.LinkExpired => "That sign-in link has expired. Request a new one.", 
			AuthError.LinkUsed => "That sign-in link was already used. Request a new one.", 
			AuthError.LinkInvalid => "That sign-in link isn't valid. Request a new one.", 
			AuthError.LinkTimeout => "The sign-in link wasn't opened in time. Request a new one.", 
			AuthError.ValidationFailed => "We couldn't verify your account. Please try again.", 
			AuthError.Network => "Can't reach the server. Check your connection and try again.", 
			AuthError.SessionExpired => "Your session expired. Sign in again.", 
			_ => "", 
		};
	}

	private void SetView(View Next)
	{
		ViewField = Next;
		StackPanel formPanel = FormPanel;
		bool flag = (uint)Next <= 1u;
		formPanel.Visibility = ((!flag) ? Visibility.Collapsed : Visibility.Visible);
		ContinueButton.Visibility = FormPanel.Visibility;
		SentPanel.Visibility = ((Next != View.Sent) ? Visibility.Collapsed : Visibility.Visible);
		CompletingPanel.Visibility = ((Next != View.Completing) ? Visibility.Collapsed : Visibility.Visible);
		Grid footerRow = FooterRow;
		flag = (uint)Next <= 1u;
		footerRow.Visibility = ((!flag) ? Visibility.Collapsed : Visibility.Visible);
		bool flag2 = Next == View.Sending;
		EmailBox.IsEnabled = !flag2;
		ContinueButton.IsLoading = flag2;
		ContinueLabel.Text = (flag2 ? "Sending sign-in link..." : "Continue with Email");
		ContinueSpinner.Visibility = ((!flag2) ? Visibility.Collapsed : Visibility.Visible);
		Spin(ContinueSpinner, flag2);
		Spin(CompletingSpinner, Next == View.Completing);
		switch (Next)
		{
		case View.Sent:
			if (AuthService.Mode == AuthMode.Mock && DevArea.Visibility == Visibility.Visible)
			{
				DevHost.Visibility = Visibility.Visible;
			}
			HeaderIcon.Data = (Geometry)FindResource("Icon.CircleCheck");
			TitleText.Text = "Check Your Email";
			SubText.Text = ((AuthService.Mode == AuthMode.Mock) ? ("Simulated: no email was sent to " + EmailField + ". Use Developer options to complete the mock login.") : ("We sent a sign-in link to " + EmailField + ". Open it on this computer to continue."));
			break;
		case View.Completing:
			HeaderIcon.Data = (Geometry)FindResource("Icon.User");
			TitleText.Text = "Signing You In";
			SubText.Text = "Hang tight while we verify your account.";
			break;
		default:
			HeaderIcon.Data = (Geometry)FindResource("Icon.Mail");
			TitleText.Text = "Welcome Back";
			SubText.Text = "Sign in with a link sent to your email. No password needed.";
			break;
		}
	}

	private static void Spin(Path Target, bool On)
	{
		RotateTransform rotateTransform = (RotateTransform)Target.RenderTransform;
		if (On)
		{
			rotateTransform.BeginAnimation(RotateTransform.AngleProperty, new DoubleAnimation(0.0, 360.0, TimeSpan.FromSeconds(1L))
			{
				RepeatBehavior = RepeatBehavior.Forever
			});
		}
		else
		{
			rotateTransform.BeginAnimation(RotateTransform.AngleProperty, null);
		}
	}

	private void ShowError(string Message, bool Field = false)
	{
		ErrorText.Text = Message;
		ErrorRow.Visibility = (string.IsNullOrEmpty(Message) ? Visibility.Collapsed : Visibility.Visible);
		EmailBox.BorderBrush = (Brush)FindResource(Field ? "Toast.Error" : "Page.ControlBorder");
	}

	private void ClearError()
	{
		ShowError("");
	}

	private async Task SubmitAsync(string Email)
	{
		if (ViewField == View.Sending || !AuthService.IsConfigured)
		{
			return;
		}
		Email = Email.Trim();
		if (!AuthService.IsValidEmail(Email))
		{
			ShowError("Enter a valid email address.", Field: true);
			return;
		}
		ClearError();
		EmailField = Email;
		ResendButton.IsEnabled = false;
		SetView(View.Sending);
		Cts?.Cancel();
		Cts = new CancellationTokenSource();
		LinkOutcome linkOutcome = await AuthService.RequestLinkAsync(Email, Cts.Token);
		if (!IsOpen)
		{
			return;
		}
		switch (linkOutcome.Result)
		{
		case LinkResult.Sent:
			SetView(View.Sent);
			StartCooldown(linkOutcome.RetryAfter ?? DefaultCooldown);
			return;
		case LinkResult.Cancelled:
			SetView((ViewField != View.Sending) ? ViewField : View.Form);
			return;
		}
		SetView(View.Form);
		EmailBox.Text = Email;
		ShowError(MessageFor(linkOutcome), linkOutcome.Result == LinkResult.InvalidEmail);
		if (linkOutcome.Result == LinkResult.RateLimited)
		{
			TimeSpan? retryAfter = linkOutcome.RetryAfter;
			if (retryAfter.HasValue)
			{
				TimeSpan valueOrDefault = retryAfter.GetValueOrDefault();
				StartCooldown(valueOrDefault);
			}
		}
	}

	private static string MessageFor(LinkOutcome Outcome)
	{
		return Outcome.Result switch
		{
			LinkResult.InvalidEmail => "That email address was rejected. Check it and try again.", 
			LinkResult.RateLimited => $"Too many requests. Try again in {Math.Ceiling((Outcome.RetryAfter ?? TimeSpan.FromSeconds(60L)).TotalSeconds):0}s.", 
			LinkResult.Network => "Can't reach the server. Check your connection and try again.", 
			LinkResult.Timeout => "The request timed out. Please try again.", 
			LinkResult.Server => "Something went wrong on our side. Try again in a moment.", 
			LinkResult.InvalidResponse => "The server sent an unexpected response. Please try again.", 
			LinkResult.NotConfigured => MessageFor(AuthError.NotConfigured), 
			LinkResult.Disabled => "Sign-in is currently unavailable.", 
			_ => "", 
		};
	}

	private void StartCooldown(TimeSpan Length)
	{
		CooldownEnd = DateTime.UtcNow + Length;
		ResendButton.IsEnabled = false;
		CooldownTimer.Start();
		UpdateCooldown();
	}

	private void UpdateCooldown()
	{
		double totalSeconds = (CooldownEnd - DateTime.UtcNow).TotalSeconds;
		if (totalSeconds <= 0.0)
		{
			CooldownTimer.Stop();
			ResendButton.IsEnabled = true;
			ResendButton.Content = "Resend Link";
		}
		else
		{
			ResendButton.Content = $"Resend link in {Math.Ceiling(totalSeconds):0}s";
		}
	}

	private async void Continue_Click(object Sender, RoutedEventArgs E)
	{
		await SubmitAsync(EmailBox.Text);
	}

	private async void Resend_Click(object Sender, RoutedEventArgs E)
	{
		await SubmitAsync(EmailField);
	}

	private void ChangeEmail_Click(object Sender, RoutedEventArgs E)
	{
		AuthService.CancelPendingLogin();
		CooldownTimer.Stop();
		ClearError();
		SetView(View.Form);
		EmailBox.Text = EmailField;
		EmailBox.Focus();
		EmailBox.SelectAll();
	}

	private async void EmailBox_PreviewKeyDown(object Sender, KeyEventArgs E)
	{
		if (E.Key == Key.Enter && ViewField == View.Form)
		{
			E.Handled = true;
			await SubmitAsync(EmailBox.Text);
		}
	}

	private void EmailBox_TextChanged(object Sender, TextChangedEventArgs E)
	{
		if (ViewField == View.Form && ErrorRow.Visibility == Visibility.Visible && AuthService.IsValidEmail(EmailBox.Text))
		{
			ClearError();
		}
	}

	private async void Register_Click(object Sender, RoutedEventArgs E)
	{
		await AccountActions.RegisterAsync();
	}

	private async void Forgot_Click(object Sender, RoutedEventArgs E)
	{
		await AccountActions.ForgotAsync();
	}

	private void DevToggle_Click(object Sender, RoutedEventArgs E)
	{
		DevHost.Visibility = ((DevHost.Visibility == Visibility.Visible) ? Visibility.Collapsed : Visibility.Visible);
	}

	private void Close_Click(object Sender, RoutedEventArgs E)
	{
		if (Window.GetWindow(this) is MainWindow mainWindow)
		{
			mainWindow.CloseWithoutConfirm();
		}
		else
		{
			Window.GetWindow(this)?.Close();
		}
	}

}
