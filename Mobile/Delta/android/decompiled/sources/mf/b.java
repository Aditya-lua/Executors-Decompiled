package mf;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public class b implements ThreadFactory {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f24146e = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f24147a = new AtomicLong();
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f24149d;

    public b(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.b = str;
        this.f24148c = i10;
        this.f24149d = threadPolicy;
    }

    public static /* synthetic */ void a(b bVar, Runnable runnable) {
        Process.setThreadPriority(bVar.f24148c);
        StrictMode.ThreadPolicy threadPolicy = bVar.f24149d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread threadNewThread = f24146e.newThread(new Runnable() { // from class: mf.a
            @Override // java.lang.Runnable
            public final void run() {
                b.a(this.f24143a, runnable);
            }
        });
        threadNewThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.b, Long.valueOf(this.f24147a.getAndIncrement())));
        return threadNewThread;
    }
}
