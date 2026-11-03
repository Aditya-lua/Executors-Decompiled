package he;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final he.d f19411a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f19412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19413d;

    public class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ he.d f19414a;

        /* JADX INFO: renamed from: he.p$a$a, reason: collision with other inner class name */
        public class C0343a extends d {
            public C0343a(p pVar, CharSequence charSequence) {
                super(pVar, charSequence);
            }

            @Override // he.p.d
            public int g(int i10) {
                return i10 + 1;
            }

            @Override // he.p.d
            public int h(int i10) {
                return a.this.f19414a.b(this.f19419c, i10);
            }
        }

        public a(he.d dVar) {
            this.f19414a = dVar;
        }

        @Override // he.p.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(p pVar, CharSequence charSequence) {
            return new C0343a(pVar, charSequence);
        }
    }

    public class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f19416a;

        public class a extends d {
            public a(p pVar, CharSequence charSequence) {
                super(pVar, charSequence);
            }

            @Override // he.p.d
            public int g(int i10) {
                return i10;
            }

            @Override // he.p.d
            public int h(int i10) {
                int i11 = i10 + b.this.f19416a;
                if (i11 < this.f19419c.length()) {
                    return i11;
                }
                return -1;
            }
        }

        public b(int i10) {
            this.f19416a = i10;
        }

        @Override // he.p.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(p pVar, CharSequence charSequence) {
            return new a(pVar, charSequence);
        }
    }

    public class c implements Iterable<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CharSequence f19418a;

        public c(CharSequence charSequence) {
            this.f19418a = charSequence;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return p.this.i(this.f19418a);
        }

        public String toString() {
            g gVarD = g.d(", ");
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            StringBuilder sbB = gVarD.b(sb2, this);
            sbB.append(']');
            return sbB.toString();
        }
    }

    public static abstract class d extends he.b<String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CharSequence f19419c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final he.d f19420d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f19421e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f19422f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f19423g;

        public d(p pVar, CharSequence charSequence) {
            this.f19420d = pVar.f19411a;
            this.f19421e = pVar.b;
            this.f19423g = pVar.f19413d;
            this.f19419c = charSequence;
        }

        @Override // he.b
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public String b() {
            int i10 = this.f19422f;
            while (true) {
                int i11 = this.f19422f;
                if (i11 == -1) {
                    return d();
                }
                int iH = h(i11);
                if (iH == -1) {
                    iH = this.f19419c.length();
                    this.f19422f = -1;
                } else {
                    this.f19422f = g(iH);
                }
                int i12 = this.f19422f;
                if (i12 == i10) {
                    int i13 = i12 + 1;
                    this.f19422f = i13;
                    if (i13 > this.f19419c.length()) {
                        this.f19422f = -1;
                    }
                } else {
                    while (i10 < iH && this.f19420d.d(this.f19419c.charAt(i10))) {
                        i10++;
                    }
                    while (iH > i10 && this.f19420d.d(this.f19419c.charAt(iH - 1))) {
                        iH--;
                    }
                    if (!this.f19421e || i10 != iH) {
                        int i14 = this.f19423g;
                        if (i14 == 1) {
                            iH = this.f19419c.length();
                            this.f19422f = -1;
                            while (iH > i10 && this.f19420d.d(this.f19419c.charAt(iH - 1))) {
                                iH--;
                            }
                        } else {
                            this.f19423g = i14 - 1;
                        }
                        return this.f19419c.subSequence(i10, iH).toString();
                    }
                    i10 = this.f19422f;
                }
            }
        }

        public abstract int g(int i10);

        public abstract int h(int i10);
    }

    public interface e {
        Iterator<String> a(p pVar, CharSequence charSequence);
    }

    public p(e eVar) {
        this(eVar, false, he.d.e(), Integer.MAX_VALUE);
    }

    public static p e(int i10) {
        n.e(i10 > 0, "The length may not be less than 1");
        return new p(new b(i10));
    }

    public static p f(char c10) {
        return g(he.d.c(c10));
    }

    public static p g(he.d dVar) {
        n.l(dVar);
        return new p(new a(dVar));
    }

    public Iterable<String> h(CharSequence charSequence) {
        n.l(charSequence);
        return new c(charSequence);
    }

    public final Iterator<String> i(CharSequence charSequence) {
        return this.f19412c.a(this, charSequence);
    }

    public p(e eVar, boolean z10, he.d dVar, int i10) {
        this.f19412c = eVar;
        this.b = z10;
        this.f19411a = dVar;
        this.f19413d = i10;
    }
}
