using System;

namespace dotnet_codex_bootstrapper.Core.Manifest;

public sealed class ManifestException(string Code, string Message) : Exception(Message)
{
	public string Code { get; } = Code;
}
