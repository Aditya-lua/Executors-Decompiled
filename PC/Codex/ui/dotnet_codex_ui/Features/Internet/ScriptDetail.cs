using System;
using System.Collections.Generic;

namespace dotnet_codex_ui.Features.Internet;

internal sealed record ScriptDetail(string Slug, string Title, string Source, string? GameName = null, string? GameImageUrl = null, string? ThumbnailUrl = null, string? Features = null, IReadOnlyList<string>? Tags = null, string? OwnerName = null, bool OwnerVerified = false, bool? Verified = null, long? Views = null, long? Likes = null, long? Dislikes = null, long? Executes = null, DateTimeOffset? Created = null, bool? IsUniversal = null, bool? IsPatched = null, bool? RequiresKey = null, string? KeyLink = null, string? Discord = null);
