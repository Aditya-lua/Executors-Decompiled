package vu;

import com.appsflyer.sdk_base.referrer.Payload;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: vu.l0, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\n\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020#H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010\f\u001a\u00020 2\u0006\u0010\t\u001a\u00020(H\u0016¢\u0006\u0004\b\f\u0010)J\u001f\u0010*\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\n2\u0006\u0010\t\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020/2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020/2\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020/H\u0016¢\u0006\u0004\b8\u00101J\u0017\u0010:\u001a\u00020/2\u0006\u00109\u001a\u00020\nH\u0016¢\u0006\u0004\b:\u00103J\u000f\u0010;\u001a\u00020 H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020=H\u0016¢\u0006\u0004\b@\u0010?J\u000f\u0010A\u001a\u00020 H\u0016¢\u0006\u0004\bA\u0010<J\u000f\u0010B\u001a\u00020 H\u0016¢\u0006\u0004\bB\u0010<J\u000f\u0010C\u001a\u00020\nH\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\nH\u0016¢\u0006\u0004\bE\u0010DJ\u000f\u0010F\u001a\u00020\nH\u0016¢\u0006\u0004\bF\u0010DJ\u000f\u0010G\u001a\u00020\nH\u0016¢\u0006\u0004\bG\u0010DJ\u0017\u0010H\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\bH\u0010\u0013J\u0017\u0010J\u001a\u00020\n2\u0006\u0010I\u001a\u00020\u0016H\u0016¢\u0006\u0004\bJ\u0010KJ'\u0010I\u001a\u00020\n2\u0006\u0010I\u001a\u00020\u00162\u0006\u0010L\u001a\u00020\n2\u0006\u0010M\u001a\u00020\nH\u0016¢\u0006\u0004\bI\u0010NJ\u0017\u0010P\u001a\u00020\n2\u0006\u0010O\u001a\u00020\u0019H\u0016¢\u0006\u0004\bP\u0010QJ\u001f\u0010R\u001a\u00020\n2\u0006\u0010O\u001a\u00020\u00192\u0006\u0010L\u001a\u00020\nH\u0016¢\u0006\u0004\bR\u0010SJ'\u0010T\u001a\u00020\n2\u0006\u0010O\u001a\u00020\u00192\u0006\u0010L\u001a\u00020\n2\u0006\u0010M\u001a\u00020\nH\u0016¢\u0006\u0004\bT\u0010UJ\u0017\u0010W\u001a\u00020\n2\u0006\u0010V\u001a\u00020\u0019H\u0016¢\u0006\u0004\bW\u0010QJ\u001f\u0010X\u001a\u00020\n2\u0006\u0010V\u001a\u00020\u00192\u0006\u0010L\u001a\u00020\nH\u0016¢\u0006\u0004\bX\u0010SJ\u001f\u0010Z\u001a\u00020\u000e2\u0006\u0010Y\u001a\u00020\n2\u0006\u0010O\u001a\u00020\u0019H\u0016¢\u0006\u0004\bZ\u0010[J/\u0010]\u001a\u00020\u000e2\u0006\u0010Y\u001a\u00020\n2\u0006\u0010O\u001a\u00020\u00192\u0006\u0010\\\u001a\u00020 2\u0006\u0010\u000b\u001a\u00020 H\u0016¢\u0006\u0004\b]\u0010^J\u000f\u0010_\u001a\u00020\u0001H\u0016¢\u0006\u0004\b_\u0010`J\u000f\u0010b\u001a\u00020aH\u0016¢\u0006\u0004\bb\u0010cJ\u000f\u0010d\u001a\u00020\u000eH\u0016¢\u0006\u0004\bd\u0010\u0010J\u000f\u0010e\u001a\u00020\u0011H\u0016¢\u0006\u0004\be\u0010fJ\u000f\u0010h\u001a\u00020gH\u0016¢\u0006\u0004\bh\u0010iJ\u000f\u0010j\u001a\u00020/H\u0016¢\u0006\u0004\bj\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bJ\u0010kR\u0014\u0010m\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bI\u0010lR\u0016\u0010o\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bR\u0010nR\u001b\u0010r\u001a\u00020\u00068Ö\u0002X\u0096\u0004¢\u0006\f\u0012\u0004\bq\u0010f\u001a\u0004\bp\u0010\b¨\u0006s"}, d2 = {"Lvu/l0;", "Lvu/g;", "Lvu/r0;", Payload.SOURCE, "<init>", "(Lvu/r0;)V", "Lvu/e;", "O", "()Lvu/e;", "sink", "", "byteCount", "read", "(Lvu/e;J)J", "", "a2", "()Z", "", "u1", "(J)V", "request", "(J)Z", "", "readByte", "()B", "Lvu/h;", "G2", "()Lvu/h;", "I1", "(J)Lvu/h;", "Lvu/f0;", "options", "", "J1", "(Lvu/f0;)I", "", "X1", "()[B", "readFully", "([B)V", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)I", "Y1", "(Lvu/e;J)V", "Lvu/p0;", "a3", "(Lvu/p0;)J", "", "Q2", "()Ljava/lang/String;", "D1", "(J)Ljava/lang/String;", "Ljava/nio/charset/Charset;", "charset", "A2", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "X0", "limit", "k0", "B2", "()I", "", "readShort", "()S", "g1", "readInt", "L2", "readLong", "()J", "j1", "i2", "o3", "skip", "b", "a", "(B)J", "fromIndex", "toIndex", "(BJJ)J", "bytes", "R1", "(Lvu/h;)J", "c", "(Lvu/h;J)J", "d3", "(Lvu/h;JJ)J", "targetBytes", "e1", "d", "offset", "m1", "(JLvu/h;)Z", "bytesOffset", "e", "(JLvu/h;II)Z", "peek", "()Lvu/g;", "Ljava/io/InputStream;", "s3", "()Ljava/io/InputStream;", "isOpen", "close", "()V", "Lvu/s0;", "timeout", "()Lvu/s0;", "toString", "Lvu/r0;", "Lvu/e;", "bufferField", "Z", "closed", "k", "getBuffer$annotations", "buffer", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class buffer implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final r0 source;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final e bufferField;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean closed;

    public buffer(@NotNull r0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
        this.bufferField = new e();
    }

    @Override // vu.g
    @NotNull
    public String A2(@NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        this.bufferField.c3(this.source);
        return this.bufferField.A2(charset);
    }

    @Override // vu.g
    public int B2() throws EOFException {
        u1(1L);
        byte bJ = this.bufferField.j(0L);
        if ((bJ & 224) == 192) {
            u1(2L);
        } else if ((bJ & 240) == 224) {
            u1(3L);
        } else if ((bJ & 248) == 240) {
            u1(4L);
        }
        return this.bufferField.B2();
    }

    @Override // vu.g
    @NotNull
    public String D1(long byteCount) throws EOFException {
        u1(byteCount);
        return this.bufferField.D1(byteCount);
    }

    @Override // vu.g
    @NotNull
    public h G2() {
        this.bufferField.c3(this.source);
        return this.bufferField.G2();
    }

    @Override // vu.g
    @NotNull
    public h I1(long byteCount) throws EOFException {
        u1(byteCount);
        return this.bufferField.I1(byteCount);
    }

    @Override // vu.g
    public int J1(@NotNull f0 options) throws EOFException {
        Intrinsics.checkNotNullParameter(options, "options");
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        do {
            int i10 = wu.a.i(this.bufferField, options, true);
            if (i10 != -2) {
                if (i10 == -1) {
                    return -1;
                }
                this.bufferField.skip(options.getByteStrings()[i10].I());
                return i10;
            }
        } while (this.source.read(this.bufferField, 8192L) != -1);
        return -1;
    }

    @Override // vu.g
    public int L2() throws EOFException {
        u1(4L);
        return this.bufferField.L2();
    }

    @Override // vu.g
    @NotNull
    /* JADX INFO: renamed from: O, reason: from getter */
    public e getBufferField() {
        return this.bufferField;
    }

    @Override // vu.g
    @NotNull
    public String Q2() {
        this.bufferField.c3(this.source);
        return this.bufferField.Q2();
    }

    @Override // vu.g
    public long R1(@NotNull h bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return c(bytes, 0L);
    }

    @Override // vu.g
    @NotNull
    public String X0() {
        return k0(Long.MAX_VALUE);
    }

    @Override // vu.g
    @NotNull
    public byte[] X1() {
        this.bufferField.c3(this.source);
        return this.bufferField.X1();
    }

    @Override // vu.g
    public void Y1(@NotNull e sink, long byteCount) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            u1(byteCount);
            this.bufferField.Y1(sink, byteCount);
        } catch (EOFException e10) {
            sink.c3(this.bufferField);
            throw e10;
        }
    }

    public long a(byte b) {
        return b(b, 0L, Long.MAX_VALUE);
    }

    @Override // vu.g
    public boolean a2() {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        return this.bufferField.a2() && this.source.read(this.bufferField, 8192L) == -1;
    }

    @Override // vu.g
    public long a3(@NotNull p0 sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j10 = 0;
        while (this.source.read(this.bufferField, 8192L) != -1) {
            long jC = this.bufferField.c();
            if (jC > 0) {
                j10 += jC;
                sink.write(this.bufferField, jC);
            }
        }
        if (this.bufferField.getSize() <= 0) {
            return j10;
        }
        long size = j10 + this.bufferField.getSize();
        e eVar = this.bufferField;
        sink.write(eVar, eVar.getSize());
        return size;
    }

    public long b(byte b, long fromIndex, long toIndex) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (0 > fromIndex || fromIndex > toIndex) {
            throw new IllegalArgumentException(("fromIndex=" + fromIndex + " toIndex=" + toIndex).toString());
        }
        long jMax = fromIndex;
        while (jMax < toIndex) {
            byte b10 = b;
            long j10 = toIndex;
            long jN = this.bufferField.n(b10, jMax, j10);
            if (jN != -1) {
                return jN;
            }
            long size = this.bufferField.getSize();
            if (size >= j10 || this.source.read(this.bufferField, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, size);
            b = b10;
            toIndex = j10;
        }
        return -1L;
    }

    public long c(@NotNull h bytes, long fromIndex) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return d3(bytes, fromIndex, Long.MAX_VALUE);
    }

    @Override // vu.r0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.source.close();
        this.bufferField.a();
    }

    public long d(@NotNull h targetBytes, long fromIndex) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jQ = this.bufferField.q(targetBytes, fromIndex);
            if (jQ != -1) {
                return jQ;
            }
            long size = this.bufferField.getSize();
            if (this.source.read(this.bufferField, 8192L) == -1) {
                return -1L;
            }
            fromIndex = Math.max(fromIndex, size);
        }
    }

    @Override // vu.g
    public long d3(@NotNull h bytes, long fromIndex, long toIndex) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return wu.f.b(this, bytes, 0, 0, fromIndex, toIndex, 6, null);
    }

    public boolean e(long offset, @NotNull h bytes, int bytesOffset, int byteCount) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        return byteCount >= 0 && offset >= 0 && bytesOffset >= 0 && bytesOffset + byteCount <= bytes.I() && (byteCount == 0 || wu.f.a(this, bytes, bytesOffset, byteCount, offset, offset + 1) != -1);
    }

    @Override // vu.g
    public long e1(@NotNull h targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        return d(targetBytes, 0L);
    }

    @Override // vu.g
    public short g1() throws EOFException {
        u1(2L);
        return this.bufferField.g1();
    }

    @Override // vu.g
    public long i2() throws EOFException {
        u1(1L);
        long j10 = 0;
        while (true) {
            long j11 = j10 + 1;
            if (!request(j11)) {
                break;
            }
            byte bJ = this.bufferField.j(j10);
            if ((bJ < 48 || bJ > 57) && !(j10 == 0 && bJ == 45)) {
                if (j10 != 0) {
                    break;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Expected a digit or '-' but was 0x");
                String string = Integer.toString(bJ, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                sb2.append(string);
                throw new NumberFormatException(sb2.toString());
            }
            j10 = j11;
        }
        return this.bufferField.i2();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.closed;
    }

    @Override // vu.g
    public long j1() throws EOFException {
        u1(8L);
        return this.bufferField.j1();
    }

    @Override // vu.g, vu.f
    @NotNull
    /* JADX INFO: renamed from: k */
    public e getBufferField() {
        return this.bufferField;
    }

    @Override // vu.g
    @NotNull
    public String k0(long limit) throws EOFException {
        if (limit < 0) {
            throw new IllegalArgumentException(("limit < 0: " + limit).toString());
        }
        long j10 = limit == Long.MAX_VALUE ? Long.MAX_VALUE : limit + 1;
        long jB = b((byte) 10, 0L, j10);
        if (jB != -1) {
            return wu.a.h(this.bufferField, jB);
        }
        if (j10 < Long.MAX_VALUE && request(j10) && this.bufferField.j(j10 - 1) == 13 && request(j10 + 1) && this.bufferField.j(j10) == 10) {
            return wu.a.h(this.bufferField, j10);
        }
        e eVar = new e();
        e eVar2 = this.bufferField;
        eVar2.f(eVar, 0L, Math.min(32, eVar2.getSize()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.bufferField.getSize(), limit) + " content=" + eVar.G2().r() + (char) 8230);
    }

    @Override // vu.g
    public boolean m1(long offset, @NotNull h bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return e(offset, bytes, 0, bytes.I());
    }

    @Override // vu.g
    public long o3() throws EOFException {
        u1(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!request(i11)) {
                break;
            }
            byte bJ = this.bufferField.j(i10);
            if ((bJ < 48 || bJ > 57) && ((bJ < 97 || bJ > 102) && (bJ < 65 || bJ > 70))) {
                if (i10 != 0) {
                    break;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Expected leading [0-9a-fA-F] character but was 0x");
                String string = Integer.toString(bJ, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                sb2.append(string);
                throw new NumberFormatException(sb2.toString());
            }
            i10 = i11;
        }
        return this.bufferField.o3();
    }

    @Override // vu.g
    @NotNull
    public g peek() {
        return b0.c(new i0(this));
    }

    @Override // vu.r0
    public long read(@NotNull e sink, long byteCount) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (this.bufferField.getSize() == 0) {
            if (byteCount == 0) {
                return 0L;
            }
            if (this.source.read(this.bufferField, 8192L) == -1) {
                return -1L;
            }
        }
        return this.bufferField.read(sink, Math.min(byteCount, this.bufferField.getSize()));
    }

    @Override // vu.g
    public byte readByte() throws EOFException {
        u1(1L);
        return this.bufferField.readByte();
    }

    @Override // vu.g
    public void readFully(@NotNull byte[] sink) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            u1(sink.length);
            this.bufferField.readFully(sink);
        } catch (EOFException e10) {
            int i10 = 0;
            while (this.bufferField.getSize() > 0) {
                e eVar = this.bufferField;
                int i11 = eVar.read(sink, i10, (int) eVar.getSize());
                if (i11 == -1) {
                    throw new AssertionError();
                }
                i10 += i11;
            }
            throw e10;
        }
    }

    @Override // vu.g
    public int readInt() throws EOFException {
        u1(4L);
        return this.bufferField.readInt();
    }

    @Override // vu.g
    public long readLong() throws EOFException {
        u1(8L);
        return this.bufferField.readLong();
    }

    @Override // vu.g
    public short readShort() throws EOFException {
        u1(2L);
        return this.bufferField.readShort();
    }

    @Override // vu.g
    public boolean request(long byteCount) {
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (this.bufferField.getSize() < byteCount) {
            if (this.source.read(this.bufferField, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // vu.g
    @NotNull
    public InputStream s3() {
        return new a();
    }

    @Override // vu.g
    public void skip(long byteCount) throws EOFException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (byteCount > 0) {
            if (this.bufferField.getSize() == 0 && this.source.read(this.bufferField, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(byteCount, this.bufferField.getSize());
            this.bufferField.skip(jMin);
            byteCount -= jMin;
        }
    }

    @Override // vu.r0
    @NotNull
    /* JADX INFO: renamed from: timeout */
    public s0 getTimeout() {
        return this.source.getTimeout();
    }

    @NotNull
    public String toString() {
        return "buffer(" + this.source + ')';
    }

    @Override // vu.g
    public void u1(long byteCount) throws EOFException {
        if (!request(byteCount)) {
            throw new EOFException();
        }
    }

    /* JADX INFO: renamed from: vu.l0$a */
    @Metadata(d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"vu/l0$a", "Ljava/io/InputStream;", "", "read", "()I", "", "data", "offset", "byteCount", "([BII)I", "available", "", "close", "()V", "", "toString", "()Ljava/lang/String;", "Ljava/io/OutputStream;", "out", "", "transferTo", "(Ljava/io/OutputStream;)J", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            buffer bufferVar = buffer.this;
            if (bufferVar.closed) {
                throw new IOException("closed");
            }
            return (int) Math.min(bufferVar.bufferField.getSize(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws EOFException {
            buffer.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            buffer bufferVar = buffer.this;
            if (bufferVar.closed) {
                throw new IOException("closed");
            }
            if (bufferVar.bufferField.getSize() == 0) {
                buffer bufferVar2 = buffer.this;
                if (bufferVar2.source.read(bufferVar2.bufferField, 8192L) == -1) {
                    return -1;
                }
            }
            return buffer.this.bufferField.readByte() & 255;
        }

        public String toString() {
            return buffer.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public long transferTo(OutputStream out) throws IOException {
            Intrinsics.checkNotNullParameter(out, "out");
            if (buffer.this.closed) {
                throw new IOException("closed");
            }
            long size = 0;
            while (true) {
                if (buffer.this.bufferField.getSize() == 0) {
                    buffer bufferVar = buffer.this;
                    if (bufferVar.source.read(bufferVar.bufferField, 8192L) == -1) {
                        return size;
                    }
                }
                size += buffer.this.bufferField.getSize();
                e.B0(buffer.this.bufferField, out, 0L, 2, null);
            }
        }

        @Override // java.io.InputStream
        public int read(byte[] data, int offset, int byteCount) throws IOException {
            Intrinsics.checkNotNullParameter(data, "data");
            if (!buffer.this.closed) {
                b.b(data.length, offset, byteCount);
                if (buffer.this.bufferField.getSize() == 0) {
                    buffer bufferVar = buffer.this;
                    if (bufferVar.source.read(bufferVar.bufferField, 8192L) == -1) {
                        return -1;
                    }
                }
                return buffer.this.bufferField.read(data, offset, byteCount);
            }
            throw new IOException("closed");
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@NotNull ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (this.bufferField.getSize() == 0 && this.source.read(this.bufferField, 8192L) == -1) {
            return -1;
        }
        return this.bufferField.read(sink);
    }
}
