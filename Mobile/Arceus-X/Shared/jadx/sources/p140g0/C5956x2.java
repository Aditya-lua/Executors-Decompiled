package p140g0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p531x0.C12626z0;
import p533x2.C12637g;

/* JADX INFO: renamed from: g0.x2 */
/* JADX INFO: loaded from: classes.dex */
public final class C5956x2 {

    /* JADX INFO: renamed from: a */
    public final C5960y2 f22741a;

    /* JADX INFO: renamed from: b */
    public final List<AbstractC5952w2> f22742b;

    /* JADX INFO: renamed from: c */
    public final List<AbstractC5913n> f22743c;

    /* JADX INFO: renamed from: g0.x2$a */
    public static final class a {

        /* JADX INFO: renamed from: d */
        public static final List<Integer> f22744d = Arrays.asList(1, 2, 4, 3, 7);

        /* JADX INFO: renamed from: a */
        public C5960y2 f22745a;

        /* JADX INFO: renamed from: b */
        public final List<AbstractC5952w2> f22746b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public final List<AbstractC5913n> f22747c = new ArrayList();

        /* JADX INFO: renamed from: a */
        public a m26743a(AbstractC5913n abstractC5913n) {
            this.f22747c.add(abstractC5913n);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m26744b(AbstractC5952w2 abstractC5952w2) {
            this.f22746b.add(abstractC5952w2);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C5956x2 m26745c() {
            C12637g.m47070b(!this.f22746b.isEmpty(), "UseCase must not be empty.");
            m26746d();
            return new C5956x2(this.f22745a, this.f22746b, this.f22747c);
        }

        /* JADX INFO: renamed from: d */
        public final void m26746d() {
            Iterator<AbstractC5913n> it = this.f22747c.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                int iM26545g = it.next().m26545g();
                C12626z0.m47042a(f22744d, iM26545g);
                int i11 = i10 & iM26545g;
                if (i11 > 0) {
                    throw new IllegalArgumentException(String.format(Locale.US, "More than one effects has targets %s.", C12626z0.m47043b(i11)));
                }
                i10 |= iM26545g;
            }
        }

        /* JADX INFO: renamed from: e */
        public a m26747e(C5960y2 c5960y2) {
            this.f22745a = c5960y2;
            return this;
        }
    }

    public C5956x2(C5960y2 c5960y2, List<AbstractC5952w2> list, List<AbstractC5913n> list2) {
        this.f22741a = c5960y2;
        this.f22742b = list;
        this.f22743c = list2;
    }

    /* JADX INFO: renamed from: a */
    public List<AbstractC5913n> m26740a() {
        return this.f22743c;
    }

    /* JADX INFO: renamed from: b */
    public List<AbstractC5952w2> m26741b() {
        return this.f22742b;
    }

    /* JADX INFO: renamed from: c */
    public C5960y2 m26742c() {
        return this.f22741a;
    }
}
