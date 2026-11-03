package vu;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0016\u001a\u0004\b\u0002\u0010\u0015¨\u0006\u0017"}, d2 = {"Lvu/p;", "Lvu/r0;", "delegate", "<init>", "(Lvu/r0;)V", "Lvu/e;", "sink", "", "byteCount", "read", "(Lvu/e;J)J", "Lvu/s0;", "timeout", "()Lvu/s0;", "", "close", "()V", "", "toString", "()Ljava/lang/String;", "-deprecated_delegate", "()Lvu/r0;", "Lvu/r0;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class p implements r0 {

    @NotNull
    private final r0 delegate;

    public p(@NotNull r0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name and from getter */
    public final r0 getDelegate() {
        return this.delegate;
    }

    @Override // vu.r0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @NotNull
    public final r0 delegate() {
        return this.delegate;
    }

    @Override // vu.r0
    public long read(@NotNull e sink, long byteCount) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return this.delegate.read(sink, byteCount);
    }

    @Override // vu.r0
    @NotNull
    /* JADX INFO: renamed from: timeout */
    public s0 getF33651a() {
        return this.delegate.getF33651a();
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
