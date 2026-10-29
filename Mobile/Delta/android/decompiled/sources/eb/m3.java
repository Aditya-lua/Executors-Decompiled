package eb;

import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class m3 implements Iterable<Byte>, Serializable {
    public static final m3 b = new j3(s3.f15392d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Comparator f15305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l3 f15306d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15307a = 0;

    static {
        int i10 = c3.f15255a;
        f15306d = new l3(null);
        f15305c = new e3();
    }

    public static int k(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        }
        throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
    }

    public static m3 m(byte[] bArr, int i10, int i11) {
        k(0, i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, 0, bArr2, 0, i11);
        return new j3(bArr2);
    }

    public abstract byte b(int i10);

    public abstract byte c(int i10);

    public abstract int d();

    public abstract void e(byte[] bArr, int i10, int i11, int i12);

    public abstract boolean equals(Object obj);

    public abstract int f(int i10, int i11, int i12);

    public abstract m3 g(int i10, int i11);

    public abstract InputStream h();

    public final int hashCode() {
        int iF = this.f15307a;
        if (iF == 0) {
            int iD = d();
            iF = f(iD, 0, iD);
            if (iF == 0) {
                iF = 1;
            }
            this.f15307a = iF;
        }
        return iF;
    }

    public abstract ByteBuffer i();

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new d3(this);
    }

    public final int l() {
        return this.f15307a;
    }

    public final byte[] p() {
        int iD = d();
        if (iD == 0) {
            return s3.f15392d;
        }
        byte[] bArr = new byte[iD];
        e(bArr, 0, 0, iD);
        return bArr;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(d()), d() <= 50 ? t3.a(this) : t3.a(g(0, 47)).concat("..."));
    }
}
