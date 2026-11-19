package s7;

import com.google.mlkit.common.MlKitException;
import ew.g;
import ew.h;
import java.io.EOFException;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h f31237n = h.e("'\\");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final h f31238o = h.e("\"\\");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final h f31239p = h.e("{}[]:, \n\t\r\f/\\;#=");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final h f31240q = h.e("\n\r");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final h f31241r = h.e("*/");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f31242h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ew.e f31243i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f31244j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f31245k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f31246l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f31247m;

    public e(g gVar) {
        if (gVar == null) {
            throw new NullPointerException("source == null");
        }
        this.f31242h = gVar;
        this.f31243i = gVar.getBufferField();
        r(6);
    }

    public final void A() throws b {
        if (!this.f31224e) {
            throw z("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    public final int E() throws EOFException, b {
        int[] iArr = this.b;
        int i10 = this.f31221a;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int iL = L(true);
            this.f31243i.readByte();
            if (iL != 44) {
                if (iL != 59) {
                    if (iL != 93) {
                        throw z("Unterminated array");
                    }
                    this.f31244j = 4;
                    return 4;
                }
                A();
            }
        } else {
            if (i11 == 3 || i11 == 5) {
                iArr[i10 - 1] = 4;
                if (i11 == 5) {
                    int iL2 = L(true);
                    this.f31243i.readByte();
                    if (iL2 != 44) {
                        if (iL2 != 59) {
                            if (iL2 != 125) {
                                throw z("Unterminated object");
                            }
                            this.f31244j = 2;
                            return 2;
                        }
                        A();
                    }
                }
                int iL3 = L(true);
                if (iL3 == 34) {
                    this.f31243i.readByte();
                    this.f31244j = 13;
                    return 13;
                }
                if (iL3 == 39) {
                    this.f31243i.readByte();
                    A();
                    this.f31244j = 12;
                    return 12;
                }
                if (iL3 != 125) {
                    A();
                    if (!K((char) iL3)) {
                        throw z("Expected name");
                    }
                    this.f31244j = 14;
                    return 14;
                }
                if (i11 == 5) {
                    throw z("Expected name");
                }
                this.f31243i.readByte();
                this.f31244j = 2;
                return 2;
            }
            if (i11 == 4) {
                iArr[i10 - 1] = 5;
                int iL4 = L(true);
                this.f31243i.readByte();
                if (iL4 != 58) {
                    if (iL4 != 61) {
                        throw z("Expected ':'");
                    }
                    A();
                    if (this.f31242h.request(1L) && this.f31243i.o(0L) == 62) {
                        this.f31243i.readByte();
                    }
                }
            } else if (i11 == 6) {
                iArr[i10 - 1] = 7;
            } else if (i11 == 7) {
                if (L(false) == -1) {
                    this.f31244j = 18;
                    return 18;
                }
                A();
            } else if (i11 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iL5 = L(true);
        if (iL5 == 34) {
            this.f31243i.readByte();
            this.f31244j = 9;
            return 9;
        }
        if (iL5 == 39) {
            A();
            this.f31243i.readByte();
            this.f31244j = 8;
            return 8;
        }
        if (iL5 != 44 && iL5 != 59) {
            if (iL5 == 91) {
                this.f31243i.readByte();
                this.f31244j = 3;
                return 3;
            }
            if (iL5 != 93) {
                if (iL5 == 123) {
                    this.f31243i.readByte();
                    this.f31244j = 1;
                    return 1;
                }
                int iQ = Q();
                if (iQ != 0) {
                    return iQ;
                }
                int iT = T();
                if (iT != 0) {
                    return iT;
                }
                if (!K(this.f31243i.o(0L))) {
                    throw z("Expected value");
                }
                A();
                this.f31244j = 10;
                return 10;
            }
            if (i11 == 1) {
                this.f31243i.readByte();
                this.f31244j = 4;
                return 4;
            }
        }
        if (i11 != 1 && i11 != 2) {
            throw z("Unexpected value");
        }
        A();
        this.f31244j = 7;
        return 7;
    }

    public final int I(String str, c.a aVar) {
        int length = aVar.f31226a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(aVar.f31226a[i10])) {
                this.f31244j = 0;
                this.f31222c[this.f31221a - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    public final boolean K(int i10) throws b {
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
        A();
        return false;
    }

    public final int L(boolean z10) throws EOFException, b {
        byte bO;
        while (true) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (!this.f31242h.request(i11)) {
                    if (z10) {
                        throw new EOFException("End of input");
                    }
                    return -1;
                }
                bO = this.f31243i.o(i10);
                if (bO == 10 || bO == 32 || bO == 13 || bO == 9) {
                    i10 = i11;
                }
            }
            this.f31243i.skip(i10);
            if (bO == 47) {
                if (this.f31242h.request(2L)) {
                    A();
                    byte bO2 = this.f31243i.o(1L);
                    if (bO2 == 42) {
                        this.f31243i.readByte();
                        this.f31243i.readByte();
                        if (!c0()) {
                            throw z("Unterminated comment");
                        }
                    } else if (bO2 == 47) {
                        this.f31243i.readByte();
                        this.f31243i.readByte();
                        d0();
                    }
                }
                return bO;
            }
            if (bO != 35) {
                return bO;
            }
            A();
            d0();
        }
    }

    public final String N(h hVar) throws EOFException, b {
        StringBuilder sb2 = null;
        while (true) {
            long jB2 = this.f31242h.B2(hVar);
            if (jB2 == -1) {
                throw z("Unterminated string");
            }
            if (this.f31243i.o(jB2) != 92) {
                if (sb2 == null) {
                    String strG1 = this.f31243i.G1(jB2);
                    this.f31243i.readByte();
                    return strG1;
                }
                sb2.append(this.f31243i.G1(jB2));
                this.f31243i.readByte();
                return sb2.toString();
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(this.f31243i.G1(jB2));
            this.f31243i.readByte();
            sb2.append(Y());
        }
    }

    public final String O() {
        long jB2 = this.f31242h.B2(f31239p);
        return jB2 != -1 ? this.f31243i.G1(jB2) : this.f31243i.V2();
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
    public final int Q() throws EOFException {
        String str;
        String str2;
        int i10;
        byte bO = this.f31243i.o(0L);
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
            if (!this.f31242h.request(i12)) {
                return 0;
            }
            byte bO2 = this.f31243i.o(i11);
            if (bO2 != str.charAt(i11) && bO2 != str2.charAt(i11)) {
                return 0;
            }
            i11 = i12;
        }
        if (this.f31242h.request(length + 1) && K(this.f31243i.o(length))) {
            return 0;
        }
        this.f31243i.skip(length);
        this.f31244j = i10;
        return i10;
    }

    public final int T() throws EOFException {
        long j10;
        int i10;
        boolean z10 = true;
        int i11 = 0;
        char c10 = 0;
        long j11 = 0;
        boolean z11 = false;
        while (true) {
            int i12 = i11 + 1;
            if (!this.f31242h.request(i12)) {
                j10 = 0;
                i10 = 0;
                break;
            }
            j10 = 0;
            byte bO = this.f31243i.o(i11);
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
                            if (!K(bO)) {
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
            this.f31245k = j11;
            this.f31243i.skip(i11);
            this.f31244j = 16;
            return 16;
        }
        if (c10 != 2 && c10 != 4 && c10 != 7) {
            return i10;
        }
        this.f31246l = i11;
        this.f31244j = 17;
        return 17;
    }

    public final char Y() throws EOFException, b {
        int i10;
        if (!this.f31242h.request(1L)) {
            throw z("Unterminated escape sequence");
        }
        byte b = this.f31243i.readByte();
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
            if (this.f31224e) {
                return (char) b;
            }
            throw z("Invalid escape sequence: \\" + ((char) b));
        }
        if (!this.f31242h.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + x());
        }
        char c10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            byte bO = this.f31243i.o(i11);
            char c11 = (char) (c10 << 4);
            if (bO >= 48 && bO <= 57) {
                i10 = bO - 48;
            } else if (bO >= 97 && bO <= 102) {
                i10 = bO - 87;
            } else {
                if (bO < 65 || bO > 70) {
                    throw z("\\u" + this.f31243i.G1(4L));
                }
                i10 = bO - 55;
            }
            c10 = (char) (c11 + i10);
        }
        this.f31243i.skip(4L);
        return c10;
    }

    @Override // s7.c
    public void b() throws EOFException, b {
        int iE = this.f31244j;
        if (iE == 0) {
            iE = E();
        }
        if (iE == 3) {
            r(1);
            this.f31223d[this.f31221a - 1] = 0;
            this.f31244j = 0;
        } else {
            throw new a("Expected BEGIN_ARRAY but was " + p() + " at path " + x());
        }
    }

    public final void b0(h hVar) throws EOFException, b {
        while (true) {
            long jB2 = this.f31242h.B2(hVar);
            if (jB2 == -1) {
                throw z("Unterminated string");
            }
            if (this.f31243i.o(jB2) != 92) {
                this.f31243i.skip(jB2 + 1);
                return;
            } else {
                this.f31243i.skip(jB2 + 1);
                Y();
            }
        }
    }

    @Override // s7.c
    public void c() throws EOFException, b {
        int iE = this.f31244j;
        if (iE == 0) {
            iE = E();
        }
        if (iE == 1) {
            r(3);
            this.f31244j = 0;
            return;
        }
        throw new a("Expected BEGIN_OBJECT but was " + p() + " at path " + x());
    }

    public final boolean c0() throws EOFException {
        g gVar = this.f31242h;
        h hVar = f31241r;
        long jI1 = gVar.i1(hVar);
        boolean z10 = jI1 != -1;
        ew.e eVar = this.f31243i;
        eVar.skip(z10 ? jI1 + ((long) hVar.I()) : eVar.getSize());
        return z10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        this.f31244j = 0;
        this.b[0] = 8;
        this.f31221a = 1;
        this.f31243i.a();
        this.f31242h.close();
    }

    @Override // s7.c
    public void d() throws EOFException, b {
        int iE = this.f31244j;
        if (iE == 0) {
            iE = E();
        }
        if (iE != 4) {
            throw new a("Expected END_ARRAY but was " + p() + " at path " + x());
        }
        int i10 = this.f31221a;
        this.f31221a = i10 - 1;
        int[] iArr = this.f31223d;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f31244j = 0;
    }

    public final void d0() throws EOFException {
        long jB2 = this.f31242h.B2(f31240q);
        ew.e eVar = this.f31243i;
        eVar.skip(jB2 != -1 ? jB2 + 1 : eVar.getSize());
    }

    @Override // s7.c
    public void e() throws EOFException, b {
        int iE = this.f31244j;
        if (iE == 0) {
            iE = E();
        }
        if (iE != 2) {
            throw new a("Expected END_OBJECT but was " + p() + " at path " + x());
        }
        int i10 = this.f31221a;
        int i11 = i10 - 1;
        this.f31221a = i11;
        this.f31222c[i11] = null;
        int[] iArr = this.f31223d;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f31244j = 0;
    }

    public final void e0() throws EOFException {
        long jB2 = this.f31242h.B2(f31239p);
        ew.e eVar = this.f31243i;
        if (jB2 == -1) {
            jB2 = eVar.getSize();
        }
        eVar.skip(jB2);
    }

    @Override // s7.c
    public boolean f() throws EOFException, b {
        int iE = this.f31244j;
        if (iE == 0) {
            iE = E();
        }
        return (iE == 2 || iE == 4 || iE == 18) ? false : true;
    }

    @Override // s7.c
    public boolean g() throws EOFException, b {
        int iE = this.f31244j;
        if (iE == 0) {
            iE = E();
        }
        if (iE == 5) {
            this.f31244j = 0;
            int[] iArr = this.f31223d;
            int i10 = this.f31221a - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iE == 6) {
            this.f31244j = 0;
            int[] iArr2 = this.f31223d;
            int i11 = this.f31221a - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        }
        throw new a("Expected a boolean but was " + p() + " at path " + x());
    }

    @Override // s7.c
    public double h() throws EOFException, b {
        int iE = this.f31244j;
        if (iE == 0) {
            iE = E();
        }
        if (iE == 16) {
            this.f31244j = 0;
            int[] iArr = this.f31223d;
            int i10 = this.f31221a - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f31245k;
        }
        if (iE == 17) {
            this.f31247m = this.f31243i.G1(this.f31246l);
        } else if (iE == 9) {
            this.f31247m = N(f31238o);
        } else if (iE == 8) {
            this.f31247m = N(f31237n);
        } else if (iE == 10) {
            this.f31247m = O();
        } else if (iE != 11) {
            throw new a("Expected a double but was " + p() + " at path " + x());
        }
        this.f31244j = 11;
        try {
            double d10 = Double.parseDouble(this.f31247m);
            if (this.f31224e || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
                this.f31247m = null;
                this.f31244j = 0;
                int[] iArr2 = this.f31223d;
                int i11 = this.f31221a - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return d10;
            }
            throw new b("JSON forbids NaN and infinities: " + d10 + " at path " + x());
        } catch (NumberFormatException unused) {
            throw new a("Expected a double but was " + this.f31247m + " at path " + x());
        }
    }

    @Override // s7.c
    public int k() throws EOFException, b {
        int iE = this.f31244j;
        if (iE == 0) {
            iE = E();
        }
        if (iE == 16) {
            long j10 = this.f31245k;
            int i10 = (int) j10;
            if (j10 == i10) {
                this.f31244j = 0;
                int[] iArr = this.f31223d;
                int i11 = this.f31221a - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new a("Expected an int but was " + this.f31245k + " at path " + x());
        }
        if (iE == 17) {
            this.f31247m = this.f31243i.G1(this.f31246l);
        } else if (iE == 9 || iE == 8) {
            String strN = iE == 9 ? N(f31238o) : N(f31237n);
            this.f31247m = strN;
            try {
                int i12 = Integer.parseInt(strN);
                this.f31244j = 0;
                int[] iArr2 = this.f31223d;
                int i13 = this.f31221a - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        } else if (iE != 11) {
            throw new a("Expected an int but was " + p() + " at path " + x());
        }
        this.f31244j = 11;
        try {
            double d10 = Double.parseDouble(this.f31247m);
            int i14 = (int) d10;
            if (i14 == d10) {
                this.f31247m = null;
                this.f31244j = 0;
                int[] iArr3 = this.f31223d;
                int i15 = this.f31221a - 1;
                iArr3[i15] = iArr3[i15] + 1;
                return i14;
            }
            throw new a("Expected an int but was " + this.f31247m + " at path " + x());
        } catch (NumberFormatException unused2) {
            throw new a("Expected an int but was " + this.f31247m + " at path " + x());
        }
    }

    @Override // s7.c
    public String m() throws EOFException, b {
        String strN;
        int iE = this.f31244j;
        if (iE == 0) {
            iE = E();
        }
        if (iE == 14) {
            strN = O();
        } else if (iE == 13) {
            strN = N(f31238o);
        } else if (iE == 12) {
            strN = N(f31237n);
        } else {
            if (iE != 15) {
                throw new a("Expected a name but was " + p() + " at path " + x());
            }
            strN = this.f31247m;
        }
        this.f31244j = 0;
        this.f31222c[this.f31221a - 1] = strN;
        return strN;
    }

    @Override // s7.c
    public String n() throws EOFException, b {
        String strG1;
        int iE = this.f31244j;
        if (iE == 0) {
            iE = E();
        }
        if (iE == 10) {
            strG1 = O();
        } else if (iE == 9) {
            strG1 = N(f31238o);
        } else if (iE == 8) {
            strG1 = N(f31237n);
        } else if (iE == 11) {
            strG1 = this.f31247m;
            this.f31247m = null;
        } else if (iE == 16) {
            strG1 = Long.toString(this.f31245k);
        } else {
            if (iE != 17) {
                throw new a("Expected a string but was " + p() + " at path " + x());
            }
            strG1 = this.f31243i.G1(this.f31246l);
        }
        this.f31244j = 0;
        int[] iArr = this.f31223d;
        int i10 = this.f31221a - 1;
        iArr[i10] = iArr[i10] + 1;
        return strG1;
    }

    @Override // s7.c
    public c.b p() throws EOFException, b {
        int iE = this.f31244j;
        if (iE == 0) {
            iE = E();
        }
        switch (iE) {
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
            case MlKitException.UNSUPPORTED /* 18 */:
                return c.b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // s7.c
    public int s(c.a aVar) throws EOFException, b {
        int iE = this.f31244j;
        if (iE == 0) {
            iE = E();
        }
        if (iE < 12 || iE > 15) {
            return -1;
        }
        if (iE == 15) {
            return I(this.f31247m, aVar);
        }
        int iJ1 = this.f31242h.J1(aVar.b);
        if (iJ1 != -1) {
            this.f31244j = 0;
            this.f31222c[this.f31221a - 1] = aVar.f31226a[iJ1];
            return iJ1;
        }
        String str = this.f31222c[this.f31221a - 1];
        String strM = m();
        int I = I(strM, aVar);
        if (I == -1) {
            this.f31244j = 15;
            this.f31247m = strM;
            this.f31222c[this.f31221a - 1] = str;
        }
        return I;
    }

    public String toString() {
        return "JsonReader(" + this.f31242h + ")";
    }

    @Override // s7.c
    public void u() throws EOFException, b {
        if (this.f31225f) {
            throw new a("Cannot skip unexpected " + p() + " at " + x());
        }
        int iE = this.f31244j;
        if (iE == 0) {
            iE = E();
        }
        if (iE == 14) {
            e0();
        } else if (iE == 13) {
            b0(f31238o);
        } else if (iE == 12) {
            b0(f31237n);
        } else if (iE != 15) {
            throw new a("Expected a name but was " + p() + " at path " + x());
        }
        this.f31244j = 0;
        this.f31222c[this.f31221a - 1] = "null";
    }

    @Override // s7.c
    public void w() throws EOFException, b {
        if (this.f31225f) {
            throw new a("Cannot skip unexpected " + p() + " at " + x());
        }
        int i10 = 0;
        do {
            int iE = this.f31244j;
            if (iE == 0) {
                iE = E();
            }
            if (iE == 3) {
                r(1);
            } else {
                if (iE == 1) {
                    r(3);
                } else if (iE == 4) {
                    i10--;
                    if (i10 < 0) {
                        throw new a("Expected a value but was " + p() + " at path " + x());
                    }
                    this.f31221a--;
                } else if (iE == 2) {
                    i10--;
                    if (i10 < 0) {
                        throw new a("Expected a value but was " + p() + " at path " + x());
                    }
                    this.f31221a--;
                } else if (iE == 14 || iE == 10) {
                    e0();
                } else if (iE == 9 || iE == 13) {
                    b0(f31238o);
                } else if (iE == 8 || iE == 12) {
                    b0(f31237n);
                } else if (iE == 17) {
                    this.f31243i.skip(this.f31246l);
                } else if (iE == 18) {
                    throw new a("Expected a value but was " + p() + " at path " + x());
                }
                this.f31244j = 0;
            }
            i10++;
            this.f31244j = 0;
        } while (i10 != 0);
        int[] iArr = this.f31223d;
        int i11 = this.f31221a;
        int i12 = i11 - 1;
        iArr[i12] = iArr[i12] + 1;
        this.f31222c[i11 - 1] = "null";
    }
}
