package p486v7;

import com.android.billingclient.api.C1746b;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: v7.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC12047i0 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final ThreadFactory f42616a;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f42617b;

    public ThreadFactoryC12047i0(C1746b c1746b) {
        Objects.requireNonNull(c1746b);
        this.f42616a = Executors.defaultThreadFactory();
        this.f42617b = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AtomicInteger atomicInteger = this.f42617b;
        Thread threadNewThread = this.f42616a.newThread(runnable);
        threadNewThread.setName("PlayBillingLibrary-" + atomicInteger.getAndIncrement());
        return threadNewThread;
    }
}
