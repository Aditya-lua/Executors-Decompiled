using System;
using System.Collections.Generic;
using System.Linq;

namespace dotnet_codex_ui.Features.Internet;

internal sealed class ScriptPager
{
	public const int HotCount = 3;

	private readonly HashSet<string> Seen = new HashSet<string>();

	private readonly List<ScriptResult> All = new List<ScriptResult>();

	public IReadOnlyList<(int Index, ScriptResult Item)> Replaced { get; private set; } = Array.Empty<(int, ScriptResult)>();

	public int Generation { get; private set; }

	public int NextPage { get; private set; } = 1;

	public bool HasMore { get; private set; } = true;

	public bool Loading { get; private set; }

	public bool Failed { get; private set; }

	public void Reset()
	{
		Generation++;
		Seen.Clear();
		All.Clear();
		Replaced = Array.Empty<(int, ScriptResult)>();
		NextPage = 1;
		HasMore = true;
		Loading = false;
		Failed = false;
	}

	public bool TryBegin(out int Page, out int Gen)
	{
		Page = NextPage;
		Gen = Generation;
		if (Loading || Failed || !HasMore)
		{
			return false;
		}
		Loading = true;
		return true;
	}

	public void Retry()
	{
		Failed = false;
	}

	public void Abandon(int Gen)
	{
		if (Gen == Generation)
		{
			Loading = false;
		}
	}

	public IReadOnlyList<ScriptResult> Complete(int Gen, int Page, ProviderResult Result)
	{
		if (Gen != Generation)
		{
			return Array.Empty<ScriptResult>();
		}
		Loading = false;
		Replaced = Array.Empty<(int, ScriptResult)>();
		ProviderResultKind kind = Result.Kind;
		if ((uint)(kind - 2) <= 1u)
		{
			if (Result.Kind == ProviderResultKind.Failed)
			{
				Failed = true;
			}
			else
			{
				HasMore = false;
			}
			return Array.Empty<ScriptResult>();
		}
		List<ScriptResult> list = Result.Items.Where((ScriptResult I) => Seen.Add(I.Id)).ToList();
		All.AddRange(list);
		HashSet<string> hashSet = (from I in (from I in All
				where I.Executes > 0
				orderby I.Executes descending
				select I).Take(3)
			select I.Id).ToHashSet();
		List<(int, ScriptResult)> list2 = new List<(int, ScriptResult)>();
		for (int num = 0; num < All.Count; num++)
		{
			bool flag = hashSet.Contains(All[num].Id);
			if (All[num].IsHot != flag)
			{
				All[num] = All[num]with
				{
					IsHot = flag
				};
				if (num < All.Count - list.Count)
				{
					list2.Add((num, All[num]));
				}
			}
		}
		Replaced = list2;
		list = All.GetRange(All.Count - list.Count, list.Count);
		int? nextPage = Result.NextPage;
		if (nextPage.HasValue)
		{
			int valueOrDefault = nextPage.GetValueOrDefault();
			if (valueOrDefault > Page)
			{
				NextPage = valueOrDefault;
				goto IL_0207;
			}
		}
		HasMore = false;
		goto IL_0207;
		IL_0207:
		return list;
	}
}
