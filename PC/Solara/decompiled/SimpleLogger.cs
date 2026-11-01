using System;
using System.IO;
using System.Text;

public static class SimpleLogger
{
	private static readonly object _lock;

	private static readonly string _logPath;

	static SimpleLogger()
	{
		_lock = new object();
		_logPath = Path.Combine(AppDomain.CurrentDomain.BaseDirectory, "bin", "UIDEBUG.txt");
		try
		{
			string directoryName = Path.GetDirectoryName(_logPath);
			if (directoryName != null && !Directory.Exists(directoryName))
			{
				Directory.CreateDirectory(directoryName);
			}
			File.WriteAllText(_logPath, string.Empty, Encoding.UTF8);
		}
		catch
		{
		}
	}

	public static void Log(string message)
	{
		try
		{
			string directoryName = Path.GetDirectoryName(_logPath);
			if (directoryName != null && !Directory.Exists(directoryName))
			{
				Directory.CreateDirectory(directoryName);
			}
			string text = string.Format("[{0}]: {1}", DateTime.Now.ToString("yyyy-MM-dd HH:mm:ss"), message);
			lock (_lock)
			{
				File.AppendAllText(_logPath, text + Environment.NewLine, Encoding.UTF8);
			}
		}
		catch
		{
		}
	}
}
