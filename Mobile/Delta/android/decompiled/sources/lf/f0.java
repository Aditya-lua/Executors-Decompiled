package lf;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<e0<?>> f23149a;
    public final Set<e0<?>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<e0<?>> f23150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<e0<?>> f23151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set<e0<?>> f23152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set<Class<?>> f23153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f23154g;

    public static class a implements uf.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set<Class<?>> f23155a;
        public final uf.c b;

        public a(Set<Class<?>> set, uf.c cVar) {
            this.f23155a = set;
            this.b = cVar;
        }
    }

    public f0(c<?> cVar, d dVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (r rVar : cVar.g()) {
            if (rVar.d()) {
                if (rVar.f()) {
                    hashSet4.add(rVar.b());
                } else {
                    hashSet.add(rVar.b());
                }
            } else if (rVar.c()) {
                hashSet3.add(rVar.b());
            } else if (rVar.f()) {
                hashSet5.add(rVar.b());
            } else {
                hashSet2.add(rVar.b());
            }
        }
        if (!cVar.k().isEmpty()) {
            hashSet.add(e0.b(uf.c.class));
        }
        this.f23149a = Collections.unmodifiableSet(hashSet);
        this.b = Collections.unmodifiableSet(hashSet2);
        this.f23150c = Collections.unmodifiableSet(hashSet3);
        this.f23151d = Collections.unmodifiableSet(hashSet4);
        this.f23152e = Collections.unmodifiableSet(hashSet5);
        this.f23153f = cVar.k();
        this.f23154g = dVar;
    }

    @Override // lf.d
    public <T> T a(Class<T> cls) {
        if (!this.f23149a.contains(e0.b(cls))) {
            throw new t(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t8 = (T) this.f23154g.a(cls);
        return !cls.equals(uf.c.class) ? t8 : (T) new a(this.f23153f, (uf.c) t8);
    }

    @Override // lf.d
    public <T> xf.b<T> c(e0<T> e0Var) {
        if (this.b.contains(e0Var)) {
            return this.f23154g.c(e0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Provider<%s>.", e0Var));
    }

    @Override // lf.d
    public <T> xf.b<T> d(Class<T> cls) {
        return c(e0.b(cls));
    }

    @Override // lf.d
    public <T> Set<T> e(e0<T> e0Var) {
        if (this.f23151d.contains(e0Var)) {
            return this.f23154g.e(e0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Set<%s>.", e0Var));
    }

    @Override // lf.d
    public <T> T f(e0<T> e0Var) {
        if (this.f23149a.contains(e0Var)) {
            return (T) this.f23154g.f(e0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency %s.", e0Var));
    }

    @Override // lf.d
    public <T> xf.b<Set<T>> g(e0<T> e0Var) {
        if (this.f23152e.contains(e0Var)) {
            return this.f23154g.g(e0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", e0Var));
    }
}
