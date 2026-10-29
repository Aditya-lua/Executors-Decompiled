package p471um;

import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;
import p560xu.C12919b0;
import p560xu.C12924e;
import p560xu.C12930h;
import p560xu.InterfaceC12928g;

/* JADX INFO: renamed from: um.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C11880o extends AbstractC11878m {

    /* JADX INFO: renamed from: n */
    public static final C12930h f42128n = C12930h.m48080e("'\\");

    /* JADX INFO: renamed from: o */
    public static final C12930h f42129o = C12930h.m48080e("\"\\");

    /* JADX INFO: renamed from: p */
    public static final C12930h f42130p = C12930h.m48080e("{}[]:, \n\t\r\f/\\;#=");

    /* JADX INFO: renamed from: q */
    public static final C12930h f42131q = C12930h.m48080e("\n\r");

    /* JADX INFO: renamed from: r */
    public static final C12930h f42132r = C12930h.m48080e("*/");

    /* JADX INFO: renamed from: g */
    public final InterfaceC12928g f42133g;

    /* JADX INFO: renamed from: h */
    public final C12924e f42134h;

    /* JADX INFO: renamed from: i */
    public int f42135i;

    /* JADX INFO: renamed from: j */
    public long f42136j;

    /* JADX INFO: renamed from: k */
    public int f42137k;

    /* JADX INFO: renamed from: l */
    public String f42138l;

    /* JADX INFO: renamed from: m */
    public C11883r f42139m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C11880o(InterfaceC12928g interfaceC12928g) {
        this.f42135i = 0;
        if (interfaceC12928g == null) {
            throw new NullPointerException("source == null");
        }
        this.f42133g = interfaceC12928g;
        this.f42134h = interfaceC12928g.getBufferField();
        m44342y(6);
    }

    /* JADX INFO: renamed from: A0 */
    public final void m44346A0() throws EOFException {
        long jMo48030h0 = this.f42133g.mo48030h0(f42131q);
        C12924e c12924e = this.f42134h;
        c12924e.skip(jMo48030h0 != -1 ? jMo48030h0 + 1 : c12924e.getSize());
    }

    /* JADX INFO: renamed from: D0 */
    public final void m44347D0() throws EOFException {
        long jMo48030h0 = this.f42133g.mo48030h0(f42130p);
        C12924e c12924e = this.f42134h;
        if (jMo48030h0 == -1) {
            jMo48030h0 = c12924e.getSize();
        }
        c12924e.skip(jMo48030h0);
    }

    @Override // p471um.AbstractC11878m
    /* JADX INFO: renamed from: F */
    public int mo44316F(AbstractC11878m.b bVar) throws C11876k, EOFException {
        int iM44349Z = this.f42135i;
        if (iM44349Z == 0) {
            iM44349Z = m44349Z();
        }
        if (iM44349Z < 12 || iM44349Z > 15) {
            return -1;
        }
        if (iM44349Z == 15) {
            return m44350a0(this.f42138l, bVar);
        }
        int iMo48039l3 = this.f42133g.mo48039l3(bVar.f42116b);
        if (iMo48039l3 != -1) {
            this.f42135i = 0;
            this.f42110c[this.f42108a - 1] = bVar.f42115a[iMo48039l3];
            return iMo48039l3;
        }
        String str = this.f42110c[this.f42108a - 1];
        String strMo44335n = mo44335n();
        int iM44350a0 = m44350a0(strMo44335n, bVar);
        if (iM44350a0 == -1) {
            this.f42135i = 15;
            this.f42138l = strMo44335n;
            this.f42110c[this.f42108a - 1] = str;
        }
        return iM44350a0;
    }

    @Override // p471um.AbstractC11878m
    /* JADX INFO: renamed from: H */
    public int mo44317H(AbstractC11878m.b bVar) throws C11876k, EOFException {
        int iM44349Z = this.f42135i;
        if (iM44349Z == 0) {
            iM44349Z = m44349Z();
        }
        if (iM44349Z < 8 || iM44349Z > 11) {
            return -1;
        }
        if (iM44349Z == 11) {
            return m44351b0(this.f42138l, bVar);
        }
        int iMo48039l3 = this.f42133g.mo48039l3(bVar.f42116b);
        if (iMo48039l3 != -1) {
            this.f42135i = 0;
            int[] iArr = this.f42111d;
            int i10 = this.f42108a - 1;
            iArr[i10] = iArr[i10] + 1;
            return iMo48039l3;
        }
        String strMo44338r = mo44338r();
        int iM44351b0 = m44351b0(strMo44338r, bVar);
        if (iM44351b0 == -1) {
            this.f42135i = 11;
            this.f42138l = strMo44338r;
            int[] iArr2 = this.f42111d;
            int i11 = this.f42108a - 1;
            iArr2[i11] = iArr2[i11] - 1;
        }
        return iM44351b0;
    }

    @Override // p471um.AbstractC11878m
    /* JADX INFO: renamed from: M */
    public void mo44320M() throws C11876k, EOFException {
        if (this.f42113f) {
            AbstractC11878m.c cVarMo44339u = mo44339u();
            mo44335n();
            throw new C11875j("Cannot skip unexpected " + cVarMo44339u + " at " + getPath());
        }
        int iM44349Z = this.f42135i;
        if (iM44349Z == 0) {
            iM44349Z = m44349Z();
        }
        if (iM44349Z == 14) {
            m44347D0();
        } else if (iM44349Z == 13) {
            m44359y0(f42129o);
        } else if (iM44349Z == 12) {
            m44359y0(f42128n);
        } else if (iM44349Z != 15) {
            throw new C11875j("Expected a name but was " + mo44339u() + " at path " + getPath());
        }
        this.f42135i = 0;
        this.f42110c[this.f42108a - 1] = "null";
    }

    @Override // p471um.AbstractC11878m
    /* JADX INFO: renamed from: P */
    public void mo44321P() throws C11876k, EOFException {
        if (this.f42113f) {
            throw new C11875j("Cannot skip unexpected " + mo44339u() + " at " + getPath());
        }
        int i10 = 0;
        do {
            int iM44349Z = this.f42135i;
            if (iM44349Z == 0) {
                iM44349Z = m44349Z();
            }
            if (iM44349Z == 3) {
                m44342y(1);
            } else {
                if (iM44349Z == 1) {
                    m44342y(3);
                } else if (iM44349Z == 4) {
                    i10--;
                    if (i10 < 0) {
                        throw new C11875j("Expected a value but was " + mo44339u() + " at path " + getPath());
                    }
                    this.f42108a--;
                } else if (iM44349Z == 2) {
                    i10--;
                    if (i10 < 0) {
                        throw new C11875j("Expected a value but was " + mo44339u() + " at path " + getPath());
                    }
                    this.f42108a--;
                } else if (iM44349Z == 14 || iM44349Z == 10) {
                    m44347D0();
                } else if (iM44349Z == 9 || iM44349Z == 13) {
                    m44359y0(f42129o);
                } else if (iM44349Z == 8 || iM44349Z == 12) {
                    m44359y0(f42128n);
                } else if (iM44349Z == 17) {
                    this.f42134h.skip(this.f42137k);
                } else if (iM44349Z == 18) {
                    throw new C11875j("Expected a value but was " + mo44339u() + " at path " + getPath());
                }
                this.f42135i = 0;
            }
            i10++;
            this.f42135i = 0;
        } while (i10 != 0);
        int[] iArr = this.f42111d;
        int i11 = this.f42108a;
        int i12 = i11 - 1;
        iArr[i12] = iArr[i12] + 1;
        this.f42110c[i11 - 1] = "null";
    }

    /* JADX INFO: renamed from: Y */
    public final void m44348Y() throws C11876k {
        if (!this.f42112e) {
            throw m44322U("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* JADX INFO: renamed from: Z */
    public final int m44349Z() throws C11876k, EOFException {
        int[] iArr = this.f42109b;
        int i10 = this.f42108a;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int iM44353f0 = m44353f0(true);
            this.f42134h.readByte();
            if (iM44353f0 != 44) {
                if (iM44353f0 != 59) {
                    if (iM44353f0 != 93) {
                        throw m44322U("Unterminated array");
                    }
                    this.f42135i = 4;
                    return 4;
                }
                m44348Y();
            }
        } else {
            if (i11 == 3 || i11 == 5) {
                iArr[i10 - 1] = 4;
                if (i11 == 5) {
                    int iM44353f1 = m44353f0(true);
                    this.f42134h.readByte();
                    if (iM44353f1 != 44) {
                        if (iM44353f1 != 59) {
                            if (iM44353f1 != 125) {
                                throw m44322U("Unterminated object");
                            }
                            this.f42135i = 2;
                            return 2;
                        }
                        m44348Y();
                    }
                }
                int iM44353f2 = m44353f0(true);
                if (iM44353f2 == 34) {
                    this.f42134h.readByte();
                    this.f42135i = 13;
                    return 13;
                }
                if (iM44353f2 == 39) {
                    this.f42134h.readByte();
                    m44348Y();
                    this.f42135i = 12;
                    return 12;
                }
                if (iM44353f2 != 125) {
                    m44348Y();
                    if (!m44352e0((char) iM44353f2)) {
                        throw m44322U("Expected name");
                    }
                    this.f42135i = 14;
                    return 14;
                }
                if (i11 == 5) {
                    throw m44322U("Expected name");
                }
                this.f42134h.readByte();
                this.f42135i = 2;
                return 2;
            }
            if (i11 == 4) {
                iArr[i10 - 1] = 5;
                int iM44353f3 = m44353f0(true);
                this.f42134h.readByte();
                if (iM44353f3 != 58) {
                    if (iM44353f3 != 61) {
                        throw m44322U("Expected ':'");
                    }
                    m44348Y();
                    if (this.f42133g.request(1L) && this.f42134h.m48033j(0L) == 62) {
                        this.f42134h.readByte();
                    }
                }
            } else if (i11 == 6) {
                iArr[i10 - 1] = 7;
            } else if (i11 == 7) {
                if (m44353f0(false) == -1) {
                    this.f42135i = 18;
                    return 18;
                }
                m44348Y();
            } else {
                if (i11 == 9) {
                    this.f42139m.m44389b();
                    this.f42139m = null;
                    this.f42108a--;
                    return m44349Z();
                }
                if (i11 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
            }
        }
        int iM44353f4 = m44353f0(true);
        if (iM44353f4 == 34) {
            this.f42134h.readByte();
            this.f42135i = 9;
            return 9;
        }
        if (iM44353f4 == 39) {
            m44348Y();
            this.f42134h.readByte();
            this.f42135i = 8;
            return 8;
        }
        if (iM44353f4 != 44 && iM44353f4 != 59) {
            if (iM44353f4 == 91) {
                this.f42134h.readByte();
                this.f42135i = 3;
                return 3;
            }
            if (iM44353f4 != 93) {
                if (iM44353f4 == 123) {
                    this.f42134h.readByte();
                    this.f42135i = 1;
                    return 1;
                }
                int iM44356r0 = m44356r0();
                if (iM44356r0 != 0) {
                    return iM44356r0;
                }
                int iM44357t0 = m44357t0();
                if (iM44357t0 != 0) {
                    return iM44357t0;
                }
                if (!m44352e0(this.f42134h.m48033j(0L))) {
                    throw m44322U("Expected value");
                }
                m44348Y();
                this.f42135i = 10;
                return 10;
            }
            if (i11 == 1) {
                this.f42134h.readByte();
                this.f42135i = 4;
                return 4;
            }
        }
        if (i11 != 1 && i11 != 2) {
            throw m44322U("Unexpected value");
        }
        m44348Y();
        this.f42135i = 7;
        return 7;
    }

    @Override // p471um.AbstractC11878m
    /* JADX INFO: renamed from: a */
    public void mo44324a() throws C11876k, EOFException {
        int iM44349Z = this.f42135i;
        if (iM44349Z == 0) {
            iM44349Z = m44349Z();
        }
        if (iM44349Z == 3) {
            m44342y(1);
            this.f42111d[this.f42108a - 1] = 0;
            this.f42135i = 0;
        } else {
            throw new C11875j("Expected BEGIN_ARRAY but was " + mo44339u() + " at path " + getPath());
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final int m44350a0(String str, AbstractC11878m.b bVar) {
        int length = bVar.f42115a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(bVar.f42115a[i10])) {
                this.f42135i = 0;
                this.f42110c[this.f42108a - 1] = str;
                return i10;
            }
        }
        return -1;
    }

    @Override // p471um.AbstractC11878m
    /* JADX INFO: renamed from: b */
    public void mo44325b() throws C11876k, EOFException {
        int iM44349Z = this.f42135i;
        if (iM44349Z == 0) {
            iM44349Z = m44349Z();
        }
        if (iM44349Z == 1) {
            m44342y(3);
            this.f42135i = 0;
            return;
        }
        throw new C11875j("Expected BEGIN_OBJECT but was " + mo44339u() + " at path " + getPath());
    }

    /* JADX INFO: renamed from: b0 */
    public final int m44351b0(String str, AbstractC11878m.b bVar) {
        int length = bVar.f42115a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(bVar.f42115a[i10])) {
                this.f42135i = 0;
                int[] iArr = this.f42111d;
                int i11 = this.f42108a - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
        }
        return -1;
    }

    @Override // p471um.AbstractC11878m
    /* JADX INFO: renamed from: c */
    public void mo44326c() throws C11876k, EOFException {
        int iM44349Z = this.f42135i;
        if (iM44349Z == 0) {
            iM44349Z = m44349Z();
        }
        if (iM44349Z != 4) {
            throw new C11875j("Expected END_ARRAY but was " + mo44339u() + " at path " + getPath());
        }
        int i10 = this.f42108a;
        this.f42108a = i10 - 1;
        int[] iArr = this.f42111d;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f42135i = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        this.f42135i = 0;
        this.f42109b[0] = 8;
        this.f42108a = 1;
        this.f42134h.m48017a();
        this.f42133g.close();
    }

    @Override // p471um.AbstractC11878m
    /* JADX INFO: renamed from: d */
    public void mo44327d() throws C11876k, EOFException {
        int iM44349Z = this.f42135i;
        if (iM44349Z == 0) {
            iM44349Z = m44349Z();
        }
        if (iM44349Z != 2) {
            throw new C11875j("Expected END_OBJECT but was " + mo44339u() + " at path " + getPath());
        }
        int i10 = this.f42108a;
        int i11 = i10 - 1;
        this.f42108a = i11;
        this.f42110c[i11] = null;
        int[] iArr = this.f42111d;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f42135i = 0;
    }

    /* JADX INFO: renamed from: e0 */
    public final boolean m44352e0(int i10) throws C11876k {
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
        m44348Y();
        return false;
    }

    @Override // p471um.AbstractC11878m
    /* JADX INFO: renamed from: f */
    public boolean mo44329f() throws C11876k, EOFException {
        int iM44349Z = this.f42135i;
        if (iM44349Z == 0) {
            iM44349Z = m44349Z();
        }
        return (iM44349Z == 2 || iM44349Z == 4 || iM44349Z == 18) ? false : true;
    }

    /* JADX INFO: renamed from: f0 */
    public final int m44353f0(boolean z10) throws C11876k, EOFException {
        byte bM48033j;
        while (true) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (!this.f42133g.request(i11)) {
                    if (z10) {
                        throw new EOFException("End of input");
                    }
                    return -1;
                }
                bM48033j = this.f42134h.m48033j(i10);
                if (bM48033j == 10 || bM48033j == 32 || bM48033j == 13 || bM48033j == 9) {
                    i10 = i11;
                }
            }
            this.f42134h.skip(i10);
            if (bM48033j == 47) {
                if (this.f42133g.request(2L)) {
                    m44348Y();
                    byte bM48033j2 = this.f42134h.m48033j(1L);
                    if (bM48033j2 == 42) {
                        this.f42134h.readByte();
                        this.f42134h.readByte();
                        if (!m44360z0()) {
                            throw m44322U("Unterminated comment");
                        }
                    } else if (bM48033j2 == 47) {
                        this.f42134h.readByte();
                        this.f42134h.readByte();
                        m44346A0();
                    }
                }
                return bM48033j;
            }
            if (bM48033j != 35) {
                return bM48033j;
            }
            m44348Y();
            m44346A0();
        }
    }

    @Override // p471um.AbstractC11878m
    /* JADX INFO: renamed from: h */
    public boolean mo44331h() throws C11876k, EOFException {
        int iM44349Z = this.f42135i;
        if (iM44349Z == 0) {
            iM44349Z = m44349Z();
        }
        if (iM44349Z == 5) {
            this.f42135i = 0;
            int[] iArr = this.f42111d;
            int i10 = this.f42108a - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iM44349Z == 6) {
            this.f42135i = 0;
            int[] iArr2 = this.f42111d;
            int i11 = this.f42108a - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        }
        throw new C11875j("Expected a boolean but was " + mo44339u() + " at path " + getPath());
    }

    /* JADX INFO: renamed from: i0 */
    public final String m44354i0(C12930h c12930h) throws C11876k, EOFException {
        StringBuilder sb2 = null;
        while (true) {
            long jMo48030h0 = this.f42133g.mo48030h0(c12930h);
            if (jMo48030h0 == -1) {
                throw m44322U("Unterminated string");
            }
            if (this.f42134h.m48033j(jMo48030h0) != 92) {
                if (sb2 == null) {
                    String strMo47998G1 = this.f42134h.mo47998G1(jMo48030h0);
                    this.f42134h.readByte();
                    return strMo47998G1;
                }
                sb2.append(this.f42134h.mo47998G1(jMo48030h0));
                this.f42134h.readByte();
                return sb2.toString();
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(this.f42134h.mo47998G1(jMo48030h0));
            this.f42134h.readByte();
            sb2.append(m44358x0());
        }
    }

    @Override // p471um.AbstractC11878m
    /* JADX INFO: renamed from: j */
    public double mo44332j() throws C11876k, EOFException {
        int iM44349Z = this.f42135i;
        if (iM44349Z == 0) {
            iM44349Z = m44349Z();
        }
        if (iM44349Z == 16) {
            this.f42135i = 0;
            int[] iArr = this.f42111d;
            int i10 = this.f42108a - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f42136j;
        }
        if (iM44349Z == 17) {
            this.f42138l = this.f42134h.mo47998G1(this.f42137k);
        } else if (iM44349Z == 9) {
            this.f42138l = m44354i0(f42129o);
        } else if (iM44349Z == 8) {
            this.f42138l = m44354i0(f42128n);
        } else if (iM44349Z == 10) {
            this.f42138l = m44355l0();
        } else if (iM44349Z != 11) {
            throw new C11875j("Expected a double but was " + mo44339u() + " at path " + getPath());
        }
        this.f42135i = 11;
        try {
            double d10 = Double.parseDouble(this.f42138l);
            if (this.f42112e || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
                this.f42138l = null;
                this.f42135i = 0;
                int[] iArr2 = this.f42111d;
                int i11 = this.f42108a - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return d10;
            }
            throw new C11876k("JSON forbids NaN and infinities: " + d10 + " at path " + getPath());
        } catch (NumberFormatException unused) {
            throw new C11875j("Expected a double but was " + this.f42138l + " at path " + getPath());
        }
    }

    @Override // p471um.AbstractC11878m
    /* JADX INFO: renamed from: l */
    public int mo44333l() throws C11876k, EOFException {
        int iM44349Z = this.f42135i;
        if (iM44349Z == 0) {
            iM44349Z = m44349Z();
        }
        if (iM44349Z == 16) {
            long j10 = this.f42136j;
            int i10 = (int) j10;
            if (j10 == i10) {
                this.f42135i = 0;
                int[] iArr = this.f42111d;
                int i11 = this.f42108a - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new C11875j("Expected an int but was " + this.f42136j + " at path " + getPath());
        }
        if (iM44349Z == 17) {
            this.f42138l = this.f42134h.mo47998G1(this.f42137k);
        } else if (iM44349Z == 9 || iM44349Z == 8) {
            String strM44354i0 = iM44349Z == 9 ? m44354i0(f42129o) : m44354i0(f42128n);
            this.f42138l = strM44354i0;
            try {
                int i12 = Integer.parseInt(strM44354i0);
                this.f42135i = 0;
                int[] iArr2 = this.f42111d;
                int i13 = this.f42108a - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        } else if (iM44349Z != 11) {
            throw new C11875j("Expected an int but was " + mo44339u() + " at path " + getPath());
        }
        this.f42135i = 11;
        try {
            double d10 = Double.parseDouble(this.f42138l);
            int i14 = (int) d10;
            if (i14 == d10) {
                this.f42138l = null;
                this.f42135i = 0;
                int[] iArr3 = this.f42111d;
                int i15 = this.f42108a - 1;
                iArr3[i15] = iArr3[i15] + 1;
                return i14;
            }
            throw new C11875j("Expected an int but was " + this.f42138l + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new C11875j("Expected an int but was " + this.f42138l + " at path " + getPath());
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final String m44355l0() {
        long jMo48030h0 = this.f42133g.mo48030h0(f42130p);
        return jMo48030h0 != -1 ? this.f42134h.mo47998G1(jMo48030h0) : this.f42134h.mo48008R2();
    }

    @Override // p471um.AbstractC11878m
    /* JADX INFO: renamed from: m */
    public long mo44334m() throws C11876k, EOFException {
        int iM44349Z = this.f42135i;
        if (iM44349Z == 0) {
            iM44349Z = m44349Z();
        }
        if (iM44349Z == 16) {
            this.f42135i = 0;
            int[] iArr = this.f42111d;
            int i10 = this.f42108a - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f42136j;
        }
        if (iM44349Z == 17) {
            this.f42138l = this.f42134h.mo47998G1(this.f42137k);
        } else if (iM44349Z == 9 || iM44349Z == 8) {
            String strM44354i0 = iM44349Z == 9 ? m44354i0(f42129o) : m44354i0(f42128n);
            this.f42138l = strM44354i0;
            try {
                long j10 = Long.parseLong(strM44354i0);
                this.f42135i = 0;
                int[] iArr2 = this.f42111d;
                int i11 = this.f42108a - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return j10;
            } catch (NumberFormatException unused) {
            }
        } else if (iM44349Z != 11) {
            throw new C11875j("Expected a long but was " + mo44339u() + " at path " + getPath());
        }
        this.f42135i = 11;
        try {
            long jLongValueExact = new BigDecimal(this.f42138l).longValueExact();
            this.f42138l = null;
            this.f42135i = 0;
            int[] iArr3 = this.f42111d;
            int i12 = this.f42108a - 1;
            iArr3[i12] = iArr3[i12] + 1;
            return jLongValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            throw new C11875j("Expected a long but was " + this.f42138l + " at path " + getPath());
        }
    }

    @Override // p471um.AbstractC11878m
    /* JADX INFO: renamed from: n */
    public String mo44335n() throws C11876k, EOFException {
        String strM44354i0;
        int iM44349Z = this.f42135i;
        if (iM44349Z == 0) {
            iM44349Z = m44349Z();
        }
        if (iM44349Z == 14) {
            strM44354i0 = m44355l0();
        } else if (iM44349Z == 13) {
            strM44354i0 = m44354i0(f42129o);
        } else if (iM44349Z == 12) {
            strM44354i0 = m44354i0(f42128n);
        } else {
            if (iM44349Z != 15) {
                throw new C11875j("Expected a name but was " + mo44339u() + " at path " + getPath());
            }
            strM44354i0 = this.f42138l;
            this.f42138l = null;
        }
        this.f42135i = 0;
        this.f42110c[this.f42108a - 1] = strM44354i0;
        return strM44354i0;
    }

    @Override // p471um.AbstractC11878m
    /* JADX INFO: renamed from: o */
    public <T> T mo44336o() throws C11876k, EOFException {
        int iM44349Z = this.f42135i;
        if (iM44349Z == 0) {
            iM44349Z = m44349Z();
        }
        if (iM44349Z == 7) {
            this.f42135i = 0;
            int[] iArr = this.f42111d;
            int i10 = this.f42108a - 1;
            iArr[i10] = iArr[i10] + 1;
            return null;
        }
        throw new C11875j("Expected null but was " + mo44339u() + " at path " + getPath());
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00bd  */
    @Override // p471um.AbstractC11878m
    /* JADX INFO: renamed from: q */
    public InterfaceC12928g mo44337q() throws IOException {
        int i10;
        int iM44349Z = this.f42135i;
        if (iM44349Z == 0) {
            iM44349Z = m44349Z();
        }
        C12924e c12924e = new C12924e();
        C12930h c12930h = C11883r.f42155m;
        if (iM44349Z != 3) {
            if (iM44349Z == 1) {
                c12924e.mo47992C0("{");
                c12930h = C11883r.f42150h;
            } else {
                if (iM44349Z == 9) {
                    c12924e.mo47992C0("\"");
                    c12930h = C11883r.f42152j;
                } else if (iM44349Z == 8) {
                    c12924e.mo47992C0("'");
                    c12930h = C11883r.f42151i;
                } else if (iM44349Z == 17 || iM44349Z == 16 || iM44349Z == 10) {
                    c12924e.mo47992C0(mo44338r());
                } else if (iM44349Z == 5) {
                    c12924e.mo47992C0("true");
                } else if (iM44349Z == 6) {
                    c12924e.mo47992C0("false");
                } else if (iM44349Z == 7) {
                    c12924e.mo47992C0("null");
                } else {
                    if (iM44349Z != 11) {
                        throw new C11875j("Expected a value but was " + mo44339u() + " at path " + getPath());
                    }
                    String strMo44338r = mo44338r();
                    AbstractC11885t abstractC11885tM44393q = AbstractC11885t.m44393q(c12924e);
                    try {
                        abstractC11885tM44393q.mo44367M(strMo44338r);
                        abstractC11885tM44393q.close();
                    } catch (Throwable th2) {
                        if (abstractC11885tM44393q != null) {
                            try {
                                abstractC11885tM44393q.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                }
                i10 = 0;
            }
            if (this.f42135i != 0) {
                int[] iArr = this.f42111d;
                int i11 = this.f42108a - 1;
                iArr[i11] = iArr[i11] + 1;
                this.f42135i = 0;
            }
            this.f42139m = new C11883r(this.f42133g, c12924e, c12930h, i10);
            m44342y(9);
            return C12919b0.m47961c(this.f42139m);
        }
        c12924e.mo47992C0("[");
        c12930h = C11883r.f42150h;
        i10 = 1;
        if (this.f42135i != 0) {
            int[] iArr2 = this.f42111d;
            int i12 = this.f42108a - 1;
            iArr2[i12] = iArr2[i12] + 1;
            this.f42135i = 0;
        }
        this.f42139m = new C11883r(this.f42133g, c12924e, c12930h, i10);
        m44342y(9);
        return C12919b0.m47961c(this.f42139m);
    }

    @Override // p471um.AbstractC11878m
    /* JADX INFO: renamed from: r */
    public String mo44338r() throws C11876k, EOFException {
        String strMo47998G1;
        int iM44349Z = this.f42135i;
        if (iM44349Z == 0) {
            iM44349Z = m44349Z();
        }
        if (iM44349Z == 10) {
            strMo47998G1 = m44355l0();
        } else if (iM44349Z == 9) {
            strMo47998G1 = m44354i0(f42129o);
        } else if (iM44349Z == 8) {
            strMo47998G1 = m44354i0(f42128n);
        } else if (iM44349Z == 11) {
            strMo47998G1 = this.f42138l;
            this.f42138l = null;
        } else if (iM44349Z == 16) {
            strMo47998G1 = Long.toString(this.f42136j);
        } else {
            if (iM44349Z != 17) {
                throw new C11875j("Expected a string but was " + mo44339u() + " at path " + getPath());
            }
            strMo47998G1 = this.f42134h.mo47998G1(this.f42137k);
        }
        this.f42135i = 0;
        int[] iArr = this.f42111d;
        int i10 = this.f42108a - 1;
        iArr[i10] = iArr[i10] + 1;
        return strMo47998G1;
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
    /* JADX INFO: renamed from: r0 */
    public final int m44356r0() throws EOFException {
        String str;
        String str2;
        int i10;
        byte bM48033j = this.f42134h.m48033j(0L);
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
            if (!this.f42133g.request(i12)) {
                return 0;
            }
            byte bM48033j2 = this.f42134h.m48033j(i11);
            if (bM48033j2 != str.charAt(i11) && bM48033j2 != str2.charAt(i11)) {
                return 0;
            }
            i11 = i12;
        }
        if (this.f42133g.request(length + 1) && m44352e0(this.f42134h.m48033j(length))) {
            return 0;
        }
        this.f42134h.skip(length);
        this.f42135i = i10;
        return i10;
    }

    /* JADX INFO: renamed from: t0 */
    public final int m44357t0() throws EOFException {
        long j10;
        int i10;
        boolean z10 = true;
        int i11 = 0;
        char c10 = 0;
        long j11 = 0;
        boolean z11 = false;
        while (true) {
            int i12 = i11 + 1;
            if (!this.f42133g.request(i12)) {
                j10 = 0;
                i10 = 0;
                break;
            }
            j10 = 0;
            byte bM48033j = this.f42134h.m48033j(i11);
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
                            if (!m44352e0(bM48033j)) {
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
            this.f42136j = j11;
            this.f42134h.skip(i11);
            this.f42135i = 16;
            return 16;
        }
        if (c10 != 2 && c10 != 4 && c10 != 7) {
            return i10;
        }
        this.f42137k = i11;
        this.f42135i = 17;
        return 17;
    }

    public String toString() {
        return "JsonReader(" + this.f42133g + ")";
    }

    @Override // p471um.AbstractC11878m
    /* JADX INFO: renamed from: u */
    public AbstractC11878m.c mo44339u() throws C11876k, EOFException {
        int iM44349Z = this.f42135i;
        if (iM44349Z == 0) {
            iM44349Z = m44349Z();
        }
        switch (iM44349Z) {
            case 1:
                return AbstractC11878m.c.BEGIN_OBJECT;
            case 2:
                return AbstractC11878m.c.END_OBJECT;
            case 3:
                return AbstractC11878m.c.BEGIN_ARRAY;
            case 4:
                return AbstractC11878m.c.END_ARRAY;
            case 5:
            case 6:
                return AbstractC11878m.c.BOOLEAN;
            case 7:
                return AbstractC11878m.c.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return AbstractC11878m.c.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return AbstractC11878m.c.NAME;
            case 16:
            case 17:
                return AbstractC11878m.c.NUMBER;
            case 18:
                return AbstractC11878m.c.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // p471um.AbstractC11878m
    /* JADX INFO: renamed from: v */
    public AbstractC11878m mo44340v() {
        return new C11880o(this);
    }

    @Override // p471um.AbstractC11878m
    /* JADX INFO: renamed from: w */
    public void mo44341w() {
        if (mo44329f()) {
            this.f42138l = mo44335n();
            this.f42135i = 11;
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final char m44358x0() throws C11876k, EOFException {
        int i10;
        if (!this.f42133g.request(1L)) {
            throw m44322U("Unterminated escape sequence");
        }
        byte b = this.f42134h.readByte();
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
            if (this.f42112e) {
                return (char) b;
            }
            throw m44322U("Invalid escape sequence: \\" + ((char) b));
        }
        if (!this.f42133g.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            byte bM48033j = this.f42134h.m48033j(i11);
            char c11 = (char) (c10 << 4);
            if (bM48033j >= 48 && bM48033j <= 57) {
                i10 = bM48033j - 48;
            } else if (bM48033j >= 97 && bM48033j <= 102) {
                i10 = bM48033j - 87;
            } else {
                if (bM48033j < 65 || bM48033j > 70) {
                    throw m44322U("\\u" + this.f42134h.mo47998G1(4L));
                }
                i10 = bM48033j - 55;
            }
            c10 = (char) (c11 + i10);
        }
        this.f42134h.skip(4L);
        return c10;
    }

    /* JADX INFO: renamed from: y0 */
    public final void m44359y0(C12930h c12930h) throws C11876k, EOFException {
        while (true) {
            long jMo48030h0 = this.f42133g.mo48030h0(c12930h);
            if (jMo48030h0 == -1) {
                throw m44322U("Unterminated string");
            }
            if (this.f42134h.m48033j(jMo48030h0) != 92) {
                this.f42134h.skip(jMo48030h0 + 1);
                return;
            } else {
                this.f42134h.skip(jMo48030h0 + 1);
                m44358x0();
            }
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final boolean m44360z0() throws EOFException {
        InterfaceC12928g interfaceC12928g = this.f42133g;
        C12930h c12930h = f42132r;
        long jMo48011V = interfaceC12928g.mo48011V(c12930h);
        boolean z10 = jMo48011V != -1;
        C12924e c12924e = this.f42134h;
        c12924e.skip(z10 ? jMo48011V + ((long) c12930h.m48089I()) : c12924e.getSize());
        return z10;
    }

    public C11880o(C11880o c11880o) {
        super(c11880o);
        this.f42135i = 0;
        InterfaceC12928g interfaceC12928gPeek = c11880o.f42133g.peek();
        this.f42133g = interfaceC12928gPeek;
        this.f42134h = interfaceC12928gPeek.getBufferField();
        this.f42135i = c11880o.f42135i;
        this.f42136j = c11880o.f42136j;
        this.f42137k = c11880o.f42137k;
        this.f42138l = c11880o.f42138l;
        try {
            interfaceC12928gPeek.mo48054w1(c11880o.f42134h.getSize());
        } catch (IOException unused) {
            throw new AssertionError();
        }
    }
}
