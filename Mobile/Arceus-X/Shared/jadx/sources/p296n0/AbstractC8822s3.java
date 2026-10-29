package p296n0;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ne.InterfaceFutureC9440x;
import p397r0.C10773n;
import p533x2.C12637g;

/* JADX INFO: renamed from: n0.s3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8822s3<T> implements InterfaceC8722a3<T> {

    /* JADX INFO: renamed from: b */
    public final AtomicReference<Object> f32077b;

    /* JADX INFO: renamed from: a */
    public final Object f32076a = new Object();

    /* JADX INFO: renamed from: c */
    public int f32078c = 0;

    /* JADX INFO: renamed from: d */
    public boolean f32079d = false;

    /* JADX INFO: renamed from: e */
    public final Map<InterfaceC8722a3.a<? super T>, b<T>> f32080e = new HashMap();

    /* JADX INFO: renamed from: f */
    public final CopyOnWriteArraySet<b<T>> f32081f = new CopyOnWriteArraySet<>();

    /* JADX INFO: renamed from: n0.s3$a */
    public static abstract class a {
        /* JADX INFO: renamed from: b */
        public static a m35412b(Throwable th2) {
            return new C8813r(th2);
        }

        /* JADX INFO: renamed from: a */
        public abstract Throwable mo35389a();
    }

    /* JADX INFO: renamed from: n0.s3$b */
    public static final class b<T> implements Runnable {

        /* JADX INFO: renamed from: h */
        public static final Object f32082h = new Object();

        /* JADX INFO: renamed from: a */
        public final Executor f32083a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC8722a3.a<? super T> f32084b;

        /* JADX INFO: renamed from: d */
        public final AtomicReference<Object> f32086d;

        /* JADX INFO: renamed from: c */
        public final AtomicBoolean f32085c = new AtomicBoolean(true);

        /* JADX INFO: renamed from: e */
        public Object f32087e = f32082h;

        /* JADX INFO: renamed from: f */
        public int f32088f = -1;

        /* JADX INFO: renamed from: g */
        public boolean f32089g = false;

        public b(AtomicReference<Object> atomicReference, Executor executor, InterfaceC8722a3.a<? super T> aVar) {
            this.f32086d = atomicReference;
            this.f32083a = executor;
            this.f32084b = aVar;
        }

        /* JADX INFO: renamed from: a */
        public void m35413a() {
            this.f32085c.set(false);
        }

        /* JADX INFO: renamed from: b */
        public void m35414b(int i10) {
            synchronized (this) {
                try {
                    if (this.f32085c.get()) {
                        if (i10 <= this.f32088f) {
                            return;
                        }
                        this.f32088f = i10;
                        if (this.f32089g) {
                            return;
                        }
                        this.f32089g = true;
                        try {
                            this.f32083a.execute(this);
                        } catch (Throwable unused) {
                            synchronized (this) {
                                this.f32089g = false;
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
                    if (!this.f32085c.get()) {
                        this.f32089g = false;
                        return;
                    }
                    Object obj = this.f32086d.get();
                    int i10 = this.f32088f;
                    while (true) {
                        if (!Objects.equals(this.f32087e, obj)) {
                            this.f32087e = obj;
                            if (obj instanceof a) {
                                this.f32084b.onError(((a) obj).mo35389a());
                            } else {
                                this.f32084b.mo2367a(obj);
                            }
                        }
                        synchronized (this) {
                            try {
                                if (i10 == this.f32088f || !this.f32085c.get()) {
                                    break;
                                    break;
                                } else {
                                    obj = this.f32086d.get();
                                    i10 = this.f32088f;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    this.f32089g = false;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public AbstractC8822s3(Object obj, boolean z10) {
        if (!z10) {
            this.f32077b = new AtomicReference<>(obj);
        } else {
            C12637g.m47070b(obj instanceof Throwable, "Initial errors must be Throwable");
            this.f32077b = new AtomicReference<>(a.m35412b((Throwable) obj));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m35407a(InterfaceC8722a3.a<? super T> aVar) {
        b<T> bVarRemove = this.f32080e.remove(aVar);
        if (bVarRemove != null) {
            bVarRemove.m35413a();
            this.f32081f.remove(bVarRemove);
        }
    }

    @Override // p296n0.InterfaceC8722a3
    /* JADX INFO: renamed from: b */
    public InterfaceFutureC9440x<T> mo34017b() {
        Object obj = this.f32077b.get();
        return obj instanceof a ? C10773n.m40991n(((a) obj).mo35389a()) : C10773n.m40993p(obj);
    }

    @Override // p296n0.InterfaceC8722a3
    /* JADX INFO: renamed from: c */
    public void mo34018c(Executor executor, InterfaceC8722a3.a<? super T> aVar) {
        b<T> bVar;
        synchronized (this.f32076a) {
            m35407a(aVar);
            bVar = new b<>(this.f32077b, executor, aVar);
            this.f32080e.put(aVar, bVar);
            this.f32081f.add(bVar);
        }
        bVar.m35414b(0);
    }

    @Override // p296n0.InterfaceC8722a3
    /* JADX INFO: renamed from: d */
    public void mo34019d(InterfaceC8722a3.a<? super T> aVar) {
        synchronized (this.f32076a) {
            m35407a(aVar);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m35408f() {
        synchronized (this.f32076a) {
            try {
                Iterator it = new HashSet(this.f32080e.keySet()).iterator();
                while (it.hasNext()) {
                    m35407a((InterfaceC8722a3.a) it.next());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m35409g(T t8) {
        m35411i(t8);
    }

    /* JADX INFO: renamed from: h */
    public void m35410h(Throwable th2) {
        m35411i(a.m35412b(th2));
    }

    /* JADX INFO: renamed from: i */
    public final void m35411i(Object obj) {
        Iterator<b<T>> it;
        int i10;
        synchronized (this.f32076a) {
            try {
                if (Objects.equals(this.f32077b.getAndSet(obj), obj)) {
                    return;
                }
                int i11 = this.f32078c + 1;
                this.f32078c = i11;
                if (this.f32079d) {
                    return;
                }
                this.f32079d = true;
                Iterator<b<T>> it2 = this.f32081f.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        it2.next().m35414b(i11);
                    } else {
                        synchronized (this.f32076a) {
                            try {
                                if (this.f32078c == i11) {
                                    this.f32079d = false;
                                    return;
                                } else {
                                    it = this.f32081f.iterator();
                                    i10 = this.f32078c;
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
