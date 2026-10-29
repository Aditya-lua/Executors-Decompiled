package com.roblox.platform.http.postbody.notifications;

import androidx.annotation.Keep;
import com.roblox.platform.http.returntypes.ossearch.SearchResultIdentifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m31665d2 = {"Lcom/roblox/platform/http/postbody/notifications/SearchResultRequestItem;", "", "identifier", "Lcom/roblox/platform/http/returntypes/ossearch/SearchResultIdentifier;", "<init>", "(Lcom/roblox/platform/http/returntypes/ossearch/SearchResultIdentifier;)V", "getIdentifier", "()Lcom/roblox/platform/http/returntypes/ossearch/SearchResultIdentifier;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "robloxplatform_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class SearchResultRequestItem {

    @NotNull
    private final SearchResultIdentifier identifier;

    public SearchResultRequestItem(@NotNull SearchResultIdentifier identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.identifier = identifier;
    }

    public static /* synthetic */ SearchResultRequestItem copy$default(SearchResultRequestItem searchResultRequestItem, SearchResultIdentifier searchResultIdentifier, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            searchResultIdentifier = searchResultRequestItem.identifier;
        }
        return searchResultRequestItem.copy(searchResultIdentifier);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SearchResultIdentifier getIdentifier() {
        return this.identifier;
    }

    @NotNull
    public final SearchResultRequestItem copy(@NotNull SearchResultIdentifier identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return new SearchResultRequestItem(identifier);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SearchResultRequestItem) && Intrinsics.m31980c(this.identifier, ((SearchResultRequestItem) other).identifier);
    }

    @NotNull
    public final SearchResultIdentifier getIdentifier() {
        return this.identifier;
    }

    public int hashCode() {
        return this.identifier.hashCode();
    }

    @NotNull
    public String toString() {
        return "SearchResultRequestItem(identifier=" + this.identifier + ")";
    }
}
