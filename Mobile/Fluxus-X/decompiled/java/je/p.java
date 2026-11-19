package je;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final je.d f20726a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f20727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20728d;

    public class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ je.d f20729a;

        /* JADX INFO: renamed from: je.p$a$a, reason: collision with other inner class name */
        public class C0384a extends d {
            public C0384a(p pVar, CharSequence charSequence) {
                super(pVar, charSequence);
            }

            @Override // je.p.d
            public int g(int i10) {
                return i10 + 1;
            }

            @Override // je.p.d
            public int h(int i10) {
                return a.this.f20729a.b(this.f20734c, i10);
            }
        }

        public a(je.d dVar) {
            this.f20729a = dVar;
        }

        @Override // je.p.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(p pVar, CharSequence charSequence) {
            return new C0384a(pVar, charSequence);
        }
    }

    public class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f20731a;

        public class a extends d {
            public a(p pVar, CharSequence charSequence) {
                super(pVar, charSequence);
            }

            @Override // je.p.d
            public int g(int i10) {
                return i10;
            }

            @Override // je.p.d
            public int h(int i10) {
                int i11 = i10 + b.this.f20731a;
                if (i11 < this.f20734c.length()) {
                    return i11;
                }
                return -1;
            }
        }

        public b(int i10) {
            this.f20731a = i10;
        }

        @Override // je.p.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(p pVar, CharSequence charSequence) {
            return new a(pVar, charSequence);
        }
    }

    public class c implements Iterable<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CharSequence f20733a;

        public c(CharSequence charSequence) {
            this.f20733a = charSequence;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return p.this.i(this.f20733a);
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

    public static abstract class d extends je.b<String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CharSequence f20734c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final je.d f20735d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f20736e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f20737f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f20738g;

        public d(p pVar, CharSequence charSequence) {
            this.f20735d = pVar.f20726a;
            this.f20736e = pVar.b;
            this.f20738g = pVar.f20728d;
            this.f20734c = charSequence;
        }

        @Override // je.b
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public String b() {
            int i10 = this.f20737f;
            while (true) {
                int i11 = this.f20737f;
                if (i11 == -1) {
                    return d();
                }
                int iH = h(i11);
                if (iH == -1) {
                    iH = this.f20734c.length();
                    this.f20737f = -1;
                } else {
                    this.f20737f = g(iH);
                }
                int i12 = this.f20737f;
                if (i12 == i10) {
                    int i13 = i12 + 1;
                    this.f20737f = i13;
                    if (i13 > this.f20734c.length()) {
                        this.f20737f = -1;
                    }
                } else {
                    while (i10 < iH && this.f20735d.d(this.f20734c.charAt(i10))) {
                        i10++;
                    }
                    while (iH > i10 && this.f20735d.d(this.f20734c.charAt(iH - 1))) {
                        iH--;
                    }
                    if (!this.f20736e || i10 != iH) {
                        int i14 = this.f20738g;
                        if (i14 == 1) {
                            iH = this.f20734c.length();
                            this.f20737f = -1;
                            while (iH > i10 && this.f20735d.d(this.f20734c.charAt(iH - 1))) {
                                iH--;
                            }
                        } else {
                            this.f20738g = i14 - 1;
                        }
                        return this.f20734c.subSequence(i10, iH).toString();
                    }
                    i10 = this.f20737f;
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
        this(eVar, false, je.d.e(), Integer.MAX_VALUE);
    }

    public static p e(int i10) {
        n.e(i10 > 0, "The length may not be less than 1");
        return new p(new b(i10));
    }

    public static p f(char c10) {
        return g(je.d.c(c10));
    }

    public static p g(je.d dVar) {
        n.l(dVar);
        return new p(new a(dVar));
    }

    public Iterable<String> h(CharSequence charSequence) {
        n.l(charSequence);
        return new c(charSequence);
    }

    public final Iterator<String> i(CharSequence charSequence) {
        return this.f20727c.a(this, charSequence);
    }

    public p(e eVar, boolean z10, je.d dVar, int i10) {
        this.f20727c = eVar;
        this.b = z10;
        this.f20726a = dVar;
        this.f20728d = i10;
    }
}
