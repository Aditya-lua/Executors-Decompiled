using System;
using System.Diagnostics;
using System.Security.Principal;

namespace dotnet_codex_bootstrapper.Infrastructure;

public sealed class ProcessLauncher : IProcessLauncher
{
	private sealed class Wrapped(Process Inner) : IStartedProcess, IDisposable
	{
		public int Id { get; } = Inner.Id;

		public bool HasExited
		{
			get
			{
				try
				{
					return Inner.HasExited;
				}
				catch (InvalidOperationException)
				{
					return true;
				}
			}
		}

		public int ExitCode => Inner.ExitCode;

		public bool WaitForExit(int Milliseconds)
		{
			return Inner.WaitForExit(Milliseconds);
		}

		public void Kill()
		{
			try
			{
				Inner.Kill();
			}
			catch (Exception)
			{
			}
		}

		public void Dispose()
		{
			Inner.Dispose();
		}
	}

	public static bool IsElevated
	{
		get
		{
			using WindowsIdentity ntIdentity = WindowsIdentity.GetCurrent();
			return new WindowsPrincipal(ntIdentity).IsInRole(WindowsBuiltInRole.Administrator);
		}
	}

	public IStartedProcess Start(string FileName, string Arguments, string WorkingDirectory, bool RequireElevation)
	{
		bool flag = RequireElevation && !IsElevated;
		ProcessStartInfo processStartInfo = new ProcessStartInfo(FileName, Arguments)
		{
			WorkingDirectory = WorkingDirectory,
			UseShellExecute = flag
		};
		if (flag)
		{
			processStartInfo.Verb = "runas";
		}
		return new Wrapped(Process.Start(processStartInfo) ?? throw new InvalidOperationException("The process could not be started."));
	}
}
