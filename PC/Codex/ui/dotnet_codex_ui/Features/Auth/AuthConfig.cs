using System;
using System.IO;
using Newtonsoft.Json;
using dotnet_codex_ui.Infrastructure.Logging;

namespace dotnet_codex_ui.Features.Auth;

public sealed class AuthConfig
{
	private sealed class DevOverride
	{
		public string? Mode { get; set; }
	}

	public string? Mode { get; set; }

	public MockOptions Mock { get; set; } = new MockOptions();

	public string ApiBaseUrl { get; set; } = "";

	public AuthPaths Paths { get; set; } = new AuthPaths();

	public WebsiteConfig Website { get; set; } = new WebsiteConfig();

	public CallbackConfig Callback { get; set; } = new CallbackConfig();

	[JsonIgnore]
	public AuthMode EffectiveMode { get; set; } = AuthMode.Real;

	[JsonIgnore]
	public string? ModeError { get; set; }

	public static string FilePath => Path.Combine(AppContext.BaseDirectory, "auth.json");

	public static string DevFilePath => Path.Combine(AppContext.BaseDirectory, "auth.dev.json");

	public bool IsApiConfigured
	{
		get
		{
			if ((object)Combine(ApiBaseUrl, Paths.RequestLink, AllowLoopbackHttp: true) != null && (object)Combine(ApiBaseUrl, Paths.Exchange, AllowLoopbackHttp: true) != null && (object)Combine(ApiBaseUrl, Paths.Session, AllowLoopbackHttp: true) != null)
			{
				return (object)Combine(ApiBaseUrl, Paths.Logout, AllowLoopbackHttp: true) != null;
			}
			return false;
		}
	}

	public Uri? RequestLinkUri => Combine(ApiBaseUrl, Paths.RequestLink, AllowLoopbackHttp: true);

	public Uri? ExchangeUri => Combine(ApiBaseUrl, Paths.Exchange, AllowLoopbackHttp: true);

	public Uri? SessionUri => Combine(ApiBaseUrl, Paths.Session, AllowLoopbackHttp: true);

	public Uri? LogoutUri => Combine(ApiBaseUrl, Paths.Logout, AllowLoopbackHttp: true);

	public static AuthConfig Load()
	{
		AuthConfig? obj = Read<AuthConfig>(FilePath) ?? new AuthConfig();
		string requested = obj.Mode;
		if (AuthModePolicy.DevModesAllowed)
		{
			string text = Read<DevOverride>(DevFilePath)?.Mode;
			if (text != null && text.Length > 0)
			{
				requested = text;
			}
			string environmentVariable = Environment.GetEnvironmentVariable("CODEX_AUTH_MODE");
			if (environmentVariable != null && environmentVariable.Length > 0)
			{
				requested = environmentVariable;
			}
		}
		(obj.EffectiveMode, obj.ModeError) = AuthModePolicy.Resolve(requested, AuthModePolicy.DevModesAllowed);
		return obj;
	}

	public static void SaveDevMode(AuthMode Mode)
	{
		if (!AuthModePolicy.DevModesAllowed)
		{
			return;
		}
		try
		{
			File.WriteAllText(DevFilePath, JsonConvert.SerializeObject(new DevOverride
			{
				Mode = Mode.ToString()
			}, Formatting.Indented));
		}
		catch (Exception failure)
		{
			AppLog.Error(failure, null, "SaveDevMode", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Features\\Auth\\AuthConfig.cs");
		}
	}

	private static T? Read<T>(string Path) where T : class
	{
		try
		{
			return File.Exists(Path) ? JsonConvert.DeserializeObject<T>(File.ReadAllText(Path)) : null;
		}
		catch (Exception failure)
		{
			AppLog.Error(failure, null, "Read", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Features\\Auth\\AuthConfig.cs");
			return null;
		}
	}

	public Uri? WebsiteUri(WebsiteRoute Route)
	{
		string baseUrl = Website.BaseUrl;
		return Combine(baseUrl, Route switch
		{
			WebsiteRoute.Register => Website.Routes.Register, 
			WebsiteRoute.Forgot => Website.Routes.Forgot, 
			WebsiteRoute.Profile => Website.Routes.Profile, 
			WebsiteRoute.Subscription => Website.Routes.Subscription, 
			_ => "", 
		}, AllowLoopbackHttp: false);
	}

	private static Uri? Combine(string Base, string Path, bool AllowLoopbackHttp)
	{
		if (string.IsNullOrWhiteSpace(Base) || string.IsNullOrWhiteSpace(Path))
		{
			return null;
		}
		if (!Uri.TryCreate(Base.Trim().TrimEnd('/') + "/", UriKind.Absolute, out Uri result) || !SchemeAllowed(result, AllowLoopbackHttp))
		{
			return null;
		}
		if (!Uri.TryCreate(result, Path.Trim().TrimStart('/'), out Uri result2) || !SchemeAllowed(result2, AllowLoopbackHttp) || !(result2.Host == result.Host))
		{
			return null;
		}
		return result2;
	}

	private static bool SchemeAllowed(Uri Value, bool AllowLoopbackHttp)
	{
		if (!(Value.Scheme == Uri.UriSchemeHttps))
		{
			if (AllowLoopbackHttp && Value.Scheme == Uri.UriSchemeHttp)
			{
				return Value.IsLoopback;
			}
			return false;
		}
		return true;
	}
}
