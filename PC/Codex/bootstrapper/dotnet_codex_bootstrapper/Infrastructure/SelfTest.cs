using System;
using System.IO;
using System.Text.Json;
using System.Windows;
using dotnet_codex_bootstrapper.Core.Versioning;

namespace dotnet_codex_bootstrapper.Infrastructure;

public static class SelfTest
{
	public static void Run(string OutputFile)
	{
		bool logoResource;
		try
		{
			logoResource = Application.GetResourceStream(new Uri("pack://application:,,,/dotnet-codex-bootstrapper;component/Assets/Images/Logo.png")) != null;
		}
		catch (IOException)
		{
			logoResource = false;
		}
		var value = new
		{
			version = BootstrapperVersion.Display,
			processPath = Environment.ProcessPath,
			baseDirectory = AppContext.BaseDirectory,
			assemblyLocationEmpty = string.IsNullOrEmpty(typeof(SelfTest).Assembly.Location),
			logoResource = logoResource,
			runtime = Environment.Version.ToString(),
			x64 = Environment.Is64BitProcess
		};
		File.WriteAllText(OutputFile, JsonSerializer.Serialize(value, new JsonSerializerOptions
		{
			WriteIndented = true
		}));
	}
}
