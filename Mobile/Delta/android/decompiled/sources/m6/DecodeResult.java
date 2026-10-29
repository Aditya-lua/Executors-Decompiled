package m6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: m6.g, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lm6/g;", "", "Lk6/n;", "image", "", "isSampled", "<init>", "(Lk6/n;Z)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lk6/n;", "()Lk6/n;", "b", "Z", "()Z", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DecodeResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final k6.n image;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final boolean isSampled;

    public DecodeResult(@NotNull k6.n nVar, boolean z10) {
        this.image = nVar;
        this.isSampled = z10;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final k6.n getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsSampled() {
        return this.isSampled;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DecodeResult)) {
            return false;
        }
        DecodeResult decodeResult = (DecodeResult) other;
        return Intrinsics.c(this.image, decodeResult.image) && this.isSampled == decodeResult.isSampled;
    }

    public int hashCode() {
        return (this.image.hashCode() * 31) + Boolean.hashCode(this.isSampled);
    }

    @NotNull
    public String toString() {
        return "DecodeResult(image=" + this.image + ", isSampled=" + this.isSampled + ')';
    }
}
