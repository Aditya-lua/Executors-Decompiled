using System;
using System.IO;
using System.IO.Pipes;
using System.Runtime.InteropServices;
using System.Text;
using System.Threading;

namespace coms;

internal class NamedPipes
{
	public static string luapipename = "uoQcySKXSUxxJNpVQyatpHQwYoGfhcbh";

	[DllImport("kernel32.dll", CharSet = CharSet.Auto, SetLastError = true)]
	[return: MarshalAs(UnmanagedType.Bool)]
	private static extern bool WaitNamedPipe(string name, int timeout);

	public static bool NamedPipeExist(string pipeName)
	{
		try
		{
			if (!WaitNamedPipe("\\\\.\\pipe\\" + pipeName, 0))
			{
				switch (Marshal.GetLastWin32Error())
				{
				case 0:
					return false;
				case 2:
					return false;
				}
			}
			return true;
		}
		catch (Exception)
		{
			return false;
		}
	}

	public static void LuaPipe(string script, int pid)
	{
		if (!NamedPipeExist($"{luapipename}_{pid}"))
		{
			return;
		}
		new Thread(() =>
		{
			try
			{
				using NamedPipeClientStream namedPipeClientStream = new NamedPipeClientStream(".", $"{luapipename}_{pid}", PipeDirection.Out);
				namedPipeClientStream.Connect();
				using (StreamWriter streamWriter = new StreamWriter(namedPipeClientStream, Encoding.Default, 999999))
				{
					streamWriter.Write(script);
					streamWriter.Dispose();
				}
				namedPipeClientStream.Dispose();
			}
			catch (IOException)
			{
			}
			catch (Exception)
			{
			}
		}).Start();
	}
}
