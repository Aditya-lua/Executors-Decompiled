package nb;

import android.os.Process;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class b7 extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f25360a;
    public final BlockingQueue b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c7 f25362d;

    public b7(c7 c7Var, String str, BlockingQueue blockingQueue) {
        Objects.requireNonNull(c7Var);
        this.f25362d = c7Var;
        this.f25361c = false;
        n9.m.l(str);
        n9.m.l(blockingQueue);
        this.f25360a = new Object();
        this.b = blockingQueue;
        setName(str);
    }

    public final void a() {
        Object obj = this.f25360a;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    public final void b() {
        c7 c7Var = this.f25362d;
        synchronized (c7Var.B()) {
            try {
                if (!this.f25361c) {
                    c7Var.C().release();
                    c7Var.B().notifyAll();
                    if (this == c7Var.x()) {
                        c7Var.y(null);
                    } else if (this == c7Var.z()) {
                        c7Var.A(null);
                    } else {
                        c7Var.f25625a.a().o().a("Current scheduler thread is neither worker nor network");
                    }
                    this.f25361c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(InterruptedException interruptedException) {
        this.f25362d.f25625a.a().r().b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z10 = false;
        while (!z10) {
            try {
                this.f25362d.C().acquire();
                z10 = true;
            } catch (InterruptedException e10) {
                c(e10);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.b;
                a7 a7Var = (a7) blockingQueue.poll();
                if (a7Var != null) {
                    Process.setThreadPriority(true != a7Var.b ? 10 : threadPriority);
                    a7Var.run();
                } else {
                    Object obj = this.f25360a;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.f25362d.D();
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e11) {
                                c(e11);
                            }
                        }
                    }
                    synchronized (this.f25362d.B()) {
                        if (this.b.peek() == null) {
                            b();
                            b();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            b();
            throw th2;
        }
    }
}
