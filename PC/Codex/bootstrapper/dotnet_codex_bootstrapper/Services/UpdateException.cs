using System;

namespace dotnet_codex_bootstrapper.Services;

public class UpdateException(string Code, string Message, Exception? Inner = null) : Exception(Message, Inner)
{
	public string Code { get; } = Code;
}
