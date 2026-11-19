package hn;

import com.google.mlkit.common.MlKitException;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends m {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ew.h f18355n = ew.h.e("'\\");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ew.h f18356o = ew.h.e("\"\\");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final ew.h f18357p = ew.h.e("{}[]:, \n\t\r\f/\\;#=");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final ew.h f18358q = ew.h.e("\n\r");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ew.h f18359r = ew.h.e("*/");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ew.g f18360g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ew.e f18361h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18362i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f18363j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f18364k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f18365l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public r f18366m;

    public o(ew.g gVar) {
        this.f18362i = 0;
        if (gVar == null) {
            throw new NullPointerException("source == null");
        }
        this.f18360g = gVar;
        this.f18361h = gVar.getBufferField();
        A(6);
    }

    public final void A0() throws EOFException {
        long jB2 = this.f18360g.B2(f18358q);
        ew.e eVar = this.f18361h;
        eVar.skip(jB2 != -1 ? jB2 + 1 : eVar.getSize());
    }

    public final void E0() throws EOFException {
        long jB2 = this.f18360g.B2(f18357p);
        ew.e eVar = this.f18361h;
        if (jB2 == -1) {
            jB2 = eVar.getSize();
        }
        eVar.skip(jB2);
    }

    @Override // hn.m
    public int I(m.b bVar) throws k, EOFException {
        int iC0 = this.f18362i;
        if (iC0 == 0) {
            iC0 = c0();
        }
        if (iC0 < 12 || iC0 > 15) {
            return -1;
        }
        if (iC0 == 15) {
            return d0(this.f18365l, bVar);
        }
        int iJ1 = this.f18360g.J1(bVar.b);
        if (iJ1 != -1) {
            this.f18362i = 0;
            this.f18339c[this.f18338a - 1] = bVar.f18344a[iJ1];
            return iJ1;
        }
        String str = this.f18339c[this.f18338a - 1];
        String strO = o();
        int iD0 = d0(strO, bVar);
        if (iD0 == -1) {
            this.f18362i = 15;
            this.f18365l = strO;
            this.f18339c[this.f18338a - 1] = str;
        }
        return iD0;
    }

    @Override // hn.m
    public int K(m.b bVar) throws k, EOFException {
        int iC0 = this.f18362i;
        if (iC0 == 0) {
            iC0 = c0();
        }
        if (iC0 < 8 || iC0 > 11) {
            return -1;
        }
        if (iC0 == 11) {
            return e0(this.f18365l, bVar);
        }
        int iJ1 = this.f18360g.J1(bVar.b);
        if (iJ1 != -1) {
            this.f18362i = 0;
            int[] iArr = this.f18340d;
            int i10 = this.f18338a - 1;
            iArr[i10] = iArr[i10] + 1;
            return iJ1;
        }
        String strS = s();
        int iE0 = e0(strS, bVar);
        if (iE0 == -1) {
            this.f18362i = 11;
            this.f18365l = strS;
            int[] iArr2 = this.f18340d;
            int i11 = this.f18338a - 1;
            iArr2[i11] = iArr2[i11] - 1;
        }
        return iE0;
    }

    @Override // hn.m
    public void O() throws k, EOFException {
        if (this.f18342f) {
            m.c cVarW = w();
            o();
            throw new j("Cannot skip unexpected " + cVarW + " at " + x());
        }
        int iC0 = this.f18362i;
        if (iC0 == 0) {
            iC0 = c0();
        }
        if (iC0 == 14) {
            E0();
        } else if (iC0 == 13) {
            x0(f18356o);
        } else if (iC0 == 12) {
            x0(f18355n);
        } else if (iC0 != 15) {
            throw new j("Expected a name but was " + w() + " at path " + x());
        }
        this.f18362i = 0;
        this.f18339c[this.f18338a - 1] = "null";
    }

    @Override // hn.m
    public void Q() throws k, EOFException {
        if (this.f18342f) {
            throw new j("Cannot skip unexpected " + w() + " at " + x());
        }
        int i10 = 0;
        do {
            int iC0 = this.f18362i;
            if (iC0 == 0) {
                iC0 = c0();
            }
            if (iC0 == 3) {
                A(1);
            } else {
                if (iC0 == 1) {
                    A(3);
                } else if (iC0 == 4) {
                    i10--;
                    if (i10 < 0) {
                        throw new j("Expected a value but was " + w() + " at path " + x());
                    }
                    this.f18338a--;
                } else if (iC0 == 2) {
                    i10--;
                    if (i10 < 0) {
                        throw new j("Expected a value but was " + w() + " at path " + x());
                    }
                    this.f18338a--;
                } else if (iC0 == 14 || iC0 == 10) {
                    E0();
                } else if (iC0 == 9 || iC0 == 13) {
                    x0(f18356o);
                } else if (iC0 == 8 || iC0 == 12) {
                    x0(f18355n);
                } else if (iC0 == 17) {
                    this.f18361h.skip(this.f18364k);
                } else if (iC0 == 18) {
                    throw new j("Expected a value but was " + w() + " at path " + x());
                }
                this.f18362i = 0;
            }
            i10++;
            this.f18362i = 0;
        } while (i10 != 0);
        int[] iArr = this.f18340d;
        int i11 = this.f18338a;
        int i12 = i11 - 1;
        iArr[i12] = iArr[i12] + 1;
        this.f18339c[i11 - 1] = "null";
    }

    @Override // hn.m
    public void a() throws k, EOFException {
        int iC0 = this.f18362i;
        if (iC0 == 0) {
            iC0 = c0();
        }
        if (iC0 == 3) {
            A(1);
            this.f18340d[this.f18338a - 1] = 0;
            this.f18362i = 0;
        } else {
            throw new j("Expected BEGIN_ARRAY but was " + w() + " at path " + x());
        }
    }

    @Override // hn.m
    public void b() throws k, EOFException {
        int iC0 = this.f18362i;
        if (iC0 == 0) {
            iC0 = c0();
        }
        if (iC0 == 1) {
            A(3);
            this.f18362i = 0;
            return;
        }
        throw new j("Expected BEGIN_OBJECT but was " + w() + " at path " + x());
    }

    public final void b0() throws k {
        if (!this.f18341e) {
            throw T("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    @Override // hn.m
    public void c() throws k, EOFException {
        int iC0 = this.f18362i;
        if (iC0 == 0) {
            iC0 = c0();
        }
        if (iC0 != 4) {
            throw new j("Expected END_ARRAY but was " + w() + " at path " + x());
        }
        int i10 = this.f18338a;
        this.f18338a = i10 - 1;
        int[] iArr = this.f18340d;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f18362i = 0;
    }

    public final int c0() throws k, EOFException {
        int[] iArr = this.b;
        int i10 = this.f18338a;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int iH0 = h0(true);
            this.f18361h.readByte();
            if (iH0 != 44) {
                if (iH0 != 59) {
                    if (iH0 != 93) {
                        throw T("Unterminated array");
                    }
                    this.f18362i = 4;
                    return 4;
                }
                b0();
            }
        } else {
            if (i11 == 3 || i11 == 5) {
                iArr[i10 - 1] = 4;
                if (i11 == 5) {
                    int iH1 = h0(true);
                    this.f18361h.readByte();
                    if (iH1 != 44) {
                        if (iH1 != 59) {
                            if (iH1 != 125) {
                                throw T("Unterminated object");
                            }
                            this.f18362i = 2;
                            return 2;
                        }
                        b0();
                    }
                }
                int iH2 = h0(true);
                if (iH2 == 34) {
                    this.f18361h.readByte();
                    this.f18362i = 13;
                    return 13;
                }
                if (iH2 == 39) {
                    this.f18361h.readByte();
                    b0();
                    this.f18362i = 12;
                    return 12;
                }
                if (iH2 != 125) {
                    b0();
                    if (!f0((char) iH2)) {
                        throw T("Expected name");
                    }
                    this.f18362i = 14;
                    return 14;
                }
                if (i11 == 5) {
                    throw T("Expected name");
                }
                this.f18361h.readByte();
                this.f18362i = 2;
                return 2;
            }
            if (i11 == 4) {
                iArr[i10 - 1] = 5;
                int iH3 = h0(true);
                this.f18361h.readByte();
                if (iH3 != 58) {
                    if (iH3 != 61) {
                        throw T("Expected ':'");
                    }
                    b0();
                    if (this.f18360g.request(1L) && this.f18361h.o(0L) == 62) {
                        this.f18361h.readByte();
                    }
                }
            } else if (i11 == 6) {
                iArr[i10 - 1] = 7;
            } else if (i11 == 7) {
                if (h0(false) == -1) {
                    this.f18362i = 18;
                    return 18;
                }
                b0();
            } else {
                if (i11 == 9) {
                    this.f18366m.b();
                    this.f18366m = null;
                    this.f18338a--;
                    return c0();
                }
                if (i11 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
            }
        }
        int iH4 = h0(true);
        if (iH4 == 34) {
            this.f18361h.readByte();
            this.f18362i = 9;
            return 9;
        }
        if (iH4 == 39) {
            b0();
            this.f18361h.readByte();
            this.f18362i = 8;
            return 8;
        }
        if (iH4 != 44 && iH4 != 59) {
            if (iH4 == 91) {
                this.f18361h.readByte();
                this.f18362i = 3;
                return 3;
            }
            if (iH4 != 93) {
                if (iH4 == 123) {
                    this.f18361h.readByte();
                    this.f18362i = 1;
                    return 1;
                }
                int iN0 = n0();
                if (iN0 != 0) {
                    return iN0;
                }
                int iS0 = s0();
                if (iS0 != 0) {
                    return iS0;
                }
                if (!f0(this.f18361h.o(0L))) {
                    throw T("Expected value");
                }
                b0();
                this.f18362i = 10;
                return 10;
            }
            if (i11 == 1) {
                this.f18361h.readByte();
                this.f18362i = 4;
                return 4;
            }
        }
        if (i11 != 1 && i11 != 2) {
            throw T("Unexpected value");
        }
        b0();
        this.f18362i = 7;
        return 7;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        this.f18362i = 0;
        this.b[0] = 8;
        this.f18338a = 1;
        this.f18361h.a();
        this.f18360g.close();
    }

    @Override // hn.m
    public void d() throws k, EOFException {
        int iC0 = this.f18362i;
        if (iC0 == 0) {
            iC0 = c0();
        }
        if (iC0 != 2) {
            throw new j("Expected END_OBJECT but was " + w() + " at path " + x());
        }
        int i10 = this.f18338a;
        int i11 = i10 - 1;
        this.f18338a = i11;
        this.f18339c[i11] = null;
        int[] iArr = this.f18340d;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f18362i = 0;
    }

    public final int d0(String str, m.b bVar) {
        int length = bVar.f18344a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(bVar.f18344a[i10])) {
                this.f18362i = 0;
                this.f18339c[this.f18338a - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    public final int e0(String str, m.b bVar) {
        int length = bVar.f18344a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(bVar.f18344a[i10])) {
                this.f18362i = 0;
                int[] iArr = this.f18340d;
                int i11 = this.f18338a - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
        }
        return -1;
    }

    @Override // hn.m
    public boolean f() throws k, EOFException {
        int iC0 = this.f18362i;
        if (iC0 == 0) {
            iC0 = c0();
        }
        return (iC0 == 2 || iC0 == 4 || iC0 == 18) ? false : true;
    }

    public final boolean f0(int i10) throws k {
        if (i10 == 9 || i10 == 10 || i10 == 12 || i10 == 13 || i10 == 32) {
            return false;
        }
        if (i10 != 35) {
            if (i10 == 44) {
                return false;
            }
            if (i10 != 47 && i10 != 61) {
                if (i10 == 123 || i10 == 125 || i10 == 58) {
                    return false;
                }
                if (i10 != 59) {
                    switch (i10) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        b0();
        return false;
    }

    @Override // hn.m
    public boolean h() throws k, EOFException {
        int iC0 = this.f18362i;
        if (iC0 == 0) {
            iC0 = c0();
        }
        if (iC0 == 5) {
            this.f18362i = 0;
            int[] iArr = this.f18340d;
            int i10 = this.f18338a - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iC0 == 6) {
            this.f18362i = 0;
            int[] iArr2 = this.f18340d;
            int i11 = this.f18338a - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        }
        throw new j("Expected a boolean but was " + w() + " at path " + x());
    }

    public final int h0(boolean z10) throws k, EOFException {
        byte bO;
        while (true) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (!this.f18360g.request(i11)) {
                    if (z10) {
                        throw new EOFException("End of input");
                    }
                    return -1;
                }
                bO = this.f18361h.o(i10);
                if (bO == 10 || bO == 32 || bO == 13 || bO == 9) {
                    i10 = i11;
                }
            }
            this.f18361h.skip(i10);
            if (bO == 47) {
                if (this.f18360g.request(2L)) {
                    b0();
                    byte bO2 = this.f18361h.o(1L);
                    if (bO2 == 42) {
                        this.f18361h.readByte();
                        this.f18361h.readByte();
                        if (!z0()) {
                            throw T("Unterminated comment");
                        }
                    } else if (bO2 == 47) {
                        this.f18361h.readByte();
                        this.f18361h.readByte();
                        A0();
                    }
                }
                return bO;
            }
            if (bO != 35) {
                return bO;
            }
            b0();
            A0();
        }
    }

    public final String i0(ew.h hVar) throws k, EOFException {
        StringBuilder sb2 = null;
        while (true) {
            long jB2 = this.f18360g.B2(hVar);
            if (jB2 == -1) {
                throw T("Unterminated string");
            }
            if (this.f18361h.o(jB2) != 92) {
                if (sb2 == null) {
                    String strG1 = this.f18361h.G1(jB2);
                    this.f18361h.readByte();
                    return strG1;
                }
                sb2.append(this.f18361h.G1(jB2));
                this.f18361h.readByte();
                return sb2.toString();
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(this.f18361h.G1(jB2));
            this.f18361h.readByte();
            sb2.append(w0());
        }
    }

    @Override // hn.m
    public double k() throws k, EOFException {
        int iC0 = this.f18362i;
        if (iC0 == 0) {
            iC0 = c0();
        }
        if (iC0 == 16) {
            this.f18362i = 0;
            int[] iArr = this.f18340d;
            int i10 = this.f18338a - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f18363j;
        }
        if (iC0 == 17) {
            this.f18365l = this.f18361h.G1(this.f18364k);
        } else if (iC0 == 9) {
            this.f18365l = i0(f18356o);
        } else if (iC0 == 8) {
            this.f18365l = i0(f18355n);
        } else if (iC0 == 10) {
            this.f18365l = k0();
        } else if (iC0 != 11) {
            throw new j("Expected a double but was " + w() + " at path " + x());
        }
        this.f18362i = 11;
        try {
            double d10 = Double.parseDouble(this.f18365l);
            if (this.f18341e || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
                this.f18365l = null;
                this.f18362i = 0;
                int[] iArr2 = this.f18340d;
                int i11 = this.f18338a - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return d10;
            }
            throw new k("JSON forbids NaN and infinities: " + d10 + " at path " + x());
        } catch (NumberFormatException unused) {
            throw new j("Expected a double but was " + this.f18365l + " at path " + x());
        }
    }

    public final String k0() {
        long jB2 = this.f18360g.B2(f18357p);
        return jB2 != -1 ? this.f18361h.G1(jB2) : this.f18361h.V2();
    }

    @Override // hn.m
    public int m() throws k, EOFException {
        int iC0 = this.f18362i;
        if (iC0 == 0) {
            iC0 = c0();
        }
        if (iC0 == 16) {
            long j10 = this.f18363j;
            int i10 = (int) j10;
            if (j10 == i10) {
                this.f18362i = 0;
                int[] iArr = this.f18340d;
                int i11 = this.f18338a - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new j("Expected an int but was " + this.f18363j + " at path " + x());
        }
        if (iC0 == 17) {
            this.f18365l = this.f18361h.G1(this.f18364k);
        } else if (iC0 == 9 || iC0 == 8) {
            String strI0 = iC0 == 9 ? i0(f18356o) : i0(f18355n);
            this.f18365l = strI0;
            try {
                int i12 = Integer.parseInt(strI0);
                this.f18362i = 0;
                int[] iArr2 = this.f18340d;
                int i13 = this.f18338a - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        } else if (iC0 != 11) {
            throw new j("Expected an int but was " + w() + " at path " + x());
        }
        this.f18362i = 11;
        try {
            double d10 = Double.parseDouble(this.f18365l);
            int i14 = (int) d10;
            if (i14 == d10) {
                this.f18365l = null;
                this.f18362i = 0;
                int[] iArr3 = this.f18340d;
                int i15 = this.f18338a - 1;
                iArr3[i15] = iArr3[i15] + 1;
                return i14;
            }
            throw new j("Expected an int but was " + this.f18365l + " at path " + x());
        } catch (NumberFormatException unused2) {
            throw new j("Expected an int but was " + this.f18365l + " at path " + x());
        }
    }

    @Override // hn.m
    public long n() throws k, EOFException {
        int iC0 = this.f18362i;
        if (iC0 == 0) {
            iC0 = c0();
        }
        if (iC0 == 16) {
            this.f18362i = 0;
            int[] iArr = this.f18340d;
            int i10 = this.f18338a - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f18363j;
        }
        if (iC0 == 17) {
            this.f18365l = this.f18361h.G1(this.f18364k);
        } else if (iC0 == 9 || iC0 == 8) {
            String strI0 = iC0 == 9 ? i0(f18356o) : i0(f18355n);
            this.f18365l = strI0;
            try {
                long j10 = Long.parseLong(strI0);
                this.f18362i = 0;
                int[] iArr2 = this.f18340d;
                int i11 = this.f18338a - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return j10;
            } catch (NumberFormatException unused) {
            }
        } else if (iC0 != 11) {
            throw new j("Expected a long but was " + w() + " at path " + x());
        }
        this.f18362i = 11;
        try {
            long jLongValueExact = new BigDecimal(this.f18365l).longValueExact();
            this.f18365l = null;
            this.f18362i = 0;
            int[] iArr3 = this.f18340d;
            int i12 = this.f18338a - 1;
            iArr3[i12] = iArr3[i12] + 1;
            return jLongValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            throw new j("Expected a long but was " + this.f18365l + " at path " + x());
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final int n0() throws EOFException {
        String str;
        String str2;
        int i10;
        byte bO = this.f18361h.o(0L);
        if (bO == 116 || bO == 84) {
            str = "true";
            str2 = "TRUE";
            i10 = 5;
        } else if (bO == 102 || bO == 70) {
            str = "false";
            str2 = "FALSE";
            i10 = 6;
        } else {
            if (bO != 110 && bO != 78) {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i10 = 7;
        }
        int length = str.length();
        int i11 = 1;
        while (i11 < length) {
            int i12 = i11 + 1;
            if (!this.f18360g.request(i12)) {
                return 0;
            }
            byte bO2 = this.f18361h.o(i11);
            if (bO2 != str.charAt(i11) && bO2 != str2.charAt(i11)) {
                return 0;
            }
            i11 = i12;
        }
        if (this.f18360g.request(length + 1) && f0(this.f18361h.o(length))) {
            return 0;
        }
        this.f18361h.skip(length);
        this.f18362i = i10;
        return i10;
    }

    @Override // hn.m
    public String o() throws k, EOFException {
        String strI0;
        int iC0 = this.f18362i;
        if (iC0 == 0) {
            iC0 = c0();
        }
        if (iC0 == 14) {
            strI0 = k0();
        } else if (iC0 == 13) {
            strI0 = i0(f18356o);
        } else if (iC0 == 12) {
            strI0 = i0(f18355n);
        } else {
            if (iC0 != 15) {
                throw new j("Expected a name but was " + w() + " at path " + x());
            }
            strI0 = this.f18365l;
            this.f18365l = null;
        }
        this.f18362i = 0;
        this.f18339c[this.f18338a - 1] = strI0;
        return strI0;
    }

    @Override // hn.m
    public <T> T p() throws k, EOFException {
        int iC0 = this.f18362i;
        if (iC0 == 0) {
            iC0 = c0();
        }
        if (iC0 == 7) {
            this.f18362i = 0;
            int[] iArr = this.f18340d;
            int i10 = this.f18338a - 1;
            iArr[i10] = iArr[i10] + 1;
            return null;
        }
        throw new j("Expected null but was " + w() + " at path " + x());
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00bd  */
    @Override // hn.m
    public ew.g r() throws IOException {
        int i10;
        int iC0 = this.f18362i;
        if (iC0 == 0) {
            iC0 = c0();
        }
        ew.e eVar = new ew.e();
        ew.h hVar = r.f18381m;
        if (iC0 != 3) {
            if (iC0 == 1) {
                eVar.D0("{");
                hVar = r.f18376h;
            } else {
                if (iC0 == 9) {
                    eVar.D0("\"");
                    hVar = r.f18378j;
                } else if (iC0 == 8) {
                    eVar.D0("'");
                    hVar = r.f18377i;
                } else if (iC0 == 17 || iC0 == 16 || iC0 == 10) {
                    eVar.D0(s());
                } else if (iC0 == 5) {
                    eVar.D0("true");
                } else if (iC0 == 6) {
                    eVar.D0("false");
                } else if (iC0 == 7) {
                    eVar.D0("null");
                } else {
                    if (iC0 != 11) {
                        throw new j("Expected a value but was " + w() + " at path " + x());
                    }
                    String strS = s();
                    t tVarR = t.r(eVar);
                    try {
                        tVarR.Q(strS);
                        tVarR.close();
                    } catch (Throwable th2) {
                        if (tVarR != null) {
                            try {
                                tVarR.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                }
                i10 = 0;
            }
            if (this.f18362i != 0) {
                int[] iArr = this.f18340d;
                int i11 = this.f18338a - 1;
                iArr[i11] = iArr[i11] + 1;
                this.f18362i = 0;
            }
            this.f18366m = new r(this.f18360g, eVar, hVar, i10);
            A(9);
            return ew.v.c(this.f18366m);
        }
        eVar.D0("[");
        hVar = r.f18376h;
        i10 = 1;
        if (this.f18362i != 0) {
            int[] iArr2 = this.f18340d;
            int i12 = this.f18338a - 1;
            iArr2[i12] = iArr2[i12] + 1;
            this.f18362i = 0;
        }
        this.f18366m = new r(this.f18360g, eVar, hVar, i10);
        A(9);
        return ew.v.c(this.f18366m);
    }

    @Override // hn.m
    public String s() throws k, EOFException {
        String strG1;
        int iC0 = this.f18362i;
        if (iC0 == 0) {
            iC0 = c0();
        }
        if (iC0 == 10) {
            strG1 = k0();
        } else if (iC0 == 9) {
            strG1 = i0(f18356o);
        } else if (iC0 == 8) {
            strG1 = i0(f18355n);
        } else if (iC0 == 11) {
            strG1 = this.f18365l;
            this.f18365l = null;
        } else if (iC0 == 16) {
            strG1 = Long.toString(this.f18363j);
        } else {
            if (iC0 != 17) {
                throw new j("Expected a string but was " + w() + " at path " + x());
            }
            strG1 = this.f18361h.G1(this.f18364k);
        }
        this.f18362i = 0;
        int[] iArr = this.f18340d;
        int i10 = this.f18338a - 1;
        iArr[i10] = iArr[i10] + 1;
        return strG1;
    }

    public final int s0() throws EOFException {
        long j10;
        int i10;
        boolean z10 = true;
        int i11 = 0;
        char c10 = 0;
        long j11 = 0;
        boolean z11 = false;
        while (true) {
            int i12 = i11 + 1;
            if (!this.f18360g.request(i12)) {
                j10 = 0;
                i10 = 0;
                break;
            }
            j10 = 0;
            byte bO = this.f18361h.o(i11);
            i10 = 0;
            if (bO != 43) {
                if (bO == 69 || bO == 101) {
                    if (c10 != 2 && c10 != 4) {
                        return 0;
                    }
                    c10 = 5;
                } else if (bO != 45) {
                    if (bO != 46) {
                        if (bO < 48 || bO > 57) {
                            if (!f0(bO)) {
                                break;
                            }
                            return 0;
                        }
                        if (c10 == 1 || c10 == 0) {
                            j11 = -(bO - 48);
                            c10 = 2;
                        } else if (c10 == 2) {
                            if (j11 == 0) {
                                return 0;
                            }
                            long j12 = (10 * j11) - ((long) (bO - 48));
                            z10 &= j11 > -922337203685477580L || (j11 == -922337203685477580L && j12 < j11);
                            j11 = j12;
                        } else if (c10 == 3) {
                            c10 = 4;
                        } else if (c10 == 5 || c10 == 6) {
                            c10 = 7;
                        }
                    } else {
                        if (c10 != 2) {
                            return 0;
                        }
                        c10 = 3;
                    }
                } else if (c10 == 0) {
                    c10 = 1;
                    z11 = true;
                } else if (c10 != 5) {
                    return 0;
                }
                i11 = i12;
            } else if (c10 != 5) {
                return 0;
            }
            c10 = 6;
            i11 = i12;
        }
        if (c10 == 2 && z10 && ((j11 != Long.MIN_VALUE || z11) && (j11 != j10 || !z11))) {
            if (!z11) {
                j11 = -j11;
            }
            this.f18363j = j11;
            this.f18361h.skip(i11);
            this.f18362i = 16;
            return 16;
        }
        if (c10 != 2 && c10 != 4 && c10 != 7) {
            return i10;
        }
        this.f18364k = i11;
        this.f18362i = 17;
        return 17;
    }

    public String toString() {
        return "JsonReader(" + this.f18360g + ")";
    }

    @Override // hn.m
    public m.c w() throws k, EOFException {
        int iC0 = this.f18362i;
        if (iC0 == 0) {
            iC0 = c0();
        }
        switch (iC0) {
            case 1:
                return m.c.BEGIN_OBJECT;
            case 2:
                return m.c.END_OBJECT;
            case 3:
                return m.c.BEGIN_ARRAY;
            case 4:
                return m.c.END_ARRAY;
            case 5:
            case 6:
                return m.c.BOOLEAN;
            case 7:
                return m.c.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return m.c.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return m.c.NAME;
            case 16:
            case 17:
                return m.c.NUMBER;
            case MlKitException.UNSUPPORTED /* 18 */:
                return m.c.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final char w0() throws k, EOFException {
        int i10;
        if (!this.f18360g.request(1L)) {
            throw T("Unterminated escape sequence");
        }
        byte b = this.f18361h.readByte();
        if (b == 10 || b == 34 || b == 39 || b == 47 || b == 92) {
            return (char) b;
        }
        if (b == 98) {
            return '\b';
        }
        if (b == 102) {
            return '\f';
        }
        if (b == 110) {
            return '\n';
        }
        if (b == 114) {
            return '\r';
        }
        if (b == 116) {
            return '\t';
        }
        if (b != 117) {
            if (this.f18341e) {
                return (char) b;
            }
            throw T("Invalid escape sequence: \\" + ((char) b));
        }
        if (!this.f18360g.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + x());
        }
        char c10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            byte bO = this.f18361h.o(i11);
            char c11 = (char) (c10 << 4);
            if (bO >= 48 && bO <= 57) {
                i10 = bO - 48;
            } else if (bO >= 97 && bO <= 102) {
                i10 = bO - 87;
            } else {
                if (bO < 65 || bO > 70) {
                    throw T("\\u" + this.f18361h.G1(4L));
                }
                i10 = bO - 55;
            }
            c10 = (char) (c11 + i10);
        }
        this.f18361h.skip(4L);
        return c10;
    }

    public final void x0(ew.h hVar) throws k, EOFException {
        while (true) {
            long jB2 = this.f18360g.B2(hVar);
            if (jB2 == -1) {
                throw T("Unterminated string");
            }
            if (this.f18361h.o(jB2) != 92) {
                this.f18361h.skip(jB2 + 1);
                return;
            } else {
                this.f18361h.skip(jB2 + 1);
                w0();
            }
        }
    }

    @Override // hn.m
    public m y() {
        return new o(this);
    }

    @Override // hn.m
    public void z() {
        if (f()) {
            this.f18365l = o();
            this.f18362i = 11;
        }
    }

    public final boolean z0() throws EOFException {
        ew.g gVar = this.f18360g;
        ew.h hVar = f18359r;
        long jI1 = gVar.i1(hVar);
        boolean z10 = jI1 != -1;
        ew.e eVar = this.f18361h;
        eVar.skip(z10 ? jI1 + ((long) hVar.I()) : eVar.getSize());
        return z10;
    }

    public o(o oVar) {
        super(oVar);
        this.f18362i = 0;
        ew.g gVarPeek = oVar.f18360g.peek();
        this.f18360g = gVarPeek;
        this.f18361h = gVarPeek.getBufferField();
        this.f18362i = oVar.f18362i;
        this.f18363j = oVar.f18363j;
        this.f18364k = oVar.f18364k;
        this.f18365l = oVar.f18365l;
        try {
            gVarPeek.w1(oVar.f18361h.getSize());
        } catch (IOException unused) {
            throw new AssertionError();
        }
    }
}
