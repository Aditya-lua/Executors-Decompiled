package eh;

import gk.p;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a<T> implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AtomicBoolean f15515a = new AtomicBoolean(false);
    public AtomicInteger b = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f15516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ScheduledExecutorService f15517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ScheduledFuture<?> f15518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f15519f;

    public a(String str) {
        this.f15519f = str;
    }

    public abstract void a(T t8);

    public final ScheduledExecutorService b() {
        if (this.f15517d == null) {
            this.f15517d = Executors.newSingleThreadScheduledExecutor();
        }
        return this.f15517d;
    }

    public final synchronized T c() {
        return this.f15516c;
    }

    public final void d(long j10) {
        this.f15518e = b().schedule(this, j10, TimeUnit.MILLISECONDS);
    }

    public synchronized void e(T t8) {
        try {
            if (!this.f15515a.get() && (g() <= 0 || this.b.incrementAndGet() < g())) {
                long jF = f();
                if (jF <= 0) {
                    a(t8);
                    return;
                }
                p.h(this.f15519f, "queue value: " + t8);
                this.f15516c = t8;
                if (this.f15518e == null) {
                    d(jF);
                }
                return;
            }
            ScheduledFuture<?> scheduledFuture = this.f15518e;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f15516c = t8;
            p.h(this.f15519f, "set immediately: " + t8);
            a(t8);
            this.f15515a.set(true);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public abstract long f();

    public abstract int g();

    @Override // java.lang.Runnable
    public synchronized void run() {
        a(c());
        this.f15515a.set(true);
    }
}
