using System.Windows.Media;

namespace dotnet_codex_bootstrapper.Services;

public sealed record AccentOption(string Id, string Name, Color Accent, Color Surface, Color Border, Color Strong);
