package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.q3 */
/* JADX INFO: loaded from: classes.dex */
public final class C2618q3 extends AbstractC2607p3 {

    /* JADX INFO: renamed from: c */
    public final byte[] f9205c;

    public C2618q3(byte[] bArr) {
        super(null);
        this.f9205c = bArr;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2640s3
    /* JADX INFO: renamed from: b */
    public final byte mo11585b(int i10) {
        return this.f9205c[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2640s3
    /* JADX INFO: renamed from: c */
    public final int mo11586c(int i10, int i11, int i12) {
        return C2718z4.m11858b(i10, this.f9205c, 0, i12);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2640s3
    /* JADX INFO: renamed from: d */
    public final int mo11587d() {
        return this.f9205c.length;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2640s3
    /* JADX INFO: renamed from: e */
    public final AbstractC2640s3 mo11588e(int i10, int i11) {
        byte[] bArr = this.f9205c;
        int iM11718i = AbstractC2640s3.m11718i(0, i11, bArr.length);
        return iM11718i == 0 ? AbstractC2640s3.f9227b : new C2574m3(bArr, 0, iM11718i);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2640s3
    /* JADX INFO: renamed from: f */
    public final void mo11589f(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f9205c, 0, bArr, 0, i12);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2640s3
    /* JADX INFO: renamed from: g */
    public final void mo11590g(C2530i3 c2530i3) throws C2706y3 {
        byte[] bArr = this.f9205c;
        ((C2695x3) c2530i3).m11823x(bArr, 0, bArr.length);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.google.android.gms.internal.play_billing.m3.t(com.google.android.gms.internal.play_billing.m3):byte[] */
    @Override // com.google.android.gms.internal.play_billing.AbstractC2640s3
    /* JADX INFO: renamed from: h */
    public final boolean mo11591h(AbstractC2640s3 abstractC2640s3) {
        boolean z10 = abstractC2640s3 instanceof C2618q3;
        if (z10) {
            return Arrays.equals(this.f9205c, ((C2618q3) abstractC2640s3).f9205c);
        }
        boolean z11 = abstractC2640s3 instanceof C2574m3;
        if (!z11) {
            return abstractC2640s3.mo11591h(this);
        }
        byte[] bArr = this.f9205c;
        int iMo11587d = abstractC2640s3.mo11587d();
        int length = bArr.length;
        if (length > iMo11587d) {
            throw new IllegalArgumentException("Length too large: " + length + length);
        }
        if (length <= abstractC2640s3.mo11587d()) {
            if (z10) {
                return AbstractC2640s3.m11720l(bArr, 0, ((C2618q3) abstractC2640s3).f9205c, 0, length);
            }
            if (!z11) {
                return abstractC2640s3.mo11588e(0, length).equals(mo11588e(0, length));
            }
            C2574m3 c2574m3 = (C2574m3) abstractC2640s3;
            return AbstractC2640s3.m11720l(bArr, 0, c2574m3.f9153c, c2574m3.f9154d, length);
        }
        throw new IllegalArgumentException("Ran off end of other: 0, " + length + ", " + abstractC2640s3.mo11587d());
    }
}
