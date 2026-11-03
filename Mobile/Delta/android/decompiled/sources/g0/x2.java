package g0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y2 f18162a;
    public final List<w2> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<n> f18163c;

    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final List<Integer> f18164d = Arrays.asList(1, 2, 4, 3, 7);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public y2 f18165a;
        public final List<w2> b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<n> f18166c = new ArrayList();

        public a a(n nVar) {
            this.f18166c.add(nVar);
            return this;
        }

        public a b(w2 w2Var) {
            this.b.add(w2Var);
            return this;
        }

        public x2 c() {
            x2.g.b(!this.b.isEmpty(), "UseCase must not be empty.");
            d();
            return new x2(this.f18165a, this.b, this.f18166c);
        }

        public final void d() {
            Iterator<n> it = this.f18166c.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                int iG = it.next().g();
                x0.z0.a(f18164d, iG);
                int i11 = i10 & iG;
                if (i11 > 0) {
                    throw new IllegalArgumentException(String.format(Locale.US, "More than one effects has targets %s.", x0.z0.b(i11)));
                }
                i10 |= iG;
            }
        }

        public a e(y2 y2Var) {
            this.f18165a = y2Var;
            return this;
        }
    }

    public x2(y2 y2Var, List<w2> list, List<n> list2) {
        this.f18162a = y2Var;
        this.b = list;
        this.f18163c = list2;
    }

    public List<n> a() {
        return this.f18163c;
    }

    public List<w2> b() {
        return this.b;
    }

    public y2 c() {
        return this.f18162a;
    }
}
