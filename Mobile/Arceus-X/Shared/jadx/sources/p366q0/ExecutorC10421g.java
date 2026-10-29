package p366q0;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: q0.g */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC10421g implements Executor {

    /* JADX INFO: renamed from: b */
    public static volatile Executor f37548b;

    /* JADX INFO: renamed from: a */
    public final ExecutorService f37549a = Executors.newFixedThreadPool(2, new a());

    /* JADX INFO: renamed from: q0.g$a */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f37550a = new AtomicInteger(0);

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-camerax_io_%d", Integer.valueOf(this.f37550a.getAndIncrement())));
            return thread;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Executor m40093b() {
        if (f37548b != null) {
            return f37548b;
        }
        synchronized (ExecutorC10421g.class) {
            try {
                if (f37548b == null) {
                    f37548b = new ExecutorC10421g();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f37548b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f37549a.execute(runnable);
    }
}
