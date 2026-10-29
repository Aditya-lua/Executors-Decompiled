package wk;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class d implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Deque<Runnable> f34409a = new ArrayDeque();
    public final ScheduledExecutorService b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Runnable f34410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f34411d;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f34412a;

        public a(Runnable runnable) {
            this.f34412a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f34412a.run();
            } finally {
                d.this.c();
            }
        }
    }

    public d(Executor executor, int i10) {
        this.b = (ScheduledExecutorService) executor;
        this.f34411d = i10;
    }

    public final synchronized void c() {
        Runnable runnablePoll = this.f34409a.poll();
        this.f34410c = runnablePoll;
        if (runnablePoll != null) {
            this.b.schedule(runnablePoll, this.f34411d, TimeUnit.MILLISECONDS);
            this.f34409a.clear();
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.f34409a.addFirst(new a(runnable));
        if (this.f34410c == null) {
            c();
        }
    }
}
