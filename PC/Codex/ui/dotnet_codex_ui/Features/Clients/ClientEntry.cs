using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Runtime.CompilerServices;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Media;
using System.Windows.Threading;
using dotnet_codex_ui.Infrastructure.Logging;

namespace dotnet_codex_ui.Features.Clients;

public class ClientEntry : INotifyPropertyChanged
{
	private string? GameNameField;

	private string? AvatarUrlField;

	private ImageSource? AvatarField;

	private bool IsSelectedField;

	private bool IsBusyField;

	private bool IsConfirmOpenField;

	private bool IsConfirmShownField;

	private DispatcherTimer? ConfirmHideTimer;

	private ConnectionState StateField;

	private string? InjectionErrorField;

	private bool InGameField = true;

	private int AutoInjectSecondsField;

	private string PlayerNameField = "";

	private string EncryptionKindField = "None";

	public required string Id { get; init; }

	public ConnectionState State
	{
		get
		{
			return StateField;
		}
		set
		{
			if (Set(ref StateField, value, "State"))
			{
				Raise("IsConnected");
				Raise("IsInjecting");
				Raise("CanInject");
				Raise("StatusText");
				ClientService.NotifyStateChanged();
			}
		}
	}

	public bool IsConnected => State == ConnectionState.Connected;

	public bool IsInjecting => State == ConnectionState.Injecting;

	public string? ConnectionId { get; set; }

	public bool FromProcess { get; set; }

	public bool InGame
	{
		get
		{
			return InGameField;
		}
		set
		{
			if (Set(ref InGameField, value, "InGame"))
			{
				Raise("CanInject");
			}
		}
	}

	public bool CanInject
	{
		get
		{
			if (State == ConnectionState.NotConnected && !IsBusy)
			{
				return InGame;
			}
			return false;
		}
	}

	public int AutoInjectSeconds
	{
		get
		{
			return AutoInjectSecondsField;
		}
		set
		{
			if (Set(ref AutoInjectSecondsField, value, "AutoInjectSeconds"))
			{
				Raise("InjectText");
				Raise("IsAutoInjecting");
			}
		}
	}

	public bool IsAutoInjecting => AutoInjectSeconds > 0;

	public string InjectText
	{
		get
		{
			if (AutoInjectSeconds <= 0)
			{
				return "Inject";
			}
			return $"Inject in {AutoInjectSeconds}s";
		}
	}

	internal bool AutoInjectDone { get; set; }

	public string StatusText => State switch
	{
		ConnectionState.Connected => "Connected", 
		ConnectionState.Injecting => "Injecting", 
		_ => "Not connected", 
	};

	public string? InjectionError
	{
		get
		{
			return InjectionErrorField;
		}
		set
		{
			if (Set(ref InjectionErrorField, value, "InjectionError"))
			{
				Raise("HasError");
			}
		}
	}

	public bool HasError => !string.IsNullOrEmpty(InjectionError);

	public required string PlayerName
	{
		get
		{
			return PlayerNameField;
		}
		set
		{
			if (Set(ref PlayerNameField, value, "PlayerName"))
			{
				Raise("Initial");
			}
		}
	}

	public long AvatarUserId { get; set; }

	public long ResolvedPlaceId { get; set; }

	public int ProcessId { get; set; }

	public long PlayerId { get; set; }

	public long PlaceId { get; set; }

	public string EncryptionKind
	{
		get
		{
			return EncryptionKindField;
		}
		set
		{
			if (Set(ref EncryptionKindField, value, "EncryptionKind"))
			{
				Raise("EncryptionText");
				Raise("EncryptionHint");
			}
		}
	}

	public string EncryptionText
	{
		get
		{
			string encryptionKind = EncryptionKind;
			if (!(encryptionKind == "Unique"))
			{
				if (encryptionKind == "Shared")
				{
					return "SHARED ENCRYPTION";
				}
				return "NO ENCRYPTION";
			}
			return "UNIQUE ENCRYPTION";
		}
	}

	public string EncryptionHint
	{
		get
		{
			string encryptionKind = EncryptionKind;
			if (!(encryptionKind == "Unique"))
			{
				if (encryptionKind == "Shared")
				{
					return "This game uses the shared server key.";
				}
				return "Data between Codex and this game is not encrypted.";
			}
			return "This game has its own encryption key.";
		}
	}

	public string? GameName
	{
		get
		{
			return GameNameField;
		}
		set
		{
			if (Set(ref GameNameField, value, "GameName"))
			{
				Raise("GameText");
			}
		}
	}

	public string? AvatarUrl
	{
		get
		{
			return AvatarUrlField;
		}
		set
		{
			Set(ref AvatarUrlField, value, "AvatarUrl");
		}
	}

	public ImageSource? Avatar
	{
		get
		{
			return AvatarField;
		}
		private set
		{
			Set(ref AvatarField, value, "Avatar");
		}
	}

	public bool IsSelected
	{
		get
		{
			return IsSelectedField;
		}
		set
		{
			Set(ref IsSelectedField, value, "IsSelected");
		}
	}

	public bool IsBusy
	{
		get
		{
			return IsBusyField;
		}
		set
		{
			if (Set(ref IsBusyField, value, "IsBusy"))
			{
				Raise("CanInject");
			}
		}
	}

	public bool IsConfirmOpen
	{
		get
		{
			return IsConfirmOpenField;
		}
		set
		{
			if (!Set(ref IsConfirmOpenField, value, "IsConfirmOpen"))
			{
				return;
			}
			if (value)
			{
				ConfirmHideTimer?.Stop();
				IsConfirmShown = true;
				return;
			}
			if (ConfirmHideTimer == null)
			{
				ConfirmHideTimer = CreateConfirmHideTimer();
			}
			ConfirmHideTimer.Stop();
			ConfirmHideTimer.Start();
		}
	}

	public bool IsConfirmShown
	{
		get
		{
			return IsConfirmShownField;
		}
		set
		{
			if (!(!Set(ref IsConfirmShownField, value, "IsConfirmShown") | value))
			{
				ConfirmHideTimer?.Stop();
				if (IsConfirmOpenField)
				{
					IsConfirmOpenField = false;
					Raise("IsConfirmOpen");
				}
			}
		}
	}

	public string Initial
	{
		get
		{
			if (PlayerName.Length <= 0)
			{
				return "?";
			}
			return PlayerName.Substring(0, 1).ToUpperInvariant();
		}
	}

	public string GameText
	{
		get
		{
			if (!string.IsNullOrWhiteSpace(GameName))
			{
				return "Playing · " + GameName;
			}
			return "In Menu";
		}
	}

	public event PropertyChangedEventHandler? PropertyChanged;

	private DispatcherTimer CreateConfirmHideTimer()
	{
		DispatcherTimer Timer = new DispatcherTimer
		{
			Interval = TimeSpan.FromMilliseconds(140L)
		};
		Timer.Tick += (object? _, EventArgs _) =>
		{
			Timer.Stop();
			IsConfirmShown = false;
		};
		return Timer;
	}

	internal async Task LoadAvatarAsync()
	{
		string Url = AvatarUrl;
		if (string.IsNullOrEmpty(Url))
		{
			return;
		}
		try
		{
			ImageSource Image = await AvatarCache.GetAsync(Url);
			if (Image != null && AvatarUrl == Url)
			{
				await Application.Current.Dispatcher.InvokeAsync(() => Avatar = Image);
			}
		}
		catch (Exception failure)
		{
			AppLog.Error(failure, null, "LoadAvatarAsync", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Features\\Clients\\ClientsPage.xaml.cs");
		}
	}

	private void Raise(string Property)
	{
		PropertyChanged?.Invoke(this, new PropertyChangedEventArgs(Property));
	}

	private bool Set<T>(ref T Field, T Value, [CallerMemberName] string? Property = null)
	{
		if (EqualityComparer<T>.Default.Equals(Field, Value))
		{
			return false;
		}
		Field = Value;
		Raise(Property);
		return true;
	}
}
