#define TRACE
using System;
using System.Diagnostics;
using System.Security.Cryptography;

namespace Tether;

public static class TetherDiagnostics
{
	private static volatile bool EnabledField;

	public static bool Enabled
	{
		get
		{
			return EnabledField;
		}
		set
		{
			EnabledField = value;
		}
	}

	public static Action<string>? Sink { get; set; }

	internal static void Server(uint Session, TetherStage Stage, TetherError Error, Stopwatch? Clock, string Detail)
	{
		Write("server", Session, Stage, Error, Clock, Detail);
	}

	internal static void Client(uint Session, TetherStage Stage, TetherError Error, Stopwatch? Clock, string Detail)
	{
		Write("client", Session, Stage, Error, Clock, Detail);
	}

	internal static void ServerExpected(uint Session, TetherStage Stage, Stopwatch? Clock, string Detail)
	{
		Write("server", Session, Stage, TetherError.None, Clock, Detail, "EXPECTED");
	}

	internal static void ClientExpected(uint Session, TetherStage Stage, Stopwatch? Clock, string Detail)
	{
		Write("client", Session, Stage, TetherError.None, Clock, Detail, "EXPECTED");
	}

	internal static string Fingerprint(ReadOnlySpan<byte> Data)
	{
		return Convert.ToHexString(SHA256.HashData(Data)[..8]);
	}

	private static string LabelFor(TetherStage Stage, TetherError Error)
	{
		if (Error != TetherError.None)
		{
			return "FAILED";
		}
		switch (Stage)
		{
		case TetherStage.ChallengeSent:
		case TetherStage.HelloSent:
		case TetherStage.WelcomeSent:
		case TetherStage.FrameSend:
			return "SENT";
		case TetherStage.ChallengeReceived:
		case TetherStage.HelloReceived:
		case TetherStage.WelcomeReceived:
		case TetherStage.FrameReceive:
			return "RECEIVED";
		case TetherStage.HelloDecrypt:
		case TetherStage.HelloMac:
		case TetherStage.HelloParse:
		case TetherStage.FrameDecrypt:
			return "VALIDATED";
		default:
			return "INFO";
		}
	}

	private static void Write(string Side, uint Session, TetherStage Stage, TetherError Error, Stopwatch? Clock, string Detail, string? Label = null)
	{
		if (!EnabledField)
		{
			return;
		}
		long value = ((Clock == null) ? (-1) : ((long)Clock.Elapsed.TotalMilliseconds));
		string value2 = ((Error == TetherError.None) ? "ok" : "fail");
		string text = $"tether side={Side} session={Session} stage={Stage} result={value2} error={Error} elapsedMs={value} label={Label ?? LabelFor(Stage, Error)} {Detail}";
		try
		{
			Action<string> sink = Sink;
			if (sink != null)
			{
				sink(text);
			}
			else
			{
				Trace.WriteLine(text);
			}
		}
		catch
		{
		}
	}
}
