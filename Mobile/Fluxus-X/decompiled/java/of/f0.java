package of;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<e0<?>> f28086a;
    public final Set<e0<?>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<e0<?>> f28087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<e0<?>> f28088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set<e0<?>> f28089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set<Class<?>> f28090f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f28091g;

    public static class a implements xf.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set<Class<?>> f28092a;
        public final xf.c b;

        public a(Set<Class<?>> set, xf.c cVar) {
            this.f28092a = set;
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
            hashSet.add(e0.b(xf.c.class));
        }
        this.f28086a = Collections.unmodifiableSet(hashSet);
        this.b = Collections.unmodifiableSet(hashSet2);
        this.f28087c = Collections.unmodifiableSet(hashSet3);
        this.f28088d = Collections.unmodifiableSet(hashSet4);
        this.f28089e = Collections.unmodifiableSet(hashSet5);
        this.f28090f = cVar.k();
        this.f28091g = dVar;
    }

    @Override // of.d
    public <T> T a(Class<T> cls) {
        if (!this.f28086a.contains(e0.b(cls))) {
            throw new t(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t8 = (T) this.f28091g.a(cls);
        return !cls.equals(xf.c.class) ? t8 : (T) new a(this.f28090f, (xf.c) t8);
    }

    @Override // of.d
    public <T> ag.b<Set<T>> b(e0<T> e0Var) {
        if (this.f28089e.contains(e0Var)) {
            return this.f28091g.b(e0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", e0Var));
    }

    @Override // of.d
    public <T> ag.b<T> d(Class<T> cls) {
        return g(e0.b(cls));
    }

    @Override // of.d
    public <T> Set<T> e(e0<T> e0Var) {
        if (this.f28088d.contains(e0Var)) {
            return this.f28091g.e(e0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Set<%s>.", e0Var));
    }

    @Override // of.d
    public <T> T f(e0<T> e0Var) {
        if (this.f28086a.contains(e0Var)) {
            return (T) this.f28091g.f(e0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency %s.", e0Var));
    }

    @Override // of.d
    public <T> ag.b<T> g(e0<T> e0Var) {
        if (this.b.contains(e0Var)) {
            return this.f28091g.g(e0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Provider<%s>.", e0Var));
    }
}
