package qg;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29840a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mg.d f29841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pg.a f29842d;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29843a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[pg.b.values().length];
            b = iArr;
            try {
                iArr[pg.b.KANJI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[pg.b.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[pg.b.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[pg.b.BYTE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[pg.b.ECI.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[d.values().length];
            f29843a = iArr2;
            try {
                iArr2[d.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29843a[d.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f29843a[d.LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final pg.b f29844a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f29845c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f29846d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final b f29847e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f29848f;

        public /* synthetic */ b(f fVar, pg.b bVar, int i10, int i11, int i12, b bVar2, pg.c cVar, a aVar) {
            this(bVar, i10, i11, i12, bVar2, cVar);
        }

        public b(pg.b bVar, int i10, int i11, int i12, b bVar2, pg.c cVar) {
            this.f29844a = bVar;
            this.b = i10;
            pg.b bVar3 = pg.b.BYTE;
            int i13 = (bVar == bVar3 || bVar2 == null) ? i11 : bVar2.f29845c;
            this.f29845c = i13;
            this.f29846d = i12;
            this.f29847e = bVar2;
            boolean z10 = false;
            int iB = bVar2 != null ? bVar2.f29848f : 0;
            if ((bVar == bVar3 && bVar2 == null && i13 != 0) || (bVar2 != null && i13 != bVar2.f29845c)) {
                z10 = true;
            }
            iB = (bVar2 == null || bVar != bVar2.f29844a || z10) ? iB + bVar.b(cVar) + 4 : iB;
            int i14 = a.b[bVar.ordinal()];
            if (i14 == 1) {
                iB += 13;
            } else if (i14 == 2) {
                iB += i12 == 1 ? 6 : 11;
            } else if (i14 == 3) {
                iB += i12 != 1 ? i12 == 2 ? 7 : 10 : 4;
            } else if (i14 == 4) {
                iB += f.this.f29841c.b(f.this.f29840a.substring(i10, i12 + i10), i11).length * 8;
                if (z10) {
                    iB += 12;
                }
            }
            this.f29848f = iB;
        }
    }

    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<a> f29850a = new ArrayList();
        public final pg.c b;

        public final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final pg.b f29852a;
            public final int b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f29853c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final int f29854d;

            public a(pg.b bVar, int i10, int i11, int i12) {
                this.f29852a = bVar;
                this.b = i10;
                this.f29853c = i11;
                this.f29854d = i12;
            }

            public final void d(mg.a aVar) {
                aVar.c(this.f29852a.a(), 4);
                if (this.f29854d > 0) {
                    aVar.c(e(), this.f29852a.b(c.this.b));
                }
                if (this.f29852a == pg.b.ECI) {
                    aVar.c(f.this.f29841c.d(this.f29853c), 8);
                } else if (this.f29854d > 0) {
                    String str = f.this.f29840a;
                    int i10 = this.b;
                    qg.c.c(str.substring(i10, this.f29854d + i10), this.f29852a, aVar, f.this.f29841c.c(this.f29853c));
                }
            }

            public final int e() {
                if (this.f29852a != pg.b.BYTE) {
                    return this.f29854d;
                }
                mg.d dVar = f.this.f29841c;
                String str = f.this.f29840a;
                int i10 = this.b;
                return dVar.b(str.substring(i10, this.f29854d + i10), this.f29853c).length;
            }

            public final int f(pg.c cVar) {
                int iE;
                int iB = this.f29852a.b(cVar);
                int i10 = iB + 4;
                int i11 = a.b[this.f29852a.ordinal()];
                if (i11 != 1) {
                    int i12 = 0;
                    if (i11 == 2) {
                        int i13 = this.f29854d;
                        return i10 + ((i13 / 2) * 11) + (i13 % 2 == 1 ? 6 : 0);
                    }
                    if (i11 == 3) {
                        int i14 = this.f29854d;
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
                        return i11 != 5 ? i10 : iB + 12;
                    }
                    iE = e() * 8;
                } else {
                    iE = this.f29854d * 13;
                }
                return i10 + iE;
            }

            public final String g(String str) {
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
                sb2.append(this.f29852a);
                sb2.append('(');
                if (this.f29852a == pg.b.ECI) {
                    sb2.append(f.this.f29841c.c(this.f29853c).displayName());
                } else {
                    String str = f.this.f29840a;
                    int i10 = this.b;
                    sb2.append(g(str.substring(i10, this.f29854d + i10)));
                }
                sb2.append(')');
                return sb2.toString();
            }
        }

        public c(pg.c cVar, b bVar) {
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
                int i15 = i13 + bVar2.f29846d;
                b bVar3 = bVar2.f29847e;
                boolean z10 = (bVar2.f29844a == pg.b.BYTE && bVar3 == null && bVar2.f29845c != 0) || !(bVar3 == null || bVar2.f29845c == bVar3.f29845c);
                i10 = z10 ? 1 : i14;
                if (bVar3 == null || bVar3.f29844a != bVar2.f29844a || z10) {
                    this.f29850a.add(0, new a(bVar2.f29844a, bVar2.b, bVar2.f29845c, i15));
                    i12 = 0;
                } else {
                    i12 = i15;
                }
                if (z10) {
                    this.f29850a.add(0, new a(pg.b.ECI, bVar2.b, bVar2.f29845c, 0));
                }
                i14 = i10;
                bVar2 = bVar3;
                i13 = i12;
            }
            if (f.this.b) {
                a aVar = this.f29850a.get(0);
                if (aVar != null) {
                    pg.b bVar4 = aVar.f29852a;
                    int i16 = i14;
                    pg.b bVar5 = pg.b.ECI;
                    if (bVar4 != bVar5 && i16 != 0) {
                        this.f29850a.add(0, new a(bVar5, 0, 0, 0));
                    }
                }
                this.f29850a.add(this.f29850a.get(0).f29852a == pg.b.ECI ? 1 : 0, new a(pg.b.FNC1_FIRST_POSITION, 0, 0, 0));
            }
            int iF = cVar.f();
            int i17 = a.f29843a[f.m(cVar).ordinal()];
            if (i17 == 1) {
                i11 = 9;
            } else if (i17 != 2) {
                i10 = 27;
                i11 = 40;
            } else {
                i10 = 10;
                i11 = 26;
            }
            int iD = d(cVar);
            while (iF < i11 && !qg.c.v(iD, pg.c.e(iF), f.this.f29842d)) {
                iF++;
            }
            while (iF > i10 && qg.c.v(iD, pg.c.e(iF - 1), f.this.f29842d)) {
                iF--;
            }
            this.b = pg.c.e(iF);
        }

        public void b(mg.a aVar) {
            Iterator<a> it = this.f29850a.iterator();
            while (it.hasNext()) {
                it.next().d(aVar);
            }
        }

        public int c() {
            return d(this.b);
        }

        public final int d(pg.c cVar) {
            Iterator<a> it = this.f29850a.iterator();
            int iF = 0;
            while (it.hasNext()) {
                iF += it.next().f(cVar);
            }
            return iF;
        }

        public pg.c e() {
            return this.b;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            a aVar = null;
            for (a aVar2 : this.f29850a) {
                if (aVar != null) {
                    sb2.append(",");
                }
                sb2.append(aVar2.toString());
                aVar = aVar2;
            }
            return sb2.toString();
        }
    }

    public enum d {
        SMALL("version 1-9"),
        MEDIUM("version 10-26"),
        LARGE("version 27-40");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f29859a;

        d(String str) {
            this.f29859a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f29859a;
        }
    }

    public f(String str, Charset charset, boolean z10, pg.a aVar) {
        this.f29840a = str;
        this.b = z10;
        this.f29841c = new mg.d(str, charset, -1);
        this.f29842d = aVar;
    }

    public static c h(String str, pg.c cVar, Charset charset, boolean z10, pg.a aVar) {
        return new f(str, charset, z10, aVar).i(cVar);
    }

    public static int k(pg.b bVar) {
        int i10;
        if (bVar == null || (i10 = a.b[bVar.ordinal()]) == 1) {
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
        throw new IllegalStateException("Illegal mode " + bVar);
    }

    public static pg.c l(d dVar) {
        int i10 = a.f29843a[dVar.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? pg.c.e(40) : pg.c.e(26);
        }
        return pg.c.e(9);
    }

    public static d m(pg.c cVar) {
        if (cVar.f() <= 9) {
            return d.SMALL;
        }
        return cVar.f() <= 26 ? d.MEDIUM : d.LARGE;
    }

    public static boolean n(char c10) {
        return qg.c.p(c10) != -1;
    }

    public static boolean o(char c10) {
        return qg.c.s(String.valueOf(c10));
    }

    public static boolean p(char c10) {
        return c10 >= '0' && c10 <= '9';
    }

    public void e(b[][][] bVarArr, int i10, b bVar) {
        b[] bVarArr2 = bVarArr[i10 + bVar.f29846d][bVar.f29845c];
        int iK = k(bVar.f29844a);
        b bVar2 = bVarArr2[iK];
        if (bVar2 == null || bVar2.f29848f > bVar.f29848f) {
            bVarArr2[iK] = bVar;
        }
    }

    public void f(pg.c cVar, b[][][] bVarArr, int i10, b bVar) {
        int i11;
        int iF = this.f29841c.f();
        int iE = this.f29841c.e();
        if (iE < 0 || !this.f29841c.a(this.f29840a.charAt(i10), iE)) {
            iE = 0;
        } else {
            iF = iE + 1;
        }
        int i12 = iF;
        for (int i13 = iE; i13 < i12; i13++) {
            if (this.f29841c.a(this.f29840a.charAt(i10), i13)) {
                e(bVarArr, i10, new b(this, pg.b.BYTE, i10, i13, 1, bVar, cVar, null));
            }
        }
        pg.b bVar2 = pg.b.KANJI;
        if (g(bVar2, this.f29840a.charAt(i10))) {
            e(bVarArr, i10, new b(this, bVar2, i10, 0, 1, bVar, cVar, null));
        }
        int length = this.f29840a.length();
        pg.b bVar3 = pg.b.ALPHANUMERIC;
        int i14 = 2;
        if (g(bVar3, this.f29840a.charAt(i10))) {
            int i15 = i10 + 1;
            e(bVarArr, i10, new b(this, bVar3, i10, 0, (i15 >= length || !g(bVar3, this.f29840a.charAt(i15))) ? 1 : 2, bVar, cVar, null));
        }
        pg.b bVar4 = pg.b.NUMERIC;
        if (g(bVar4, this.f29840a.charAt(i10))) {
            int i16 = i10 + 1;
            if (i16 >= length || !g(bVar4, this.f29840a.charAt(i16))) {
                i11 = 1;
            } else {
                int i17 = i10 + 2;
                if (i17 < length && g(bVar4, this.f29840a.charAt(i17))) {
                    i14 = 3;
                }
                i11 = i14;
            }
            e(bVarArr, i10, new b(this, bVar4, i10, 0, i11, bVar, cVar, null));
        }
    }

    public boolean g(pg.b bVar, char c10) {
        int i10 = a.b[bVar.ordinal()];
        if (i10 == 1) {
            return o(c10);
        }
        if (i10 == 2) {
            return n(c10);
        }
        if (i10 != 3) {
            return i10 == 4;
        }
        return p(c10);
    }

    public c i(pg.c cVar) throws lg.c {
        if (cVar != null) {
            c cVarJ = j(cVar);
            if (qg.c.v(cVarJ.c(), l(m(cVarJ.e())), this.f29842d)) {
                return cVarJ;
            }
            throw new lg.c("Data too big for version" + cVar);
        }
        pg.c[] cVarArr = {l(d.SMALL), l(d.MEDIUM), l(d.LARGE)};
        c[] cVarArr2 = {j(cVarArr[0]), j(cVarArr[1]), j(cVarArr[2])};
        int i10 = Integer.MAX_VALUE;
        int i11 = -1;
        for (int i12 = 0; i12 < 3; i12++) {
            int iC = cVarArr2[i12].c();
            if (qg.c.v(iC, cVarArr[i12], this.f29842d) && iC < i10) {
                i11 = i12;
                i10 = iC;
            }
        }
        if (i11 >= 0) {
            return cVarArr2[i11];
        }
        throw new lg.c("Data too big for any version");
    }

    public c j(pg.c cVar) throws lg.c {
        int length = this.f29840a.length();
        b[][][] bVarArr = (b[][][]) Array.newInstance((Class<?>) b.class, length + 1, this.f29841c.f(), 4);
        f(cVar, bVarArr, 0, null);
        for (int i10 = 1; i10 <= length; i10++) {
            for (int i11 = 0; i11 < this.f29841c.f(); i11++) {
                for (int i12 = 0; i12 < 4; i12++) {
                    b bVar = bVarArr[i10][i11][i12];
                    if (bVar != null && i10 < length) {
                        f(cVar, bVarArr, i10, bVar);
                    }
                }
            }
        }
        int i13 = -1;
        int i14 = Integer.MAX_VALUE;
        int i15 = -1;
        for (int i16 = 0; i16 < this.f29841c.f(); i16++) {
            for (int i17 = 0; i17 < 4; i17++) {
                b bVar2 = bVarArr[length][i16][i17];
                if (bVar2 != null && bVar2.f29848f < i14) {
                    i14 = bVar2.f29848f;
                    i13 = i16;
                    i15 = i17;
                }
            }
        }
        if (i13 >= 0) {
            return new c(cVar, bVarArr[length][i13][i15]);
        }
        throw new lg.c("Internal error: failed to encode \"" + this.f29840a + "\"");
    }
}
