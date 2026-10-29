using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading;
using System.Threading.Tasks;

namespace dotnet_codex_ui.Features.Internet;

internal sealed class PageCache<T>(int MaxEntries, TimeSpan Ttl, Func<DateTime>? Clock = null)
{
	private sealed record Entry(Task<(T Value, bool Cache)> Task, DateTime Created);

	private readonly Dictionary<string, Entry> Entries = new Dictionary<string, Entry>();

	private readonly Lock Gate = new Lock();

	private readonly Func<DateTime> Now = Clock ?? ((Func<DateTime>)(() => DateTime.UtcNow));

	public int Count
	{
		get
		{
			using (Gate.EnterScope())
			{
				return Entries.Count;
			}
		}
	}

	public async Task<T> GetAsync(string Key, Func<Task<(T Value, bool Cache)>> Factory)
	{
		Entry value;
		using (Gate.EnterScope())
		{
			if (!Entries.TryGetValue(Key, out value) || (value.Task.IsCompletedSuccessfully && Now() - value.Created > Ttl))
			{
				value = new Entry(Run(Key, Factory), Now());
				Entries[Key] = value;
				Trim();
			}
		}
		return (await value.Task.ConfigureAwait(continueOnCapturedContext: false)).Item1;
	}

	private async Task<(T Value, bool Cache)> Run(string Key, Func<Task<(T Value, bool Cache)>> Factory)
	{
		await Task.Yield();
		try
		{
			(T, bool) result = await Factory().ConfigureAwait(continueOnCapturedContext: false);
			if (!result.Item2)
			{
				Remove(Key);
			}
			return result;
		}
		catch
		{
			Remove(Key);
			throw;
		}
	}

	private void Remove(string Key)
	{
		using (Gate.EnterScope())
		{
			Entries.Remove(Key);
		}
	}

	private void Trim()
	{
		while (Entries.Count > MaxEntries)
		{
			Entries.Remove(Entries.MinBy((KeyValuePair<string, Entry> P) => P.Value.Created).Key);
		}
	}
}
