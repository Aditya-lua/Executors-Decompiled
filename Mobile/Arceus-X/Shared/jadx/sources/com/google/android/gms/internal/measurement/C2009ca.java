package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ca */
/* JADX INFO: loaded from: classes.dex */
public final class C2009ca extends C2085ga {

    /* JADX INFO: renamed from: d */
    public final int f8129d;

    public C2009ca(byte[] bArr, int i10, int i11) {
        super(bArr);
        AbstractC2104ha.m10186k(0, i11, bArr.length);
        this.f8129d = i11;
    }

    @Override // com.google.android.gms.internal.measurement.C2085ga, com.google.android.gms.internal.measurement.AbstractC2104ha
    /* JADX INFO: renamed from: b */
    public final byte mo9869b(int i10) {
        int i11 = this.f8129d;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f8202c[i10];
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 11);
            sb2.append("Index < 0: ");
            sb2.append(i10);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length() + 18 + String.valueOf(i11).length());
        sb3.append("Index > length: ");
        sb3.append(i10);
        sb3.append(", ");
        sb3.append(i11);
        throw new ArrayIndexOutOfBoundsException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.measurement.C2085ga, com.google.android.gms.internal.measurement.AbstractC2104ha
    /* JADX INFO: renamed from: c */
    public final byte mo9870c(int i10) {
        return this.f8202c[i10];
    }

    @Override // com.google.android.gms.internal.measurement.C2085ga, com.google.android.gms.internal.measurement.AbstractC2104ha
    /* JADX INFO: renamed from: d */
    public final int mo9871d() {
        return this.f8129d;
    }

    @Override // com.google.android.gms.internal.measurement.C2085ga
    /* JADX INFO: renamed from: l */
    public final int mo9872l() {
        return 0;
    }
}
