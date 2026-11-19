package ew;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J'\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR\u0014\u0010\u0002\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\"R\u0018\u0010&\u001a\u00060#j\u0002`$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010%R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010(R\u0018\u0010.\u001a\u00060*j\u0002`+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lew/p;", "Lew/l0;", Payload.SOURCE, "<init>", "(Lew/l0;)V", "Lew/e;", "sink", BuildConfig.FLAVOR, "byteCount", "f3", "(Lew/e;J)J", "Lew/m0;", "t", "()Lew/m0;", BuildConfig.FLAVOR, "close", "()V", "b", "c", "buffer", "offset", "d", "(Lew/e;JJ)V", BuildConfig.FLAVOR, "name", BuildConfig.FLAVOR, "expected", "actual", "a", "(Ljava/lang/String;II)V", BuildConfig.FLAVOR, "B", "section", "Lew/f0;", "Lew/f0;", "Ljava/util/zip/Inflater;", "Lokio/Inflater;", "Ljava/util/zip/Inflater;", "inflater", "Lew/q;", "Lew/q;", "inflaterSource", "Ljava/util/zip/CRC32;", "Lokio/internal/CRC32;", "e", "Ljava/util/zip/CRC32;", "crc", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public byte section;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final buffer source;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Inflater inflater;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final q inflaterSource;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CRC32 crc;

    public p(@NotNull l0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        buffer bufferVar = new buffer(source);
        this.source = bufferVar;
        Inflater inflater = new Inflater(true);
        this.inflater = inflater;
        this.inflaterSource = new q((g) bufferVar, inflater);
        this.crc = new CRC32();
    }

    public final void a(String name, int expected, int actual) throws IOException {
        if (actual == expected) {
            return;
        }
        throw new IOException(name + ": actual 0x" + StringsKt.y0(b.j(actual), 8, '0') + " != expected 0x" + StringsKt.y0(b.j(expected), 8, '0'));
    }

    public final void b() throws IOException {
        this.source.w1(10L);
        byte bO = this.source.bufferField.o(3L);
        boolean z10 = ((bO >> 1) & 1) == 1;
        if (z10) {
            d(this.source.bufferField, 0L, 10L);
        }
        a("ID1ID2", 8075, this.source.readShort());
        this.source.skip(8L);
        if (((bO >> 2) & 1) == 1) {
            this.source.w1(2L);
            if (z10) {
                d(this.source.bufferField, 0L, 2L);
            }
            long jJ1 = this.source.bufferField.j1() & 65535;
            this.source.w1(jJ1);
            if (z10) {
                d(this.source.bufferField, 0L, jJ1);
            }
            this.source.skip(jJ1);
        }
        if (((bO >> 3) & 1) == 1) {
            long jA = this.source.a((byte) 0);
            if (jA == -1) {
                throw new EOFException();
            }
            if (z10) {
                d(this.source.bufferField, 0L, jA + 1);
            }
            this.source.skip(jA + 1);
        }
        if (((bO >> 4) & 1) == 1) {
            long jA2 = this.source.a((byte) 0);
            if (jA2 == -1) {
                throw new EOFException();
            }
            if (z10) {
                d(this.source.bufferField, 0L, jA2 + 1);
            }
            this.source.skip(jA2 + 1);
        }
        if (z10) {
            a("FHCRC", this.source.j1(), (short) this.crc.getValue());
            this.crc.reset();
        }
    }

    public final void c() throws IOException {
        a("CRC", this.source.P2(), (int) this.crc.getValue());
        a("ISIZE", this.source.P2(), (int) this.inflater.getBytesWritten());
    }

    @Override // ew.l0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.inflaterSource.close();
    }

    public final void d(e buffer, long offset, long byteCount) {
        g0 g0Var = buffer.head;
        Intrinsics.checkNotNull(g0Var);
        while (true) {
            int i10 = g0Var.limit;
            int i11 = g0Var.pos;
            if (offset < i10 - i11) {
                break;
            }
            offset -= (long) (i10 - i11);
            g0Var = g0Var.next;
            Intrinsics.checkNotNull(g0Var);
        }
        while (byteCount > 0) {
            int i12 = (int) (((long) g0Var.pos) + offset);
            int iMin = (int) Math.min(g0Var.limit - i12, byteCount);
            this.crc.update(g0Var.data, i12, iMin);
            byteCount -= (long) iMin;
            g0Var = g0Var.next;
            Intrinsics.checkNotNull(g0Var);
            offset = 0;
        }
    }

    @Override // ew.l0
    public long f3(@NotNull e sink, long byteCount) throws IOException {
        p pVar;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (byteCount == 0) {
            return 0L;
        }
        if (this.section == 0) {
            b();
            this.section = (byte) 1;
        }
        if (this.section == 1) {
            long size = sink.getSize();
            long jF3 = this.inflaterSource.f3(sink, byteCount);
            if (jF3 != -1) {
                d(sink, size, jF3);
                return jF3;
            }
            pVar = this;
            pVar.section = (byte) 2;
        } else {
            pVar = this;
        }
        if (pVar.section == 2) {
            c();
            pVar.section = (byte) 3;
            if (!pVar.source.c2()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // ew.l0
    @NotNull
    /* JADX INFO: renamed from: t */
    public m0 getTimeout() {
        return this.source.getTimeout();
    }
}
