using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;

namespace dotnet_codex_bootstrapper.Features.Bootstrapping.Demo;

public sealed class DemoController : INotifyPropertyChanged
{
	private DemoScenario SelectedField;

	public DemoScenario Selected
	{
		get
		{
			return SelectedField;
		}
		private set
		{
			value.Validate();
			SelectedField = value;
			PropertyChanged?.Invoke(this, new PropertyChangedEventArgs("Selected"));
		}
	}

	public event PropertyChangedEventHandler? PropertyChanged;

	public DemoController(DemoScenario? Initial = null)
	{
		SelectedField = Initial ?? DemoScenarios.Default;
		SelectedField.Validate();
	}

	public IBootstrapperFlow CreateFlow()
	{
		return new DemoBootstrapperFlow(Selected);
	}

	public void Next()
	{
		Select(1);
	}

	public void Previous()
	{
		Select(-1);
	}

	private void Select(int Offset)
	{
		IReadOnlyList<DemoScenario> all = DemoScenarios.All;
		int num = all.ToList().FindIndex((DemoScenario Scenario) => Scenario.Name == Selected.Name);
		Selected = all[(((num >= 0) ? num : 0) + Offset + all.Count) % all.Count];
	}
}
