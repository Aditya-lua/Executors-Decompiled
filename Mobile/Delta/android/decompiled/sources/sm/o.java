package sm;

import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;
import vu.b0;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends m {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final vu.h f31600n = vu.h.e("'\\");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final vu.h f31601o = vu.h.e("\"\\");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final vu.h f31602p = vu.h.e("{}[]:, \n\t\r\f/\\;#=");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final vu.h f31603q = vu.h.e("\n\r");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final vu.h f31604r = vu.h.e("*/");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final vu.g f31605g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final vu.e f31606h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f31607i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f31608j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f31609k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f31610l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public r f31611m;

    public o(vu.g gVar) {
        this.f31607i = 0;
        if (gVar == null) {
            throw new NullPointerException("source == null");
        }
        this.f31605g = gVar;
        this.f31606h = gVar.getBufferField();
        x(6);
    }

    @Override // sm.m
    public int F(m.b bVar) throws k, EOFException {
        int iY = this.f31607i;
        if (iY == 0) {
            iY = Y();
        }
        if (iY < 12 || iY > 15) {
            return -1;
        }
        if (iY == 15) {
            return Z(this.f31610l, bVar);
        }
        int iJ1 = this.f31605g.J1(bVar.b);
        if (iJ1 != -1) {
            this.f31607i = 0;
            this.f31584c[this.f31583a - 1] = bVar.f31589a[iJ1];
            return iJ1;
        }
        String str = this.f31584c[this.f31583a - 1];
        String strN = n();
        int iZ = Z(strN, bVar);
        if (iZ == -1) {
            this.f31607i = 15;
            this.f31610l = strN;
            this.f31584c[this.f31583a - 1] = str;
        }
        return iZ;
    }

    @Override // sm.m
    public int H(m.b bVar) throws k, EOFException {
        int iY = this.f31607i;
        if (iY == 0) {
            iY = Y();
        }
        if (iY < 8 || iY > 11) {
            return -1;
        }
        if (iY == 11) {
            return a0(this.f31610l, bVar);
        }
        int iJ1 = this.f31605g.J1(bVar.b);
        if (iJ1 != -1) {
            this.f31607i = 0;
            int[] iArr = this.f31585d;
            int i10 = this.f31583a - 1;
            iArr[i10] = iArr[i10] + 1;
            return iJ1;
        }
        String strR = r();
        int iA0 = a0(strR, bVar);
        if (iA0 == -1) {
            this.f31607i = 11;
            this.f31610l = strR;
            int[] iArr2 = this.f31585d;
            int i11 = this.f31583a - 1;
            iArr2[i11] = iArr2[i11] - 1;
        }
        return iA0;
    }

    @Override // sm.m
    public void M() throws k, EOFException {
        if (this.f31587f) {
            m.c cVarU = u();
            n();
            throw new j("Cannot skip unexpected " + cVarU + " at " + getPath());
        }
        int iY = this.f31607i;
        if (iY == 0) {
            iY = Y();
        }
        if (iY == 14) {
            z0();
        } else if (iY == 13) {
            u0(f31601o);
        } else if (iY == 12) {
            u0(f31600n);
        } else if (iY != 15) {
            throw new j("Expected a name but was " + u() + " at path " + getPath());
        }
        this.f31607i = 0;
        this.f31584c[this.f31583a - 1] = "null";
    }

    @Override // sm.m
    public void P() throws k, EOFException {
        if (this.f31587f) {
            throw new j("Cannot skip unexpected " + u() + " at " + getPath());
        }
        int i10 = 0;
        do {
            int iY = this.f31607i;
            if (iY == 0) {
                iY = Y();
            }
            if (iY == 3) {
                x(1);
            } else {
                if (iY == 1) {
                    x(3);
                } else if (iY == 4) {
                    i10--;
                    if (i10 < 0) {
                        throw new j("Expected a value but was " + u() + " at path " + getPath());
                    }
                    this.f31583a--;
                } else if (iY == 2) {
                    i10--;
                    if (i10 < 0) {
                        throw new j("Expected a value but was " + u() + " at path " + getPath());
                    }
                    this.f31583a--;
                } else if (iY == 14 || iY == 10) {
                    z0();
                } else if (iY == 9 || iY == 13) {
                    u0(f31601o);
                } else if (iY == 8 || iY == 12) {
                    u0(f31600n);
                } else if (iY == 17) {
                    this.f31606h.skip(this.f31609k);
                } else if (iY == 18) {
                    throw new j("Expected a value but was " + u() + " at path " + getPath());
                }
                this.f31607i = 0;
            }
            i10++;
            this.f31607i = 0;
        } while (i10 != 0);
        int[] iArr = this.f31585d;
        int i11 = this.f31583a;
        int i12 = i11 - 1;
        iArr[i12] = iArr[i12] + 1;
        this.f31584c[i11 - 1] = "null";
    }

    public final void X() throws k {
        if (!this.f31586e) {
            throw U("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    public final int Y() throws k, EOFException {
        int[] iArr = this.b;
        int i10 = this.f31583a;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int iD0 = d0(true);
            this.f31606h.readByte();
            if (iD0 != 44) {
                if (iD0 != 59) {
                    if (iD0 != 93) {
                        throw U("Unterminated array");
                    }
                    this.f31607i = 4;
                    return 4;
                }
                X();
            }
        } else {
            if (i11 == 3 || i11 == 5) {
                iArr[i10 - 1] = 4;
                if (i11 == 5) {
                    int iD1 = d0(true);
                    this.f31606h.readByte();
                    if (iD1 != 44) {
                        if (iD1 != 59) {
                            if (iD1 != 125) {
                                throw U("Unterminated object");
                            }
                            this.f31607i = 2;
                            return 2;
                        }
                        X();
                    }
                }
                int iD2 = d0(true);
                if (iD2 == 34) {
                    this.f31606h.readByte();
                    this.f31607i = 13;
                    return 13;
                }
                if (iD2 == 39) {
                    this.f31606h.readByte();
                    X();
                    this.f31607i = 12;
                    return 12;
                }
                if (iD2 != 125) {
                    X();
                    if (!c0((char) iD2)) {
                        throw U("Expected name");
                    }
                    this.f31607i = 14;
                    return 14;
                }
                if (i11 == 5) {
                    throw U("Expected name");
                }
                this.f31606h.readByte();
                this.f31607i = 2;
                return 2;
            }
            if (i11 == 4) {
                iArr[i10 - 1] = 5;
                int iD3 = d0(true);
                this.f31606h.readByte();
                if (iD3 != 58) {
                    if (iD3 != 61) {
                        throw U("Expected ':'");
                    }
                    X();
                    if (this.f31605g.request(1L) && this.f31606h.j(0L) == 62) {
                        this.f31606h.readByte();
                    }
                }
            } else if (i11 == 6) {
                iArr[i10 - 1] = 7;
            } else if (i11 == 7) {
                if (d0(false) == -1) {
                    this.f31607i = 18;
                    return 18;
                }
                X();
            } else {
                if (i11 == 9) {
                    this.f31611m.b();
                    this.f31611m = null;
                    this.f31583a--;
                    return Y();
                }
                if (i11 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
            }
        }
        int iD4 = d0(true);
        if (iD4 == 34) {
            this.f31606h.readByte();
            this.f31607i = 9;
            return 9;
        }
        if (iD4 == 39) {
            X();
            this.f31606h.readByte();
            this.f31607i = 8;
            return 8;
        }
        if (iD4 != 44 && iD4 != 59) {
            if (iD4 == 91) {
                this.f31606h.readByte();
                this.f31607i = 3;
                return 3;
            }
            if (iD4 != 93) {
                if (iD4 == 123) {
                    this.f31606h.readByte();
                    this.f31607i = 1;
                    return 1;
                }
                int iN0 = n0();
                if (iN0 != 0) {
                    return iN0;
                }
                int iP0 = p0();
                if (iP0 != 0) {
                    return iP0;
                }
                if (!c0(this.f31606h.j(0L))) {
                    throw U("Expected value");
                }
                X();
                this.f31607i = 10;
                return 10;
            }
            if (i11 == 1) {
                this.f31606h.readByte();
                this.f31607i = 4;
                return 4;
            }
        }
        if (i11 != 1 && i11 != 2) {
            throw U("Unexpected value");
        }
        X();
        this.f31607i = 7;
        return 7;
    }

    public final int Z(String str, m.b bVar) {
        int length = bVar.f31589a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(bVar.f31589a[i10])) {
                this.f31607i = 0;
                this.f31584c[this.f31583a - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    @Override // sm.m
    public void a() throws k, EOFException {
        int iY = this.f31607i;
        if (iY == 0) {
            iY = Y();
        }
        if (iY == 3) {
            x(1);
            this.f31585d[this.f31583a - 1] = 0;
            this.f31607i = 0;
        } else {
            throw new j("Expected BEGIN_ARRAY but was " + u() + " at path " + getPath());
        }
    }

    public final int a0(String str, m.b bVar) {
        int length = bVar.f31589a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(bVar.f31589a[i10])) {
                this.f31607i = 0;
                int[] iArr = this.f31585d;
                int i11 = this.f31583a - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
        }
        return -1;
    }

    @Override // sm.m
    public void b() throws k, EOFException {
        int iY = this.f31607i;
        if (iY == 0) {
            iY = Y();
        }
        if (iY == 1) {
            x(3);
            this.f31607i = 0;
            return;
        }
        throw new j("Expected BEGIN_OBJECT but was " + u() + " at path " + getPath());
    }

    @Override // sm.m
    public void c() throws k, EOFException {
        int iY = this.f31607i;
        if (iY == 0) {
            iY = Y();
        }
        if (iY != 4) {
            throw new j("Expected END_ARRAY but was " + u() + " at path " + getPath());
        }
        int i10 = this.f31583a;
        this.f31583a = i10 - 1;
        int[] iArr = this.f31585d;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f31607i = 0;
    }

    public final boolean c0(int i10) throws k {
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
        X();
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        this.f31607i = 0;
        this.b[0] = 8;
        this.f31583a = 1;
        this.f31606h.a();
        this.f31605g.close();
    }

    @Override // sm.m
    public void d() throws k, EOFException {
        int iY = this.f31607i;
        if (iY == 0) {
            iY = Y();
        }
        if (iY != 2) {
            throw new j("Expected END_OBJECT but was " + u() + " at path " + getPath());
        }
        int i10 = this.f31583a;
        int i11 = i10 - 1;
        this.f31583a = i11;
        this.f31584c[i11] = null;
        int[] iArr = this.f31585d;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f31607i = 0;
    }

    public final int d0(boolean z10) throws k, EOFException {
        byte bJ;
        while (true) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (!this.f31605g.request(i11)) {
                    if (z10) {
                        throw new EOFException("End of input");
                    }
                    return -1;
                }
                bJ = this.f31606h.j(i10);
                if (bJ == 10 || bJ == 32 || bJ == 13 || bJ == 9) {
                    i10 = i11;
                }
            }
            this.f31606h.skip(i10);
            if (bJ == 47) {
                if (this.f31605g.request(2L)) {
                    X();
                    byte bJ2 = this.f31606h.j(1L);
                    if (bJ2 == 42) {
                        this.f31606h.readByte();
                        this.f31606h.readByte();
                        if (!v0()) {
                            throw U("Unterminated comment");
                        }
                    } else if (bJ2 == 47) {
                        this.f31606h.readByte();
                        this.f31606h.readByte();
                        w0();
                    }
                }
                return bJ;
            }
            if (bJ != 35) {
                return bJ;
            }
            X();
            w0();
        }
    }

    @Override // sm.m
    public boolean f() throws k, EOFException {
        int iY = this.f31607i;
        if (iY == 0) {
            iY = Y();
        }
        return (iY == 2 || iY == 4 || iY == 18) ? false : true;
    }

    public final String f0(vu.h hVar) throws k, EOFException {
        StringBuilder sb2 = null;
        while (true) {
            long jE1 = this.f31605g.e1(hVar);
            if (jE1 == -1) {
                throw U("Unterminated string");
            }
            if (this.f31606h.j(jE1) != 92) {
                if (sb2 == null) {
                    String strD1 = this.f31606h.D1(jE1);
                    this.f31606h.readByte();
                    return strD1;
                }
                sb2.append(this.f31606h.D1(jE1));
                this.f31606h.readByte();
                return sb2.toString();
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(this.f31606h.D1(jE1));
            this.f31606h.readByte();
            sb2.append(t0());
        }
    }

    @Override // sm.m
    public boolean h() throws k, EOFException {
        int iY = this.f31607i;
        if (iY == 0) {
            iY = Y();
        }
        if (iY == 5) {
            this.f31607i = 0;
            int[] iArr = this.f31585d;
            int i10 = this.f31583a - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iY == 6) {
            this.f31607i = 0;
            int[] iArr2 = this.f31585d;
            int i11 = this.f31583a - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        }
        throw new j("Expected a boolean but was " + u() + " at path " + getPath());
    }

    public final String i0() {
        long jE1 = this.f31605g.e1(f31602p);
        return jE1 != -1 ? this.f31606h.D1(jE1) : this.f31606h.Q2();
    }

    @Override // sm.m
    public double j() throws k, EOFException {
        int iY = this.f31607i;
        if (iY == 0) {
            iY = Y();
        }
        if (iY == 16) {
            this.f31607i = 0;
            int[] iArr = this.f31585d;
            int i10 = this.f31583a - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f31608j;
        }
        if (iY == 17) {
            this.f31610l = this.f31606h.D1(this.f31609k);
        } else if (iY == 9) {
            this.f31610l = f0(f31601o);
        } else if (iY == 8) {
            this.f31610l = f0(f31600n);
        } else if (iY == 10) {
            this.f31610l = i0();
        } else if (iY != 11) {
            throw new j("Expected a double but was " + u() + " at path " + getPath());
        }
        this.f31607i = 11;
        try {
            double d10 = Double.parseDouble(this.f31610l);
            if (this.f31586e || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
                this.f31610l = null;
                this.f31607i = 0;
                int[] iArr2 = this.f31585d;
                int i11 = this.f31583a - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return d10;
            }
            throw new k("JSON forbids NaN and infinities: " + d10 + " at path " + getPath());
        } catch (NumberFormatException unused) {
            throw new j("Expected a double but was " + this.f31610l + " at path " + getPath());
        }
    }

    @Override // sm.m
    public int l() throws k, EOFException {
        int iY = this.f31607i;
        if (iY == 0) {
            iY = Y();
        }
        if (iY == 16) {
            long j10 = this.f31608j;
            int i10 = (int) j10;
            if (j10 == i10) {
                this.f31607i = 0;
                int[] iArr = this.f31585d;
                int i11 = this.f31583a - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new j("Expected an int but was " + this.f31608j + " at path " + getPath());
        }
        if (iY == 17) {
            this.f31610l = this.f31606h.D1(this.f31609k);
        } else if (iY == 9 || iY == 8) {
            String strF0 = iY == 9 ? f0(f31601o) : f0(f31600n);
            this.f31610l = strF0;
            try {
                int i12 = Integer.parseInt(strF0);
                this.f31607i = 0;
                int[] iArr2 = this.f31585d;
                int i13 = this.f31583a - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        } else if (iY != 11) {
            throw new j("Expected an int but was " + u() + " at path " + getPath());
        }
        this.f31607i = 11;
        try {
            double d10 = Double.parseDouble(this.f31610l);
            int i14 = (int) d10;
            if (i14 == d10) {
                this.f31610l = null;
                this.f31607i = 0;
                int[] iArr3 = this.f31585d;
                int i15 = this.f31583a - 1;
                iArr3[i15] = iArr3[i15] + 1;
                return i14;
            }
            throw new j("Expected an int but was " + this.f31610l + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new j("Expected an int but was " + this.f31610l + " at path " + getPath());
        }
    }

    @Override // sm.m
    public long m() throws k, EOFException {
        int iY = this.f31607i;
        if (iY == 0) {
            iY = Y();
        }
        if (iY == 16) {
            this.f31607i = 0;
            int[] iArr = this.f31585d;
            int i10 = this.f31583a - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f31608j;
        }
        if (iY == 17) {
            this.f31610l = this.f31606h.D1(this.f31609k);
        } else if (iY == 9 || iY == 8) {
            String strF0 = iY == 9 ? f0(f31601o) : f0(f31600n);
            this.f31610l = strF0;
            try {
                long j10 = Long.parseLong(strF0);
                this.f31607i = 0;
                int[] iArr2 = this.f31585d;
                int i11 = this.f31583a - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return j10;
            } catch (NumberFormatException unused) {
            }
        } else if (iY != 11) {
            throw new j("Expected a long but was " + u() + " at path " + getPath());
        }
        this.f31607i = 11;
        try {
            long jLongValueExact = new BigDecimal(this.f31610l).longValueExact();
            this.f31610l = null;
            this.f31607i = 0;
            int[] iArr3 = this.f31585d;
            int i12 = this.f31583a - 1;
            iArr3[i12] = iArr3[i12] + 1;
            return jLongValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            throw new j("Expected a long but was " + this.f31610l + " at path " + getPath());
        }
    }

    @Override // sm.m
    public String n() throws k, EOFException {
        String strF0;
        int iY = this.f31607i;
        if (iY == 0) {
            iY = Y();
        }
        if (iY == 14) {
            strF0 = i0();
        } else if (iY == 13) {
            strF0 = f0(f31601o);
        } else if (iY == 12) {
            strF0 = f0(f31600n);
        } else {
            if (iY != 15) {
                throw new j("Expected a name but was " + u() + " at path " + getPath());
            }
            strF0 = this.f31610l;
            this.f31610l = null;
        }
        this.f31607i = 0;
        this.f31584c[this.f31583a - 1] = strF0;
        return strF0;
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
        byte bJ = this.f31606h.j(0L);
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
            if (!this.f31605g.request(i12)) {
                return 0;
            }
            byte bJ2 = this.f31606h.j(i11);
            if (bJ2 != str.charAt(i11) && bJ2 != str2.charAt(i11)) {
                return 0;
            }
            i11 = i12;
        }
        if (this.f31605g.request(length + 1) && c0(this.f31606h.j(length))) {
            return 0;
        }
        this.f31606h.skip(length);
        this.f31607i = i10;
        return i10;
    }

    @Override // sm.m
    public <T> T o() throws k, EOFException {
        int iY = this.f31607i;
        if (iY == 0) {
            iY = Y();
        }
        if (iY == 7) {
            this.f31607i = 0;
            int[] iArr = this.f31585d;
            int i10 = this.f31583a - 1;
            iArr[i10] = iArr[i10] + 1;
            return null;
        }
        throw new j("Expected null but was " + u() + " at path " + getPath());
    }

    public final int p0() throws EOFException {
        long j10;
        int i10;
        boolean z10 = true;
        int i11 = 0;
        char c10 = 0;
        long j11 = 0;
        boolean z11 = false;
        while (true) {
            int i12 = i11 + 1;
            if (!this.f31605g.request(i12)) {
                j10 = 0;
                i10 = 0;
                break;
            }
            j10 = 0;
            byte bJ = this.f31606h.j(i11);
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
                            if (!c0(bJ)) {
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
            this.f31608j = j11;
            this.f31606h.skip(i11);
            this.f31607i = 16;
            return 16;
        }
        if (c10 != 2 && c10 != 4 && c10 != 7) {
            return i10;
        }
        this.f31609k = i11;
        this.f31607i = 17;
        return 17;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00bd  */
    @Override // sm.m
    public vu.g q() throws IOException {
        int i10;
        int iY = this.f31607i;
        if (iY == 0) {
            iY = Y();
        }
        vu.e eVar = new vu.e();
        vu.h hVar = r.f31626m;
        if (iY != 3) {
            if (iY == 1) {
                eVar.y0("{");
                hVar = r.f31621h;
            } else {
                if (iY == 9) {
                    eVar.y0("\"");
                    hVar = r.f31623j;
                } else if (iY == 8) {
                    eVar.y0("'");
                    hVar = r.f31622i;
                } else if (iY == 17 || iY == 16 || iY == 10) {
                    eVar.y0(r());
                } else if (iY == 5) {
                    eVar.y0("true");
                } else if (iY == 6) {
                    eVar.y0("false");
                } else if (iY == 7) {
                    eVar.y0("null");
                } else {
                    if (iY != 11) {
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
            if (this.f31607i != 0) {
                int[] iArr = this.f31585d;
                int i11 = this.f31583a - 1;
                iArr[i11] = iArr[i11] + 1;
                this.f31607i = 0;
            }
            this.f31611m = new r(this.f31605g, eVar, hVar, i10);
            x(9);
            return b0.c(this.f31611m);
        }
        eVar.y0("[");
        hVar = r.f31621h;
        i10 = 1;
        if (this.f31607i != 0) {
            int[] iArr2 = this.f31585d;
            int i12 = this.f31583a - 1;
            iArr2[i12] = iArr2[i12] + 1;
            this.f31607i = 0;
        }
        this.f31611m = new r(this.f31605g, eVar, hVar, i10);
        x(9);
        return b0.c(this.f31611m);
    }

    @Override // sm.m
    public String r() throws k, EOFException {
        String strD1;
        int iY = this.f31607i;
        if (iY == 0) {
            iY = Y();
        }
        if (iY == 10) {
            strD1 = i0();
        } else if (iY == 9) {
            strD1 = f0(f31601o);
        } else if (iY == 8) {
            strD1 = f0(f31600n);
        } else if (iY == 11) {
            strD1 = this.f31610l;
            this.f31610l = null;
        } else if (iY == 16) {
            strD1 = Long.toString(this.f31608j);
        } else {
            if (iY != 17) {
                throw new j("Expected a string but was " + u() + " at path " + getPath());
            }
            strD1 = this.f31606h.D1(this.f31609k);
        }
        this.f31607i = 0;
        int[] iArr = this.f31585d;
        int i10 = this.f31583a - 1;
        iArr[i10] = iArr[i10] + 1;
        return strD1;
    }

    public final char t0() throws k, EOFException {
        int i10;
        if (!this.f31605g.request(1L)) {
            throw U("Unterminated escape sequence");
        }
        byte b = this.f31606h.readByte();
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
            if (this.f31586e) {
                return (char) b;
            }
            throw U("Invalid escape sequence: \\" + ((char) b));
        }
        if (!this.f31605g.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            byte bJ = this.f31606h.j(i11);
            char c11 = (char) (c10 << 4);
            if (bJ >= 48 && bJ <= 57) {
                i10 = bJ - 48;
            } else if (bJ >= 97 && bJ <= 102) {
                i10 = bJ - 87;
            } else {
                if (bJ < 65 || bJ > 70) {
                    throw U("\\u" + this.f31606h.D1(4L));
                }
                i10 = bJ - 55;
            }
            c10 = (char) (c11 + i10);
        }
        this.f31606h.skip(4L);
        return c10;
    }

    public String toString() {
        return "JsonReader(" + this.f31605g + ")";
    }

    @Override // sm.m
    public m.c u() throws k, EOFException {
        int iY = this.f31607i;
        if (iY == 0) {
            iY = Y();
        }
        switch (iY) {
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

    public final void u0(vu.h hVar) throws k, EOFException {
        while (true) {
            long jE1 = this.f31605g.e1(hVar);
            if (jE1 == -1) {
                throw U("Unterminated string");
            }
            if (this.f31606h.j(jE1) != 92) {
                this.f31606h.skip(jE1 + 1);
                return;
            } else {
                this.f31606h.skip(jE1 + 1);
                t0();
            }
        }
    }

    @Override // sm.m
    public m v() {
        return new o(this);
    }

    public final boolean v0() throws EOFException {
        vu.g gVar = this.f31605g;
        vu.h hVar = f31604r;
        long jR1 = gVar.R1(hVar);
        boolean z10 = jR1 != -1;
        vu.e eVar = this.f31606h;
        eVar.skip(z10 ? jR1 + ((long) hVar.I()) : eVar.getSize());
        return z10;
    }

    @Override // sm.m
    public void w() {
        if (f()) {
            this.f31610l = n();
            this.f31607i = 11;
        }
    }

    public final void w0() throws EOFException {
        long jE1 = this.f31605g.e1(f31603q);
        vu.e eVar = this.f31606h;
        eVar.skip(jE1 != -1 ? jE1 + 1 : eVar.getSize());
    }

    public final void z0() throws EOFException {
        long jE1 = this.f31605g.e1(f31602p);
        vu.e eVar = this.f31606h;
        if (jE1 == -1) {
            jE1 = eVar.getSize();
        }
        eVar.skip(jE1);
    }

    public o(o oVar) {
        super(oVar);
        this.f31607i = 0;
        vu.g gVarPeek = oVar.f31605g.peek();
        this.f31605g = gVarPeek;
        this.f31606h = gVarPeek.getBufferField();
        this.f31607i = oVar.f31607i;
        this.f31608j = oVar.f31608j;
        this.f31609k = oVar.f31609k;
        this.f31610l = oVar.f31610l;
        try {
            gVarPeek.u1(oVar.f31606h.getSize());
        } catch (IOException unused) {
            throw new AssertionError();
        }
    }
}
