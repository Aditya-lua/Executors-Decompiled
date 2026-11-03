package androidx.p000lifecycle;

/* JADX INFO: loaded from: classes.dex */
public abstract class a0<T> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f2576k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2577a;
    public s.b<e0<? super T>, a0<T>.d> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f2580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Object f2581f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2582g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2583h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2584i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Runnable f2585j;

    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (a0.this.f2577a) {
                obj = a0.this.f2581f;
                a0.this.f2581f = a0.f2576k;
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
        public final s f2588e;

        public c(s sVar, e0<? super T> e0Var) {
            super(e0Var);
            this.f2588e = sVar;
        }

        @Override // androidx.lifecycle.a0.d
        public void b() {
            this.f2588e.a().d(this);
        }

        @Override // androidx.lifecycle.a0.d
        public boolean c(s sVar) {
            return this.f2588e == sVar;
        }

        @Override // androidx.lifecycle.a0.d
        public boolean d() {
            return this.f2588e.a().b().b(l.b.STARTED);
        }

        @Override // androidx.p000lifecycle.p
        public void f(s sVar, l.a aVar) {
            l.b bVarB = this.f2588e.a().b();
            if (bVarB == l.b.DESTROYED) {
                a0.this.n(this.f2590a);
                return;
            }
            l.b bVar = null;
            while (bVar != bVarB) {
                a(d());
                bVar = bVarB;
                bVarB = this.f2588e.a().b();
            }
        }
    }

    public abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e0<? super T> f2590a;
        public boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2591c = -1;

        public d(e0<? super T> e0Var) {
            this.f2590a = e0Var;
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
        this.f2577a = new Object();
        this.b = new s.b<>();
        this.f2578c = 0;
        this.f2581f = f2576k;
        this.f2585j = new a();
        this.f2580e = t8;
        this.f2582g = 0;
    }

    public static void b(String str) {
        if (r.c.g().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public void c(int i10) {
        int i11 = this.f2578c;
        this.f2578c = i10 + i11;
        if (this.f2579d) {
            return;
        }
        this.f2579d = true;
        while (true) {
            try {
                int i12 = this.f2578c;
                if (i11 == i12) {
                    this.f2579d = false;
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
                this.f2579d = false;
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
            int i10 = dVar.f2591c;
            int i11 = this.f2582g;
            if (i10 >= i11) {
                return;
            }
            dVar.f2591c = i11;
            dVar.f2590a.a((Object) this.f2580e);
        }
    }

    public void e(a0<T>.d dVar) {
        if (this.f2583h) {
            this.f2584i = true;
            return;
        }
        this.f2583h = true;
        do {
            this.f2584i = false;
            if (dVar != null) {
                d(dVar);
                dVar = null;
            } else {
                s.b<e0<? super T>, a0<T>.d>.d dVarC = this.b.c();
                while (dVarC.hasNext()) {
                    d((d) dVarC.next().getValue());
                    if (this.f2584i) {
                        break;
                    }
                }
            }
        } while (this.f2584i);
        this.f2583h = false;
    }

    public T f() {
        T t8 = (T) this.f2580e;
        if (t8 != f2576k) {
            return t8;
        }
        return null;
    }

    public int g() {
        return this.f2582g;
    }

    public boolean h() {
        return this.f2578c > 0;
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
        synchronized (this.f2577a) {
            z10 = this.f2581f == f2576k;
            this.f2581f = t8;
        }
        if (z10) {
            r.c.g().c(this.f2585j);
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
        this.f2582g++;
        this.f2580e = t8;
        e(null);
    }

    public a0() {
        this.f2577a = new Object();
        this.b = new s.b<>();
        this.f2578c = 0;
        Object obj = f2576k;
        this.f2581f = obj;
        this.f2585j = new a();
        this.f2580e = obj;
        this.f2582g = -1;
    }
}
