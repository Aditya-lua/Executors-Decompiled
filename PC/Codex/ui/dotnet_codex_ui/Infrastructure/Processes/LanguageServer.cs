using System;
using System.Diagnostics;
using System.IO;
using System.Net.Http;
using System.Threading;
using System.Threading.Tasks;
using System.Windows;
using dotnet_codex_ui.Infrastructure.Logging;
using dotnet_codex_ui.Services;

namespace dotnet_codex_ui.Infrastructure.Processes;

internal static class LanguageServer
{
	internal const int Port = 6969;

	internal static readonly string Url = $"http://127.0.0.1:{6969}/";

	internal static readonly string Root = Path.Combine(AppDomain.CurrentDomain.BaseDirectory, "bin", "language-server");

	internal static readonly string[] Directories = new string[4] { "dist/client", "dist/client/assets", "dist/server", "assets/bin" };

	internal static readonly string[] Files = new string[7] { "node.exe", "dist/client/index.html", "dist/server/index.js", "assets/bin/en-us.json", "assets/bin/globalTypes.d.luau", "assets/bin/lsp.d.luau", "assets/bin/luau-lsp.exe" };

	private const int MaxRetries = 3;

	private static readonly TimeSpan StableRuntime = TimeSpan.FromSeconds(30L);

	private static readonly HttpClient Probe = new HttpClient
	{
		Timeout = TimeSpan.FromSeconds(1L)
	};

	private static readonly object LogLock = new object();

	private static readonly CancellationTokenSource Shutdown = new CancellationTokenSource();

	private static Task? Supervisor;

	private static Process? Process;

	private static volatile int RunningId;

	private static string NodePath => Path.Combine(Root, "node.exe");

	private static string ServerScript => Path.Combine(Root, "dist", "server", "index.js");

	private static string LogPath => Path.Combine(AppDomain.CurrentDomain.BaseDirectory, "logs", "language-server.log");

	internal static async Task StartAsync(TimeSpan? Timeout = null)
	{
		if (!Verify())
		{
			return;
		}
		if (Supervisor == null)
		{
			Supervisor = Task.Run((Func<Task?>)SuperviseAsync);
		}
		DateTime Deadline = DateTime.UtcNow + (Timeout ?? TimeSpan.FromSeconds(20L));
		while (DateTime.UtcNow < Deadline && !Supervisor.IsCompleted)
		{
			try
			{
				using HttpResponseMessage httpResponseMessage = await Probe.GetAsync(Url, Shutdown.Token);
				if (httpResponseMessage.IsSuccessStatusCode)
				{
					return;
				}
			}
			catch (Exception ex) when ((ex is HttpRequestException || ex is TaskCanceledException) ? true : false)
			{
			}
			await Task.Delay(150);
		}
		Log($"The server did not answer {Url} in time (supervisor finished: {Supervisor.IsCompleted}).");
	}

	internal static async Task Reset()
	{
		int runningId = RunningId;
		Shutdown.Cancel();
		try
		{
			if (runningId != 0)
			{
				using Process process = System.Diagnostics.Process.GetProcessById(runningId);
				if (process.ProcessName.Equals("node", StringComparison.OrdinalIgnoreCase))
				{
					process.Kill(entireProcessTree: true);
				}
			}
		}
		catch
		{
		}
		if (Supervisor != null)
		{
			try
			{
				await Supervisor;
			}
			catch
			{
			}
		}
	}

	private static bool Verify()
	{
		try
		{
			string[] directories = Directories;
			foreach (string path in directories)
			{
				if (!Directory.Exists(Path.Combine(Root, path)))
				{
					throw new DirectoryNotFoundException("The '" + Path.Combine(Root, path) + "' directory does not exist. Please ensure the Codex project is built correctly.");
				}
			}
			directories = Files;
			foreach (string path2 in directories)
			{
				if (!File.Exists(Path.Combine(Root, path2)))
				{
					throw new FileNotFoundException("The '" + Path.Combine(Root, path2) + "' file does not exist. Please ensure the Codex project is built correctly.");
				}
			}
			return true;
		}
		catch (Exception ex)
		{
			Log(ex.Message);
			MessageBox.Show(ex.Message);
			return false;
		}
	}

	private static async Task SuperviseAsync()
	{
		int Attempts = 0;
		try
		{
			Directory.CreateDirectory(Path.GetDirectoryName(LogPath));
			File.WriteAllText(LogPath, "");
		}
		catch
		{
		}
		while (Attempts < 3 && !Shutdown.IsCancellationRequested)
		{
			Stopwatch Started = Stopwatch.StartNew();
			try
			{
				ProcessStartInfo startInfo = new ProcessStartInfo
				{
					FileName = NodePath,
					Arguments = $"\"{ServerScript}\" --process-id={Environment.ProcessId}",
					WorkingDirectory = Root,
					UseShellExecute = false,
					CreateNoWindow = true,
					RedirectStandardError = true
				};
				Process = new Process
				{
					StartInfo = startInfo,
					EnableRaisingEvents = true
				};
				Process.ErrorDataReceived += (object _, DataReceivedEventArgs Data) =>
				{
					if (Data.Data != null)
					{
						Log(Data.Data);
					}
				};
				Process.Start();
				Process.BeginErrorReadLine();
				ChildProcess.Attach(Process);
				RunningId = Process.Id;
				Log($"Started the language server (pid {Process.Id}).");
				await Process.WaitForExitAsync(Shutdown.Token);
				Log($"The language server exited with code {Process.ExitCode}.");
			}
			catch (OperationCanceledException)
			{
				return;
			}
			catch (Exception ex2)
			{
				Log($"The language server could not run: {ex2}");
				AppLog.Error(ex2, null, "SuperviseAsync", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Infrastructure\\Processes\\LanguageServer.cs");
			}
			finally
			{
				RunningId = 0;
				try
				{
					Process?.Dispose();
				}
				catch
				{
				}
				Process = null;
			}
			Attempts = ((Started.Elapsed >= StableRuntime) ? 1 : (Attempts + 1));
			try
			{
				await Task.Delay(1000, Shutdown.Token);
			}
			catch (OperationCanceledException)
			{
				return;
			}
		}
		if (!Shutdown.IsCancellationRequested)
		{
			TimeoutException Failure = new TimeoutException($"The language server stopped and could not be restarted after {3} attempts. See {LogPath} for details.");
			Log(Failure.Message);
			AppLog.Error(Failure, null, "SuperviseAsync", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Infrastructure\\Processes\\LanguageServer.cs");
			Application.Current?.Dispatcher.BeginInvoke((Func<ToastHandle>)(() => ToastService.ShowError("Language Server Stopped", "Code completion and error checking are unavailable. See logs/language-server.log.", null, Failure)));
		}
	}

	private static void Log(string Message)
	{
		AppLog.Information("LanguageServer: {Message}", Message);
		try
		{
			lock (LogLock)
			{
				File.AppendAllText(LogPath, $"{DateTime.Now:yyyy-MM-dd HH:mm:ss.fff} {Message}{Environment.NewLine}");
			}
		}
		catch
		{
		}
	}
}
