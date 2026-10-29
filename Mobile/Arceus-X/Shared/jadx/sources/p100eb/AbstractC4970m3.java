package p100eb;

import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: eb.m3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4970m3 implements Iterable<Byte>, Serializable {

    /* JADX INFO: renamed from: b */
    public static final AbstractC4970m3 f19698b = new C4952j3(C5006s3.f19804d);

    /* JADX INFO: renamed from: c */
    public static final Comparator f19699c;

    /* JADX INFO: renamed from: d */
    public static final C4964l3 f19700d;

    /* JADX INFO: renamed from: a */
    public int f19701a = 0;

    static {
        int i10 = C4910c3.f19634a;
        f19700d = new C4964l3(null);
        f19699c = new C4922e3();
    }

    /* JADX INFO: renamed from: k */
    public static int m23672k(int i10, int i11, int i12) {
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

    /* JADX INFO: renamed from: m */
    public static AbstractC4970m3 m23673m(byte[] bArr, int i10, int i11) {
        m23672k(0, i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, 0, bArr2, 0, i11);
        return new C4952j3(bArr2);
    }

    /* JADX INFO: renamed from: b */
    public abstract byte mo23598b(int i10);

    /* JADX INFO: renamed from: c */
    public abstract byte mo23599c(int i10);

    /* JADX INFO: renamed from: d */
    public abstract int mo23600d();

    /* JADX INFO: renamed from: e */
    public abstract void mo23601e(byte[] bArr, int i10, int i11, int i12);

    public abstract boolean equals(Object obj);

    /* JADX INFO: renamed from: f */
    public abstract int mo23645f(int i10, int i11, int i12);

    /* JADX INFO: renamed from: g */
    public abstract AbstractC4970m3 mo23646g(int i10, int i11);

    /* JADX INFO: renamed from: h */
    public abstract InputStream mo23647h();

    public final int hashCode() {
        int iMo23645f = this.f19701a;
        if (iMo23645f == 0) {
            int iMo23600d = mo23600d();
            iMo23645f = mo23645f(iMo23600d, 0, iMo23600d);
            if (iMo23645f == 0) {
                iMo23645f = 1;
            }
            this.f19701a = iMo23645f;
        }
        return iMo23645f;
    }

    /* JADX INFO: renamed from: i */
    public abstract ByteBuffer mo23648i();

    /* JADX DEBUG: Return type fixed from 'java.util.Iterator' to match base method */
    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new C4916d3(this);
    }

    /* JADX INFO: renamed from: l */
    public final int m23674l() {
        return this.f19701a;
    }

    /* JADX INFO: renamed from: p */
    public final byte[] m23675p() {
        int iMo23600d = mo23600d();
        if (iMo23600d == 0) {
            return C5006s3.f19804d;
        }
        byte[] bArr = new byte[iMo23600d];
        mo23601e(bArr, 0, 0, iMo23600d);
        return bArr;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(mo23600d()), mo23600d() <= 50 ? C5012t3.m23704a(this) : C5012t3.m23704a(mo23646g(0, 47)).concat("..."));
    }
}
