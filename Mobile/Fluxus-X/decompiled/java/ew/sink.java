package ew;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import java.io.IOException;
import java.io.OutputStream;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ew.a0, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lew/a0;", "Lew/j0;", "Ljava/io/OutputStream;", "out", "Lew/m0;", "timeout", "<init>", "(Ljava/io/OutputStream;Lew/m0;)V", "Lew/e;", Payload.SOURCE, BuildConfig.FLAVOR, "byteCount", BuildConfig.FLAVOR, "R2", "(Lew/e;J)V", "flush", "()V", "close", "t", "()Lew/m0;", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "a", "Ljava/io/OutputStream;", "b", "Lew/m0;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class sink implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final OutputStream out;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final m0 timeout;

    public sink(@NotNull OutputStream out, @NotNull m0 timeout) {
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.out = out;
        this.timeout = timeout;
    }

    @Override // ew.j0
    public void R2(@NotNull e source, long byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        b.b(source.getSize(), 0L, byteCount);
        while (byteCount > 0) {
            this.timeout.f();
            g0 g0Var = source.head;
            Intrinsics.checkNotNull(g0Var);
            int iMin = (int) Math.min(byteCount, g0Var.limit - g0Var.pos);
            this.out.write(g0Var.data, g0Var.pos, iMin);
            g0Var.pos += iMin;
            long j10 = iMin;
            byteCount -= j10;
            source.c0(source.getSize() - j10);
            if (g0Var.pos == g0Var.limit) {
                source.head = g0Var.b();
                h0.b(g0Var);
            }
        }
    }

    @Override // ew.j0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.out.close();
    }

    @Override // ew.j0, java.io.Flushable
    public void flush() throws IOException {
        this.out.flush();
    }

    @Override // ew.j0
    @NotNull
    /* JADX INFO: renamed from: t, reason: from getter */
    public m0 getTimeout() {
        return this.timeout;
    }

    @NotNull
    public String toString() {
        return "sink(" + this.out + ')';
    }
}
