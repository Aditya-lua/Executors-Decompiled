using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Diagnostics;
using System.IO;
using System.Linq;
using System.Text;
using System.Text.Json;
using System.Text.Json.Nodes;
using System.Threading;
using System.Threading.Tasks;
using ScriptEditor.Models;

namespace ScriptEditor.Services;

public sealed class ClaudeService : IDisposable
{
	public readonly record struct Account(bool LoggedIn, string? Email, string? Plan, string? Method);

	public readonly record struct ModelVersion(string Id, string Label);

	private readonly CancellationTokenSource _shutdown = new CancellationTokenSource();

	private Process? _process;

	private string? _sessionId;

	public static readonly string[] FallbackModels = new string[5] { "", "fable", "opus", "sonnet", "haiku" };

	public bool IsBusy
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

	public static bool IsAvailable => ResolveCli() != null;

	public string? SessionId
	{
		get
		{
			return _sessionId;
		}
		set
		{
			_sessionId = (string.IsNullOrWhiteSpace(value) ? null : value);
		}
	}

	public event Action<string>? TextReceived;

	public event Action<string>? ToolUsed;

	public event Action<double, string?>? TurnCompleted;

	public event Action<string, OutputKind>? Message;

	public event Action<string>? SessionStarted;

	public void ResetConversation()
	{
		_sessionId = null;
	}

	public async Task<Account> GetAccountAsync()
	{
		string text = await RunAsync(new string[2] { "auth", "status" });
		if (text == null)
		{
			return default;
		}
		try
		{
			JsonNode jsonNode = JsonNode.Parse(text);
			if (jsonNode == null)
			{
				return default;
			}
			return new Account(jsonNode["loggedIn"]?.GetValue<bool>() ?? false, jsonNode["email"]?.GetValue<string>(), jsonNode["subscriptionType"]?.GetValue<string>(), jsonNode["authMethod"]?.GetValue<string>());
		}
		catch (JsonException)
		{
			return default;
		}
	}

	public bool Connect()
	{
		string text = ResolveCli();
		if (text == null)
		{
			Report("Claude Code is not installed.", OutputKind.Warning);
			return false;
		}
		try
		{
			Process.Start(new ProcessStartInfo(text)
			{
				UseShellExecute = true,
				ArgumentList = { "auth", "login" }
			});
			return true;
		}
		catch (Exception ex) when ((ex is Win32Exception || ex is IOException) ? true : false)
		{
			Report("Could not start sign-in: " + ex.Message, OutputKind.Error);
			return false;
		}
	}

	public async Task DisconnectAsync()
	{
		await RunAsync(new string[2] { "auth", "logout" });
	}

	private static async Task<string?> RunAsync(string[] arguments)
	{
		string text = ResolveCli();
		if (text == null)
		{
			return null;
		}
		ProcessStartInfo processStartInfo = new ProcessStartInfo(text)
		{
			RedirectStandardOutput = true,
			RedirectStandardError = true,
			UseShellExecute = false,
			CreateNoWindow = true
		};
		foreach (string item in arguments)
		{
			processStartInfo.ArgumentList.Add(item);
		}
		try
		{
			using Process process = Process.Start(processStartInfo);
			if (process == null)
			{
				return null;
			}
			string output = await process.StandardOutput.ReadToEndAsync();
			await process.WaitForExitAsync();
			return output;
		}
		catch (Exception ex) when ((ex is Win32Exception || ex is IOException) ? true : false)
		{
			return null;
		}
	}

	public async Task<string[]> GetModelsAsync()
	{
		string text = await RunAsync(new string[4] { "-p", "/model", "--output-format", "json" });
		if (text == null)
		{
			return FallbackModels;
		}
		string text2;
		try
		{
			text2 = JsonNode.Parse(text)?["result"]?.GetValue<string>();
		}
		catch (JsonException)
		{
			return FallbackModels;
		}
		if (text2 == null)
		{
			return FallbackModels;
		}
		int num = text2.IndexOf("Available:", StringComparison.OrdinalIgnoreCase);
		if (num < 0)
		{
			return FallbackModels;
		}
		string text3 = text2.Substring(num + "Available:".Length);
		int num2 = text3.IndexOf('.');
		if (num2 >= 0)
		{
			text3 = text3.Substring(0, num2);
		}
		List<string> list = new List<string> { "" };
		string[] array = text3.Split(',');
		for (int i = 0; i < array.Length; i++)
		{
			string text4 = array[i].Trim();
			if (text4.Length != 0 && !text4.StartsWith("or ", StringComparison.OrdinalIgnoreCase) && !text4.Equals("default", StringComparison.OrdinalIgnoreCase))
			{
				list.Add(text4);
			}
		}
		return (list.Count > 1) ? list.ToArray() : FallbackModels;
	}

	public async Task<ModelVersion[]> DiscoverVersionsAsync(string[] families, CancellationToken token = default(CancellationToken))
	{
		string[] source = families.SelectMany((string family) => Enumerable.Range(4, 4).Reverse().SelectMany((int major) => Candidates(family, major))).ToArray();
		SemaphoreSlim limit = new SemaphoreSlim(6);
		try
		{
			List<ModelVersion> found = new List<ModelVersion>();
			object guard = new object();
			await Task.WhenAll(((IEnumerable<string>)source).Select((Func<string, Task>)(async (string id) =>
			{
				await limit.WaitAsync(token);
				try
				{
					if (!token.IsCancellationRequested)
					{
						string text = await ResolveModelAsync(id);
						if (text != null)
						{
							lock (guard)
							{
								found.Add(new ModelVersion(id, text));
								return;
							}
						}
					}
				}
				finally
				{
					limit.Release();
				}
			})));
			return found.OrderByDescending((ModelVersion v) => v.Id, StringComparer.Ordinal).ToArray();
		}
		finally
		{
			if (limit != null)
			{
				((IDisposable)limit).Dispose();
			}
		}
	}

	private static IEnumerable<string> Candidates(string family, int major)
	{
		yield return $"claude-{family}-{major}";
		for (int minor = 9; minor >= 1; minor--)
		{
			yield return $"claude-{family}-{major}-{minor}";
		}
	}

	private async Task<string?> ResolveModelAsync(string id)
	{
		string text = await RunAsync(new string[4]
		{
			"-p",
			"/model " + id,
			"--output-format",
			"json"
		});
		if (text == null)
		{
			return null;
		}
		string text2;
		try
		{
			text2 = JsonNode.Parse(text)?["result"]?.GetValue<string>();
		}
		catch (JsonException)
		{
			return null;
		}
		if (text2 == null || text2.Contains("not found", StringComparison.OrdinalIgnoreCase))
		{
			return null;
		}
		int num = text2.IndexOf("Set model to ", StringComparison.OrdinalIgnoreCase);
		if (num < 0)
		{
			return id;
		}
		string text3 = text2.Substring(num + "Set model to ".Length);
		int num2 = text3.IndexOf(" for ", StringComparison.OrdinalIgnoreCase);
		return (num2 > 0) ? text3.Substring(0, num2).Trim() : text3.Trim();
	}

	public async Task SendAsync(string prompt, string workingDirectory, string? mcpConfig = null, string[]? allowedTools = null, string? model = null)
	{
		if (IsBusy)
		{
			return;
		}
		string text = ResolveCli();
		if (text == null)
		{
			Report("Claude Code is not installed. Install it and sign in to use this panel.", OutputKind.Warning);
			return;
		}
		ProcessStartInfo processStartInfo = new ProcessStartInfo(text)
		{
			WorkingDirectory = (Directory.Exists(workingDirectory) ? workingDirectory : AppPaths.InstallFolder),
			RedirectStandardInput = true,
			RedirectStandardOutput = true,
			RedirectStandardError = true,
			UseShellExecute = false,
			CreateNoWindow = true,
			StandardOutputEncoding = Encoding.UTF8
		};
		processStartInfo.ArgumentList.Add("-p");
		processStartInfo.ArgumentList.Add(prompt);
		processStartInfo.ArgumentList.Add("--output-format");
		processStartInfo.ArgumentList.Add("stream-json");
		processStartInfo.ArgumentList.Add("--verbose");
		processStartInfo.ArgumentList.Add("--include-partial-messages");
		if (!string.IsNullOrWhiteSpace(model))
		{
			processStartInfo.ArgumentList.Add("--model");
			processStartInfo.ArgumentList.Add(model);
		}
		if (_sessionId != null)
		{
			processStartInfo.ArgumentList.Add("--resume");
			processStartInfo.ArgumentList.Add(_sessionId);
		}
		if (!string.IsNullOrWhiteSpace(mcpConfig))
		{
			processStartInfo.ArgumentList.Add("--mcp-config");
			processStartInfo.ArgumentList.Add(mcpConfig);
			if (allowedTools != null && allowedTools.Length > 0)
			{
				processStartInfo.ArgumentList.Add("--allowedTools");
				processStartInfo.ArgumentList.Add(string.Join(",", allowedTools));
			}
		}
		try
		{
			_process = Process.Start(processStartInfo);
		}
		catch (Exception ex) when ((ex is Win32Exception || ex is IOException) ? true : false)
		{
			Report("Could not start Claude: " + ex.Message, OutputKind.Error);
			return;
		}
		if (_process == null)
		{
			return;
		}
		Task.Run(() => DrainErrorsAsync(_shutdown.Token));
		try
		{
			await ReadStreamAsync(_process.StandardOutput, _shutdown.Token);
			await _process.WaitForExitAsync(_shutdown.Token);
		}
		catch (Exception ex2) when ((ex2 is IOException || ex2 is OperationCanceledException) ? true : false)
		{
		}
		finally
		{
			_process?.Dispose();
			_process = null;
		}
	}

	public void Cancel()
	{
		try
		{
			Process process = _process;
			if (process != null && !process.HasExited)
			{
				process.Kill(entireProcessTree: true);
			}
		}
		catch (Exception ex) when ((ex is InvalidOperationException || ex is Win32Exception || ex is NotSupportedException) ? true : false)
		{
		}
	}

	private async Task ReadStreamAsync(StreamReader output, CancellationToken token)
	{
		while (true)
		{
			string text = await output.ReadLineAsync(token);
			if (text == null)
			{
				break;
			}
			if (!string.IsNullOrWhiteSpace(text))
			{
				JsonNode jsonNode;
				try
				{
					jsonNode = JsonNode.Parse(text);
				}
				catch (JsonException)
				{
					continue;
				}
				if (jsonNode != null)
				{
					Dispatch(jsonNode);
				}
			}
		}
	}

	private void Dispatch(JsonNode node)
	{
		switch (node["type"]?.GetValue<string>())
		{
		case "system":
			if (node["subtype"]?.GetValue<string>() == "init")
			{
				string text4 = node["session_id"]?.GetValue<string>();
				if (text4 != null && text4 != _sessionId)
				{
					_sessionId = text4;
					SessionStarted?.Invoke(text4);
				}
				ReportMcpProblems(node);
			}
			break;
		case "stream_event":
			if (node["event"]?["delta"]?["type"]?.GetValue<string>() == "text_delta")
			{
				string text2 = node["event"]?["delta"]?["text"]?.GetValue<string>();
				if (text2 != null)
				{
					TextReceived?.Invoke(text2);
				}
			}
			break;
		case "assistant":
			if (!(node["message"]?["content"] is JsonArray jsonArray))
			{
				break;
			}
			{
				foreach (JsonNode item in jsonArray)
				{
					if (item?["type"]?.GetValue<string>() == "tool_use")
					{
						string text3 = item["name"]?.GetValue<string>();
						if (text3 != null)
						{
							ToolUsed?.Invoke(text3);
						}
					}
				}
				break;
			}
		case "result":
		{
			_sessionId = node["session_id"]?.GetValue<string>() ?? _sessionId;
			string text = node["result"]?.GetValue<string>();
			JsonNode? jsonNode = node["is_error"];
			if (jsonNode != null && jsonNode.GetValue<bool>())
			{
				Report(text ?? "Claude reported an error.", OutputKind.Error);
			}
			TurnCompleted?.Invoke(node["total_cost_usd"]?.GetValue<double>() ?? 0.0, text);
			break;
		}
		}
	}

	private void ReportMcpProblems(JsonNode init)
	{
		if (!(init["mcp_server_errors"] is JsonArray { Count: not 0 } jsonArray))
		{
			return;
		}
		foreach (JsonNode item in jsonArray)
		{
			string text = item?["name"]?.GetValue<string>() ?? "(unnamed)";
			string text2 = item?["message"]?.GetValue<string>() ?? "unknown reason";
			Report("MCP server \"" + text + "\" was skipped: " + text2, OutputKind.Warning);
		}
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
		catch (Exception ex) when ((ex is IOException || ex is ObjectDisposedException || ex is OperationCanceledException || ex is NullReferenceException) ? true : false)
		{
		}
	}

	private static string? ResolveCli()
	{
		string[] array = new string[3]
		{
			Path.Combine(Environment.GetFolderPath(Environment.SpecialFolder.UserProfile), ".local", "bin", "claude.exe"),
			Path.Combine(Environment.GetFolderPath(Environment.SpecialFolder.ApplicationData), "npm", "claude.cmd"),
			Path.Combine(Environment.GetFolderPath(Environment.SpecialFolder.UserProfile), ".claude", "local", "claude.exe")
		};
		foreach (string text in array)
		{
			if (File.Exists(text))
			{
				return text;
			}
		}
		string environmentVariable = Environment.GetEnvironmentVariable("PATH");
		if (environmentVariable == null)
		{
			return null;
		}
		array = environmentVariable.Split(Path.PathSeparator);
		foreach (string text2 in array)
		{
			if (string.IsNullOrWhiteSpace(text2))
			{
				continue;
			}
			try
			{
				string[] array2 = new string[2] { "claude.exe", "claude.cmd" };
				foreach (string path in array2)
				{
					string text3 = Path.Combine(text2, path);
					if (File.Exists(text3))
					{
						return text3;
					}
				}
			}
			catch (ArgumentException)
			{
			}
		}
		return null;
	}

	private void Report(string message, OutputKind kind)
	{
		Message?.Invoke(message, kind);
	}

	public void Dispose()
	{
		_shutdown.Cancel();
		Cancel();
		_process?.Dispose();
		_process = null;
		_shutdown.Dispose();
	}
}
