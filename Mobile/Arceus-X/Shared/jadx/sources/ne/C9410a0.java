package ne;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p169he.C6384n;
import p169he.C6391u;

/* JADX INFO: renamed from: ne.a0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9410a0 {

    /* JADX INFO: renamed from: ne.a0$a */
    public class a implements Executor {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Executor f33875a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractC9411b f33876b;

        public a(Executor executor, AbstractC9411b abstractC9411b) {
            this.f33875a = executor;
            this.f33876b = abstractC9411b;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                this.f33875a.execute(runnable);
            } catch (RejectedExecutionException e10) {
                this.f33876b.mo37170E(e10);
            }
        }
    }

    /* JADX INFO: renamed from: ne.a0$b */
    public static class b extends AbstractC9413c {

        /* JADX INFO: renamed from: b */
        public final ExecutorService f33877b;

        public b(ExecutorService executorService) {
            this.f33877b = (ExecutorService) C6384n.m27928l(executorService);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j10, TimeUnit timeUnit) {
            return this.f33877b.awaitTermination(j10, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f33877b.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return this.f33877b.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return this.f33877b.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            this.f33877b.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final List<Runnable> shutdownNow() {
            return this.f33877b.shutdownNow();
        }

        public final String toString() {
            String string = super.toString();
            String strValueOf = String.valueOf(this.f33877b);
            StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 2 + strValueOf.length());
            sb2.append(string);
            sb2.append("[");
            sb2.append(strValueOf);
            sb2.append("]");
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: ne.a0$c */
    public static final class c extends b implements ScheduledExecutorService, InterfaceExecutorServiceC9442z {

        /* JADX INFO: renamed from: c */
        public final ScheduledExecutorService f33878c;

        /* JADX INFO: renamed from: ne.a0$c$a */
        public static final class a<V> extends AbstractC9432p.a<V> implements InterfaceScheduledFutureC9441y<V> {

            /* JADX INFO: renamed from: b */
            public final ScheduledFuture<?> f33879b;

            public a(InterfaceFutureC9440x<V> interfaceFutureC9440x, ScheduledFuture<?> scheduledFuture) {
                super(interfaceFutureC9440x);
                this.f33879b = scheduledFuture;
            }

            @Override // ne.AbstractFutureC9431o, java.util.concurrent.Future
            public boolean cancel(boolean z10) {
                boolean zCancel = super.cancel(z10);
                if (zCancel) {
                    this.f33879b.cancel(z10);
                }
                return zCancel;
            }

            /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
            @Override // java.lang.Comparable
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int compareTo(Delayed delayed) {
                return this.f33879b.compareTo(delayed);
            }

            @Override // java.util.concurrent.Delayed
            public long getDelay(TimeUnit timeUnit) {
                return this.f33879b.getDelay(timeUnit);
            }
        }

        /* JADX INFO: renamed from: ne.a0$c$b */
        public static final class b extends AbstractC9411b.j<Void> implements Runnable {

            /* JADX INFO: renamed from: h */
            public final Runnable f33880h;

            public b(Runnable runnable) {
                this.f33880h = (Runnable) C6384n.m27928l(runnable);
            }

            @Override // ne.AbstractC9411b
            /* JADX INFO: renamed from: A */
            public String mo37138A() {
                String strValueOf = String.valueOf(this.f33880h);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 7);
                sb2.append("task=[");
                sb2.append(strValueOf);
                sb2.append("]");
                return sb2.toString();
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f33880h.run();
                } catch (Throwable th2) {
                    mo37170E(th2);
                    throw C6391u.m27965e(th2);
                }
            }
        }

        public c(ScheduledExecutorService scheduledExecutorService) {
            super(scheduledExecutorService);
            this.f33878c = (ScheduledExecutorService) C6384n.m27928l(scheduledExecutorService);
        }

        /* JADX DEBUG: Method merged with bridge method: schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture; */
        @Override // java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceScheduledFutureC9441y<?> schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
            RunnableFutureC9422g0 runnableFutureC9422g0M37227M = RunnableFutureC9422g0.m37227M(runnable, null);
            return new a(runnableFutureC9422g0M37227M, this.f33878c.schedule(runnableFutureC9422g0M37227M, j10, timeUnit));
        }

        /* JADX DEBUG: Method merged with bridge method: schedule(Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture; */
        @Override // java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public <V> InterfaceScheduledFutureC9441y<V> schedule(Callable<V> callable, long j10, TimeUnit timeUnit) {
            RunnableFutureC9422g0 runnableFutureC9422g0M37228N = RunnableFutureC9422g0.m37228N(callable);
            return new a(runnableFutureC9422g0M37228N, this.f33878c.schedule(runnableFutureC9422g0M37228N, j10, timeUnit));
        }

        /* JADX DEBUG: Method merged with bridge method: scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture; */
        @Override // java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public InterfaceScheduledFutureC9441y<?> scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            b bVar = new b(runnable);
            return new a(bVar, this.f33878c.scheduleAtFixedRate(bVar, j10, j11, timeUnit));
        }

        /* JADX DEBUG: Method merged with bridge method: scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture; */
        @Override // java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public InterfaceScheduledFutureC9441y<?> scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            b bVar = new b(runnable);
            return new a(bVar, this.f33878c.scheduleWithFixedDelay(bVar, j10, j11, timeUnit));
        }
    }

    /* JADX INFO: renamed from: a */
    public static Executor m37145a() {
        return EnumC9428l.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceExecutorServiceC9442z m37146b(ExecutorService executorService) {
        if (executorService instanceof InterfaceExecutorServiceC9442z) {
            return (InterfaceExecutorServiceC9442z) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new c((ScheduledExecutorService) executorService) : new b(executorService);
    }

    /* JADX INFO: renamed from: c */
    public static Executor m37147c(Executor executor, AbstractC9411b<?> abstractC9411b) {
        C6384n.m27928l(executor);
        C6384n.m27928l(abstractC9411b);
        return executor == m37145a() ? executor : new a(executor, abstractC9411b);
    }
}
