package q0;

import android.os.Process;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class b implements Executor {
    public static volatile Executor b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f29158a = Executors.newFixedThreadPool(2, new a());

    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f29159a = new AtomicInteger(0);

        public a() {
        }

        public static /* synthetic */ void a(Runnable runnable) {
            Process.setThreadPriority(-16);
            runnable.run();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(final Runnable runnable) {
            Thread thread = new Thread(new Runnable() { // from class: q0.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.a.a(runnable);
                }
            });
            thread.setName(String.format(Locale.US, "CameraX-camerax_audio_%d", Integer.valueOf(this.f29159a.getAndIncrement())));
            return thread;
        }
    }

    public static Executor b() {
        if (b != null) {
            return b;
        }
        synchronized (b.class) {
            try {
                if (b == null) {
                    b = new b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f29158a.execute(runnable);
    }
}
