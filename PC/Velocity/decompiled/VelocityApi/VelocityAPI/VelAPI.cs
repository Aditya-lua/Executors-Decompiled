using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.IO;
using System.Net.Http;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;
using System.Timers;
using coms;

namespace VelocityAPI;

public class VelAPI
{
	private HttpClient client = new HttpClient();

	private string current_version_url = "https://realvelocity.xyz/assets/current_version.txt";

	private string current_download_links_url = "https://realvelocity.xyz/assets/download_links.json";

	private Process decompilerProcess;

	public VelocityStates VelocityStatus = VelocityStates.NotAttached;

	public List<int> injected_pids = new List<int>();

	private Timer CommunicationTimer;

	public event Action<string, string> OnError;

	private void RaiseError(string title, string message)
	{
		OnError?.Invoke(title, message);
	}

	public static string Base64Encode(string plainText)
	{
		return Convert.ToBase64String(Encoding.UTF8.GetBytes(plainText));
	}

	private static DownloadUrlData ParseJson(string json)
	{
		return new DownloadUrlData
		{
			L1 = Get("L1"),
			L2 = Get("L2"),
			question = Get("question")
		};
		string Get(string key)
		{
			Match match = Regex.Match(json, "\"" + key + "\"\\s*:\\s*\"(.*?)\"");
			if (match.Success)
			{
				return match.Groups[1].Value;
			}
			return null;
		}
	}

	public static byte[] Base64Decode(string plainText)
	{
		return Convert.FromBase64String(plainText);
	}

	private bool IsPidRunning(int pid)
	{
		try
		{
			Process.GetProcessById(pid);
			return true;
		}
		catch (ArgumentException)
		{
			return false;
		}
	}

	private void AutoUpdate()
	{
		DownloadUrlData downloadUrlData = null;
		try
		{
			HttpResponseMessage result = client.GetAsync(current_download_links_url).Result;
			result.EnsureSuccessStatusCode();
			downloadUrlData = ParseJson(result.Content.ReadAsStringAsync().Result);
		}
		catch (HttpRequestException ex)
		{
			RaiseError("AutoUpdate Error", "Could not reach download server: " + ex.Message);
			return;
		}
		catch (AggregateException ex2) when (ex2.InnerException is HttpRequestException)
		{
			RaiseError("AutoUpdate Error", "Network error fetching download links: " + ex2.InnerException.Message);
			return;
		}
		catch (Exception ex3)
		{
			RaiseError("AutoUpdate Error", "Unexpected error fetching download links: " + ex3.Message);
			return;
		}
		if (downloadUrlData == null || downloadUrlData.L1 == null || downloadUrlData.L2 == null || downloadUrlData.question == null)
		{
			RaiseError("AutoUpdate Error", "Download link data was missing or malformed.");
			return;
		}
		string requestUri;
		string requestUri2;
		try
		{
			requestUri = AESEncryption.Decrypt(downloadUrlData.L1, downloadUrlData.question);
			requestUri2 = AESEncryption.Decrypt(downloadUrlData.L2, downloadUrlData.question);
		}
		catch (Exception ex4)
		{
			RaiseError("AutoUpdate Error", "Failed to decrypt download URLs: " + ex4.Message);
			return;
		}
		string result2;
		try
		{
			result2 = client.GetStringAsync(current_version_url).Result;
		}
		catch (HttpRequestException ex5)
		{
			RaiseError("AutoUpdate Error", "Could not reach version server: " + ex5.Message);
			return;
		}
		catch (AggregateException ex6) when (ex6.InnerException is HttpRequestException)
		{
			RaiseError("AutoUpdate Error", "Network error fetching version: " + ex6.InnerException.Message);
			return;
		}
		catch (Exception ex7)
		{
			RaiseError("AutoUpdate Error", "Unexpected error fetching version: " + ex7.Message);
			return;
		}
		string text = "";
		try
		{
			if (File.Exists("Bin\\current_version.txt"))
			{
				text = File.ReadAllText("Bin\\current_version.txt");
			}
		}
		catch (IOException ex8)
		{
			RaiseError("AutoUpdate Warning", "Could not read local version file: " + ex8.Message);
		}
		if (result2 != text)
		{
			try
			{
				if (File.Exists("Bin\\erto3e4rortoergn.exe"))
				{
					File.Delete("Bin\\erto3e4rortoergn.exe");
				}
				if (File.Exists("Bin\\Decompiler.exe"))
				{
					File.Delete("Bin\\Decompiler.exe");
				}
			}
			catch (IOException ex9)
			{
				RaiseError("AutoUpdate Error", "Could not delete old binaries: " + ex9.Message);
				return;
			}
			try
			{
				HttpResponseMessage result3 = client.GetAsync(requestUri2).Result;
				result3.EnsureSuccessStatusCode();
				File.WriteAllBytes("Bin\\erto3e4rortoergn.exe", result3.Content.ReadAsByteArrayAsync().Result);
			}
			catch (HttpRequestException ex10)
			{
				RaiseError("AutoUpdate Error", "Failed to download injector binary: " + ex10.Message);
				return;
			}
			catch (AggregateException ex11) when (ex11.InnerException is HttpRequestException)
			{
				RaiseError("AutoUpdate Error", "Network error downloading injector: " + ex11.InnerException.Message);
				return;
			}
			catch (IOException ex12)
			{
				RaiseError("AutoUpdate Error", "Failed to write injector binary: " + ex12.Message);
				return;
			}
			catch (Exception ex13)
			{
				RaiseError("AutoUpdate Error", "Unexpected error downloading injector: " + ex13.Message);
				return;
			}
			try
			{
				HttpResponseMessage result4 = client.GetAsync(requestUri).Result;
				result4.EnsureSuccessStatusCode();
				File.WriteAllBytes("Bin\\Decompiler.exe", result4.Content.ReadAsByteArrayAsync().Result);
			}
			catch (HttpRequestException ex14)
			{
				RaiseError("AutoUpdate Error", "Failed to download decompiler binary: " + ex14.Message);
				return;
			}
			catch (AggregateException ex15) when (ex15.InnerException is HttpRequestException)
			{
				RaiseError("AutoUpdate Error", "Network error downloading decompiler: " + ex15.InnerException.Message);
				return;
			}
			catch (IOException ex16)
			{
				RaiseError("AutoUpdate Error", "Failed to write decompiler binary: " + ex16.Message);
				return;
			}
			catch (Exception ex17)
			{
				RaiseError("AutoUpdate Error", "Unexpected error downloading decompiler: " + ex17.Message);
				return;
			}
		}
		try
		{
			File.WriteAllText("Bin\\current_version.txt", result2);
		}
		catch (IOException ex18)
		{
			RaiseError("AutoUpdate Warning", "Could not write version file: " + ex18.Message);
		}
	}

	public void StartCommunication()
	{
		try
		{
			if (!Directory.Exists("Bin"))
			{
				Directory.CreateDirectory("Bin");
			}
			if (!Directory.Exists("AutoExec"))
			{
				Directory.CreateDirectory("AutoExec");
			}
			if (!Directory.Exists("Workspace"))
			{
				Directory.CreateDirectory("Workspace");
			}
			if (!Directory.Exists("Scripts"))
			{
				Directory.CreateDirectory("Scripts");
			}
		}
		catch (IOException ex)
		{
			RaiseError("Startup Error", "Failed to create required directories: " + ex.Message);
			return;
		}
		try
		{
			AutoUpdate();
		}
		catch (Exception ex2)
		{
			RaiseError("AutoUpdate Error", "AutoUpdate encountered an error: " + ex2.Message);
		}
		StopCommunication();
		try
		{
			decompilerProcess = new Process();
			decompilerProcess.StartInfo.FileName = "Bin\\Decompiler.exe";
			decompilerProcess.StartInfo.UseShellExecute = false;
			decompilerProcess.EnableRaisingEvents = true;
			decompilerProcess.StartInfo.RedirectStandardError = true;
			decompilerProcess.StartInfo.RedirectStandardInput = true;
			decompilerProcess.StartInfo.RedirectStandardOutput = true;
			decompilerProcess.StartInfo.CreateNoWindow = true;
			decompilerProcess.Start();
		}
		catch (Exception ex3)
		{
			RaiseError("Startup Error", "Failed to start Decompiler process: " + ex3.Message);
			return;
		}
		CommunicationTimer = new Timer(100.0);
		CommunicationTimer.Elapsed += (object? source, ElapsedEventArgs e) =>
		{
			try
			{
				foreach (int item in new List<int>(injected_pids))
				{
					if (!IsPidRunning(item))
					{
						injected_pids.Remove(item);
					}
				}
				string plainText = "setworkspacefolder: " + Directory.GetCurrentDirectory() + "\\Workspace";
				foreach (int item2 in new List<int>(injected_pids))
				{
					try
					{
						NamedPipes.LuaPipe(Base64Encode(plainText), item2);
					}
					catch (Exception ex4)
					{
						RaiseError("Communication Error", $"Failed to pipe to PID {item2}: {ex4.Message}");
					}
				}
			}
			catch (Exception ex5)
			{
				RaiseError("Communication Error", "Unexpected error in timer callback: " + ex5.Message);
			}
		};
		CommunicationTimer.Start();
	}

	public void StopCommunication()
	{
		if (CommunicationTimer != null)
		{
			CommunicationTimer.Stop();
			CommunicationTimer = null;
		}
		if (decompilerProcess != null)
		{
			try
			{
				decompilerProcess.Kill();
			}
			catch (Exception ex)
			{
				RaiseError("Shutdown Warning", "Could not kill decompiler process: " + ex.Message);
			}
			finally
			{
				decompilerProcess.Dispose();
				decompilerProcess = null;
			}
		}
		injected_pids.Clear();
	}

	public bool IsAttached(int pid)
	{
		return injected_pids.Contains(pid);
	}

	public async Task<VelocityStates> Attach(int pid)
	{
		if (injected_pids.Contains(pid))
		{
			return VelocityStates.Attached;
		}
		VelocityStatus = VelocityStates.Attaching;
		try
		{
			Process.Start(new ProcessStartInfo
			{
				FileName = "Bin\\erto3e4rortoergn.exe",
				Arguments = $"{pid}",
				CreateNoWindow = false,
				UseShellExecute = false,
				RedirectStandardError = false,
				RedirectStandardOutput = false
			}).WaitForExit();
			injected_pids.Add(pid);
			VelocityStatus = VelocityStates.Attached;
			return VelocityStates.Attached;
		}
		catch (Exception ex)
		{
			RaiseError("Attach Error", $"Failed to attach to PID {pid}: {ex.Message}");
			VelocityStatus = VelocityStates.NotAttached;
			return VelocityStates.NotAttached;
		}
	}

	public VelocityStates Execute(string script, int pid = -1000)
	{
		if (injected_pids.Count.Equals(0))
		{
			return VelocityStates.NotAttached;
		}
		if (pid <= 0)
		{
			foreach (int item in new List<int>(injected_pids))
			{
				try
				{
					NamedPipes.LuaPipe(Base64Encode(script), item);
				}
				catch (Exception ex)
				{
					RaiseError("Execute Error", $"Failed to execute on PID {item}: {ex.Message}");
				}
			}
		}
		else
		{
			try
			{
				NamedPipes.LuaPipe(Base64Encode(script), pid);
			}
			catch (Exception ex2)
			{
				RaiseError("Execute Error", $"Failed to execute on PID {pid}: {ex2.Message}");
			}
		}
		return VelocityStates.Executed;
	}
}
