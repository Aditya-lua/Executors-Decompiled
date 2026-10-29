package x6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: x6.t, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001a\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001e\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0019R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b\r\u0010-R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b!\u0010-¨\u0006/"}, d2 = {"Lx6/t;", "Lx6/k;", "Lk6/n;", "image", "Lx6/g;", "request", "Lm6/f;", "dataSource", "Ls6/d$b;", "memoryCacheKey", "", "diskCacheKey", "", "isSampled", "isPlaceholderCached", "<init>", "(Lk6/n;Lx6/g;Lm6/f;Ls6/d$b;Ljava/lang/String;ZZ)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Lk6/n;", "p", "()Lk6/n;", "b", "Lx6/g;", "()Lx6/g;", "c", "Lm6/f;", "()Lm6/f;", "d", "Ls6/d$b;", "getMemoryCacheKey", "()Ls6/d$b;", "e", "Ljava/lang/String;", "getDiskCacheKey", "f", "Z", "()Z", "g", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SuccessResult implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final k6.n image;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final ImageRequest request;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final m6.f dataSource;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final s6.d.Key memoryCacheKey;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String diskCacheKey;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean isSampled;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean isPlaceholderCached;

    public SuccessResult(@NotNull k6.n nVar, @NotNull ImageRequest imageRequest, @NotNull m6.f fVar, @Nullable s6.d.Key key, @Nullable String str, boolean z10, boolean z11) {
        this.image = nVar;
        this.request = imageRequest;
        this.dataSource = fVar;
        this.memoryCacheKey = key;
        this.diskCacheKey = str;
        this.isSampled = z10;
        this.isPlaceholderCached = z11;
    }

    @Override // x6.k
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public ImageRequest getRequest() {
        return this.request;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final m6.f getDataSource() {
        return this.dataSource;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsPlaceholderCached() {
        return this.isPlaceholderCached;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuccessResult)) {
            return false;
        }
        SuccessResult successResult = (SuccessResult) other;
        return Intrinsics.c(this.image, successResult.image) && Intrinsics.c(this.request, successResult.request) && this.dataSource == successResult.dataSource && Intrinsics.c(this.memoryCacheKey, successResult.memoryCacheKey) && Intrinsics.c(this.diskCacheKey, successResult.diskCacheKey) && this.isSampled == successResult.isSampled && this.isPlaceholderCached == successResult.isPlaceholderCached;
    }

    public int hashCode() {
        int iHashCode = ((((this.image.hashCode() * 31) + this.request.hashCode()) * 31) + this.dataSource.hashCode()) * 31;
        s6.d.Key key = this.memoryCacheKey;
        int iHashCode2 = (iHashCode + (key == null ? 0 : key.hashCode())) * 31;
        String str = this.diskCacheKey;
        return ((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.isSampled)) * 31) + Boolean.hashCode(this.isPlaceholderCached);
    }

    @Override // x6.k
    @NotNull
    /* JADX INFO: renamed from: p, reason: from getter */
    public k6.n getImage() {
        return this.image;
    }

    @NotNull
    public String toString() {
        return "SuccessResult(image=" + this.image + ", request=" + this.request + ", dataSource=" + this.dataSource + ", memoryCacheKey=" + this.memoryCacheKey + ", diskCacheKey=" + this.diskCacheKey + ", isSampled=" + this.isSampled + ", isPlaceholderCached=" + this.isPlaceholderCached + ')';
    }
}
