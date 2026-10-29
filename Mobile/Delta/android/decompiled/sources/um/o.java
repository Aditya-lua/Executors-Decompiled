package um;

import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;
import xu.b0;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends m {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final xu.h f32410n = xu.h.e("'\\");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final xu.h f32411o = xu.h.e("\"\\");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final xu.h f32412p = xu.h.e("{}[]:, \n\t\r\f/\\;#=");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final xu.h f32413q = xu.h.e("\n\r");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final xu.h f32414r = xu.h.e("*/");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final xu.g f32415g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xu.e f32416h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f32417i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f32418j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f32419k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f32420l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public r f32421m;

    public o(xu.g gVar) {
        this.f32417i = 0;
        if (gVar == null) {
            throw new NullPointerException("source == null");
        }
        this.f32415g = gVar;
        this.f32416h = gVar.getBufferField();
        y(6);
    }

    public final void A0() throws EOFException {
        long jH0 = this.f32415g.h0(f32413q);
        xu.e eVar = this.f32416h;
        eVar.skip(jH0 != -1 ? jH0 + 1 : eVar.getSize());
    }

    public final void D0() throws EOFException {
        long jH0 = this.f32415g.h0(f32412p);
        xu.e eVar = this.f32416h;
        if (jH0 == -1) {
            jH0 = eVar.getSize();
        }
        eVar.skip(jH0);
    }

    @Override // um.m
    public int F(m.b bVar) throws k, EOFException {
        int iZ = this.f32417i;
        if (iZ == 0) {
            iZ = Z();
        }
        if (iZ < 12 || iZ > 15) {
            return -1;
        }
        if (iZ == 15) {
            return a0(this.f32420l, bVar);
        }
        int iL3 = this.f32415g.l3(bVar.b);
        if (iL3 != -1) {
            this.f32417i = 0;
            this.f32394c[this.f32393a - 1] = bVar.f32399a[iL3];
            return iL3;
        }
        String str = this.f32394c[this.f32393a - 1];
        String strN = n();
        int iA0 = a0(strN, bVar);
        if (iA0 == -1) {
            this.f32417i = 15;
            this.f32420l = strN;
            this.f32394c[this.f32393a - 1] = str;
        }
        return iA0;
    }

    @Override // um.m
    public int H(m.b bVar) throws k, EOFException {
        int iZ = this.f32417i;
        if (iZ == 0) {
            iZ = Z();
        }
        if (iZ < 8 || iZ > 11) {
            return -1;
        }
        if (iZ == 11) {
            return b0(this.f32420l, bVar);
        }
        int iL3 = this.f32415g.l3(bVar.b);
        if (iL3 != -1) {
            this.f32417i = 0;
            int[] iArr = this.f32395d;
            int i10 = this.f32393a - 1;
            iArr[i10] = iArr[i10] + 1;
            return iL3;
        }
        String strR = r();
        int iB0 = b0(strR, bVar);
        if (iB0 == -1) {
            this.f32417i = 11;
            this.f32420l = strR;
            int[] iArr2 = this.f32395d;
            int i11 = this.f32393a - 1;
            iArr2[i11] = iArr2[i11] - 1;
        }
        return iB0;
    }

    @Override // um.m
    public void M() throws k, EOFException {
        if (this.f32397f) {
            m.c cVarU = u();
            n();
            throw new j("Cannot skip unexpected " + cVarU + " at " + getPath());
        }
        int iZ = this.f32417i;
        if (iZ == 0) {
            iZ = Z();
        }
        if (iZ == 14) {
            D0();
        } else if (iZ == 13) {
            y0(f32411o);
        } else if (iZ == 12) {
            y0(f32410n);
        } else if (iZ != 15) {
            throw new j("Expected a name but was " + u() + " at path " + getPath());
        }
        this.f32417i = 0;
        this.f32394c[this.f32393a - 1] = "null";
    }

    @Override // um.m
    public void P() throws k, EOFException {
        if (this.f32397f) {
            throw new j("Cannot skip unexpected " + u() + " at " + getPath());
        }
        int i10 = 0;
        do {
            int iZ = this.f32417i;
            if (iZ == 0) {
                iZ = Z();
            }
            if (iZ == 3) {
                y(1);
            } else {
                if (iZ == 1) {
                    y(3);
                } else if (iZ == 4) {
                    i10--;
                    if (i10 < 0) {
                        throw new j("Expected a value but was " + u() + " at path " + getPath());
                    }
                    this.f32393a--;
                } else if (iZ == 2) {
                    i10--;
                    if (i10 < 0) {
                        throw new j("Expected a value but was " + u() + " at path " + getPath());
                    }
                    this.f32393a--;
                } else if (iZ == 14 || iZ == 10) {
                    D0();
                } else if (iZ == 9 || iZ == 13) {
                    y0(f32411o);
                } else if (iZ == 8 || iZ == 12) {
                    y0(f32410n);
                } else if (iZ == 17) {
                    this.f32416h.skip(this.f32419k);
                } else if (iZ == 18) {
                    throw new j("Expected a value but was " + u() + " at path " + getPath());
                }
                this.f32417i = 0;
            }
            i10++;
            this.f32417i = 0;
        } while (i10 != 0);
        int[] iArr = this.f32395d;
        int i11 = this.f32393a;
        int i12 = i11 - 1;
        iArr[i12] = iArr[i12] + 1;
        this.f32394c[i11 - 1] = "null";
    }

    public final void Y() throws k {
        if (!this.f32396e) {
            throw U("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    public final int Z() throws k, EOFException {
        int[] iArr = this.b;
        int i10 = this.f32393a;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int iF0 = f0(true);
            this.f32416h.readByte();
            if (iF0 != 44) {
                if (iF0 != 59) {
                    if (iF0 != 93) {
                        throw U("Unterminated array");
                    }
                    this.f32417i = 4;
                    return 4;
                }
                Y();
            }
        } else {
            if (i11 == 3 || i11 == 5) {
                iArr[i10 - 1] = 4;
                if (i11 == 5) {
                    int iF1 = f0(true);
                    this.f32416h.readByte();
                    if (iF1 != 44) {
                        if (iF1 != 59) {
                            if (iF1 != 125) {
                                throw U("Unterminated object");
                            }
                            this.f32417i = 2;
                            return 2;
                        }
                        Y();
                    }
                }
                int iF2 = f0(true);
                if (iF2 == 34) {
                    this.f32416h.readByte();
                    this.f32417i = 13;
                    return 13;
                }
                if (iF2 == 39) {
                    this.f32416h.readByte();
                    Y();
                    this.f32417i = 12;
                    return 12;
                }
                if (iF2 != 125) {
                    Y();
                    if (!e0((char) iF2)) {
                        throw U("Expected name");
                    }
                    this.f32417i = 14;
                    return 14;
                }
                if (i11 == 5) {
                    throw U("Expected name");
                }
                this.f32416h.readByte();
                this.f32417i = 2;
                return 2;
            }
            if (i11 == 4) {
                iArr[i10 - 1] = 5;
                int iF3 = f0(true);
                this.f32416h.readByte();
                if (iF3 != 58) {
                    if (iF3 != 61) {
                        throw U("Expected ':'");
                    }
                    Y();
                    if (this.f32415g.request(1L) && this.f32416h.j(0L) == 62) {
                        this.f32416h.readByte();
                    }
                }
            } else if (i11 == 6) {
                iArr[i10 - 1] = 7;
            } else if (i11 == 7) {
                if (f0(false) == -1) {
                    this.f32417i = 18;
                    return 18;
                }
                Y();
            } else {
                if (i11 == 9) {
                    this.f32421m.b();
                    this.f32421m = null;
                    this.f32393a--;
                    return Z();
                }
                if (i11 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
            }
        }
        int iF4 = f0(true);
        if (iF4 == 34) {
            this.f32416h.readByte();
            this.f32417i = 9;
            return 9;
        }
        if (iF4 == 39) {
            Y();
            this.f32416h.readByte();
            this.f32417i = 8;
            return 8;
        }
        if (iF4 != 44 && iF4 != 59) {
            if (iF4 == 91) {
                this.f32416h.readByte();
                this.f32417i = 3;
                return 3;
            }
            if (iF4 != 93) {
                if (iF4 == 123) {
                    this.f32416h.readByte();
                    this.f32417i = 1;
                    return 1;
                }
                int iR0 = r0();
                if (iR0 != 0) {
                    return iR0;
                }
                int iT0 = t0();
                if (iT0 != 0) {
                    return iT0;
                }
                if (!e0(this.f32416h.j(0L))) {
                    throw U("Expected value");
                }
                Y();
                this.f32417i = 10;
                return 10;
            }
            if (i11 == 1) {
                this.f32416h.readByte();
                this.f32417i = 4;
                return 4;
            }
        }
        if (i11 != 1 && i11 != 2) {
            throw U("Unexpected value");
        }
        Y();
        this.f32417i = 7;
        return 7;
    }

    @Override // um.m
    public void a() throws k, EOFException {
        int iZ = this.f32417i;
        if (iZ == 0) {
            iZ = Z();
        }
        if (iZ == 3) {
            y(1);
            this.f32395d[this.f32393a - 1] = 0;
            this.f32417i = 0;
        } else {
            throw new j("Expected BEGIN_ARRAY but was " + u() + " at path " + getPath());
        }
    }

    public final int a0(String str, m.b bVar) {
        int length = bVar.f32399a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(bVar.f32399a[i10])) {
                this.f32417i = 0;
                this.f32394c[this.f32393a - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    @Override // um.m
    public void b() throws k, EOFException {
        int iZ = this.f32417i;
        if (iZ == 0) {
            iZ = Z();
        }
        if (iZ == 1) {
            y(3);
            this.f32417i = 0;
            return;
        }
        throw new j("Expected BEGIN_OBJECT but was " + u() + " at path " + getPath());
    }

    public final int b0(String str, m.b bVar) {
        int length = bVar.f32399a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(bVar.f32399a[i10])) {
                this.f32417i = 0;
                int[] iArr = this.f32395d;
                int i11 = this.f32393a - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
        }
        return -1;
    }

    @Override // um.m
    public void c() throws k, EOFException {
        int iZ = this.f32417i;
        if (iZ == 0) {
            iZ = Z();
        }
        if (iZ != 4) {
            throw new j("Expected END_ARRAY but was " + u() + " at path " + getPath());
        }
        int i10 = this.f32393a;
        this.f32393a = i10 - 1;
        int[] iArr = this.f32395d;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f32417i = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        this.f32417i = 0;
        this.b[0] = 8;
        this.f32393a = 1;
        this.f32416h.a();
        this.f32415g.close();
    }

    @Override // um.m
    public void d() throws k, EOFException {
        int iZ = this.f32417i;
        if (iZ == 0) {
            iZ = Z();
        }
        if (iZ != 2) {
            throw new j("Expected END_OBJECT but was " + u() + " at path " + getPath());
        }
        int i10 = this.f32393a;
        int i11 = i10 - 1;
        this.f32393a = i11;
        this.f32394c[i11] = null;
        int[] iArr = this.f32395d;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f32417i = 0;
    }

    public final boolean e0(int i10) throws k {
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
        Y();
        return false;
    }

    @Override // um.m
    public boolean f() throws k, EOFException {
        int iZ = this.f32417i;
        if (iZ == 0) {
            iZ = Z();
        }
        return (iZ == 2 || iZ == 4 || iZ == 18) ? false : true;
    }

    public final int f0(boolean z10) throws k, EOFException {
        byte bJ;
        while (true) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (!this.f32415g.request(i11)) {
                    if (z10) {
                        throw new EOFException("End of input");
                    }
                    return -1;
                }
                bJ = this.f32416h.j(i10);
                if (bJ == 10 || bJ == 32 || bJ == 13 || bJ == 9) {
                    i10 = i11;
                }
            }
            this.f32416h.skip(i10);
            if (bJ == 47) {
                if (this.f32415g.request(2L)) {
                    Y();
                    byte bJ2 = this.f32416h.j(1L);
                    if (bJ2 == 42) {
                        this.f32416h.readByte();
                        this.f32416h.readByte();
                        if (!z0()) {
                            throw U("Unterminated comment");
                        }
                    } else if (bJ2 == 47) {
                        this.f32416h.readByte();
                        this.f32416h.readByte();
                        A0();
                    }
                }
                return bJ;
            }
            if (bJ != 35) {
                return bJ;
            }
            Y();
            A0();
        }
    }

    @Override // um.m
    public boolean h() throws k, EOFException {
        int iZ = this.f32417i;
        if (iZ == 0) {
            iZ = Z();
        }
        if (iZ == 5) {
            this.f32417i = 0;
            int[] iArr = this.f32395d;
            int i10 = this.f32393a - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iZ == 6) {
            this.f32417i = 0;
            int[] iArr2 = this.f32395d;
            int i11 = this.f32393a - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        }
        throw new j("Expected a boolean but was " + u() + " at path " + getPath());
    }

    public final String i0(xu.h hVar) throws k, EOFException {
        StringBuilder sb2 = null;
        while (true) {
            long jH0 = this.f32415g.h0(hVar);
            if (jH0 == -1) {
                throw U("Unterminated string");
            }
            if (this.f32416h.j(jH0) != 92) {
                if (sb2 == null) {
                    String strG1 = this.f32416h.G1(jH0);
                    this.f32416h.readByte();
                    return strG1;
                }
                sb2.append(this.f32416h.G1(jH0));
                this.f32416h.readByte();
                return sb2.toString();
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(this.f32416h.G1(jH0));
            this.f32416h.readByte();
            sb2.append(x0());
        }
    }

    @Override // um.m
    public double j() throws k, EOFException {
        int iZ = this.f32417i;
        if (iZ == 0) {
            iZ = Z();
        }
        if (iZ == 16) {
            this.f32417i = 0;
            int[] iArr = this.f32395d;
            int i10 = this.f32393a - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f32418j;
        }
        if (iZ == 17) {
            this.f32420l = this.f32416h.G1(this.f32419k);
        } else if (iZ == 9) {
            this.f32420l = i0(f32411o);
        } else if (iZ == 8) {
            this.f32420l = i0(f32410n);
        } else if (iZ == 10) {
            this.f32420l = l0();
        } else if (iZ != 11) {
            throw new j("Expected a double but was " + u() + " at path " + getPath());
        }
        this.f32417i = 11;
        try {
            double d10 = Double.parseDouble(this.f32420l);
            if (this.f32396e || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
                this.f32420l = null;
                this.f32417i = 0;
                int[] iArr2 = this.f32395d;
                int i11 = this.f32393a - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return d10;
            }
            throw new k("JSON forbids NaN and infinities: " + d10 + " at path " + getPath());
        } catch (NumberFormatException unused) {
            throw new j("Expected a double but was " + this.f32420l + " at path " + getPath());
        }
    }

    @Override // um.m
    public int l() throws k, EOFException {
        int iZ = this.f32417i;
        if (iZ == 0) {
            iZ = Z();
        }
        if (iZ == 16) {
            long j10 = this.f32418j;
            int i10 = (int) j10;
            if (j10 == i10) {
                this.f32417i = 0;
                int[] iArr = this.f32395d;
                int i11 = this.f32393a - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new j("Expected an int but was " + this.f32418j + " at path " + getPath());
        }
        if (iZ == 17) {
            this.f32420l = this.f32416h.G1(this.f32419k);
        } else if (iZ == 9 || iZ == 8) {
            String strI0 = iZ == 9 ? i0(f32411o) : i0(f32410n);
            this.f32420l = strI0;
            try {
                int i12 = Integer.parseInt(strI0);
                this.f32417i = 0;
                int[] iArr2 = this.f32395d;
                int i13 = this.f32393a - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        } else if (iZ != 11) {
            throw new j("Expected an int but was " + u() + " at path " + getPath());
        }
        this.f32417i = 11;
        try {
            double d10 = Double.parseDouble(this.f32420l);
            int i14 = (int) d10;
            if (i14 == d10) {
                this.f32420l = null;
                this.f32417i = 0;
                int[] iArr3 = this.f32395d;
                int i15 = this.f32393a - 1;
                iArr3[i15] = iArr3[i15] + 1;
                return i14;
            }
            throw new j("Expected an int but was " + this.f32420l + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new j("Expected an int but was " + this.f32420l + " at path " + getPath());
        }
    }

    public final String l0() {
        long jH0 = this.f32415g.h0(f32412p);
        return jH0 != -1 ? this.f32416h.G1(jH0) : this.f32416h.R2();
    }

    @Override // um.m
    public long m() throws k, EOFException {
        int iZ = this.f32417i;
        if (iZ == 0) {
            iZ = Z();
        }
        if (iZ == 16) {
            this.f32417i = 0;
            int[] iArr = this.f32395d;
            int i10 = this.f32393a - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f32418j;
        }
        if (iZ == 17) {
            this.f32420l = this.f32416h.G1(this.f32419k);
        } else if (iZ == 9 || iZ == 8) {
            String strI0 = iZ == 9 ? i0(f32411o) : i0(f32410n);
            this.f32420l = strI0;
            try {
                long j10 = Long.parseLong(strI0);
                this.f32417i = 0;
                int[] iArr2 = this.f32395d;
                int i11 = this.f32393a - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return j10;
            } catch (NumberFormatException unused) {
            }
        } else if (iZ != 11) {
            throw new j("Expected a long but was " + u() + " at path " + getPath());
        }
        this.f32417i = 11;
        try {
            long jLongValueExact = new BigDecimal(this.f32420l).longValueExact();
            this.f32420l = null;
            this.f32417i = 0;
            int[] iArr3 = this.f32395d;
            int i12 = this.f32393a - 1;
            iArr3[i12] = iArr3[i12] + 1;
            return jLongValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            throw new j("Expected a long but was " + this.f32420l + " at path " + getPath());
        }
    }

    @Override // um.m
    public String n() throws k, EOFException {
        String strI0;
        int iZ = this.f32417i;
        if (iZ == 0) {
            iZ = Z();
        }
        if (iZ == 14) {
            strI0 = l0();
        } else if (iZ == 13) {
            strI0 = i0(f32411o);
        } else if (iZ == 12) {
            strI0 = i0(f32410n);
        } else {
            if (iZ != 15) {
                throw new j("Expected a name but was " + u() + " at path " + getPath());
            }
            strI0 = this.f32420l;
            this.f32420l = null;
        }
        this.f32417i = 0;
        this.f32394c[this.f32393a - 1] = strI0;
        return strI0;
    }

    @Override // um.m
    public <T> T o() throws k, EOFException {
        int iZ = this.f32417i;
        if (iZ == 0) {
            iZ = Z();
        }
        if (iZ == 7) {
            this.f32417i = 0;
            int[] iArr = this.f32395d;
            int i10 = this.f32393a - 1;
            iArr[i10] = iArr[i10] + 1;
            return null;
        }
        throw new j("Expected null but was " + u() + " at path " + getPath());
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00bd  */
    @Override // um.m
    public xu.g q() throws IOException {
        int i10;
        int iZ = this.f32417i;
        if (iZ == 0) {
            iZ = Z();
        }
        xu.e eVar = new xu.e();
        xu.h hVar = r.f32436m;
        if (iZ != 3) {
            if (iZ == 1) {
                eVar.C0("{");
                hVar = r.f32431h;
            } else {
                if (iZ == 9) {
                    eVar.C0("\"");
                    hVar = r.f32433j;
                } else if (iZ == 8) {
                    eVar.C0("'");
                    hVar = r.f32432i;
                } else if (iZ == 17 || iZ == 16 || iZ == 10) {
                    eVar.C0(r());
                } else if (iZ == 5) {
                    eVar.C0("true");
                } else if (iZ == 6) {
                    eVar.C0("false");
                } else if (iZ == 7) {
                    eVar.C0("null");
                } else {
                    if (iZ != 11) {
                        throw new j("Expected a value but was " + u() + " at path " + getPath());
                    }
                    String strR = r();
                    t tVarQ = t.q(eVar);
                    try {
                        tVarQ.M(strR);
                        tVarQ.close();
                    } catch (Throwable th2) {
                        if (tVarQ != null) {
                            try {
                                tVarQ.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                }
                i10 = 0;
            }
            if (this.f32417i != 0) {
                int[] iArr = this.f32395d;
                int i11 = this.f32393a - 1;
                iArr[i11] = iArr[i11] + 1;
                this.f32417i = 0;
            }
            this.f32421m = new r(this.f32415g, eVar, hVar, i10);
            y(9);
            return b0.c(this.f32421m);
        }
        eVar.C0("[");
        hVar = r.f32431h;
        i10 = 1;
        if (this.f32417i != 0) {
            int[] iArr2 = this.f32395d;
            int i12 = this.f32393a - 1;
            iArr2[i12] = iArr2[i12] + 1;
            this.f32417i = 0;
        }
        this.f32421m = new r(this.f32415g, eVar, hVar, i10);
        y(9);
        return b0.c(this.f32421m);
    }

    @Override // um.m
    public String r() throws k, EOFException {
        String strG1;
        int iZ = this.f32417i;
        if (iZ == 0) {
            iZ = Z();
        }
        if (iZ == 10) {
            strG1 = l0();
        } else if (iZ == 9) {
            strG1 = i0(f32411o);
        } else if (iZ == 8) {
            strG1 = i0(f32410n);
        } else if (iZ == 11) {
            strG1 = this.f32420l;
            this.f32420l = null;
        } else if (iZ == 16) {
            strG1 = Long.toString(this.f32418j);
        } else {
            if (iZ != 17) {
                throw new j("Expected a string but was " + u() + " at path " + getPath());
            }
            strG1 = this.f32416h.G1(this.f32419k);
        }
        this.f32417i = 0;
        int[] iArr = this.f32395d;
        int i10 = this.f32393a - 1;
        iArr[i10] = iArr[i10] + 1;
        return strG1;
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
    public final int r0() throws EOFException {
        String str;
        String str2;
        int i10;
        byte bJ = this.f32416h.j(0L);
        if (bJ == 116 || bJ == 84) {
            str = "true";
            str2 = "TRUE";
            i10 = 5;
        } else if (bJ == 102 || bJ == 70) {
            str = "false";
            str2 = "FALSE";
            i10 = 6;
        } else {
            if (bJ != 110 && bJ != 78) {
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
            if (!this.f32415g.request(i12)) {
                return 0;
            }
            byte bJ2 = this.f32416h.j(i11);
            if (bJ2 != str.charAt(i11) && bJ2 != str2.charAt(i11)) {
                return 0;
            }
            i11 = i12;
        }
        if (this.f32415g.request(length + 1) && e0(this.f32416h.j(length))) {
            return 0;
        }
        this.f32416h.skip(length);
        this.f32417i = i10;
        return i10;
    }

    public final int t0() throws EOFException {
        long j10;
        int i10;
        boolean z10 = true;
        int i11 = 0;
        char c10 = 0;
        long j11 = 0;
        boolean z11 = false;
        while (true) {
            int i12 = i11 + 1;
            if (!this.f32415g.request(i12)) {
                j10 = 0;
                i10 = 0;
                break;
            }
            j10 = 0;
            byte bJ = this.f32416h.j(i11);
            i10 = 0;
            if (bJ != 43) {
                if (bJ == 69 || bJ == 101) {
                    if (c10 != 2 && c10 != 4) {
                        return 0;
                    }
                    c10 = 5;
                } else if (bJ != 45) {
                    if (bJ != 46) {
                        if (bJ < 48 || bJ > 57) {
                            if (!e0(bJ)) {
                                break;
                            }
                            return 0;
                        }
                        if (c10 == 1 || c10 == 0) {
                            j11 = -(bJ - 48);
                            c10 = 2;
                        } else if (c10 == 2) {
                            if (j11 == 0) {
                                return 0;
                            }
                            long j12 = (10 * j11) - ((long) (bJ - 48));
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
            this.f32418j = j11;
            this.f32416h.skip(i11);
            this.f32417i = 16;
            return 16;
        }
        if (c10 != 2 && c10 != 4 && c10 != 7) {
            return i10;
        }
        this.f32419k = i11;
        this.f32417i = 17;
        return 17;
    }

    public String toString() {
        return "JsonReader(" + this.f32415g + ")";
    }

    @Override // um.m
    public m.c u() throws k, EOFException {
        int iZ = this.f32417i;
        if (iZ == 0) {
            iZ = Z();
        }
        switch (iZ) {
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
            case 18:
                return m.c.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // um.m
    public m v() {
        return new o(this);
    }

    @Override // um.m
    public void w() {
        if (f()) {
            this.f32420l = n();
            this.f32417i = 11;
        }
    }

    public final char x0() throws k, EOFException {
        int i10;
        if (!this.f32415g.request(1L)) {
            throw U("Unterminated escape sequence");
        }
        byte b = this.f32416h.readByte();
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
            if (this.f32396e) {
                return (char) b;
            }
            throw U("Invalid escape sequence: \\" + ((char) b));
        }
        if (!this.f32415g.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            byte bJ = this.f32416h.j(i11);
            char c11 = (char) (c10 << 4);
            if (bJ >= 48 && bJ <= 57) {
                i10 = bJ - 48;
            } else if (bJ >= 97 && bJ <= 102) {
                i10 = bJ - 87;
            } else {
                if (bJ < 65 || bJ > 70) {
                    throw U("\\u" + this.f32416h.G1(4L));
                }
                i10 = bJ - 55;
            }
            c10 = (char) (c11 + i10);
        }
        this.f32416h.skip(4L);
        return c10;
    }

    public final void y0(xu.h hVar) throws k, EOFException {
        while (true) {
            long jH0 = this.f32415g.h0(hVar);
            if (jH0 == -1) {
                throw U("Unterminated string");
            }
            if (this.f32416h.j(jH0) != 92) {
                this.f32416h.skip(jH0 + 1);
                return;
            } else {
                this.f32416h.skip(jH0 + 1);
                x0();
            }
        }
    }

    public final boolean z0() throws EOFException {
        xu.g gVar = this.f32415g;
        xu.h hVar = f32414r;
        long jV = gVar.V(hVar);
        boolean z10 = jV != -1;
        xu.e eVar = this.f32416h;
        eVar.skip(z10 ? jV + ((long) hVar.I()) : eVar.getSize());
        return z10;
    }

    public o(o oVar) {
        super(oVar);
        this.f32417i = 0;
        xu.g gVarPeek = oVar.f32415g.peek();
        this.f32415g = gVarPeek;
        this.f32416h = gVarPeek.getBufferField();
        this.f32417i = oVar.f32417i;
        this.f32418j = oVar.f32418j;
        this.f32419k = oVar.f32419k;
        this.f32420l = oVar.f32420l;
        try {
            gVarPeek.w1(oVar.f32416h.getSize());
        } catch (IOException unused) {
            throw new AssertionError();
        }
    }
}
