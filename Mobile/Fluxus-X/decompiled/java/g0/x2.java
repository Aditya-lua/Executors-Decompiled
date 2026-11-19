package g0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y2 f17020a;
    public final List<w2> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<n> f17021c;

    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final List<Integer> f17022d = Arrays.asList(1, 2, 4, 3, 7);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public y2 f17023a;
        public final List<w2> b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<n> f17024c = new ArrayList();

        public a a(n nVar) {
            this.f17024c.add(nVar);
            return this;
        }

        public a b(w2 w2Var) {
            this.b.add(w2Var);
            return this;
        }

        public x2 c() {
            x2.g.b(!this.b.isEmpty(), "UseCase must not be empty.");
            d();
            return new x2(this.f17023a, this.b, this.f17024c);
        }

        public final void d() {
            Iterator<n> it = this.f17024c.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                int iG = it.next().g();
                x0.z0.a(f17022d, iG);
                int i11 = i10 & iG;
                if (i11 > 0) {
                    throw new IllegalArgumentException(String.format(Locale.US, "More than one effects has targets %s.", x0.z0.b(i11)));
                }
                i10 |= iG;
            }
        }

        public a e(y2 y2Var) {
            this.f17023a = y2Var;
            return this;
        }
    }

    public x2(y2 y2Var, List<w2> list, List<n> list2) {
        this.f17020a = y2Var;
        this.b = list;
        this.f17021c = list2;
    }

    public List<n> a() {
        return this.f17021c;
    }

    public List<w2> b() {
        return this.b;
    }

    public y2 c() {
        return this.f17020a;
    }
}
