using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.IO;
using System.Linq;
using System.Text.Json;
using Microsoft.Win32;
using dotnet_codex_bootstrapper.Core.Configuration;
using dotnet_codex_bootstrapper.Infrastructure;
using dotnet_codex_bootstrapper.Services;

namespace dotnet_codex_bootstrapper.Features.RobloxLauncher;

public sealed class ProtocolRegistration(string BackupFile, string Bootstrapper, string ClassesPath = "Software\\Classes", string EnvironmentsPath = "Software\\ROBLOX Corporation\\Environments", string UninstallPath = "Software\\Microsoft\\Windows\\CurrentVersion\\Uninstall")
{
	public static readonly string[] Schemes = new string[2] { "roblox", "roblox-player" };

	public const string PlayerExecutable = "RobloxPlayerBeta.exe";

	public const string ChannelValueName = "www.roblox.com";

	private static readonly string[] RobloxExecutables = new string[2] { "RobloxPlayerBeta.exe", "RobloxPlayerLauncher.exe" };

	private static readonly JsonSerializerOptions Json = new JsonSerializerOptions
	{
		WriteIndented = true
	};

	public const string CommandTail = " --roblox \"%1\"";

	public string Command => "\"" + Bootstrapper + "\" --roblox \"%1\"";

	private string ChannelKey => EnvironmentsPath + "\\RobloxPlayer\\Channel";

	public bool IsActive => Schemes.Any((string Scheme) => OwnerOf(Scheme) == HandlerOwner.Codex);

	public static string TakeOverQuestion(string Handler)
	{
		return "Roblox links currently open with " + Path.GetFileName(Handler) + ".\n\nLet Codex open them instead? Codex keeps a copy of the current setting and gives the links back when you turn the Codex Roblox launcher off.";
	}

	public static ProtocolRegistration For(BootstrapperPaths Paths, string? Bootstrapper = null)
	{
		return new ProtocolRegistration(Path.Combine(Paths.StateDirectory, "roblox-protocol.json"), Path.GetFullPath(Bootstrapper ?? Paths.InstalledBootstrapper));
	}

	public static string? HandlerFor(string Current, BootstrapperPaths Paths)
	{
		string fullPath = Path.GetFullPath(Current);
		if (string.Equals(fullPath, Path.GetFullPath(Paths.InstalledBootstrapper), StringComparison.OrdinalIgnoreCase))
		{
			return fullPath;
		}
		string fullPath2 = Path.GetFullPath(Path.GetTempPath());
		if (!fullPath.StartsWith(fullPath2, StringComparison.OrdinalIgnoreCase) && Path.GetExtension(fullPath).Equals(".exe", StringComparison.OrdinalIgnoreCase))
		{
			return fullPath;
		}
		return null;
	}

	public string? CommandOf(string Scheme)
	{
		using RegistryKey registryKey = Registry.CurrentUser.OpenSubKey(ClassesPath + "\\" + Scheme + "\\shell\\open\\command");
		return registryKey?.GetValue(null) as string;
	}

	public HandlerOwner OwnerOf(string Scheme)
	{
		return Classify(CommandOf(Scheme));
	}

	public static HandlerOwner Classify(string? Command)
	{
		string text = ExecutableOf(Command);
		if (text == null)
		{
			return HandlerOwner.None;
		}
		string fileName = Path.GetFileName(text);
		if (fileName.Equals("Codex Bootstrapper.exe", StringComparison.OrdinalIgnoreCase) || Command.TrimEnd().EndsWith(" --roblox \"%1\"", StringComparison.Ordinal))
		{
			return HandlerOwner.Codex;
		}
		if (!RobloxExecutables.Contains(fileName, StringComparer.OrdinalIgnoreCase))
		{
			return HandlerOwner.Other;
		}
		return HandlerOwner.Roblox;
	}

	public static string? ExecutableOf(string? Command)
	{
		string text = Command?.Trim() ?? string.Empty;
		if (text.Length == 0)
		{
			return null;
		}
		if (text[0] == '"')
		{
			int num = text.IndexOf('"', 1);
			if (num <= 1)
			{
				return null;
			}
			return text.Substring(1, num - 1);
		}
		int num2 = text.IndexOf(' ');
		if (num2 >= 0)
		{
			return text.Substring(0, num2);
		}
		return text;
	}

	public void Reconcile(bool Enabled, Func<string, bool> ConfirmTakeOver)
	{
		if (Enabled)
		{
			TakeOver(ConfirmTakeOver);
		}
		else if (IsActive || File.Exists(BackupFile))
		{
			Restore();
		}
	}

	public bool TakeOver(Func<string, bool> ConfirmTakeOver)
	{
		ProtocolBackup protocolBackup = Load() ?? new ProtocolBackup();
		string text = Schemes.Select(CommandOf).FirstOrDefault((string Command) => Classify(Command) == HandlerOwner.Other);
		if (text != null)
		{
			if (string.Equals(protocolBackup.DeclinedCommand, text, StringComparison.Ordinal))
			{
				return false;
			}
			if (!ConfirmTakeOver(ExecutableOf(text) ?? text))
			{
				protocolBackup.DeclinedCommand = text;
				Save(protocolBackup);
				AppLog.Information("The Roblox links stay with {Handler}; taking them over was declined", ExecutableOf(text));
				return false;
			}
		}
		bool flag = false;
		string[] schemes = Schemes;
		foreach (string text2 in schemes)
		{
			if (OwnerOf(text2) != HandlerOwner.Codex)
			{
				protocolBackup.Schemes[text2] = Snapshot(ClassesPath + "\\" + text2);
				flag = true;
			}
		}
		if (flag)
		{
			protocolBackup.DeclinedCommand = null;
			Save(protocolBackup);
		}
		schemes = Schemes;
		foreach (string text3 in schemes)
		{
			if (!string.Equals(CommandOf(text3), Command, StringComparison.Ordinal))
			{
				Write(text3);
				AppLog.Information("The {Scheme} links now open through Codex", text3);
			}
		}
		return true;
	}

	public void Restore()
	{
		ProtocolBackup protocolBackup = Load();
		string[] schemes = Schemes;
		foreach (string text in schemes)
		{
			if (OwnerOf(text) != HandlerOwner.Codex)
			{
				continue;
			}
			string text2 = ClassesPath + "\\" + text;
			RegistryKeyRecord registryKeyRecord = ((protocolBackup != null) ? protocolBackup.Schemes.GetValueOrDefault(text) : null);
			string text3 = ExecutableOf(CommandIn(registryKeyRecord));
			if ((object)registryKeyRecord != null && text3 != null && File.Exists(text3) && Classify(CommandIn(registryKeyRecord)) != HandlerOwner.Codex)
			{
				Registry.CurrentUser.DeleteSubKeyTree(text2, throwOnMissingSubKey: false);
				Apply(text2, registryKeyRecord);
				AppLog.Information("The {Scheme} links were given back to {Handler}", text, text3);
				continue;
			}
			string text4 = StockExecutable();
			if (text4 != null)
			{
				Registry.CurrentUser.DeleteSubKeyTree(text2, throwOnMissingSubKey: false);
				using RegistryKey registryKey = Registry.CurrentUser.CreateSubKey(text2);
				registryKey.SetValue(null, "URL: Roblox Protocol");
				registryKey.SetValue("URL Protocol", string.Empty);
				using (RegistryKey registryKey2 = registryKey.CreateSubKey("DefaultIcon"))
				{
					registryKey2.SetValue(null, text4);
				}
				using (RegistryKey registryKey3 = registryKey.CreateSubKey("shell\\open\\command"))
				{
					registryKey3.SetValue(null, "\"" + text4 + "\" %1");
				}
				AppLog.Information("The {Scheme} links were given back to the installed Roblox at {Path}", text, text4);
			}
			else
			{
				Registry.CurrentUser.DeleteSubKeyTree(text2, throwOnMissingSubKey: false);
				AppLog.Information("The {Scheme} links were removed; no Roblox installation was found to give them back to", text);
			}
		}
		if (protocolBackup != null && protocolBackup.ChannelCaptured)
		{
			using RegistryKey registryKey4 = Registry.CurrentUser.CreateSubKey(ChannelKey);
			if (protocolBackup.ChannelValue == null)
			{
				registryKey4.DeleteValue("www.roblox.com", throwOnMissingValue: false);
			}
			else
			{
				registryKey4.SetValue("www.roblox.com", protocolBackup.ChannelValue);
			}
			AppLog.Information("The Roblox channel setting was restored");
		}
		if (File.Exists(BackupFile))
		{
			File.Delete(BackupFile);
		}
	}

	public void ForceLiveChannel()
	{
		using RegistryKey registryKey = Registry.CurrentUser.CreateSubKey(ChannelKey);
		string text = registryKey.GetValue("www.roblox.com") as string;
		if (!(text == string.Empty))
		{
			ProtocolBackup protocolBackup = Load() ?? new ProtocolBackup();
			if (!protocolBackup.ChannelCaptured)
			{
				protocolBackup.ChannelCaptured = true;
				protocolBackup.ChannelValue = text;
				Save(protocolBackup);
			}
			registryKey.SetValue("www.roblox.com", string.Empty);
			AppLog.Information("The Roblox channel was set to LIVE (it was '{Channel}')", text ?? "unset");
		}
	}

	public string? RegisteredChannel()
	{
		using RegistryKey registryKey = Registry.CurrentUser.OpenSubKey(ChannelKey);
		return registryKey?.GetValue("www.roblox.com") as string;
	}

	public string? OriginalCommand()
	{
		ProtocolBackup? protocolBackup = Load();
		string text = CommandIn((protocolBackup != null) ? protocolBackup.Schemes.GetValueOrDefault("roblox-player") : null);
		HandlerOwner handlerOwner = Classify(text);
		bool flag = (uint)(handlerOwner - 2) <= 1u;
		if (flag && File.Exists(ExecutableOf(text)))
		{
			return text;
		}
		string text2 = CommandOf("roblox-player");
		handlerOwner = Classify(text2);
		flag = (uint)(handlerOwner - 2) <= 1u;
		if (flag && File.Exists(ExecutableOf(text2)))
		{
			return text2;
		}
		string text3 = StockExecutable();
		if (text3 == null)
		{
			return null;
		}
		return "\"" + text3 + "\" %1";
	}

	public static bool StartWith(string Command, string Uri)
	{
		string text = ExecutableOf(Command);
		if (text == null || !LaunchUri.IsValid(Uri))
		{
			return false;
		}
		string text2 = Command.Trim();
		text2 = ((text2[0] == '"') ? text2.Substring(text.Length + 2) : text2.Substring(text.Length));
		using Process process = Process.Start(new ProcessStartInfo(text, text2.Replace("%1", Uri, StringComparison.Ordinal).Trim())
		{
			UseShellExecute = false,
			WorkingDirectory = (Path.GetDirectoryName(text) ?? string.Empty)
		});
		return process != null;
	}

	public string? StockExecutable()
	{
		using (RegistryKey registryKey = Registry.CurrentUser.OpenSubKey(UninstallPath + "\\roblox-player"))
		{
			if (registryKey?.GetValue("InstallLocation") is string { Length: >0 } text)
			{
				string text2 = Path.Combine(text, "RobloxPlayerBeta.exe");
				if (File.Exists(text2))
				{
					return text2;
				}
			}
		}
		using RegistryKey registryKey2 = Registry.CurrentUser.OpenSubKey(EnvironmentsPath + "\\roblox-player");
		return (registryKey2?.GetValue("clientExe") is string text3 && Path.GetFileName(text3).Equals("RobloxPlayerBeta.exe", StringComparison.OrdinalIgnoreCase) && File.Exists(text3)) ? text3 : null;
	}

	private void Write(string Scheme)
	{
		using RegistryKey registryKey = Registry.CurrentUser.CreateSubKey(ClassesPath + "\\" + Scheme);
		if (registryKey.GetValue(null) == null)
		{
			registryKey.SetValue(null, "URL: Roblox Protocol");
		}
		if (registryKey.GetValue("URL Protocol") == null)
		{
			registryKey.SetValue("URL Protocol", string.Empty);
		}
		using (RegistryKey registryKey2 = registryKey.CreateSubKey("DefaultIcon"))
		{
			registryKey2.SetValue(null, Bootstrapper);
		}
		using RegistryKey registryKey3 = registryKey.CreateSubKey("shell\\open\\command");
		registryKey3.SetValue(null, Command);
	}

	private static string? CommandIn(RegistryKeyRecord? Record)
	{
		RegistryKeyRecord value = Record;
		string[] array = new string[3] { "shell", "open", "command" };
		foreach (string key in array)
		{
			if ((object)value == null || !value.Children.TryGetValue(key, out value))
			{
				return null;
			}
		}
		return value?.Values.FirstOrDefault((RegistryValueRecord Value) => Value.Name.Length == 0)?.Text;
	}

	public static RegistryKeyRecord? Snapshot(string Path0)
	{
		using RegistryKey registryKey = Registry.CurrentUser.OpenSubKey(Path0);
		return (registryKey == null) ? null : Capture(registryKey);
	}

	private static RegistryKeyRecord Capture(RegistryKey Key)
	{
		List<RegistryValueRecord> list = new List<RegistryValueRecord>();
		string[] valueNames = Key.GetValueNames();
		foreach (string name in valueNames)
		{
			RegistryValueKind valueKind = Key.GetValueKind(name);
			object value = Key.GetValue(name, null, RegistryValueOptions.DoNotExpandEnvironmentNames);
			List<RegistryValueRecord> list2 = list;
			RegistryValueRecord item;
			switch (valueKind)
			{
			case RegistryValueKind.String:
			case RegistryValueKind.ExpandString:
				item = new RegistryValueRecord(name, valueKind, value as string);
				break;
			case RegistryValueKind.DWord:
				item = new RegistryValueRecord(name, valueKind, null, (value is int num) ? num : 0);
				break;
			case RegistryValueKind.QWord:
				item = new RegistryValueRecord(name, valueKind, null, (value is long num2) ? num2 : 0);
				break;
			case RegistryValueKind.MultiString:
			{
				string[] lines = value as string[];
				item = new RegistryValueRecord(name, valueKind, null, null, lines);
				break;
			}
			default:
			{
				string bytes = ((value is byte[] inArray) ? Convert.ToBase64String(inArray) : string.Empty);
				item = new RegistryValueRecord(name, RegistryValueKind.Binary, null, null, null, bytes);
				break;
			}
			}
			list2.Add(item);
		}
		Dictionary<string, RegistryKeyRecord> dictionary = new Dictionary<string, RegistryKeyRecord>(StringComparer.OrdinalIgnoreCase);
		valueNames = Key.GetSubKeyNames();
		foreach (string text in valueNames)
		{
			using RegistryKey registryKey = Key.OpenSubKey(text);
			if (registryKey != null)
			{
				dictionary[text] = Capture(registryKey);
			}
		}
		return new RegistryKeyRecord(list, dictionary);
	}

	public static void Apply(string Path0, RegistryKeyRecord Record)
	{
		using RegistryKey registryKey = Registry.CurrentUser.CreateSubKey(Path0);
		foreach (RegistryValueRecord value in Record.Values)
		{
			string name = ((value.Name.Length == 0) ? null : value.Name);
			switch (value.Kind)
			{
			case RegistryValueKind.String:
			case RegistryValueKind.ExpandString:
				registryKey.SetValue(name, value.Text ?? string.Empty, value.Kind);
				break;
			case RegistryValueKind.DWord:
				registryKey.SetValue(name, (int)value.Number.GetValueOrDefault(), value.Kind);
				break;
			case RegistryValueKind.QWord:
				registryKey.SetValue(name, value.Number.GetValueOrDefault(), value.Kind);
				break;
			case RegistryValueKind.MultiString:
				registryKey.SetValue(name, value.Lines ?? Array.Empty<string>(), value.Kind);
				break;
			default:
				registryKey.SetValue(name, Convert.FromBase64String(value.Bytes ?? string.Empty), RegistryValueKind.Binary);
				break;
			}
		}
		foreach (var (text2, record) in Record.Children)
		{
			Apply(Path0 + "\\" + text2, record);
		}
	}

	private ProtocolBackup? Load()
	{
		try
		{
			return File.Exists(BackupFile) ? JsonSerializer.Deserialize<ProtocolBackup>(File.ReadAllBytes(BackupFile), Json) : null;
		}
		catch (Exception ex) when ((ex is JsonException || ex is IOException || ex is UnauthorizedAccessException) ? true : false)
		{
			AppLog.Warning(ex, "The saved Roblox link settings could not be read");
			return null;
		}
	}

	private void Save(ProtocolBackup Backup)
	{
		InstallStateStore.WriteAtomic(BackupFile, JsonSerializer.SerializeToUtf8Bytes(Backup, Json));
	}
}
