package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class m3 extends p3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f7177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7179e;

    public m3(byte[] bArr, int i10, int i11) {
        super(null);
        s3.i(i10, i10 + i11, bArr.length);
        this.f7177c = bArr;
        this.f7178d = i10;
        this.f7179e = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.s3
    public final byte b(int i10) {
        return this.f7177c[this.f7178d + i10];
    }

    @Override // com.google.android.gms.internal.play_billing.s3
    public final int c(int i10, int i11, int i12) {
        return z4.b(i10, this.f7177c, this.f7178d, i12);
    }

    @Override // com.google.android.gms.internal.play_billing.s3
    public final int d() {
        return this.f7179e;
    }

    @Override // com.google.android.gms.internal.play_billing.s3
    public final s3 e(int i10, int i11) {
        int i12 = s3.i(i10, i11, this.f7179e);
        return i12 == 0 ? s3.b : new m3(this.f7177c, this.f7178d + i10, i12);
    }

    @Override // com.google.android.gms.internal.play_billing.s3
    public final void f(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f7177c, this.f7178d, bArr, 0, i12);
    }

    @Override // com.google.android.gms.internal.play_billing.s3
    public final void g(i3 i3Var) throws y3 {
        ((x3) i3Var).x(this.f7177c, this.f7178d, this.f7179e);
    }

    @Override // com.google.android.gms.internal.play_billing.s3
    public final boolean h(s3 s3Var) {
        boolean z10 = s3Var instanceof q3;
        if (!z10 && !(s3Var instanceof m3)) {
            return s3Var.h(this);
        }
        int i10 = this.f7179e;
        if (i10 > s3Var.d()) {
            throw new IllegalArgumentException("Length too large: " + i10 + i10);
        }
        if (i10 > s3Var.d()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + i10 + ", " + s3Var.d());
        }
        if (z10) {
            return s3.l(this.f7177c, this.f7178d, ((q3) s3Var).f7217c, 0, i10);
        }
        if (s3Var instanceof m3) {
            m3 m3Var = (m3) s3Var;
            return s3.l(this.f7177c, this.f7178d, m3Var.f7177c, m3Var.f7178d, i10);
        }
        s3 s3VarE = s3Var.e(0, i10);
        int i11 = this.f7178d;
        return s3VarE.equals(e(i11, i10 + i11));
    }
}
