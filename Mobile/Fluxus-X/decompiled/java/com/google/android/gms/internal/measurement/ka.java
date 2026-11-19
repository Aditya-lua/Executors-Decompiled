package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public class ka extends ja {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f6575c;

    public ka(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.f6575c = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.la
    public byte b(int i10) {
        return this.f6575c[i10];
    }

    @Override // com.google.android.gms.internal.measurement.la
    public byte c(int i10) {
        return this.f6575c[i10];
    }

    @Override // com.google.android.gms.internal.measurement.la
    public int d() {
        return this.f6575c.length;
    }

    @Override // com.google.android.gms.internal.measurement.la
    public final la e(int i10, int i11) {
        int iJ = la.j(0, i11, d());
        return iJ == 0 ? la.b : new ga(this.f6575c, 0, iJ);
    }

    @Override // com.google.android.gms.internal.measurement.la
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof la) || d() != ((la) obj).d()) {
            return false;
        }
        if (d() == 0) {
            return true;
        }
        if (!(obj instanceof ka)) {
            return obj.equals(this);
        }
        ka kaVar = (ka) obj;
        int i10 = i();
        int i11 = kaVar.i();
        if (i10 != 0 && i11 != 0 && i10 != i11) {
            return false;
        }
        int iD = d();
        if (iD > kaVar.d()) {
            int iD2 = d();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iD).length() + 18 + String.valueOf(iD2).length());
            sb2.append("Length too large: ");
            sb2.append(iD);
            sb2.append(iD2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (iD > kaVar.d()) {
            int iD3 = kaVar.d();
            StringBuilder sb3 = new StringBuilder(String.valueOf(iD).length() + 27 + String.valueOf(iD3).length());
            sb3.append("Ran off end of other: 0, ");
            sb3.append(iD);
            sb3.append(", ");
            sb3.append(iD3);
            throw new IllegalArgumentException(sb3.toString());
        }
        byte[] bArr = this.f6575c;
        byte[] bArr2 = kaVar.f6575c;
        kaVar.l();
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

    @Override // com.google.android.gms.internal.measurement.la
    public final void f(ca caVar) {
        ((oa) caVar).H(this.f6575c, 0, d());
    }

    @Override // com.google.android.gms.internal.measurement.la
    public final int g(int i10, int i11, int i12) {
        return ub.c(i10, this.f6575c, 0, i12);
    }

    public int l() {
        return 0;
    }
}
