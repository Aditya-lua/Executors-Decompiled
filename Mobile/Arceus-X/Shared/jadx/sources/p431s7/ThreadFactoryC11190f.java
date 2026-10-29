package p431s7;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: s7.f */
/* JADX INFO: loaded from: classes3.dex */
public class ThreadFactoryC11190f implements ThreadFactory {

    /* JADX INFO: renamed from: d */
    public static final AtomicInteger f39465d = new AtomicInteger(1);

    /* JADX INFO: renamed from: a */
    public final ThreadGroup f39466a;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f39467b = new AtomicInteger(1);

    /* JADX INFO: renamed from: c */
    public final String f39468c;

    public ThreadFactoryC11190f() {
        SecurityManager securityManager = System.getSecurityManager();
        this.f39466a = securityManager == null ? Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
        this.f39468c = "lottie-" + f39465d.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f39466a, runnable, this.f39468c + this.f39467b.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
