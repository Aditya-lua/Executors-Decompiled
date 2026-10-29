package p537x6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p239k6.InterfaceC7474n;

/* JADX INFO: renamed from: x6.e, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e¨\u0006\u001f"}, m31665d2 = {"Lx6/e;", "Lx6/k;", "Lk6/n;", "image", "Lx6/g;", "request", "", "throwable", "<init>", "(Lk6/n;Lx6/g;Ljava/lang/Throwable;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lk6/n;", "p", "()Lk6/n;", "b", "Lx6/g;", "()Lx6/g;", "c", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class ErrorResult implements InterfaceC12750k {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    public final InterfaceC7474n image;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final ImageRequest request;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    public final Throwable throwable;

    public ErrorResult(@Nullable InterfaceC7474n interfaceC7474n, @NotNull ImageRequest imageRequest, @NotNull Throwable th2) {
        this.image = interfaceC7474n;
        this.request = imageRequest;
        this.throwable = th2;
    }

    @Override // p537x6.InterfaceC12750k
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public ImageRequest getRequest() {
        return this.request;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Throwable getThrowable() {
        return this.throwable;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorResult)) {
            return false;
        }
        ErrorResult errorResult = (ErrorResult) other;
        return Intrinsics.m31980c(this.image, errorResult.image) && Intrinsics.m31980c(this.request, errorResult.request) && Intrinsics.m31980c(this.throwable, errorResult.throwable);
    }

    public int hashCode() {
        InterfaceC7474n interfaceC7474n = this.image;
        return ((((interfaceC7474n == null ? 0 : interfaceC7474n.hashCode()) * 31) + this.request.hashCode()) * 31) + this.throwable.hashCode();
    }

    @Override // p537x6.InterfaceC12750k
    @Nullable
    /* JADX INFO: renamed from: p, reason: from getter */
    public InterfaceC7474n getImage() {
        return this.image;
    }

    @NotNull
    public String toString() {
        return "ErrorResult(image=" + this.image + ", request=" + this.request + ", throwable=" + this.throwable + ')';
    }
}
