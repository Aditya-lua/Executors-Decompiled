package nf;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public class b implements ThreadFactory {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f27154e = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f27155a = new AtomicLong();
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f27156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f27157d;

    public b(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.b = str;
        this.f27156c = i10;
        this.f27157d = threadPolicy;
    }

    public static /* synthetic */ void a(b bVar, Runnable runnable) {
        Process.setThreadPriority(bVar.f27156c);
        StrictMode.ThreadPolicy threadPolicy = bVar.f27157d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread threadNewThread = f27154e.newThread(new Runnable() { // from class: nf.a
            @Override // java.lang.Runnable
            public final void run() {
                b.a(this.f27151a, runnable);
            }
        });
        threadNewThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.b, Long.valueOf(this.f27155a.getAndIncrement())));
        return threadNewThread;
    }
}
