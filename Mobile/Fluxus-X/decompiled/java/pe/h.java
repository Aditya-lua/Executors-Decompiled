package pe;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import ke.t0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h<OutputT> extends pe.b.j<OutputT> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f29086j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Logger f29087k = Logger.getLogger(h.class.getName());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile Set<Throwable> f29088h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile int f29089i;

    public static abstract class b {
        public b() {
        }

        public abstract void a(h<?> hVar, Set<Throwable> set, Set<Throwable> set2);

        public abstract int b(h<?> hVar);
    }

    public static final class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<h<?>, Set<Throwable>> f29090a;
        public final AtomicIntegerFieldUpdater<h<?>> b;

        public c(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            super();
            this.f29090a = atomicReferenceFieldUpdater;
            this.b = atomicIntegerFieldUpdater;
        }

        @Override // pe.h.b
        public void a(h<?> hVar, Set<Throwable> set, Set<Throwable> set2) {
            y1.b.a(this.f29090a, hVar, set, set2);
        }

        @Override // pe.h.b
        public int b(h<?> hVar) {
            return this.b.decrementAndGet(hVar);
        }
    }

    public static final class d extends b {
        public d() {
            super();
        }

        @Override // pe.h.b
        public void a(h<?> hVar, Set<Throwable> set, Set<Throwable> set2) {
            synchronized (hVar) {
                try {
                    if (hVar.f29088h == set) {
                        hVar.f29088h = set2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // pe.h.b
        public int b(h<?> hVar) {
            int iJ;
            synchronized (hVar) {
                iJ = h.J(hVar);
            }
            return iJ;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        b dVar;
        Throwable th2 = null;
        Object[] objArr = 0;
        try {
            dVar = new c(AtomicReferenceFieldUpdater.newUpdater(h.class, Set.class, "h"), AtomicIntegerFieldUpdater.newUpdater(h.class, "i"));
        } catch (Throwable th3) {
            dVar = new d();
            th2 = th3;
        }
        f29086j = dVar;
        if (th2 != null) {
            f29087k.log(Level.SEVERE, "SafeAtomicHelper is broken!", th2);
        }
    }

    public h(int i10) {
        this.f29089i = i10;
    }

    public static /* synthetic */ int J(h hVar) {
        int i10 = hVar.f29089i - 1;
        hVar.f29089i = i10;
        return i10;
    }

    public abstract void K(Set<Throwable> set);

    public final void L() {
        this.f29088h = null;
    }

    public final int M() {
        return f29086j.b(this);
    }

    public final Set<Throwable> N() {
        Set<Throwable> set = this.f29088h;
        if (set != null) {
            return set;
        }
        Set<Throwable> setC = t0.c();
        K(setC);
        f29086j.a(this, null, setC);
        Set<Throwable> set2 = this.f29088h;
        Objects.requireNonNull(set2);
        return set2;
    }
}
