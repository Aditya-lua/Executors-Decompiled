package n0;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class s3<T> implements a3<T> {
    public final AtomicReference<Object> b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f24838a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24839c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f24840d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<a3.a<? super T>, b<T>> f24841e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArraySet<b<T>> f24842f = new CopyOnWriteArraySet<>();

    public static abstract class a {
        public static a b(Throwable th2) {
            return new r(th2);
        }

        public abstract Throwable a();
    }

    public static final class b<T> implements Runnable {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final Object f24843h = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f24844a;
        public final a3.a<? super T> b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReference<Object> f24846d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicBoolean f24845c = new AtomicBoolean(true);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f24847e = f24843h;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f24848f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f24849g = false;

        public b(AtomicReference<Object> atomicReference, Executor executor, a3.a<? super T> aVar) {
            this.f24846d = atomicReference;
            this.f24844a = executor;
            this.b = aVar;
        }

        public void a() {
            this.f24845c.set(false);
        }

        public void b(int i10) {
            synchronized (this) {
                try {
                    if (this.f24845c.get()) {
                        if (i10 <= this.f24848f) {
                            return;
                        }
                        this.f24848f = i10;
                        if (this.f24849g) {
                            return;
                        }
                        this.f24849g = true;
                        try {
                            this.f24844a.execute(this);
                        } catch (Throwable unused) {
                            synchronized (this) {
                                this.f24849g = false;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                try {
                    if (!this.f24845c.get()) {
                        this.f24849g = false;
                        return;
                    }
                    Object obj = this.f24846d.get();
                    int i10 = this.f24848f;
                    while (true) {
                        if (!Objects.equals(this.f24847e, obj)) {
                            this.f24847e = obj;
                            if (obj instanceof a) {
                                this.b.onError(((a) obj).a());
                            } else {
                                this.b.a(obj);
                            }
                        }
                        synchronized (this) {
                            try {
                                if (i10 == this.f24848f || !this.f24845c.get()) {
                                    break;
                                    break;
                                } else {
                                    obj = this.f24846d.get();
                                    i10 = this.f24848f;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    this.f24849g = false;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public s3(Object obj, boolean z10) {
        if (!z10) {
            this.b = new AtomicReference<>(obj);
        } else {
            x2.g.b(obj instanceof Throwable, "Initial errors must be Throwable");
            this.b = new AtomicReference<>(a.b((Throwable) obj));
        }
    }

    public final void a(a3.a<? super T> aVar) {
        b<T> bVarRemove = this.f24841e.remove(aVar);
        if (bVarRemove != null) {
            bVarRemove.a();
            this.f24842f.remove(bVarRemove);
        }
    }

    @Override // n0.a3
    public me.x<T> b() {
        Object obj = this.b.get();
        return obj instanceof a ? r0.n.n(((a) obj).a()) : r0.n.p(obj);
    }

    @Override // n0.a3
    public void c(Executor executor, a3.a<? super T> aVar) {
        b<T> bVar;
        synchronized (this.f24838a) {
            a(aVar);
            bVar = new b<>(this.b, executor, aVar);
            this.f24841e.put(aVar, bVar);
            this.f24842f.add(bVar);
        }
        bVar.b(0);
    }

    @Override // n0.a3
    public void d(a3.a<? super T> aVar) {
        synchronized (this.f24838a) {
            a(aVar);
        }
    }

    public void f() {
        synchronized (this.f24838a) {
            try {
                Iterator it = new HashSet(this.f24841e.keySet()).iterator();
                while (it.hasNext()) {
                    a((a3.a) it.next());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void g(T t8) {
        i(t8);
    }

    public void h(Throwable th2) {
        i(a.b(th2));
    }

    public final void i(Object obj) {
        Iterator<b<T>> it;
        int i10;
        synchronized (this.f24838a) {
            try {
                if (Objects.equals(this.b.getAndSet(obj), obj)) {
                    return;
                }
                int i11 = this.f24839c + 1;
                this.f24839c = i11;
                if (this.f24840d) {
                    return;
                }
                this.f24840d = true;
                Iterator<b<T>> it2 = this.f24842f.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        it2.next().b(i11);
                    } else {
                        synchronized (this.f24838a) {
                            try {
                                if (this.f24839c == i11) {
                                    this.f24840d = false;
                                    return;
                                } else {
                                    it = this.f24842f.iterator();
                                    i10 = this.f24839c;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        it2 = it;
                        i11 = i10;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
