using System.Runtime.InteropServices;

public class NativeMethods
{
	public const string DllName = "SolaraV3.dll";

	[DllImport("SolaraV3.dll", CallingConvention = CallingConvention.Cdecl)]
	public static extern int Start([MarshalAs(UnmanagedType.LPStr)] string guid);
}
