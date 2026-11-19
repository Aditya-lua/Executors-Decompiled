package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class q3 extends p3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f7217c;

    public q3(byte[] bArr) {
        super(null);
        this.f7217c = bArr;
    }

    @Override // com.google.android.gms.internal.play_billing.s3
    public final byte b(int i10) {
        return this.f7217c[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.s3
    public final int c(int i10, int i11, int i12) {
        return z4.b(i10, this.f7217c, 0, i12);
    }

    @Override // com.google.android.gms.internal.play_billing.s3
    public final int d() {
        return this.f7217c.length;
    }

    @Override // com.google.android.gms.internal.play_billing.s3
    public final s3 e(int i10, int i11) {
        byte[] bArr = this.f7217c;
        int i12 = s3.i(0, i11, bArr.length);
        return i12 == 0 ? s3.b : new m3(bArr, 0, i12);
    }

    @Override // com.google.android.gms.internal.play_billing.s3
    public final void f(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f7217c, 0, bArr, 0, i12);
    }

    @Override // com.google.android.gms.internal.play_billing.s3
    public final void g(i3 i3Var) throws y3 {
        byte[] bArr = this.f7217c;
        ((x3) i3Var).x(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.play_billing.s3
    public final boolean h(s3 s3Var) {
        boolean z10 = s3Var instanceof q3;
        if (z10) {
            return Arrays.equals(this.f7217c, ((q3) s3Var).f7217c);
        }
        boolean z11 = s3Var instanceof m3;
        if (!z11) {
            return s3Var.h(this);
        }
        byte[] bArr = this.f7217c;
        int iD = s3Var.d();
        int length = bArr.length;
        if (length > iD) {
            throw new IllegalArgumentException("Length too large: " + length + length);
        }
        if (length <= s3Var.d()) {
            if (z10) {
                return s3.l(bArr, 0, ((q3) s3Var).f7217c, 0, length);
            }
            if (!z11) {
                return s3Var.e(0, length).equals(e(0, length));
            }
            m3 m3Var = (m3) s3Var;
            return s3.l(bArr, 0, m3Var.f7177c, m3Var.f7178d, length);
        }
        throw new IllegalArgumentException("Ran off end of other: 0, " + length + ", " + s3Var.d());
    }
}
