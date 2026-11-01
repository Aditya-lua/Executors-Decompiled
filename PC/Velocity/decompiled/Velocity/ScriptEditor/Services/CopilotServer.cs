using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Diagnostics;
using System.IO;
using System.Text;
using System.Text.Json;
using System.Text.Json.Nodes;
using System.Threading;
using System.Threading.Tasks;
using ScriptEditor.Models;

namespace ScriptEditor.Services;

public sealed class CopilotServer : IDisposable
{
	private readonly SemaphoreSlim _writeLock = new SemaphoreSlim(1, 1);

	private readonly CancellationTokenSource _shutdown = new CancellationTokenSource();

	private readonly Dictionary<int, TaskCompletionSource<JsonNode?>> _pending = new Dictionary<int, TaskCompletionSource<JsonNode>>();

	private readonly Dictionary<string, int> _versions = new Dictionary<string, int>();

	private Process? _process;

	private int _nextId = 1;

	private string? _focusedUri;

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

	public bool IsSignedIn { get; private set; }

	public string? WorkspaceFolder { get; set; }

	public event Action<string, OutputKind>? Message;

	public event Action<string, string>? SignInPrompt;

	public event Action<bool>? SignedInChanged;

	public async Task SetWorkspaceFolderAsync(string? folder)
	{
		string workspaceFolder = WorkspaceFolder;
		WorkspaceFolder = folder;
		if (IsRunning && !string.Equals(workspaceFolder, folder, StringComparison.OrdinalIgnoreCase))
		{
			await NotifyAsync("workspace/didChangeWorkspaceFolders", new
			{
				@event = new
				{
					added = Describe(folder),
					removed = Describe(workspaceFolder)
				}
			});
		}
	}

	private static object[] Describe(string? folder)
	{
		if (string.IsNullOrWhiteSpace(folder) || !Directory.Exists(folder))
		{
			return Array.Empty<object>();
		}
		return new object[1]
		{
			new
			{
				uri = new Uri(folder).AbsoluteUri,
				name = new DirectoryInfo(folder).Name
			}
		};
	}

	public async Task<bool> StartAsync()
	{
		if (IsRunning)
		{
			return true;
		}
		string serverPath = CopilotInstaller.ServerPath;
		if (!File.Exists(serverPath))
		{
			Report("Copilot is not installed yet.", OutputKind.Warning);
			return false;
		}
		ProcessStartInfo processStartInfo = new ProcessStartInfo(serverPath)
		{
			WorkingDirectory = Path.GetDirectoryName(serverPath),
			RedirectStandardInput = true,
			RedirectStandardOutput = true,
			RedirectStandardError = false,
			UseShellExecute = false,
			CreateNoWindow = true
		};
		processStartInfo.ArgumentList.Add("--stdio");
		try
		{
			_process = Process.Start(processStartInfo);
		}
		catch (Exception ex) when ((ex is Win32Exception || ex is IOException) ? true : false)
		{
			Report("Could not start Copilot: " + ex.Message, OutputKind.Error);
			return false;
		}
		if (_process == null)
		{
			return false;
		}
		Task.Run(() => ReadLoopAsync(_shutdown.Token));
		object[] array = Describe(WorkspaceFolder);
		if (await RequestAsync("initialize", new
		{
			processId = Environment.ProcessId,
			rootUri = ((array.Length != 0) ? new Uri(WorkspaceFolder).AbsoluteUri : null),
			workspaceFolders = ((array.Length != 0) ? array : null),
			capabilities = new
			{
				workspace = new
				{
					workspaceFolders = true
				}
			},
			initializationOptions = new
			{
				editorInfo = new
				{
					name = "Velocity",
					version = ProductInfo.LocalVersion
				},
				editorPluginInfo = new
				{
					name = "velocity-copilot",
					version = "1.0.0"
				}
			}
		}) == null)
		{
			Report("Copilot did not complete its handshake.", OutputKind.Error);
			return false;
		}
		await NotifyAsync("initialized", new { });
		await OpenReferenceDocumentsAsync();
		return true;
	}

	private async Task OpenReferenceDocumentsAsync()
	{
		string definitions = Path.Combine(AppPaths.LanguageServerFolder, "velocity.d.luau");
		if (File.Exists(definitions))
		{
			string text;
			try
			{
				text = await File.ReadAllTextAsync(definitions);
			}
			catch (IOException)
			{
				return;
			}
			string absoluteUri = new Uri(definitions).AbsoluteUri;
			_versions[absoluteUri] = 1;
			await NotifyAsync("textDocument/didOpen", new
			{
				textDocument = new
				{
					uri = absoluteUri,
					languageId = "lua",
					version = 1,
					text = text
				}
			});
		}
	}

	public async Task<bool> CheckStatusAsync()
	{
		bool flag = !IsRunning;
		if (flag)
		{
			flag = !(await StartAsync());
		}
		if (flag)
		{
			return false;
		}
		string text = (await RequestAsync("checkStatus", new { }))?["status"]?.GetValue<string>();
		flag = ((text == "OK" || text == "MaybeOk") ? true : false);
		bool flag2 = flag;
		SetSignedIn(flag2);
		return flag2;
	}

	public async Task SignInAsync()
	{
		bool flag = !IsRunning;
		if (flag)
		{
			flag = !(await StartAsync());
		}
		if (flag)
		{
			return;
		}
		JsonNode jsonNode = await RequestAsync("signIn", new { });
		if (jsonNode == null)
		{
			Report("Copilot sign-in could not be started.", OutputKind.Error);
			return;
		}
		if (string.Equals(jsonNode["status"]?.GetValue<string>(), "AlreadySignedIn", StringComparison.OrdinalIgnoreCase))
		{
			SetSignedIn(value: true);
			return;
		}
		string text = jsonNode["userCode"]?.GetValue<string>();
		string text2 = jsonNode["verificationUri"]?.GetValue<string>();
		if (text == null || text2 == null)
		{
			Report("Copilot sign-in returned no device code.", OutputKind.Error);
		}
		else
		{
			SignInPrompt?.Invoke(text, text2);
		}
	}

	public async Task SignOutAsync()
	{
		if (IsRunning)
		{
			await RequestAsync("signOut", new { });
			SetSignedIn(value: false);
		}
	}

	public async Task<IReadOnlyList<VelocityCompletionServer.InlineCompletionItem>> InlineCompletionAsync(string uri, string prefix, string suffix)
	{
		if (!IsRunning || !IsSignedIn)
		{
			return Array.Empty<VelocityCompletionServer.InlineCompletionItem>();
		}
		await SyncDocumentAsync(uri, prefix + suffix);
		int num = 0;
		int num2 = 0;
		for (int i = 0; i < prefix.Length; i++)
		{
			switch (prefix[i])
			{
			case '\n':
				num++;
				num2 = 0;
				break;
			default:
				num2++;
				break;
			case '\r':
				break;
			}
		}
		if (!((await RequestAsync("textDocument/inlineCompletion", new
		{
			textDocument = new
			{
				uri = uri,
				version = _versions[uri]
			},
			position = new
			{
				line = num,
				character = num2
			},
			context = new
			{
				triggerKind = 2
			},
			formattingOptions = new
			{
				tabSize = 4,
				insertSpaces = true
			}
		}))?["items"] is JsonArray jsonArray))
		{
			return Array.Empty<VelocityCompletionServer.InlineCompletionItem>();
		}
		List<VelocityCompletionServer.InlineCompletionItem> list = new List<VelocityCompletionServer.InlineCompletionItem>();
		foreach (JsonNode item in jsonArray)
		{
			string text = item?["insertText"]?.GetValue<string>();
			if (!string.IsNullOrEmpty(text))
			{
				list.Add(new VelocityCompletionServer.InlineCompletionItem(text, ReadRange(item?["range"])));
			}
		}
		return list;
	}

	private static VelocityCompletionServer.InlineRange? ReadRange(JsonNode? range)
	{
		JsonNode jsonNode = range?["start"];
		if (jsonNode != null)
		{
			JsonNode jsonNode2 = range["end"];
			if (jsonNode2 != null)
			{
				return new VelocityCompletionServer.InlineRange(jsonNode["line"]?.GetValue<int>() ?? 0, jsonNode["character"]?.GetValue<int>() ?? 0, jsonNode2["line"]?.GetValue<int>() ?? 0, jsonNode2["character"]?.GetValue<int>() ?? 0);
			}
		}
		return null;
	}

	private async Task SyncDocumentAsync(string uri, string text)
	{
		if (_versions.TryGetValue(uri, out var value))
		{
			value = (_versions[uri] = value + 1);
			await NotifyAsync("textDocument/didChange", new
			{
				textDocument = new
				{
					uri = uri,
					version = value
				},
				contentChanges = new object[1]
				{
					new { text }
				}
			});
		}
		else
		{
			_versions[uri] = 1;
			await NotifyAsync("textDocument/didOpen", new
			{
				textDocument = new
				{
					uri = uri,
					languageId = "lua",
					version = 1,
					text = text
				}
			});
		}
		if (!(_focusedUri == uri))
		{
			_focusedUri = uri;
			await NotifyAsync("textDocument/didFocus", new
			{
				textDocument = new { uri }
			});
		}
	}

	private async Task<JsonNode?> RequestAsync(string method, object parameters)
	{
		Process process = _process;
		if (process == null || process.HasExited)
		{
			return null;
		}
		TaskCompletionSource<JsonNode?> completion = new TaskCompletionSource<JsonNode>(TaskCreationOptions.RunContinuationsAsynchronously);
		int id;
		lock (_pending)
		{
			id = _nextId++;
			_pending[id] = completion;
		}
		await SendAsync(new
		{
			jsonrpc = "2.0",
			id = id,
			method = method,
			@params = parameters
		});
		if (await Task.WhenAny(completion.Task, Task.Delay(TimeSpan.FromSeconds(20L))) != completion.Task)
		{
			lock (_pending)
			{
				_pending.Remove(id);
			}
			return null;
		}
		return await completion.Task;
	}

	private Task NotifyAsync(string method, object parameters)
	{
		return SendAsync(new
		{
			jsonrpc = "2.0",
			method = method,
			@params = parameters
		});
	}

	private async Task SendAsync(object payload)
	{
		Process process = _process;
		if (process == null || process.HasExited)
		{
			return;
		}
		byte[] body = JsonSerializer.SerializeToUtf8Bytes(payload);
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
				Dispatch(Encoding.UTF8.GetString(payload));
			}
		}
		catch (Exception ex) when ((ex is IOException || ex is ObjectDisposedException || ex is OperationCanceledException) ? true : false)
		{
		}
		if (!token.IsCancellationRequested)
		{
			Report("Copilot stopped.", OutputKind.Warning);
		}
	}

	private void Dispatch(string payload)
	{
		JsonNode jsonNode;
		try
		{
			jsonNode = JsonNode.Parse(payload);
		}
		catch (JsonException)
		{
			return;
		}
		if (jsonNode == null)
		{
			return;
		}
		JsonNode jsonNode2 = jsonNode["id"];
		if (jsonNode2 != null && jsonNode["method"] == null)
		{
			int value = jsonNode2.GetValue<int>();
			TaskCompletionSource<JsonNode> value2;
			lock (_pending)
			{
				_pending.Remove(value, out value2);
			}
			value2?.TrySetResult((jsonNode["error"] == null) ? jsonNode["result"] : null);
			return;
		}
		string text = jsonNode["method"]?.GetValue<string>();
		switch (text)
		{
		default:
			_ = text == "window/logMessage";
			break;
		case "didChangeStatus":
		case "statusNotification":
		{
			string text2 = jsonNode["params"]?["status"]?.GetValue<string>();
			if (text2 != null)
			{
				SetSignedIn(!text2.Contains("NotSignedIn", StringComparison.OrdinalIgnoreCase) && !text2.Contains("Error", StringComparison.OrdinalIgnoreCase));
			}
			break;
		}
		case "window/showMessageRequest":
			break;
		}
	}

	private static async Task<int> ReadContentLengthAsync(Stream stream, CancellationToken token)
	{
		StringBuilder header = new StringBuilder(64);
		int length = -1;
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
				int result;
				if (text.Length == 0)
				{
					if (length >= 0)
					{
						return length;
					}
				}
				else if (text.StartsWith("Content-Length:", StringComparison.OrdinalIgnoreCase) && int.TryParse(text.AsSpan("Content-Length:".Length).Trim(), out result))
				{
					length = result;
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

	private void SetSignedIn(bool value)
	{
		if (IsSignedIn != value)
		{
			IsSignedIn = value;
			SignedInChanged?.Invoke(value);
		}
	}

	private void Report(string message, OutputKind kind)
	{
		Message?.Invoke(message, kind);
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
