package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ga */
/* JADX INFO: loaded from: classes.dex */
public class C2085ga extends AbstractC2066fa {

    /* JADX INFO: renamed from: c */
    public final byte[] f8202c;

    public C2085ga(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.f8202c = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2104ha
    /* JADX INFO: renamed from: b */
    public byte mo9869b(int i10) {
        return this.f8202c[i10];
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2104ha
    /* JADX INFO: renamed from: c */
    public byte mo9870c(int i10) {
        return this.f8202c[i10];
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2104ha
    /* JADX INFO: renamed from: d */
    public int mo9871d() {
        return this.f8202c.length;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2104ha
    /* JADX INFO: renamed from: e */
    public final AbstractC2104ha mo10049e(int i10, int i11) {
        int iM10186k = AbstractC2104ha.m10186k(0, i11, mo9871d());
        return iM10186k == 0 ? AbstractC2104ha.f8218b : new C2009ca(this.f8202c, 0, iM10186k);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2104ha
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2104ha) || mo9871d() != ((AbstractC2104ha) obj).mo9871d()) {
            return false;
        }
        if (mo9871d() == 0) {
            return true;
        }
        if (!(obj instanceof C2085ga)) {
            return obj.equals(this);
        }
        C2085ga c2085ga = (C2085ga) obj;
        int iM10187i = m10187i();
        int iM10187i2 = c2085ga.m10187i();
        if (iM10187i != 0 && iM10187i2 != 0 && iM10187i != iM10187i2) {
            return false;
        }
        int iMo9871d = mo9871d();
        if (iMo9871d > c2085ga.mo9871d()) {
            int iMo9871d2 = mo9871d();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iMo9871d).length() + 18 + String.valueOf(iMo9871d2).length());
            sb2.append("Length too large: ");
            sb2.append(iMo9871d);
            sb2.append(iMo9871d2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (iMo9871d > c2085ga.mo9871d()) {
            int iMo9871d3 = c2085ga.mo9871d();
            StringBuilder sb3 = new StringBuilder(String.valueOf(iMo9871d).length() + 27 + String.valueOf(iMo9871d3).length());
            sb3.append("Ran off end of other: 0, ");
            sb3.append(iMo9871d);
            sb3.append(", ");
            sb3.append(iMo9871d3);
            throw new IllegalArgumentException(sb3.toString());
        }
        byte[] bArr = this.f8202c;
        byte[] bArr2 = c2085ga.f8202c;
        c2085ga.mo9872l();
        int i10 = 0;
        int i11 = 0;
        while (i10 < iMo9871d) {
            if (bArr[i10] != bArr2[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2104ha
    /* JADX INFO: renamed from: f */
    public final void mo10050f(C2409y9 c2409y9) {
        ((C2158ka) c2409y9).m10328H(this.f8202c, 0, mo9871d());
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2104ha
    /* JADX INFO: renamed from: g */
    public final int mo10051g(int i10, int i11, int i12) {
        return C2267qb.m10578c(i10, this.f8202c, 0, i12);
    }

    /* JADX INFO: renamed from: l */
    public int mo9872l() {
        return 0;
    }
}
