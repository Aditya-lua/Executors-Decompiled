package mf;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<e0<?>> f24723a;
    public final Set<e0<?>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<e0<?>> f24724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<e0<?>> f24725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set<e0<?>> f24726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set<Class<?>> f24727f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f24728g;

    public static class a implements vf.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set<Class<?>> f24729a;
        public final vf.c b;

        public a(Set<Class<?>> set, vf.c cVar) {
            this.f24729a = set;
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
            hashSet.add(e0.b(vf.c.class));
        }
        this.f24723a = Collections.unmodifiableSet(hashSet);
        this.b = Collections.unmodifiableSet(hashSet2);
        this.f24724c = Collections.unmodifiableSet(hashSet3);
        this.f24725d = Collections.unmodifiableSet(hashSet4);
        this.f24726e = Collections.unmodifiableSet(hashSet5);
        this.f24727f = cVar.k();
        this.f24728g = dVar;
    }

    @Override // mf.d
    public <T> T a(Class<T> cls) {
        if (!this.f24723a.contains(e0.b(cls))) {
            throw new t(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t8 = (T) this.f24728g.a(cls);
        return !cls.equals(vf.c.class) ? t8 : (T) new a(this.f24727f, (vf.c) t8);
    }

    @Override // mf.d
    public <T> Set<T> b(e0<T> e0Var) {
        if (this.f24725d.contains(e0Var)) {
            return this.f24728g.b(e0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Set<%s>.", e0Var));
    }

    @Override // mf.d
    public <T> yf.b<T> c(e0<T> e0Var) {
        if (this.b.contains(e0Var)) {
            return this.f24728g.c(e0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Provider<%s>.", e0Var));
    }

    @Override // mf.d
    public <T> yf.b<Set<T>> e(e0<T> e0Var) {
        if (this.f24726e.contains(e0Var)) {
            return this.f24728g.e(e0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", e0Var));
    }

    @Override // mf.d
    public <T> T f(e0<T> e0Var) {
        if (this.f24723a.contains(e0Var)) {
            return (T) this.f24728g.f(e0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency %s.", e0Var));
    }

    @Override // mf.d
    public <T> yf.b<T> g(Class<T> cls) {
        return c(e0.b(cls));
    }
}
