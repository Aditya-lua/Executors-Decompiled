package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ha */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2104ha implements Iterable, Serializable {

    /* JADX INFO: renamed from: b */
    public static final AbstractC2104ha f8218b = new C2085ga(C2267qb.f8596b);

    /* JADX INFO: renamed from: a */
    public int f8219a = 0;

    static {
        int i10 = C2337u9.f8687a;
    }

    /* JADX INFO: renamed from: h */
    public static AbstractC2104ha m10185h(byte[] bArr, int i10, int i11) {
        m10186k(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new C2085ga(bArr2);
    }

    /* JADX INFO: renamed from: k */
    public static int m10186k(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21);
            sb2.append("Beginning index: ");
            sb2.append(i10);
            sb2.append(" < 0");
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i11 < i10) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length() + 44 + String.valueOf(i11).length());
            sb3.append("Beginning index larger than ending index: ");
            sb3.append(i10);
            sb3.append(", ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(i11).length() + 15 + String.valueOf(i12).length());
        sb4.append("End index: ");
        sb4.append(i11);
        sb4.append(" >= ");
        sb4.append(i12);
        throw new IndexOutOfBoundsException(sb4.toString());
    }

    /* JADX INFO: renamed from: b */
    public abstract byte mo9869b(int i10);

    /* JADX INFO: renamed from: c */
    public abstract byte mo9870c(int i10);

    /* JADX INFO: renamed from: d */
    public abstract int mo9871d();

    /* JADX INFO: renamed from: e */
    public abstract AbstractC2104ha mo10049e(int i10, int i11);

    public abstract boolean equals(Object obj);

    /* JADX INFO: renamed from: f */
    public abstract void mo10050f(C2409y9 c2409y9);

    /* JADX INFO: renamed from: g */
    public abstract int mo10051g(int i10, int i11, int i12);

    public final int hashCode() {
        int iMo10051g = this.f8219a;
        if (iMo10051g == 0) {
            int iMo9871d = mo9871d();
            iMo10051g = mo10051g(iMo9871d, 0, iMo9871d);
            if (iMo10051g == 0) {
                iMo10051g = 1;
            }
            this.f8219a = iMo10051g;
        }
        return iMo10051g;
    }

    /* JADX INFO: renamed from: i */
    public final int m10187i() {
        return this.f8219a;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C1971aa(this);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(mo9871d()), mo9871d() <= 50 ? C2143jd.m10304a(this) : C2143jd.m10304a(mo10049e(0, 47)).concat("..."));
    }
}
