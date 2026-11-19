package qv;

import backtraceio.library.services.BacktraceMetrics;
import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import nv.n;
import nv.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0003\u001e'\"B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010*R\u0016\u0010-\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010,R\u0016\u0010.\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010(R\u0016\u0010/\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010(R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\b008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00101R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\b008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00101R\u0014\u00106\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00105¨\u00067"}, d2 = {"Lqv/d;", BuildConfig.FLAVOR, "Lqv/d$a;", "backend", "Ljava/util/logging/Logger;", "logger", "<init>", "(Lqv/d$a;Ljava/util/logging/Logger;)V", "Lqv/c;", "taskQueue", BuildConfig.FLAVOR, "j", "(Lqv/c;)V", "Lqv/a;", "e", "()Lqv/a;", "k", "()Lqv/c;", "g", "()V", "task", "f", "(Lqv/a;)V", BuildConfig.FLAVOR, "delayNanos", BuildConfig.FLAVOR, "completedNormally", "d", "(Lqv/a;JZ)V", "l", "a", "Lqv/d$a;", "h", "()Lqv/d$a;", "b", "Ljava/util/logging/Logger;", "i", "()Ljava/util/logging/Logger;", BuildConfig.FLAVOR, "c", "I", "nextQueueName", "Z", "coordinatorWaiting", "J", "coordinatorWakeUpAt", "executeCallCount", "runCallCount", BuildConfig.FLAVOR, "Ljava/util/List;", "busyQueues", "readyQueues", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "runnable", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final Logger f30481l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final d f30482m;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final a backend;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Logger logger;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int nextQueueName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean coordinatorWaiting;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public long coordinatorWakeUpAt;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int executeCallCount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int runCallCount;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<qv.c> busyQueues;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<qv.c> readyQueues;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Runnable runnable;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lqv/d$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "c", "()J", "Lqv/d;", "taskRunner", BuildConfig.FLAVOR, "d", "(Lqv/d;)V", "nanos", "f", "(Lqv/d;J)V", "T", "Ljava/util/concurrent/BlockingQueue;", "queue", "e", "(Ljava/util/concurrent/BlockingQueue;)Ljava/util/concurrent/BlockingQueue;", "Ljava/lang/Runnable;", "runnable", "g", "(Lqv/d;Ljava/lang/Runnable;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        long c();

        void d(@NotNull d taskRunner);

        @NotNull
        <T> BlockingQueue<T> e(@NotNull BlockingQueue<T> queue);

        void f(@NotNull d taskRunner, long nanos);

        void g(@NotNull d taskRunner, @NotNull Runnable runnable);
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\b\u0000\u0010\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lqv/d$c;", "Lqv/d$a;", "Ljava/util/concurrent/ThreadFactory;", "threadFactory", "<init>", "(Ljava/util/concurrent/ThreadFactory;)V", BuildConfig.FLAVOR, "c", "()J", "Lqv/d;", "taskRunner", BuildConfig.FLAVOR, "d", "(Lqv/d;)V", "nanos", "f", "(Lqv/d;J)V", "T", "Ljava/util/concurrent/BlockingQueue;", "queue", "e", "(Ljava/util/concurrent/BlockingQueue;)Ljava/util/concurrent/BlockingQueue;", "Ljava/lang/Runnable;", "runnable", "g", "(Lqv/d;Ljava/lang/Runnable;)V", "Ljava/util/concurrent/ThreadPoolExecutor;", "a", "Ljava/util/concurrent/ThreadPoolExecutor;", "getExecutor", "()Ljava/util/concurrent/ThreadPoolExecutor;", "executor", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ThreadPoolExecutor executor;

        public c(@NotNull ThreadFactory threadFactory) {
            Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
            this.executor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // qv.d.a
        public long c() {
            return System.nanoTime();
        }

        @Override // qv.d.a
        public void d(@NotNull d taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // qv.d.a
        @NotNull
        public <T> BlockingQueue<T> e(@NotNull BlockingQueue<T> queue) {
            Intrinsics.checkNotNullParameter(queue, "queue");
            return queue;
        }

        @Override // qv.d.a
        public void f(@NotNull d taskRunner, long nanos) throws InterruptedException {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            if (q.b && !Thread.holdsLock(taskRunner)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + taskRunner);
            }
            if (nanos > 0) {
                long j10 = nanos / 1000000;
                long j11 = nanos - (1000000 * j10);
                if (j10 > 0 || nanos > 0) {
                    taskRunner.wait(j10, (int) j11);
                }
            }
        }

        @Override // qv.d.a
        public void g(@NotNull d taskRunner, @NotNull Runnable runnable) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.executor.execute(runnable);
        }
    }

    /* JADX INFO: renamed from: qv.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"qv/d$d", "Ljava/lang/Runnable;", BuildConfig.FLAVOR, "run", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RunnableC0595d implements Runnable {
        public RunnableC0595d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            qv.a aVarE;
            long jC;
            qv.a aVarE2;
            d dVar = d.this;
            synchronized (dVar) {
                dVar.runCallCount++;
                aVarE = dVar.e();
            }
            if (aVarE == null) {
                return;
            }
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            while (true) {
                try {
                    threadCurrentThread.setName(aVarE.getName());
                    Logger logger = d.this.getLogger();
                    qv.c queue = aVarE.getQueue();
                    Intrinsics.checkNotNull(queue);
                    boolean zIsLoggable = logger.isLoggable(Level.FINE);
                    if (zIsLoggable) {
                        jC = queue.getTaskRunner().getBackend().c();
                        b.c(logger, aVarE, queue, "starting");
                    } else {
                        jC = -1;
                    }
                    try {
                        long jF = aVarE.f();
                        if (zIsLoggable) {
                            b.c(logger, aVarE, queue, "finished run in " + b.b(queue.getTaskRunner().getBackend().c() - jC));
                        }
                        d dVar2 = d.this;
                        synchronized (dVar2) {
                            dVar2.d(aVarE, jF, true);
                            aVarE2 = dVar2.e();
                        }
                        if (aVarE2 == null) {
                            threadCurrentThread.setName(name);
                            return;
                        }
                        aVarE = aVarE2;
                    } catch (Throwable th2) {
                        if (zIsLoggable) {
                            b.c(logger, aVarE, queue, "failed a run in " + b.b(queue.getTaskRunner().getBackend().c() - jC));
                        }
                        throw th2;
                    }
                } catch (Throwable th3) {
                    try {
                        d dVar3 = d.this;
                        synchronized (dVar3) {
                            dVar3.d(aVarE, -1L, false);
                            Unit unit = Unit.f21506a;
                            if (!(th3 instanceof InterruptedException)) {
                                throw th3;
                            }
                            Thread.currentThread().interrupt();
                            threadCurrentThread.setName(name);
                            return;
                        }
                    } catch (Throwable th4) {
                        threadCurrentThread.setName(name);
                        throw th4;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Logger logger = Logger.getLogger(d.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(...)");
        f30481l = logger;
        f30482m = new d(new c(q.p(q.f26640c + " TaskRunner", true)), 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
    }

    public d(@NotNull a backend, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(backend, "backend");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.backend = backend;
        this.logger = logger;
        this.nextQueueName = BacktraceMetrics.defaultTimeBetweenRetriesMs;
        this.busyQueues = new ArrayList();
        this.readyQueues = new ArrayList();
        this.runnable = new RunnableC0595d();
    }

    public final void d(qv.a task, long delayNanos, boolean completedNormally) {
        if (q.b && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        qv.c queue = task.getQueue();
        Intrinsics.checkNotNull(queue);
        if (queue.getActiveTask() != task) {
            throw new IllegalStateException("Check failed.");
        }
        boolean zF = queue.getCancelActiveTask();
        queue.p(false);
        queue.o(null);
        this.busyQueues.remove(queue);
        if (delayNanos != -1 && !zF && !queue.getShutdown()) {
            queue.n(task, delayNanos, true);
        }
        if (queue.g().isEmpty()) {
            return;
        }
        this.readyQueues.add(queue);
        if (completedNormally) {
            return;
        }
        l();
    }

    @Nullable
    public final qv.a e() {
        boolean z10;
        if (q.b && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        while (!this.readyQueues.isEmpty()) {
            long jC = this.backend.c();
            Iterator<qv.c> it = this.readyQueues.iterator();
            long jMin = Long.MAX_VALUE;
            qv.a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                qv.a aVar2 = it.next().g().get(0);
                long jMax = Math.max(0L, aVar2.getNextExecuteNanoTime() - jC);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (aVar != null) {
                        z10 = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            if (aVar != null) {
                f(aVar);
                if (z10 || (!this.coordinatorWaiting && !this.readyQueues.isEmpty())) {
                    l();
                }
                return aVar;
            }
            if (this.coordinatorWaiting) {
                if (jMin < this.coordinatorWakeUpAt - jC) {
                    this.backend.d(this);
                }
                return null;
            }
            this.coordinatorWaiting = true;
            this.coordinatorWakeUpAt = jC + jMin;
            try {
                try {
                    this.backend.f(this, jMin);
                } catch (InterruptedException unused) {
                    g();
                }
                this.coordinatorWaiting = false;
            } catch (Throwable th2) {
                this.coordinatorWaiting = false;
                throw th2;
            }
        }
        return null;
    }

    public final void f(qv.a task) {
        if (q.b && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        task.g(-1L);
        qv.c queue = task.getQueue();
        Intrinsics.checkNotNull(queue);
        queue.g().remove(task);
        this.readyQueues.remove(queue);
        queue.o(task);
        this.busyQueues.add(queue);
    }

    public final void g() {
        if (q.b && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        int size = this.busyQueues.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                this.busyQueues.get(size).b();
            }
        }
        for (int size2 = this.readyQueues.size() - 1; -1 < size2; size2--) {
            qv.c cVar = this.readyQueues.get(size2);
            cVar.b();
            if (cVar.g().isEmpty()) {
                this.readyQueues.remove(size2);
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final a getBackend() {
        return this.backend;
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final Logger getLogger() {
        return this.logger;
    }

    public final void j(@NotNull qv.c taskQueue) {
        Intrinsics.checkNotNullParameter(taskQueue, "taskQueue");
        if (q.b && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (taskQueue.getActiveTask() == null) {
            if (taskQueue.g().isEmpty()) {
                this.readyQueues.remove(taskQueue);
            } else {
                n.a(this.readyQueues, taskQueue);
            }
        }
        if (this.coordinatorWaiting) {
            this.backend.d(this);
        } else {
            l();
        }
    }

    @NotNull
    public final qv.c k() {
        int i10;
        synchronized (this) {
            i10 = this.nextQueueName;
            this.nextQueueName = i10 + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('Q');
        sb2.append(i10);
        return new qv.c(this, sb2.toString());
    }

    public final void l() {
        if (!q.b || Thread.holdsLock(this)) {
            int i10 = this.executeCallCount;
            if (i10 > this.runCallCount) {
                return;
            }
            this.executeCallCount = i10 + 1;
            this.backend.g(this, this.runnable);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    public /* synthetic */ d(a aVar, Logger logger, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i10 & 2) != 0 ? f30481l : logger);
    }
}
