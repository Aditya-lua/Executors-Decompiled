package dh;

import ek.q;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a<T> implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AtomicBoolean f14769a = new AtomicBoolean(false);
    public AtomicInteger b = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f14770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ScheduledExecutorService f14771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ScheduledFuture<?> f14772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f14773f;

    public a(String str) {
        this.f14773f = str;
    }

    public abstract void a(T t8);

    public final ScheduledExecutorService b() {
        if (this.f14771d == null) {
            this.f14771d = Executors.newSingleThreadScheduledExecutor();
        }
        return this.f14771d;
    }

    public final synchronized T c() {
        return this.f14770c;
    }

    public final void d(long j10) {
        this.f14772e = b().schedule(this, j10, TimeUnit.MILLISECONDS);
    }

    public synchronized void e(T t8) {
        try {
            if (!this.f14769a.get() && (g() <= 0 || this.b.incrementAndGet() < g())) {
                long jF = f();
                if (jF <= 0) {
                    a(t8);
                    return;
                }
                q.h(this.f14773f, "queue value: " + t8);
                this.f14770c = t8;
                if (this.f14772e == null) {
                    d(jF);
                }
                return;
            }
            ScheduledFuture<?> scheduledFuture = this.f14772e;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f14770c = t8;
            q.h(this.f14773f, "set immediately: " + t8);
            a(t8);
            this.f14769a.set(true);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public abstract long f();

    public abstract int g();

    @Override // java.lang.Runnable
    public synchronized void run() {
        a(c());
        this.f14769a.set(true);
    }
}
