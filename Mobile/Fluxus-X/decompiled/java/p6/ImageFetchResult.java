package p6;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: p6.l, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Lp6/l;", "Lp6/i;", "Ll6/n;", "image", BuildConfig.FLAVOR, "isSampled", "Ln6/f;", "dataSource", "<init>", "(Ll6/n;ZLn6/f;)V", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "a", "Ll6/n;", "b", "()Ll6/n;", "Z", "c", "()Z", "Ln6/f;", "()Ln6/f;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ImageFetchResult implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final l6.n image;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final boolean isSampled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final n6.f dataSource;

    public ImageFetchResult(@NotNull l6.n nVar, boolean z10, @NotNull n6.f fVar) {
        this.image = nVar;
        this.isSampled = z10;
        this.dataSource = fVar;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final n6.f getDataSource() {
        return this.dataSource;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final l6.n getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsSampled() {
        return this.isSampled;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageFetchResult)) {
            return false;
        }
        ImageFetchResult imageFetchResult = (ImageFetchResult) other;
        return Intrinsics.c(this.image, imageFetchResult.image) && this.isSampled == imageFetchResult.isSampled && this.dataSource == imageFetchResult.dataSource;
    }

    public int hashCode() {
        return (((this.image.hashCode() * 31) + Boolean.hashCode(this.isSampled)) * 31) + this.dataSource.hashCode();
    }

    @NotNull
    public String toString() {
        return "ImageFetchResult(image=" + this.image + ", isSampled=" + this.isSampled + ", dataSource=" + this.dataSource + ')';
    }
}
