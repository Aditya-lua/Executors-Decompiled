package ew;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\bJ\u001f\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001dR\u0016\u0010!\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lew/q;", "Lew/l0;", "Lew/g;", Payload.SOURCE, "Ljava/util/zip/Inflater;", "inflater", "<init>", "(Lew/g;Ljava/util/zip/Inflater;)V", "(Lew/l0;Ljava/util/zip/Inflater;)V", "Lew/e;", "sink", BuildConfig.FLAVOR, "byteCount", "f3", "(Lew/e;J)J", "a", BuildConfig.FLAVOR, "b", "()Z", "Lew/m0;", "t", "()Lew/m0;", BuildConfig.FLAVOR, "close", "()V", "c", "Lew/g;", "Ljava/util/zip/Inflater;", BuildConfig.FLAVOR, "I", "bufferBytesHeldByInflater", "d", "Z", "closed", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q implements l0 {

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

    public q(@NotNull g source, @NotNull Inflater inflater) {
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
            g0 g0VarF0 = sink.f0(1);
            int iMin = (int) Math.min(byteCount, 8192 - g0VarF0.limit);
            b();
            int iInflate = this.inflater.inflate(g0VarF0.data, g0VarF0.limit, iMin);
            c();
            if (iInflate > 0) {
                g0VarF0.limit += iInflate;
                long j10 = iInflate;
                sink.c0(sink.getSize() + j10);
                return j10;
            }
            if (g0VarF0.pos == g0VarF0.limit) {
                sink.head = g0VarF0.b();
                h0.b(g0VarF0);
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
        if (this.source.c2()) {
            return true;
        }
        g0 g0Var = this.source.getBufferField().head;
        Intrinsics.checkNotNull(g0Var);
        int i10 = g0Var.limit;
        int i11 = g0Var.pos;
        int i12 = i10 - i11;
        this.bufferBytesHeldByInflater = i12;
        this.inflater.setInput(g0Var.data, i11, i12);
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

    @Override // ew.l0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        this.inflater.end();
        this.closed = true;
        this.source.close();
    }

    @Override // ew.l0
    public long f3(@NotNull e sink, long byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        do {
            long jA = a(sink, byteCount);
            if (jA > 0) {
                return jA;
            }
            if (this.inflater.finished() || this.inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.source.c2());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // ew.l0
    @NotNull
    /* JADX INFO: renamed from: t */
    public m0 getTimeout() {
        return this.source.getTimeout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(@NotNull l0 source, @NotNull Inflater inflater) {
        this(v.c(source), inflater);
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
    }
}
