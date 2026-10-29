package p140g0;

import android.os.Process;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p296n0.InterfaceC8794n0;
import p533x2.C12637g;

/* JADX INFO: renamed from: g0.q */
/* JADX INFO: loaded from: classes.dex */
public class ExecutorC5925q implements Executor {

    /* JADX INFO: renamed from: c */
    public static final ThreadFactory f22588c = new a();

    /* JADX INFO: renamed from: a */
    public final Object f22589a = new Object();

    /* JADX INFO: renamed from: b */
    public ThreadPoolExecutor f22590b = m26555c();

    /* JADX INFO: renamed from: g0.q$a */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f22591a = new AtomicInteger(0);

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m26558a(Runnable runnable) {
            Process.setThreadPriority(-3);
            runnable.run();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(final Runnable runnable) {
            Thread thread = new Thread(new Runnable() { // from class: g0.p
                @Override // java.lang.Runnable
                public final void run() {
                    ExecutorC5925q.a.m26558a(runnable);
                }
            });
            thread.setPriority(7);
            thread.setName(String.format(Locale.US, "CameraX-core_camera_%d", Integer.valueOf(this.f22591a.getAndIncrement())));
            return thread;
        }
    }

    /* JADX INFO: renamed from: c */
    public static ThreadPoolExecutor m26555c() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f22588c);
        threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: g0.o
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                C5931r1.m26563c("CameraExecutor", "A rejected execution occurred in CameraExecutor!");
            }
        });
        return threadPoolExecutor;
    }

    /* JADX INFO: renamed from: d */
    public void m26556d() {
        synchronized (this.f22589a) {
            try {
                if (!this.f22590b.isShutdown()) {
                    this.f22590b.shutdown();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m26557e(InterfaceC8794n0 interfaceC8794n0) {
        ThreadPoolExecutor threadPoolExecutor;
        C12637g.m47075g(interfaceC8794n0);
        synchronized (this.f22589a) {
            try {
                if (this.f22590b.isShutdown()) {
                    this.f22590b = m26555c();
                }
                threadPoolExecutor = this.f22590b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int iMax = Math.max(1, interfaceC8794n0.mo35285d().size());
        threadPoolExecutor.setMaximumPoolSize(iMax);
        threadPoolExecutor.setCorePoolSize(iMax);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        C12637g.m47075g(runnable);
        synchronized (this.f22589a) {
            this.f22590b.execute(runnable);
        }
    }
}
