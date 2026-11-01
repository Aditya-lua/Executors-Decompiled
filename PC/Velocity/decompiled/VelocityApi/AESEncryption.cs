using System;
using System.Runtime.InteropServices;
using System.Security.Cryptography;
using System.Text;

public class AESEncryption
{
	private struct BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO
	{
		public uint cbSize;

		public uint dwInfoVersion;

		public nint pbNonce;

		public uint cbNonce;

		public nint pbAuthData;

		public uint cbAuthData;

		public nint pbTag;

		public uint cbTag;

		public nint pbMacContext;

		public uint cbMacContext;

		public uint cbAAD;

		public ulong cbData;

		public uint dwFlags;
	}

	private const int KeySize = 256;

	private const int SaltSize = 16;

	private const int NonceSize = 12;

	private const int TagSize = 16;

	private const int Iterations = 100000;

	[DllImport("bcrypt.dll", CharSet = CharSet.Unicode)]
	private static extern uint BCryptOpenAlgorithmProvider(out nint phAlgorithm, string pszAlgId, string pszImplementation, uint dwFlags);

	[DllImport("bcrypt.dll")]
	private static extern uint BCryptCloseAlgorithmProvider(nint hAlgorithm, uint dwFlags);

	[DllImport("bcrypt.dll")]
	private static extern uint BCryptGenerateSymmetricKey(nint hAlgorithm, out nint phKey, nint pbKeyObject, uint cbKeyObject, byte[] pbSecret, uint cbSecret, uint dwFlags);

	[DllImport("bcrypt.dll")]
	private static extern uint BCryptDestroyKey(nint hKey);

	[DllImport("bcrypt.dll")]
	private static extern uint BCryptEncrypt(nint hKey, byte[] pbInput, uint cbInput, ref BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO pPaddingInfo, byte[] pbIV, uint cbIV, byte[] pbOutput, uint cbOutput, out uint pcbResult, uint dwFlags);

	[DllImport("bcrypt.dll")]
	private static extern uint BCryptDecrypt(nint hKey, byte[] pbInput, uint cbInput, ref BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO pPaddingInfo, byte[] pbIV, uint cbIV, byte[] pbOutput, uint cbOutput, out uint pcbResult, uint dwFlags);

	[DllImport("bcrypt.dll", CharSet = CharSet.Unicode)]
	private static extern uint BCryptSetProperty(nint hObject, string pszProperty, byte[] pbInput, uint cbInput, uint dwFlags);

	public static string Encrypt(string plaintext, string password)
	{
		try
		{
			if (string.IsNullOrEmpty(plaintext))
			{
				throw new ArgumentException("Plaintext cannot be empty");
			}
			if (string.IsNullOrEmpty(password))
			{
				throw new ArgumentException("Password cannot be empty");
			}
			byte[] array = GenerateRandomBytes(16);
			byte[] array2 = GenerateRandomBytes(12);
			byte[] key = DeriveKey(password, array);
			byte[] array3 = EncryptBCrypt(Encoding.UTF8.GetBytes(plaintext), key, array2, out byte[] tag);
			byte[] array4 = new byte[array.Length + array2.Length + array3.Length + tag.Length];
			Buffer.BlockCopy(array, 0, array4, 0, array.Length);
			Buffer.BlockCopy(array2, 0, array4, array.Length, array2.Length);
			Buffer.BlockCopy(array3, 0, array4, array.Length + array2.Length, array3.Length);
			Buffer.BlockCopy(tag, 0, array4, array.Length + array2.Length + array3.Length, tag.Length);
			return Convert.ToBase64String(array4);
		}
		catch (Exception)
		{
			throw;
		}
	}

	public static string Decrypt(string ciphertext, string password)
	{
		try
		{
			if (string.IsNullOrEmpty(ciphertext))
			{
				throw new ArgumentException("Ciphertext cannot be empty");
			}
			if (string.IsNullOrEmpty(password))
			{
				throw new ArgumentException("Password cannot be empty");
			}
			byte[] array;
			try
			{
				array = Convert.FromBase64String(ciphertext);
			}
			catch (FormatException)
			{
				throw;
			}
			int num = 44;
			if (array.Length < num)
			{
				throw new CryptographicException("Invalid ciphertext: data too short");
			}
			byte[] array2 = new byte[16];
			byte[] array3 = new byte[12];
			int num2 = array.Length - 16 - 12 - 16;
			byte[] array4 = new byte[num2];
			byte[] array5 = new byte[16];
			Buffer.BlockCopy(array, 0, array2, 0, 16);
			Buffer.BlockCopy(array, 16, array3, 0, 12);
			Buffer.BlockCopy(array, 28, array4, 0, num2);
			Buffer.BlockCopy(array, 28 + num2, array5, 0, 16);
			byte[] key = DeriveKey(password, array2);
			return Encoding.UTF8.GetString(DecryptBCrypt(array4, key, array3, array5));
		}
		catch (CryptographicException)
		{
			throw;
		}
		catch (Exception)
		{
			throw;
		}
	}

	private static byte[] EncryptBCrypt(byte[] plaintext, byte[] key, byte[] nonce, out byte[] tag)
	{
		nint phAlgorithm = IntPtr.Zero;
		nint phKey = IntPtr.Zero;
		GCHandle gCHandle = default;
		GCHandle gCHandle2 = default;
		tag = new byte[16];
		try
		{
			uint num = BCryptOpenAlgorithmProvider(out phAlgorithm, "AES", null, 0u);
			if (num != 0)
			{
				throw new CryptographicException($"BCryptOpenAlgorithmProvider failed: 0x{num:X8}");
			}
			byte[] bytes = Encoding.Unicode.GetBytes("ChainingModeGCM\0");
			uint num2 = BCryptSetProperty(phAlgorithm, "ChainingMode", bytes, (uint)bytes.Length, 0u);
			if (num2 != 0)
			{
				throw new CryptographicException($"BCryptSetProperty failed: 0x{num2:X8}");
			}
			uint num3 = BCryptGenerateSymmetricKey(phAlgorithm, out phKey, IntPtr.Zero, 0u, key, (uint)key.Length, 0u);
			if (num3 != 0)
			{
				throw new CryptographicException($"BCryptGenerateSymmetricKey failed: 0x{num3:X8}");
			}
			gCHandle = GCHandle.Alloc(nonce, GCHandleType.Pinned);
			gCHandle2 = GCHandle.Alloc(tag, GCHandleType.Pinned);
			BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO pPaddingInfo = new BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO
			{
				cbSize = (uint)Marshal.SizeOf(typeof(BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO)),
				dwInfoVersion = 1u,
				pbNonce = gCHandle.AddrOfPinnedObject(),
				cbNonce = (uint)nonce.Length,
				pbTag = gCHandle2.AddrOfPinnedObject(),
				cbTag = (uint)tag.Length
			};
			byte[] array = new byte[plaintext.Length];
			uint num4 = BCryptEncrypt(phKey, plaintext, (uint)plaintext.Length, ref pPaddingInfo, null, 0u, array, (uint)array.Length, out var _, 0u);
			if (num4 != 0)
			{
				throw new CryptographicException($"BCryptEncrypt failed: 0x{num4:X8}");
			}
			return array;
		}
		finally
		{
			if (gCHandle.IsAllocated)
			{
				gCHandle.Free();
			}
			if (gCHandle2.IsAllocated)
			{
				gCHandle2.Free();
			}
			if (phKey != IntPtr.Zero)
			{
				BCryptDestroyKey(phKey);
			}
			if (phAlgorithm != IntPtr.Zero)
			{
				BCryptCloseAlgorithmProvider(phAlgorithm, 0u);
			}
		}
	}

	private static byte[] DecryptBCrypt(byte[] ciphertext, byte[] key, byte[] nonce, byte[] tag)
	{
		nint phAlgorithm = IntPtr.Zero;
		nint phKey = IntPtr.Zero;
		GCHandle gCHandle = default;
		GCHandle gCHandle2 = default;
		try
		{
			uint num = BCryptOpenAlgorithmProvider(out phAlgorithm, "AES", null, 0u);
			if (num != 0)
			{
				throw new CryptographicException($"BCryptOpenAlgorithmProvider failed: 0x{num:X8}");
			}
			byte[] bytes = Encoding.Unicode.GetBytes("ChainingModeGCM\0");
			uint num2 = BCryptSetProperty(phAlgorithm, "ChainingMode", bytes, (uint)bytes.Length, 0u);
			if (num2 != 0)
			{
				throw new CryptographicException($"BCryptSetProperty failed: 0x{num2:X8}");
			}
			uint num3 = BCryptGenerateSymmetricKey(phAlgorithm, out phKey, IntPtr.Zero, 0u, key, (uint)key.Length, 0u);
			if (num3 != 0)
			{
				throw new CryptographicException($"BCryptGenerateSymmetricKey failed: 0x{num3:X8}");
			}
			gCHandle = GCHandle.Alloc(nonce, GCHandleType.Pinned);
			gCHandle2 = GCHandle.Alloc(tag, GCHandleType.Pinned);
			BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO pPaddingInfo = new BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO
			{
				cbSize = (uint)Marshal.SizeOf(typeof(BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO)),
				dwInfoVersion = 1u,
				pbNonce = gCHandle.AddrOfPinnedObject(),
				cbNonce = (uint)nonce.Length,
				pbTag = gCHandle2.AddrOfPinnedObject(),
				cbTag = (uint)tag.Length
			};
			byte[] array = new byte[ciphertext.Length];
			uint num4 = BCryptDecrypt(phKey, ciphertext, (uint)ciphertext.Length, ref pPaddingInfo, null, 0u, array, (uint)array.Length, out var _, 0u);
			if (num4 != 0)
			{
				throw new CryptographicException($"BCryptDecrypt failed: 0x{num4:X8} - Wrong password or corrupted data");
			}
			return array;
		}
		finally
		{
			if (gCHandle.IsAllocated)
			{
				gCHandle.Free();
			}
			if (gCHandle2.IsAllocated)
			{
				gCHandle2.Free();
			}
			if (phKey != IntPtr.Zero)
			{
				BCryptDestroyKey(phKey);
			}
			if (phAlgorithm != IntPtr.Zero)
			{
				BCryptCloseAlgorithmProvider(phAlgorithm, 0u);
			}
		}
	}

	private static byte[] DeriveKey(string password, byte[] salt)
	{
		return PBKDF2_SHA256(Encoding.UTF8.GetBytes(password), salt, 100000, 32);
	}

	private static byte[] PBKDF2_SHA256(byte[] password, byte[] salt, int iterations, int outputBytes)
	{
		using HMACSHA256 hMACSHA = new HMACSHA256(password);
		int num = hMACSHA.HashSize / 8;
		int num2 = (int)Math.Ceiling((double)outputBytes / (double)num);
		byte[] array = new byte[num2 * num];
		for (int i = 1; i <= num2; i++)
		{
			byte[] array2 = new byte[salt.Length + 4];
			Buffer.BlockCopy(salt, 0, array2, 0, salt.Length);
			Buffer.BlockCopy(GetBigEndianBytes(i), 0, array2, salt.Length, 4);
			byte[] array3 = hMACSHA.ComputeHash(array2);
			byte[] array4 = (byte[])array3.Clone();
			for (int j = 1; j < iterations; j++)
			{
				array3 = hMACSHA.ComputeHash(array3);
				for (int k = 0; k < array4.Length; k++)
				{
					array4[k] ^= array3[k];
				}
			}
			Buffer.BlockCopy(array4, 0, array, (i - 1) * num, num);
		}
		byte[] array5 = new byte[outputBytes];
		Buffer.BlockCopy(array, 0, array5, 0, outputBytes);
		return array5;
	}

	private static byte[] GetBigEndianBytes(int value)
	{
		byte[] bytes = BitConverter.GetBytes(value);
		if (BitConverter.IsLittleEndian)
		{
			Array.Reverse(bytes);
		}
		return bytes;
	}

	private static byte[] GenerateRandomBytes(int length)
	{
		byte[] array = new byte[length];
		using RNGCryptoServiceProvider rNGCryptoServiceProvider = new RNGCryptoServiceProvider();
		rNGCryptoServiceProvider.GetBytes(array);
		return array;
	}
}
