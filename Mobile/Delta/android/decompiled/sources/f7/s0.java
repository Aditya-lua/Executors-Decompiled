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
    public static Executor f17051e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<l0<T>> f17052a;
    public final Set<l0<Throwable>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f17053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile p0<T> f17054d;

    public static class a<T> extends FutureTask<p0<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public s0<T> f17055a;

        public a(s0<T> s0Var, Callable<p0<T>> callable) {
            super(callable);
            this.f17055a = s0Var;
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                if (isCancelled()) {
                    return;
                }
                try {
                    this.f17055a.l(get());
                } catch (InterruptedException | ExecutionException e10) {
                    this.f17055a.l(new p0(e10));
                }
            } finally {
                this.f17055a = null;
            }
        }
    }

    static {
        if ("true".equals(System.getProperty("lottie.testing.directExecutor"))) {
            f17051e = new Executor() { // from class: f7.q0
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    runnable.run();
                }
            };
        } else {
            f17051e = Executors.newCachedThreadPool(new s7.f());
        }
    }

    public s0(Callable<p0<T>> callable) {
        this(callable, false);
    }

    public synchronized s0<T> c(l0<Throwable> l0Var) {
        try {
            p0<T> p0Var = this.f17054d;
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
            p0<T> p0Var = this.f17054d;
            if (p0Var != null && p0Var.b() != null) {
                l0Var.onResult(p0Var.b());
            }
            this.f17052a.add(l0Var);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public p0<T> e() {
        return this.f17054d;
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
            this.f17053c.post(new Runnable() { // from class: f7.r0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17049a.h();
                }
            });
        }
    }

    public final void h() {
        p0<T> p0Var = this.f17054d;
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
        ArrayList arrayList = new ArrayList(this.f17052a);
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
        this.f17052a.remove(l0Var);
        return this;
    }

    public final void l(p0<T> p0Var) {
        if (this.f17054d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f17054d = p0Var;
        g();
    }

    public s0(T t8) {
        this.f17052a = new LinkedHashSet(1);
        this.b = new LinkedHashSet(1);
        this.f17053c = new Handler(Looper.getMainLooper());
        this.f17054d = null;
        l(new p0<>(t8));
    }

    public s0(Callable<p0<T>> callable, boolean z10) {
        this.f17052a = new LinkedHashSet(1);
        this.b = new LinkedHashSet(1);
        this.f17053c = new Handler(Looper.getMainLooper());
        this.f17054d = null;
        if (z10) {
            try {
                l(callable.call());
                return;
            } catch (Throwable th2) {
                l(new p0<>(th2));
                return;
            }
        }
        f17051e.execute(new a(this, callable));
    }
}
