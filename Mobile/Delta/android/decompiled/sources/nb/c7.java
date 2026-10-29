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
    public static final AtomicLong f25412k = new AtomicLong(Long.MIN_VALUE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b7 f25413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b7 f25414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PriorityBlockingQueue f25415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final BlockingQueue f25416f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f25417g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f25418h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f25419i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Semaphore f25420j;

    public c7(g7 g7Var) {
        super(g7Var);
        this.f25419i = new Object();
        this.f25420j = new Semaphore(2);
        this.f25415e = new PriorityBlockingQueue();
        this.f25416f = new LinkedBlockingQueue();
        this.f25417g = new z6(this, "Thread death: Uncaught exception on worker thread");
        this.f25418h = new z6(this, "Thread death: Uncaught exception on network thread");
    }

    public final /* synthetic */ void A(b7 b7Var) {
        this.f25414d = null;
    }

    public final /* synthetic */ Object B() {
        return this.f25419i;
    }

    public final /* synthetic */ Semaphore C() {
        return this.f25420j;
    }

    public final /* synthetic */ boolean D() {
        return false;
    }

    public final void F(a7 a7Var) {
        synchronized (this.f25419i) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.f25415e;
                priorityBlockingQueue.add(a7Var);
                b7 b7Var = this.f25413c;
                if (b7Var == null) {
                    b7 b7Var2 = new b7(this, "Measurement Worker", priorityBlockingQueue);
                    this.f25413c = b7Var2;
                    b7Var2.setUncaughtExceptionHandler(this.f25417g);
                    this.f25413c.start();
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
        if (Thread.currentThread() != this.f25414d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // nb.j8
    public final void h() {
        if (Thread.currentThread() != this.f25413c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // nb.k8
    public final boolean i() {
        return false;
    }

    public final void o() {
        if (Thread.currentThread() == this.f25413c) {
            throw new IllegalStateException("Call not expected from worker thread");
        }
    }

    public final boolean p() {
        return Thread.currentThread() == this.f25413c;
    }

    public final boolean q() {
        return Thread.currentThread() == this.f25414d;
    }

    public final Future r(Callable callable) {
        l();
        n9.m.l(callable);
        a7 a7Var = new a7(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() != this.f25413c) {
            F(a7Var);
            return a7Var;
        }
        if (!this.f25415e.isEmpty()) {
            this.f25625a.a().r().a("Callable skipped the worker queue.");
        }
        a7Var.run();
        return a7Var;
    }

    public final Future s(Callable callable) {
        l();
        n9.m.l(callable);
        a7 a7Var = new a7(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f25413c) {
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
            this.f25625a.b().t(runnable);
            try {
                atomicReference.wait(j10);
            } catch (InterruptedException unused) {
                u5 u5VarR = this.f25625a.a().r();
                StringBuilder sb2 = new StringBuilder(str.length() + 24);
                sb2.append("Interrupted waiting for ");
                sb2.append(str);
                u5VarR.a(sb2.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            this.f25625a.a().r().a("Timed out waiting for ".concat(str));
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
        synchronized (this.f25419i) {
            try {
                BlockingQueue blockingQueue = this.f25416f;
                blockingQueue.add(a7Var);
                b7 b7Var = this.f25414d;
                if (b7Var == null) {
                    b7 b7Var2 = new b7(this, "Measurement Network", blockingQueue);
                    this.f25414d = b7Var2;
                    b7Var2.setUncaughtExceptionHandler(this.f25418h);
                    this.f25414d.start();
                } else {
                    b7Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ b7 x() {
        return this.f25413c;
    }

    public final /* synthetic */ void y(b7 b7Var) {
        this.f25413c = null;
    }

    public final /* synthetic */ b7 z() {
        return this.f25414d;
    }
}
