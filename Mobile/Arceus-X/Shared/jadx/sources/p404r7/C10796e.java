package p404r7;

import java.io.EOFException;
import p560xu.C12924e;
import p560xu.C12930h;
import p560xu.InterfaceC12928g;

/* JADX INFO: renamed from: r7.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C10796e extends AbstractC10794c {

    /* JADX INFO: renamed from: n */
    public static final C12930h f38478n = C12930h.m48080e("'\\");

    /* JADX INFO: renamed from: o */
    public static final C12930h f38479o = C12930h.m48080e("\"\\");

    /* JADX INFO: renamed from: p */
    public static final C12930h f38480p = C12930h.m48080e("{}[]:, \n\t\r\f/\\;#=");

    /* JADX INFO: renamed from: q */
    public static final C12930h f38481q = C12930h.m48080e("\n\r");

    /* JADX INFO: renamed from: r */
    public static final C12930h f38482r = C12930h.m48080e("*/");

    /* JADX INFO: renamed from: h */
    public final InterfaceC12928g f38483h;

    /* JADX INFO: renamed from: i */
    public final C12924e f38484i;

    /* JADX INFO: renamed from: j */
    public int f38485j = 0;

    /* JADX INFO: renamed from: k */
    public long f38486k;

    /* JADX INFO: renamed from: l */
    public int f38487l;

    /* JADX INFO: renamed from: m */
    public String f38488m;

    public C10796e(InterfaceC12928g interfaceC12928g) {
        if (interfaceC12928g == null) {
            throw new NullPointerException("source == null");
        }
        this.f38483h = interfaceC12928g;
        this.f38484i = interfaceC12928g.getBufferField();
        m41138q(6);
    }

    /* JADX INFO: renamed from: B */
    public final int m41146B() throws EOFException, C10793b {
        int[] iArr = this.f38460b;
        int i10 = this.f38459a;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int iM41149I = m41149I(true);
            this.f38484i.readByte();
            if (iM41149I != 44) {
                if (iM41149I != 59) {
                    if (iM41149I != 93) {
                        throw m41142w("Unterminated array");
                    }
                    this.f38485j = 4;
                    return 4;
                }
                m41159y();
            }
        } else {
            if (i11 == 3 || i11 == 5) {
                iArr[i10 - 1] = 4;
                if (i11 == 5) {
                    int iM41149I2 = m41149I(true);
                    this.f38484i.readByte();
                    if (iM41149I2 != 44) {
                        if (iM41149I2 != 59) {
                            if (iM41149I2 != 125) {
                                throw m41142w("Unterminated object");
                            }
                            this.f38485j = 2;
                            return 2;
                        }
                        m41159y();
                    }
                }
                int iM41149I3 = m41149I(true);
                if (iM41149I3 == 34) {
                    this.f38484i.readByte();
                    this.f38485j = 13;
                    return 13;
                }
                if (iM41149I3 == 39) {
                    this.f38484i.readByte();
                    m41159y();
                    this.f38485j = 12;
                    return 12;
                }
                if (iM41149I3 != 125) {
                    m41159y();
                    if (!m41148H((char) iM41149I3)) {
                        throw m41142w("Expected name");
                    }
                    this.f38485j = 14;
                    return 14;
                }
                if (i11 == 5) {
                    throw m41142w("Expected name");
                }
                this.f38484i.readByte();
                this.f38485j = 2;
                return 2;
            }
            if (i11 == 4) {
                iArr[i10 - 1] = 5;
                int iM41149I4 = m41149I(true);
                this.f38484i.readByte();
                if (iM41149I4 != 58) {
                    if (iM41149I4 != 61) {
                        throw m41142w("Expected ':'");
                    }
                    m41159y();
                    if (this.f38483h.request(1L) && this.f38484i.m48033j(0L) == 62) {
                        this.f38484i.readByte();
                    }
                }
            } else if (i11 == 6) {
                iArr[i10 - 1] = 7;
            } else if (i11 == 7) {
                if (m41149I(false) == -1) {
                    this.f38485j = 18;
                    return 18;
                }
                m41159y();
            } else if (i11 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iM41149I5 = m41149I(true);
        if (iM41149I5 == 34) {
            this.f38484i.readByte();
            this.f38485j = 9;
            return 9;
        }
        if (iM41149I5 == 39) {
            m41159y();
            this.f38484i.readByte();
            this.f38485j = 8;
            return 8;
        }
        if (iM41149I5 != 44 && iM41149I5 != 59) {
            if (iM41149I5 == 91) {
                this.f38484i.readByte();
                this.f38485j = 3;
                return 3;
            }
            if (iM41149I5 != 93) {
                if (iM41149I5 == 123) {
                    this.f38484i.readByte();
                    this.f38485j = 1;
                    return 1;
                }
                int iM41152P = m41152P();
                if (iM41152P != 0) {
                    return iM41152P;
                }
                int iM41153U = m41153U();
                if (iM41153U != 0) {
                    return iM41153U;
                }
                if (!m41148H(this.f38484i.m48033j(0L))) {
                    throw m41142w("Expected value");
                }
                m41159y();
                this.f38485j = 10;
                return 10;
            }
            if (i11 == 1) {
                this.f38484i.readByte();
                this.f38485j = 4;
                return 4;
            }
        }
        if (i11 != 1 && i11 != 2) {
            throw m41142w("Unexpected value");
        }
        m41159y();
        this.f38485j = 7;
        return 7;
    }

    /* JADX INFO: renamed from: F */
    public final int m41147F(String str, AbstractC10794c.a aVar) {
        int length = aVar.f38465a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(aVar.f38465a[i10])) {
                this.f38485j = 0;
                this.f38461c[this.f38459a - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m41148H(int i10) throws C10793b {
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
        m41159y();
        return false;
    }

    /* JADX INFO: renamed from: I */
    public final int m41149I(boolean z10) throws EOFException, C10793b {
        byte bM48033j;
        while (true) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (!this.f38483h.request(i11)) {
                    if (z10) {
                        throw new EOFException("End of input");
                    }
                    return -1;
                }
                bM48033j = this.f38484i.m48033j(i10);
                if (bM48033j == 10 || bM48033j == 32 || bM48033j == 13 || bM48033j == 9) {
                    i10 = i11;
                }
            }
            this.f38484i.skip(i10);
            if (bM48033j == 47) {
                if (this.f38483h.request(2L)) {
                    m41159y();
                    byte bM48033j2 = this.f38484i.m48033j(1L);
                    if (bM48033j2 == 42) {
                        this.f38484i.readByte();
                        this.f38484i.readByte();
                        if (!m41156Z()) {
                            throw m41142w("Unterminated comment");
                        }
                    } else if (bM48033j2 == 47) {
                        this.f38484i.readByte();
                        this.f38484i.readByte();
                        m41157a0();
                    }
                }
                return bM48033j;
            }
            if (bM48033j != 35) {
                return bM48033j;
            }
            m41159y();
            m41157a0();
        }
    }

    /* JADX INFO: renamed from: L */
    public final String m41150L(C12930h c12930h) throws EOFException, C10793b {
        StringBuilder sb2 = null;
        while (true) {
            long jMo48030h0 = this.f38483h.mo48030h0(c12930h);
            if (jMo48030h0 == -1) {
                throw m41142w("Unterminated string");
            }
            if (this.f38484i.m48033j(jMo48030h0) != 92) {
                if (sb2 == null) {
                    String strMo47998G1 = this.f38484i.mo47998G1(jMo48030h0);
                    this.f38484i.readByte();
                    return strMo47998G1;
                }
                sb2.append(this.f38484i.mo47998G1(jMo48030h0));
                this.f38484i.readByte();
                return sb2.toString();
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(this.f38484i.mo47998G1(jMo48030h0));
            this.f38484i.readByte();
            sb2.append(m41154X());
        }
    }

    /* JADX INFO: renamed from: M */
    public final String m41151M() {
        long jMo48030h0 = this.f38483h.mo48030h0(f38480p);
        return jMo48030h0 != -1 ? this.f38484i.mo47998G1(jMo48030h0) : this.f38484i.mo48008R2();
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
    /* JADX INFO: renamed from: P */
    public final int m41152P() throws EOFException {
        String str;
        String str2;
        int i10;
        byte bM48033j = this.f38484i.m48033j(0L);
        if (bM48033j == 116 || bM48033j == 84) {
            str = "true";
            str2 = "TRUE";
            i10 = 5;
        } else if (bM48033j == 102 || bM48033j == 70) {
            str = "false";
            str2 = "FALSE";
            i10 = 6;
        } else {
            if (bM48033j != 110 && bM48033j != 78) {
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
            if (!this.f38483h.request(i12)) {
                return 0;
            }
            byte bM48033j2 = this.f38484i.m48033j(i11);
            if (bM48033j2 != str.charAt(i11) && bM48033j2 != str2.charAt(i11)) {
                return 0;
            }
            i11 = i12;
        }
        if (this.f38483h.request(length + 1) && m41148H(this.f38484i.m48033j(length))) {
            return 0;
        }
        this.f38484i.skip(length);
        this.f38485j = i10;
        return i10;
    }

    /* JADX INFO: renamed from: U */
    public final int m41153U() throws EOFException {
        long j10;
        int i10;
        boolean z10 = true;
        int i11 = 0;
        char c10 = 0;
        long j11 = 0;
        boolean z11 = false;
        while (true) {
            int i12 = i11 + 1;
            if (!this.f38483h.request(i12)) {
                j10 = 0;
                i10 = 0;
                break;
            }
            j10 = 0;
            byte bM48033j = this.f38484i.m48033j(i11);
            i10 = 0;
            if (bM48033j != 43) {
                if (bM48033j == 69 || bM48033j == 101) {
                    if (c10 != 2 && c10 != 4) {
                        return 0;
                    }
                    c10 = 5;
                } else if (bM48033j != 45) {
                    if (bM48033j != 46) {
                        if (bM48033j < 48 || bM48033j > 57) {
                            if (!m41148H(bM48033j)) {
                                break;
                            }
                            return 0;
                        }
                        if (c10 == 1 || c10 == 0) {
                            j11 = -(bM48033j - 48);
                            c10 = 2;
                        } else if (c10 == 2) {
                            if (j11 == 0) {
                                return 0;
                            }
                            long j12 = (10 * j11) - ((long) (bM48033j - 48));
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
            this.f38486k = j11;
            this.f38484i.skip(i11);
            this.f38485j = 16;
            return 16;
        }
        if (c10 != 2 && c10 != 4 && c10 != 7) {
            return i10;
        }
        this.f38487l = i11;
        this.f38485j = 17;
        return 17;
    }

    /* JADX INFO: renamed from: X */
    public final char m41154X() throws EOFException, C10793b {
        int i10;
        if (!this.f38483h.request(1L)) {
            throw m41142w("Unterminated escape sequence");
        }
        byte b = this.f38484i.readByte();
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
            if (this.f38463e) {
                return (char) b;
            }
            throw m41142w("Invalid escape sequence: \\" + ((char) b));
        }
        if (!this.f38483h.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            byte bM48033j = this.f38484i.m48033j(i11);
            char c11 = (char) (c10 << 4);
            if (bM48033j >= 48 && bM48033j <= 57) {
                i10 = bM48033j - 48;
            } else if (bM48033j >= 97 && bM48033j <= 102) {
                i10 = bM48033j - 87;
            } else {
                if (bM48033j < 65 || bM48033j > 70) {
                    throw m41142w("\\u" + this.f38484i.mo47998G1(4L));
                }
                i10 = bM48033j - 55;
            }
            c10 = (char) (c11 + i10);
        }
        this.f38484i.skip(4L);
        return c10;
    }

    /* JADX INFO: renamed from: Y */
    public final void m41155Y(C12930h c12930h) throws EOFException, C10793b {
        while (true) {
            long jMo48030h0 = this.f38483h.mo48030h0(c12930h);
            if (jMo48030h0 == -1) {
                throw m41142w("Unterminated string");
            }
            if (this.f38484i.m48033j(jMo48030h0) != 92) {
                this.f38484i.skip(jMo48030h0 + 1);
                return;
            } else {
                this.f38484i.skip(jMo48030h0 + 1);
                m41154X();
            }
        }
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m41156Z() throws EOFException {
        InterfaceC12928g interfaceC12928g = this.f38483h;
        C12930h c12930h = f38482r;
        long jMo48011V = interfaceC12928g.mo48011V(c12930h);
        boolean z10 = jMo48011V != -1;
        C12924e c12924e = this.f38484i;
        c12924e.skip(z10 ? jMo48011V + ((long) c12930h.m48089I()) : c12924e.getSize());
        return z10;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m41157a0() throws EOFException {
        long jMo48030h0 = this.f38483h.mo48030h0(f38481q);
        C12924e c12924e = this.f38484i;
        c12924e.skip(jMo48030h0 != -1 ? jMo48030h0 + 1 : c12924e.getSize());
    }

    @Override // p404r7.AbstractC10794c
    /* JADX INFO: renamed from: b */
    public void mo41127b() throws EOFException, C10793b {
        int iM41146B = this.f38485j;
        if (iM41146B == 0) {
            iM41146B = m41146B();
        }
        if (iM41146B == 3) {
            m41138q(1);
            this.f38462d[this.f38459a - 1] = 0;
            this.f38485j = 0;
        } else {
            throw new C10792a("Expected BEGIN_ARRAY but was " + mo41137o() + " at path " + getPath());
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m41158b0() throws EOFException {
        long jMo48030h0 = this.f38483h.mo48030h0(f38480p);
        C12924e c12924e = this.f38484i;
        if (jMo48030h0 == -1) {
            jMo48030h0 = c12924e.getSize();
        }
        c12924e.skip(jMo48030h0);
    }

    @Override // p404r7.AbstractC10794c
    /* JADX INFO: renamed from: c */
    public void mo41128c() throws EOFException, C10793b {
        int iM41146B = this.f38485j;
        if (iM41146B == 0) {
            iM41146B = m41146B();
        }
        if (iM41146B == 1) {
            m41138q(3);
            this.f38485j = 0;
            return;
        }
        throw new C10792a("Expected BEGIN_OBJECT but was " + mo41137o() + " at path " + getPath());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        this.f38485j = 0;
        this.f38460b[0] = 8;
        this.f38459a = 1;
        this.f38484i.m48017a();
        this.f38483h.close();
    }

    @Override // p404r7.AbstractC10794c
    /* JADX INFO: renamed from: d */
    public void mo41129d() throws EOFException, C10793b {
        int iM41146B = this.f38485j;
        if (iM41146B == 0) {
            iM41146B = m41146B();
        }
        if (iM41146B != 4) {
            throw new C10792a("Expected END_ARRAY but was " + mo41137o() + " at path " + getPath());
        }
        int i10 = this.f38459a;
        this.f38459a = i10 - 1;
        int[] iArr = this.f38462d;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f38485j = 0;
    }

    @Override // p404r7.AbstractC10794c
    /* JADX INFO: renamed from: e */
    public void mo41130e() throws EOFException, C10793b {
        int iM41146B = this.f38485j;
        if (iM41146B == 0) {
            iM41146B = m41146B();
        }
        if (iM41146B != 2) {
            throw new C10792a("Expected END_OBJECT but was " + mo41137o() + " at path " + getPath());
        }
        int i10 = this.f38459a;
        int i11 = i10 - 1;
        this.f38459a = i11;
        this.f38461c[i11] = null;
        int[] iArr = this.f38462d;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f38485j = 0;
    }

    @Override // p404r7.AbstractC10794c
    /* JADX INFO: renamed from: f */
    public boolean mo41131f() throws EOFException, C10793b {
        int iM41146B = this.f38485j;
        if (iM41146B == 0) {
            iM41146B = m41146B();
        }
        return (iM41146B == 2 || iM41146B == 4 || iM41146B == 18) ? false : true;
    }

    @Override // p404r7.AbstractC10794c
    /* JADX INFO: renamed from: g */
    public boolean mo41132g() throws EOFException, C10793b {
        int iM41146B = this.f38485j;
        if (iM41146B == 0) {
            iM41146B = m41146B();
        }
        if (iM41146B == 5) {
            this.f38485j = 0;
            int[] iArr = this.f38462d;
            int i10 = this.f38459a - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iM41146B == 6) {
            this.f38485j = 0;
            int[] iArr2 = this.f38462d;
            int i11 = this.f38459a - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        }
        throw new C10792a("Expected a boolean but was " + mo41137o() + " at path " + getPath());
    }

    @Override // p404r7.AbstractC10794c
    /* JADX INFO: renamed from: h */
    public double mo41133h() throws EOFException, C10793b {
        int iM41146B = this.f38485j;
        if (iM41146B == 0) {
            iM41146B = m41146B();
        }
        if (iM41146B == 16) {
            this.f38485j = 0;
            int[] iArr = this.f38462d;
            int i10 = this.f38459a - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f38486k;
        }
        if (iM41146B == 17) {
            this.f38488m = this.f38484i.mo47998G1(this.f38487l);
        } else if (iM41146B == 9) {
            this.f38488m = m41150L(f38479o);
        } else if (iM41146B == 8) {
            this.f38488m = m41150L(f38478n);
        } else if (iM41146B == 10) {
            this.f38488m = m41151M();
        } else if (iM41146B != 11) {
            throw new C10792a("Expected a double but was " + mo41137o() + " at path " + getPath());
        }
        this.f38485j = 11;
        try {
            double d10 = Double.parseDouble(this.f38488m);
            if (this.f38463e || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
                this.f38488m = null;
                this.f38485j = 0;
                int[] iArr2 = this.f38462d;
                int i11 = this.f38459a - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return d10;
            }
            throw new C10793b("JSON forbids NaN and infinities: " + d10 + " at path " + getPath());
        } catch (NumberFormatException unused) {
            throw new C10792a("Expected a double but was " + this.f38488m + " at path " + getPath());
        }
    }

    @Override // p404r7.AbstractC10794c
    /* JADX INFO: renamed from: j */
    public int mo41134j() throws EOFException, C10793b {
        int iM41146B = this.f38485j;
        if (iM41146B == 0) {
            iM41146B = m41146B();
        }
        if (iM41146B == 16) {
            long j10 = this.f38486k;
            int i10 = (int) j10;
            if (j10 == i10) {
                this.f38485j = 0;
                int[] iArr = this.f38462d;
                int i11 = this.f38459a - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new C10792a("Expected an int but was " + this.f38486k + " at path " + getPath());
        }
        if (iM41146B == 17) {
            this.f38488m = this.f38484i.mo47998G1(this.f38487l);
        } else if (iM41146B == 9 || iM41146B == 8) {
            String strM41150L = iM41146B == 9 ? m41150L(f38479o) : m41150L(f38478n);
            this.f38488m = strM41150L;
            try {
                int i12 = Integer.parseInt(strM41150L);
                this.f38485j = 0;
                int[] iArr2 = this.f38462d;
                int i13 = this.f38459a - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        } else if (iM41146B != 11) {
            throw new C10792a("Expected an int but was " + mo41137o() + " at path " + getPath());
        }
        this.f38485j = 11;
        try {
            double d10 = Double.parseDouble(this.f38488m);
            int i14 = (int) d10;
            if (i14 == d10) {
                this.f38488m = null;
                this.f38485j = 0;
                int[] iArr3 = this.f38462d;
                int i15 = this.f38459a - 1;
                iArr3[i15] = iArr3[i15] + 1;
                return i14;
            }
            throw new C10792a("Expected an int but was " + this.f38488m + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new C10792a("Expected an int but was " + this.f38488m + " at path " + getPath());
        }
    }

    @Override // p404r7.AbstractC10794c
    /* JADX INFO: renamed from: l */
    public String mo41135l() throws EOFException, C10793b {
        String strM41150L;
        int iM41146B = this.f38485j;
        if (iM41146B == 0) {
            iM41146B = m41146B();
        }
        if (iM41146B == 14) {
            strM41150L = m41151M();
        } else if (iM41146B == 13) {
            strM41150L = m41150L(f38479o);
        } else if (iM41146B == 12) {
            strM41150L = m41150L(f38478n);
        } else {
            if (iM41146B != 15) {
                throw new C10792a("Expected a name but was " + mo41137o() + " at path " + getPath());
            }
            strM41150L = this.f38488m;
        }
        this.f38485j = 0;
        this.f38461c[this.f38459a - 1] = strM41150L;
        return strM41150L;
    }

    @Override // p404r7.AbstractC10794c
    /* JADX INFO: renamed from: m */
    public String mo41136m() throws EOFException, C10793b {
        String strMo47998G1;
        int iM41146B = this.f38485j;
        if (iM41146B == 0) {
            iM41146B = m41146B();
        }
        if (iM41146B == 10) {
            strMo47998G1 = m41151M();
        } else if (iM41146B == 9) {
            strMo47998G1 = m41150L(f38479o);
        } else if (iM41146B == 8) {
            strMo47998G1 = m41150L(f38478n);
        } else if (iM41146B == 11) {
            strMo47998G1 = this.f38488m;
            this.f38488m = null;
        } else if (iM41146B == 16) {
            strMo47998G1 = Long.toString(this.f38486k);
        } else {
            if (iM41146B != 17) {
                throw new C10792a("Expected a string but was " + mo41137o() + " at path " + getPath());
            }
            strMo47998G1 = this.f38484i.mo47998G1(this.f38487l);
        }
        this.f38485j = 0;
        int[] iArr = this.f38462d;
        int i10 = this.f38459a - 1;
        iArr[i10] = iArr[i10] + 1;
        return strMo47998G1;
    }

    @Override // p404r7.AbstractC10794c
    /* JADX INFO: renamed from: o */
    public AbstractC10794c.b mo41137o() throws EOFException, C10793b {
        int iM41146B = this.f38485j;
        if (iM41146B == 0) {
            iM41146B = m41146B();
        }
        switch (iM41146B) {
            case 1:
                return AbstractC10794c.b.BEGIN_OBJECT;
            case 2:
                return AbstractC10794c.b.END_OBJECT;
            case 3:
                return AbstractC10794c.b.BEGIN_ARRAY;
            case 4:
                return AbstractC10794c.b.END_ARRAY;
            case 5:
            case 6:
                return AbstractC10794c.b.BOOLEAN;
            case 7:
                return AbstractC10794c.b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return AbstractC10794c.b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return AbstractC10794c.b.NAME;
            case 16:
            case 17:
                return AbstractC10794c.b.NUMBER;
            case 18:
                return AbstractC10794c.b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // p404r7.AbstractC10794c
    /* JADX INFO: renamed from: r */
    public int mo41139r(AbstractC10794c.a aVar) throws EOFException, C10793b {
        int iM41146B = this.f38485j;
        if (iM41146B == 0) {
            iM41146B = m41146B();
        }
        if (iM41146B < 12 || iM41146B > 15) {
            return -1;
        }
        if (iM41146B == 15) {
            return m41147F(this.f38488m, aVar);
        }
        int iMo48039l3 = this.f38483h.mo48039l3(aVar.f38466b);
        if (iMo48039l3 != -1) {
            this.f38485j = 0;
            this.f38461c[this.f38459a - 1] = aVar.f38465a[iMo48039l3];
            return iMo48039l3;
        }
        String str = this.f38461c[this.f38459a - 1];
        String strMo41135l = mo41135l();
        int iM41147F = m41147F(strMo41135l, aVar);
        if (iM41147F == -1) {
            this.f38485j = 15;
            this.f38488m = strMo41135l;
            this.f38461c[this.f38459a - 1] = str;
        }
        return iM41147F;
    }

    @Override // p404r7.AbstractC10794c
    /* JADX INFO: renamed from: s */
    public void mo41140s() throws EOFException, C10793b {
        if (this.f38464f) {
            throw new C10792a("Cannot skip unexpected " + mo41137o() + " at " + getPath());
        }
        int iM41146B = this.f38485j;
        if (iM41146B == 0) {
            iM41146B = m41146B();
        }
        if (iM41146B == 14) {
            m41158b0();
        } else if (iM41146B == 13) {
            m41155Y(f38479o);
        } else if (iM41146B == 12) {
            m41155Y(f38478n);
        } else if (iM41146B != 15) {
            throw new C10792a("Expected a name but was " + mo41137o() + " at path " + getPath());
        }
        this.f38485j = 0;
        this.f38461c[this.f38459a - 1] = "null";
    }

    public String toString() {
        return "JsonReader(" + this.f38483h + ")";
    }

    @Override // p404r7.AbstractC10794c
    /* JADX INFO: renamed from: u */
    public void mo41141u() throws EOFException, C10793b {
        if (this.f38464f) {
            throw new C10792a("Cannot skip unexpected " + mo41137o() + " at " + getPath());
        }
        int i10 = 0;
        do {
            int iM41146B = this.f38485j;
            if (iM41146B == 0) {
                iM41146B = m41146B();
            }
            if (iM41146B == 3) {
                m41138q(1);
            } else {
                if (iM41146B == 1) {
                    m41138q(3);
                } else if (iM41146B == 4) {
                    i10--;
                    if (i10 < 0) {
                        throw new C10792a("Expected a value but was " + mo41137o() + " at path " + getPath());
                    }
                    this.f38459a--;
                } else if (iM41146B == 2) {
                    i10--;
                    if (i10 < 0) {
                        throw new C10792a("Expected a value but was " + mo41137o() + " at path " + getPath());
                    }
                    this.f38459a--;
                } else if (iM41146B == 14 || iM41146B == 10) {
                    m41158b0();
                } else if (iM41146B == 9 || iM41146B == 13) {
                    m41155Y(f38479o);
                } else if (iM41146B == 8 || iM41146B == 12) {
                    m41155Y(f38478n);
                } else if (iM41146B == 17) {
                    this.f38484i.skip(this.f38487l);
                } else if (iM41146B == 18) {
                    throw new C10792a("Expected a value but was " + mo41137o() + " at path " + getPath());
                }
                this.f38485j = 0;
            }
            i10++;
            this.f38485j = 0;
        } while (i10 != 0);
        int[] iArr = this.f38462d;
        int i11 = this.f38459a;
        int i12 = i11 - 1;
        iArr[i12] = iArr[i12] + 1;
        this.f38461c[i11 - 1] = "null";
    }

    /* JADX INFO: renamed from: y */
    public final void m41159y() throws C10793b {
        if (!this.f38463e) {
            throw m41142w("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }
}
