package uk;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class d implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Deque<Runnable> f33085a = new ArrayDeque();
    public final ScheduledExecutorService b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Runnable f33086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f33087d;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f33088a;

        public a(Runnable runnable) {
            this.f33088a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f33088a.run();
            } finally {
                d.this.c();
            }
        }
    }

    public d(Executor executor, int i10) {
        this.b = (ScheduledExecutorService) executor;
        this.f33087d = i10;
    }

    public final synchronized void c() {
        Runnable runnablePoll = this.f33085a.poll();
        this.f33086c = runnablePoll;
        if (runnablePoll != null) {
            this.b.schedule(runnablePoll, this.f33087d, TimeUnit.MILLISECONDS);
            this.f33085a.clear();
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.f33085a.addFirst(new a(runnable));
        if (this.f33086c == null) {
            c();
        }
    }
}
