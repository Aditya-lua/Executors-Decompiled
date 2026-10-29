package com.roblox.client.pushnotification.v2.richpushnotifications;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/roblox/client/pushnotification/v2/richpushnotifications/Options;", "", "hidePrimaryImageInExpandedView", "", "<init>", "(Z)V", "getHidePrimaryImageInExpandedView", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Options {
    private final boolean hidePrimaryImageInExpandedView;

    public Options() {
        this(false, 1, null);
    }

    public static /* synthetic */ Options copy$default(Options options, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = options.hidePrimaryImageInExpandedView;
        }
        return options.copy(z10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getHidePrimaryImageInExpandedView() {
        return this.hidePrimaryImageInExpandedView;
    }

    @NotNull
    public final Options copy(boolean hidePrimaryImageInExpandedView) {
        return new Options(hidePrimaryImageInExpandedView);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Options) && this.hidePrimaryImageInExpandedView == ((Options) other).hidePrimaryImageInExpandedView;
    }

    public final boolean getHidePrimaryImageInExpandedView() {
        return this.hidePrimaryImageInExpandedView;
    }

    public int hashCode() {
        return Boolean.hashCode(this.hidePrimaryImageInExpandedView);
    }

    @NotNull
    public String toString() {
        return "Options(hidePrimaryImageInExpandedView=" + this.hidePrimaryImageInExpandedView + ")";
    }

    public Options(boolean z10) {
        this.hidePrimaryImageInExpandedView = z10;
    }

    public /* synthetic */ Options(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10);
    }
}
