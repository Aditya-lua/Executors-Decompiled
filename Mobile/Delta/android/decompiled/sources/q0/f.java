package q0;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Executor {
    public static volatile Executor b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f29169a = Executors.newSingleThreadExecutor(new a());

    public class a implements ThreadFactory {
        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            thread.setName("CameraX-camerax_high_priority");
            return thread;
        }
    }

    public static Executor b() {
        if (b != null) {
            return b;
        }
        synchronized (f.class) {
            try {
                if (b == null) {
                    b = new f();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f29169a.execute(runnable);
    }
}
