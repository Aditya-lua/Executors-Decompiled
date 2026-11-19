package t7;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class f implements ThreadFactory {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicInteger f32149d = new AtomicInteger(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadGroup f32150a;
    public final AtomicInteger b = new AtomicInteger(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f32151c;

    public f() {
        SecurityManager securityManager = System.getSecurityManager();
        this.f32150a = securityManager == null ? Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
        this.f32151c = "lottie-" + f32149d.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f32150a, runnable, this.f32151c + this.b.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
