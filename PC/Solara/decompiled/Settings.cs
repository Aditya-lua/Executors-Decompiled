using System.CodeDom.Compiler;
using System.Configuration;
using System.Diagnostics;
using System.Runtime.CompilerServices;

namespace SolaraUI.Properties;

[CompilerGenerated]
[GeneratedCode("Microsoft.VisualStudio.Editors.SettingsDesigner.SettingsSingleFileGenerator", "17.14.0.0")]
internal sealed class Settings : ApplicationSettingsBase
{
	private static Settings defaultInstance = (Settings)(object)SettingsBase.Synchronized((SettingsBase)(object)new Settings());

	public static Settings Default => defaultInstance;

	[UserScopedSetting]
	[DebuggerNonUserCode]
	[DefaultSettingValue("True")]
	public bool TopMost
	{
		get
		{
			return (bool)((SettingsBase)this)["TopMost"];
		}
		set
		{
			((SettingsBase)this)["TopMost"] = value;
		}
	}

	[UserScopedSetting]
	[DebuggerNonUserCode]
	[DefaultSettingValue("False")]
	public bool LegacyMigrationDone
	{
		get
		{
			return (bool)((SettingsBase)this)["LegacyMigrationDone"];
		}
		set
		{
			((SettingsBase)this)["LegacyMigrationDone"] = value;
		}
	}
}
