package androidx.p000lifecycle;

import java.util.Iterator;
import java.util.Map;
import s.b;

/* JADX INFO: loaded from: classes.dex */
public class b0<T> extends d0<T> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b<a0<?>, a<?>> f2758l = new b<>();

    public static class a<V> implements e0<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a0<V> f2759a;
        public final e0<? super V> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2760c = -1;

        public a(a0<V> a0Var, e0<? super V> e0Var) {
            this.f2759a = a0Var;
            this.b = e0Var;
        }

        @Override // androidx.p000lifecycle.e0
        public void a(V v5) {
            if (this.f2760c != this.f2759a.g()) {
                this.f2760c = this.f2759a.g();
                this.b.a(v5);
            }
        }

        public void b() {
            this.f2759a.j(this);
        }

        public void c() {
            this.f2759a.n(this);
        }
    }

    @Override // androidx.p000lifecycle.a0
    public void k() {
        Iterator<Map.Entry<a0<?>, a<?>>> it = this.f2758l.iterator();
        while (it.hasNext()) {
            it.next().getValue().b();
        }
    }

    @Override // androidx.p000lifecycle.a0
    public void l() {
        Iterator<Map.Entry<a0<?>, a<?>>> it = this.f2758l.iterator();
        while (it.hasNext()) {
            it.next().getValue().c();
        }
    }

    public <S> void p(a0<S> a0Var, e0<? super S> e0Var) {
        if (a0Var == null) {
            throw new NullPointerException("source cannot be null");
        }
        a<?> aVar = new a<>(a0Var, e0Var);
        a<?> aVarF = this.f2758l.f(a0Var, aVar);
        if (aVarF != null && aVarF.b != e0Var) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (aVarF == null && h()) {
            aVar.b();
        }
    }

    public <S> void q(a0<S> a0Var) {
        a<?> aVarG = this.f2758l.g(a0Var);
        if (aVarG != null) {
            aVarG.c();
        }
    }
}
