package p411rg;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mg.C8522c;
import ng.C9470a;
import ng.C9473d;
import p381qg.C10580c;
import p381qg.EnumC10578a;
import p381qg.EnumC10579b;

/* JADX INFO: renamed from: rg.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C10878f {

    /* JADX INFO: renamed from: a */
    public final String f38611a;

    /* JADX INFO: renamed from: b */
    public final boolean f38612b;

    /* JADX INFO: renamed from: c */
    public final C9473d f38613c;

    /* JADX INFO: renamed from: d */
    public final EnumC10578a f38614d;

    /* JADX INFO: renamed from: rg.f$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38615a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f38616b;

        static {
            int[] iArr = new int[EnumC10579b.values().length];
            f38616b = iArr;
            try {
                iArr[EnumC10579b.KANJI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38616b[EnumC10579b.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38616b[EnumC10579b.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38616b[EnumC10579b.BYTE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38616b[EnumC10579b.ECI.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[d.values().length];
            f38615a = iArr2;
            try {
                iArr2[d.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f38615a[d.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f38615a[d.LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: rg.f$b */
    public final class b {

        /* JADX INFO: renamed from: a */
        public final EnumC10579b f38617a;

        /* JADX INFO: renamed from: b */
        public final int f38618b;

        /* JADX INFO: renamed from: c */
        public final int f38619c;

        /* JADX INFO: renamed from: d */
        public final int f38620d;

        /* JADX INFO: renamed from: e */
        public final b f38621e;

        /* JADX INFO: renamed from: f */
        public final int f38622f;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 rg.f), (r2v0 qg.b), (r3v0 int), (r4v0 int), (r5v0 int), (r6v0 rg.f$b), (r7v0 qg.c) A[MD:(rg.f, qg.b, int, int, int, rg.f$b, qg.c):void (m)] (LINE:1) call: rg.f.b.<init>(rg.f, qg.b, int, int, int, rg.f$b, qg.c):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ b(C10878f c10878f, EnumC10579b enumC10579b, int i10, int i11, int i12, b bVar, C10580c c10580c, a aVar) {
            this(enumC10579b, i10, i11, i12, bVar, c10580c);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b(EnumC10579b enumC10579b, int i10, int i11, int i12, b bVar, C10580c c10580c) {
            this.f38617a = enumC10579b;
            this.f38618b = i10;
            EnumC10579b enumC10579b2 = EnumC10579b.BYTE;
            int i13 = (enumC10579b == enumC10579b2 || bVar == null) ? i11 : bVar.f38619c;
            this.f38619c = i13;
            this.f38620d = i12;
            this.f38621e = bVar;
            boolean z10 = false;
            int iM40551b = bVar != null ? bVar.f38622f : 0;
            if ((enumC10579b == enumC10579b2 && bVar == null && i13 != 0) || (bVar != null && i13 != bVar.f38619c)) {
                z10 = true;
            }
            iM40551b = (bVar == null || enumC10579b != bVar.f38617a || z10) ? iM40551b + enumC10579b.m40551b(c10580c) + 4 : iM40551b;
            int i14 = a.f38616b[enumC10579b.ordinal()];
            if (i14 == 1) {
                iM40551b += 13;
            } else if (i14 == 2) {
                iM40551b += i12 == 1 ? 6 : 11;
            } else if (i14 == 3) {
                iM40551b += i12 != 1 ? i12 == 2 ? 7 : 10 : 4;
            } else if (i14 == 4) {
                iM40551b += C10878f.this.f38613c.m37324b(C10878f.this.f38611a.substring(i10, i12 + i10), i11).length * 8;
                if (z10) {
                    iM40551b += 12;
                }
            }
            this.f38622f = iM40551b;
        }
    }

    /* JADX INFO: renamed from: rg.f$c */
    public final class c {

        /* JADX INFO: renamed from: a */
        public final List<a> f38624a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public final C10580c f38625b;

        /* JADX INFO: renamed from: rg.f$c$a */
        public final class a {

            /* JADX INFO: renamed from: a */
            public final EnumC10579b f38627a;

            /* JADX INFO: renamed from: b */
            public final int f38628b;

            /* JADX INFO: renamed from: c */
            public final int f38629c;

            /* JADX INFO: renamed from: d */
            public final int f38630d;

            public a(EnumC10579b enumC10579b, int i10, int i11, int i12) {
                this.f38627a = enumC10579b;
                this.f38628b = i10;
                this.f38629c = i11;
                this.f38630d = i12;
            }

            /* JADX INFO: renamed from: d */
            public final void m41414d(C9470a c9470a) {
                c9470a.m37307c(this.f38627a.m40550a(), 4);
                if (this.f38630d > 0) {
                    c9470a.m37307c(m41415e(), this.f38627a.m40551b(c.this.f38625b));
                }
                if (this.f38627a == EnumC10579b.ECI) {
                    c9470a.m37307c(C10878f.this.f38613c.m37326d(this.f38629c), 8);
                } else if (this.f38630d > 0) {
                    String str = C10878f.this.f38611a;
                    int i10 = this.f38628b;
                    C10875c.m41337c(str.substring(i10, this.f38630d + i10), this.f38627a, c9470a, C10878f.this.f38613c.m37325c(this.f38629c));
                }
            }

            /* JADX INFO: renamed from: e */
            public final int m41415e() {
                if (this.f38627a != EnumC10579b.BYTE) {
                    return this.f38630d;
                }
                C9473d c9473d = C10878f.this.f38613c;
                String str = C10878f.this.f38611a;
                int i10 = this.f38628b;
                return c9473d.m37324b(str.substring(i10, this.f38630d + i10), this.f38629c).length;
            }

            /* JADX INFO: renamed from: f */
            public final int m41416f(C10580c c10580c) {
                int iM41415e;
                int iM40551b = this.f38627a.m40551b(c10580c);
                int i10 = iM40551b + 4;
                int i11 = a.f38616b[this.f38627a.ordinal()];
                if (i11 != 1) {
                    int i12 = 0;
                    if (i11 == 2) {
                        int i13 = this.f38630d;
                        return i10 + ((i13 / 2) * 11) + (i13 % 2 == 1 ? 6 : 0);
                    }
                    if (i11 == 3) {
                        int i14 = this.f38630d;
                        int i15 = i10 + ((i14 / 3) * 10);
                        int i16 = i14 % 3;
                        if (i16 == 1) {
                            i12 = 4;
                        } else if (i16 == 2) {
                            i12 = 7;
                        }
                        return i15 + i12;
                    }
                    if (i11 != 4) {
                        return i11 != 5 ? i10 : iM40551b + 12;
                    }
                    iM41415e = m41415e() * 8;
                } else {
                    iM41415e = this.f38630d * 13;
                }
                return i10 + iM41415e;
            }

            /* JADX INFO: renamed from: g */
            public final String m41417g(String str) {
                StringBuilder sb2 = new StringBuilder();
                for (int i10 = 0; i10 < str.length(); i10++) {
                    if (str.charAt(i10) < ' ' || str.charAt(i10) > '~') {
                        sb2.append('.');
                    } else {
                        sb2.append(str.charAt(i10));
                    }
                }
                return sb2.toString();
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f38627a);
                sb2.append('(');
                if (this.f38627a == EnumC10579b.ECI) {
                    sb2.append(C10878f.this.f38613c.m37325c(this.f38629c).displayName());
                } else {
                    String str = C10878f.this.f38611a;
                    int i10 = this.f38628b;
                    sb2.append(m41417g(str.substring(i10, this.f38630d + i10)));
                }
                sb2.append(')');
                return sb2.toString();
            }
        }

        public c(C10580c c10580c, b bVar) {
            int i10;
            int i11;
            int i12;
            b bVar2 = bVar;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                i10 = 1;
                if (bVar2 == null) {
                    break;
                }
                int i15 = i13 + bVar2.f38620d;
                b bVar3 = bVar2.f38621e;
                boolean z10 = (bVar2.f38617a == EnumC10579b.BYTE && bVar3 == null && bVar2.f38619c != 0) || !(bVar3 == null || bVar2.f38619c == bVar3.f38619c);
                i10 = z10 ? 1 : i14;
                if (bVar3 == null || bVar3.f38617a != bVar2.f38617a || z10) {
                    this.f38624a.add(0, new a(bVar2.f38617a, bVar2.f38618b, bVar2.f38619c, i15));
                    i12 = 0;
                } else {
                    i12 = i15;
                }
                if (z10) {
                    this.f38624a.add(0, new a(EnumC10579b.ECI, bVar2.f38618b, bVar2.f38619c, 0));
                }
                i14 = i10;
                bVar2 = bVar3;
                i13 = i12;
            }
            if (C10878f.this.f38612b) {
                a aVar = this.f38624a.get(0);
                if (aVar != null) {
                    EnumC10579b enumC10579b = aVar.f38627a;
                    int i16 = i14;
                    EnumC10579b enumC10579b2 = EnumC10579b.ECI;
                    if (enumC10579b != enumC10579b2 && i16 != 0) {
                        this.f38624a.add(0, new a(enumC10579b2, 0, 0, 0));
                    }
                }
                this.f38624a.add(this.f38624a.get(0).f38627a == EnumC10579b.ECI ? 1 : 0, new a(EnumC10579b.FNC1_FIRST_POSITION, 0, 0, 0));
            }
            int iM40557f = c10580c.m40557f();
            int i17 = a.f38615a[C10878f.m41391m(c10580c).ordinal()];
            if (i17 == 1) {
                i11 = 9;
            } else if (i17 != 2) {
                i10 = 27;
                i11 = 40;
            } else {
                i10 = 10;
                i11 = 26;
            }
            int iM41409d = m41409d(c10580c);
            while (iM40557f < i11 && !C10875c.m41356v(iM41409d, C10580c.m40553e(iM40557f), C10878f.this.f38614d)) {
                iM40557f++;
            }
            while (iM40557f > i10 && C10875c.m41356v(iM41409d, C10580c.m40553e(iM40557f - 1), C10878f.this.f38614d)) {
                iM40557f--;
            }
            this.f38625b = C10580c.m40553e(iM40557f);
        }

        /* JADX INFO: renamed from: b */
        public void m41407b(C9470a c9470a) {
            Iterator<a> it = this.f38624a.iterator();
            while (it.hasNext()) {
                it.next().m41414d(c9470a);
            }
        }

        /* JADX INFO: renamed from: c */
        public int m41408c() {
            return m41409d(this.f38625b);
        }

        /* JADX INFO: renamed from: d */
        public final int m41409d(C10580c c10580c) {
            Iterator<a> it = this.f38624a.iterator();
            int iM41416f = 0;
            while (it.hasNext()) {
                iM41416f += it.next().m41416f(c10580c);
            }
            return iM41416f;
        }

        /* JADX INFO: renamed from: e */
        public C10580c m41410e() {
            return this.f38625b;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            a aVar = null;
            for (a aVar2 : this.f38624a) {
                if (aVar != null) {
                    sb2.append(",");
                }
                sb2.append(aVar2.toString());
                aVar = aVar2;
            }
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: rg.f$d */
    public enum d {
        SMALL("version 1-9"),
        MEDIUM("version 10-26"),
        LARGE("version 27-40");


        /* JADX INFO: renamed from: a */
        public final String f38636a;

        d(String str) {
            this.f38636a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f38636a;
        }
    }

    public C10878f(String str, Charset charset, boolean z10, EnumC10578a enumC10578a) {
        this.f38611a = str;
        this.f38612b = z10;
        this.f38613c = new C9473d(str, charset, -1);
        this.f38614d = enumC10578a;
    }

    /* JADX INFO: renamed from: h */
    public static c m41388h(String str, C10580c c10580c, Charset charset, boolean z10, EnumC10578a enumC10578a) {
        return new C10878f(str, charset, z10, enumC10578a).m41398i(c10580c);
    }

    /* JADX INFO: renamed from: k */
    public static int m41389k(EnumC10579b enumC10579b) {
        int i10;
        if (enumC10579b == null || (i10 = a.f38616b[enumC10579b.ordinal()]) == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        throw new IllegalStateException("Illegal mode " + enumC10579b);
    }

    /* JADX INFO: renamed from: l */
    public static C10580c m41390l(d dVar) {
        int i10 = a.f38615a[dVar.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? C10580c.m40553e(40) : C10580c.m40553e(26);
        }
        return C10580c.m40553e(9);
    }

    /* JADX INFO: renamed from: m */
    public static d m41391m(C10580c c10580c) {
        if (c10580c.m40557f() <= 9) {
            return d.SMALL;
        }
        return c10580c.m40557f() <= 26 ? d.MEDIUM : d.LARGE;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m41392n(char c10) {
        return C10875c.m41350p(c10) != -1;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m41393o(char c10) {
        return C10875c.m41353s(String.valueOf(c10));
    }

    /* JADX INFO: renamed from: p */
    public static boolean m41394p(char c10) {
        return c10 >= '0' && c10 <= '9';
    }

    /* JADX INFO: renamed from: e */
    public void m41395e(b[][][] bVarArr, int i10, b bVar) {
        b[] bVarArr2 = bVarArr[i10 + bVar.f38620d][bVar.f38619c];
        int iM41389k = m41389k(bVar.f38617a);
        b bVar2 = bVarArr2[iM41389k];
        if (bVar2 == null || bVar2.f38622f > bVar.f38622f) {
            bVarArr2[iM41389k] = bVar;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m41396f(C10580c c10580c, b[][][] bVarArr, int i10, b bVar) {
        int i11;
        int iM37328f = this.f38613c.m37328f();
        int iM37327e = this.f38613c.m37327e();
        if (iM37327e < 0 || !this.f38613c.m37323a(this.f38611a.charAt(i10), iM37327e)) {
            iM37327e = 0;
        } else {
            iM37328f = iM37327e + 1;
        }
        int i12 = iM37328f;
        for (int i13 = iM37327e; i13 < i12; i13++) {
            if (this.f38613c.m37323a(this.f38611a.charAt(i10), i13)) {
                m41395e(bVarArr, i10, new b(this, EnumC10579b.BYTE, i10, i13, 1, bVar, c10580c, null));
            }
        }
        EnumC10579b enumC10579b = EnumC10579b.KANJI;
        if (m41397g(enumC10579b, this.f38611a.charAt(i10))) {
            m41395e(bVarArr, i10, new b(this, enumC10579b, i10, 0, 1, bVar, c10580c, null));
        }
        int length = this.f38611a.length();
        EnumC10579b enumC10579b2 = EnumC10579b.ALPHANUMERIC;
        int i14 = 2;
        if (m41397g(enumC10579b2, this.f38611a.charAt(i10))) {
            int i15 = i10 + 1;
            m41395e(bVarArr, i10, new b(this, enumC10579b2, i10, 0, (i15 >= length || !m41397g(enumC10579b2, this.f38611a.charAt(i15))) ? 1 : 2, bVar, c10580c, null));
        }
        EnumC10579b enumC10579b3 = EnumC10579b.NUMERIC;
        if (m41397g(enumC10579b3, this.f38611a.charAt(i10))) {
            int i16 = i10 + 1;
            if (i16 >= length || !m41397g(enumC10579b3, this.f38611a.charAt(i16))) {
                i11 = 1;
            } else {
                int i17 = i10 + 2;
                if (i17 < length && m41397g(enumC10579b3, this.f38611a.charAt(i17))) {
                    i14 = 3;
                }
                i11 = i14;
            }
            m41395e(bVarArr, i10, new b(this, enumC10579b3, i10, 0, i11, bVar, c10580c, null));
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m41397g(EnumC10579b enumC10579b, char c10) {
        int i10 = a.f38616b[enumC10579b.ordinal()];
        if (i10 == 1) {
            return m41393o(c10);
        }
        if (i10 == 2) {
            return m41392n(c10);
        }
        if (i10 != 3) {
            return i10 == 4;
        }
        return m41394p(c10);
    }

    /* JADX INFO: renamed from: i */
    public c m41398i(C10580c c10580c) throws C8522c {
        if (c10580c != null) {
            c cVarM41399j = m41399j(c10580c);
            if (C10875c.m41356v(cVarM41399j.m41408c(), m41390l(m41391m(cVarM41399j.m41410e())), this.f38614d)) {
                return cVarM41399j;
            }
            throw new C8522c("Data too big for version" + c10580c);
        }
        C10580c[] c10580cArr = {m41390l(d.SMALL), m41390l(d.MEDIUM), m41390l(d.LARGE)};
        c[] cVarArr = {m41399j(c10580cArr[0]), m41399j(c10580cArr[1]), m41399j(c10580cArr[2])};
        int i10 = Integer.MAX_VALUE;
        int i11 = -1;
        for (int i12 = 0; i12 < 3; i12++) {
            int iM41408c = cVarArr[i12].m41408c();
            if (C10875c.m41356v(iM41408c, c10580cArr[i12], this.f38614d) && iM41408c < i10) {
                i11 = i12;
                i10 = iM41408c;
            }
        }
        if (i11 >= 0) {
            return cVarArr[i11];
        }
        throw new C8522c("Data too big for any version");
    }

    /* JADX INFO: renamed from: j */
    public c m41399j(C10580c c10580c) throws C8522c {
        int length = this.f38611a.length();
        b[][][] bVarArr = (b[][][]) Array.newInstance((Class<?>) b.class, length + 1, this.f38613c.m37328f(), 4);
        m41396f(c10580c, bVarArr, 0, null);
        for (int i10 = 1; i10 <= length; i10++) {
            for (int i11 = 0; i11 < this.f38613c.m37328f(); i11++) {
                for (int i12 = 0; i12 < 4; i12++) {
                    b bVar = bVarArr[i10][i11][i12];
                    if (bVar != null && i10 < length) {
                        m41396f(c10580c, bVarArr, i10, bVar);
                    }
                }
            }
        }
        int i13 = -1;
        int i14 = Integer.MAX_VALUE;
        int i15 = -1;
        for (int i16 = 0; i16 < this.f38613c.m37328f(); i16++) {
            for (int i17 = 0; i17 < 4; i17++) {
                b bVar2 = bVarArr[length][i16][i17];
                if (bVar2 != null && bVar2.f38622f < i14) {
                    i14 = bVar2.f38622f;
                    i13 = i16;
                    i15 = i17;
                }
            }
        }
        if (i13 >= 0) {
            return new c(c10580c, bVarArr[length][i13][i15]);
        }
        throw new C8522c("Internal error: failed to encode \"" + this.f38611a + "\"");
    }
}
