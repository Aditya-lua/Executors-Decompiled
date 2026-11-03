package r7;

import java.io.EOFException;
import vu.g;
import vu.h;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h f30214n = h.e("'\\");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final h f30215o = h.e("\"\\");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final h f30216p = h.e("{}[]:, \n\t\r\f/\\;#=");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final h f30217q = h.e("\n\r");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final h f30218r = h.e("*/");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f30219h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final vu.e f30220i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f30221j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f30222k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f30223l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f30224m;

    public e(g gVar) {
        if (gVar == null) {
            throw new NullPointerException("source == null");
        }
        this.f30219h = gVar;
        this.f30220i = gVar.getBufferField();
        q(6);
    }

    public final int A() throws EOFException, b {
        int[] iArr = this.b;
        int i10 = this.f30198a;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int I = I(true);
            this.f30220i.readByte();
            if (I != 44) {
                if (I != 59) {
                    if (I != 93) {
                        throw w("Unterminated array");
                    }
                    this.f30221j = 4;
                    return 4;
                }
                x();
            }
        } else {
            if (i11 == 3 || i11 == 5) {
                iArr[i10 - 1] = 4;
                if (i11 == 5) {
                    int I2 = I(true);
                    this.f30220i.readByte();
                    if (I2 != 44) {
                        if (I2 != 59) {
                            if (I2 != 125) {
                                throw w("Unterminated object");
                            }
                            this.f30221j = 2;
                            return 2;
                        }
                        x();
                    }
                }
                int I3 = I(true);
                if (I3 == 34) {
                    this.f30220i.readByte();
                    this.f30221j = 13;
                    return 13;
                }
                if (I3 == 39) {
                    this.f30220i.readByte();
                    x();
                    this.f30221j = 12;
                    return 12;
                }
                if (I3 != 125) {
                    x();
                    if (!H((char) I3)) {
                        throw w("Expected name");
                    }
                    this.f30221j = 14;
                    return 14;
                }
                if (i11 == 5) {
                    throw w("Expected name");
                }
                this.f30220i.readByte();
                this.f30221j = 2;
                return 2;
            }
            if (i11 == 4) {
                iArr[i10 - 1] = 5;
                int I4 = I(true);
                this.f30220i.readByte();
                if (I4 != 58) {
                    if (I4 != 61) {
                        throw w("Expected ':'");
                    }
                    x();
                    if (this.f30219h.request(1L) && this.f30220i.j(0L) == 62) {
                        this.f30220i.readByte();
                    }
                }
            } else if (i11 == 6) {
                iArr[i10 - 1] = 7;
            } else if (i11 == 7) {
                if (I(false) == -1) {
                    this.f30221j = 18;
                    return 18;
                }
                x();
            } else if (i11 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int I5 = I(true);
        if (I5 == 34) {
            this.f30220i.readByte();
            this.f30221j = 9;
            return 9;
        }
        if (I5 == 39) {
            x();
            this.f30220i.readByte();
            this.f30221j = 8;
            return 8;
        }
        if (I5 != 44 && I5 != 59) {
            if (I5 == 91) {
                this.f30220i.readByte();
                this.f30221j = 3;
                return 3;
            }
            if (I5 != 93) {
                if (I5 == 123) {
                    this.f30220i.readByte();
                    this.f30221j = 1;
                    return 1;
                }
                int iP = P();
                if (iP != 0) {
                    return iP;
                }
                int iU = U();
                if (iU != 0) {
                    return iU;
                }
                if (!H(this.f30220i.j(0L))) {
                    throw w("Expected value");
                }
                x();
                this.f30221j = 10;
                return 10;
            }
            if (i11 == 1) {
                this.f30220i.readByte();
                this.f30221j = 4;
                return 4;
            }
        }
        if (i11 != 1 && i11 != 2) {
            throw w("Unexpected value");
        }
        x();
        this.f30221j = 7;
        return 7;
    }

    public final int F(String str, c.a aVar) {
        int length = aVar.f30203a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(aVar.f30203a[i10])) {
                this.f30221j = 0;
                this.f30199c[this.f30198a - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    public final boolean H(int i10) throws b {
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
        x();
        return false;
    }

    public final int I(boolean z10) throws EOFException, b {
        byte bJ;
        while (true) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (!this.f30219h.request(i11)) {
                    if (z10) {
                        throw new EOFException("End of input");
                    }
                    return -1;
                }
                bJ = this.f30220i.j(i10);
                if (bJ == 10 || bJ == 32 || bJ == 13 || bJ == 9) {
                    i10 = i11;
                }
            }
            this.f30220i.skip(i10);
            if (bJ == 47) {
                if (this.f30219h.request(2L)) {
                    x();
                    byte bJ2 = this.f30220i.j(1L);
                    if (bJ2 == 42) {
                        this.f30220i.readByte();
                        this.f30220i.readByte();
                        if (!Y()) {
                            throw w("Unterminated comment");
                        }
                    } else if (bJ2 == 47) {
                        this.f30220i.readByte();
                        this.f30220i.readByte();
                        Z();
                    }
                }
                return bJ;
            }
            if (bJ != 35) {
                return bJ;
            }
            x();
            Z();
        }
    }

    public final String L(h hVar) throws EOFException, b {
        StringBuilder sb2 = null;
        while (true) {
            long jE1 = this.f30219h.e1(hVar);
            if (jE1 == -1) {
                throw w("Unterminated string");
            }
            if (this.f30220i.j(jE1) != 92) {
                if (sb2 == null) {
                    String strD1 = this.f30220i.D1(jE1);
                    this.f30220i.readByte();
                    return strD1;
                }
                sb2.append(this.f30220i.D1(jE1));
                this.f30220i.readByte();
                return sb2.toString();
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(this.f30220i.D1(jE1));
            this.f30220i.readByte();
            sb2.append(W());
        }
    }

    public final String M() {
        long jE1 = this.f30219h.e1(f30216p);
        return jE1 != -1 ? this.f30220i.D1(jE1) : this.f30220i.Q2();
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
    public final int P() throws EOFException {
        String str;
        String str2;
        int i10;
        byte bJ = this.f30220i.j(0L);
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
            if (!this.f30219h.request(i12)) {
                return 0;
            }
            byte bJ2 = this.f30220i.j(i11);
            if (bJ2 != str.charAt(i11) && bJ2 != str2.charAt(i11)) {
                return 0;
            }
            i11 = i12;
        }
        if (this.f30219h.request(length + 1) && H(this.f30220i.j(length))) {
            return 0;
        }
        this.f30220i.skip(length);
        this.f30221j = i10;
        return i10;
    }

    public final int U() throws EOFException {
        long j10;
        int i10;
        boolean z10 = true;
        int i11 = 0;
        char c10 = 0;
        long j11 = 0;
        boolean z11 = false;
        while (true) {
            int i12 = i11 + 1;
            if (!this.f30219h.request(i12)) {
                j10 = 0;
                i10 = 0;
                break;
            }
            j10 = 0;
            byte bJ = this.f30220i.j(i11);
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
                            if (!H(bJ)) {
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
            this.f30222k = j11;
            this.f30220i.skip(i11);
            this.f30221j = 16;
            return 16;
        }
        if (c10 != 2 && c10 != 4 && c10 != 7) {
            return i10;
        }
        this.f30223l = i11;
        this.f30221j = 17;
        return 17;
    }

    public final char W() throws EOFException, b {
        int i10;
        if (!this.f30219h.request(1L)) {
            throw w("Unterminated escape sequence");
        }
        byte b = this.f30220i.readByte();
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
            if (this.f30201e) {
                return (char) b;
            }
            throw w("Invalid escape sequence: \\" + ((char) b));
        }
        if (!this.f30219h.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            byte bJ = this.f30220i.j(i11);
            char c11 = (char) (c10 << 4);
            if (bJ >= 48 && bJ <= 57) {
                i10 = bJ - 48;
            } else if (bJ >= 97 && bJ <= 102) {
                i10 = bJ - 87;
            } else {
                if (bJ < 65 || bJ > 70) {
                    throw w("\\u" + this.f30220i.D1(4L));
                }
                i10 = bJ - 55;
            }
            c10 = (char) (c11 + i10);
        }
        this.f30220i.skip(4L);
        return c10;
    }

    public final void X(h hVar) throws EOFException, b {
        while (true) {
            long jE1 = this.f30219h.e1(hVar);
            if (jE1 == -1) {
                throw w("Unterminated string");
            }
            if (this.f30220i.j(jE1) != 92) {
                this.f30220i.skip(jE1 + 1);
                return;
            } else {
                this.f30220i.skip(jE1 + 1);
                W();
            }
        }
    }

    public final boolean Y() throws EOFException {
        g gVar = this.f30219h;
        h hVar = f30218r;
        long jR1 = gVar.R1(hVar);
        boolean z10 = jR1 != -1;
        vu.e eVar = this.f30220i;
        eVar.skip(z10 ? jR1 + ((long) hVar.I()) : eVar.getSize());
        return z10;
    }

    public final void Z() throws EOFException {
        long jE1 = this.f30219h.e1(f30217q);
        vu.e eVar = this.f30220i;
        eVar.skip(jE1 != -1 ? jE1 + 1 : eVar.getSize());
    }

    public final void a0() throws EOFException {
        long jE1 = this.f30219h.e1(f30216p);
        vu.e eVar = this.f30220i;
        if (jE1 == -1) {
            jE1 = eVar.getSize();
        }
        eVar.skip(jE1);
    }

    @Override // r7.c
    public void b() throws EOFException, b {
        int iA = this.f30221j;
        if (iA == 0) {
            iA = A();
        }
        if (iA == 3) {
            q(1);
            this.f30200d[this.f30198a - 1] = 0;
            this.f30221j = 0;
        } else {
            throw new a("Expected BEGIN_ARRAY but was " + o() + " at path " + getPath());
        }
    }

    @Override // r7.c
    public void c() throws EOFException, b {
        int iA = this.f30221j;
        if (iA == 0) {
            iA = A();
        }
        if (iA == 1) {
            q(3);
            this.f30221j = 0;
            return;
        }
        throw new a("Expected BEGIN_OBJECT but was " + o() + " at path " + getPath());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        this.f30221j = 0;
        this.b[0] = 8;
        this.f30198a = 1;
        this.f30220i.a();
        this.f30219h.close();
    }

    @Override // r7.c
    public void d() throws EOFException, b {
        int iA = this.f30221j;
        if (iA == 0) {
            iA = A();
        }
        if (iA != 4) {
            throw new a("Expected END_ARRAY but was " + o() + " at path " + getPath());
        }
        int i10 = this.f30198a;
        this.f30198a = i10 - 1;
        int[] iArr = this.f30200d;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f30221j = 0;
    }

    @Override // r7.c
    public void e() throws EOFException, b {
        int iA = this.f30221j;
        if (iA == 0) {
            iA = A();
        }
        if (iA != 2) {
            throw new a("Expected END_OBJECT but was " + o() + " at path " + getPath());
        }
        int i10 = this.f30198a;
        int i11 = i10 - 1;
        this.f30198a = i11;
        this.f30199c[i11] = null;
        int[] iArr = this.f30200d;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f30221j = 0;
    }

    @Override // r7.c
    public boolean f() throws EOFException, b {
        int iA = this.f30221j;
        if (iA == 0) {
            iA = A();
        }
        return (iA == 2 || iA == 4 || iA == 18) ? false : true;
    }

    @Override // r7.c
    public boolean g() throws EOFException, b {
        int iA = this.f30221j;
        if (iA == 0) {
            iA = A();
        }
        if (iA == 5) {
            this.f30221j = 0;
            int[] iArr = this.f30200d;
            int i10 = this.f30198a - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iA == 6) {
            this.f30221j = 0;
            int[] iArr2 = this.f30200d;
            int i11 = this.f30198a - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        }
        throw new a("Expected a boolean but was " + o() + " at path " + getPath());
    }

    @Override // r7.c
    public double h() throws EOFException, b {
        int iA = this.f30221j;
        if (iA == 0) {
            iA = A();
        }
        if (iA == 16) {
            this.f30221j = 0;
            int[] iArr = this.f30200d;
            int i10 = this.f30198a - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f30222k;
        }
        if (iA == 17) {
            this.f30224m = this.f30220i.D1(this.f30223l);
        } else if (iA == 9) {
            this.f30224m = L(f30215o);
        } else if (iA == 8) {
            this.f30224m = L(f30214n);
        } else if (iA == 10) {
            this.f30224m = M();
        } else if (iA != 11) {
            throw new a("Expected a double but was " + o() + " at path " + getPath());
        }
        this.f30221j = 11;
        try {
            double d10 = Double.parseDouble(this.f30224m);
            if (this.f30201e || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
                this.f30224m = null;
                this.f30221j = 0;
                int[] iArr2 = this.f30200d;
                int i11 = this.f30198a - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return d10;
            }
            throw new b("JSON forbids NaN and infinities: " + d10 + " at path " + getPath());
        } catch (NumberFormatException unused) {
            throw new a("Expected a double but was " + this.f30224m + " at path " + getPath());
        }
    }

    @Override // r7.c
    public int j() throws EOFException, b {
        int iA = this.f30221j;
        if (iA == 0) {
            iA = A();
        }
        if (iA == 16) {
            long j10 = this.f30222k;
            int i10 = (int) j10;
            if (j10 == i10) {
                this.f30221j = 0;
                int[] iArr = this.f30200d;
                int i11 = this.f30198a - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new a("Expected an int but was " + this.f30222k + " at path " + getPath());
        }
        if (iA == 17) {
            this.f30224m = this.f30220i.D1(this.f30223l);
        } else if (iA == 9 || iA == 8) {
            String strL = iA == 9 ? L(f30215o) : L(f30214n);
            this.f30224m = strL;
            try {
                int i12 = Integer.parseInt(strL);
                this.f30221j = 0;
                int[] iArr2 = this.f30200d;
                int i13 = this.f30198a - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        } else if (iA != 11) {
            throw new a("Expected an int but was " + o() + " at path " + getPath());
        }
        this.f30221j = 11;
        try {
            double d10 = Double.parseDouble(this.f30224m);
            int i14 = (int) d10;
            if (i14 == d10) {
                this.f30224m = null;
                this.f30221j = 0;
                int[] iArr3 = this.f30200d;
                int i15 = this.f30198a - 1;
                iArr3[i15] = iArr3[i15] + 1;
                return i14;
            }
            throw new a("Expected an int but was " + this.f30224m + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new a("Expected an int but was " + this.f30224m + " at path " + getPath());
        }
    }

    @Override // r7.c
    public String l() throws EOFException, b {
        String strL;
        int iA = this.f30221j;
        if (iA == 0) {
            iA = A();
        }
        if (iA == 14) {
            strL = M();
        } else if (iA == 13) {
            strL = L(f30215o);
        } else if (iA == 12) {
            strL = L(f30214n);
        } else {
            if (iA != 15) {
                throw new a("Expected a name but was " + o() + " at path " + getPath());
            }
            strL = this.f30224m;
        }
        this.f30221j = 0;
        this.f30199c[this.f30198a - 1] = strL;
        return strL;
    }

    @Override // r7.c
    public String m() throws EOFException, b {
        String strD1;
        int iA = this.f30221j;
        if (iA == 0) {
            iA = A();
        }
        if (iA == 10) {
            strD1 = M();
        } else if (iA == 9) {
            strD1 = L(f30215o);
        } else if (iA == 8) {
            strD1 = L(f30214n);
        } else if (iA == 11) {
            strD1 = this.f30224m;
            this.f30224m = null;
        } else if (iA == 16) {
            strD1 = Long.toString(this.f30222k);
        } else {
            if (iA != 17) {
                throw new a("Expected a string but was " + o() + " at path " + getPath());
            }
            strD1 = this.f30220i.D1(this.f30223l);
        }
        this.f30221j = 0;
        int[] iArr = this.f30200d;
        int i10 = this.f30198a - 1;
        iArr[i10] = iArr[i10] + 1;
        return strD1;
    }

    @Override // r7.c
    public c.b o() throws EOFException, b {
        int iA = this.f30221j;
        if (iA == 0) {
            iA = A();
        }
        switch (iA) {
            case 1:
                return c.b.BEGIN_OBJECT;
            case 2:
                return c.b.END_OBJECT;
            case 3:
                return c.b.BEGIN_ARRAY;
            case 4:
                return c.b.END_ARRAY;
            case 5:
            case 6:
                return c.b.BOOLEAN;
            case 7:
                return c.b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return c.b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return c.b.NAME;
            case 16:
            case 17:
                return c.b.NUMBER;
            case 18:
                return c.b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // r7.c
    public int r(c.a aVar) throws EOFException, b {
        int iA = this.f30221j;
        if (iA == 0) {
            iA = A();
        }
        if (iA < 12 || iA > 15) {
            return -1;
        }
        if (iA == 15) {
            return F(this.f30224m, aVar);
        }
        int iJ1 = this.f30219h.J1(aVar.b);
        if (iJ1 != -1) {
            this.f30221j = 0;
            this.f30199c[this.f30198a - 1] = aVar.f30203a[iJ1];
            return iJ1;
        }
        String str = this.f30199c[this.f30198a - 1];
        String strL = l();
        int iF = F(strL, aVar);
        if (iF == -1) {
            this.f30221j = 15;
            this.f30224m = strL;
            this.f30199c[this.f30198a - 1] = str;
        }
        return iF;
    }

    @Override // r7.c
    public void s() throws EOFException, b {
        if (this.f30202f) {
            throw new a("Cannot skip unexpected " + o() + " at " + getPath());
        }
        int iA = this.f30221j;
        if (iA == 0) {
            iA = A();
        }
        if (iA == 14) {
            a0();
        } else if (iA == 13) {
            X(f30215o);
        } else if (iA == 12) {
            X(f30214n);
        } else if (iA != 15) {
            throw new a("Expected a name but was " + o() + " at path " + getPath());
        }
        this.f30221j = 0;
        this.f30199c[this.f30198a - 1] = "null";
    }

    public String toString() {
        return "JsonReader(" + this.f30219h + ")";
    }

    @Override // r7.c
    public void u() throws EOFException, b {
        if (this.f30202f) {
            throw new a("Cannot skip unexpected " + o() + " at " + getPath());
        }
        int i10 = 0;
        do {
            int iA = this.f30221j;
            if (iA == 0) {
                iA = A();
            }
            if (iA == 3) {
                q(1);
            } else {
                if (iA == 1) {
                    q(3);
                } else if (iA == 4) {
                    i10--;
                    if (i10 < 0) {
                        throw new a("Expected a value but was " + o() + " at path " + getPath());
                    }
                    this.f30198a--;
                } else if (iA == 2) {
                    i10--;
                    if (i10 < 0) {
                        throw new a("Expected a value but was " + o() + " at path " + getPath());
                    }
                    this.f30198a--;
                } else if (iA == 14 || iA == 10) {
                    a0();
                } else if (iA == 9 || iA == 13) {
                    X(f30215o);
                } else if (iA == 8 || iA == 12) {
                    X(f30214n);
                } else if (iA == 17) {
                    this.f30220i.skip(this.f30223l);
                } else if (iA == 18) {
                    throw new a("Expected a value but was " + o() + " at path " + getPath());
                }
                this.f30221j = 0;
            }
            i10++;
            this.f30221j = 0;
        } while (i10 != 0);
        int[] iArr = this.f30200d;
        int i11 = this.f30198a;
        int i12 = i11 - 1;
        iArr[i12] = iArr[i12] + 1;
        this.f30199c[i11 - 1] = "null";
    }

    public final void x() throws b {
        if (!this.f30201e) {
            throw w("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }
}
