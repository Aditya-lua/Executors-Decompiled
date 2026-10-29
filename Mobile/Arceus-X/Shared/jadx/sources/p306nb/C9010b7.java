package p306nb;

import android.os.Process;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.b7 */
/* JADX INFO: loaded from: classes.dex */
public final class C9010b7 extends Thread {

    /* JADX INFO: renamed from: a */
    public final Object f32716a;

    /* JADX INFO: renamed from: b */
    public final BlockingQueue f32717b;

    /* JADX INFO: renamed from: c */
    public boolean f32718c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C9027c7 f32719d;

    public C9010b7(C9027c7 c9027c7, String str, BlockingQueue blockingQueue) {
        Objects.requireNonNull(c9027c7);
        this.f32719d = c9027c7;
        this.f32718c = false;
        C8953m.m36047l(str);
        C8953m.m36047l(blockingQueue);
        this.f32716a = new Object();
        this.f32717b = blockingQueue;
        setName(str);
    }

    /* JADX INFO: renamed from: a */
    public final void m36130a() {
        Object obj = this.f32716a;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m36131b() {
        C9027c7 c9027c7 = this.f32719d;
        synchronized (c9027c7.m36252B()) {
            try {
                if (!this.f32718c) {
                    c9027c7.m36253C().release();
                    c9027c7.m36252B().notifyAll();
                    if (this == c9027c7.m36267x()) {
                        c9027c7.m36268y(null);
                    } else if (this == c9027c7.m36269z()) {
                        c9027c7.m36251A(null);
                    } else {
                        c9027c7.f33067a.mo36321a().m37003o().m36911a("Current scheduler thread is neither worker nor network");
                    }
                    this.f32718c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m36132c(InterruptedException interruptedException) {
        this.f32719d.f33067a.mo36321a().m37006r().m36912b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z10 = false;
        while (!z10) {
            try {
                this.f32719d.m36253C().acquire();
                z10 = true;
            } catch (InterruptedException e10) {
                m36132c(e10);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.f32717b;
                C8993a7 c8993a7 = (C8993a7) blockingQueue.poll();
                if (c8993a7 != null) {
                    Process.setThreadPriority(true != c8993a7.f32676b ? 10 : threadPriority);
                    c8993a7.run();
                } else {
                    Object obj = this.f32716a;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.f32719d.m36254D();
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e11) {
                                m36132c(e11);
                            }
                        }
                    }
                    synchronized (this.f32719d.m36252B()) {
                        if (this.f32717b.peek() == null) {
                            m36131b();
                            m36131b();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            m36131b();
            throw th2;
        }
    }
}
