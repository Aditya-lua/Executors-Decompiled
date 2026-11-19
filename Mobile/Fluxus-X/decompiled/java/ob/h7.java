package ob;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class h7 extends p8 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final AtomicLong f27394k = new AtomicLong(Long.MIN_VALUE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g7 f27395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g7 f27396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PriorityBlockingQueue f27397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final BlockingQueue f27398f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f27399g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f27400h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f27401i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Semaphore f27402j;

    public h7(l7 l7Var) {
        super(l7Var);
        this.f27401i = new Object();
        this.f27402j = new Semaphore(2);
        this.f27397e = new PriorityBlockingQueue();
        this.f27398f = new LinkedBlockingQueue();
        this.f27399g = new e7(this, "Thread death: Uncaught exception on worker thread");
        this.f27400h = new e7(this, "Thread death: Uncaught exception on network thread");
    }

    public final /* synthetic */ void A(g7 g7Var) {
        this.f27396d = null;
    }

    public final /* synthetic */ Object B() {
        return this.f27401i;
    }

    public final /* synthetic */ Semaphore C() {
        return this.f27402j;
    }

    public final /* synthetic */ boolean D() {
        return false;
    }

    public final void F(f7 f7Var) {
        synchronized (this.f27401i) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.f27397e;
                priorityBlockingQueue.add(f7Var);
                g7 g7Var = this.f27395c;
                if (g7Var == null) {
                    g7 g7Var2 = new g7(this, "Measurement Worker", priorityBlockingQueue);
                    this.f27395c = g7Var2;
                    g7Var2.setUncaughtExceptionHandler(this.f27399g);
                    this.f27395c.start();
                } else {
                    g7Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ob.o8
    public final void g() {
        if (Thread.currentThread() != this.f27396d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // ob.o8
    public final void h() {
        if (Thread.currentThread() != this.f27395c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // ob.p8
    public final boolean i() {
        return false;
    }

    public final void o() {
        if (Thread.currentThread() == this.f27395c) {
            throw new IllegalStateException("Call not expected from worker thread");
        }
    }

    public final boolean p() {
        return Thread.currentThread() == this.f27395c;
    }

    public final boolean q() {
        return Thread.currentThread() == this.f27396d;
    }

    public final Future r(Callable callable) {
        l();
        o9.s.l(callable);
        f7 f7Var = new f7(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() != this.f27395c) {
            F(f7Var);
            return f7Var;
        }
        if (!this.f27397e.isEmpty()) {
            this.f27641a.a().r().a("Callable skipped the worker queue.");
        }
        f7Var.run();
        return f7Var;
    }

    public final Future s(Callable callable) {
        l();
        o9.s.l(callable);
        f7 f7Var = new f7(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f27395c) {
            f7Var.run();
            return f7Var;
        }
        F(f7Var);
        return f7Var;
    }

    public final void t(Runnable runnable) {
        l();
        o9.s.l(runnable);
        F(new f7(this, runnable, false, "Task exception on worker thread"));
    }

    public final Object u(AtomicReference atomicReference, long j10, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.f27641a.b().t(runnable);
            try {
                atomicReference.wait(j10);
            } catch (InterruptedException unused) {
                z5 z5VarR = this.f27641a.a().r();
                StringBuilder sb2 = new StringBuilder(str.length() + 24);
                sb2.append("Interrupted waiting for ");
                sb2.append(str);
                z5VarR.a(sb2.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            this.f27641a.a().r().a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final void v(Runnable runnable) {
        l();
        o9.s.l(runnable);
        F(new f7(this, runnable, true, "Task exception on worker thread"));
    }

    public final void w(Runnable runnable) {
        l();
        o9.s.l(runnable);
        f7 f7Var = new f7(this, runnable, false, "Task exception on network thread");
        synchronized (this.f27401i) {
            try {
                BlockingQueue blockingQueue = this.f27398f;
                blockingQueue.add(f7Var);
                g7 g7Var = this.f27396d;
                if (g7Var == null) {
                    g7 g7Var2 = new g7(this, "Measurement Network", blockingQueue);
                    this.f27396d = g7Var2;
                    g7Var2.setUncaughtExceptionHandler(this.f27400h);
                    this.f27396d.start();
                } else {
                    g7Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ g7 x() {
        return this.f27395c;
    }

    public final /* synthetic */ void y(g7 g7Var) {
        this.f27395c = null;
    }

    public final /* synthetic */ g7 z() {
        return this.f27396d;
    }
}
