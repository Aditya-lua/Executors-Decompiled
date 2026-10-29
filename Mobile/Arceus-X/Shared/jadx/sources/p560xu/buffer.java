package p560xu;

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
import p588yu.C13452a;
import p588yu.C13457f;

/* JADX INFO: renamed from: xu.l0, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\n\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020#H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010\f\u001a\u00020 2\u0006\u0010\t\u001a\u00020(H\u0016¢\u0006\u0004\b\f\u0010)J\u001f\u0010*\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\n2\u0006\u0010\t\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020/2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020/2\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020/H\u0016¢\u0006\u0004\b8\u00101J\u0017\u0010:\u001a\u00020/2\u0006\u00109\u001a\u00020\nH\u0016¢\u0006\u0004\b:\u00103J\u000f\u0010;\u001a\u00020 H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020=H\u0016¢\u0006\u0004\b@\u0010?J\u000f\u0010A\u001a\u00020 H\u0016¢\u0006\u0004\bA\u0010<J\u000f\u0010B\u001a\u00020 H\u0016¢\u0006\u0004\bB\u0010<J\u000f\u0010C\u001a\u00020\nH\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\nH\u0016¢\u0006\u0004\bE\u0010DJ\u000f\u0010F\u001a\u00020\nH\u0016¢\u0006\u0004\bF\u0010DJ\u000f\u0010G\u001a\u00020\nH\u0016¢\u0006\u0004\bG\u0010DJ\u0017\u0010H\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\bH\u0010\u0013J\u0017\u0010J\u001a\u00020\n2\u0006\u0010I\u001a\u00020\u0016H\u0016¢\u0006\u0004\bJ\u0010KJ'\u0010I\u001a\u00020\n2\u0006\u0010I\u001a\u00020\u00162\u0006\u0010L\u001a\u00020\n2\u0006\u0010M\u001a\u00020\nH\u0016¢\u0006\u0004\bI\u0010NJ\u0017\u0010P\u001a\u00020\n2\u0006\u0010O\u001a\u00020\u0019H\u0016¢\u0006\u0004\bP\u0010QJ\u001f\u0010R\u001a\u00020\n2\u0006\u0010O\u001a\u00020\u00192\u0006\u0010L\u001a\u00020\nH\u0016¢\u0006\u0004\bR\u0010SJ'\u0010T\u001a\u00020\n2\u0006\u0010O\u001a\u00020\u00192\u0006\u0010L\u001a\u00020\n2\u0006\u0010M\u001a\u00020\nH\u0016¢\u0006\u0004\bT\u0010UJ\u0017\u0010W\u001a\u00020\n2\u0006\u0010V\u001a\u00020\u0019H\u0016¢\u0006\u0004\bW\u0010QJ\u001f\u0010X\u001a\u00020\n2\u0006\u0010V\u001a\u00020\u00192\u0006\u0010L\u001a\u00020\nH\u0016¢\u0006\u0004\bX\u0010SJ\u001f\u0010Z\u001a\u00020\u000e2\u0006\u0010Y\u001a\u00020\n2\u0006\u0010O\u001a\u00020\u0019H\u0016¢\u0006\u0004\bZ\u0010[J/\u0010]\u001a\u00020\u000e2\u0006\u0010Y\u001a\u00020\n2\u0006\u0010O\u001a\u00020\u00192\u0006\u0010\\\u001a\u00020 2\u0006\u0010\u000b\u001a\u00020 H\u0016¢\u0006\u0004\b]\u0010^J\u000f\u0010_\u001a\u00020\u0001H\u0016¢\u0006\u0004\b_\u0010`J\u000f\u0010b\u001a\u00020aH\u0016¢\u0006\u0004\bb\u0010cJ\u000f\u0010d\u001a\u00020\u000eH\u0016¢\u0006\u0004\bd\u0010\u0010J\u000f\u0010e\u001a\u00020\u0011H\u0016¢\u0006\u0004\be\u0010fJ\u000f\u0010h\u001a\u00020gH\u0016¢\u0006\u0004\bh\u0010iJ\u000f\u0010j\u001a\u00020/H\u0016¢\u0006\u0004\bj\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bJ\u0010kR\u0014\u0010m\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bI\u0010lR\u0016\u0010o\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bR\u0010nR\u001b\u0010r\u001a\u00020\u00068Ö\u0002X\u0096\u0004¢\u0006\f\u0012\u0004\bq\u0010f\u001a\u0004\bp\u0010\b¨\u0006s"}, m31665d2 = {"Lxu/l0;", "Lxu/g;", "Lxu/r0;", Payload.SOURCE, "<init>", "(Lxu/r0;)V", "Lxu/e;", "O", "()Lxu/e;", "sink", "", "byteCount", "read", "(Lxu/e;J)J", "", "Z1", "()Z", "", "w1", "(J)V", "request", "(J)Z", "", "readByte", "()B", "Lxu/h;", "F2", "()Lxu/h;", "K1", "(J)Lxu/h;", "Lxu/f0;", "options", "", "l3", "(Lxu/f0;)I", "", "X1", "()[B", "readFully", "([B)V", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)I", "F1", "(Lxu/e;J)V", "Lxu/p0;", "K2", "(Lxu/p0;)J", "", "R2", "()Ljava/lang/String;", "G1", "(J)Ljava/lang/String;", "Ljava/nio/charset/Charset;", "charset", "z2", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "b1", "limit", "n0", "A2", "()I", "", "readShort", "()S", "k1", "readInt", "M2", "readLong", "()J", "n1", "i2", "o3", "skip", "b", "a", "(B)J", "fromIndex", "toIndex", "(BJJ)J", "bytes", "V", "(Lxu/h;)J", "c", "(Lxu/h;J)J", "s1", "(Lxu/h;JJ)J", "targetBytes", "h0", "d", "offset", "o0", "(JLxu/h;)Z", "bytesOffset", "e", "(JLxu/h;II)Z", "peek", "()Lxu/g;", "Ljava/io/InputStream;", "s3", "()Ljava/io/InputStream;", "isOpen", "close", "()V", "Lxu/s0;", "timeout", "()Lxu/s0;", "toString", "Lxu/r0;", "Lxu/e;", "bufferField", "Z", "closed", "k", "getBuffer$annotations", "buffer", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class buffer implements InterfaceC12928g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC12951r0 source;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C12924e bufferField;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean closed;

    public buffer(@NotNull InterfaceC12951r0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
        this.bufferField = new C12924e();
    }

    @Override // p560xu.InterfaceC12928g
    /* JADX INFO: renamed from: A2 */
    public int mo47991A2() throws EOFException {
        mo48054w1(1L);
        byte bM48033j = this.bufferField.m48033j(0L);
        if ((bM48033j & 224) == 192) {
            mo48054w1(2L);
        } else if ((bM48033j & 240) == 224) {
            mo48054w1(3L);
        } else if ((bM48033j & 248) == 240) {
            mo48054w1(4L);
        }
        return this.bufferField.mo47991A2();
    }

    @Override // p560xu.InterfaceC12928g
    /* JADX INFO: renamed from: F1 */
    public void mo47996F1(@NotNull C12924e sink, long byteCount) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            mo48054w1(byteCount);
            this.bufferField.mo47996F1(sink, byteCount);
        } catch (EOFException e10) {
            sink.mo48028g2(this.bufferField);
            throw e10;
        }
    }

    @Override // p560xu.InterfaceC12928g
    @NotNull
    /* JADX INFO: renamed from: F2 */
    public C12930h mo47997F2() {
        this.bufferField.mo48028g2(this.source);
        return this.bufferField.mo47997F2();
    }

    @Override // p560xu.InterfaceC12928g
    @NotNull
    /* JADX INFO: renamed from: G1 */
    public String mo47998G1(long byteCount) throws EOFException {
        mo48054w1(byteCount);
        return this.bufferField.mo47998G1(byteCount);
    }

    @Override // p560xu.InterfaceC12928g
    @NotNull
    /* JADX INFO: renamed from: K1 */
    public C12930h mo48002K1(long byteCount) throws EOFException {
        mo48054w1(byteCount);
        return this.bufferField.mo48002K1(byteCount);
    }

    @Override // p560xu.InterfaceC12928g
    /* JADX INFO: renamed from: K2 */
    public long mo48003K2(@NotNull InterfaceC12947p0 sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j10 = 0;
        while (this.source.read(this.bufferField, 8192L) != -1) {
            long jM48022c = this.bufferField.m48022c();
            if (jM48022c > 0) {
                j10 += jM48022c;
                sink.write(this.bufferField, jM48022c);
            }
        }
        if (this.bufferField.getSize() <= 0) {
            return j10;
        }
        long size = j10 + this.bufferField.getSize();
        C12924e c12924e = this.bufferField;
        sink.write(c12924e, c12924e.getSize());
        return size;
    }

    @Override // p560xu.InterfaceC12928g
    /* JADX INFO: renamed from: M2 */
    public int mo48005M2() throws EOFException {
        mo48054w1(4L);
        return this.bufferField.mo48005M2();
    }

    @Override // p560xu.InterfaceC12928g
    @NotNull
    /* JADX INFO: renamed from: O, reason: from getter */
    public C12924e getBufferField() {
        return this.bufferField;
    }

    @Override // p560xu.InterfaceC12928g
    @NotNull
    /* JADX INFO: renamed from: R2 */
    public String mo48008R2() {
        this.bufferField.mo48028g2(this.source);
        return this.bufferField.mo48008R2();
    }

    @Override // p560xu.InterfaceC12928g
    /* JADX INFO: renamed from: V */
    public long mo48011V(@NotNull C12930h bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return m48167c(bytes, 0L);
    }

    @Override // p560xu.InterfaceC12928g
    @NotNull
    /* JADX INFO: renamed from: X1 */
    public byte[] mo48013X1() {
        this.bufferField.mo48028g2(this.source);
        return this.bufferField.mo48013X1();
    }

    @Override // p560xu.InterfaceC12928g
    /* JADX INFO: renamed from: Z1 */
    public boolean mo48016Z1() {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        return this.bufferField.mo48016Z1() && this.source.read(this.bufferField, 8192L) == -1;
    }

    /* JADX INFO: renamed from: a */
    public long m48165a(byte b) {
        return m48166b(b, 0L, Long.MAX_VALUE);
    }

    /* JADX INFO: renamed from: b */
    public long m48166b(byte b, long fromIndex, long toIndex) {
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
            long jM48040n = this.bufferField.m48040n(b10, jMax, j10);
            if (jM48040n != -1) {
                return jM48040n;
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

    @Override // p560xu.InterfaceC12928g
    @NotNull
    /* JADX INFO: renamed from: b1 */
    public String mo48021b1() {
        return mo48041n0(Long.MAX_VALUE);
    }

    /* JADX INFO: renamed from: c */
    public long m48167c(@NotNull C12930h bytes, long fromIndex) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return mo48050s1(bytes, fromIndex, Long.MAX_VALUE);
    }

    @Override // p560xu.InterfaceC12951r0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.source.close();
        this.bufferField.m48017a();
    }

    /* JADX INFO: renamed from: d */
    public long m48168d(@NotNull C12930h targetBytes, long fromIndex) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jM48046q = this.bufferField.m48046q(targetBytes, fromIndex);
            if (jM48046q != -1) {
                return jM48046q;
            }
            long size = this.bufferField.getSize();
            if (this.source.read(this.bufferField, 8192L) == -1) {
                return -1L;
            }
            fromIndex = Math.max(fromIndex, size);
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m48169e(long offset, @NotNull C12930h bytes, int bytesOffset, int byteCount) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        return byteCount >= 0 && offset >= 0 && bytesOffset >= 0 && bytesOffset + byteCount <= bytes.m48089I() && (byteCount == 0 || C13457f.m49096a(this, bytes, bytesOffset, byteCount, offset, offset + 1) != -1);
    }

    @Override // p560xu.InterfaceC12928g
    /* JADX INFO: renamed from: h0 */
    public long mo48030h0(@NotNull C12930h targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        return m48168d(targetBytes, 0L);
    }

    @Override // p560xu.InterfaceC12928g
    /* JADX INFO: renamed from: i2 */
    public long mo48032i2() throws EOFException {
        mo48054w1(1L);
        long j10 = 0;
        while (true) {
            long j11 = j10 + 1;
            if (!request(j11)) {
                break;
            }
            byte bM48033j = this.bufferField.m48033j(j10);
            if ((bM48033j < 48 || bM48033j > 57) && !(j10 == 0 && bM48033j == 45)) {
                if (j10 != 0) {
                    break;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Expected a digit or '-' but was 0x");
                String string = Integer.toString(bM48033j, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                sb2.append(string);
                throw new NumberFormatException(sb2.toString());
            }
            j10 = j11;
        }
        return this.bufferField.mo48032i2();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.closed;
    }

    @Override // p560xu.InterfaceC12928g, p560xu.InterfaceC12926f
    @NotNull
    /* JADX INFO: renamed from: k */
    public C12924e getBufferField() {
        return this.bufferField;
    }

    @Override // p560xu.InterfaceC12928g
    /* JADX INFO: renamed from: k1 */
    public short mo48037k1() throws EOFException {
        mo48054w1(2L);
        return this.bufferField.mo48037k1();
    }

    @Override // p560xu.InterfaceC12928g
    /* JADX INFO: renamed from: l3 */
    public int mo48039l3(@NotNull C12927f0 options) throws EOFException {
        Intrinsics.checkNotNullParameter(options, "options");
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        do {
            int iM49059i = C13452a.m49059i(this.bufferField, options, true);
            if (iM49059i != -2) {
                if (iM49059i == -1) {
                    return -1;
                }
                this.bufferField.skip(options.getByteStrings()[iM49059i].m48089I());
                return iM49059i;
            }
        } while (this.source.read(this.bufferField, 8192L) != -1);
        return -1;
    }

    @Override // p560xu.InterfaceC12928g
    @NotNull
    /* JADX INFO: renamed from: n0 */
    public String mo48041n0(long limit) throws EOFException {
        if (limit < 0) {
            throw new IllegalArgumentException(("limit < 0: " + limit).toString());
        }
        long j10 = limit == Long.MAX_VALUE ? Long.MAX_VALUE : limit + 1;
        long jM48166b = m48166b((byte) 10, 0L, j10);
        if (jM48166b != -1) {
            return C13452a.m49058h(this.bufferField, jM48166b);
        }
        if (j10 < Long.MAX_VALUE && request(j10) && this.bufferField.m48033j(j10 - 1) == 13 && request(j10 + 1) && this.bufferField.m48033j(j10) == 10) {
            return C13452a.m49058h(this.bufferField, j10);
        }
        C12924e c12924e = new C12924e();
        C12924e c12924e2 = this.bufferField;
        c12924e2.m48026f(c12924e, 0L, Math.min(32, c12924e2.getSize()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.bufferField.getSize(), limit) + " content=" + c12924e.mo47997F2().mo48106r() + (char) 8230);
    }

    @Override // p560xu.InterfaceC12928g
    /* JADX INFO: renamed from: n1 */
    public long mo48042n1() throws EOFException {
        mo48054w1(8L);
        return this.bufferField.mo48042n1();
    }

    @Override // p560xu.InterfaceC12928g
    /* JADX INFO: renamed from: o0 */
    public boolean mo48044o0(long offset, @NotNull C12930h bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return m48169e(offset, bytes, 0, bytes.m48089I());
    }

    @Override // p560xu.InterfaceC12928g
    /* JADX INFO: renamed from: o3 */
    public long mo48045o3() throws EOFException {
        mo48054w1(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!request(i11)) {
                break;
            }
            byte bM48033j = this.bufferField.m48033j(i10);
            if ((bM48033j < 48 || bM48033j > 57) && ((bM48033j < 97 || bM48033j > 102) && (bM48033j < 65 || bM48033j > 70))) {
                if (i10 != 0) {
                    break;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Expected leading [0-9a-fA-F] character but was 0x");
                String string = Integer.toString(bM48033j, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                sb2.append(string);
                throw new NumberFormatException(sb2.toString());
            }
            i10 = i11;
        }
        return this.bufferField.mo48045o3();
    }

    @Override // p560xu.InterfaceC12928g
    @NotNull
    public InterfaceC12928g peek() {
        return C12919b0.m47961c(new C12933i0(this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p560xu.InterfaceC12951r0
    public long read(@NotNull C12924e sink, long byteCount) {
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

    @Override // p560xu.InterfaceC12928g
    public byte readByte() throws EOFException {
        mo48054w1(1L);
        return this.bufferField.readByte();
    }

    @Override // p560xu.InterfaceC12928g
    public void readFully(@NotNull byte[] sink) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            mo48054w1(sink.length);
            this.bufferField.readFully(sink);
        } catch (EOFException e10) {
            int i10 = 0;
            while (this.bufferField.getSize() > 0) {
                C12924e c12924e = this.bufferField;
                int i11 = c12924e.read(sink, i10, (int) c12924e.getSize());
                if (i11 == -1) {
                    throw new AssertionError();
                }
                i10 += i11;
            }
            throw e10;
        }
    }

    @Override // p560xu.InterfaceC12928g
    public int readInt() throws EOFException {
        mo48054w1(4L);
        return this.bufferField.readInt();
    }

    @Override // p560xu.InterfaceC12928g
    public long readLong() throws EOFException {
        mo48054w1(8L);
        return this.bufferField.readLong();
    }

    @Override // p560xu.InterfaceC12928g
    public short readShort() throws EOFException {
        mo48054w1(2L);
        return this.bufferField.readShort();
    }

    @Override // p560xu.InterfaceC12928g
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

    /* JADX DEBUG: Class process forced to load method for inline: yu.f.b(xu.l0, xu.h, int, int, long, long, int, java.lang.Object):long */
    @Override // p560xu.InterfaceC12928g
    /* JADX INFO: renamed from: s1 */
    public long mo48050s1(@NotNull C12930h bytes, long fromIndex, long toIndex) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return C13457f.m49097b(this, bytes, 0, 0, fromIndex, toIndex, 6, null);
    }

    @Override // p560xu.InterfaceC12928g
    @NotNull
    /* JADX INFO: renamed from: s3 */
    public InputStream mo48051s3() {
        return new a();
    }

    @Override // p560xu.InterfaceC12928g
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

    @Override // p560xu.InterfaceC12951r0
    @NotNull
    /* JADX INFO: renamed from: timeout */
    public C12953s0 getTimeout() {
        return this.source.getTimeout();
    }

    @NotNull
    public String toString() {
        return "buffer(" + this.source + ')';
    }

    @Override // p560xu.InterfaceC12928g
    /* JADX INFO: renamed from: w1 */
    public void mo48054w1(long byteCount) throws EOFException {
        if (!request(byteCount)) {
            throw new EOFException();
        }
    }

    @Override // p560xu.InterfaceC12928g
    @NotNull
    /* JADX INFO: renamed from: z2 */
    public String mo48059z2(@NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        this.bufferField.mo48028g2(this.source);
        return this.bufferField.mo48059z2(charset);
    }

    /* JADX INFO: renamed from: xu.l0$a */
    @Metadata(m31664d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m31665d2 = {"xu/l0$a", "Ljava/io/InputStream;", "", "read", "()I", "", "data", "offset", "byteCount", "([BII)I", "available", "", "close", "()V", "", "toString", "()Ljava/lang/String;", "Ljava/io/OutputStream;", "out", "", "transferTo", "(Ljava/io/OutputStream;)J", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
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

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
                C12924e.m47988F0(buffer.this.bufferField, out, 0L, 2, null);
            }
        }

        @Override // java.io.InputStream
        public int read(byte[] data, int offset, int byteCount) throws IOException {
            Intrinsics.checkNotNullParameter(data, "data");
            if (!buffer.this.closed) {
                C12918b.m47948b(data.length, offset, byteCount);
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
