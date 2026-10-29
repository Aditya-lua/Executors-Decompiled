using System;
using System.IO;
using System.Security.Cryptography;
using System.Text;
using Newtonsoft.Json;
using dotnet_codex_ui.Infrastructure.Logging;

namespace dotnet_codex_ui.Features.Auth;

internal static class SessionStore
{
	private sealed record Stored(string Token, DateTimeOffset? Expires);

	private static readonly byte[] Entropy = Encoding.UTF8.GetBytes("Codex.Session.v1");

	public static string FilePath => Path.Combine(Environment.GetFolderPath(Environment.SpecialFolder.LocalApplicationData), "Codex", "session.bin");

	public static void Save(string Token, DateTimeOffset? Expires)
	{
		try
		{
			Directory.CreateDirectory(Path.GetDirectoryName(FilePath));
			byte[] bytes = Encoding.UTF8.GetBytes(JsonConvert.SerializeObject(new Stored(Token, Expires)));
			File.WriteAllBytes(FilePath, ProtectedData.Protect(bytes, Entropy, DataProtectionScope.CurrentUser));
		}
		catch (Exception failure)
		{
			AppLog.Error(failure, null, "Save", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Features\\Auth\\AuthService.cs");
		}
	}

	public static (string Token, DateTimeOffset? Expires)? Load()
	{
		try
		{
			if (!File.Exists(FilePath))
			{
				return null;
			}
			byte[] bytes = ProtectedData.Unprotect(File.ReadAllBytes(FilePath), Entropy, DataProtectionScope.CurrentUser);
			Stored stored = JsonConvert.DeserializeObject<Stored>(Encoding.UTF8.GetString(bytes));
			(string, DateTimeOffset?)? result;
			if ((object)stored != null)
			{
				string token = stored.Token;
				if (token != null && token.Length > 0)
				{
					result = (stored.Token, stored.Expires);
					goto IL_0077;
				}
			}
			result = null;
			goto IL_0077;
			IL_0077:
			return result;
		}
		catch
		{
			return null;
		}
	}

	public static void Delete()
	{
		try
		{
			if (File.Exists(FilePath))
			{
				File.Delete(FilePath);
			}
		}
		catch
		{
		}
	}
}
