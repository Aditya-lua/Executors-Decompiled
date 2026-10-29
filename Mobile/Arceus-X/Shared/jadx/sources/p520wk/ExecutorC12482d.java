package p520wk;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: wk.d */
/* JADX INFO: loaded from: classes2.dex */
public class ExecutorC12482d implements Executor {

    /* JADX INFO: renamed from: a */
    public final Deque<Runnable> f44611a = new ArrayDeque();

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f44612b;

    /* JADX INFO: renamed from: c */
    public Runnable f44613c;

    /* JADX INFO: renamed from: d */
    public final int f44614d;

    /* JADX INFO: renamed from: wk.d$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f44615a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(Runnable runnable) {
            this.f44615a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f44615a.run();
            } finally {
                ExecutorC12482d.this.m46744c();
            }
        }
    }

    public ExecutorC12482d(Executor executor, int i10) {
        this.f44612b = (ScheduledExecutorService) executor;
        this.f44614d = i10;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m46744c() {
        Runnable runnablePoll = this.f44611a.poll();
        this.f44613c = runnablePoll;
        if (runnablePoll != null) {
            this.f44612b.schedule(runnablePoll, this.f44614d, TimeUnit.MILLISECONDS);
            this.f44611a.clear();
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.f44611a.addFirst(new a(runnable));
        if (this.f44613c == null) {
            m46744c();
        }
    }
}
