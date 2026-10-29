package p347p0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: p0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C10092h {

    /* JADX INFO: renamed from: e */
    public static final Charset f36336e = StandardCharsets.US_ASCII;

    /* JADX INFO: renamed from: f */
    public static final String[] f36337f = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* JADX INFO: renamed from: g */
    public static final int[] f36338g = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* JADX INFO: renamed from: h */
    public static final byte[] f36339h = {65, 83, 67, 73, 73, 0, 0, 0};

    /* JADX INFO: renamed from: a */
    public final int f36340a;

    /* JADX INFO: renamed from: b */
    public final int f36341b;

    /* JADX INFO: renamed from: c */
    public final long f36342c;

    /* JADX INFO: renamed from: d */
    public final byte[] f36343d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C10092h(int i10, int i11, byte[] bArr) {
        this(i10, i11, -1L, bArr);
    }

    /* JADX INFO: renamed from: a */
    public static C10092h m38951a(String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new C10092h(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }
        byte[] bytes = str.getBytes(f36336e);
        return new C10092h(1, bytes.length, bytes);
    }

    /* JADX INFO: renamed from: b */
    public static C10092h m38952b(double[] dArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f36338g[12] * dArr.length]);
        byteBufferWrap.order(byteOrder);
        for (double d10 : dArr) {
            byteBufferWrap.putDouble(d10);
        }
        return new C10092h(12, dArr.length, byteBufferWrap.array());
    }

    /* JADX INFO: renamed from: c */
    public static C10092h m38953c(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f36338g[9] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i10 : iArr) {
            byteBufferWrap.putInt(i10);
        }
        return new C10092h(9, iArr.length, byteBufferWrap.array());
    }

    /* JADX INFO: renamed from: d */
    public static C10092h m38954d(C10098n[] c10098nArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f36338g[10] * c10098nArr.length]);
        byteBufferWrap.order(byteOrder);
        for (C10098n c10098n : c10098nArr) {
            byteBufferWrap.putInt((int) c10098n.m38989b());
            byteBufferWrap.putInt((int) c10098n.m38988a());
        }
        return new C10092h(10, c10098nArr.length, byteBufferWrap.array());
    }

    /* JADX INFO: renamed from: e */
    public static C10092h m38955e(String str) {
        byte[] bytes = (str + (char) 0).getBytes(f36336e);
        return new C10092h(2, bytes.length, bytes);
    }

    /* JADX INFO: renamed from: f */
    public static C10092h m38956f(long j10, ByteOrder byteOrder) {
        return m38957g(new long[]{j10}, byteOrder);
    }

    /* JADX INFO: renamed from: g */
    public static C10092h m38957g(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f36338g[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j10 : jArr) {
            byteBufferWrap.putInt((int) j10);
        }
        return new C10092h(4, jArr.length, byteBufferWrap.array());
    }

    /* JADX INFO: renamed from: h */
    public static C10092h m38958h(C10098n[] c10098nArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f36338g[5] * c10098nArr.length]);
        byteBufferWrap.order(byteOrder);
        for (C10098n c10098n : c10098nArr) {
            byteBufferWrap.putInt((int) c10098n.m38989b());
            byteBufferWrap.putInt((int) c10098n.m38988a());
        }
        return new C10092h(5, c10098nArr.length, byteBufferWrap.array());
    }

    /* JADX INFO: renamed from: i */
    public static C10092h m38959i(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f36338g[3] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i10 : iArr) {
            byteBufferWrap.putShort((short) i10);
        }
        return new C10092h(3, iArr.length, byteBufferWrap.array());
    }

    /* JADX INFO: renamed from: j */
    public int m38960j() {
        return f36338g[this.f36340a] * this.f36341b;
    }

    public String toString() {
        return "(" + f36337f[this.f36340a] + ", data length:" + this.f36343d.length + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C10092h(int i10, int i11, long j10, byte[] bArr) {
        this.f36340a = i10;
        this.f36341b = i11;
        this.f36342c = j10;
        this.f36343d = bArr;
    }
}
