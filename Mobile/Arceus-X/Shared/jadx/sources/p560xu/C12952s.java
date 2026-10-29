package p560xu;

import com.appsflyer.sdk_base.referrer.Payload;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: xu.s */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J'\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR\u0014\u0010\u0002\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\"R\u0018\u0010&\u001a\u00060#j\u0002`$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010%R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010(R\u0018\u0010.\u001a\u00060*j\u0002`+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, m31665d2 = {"Lxu/s;", "Lxu/r0;", Payload.SOURCE, "<init>", "(Lxu/r0;)V", "Lxu/e;", "sink", "", "byteCount", "read", "(Lxu/e;J)J", "Lxu/s0;", "timeout", "()Lxu/s0;", "", "close", "()V", "b", "c", "buffer", "offset", "d", "(Lxu/e;JJ)V", "", "name", "", "expected", "actual", "a", "(Ljava/lang/String;II)V", "", "B", "section", "Lxu/l0;", "Lxu/l0;", "Ljava/util/zip/Inflater;", "Lokio/Inflater;", "Ljava/util/zip/Inflater;", "inflater", "Lxu/u;", "Lxu/u;", "inflaterSource", "Ljava/util/zip/CRC32;", "Lokio/internal/CRC32;", "e", "Ljava/util/zip/CRC32;", "crc", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12952s implements InterfaceC12951r0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public byte section;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final buffer source;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Inflater inflater;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C12956u inflaterSource;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final CRC32 crc;

    public C12952s(@NotNull InterfaceC12951r0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        buffer bufferVar = new buffer(source);
        this.source = bufferVar;
        Inflater inflater = new Inflater(true);
        this.inflater = inflater;
        this.inflaterSource = new C12956u((InterfaceC12928g) bufferVar, inflater);
        this.crc = new CRC32();
    }

    /* JADX INFO: renamed from: a */
    public final void m48188a(String name, int expected, int actual) throws IOException {
        if (actual == expected) {
            return;
        }
        throw new IOException(name + ": actual 0x" + StringsKt.m32195y0(C12918b.m47958l(actual), 8, '0') + " != expected 0x" + StringsKt.m32195y0(C12918b.m47958l(expected), 8, '0'));
    }

    /* JADX INFO: renamed from: b */
    public final void m48189b() throws IOException {
        this.source.mo48054w1(10L);
        byte bM48033j = this.source.bufferField.m48033j(3L);
        boolean z10 = ((bM48033j >> 1) & 1) == 1;
        if (z10) {
            m48191d(this.source.bufferField, 0L, 10L);
        }
        m48188a("ID1ID2", 8075, this.source.readShort());
        this.source.skip(8L);
        if (((bM48033j >> 2) & 1) == 1) {
            this.source.mo48054w1(2L);
            if (z10) {
                m48191d(this.source.bufferField, 0L, 2L);
            }
            long jMo48037k1 = this.source.bufferField.mo48037k1() & 65535;
            this.source.mo48054w1(jMo48037k1);
            if (z10) {
                m48191d(this.source.bufferField, 0L, jMo48037k1);
            }
            this.source.skip(jMo48037k1);
        }
        if (((bM48033j >> 3) & 1) == 1) {
            long jM48165a = this.source.m48165a((byte) 0);
            if (jM48165a == -1) {
                throw new EOFException();
            }
            if (z10) {
                m48191d(this.source.bufferField, 0L, jM48165a + 1);
            }
            this.source.skip(jM48165a + 1);
        }
        if (((bM48033j >> 4) & 1) == 1) {
            long jM48165a2 = this.source.m48165a((byte) 0);
            if (jM48165a2 == -1) {
                throw new EOFException();
            }
            if (z10) {
                m48191d(this.source.bufferField, 0L, jM48165a2 + 1);
            }
            this.source.skip(jM48165a2 + 1);
        }
        if (z10) {
            m48188a("FHCRC", this.source.mo48037k1(), (short) this.crc.getValue());
            this.crc.reset();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m48190c() throws IOException {
        m48188a("CRC", this.source.mo48005M2(), (int) this.crc.getValue());
        m48188a("ISIZE", this.source.mo48005M2(), (int) this.inflater.getBytesWritten());
    }

    @Override // p560xu.InterfaceC12951r0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.inflaterSource.close();
    }

    /* JADX INFO: renamed from: d */
    public final void m48191d(C12924e buffer, long offset, long byteCount) {
        C12941m0 c12941m0 = buffer.head;
        Intrinsics.checkNotNull(c12941m0);
        while (true) {
            int i10 = c12941m0.limit;
            int i11 = c12941m0.pos;
            if (offset < i10 - i11) {
                break;
            }
            offset -= (long) (i10 - i11);
            c12941m0 = c12941m0.next;
            Intrinsics.checkNotNull(c12941m0);
        }
        while (byteCount > 0) {
            int i12 = (int) (((long) c12941m0.pos) + offset);
            int iMin = (int) Math.min(c12941m0.limit - i12, byteCount);
            this.crc.update(c12941m0.data, i12, iMin);
            byteCount -= (long) iMin;
            c12941m0 = c12941m0.next;
            Intrinsics.checkNotNull(c12941m0);
            offset = 0;
        }
    }

    @Override // p560xu.InterfaceC12951r0
    public long read(@NotNull C12924e sink, long byteCount) throws IOException {
        C12952s c12952s;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (byteCount == 0) {
            return 0L;
        }
        if (this.section == 0) {
            m48189b();
            this.section = (byte) 1;
        }
        if (this.section == 1) {
            long size = sink.getSize();
            long j10 = this.inflaterSource.read(sink, byteCount);
            if (j10 != -1) {
                m48191d(sink, size, j10);
                return j10;
            }
            c12952s = this;
            c12952s.section = (byte) 2;
        } else {
            c12952s = this;
        }
        if (c12952s.section == 2) {
            m48190c();
            c12952s.section = (byte) 3;
            if (!c12952s.source.mo48016Z1()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // p560xu.InterfaceC12951r0
    @NotNull
    /* JADX INFO: renamed from: timeout */
    public C12953s0 getF45811a() {
        return this.source.getF45811a();
    }
}
