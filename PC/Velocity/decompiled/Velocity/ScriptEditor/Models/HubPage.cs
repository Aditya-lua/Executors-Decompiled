using System;
using System.Collections.Generic;

namespace ScriptEditor.Models;

public sealed class HubPage
{
	public IReadOnlyList<HubScript> Scripts { get; init; } = Array.Empty<HubScript>();

	public int Page { get; init; } = 1;

	public int TotalPages { get; init; } = 1;

	public int Total { get; init; }

	public bool HasNextPage { get; init; }

	public bool HasPrevPage { get; init; }
}
