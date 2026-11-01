using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Diagnostics;
using System.IO;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using ScriptEditor.Models;

namespace ScriptEditor.Services;

public sealed class LuauLanguageServer : IDisposable
{
	private readonly SemaphoreSlim _writeLock = new SemaphoreSlim(1, 1);

	private readonly CancellationTokenSource _shutdown = new CancellationTokenSource();

	private Process? _process;

	public bool IsRunning
	{
		get
		{
			Process process = _process;
			if (process != null)
			{
				return !process.HasExited;
			}
			return false;
		}
	}

	public event Action<string>? PayloadReceived;

	public event Action<string, OutputKind>? Message;

	public bool Start()
	{
		if (IsRunning)
		{
			return true;
		}
		string languageServerFolder = AppPaths.LanguageServerFolder;
		string text = Path.Combine(languageServerFolder, "luau-lsp.exe");
		if (!File.Exists(text))
		{
			Message?.Invoke("Language server is missing — completions are unavailable.", OutputKind.Warning);
			return false;
		}
		List<string> list = new List<string> { "lsp" };
		AddIfPresent(list, languageServerFolder, "--definitions", "globalTypes.RobloxScriptSecurity.d.luau", "roblox");
		AddIfPresent(list, languageServerFolder, "--definitions", "velocity.d.luau", "velocity");
		AddIfPresent(list, languageServerFolder, "--docs", "docs.json");
		ProcessStartInfo processStartInfo = new ProcessStartInfo(text)
		{
			WorkingDirectory = languageServerFolder,
			RedirectStandardInput = true,
			RedirectStandardOutput = true,
			RedirectStandardError = true,
			UseShellExecute = false,
			CreateNoWindow = true,
			StandardOutputEncoding = null
		};
		foreach (string item in list)
		{
			processStartInfo.ArgumentList.Add(item);
		}
		try
		{
			_process = Process.Start(processStartInfo);
		}
		catch (Exception ex) when ((ex is Win32Exception || ex is IOException) ? true : false)
		{
			Message?.Invoke("Could not start the language server: " + ex.Message, OutputKind.Error);
			return false;
		}
		if (_process == null)
		{
			return false;
		}
		Task.Run(() => ReadLoopAsync(_shutdown.Token));
		Task.Run(() => DrainErrorsAsync(_shutdown.Token));
		return true;
	}

	public async Task SendAsync(string payload)
	{
		Process process = _process;
		if (process == null || process.HasExited)
		{
			return;
		}
		byte[] body = Encoding.UTF8.GetBytes(payload);
		byte[] header = Encoding.ASCII.GetBytes($"Content-Length: {body.Length}\r\n\r\n");
		await _writeLock.WaitAsync();
		try
		{
			Stream stdin = process.StandardInput.BaseStream;
			await stdin.WriteAsync(header);
			await stdin.WriteAsync(body);
			await stdin.FlushAsync();
		}
		catch (Exception ex) when ((ex is IOException || ex is ObjectDisposedException || ex is InvalidOperationException) ? true : false)
		{
		}
		finally
		{
			_writeLock.Release();
		}
	}

	private static void AddIfPresent(List<string> args, string folder, string flag, string file, string? name = null)
	{
		string text = Path.Combine(folder, file);
		if (File.Exists(text))
		{
			args.Add((name == null) ? (flag + "=" + text) : $"{flag}=@{name}={text}");
		}
	}

	private async Task ReadLoopAsync(CancellationToken token)
	{
		Stream stdout = _process.StandardOutput.BaseStream;
		try
		{
			while (!token.IsCancellationRequested)
			{
				int length = await ReadContentLengthAsync(stdout, token);
				if (length < 0)
				{
					break;
				}
				byte[] payload = new byte[length];
				int num;
				for (int filled = 0; filled < length; filled += num)
				{
					num = await stdout.ReadAsync(payload.AsMemory(filled, length - filled), token);
					if (num == 0)
					{
						return;
					}
				}
				PayloadReceived?.Invoke(Encoding.UTF8.GetString(payload));
			}
		}
		catch (Exception ex) when ((ex is IOException || ex is ObjectDisposedException || ex is OperationCanceledException) ? true : false)
		{
		}
		if (!token.IsCancellationRequested)
		{
			Message?.Invoke("Language server stopped — completions are unavailable.", OutputKind.Warning);
		}
	}

	private static async Task<int> ReadContentLengthAsync(Stream stream, CancellationToken token)
	{
		StringBuilder header = new StringBuilder(64);
		int length = -1;
		int consecutiveNewlines = 0;
		byte[] one = new byte[1];
		while (await stream.ReadAsync(one.AsMemory(0, 1), token) != 0)
		{
			char c = (char)one[0];
			switch (c)
			{
			case '\r':
				break;
			case '\n':
			{
				string text = header.ToString();
				header.Clear();
				if (text.Length == 0)
				{
					int num = consecutiveNewlines + 1;
					consecutiveNewlines = num;
					if (num >= 1 && length >= 0)
					{
						return length;
					}
				}
				else
				{
					consecutiveNewlines = 0;
					if (text.StartsWith("Content-Length:", StringComparison.OrdinalIgnoreCase) && int.TryParse(text.AsSpan("Content-Length:".Length).Trim(), out var result))
					{
						length = result;
					}
				}
				break;
			}
			default:
				header.Append(c);
				break;
			}
		}
		return -1;
	}

	private async Task DrainErrorsAsync(CancellationToken token)
	{
		try
		{
			while (true)
			{
				string text = await _process.StandardError.ReadLineAsync(token);
				if (text != null)
				{
					if (text.Length <= 0)
					{
					}
					continue;
				}
				break;
			}
		}
		catch (Exception ex) when ((ex is IOException || ex is ObjectDisposedException || ex is OperationCanceledException) ? true : false)
		{
		}
	}

	public void Dispose()
	{
		_shutdown.Cancel();
		try
		{
			Process process = _process;
			if (process != null && !process.HasExited)
			{
				process.Kill(entireProcessTree: true);
				process.WaitForExit(2000);
			}
		}
		catch (Exception ex) when ((ex is InvalidOperationException || ex is Win32Exception || ex is NotSupportedException) ? true : false)
		{
		}
		_process?.Dispose();
		_process = null;
		_shutdown.Dispose();
		_writeLock.Dispose();
	}
}
