using System;
using System.IO;
using System.Runtime.InteropServices;
using System.Security.Cryptography;
using System.Security.Cryptography.X509Certificates;

namespace dotnet_codex_bootstrapper.Features.RobloxLauncher;

public static class RobloxSignature
{
	private struct WinTrustFileInfo
	{
		public uint Size;

		public nint FilePath;

		public nint File;

		public nint KnownSubject;
	}

	private struct WinTrustData
	{
		public uint Size;

		public nint PolicyCallbackData;

		public nint SipClientData;

		public uint UiChoice;

		public uint RevocationChecks;

		public uint UnionChoice;

		public nint FileInfo;

		public uint StateAction;

		public nint StateData;

		public nint UrlReference;

		public uint ProviderFlags;

		public uint UiContext;

		public nint SignatureSettings;
	}

	public const string RobloxOrganization = "O=Roblox Corporation";

	private static readonly Guid GenericVerifyV2 = new Guid("00AAC56B-CD44-11d0-8CC2-00C04FC295EE");

	[DllImport("wintrust.dll")]
	private static extern int WinVerifyTrust(nint Window, ref Guid Action, ref WinTrustData Data);

	public static bool IsRobloxSigned(string Image)
	{
		return IsSignedBy(Image, "O=Roblox Corporation");
	}

	public static bool IsSignedBy(string Image, string Organization)
	{
		if (!File.Exists(Image))
		{
			return false;
		}
		nint num = Marshal.StringToCoTaskMemUni(Image);
		nint num2 = Marshal.AllocCoTaskMem(Marshal.SizeOf<WinTrustFileInfo>());
		try
		{
			Marshal.StructureToPtr(new WinTrustFileInfo
			{
				Size = (uint)Marshal.SizeOf<WinTrustFileInfo>(),
				FilePath = num
			}, num2, fDeleteOld: false);
			WinTrustData Data = new WinTrustData
			{
				Size = (uint)Marshal.SizeOf<WinTrustData>(),
				UiChoice = 2u,
				UnionChoice = 1u,
				FileInfo = num2,
				StateAction = 1u,
				ProviderFlags = 4096u
			};
			Guid Action = GenericVerifyV2;
			int num3 = WinVerifyTrust(new IntPtr(-1), ref Action, ref Data);
			Data.StateAction = 2u;
			WinVerifyTrust(new IntPtr(-1), ref Action, ref Data);
			if (num3 != 0)
			{
				return false;
			}
			using X509Certificate2 x509Certificate = new X509Certificate2(X509Certificate.CreateFromSignedFile(Image));
			return x509Certificate.Subject.Split(", ").Contains(Organization, StringComparer.Ordinal);
		}
		catch (CryptographicException)
		{
			return false;
		}
		finally
		{
			Marshal.FreeCoTaskMem(num2);
			Marshal.FreeCoTaskMem(num);
		}
	}
}
