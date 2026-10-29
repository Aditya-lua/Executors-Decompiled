package p605zi;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: zi.e, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m31665d2 = {"Lzi/e;", "", "Landroid/graphics/Bitmap;", "bitmap", "", "fromCache", "<init>", "(Landroid/graphics/Bitmap;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "b", "Z", "()Z", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class ThumbnailResult {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    public final Bitmap bitmap;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final boolean fromCache;

    public ThumbnailResult(@Nullable Bitmap bitmap, boolean z10) {
        this.bitmap = bitmap;
        this.fromCache = z10;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getFromCache() {
        return this.fromCache;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThumbnailResult)) {
            return false;
        }
        ThumbnailResult thumbnailResult = (ThumbnailResult) other;
        return Intrinsics.m31980c(this.bitmap, thumbnailResult.bitmap) && this.fromCache == thumbnailResult.fromCache;
    }

    public int hashCode() {
        Bitmap bitmap = this.bitmap;
        return ((bitmap == null ? 0 : bitmap.hashCode()) * 31) + Boolean.hashCode(this.fromCache);
    }

    @NotNull
    public String toString() {
        return "ThumbnailResult(bitmap=" + this.bitmap + ", fromCache=" + this.fromCache + ")";
    }
}
