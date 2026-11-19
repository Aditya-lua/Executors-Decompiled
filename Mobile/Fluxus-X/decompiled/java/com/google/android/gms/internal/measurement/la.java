package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class la implements Iterable, Serializable {
    public static final la b = new ka(ub.b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6593a = 0;

    static {
        int i10 = y9.f6948a;
    }

    public static la h(byte[] bArr, int i10, int i11) {
        j(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new ka(bArr2);
    }

    public static int j(int i10, int i11, int i12) {
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

    public abstract byte b(int i10);

    public abstract byte c(int i10);

    public abstract int d();

    public abstract la e(int i10, int i11);

    public abstract boolean equals(Object obj);

    public abstract void f(ca caVar);

    public abstract int g(int i10, int i11, int i12);

    public final int hashCode() {
        int iG = this.f6593a;
        if (iG == 0) {
            int iD = d();
            iG = g(iD, 0, iD);
            if (iG == 0) {
                iG = 1;
            }
            this.f6593a = iG;
        }
        return iG;
    }

    public final int i() {
        return this.f6593a;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new ea(this);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(d()), d() <= 50 ? nd.a(this) : nd.a(e(0, 47)).concat("..."));
    }
}
