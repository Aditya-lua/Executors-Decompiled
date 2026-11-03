package nb;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class c7 extends k8 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final AtomicLong f26233k = new AtomicLong(Long.MIN_VALUE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b7 f26234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b7 f26235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PriorityBlockingQueue f26236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final BlockingQueue f26237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f26238g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f26239h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f26240i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Semaphore f26241j;

    public c7(g7 g7Var) {
        super(g7Var);
        this.f26240i = new Object();
        this.f26241j = new Semaphore(2);
        this.f26236e = new PriorityBlockingQueue();
        this.f26237f = new LinkedBlockingQueue();
        this.f26238g = new z6(this, "Thread death: Uncaught exception on worker thread");
        this.f26239h = new z6(this, "Thread death: Uncaught exception on network thread");
    }

    public final /* synthetic */ void A(b7 b7Var) {
        this.f26235d = null;
    }

    public final /* synthetic */ Object B() {
        return this.f26240i;
    }

    public final /* synthetic */ Semaphore C() {
        return this.f26241j;
    }

    public final /* synthetic */ boolean D() {
        return false;
    }

    public final void F(a7 a7Var) {
        synchronized (this.f26240i) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.f26236e;
                priorityBlockingQueue.add(a7Var);
                b7 b7Var = this.f26234c;
                if (b7Var == null) {
                    b7 b7Var2 = new b7(this, "Measurement Worker", priorityBlockingQueue);
                    this.f26234c = b7Var2;
                    b7Var2.setUncaughtExceptionHandler(this.f26238g);
                    this.f26234c.start();
                } else {
                    b7Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // nb.j8
    public final void g() {
        if (Thread.currentThread() != this.f26235d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // nb.j8
    public final void h() {
        if (Thread.currentThread() != this.f26234c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // nb.k8
    public final boolean i() {
        return false;
    }

    public final void o() {
        if (Thread.currentThread() == this.f26234c) {
            throw new IllegalStateException("Call not expected from worker thread");
        }
    }

    public final boolean p() {
        return Thread.currentThread() == this.f26234c;
    }

    public final boolean q() {
        return Thread.currentThread() == this.f26235d;
    }

    public final Future r(Callable callable) {
        l();
        n9.m.l(callable);
        a7 a7Var = new a7(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() != this.f26234c) {
            F(a7Var);
            return a7Var;
        }
        if (!this.f26236e.isEmpty()) {
            this.f26446a.a().r().a("Callable skipped the worker queue.");
        }
        a7Var.run();
        return a7Var;
    }

    public final Future s(Callable callable) {
        l();
        n9.m.l(callable);
        a7 a7Var = new a7(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f26234c) {
            a7Var.run();
            return a7Var;
        }
        F(a7Var);
        return a7Var;
    }

    public final void t(Runnable runnable) {
        l();
        n9.m.l(runnable);
        F(new a7(this, runnable, false, "Task exception on worker thread"));
    }

    public final Object u(AtomicReference atomicReference, long j10, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.f26446a.b().t(runnable);
            try {
                atomicReference.wait(j10);
            } catch (InterruptedException unused) {
                u5 u5VarR = this.f26446a.a().r();
                StringBuilder sb2 = new StringBuilder(str.length() + 24);
                sb2.append("Interrupted waiting for ");
                sb2.append(str);
                u5VarR.a(sb2.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            this.f26446a.a().r().a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final void v(Runnable runnable) {
        l();
        n9.m.l(runnable);
        F(new a7(this, runnable, true, "Task exception on worker thread"));
    }

    public final void w(Runnable runnable) {
        l();
        n9.m.l(runnable);
        a7 a7Var = new a7(this, runnable, false, "Task exception on network thread");
        synchronized (this.f26240i) {
            try {
                BlockingQueue blockingQueue = this.f26237f;
                blockingQueue.add(a7Var);
                b7 b7Var = this.f26235d;
                if (b7Var == null) {
                    b7 b7Var2 = new b7(this, "Measurement Network", blockingQueue);
                    this.f26235d = b7Var2;
                    b7Var2.setUncaughtExceptionHandler(this.f26239h);
                    this.f26235d.start();
                } else {
                    b7Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ b7 x() {
        return this.f26234c;
    }

    public final /* synthetic */ void y(b7 b7Var) {
        this.f26234c = null;
    }

    public final /* synthetic */ b7 z() {
        return this.f26235d;
    }
}
