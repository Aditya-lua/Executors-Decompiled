package g0;

import android.os.Process;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class q implements Executor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ThreadFactory f18038c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f18039a = new Object();
    public ThreadPoolExecutor b = c();

    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f18040a = new AtomicInteger(0);

        public static /* synthetic */ void a(Runnable runnable) {
            Process.setThreadPriority(-3);
            runnable.run();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(final Runnable runnable) {
            Thread thread = new Thread(new Runnable() { // from class: g0.p
                @Override // java.lang.Runnable
                public final void run() {
                    q.a.a(runnable);
                }
            });
            thread.setPriority(7);
            thread.setName(String.format(Locale.US, "CameraX-core_camera_%d", Integer.valueOf(this.f18040a.getAndIncrement())));
            return thread;
        }
    }

    public static ThreadPoolExecutor c() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f18038c);
        threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: g0.o
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                r1.c("CameraExecutor", "A rejected execution occurred in CameraExecutor!");
            }
        });
        return threadPoolExecutor;
    }

    public void d() {
        synchronized (this.f18039a) {
            try {
                if (!this.b.isShutdown()) {
                    this.b.shutdown();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e(n0.n0 n0Var) {
        ThreadPoolExecutor threadPoolExecutor;
        x2.g.g(n0Var);
        synchronized (this.f18039a) {
            try {
                if (this.b.isShutdown()) {
                    this.b = c();
                }
                threadPoolExecutor = this.b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int iMax = Math.max(1, n0Var.d().size());
        threadPoolExecutor.setMaximumPoolSize(iMax);
        threadPoolExecutor.setCorePoolSize(iMax);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        x2.g.g(runnable);
        synchronized (this.f18039a) {
            this.b.execute(runnable);
        }
    }
}
