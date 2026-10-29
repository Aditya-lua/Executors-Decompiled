package nf;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: nf.b */
/* JADX INFO: loaded from: classes2.dex */
public class ThreadFactoryC9445b implements ThreadFactory {

    /* JADX INFO: renamed from: e */
    public static final ThreadFactory f33974e = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: a */
    public final AtomicLong f33975a = new AtomicLong();

    /* JADX INFO: renamed from: b */
    public final String f33976b;

    /* JADX INFO: renamed from: c */
    public final int f33977c;

    /* JADX INFO: renamed from: d */
    public final StrictMode.ThreadPolicy f33978d;

    public ThreadFactoryC9445b(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f33976b = str;
        this.f33977c = i10;
        this.f33978d = threadPolicy;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m37277a(ThreadFactoryC9445b threadFactoryC9445b, Runnable runnable) {
        Process.setThreadPriority(threadFactoryC9445b.f33977c);
        StrictMode.ThreadPolicy threadPolicy = threadFactoryC9445b.f33978d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread threadNewThread = f33974e.newThread(new Runnable() { // from class: nf.a
            @Override // java.lang.Runnable
            public final void run() {
                ThreadFactoryC9445b.m37277a(this.f33969a, runnable);
            }
        });
        threadNewThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f33976b, Long.valueOf(this.f33975a.getAndIncrement())));
        return threadNewThread;
    }
}
