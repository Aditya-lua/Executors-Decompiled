package com.roblox.platform.http.returntypes.ossearch;

import androidx.annotation.Keep;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003J]\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\fHÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lcom/roblox/platform/http/returntypes/ossearch/SearchIndexItem;", "", "id", "", "itemType", "identifier", "Lcom/roblox/platform/http/returntypes/ossearch/SearchResultIdentifier;", Title.type, "deeplinkUrl", "thumbnailUrl", "thumbnailCacheKey", "rankingHint", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/platform/http/returntypes/ossearch/SearchResultIdentifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getId", "()Ljava/lang/String;", "getItemType", "getIdentifier", "()Lcom/roblox/platform/http/returntypes/ossearch/SearchResultIdentifier;", "getTitle", "getDeeplinkUrl", "getThumbnailUrl", "getThumbnailCacheKey", "getRankingHint", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "robloxplatform_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SearchIndexItem {

    @NotNull
    private final String deeplinkUrl;

    @NotNull
    private final String id;

    @Nullable
    private final SearchResultIdentifier identifier;

    @Nullable
    private final String itemType;
    private final int rankingHint;

    @NotNull
    private final String thumbnailCacheKey;

    @NotNull
    private final String thumbnailUrl;

    @NotNull
    private final String title;

    public SearchIndexItem(@NotNull String id2, @Nullable String str, @Nullable SearchResultIdentifier searchResultIdentifier, @NotNull String title, @NotNull String deeplinkUrl, @NotNull String thumbnailUrl, @NotNull String thumbnailCacheKey, int i10) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(deeplinkUrl, "deeplinkUrl");
        Intrinsics.checkNotNullParameter(thumbnailUrl, "thumbnailUrl");
        Intrinsics.checkNotNullParameter(thumbnailCacheKey, "thumbnailCacheKey");
        this.id = id2;
        this.itemType = str;
        this.identifier = searchResultIdentifier;
        this.title = title;
        this.deeplinkUrl = deeplinkUrl;
        this.thumbnailUrl = thumbnailUrl;
        this.thumbnailCacheKey = thumbnailCacheKey;
        this.rankingHint = i10;
    }

    public static /* synthetic */ SearchIndexItem copy$default(SearchIndexItem searchIndexItem, String str, String str2, SearchResultIdentifier searchResultIdentifier, String str3, String str4, String str5, String str6, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = searchIndexItem.id;
        }
        if ((i11 & 2) != 0) {
            str2 = searchIndexItem.itemType;
        }
        if ((i11 & 4) != 0) {
            searchResultIdentifier = searchIndexItem.identifier;
        }
        if ((i11 & 8) != 0) {
            str3 = searchIndexItem.title;
        }
        if ((i11 & 16) != 0) {
            str4 = searchIndexItem.deeplinkUrl;
        }
        if ((i11 & 32) != 0) {
            str5 = searchIndexItem.thumbnailUrl;
        }
        if ((i11 & 64) != 0) {
            str6 = searchIndexItem.thumbnailCacheKey;
        }
        if ((i11 & 128) != 0) {
            i10 = searchIndexItem.rankingHint;
        }
        String str7 = str6;
        int i12 = i10;
        String str8 = str4;
        String str9 = str5;
        return searchIndexItem.copy(str, str2, searchResultIdentifier, str3, str8, str9, str7, i12);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getItemType() {
        return this.itemType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SearchResultIdentifier getIdentifier() {
        return this.identifier;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDeeplinkUrl() {
        return this.deeplinkUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getThumbnailCacheKey() {
        return this.thumbnailCacheKey;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getRankingHint() {
        return this.rankingHint;
    }

    @NotNull
    public final SearchIndexItem copy(@NotNull String id2, @Nullable String itemType, @Nullable SearchResultIdentifier identifier, @NotNull String title, @NotNull String deeplinkUrl, @NotNull String thumbnailUrl, @NotNull String thumbnailCacheKey, int rankingHint) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(deeplinkUrl, "deeplinkUrl");
        Intrinsics.checkNotNullParameter(thumbnailUrl, "thumbnailUrl");
        Intrinsics.checkNotNullParameter(thumbnailCacheKey, "thumbnailCacheKey");
        return new SearchIndexItem(id2, itemType, identifier, title, deeplinkUrl, thumbnailUrl, thumbnailCacheKey, rankingHint);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchIndexItem)) {
            return false;
        }
        SearchIndexItem searchIndexItem = (SearchIndexItem) other;
        return Intrinsics.c(this.id, searchIndexItem.id) && Intrinsics.c(this.itemType, searchIndexItem.itemType) && Intrinsics.c(this.identifier, searchIndexItem.identifier) && Intrinsics.c(this.title, searchIndexItem.title) && Intrinsics.c(this.deeplinkUrl, searchIndexItem.deeplinkUrl) && Intrinsics.c(this.thumbnailUrl, searchIndexItem.thumbnailUrl) && Intrinsics.c(this.thumbnailCacheKey, searchIndexItem.thumbnailCacheKey) && this.rankingHint == searchIndexItem.rankingHint;
    }

    @NotNull
    public final String getDeeplinkUrl() {
        return this.deeplinkUrl;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final SearchResultIdentifier getIdentifier() {
        return this.identifier;
    }

    @Nullable
    public final String getItemType() {
        return this.itemType;
    }

    public final int getRankingHint() {
        return this.rankingHint;
    }

    @NotNull
    public final String getThumbnailCacheKey() {
        return this.thumbnailCacheKey;
    }

    @NotNull
    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.itemType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        SearchResultIdentifier searchResultIdentifier = this.identifier;
        return ((((((((((iHashCode2 + (searchResultIdentifier != null ? searchResultIdentifier.hashCode() : 0)) * 31) + this.title.hashCode()) * 31) + this.deeplinkUrl.hashCode()) * 31) + this.thumbnailUrl.hashCode()) * 31) + this.thumbnailCacheKey.hashCode()) * 31) + Integer.hashCode(this.rankingHint);
    }

    @NotNull
    public String toString() {
        return "SearchIndexItem(id=" + this.id + ", itemType=" + this.itemType + ", identifier=" + this.identifier + ", title=" + this.title + ", deeplinkUrl=" + this.deeplinkUrl + ", thumbnailUrl=" + this.thumbnailUrl + ", thumbnailCacheKey=" + this.thumbnailCacheKey + ", rankingHint=" + this.rankingHint + ")";
    }
}
