package xu;

import com.appsflyer.sdk_base.referrer.Payload;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\bJ\u001f\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001dR\u0016\u0010!\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lxu/u;", "Lxu/r0;", "Lxu/g;", Payload.SOURCE, "Ljava/util/zip/Inflater;", "inflater", "<init>", "(Lxu/g;Ljava/util/zip/Inflater;)V", "(Lxu/r0;Ljava/util/zip/Inflater;)V", "Lxu/e;", "sink", "", "byteCount", "read", "(Lxu/e;J)J", "a", "", "b", "()Z", "Lxu/s0;", "timeout", "()Lxu/s0;", "", "close", "()V", "c", "Lxu/g;", "Ljava/util/zip/Inflater;", "", "I", "bufferBytesHeldByInflater", "d", "Z", "closed", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g source;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Inflater inflater;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int bufferBytesHeldByInflater;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean closed;

    public u(@NotNull g source, @NotNull Inflater inflater) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.source = source;
        this.inflater = inflater;
    }

    public final long a(@NotNull e sink, long byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (byteCount == 0) {
            return 0L;
        }
        try {
            m0 m0VarZ = sink.Z(1);
            int iMin = (int) Math.min(byteCount, 8192 - m0VarZ.limit);
            b();
            int iInflate = this.inflater.inflate(m0VarZ.data, m0VarZ.limit, iMin);
            c();
            if (iInflate > 0) {
                m0VarZ.limit += iInflate;
                long j10 = iInflate;
                sink.U(sink.getSize() + j10);
                return j10;
            }
            if (m0VarZ.pos == m0VarZ.limit) {
                sink.head = m0VarZ.b();
                n0.b(m0VarZ);
            }
            return 0L;
        } catch (DataFormatException e10) {
            throw new IOException(e10);
        }
    }

    public final boolean b() {
        if (!this.inflater.needsInput()) {
            return false;
        }
        if (this.source.Z1()) {
            return true;
        }
        m0 m0Var = this.source.k().head;
        Intrinsics.checkNotNull(m0Var);
        int i10 = m0Var.limit;
        int i11 = m0Var.pos;
        int i12 = i10 - i11;
        this.bufferBytesHeldByInflater = i12;
        this.inflater.setInput(m0Var.data, i11, i12);
        return false;
    }

    public final void c() {
        int i10 = this.bufferBytesHeldByInflater;
        if (i10 == 0) {
            return;
        }
        int remaining = i10 - this.inflater.getRemaining();
        this.bufferBytesHeldByInflater -= remaining;
        this.source.skip(remaining);
    }

    @Override // xu.r0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        this.inflater.end();
        this.closed = true;
        this.source.close();
    }

    @Override // xu.r0
    public long read(@NotNull e sink, long byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        do {
            long jA = a(sink, byteCount);
            if (jA > 0) {
                return jA;
            }
            if (this.inflater.finished() || this.inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.source.Z1());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // xu.r0
    @NotNull
    /* JADX INFO: renamed from: timeout */
    public s0 getF35329a() {
        return this.source.getF35329a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(@NotNull r0 source, @NotNull Inflater inflater) {
        this(b0.c(source), inflater);
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
    }
}
