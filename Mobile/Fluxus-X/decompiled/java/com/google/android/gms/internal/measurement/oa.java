package com.google.android.gms.internal.measurement;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class oa extends qa {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f6755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6757f;

    public oa(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.f6755d = bArr;
        this.f6757f = 0;
        this.f6756e = i11;
    }

    @Override // com.google.android.gms.internal.measurement.qa
    public final void A(int i10) throws pa {
        int i11 = this.f6757f;
        try {
            byte[] bArr = this.f6755d;
            bArr[i11] = (byte) i10;
            bArr[i11 + 1] = (byte) (i10 >> 8);
            bArr[i11 + 2] = (byte) (i10 >> 16);
            bArr[i11 + 3] = (byte) (i10 >> 24);
            this.f6757f = i11 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new pa(i11, this.f6756e, 4, e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.qa
    public final void B(long j10) throws pa {
        int i10;
        IndexOutOfBoundsException indexOutOfBoundsException;
        boolean z10 = qa.f6790c;
        int i11 = this.f6757f;
        if (!z10 || this.f6756e - i11 < 10) {
            while ((j10 & (-128)) != 0) {
                try {
                    int i12 = i11 + 1;
                    try {
                        this.f6755d[i11] = (byte) (((int) j10) | Barcode.FORMAT_ITF);
                        j10 >>>= 7;
                        i11 = i12;
                    } catch (IndexOutOfBoundsException e10) {
                        indexOutOfBoundsException = e10;
                        i11 = i12;
                        throw new pa(i11, this.f6756e, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e11) {
                    indexOutOfBoundsException = e11;
                }
            }
            i10 = i11 + 1;
            try {
                this.f6755d[i11] = (byte) j10;
            } catch (IndexOutOfBoundsException e12) {
                indexOutOfBoundsException = e12;
                i11 = i10;
                throw new pa(i11, this.f6756e, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j10 & (-128)) != 0) {
                wd.u(this.f6755d, i11, (byte) (((int) j10) | Barcode.FORMAT_ITF));
                j10 >>>= 7;
                i11++;
            }
            i10 = i11 + 1;
            wd.u(this.f6755d, i11, (byte) j10);
        }
        this.f6757f = i10;
    }

    @Override // com.google.android.gms.internal.measurement.qa
    public final void C(long j10) throws pa {
        int i10 = this.f6757f;
        try {
            byte[] bArr = this.f6755d;
            bArr[i10] = (byte) j10;
            bArr[i10 + 1] = (byte) (j10 >> 8);
            bArr[i10 + 2] = (byte) (j10 >> 16);
            bArr[i10 + 3] = (byte) (j10 >> 24);
            bArr[i10 + 4] = (byte) (j10 >> 32);
            bArr[i10 + 5] = (byte) (j10 >> 40);
            bArr[i10 + 6] = (byte) (j10 >> 48);
            bArr[i10 + 7] = (byte) (j10 >> 56);
            this.f6757f = i10 + 8;
        } catch (IndexOutOfBoundsException e10) {
            throw new pa(i10, this.f6756e, 8, e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.qa
    public final void D(byte[] bArr, int i10, int i11) {
        H(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.measurement.qa
    public final void E(String str) throws pa {
        int i10 = this.f6757f;
        try {
            int iG = qa.G(str.length() * 3);
            int iG2 = qa.G(str.length());
            if (iG2 != iG) {
                z(zd.b(str));
                byte[] bArr = this.f6755d;
                int i11 = this.f6757f;
                this.f6757f = zd.c(str, bArr, i11, this.f6756e - i11);
                return;
            }
            int i12 = i10 + iG2;
            this.f6757f = i12;
            int iC = zd.c(str, this.f6755d, i12, this.f6756e - i12);
            this.f6757f = i10;
            z((iC - i10) - iG2);
            this.f6757f = iC;
        } catch (yd e10) {
            this.f6757f = i10;
            f(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new pa(e11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.qa
    public final int F() {
        return this.f6756e - this.f6757f;
    }

    public final void H(byte[] bArr, int i10, int i11) {
        try {
            System.arraycopy(bArr, 0, this.f6755d, this.f6757f, i11);
            this.f6757f += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new pa(this.f6757f, this.f6756e, i11, e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.qa
    public final void i(int i10, int i11) throws pa {
        z((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.measurement.qa
    public final void j(int i10, int i11) throws pa {
        z(i10 << 3);
        y(i11);
    }

    @Override // com.google.android.gms.internal.measurement.qa
    public final void k(int i10, int i11) throws pa {
        z(i10 << 3);
        z(i11);
    }

    @Override // com.google.android.gms.internal.measurement.qa
    public final void l(int i10, int i11) throws pa {
        z((i10 << 3) | 5);
        A(i11);
    }

    @Override // com.google.android.gms.internal.measurement.qa
    public final void m(int i10, long j10) throws pa {
        z(i10 << 3);
        B(j10);
    }

    @Override // com.google.android.gms.internal.measurement.qa
    public final void n(int i10, long j10) throws pa {
        z((i10 << 3) | 1);
        C(j10);
    }

    @Override // com.google.android.gms.internal.measurement.qa
    public final void o(int i10, boolean z10) throws pa {
        z(i10 << 3);
        x(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.qa
    public final void p(int i10, String str) throws pa {
        z((i10 << 3) | 2);
        E(str);
    }

    @Override // com.google.android.gms.internal.measurement.qa
    public final void q(int i10, la laVar) throws pa {
        z((i10 << 3) | 2);
        r(laVar);
    }

    @Override // com.google.android.gms.internal.measurement.qa
    public final void r(la laVar) throws pa {
        z(laVar.d());
        laVar.f(this);
    }

    @Override // com.google.android.gms.internal.measurement.qa
    public final void s(byte[] bArr, int i10, int i11) throws pa {
        z(i11);
        H(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.measurement.qa
    public final void t(int i10, sc scVar, dd ddVar) throws pa {
        z((i10 << 3) | 2);
        z(((v9) scVar).g(ddVar));
        ddVar.e(scVar, this.f6791a);
    }

    @Override // com.google.android.gms.internal.measurement.qa
    public final void u(int i10, sc scVar) throws pa {
        z(11);
        k(2, i10);
        z(26);
        w(scVar);
        z(12);
    }

    @Override // com.google.android.gms.internal.measurement.qa
    public final void v(int i10, la laVar) throws pa {
        z(11);
        k(2, i10);
        q(3, laVar);
        z(12);
    }

    @Override // com.google.android.gms.internal.measurement.qa
    public final void w(sc scVar) throws pa {
        z(scVar.a());
        scVar.c(this);
    }

    @Override // com.google.android.gms.internal.measurement.qa
    public final void x(byte b) throws pa {
        int i10 = this.f6757f;
        try {
            int i11 = i10 + 1;
            try {
                this.f6755d[i10] = b;
                this.f6757f = i11;
            } catch (IndexOutOfBoundsException e10) {
                e = e10;
                i10 = i11;
                throw new pa(i10, this.f6756e, 1, e);
            }
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
        }
    }

    @Override // com.google.android.gms.internal.measurement.qa
    public final void y(int i10) throws pa {
        if (i10 >= 0) {
            z(i10);
        } else {
            B(i10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.qa
    public final void z(int i10) throws pa {
        int i11;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i12 = this.f6757f;
        while ((i10 & (-128)) != 0) {
            try {
                i11 = i12 + 1;
                try {
                    this.f6755d[i12] = (byte) (i10 | Barcode.FORMAT_ITF);
                    i10 >>>= 7;
                    i12 = i11;
                } catch (IndexOutOfBoundsException e10) {
                    indexOutOfBoundsException = e10;
                    i12 = i11;
                    throw new pa(i12, this.f6756e, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e11) {
                indexOutOfBoundsException = e11;
                throw new pa(i12, this.f6756e, 1, indexOutOfBoundsException);
            }
        }
        i11 = i12 + 1;
        this.f6755d[i12] = (byte) i10;
        this.f6757f = i11;
    }
}
