package com.roblox.platform.http.returntypes.ossearch;

import androidx.annotation.Keep;
import com.roblox.client.shortcuts.PinShortcutHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, m31665d2 = {"Lcom/roblox/platform/http/returntypes/ossearch/SearchResultIdentifier;", "", PinShortcutHandler.EXTRA_PLACE_ID, "", "<init>", "(Ljava/lang/Long;)V", "getPlaceId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "copy", "(Ljava/lang/Long;)Lcom/roblox/platform/http/returntypes/ossearch/SearchResultIdentifier;", "equals", "", "other", "hashCode", "", "toString", "", "robloxplatform_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class SearchResultIdentifier {

    @Nullable
    private final Long placeId;

    public SearchResultIdentifier(@Nullable Long l10) {
        this.placeId = l10;
    }

    public static /* synthetic */ SearchResultIdentifier copy$default(SearchResultIdentifier searchResultIdentifier, Long l10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = searchResultIdentifier.placeId;
        }
        return searchResultIdentifier.copy(l10);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getPlaceId() {
        return this.placeId;
    }

    @NotNull
    public final SearchResultIdentifier copy(@Nullable Long placeId) {
        return new SearchResultIdentifier(placeId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SearchResultIdentifier) && Intrinsics.m31980c(this.placeId, ((SearchResultIdentifier) other).placeId);
    }

    @Nullable
    public final Long getPlaceId() {
        return this.placeId;
    }

    public int hashCode() {
        Long l10 = this.placeId;
        if (l10 == null) {
            return 0;
        }
        return l10.hashCode();
    }

    @NotNull
    public String toString() {
        return "SearchResultIdentifier(placeId=" + this.placeId + ")";
    }
}
