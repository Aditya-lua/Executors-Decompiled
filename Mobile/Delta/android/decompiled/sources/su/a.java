package su;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.c0;
import ku.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qu.e0;
import qu.z;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 R2\u00020\u00012\u00020\u0002:\u0003A\u000f B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u00032\n\u0010\u0014\u001a\u00060\u0011R\u00020\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0003H\u0002¢\u0006\u0004\b \u0010!J+\u0010#\u001a\u0004\u0018\u00010\f*\b\u0018\u00010\u0011R\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u000eH\u0002¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\b\u0018\u00010\u0011R\u00020\u0000H\u0002¢\u0006\u0004\b%\u0010\u0013J)\u0010(\u001a\u00020\u00182\n\u0010\u0014\u001a\u00060\u0011R\u00020\u00002\u0006\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u0003¢\u0006\u0004\b(\u0010)J\u0019\u0010*\u001a\u00020\u000e2\n\u0010\u0014\u001a\u00060\u0011R\u00020\u0000¢\u0006\u0004\b*\u0010+J\u001b\u0010/\u001a\u00020\u00182\n\u0010.\u001a\u00060,j\u0002`-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0018H\u0016¢\u0006\u0004\b1\u00102J\u0015\u00104\u001a\u00020\u00182\u0006\u00103\u001a\u00020\u0006¢\u0006\u0004\b4\u0010\u001aJ1\u00108\u001a\u00020\u00182\n\u00105\u001a\u00060,j\u0002`-2\f\b\u0002\u00107\u001a\u00060\u000ej\u0002`62\b\b\u0002\u0010\"\u001a\u00020\u000e¢\u0006\u0004\b8\u00109J%\u0010:\u001a\u00020\f2\n\u00105\u001a\u00060,j\u0002`-2\n\u00107\u001a\u00060\u000ej\u0002`6¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\u0018¢\u0006\u0004\b<\u00102J\u000f\u0010=\u001a\u00020\bH\u0016¢\u0006\u0004\b=\u0010>J\u0015\u0010?\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b?\u0010@R\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010CR\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010DR\u0014\u0010G\u001a\u00020E8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u0010FR\u0014\u0010H\u001a\u00020E8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010FR\u001e\u0010K\u001a\f\u0012\b\u0012\u00060\u0011R\u00020\u00000I8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b8\u0010JR\u0011\u0010L\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bL\u0010\u001fR\u000b\u0010N\u001a\u00020M8\u0002X\u0082\u0004R\u000b\u0010O\u001a\u00020M8\u0002X\u0082\u0004R\u000b\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¨\u0006S"}, d2 = {"Lsu/a;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "", "corePoolSize", "maxPoolSize", "", "idleWorkerKeepAliveNs", "", "schedulerName", "<init>", "(IIJLjava/lang/String;)V", "Lsu/h;", "task", "", "c", "(Lsu/h;)Z", "Lsu/a$c;", "q", "()Lsu/a$c;", "worker", "o", "(Lsu/a$c;)I", "stateSnapshot", "", "w", "(J)V", "state", "F", "(J)Z", "I", "()Z", "d", "()I", "fair", "B", "(Lsu/a$c;Lsu/h;Z)Lsu/h;", "f", "oldIndex", "newIndex", "s", "(Lsu/a$c;II)V", "r", "(Lsu/a$c;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "command", "execute", "(Ljava/lang/Runnable;)V", "close", "()V", "timeout", "v", "block", "Lkotlinx/coroutines/scheduling/TaskContext;", "taskContext", "g", "(Ljava/lang/Runnable;ZZ)V", "e", "(Ljava/lang/Runnable;Z)Lsu/h;", "y", "toString", "()Ljava/lang/String;", "u", "(Lsu/h;)V", "a", "b", "J", "Ljava/lang/String;", "Lsu/d;", "Lsu/d;", "globalCpuQueue", "globalBlockingQueue", "Lqu/z;", "Lqu/z;", "workers", "isTerminated", "Lkotlinx/atomicfu/AtomicLong;", "parkedWorkersStack", "controlState", "Lkotlinx/atomicfu/AtomicBoolean;", "_isTerminated", "h", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements Executor, Closeable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f31295i = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f31296j = AtomicLongFieldUpdater.newUpdater(a.class, "controlState$volatile");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f31297k = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final e0 f31298l = new e0("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int corePoolSize;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int maxPoolSize;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long idleWorkerKeepAliveNs;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String schedulerName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final su.d globalCpuQueue;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final su.d globalBlockingQueue;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final z<c> workers;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31305a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f31305a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lsu/a$d;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED;


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ qt.a f31319g = qt.b.a(a());
    }

    public a(int i10, int i11, long j10, @NotNull String str) {
        this.corePoolSize = i10;
        this.maxPoolSize = i11;
        this.idleWorkerKeepAliveNs = j10;
        this.schedulerName = str;
        if (i10 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        }
        if (i11 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j10 > 0) {
            this.globalCpuQueue = new su.d();
            this.globalBlockingQueue = new su.d();
            this.workers = new z<>((i10 + 1) * 2);
            this.controlState$volatile = ((long) i10) << 42;
            return;
        }
        throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
    }

    public static /* synthetic */ boolean H(a aVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = f31296j.get(aVar);
        }
        return aVar.F(j10);
    }

    public static /* synthetic */ void j(a aVar, Runnable runnable, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        aVar.g(runnable, z10, z11);
    }

    public static final /* synthetic */ AtomicLongFieldUpdater l() {
        return f31296j;
    }

    public final h B(c cVar, h hVar, boolean z10) {
        d dVar;
        if (cVar == null || (dVar = cVar.state) == d.TERMINATED) {
            return hVar;
        }
        if (!hVar.taskContext && dVar == d.BLOCKING) {
            return hVar;
        }
        cVar.mayHaveLocalTasks = true;
        return cVar.localQueue.a(hVar, z10);
    }

    public final boolean F(long state) {
        if (kotlin.ranges.d.c(((int) (2097151 & state)) - ((int) ((state & 4398044413952L) >> 21)), 0) < this.corePoolSize) {
            int iD = d();
            if (iD == 1 && this.corePoolSize > 1) {
                d();
            }
            if (iD > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean I() {
        c cVarQ;
        do {
            cVarQ = q();
            if (cVarQ == null) {
                return false;
            }
        } while (!c.f31306i.compareAndSet(cVarQ, -1, 0));
        LockSupport.unpark(cVarQ);
        return true;
    }

    public final boolean c(h task) {
        return task.taskContext ? this.globalBlockingQueue.a(task) : this.globalCpuQueue.a(task);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        v(10000L);
    }

    public final int d() {
        synchronized (this.workers) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                long j10 = f31296j.get(this);
                int i10 = (int) (j10 & 2097151);
                int iC = kotlin.ranges.d.c(i10 - ((int) ((j10 & 4398044413952L) >> 21)), 0);
                if (iC >= this.corePoolSize) {
                    return 0;
                }
                if (i10 >= this.maxPoolSize) {
                    return 0;
                }
                int i11 = ((int) (l().get(this) & 2097151)) + 1;
                if (i11 <= 0 || this.workers.b(i11) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                c cVar = new c(this, i11);
                this.workers.c(i11, cVar);
                if (i11 != ((int) (2097151 & f31296j.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i12 = iC + 1;
                cVar.start();
                return i12;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NotNull
    public final h e(@NotNull Runnable block, boolean taskContext) {
        long jA = j.f31335f.a();
        if (!(block instanceof h)) {
            return j.b(block, jA, taskContext);
        }
        h hVar = (h) block;
        hVar.submissionTime = jA;
        hVar.taskContext = taskContext;
        return hVar;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable command) {
        j(this, command, false, false, 6, null);
    }

    public final c f() {
        Thread threadCurrentThread = Thread.currentThread();
        c cVar = threadCurrentThread instanceof c ? (c) threadCurrentThread : null;
        if (cVar == null || !Intrinsics.c(a.this, this)) {
            return null;
        }
        return cVar;
    }

    public final void g(@NotNull Runnable block, boolean taskContext, boolean fair) {
        ku.c.a();
        h hVarE = e(block, taskContext);
        boolean z10 = hVarE.taskContext;
        long jAddAndGet = z10 ? f31296j.addAndGet(this, 2097152L) : 0L;
        h hVarB = B(f(), hVarE, fair);
        if (hVarB != null && !c(hVarB)) {
            throw new RejectedExecutionException(this.schedulerName + " was terminated");
        }
        if (z10) {
            w(jAddAndGet);
        } else {
            y();
        }
    }

    public final boolean isTerminated() {
        return f31297k.get(this) == 1;
    }

    public final int o(c worker) {
        Object nextParkedWorker = worker.getNextParkedWorker();
        while (nextParkedWorker != f31298l) {
            if (nextParkedWorker == null) {
                return 0;
            }
            c cVar = (c) nextParkedWorker;
            int indexInArray = cVar.getIndexInArray();
            if (indexInArray != 0) {
                return indexInArray;
            }
            nextParkedWorker = cVar.getNextParkedWorker();
        }
        return -1;
    }

    public final c q() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f31295i;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            c cVarB = this.workers.b((int) (2097151 & j10));
            if (cVarB == null) {
                return null;
            }
            long j11 = (2097152 + j10) & (-2097152);
            int iO = o(cVarB);
            if (iO >= 0 && f31295i.compareAndSet(this, j10, ((long) iO) | j11)) {
                cVarB.o(f31298l);
                return cVarB;
            }
        }
    }

    public final boolean r(@NotNull c worker) {
        long j10;
        int indexInArray;
        if (worker.getNextParkedWorker() != f31298l) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f31295i;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            indexInArray = worker.getIndexInArray();
            worker.o(this.workers.b((int) (2097151 & j10)));
        } while (!f31295i.compareAndSet(this, j10, ((2097152 + j10) & (-2097152)) | ((long) indexInArray)));
        return true;
    }

    public final void s(@NotNull c worker, int oldIndex, int newIndex) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f31295i;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            int iO = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (iO == oldIndex) {
                iO = newIndex == 0 ? o(worker) : newIndex;
            }
            if (iO >= 0) {
                if (f31295i.compareAndSet(this, j10, j11 | ((long) iO))) {
                    return;
                }
            }
        }
    }

    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iA = this.workers.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < iA; i15++) {
            c cVarB = this.workers.b(i15);
            if (cVarB != null) {
                int i16 = cVarB.localQueue.i();
                int i17 = b.f31305a[cVarB.state.ordinal()];
                if (i17 == 1) {
                    i12++;
                } else if (i17 == 2) {
                    i11++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i16);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (i17 == 3) {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i16);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                } else if (i17 == 4) {
                    i13++;
                    if (i16 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i16);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else {
                    if (i17 != 5) {
                        throw new jt.l();
                    }
                    i14++;
                }
            }
        }
        long j10 = f31296j.get(this);
        return this.schedulerName + '@' + t0.b(this) + "[Pool Size {core = " + this.corePoolSize + ", max = " + this.maxPoolSize + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.globalCpuQueue.c() + ", global blocking queue size = " + this.globalBlockingQueue.c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.corePoolSize - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }

    public final void u(@NotNull h task) {
        try {
            task.run();
            ku.c.a();
        } catch (Throwable th2) {
            try {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
            } finally {
                ku.c.a();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    public final void v(long timeout) throws InterruptedException {
        int i10;
        h hVarE;
        if (f31297k.compareAndSet(this, 0, 1)) {
            c cVarF = f();
            synchronized (this.workers) {
                i10 = (int) (l().get(this) & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    c cVarB = this.workers.b(i11);
                    Intrinsics.checkNotNull(cVarB);
                    c cVar = cVarB;
                    if (cVar != cVarF) {
                        while (cVar.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(cVar);
                            cVar.join(timeout);
                        }
                        cVar.localQueue.j(this.globalBlockingQueue);
                    }
                    if (i11 == i10) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.globalBlockingQueue.b();
            this.globalCpuQueue.b();
            while (true) {
                if (cVarF == null) {
                    hVarE = this.globalCpuQueue.e();
                    if (hVarE == null && (hVarE = this.globalBlockingQueue.e()) == null) {
                        break;
                    }
                } else {
                    hVarE = cVarF.e(true);
                    if (hVarE == null) {
                        hVarE = this.globalCpuQueue.e();
                        if (hVarE == null) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
                u(hVarE);
            }
            if (cVarF != null) {
                cVarF.r(d.TERMINATED);
            }
            f31295i.set(this, 0L);
            f31296j.set(this, 0L);
        }
    }

    public final void w(long stateSnapshot) {
        if (I() || F(stateSnapshot)) {
            return;
        }
        I();
    }

    public final void y() {
        if (I() || H(this, 0L, 1, null)) {
            return;
        }
        I();
    }

    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u000eJ\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u000eJ\u000f\u0010\u001a\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u0017J\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u000eJ\u000f\u0010\u001f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010\u000eJ\u0011\u0010 \u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u0004\u0018\u00010\u00132\u0006\u0010\"\u001a\u00020\tH\u0002¢\u0006\u0004\b#\u0010\u0015J\u0011\u0010$\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b$\u0010!J\u001d\u0010'\u001a\u0004\u0018\u00010\u00132\n\u0010&\u001a\u00060\u0004j\u0002`%H\u0002¢\u0006\u0004\b'\u0010(R*\u0010)\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u00102\u001a\u00020/8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001c\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0013038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00104R\u0016\u00107\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b#\u00106R\u0016\u0010:\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00109R$\u0010<\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0016\u0010B\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u00109R\u0016\u0010C\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010*R\u0016\u0010\u0012\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b>\u0010DR\b\u0010F\u001a\u00020E8\u0006¨\u0006G"}, d2 = {"Lsu/a$c;", "Ljava/lang/Thread;", "<init>", "(Lsu/a;)V", "", "index", "(Lsu/a;I)V", "Lsu/a$d;", "newState", "", "r", "(Lsu/a$d;)Z", "", "run", "()V", "upperBound", "j", "(I)I", "mayHaveLocalTasks", "Lsu/h;", "e", "(Z)Lsu/h;", "p", "()Z", "m", "q", "i", "task", "b", "(Lsu/h;)V", "k", "t", "d", "()Lsu/h;", "scanLocalQueue", "c", "l", "Lkotlinx/coroutines/scheduling/StealingMode;", "stealingMode", "s", "(I)Lsu/h;", "indexInArray", "I", "f", "()I", "n", "(I)V", "Lsu/l;", "a", "Lsu/l;", "localQueue", "Lkotlin/jvm/internal/c0;", "Lkotlin/jvm/internal/c0;", "stolenTask", "Lsu/a$d;", "state", "", "J", "terminationDeadline", "", "nextParkedWorker", "Ljava/lang/Object;", "g", "()Ljava/lang/Object;", "o", "(Ljava/lang/Object;)V", "minDelayUntilStealableTaskNs", "rngState", "Z", "Lkotlinx/atomicfu/AtomicInt;", "workerCtl", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class c extends Thread {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f31306i = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl$volatile");

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final l localQueue;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final c0<h> stolenTask;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public d state;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public long terminationDeadline;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public long minDelayUntilStealableTaskNs;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public int rngState;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public boolean mayHaveLocalTasks;
        private volatile int indexInArray;

        @Nullable
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        public c() {
            setDaemon(true);
            setContextClassLoader(a.this.getClass().getClassLoader());
            this.localQueue = new l();
            this.stolenTask = new c0<>();
            this.state = d.DORMANT;
            this.nextParkedWorker = a.f31298l;
            int iNanoTime = (int) System.nanoTime();
            this.rngState = iNanoTime == 0 ? 42 : iNanoTime;
        }

        public final void b(h task) {
            this.terminationDeadline = 0L;
            if (this.state == d.PARKING) {
                this.state = d.BLOCKING;
            }
            if (!task.taskContext) {
                a.this.u(task);
                return;
            }
            if (r(d.BLOCKING)) {
                a.this.y();
            }
            a.this.u(task);
            a.l().addAndGet(a.this, -2097152L);
            if (this.state != d.TERMINATED) {
                this.state = d.DORMANT;
            }
        }

        public final h c(boolean scanLocalQueue) {
            h hVarL;
            h hVarL2;
            if (scanLocalQueue) {
                boolean z10 = j(a.this.corePoolSize * 2) == 0;
                if (z10 && (hVarL2 = l()) != null) {
                    return hVarL2;
                }
                h hVarK = this.localQueue.k();
                if (hVarK != null) {
                    return hVarK;
                }
                if (!z10 && (hVarL = l()) != null) {
                    return hVarL;
                }
            } else {
                h hVarL3 = l();
                if (hVarL3 != null) {
                    return hVarL3;
                }
            }
            return s(3);
        }

        public final h d() {
            h hVarL = this.localQueue.l();
            if (hVarL != null) {
                return hVarL;
            }
            h hVarE = a.this.globalBlockingQueue.e();
            return hVarE == null ? s(1) : hVarE;
        }

        @Nullable
        public final h e(boolean mayHaveLocalTasks) {
            return p() ? c(mayHaveLocalTasks) : d();
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getIndexInArray() {
            return this.indexInArray;
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final Object getNextParkedWorker() {
            return this.nextParkedWorker;
        }

        public final boolean i() {
            return this.nextParkedWorker != a.f31298l;
        }

        public final int j(int upperBound) {
            int i10 = this.rngState;
            int i11 = i10 ^ (i10 << 13);
            int i12 = i11 ^ (i11 >> 17);
            int i13 = i12 ^ (i12 << 5);
            this.rngState = i13;
            int i14 = upperBound - 1;
            return (i14 & upperBound) == 0 ? i13 & i14 : (i13 & Integer.MAX_VALUE) % upperBound;
        }

        public final void k() {
            if (this.terminationDeadline == 0) {
                this.terminationDeadline = System.nanoTime() + a.this.idleWorkerKeepAliveNs;
            }
            LockSupport.parkNanos(a.this.idleWorkerKeepAliveNs);
            if (System.nanoTime() - this.terminationDeadline >= 0) {
                this.terminationDeadline = 0L;
                t();
            }
        }

        public final h l() {
            if (j(2) == 0) {
                h hVarE = a.this.globalCpuQueue.e();
                return hVarE != null ? hVarE : a.this.globalBlockingQueue.e();
            }
            h hVarE2 = a.this.globalBlockingQueue.e();
            return hVarE2 != null ? hVarE2 : a.this.globalCpuQueue.e();
        }

        public final void m() {
            loop0: while (true) {
                boolean z10 = false;
                while (true) {
                    if (a.this.isTerminated() || this.state == d.TERMINATED) {
                        break loop0;
                    }
                    h hVarE = e(this.mayHaveLocalTasks);
                    if (hVarE != null) {
                        this.minDelayUntilStealableTaskNs = 0L;
                        b(hVarE);
                        break;
                    }
                    this.mayHaveLocalTasks = false;
                    if (this.minDelayUntilStealableTaskNs == 0) {
                        q();
                    } else {
                        if (z10) {
                            r(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.minDelayUntilStealableTaskNs);
                            this.minDelayUntilStealableTaskNs = 0L;
                            break;
                        }
                        z10 = true;
                    }
                }
            }
            r(d.TERMINATED);
        }

        public final void n(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.this.schedulerName);
            sb2.append("-worker-");
            sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        public final void o(@Nullable Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean p() {
            long j10;
            if (this.state == d.CPU_ACQUIRED) {
                return true;
            }
            a aVar = a.this;
            AtomicLongFieldUpdater atomicLongFieldUpdaterL = a.l();
            do {
                j10 = atomicLongFieldUpdaterL.get(aVar);
                if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                    return false;
                }
            } while (!a.l().compareAndSet(aVar, j10, j10 - 4398046511104L));
            this.state = d.CPU_ACQUIRED;
            return true;
        }

        public final void q() {
            if (!i()) {
                a.this.r(this);
                return;
            }
            f31306i.set(this, -1);
            while (i() && f31306i.get(this) == -1 && !a.this.isTerminated() && this.state != d.TERMINATED) {
                r(d.PARKING);
                Thread.interrupted();
                k();
            }
        }

        public final boolean r(@NotNull d newState) {
            d dVar = this.state;
            boolean z10 = dVar == d.CPU_ACQUIRED;
            if (z10) {
                a.l().addAndGet(a.this, 4398046511104L);
            }
            if (dVar != newState) {
                this.state = newState;
            }
            return z10;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m();
        }

        public final h s(int stealingMode) {
            int i10 = (int) (a.l().get(a.this) & 2097151);
            if (i10 < 2) {
                return null;
            }
            int iJ = j(i10);
            a aVar = a.this;
            long jMin = Long.MAX_VALUE;
            for (int i11 = 0; i11 < i10; i11++) {
                iJ++;
                if (iJ > i10) {
                    iJ = 1;
                }
                c cVarB = aVar.workers.b(iJ);
                if (cVarB != null && cVarB != this) {
                    long jR = cVarB.localQueue.r(stealingMode, this.stolenTask);
                    if (jR == -1) {
                        c0<h> c0Var = this.stolenTask;
                        h hVar = c0Var.f22552a;
                        c0Var.f22552a = null;
                        return hVar;
                    }
                    if (jR > 0) {
                        jMin = Math.min(jMin, jR);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.minDelayUntilStealableTaskNs = jMin;
            return null;
        }

        public final void t() {
            a aVar = a.this;
            synchronized (aVar.workers) {
                try {
                    if (aVar.isTerminated()) {
                        return;
                    }
                    if (((int) (a.l().get(aVar) & 2097151)) <= aVar.corePoolSize) {
                        return;
                    }
                    if (f31306i.compareAndSet(this, -1, 1)) {
                        int i10 = this.indexInArray;
                        n(0);
                        aVar.s(this, i10, 0);
                        int andDecrement = (int) (a.l().getAndDecrement(aVar) & 2097151);
                        if (andDecrement != i10) {
                            c cVarB = aVar.workers.b(andDecrement);
                            Intrinsics.checkNotNull(cVarB);
                            c cVar = cVarB;
                            aVar.workers.c(i10, cVar);
                            cVar.n(i10);
                            aVar.s(cVar, andDecrement, i10);
                        }
                        aVar.workers.c(andDecrement, null);
                        Unit unit = Unit.f22483a;
                        this.state = d.TERMINATED;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public c(a aVar, int i10) {
            this();
            n(i10);
        }
    }
}
