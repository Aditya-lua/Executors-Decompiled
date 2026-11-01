using System;

namespace ScriptEditor.Models;

public class OutputLine
{
	public string Text { get; }

	public OutputKind Kind { get; }

	public DateTime Timestamp { get; }

	public string Time => Timestamp.ToString("HH:mm:ss");

	public OutputLine(string text, OutputKind kind)
	{
		Text = text;
		Kind = kind;
		Timestamp = DateTime.Now;
	}
}
