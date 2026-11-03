package ug;

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
    public static final int f32926a;
    public static final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ThreadFactory f32927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final BlockingQueue<Runnable> f32928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Executor f32929e;

    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f32930a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ReportingThread #" + this.f32930a.getAndIncrement());
        }
    }

    public static class b implements RejectedExecutionHandler {
        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f32926a = iAvailableProcessors;
        b = (iAvailableProcessors * 2) + 1;
        f32927c = new a();
        f32928d = new LinkedBlockingQueue(128);
    }

    public static synchronized Executor a() {
        try {
            if (f32929e == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, b, 30L, TimeUnit.SECONDS, f32928d, f32927c);
                threadPoolExecutor.allowCoreThreadTimeOut(true);
                threadPoolExecutor.setRejectedExecutionHandler(new b());
                f32929e = threadPoolExecutor;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f32929e;
    }
}
