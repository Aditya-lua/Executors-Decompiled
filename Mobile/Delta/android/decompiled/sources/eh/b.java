package eh;

import gk.p;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b<T> implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f15520a;
    public ScheduledExecutorService b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ScheduledFuture<?> f15521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f15522d;

    public b(String str) {
        this.f15522d = str;
    }

    public abstract void a(T t8);

    public final ScheduledExecutorService b() {
        if (this.b == null) {
            this.b = Executors.newSingleThreadScheduledExecutor();
        }
        return this.b;
    }

    public final synchronized T c() {
        return this.f15520a;
    }

    public final void d(long j10) {
        this.f15521c = b().schedule(this, j10, TimeUnit.MILLISECONDS);
    }

    public void e(T t8, long j10) {
        ScheduledFuture<?> scheduledFuture = this.f15521c;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.f15521c.cancel(true);
        }
        if (j10 <= 0) {
            a(t8);
            return;
        }
        p.h(this.f15522d, "queue value: " + t8);
        this.f15520a = t8;
        d(j10);
    }

    @Override // java.lang.Runnable
    public void run() {
        a(c());
    }
}
