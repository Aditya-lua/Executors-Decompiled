package p306nb;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.c7 */
/* JADX INFO: loaded from: classes.dex */
public final class C9027c7 extends AbstractC9159k8 {

    /* JADX INFO: renamed from: k */
    public static final AtomicLong f32796k = new AtomicLong(Long.MIN_VALUE);

    /* JADX INFO: renamed from: c */
    public C9010b7 f32797c;

    /* JADX INFO: renamed from: d */
    public C9010b7 f32798d;

    /* JADX INFO: renamed from: e */
    public final PriorityBlockingQueue f32799e;

    /* JADX INFO: renamed from: f */
    public final BlockingQueue f32800f;

    /* JADX INFO: renamed from: g */
    public final Thread.UncaughtExceptionHandler f32801g;

    /* JADX INFO: renamed from: h */
    public final Thread.UncaughtExceptionHandler f32802h;

    /* JADX INFO: renamed from: i */
    public final Object f32803i;

    /* JADX INFO: renamed from: j */
    public final Semaphore f32804j;

    public C9027c7(C9094g7 c9094g7) {
        super(c9094g7);
        this.f32803i = new Object();
        this.f32804j = new Semaphore(2);
        this.f32799e = new PriorityBlockingQueue();
        this.f32800f = new LinkedBlockingQueue();
        this.f32801g = new C9397z6(this, "Thread death: Uncaught exception on worker thread");
        this.f32802h = new C9397z6(this, "Thread death: Uncaught exception on network thread");
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m36251A(C9010b7 c9010b7) {
        this.f32798d = null;
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ Object m36252B() {
        return this.f32803i;
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ Semaphore m36253C() {
        return this.f32804j;
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ boolean m36254D() {
        return false;
    }

    /* JADX INFO: renamed from: F */
    public final void m36255F(C8993a7 c8993a7) {
        synchronized (this.f32803i) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.f32799e;
                priorityBlockingQueue.add(c8993a7);
                C9010b7 c9010b7 = this.f32797c;
                if (c9010b7 == null) {
                    C9010b7 c9010b8 = new C9010b7(this, "Measurement Worker", priorityBlockingQueue);
                    this.f32797c = c9010b8;
                    c9010b8.setUncaughtExceptionHandler(this.f32801g);
                    this.f32797c.start();
                } else {
                    c9010b7.m36130a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p306nb.C9143j8
    /* JADX INFO: renamed from: g */
    public final void mo36256g() {
        if (Thread.currentThread() != this.f32798d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // p306nb.C9143j8
    /* JADX INFO: renamed from: h */
    public final void mo36088h() {
        if (Thread.currentThread() != this.f32797c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // p306nb.AbstractC9159k8
    /* JADX INFO: renamed from: i */
    public final boolean mo36257i() {
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final void m36258o() {
        if (Thread.currentThread() == this.f32797c) {
            throw new IllegalStateException("Call not expected from worker thread");
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m36259p() {
        return Thread.currentThread() == this.f32797c;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m36260q() {
        return Thread.currentThread() == this.f32798d;
    }

    /* JADX INFO: renamed from: r */
    public final Future m36261r(Callable callable) {
        m36455l();
        C8953m.m36047l(callable);
        C8993a7 c8993a7 = new C8993a7(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() != this.f32797c) {
            m36255F(c8993a7);
            return c8993a7;
        }
        if (!this.f32799e.isEmpty()) {
            this.f33067a.mo36321a().m37006r().m36911a("Callable skipped the worker queue.");
        }
        c8993a7.run();
        return c8993a7;
    }

    /* JADX INFO: renamed from: s */
    public final Future m36262s(Callable callable) {
        m36455l();
        C8953m.m36047l(callable);
        C8993a7 c8993a7 = new C8993a7(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f32797c) {
            c8993a7.run();
            return c8993a7;
        }
        m36255F(c8993a7);
        return c8993a7;
    }

    /* JADX INFO: renamed from: t */
    public final void m36263t(Runnable runnable) {
        m36455l();
        C8953m.m36047l(runnable);
        m36255F(new C8993a7(this, runnable, false, "Task exception on worker thread"));
    }

    /* JADX INFO: renamed from: u */
    public final Object m36264u(AtomicReference atomicReference, long j10, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.f33067a.mo36322b().m36263t(runnable);
            try {
                atomicReference.wait(j10);
            } catch (InterruptedException unused) {
                C9316u5 c9316u5M37006r = this.f33067a.mo36321a().m37006r();
                StringBuilder sb2 = new StringBuilder(str.length() + 24);
                sb2.append("Interrupted waiting for ");
                sb2.append(str);
                c9316u5M37006r.m36911a(sb2.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            this.f33067a.mo36321a().m37006r().m36911a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    /* JADX INFO: renamed from: v */
    public final void m36265v(Runnable runnable) {
        m36455l();
        C8953m.m36047l(runnable);
        m36255F(new C8993a7(this, runnable, true, "Task exception on worker thread"));
    }

    /* JADX INFO: renamed from: w */
    public final void m36266w(Runnable runnable) {
        m36455l();
        C8953m.m36047l(runnable);
        C8993a7 c8993a7 = new C8993a7(this, runnable, false, "Task exception on network thread");
        synchronized (this.f32803i) {
            try {
                BlockingQueue blockingQueue = this.f32800f;
                blockingQueue.add(c8993a7);
                C9010b7 c9010b7 = this.f32798d;
                if (c9010b7 == null) {
                    C9010b7 c9010b8 = new C9010b7(this, "Measurement Network", blockingQueue);
                    this.f32798d = c9010b8;
                    c9010b8.setUncaughtExceptionHandler(this.f32802h);
                    this.f32798d.start();
                } else {
                    c9010b7.m36130a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C9010b7 m36267x() {
        return this.f32797c;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m36268y(C9010b7 c9010b7) {
        this.f32797c = null;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C9010b7 m36269z() {
        return this.f32798d;
    }
}
