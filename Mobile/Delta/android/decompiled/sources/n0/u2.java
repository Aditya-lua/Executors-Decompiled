package n0;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class u2<T> implements a3<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.p000lifecycle.d0<a<T>> f24877a = new androidx.p000lifecycle.d0<>();
    public final Map<a3.a<? super T>, Executor> b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.p000lifecycle.e0<a<T>> f24878c;

    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f24879a;
        public final Throwable b;

        public a(T t8, Throwable th2) {
            this.f24879a = t8;
            this.b = th2;
        }

        public static <T> a<T> b(T t8) {
            return new a<>(t8, null);
        }

        public boolean a() {
            return this.b == null;
        }

        public Throwable c() {
            return this.b;
        }

        public T d() {
            if (a()) {
                return this.f24879a;
            }
            throw new IllegalStateException("Result contains an error. Does not contain a value.");
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[Result: <");
            if (a()) {
                str = "Value: " + this.f24879a;
            } else {
                str = "Error: " + this.b;
            }
            sb2.append(str);
            sb2.append(">]");
            return sb2.toString();
        }
    }

    public static /* synthetic */ void a(u2 u2Var, final a aVar) {
        HashMap map;
        synchronized (u2Var.b) {
            map = new HashMap(u2Var.b);
        }
        for (final Map.Entry entry : map.entrySet()) {
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: n0.q2
                @Override // java.lang.Runnable
                public final void run() {
                    u2.f(entry, aVar);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void f(Map.Entry entry, a aVar) {
        a3.a aVar2 = (a3.a) entry.getKey();
        if (aVar.a()) {
            aVar2.a(aVar.d());
        } else {
            x2.g.g(aVar.c());
            aVar2.onError(aVar.c());
        }
    }

    public static /* synthetic */ Object g(final u2 u2Var, final y1.c.a aVar) {
        u2Var.getClass();
        q0.c.e().execute(new Runnable() { // from class: n0.o2
            @Override // java.lang.Runnable
            public final void run() {
                u2.k(this.f24764a, aVar);
            }
        });
        return u2Var + " [fetch@" + SystemClock.uptimeMillis() + "]";
    }

    public static /* synthetic */ void h(final u2 u2Var) {
        if (u2Var.f24878c == null) {
            u2Var.f24878c = new androidx.p000lifecycle.e0() { // from class: n0.p2
                @Override // androidx.p000lifecycle.e0
                public final void a(Object obj) {
                    u2.a(this.f24803a, (u2.a) obj);
                }
            };
        }
        u2Var.f24877a.j(u2Var.f24878c);
    }

    public static /* synthetic */ void i(u2 u2Var) {
        androidx.p000lifecycle.e0<a<T>> e0Var = u2Var.f24878c;
        if (e0Var != null) {
            u2Var.f24877a.n(e0Var);
        }
    }

    public static /* synthetic */ void j(u2 u2Var, a3.a aVar) {
        a<T> aVarF = u2Var.f24877a.f();
        if (aVarF == null) {
            return;
        }
        if (aVarF.a()) {
            aVar.a(aVarF.d());
        } else {
            x2.g.g(aVarF.c());
            aVar.onError(aVarF.c());
        }
    }

    public static /* synthetic */ void k(u2 u2Var, y1.c.a aVar) {
        a<T> aVarF = u2Var.f24877a.f();
        if (aVarF == null) {
            aVar.f(new IllegalStateException("Observable has not yet been initialized with a value."));
        } else if (aVarF.a()) {
            aVar.c(aVarF.d());
        } else {
            x2.g.g(aVarF.c());
            aVar.f(aVarF.c());
        }
    }

    @Override // n0.a3
    public me.x<T> b() {
        return y1.c.a(new y1.c.InterfaceC0650c() { // from class: n0.s2
            @Override // y1.c.InterfaceC0650c
            public final Object a(y1.c.a aVar) {
                return u2.g(this.f24837a, aVar);
            }
        });
    }

    @Override // n0.a3
    public void c(Executor executor, final a3.a<? super T> aVar) {
        synchronized (this.b) {
            try {
                boolean zIsEmpty = this.b.isEmpty();
                this.b.put(aVar, executor);
                if (zIsEmpty) {
                    m();
                } else {
                    executor.execute(new Runnable() { // from class: n0.r2
                        @Override // java.lang.Runnable
                        public final void run() {
                            u2.j(this.f24821a, aVar);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // n0.a3
    public void d(a3.a<? super T> aVar) {
        synchronized (this.b) {
            try {
                this.b.remove(aVar);
                if (this.b.isEmpty()) {
                    l();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l() {
        q0.c.e().execute(new Runnable() { // from class: n0.t2
            @Override // java.lang.Runnable
            public final void run() {
                u2.i(this.f24860a);
            }
        });
    }

    public final void m() {
        q0.c.e().execute(new Runnable() { // from class: n0.n2
            @Override // java.lang.Runnable
            public final void run() {
                u2.h(this.f24760a);
            }
        });
    }

    public void n(T t8) {
        this.f24877a.m(a.b(t8));
    }
}
