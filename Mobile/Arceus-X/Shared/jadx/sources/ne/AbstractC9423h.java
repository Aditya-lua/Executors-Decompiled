package ne;

import ie.C6797t0;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import p563y1.C12996b;

/* JADX INFO: renamed from: ne.h */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9423h<OutputT> extends AbstractC9411b.j<OutputT> {

    /* JADX INFO: renamed from: j */
    public static final b f33942j;

    /* JADX INFO: renamed from: k */
    public static final Logger f33943k = Logger.getLogger(AbstractC9423h.class.getName());

    /* JADX INFO: renamed from: h */
    public volatile Set<Throwable> f33944h = null;

    /* JADX INFO: renamed from: i */
    public volatile int f33945i;

    /* JADX INFO: renamed from: ne.h$b */
    public static abstract class b {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public b() {
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo37240a(AbstractC9423h<?> abstractC9423h, Set<Throwable> set, Set<Throwable> set2);

        /* JADX INFO: renamed from: b */
        public abstract int mo37241b(AbstractC9423h<?> abstractC9423h);
    }

    /* JADX INFO: renamed from: ne.h$c */
    public static final class c extends b {

        /* JADX INFO: renamed from: a */
        public final AtomicReferenceFieldUpdater<AbstractC9423h<?>, Set<Throwable>> f33946a;

        /* JADX INFO: renamed from: b */
        public final AtomicIntegerFieldUpdater<AbstractC9423h<?>> f33947b;

        public c(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            super();
            this.f33946a = atomicReferenceFieldUpdater;
            this.f33947b = atomicIntegerFieldUpdater;
        }

        @Override // ne.AbstractC9423h.b
        /* JADX INFO: renamed from: a */
        public void mo37240a(AbstractC9423h<?> abstractC9423h, Set<Throwable> set, Set<Throwable> set2) {
            C12996b.m48310a(this.f33946a, abstractC9423h, set, set2);
        }

        @Override // ne.AbstractC9423h.b
        /* JADX INFO: renamed from: b */
        public int mo37241b(AbstractC9423h<?> abstractC9423h) {
            return this.f33947b.decrementAndGet(abstractC9423h);
        }
    }

    /* JADX INFO: renamed from: ne.h$d */
    public static final class d extends b {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public d() {
            super();
        }

        @Override // ne.AbstractC9423h.b
        /* JADX INFO: renamed from: a */
        public void mo37240a(AbstractC9423h<?> abstractC9423h, Set<Throwable> set, Set<Throwable> set2) {
            synchronized (abstractC9423h) {
                try {
                    if (abstractC9423h.f33944h == set) {
                        abstractC9423h.f33944h = set2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // ne.AbstractC9423h.b
        /* JADX INFO: renamed from: b */
        public int mo37241b(AbstractC9423h<?> abstractC9423h) {
            int iM37236J;
            synchronized (abstractC9423h) {
                iM37236J = AbstractC9423h.m37236J(abstractC9423h);
            }
            return iM37236J;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    static {
        b dVar;
        Throwable th2 = null;
        Object[] objArr = 0;
        try {
            dVar = new c(AtomicReferenceFieldUpdater.newUpdater(AbstractC9423h.class, Set.class, "h"), AtomicIntegerFieldUpdater.newUpdater(AbstractC9423h.class, "i"));
        } catch (Throwable th3) {
            dVar = new d();
            th2 = th3;
        }
        f33942j = dVar;
        if (th2 != null) {
            f33943k.log(Level.SEVERE, "SafeAtomicHelper is broken!", th2);
        }
    }

    public AbstractC9423h(int i10) {
        this.f33945i = i10;
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ int m37236J(AbstractC9423h abstractC9423h) {
        int i10 = abstractC9423h.f33945i - 1;
        abstractC9423h.f33945i = i10;
        return i10;
    }

    /* JADX INFO: renamed from: K */
    public abstract void mo37217K(Set<Throwable> set);

    /* JADX INFO: renamed from: L */
    public final void m37237L() {
        this.f33944h = null;
    }

    /* JADX INFO: renamed from: M */
    public final int m37238M() {
        return f33942j.mo37241b(this);
    }

    /* JADX INFO: renamed from: N */
    public final Set<Throwable> m37239N() {
        Set<Throwable> set = this.f33944h;
        if (set != null) {
            return set;
        }
        Set<Throwable> setM29111c = C6797t0.m29111c();
        mo37217K(setM29111c);
        f33942j.mo37240a(this, null, setM29111c);
        Set<Throwable> set2 = this.f33944h;
        Objects.requireNonNull(set2);
        return set2;
    }
}
