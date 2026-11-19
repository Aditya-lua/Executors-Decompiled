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
    public final Object f25136a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25137c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25138d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<a3.a<? super T>, b<T>> f25139e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArraySet<b<T>> f25140f = new CopyOnWriteArraySet<>();

    public static abstract class a {
        public static a b(Throwable th2) {
            return new r(th2);
        }

        public abstract Throwable a();
    }

    public static final class b<T> implements Runnable {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final Object f25141h = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f25142a;
        public final a3.a<? super T> b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReference<Object> f25144d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicBoolean f25143c = new AtomicBoolean(true);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f25145e = f25141h;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f25146f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f25147g = false;

        public b(AtomicReference<Object> atomicReference, Executor executor, a3.a<? super T> aVar) {
            this.f25144d = atomicReference;
            this.f25142a = executor;
            this.b = aVar;
        }

        public void a() {
            this.f25143c.set(false);
        }

        public void b(int i10) {
            synchronized (this) {
                try {
                    if (this.f25143c.get()) {
                        if (i10 <= this.f25146f) {
                            return;
                        }
                        this.f25146f = i10;
                        if (this.f25147g) {
                            return;
                        }
                        this.f25147g = true;
                        try {
                            this.f25142a.execute(this);
                        } catch (Throwable unused) {
                            synchronized (this) {
                                this.f25147g = false;
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
                    if (!this.f25143c.get()) {
                        this.f25147g = false;
                        return;
                    }
                    Object obj = this.f25144d.get();
                    int i10 = this.f25146f;
                    while (true) {
                        if (!Objects.equals(this.f25145e, obj)) {
                            this.f25145e = obj;
                            if (obj instanceof a) {
                                this.b.onError(((a) obj).a());
                            } else {
                                this.b.a(obj);
                            }
                        }
                        synchronized (this) {
                            try {
                                if (i10 == this.f25146f || !this.f25143c.get()) {
                                    break;
                                    break;
                                } else {
                                    obj = this.f25144d.get();
                                    i10 = this.f25146f;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    this.f25147g = false;
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
        b<T> bVarRemove = this.f25139e.remove(aVar);
        if (bVarRemove != null) {
            bVarRemove.a();
            this.f25140f.remove(bVarRemove);
        }
    }

    @Override // n0.a3
    public pe.x<T> b() {
        Object obj = this.b.get();
        return obj instanceof a ? r0.n.n(((a) obj).a()) : r0.n.p(obj);
    }

    @Override // n0.a3
    public void c(Executor executor, a3.a<? super T> aVar) {
        b<T> bVar;
        synchronized (this.f25136a) {
            a(aVar);
            bVar = new b<>(this.b, executor, aVar);
            this.f25139e.put(aVar, bVar);
            this.f25140f.add(bVar);
        }
        bVar.b(0);
    }

    @Override // n0.a3
    public void d(a3.a<? super T> aVar) {
        synchronized (this.f25136a) {
            a(aVar);
        }
    }

    public void f() {
        synchronized (this.f25136a) {
            try {
                Iterator it = new HashSet(this.f25139e.keySet()).iterator();
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
        synchronized (this.f25136a) {
            try {
                if (Objects.equals(this.b.getAndSet(obj), obj)) {
                    return;
                }
                int i11 = this.f25137c + 1;
                this.f25137c = i11;
                if (this.f25138d) {
                    return;
                }
                this.f25138d = true;
                Iterator<b<T>> it2 = this.f25140f.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        it2.next().b(i11);
                    } else {
                        synchronized (this.f25136a) {
                            try {
                                if (this.f25137c == i11) {
                                    this.f25138d = false;
                                    return;
                                } else {
                                    it = this.f25140f.iterator();
                                    i10 = this.f25137c;
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
