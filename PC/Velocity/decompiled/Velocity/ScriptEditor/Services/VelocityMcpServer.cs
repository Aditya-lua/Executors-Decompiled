using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text.Json;
using System.Text.Json.Nodes;
using System.Threading.Tasks;

namespace ScriptEditor.Services;

public sealed class VelocityMcpServer
{
	private readonly Func<Task<string?>> _readScript;

	private readonly Func<string, Task<bool>> _writeScript;

	private readonly Func<Task<string>> _execute;

	private readonly Func<string> _readOutput;

	private readonly Func<string> _listClients;

	public static JsonArray ToolDefinitions => new JsonArray
	{
		Tool("read_script", "Read the Luau script currently open in the Velocity editor.", new JsonObject
		{
			["type"] = "object",
			["properties"] = new JsonObject()
		}),
		Tool("write_script", "Replace the contents of the script currently open in the Velocity editor.", new JsonObject
		{
			["type"] = "object",
			["properties"] = new JsonObject { ["content"] = new JsonObject
			{
				["type"] = "string",
				["description"] = "The full new contents of the script."
			} },
			["required"] = new JsonArray((JsonNode?)"content")
		}),
		Tool("execute", "Execute the current script in the attached Roblox client(s). Respects each client's Execute toggle.", new JsonObject
		{
			["type"] = "object",
			["properties"] = new JsonObject()
		}),
		Tool("read_output", "Read the Velocity output console, including script print and error output.", new JsonObject
		{
			["type"] = "object",
			["properties"] = new JsonObject()
		}),
		Tool("list_clients", "List running Roblox clients with their process id, memory use and attach state.", new JsonObject
		{
			["type"] = "object",
			["properties"] = new JsonObject()
		})
	};

	public static string[] QualifiedToolNames => ToolDefinitions.Select((JsonNode t) => "mcp__velocity__" + t["name"].GetValue<string>()).ToArray();

	public VelocityMcpServer(Func<Task<string?>> readScript, Func<string, Task<bool>> writeScript, Func<Task<string>> execute, Func<string> readOutput, Func<string> listClients)
	{
		_readScript = readScript;
		_writeScript = writeScript;
		_execute = execute;
		_readOutput = readOutput;
		_listClients = listClients;
	}

	private static JsonObject Tool(string name, string description, JsonObject schema)
	{
		return new JsonObject
		{
			["name"] = name,
			["description"] = description,
			["inputSchema"] = schema
		};
	}

	public async Task<JsonObject> CallToolAsync(string name, JsonNode? arguments)
	{
		_ = 2;
		try
		{
			JsonObject result;
			switch (name)
			{
			case "read_script":
				result = Text((await _readScript()) ?? "(no script is open)");
				break;
			case "write_script":
			{
				string text = arguments?["content"]?.GetValue<string>();
				string text2;
				if (text == null)
				{
					text2 = "Missing required argument: content.";
				}
				else
				{
					text2 = ((await _writeScript(text)) ? "Script updated." : "No script is open to write to.");
				}
				result = Text(text2);
				break;
			}
			case "execute":
				result = Text(await _execute());
				break;
			case "read_output":
				result = Text(_readOutput());
				break;
			case "list_clients":
				result = Text(_listClients());
				break;
			default:
				result = Error("Unknown tool: " + name);
				break;
			}
			return result;
		}
		catch (Exception ex) when ((ex is IOException || ex is InvalidOperationException) ? true : false)
		{
			return Error(ex.Message);
		}
	}

	private static JsonObject Text(string text)
	{
		return new JsonObject { ["content"] = new JsonArray((JsonNode)new JsonObject
		{
			["type"] = "text",
			["text"] = text
		}) };
	}

	private static JsonObject Error(string message)
	{
		return new JsonObject
		{
			["isError"] = true,
			["content"] = new JsonArray((JsonNode)new JsonObject
			{
				["type"] = "text",
				["text"] = message
			})
		};
	}

	public static string? WriteConfig(string? userServersJson)
	{
		JsonObject jsonObject = new JsonObject { ["velocity"] = new JsonObject
		{
			["command"] = Environment.ProcessPath ?? "Velocity.exe",
			["args"] = new JsonArray((JsonNode?)"--mcp-stdio")
		} };
		if (!string.IsNullOrWhiteSpace(userServersJson))
		{
			try
			{
				if (JsonNode.Parse(userServersJson) is JsonObject jsonObject2)
				{
					foreach (KeyValuePair<string, JsonNode> item in ((jsonObject2["mcpServers"] as JsonObject) ?? jsonObject2).ToList())
					{
						jsonObject[item.Key] = item.Value?.DeepClone();
					}
				}
			}
			catch (JsonException)
			{
			}
		}
		string text = Path.Combine(AppPaths.DataFolder, "mcp.json");
		try
		{
			Directory.CreateDirectory(AppPaths.DataFolder);
			File.WriteAllText(text, new JsonObject { ["mcpServers"] = jsonObject }.ToJsonString(new JsonSerializerOptions
			{
				WriteIndented = true
			}));
			return text;
		}
		catch (Exception ex2) when ((ex2 is IOException || ex2 is UnauthorizedAccessException) ? true : false)
		{
			return null;
		}
	}
}
