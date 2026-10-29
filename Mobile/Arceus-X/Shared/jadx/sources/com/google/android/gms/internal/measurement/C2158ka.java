package com.google.android.gms.internal.measurement;

import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ka */
/* JADX INFO: loaded from: classes.dex */
public final class C2158ka extends AbstractC2194ma {

    /* JADX INFO: renamed from: d */
    public final byte[] f8379d;

    /* JADX INFO: renamed from: e */
    public final int f8380e;

    /* JADX INFO: renamed from: f */
    public int f8381f;

    public C2158ka(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.f8379d = bArr;
        this.f8381f = 0;
        this.f8380e = i11;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2194ma
    /* JADX INFO: renamed from: A */
    public final void mo10322A(int i10) throws C2176la {
        int i11 = this.f8381f;
        try {
            byte[] bArr = this.f8379d;
            bArr[i11] = (byte) i10;
            bArr[i11 + 1] = (byte) (i10 >> 8);
            bArr[i11 + 2] = (byte) (i10 >> 16);
            bArr[i11 + 3] = (byte) (i10 >> 24);
            this.f8381f = i11 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new C2176la(i11, this.f8380e, 4, e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2194ma
    /* JADX INFO: renamed from: B */
    public final void mo10323B(long j10) throws C2176la {
        int i10;
        IndexOutOfBoundsException indexOutOfBoundsException;
        boolean z10 = AbstractC2194ma.f8419c;
        int i11 = this.f8381f;
        if (!z10 || this.f8380e - i11 < 10) {
            while ((j10 & (-128)) != 0) {
                try {
                    int i12 = i11 + 1;
                    try {
                        this.f8379d[i11] = (byte) (((int) j10) | 128);
                        j10 >>>= 7;
                        i11 = i12;
                    } catch (IndexOutOfBoundsException e10) {
                        indexOutOfBoundsException = e10;
                        i11 = i12;
                        throw new C2176la(i11, this.f8380e, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e11) {
                    indexOutOfBoundsException = e11;
                }
            }
            i10 = i11 + 1;
            try {
                this.f8379d[i11] = (byte) j10;
            } catch (IndexOutOfBoundsException e12) {
                indexOutOfBoundsException = e12;
                i11 = i10;
                throw new C2176la(i11, this.f8380e, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j10 & (-128)) != 0) {
                C2305sd.m10746u(this.f8379d, i11, (byte) (((int) j10) | 128));
                j10 >>>= 7;
                i11++;
            }
            i10 = i11 + 1;
            C2305sd.m10746u(this.f8379d, i11, (byte) j10);
        }
        this.f8381f = i10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2194ma
    /* JADX INFO: renamed from: C */
    public final void mo10324C(long j10) throws C2176la {
        int i10 = this.f8381f;
        try {
            byte[] bArr = this.f8379d;
            bArr[i10] = (byte) j10;
            bArr[i10 + 1] = (byte) (j10 >> 8);
            bArr[i10 + 2] = (byte) (j10 >> 16);
            bArr[i10 + 3] = (byte) (j10 >> 24);
            bArr[i10 + 4] = (byte) (j10 >> 32);
            bArr[i10 + 5] = (byte) (j10 >> 40);
            bArr[i10 + 6] = (byte) (j10 >> 48);
            bArr[i10 + 7] = (byte) (j10 >> 56);
            this.f8381f = i10 + 8;
        } catch (IndexOutOfBoundsException e10) {
            throw new C2176la(i10, this.f8380e, 8, e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2194ma
    /* JADX INFO: renamed from: D */
    public final void mo10325D(byte[] bArr, int i10, int i11) {
        m10328H(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2194ma
    /* JADX INFO: renamed from: E */
    public final void mo10326E(String str) throws C2176la {
        int i10 = this.f8381f;
        try {
            int iM10380G = AbstractC2194ma.m10380G(str.length() * 3);
            int iM10380G2 = AbstractC2194ma.m10380G(str.length());
            if (iM10380G2 != iM10380G) {
                mo10346z(C2359vd.m10855b(str));
                byte[] bArr = this.f8379d;
                int i11 = this.f8381f;
                this.f8381f = C2359vd.m10856c(str, bArr, i11, this.f8380e - i11);
                return;
            }
            int i12 = i10 + iM10380G2;
            this.f8381f = i12;
            int iM10856c = C2359vd.m10856c(str, this.f8379d, i12, this.f8380e - i12);
            this.f8381f = i10;
            mo10346z((iM10856c - i10) - iM10380G2);
            this.f8381f = iM10856c;
        } catch (C2341ud e10) {
            this.f8381f = i10;
            m10388f(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new C2176la(e11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2194ma
    /* JADX INFO: renamed from: F */
    public final int mo10327F() {
        return this.f8380e - this.f8381f;
    }

    /* JADX INFO: renamed from: H */
    public final void m10328H(byte[] bArr, int i10, int i11) {
        try {
            System.arraycopy(bArr, 0, this.f8379d, this.f8381f, i11);
            this.f8381f += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new C2176la(this.f8381f, this.f8380e, i11, e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2194ma
    /* JADX INFO: renamed from: i */
    public final void mo10329i(int i10, int i11) throws C2176la {
        mo10346z((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2194ma
    /* JADX INFO: renamed from: j */
    public final void mo10330j(int i10, int i11) throws C2176la {
        mo10346z(i10 << 3);
        mo10345y(i11);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2194ma
    /* JADX INFO: renamed from: k */
    public final void mo10331k(int i10, int i11) throws C2176la {
        mo10346z(i10 << 3);
        mo10346z(i11);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2194ma
    /* JADX INFO: renamed from: l */
    public final void mo10332l(int i10, int i11) throws C2176la {
        mo10346z((i10 << 3) | 5);
        mo10322A(i11);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2194ma
    /* JADX INFO: renamed from: m */
    public final void mo10333m(int i10, long j10) throws C2176la {
        mo10346z(i10 << 3);
        mo10323B(j10);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2194ma
    /* JADX INFO: renamed from: n */
    public final void mo10334n(int i10, long j10) throws C2176la {
        mo10346z((i10 << 3) | 1);
        mo10324C(j10);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2194ma
    /* JADX INFO: renamed from: o */
    public final void mo10335o(int i10, boolean z10) throws C2176la {
        mo10346z(i10 << 3);
        mo10344x(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2194ma
    /* JADX INFO: renamed from: p */
    public final void mo10336p(int i10, String str) throws C2176la {
        mo10346z((i10 << 3) | 2);
        mo10326E(str);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2194ma
    /* JADX INFO: renamed from: q */
    public final void mo10337q(int i10, AbstractC2104ha abstractC2104ha) throws C2176la {
        mo10346z((i10 << 3) | 2);
        mo10338r(abstractC2104ha);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2194ma
    /* JADX INFO: renamed from: r */
    public final void mo10338r(AbstractC2104ha abstractC2104ha) throws C2176la {
        mo10346z(abstractC2104ha.mo9871d());
        abstractC2104ha.mo10050f(this);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2194ma
    /* JADX INFO: renamed from: s */
    public final void mo10339s(byte[] bArr, int i10, int i11) throws C2176la {
        mo10346z(i11);
        m10328H(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2194ma
    /* JADX INFO: renamed from: t */
    public final void mo10340t(int i10, InterfaceC2232oc interfaceC2232oc, InterfaceC2430zc interfaceC2430zc) throws C2176la {
        mo10346z((i10 << 3) | 2);
        mo10346z(((AbstractC2283r9) interfaceC2232oc).mo10066g(interfaceC2430zc));
        interfaceC2430zc.mo10660e(interfaceC2232oc, this.f8420a);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2194ma
    /* JADX INFO: renamed from: u */
    public final void mo10341u(int i10, InterfaceC2232oc interfaceC2232oc) throws C2176la {
        mo10346z(11);
        mo10331k(2, i10);
        mo10346z(26);
        mo10343w(interfaceC2232oc);
        mo10346z(12);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2194ma
    /* JADX INFO: renamed from: v */
    public final void mo10342v(int i10, AbstractC2104ha abstractC2104ha) throws C2176la {
        mo10346z(11);
        mo10331k(2, i10);
        mo10337q(3, abstractC2104ha);
        mo10346z(12);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2194ma
    /* JADX INFO: renamed from: w */
    public final void mo10343w(InterfaceC2232oc interfaceC2232oc) throws C2176la {
        mo10346z(interfaceC2232oc.mo10063a());
        interfaceC2232oc.mo10064c(this);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2194ma
    /* JADX INFO: renamed from: x */
    public final void mo10344x(byte b) throws C2176la {
        int i10 = this.f8381f;
        try {
            int i11 = i10 + 1;
            try {
                this.f8379d[i10] = b;
                this.f8381f = i11;
            } catch (IndexOutOfBoundsException e10) {
                e = e10;
                i10 = i11;
                throw new C2176la(i10, this.f8380e, 1, e);
            }
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2194ma
    /* JADX INFO: renamed from: y */
    public final void mo10345y(int i10) throws C2176la {
        if (i10 >= 0) {
            mo10346z(i10);
        } else {
            mo10323B(i10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2194ma
    /* JADX INFO: renamed from: z */
    public final void mo10346z(int i10) throws C2176la {
        int i11;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i12 = this.f8381f;
        while ((i10 & (-128)) != 0) {
            try {
                i11 = i12 + 1;
                try {
                    this.f8379d[i12] = (byte) (i10 | 128);
                    i10 >>>= 7;
                    i12 = i11;
                } catch (IndexOutOfBoundsException e10) {
                    indexOutOfBoundsException = e10;
                    i12 = i11;
                    throw new C2176la(i12, this.f8380e, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e11) {
                indexOutOfBoundsException = e11;
                throw new C2176la(i12, this.f8380e, 1, indexOutOfBoundsException);
            }
        }
        i11 = i12 + 1;
        this.f8379d[i12] = (byte) i10;
        this.f8381f = i11;
    }
}
