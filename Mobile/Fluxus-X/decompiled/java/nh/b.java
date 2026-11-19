package nh;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import ok.q;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b<T> implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f25590a;
    public ScheduledExecutorService b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ScheduledFuture<?> f25591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f25592d;

    public b(String str) {
        this.f25592d = str;
    }

    public abstract void a(T t8);

    public final ScheduledExecutorService b() {
        if (this.b == null) {
            this.b = Executors.newSingleThreadScheduledExecutor();
        }
        return this.b;
    }

    public final synchronized T c() {
        return this.f25590a;
    }

    public final void d(long j10) {
        this.f25591c = b().schedule(this, j10, TimeUnit.MILLISECONDS);
    }

    public void e(T t8, long j10) {
        ScheduledFuture<?> scheduledFuture = this.f25591c;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.f25591c.cancel(true);
        }
        if (j10 <= 0) {
            a(t8);
            return;
        }
        q.h(this.f25592d, "queue value: " + t8);
        this.f25590a = t8;
        d(j10);
    }

    @Override // java.lang.Runnable
    public void run() {
        a(c());
    }
}
