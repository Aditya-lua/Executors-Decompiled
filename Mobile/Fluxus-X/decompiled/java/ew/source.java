package ew;

import com.github.luben.zstd.BuildConfig;
import java.io.IOException;
import java.io.InputStream;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ew.r, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0012\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lew/r;", "Lew/l0;", "Ljava/io/InputStream;", "input", "Lew/m0;", "timeout", "<init>", "(Ljava/io/InputStream;Lew/m0;)V", "Lew/e;", "sink", BuildConfig.FLAVOR, "byteCount", "f3", "(Lew/e;J)J", BuildConfig.FLAVOR, "close", "()V", "t", "()Lew/m0;", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "a", "Ljava/io/InputStream;", "b", "Lew/m0;", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class source implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final InputStream input;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final m0 timeout;

    public source(@NotNull InputStream input, @NotNull m0 timeout) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.input = input;
        this.timeout = timeout;
    }

    @Override // ew.l0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.input.close();
    }

    @Override // ew.l0
    public long f3(@NotNull e sink, long byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (byteCount == 0) {
            return 0L;
        }
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        try {
            this.timeout.f();
            g0 g0VarF0 = sink.f0(1);
            int i10 = this.input.read(g0VarF0.data, g0VarF0.limit, (int) Math.min(byteCount, 8192 - g0VarF0.limit));
            if (i10 != -1) {
                g0VarF0.limit += i10;
                long j10 = i10;
                sink.c0(sink.getSize() + j10);
                return j10;
            }
            if (g0VarF0.pos != g0VarF0.limit) {
                return -1L;
            }
            sink.head = g0VarF0.b();
            h0.b(g0VarF0);
            return -1L;
        } catch (AssertionError e10) {
            if (fw.v.b(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        }
    }

    @Override // ew.l0
    @NotNull
    /* JADX INFO: renamed from: t, reason: from getter */
    public m0 getTimeout() {
        return this.timeout;
    }

    @NotNull
    public String toString() {
        return "source(" + this.input + ')';
    }
}
