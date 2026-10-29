package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.s3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2640s3 implements Iterable, Serializable {

    /* JADX INFO: renamed from: b */
    public static final AbstractC2640s3 f9227b = new C2618q3(C2718z4.f9432a);

    /* JADX INFO: renamed from: a */
    public int f9228a = 0;

    static {
        int i10 = C2486e3.f8956a;
    }

    /* JADX INFO: renamed from: i */
    public static int m11718i(int i10, int i11, int i12) {
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

    /* JADX INFO: renamed from: k */
    public static AbstractC2640s3 m11719k(byte[] bArr, int i10, int i11) {
        try {
            m11718i(i10, i10 + i11, bArr.length);
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return new C2618q3(bArr2);
        } catch (C2499f5 e10) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e10);
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ boolean m11720l(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        int i13 = i10 + i12;
        m11718i(i10, i13, bArr.length);
        m11718i(i11, i12 + i11, bArr2.length);
        while (i10 < i13) {
            if (bArr[i10] != bArr2[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public abstract byte mo11585b(int i10);

    /* JADX INFO: renamed from: c */
    public abstract int mo11586c(int i10, int i11, int i12);

    /* JADX INFO: renamed from: d */
    public abstract int mo11587d();

    /* JADX INFO: renamed from: e */
    public abstract AbstractC2640s3 mo11588e(int i10, int i11);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2640s3)) {
            return false;
        }
        AbstractC2640s3 abstractC2640s3 = (AbstractC2640s3) obj;
        int iMo11587d = mo11587d();
        if (iMo11587d != abstractC2640s3.mo11587d()) {
            return false;
        }
        if (iMo11587d == 0) {
            return true;
        }
        int i10 = this.f9228a;
        int i11 = abstractC2640s3.f9228a;
        if (i10 == 0 || i11 == 0 || i10 == i11) {
            return mo11591h(abstractC2640s3);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo11589f(byte[] bArr, int i10, int i11, int i12);

    /* JADX INFO: renamed from: g */
    public abstract void mo11590g(C2530i3 c2530i3);

    /* JADX INFO: renamed from: h */
    public abstract boolean mo11591h(AbstractC2640s3 abstractC2640s3);

    public final int hashCode() {
        int iMo11586c = this.f9228a;
        if (iMo11586c == 0) {
            int iMo11587d = mo11587d();
            iMo11586c = mo11586c(iMo11587d, 0, iMo11587d);
            if (iMo11586c == 0) {
                iMo11586c = 1;
            }
            this.f9228a = iMo11586c;
        }
        return iMo11586c;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C2541j3(this);
    }

    /* JADX INFO: renamed from: m */
    public final byte[] m11721m() {
        int iMo11587d = mo11587d();
        if (iMo11587d == 0) {
            return C2718z4.f9432a;
        }
        byte[] bArr = new byte[iMo11587d];
        mo11589f(bArr, 0, 0, iMo11587d);
        return bArr;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(mo11587d()), mo11587d() <= 50 ? C2632r6.m11704a(m11721m()) : C2632r6.m11704a(mo11588e(0, 47).m11721m()).concat("..."));
    }
}
