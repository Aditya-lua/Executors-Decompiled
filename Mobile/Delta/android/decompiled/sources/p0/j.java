package p0;

import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class j extends FilterOutputStream {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f28097g = "Exif\u0000\u0000".getBytes(h.f28069e);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f28098a;
    public final byte[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ByteBuffer f28099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f28101e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f28102f;

    public static final class a {
        public static boolean a(short s8) {
            return (s8 < -64 || s8 > -49 || s8 == -60 || s8 == -56 || s8 == -52) ? false : true;
        }
    }

    public j(OutputStream outputStream, i iVar) {
        super(new BufferedOutputStream(outputStream, 65536));
        this.b = new byte[1];
        this.f28099c = ByteBuffer.allocate(4);
        this.f28100d = 0;
        this.f28098a = iVar;
    }

    public final int a(int i10, byte[] bArr, int i11, int i12) {
        int iMin = Math.min(i12, i10 - this.f28099c.position());
        this.f28099c.put(bArr, i11, iMin);
        return iMin;
    }

    public final void b(b bVar) throws IOException {
        k[][] kVarArr = i.f28082i;
        int[] iArr = new int[kVarArr.length];
        int[] iArr2 = new int[kVarArr.length];
        for (k kVar : i.f28080g) {
            for (int i10 = 0; i10 < i.f28082i.length; i10++) {
                this.f28098a.d(i10).remove(kVar.b);
            }
        }
        if (!this.f28098a.d(1).isEmpty()) {
            this.f28098a.d(0).put(i.f28080g[1].b, h.f(0L, this.f28098a.e()));
        }
        if (!this.f28098a.d(2).isEmpty()) {
            this.f28098a.d(0).put(i.f28080g[2].b, h.f(0L, this.f28098a.e()));
        }
        if (!this.f28098a.d(3).isEmpty()) {
            this.f28098a.d(1).put(i.f28080g[3].b, h.f(0L, this.f28098a.e()));
        }
        for (int i11 = 0; i11 < i.f28082i.length; i11++) {
            Iterator<Map.Entry<String, h>> it = this.f28098a.d(i11).entrySet().iterator();
            int i12 = 0;
            while (it.hasNext()) {
                int iJ = it.next().getValue().j();
                if (iJ > 4) {
                    i12 += iJ;
                }
            }
            iArr2[i11] = iArr2[i11] + i12;
        }
        int size = 8;
        for (int i13 = 0; i13 < i.f28082i.length; i13++) {
            if (!this.f28098a.d(i13).isEmpty()) {
                iArr[i13] = size;
                size += (this.f28098a.d(i13).size() * 12) + 6 + iArr2[i13];
            }
        }
        int i14 = size + 8;
        if (!this.f28098a.d(1).isEmpty()) {
            this.f28098a.d(0).put(i.f28080g[1].b, h.f(iArr[1], this.f28098a.e()));
        }
        if (!this.f28098a.d(2).isEmpty()) {
            this.f28098a.d(0).put(i.f28080g[2].b, h.f(iArr[2], this.f28098a.e()));
        }
        if (!this.f28098a.d(3).isEmpty()) {
            this.f28098a.d(1).put(i.f28080g[3].b, h.f(iArr[3], this.f28098a.e()));
        }
        bVar.f(i14);
        bVar.write(f28097g);
        bVar.d(this.f28098a.e() == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        bVar.a(this.f28098a.e());
        bVar.f(42);
        bVar.e(8L);
        for (int i15 = 0; i15 < i.f28082i.length; i15++) {
            if (!this.f28098a.d(i15).isEmpty()) {
                bVar.f(this.f28098a.d(i15).size());
                int size2 = iArr[i15] + 2 + (this.f28098a.d(i15).size() * 12) + 4;
                for (Map.Entry<String, h> entry : this.f28098a.d(i15).entrySet()) {
                    int i16 = ((k) x2.g.h(i.b.f28090f.get(i15).get(entry.getKey()), "Tag not supported: " + entry.getKey() + ". Tag needs to be ported from ExifInterface to ExifData.")).f28103a;
                    h value = entry.getValue();
                    int iJ2 = value.j();
                    bVar.f(i16);
                    bVar.f(value.f28073a);
                    bVar.c(value.b);
                    if (iJ2 > 4) {
                        bVar.e(size2);
                        size2 += iJ2;
                    } else {
                        bVar.write(value.f28075d);
                        if (iJ2 < 4) {
                            while (iJ2 < 4) {
                                bVar.b(0);
                                iJ2++;
                            }
                        }
                    }
                }
                bVar.e(0L);
                Iterator<Map.Entry<String, h>> it2 = this.f28098a.d(i15).entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = it2.next().getValue().f28075d;
                    if (bArr.length > 4) {
                        bVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        bVar.a(ByteOrder.BIG_ENDIAN);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        while (true) {
            int i12 = this.f28101e;
            if ((i12 <= 0 && this.f28102f <= 0 && this.f28100d == 2) || i11 <= 0) {
                break;
            }
            if (i12 > 0) {
                int iMin = Math.min(i11, i12);
                i11 -= iMin;
                this.f28101e -= iMin;
                i10 += iMin;
            }
            int i13 = this.f28102f;
            if (i13 > 0) {
                int iMin2 = Math.min(i11, i13);
                ((FilterOutputStream) this).out.write(bArr, i10, iMin2);
                i11 -= iMin2;
                this.f28102f -= iMin2;
                i10 += iMin2;
            }
            if (i11 == 0) {
                return;
            }
            int i14 = this.f28100d;
            if (i14 == 0) {
                int iA = a(2, bArr, i10, i11);
                i10 += iA;
                i11 -= iA;
                if (this.f28099c.position() < 2) {
                    return;
                }
                this.f28099c.rewind();
                if (this.f28099c.getShort() != -40) {
                    throw new IOException("Not a valid jpeg image, cannot write exif");
                }
                ((FilterOutputStream) this).out.write(this.f28099c.array(), 0, 2);
                this.f28100d = 1;
                this.f28099c.rewind();
                b bVar = new b(((FilterOutputStream) this).out, ByteOrder.BIG_ENDIAN);
                bVar.d((short) -31);
                b(bVar);
            } else if (i14 != 1) {
                continue;
            } else {
                int iA2 = a(4, bArr, i10, i11);
                i10 += iA2;
                i11 -= iA2;
                if (this.f28099c.position() == 2 && this.f28099c.getShort() == -39) {
                    ((FilterOutputStream) this).out.write(this.f28099c.array(), 0, 2);
                    this.f28099c.rewind();
                }
                if (this.f28099c.position() < 4) {
                    return;
                }
                this.f28099c.rewind();
                short s8 = this.f28099c.getShort();
                if (s8 == -31) {
                    this.f28101e = (this.f28099c.getShort() & 65535) - 2;
                    this.f28100d = 2;
                } else if (a.a(s8)) {
                    ((FilterOutputStream) this).out.write(this.f28099c.array(), 0, 4);
                    this.f28100d = 2;
                } else {
                    ((FilterOutputStream) this).out.write(this.f28099c.array(), 0, 4);
                    this.f28102f = (this.f28099c.getShort() & 65535) - 2;
                }
                this.f28099c.rewind();
            }
        }
        if (i11 > 0) {
            ((FilterOutputStream) this).out.write(bArr, i10, i11);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) throws IOException {
        byte[] bArr = this.b;
        bArr[0] = (byte) (i10 & 255);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
