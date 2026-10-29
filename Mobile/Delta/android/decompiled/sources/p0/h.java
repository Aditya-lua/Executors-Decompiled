package p0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f28069e = StandardCharsets.US_ASCII;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f28070f = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f28071g = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f28072h = {65, 83, 67, 73, 73, 0, 0, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28073a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f28074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f28075d;

    public h(int i10, int i11, byte[] bArr) {
        this(i10, i11, -1L, bArr);
    }

    public static h a(String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new h(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }
        byte[] bytes = str.getBytes(f28069e);
        return new h(1, bytes.length, bytes);
    }

    public static h b(double[] dArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f28071g[12] * dArr.length]);
        byteBufferWrap.order(byteOrder);
        for (double d10 : dArr) {
            byteBufferWrap.putDouble(d10);
        }
        return new h(12, dArr.length, byteBufferWrap.array());
    }

    public static h c(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f28071g[9] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i10 : iArr) {
            byteBufferWrap.putInt(i10);
        }
        return new h(9, iArr.length, byteBufferWrap.array());
    }

    public static h d(n[] nVarArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f28071g[10] * nVarArr.length]);
        byteBufferWrap.order(byteOrder);
        for (n nVar : nVarArr) {
            byteBufferWrap.putInt((int) nVar.b());
            byteBufferWrap.putInt((int) nVar.a());
        }
        return new h(10, nVarArr.length, byteBufferWrap.array());
    }

    public static h e(String str) {
        byte[] bytes = (str + (char) 0).getBytes(f28069e);
        return new h(2, bytes.length, bytes);
    }

    public static h f(long j10, ByteOrder byteOrder) {
        return g(new long[]{j10}, byteOrder);
    }

    public static h g(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f28071g[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j10 : jArr) {
            byteBufferWrap.putInt((int) j10);
        }
        return new h(4, jArr.length, byteBufferWrap.array());
    }

    public static h h(n[] nVarArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f28071g[5] * nVarArr.length]);
        byteBufferWrap.order(byteOrder);
        for (n nVar : nVarArr) {
            byteBufferWrap.putInt((int) nVar.b());
            byteBufferWrap.putInt((int) nVar.a());
        }
        return new h(5, nVarArr.length, byteBufferWrap.array());
    }

    public static h i(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f28071g[3] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i10 : iArr) {
            byteBufferWrap.putShort((short) i10);
        }
        return new h(3, iArr.length, byteBufferWrap.array());
    }

    public int j() {
        return f28071g[this.f28073a] * this.b;
    }

    public String toString() {
        return "(" + f28070f[this.f28073a] + ", data length:" + this.f28075d.length + ")";
    }

    public h(int i10, int i11, long j10, byte[] bArr) {
        this.f28073a = i10;
        this.b = i11;
        this.f28074c = j10;
        this.f28075d = bArr;
    }
}
