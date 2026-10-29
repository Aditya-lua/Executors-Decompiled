package p396r;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: r.d */
/* JADX INFO: loaded from: classes.dex */
public class C10758d extends AbstractC10759e {

    /* JADX INFO: renamed from: a */
    public final Object f38334a = new Object();

    /* JADX INFO: renamed from: b */
    public final ExecutorService f38335b = Executors.newFixedThreadPool(4, new a());

    /* JADX INFO: renamed from: c */
    public volatile Handler f38336c;

    /* JADX INFO: renamed from: r.d$a */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f38337a = new AtomicInteger(0);

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f38337a.getAndIncrement());
            return thread;
        }
    }

    /* JADX INFO: renamed from: r.d$b */
    public static class b {
        @NonNull
        /* JADX INFO: renamed from: a */
        public static Handler m40969a(@NonNull Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static Handler m40968d(@NonNull Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.m40969a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // p396r.AbstractC10759e
    /* JADX INFO: renamed from: a */
    public void mo40965a(@NonNull Runnable runnable) {
        this.f38335b.execute(runnable);
    }

    @Override // p396r.AbstractC10759e
    /* JADX INFO: renamed from: b */
    public boolean mo40966b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // p396r.AbstractC10759e
    /* JADX INFO: renamed from: c */
    public void mo40967c(@NonNull Runnable runnable) {
        if (this.f38336c == null) {
            synchronized (this.f38334a) {
                try {
                    if (this.f38336c == null) {
                        this.f38336c = m40968d(Looper.getMainLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f38336c.post(runnable);
    }
}
