package p169he;

import java.util.Iterator;

/* JADX INFO: renamed from: he.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C6386p {

    /* JADX INFO: renamed from: a */
    public final AbstractC6374d f24268a;

    /* JADX INFO: renamed from: b */
    public final boolean f24269b;

    /* JADX INFO: renamed from: c */
    public final e f24270c;

    /* JADX INFO: renamed from: d */
    public final int f24271d;

    /* JADX INFO: renamed from: he.p$a */
    public class a implements e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC6374d f24272a;

        /* JADX INFO: renamed from: he.p$a$a, reason: collision with other inner class name */
        public class C14174a extends d {
            public C14174a(C6386p c6386p, CharSequence charSequence) {
                super(c6386p, charSequence);
            }

            @Override // p169he.C6386p.d
            /* JADX INFO: renamed from: g */
            public int mo27948g(int i10) {
                return i10 + 1;
            }

            @Override // p169he.C6386p.d
            /* JADX INFO: renamed from: h */
            public int mo27949h(int i10) {
                return a.this.f24272a.mo27896b(this.f24278c, i10);
            }
        }

        public a(AbstractC6374d abstractC6374d) {
            this.f24272a = abstractC6374d;
        }

        /* JADX DEBUG: Method merged with bridge method: a(Lhe/p;Ljava/lang/CharSequence;)Ljava/util/Iterator; */
        @Override // p169he.C6386p.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d mo27946a(C6386p c6386p, CharSequence charSequence) {
            return new C14174a(c6386p, charSequence);
        }
    }

    /* JADX INFO: renamed from: he.p$b */
    public class b implements e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f24274a;

        /* JADX INFO: renamed from: he.p$b$a */
        public class a extends d {
            public a(C6386p c6386p, CharSequence charSequence) {
                super(c6386p, charSequence);
            }

            @Override // p169he.C6386p.d
            /* JADX INFO: renamed from: g */
            public int mo27948g(int i10) {
                return i10;
            }

            @Override // p169he.C6386p.d
            /* JADX INFO: renamed from: h */
            public int mo27949h(int i10) {
                int i11 = i10 + b.this.f24274a;
                if (i11 < this.f24278c.length()) {
                    return i11;
                }
                return -1;
            }
        }

        public b(int i10) {
            this.f24274a = i10;
        }

        /* JADX DEBUG: Method merged with bridge method: a(Lhe/p;Ljava/lang/CharSequence;)Ljava/util/Iterator; */
        @Override // p169he.C6386p.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d mo27946a(C6386p c6386p, CharSequence charSequence) {
            return new a(c6386p, charSequence);
        }
    }

    /* JADX INFO: renamed from: he.p$c */
    public class c implements Iterable<String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CharSequence f24276a;

        public c(CharSequence charSequence) {
            this.f24276a = charSequence;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return C6386p.this.m27945i(this.f24276a);
        }

        public String toString() {
            C6377g c6377gM27898d = C6377g.m27898d(", ");
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            StringBuilder sbM27900b = c6377gM27898d.m27900b(sb2, this);
            sbM27900b.append(']');
            return sbM27900b.toString();
        }
    }

    /* JADX INFO: renamed from: he.p$d */
    public static abstract class d extends AbstractC6372b<String> {

        /* JADX INFO: renamed from: c */
        public final CharSequence f24278c;

        /* JADX INFO: renamed from: d */
        public final AbstractC6374d f24279d;

        /* JADX INFO: renamed from: e */
        public final boolean f24280e;

        /* JADX INFO: renamed from: f */
        public int f24281f = 0;

        /* JADX INFO: renamed from: g */
        public int f24282g;

        public d(C6386p c6386p, CharSequence charSequence) {
            this.f24279d = c6386p.f24268a;
            this.f24280e = c6386p.f24269b;
            this.f24282g = c6386p.f24271d;
            this.f24278c = charSequence;
        }

        /* JADX DEBUG: Method merged with bridge method: b()Ljava/lang/Object; */
        @Override // p169he.AbstractC6372b
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public String mo27885b() {
            int i10 = this.f24281f;
            while (true) {
                int i11 = this.f24281f;
                if (i11 == -1) {
                    return m27886d();
                }
                int iMo27949h = mo27949h(i11);
                if (iMo27949h == -1) {
                    iMo27949h = this.f24278c.length();
                    this.f24281f = -1;
                } else {
                    this.f24281f = mo27948g(iMo27949h);
                }
                int i12 = this.f24281f;
                if (i12 == i10) {
                    int i13 = i12 + 1;
                    this.f24281f = i13;
                    if (i13 > this.f24278c.length()) {
                        this.f24281f = -1;
                    }
                } else {
                    while (i10 < iMo27949h && this.f24279d.mo27897d(this.f24278c.charAt(i10))) {
                        i10++;
                    }
                    while (iMo27949h > i10 && this.f24279d.mo27897d(this.f24278c.charAt(iMo27949h - 1))) {
                        iMo27949h--;
                    }
                    if (!this.f24280e || i10 != iMo27949h) {
                        int i14 = this.f24282g;
                        if (i14 == 1) {
                            iMo27949h = this.f24278c.length();
                            this.f24281f = -1;
                            while (iMo27949h > i10 && this.f24279d.mo27897d(this.f24278c.charAt(iMo27949h - 1))) {
                                iMo27949h--;
                            }
                        } else {
                            this.f24282g = i14 - 1;
                        }
                        return this.f24278c.subSequence(i10, iMo27949h).toString();
                    }
                    i10 = this.f24281f;
                }
            }
        }

        /* JADX INFO: renamed from: g */
        public abstract int mo27948g(int i10);

        /* JADX INFO: renamed from: h */
        public abstract int mo27949h(int i10);
    }

    /* JADX INFO: renamed from: he.p$e */
    public interface e {
        /* JADX INFO: renamed from: a */
        Iterator<String> mo27946a(C6386p c6386p, CharSequence charSequence);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6386p(e eVar) {
        this(eVar, false, AbstractC6374d.m27894e(), Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: e */
    public static C6386p m27941e(int i10) {
        C6384n.m27921e(i10 > 0, "The length may not be less than 1");
        return new C6386p(new b(i10));
    }

    /* JADX INFO: renamed from: f */
    public static C6386p m27942f(char c10) {
        return m27943g(AbstractC6374d.m27893c(c10));
    }

    /* JADX INFO: renamed from: g */
    public static C6386p m27943g(AbstractC6374d abstractC6374d) {
        C6384n.m27928l(abstractC6374d);
        return new C6386p(new a(abstractC6374d));
    }

    /* JADX INFO: renamed from: h */
    public Iterable<String> m27944h(CharSequence charSequence) {
        C6384n.m27928l(charSequence);
        return new c(charSequence);
    }

    /* JADX INFO: renamed from: i */
    public final Iterator<String> m27945i(CharSequence charSequence) {
        return this.f24270c.mo27946a(this, charSequence);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C6386p(e eVar, boolean z10, AbstractC6374d abstractC6374d, int i10) {
        this.f24270c = eVar;
        this.f24269b = z10;
        this.f24268a = abstractC6374d;
        this.f24271d = i10;
    }
}
