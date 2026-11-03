package vu;

import com.appsflyer.sdk_base.referrer.Payload;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: vu.i, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001fR\u0016\u0010\"\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lvu/i;", "Lvu/p0;", "Lvu/f;", "sink", "Ljava/util/zip/Deflater;", "deflater", "<init>", "(Lvu/f;Ljava/util/zip/Deflater;)V", "(Lvu/p0;Ljava/util/zip/Deflater;)V", "Lvu/e;", Payload.SOURCE, "", "byteCount", "", "write", "(Lvu/e;J)V", "flush", "()V", "b", "close", "Lvu/s0;", "timeout", "()Lvu/s0;", "", "toString", "()Ljava/lang/String;", "", "syncFlush", "a", "(Z)V", "Lvu/f;", "Ljava/util/zip/Deflater;", "c", "Z", "closed", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeflaterSink implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final f sink;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Deflater deflater;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean closed;

    public DeflaterSink(@NotNull f sink, @NotNull Deflater deflater) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
        this.sink = sink;
        this.deflater = deflater;
    }

    public final void a(boolean syncFlush) throws IOException {
        m0 m0VarY;
        int iDeflate;
        e bufferField = this.sink.getBufferField();
        while (true) {
            m0VarY = bufferField.Y(1);
            if (syncFlush) {
                try {
                    Deflater deflater = this.deflater;
                    byte[] bArr = m0VarY.data;
                    int i10 = m0VarY.limit;
                    iDeflate = deflater.deflate(bArr, i10, 8192 - i10, 2);
                } catch (NullPointerException e10) {
                    throw new IOException("Deflater already closed", e10);
                }
            } else {
                Deflater deflater2 = this.deflater;
                byte[] bArr2 = m0VarY.data;
                int i11 = m0VarY.limit;
                iDeflate = deflater2.deflate(bArr2, i11, 8192 - i11);
            }
            if (iDeflate > 0) {
                m0VarY.limit += iDeflate;
                bufferField.U(bufferField.getSize() + ((long) iDeflate));
                this.sink.g0();
            } else if (this.deflater.needsInput()) {
                break;
            }
        }
        if (m0VarY.pos == m0VarY.limit) {
            bufferField.head = m0VarY.b();
            n0.b(m0VarY);
        }
    }

    public final void b() throws IOException {
        this.deflater.finish();
        a(false);
    }

    @Override // vu.p0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.closed) {
            return;
        }
        b();
        th = null;
        try {
            this.deflater.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.sink.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.closed = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // vu.p0, java.io.Flushable
    public void flush() throws IOException {
        a(true);
        this.sink.flush();
    }

    @Override // vu.p0
    @NotNull
    /* JADX INFO: renamed from: timeout */
    public s0 getTimeout() {
        return this.sink.getTimeout();
    }

    @NotNull
    public String toString() {
        return "DeflaterSink(" + this.sink + ')';
    }

    @Override // vu.p0
    public void write(@NotNull e source, long byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        b.b(source.getSize(), 0L, byteCount);
        while (byteCount > 0) {
            m0 m0Var = source.head;
            Intrinsics.checkNotNull(m0Var);
            int iMin = (int) Math.min(byteCount, m0Var.limit - m0Var.pos);
            this.deflater.setInput(m0Var.data, m0Var.pos, iMin);
            a(false);
            long j10 = iMin;
            source.U(source.getSize() - j10);
            int i10 = m0Var.pos + iMin;
            m0Var.pos = i10;
            if (i10 == m0Var.limit) {
                source.head = m0Var.b();
                n0.b(m0Var);
            }
            byteCount -= j10;
        }
        this.deflater.setInput(wu.w.c(), 0, 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeflaterSink(@NotNull p0 sink, @NotNull Deflater deflater) {
        this(b0.b(sink), deflater);
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
    }
}
