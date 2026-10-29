package n0;

import android.util.Range;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class l1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final n1.a<Integer> f24728i = n1.a.a("camerax.core.captureConfig.rotation", Integer.TYPE);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final n1.a<Integer> f24729j = n1.a.a("camerax.core.captureConfig.jpegQuality", Integer.class);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final n1.a<Range<Integer>> f24730k = n1.a.a("camerax.core.captureConfig.resolvedFrameRate", Range.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<u1> f24731a;
    public final n1 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f24733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<u> f24734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f24735f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z3 f24736g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e0 f24737h;

    public interface b {
        void a(i4<?> i4Var, a aVar);
    }

    public l1(List<u1> list, n1 n1Var, int i10, boolean z10, List<u> list2, boolean z11, z3 z3Var, e0 e0Var) {
        this.f24731a = list;
        this.b = n1Var;
        this.f24732c = i10;
        this.f24734e = Collections.unmodifiableList(list2);
        this.f24735f = z11;
        this.f24736g = z3Var;
        this.f24737h = e0Var;
        this.f24733d = z10;
    }

    public static l1 b() {
        return new a().h();
    }

    public List<u> c() {
        return this.f24734e;
    }

    public e0 d() {
        return this.f24737h;
    }

    public Range<Integer> e() {
        Range<Integer> range = (Range) this.b.h(f24730k, t3.f24861a);
        Objects.requireNonNull(range);
        return range;
    }

    public int f() {
        Object objD = this.f24736g.d("CAPTURE_CONFIG_ID_KEY");
        if (objD == null) {
            return -1;
        }
        return ((Integer) objD).intValue();
    }

    public n1 g() {
        return this.b;
    }

    public int h() {
        Integer num = (Integer) this.b.h(i4.H, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public List<u1> i() {
        return Collections.unmodifiableList(this.f24731a);
    }

    public z3 j() {
        return this.f24736g;
    }

    public int k() {
        return this.f24732c;
    }

    public int l() {
        Integer num = (Integer) this.b.h(i4.I, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public boolean m() {
        return this.f24733d;
    }

    public boolean n() {
        return this.f24735f;
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set<u1> f24738a;
        public w2 b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f24739c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f24740d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public List<u> f24741e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f24742f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public z2 f24743g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public e0 f24744h;

        public a() {
            this.f24738a = new HashSet();
            this.b = x2.k0();
            this.f24739c = -1;
            this.f24740d = false;
            this.f24741e = new ArrayList();
            this.f24742f = false;
            this.f24743g = z2.g();
        }

        public static a j(i4<?> i4Var) {
            b bVarK = i4Var.K(null);
            if (bVarK != null) {
                a aVar = new a();
                bVarK.a(i4Var, aVar);
                return aVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + i4Var.u(i4Var.toString()));
        }

        public static a k(l1 l1Var) {
            return new a(l1Var);
        }

        public void a(Collection<u> collection) {
            Iterator<u> it = collection.iterator();
            while (it.hasNext()) {
                c(it.next());
            }
        }

        public void b(z3 z3Var) {
            this.f24743g.f(z3Var);
        }

        public void c(u uVar) {
            if (this.f24741e.contains(uVar)) {
                return;
            }
            this.f24741e.add(uVar);
        }

        public <T> void d(n1.a<T> aVar, T t8) {
            this.b.G(aVar, t8);
        }

        public void e(n1 n1Var) {
            for (n1.a<?> aVar : n1Var.b()) {
                Object objH = this.b.h(aVar, null);
                Object objE = n1Var.e(aVar);
                if (objH instanceof v2) {
                    ((v2) objH).a(((v2) objE).c());
                } else {
                    if (objE instanceof v2) {
                        objE = ((v2) objE).clone();
                    }
                    this.b.D(aVar, n1Var.g(aVar), objE);
                }
            }
        }

        public void f(u1 u1Var) {
            this.f24738a.add(u1Var);
        }

        public void g(String str, Object obj) {
            this.f24743g.i(str, obj);
        }

        public l1 h() {
            return new l1(new ArrayList(this.f24738a), c3.j0(this.b), this.f24739c, this.f24740d, new ArrayList(this.f24741e), this.f24742f, z3.c(this.f24743g), this.f24744h);
        }

        public void i() {
            this.f24738a.clear();
        }

        public Range<Integer> l() {
            return (Range) this.b.h(l1.f24730k, t3.f24861a);
        }

        public Set<u1> m() {
            return this.f24738a;
        }

        public int n() {
            return this.f24739c;
        }

        public boolean o(u uVar) {
            return this.f24741e.remove(uVar);
        }

        public void p(e0 e0Var) {
            this.f24744h = e0Var;
        }

        public void q(Range<Integer> range) {
            d(l1.f24730k, range);
        }

        public void r(int i10) {
            this.f24743g.i("CAPTURE_CONFIG_ID_KEY", Integer.valueOf(i10));
        }

        public void s(n1 n1Var) {
            this.b = x2.l0(n1Var);
        }

        public void t(boolean z10) {
            this.f24740d = z10;
        }

        public void u(int i10) {
            if (i10 != 0) {
                d(i4.H, Integer.valueOf(i10));
            }
        }

        public void v(int i10) {
            this.f24739c = i10;
        }

        public void w(boolean z10) {
            this.f24742f = z10;
        }

        public void x(int i10) {
            if (i10 != 0) {
                d(i4.I, Integer.valueOf(i10));
            }
        }

        public a(l1 l1Var) {
            HashSet hashSet = new HashSet();
            this.f24738a = hashSet;
            this.b = x2.k0();
            this.f24739c = -1;
            this.f24740d = false;
            this.f24741e = new ArrayList();
            this.f24742f = false;
            this.f24743g = z2.g();
            hashSet.addAll(l1Var.f24731a);
            this.b = x2.l0(l1Var.b);
            this.f24739c = l1Var.f24732c;
            this.f24741e.addAll(l1Var.c());
            this.f24742f = l1Var.n();
            this.f24743g = z2.h(l1Var.j());
            this.f24740d = l1Var.f24733d;
        }
    }
}
