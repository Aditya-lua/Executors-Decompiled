using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.IO;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Text.Json;
using System.Text.Json.Serialization;
using System.Windows.Media;
using ScriptEditor.Services;

namespace ScriptEditor.Models;

public class AppSettings : INotifyPropertyChanged
{
	private static readonly string[] PreferredFonts = new string[7] { "Cascadia Code", "Cascadia Mono", "JetBrains Mono", "Fira Code", "Consolas", "Lucida Console", "Courier New" };

	private string _fontFamily = "Cascadia Code";

	private int _fontSize = 13;

	private int _tabSize = 4;

	private bool _wordWrap;

	private bool _showMinimap = true;

	private bool _showLineNumbers = true;

	private bool _showWhitespace;

	private bool _fontLigatures = true;

	private bool _smoothScrolling = true;

	private bool _bracketColorization = true;

	private bool _autoClosingBrackets = true;

	private string _accentColor = "#C4785C";

	private bool _showSplash = true;

	private bool _autoSave;

	private int _autoSaveDelaySeconds = 2;

	private bool _autoInject;

	private int _autoInjectDelaySeconds = 12;

	private bool _saveScripts = true;

	private bool _autoPickClients = true;

	private bool _executeOnAllClients = true;

	private bool _consoleVisible = true;

	private string _scriptHubApiKeyProtected = string.Empty;

	private const string DefaultAiBaseUrl = "https://api.openai.com/v1";

	private const string DefaultAiModel = "gpt-4o-mini";

	private bool _aiCompletionEnabled;

	private string _aiProvider = "copilot";

	private string _mcpServersJson = string.Empty;

	private string _claudeModel = string.Empty;

	private string[] _claudeKnownModels = Array.Empty<string>();

	private string _claudeSessionId = string.Empty;

	private bool _claudeToolsEnabled = true;

	private bool _claudeMayExecute;

	private string _aiBaseUrl = "https://api.openai.com/v1";

	private string _aiModel = "gpt-4o-mini";

	private string _aiApiKeyProtected = string.Empty;

	private int _aiDebounceMs = 500;

	private string _hubSort = "trending";

	private bool _hubNoKeySystem;

	private bool _hubFreeOnly;

	private bool _hubVerifiedOnly;

	private bool _hubMobileOnly;

	private string _scriptsFolder = DefaultScriptsFolder;

	public const string DefaultAccent = "#C4785C";

	public static IReadOnlyList<(string Name, string Hex)> AccentPresets { get; } = new _003C_003Ez__ReadOnlyArray<(string, string)>(new (string, string)[5]
	{
		("Ember", "#C4785C"),
		("Amber", "#C9A26D"),
		("Sage", "#8AA872"),
		("Steel", "#6E9CB8"),
		("Orchid", "#B0A0D0")
	});

	public static string DefaultScriptsFolder => Path.Combine(AppPaths.InstallFolder, "scripts");

	private static string SettingsPath => Path.Combine(Environment.GetFolderPath(Environment.SpecialFolder.LocalApplicationData), "Velocity", "settings.json");

	public string FontFamily
	{
		get
		{
			return _fontFamily;
		}
		set
		{
			Set(ref _fontFamily, value, "FontFamily");
		}
	}

	public int FontSize
	{
		get
		{
			return _fontSize;
		}
		set
		{
			Set(ref _fontSize, Math.Clamp(value, 8, 32), "FontSize");
		}
	}

	public int TabSize
	{
		get
		{
			return _tabSize;
		}
		set
		{
			Set(ref _tabSize, Math.Clamp(value, 2, 8), "TabSize");
		}
	}

	public bool WordWrap
	{
		get
		{
			return _wordWrap;
		}
		set
		{
			Set(ref _wordWrap, value, "WordWrap");
		}
	}

	public bool ShowMinimap
	{
		get
		{
			return _showMinimap;
		}
		set
		{
			Set(ref _showMinimap, value, "ShowMinimap");
		}
	}

	public bool ShowLineNumbers
	{
		get
		{
			return _showLineNumbers;
		}
		set
		{
			Set(ref _showLineNumbers, value, "ShowLineNumbers");
		}
	}

	public bool ShowWhitespace
	{
		get
		{
			return _showWhitespace;
		}
		set
		{
			Set(ref _showWhitespace, value, "ShowWhitespace");
		}
	}

	public bool FontLigatures
	{
		get
		{
			return _fontLigatures;
		}
		set
		{
			Set(ref _fontLigatures, value, "FontLigatures");
		}
	}

	public bool SmoothScrolling
	{
		get
		{
			return _smoothScrolling;
		}
		set
		{
			Set(ref _smoothScrolling, value, "SmoothScrolling");
		}
	}

	public bool BracketColorization
	{
		get
		{
			return _bracketColorization;
		}
		set
		{
			Set(ref _bracketColorization, value, "BracketColorization");
		}
	}

	public bool AutoClosingBrackets
	{
		get
		{
			return _autoClosingBrackets;
		}
		set
		{
			Set(ref _autoClosingBrackets, value, "AutoClosingBrackets");
		}
	}

	public string AccentColor
	{
		get
		{
			return _accentColor;
		}
		set
		{
			Set(ref _accentColor, string.IsNullOrWhiteSpace(value) ? "#C4785C" : value, "AccentColor");
		}
	}

	public bool ShowSplash
	{
		get
		{
			return _showSplash;
		}
		set
		{
			Set(ref _showSplash, value, "ShowSplash");
		}
	}

	public bool AutoSave
	{
		get
		{
			return _autoSave;
		}
		set
		{
			Set(ref _autoSave, value, "AutoSave");
		}
	}

	public int AutoSaveDelaySeconds
	{
		get
		{
			return _autoSaveDelaySeconds;
		}
		set
		{
			Set(ref _autoSaveDelaySeconds, Math.Clamp(value, 1, 60), "AutoSaveDelaySeconds");
		}
	}

	public bool AutoInject
	{
		get
		{
			return _autoInject;
		}
		set
		{
			Set(ref _autoInject, value, "AutoInject");
		}
	}

	public int AutoInjectDelaySeconds
	{
		get
		{
			return _autoInjectDelaySeconds;
		}
		set
		{
			Set(ref _autoInjectDelaySeconds, Math.Clamp(value, 0, 60), "AutoInjectDelaySeconds");
		}
	}

	public string ScriptHubApiKeyProtected
	{
		get
		{
			return _scriptHubApiKeyProtected;
		}
		set
		{
			Set(ref _scriptHubApiKeyProtected, value ?? string.Empty, "ScriptHubApiKeyProtected");
		}
	}

	[JsonIgnore]
	public string ScriptHubApiKey
	{
		get
		{
			return SecretProtector.Unprotect(_scriptHubApiKeyProtected);
		}
		set
		{
			ScriptHubApiKeyProtected = SecretProtector.Protect(value?.Trim());
			OnPropertyChanged("ScriptHubApiKey");
			OnPropertyChanged("HasScriptHubApiKey");
		}
	}

	[JsonIgnore]
	public bool HasScriptHubApiKey => !string.IsNullOrWhiteSpace(ScriptHubApiKey);

	public bool AiCompletionEnabled
	{
		get
		{
			return _aiCompletionEnabled;
		}
		set
		{
			Set(ref _aiCompletionEnabled, value, "AiCompletionEnabled");
		}
	}

	public string AiProvider
	{
		get
		{
			return _aiProvider;
		}
		set
		{
			Set(ref _aiProvider, string.IsNullOrWhiteSpace(value) ? "copilot" : value.Trim(), "AiProvider");
			OnPropertyChanged("UsesCopilot");
		}
	}

	[JsonIgnore]
	public bool UsesCopilot => string.Equals(AiProvider, "copilot", StringComparison.OrdinalIgnoreCase);

	public string AiBaseUrl
	{
		get
		{
			return _aiBaseUrl;
		}
		set
		{
			Set(ref _aiBaseUrl, string.IsNullOrWhiteSpace(value) ? "https://api.openai.com/v1" : value.Trim().TrimEnd('/'), "AiBaseUrl");
		}
	}

	public string AiModel
	{
		get
		{
			return _aiModel;
		}
		set
		{
			Set(ref _aiModel, string.IsNullOrWhiteSpace(value) ? "gpt-4o-mini" : value.Trim(), "AiModel");
		}
	}

	public int AiDebounceMs
	{
		get
		{
			return _aiDebounceMs;
		}
		set
		{
			Set(ref _aiDebounceMs, Math.Clamp(value, 150, 3000), "AiDebounceMs");
		}
	}

	public string AiApiKeyProtected
	{
		get
		{
			return _aiApiKeyProtected;
		}
		set
		{
			Set(ref _aiApiKeyProtected, value ?? string.Empty, "AiApiKeyProtected");
		}
	}

	[JsonIgnore]
	public string AiApiKey
	{
		get
		{
			return SecretProtector.Unprotect(_aiApiKeyProtected);
		}
		set
		{
			AiApiKeyProtected = SecretProtector.Protect(value?.Trim());
			OnPropertyChanged("AiApiKey");
			OnPropertyChanged("HasAiApiKey");
		}
	}

	[JsonIgnore]
	public bool HasAiApiKey => !string.IsNullOrWhiteSpace(AiApiKey);

	public string ClaudeSessionId
	{
		get
		{
			return _claudeSessionId;
		}
		set
		{
			Set(ref _claudeSessionId, value ?? string.Empty, "ClaudeSessionId");
		}
	}

	public string[] ClaudeKnownModels
	{
		get
		{
			return _claudeKnownModels;
		}
		set
		{
			Set(ref _claudeKnownModels, value ?? Array.Empty<string>(), "ClaudeKnownModels");
		}
	}

	public string ClaudeModel
	{
		get
		{
			return _claudeModel;
		}
		set
		{
			Set(ref _claudeModel, value?.Trim() ?? string.Empty, "ClaudeModel");
		}
	}

	public bool ClaudeToolsEnabled
	{
		get
		{
			return _claudeToolsEnabled;
		}
		set
		{
			Set(ref _claudeToolsEnabled, value, "ClaudeToolsEnabled");
		}
	}

	public bool ClaudeMayExecute
	{
		get
		{
			return _claudeMayExecute;
		}
		set
		{
			Set(ref _claudeMayExecute, value, "ClaudeMayExecute");
		}
	}

	public string McpServersJson
	{
		get
		{
			return _mcpServersJson;
		}
		set
		{
			Set(ref _mcpServersJson, value ?? string.Empty, "McpServersJson");
		}
	}

	public string HubSort
	{
		get
		{
			return _hubSort;
		}
		set
		{
			Set(ref _hubSort, string.IsNullOrWhiteSpace(value) ? "trending" : value, "HubSort");
		}
	}

	public bool HubNoKeySystem
	{
		get
		{
			return _hubNoKeySystem;
		}
		set
		{
			Set(ref _hubNoKeySystem, value, "HubNoKeySystem");
		}
	}

	public bool HubFreeOnly
	{
		get
		{
			return _hubFreeOnly;
		}
		set
		{
			Set(ref _hubFreeOnly, value, "HubFreeOnly");
		}
	}

	public bool HubVerifiedOnly
	{
		get
		{
			return _hubVerifiedOnly;
		}
		set
		{
			Set(ref _hubVerifiedOnly, value, "HubVerifiedOnly");
		}
	}

	public bool HubMobileOnly
	{
		get
		{
			return _hubMobileOnly;
		}
		set
		{
			Set(ref _hubMobileOnly, value, "HubMobileOnly");
		}
	}

	public bool ConsoleVisible
	{
		get
		{
			return _consoleVisible;
		}
		set
		{
			Set(ref _consoleVisible, value, "ConsoleVisible");
		}
	}

	public bool SaveScripts
	{
		get
		{
			return _saveScripts;
		}
		set
		{
			Set(ref _saveScripts, value, "SaveScripts");
		}
	}

	public bool AutoPickClients
	{
		get
		{
			return _autoPickClients;
		}
		set
		{
			Set(ref _autoPickClients, value, "AutoPickClients");
		}
	}

	public bool ExecuteOnAllClients
	{
		get
		{
			return _executeOnAllClients;
		}
		set
		{
			Set(ref _executeOnAllClients, value, "ExecuteOnAllClients");
		}
	}

	public string ScriptsFolder
	{
		get
		{
			return _scriptsFolder;
		}
		set
		{
			Set(ref _scriptsFolder, string.IsNullOrWhiteSpace(value) ? DefaultScriptsFolder : value, "ScriptsFolder");
		}
	}

	[JsonIgnore]
	public string SettingsFilePath => SettingsPath;

	[JsonIgnore]
	public IReadOnlyList<string> AvailableFonts { get; } = BuildFontList();

	public event PropertyChangedEventHandler? PropertyChanged;

	public static AppSettings Load()
	{
		try
		{
			if (File.Exists(SettingsPath))
			{
				AppSettings appSettings = JsonSerializer.Deserialize<AppSettings>(File.ReadAllText(SettingsPath));
				if (appSettings != null)
				{
					bool flag = false;
					if (!appSettings.AvailableFonts.Contains(appSettings.FontFamily))
					{
						appSettings.FontFamily = appSettings.AvailableFonts.FirstOrDefault() ?? "Consolas";
						flag = true;
					}
					if (flag | appSettings.DiscardStaleScriptsFolder())
					{
						appSettings.Save();
					}
					return appSettings;
				}
			}
		}
		catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException || ex is JsonException) ? true : false)
		{
		}
		AppSettings appSettings2 = new AppSettings();
		if (!appSettings2.AvailableFonts.Contains(appSettings2.FontFamily))
		{
			appSettings2.FontFamily = appSettings2.AvailableFonts.FirstOrDefault() ?? "Consolas";
		}
		return appSettings2;
	}

	public void Save()
	{
		try
		{
			string directoryName = Path.GetDirectoryName(SettingsPath);
			if (directoryName != null)
			{
				Directory.CreateDirectory(directoryName);
			}
			string contents = JsonSerializer.Serialize(this, new JsonSerializerOptions
			{
				WriteIndented = true
			});
			File.WriteAllText(SettingsPath, contents);
		}
		catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException) ? true : false)
		{
		}
	}

	public void ResetToDefaults()
	{
		AppSettings appSettings = new AppSettings();
		FontFamily = (AvailableFonts.Contains(appSettings.FontFamily) ? appSettings.FontFamily : (AvailableFonts.FirstOrDefault() ?? "Consolas"));
		FontSize = appSettings.FontSize;
		TabSize = appSettings.TabSize;
		WordWrap = appSettings.WordWrap;
		ShowMinimap = appSettings.ShowMinimap;
		ShowLineNumbers = appSettings.ShowLineNumbers;
		ShowWhitespace = appSettings.ShowWhitespace;
		FontLigatures = appSettings.FontLigatures;
		SmoothScrolling = appSettings.SmoothScrolling;
		BracketColorization = appSettings.BracketColorization;
		AutoClosingBrackets = appSettings.AutoClosingBrackets;
	}

	private bool DiscardStaleScriptsFolder()
	{
		try
		{
			if (Directory.Exists(ScriptsFolder))
			{
				return false;
			}
			string directoryName = Path.GetDirectoryName(ScriptsFolder);
			if (directoryName != null && Directory.Exists(directoryName))
			{
				return false;
			}
		}
		catch (Exception ex) when ((ex is IOException || ex is UnauthorizedAccessException || ex is ArgumentException) ? true : false)
		{
		}
		if (string.Equals(ScriptsFolder, DefaultScriptsFolder, StringComparison.OrdinalIgnoreCase))
		{
			return false;
		}
		ScriptsFolder = DefaultScriptsFolder;
		return true;
	}

	private static string[] BuildFontList()
	{
		HashSet<string> hashSet = new HashSet<string>(StringComparer.OrdinalIgnoreCase);
		foreach (FontFamily systemFontFamily in Fonts.SystemFontFamilies)
		{
			hashSet.Add(systemFontFamily.Source);
		}
		string[] array = PreferredFonts.Where(hashSet.Contains).ToArray();
		if (array.Length == 0)
		{
			return new string[1] { "Consolas" };
		}
		return array;
	}

	private void Set<T>(ref T field, T value, [CallerMemberName] string? name = null)
	{
		if (!EqualityComparer<T>.Default.Equals(field, value))
		{
			field = value;
			OnPropertyChanged(name);
		}
	}

	private void OnPropertyChanged(string? name)
	{
		PropertyChanged?.Invoke(this, new PropertyChangedEventArgs(name));
	}
}
