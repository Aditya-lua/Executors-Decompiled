package me;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 {

    public class a implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Executor f24071a;
        public final /* synthetic */ me.b b;

        public a(Executor executor, me.b bVar) {
            this.f24071a = executor;
            this.b = bVar;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                this.f24071a.execute(runnable);
            } catch (RejectedExecutionException e10) {
                this.b.E(e10);
            }
        }
    }

    public static class b extends me.c {
        public final ExecutorService b;

        public b(ExecutorService executorService) {
            this.b = (ExecutorService) ge.n.l(executorService);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j10, TimeUnit timeUnit) {
            return this.b.awaitTermination(j10, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.b.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return this.b.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return this.b.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            this.b.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final List<Runnable> shutdownNow() {
            return this.b.shutdownNow();
        }

        public final String toString() {
            String string = super.toString();
            String strValueOf = String.valueOf(this.b);
            StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 2 + strValueOf.length());
            sb2.append(string);
            sb2.append("[");
            sb2.append(strValueOf);
            sb2.append("]");
            return sb2.toString();
        }
    }

    public static final class c extends b implements ScheduledExecutorService, z {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ScheduledExecutorService f24072c;

        public static final class a<V> extends p.a<V> implements y<V> {
            public final ScheduledFuture<?> b;

            public a(x<V> xVar, ScheduledFuture<?> scheduledFuture) {
                super(xVar);
                this.b = scheduledFuture;
            }

            @Override // me.o, java.util.concurrent.Future
            public boolean cancel(boolean z10) {
                boolean zCancel = super.cancel(z10);
                if (zCancel) {
                    this.b.cancel(z10);
                }
                return zCancel;
            }

            @Override // java.lang.Comparable
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int compareTo(Delayed delayed) {
                return this.b.compareTo(delayed);
            }

            @Override // java.util.concurrent.Delayed
            public long getDelay(TimeUnit timeUnit) {
                return this.b.getDelay(timeUnit);
            }
        }

        public static final class b extends me.b.j<Void> implements Runnable {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final Runnable f24073h;

            public b(Runnable runnable) {
                this.f24073h = (Runnable) ge.n.l(runnable);
            }

            @Override // me.b
            public String A() {
                String strValueOf = String.valueOf(this.f24073h);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 7);
                sb2.append("task=[");
                sb2.append(strValueOf);
                sb2.append("]");
                return sb2.toString();
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f24073h.run();
                } catch (Throwable th2) {
                    E(th2);
                    throw ge.u.e(th2);
                }
            }
        }

        public c(ScheduledExecutorService scheduledExecutorService) {
            super(scheduledExecutorService);
            this.f24072c = (ScheduledExecutorService) ge.n.l(scheduledExecutorService);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public y<?> schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
            g0 g0VarM = g0.M(runnable, null);
            return new a(g0VarM, this.f24072c.schedule(g0VarM, j10, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public <V> y<V> schedule(Callable<V> callable, long j10, TimeUnit timeUnit) {
            g0 g0VarN = g0.N(callable);
            return new a(g0VarN, this.f24072c.schedule(g0VarN, j10, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public y<?> scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            b bVar = new b(runnable);
            return new a(bVar, this.f24072c.scheduleAtFixedRate(bVar, j10, j11, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public y<?> scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            b bVar = new b(runnable);
            return new a(bVar, this.f24072c.scheduleWithFixedDelay(bVar, j10, j11, timeUnit));
        }
    }

    public static Executor a() {
        return l.INSTANCE;
    }

    public static z b(ExecutorService executorService) {
        if (executorService instanceof z) {
            return (z) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new c((ScheduledExecutorService) executorService) : new b(executorService);
    }

    public static Executor c(Executor executor, me.b<?> bVar) {
        ge.n.l(executor);
        ge.n.l(bVar);
        return executor == a() ? executor : new a(executor, bVar);
    }
}
