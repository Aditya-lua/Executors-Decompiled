package p560xu;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xu.i0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, m31665d2 = {"Lxu/i0;", "Lxu/r0;", "Lxu/g;", "upstream", "<init>", "(Lxu/g;)V", "Lxu/e;", "sink", "", "byteCount", "read", "(Lxu/e;J)J", "Lxu/s0;", "timeout", "()Lxu/s0;", "", "close", "()V", "a", "Lxu/g;", "b", "Lxu/e;", "buffer", "Lxu/m0;", "c", "Lxu/m0;", "expectedSegment", "", "d", "I", "expectedPos", "", "e", "Z", "closed", "f", "J", "pos", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12933i0 implements InterfaceC12951r0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC12928g upstream;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C12924e buffer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public C12941m0 expectedSegment;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int expectedPos;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean closed;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public long pos;

    public C12933i0(@NotNull InterfaceC12928g upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        this.upstream = upstream;
        C12924e c12924eMo48036k = upstream.mo48036k();
        this.buffer = c12924eMo48036k;
        C12941m0 c12941m0 = c12924eMo48036k.head;
        this.expectedSegment = c12941m0;
        this.expectedPos = c12941m0 != null ? c12941m0.pos : -1;
    }

    @Override // p560xu.InterfaceC12951r0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.closed = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r4.pos) goto L15;
     */
    @Override // p560xu.InterfaceC12951r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long read(@NotNull C12924e sink, long byteCount) {
        C12941m0 c12941m0;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        C12941m0 c12941m1 = this.expectedSegment;
        if (c12941m1 != null) {
            C12941m0 c12941m2 = this.buffer.head;
            if (c12941m1 == c12941m2) {
                int i10 = this.expectedPos;
                Intrinsics.checkNotNull(c12941m2);
            }
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        if (byteCount == 0) {
            return 0L;
        }
        if (!this.upstream.request(this.pos + 1)) {
            return -1L;
        }
        if (this.expectedSegment == null && (c12941m0 = this.buffer.head) != null) {
            this.expectedSegment = c12941m0;
            Intrinsics.checkNotNull(c12941m0);
            this.expectedPos = c12941m0.pos;
        }
        long jMin = Math.min(byteCount, this.buffer.getSize() - this.pos);
        this.buffer.m48026f(sink, this.pos, jMin);
        this.pos += jMin;
        return jMin;
    }

    @Override // p560xu.InterfaceC12951r0
    @NotNull
    /* JADX INFO: renamed from: timeout */
    public C12953s0 getF45811a() {
        return this.upstream.getF45811a();
    }
}
