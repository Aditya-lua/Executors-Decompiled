package p121f7;

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
import p431s7.C11189e;
import p431s7.ThreadFactoryC11190f;

/* JADX INFO: renamed from: f7.s0 */
/* JADX INFO: loaded from: classes3.dex */
public class C5473s0<T> {

    /* JADX INFO: renamed from: e */
    public static Executor f21202e;

    /* JADX INFO: renamed from: a */
    public final Set<InterfaceC5459l0<T>> f21203a;

    /* JADX INFO: renamed from: b */
    public final Set<InterfaceC5459l0<Throwable>> f21204b;

    /* JADX INFO: renamed from: c */
    public final Handler f21205c;

    /* JADX INFO: renamed from: d */
    public volatile C5467p0<T> f21206d;

    /* JADX INFO: renamed from: f7.s0$a */
    public static class a<T> extends FutureTask<C5467p0<T>> {

        /* JADX INFO: renamed from: a */
        public C5473s0<T> f21207a;

        public a(C5473s0<T> c5473s0, Callable<C5467p0<T>> callable) {
            super(callable);
            this.f21207a = c5473s0;
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                if (isCancelled()) {
                    return;
                }
                try {
                    this.f21207a.m25120l(get());
                } catch (InterruptedException | ExecutionException e10) {
                    this.f21207a.m25120l(new C5467p0(e10));
                }
            } finally {
                this.f21207a = null;
            }
        }
    }

    static {
        if ("true".equals(System.getProperty("lottie.testing.directExecutor"))) {
            f21202e = new Executor() { // from class: f7.q0
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    runnable.run();
                }
            };
        } else {
            f21202e = Executors.newCachedThreadPool(new ThreadFactoryC11190f());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5473s0(Callable<C5467p0<T>> callable) {
        this(callable, false);
    }

    /* JADX INFO: renamed from: c */
    public synchronized C5473s0<T> m25111c(InterfaceC5459l0<Throwable> interfaceC5459l0) {
        try {
            C5467p0<T> c5467p0 = this.f21206d;
            if (c5467p0 != null && c5467p0.m25071a() != null) {
                interfaceC5459l0.onResult(c5467p0.m25071a());
            }
            this.f21204b.add(interfaceC5459l0);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    /* JADX INFO: renamed from: d */
    public synchronized C5473s0<T> m25112d(InterfaceC5459l0<T> interfaceC5459l0) {
        try {
            C5467p0<T> c5467p0 = this.f21206d;
            if (c5467p0 != null && c5467p0.m25072b() != null) {
                interfaceC5459l0.onResult(c5467p0.m25072b());
            }
            this.f21203a.add(interfaceC5459l0);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public C5467p0<T> m25113e() {
        return this.f21206d;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m25114f(Throwable th2) {
        ArrayList arrayList = new ArrayList(this.f21204b);
        if (arrayList.isEmpty()) {
            C11189e.m42154d("Lottie encountered an error but no failure listener was added:", th2);
            return;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((InterfaceC5459l0) obj).onResult(th2);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m25115g() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            m25116h();
        } else {
            this.f21205c.post(new Runnable() { // from class: f7.r0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21199a.m25116h();
                }
            });
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m25116h() {
        C5467p0<T> c5467p0 = this.f21206d;
        if (c5467p0 == null) {
            return;
        }
        if (c5467p0.m25072b() != null) {
            m25117i(c5467p0.m25072b());
        } else {
            m25114f(c5467p0.m25071a());
        }
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m25117i(T t8) {
        ArrayList arrayList = new ArrayList(this.f21203a);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((InterfaceC5459l0) obj).onResult(t8);
        }
    }

    /* JADX INFO: renamed from: j */
    public synchronized C5473s0<T> m25118j(InterfaceC5459l0<Throwable> interfaceC5459l0) {
        this.f21204b.remove(interfaceC5459l0);
        return this;
    }

    /* JADX INFO: renamed from: k */
    public synchronized C5473s0<T> m25119k(InterfaceC5459l0<T> interfaceC5459l0) {
        this.f21203a.remove(interfaceC5459l0);
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final void m25120l(C5467p0<T> c5467p0) {
        if (this.f21206d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f21206d = c5467p0;
        m25115g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C5473s0(T t8) {
        this.f21203a = new LinkedHashSet(1);
        this.f21204b = new LinkedHashSet(1);
        this.f21205c = new Handler(Looper.getMainLooper());
        this.f21206d = null;
        m25120l(new C5467p0<>(t8));
    }

    public C5473s0(Callable<C5467p0<T>> callable, boolean z10) {
        this.f21203a = new LinkedHashSet(1);
        this.f21204b = new LinkedHashSet(1);
        this.f21205c = new Handler(Looper.getMainLooper());
        this.f21206d = null;
        if (z10) {
            try {
                m25120l(callable.call());
                return;
            } catch (Throwable th2) {
                m25120l(new C5467p0<>(th2));
                return;
            }
        }
        f21202e.execute(new a(this, callable));
    }
}
