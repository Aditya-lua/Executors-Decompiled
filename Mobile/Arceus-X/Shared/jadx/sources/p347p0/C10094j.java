package p347p0;

import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.Map;
import p533x2.C12637g;

/* JADX INFO: renamed from: p0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C10094j extends FilterOutputStream {

    /* JADX INFO: renamed from: g */
    public static final byte[] f36370g = "Exif\u0000\u0000".getBytes(C10092h.f36336e);

    /* JADX INFO: renamed from: a */
    public final C10093i f36371a;

    /* JADX INFO: renamed from: b */
    public final byte[] f36372b;

    /* JADX INFO: renamed from: c */
    public final ByteBuffer f36373c;

    /* JADX INFO: renamed from: d */
    public int f36374d;

    /* JADX INFO: renamed from: e */
    public int f36375e;

    /* JADX INFO: renamed from: f */
    public int f36376f;

    /* JADX INFO: renamed from: p0.j$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static boolean m38986a(short s8) {
            return (s8 < -64 || s8 > -49 || s8 == -60 || s8 == -56 || s8 == -52) ? false : true;
        }
    }

    public C10094j(OutputStream outputStream, C10093i c10093i) {
        super(new BufferedOutputStream(outputStream, 65536));
        this.f36372b = new byte[1];
        this.f36373c = ByteBuffer.allocate(4);
        this.f36374d = 0;
        this.f36371a = c10093i;
    }

    /* JADX INFO: renamed from: a */
    public final int m38984a(int i10, byte[] bArr, int i11, int i12) {
        int iMin = Math.min(i12, i10 - this.f36373c.position());
        this.f36373c.put(bArr, i11, iMin);
        return iMin;
    }

    /* JADX INFO: renamed from: b */
    public final void m38985b(C10086b c10086b) throws IOException {
        C10095k[][] c10095kArr = C10093i.f36350i;
        int[] iArr = new int[c10095kArr.length];
        int[] iArr2 = new int[c10095kArr.length];
        for (C10095k c10095k : C10093i.f36348g) {
            for (int i10 = 0; i10 < C10093i.f36350i.length; i10++) {
                this.f36371a.m38964d(i10).remove(c10095k.f36378b);
            }
        }
        if (!this.f36371a.m38964d(1).isEmpty()) {
            this.f36371a.m38964d(0).put(C10093i.f36348g[1].f36378b, C10092h.m38956f(0L, this.f36371a.m38965e()));
        }
        if (!this.f36371a.m38964d(2).isEmpty()) {
            this.f36371a.m38964d(0).put(C10093i.f36348g[2].f36378b, C10092h.m38956f(0L, this.f36371a.m38965e()));
        }
        if (!this.f36371a.m38964d(3).isEmpty()) {
            this.f36371a.m38964d(1).put(C10093i.f36348g[3].f36378b, C10092h.m38956f(0L, this.f36371a.m38965e()));
        }
        for (int i11 = 0; i11 < C10093i.f36350i.length; i11++) {
            Iterator<Map.Entry<String, C10092h>> it = this.f36371a.m38964d(i11).entrySet().iterator();
            int i12 = 0;
            while (it.hasNext()) {
                int iM38960j = it.next().getValue().m38960j();
                if (iM38960j > 4) {
                    i12 += iM38960j;
                }
            }
            iArr2[i11] = iArr2[i11] + i12;
        }
        int size = 8;
        for (int i13 = 0; i13 < C10093i.f36350i.length; i13++) {
            if (!this.f36371a.m38964d(i13).isEmpty()) {
                iArr[i13] = size;
                size += (this.f36371a.m38964d(i13).size() * 12) + 6 + iArr2[i13];
            }
        }
        int i14 = size + 8;
        if (!this.f36371a.m38964d(1).isEmpty()) {
            this.f36371a.m38964d(0).put(C10093i.f36348g[1].f36378b, C10092h.m38956f(iArr[1], this.f36371a.m38965e()));
        }
        if (!this.f36371a.m38964d(2).isEmpty()) {
            this.f36371a.m38964d(0).put(C10093i.f36348g[2].f36378b, C10092h.m38956f(iArr[2], this.f36371a.m38965e()));
        }
        if (!this.f36371a.m38964d(3).isEmpty()) {
            this.f36371a.m38964d(1).put(C10093i.f36348g[3].f36378b, C10092h.m38956f(iArr[3], this.f36371a.m38965e()));
        }
        c10086b.m38901f(i14);
        c10086b.write(f36370g);
        c10086b.m38899d(this.f36371a.m38965e() == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        c10086b.m38896a(this.f36371a.m38965e());
        c10086b.m38901f(42);
        c10086b.m38900e(8L);
        for (int i15 = 0; i15 < C10093i.f36350i.length; i15++) {
            if (!this.f36371a.m38964d(i15).isEmpty()) {
                c10086b.m38901f(this.f36371a.m38964d(i15).size());
                int size2 = iArr[i15] + 2 + (this.f36371a.m38964d(i15).size() * 12) + 4;
                for (Map.Entry<String, C10092h> entry : this.f36371a.m38964d(i15).entrySet()) {
                    int i16 = ((C10095k) C12637g.m47076h(C10093i.b.f36359f.get(i15).get(entry.getKey()), "Tag not supported: " + entry.getKey() + ". Tag needs to be ported from ExifInterface to ExifData.")).f36377a;
                    C10092h value = entry.getValue();
                    int iM38960j2 = value.m38960j();
                    c10086b.m38901f(i16);
                    c10086b.m38901f(value.f36340a);
                    c10086b.m38898c(value.f36341b);
                    if (iM38960j2 > 4) {
                        c10086b.m38900e(size2);
                        size2 += iM38960j2;
                    } else {
                        c10086b.write(value.f36343d);
                        if (iM38960j2 < 4) {
                            while (iM38960j2 < 4) {
                                c10086b.m38897b(0);
                                iM38960j2++;
                            }
                        }
                    }
                }
                c10086b.m38900e(0L);
                Iterator<Map.Entry<String, C10092h>> it2 = this.f36371a.m38964d(i15).entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = it2.next().getValue().f36343d;
                    if (bArr.length > 4) {
                        c10086b.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        c10086b.m38896a(ByteOrder.BIG_ENDIAN);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        while (true) {
            int i12 = this.f36375e;
            if ((i12 <= 0 && this.f36376f <= 0 && this.f36374d == 2) || i11 <= 0) {
                break;
            }
            if (i12 > 0) {
                int iMin = Math.min(i11, i12);
                i11 -= iMin;
                this.f36375e -= iMin;
                i10 += iMin;
            }
            int i13 = this.f36376f;
            if (i13 > 0) {
                int iMin2 = Math.min(i11, i13);
                ((FilterOutputStream) this).out.write(bArr, i10, iMin2);
                i11 -= iMin2;
                this.f36376f -= iMin2;
                i10 += iMin2;
            }
            if (i11 == 0) {
                return;
            }
            int i14 = this.f36374d;
            if (i14 == 0) {
                int iM38984a = m38984a(2, bArr, i10, i11);
                i10 += iM38984a;
                i11 -= iM38984a;
                if (this.f36373c.position() < 2) {
                    return;
                }
                this.f36373c.rewind();
                if (this.f36373c.getShort() != -40) {
                    throw new IOException("Not a valid jpeg image, cannot write exif");
                }
                ((FilterOutputStream) this).out.write(this.f36373c.array(), 0, 2);
                this.f36374d = 1;
                this.f36373c.rewind();
                C10086b c10086b = new C10086b(((FilterOutputStream) this).out, ByteOrder.BIG_ENDIAN);
                c10086b.m38899d((short) -31);
                m38985b(c10086b);
            } else if (i14 != 1) {
                continue;
            } else {
                int iM38984a2 = m38984a(4, bArr, i10, i11);
                i10 += iM38984a2;
                i11 -= iM38984a2;
                if (this.f36373c.position() == 2 && this.f36373c.getShort() == -39) {
                    ((FilterOutputStream) this).out.write(this.f36373c.array(), 0, 2);
                    this.f36373c.rewind();
                }
                if (this.f36373c.position() < 4) {
                    return;
                }
                this.f36373c.rewind();
                short s8 = this.f36373c.getShort();
                if (s8 == -31) {
                    this.f36375e = (this.f36373c.getShort() & 65535) - 2;
                    this.f36374d = 2;
                } else if (a.m38986a(s8)) {
                    ((FilterOutputStream) this).out.write(this.f36373c.array(), 0, 4);
                    this.f36374d = 2;
                } else {
                    ((FilterOutputStream) this).out.write(this.f36373c.array(), 0, 4);
                    this.f36376f = (this.f36373c.getShort() & 65535) - 2;
                }
                this.f36373c.rewind();
            }
        }
        if (i11 > 0) {
            ((FilterOutputStream) this).out.write(bArr, i10, i11);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) throws IOException {
        byte[] bArr = this.f36372b;
        bArr[0] = (byte) (i10 & 255);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
