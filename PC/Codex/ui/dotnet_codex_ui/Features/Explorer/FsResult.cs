namespace dotnet_codex_ui.Features.Explorer;

internal readonly record struct FsResult(FsError Error, string Message = "")
{
	public bool Ok => Error == FsError.None;

	public static FsResult Success => new FsResult(FsError.None);
}
