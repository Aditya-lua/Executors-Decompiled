package com.google.android.gms.internal.play_billing;

import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.x3 */
/* JADX INFO: loaded from: classes.dex */
public final class C2695x3 extends AbstractC2443a4 {

    /* JADX INFO: renamed from: c */
    public final byte[] f9413c;

    /* JADX INFO: renamed from: d */
    public final int f9414d;

    /* JADX INFO: renamed from: e */
    public int f9415e;

    public C2695x3(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.f9413c = bArr;
        this.f9415e = 0;
        this.f9414d = i11;
    }

    /* JADX INFO: renamed from: A */
    public final void m11822A(String str) throws C2706y3 {
        int i10 = this.f9415e;
        try {
            int iM11173v = AbstractC2443a4.m11173v(str.length() * 3);
            int iM11173v2 = AbstractC2443a4.m11173v(str.length());
            if (iM11173v2 != iM11173v) {
                int i11 = C2490e7.f8962a;
                mo11191r(C2468c7.m11342b(str));
                byte[] bArr = this.f9413c;
                int i12 = this.f9415e;
                this.f9415e = C2490e7.m11380a(str, bArr, i12, bArr.length - i12);
                return;
            }
            int i13 = i10 + iM11173v2;
            this.f9415e = i13;
            byte[] bArr2 = this.f9413c;
            int iM11380a = C2490e7.m11380a(str, bArr2, i13, bArr2.length - i13);
            this.f9415e = i10;
            mo11191r((iM11380a - i10) - iM11173v2);
            this.f9415e = iM11380a;
        } catch (IndexOutOfBoundsException e10) {
            throw new C2706y3(e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2443a4
    /* JADX INFO: renamed from: c */
    public final int mo11176c() {
        return this.f9414d - this.f9415e;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2443a4
    /* JADX INFO: renamed from: d */
    public final void mo11177d(byte b) throws C2706y3 {
        int i10 = this.f9415e;
        try {
            int i11 = i10 + 1;
            try {
                this.f9413c[i10] = b;
                this.f9415e = i11;
            } catch (IndexOutOfBoundsException e10) {
                e = e10;
                i10 = i11;
                throw new C2706y3(i10, this.f9414d, 1, e);
            }
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2443a4
    /* JADX INFO: renamed from: e */
    public final void mo11178e(int i10, boolean z10) throws C2706y3 {
        mo11191r(i10 << 3);
        mo11177d(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2443a4
    /* JADX INFO: renamed from: f */
    public final void mo11179f(int i10, AbstractC2640s3 abstractC2640s3) throws C2706y3 {
        mo11191r((i10 << 3) | 2);
        m11824y(abstractC2640s3);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2443a4
    /* JADX INFO: renamed from: g */
    public final void mo11180g(int i10, int i11) throws C2706y3 {
        mo11191r((i10 << 3) | 5);
        mo11181h(i11);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2443a4
    /* JADX INFO: renamed from: h */
    public final void mo11181h(int i10) throws C2706y3 {
        int i11 = this.f9415e;
        try {
            byte[] bArr = this.f9413c;
            bArr[i11] = (byte) i10;
            bArr[i11 + 1] = (byte) (i10 >> 8);
            bArr[i11 + 2] = (byte) (i10 >> 16);
            bArr[i11 + 3] = (byte) (i10 >> 24);
            this.f9415e = i11 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new C2706y3(i11, this.f9414d, 4, e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2443a4
    /* JADX INFO: renamed from: i */
    public final void mo11182i(int i10, long j10) throws C2706y3 {
        mo11191r((i10 << 3) | 1);
        mo11183j(j10);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2443a4
    /* JADX INFO: renamed from: j */
    public final void mo11183j(long j10) throws C2706y3 {
        int i10 = this.f9415e;
        try {
            byte[] bArr = this.f9413c;
            bArr[i10] = (byte) j10;
            bArr[i10 + 1] = (byte) (j10 >> 8);
            bArr[i10 + 2] = (byte) (j10 >> 16);
            bArr[i10 + 3] = (byte) (j10 >> 24);
            bArr[i10 + 4] = (byte) (j10 >> 32);
            bArr[i10 + 5] = (byte) (j10 >> 40);
            bArr[i10 + 6] = (byte) (j10 >> 48);
            bArr[i10 + 7] = (byte) (j10 >> 56);
            this.f9415e = i10 + 8;
        } catch (IndexOutOfBoundsException e10) {
            throw new C2706y3(i10, this.f9414d, 8, e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2443a4
    /* JADX INFO: renamed from: k */
    public final void mo11184k(int i10, int i11) throws C2706y3 {
        mo11191r(i10 << 3);
        mo11185l(i11);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2443a4
    /* JADX INFO: renamed from: l */
    public final void mo11185l(int i10) throws C2706y3 {
        if (i10 >= 0) {
            mo11191r(i10);
        } else {
            mo11193t(i10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2443a4
    /* JADX INFO: renamed from: m */
    public final void mo11186m(int i10, InterfaceC2697x5 interfaceC2697x5) throws C2706y3 {
        mo11191r(11);
        mo11190q(2, i10);
        mo11191r(26);
        m11825z(interfaceC2697x5);
        mo11191r(12);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2443a4
    /* JADX INFO: renamed from: n */
    public final void mo11187n(int i10, AbstractC2640s3 abstractC2640s3) throws C2706y3 {
        mo11191r(11);
        mo11190q(2, i10);
        mo11179f(3, abstractC2640s3);
        mo11191r(12);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2443a4
    /* JADX INFO: renamed from: o */
    public final void mo11188o(int i10, String str) throws C2706y3 {
        mo11191r((i10 << 3) | 2);
        m11822A(str);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2443a4
    /* JADX INFO: renamed from: p */
    public final void mo11189p(int i10, int i11) throws C2706y3 {
        mo11191r((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2443a4
    /* JADX INFO: renamed from: q */
    public final void mo11190q(int i10, int i11) throws C2706y3 {
        mo11191r(i10 << 3);
        mo11191r(i11);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2443a4
    /* JADX INFO: renamed from: r */
    public final void mo11191r(int i10) throws C2706y3 {
        int i11;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i12 = this.f9415e;
        while ((i10 & (-128)) != 0) {
            try {
                i11 = i12 + 1;
                try {
                    this.f9413c[i12] = (byte) (i10 | 128);
                    i10 >>>= 7;
                    i12 = i11;
                } catch (IndexOutOfBoundsException e10) {
                    indexOutOfBoundsException = e10;
                    i12 = i11;
                    throw new C2706y3(i12, this.f9414d, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e11) {
                indexOutOfBoundsException = e11;
                throw new C2706y3(i12, this.f9414d, 1, indexOutOfBoundsException);
            }
        }
        i11 = i12 + 1;
        this.f9413c[i12] = (byte) i10;
        this.f9415e = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2443a4
    /* JADX INFO: renamed from: s */
    public final void mo11192s(int i10, long j10) throws C2706y3 {
        mo11191r(i10 << 3);
        mo11193t(j10);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2443a4
    /* JADX INFO: renamed from: t */
    public final void mo11193t(long j10) throws C2706y3 {
        int i10;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i11 = this.f9415e;
        if (!AbstractC2443a4.f8899b || this.f9414d - i11 < 10) {
            int i12 = i11;
            while ((j10 & (-128)) != 0) {
                try {
                    int i13 = i12 + 1;
                    try {
                        this.f9413c[i12] = (byte) (((int) j10) | 128);
                        j10 >>>= 7;
                        i12 = i13;
                    } catch (IndexOutOfBoundsException e10) {
                        indexOutOfBoundsException = e10;
                        i12 = i13;
                        throw new C2706y3(i12, this.f9414d, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e11) {
                    indexOutOfBoundsException = e11;
                }
            }
            i10 = i12 + 1;
            try {
                this.f9413c[i12] = (byte) j10;
            } catch (IndexOutOfBoundsException e12) {
                indexOutOfBoundsException = e12;
                i12 = i10;
                throw new C2706y3(i12, this.f9414d, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j10 & (-128)) != 0) {
                C2446a7.m11254r(this.f9413c, i11, (byte) (((int) j10) | 128));
                j10 >>>= 7;
                i11++;
            }
            i10 = i11 + 1;
            C2446a7.m11254r(this.f9413c, i11, (byte) j10);
        }
        this.f9415e = i10;
    }

    /* JADX INFO: renamed from: x */
    public final void m11823x(byte[] bArr, int i10, int i11) throws C2706y3 {
        try {
            System.arraycopy(bArr, i10, this.f9413c, this.f9415e, i11);
            this.f9415e += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new C2706y3(this.f9415e, this.f9414d, i11, e10);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m11824y(AbstractC2640s3 abstractC2640s3) throws C2706y3 {
        mo11191r(abstractC2640s3.mo11587d());
        abstractC2640s3.mo11590g(this);
    }

    /* JADX INFO: renamed from: z */
    public final void m11825z(InterfaceC2697x5 interfaceC2697x5) throws C2706y3 {
        mo11191r(interfaceC2697x5.zzn());
        interfaceC2697x5.mo11749a(this);
    }
}
