package io;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.k2, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0013"}, d2 = {"Lio/k2;", "", "", "hintAnimation", "guideDrawable", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OverlayAssets {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final int hintAnimation;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int guideDrawable;

    public OverlayAssets(int i10, int i11) {
        this.hintAnimation = i10;
        this.guideDrawable = i11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getGuideDrawable() {
        return this.guideDrawable;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getHintAnimation() {
        return this.hintAnimation;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OverlayAssets)) {
            return false;
        }
        OverlayAssets overlayAssets = (OverlayAssets) other;
        return this.hintAnimation == overlayAssets.hintAnimation && this.guideDrawable == overlayAssets.guideDrawable;
    }

    public int hashCode() {
        return (Integer.hashCode(this.hintAnimation) * 31) + Integer.hashCode(this.guideDrawable);
    }

    @NotNull
    public String toString() {
        return "OverlayAssets(hintAnimation=" + this.hintAnimation + ", guideDrawable=" + this.guideDrawable + ")";
    }
}
