package p103eh;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p151gk.C6124q;

/* JADX INFO: renamed from: eh.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractRunnableC5114b<T> implements Runnable {

    /* JADX INFO: renamed from: a */
    public T f19941a;

    /* JADX INFO: renamed from: b */
    public ScheduledExecutorService f19942b;

    /* JADX INFO: renamed from: c */
    public ScheduledFuture<?> f19943c;

    /* JADX INFO: renamed from: d */
    public String f19944d;

    public AbstractRunnableC5114b(String str) {
        this.f19944d = str;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo15264a(T t8);

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService m23868b() {
        if (this.f19942b == null) {
            this.f19942b = Executors.newSingleThreadScheduledExecutor();
        }
        return this.f19942b;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized T m23869c() {
        return this.f19941a;
    }

    /* JADX INFO: renamed from: d */
    public final void m23870d(long j10) {
        this.f19943c = m23868b().schedule(this, j10, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: e */
    public void m23871e(T t8, long j10) {
        ScheduledFuture<?> scheduledFuture = this.f19943c;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.f19943c.cancel(true);
        }
        if (j10 <= 0) {
            mo15264a(t8);
            return;
        }
        C6124q.m27063h(this.f19944d, "queue value: " + t8);
        this.f19941a = t8;
        m23870d(j10);
    }

    @Override // java.lang.Runnable
    public void run() {
        mo15264a(m23869c());
    }
}
