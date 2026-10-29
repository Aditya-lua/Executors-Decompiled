package p366q0;

import android.os.Process;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: q0.b */
/* JADX INFO: loaded from: classes.dex */
public class ExecutorC10416b implements Executor {

    /* JADX INFO: renamed from: b */
    public static volatile Executor f37528b;

    /* JADX INFO: renamed from: a */
    public final ExecutorService f37529a = Executors.newFixedThreadPool(2, new a());

    /* JADX INFO: renamed from: q0.b$a */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f37530a = new AtomicInteger(0);

        public a() {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m40079a(Runnable runnable) {
            Process.setThreadPriority(-16);
            runnable.run();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(final Runnable runnable) {
            Thread thread = new Thread(new Runnable() { // from class: q0.a
                @Override // java.lang.Runnable
                public final void run() {
                    ExecutorC10416b.a.m40079a(runnable);
                }
            });
            thread.setName(String.format(Locale.US, "CameraX-camerax_audio_%d", Integer.valueOf(this.f37530a.getAndIncrement())));
            return thread;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Executor m40078b() {
        if (f37528b != null) {
            return f37528b;
        }
        synchronized (ExecutorC10416b.class) {
            try {
                if (f37528b == null) {
                    f37528b = new ExecutorC10416b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f37528b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f37529a.execute(runnable);
    }
}
