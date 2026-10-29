package ge;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ge.d f18157a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f18158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18159d;

    public class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ge.d f18160a;

        /* JADX INFO: renamed from: ge.p$a$a, reason: collision with other inner class name */
        public class C0326a extends d {
            public C0326a(p pVar, CharSequence charSequence) {
                super(pVar, charSequence);
            }

            @Override // ge.p.d
            public int g(int i10) {
                return i10 + 1;
            }

            @Override // ge.p.d
            public int h(int i10) {
                return a.this.f18160a.b(this.f18165c, i10);
            }
        }

        public a(ge.d dVar) {
            this.f18160a = dVar;
        }

        @Override // ge.p.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(p pVar, CharSequence charSequence) {
            return new C0326a(pVar, charSequence);
        }
    }

    public class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f18162a;

        public class a extends d {
            public a(p pVar, CharSequence charSequence) {
                super(pVar, charSequence);
            }

            @Override // ge.p.d
            public int g(int i10) {
                return i10;
            }

            @Override // ge.p.d
            public int h(int i10) {
                int i11 = i10 + b.this.f18162a;
                if (i11 < this.f18165c.length()) {
                    return i11;
                }
                return -1;
            }
        }

        public b(int i10) {
            this.f18162a = i10;
        }

        @Override // ge.p.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(p pVar, CharSequence charSequence) {
            return new a(pVar, charSequence);
        }
    }

    public class c implements Iterable<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CharSequence f18164a;

        public c(CharSequence charSequence) {
            this.f18164a = charSequence;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return p.this.i(this.f18164a);
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

    public static abstract class d extends ge.b<String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CharSequence f18165c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ge.d f18166d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f18167e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f18168f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f18169g;

        public d(p pVar, CharSequence charSequence) {
            this.f18166d = pVar.f18157a;
            this.f18167e = pVar.b;
            this.f18169g = pVar.f18159d;
            this.f18165c = charSequence;
        }

        @Override // ge.b
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public String b() {
            int i10 = this.f18168f;
            while (true) {
                int i11 = this.f18168f;
                if (i11 == -1) {
                    return d();
                }
                int iH = h(i11);
                if (iH == -1) {
                    iH = this.f18165c.length();
                    this.f18168f = -1;
                } else {
                    this.f18168f = g(iH);
                }
                int i12 = this.f18168f;
                if (i12 == i10) {
                    int i13 = i12 + 1;
                    this.f18168f = i13;
                    if (i13 > this.f18165c.length()) {
                        this.f18168f = -1;
                    }
                } else {
                    while (i10 < iH && this.f18166d.d(this.f18165c.charAt(i10))) {
                        i10++;
                    }
                    while (iH > i10 && this.f18166d.d(this.f18165c.charAt(iH - 1))) {
                        iH--;
                    }
                    if (!this.f18167e || i10 != iH) {
                        int i14 = this.f18169g;
                        if (i14 == 1) {
                            iH = this.f18165c.length();
                            this.f18168f = -1;
                            while (iH > i10 && this.f18166d.d(this.f18165c.charAt(iH - 1))) {
                                iH--;
                            }
                        } else {
                            this.f18169g = i14 - 1;
                        }
                        return this.f18165c.subSequence(i10, iH).toString();
                    }
                    i10 = this.f18168f;
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
        this(eVar, false, ge.d.e(), Integer.MAX_VALUE);
    }

    public static p e(int i10) {
        n.e(i10 > 0, "The length may not be less than 1");
        return new p(new b(i10));
    }

    public static p f(char c10) {
        return g(ge.d.c(c10));
    }

    public static p g(ge.d dVar) {
        n.l(dVar);
        return new p(new a(dVar));
    }

    public Iterable<String> h(CharSequence charSequence) {
        n.l(charSequence);
        return new c(charSequence);
    }

    public final Iterator<String> i(CharSequence charSequence) {
        return this.f18158c.a(this, charSequence);
    }

    public p(e eVar, boolean z10, ge.d dVar, int i10) {
        this.f18158c = eVar;
        this.b = z10;
        this.f18157a = dVar;
        this.f18159d = i10;
    }
}
