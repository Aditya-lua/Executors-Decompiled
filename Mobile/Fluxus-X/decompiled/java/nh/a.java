package nh;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import ok.q;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a<T> implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AtomicBoolean f25585a = new AtomicBoolean(false);
    public AtomicInteger b = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f25586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ScheduledExecutorService f25587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ScheduledFuture<?> f25588e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f25589f;

    public a(String str) {
        this.f25589f = str;
    }

    public abstract void a(T t8);

    public final ScheduledExecutorService b() {
        if (this.f25587d == null) {
            this.f25587d = Executors.newSingleThreadScheduledExecutor();
        }
        return this.f25587d;
    }

    public final synchronized T c() {
        return this.f25586c;
    }

    public final void d(long j10) {
        this.f25588e = b().schedule(this, j10, TimeUnit.MILLISECONDS);
    }

    public synchronized void e(T t8) {
        try {
            if (!this.f25585a.get() && (g() <= 0 || this.b.incrementAndGet() < g())) {
                long jF = f();
                if (jF <= 0) {
                    a(t8);
                    return;
                }
                q.h(this.f25589f, "queue value: " + t8);
                this.f25586c = t8;
                if (this.f25588e == null) {
                    d(jF);
                }
                return;
            }
            ScheduledFuture<?> scheduledFuture = this.f25588e;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f25586c = t8;
            q.h(this.f25589f, "set immediately: " + t8);
            a(t8);
            this.f25585a.set(true);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public abstract long f();

    public abstract int g();

    @Override // java.lang.Runnable
    public synchronized void run() {
        a(c());
        this.f25585a.set(true);
    }
}
