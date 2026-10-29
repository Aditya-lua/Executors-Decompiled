package p323o6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p239k6.InterfaceC7474n;
import p287m6.EnumC8432f;

/* JADX INFO: renamed from: o6.l, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, m31665d2 = {"Lo6/l;", "Lo6/i;", "Lk6/n;", "image", "", "isSampled", "Lm6/f;", "dataSource", "<init>", "(Lk6/n;ZLm6/f;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lk6/n;", "b", "()Lk6/n;", "Z", "c", "()Z", "Lm6/f;", "()Lm6/f;", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class ImageFetchResult implements InterfaceC9701i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final InterfaceC7474n image;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final boolean isSampled;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    public final EnumC8432f dataSource;

    public ImageFetchResult(@NotNull InterfaceC7474n interfaceC7474n, boolean z10, @NotNull EnumC8432f enumC8432f) {
        this.image = interfaceC7474n;
        this.isSampled = z10;
        this.dataSource = enumC8432f;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC8432f getDataSource() {
        return this.dataSource;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC7474n getImage() {
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
        return Intrinsics.m31980c(this.image, imageFetchResult.image) && this.isSampled == imageFetchResult.isSampled && this.dataSource == imageFetchResult.dataSource;
    }

    public int hashCode() {
        return (((this.image.hashCode() * 31) + Boolean.hashCode(this.isSampled)) * 31) + this.dataSource.hashCode();
    }

    @NotNull
    public String toString() {
        return "ImageFetchResult(image=" + this.image + ", isSampled=" + this.isSampled + ", dataSource=" + this.dataSource + ')';
    }
}
