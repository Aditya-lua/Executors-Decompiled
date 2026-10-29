using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using Newtonsoft.Json;
using dotnet_codex_ui.Infrastructure.Logging;

namespace dotnet_codex_ui.Features.Editor;

internal static class TabStore
{
	internal static string FilePath { get; set; } = Path.Combine(Environment.GetFolderPath(Environment.SpecialFolder.LocalApplicationData), "Codex", "tabs.json");

	public static bool Save(TabState State)
	{
		try
		{
			Directory.CreateDirectory(Path.GetDirectoryName(FilePath));
			string text = FilePath + "." + Guid.NewGuid().ToString("N") + ".tmp";
			File.WriteAllText(text, JsonConvert.SerializeObject(State));
			File.Move(text, FilePath, overwrite: true);
			AppLog.Debug("Tabs saved ({Count} tabs)", State.Tabs.Count);
			return true;
		}
		catch (Exception failure)
		{
			AppLog.Error(failure, null, "Save", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Features\\Editor\\TabStore.cs");
			return false;
		}
	}

	public static TabState? Load()
	{
		try
		{
			if (!File.Exists(FilePath))
			{
				return null;
			}
			TabState tabState = JsonConvert.DeserializeObject<TabState>(File.ReadAllText(FilePath));
			List<TabSnapshot> list = tabState?.Tabs;
			if (list == null || list.Count <= 0)
			{
				return null;
			}
			List<TabSnapshot> list2 = (from Tab in tabState.Tabs
				where (object)Tab != null
				select new TabSnapshot(string.IsNullOrWhiteSpace(Tab.Title) ? "Untitled Tab" : Tab.Title, Tab.Text ?? "", string.IsNullOrWhiteSpace(Tab.Path) ? null : Tab.Path, Tab.Dirty)).ToList();
			return (list2.Count == 0) ? null : new TabState(list2, Math.Clamp(tabState.Selected, 0, list2.Count - 1));
		}
		catch (Exception)
		{
			return null;
		}
	}

	public static bool Delete()
	{
		try
		{
			if (File.Exists(FilePath))
			{
				File.Delete(FilePath);
			}
			return true;
		}
		catch (Exception failure)
		{
			AppLog.Error(failure, null, "Delete", "C:\\Users\\User\\source\\repos\\dotnet-codex\\dotnet-codex-ui\\Features\\Editor\\TabStore.cs");
			return false;
		}
	}
}
