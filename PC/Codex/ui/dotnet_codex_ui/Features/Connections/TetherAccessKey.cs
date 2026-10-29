using System;
using System.Security.Cryptography;
using Tether;
using dotnet_codex_ui.Configuration;

namespace dotnet_codex_ui.Features.Connections;

internal static class TetherAccessKey
{
	private const string Name = "TetherAccessKey";

	public static byte[] GetOrCreate()
	{
		byte[] array = TryRead();
		if (array != null && array.Length >= 16)
		{
			return array;
		}
		return Regenerate();
	}

	public static byte[] Regenerate()
	{
		byte[] array = TetherServerOptions.GenerateKey();
		UiRegistry.SetString("TetherAccessKey", Convert.ToBase64String(ProtectedData.Protect(array, null, DataProtectionScope.CurrentUser)));
		return array;
	}

	public static string Display(byte[] Key)
	{
		return Convert.ToBase64String(Key);
	}

	private static byte[]? TryRead()
	{
		try
		{
			string text = UiRegistry.GetString("TetherAccessKey");
			return (text != null && text.Length > 0) ? ProtectedData.Unprotect(Convert.FromBase64String(text), null, DataProtectionScope.CurrentUser) : null;
		}
		catch (Exception ex) when ((ex is FormatException || ex is CryptographicException) ? true : false)
		{
			return null;
		}
	}
}
