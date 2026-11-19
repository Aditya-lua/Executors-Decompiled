package ew;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0002\u0010\u0017¨\u0006\u0018"}, d2 = {"Lew/m;", "Lew/j0;", "delegate", "<init>", "(Lew/j0;)V", "Lew/e;", Payload.SOURCE, BuildConfig.FLAVOR, "byteCount", BuildConfig.FLAVOR, "R2", "(Lew/e;J)V", "flush", "()V", "Lew/m0;", "t", "()Lew/m0;", "close", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "a", "Lew/j0;", "()Lew/j0;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class m implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final j0 delegate;

    public m(@NotNull j0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // ew.j0
    public void R2(@NotNull e source, long byteCount) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.delegate.R2(source, byteCount);
    }

    @Override // ew.j0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // ew.j0, java.io.Flushable
    public void flush() {
        this.delegate.flush();
    }

    @Override // ew.j0
    @NotNull
    public m0 t() {
        return this.delegate.t();
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
