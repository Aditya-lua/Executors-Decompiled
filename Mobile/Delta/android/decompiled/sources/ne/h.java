package ne;

import ie.t0;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h<OutputT> extends ne.b.j<OutputT> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f27130j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Logger f27131k = Logger.getLogger(h.class.getName());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile Set<Throwable> f27132h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile int f27133i;

    public static abstract class b {
        public b() {
        }

        public abstract void a(h<?> hVar, Set<Throwable> set, Set<Throwable> set2);

        public abstract int b(h<?> hVar);
    }

    public static final class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<h<?>, Set<Throwable>> f27134a;
        public final AtomicIntegerFieldUpdater<h<?>> b;

        public c(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            super();
            this.f27134a = atomicReferenceFieldUpdater;
            this.b = atomicIntegerFieldUpdater;
        }

        @Override // ne.h.b
        public void a(h<?> hVar, Set<Throwable> set, Set<Throwable> set2) {
            y1.b.a(this.f27134a, hVar, set, set2);
        }

        @Override // ne.h.b
        public int b(h<?> hVar) {
            return this.b.decrementAndGet(hVar);
        }
    }

    public static final class d extends b {
        public d() {
            super();
        }

        @Override // ne.h.b
        public void a(h<?> hVar, Set<Throwable> set, Set<Throwable> set2) {
            synchronized (hVar) {
                try {
                    if (hVar.f27132h == set) {
                        hVar.f27132h = set2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // ne.h.b
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
        f27130j = dVar;
        if (th2 != null) {
            f27131k.log(Level.SEVERE, "SafeAtomicHelper is broken!", th2);
        }
    }

    public h(int i10) {
        this.f27133i = i10;
    }

    public static /* synthetic */ int J(h hVar) {
        int i10 = hVar.f27133i - 1;
        hVar.f27133i = i10;
        return i10;
    }

    public abstract void K(Set<Throwable> set);

    public final void L() {
        this.f27132h = null;
    }

    public final int M() {
        return f27130j.b(this);
    }

    public final Set<Throwable> N() {
        Set<Throwable> set = this.f27132h;
        if (set != null) {
            return set;
        }
        Set<Throwable> setC = t0.c();
        K(setC);
        f27130j.a(this, null, setC);
        Set<Throwable> set2 = this.f27132h;
        Objects.requireNonNull(set2);
        return set2;
    }
}
