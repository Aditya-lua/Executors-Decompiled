package ew;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lew/c0;", "Lew/l0;", "Lew/g;", "upstream", "<init>", "(Lew/g;)V", "Lew/e;", "sink", BuildConfig.FLAVOR, "byteCount", "f3", "(Lew/e;J)J", "Lew/m0;", "t", "()Lew/m0;", BuildConfig.FLAVOR, "close", "()V", "a", "Lew/g;", "b", "Lew/e;", "buffer", "Lew/g0;", "c", "Lew/g0;", "expectedSegment", BuildConfig.FLAVOR, "d", "I", "expectedPos", BuildConfig.FLAVOR, "e", "Z", "closed", "f", "J", "pos", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c0 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g upstream;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final e buffer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public g0 expectedSegment;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int expectedPos;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean closed;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public long pos;

    public c0(@NotNull g upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        this.upstream = upstream;
        e eVarL = upstream.l();
        this.buffer = eVarL;
        g0 g0Var = eVarL.head;
        this.expectedSegment = g0Var;
        this.expectedPos = g0Var != null ? g0Var.pos : -1;
    }

    @Override // ew.l0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.closed = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r4.pos) goto L15;
     */
    @Override // ew.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long f3(@NotNull e sink, long byteCount) {
        g0 g0Var;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        g0 g0Var2 = this.expectedSegment;
        if (g0Var2 != null) {
            g0 g0Var3 = this.buffer.head;
            if (g0Var2 == g0Var3) {
                int i10 = this.expectedPos;
                Intrinsics.checkNotNull(g0Var3);
            }
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        if (byteCount == 0) {
            return 0L;
        }
        if (!this.upstream.request(this.pos + 1)) {
            return -1L;
        }
        if (this.expectedSegment == null && (g0Var = this.buffer.head) != null) {
            this.expectedSegment = g0Var;
            Intrinsics.checkNotNull(g0Var);
            this.expectedPos = g0Var.pos;
        }
        long jMin = Math.min(byteCount, this.buffer.getSize() - this.pos);
        this.buffer.f(sink, this.pos, jMin);
        this.pos += jMin;
        return jMin;
    }

    @Override // ew.l0
    @NotNull
    public m0 t() {
        return this.upstream.t();
    }
}
