package n0;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface l0 extends g0.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0 f25546a = new b();

    public class a implements m0.m {
        public a() {
        }

        @Override // m0.m
        public ne.x<Void> a() {
            return r0.n.p(null);
        }

        @Override // m0.m
        public ne.x<Void> b() {
            return r0.n.p(null);
        }
    }

    public class b implements l0 {
        @Override // n0.l0
        public void a(o3.b bVar) {
        }

        @Override // n0.l0
        public void b() {
        }

        @Override // g0.m
        public ne.x<Void> c(boolean z10) {
            return r0.n.p(null);
        }

        @Override // g0.m
        public ne.x<Void> e(float f10) {
            return r0.n.p(null);
        }

        @Override // n0.l0
        public ne.x<List<Void>> f(List<l1> list, int i10, int i11) {
            return r0.n.p(Collections.EMPTY_LIST);
        }

        @Override // g0.m
        public ne.x<Void> g(float f10) {
            return r0.n.p(null);
        }

        @Override // n0.l0
        public void i(int i10) {
        }

        @Override // n0.l0
        public n1 j() {
            return null;
        }

        @Override // n0.l0
        public void l(n1 n1Var) {
        }

        @Override // n0.l0
        public void n() {
        }

        @Override // g0.m
        public ne.x<g0.n0> o(g0.m0 m0Var) {
            return r0.n.p(g0.n0.b());
        }
    }

    public static final class c extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public w f25548a;

        public c(w wVar) {
            this.f25548a = wVar;
        }
    }

    public interface d {
        void a();

        void b(List<l1> list);
    }

    void a(o3.b bVar);

    void b();

    default void d() {
    }

    ne.x<List<Void>> f(List<l1> list, int i10, int i11);

    default void h(g0.f1.j jVar) {
    }

    void i(int i10);

    n1 j();

    default void k() {
    }

    void l(n1 n1Var);

    default ne.x<m0.m> m(int i10, int i11) {
        return r0.n.p(new a());
    }

    void n();
}
