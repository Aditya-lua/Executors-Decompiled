package ew;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.CharsKt;

/* JADX INFO: renamed from: ew.f0, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\n\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020 2\u0006\u0010\t\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\n2\u0006\u0010\t\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020,2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020,2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020,H\u0016¢\u0006\u0004\b5\u0010.J\u0017\u00107\u001a\u00020,2\u0006\u00106\u001a\u00020\nH\u0016¢\u0006\u0004\b7\u00100J\u000f\u00108\u001a\u00020 H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020:H\u0016¢\u0006\u0004\b=\u0010<J\u000f\u0010>\u001a\u00020 H\u0016¢\u0006\u0004\b>\u00109J\u000f\u0010?\u001a\u00020 H\u0016¢\u0006\u0004\b?\u00109J\u000f\u0010@\u001a\u00020\nH\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\nH\u0016¢\u0006\u0004\bB\u0010AJ\u000f\u0010C\u001a\u00020\nH\u0016¢\u0006\u0004\bC\u0010AJ\u0017\u0010D\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\bD\u0010\u0013J\u0017\u0010F\u001a\u00020\n2\u0006\u0010E\u001a\u00020\u0016H\u0016¢\u0006\u0004\bF\u0010GJ'\u0010E\u001a\u00020\n2\u0006\u0010E\u001a\u00020\u00162\u0006\u0010H\u001a\u00020\n2\u0006\u0010I\u001a\u00020\nH\u0016¢\u0006\u0004\bE\u0010JJ\u0017\u0010L\u001a\u00020\n2\u0006\u0010K\u001a\u00020\u0019H\u0016¢\u0006\u0004\bL\u0010MJ\u001f\u0010N\u001a\u00020\n2\u0006\u0010K\u001a\u00020\u00192\u0006\u0010H\u001a\u00020\nH\u0016¢\u0006\u0004\bN\u0010OJ'\u0010P\u001a\u00020\n2\u0006\u0010K\u001a\u00020\u00192\u0006\u0010H\u001a\u00020\n2\u0006\u0010I\u001a\u00020\nH\u0016¢\u0006\u0004\bP\u0010QJ\u0017\u0010S\u001a\u00020\n2\u0006\u0010R\u001a\u00020\u0019H\u0016¢\u0006\u0004\bS\u0010MJ\u001f\u0010T\u001a\u00020\n2\u0006\u0010R\u001a\u00020\u00192\u0006\u0010H\u001a\u00020\nH\u0016¢\u0006\u0004\bT\u0010OJ\u001f\u0010V\u001a\u00020\u000e2\u0006\u0010U\u001a\u00020\n2\u0006\u0010K\u001a\u00020\u0019H\u0016¢\u0006\u0004\bV\u0010WJ/\u0010Y\u001a\u00020\u000e2\u0006\u0010U\u001a\u00020\n2\u0006\u0010K\u001a\u00020\u00192\u0006\u0010X\u001a\u00020 2\u0006\u0010\u000b\u001a\u00020 H\u0016¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020\u0001H\u0016¢\u0006\u0004\b[\u0010\\J\u000f\u0010^\u001a\u00020]H\u0016¢\u0006\u0004\b^\u0010_J\u000f\u0010`\u001a\u00020\u000eH\u0016¢\u0006\u0004\b`\u0010\u0010J\u000f\u0010a\u001a\u00020\u0011H\u0016¢\u0006\u0004\ba\u0010bJ\u000f\u0010d\u001a\u00020cH\u0016¢\u0006\u0004\bd\u0010eJ\u000f\u0010f\u001a\u00020,H\u0016¢\u0006\u0004\bf\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bF\u0010gR\u0014\u0010i\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010hR\u0016\u0010k\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bN\u0010jR\u001b\u0010n\u001a\u00020\u00068Ö\u0002X\u0096\u0004¢\u0006\f\u0012\u0004\bm\u0010b\u001a\u0004\bl\u0010\b¨\u0006o"}, d2 = {"Lew/f0;", "Lew/g;", "Lew/l0;", Payload.SOURCE, "<init>", "(Lew/l0;)V", "Lew/e;", "S", "()Lew/e;", "sink", BuildConfig.FLAVOR, "byteCount", "f3", "(Lew/e;J)J", BuildConfig.FLAVOR, "c2", "()Z", BuildConfig.FLAVOR, "w1", "(J)V", "request", "(J)Z", BuildConfig.FLAVOR, "readByte", "()B", "Lew/h;", "J2", "()Lew/h;", "M1", "(J)Lew/h;", "Lew/z;", "options", BuildConfig.FLAVOR, "J1", "(Lew/z;)I", BuildConfig.FLAVOR, "a2", "()[B", "Ljava/nio/ByteBuffer;", "read", "(Ljava/nio/ByteBuffer;)I", "Lew/j0;", "a0", "(Lew/j0;)J", BuildConfig.FLAVOR, "V2", "()Ljava/lang/String;", "G1", "(J)Ljava/lang/String;", "Ljava/nio/charset/Charset;", "charset", "C2", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "b1", "limit", "p0", "E2", "()I", BuildConfig.FLAVOR, "readShort", "()S", "j1", "readInt", "P2", "m1", "()J", "l2", "t3", "skip", "b", "a", "(B)J", "fromIndex", "toIndex", "(BJJ)J", "bytes", "i1", "(Lew/h;)J", "c", "(Lew/h;J)J", "K1", "(Lew/h;JJ)J", "targetBytes", "B2", "d", "offset", "V1", "(JLew/h;)Z", "bytesOffset", "e", "(JLew/h;II)Z", "peek", "()Lew/g;", "Ljava/io/InputStream;", "x3", "()Ljava/io/InputStream;", "isOpen", "close", "()V", "Lew/m0;", "t", "()Lew/m0;", "toString", "Lew/l0;", "Lew/e;", "bufferField", "Z", "closed", "l", "getBuffer$annotations", "buffer", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class buffer implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l0 source;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final e bufferField;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean closed;

    public buffer(@NotNull l0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
        this.bufferField = new e();
    }

    @Override // ew.g
    public long B2(@NotNull h targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        return d(targetBytes, 0L);
    }

    @Override // ew.g
    @NotNull
    public String C2(@NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        this.bufferField.h3(this.source);
        return this.bufferField.C2(charset);
    }

    @Override // ew.g
    public int E2() throws EOFException {
        w1(1L);
        byte bO = this.bufferField.o(0L);
        if ((bO & 224) == 192) {
            w1(2L);
        } else if ((bO & 240) == 224) {
            w1(3L);
        } else if ((bO & 248) == 240) {
            w1(4L);
        }
        return this.bufferField.E2();
    }

    @Override // ew.g
    @NotNull
    public String G1(long byteCount) throws EOFException {
        w1(byteCount);
        return this.bufferField.G1(byteCount);
    }

    @Override // ew.g
    public int J1(@NotNull z options) throws EOFException {
        Intrinsics.checkNotNullParameter(options, "options");
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        do {
            int iH = fw.a.h(this.bufferField, options, true);
            if (iH != -2) {
                if (iH == -1) {
                    return -1;
                }
                this.bufferField.skip(options.getByteStrings()[iH].I());
                return iH;
            }
        } while (this.source.f3(this.bufferField, 8192L) != -1);
        return -1;
    }

    @Override // ew.g
    @NotNull
    public h J2() {
        this.bufferField.h3(this.source);
        return this.bufferField.J2();
    }

    @Override // ew.g
    public long K1(@NotNull h bytes, long fromIndex, long toIndex) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return fw.f.b(this, bytes, 0, 0, fromIndex, toIndex, 6, null);
    }

    @Override // ew.g
    @NotNull
    public h M1(long byteCount) throws EOFException {
        w1(byteCount);
        return this.bufferField.M1(byteCount);
    }

    @Override // ew.g
    public int P2() throws EOFException {
        w1(4L);
        return this.bufferField.P2();
    }

    @Override // ew.g
    @NotNull
    /* JADX INFO: renamed from: S, reason: from getter */
    public e getBufferField() {
        return this.bufferField;
    }

    @Override // ew.g
    public boolean V1(long offset, @NotNull h bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return e(offset, bytes, 0, bytes.I());
    }

    @Override // ew.g
    @NotNull
    public String V2() {
        this.bufferField.h3(this.source);
        return this.bufferField.V2();
    }

    public long a(byte b) {
        return b(b, 0L, Long.MAX_VALUE);
    }

    @Override // ew.g
    public long a0(@NotNull j0 sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j10 = 0;
        while (this.source.f3(this.bufferField, 8192L) != -1) {
            long jC = this.bufferField.c();
            if (jC > 0) {
                j10 += jC;
                sink.R2(this.bufferField, jC);
            }
        }
        if (this.bufferField.getSize() <= 0) {
            return j10;
        }
        long size = j10 + this.bufferField.getSize();
        e eVar = this.bufferField;
        sink.R2(eVar, eVar.getSize());
        return size;
    }

    @Override // ew.g
    @NotNull
    public byte[] a2() {
        this.bufferField.h3(this.source);
        return this.bufferField.a2();
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
            long jP = this.bufferField.p(b10, jMax, j10);
            if (jP != -1) {
                return jP;
            }
            long size = this.bufferField.getSize();
            if (size >= j10 || this.source.f3(this.bufferField, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, size);
            b = b10;
            toIndex = j10;
        }
        return -1L;
    }

    @Override // ew.g
    @NotNull
    public String b1() {
        return p0(Long.MAX_VALUE);
    }

    public long c(@NotNull h bytes, long fromIndex) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return K1(bytes, fromIndex, Long.MAX_VALUE);
    }

    @Override // ew.g
    public boolean c2() {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        return this.bufferField.c2() && this.source.f3(this.bufferField, 8192L) == -1;
    }

    @Override // ew.l0, java.io.Closeable, java.lang.AutoCloseable
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
            long jS = this.bufferField.s(targetBytes, fromIndex);
            if (jS != -1) {
                return jS;
            }
            long size = this.bufferField.getSize();
            if (this.source.f3(this.bufferField, 8192L) == -1) {
                return -1L;
            }
            fromIndex = Math.max(fromIndex, size);
        }
    }

    public boolean e(long offset, @NotNull h bytes, int bytesOffset, int byteCount) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        return byteCount >= 0 && offset >= 0 && bytesOffset >= 0 && bytesOffset + byteCount <= bytes.I() && (byteCount == 0 || fw.f.a(this, bytes, bytesOffset, byteCount, offset, offset + 1) != -1);
    }

    @Override // ew.l0
    public long f3(@NotNull e sink, long byteCount) {
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
            if (this.source.f3(this.bufferField, 8192L) == -1) {
                return -1L;
            }
        }
        return this.bufferField.f3(sink, Math.min(byteCount, this.bufferField.getSize()));
    }

    @Override // ew.g
    public long i1(@NotNull h bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return c(bytes, 0L);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.closed;
    }

    @Override // ew.g
    public short j1() throws EOFException {
        w1(2L);
        return this.bufferField.j1();
    }

    @Override // ew.g, ew.f
    @NotNull
    /* JADX INFO: renamed from: l */
    public e getBufferField() {
        return this.bufferField;
    }

    @Override // ew.g
    public long l2() throws EOFException {
        w1(1L);
        long j10 = 0;
        while (true) {
            long j11 = j10 + 1;
            if (!request(j11)) {
                break;
            }
            byte bO = this.bufferField.o(j10);
            if ((bO < 48 || bO > 57) && !(j10 == 0 && bO == 45)) {
                if (j10 != 0) {
                    break;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Expected a digit or '-' but was 0x");
                String string = Integer.toString(bO, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                sb2.append(string);
                throw new NumberFormatException(sb2.toString());
            }
            j10 = j11;
        }
        return this.bufferField.l2();
    }

    @Override // ew.g
    public long m1() throws EOFException {
        w1(8L);
        return this.bufferField.m1();
    }

    @Override // ew.g
    @NotNull
    public String p0(long limit) throws EOFException {
        if (limit < 0) {
            throw new IllegalArgumentException(("limit < 0: " + limit).toString());
        }
        long j10 = limit == Long.MAX_VALUE ? Long.MAX_VALUE : limit + 1;
        long jB = b((byte) 10, 0L, j10);
        if (jB != -1) {
            return fw.a.g(this.bufferField, jB);
        }
        if (j10 < Long.MAX_VALUE && request(j10) && this.bufferField.o(j10 - 1) == 13 && request(j10 + 1) && this.bufferField.o(j10) == 10) {
            return fw.a.g(this.bufferField, j10);
        }
        e eVar = new e();
        e eVar2 = this.bufferField;
        eVar2.f(eVar, 0L, Math.min(32, eVar2.getSize()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.bufferField.getSize(), limit) + " content=" + eVar.J2().r() + (char) 8230);
    }

    @Override // ew.g
    @NotNull
    public g peek() {
        return v.c(new c0(this));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@NotNull ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (this.bufferField.getSize() == 0 && this.source.f3(this.bufferField, 8192L) == -1) {
            return -1;
        }
        return this.bufferField.read(sink);
    }

    @Override // ew.g
    public byte readByte() throws EOFException {
        w1(1L);
        return this.bufferField.readByte();
    }

    @Override // ew.g
    public int readInt() throws EOFException {
        w1(4L);
        return this.bufferField.readInt();
    }

    @Override // ew.g
    public short readShort() throws EOFException {
        w1(2L);
        return this.bufferField.readShort();
    }

    @Override // ew.g
    public boolean request(long byteCount) {
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (this.bufferField.getSize() < byteCount) {
            if (this.source.f3(this.bufferField, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // ew.g
    public void skip(long byteCount) throws EOFException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (byteCount > 0) {
            if (this.bufferField.getSize() == 0 && this.source.f3(this.bufferField, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(byteCount, this.bufferField.getSize());
            this.bufferField.skip(jMin);
            byteCount -= jMin;
        }
    }

    @Override // ew.l0
    @NotNull
    /* JADX INFO: renamed from: t */
    public m0 getTimeout() {
        return this.source.getTimeout();
    }

    @Override // ew.g
    public long t3() throws EOFException {
        w1(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!request(i11)) {
                break;
            }
            byte bO = this.bufferField.o(i10);
            if ((bO < 48 || bO > 57) && ((bO < 97 || bO > 102) && (bO < 65 || bO > 70))) {
                if (i10 != 0) {
                    break;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Expected leading [0-9a-fA-F] character but was 0x");
                String string = Integer.toString(bO, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                sb2.append(string);
                throw new NumberFormatException(sb2.toString());
            }
            i10 = i11;
        }
        return this.bufferField.t3();
    }

    @NotNull
    public String toString() {
        return "buffer(" + this.source + ')';
    }

    @Override // ew.g
    public void w1(long byteCount) throws EOFException {
        if (!request(byteCount)) {
            throw new EOFException();
        }
    }

    @Override // ew.g
    @NotNull
    public InputStream x3() {
        return new a();
    }

    /* JADX INFO: renamed from: ew.f0$a */
    @Metadata(d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"ew/f0$a", "Ljava/io/InputStream;", BuildConfig.FLAVOR, "read", "()I", BuildConfig.FLAVOR, "data", "offset", "byteCount", "([BII)I", "available", BuildConfig.FLAVOR, "close", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "Ljava/io/OutputStream;", "out", BuildConfig.FLAVOR, "transferTo", "(Ljava/io/OutputStream;)J", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
                if (bufferVar2.source.f3(bufferVar2.bufferField, 8192L) == -1) {
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
                    if (bufferVar.source.f3(bufferVar.bufferField, 8192L) == -1) {
                        return size;
                    }
                }
                size += buffer.this.bufferField.getSize();
                e.G0(buffer.this.bufferField, out, 0L, 2, null);
            }
        }

        @Override // java.io.InputStream
        public int read(byte[] data, int offset, int byteCount) throws IOException {
            Intrinsics.checkNotNullParameter(data, "data");
            if (!buffer.this.closed) {
                b.b(data.length, offset, byteCount);
                if (buffer.this.bufferField.getSize() == 0) {
                    buffer bufferVar = buffer.this;
                    if (bufferVar.source.f3(bufferVar.bufferField, 8192L) == -1) {
                        return -1;
                    }
                }
                return buffer.this.bufferField.read(data, offset, byteCount);
            }
            throw new IOException("closed");
        }
    }
}
