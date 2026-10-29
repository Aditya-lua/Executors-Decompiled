package f7;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes3.dex */
public class s0<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Executor f16455e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<l0<T>> f16456a;
    public final Set<l0<Throwable>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f16457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile p0<T> f16458d;

    public static class a<T> extends FutureTask<p0<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public s0<T> f16459a;

        public a(s0<T> s0Var, Callable<p0<T>> callable) {
            super(callable);
            this.f16459a = s0Var;
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                if (isCancelled()) {
                    return;
                }
                try {
                    this.f16459a.l(get());
                } catch (InterruptedException | ExecutionException e10) {
                    this.f16459a.l(new p0(e10));
                }
            } finally {
                this.f16459a = null;
            }
        }
    }

    static {
        if ("true".equals(System.getProperty("lottie.testing.directExecutor"))) {
            f16455e = new Executor() { // from class: f7.q0
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    runnable.run();
                }
            };
        } else {
            f16455e = Executors.newCachedThreadPool(new s7.f());
        }
    }

    public s0(Callable<p0<T>> callable) {
        this(callable, false);
    }

    public synchronized s0<T> c(l0<Throwable> l0Var) {
        try {
            p0<T> p0Var = this.f16458d;
            if (p0Var != null && p0Var.a() != null) {
                l0Var.onResult(p0Var.a());
            }
            this.b.add(l0Var);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized s0<T> d(l0<T> l0Var) {
        try {
            p0<T> p0Var = this.f16458d;
            if (p0Var != null && p0Var.b() != null) {
                l0Var.onResult(p0Var.b());
            }
            this.f16456a.add(l0Var);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public p0<T> e() {
        return this.f16458d;
    }

    public final synchronized void f(Throwable th2) {
        ArrayList arrayList = new ArrayList(this.b);
        if (arrayList.isEmpty()) {
            s7.e.d("Lottie encountered an error but no failure listener was added:", th2);
            return;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((l0) obj).onResult(th2);
        }
    }

    public final void g() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            h();
        } else {
            this.f16457c.post(new Runnable() { // from class: f7.r0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16453a.h();
                }
            });
        }
    }

    public final void h() {
        p0<T> p0Var = this.f16458d;
        if (p0Var == null) {
            return;
        }
        if (p0Var.b() != null) {
            i(p0Var.b());
        } else {
            f(p0Var.a());
        }
    }

    public final synchronized void i(T t8) {
        ArrayList arrayList = new ArrayList(this.f16456a);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((l0) obj).onResult(t8);
        }
    }

    public synchronized s0<T> j(l0<Throwable> l0Var) {
        this.b.remove(l0Var);
        return this;
    }

    public synchronized s0<T> k(l0<T> l0Var) {
        this.f16456a.remove(l0Var);
        return this;
    }

    public final void l(p0<T> p0Var) {
        if (this.f16458d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f16458d = p0Var;
        g();
    }

    public s0(T t8) {
        this.f16456a = new LinkedHashSet(1);
        this.b = new LinkedHashSet(1);
        this.f16457c = new Handler(Looper.getMainLooper());
        this.f16458d = null;
        l(new p0<>(t8));
    }

    public s0(Callable<p0<T>> callable, boolean z10) {
        this.f16456a = new LinkedHashSet(1);
        this.b = new LinkedHashSet(1);
        this.f16457c = new Handler(Looper.getMainLooper());
        this.f16458d = null;
        if (z10) {
            try {
                l(callable.call());
                return;
            } catch (Throwable th2) {
                l(new p0<>(th2));
                return;
            }
        }
        f16455e.execute(new a(this, callable));
    }
}
