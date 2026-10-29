package com.google.android.gms.internal.measurement;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class ka extends ma {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f6589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6590e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6591f;

    public ka(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.f6589d = bArr;
        this.f6591f = 0;
        this.f6590e = i11;
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void A(int i10) throws la {
        int i11 = this.f6591f;
        try {
            byte[] bArr = this.f6589d;
            bArr[i11] = (byte) i10;
            bArr[i11 + 1] = (byte) (i10 >> 8);
            bArr[i11 + 2] = (byte) (i10 >> 16);
            bArr[i11 + 3] = (byte) (i10 >> 24);
            this.f6591f = i11 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new la(i11, this.f6590e, 4, e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void B(long j10) throws la {
        int i10;
        IndexOutOfBoundsException indexOutOfBoundsException;
        boolean z10 = ma.f6624c;
        int i11 = this.f6591f;
        if (!z10 || this.f6590e - i11 < 10) {
            while ((j10 & (-128)) != 0) {
                try {
                    int i12 = i11 + 1;
                    try {
                        this.f6589d[i11] = (byte) (((int) j10) | 128);
                        j10 >>>= 7;
                        i11 = i12;
                    } catch (IndexOutOfBoundsException e10) {
                        indexOutOfBoundsException = e10;
                        i11 = i12;
                        throw new la(i11, this.f6590e, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e11) {
                    indexOutOfBoundsException = e11;
                }
            }
            i10 = i11 + 1;
            try {
                this.f6589d[i11] = (byte) j10;
            } catch (IndexOutOfBoundsException e12) {
                indexOutOfBoundsException = e12;
                i11 = i10;
                throw new la(i11, this.f6590e, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j10 & (-128)) != 0) {
                sd.u(this.f6589d, i11, (byte) (((int) j10) | 128));
                j10 >>>= 7;
                i11++;
            }
            i10 = i11 + 1;
            sd.u(this.f6589d, i11, (byte) j10);
        }
        this.f6591f = i10;
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void C(long j10) throws la {
        int i10 = this.f6591f;
        try {
            byte[] bArr = this.f6589d;
            bArr[i10] = (byte) j10;
            bArr[i10 + 1] = (byte) (j10 >> 8);
            bArr[i10 + 2] = (byte) (j10 >> 16);
            bArr[i10 + 3] = (byte) (j10 >> 24);
            bArr[i10 + 4] = (byte) (j10 >> 32);
            bArr[i10 + 5] = (byte) (j10 >> 40);
            bArr[i10 + 6] = (byte) (j10 >> 48);
            bArr[i10 + 7] = (byte) (j10 >> 56);
            this.f6591f = i10 + 8;
        } catch (IndexOutOfBoundsException e10) {
            throw new la(i10, this.f6590e, 8, e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void D(byte[] bArr, int i10, int i11) {
        H(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void E(String str) throws la {
        int i10 = this.f6591f;
        try {
            int iG = ma.G(str.length() * 3);
            int iG2 = ma.G(str.length());
            if (iG2 != iG) {
                z(vd.b(str));
                byte[] bArr = this.f6589d;
                int i11 = this.f6591f;
                this.f6591f = vd.c(str, bArr, i11, this.f6590e - i11);
                return;
            }
            int i12 = i10 + iG2;
            this.f6591f = i12;
            int iC = vd.c(str, this.f6589d, i12, this.f6590e - i12);
            this.f6591f = i10;
            z((iC - i10) - iG2);
            this.f6591f = iC;
        } catch (ud e10) {
            this.f6591f = i10;
            f(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new la(e11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final int F() {
        return this.f6590e - this.f6591f;
    }

    public final void H(byte[] bArr, int i10, int i11) {
        try {
            System.arraycopy(bArr, 0, this.f6589d, this.f6591f, i11);
            this.f6591f += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new la(this.f6591f, this.f6590e, i11, e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void i(int i10, int i11) throws la {
        z((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void j(int i10, int i11) throws la {
        z(i10 << 3);
        y(i11);
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void k(int i10, int i11) throws la {
        z(i10 << 3);
        z(i11);
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void l(int i10, int i11) throws la {
        z((i10 << 3) | 5);
        A(i11);
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void m(int i10, long j10) throws la {
        z(i10 << 3);
        B(j10);
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void n(int i10, long j10) throws la {
        z((i10 << 3) | 1);
        C(j10);
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void o(int i10, boolean z10) throws la {
        z(i10 << 3);
        x(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void p(int i10, String str) throws la {
        z((i10 << 3) | 2);
        E(str);
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void q(int i10, ha haVar) throws la {
        z((i10 << 3) | 2);
        r(haVar);
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void r(ha haVar) throws la {
        z(haVar.d());
        haVar.f(this);
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void s(byte[] bArr, int i10, int i11) throws la {
        z(i11);
        H(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void t(int i10, oc ocVar, zc zcVar) throws la {
        z((i10 << 3) | 2);
        z(((r9) ocVar).g(zcVar));
        zcVar.e(ocVar, this.f6625a);
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void u(int i10, oc ocVar) throws la {
        z(11);
        k(2, i10);
        z(26);
        w(ocVar);
        z(12);
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void v(int i10, ha haVar) throws la {
        z(11);
        k(2, i10);
        q(3, haVar);
        z(12);
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void w(oc ocVar) throws la {
        z(ocVar.a());
        ocVar.c(this);
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void x(byte b) throws la {
        int i10 = this.f6591f;
        try {
            int i11 = i10 + 1;
            try {
                this.f6589d[i10] = b;
                this.f6591f = i11;
            } catch (IndexOutOfBoundsException e10) {
                e = e10;
                i10 = i11;
                throw new la(i10, this.f6590e, 1, e);
            }
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
        }
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void y(int i10) throws la {
        if (i10 >= 0) {
            z(i10);
        } else {
            B(i10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.ma
    public final void z(int i10) throws la {
        int i11;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i12 = this.f6591f;
        while ((i10 & (-128)) != 0) {
            try {
                i11 = i12 + 1;
                try {
                    this.f6589d[i12] = (byte) (i10 | 128);
                    i10 >>>= 7;
                    i12 = i11;
                } catch (IndexOutOfBoundsException e10) {
                    indexOutOfBoundsException = e10;
                    i12 = i11;
                    throw new la(i12, this.f6590e, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e11) {
                indexOutOfBoundsException = e11;
                throw new la(i12, this.f6590e, 1, indexOutOfBoundsException);
            }
        }
        i11 = i12 + 1;
        this.f6589d[i12] = (byte) i10;
        this.f6591f = i11;
    }
}
