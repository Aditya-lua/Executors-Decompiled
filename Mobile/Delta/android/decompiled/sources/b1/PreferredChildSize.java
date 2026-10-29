package b1;

import android.graphics.Rect;
import android.util.Size;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: b1.b, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lb1/b;", "", "Landroid/graphics/Rect;", "cropRectBeforeScaling", "Landroid/util/Size;", "childSizeToScale", "originalSelectedChildSize", "<init>", "(Landroid/graphics/Rect;Landroid/util/Size;Landroid/util/Size;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/graphics/Rect;", "b", "()Landroid/graphics/Rect;", "Landroid/util/Size;", "()Landroid/util/Size;", "c", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PreferredChildSize {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final Rect cropRectBeforeScaling;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final Size childSizeToScale;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final Size originalSelectedChildSize;

    public PreferredChildSize(@NotNull Rect cropRectBeforeScaling, @NotNull Size childSizeToScale, @NotNull Size originalSelectedChildSize) {
        Intrinsics.checkNotNullParameter(cropRectBeforeScaling, "cropRectBeforeScaling");
        Intrinsics.checkNotNullParameter(childSizeToScale, "childSizeToScale");
        Intrinsics.checkNotNullParameter(originalSelectedChildSize, "originalSelectedChildSize");
        this.cropRectBeforeScaling = cropRectBeforeScaling;
        this.childSizeToScale = childSizeToScale;
        this.originalSelectedChildSize = originalSelectedChildSize;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Size getChildSizeToScale() {
        return this.childSizeToScale;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Rect getCropRectBeforeScaling() {
        return this.cropRectBeforeScaling;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Size getOriginalSelectedChildSize() {
        return this.originalSelectedChildSize;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreferredChildSize)) {
            return false;
        }
        PreferredChildSize preferredChildSize = (PreferredChildSize) other;
        return Intrinsics.c(this.cropRectBeforeScaling, preferredChildSize.cropRectBeforeScaling) && Intrinsics.c(this.childSizeToScale, preferredChildSize.childSizeToScale) && Intrinsics.c(this.originalSelectedChildSize, preferredChildSize.originalSelectedChildSize);
    }

    public int hashCode() {
        return (((this.cropRectBeforeScaling.hashCode() * 31) + this.childSizeToScale.hashCode()) * 31) + this.originalSelectedChildSize.hashCode();
    }

    @NotNull
    public String toString() {
        return "PreferredChildSize(cropRectBeforeScaling=" + this.cropRectBeforeScaling + ", childSizeToScale=" + this.childSizeToScale + ", originalSelectedChildSize=" + this.originalSelectedChildSize + ')';
    }
}
