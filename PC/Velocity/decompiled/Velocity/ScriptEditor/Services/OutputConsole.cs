using System;
using System.Collections.ObjectModel;
using System.ComponentModel;
using System.Runtime.CompilerServices;
using System.Text;
using ScriptEditor.Models;

namespace ScriptEditor.Services;

public sealed class OutputConsole : INotifyPropertyChanged
{
	private const int MaxLines = 5000;

	public ObservableCollection<OutputLine> Lines { get; } = new ObservableCollection<OutputLine>();

	public bool IsEmpty => Lines.Count == 0;

	public int Count => Lines.Count;

	public event PropertyChangedEventHandler? PropertyChanged;

	public event EventHandler? LineAppended;

	public string ToTextFrom(int start)
	{
		if (start < 0)
		{
			start = 0;
		}
		if (start >= Lines.Count)
		{
			return string.Empty;
		}
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = start; i < Lines.Count; i++)
		{
			stringBuilder.AppendLine(Lines[i].Text);
		}
		return stringBuilder.ToString().TrimEnd();
	}

	public void Append(string text, OutputKind kind = OutputKind.Print)
	{
		string[] array = text.Replace("\r\n", "\n").Split('\n');
		foreach (string text2 in array)
		{
			AddLine(new OutputLine(text2, kind));
		}
		LineAppended?.Invoke(this, EventArgs.Empty);
	}

	public void Info(string text)
	{
		Append(text, OutputKind.Info);
	}

	public void Success(string text)
	{
		Append(text, OutputKind.Success);
	}

	public void Warning(string text)
	{
		Append(text, OutputKind.Warning);
	}

	public void Error(string text)
	{
		Append(text, OutputKind.Error);
	}

	public void Clear()
	{
		if (Lines.Count != 0)
		{
			Lines.Clear();
			OnPropertyChanged("IsEmpty");
		}
	}

	public string ToText()
	{
		StringBuilder stringBuilder = new StringBuilder();
		foreach (OutputLine line in Lines)
		{
			stringBuilder.Append('[').Append(line.Time).Append("] ")
				.AppendLine(line.Text);
		}
		return stringBuilder.ToString();
	}

	private void AddLine(OutputLine line)
	{
		bool flag = Lines.Count == 0;
		Lines.Add(line);
		while (Lines.Count > 5000)
		{
			Lines.RemoveAt(0);
		}
		if (flag)
		{
			OnPropertyChanged("IsEmpty");
		}
	}

	private void OnPropertyChanged([CallerMemberName] string? name = null)
	{
		PropertyChanged?.Invoke(this, new PropertyChangedEventArgs(name));
	}
}
