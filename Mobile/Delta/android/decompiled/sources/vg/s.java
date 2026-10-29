package vg;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f33182a;
    public static final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ThreadFactory f33183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final BlockingQueue<Runnable> f33184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Executor f33185e;

    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f33186a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ReportingThread #" + this.f33186a.getAndIncrement());
        }
    }

    public static class b implements RejectedExecutionHandler {
        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f33182a = iAvailableProcessors;
        b = (iAvailableProcessors * 2) + 1;
        f33183c = new a();
        f33184d = new LinkedBlockingQueue(128);
    }

    public static synchronized Executor a() {
        try {
            if (f33185e == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, b, 30L, TimeUnit.SECONDS, f33184d, f33183c);
                threadPoolExecutor.allowCoreThreadTimeOut(true);
                threadPoolExecutor.setRejectedExecutionHandler(new b());
                f33185e = threadPoolExecutor;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f33185e;
    }
}
