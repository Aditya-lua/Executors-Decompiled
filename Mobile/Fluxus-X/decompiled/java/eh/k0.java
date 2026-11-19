package eh;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f13555a;
    public static final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ThreadFactory f13556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final BlockingQueue<Runnable> f13557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Executor f13558e;

    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f13559a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ReportingThread #" + this.f13559a.getAndIncrement());
        }
    }

    public static class b implements RejectedExecutionHandler {
        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f13555a = iAvailableProcessors;
        b = (iAvailableProcessors * 2) + 1;
        f13556c = new a();
        f13557d = new LinkedBlockingQueue(Barcode.FORMAT_ITF);
    }

    public static synchronized Executor a() {
        try {
            if (f13558e == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, b, 30L, TimeUnit.SECONDS, f13557d, f13556c);
                threadPoolExecutor.allowCoreThreadTimeOut(true);
                threadPoolExecutor.setRejectedExecutionHandler(new b());
                f13558e = threadPoolExecutor;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f13558e;
    }
}
