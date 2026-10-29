package vg;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: vg.s */
/* JADX INFO: loaded from: classes2.dex */
public class C12189s {

    /* JADX INFO: renamed from: a */
    public static final int f42959a;

    /* JADX INFO: renamed from: b */
    public static final int f42960b;

    /* JADX INFO: renamed from: c */
    public static final ThreadFactory f42961c;

    /* JADX INFO: renamed from: d */
    public static final BlockingQueue<Runnable> f42962d;

    /* JADX INFO: renamed from: e */
    public static Executor f42963e;

    /* JADX INFO: renamed from: vg.s$a */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f42964a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ReportingThread #" + this.f42964a.getAndIncrement());
        }
    }

    /* JADX INFO: renamed from: vg.s$b */
    public static class b implements RejectedExecutionHandler {
        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f42959a = iAvailableProcessors;
        f42960b = (iAvailableProcessors * 2) + 1;
        f42961c = new a();
        f42962d = new LinkedBlockingQueue(128);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized Executor m45154a() {
        try {
            if (f42963e == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, f42960b, 30L, TimeUnit.SECONDS, f42962d, f42961c);
                threadPoolExecutor.allowCoreThreadTimeOut(true);
                threadPoolExecutor.setRejectedExecutionHandler(new b());
                f42963e = threadPoolExecutor;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f42963e;
    }
}
