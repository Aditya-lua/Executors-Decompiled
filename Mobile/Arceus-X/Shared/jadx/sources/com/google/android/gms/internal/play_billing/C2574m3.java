package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.m3 */
/* JADX INFO: loaded from: classes.dex */
public final class C2574m3 extends AbstractC2607p3 {

    /* JADX INFO: renamed from: c */
    public final byte[] f9153c;

    /* JADX INFO: renamed from: d */
    public final int f9154d;

    /* JADX INFO: renamed from: e */
    public final int f9155e;

    public C2574m3(byte[] bArr, int i10, int i11) {
        super(null);
        AbstractC2640s3.m11718i(i10, i10 + i11, bArr.length);
        this.f9153c = bArr;
        this.f9154d = i10;
        this.f9155e = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2640s3
    /* JADX INFO: renamed from: b */
    public final byte mo11585b(int i10) {
        return this.f9153c[this.f9154d + i10];
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2640s3
    /* JADX INFO: renamed from: c */
    public final int mo11586c(int i10, int i11, int i12) {
        return C2718z4.m11858b(i10, this.f9153c, this.f9154d, i12);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2640s3
    /* JADX INFO: renamed from: d */
    public final int mo11587d() {
        return this.f9155e;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2640s3
    /* JADX INFO: renamed from: e */
    public final AbstractC2640s3 mo11588e(int i10, int i11) {
        int iM11718i = AbstractC2640s3.m11718i(i10, i11, this.f9155e);
        return iM11718i == 0 ? AbstractC2640s3.f9227b : new C2574m3(this.f9153c, this.f9154d + i10, iM11718i);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2640s3
    /* JADX INFO: renamed from: f */
    public final void mo11589f(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f9153c, this.f9154d, bArr, 0, i12);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2640s3
    /* JADX INFO: renamed from: g */
    public final void mo11590g(C2530i3 c2530i3) throws C2706y3 {
        ((C2695x3) c2530i3).m11823x(this.f9153c, this.f9154d, this.f9155e);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2640s3
    /* JADX INFO: renamed from: h */
    public final boolean mo11591h(AbstractC2640s3 abstractC2640s3) {
        boolean z10 = abstractC2640s3 instanceof C2618q3;
        if (!z10 && !(abstractC2640s3 instanceof C2574m3)) {
            return abstractC2640s3.mo11591h(this);
        }
        int i10 = this.f9155e;
        if (i10 > abstractC2640s3.mo11587d()) {
            throw new IllegalArgumentException("Length too large: " + i10 + i10);
        }
        if (i10 > abstractC2640s3.mo11587d()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + i10 + ", " + abstractC2640s3.mo11587d());
        }
        if (z10) {
            return AbstractC2640s3.m11720l(this.f9153c, this.f9154d, ((C2618q3) abstractC2640s3).f9205c, 0, i10);
        }
        if (abstractC2640s3 instanceof C2574m3) {
            C2574m3 c2574m3 = (C2574m3) abstractC2640s3;
            return AbstractC2640s3.m11720l(this.f9153c, this.f9154d, c2574m3.f9153c, c2574m3.f9154d, i10);
        }
        AbstractC2640s3 abstractC2640s3Mo11588e = abstractC2640s3.mo11588e(0, i10);
        int i11 = this.f9154d;
        return abstractC2640s3Mo11588e.equals(mo11588e(i11, i10 + i11));
    }
}
