namespace dotnet_codex_ui.Features.Connections;

internal static class ControlMessages
{
	public static string PortChanged(int Port)
	{
		return $"{{\"codex\":\"portChanged\",\"port\":{Port}}}";
	}
}
