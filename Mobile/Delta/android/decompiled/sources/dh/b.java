package dh;

import ek.q;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b<T> implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f14774a;
    public ScheduledExecutorService b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ScheduledFuture<?> f14775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f14776d;

    public b(String str) {
        this.f14776d = str;
    }

    public abstract void a(T t8);

    public final ScheduledExecutorService b() {
        if (this.b == null) {
            this.b = Executors.newSingleThreadScheduledExecutor();
        }
        return this.b;
    }

    public final synchronized T c() {
        return this.f14774a;
    }

    public final void d(long j10) {
        this.f14775c = b().schedule(this, j10, TimeUnit.MILLISECONDS);
    }

    public void e(T t8, long j10) {
        ScheduledFuture<?> scheduledFuture = this.f14775c;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.f14775c.cancel(true);
        }
        if (j10 <= 0) {
            a(t8);
            return;
        }
        q.h(this.f14776d, "queue value: " + t8);
        this.f14774a = t8;
        d(j10);
    }

    @Override // java.lang.Runnable
    public void run() {
        a(c());
    }
}
