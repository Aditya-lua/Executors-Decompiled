package dl;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class d implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Deque<Runnable> f12504a = new ArrayDeque();
    public final ScheduledExecutorService b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Runnable f12505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12506d;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f12507a;

        public a(Runnable runnable) {
            this.f12507a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f12507a.run();
            } finally {
                d.this.c();
            }
        }
    }

    public d(Executor executor, int i10) {
        this.b = (ScheduledExecutorService) executor;
        this.f12506d = i10;
    }

    public final synchronized void c() {
        Runnable runnablePoll = this.f12504a.poll();
        this.f12505c = runnablePoll;
        if (runnablePoll != null) {
            this.b.schedule(runnablePoll, this.f12506d, TimeUnit.MILLISECONDS);
            this.f12504a.clear();
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.f12504a.addFirst(new a(runnable));
        if (this.f12505c == null) {
            c();
        }
    }
}
