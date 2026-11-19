package androidx.p000lifecycle;

/* JADX INFO: loaded from: classes.dex */
public abstract class a0<T> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f2278k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2279a;
    public s.b<e0<? super T>, a0<T>.d> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f2282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Object f2283f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2284g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2285h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2286i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Runnable f2287j;

    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (a0.this.f2279a) {
                obj = a0.this.f2283f;
                a0.this.f2283f = a0.f2278k;
            }
            a0.this.o(obj);
        }
    }

    public class b extends a0<T>.d {
        public b(e0<? super T> e0Var) {
            super(e0Var);
        }

        @Override // androidx.lifecycle.a0.d
        public boolean d() {
            return true;
        }
    }

    public class c extends a0<T>.d implements p {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final s f2290e;

        public c(s sVar, e0<? super T> e0Var) {
            super(e0Var);
            this.f2290e = sVar;
        }

        @Override // androidx.lifecycle.a0.d
        public void b() {
            this.f2290e.a().d(this);
        }

        @Override // androidx.lifecycle.a0.d
        public boolean c(s sVar) {
            return this.f2290e == sVar;
        }

        @Override // androidx.lifecycle.a0.d
        public boolean d() {
            return this.f2290e.a().b().b(l.b.STARTED);
        }

        @Override // androidx.p000lifecycle.p
        public void g(s sVar, l.a aVar) {
            l.b bVarB = this.f2290e.a().b();
            if (bVarB == l.b.DESTROYED) {
                a0.this.n(this.f2292a);
                return;
            }
            l.b bVar = null;
            while (bVar != bVarB) {
                a(d());
                bVar = bVarB;
                bVarB = this.f2290e.a().b();
            }
        }
    }

    public abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e0<? super T> f2292a;
        public boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2293c = -1;

        public d(e0<? super T> e0Var) {
            this.f2292a = e0Var;
        }

        public void a(boolean z10) {
            if (z10 == this.b) {
                return;
            }
            this.b = z10;
            a0.this.c(z10 ? 1 : -1);
            if (this.b) {
                a0.this.e(this);
            }
        }

        public void b() {
        }

        public boolean c(s sVar) {
            return false;
        }

        public abstract boolean d();
    }

    public a0(T t8) {
        this.f2279a = new Object();
        this.b = new s.b<>();
        this.f2280c = 0;
        this.f2283f = f2278k;
        this.f2287j = new a();
        this.f2282e = t8;
        this.f2284g = 0;
    }

    public static void b(String str) {
        if (r.c.g().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public void c(int i10) {
        int i11 = this.f2280c;
        this.f2280c = i10 + i11;
        if (this.f2281d) {
            return;
        }
        this.f2281d = true;
        while (true) {
            try {
                int i12 = this.f2280c;
                if (i11 == i12) {
                    this.f2281d = false;
                    return;
                }
                boolean z10 = i11 == 0 && i12 > 0;
                boolean z11 = i11 > 0 && i12 == 0;
                if (z10) {
                    k();
                } else if (z11) {
                    l();
                }
                i11 = i12;
            } catch (Throwable th2) {
                this.f2281d = false;
                throw th2;
            }
        }
    }

    public final void d(a0<T>.d dVar) {
        if (dVar.b) {
            if (!dVar.d()) {
                dVar.a(false);
                return;
            }
            int i10 = dVar.f2293c;
            int i11 = this.f2284g;
            if (i10 >= i11) {
                return;
            }
            dVar.f2293c = i11;
            dVar.f2292a.a((Object) this.f2282e);
        }
    }

    public void e(a0<T>.d dVar) {
        if (this.f2285h) {
            this.f2286i = true;
            return;
        }
        this.f2285h = true;
        do {
            this.f2286i = false;
            if (dVar != null) {
                d(dVar);
                dVar = null;
            } else {
                s.b<e0<? super T>, a0<T>.d>.d dVarC = this.b.c();
                while (dVarC.hasNext()) {
                    d((d) dVarC.next().getValue());
                    if (this.f2286i) {
                        break;
                    }
                }
            }
        } while (this.f2286i);
        this.f2285h = false;
    }

    public T f() {
        T t8 = (T) this.f2282e;
        if (t8 != f2278k) {
            return t8;
        }
        return null;
    }

    public int g() {
        return this.f2284g;
    }

    public boolean h() {
        return this.f2280c > 0;
    }

    public void i(s sVar, e0<? super T> e0Var) {
        b("observe");
        if (sVar.a().b() == l.b.DESTROYED) {
            return;
        }
        c cVar = new c(sVar, e0Var);
        a0<T>.d dVarF = this.b.f(e0Var, cVar);
        if (dVarF != null && !dVarF.c(sVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVarF != null) {
            return;
        }
        sVar.a().a(cVar);
    }

    public void j(e0<? super T> e0Var) {
        b("observeForever");
        b bVar = new b(e0Var);
        a0<T>.d dVarF = this.b.f(e0Var, bVar);
        if (dVarF instanceof c) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVarF != null) {
            return;
        }
        bVar.a(true);
    }

    public void k() {
    }

    public void l() {
    }

    public void m(T t8) {
        boolean z10;
        synchronized (this.f2279a) {
            z10 = this.f2283f == f2278k;
            this.f2283f = t8;
        }
        if (z10) {
            r.c.g().c(this.f2287j);
        }
    }

    public void n(e0<? super T> e0Var) {
        b("removeObserver");
        a0<T>.d dVarG = this.b.g(e0Var);
        if (dVarG == null) {
            return;
        }
        dVarG.b();
        dVarG.a(false);
    }

    public void o(T t8) {
        b("setValue");
        this.f2284g++;
        this.f2282e = t8;
        e(null);
    }

    public a0() {
        this.f2279a = new Object();
        this.b = new s.b<>();
        this.f2280c = 0;
        Object obj = f2278k;
        this.f2283f = obj;
        this.f2287j = new a();
        this.f2282e = obj;
        this.f2284g = -1;
    }
}
