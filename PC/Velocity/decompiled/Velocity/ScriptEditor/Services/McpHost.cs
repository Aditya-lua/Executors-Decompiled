using System;
using System.IO;
using System.IO.Pipes;
using System.Text;
using System.Text.Json;
using System.Text.Json.Nodes;
using System.Threading;
using System.Threading.Tasks;

namespace ScriptEditor.Services;

public sealed class McpHost : IDisposable
{
	public enum OutputKindShim
	{
		Info,
		Warning,
		Error
	}

	public const string StdioSwitch = "--mcp-stdio";

	private const string PipeName = "velocity-mcp";

	private readonly VelocityMcpServer _server;

	private readonly CancellationTokenSource _shutdown = new CancellationTokenSource();

	public event Action<string, OutputKindShim>? Message;

	public McpHost(VelocityMcpServer server)
	{
		_server = server;
	}

	public void Start()
	{
		Task.Run(() => AcceptLoopAsync(_shutdown.Token));
	}

	private async Task AcceptLoopAsync(CancellationToken token)
	{
		while (!token.IsCancellationRequested)
		{
			NamedPipeServerStream pipe = null;
			try
			{
				pipe = new NamedPipeServerStream("velocity-mcp", PipeDirection.InOut, -1, PipeTransmissionMode.Byte, PipeOptions.Asynchronous);
				await pipe.WaitForConnectionAsync(token);
				NamedPipeServerStream connected = pipe;
				pipe = null;
				Task.Run(() => ServeAsync(connected, token), token);
			}
			catch (Exception ex) when ((ex is IOException || ex is OperationCanceledException || ex is ObjectDisposedException) ? true : false)
			{
				pipe?.Dispose();
				if (token.IsCancellationRequested)
				{
					break;
				}
			}
		}
	}

	private async Task ServeAsync(NamedPipeServerStream pipe, CancellationToken token)
	{
		_ = 2;
		try
		{
			using (pipe)
			{
				using StreamReader reader = new StreamReader(pipe, Encoding.UTF8, detectEncodingFromByteOrderMarks: false, 8192, leaveOpen: true);
				using StreamWriter writer = new StreamWriter(pipe, new UTF8Encoding(encoderShouldEmitUTF8Identifier: false), 8192, leaveOpen: true)
				{
					AutoFlush = true
				};
				while (true)
				{
					string text = await reader.ReadLineAsync(token);
					if (text == null)
					{
						break;
					}
					if (!string.IsNullOrWhiteSpace(text))
					{
						JsonNode jsonNode = await HandleAsync(text);
						if (jsonNode != null)
						{
							await writer.WriteLineAsync(jsonNode.ToJsonString());
						}
					}
				}
			}
		}
		catch (Exception ex) when ((ex is IOException || ex is OperationCanceledException || ex is ObjectDisposedException) ? true : false)
		{
		}
	}

	private async Task<JsonNode?> HandleAsync(string line)
	{
		JsonNode jsonNode;
		try
		{
			jsonNode = JsonNode.Parse(line);
		}
		catch (JsonException)
		{
			return null;
		}
		if (jsonNode == null)
		{
			return null;
		}
		string text = jsonNode["method"]?.GetValue<string>();
		JsonNode id = jsonNode["id"]?.DeepClone();
		if (id == null)
		{
			return null;
		}
		switch (text)
		{
		case "initialize":
			return Result(id, new JsonObject
			{
				["protocolVersion"] = "2024-11-05",
				["capabilities"] = new JsonObject { ["tools"] = new JsonObject() },
				["serverInfo"] = new JsonObject
				{
					["name"] = "velocity",
					["version"] = "1.0.0"
				}
			});
		case "tools/list":
			return Result(id, new JsonObject { ["tools"] = VelocityMcpServer.ToolDefinitions });
		case "tools/call":
		{
			string text2 = jsonNode["params"]?["name"]?.GetValue<string>();
			if (text2 == null)
			{
				return Error(id, -32602, "Missing tool name.");
			}
			return Result(id, await _server.CallToolAsync(text2, jsonNode["params"]?["arguments"]));
		}
		case "ping":
			return Result(id, new JsonObject());
		default:
			return Error(id, -32601, "Method not found: " + text);
		}
	}

	private static JsonObject Result(JsonNode id, JsonNode result)
	{
		return new JsonObject
		{
			["jsonrpc"] = "2.0",
			["id"] = id,
			["result"] = result
		};
	}

	private static JsonObject Error(JsonNode id, int code, string message)
	{
		return new JsonObject
		{
			["jsonrpc"] = "2.0",
			["id"] = id,
			["error"] = new JsonObject
			{
				["code"] = code,
				["message"] = message
			}
		};
	}

	public static async Task<int> RunStdioBridgeAsync()
	{
		try
		{
			using NamedPipeClientStream pipe = new NamedPipeClientStream(".", "velocity-mcp", PipeDirection.InOut, PipeOptions.Asynchronous);
			await pipe.ConnectAsync(5000);
			using StreamWriter toPipe = new StreamWriter(pipe, new UTF8Encoding(encoderShouldEmitUTF8Identifier: false))
			{
				AutoFlush = true
			};
			using StreamReader fromPipe = new StreamReader(pipe, Encoding.UTF8);
			Stream stream = Console.OpenStandardInput();
			Stream stream2 = Console.OpenStandardOutput();
			using StreamReader input = new StreamReader(stream, Encoding.UTF8);
			using StreamWriter output = new StreamWriter(stream2, new UTF8Encoding(encoderShouldEmitUTF8Identifier: false))
			{
				AutoFlush = true
			};
			Task task = PumpAsync(input, toPipe);
			Task task2 = PumpAsync(fromPipe, output);
			await Task.WhenAny(task, task2);
			return 0;
		}
		catch (TimeoutException)
		{
			await Console.Error.WriteLineAsync("Velocity is not running.");
			return 1;
		}
		catch (Exception ex2) when ((ex2 is IOException || ex2 is UnauthorizedAccessException) ? true : false)
		{
			await Console.Error.WriteLineAsync("Could not reach Velocity: " + ex2.Message);
			return 1;
		}
	}

	private static async Task PumpAsync(TextReader from, TextWriter to)
	{
		_ = 1;
		try
		{
			while (true)
			{
				string text = await from.ReadLineAsync();
				if (text == null)
				{
					break;
				}
				await to.WriteLineAsync(text);
			}
		}
		catch (Exception ex) when ((ex is IOException || ex is ObjectDisposedException) ? true : false)
		{
		}
	}

	public void Dispose()
	{
		_shutdown.Cancel();
		_shutdown.Dispose();
	}
}
