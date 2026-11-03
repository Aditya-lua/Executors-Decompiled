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
    public final Object f25659a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25660c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25661d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<a3.a<? super T>, b<T>> f25662e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArraySet<b<T>> f25663f = new CopyOnWriteArraySet<>();

    public static abstract class a {
        public static a b(Throwable th2) {
            return new r(th2);
        }

        public abstract Throwable a();
    }

    public static final class b<T> implements Runnable {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final Object f25664h = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f25665a;
        public final a3.a<? super T> b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReference<Object> f25667d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicBoolean f25666c = new AtomicBoolean(true);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f25668e = f25664h;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f25669f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f25670g = false;

        public b(AtomicReference<Object> atomicReference, Executor executor, a3.a<? super T> aVar) {
            this.f25667d = atomicReference;
            this.f25665a = executor;
            this.b = aVar;
        }

        public void a() {
            this.f25666c.set(false);
        }

        public void b(int i10) {
            synchronized (this) {
                try {
                    if (this.f25666c.get()) {
                        if (i10 <= this.f25669f) {
                            return;
                        }
                        this.f25669f = i10;
                        if (this.f25670g) {
                            return;
                        }
                        this.f25670g = true;
                        try {
                            this.f25665a.execute(this);
                        } catch (Throwable unused) {
                            synchronized (this) {
                                this.f25670g = false;
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
                    if (!this.f25666c.get()) {
                        this.f25670g = false;
                        return;
                    }
                    Object obj = this.f25667d.get();
                    int i10 = this.f25669f;
                    while (true) {
                        if (!Objects.equals(this.f25668e, obj)) {
                            this.f25668e = obj;
                            if (obj instanceof a) {
                                this.b.onError(((a) obj).a());
                            } else {
                                this.b.a(obj);
                            }
                        }
                        synchronized (this) {
                            try {
                                if (i10 == this.f25669f || !this.f25666c.get()) {
                                    break;
                                    break;
                                } else {
                                    obj = this.f25667d.get();
                                    i10 = this.f25669f;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    this.f25670g = false;
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
        b<T> bVarRemove = this.f25662e.remove(aVar);
        if (bVarRemove != null) {
            bVarRemove.a();
            this.f25663f.remove(bVarRemove);
        }
    }

    @Override // n0.a3
    public ne.x<T> b() {
        Object obj = this.b.get();
        return obj instanceof a ? r0.n.n(((a) obj).a()) : r0.n.p(obj);
    }

    @Override // n0.a3
    public void c(Executor executor, a3.a<? super T> aVar) {
        b<T> bVar;
        synchronized (this.f25659a) {
            a(aVar);
            bVar = new b<>(this.b, executor, aVar);
            this.f25662e.put(aVar, bVar);
            this.f25663f.add(bVar);
        }
        bVar.b(0);
    }

    @Override // n0.a3
    public void d(a3.a<? super T> aVar) {
        synchronized (this.f25659a) {
            a(aVar);
        }
    }

    public void f() {
        synchronized (this.f25659a) {
            try {
                Iterator it = new HashSet(this.f25662e.keySet()).iterator();
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
        synchronized (this.f25659a) {
            try {
                if (Objects.equals(this.b.getAndSet(obj), obj)) {
                    return;
                }
                int i11 = this.f25660c + 1;
                this.f25660c = i11;
                if (this.f25661d) {
                    return;
                }
                this.f25661d = true;
                Iterator<b<T>> it2 = this.f25663f.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        it2.next().b(i11);
                    } else {
                        synchronized (this.f25659a) {
                            try {
                                if (this.f25660c == i11) {
                                    this.f25661d = false;
                                    return;
                                } else {
                                    it = this.f25663f.iterator();
                                    i10 = this.f25660c;
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
