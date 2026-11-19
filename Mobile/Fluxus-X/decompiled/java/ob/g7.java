package ob;

import android.os.Process;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class g7 extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f27349a;
    public final BlockingQueue b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f27350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h7 f27351d;

    public g7(h7 h7Var, String str, BlockingQueue blockingQueue) {
        Objects.requireNonNull(h7Var);
        this.f27351d = h7Var;
        this.f27350c = false;
        o9.s.l(str);
        o9.s.l(blockingQueue);
        this.f27349a = new Object();
        this.b = blockingQueue;
        setName(str);
    }

    public final void a() {
        Object obj = this.f27349a;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    public final void b() {
        h7 h7Var = this.f27351d;
        synchronized (h7Var.B()) {
            try {
                if (!this.f27350c) {
                    h7Var.C().release();
                    h7Var.B().notifyAll();
                    if (this == h7Var.x()) {
                        h7Var.y(null);
                    } else if (this == h7Var.z()) {
                        h7Var.A(null);
                    } else {
                        h7Var.f27641a.a().o().a("Current scheduler thread is neither worker nor network");
                    }
                    this.f27350c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(InterruptedException interruptedException) {
        this.f27351d.f27641a.a().r().b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z10 = false;
        while (!z10) {
            try {
                this.f27351d.C().acquire();
                z10 = true;
            } catch (InterruptedException e10) {
                c(e10);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.b;
                f7 f7Var = (f7) blockingQueue.poll();
                if (f7Var != null) {
                    Process.setThreadPriority(true != f7Var.b ? 10 : threadPriority);
                    f7Var.run();
                } else {
                    Object obj = this.f27349a;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.f27351d.D();
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e11) {
                                c(e11);
                            }
                        }
                    }
                    synchronized (this.f27351d.B()) {
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
