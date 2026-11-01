namespace ScriptEditor.Services;

public readonly record struct HubFilters(bool NoKeySystem, bool MobileOnly, bool FreeOnly, bool VerifiedOnly);
