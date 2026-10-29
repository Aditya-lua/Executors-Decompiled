package p560xu;

import com.appsflyer.sdk_base.referrer.Payload;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p588yu.C13474w;

/* JADX INFO: renamed from: xu.i, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001fR\u0016\u0010\"\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, m31665d2 = {"Lxu/i;", "Lxu/p0;", "Lxu/f;", "sink", "Ljava/util/zip/Deflater;", "deflater", "<init>", "(Lxu/f;Ljava/util/zip/Deflater;)V", "(Lxu/p0;Ljava/util/zip/Deflater;)V", "Lxu/e;", Payload.SOURCE, "", "byteCount", "", "write", "(Lxu/e;J)V", "flush", "()V", "b", "close", "Lxu/s0;", "timeout", "()Lxu/s0;", "", "toString", "()Ljava/lang/String;", "", "syncFlush", "a", "(Z)V", "Lxu/f;", "Ljava/util/zip/Deflater;", "c", "Z", "closed", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class DeflaterSink implements InterfaceC12947p0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC12926f sink;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Deflater deflater;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean closed;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DeflaterSink(@NotNull InterfaceC12926f sink, @NotNull Deflater deflater) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
        this.sink = sink;
        this.deflater = deflater;
    }

    /* JADX INFO: renamed from: a */
    public final void m48140a(boolean syncFlush) throws IOException {
        C12941m0 c12941m0M48015Z;
        int iDeflate;
        C12924e bufferField = this.sink.getBufferField();
        while (true) {
            c12941m0M48015Z = bufferField.m48015Z(1);
            if (syncFlush) {
                try {
                    Deflater deflater = this.deflater;
                    byte[] bArr = c12941m0M48015Z.data;
                    int i10 = c12941m0M48015Z.limit;
                    iDeflate = deflater.deflate(bArr, i10, 8192 - i10, 2);
                } catch (NullPointerException e10) {
                    throw new IOException("Deflater already closed", e10);
                }
            } else {
                Deflater deflater2 = this.deflater;
                byte[] bArr2 = c12941m0M48015Z.data;
                int i11 = c12941m0M48015Z.limit;
                iDeflate = deflater2.deflate(bArr2, i11, 8192 - i11);
            }
            if (iDeflate > 0) {
                c12941m0M48015Z.limit += iDeflate;
                bufferField.m48010U(bufferField.getSize() + ((long) iDeflate));
                this.sink.mo48034j0();
            } else if (this.deflater.needsInput()) {
                break;
            }
        }
        if (c12941m0M48015Z.pos == c12941m0M48015Z.limit) {
            bufferField.head = c12941m0M48015Z.m48171b();
            C12943n0.m48178b(c12941m0M48015Z);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m48141b() throws IOException {
        this.deflater.finish();
        m48140a(false);
    }

    @Override // p560xu.InterfaceC12947p0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.closed) {
            return;
        }
        m48141b();
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

    @Override // p560xu.InterfaceC12947p0, java.io.Flushable
    public void flush() throws IOException {
        m48140a(true);
        this.sink.flush();
    }

    @Override // p560xu.InterfaceC12947p0
    @NotNull
    /* JADX INFO: renamed from: timeout */
    public C12953s0 getTimeout() {
        return this.sink.getTimeout();
    }

    @NotNull
    public String toString() {
        return "DeflaterSink(" + this.sink + ')';
    }

    @Override // p560xu.InterfaceC12947p0
    public void write(@NotNull C12924e source, long byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        C12918b.m47948b(source.getSize(), 0L, byteCount);
        while (byteCount > 0) {
            C12941m0 c12941m0 = source.head;
            Intrinsics.checkNotNull(c12941m0);
            int iMin = (int) Math.min(byteCount, c12941m0.limit - c12941m0.pos);
            this.deflater.setInput(c12941m0.data, c12941m0.pos, iMin);
            m48140a(false);
            long j10 = iMin;
            source.m48010U(source.getSize() - j10);
            int i10 = c12941m0.pos + iMin;
            c12941m0.pos = i10;
            if (i10 == c12941m0.limit) {
                source.head = c12941m0.m48171b();
                C12943n0.m48178b(c12941m0);
            }
            byteCount -= j10;
        }
        this.deflater.setInput(C13474w.m49161c(), 0, 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeflaterSink(@NotNull InterfaceC12947p0 sink, @NotNull Deflater deflater) {
        this(C12919b0.m47960b(sink), deflater);
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
    }
}
