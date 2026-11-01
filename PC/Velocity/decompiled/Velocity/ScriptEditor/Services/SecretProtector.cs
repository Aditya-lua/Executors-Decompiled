using System;
using System.Security.Cryptography;
using System.Text;

namespace ScriptEditor.Services;

public static class SecretProtector
{
	private const string Prefix = "dpapi:";

	private static readonly byte[] Entropy = Encoding.UTF8.GetBytes("Velocity.ScriptHub.v1");

	public static string Protect(string? plainText)
	{
		if (string.IsNullOrEmpty(plainText))
		{
			return string.Empty;
		}
		try
		{
			byte[] inArray = ProtectedData.Protect(Encoding.UTF8.GetBytes(plainText), Entropy, (DataProtectionScope)0);
			return "dpapi:" + Convert.ToBase64String(inArray);
		}
		catch (CryptographicException)
		{
			return plainText;
		}
	}

	public static string Unprotect(string? stored)
	{
		if (string.IsNullOrEmpty(stored))
		{
			return string.Empty;
		}
		if (!stored.StartsWith("dpapi:", StringComparison.Ordinal))
		{
			return stored;
		}
		try
		{
			byte[] bytes = ProtectedData.Unprotect(Convert.FromBase64String(stored.Substring("dpapi:".Length)), Entropy, (DataProtectionScope)0);
			return Encoding.UTF8.GetString(bytes);
		}
		catch (Exception ex) when ((ex is CryptographicException || ex is FormatException) ? true : false)
		{
			return string.Empty;
		}
	}
}
