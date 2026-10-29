package d1;

import androidx.p000lifecycle.f0;
import androidx.p000lifecycle.l;
import androidx.p000lifecycle.r;
import androidx.p000lifecycle.s;
import g0.g2;
import g0.r1;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f14295f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static h f14296g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14297a = new Object();
    public final Map<a, c> b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<b, Set<a>> f14298c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque<s> f14299d = new ArrayDeque<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h0.a f14300e;

    public static abstract class a {
        public static a a(s sVar, g0.s sVar2) {
            return new d1.a(System.identityHashCode(sVar), sVar2);
        }

        public abstract g0.s b();

        public abstract int c();
    }

    public static class b implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f14301a;
        public final s b;

        public b(s sVar, h hVar) {
            this.b = sVar;
            this.f14301a = hVar;
        }

        public s a() {
            return this.b;
        }

        @f0(l.a.ON_DESTROY)
        public void onDestroy(s sVar) {
            this.f14301a.p(sVar);
        }

        @f0(l.a.ON_START)
        public void onStart(s sVar) {
            this.f14301a.j(sVar);
        }

        @f0(l.a.ON_STOP)
        public void onStop(s sVar) {
            this.f14301a.k(sVar);
        }
    }

    public static h c() {
        h hVar;
        synchronized (f14295f) {
            try {
                if (f14296g == null) {
                    f14296g = new h();
                }
                hVar = f14296g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }

    public void a(c cVar, g2 g2Var, h0.a aVar) {
        synchronized (this.f14297a) {
            try {
                x2.g.a(!g2Var.k().isEmpty());
                this.f14300e = aVar;
                s sVarT = cVar.t();
                b bVarE = e(sVarT);
                if (bVarE == null) {
                    return;
                }
                Set<a> set = this.f14298c.get(bVarE);
                h0.a aVar2 = this.f14300e;
                if (aVar2 == null || aVar2.e() != 2) {
                    Iterator<a> it = set.iterator();
                    while (it.hasNext()) {
                        c cVar2 = (c) x2.g.g(this.b.get(it.next()));
                        if (!cVar2.equals(cVar) && !cVar2.u().isEmpty()) {
                            if (cVar2.w() || g2Var.m()) {
                                throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner. Please unbind first.");
                            }
                            cVar2.z();
                        }
                    }
                }
                try {
                    cVar.n(g2Var);
                    if (sVarT.a().getState().b(l.b.STARTED)) {
                        j(sVarT);
                    }
                } catch (s0.f.a e10) {
                    throw new IllegalArgumentException(e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public c b(s sVar, s0.f fVar) {
        synchronized (this.f14297a) {
            try {
                x2.g.b(this.b.get(a.a(sVar, fVar.J())) == null, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
                c cVar = new c(sVar, fVar);
                if (fVar.O().isEmpty()) {
                    cVar.x();
                }
                if (sVar.a().getState() == l.b.DESTROYED) {
                    return cVar;
                }
                h(cVar);
                return cVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public c d(s sVar, g0.s sVar2) {
        c cVar;
        synchronized (this.f14297a) {
            cVar = this.b.get(a.a(sVar, sVar2));
        }
        return cVar;
    }

    public final b e(s sVar) {
        synchronized (this.f14297a) {
            try {
                for (b bVar : this.f14298c.keySet()) {
                    if (sVar.equals(bVar.a())) {
                        return bVar;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Collection<c> f() {
        Collection<c> collectionUnmodifiableCollection;
        synchronized (this.f14297a) {
            collectionUnmodifiableCollection = Collections.unmodifiableCollection(this.b.values());
        }
        return collectionUnmodifiableCollection;
    }

    public final boolean g(s sVar) {
        synchronized (this.f14297a) {
            try {
                b bVarE = e(sVar);
                if (bVarE == null) {
                    return false;
                }
                Iterator<a> it = this.f14298c.get(bVarE).iterator();
                while (it.hasNext()) {
                    if (!((c) x2.g.g(this.b.get(it.next()))).u().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h(c cVar) {
        synchronized (this.f14297a) {
            try {
                s sVarT = cVar.t();
                a aVarA = a.a(sVarT, cVar.s().J());
                b bVarE = e(sVarT);
                Set<a> hashSet = bVarE != null ? this.f14298c.get(bVarE) : new HashSet<>();
                hashSet.add(aVarA);
                this.b.put(aVarA, cVar);
                if (bVarE == null) {
                    b bVar = new b(sVarT, this);
                    this.f14298c.put(bVar, hashSet);
                    sVarT.a().a(bVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i(Set<a> set) {
        synchronized (this.f14297a) {
            if (set == null) {
                try {
                    set = this.b.keySet();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (a aVar : set) {
                if (this.b.containsKey(aVar)) {
                    o(this.b.get(aVar));
                }
            }
        }
    }

    public void j(s sVar) {
        synchronized (this.f14297a) {
            try {
                if (g(sVar)) {
                    if (this.f14299d.isEmpty()) {
                        this.f14299d.push(sVar);
                    } else {
                        h0.a aVar = this.f14300e;
                        if (aVar == null || aVar.e() != 2) {
                            s sVarPeek = this.f14299d.peek();
                            if (!sVar.equals(sVarPeek)) {
                                l(sVarPeek);
                                this.f14299d.remove(sVar);
                                this.f14299d.push(sVar);
                            }
                        }
                    }
                    q(sVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void k(s sVar) {
        synchronized (this.f14297a) {
            try {
                this.f14299d.remove(sVar);
                l(sVar);
                if (!this.f14299d.isEmpty()) {
                    q(this.f14299d.peek());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l(s sVar) {
        synchronized (this.f14297a) {
            try {
                b bVarE = e(sVar);
                if (bVarE == null) {
                    return;
                }
                Iterator<a> it = this.f14298c.get(bVarE).iterator();
                while (it.hasNext()) {
                    ((c) x2.g.g(this.b.get(it.next()))).x();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void m(g2 g2Var, Set<a> set) {
        synchronized (this.f14297a) {
            if (set == null) {
                try {
                    set = this.b.keySet();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (a aVar : set) {
                if (this.b.containsKey(aVar)) {
                    c cVar = this.b.get(aVar);
                    boolean zIsEmpty = cVar.u().isEmpty();
                    cVar.y(g2Var);
                    if (!zIsEmpty && cVar.u().isEmpty()) {
                        k(cVar.t());
                    }
                } else {
                    r1.l("LifecycleCameraRepository", "Attempt to unbind use cases from an invalid camera.");
                }
            }
        }
    }

    public void n(Set<a> set) {
        synchronized (this.f14297a) {
            if (set == null) {
                try {
                    set = this.b.keySet();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Iterator<a> it = set.iterator();
            while (it.hasNext()) {
                c cVar = this.b.get(it.next());
                if (cVar != null) {
                    cVar.z();
                    k(cVar.t());
                }
            }
        }
    }

    public final void o(c cVar) {
        synchronized (this.f14297a) {
            try {
                s sVarT = cVar.t();
                a aVarA = a.a(sVarT, cVar.s().J());
                this.b.remove(aVarA);
                HashSet hashSet = new HashSet();
                for (b bVar : this.f14298c.keySet()) {
                    if (sVarT.equals(bVar.a())) {
                        Set<a> set = this.f14298c.get(bVar);
                        set.remove(aVarA);
                        if (set.isEmpty()) {
                            hashSet.add(bVar.a());
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    p((s) it.next());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void p(s sVar) {
        synchronized (this.f14297a) {
            try {
                b bVarE = e(sVar);
                if (bVarE == null) {
                    return;
                }
                k(sVar);
                Iterator<a> it = this.f14298c.get(bVarE).iterator();
                while (it.hasNext()) {
                    this.b.remove(it.next());
                }
                this.f14298c.remove(bVarE);
                bVarE.a().a().d(bVarE);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void q(s sVar) {
        synchronized (this.f14297a) {
            try {
                Iterator<a> it = this.f14298c.get(e(sVar)).iterator();
                while (it.hasNext()) {
                    c cVar = this.b.get(it.next());
                    if (!((c) x2.g.g(cVar)).u().isEmpty()) {
                        cVar.A();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
