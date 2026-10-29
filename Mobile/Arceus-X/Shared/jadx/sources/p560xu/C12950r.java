package p560xu;

import com.appsflyer.sdk_base.referrer.Payload;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p588yu.C13474w;

/* JADX INFO: renamed from: xu.r */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\rJ\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u001b\u0010\u001a\u001a\u00060\u0017j\u0002`\u00188\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010(\u001a\u00060$j\u0002`%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, m31665d2 = {"Lxu/r;", "Lxu/p0;", "sink", "<init>", "(Lxu/p0;)V", "Lxu/e;", Payload.SOURCE, "", "byteCount", "", "write", "(Lxu/e;J)V", "flush", "()V", "Lxu/s0;", "timeout", "()Lxu/s0;", "close", "b", "buffer", "a", "Lxu/k0;", "Lxu/k0;", "Ljava/util/zip/Deflater;", "Lokio/Deflater;", "Ljava/util/zip/Deflater;", "deflater", "()Ljava/util/zip/Deflater;", "Lxu/i;", "c", "Lxu/i;", "deflaterSink", "", "d", "Z", "closed", "Ljava/util/zip/CRC32;", "Lokio/internal/CRC32;", "e", "Ljava/util/zip/CRC32;", "crc", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12950r implements InterfaceC12947p0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final buffer sink;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Deflater deflater;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final DeflaterSink deflaterSink;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean closed;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final CRC32 crc;

    public C12950r(@NotNull InterfaceC12947p0 sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        buffer bufferVar = new buffer(sink);
        this.sink = bufferVar;
        Deflater deflater = new Deflater(C13474w.m49160b(), true);
        this.deflater = deflater;
        this.deflaterSink = new DeflaterSink((InterfaceC12926f) bufferVar, deflater);
        this.crc = new CRC32();
        C12924e c12924e = bufferVar.bufferField;
        c12924e.writeShort(8075);
        c12924e.writeByte(8);
        c12924e.writeByte(0);
        c12924e.writeInt(0);
        c12924e.writeByte(0);
        c12924e.writeByte(0);
    }

    /* JADX INFO: renamed from: a */
    public final void m48186a(C12924e buffer, long byteCount) {
        C12941m0 c12941m0 = buffer.head;
        Intrinsics.checkNotNull(c12941m0);
        while (byteCount > 0) {
            int iMin = (int) Math.min(byteCount, c12941m0.limit - c12941m0.pos);
            this.crc.update(c12941m0.data, c12941m0.pos, iMin);
            byteCount -= (long) iMin;
            c12941m0 = c12941m0.next;
            Intrinsics.checkNotNull(c12941m0);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m48187b() {
        this.sink.m48163a((int) this.crc.getValue());
        this.sink.m48163a((int) this.deflater.getBytesRead());
    }

    @Override // p560xu.InterfaceC12947p0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.closed) {
            return;
        }
        this.deflaterSink.m48141b();
        m48187b();
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
        this.deflaterSink.flush();
    }

    @Override // p560xu.InterfaceC12947p0
    @NotNull
    /* JADX INFO: renamed from: timeout */
    public C12953s0 getTimeout() {
        return this.sink.getTimeout();
    }

    @Override // p560xu.InterfaceC12947p0
    public void write(@NotNull C12924e source, long byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (byteCount == 0) {
            return;
        }
        m48186a(source, byteCount);
        this.deflaterSink.write(source, byteCount);
    }
}
