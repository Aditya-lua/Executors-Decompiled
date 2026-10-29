package p103eh;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p151gk.C6124q;

/* JADX INFO: renamed from: eh.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractRunnableC5113a<T> implements Runnable {

    /* JADX INFO: renamed from: a */
    public AtomicBoolean f19935a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public AtomicInteger f19936b = new AtomicInteger(0);

    /* JADX INFO: renamed from: c */
    public T f19937c;

    /* JADX INFO: renamed from: d */
    public ScheduledExecutorService f19938d;

    /* JADX INFO: renamed from: e */
    public ScheduledFuture<?> f19939e;

    /* JADX INFO: renamed from: f */
    public String f19940f;

    public AbstractRunnableC5113a(String str) {
        this.f19940f = str;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo23861a(T t8);

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService m23862b() {
        if (this.f19938d == null) {
            this.f19938d = Executors.newSingleThreadScheduledExecutor();
        }
        return this.f19938d;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized T m23863c() {
        return this.f19937c;
    }

    /* JADX INFO: renamed from: d */
    public final void m23864d(long j10) {
        this.f19939e = m23862b().schedule(this, j10, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m23865e(T t8) {
        try {
            if (!this.f19935a.get() && (mo23867g() <= 0 || this.f19936b.incrementAndGet() < mo23867g())) {
                long jMo23866f = mo23866f();
                if (jMo23866f <= 0) {
                    mo23861a(t8);
                    return;
                }
                C6124q.m27063h(this.f19940f, "queue value: " + t8);
                this.f19937c = t8;
                if (this.f19939e == null) {
                    m23864d(jMo23866f);
                }
                return;
            }
            ScheduledFuture<?> scheduledFuture = this.f19939e;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f19937c = t8;
            C6124q.m27063h(this.f19940f, "set immediately: " + t8);
            mo23861a(t8);
            this.f19935a.set(true);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract long mo23866f();

    /* JADX INFO: renamed from: g */
    public abstract int mo23867g();

    @Override // java.lang.Runnable
    public synchronized void run() {
        mo23861a(m23863c());
        this.f19935a.set(true);
    }
}
