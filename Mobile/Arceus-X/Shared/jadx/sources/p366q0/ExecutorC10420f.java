package p366q0;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: q0.f */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC10420f implements Executor {

    /* JADX INFO: renamed from: b */
    public static volatile Executor f37545b;

    /* JADX INFO: renamed from: a */
    public final ExecutorService f37546a = Executors.newSingleThreadExecutor(new a());

    /* JADX INFO: renamed from: q0.f$a */
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

    /* JADX INFO: renamed from: b */
    public static Executor m40092b() {
        if (f37545b != null) {
            return f37545b;
        }
        synchronized (ExecutorC10420f.class) {
            try {
                if (f37545b == null) {
                    f37545b = new ExecutorC10420f();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f37545b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f37546a.execute(runnable);
    }
}
