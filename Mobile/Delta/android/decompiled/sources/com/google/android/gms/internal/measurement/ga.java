package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public class ga extends fa {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f6458c;

    public ga(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.f6458c = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.ha
    public byte b(int i10) {
        return this.f6458c[i10];
    }

    @Override // com.google.android.gms.internal.measurement.ha
    public byte c(int i10) {
        return this.f6458c[i10];
    }

    @Override // com.google.android.gms.internal.measurement.ha
    public int d() {
        return this.f6458c.length;
    }

    @Override // com.google.android.gms.internal.measurement.ha
    public final ha e(int i10, int i11) {
        int iK = ha.k(0, i11, d());
        return iK == 0 ? ha.b : new ca(this.f6458c, 0, iK);
    }

    @Override // com.google.android.gms.internal.measurement.ha
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ha) || d() != ((ha) obj).d()) {
            return false;
        }
        if (d() == 0) {
            return true;
        }
        if (!(obj instanceof ga)) {
            return obj.equals(this);
        }
        ga gaVar = (ga) obj;
        int i10 = i();
        int i11 = gaVar.i();
        if (i10 != 0 && i11 != 0 && i10 != i11) {
            return false;
        }
        int iD = d();
        if (iD > gaVar.d()) {
            int iD2 = d();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iD).length() + 18 + String.valueOf(iD2).length());
            sb2.append("Length too large: ");
            sb2.append(iD);
            sb2.append(iD2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (iD > gaVar.d()) {
            int iD3 = gaVar.d();
            StringBuilder sb3 = new StringBuilder(String.valueOf(iD).length() + 27 + String.valueOf(iD3).length());
            sb3.append("Ran off end of other: 0, ");
            sb3.append(iD);
            sb3.append(", ");
            sb3.append(iD3);
            throw new IllegalArgumentException(sb3.toString());
        }
        byte[] bArr = this.f6458c;
        byte[] bArr2 = gaVar.f6458c;
        gaVar.l();
        int i12 = 0;
        int i13 = 0;
        while (i12 < iD) {
            if (bArr[i12] != bArr2[i13]) {
                return false;
            }
            i12++;
            i13++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.ha
    public final void f(y9 y9Var) {
        ((ka) y9Var).H(this.f6458c, 0, d());
    }

    @Override // com.google.android.gms.internal.measurement.ha
    public final int g(int i10, int i11, int i12) {
        return qb.c(i10, this.f6458c, 0, i12);
    }

    public int l() {
        return 0;
    }
}
