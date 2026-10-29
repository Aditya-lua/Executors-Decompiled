package com.roblox.platform.http.returntypes.ossearch;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItemsResult;", "", "searchIndexItems", "", "Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;", "refreshIntervalSeconds", "", "<init>", "(Ljava/util/List;I)V", "getSearchIndexItems", "()Ljava/util/List;", "getRefreshIntervalSeconds", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "robloxplatform_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SearchIndexItemsResult {
    private final int refreshIntervalSeconds;

    @NotNull
    private final List<SearchIndexItem> searchIndexItems;

    public SearchIndexItemsResult(@NotNull List<SearchIndexItem> searchIndexItems, int i10) {
        Intrinsics.checkNotNullParameter(searchIndexItems, "searchIndexItems");
        this.searchIndexItems = searchIndexItems;
        this.refreshIntervalSeconds = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchIndexItemsResult copy$default(SearchIndexItemsResult searchIndexItemsResult, List list, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = searchIndexItemsResult.searchIndexItems;
        }
        if ((i11 & 2) != 0) {
            i10 = searchIndexItemsResult.refreshIntervalSeconds;
        }
        return searchIndexItemsResult.copy(list, i10);
    }

    @NotNull
    public final List<SearchIndexItem> component1() {
        return this.searchIndexItems;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRefreshIntervalSeconds() {
        return this.refreshIntervalSeconds;
    }

    @NotNull
    public final SearchIndexItemsResult copy(@NotNull List<SearchIndexItem> searchIndexItems, int refreshIntervalSeconds) {
        Intrinsics.checkNotNullParameter(searchIndexItems, "searchIndexItems");
        return new SearchIndexItemsResult(searchIndexItems, refreshIntervalSeconds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchIndexItemsResult)) {
            return false;
        }
        SearchIndexItemsResult searchIndexItemsResult = (SearchIndexItemsResult) other;
        return Intrinsics.c(this.searchIndexItems, searchIndexItemsResult.searchIndexItems) && this.refreshIntervalSeconds == searchIndexItemsResult.refreshIntervalSeconds;
    }

    public final int getRefreshIntervalSeconds() {
        return this.refreshIntervalSeconds;
    }

    @NotNull
    public final List<SearchIndexItem> getSearchIndexItems() {
        return this.searchIndexItems;
    }

    public int hashCode() {
        return (this.searchIndexItems.hashCode() * 31) + Integer.hashCode(this.refreshIntervalSeconds);
    }

    @NotNull
    public String toString() {
        return "SearchIndexItemsResult(searchIndexItems=" + this.searchIndexItems + ", refreshIntervalSeconds=" + this.refreshIntervalSeconds + ")";
    }
}
