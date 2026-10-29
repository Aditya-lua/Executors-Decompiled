package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class ca extends ga {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6402d;

    public ca(byte[] bArr, int i10, int i11) {
        super(bArr);
        ha.k(0, i11, bArr.length);
        this.f6402d = i11;
    }

    @Override // com.google.android.gms.internal.measurement.ga, com.google.android.gms.internal.measurement.ha
    public final byte b(int i10) {
        int i11 = this.f6402d;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f6458c[i10];
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

    @Override // com.google.android.gms.internal.measurement.ga, com.google.android.gms.internal.measurement.ha
    public final byte c(int i10) {
        return this.f6458c[i10];
    }

    @Override // com.google.android.gms.internal.measurement.ga, com.google.android.gms.internal.measurement.ha
    public final int d() {
        return this.f6402d;
    }

    @Override // com.google.android.gms.internal.measurement.ga
    public final int l() {
        return 0;
    }
}
