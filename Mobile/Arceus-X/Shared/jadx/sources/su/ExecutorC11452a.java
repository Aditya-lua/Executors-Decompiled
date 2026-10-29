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
import kotlin.jvm.internal.C7729c0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7764d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7345l;
import p256ku.C7842c;
import p256ku.C7922t0;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;
import p395qu.C10719e0;
import p395qu.C10754z;

/* JADX INFO: renamed from: su.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 R2\u00020\u00012\u00020\u0002:\u0003A\u000f B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u00032\n\u0010\u0014\u001a\u00060\u0011R\u00020\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0003H\u0002¢\u0006\u0004\b \u0010!J+\u0010#\u001a\u0004\u0018\u00010\f*\b\u0018\u00010\u0011R\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u000eH\u0002¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\b\u0018\u00010\u0011R\u00020\u0000H\u0002¢\u0006\u0004\b%\u0010\u0013J)\u0010(\u001a\u00020\u00182\n\u0010\u0014\u001a\u00060\u0011R\u00020\u00002\u0006\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u0003¢\u0006\u0004\b(\u0010)J\u0019\u0010*\u001a\u00020\u000e2\n\u0010\u0014\u001a\u00060\u0011R\u00020\u0000¢\u0006\u0004\b*\u0010+J\u001b\u0010/\u001a\u00020\u00182\n\u0010.\u001a\u00060,j\u0002`-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0018H\u0016¢\u0006\u0004\b1\u00102J\u0015\u00104\u001a\u00020\u00182\u0006\u00103\u001a\u00020\u0006¢\u0006\u0004\b4\u0010\u001aJ1\u00108\u001a\u00020\u00182\n\u00105\u001a\u00060,j\u0002`-2\f\b\u0002\u00107\u001a\u00060\u000ej\u0002`62\b\b\u0002\u0010\"\u001a\u00020\u000e¢\u0006\u0004\b8\u00109J%\u0010:\u001a\u00020\f2\n\u00105\u001a\u00060,j\u0002`-2\n\u00107\u001a\u00060\u000ej\u0002`6¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\u0018¢\u0006\u0004\b<\u00102J\u000f\u0010=\u001a\u00020\bH\u0016¢\u0006\u0004\b=\u0010>J\u0015\u0010?\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b?\u0010@R\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010CR\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010DR\u0014\u0010G\u001a\u00020E8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u0010FR\u0014\u0010H\u001a\u00020E8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010FR\u001e\u0010K\u001a\f\u0012\b\u0012\u00060\u0011R\u00020\u00000I8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b8\u0010JR\u0011\u0010L\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bL\u0010\u001fR\u000b\u0010N\u001a\u00020M8\u0002X\u0082\u0004R\u000b\u0010O\u001a\u00020M8\u0002X\u0082\u0004R\u000b\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¨\u0006S"}, m31665d2 = {"Lsu/a;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "", "corePoolSize", "maxPoolSize", "", "idleWorkerKeepAliveNs", "", "schedulerName", "<init>", "(IIJLjava/lang/String;)V", "Lsu/h;", "task", "", "c", "(Lsu/h;)Z", "Lsu/a$c;", "q", "()Lsu/a$c;", "worker", "o", "(Lsu/a$c;)I", "stateSnapshot", "", "w", "(J)V", "state", "F", "(J)Z", "I", "()Z", "d", "()I", "fair", "B", "(Lsu/a$c;Lsu/h;Z)Lsu/h;", "f", "oldIndex", "newIndex", "s", "(Lsu/a$c;II)V", "r", "(Lsu/a$c;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "command", "execute", "(Ljava/lang/Runnable;)V", "close", "()V", "timeout", "v", "block", "Lkotlinx/coroutines/scheduling/TaskContext;", "taskContext", "g", "(Ljava/lang/Runnable;ZZ)V", "e", "(Ljava/lang/Runnable;Z)Lsu/h;", "y", "toString", "()Ljava/lang/String;", "u", "(Lsu/h;)V", "a", "b", "J", "Ljava/lang/String;", "Lsu/d;", "Lsu/d;", "globalCpuQueue", "globalBlockingQueue", "Lqu/z;", "Lqu/z;", "workers", "isTerminated", "Lkotlinx/atomicfu/AtomicLong;", "parkedWorkersStack", "controlState", "Lkotlinx/atomicfu/AtomicBoolean;", "_isTerminated", "h", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class ExecutorC11452a implements Executor, Closeable {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicLongFieldUpdater f40465i = AtomicLongFieldUpdater.newUpdater(ExecutorC11452a.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ AtomicLongFieldUpdater f40466j = AtomicLongFieldUpdater.newUpdater(ExecutorC11452a.class, "controlState$volatile");

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f40467k = AtomicIntegerFieldUpdater.newUpdater(ExecutorC11452a.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final C10719e0 f40468l = new C10719e0("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int corePoolSize;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int maxPoolSize;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final long idleWorkerKeepAliveNs;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String schedulerName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C11455d globalCpuQueue;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final C11455d globalBlockingQueue;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final C10754z<c> workers;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: su.a$b */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f40476a;

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
            f40476a = iArr;
        }
    }

    /* JADX INFO: renamed from: su.a$d */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m31665d2 = {"Lsu/a$d;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED;


        /* JADX INFO: renamed from: g */
        public static final /* synthetic */ InterfaceC10707a f40492g = C10708b.m40805a(m42913a());
    }

    public ExecutorC11452a(int i10, int i11, long j10, @NotNull String str) {
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
            this.globalCpuQueue = new C11455d();
            this.globalBlockingQueue = new C11455d();
            this.workers = new C10754z<>((i10 + 1) * 2);
            this.controlState$volatile = ((long) i10) << 42;
            return;
        }
        throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ boolean m42871H(ExecutorC11452a executorC11452a, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = f40466j.get(executorC11452a);
        }
        return executorC11452a.m42878F(j10);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m42873j(ExecutorC11452a executorC11452a, Runnable runnable, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        executorC11452a.m42884g(runnable, z10, z11);
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [su.a.c.b(su.h):void, su.a.c.p():boolean, su.a.c.p():boolean, su.a.c.r(su.a$d):boolean, su.a.c.s(int):su.h, su.a.c.t():void, su.a.c.t():void, su.a.v(long):void] */
    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ AtomicLongFieldUpdater m42874l() {
        return f40466j;
    }

    /* JADX INFO: renamed from: B */
    public final AbstractRunnableC11459h m42877B(c cVar, AbstractRunnableC11459h abstractRunnableC11459h, boolean z10) {
        d dVar;
        if (cVar == null || (dVar = cVar.state) == d.TERMINATED) {
            return abstractRunnableC11459h;
        }
        if (!abstractRunnableC11459h.taskContext && dVar == d.BLOCKING) {
            return abstractRunnableC11459h;
        }
        cVar.mayHaveLocalTasks = true;
        return cVar.localQueue.m42924a(abstractRunnableC11459h, z10);
    }

    /* JADX INFO: renamed from: F */
    public final boolean m42878F(long state) {
        if (C7764d.m32078c(((int) (2097151 & state)) - ((int) ((state & 4398044413952L) >> 21)), 0) < this.corePoolSize) {
            int iM42881d = m42881d();
            if (iM42881d == 1 && this.corePoolSize > 1) {
                m42881d();
            }
            if (iM42881d > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m42879I() {
        c cVarM42886q;
        do {
            cVarM42886q = m42886q();
            if (cVarM42886q == null) {
                return false;
            }
        } while (!c.f40477i.compareAndSet(cVarM42886q, -1, 0));
        LockSupport.unpark(cVarM42886q);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m42880c(AbstractRunnableC11459h task) {
        return task.taskContext ? this.globalBlockingQueue.m40925a(task) : this.globalCpuQueue.m40925a(task);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        m42890v(10000L);
    }

    /* JADX INFO: renamed from: d */
    public final int m42881d() {
        synchronized (this.workers) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                long j10 = f40466j.get(this);
                int i10 = (int) (j10 & 2097151);
                int iM32078c = C7764d.m32078c(i10 - ((int) ((j10 & 4398044413952L) >> 21)), 0);
                if (iM32078c >= this.corePoolSize) {
                    return 0;
                }
                if (i10 >= this.maxPoolSize) {
                    return 0;
                }
                int i11 = ((int) (m42874l().get(this) & 2097151)) + 1;
                if (i11 <= 0 || this.workers.m40959b(i11) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                c cVar = new c(this, i11);
                this.workers.m40960c(i11, cVar);
                if (i11 != ((int) (2097151 & f40466j.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i12 = iM32078c + 1;
                cVar.start();
                return i12;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final AbstractRunnableC11459h m42882e(@NotNull Runnable block, boolean taskContext) {
        long jMo42914a = C11461j.f40510f.mo42914a();
        if (!(block instanceof AbstractRunnableC11459h)) {
            return C11461j.m42918b(block, jMo42914a, taskContext);
        }
        AbstractRunnableC11459h abstractRunnableC11459h = (AbstractRunnableC11459h) block;
        abstractRunnableC11459h.submissionTime = jMo42914a;
        abstractRunnableC11459h.taskContext = taskContext;
        return abstractRunnableC11459h;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable command) {
        m42873j(this, command, false, false, 6, null);
    }

    /* JADX INFO: renamed from: f */
    public final c m42883f() {
        Thread threadCurrentThread = Thread.currentThread();
        c cVar = threadCurrentThread instanceof c ? (c) threadCurrentThread : null;
        if (cVar == null || !Intrinsics.m31980c(ExecutorC11452a.this, this)) {
            return null;
        }
        return cVar;
    }

    /* JADX INFO: renamed from: g */
    public final void m42884g(@NotNull Runnable block, boolean taskContext, boolean fair) {
        C7842c.m32577a();
        AbstractRunnableC11459h abstractRunnableC11459hM42882e = m42882e(block, taskContext);
        boolean z10 = abstractRunnableC11459hM42882e.taskContext;
        long jAddAndGet = z10 ? f40466j.addAndGet(this, 2097152L) : 0L;
        AbstractRunnableC11459h abstractRunnableC11459hM42877B = m42877B(m42883f(), abstractRunnableC11459hM42882e, fair);
        if (abstractRunnableC11459hM42877B != null && !m42880c(abstractRunnableC11459hM42877B)) {
            throw new RejectedExecutionException(this.schedulerName + " was terminated");
        }
        if (z10) {
            m42891w(jAddAndGet);
        } else {
            m42892y();
        }
    }

    public final boolean isTerminated() {
        return f40467k.get(this) == 1;
    }

    /* JADX INFO: renamed from: o */
    public final int m42885o(c worker) {
        Object nextParkedWorker = worker.getNextParkedWorker();
        while (nextParkedWorker != f40468l) {
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

    /* JADX INFO: renamed from: q */
    public final c m42886q() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f40465i;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            c cVarM40959b = this.workers.m40959b((int) (2097151 & j10));
            if (cVarM40959b == null) {
                return null;
            }
            long j11 = (2097152 + j10) & (-2097152);
            int iM42885o = m42885o(cVarM40959b);
            if (iM42885o >= 0 && f40465i.compareAndSet(this, j10, ((long) iM42885o) | j11)) {
                cVarM40959b.m42907o(f40468l);
                return cVarM40959b;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final boolean m42887r(@NotNull c worker) {
        long j10;
        int indexInArray;
        if (worker.getNextParkedWorker() != f40468l) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f40465i;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            indexInArray = worker.getIndexInArray();
            worker.m42907o(this.workers.m40959b((int) (2097151 & j10)));
        } while (!f40465i.compareAndSet(this, j10, ((2097152 + j10) & (-2097152)) | ((long) indexInArray)));
        return true;
    }

    /* JADX INFO: renamed from: s */
    public final void m42888s(@NotNull c worker, int oldIndex, int newIndex) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f40465i;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            int iM42885o = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (iM42885o == oldIndex) {
                iM42885o = newIndex == 0 ? m42885o(worker) : newIndex;
            }
            if (iM42885o >= 0) {
                if (f40465i.compareAndSet(this, j10, j11 | ((long) iM42885o))) {
                    return;
                }
            }
        }
    }

    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: r10v1, 100 */
    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: r10v1, 98 */
    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: r10v1, 99 */
    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iM40958a = this.workers.m40958a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < iM40958a; i15++) {
            c cVarM40959b = this.workers.m40959b(i15);
            if (cVarM40959b != null) {
                int iM42928i = cVarM40959b.localQueue.m42928i();
                int i16 = b.f40476a[cVarM40959b.state.ordinal()];
                if (i16 == 1) {
                    i12++;
                } else if (i16 == 2) {
                    i11++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iM42928i);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (i16 == 3) {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(iM42928i);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                } else if (i16 == 4) {
                    i13++;
                    if (iM42928i > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(iM42928i);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else {
                    if (i16 != 5) {
                        throw new C7345l();
                    }
                    i14++;
                }
            }
        }
        long j10 = f40466j.get(this);
        return this.schedulerName + '@' + C7922t0.m32909b(this) + "[Pool Size {core = " + this.corePoolSize + ", max = " + this.maxPoolSize + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.globalCpuQueue.m40927c() + ", global blocking queue size = " + this.globalBlockingQueue.m40927c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.corePoolSize - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }

    /* JADX INFO: renamed from: u */
    public final void m42889u(@NotNull AbstractRunnableC11459h task) {
        try {
            task.run();
            C7842c.m32577a();
        } catch (Throwable th2) {
            try {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
            } finally {
                C7842c.m32577a();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX INFO: renamed from: v */
    public final void m42890v(long timeout) throws InterruptedException {
        int i10;
        AbstractRunnableC11459h abstractRunnableC11459hM40928e;
        if (f40467k.compareAndSet(this, 0, 1)) {
            c cVarM42883f = m42883f();
            synchronized (this.workers) {
                i10 = (int) (m42874l().get(this) & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    c cVarM40959b = this.workers.m40959b(i11);
                    Intrinsics.checkNotNull(cVarM40959b);
                    c cVar = cVarM40959b;
                    if (cVar != cVarM42883f) {
                        while (cVar.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(cVar);
                            cVar.join(timeout);
                        }
                        cVar.localQueue.m42929j(this.globalBlockingQueue);
                    }
                    if (i11 == i10) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.globalBlockingQueue.m40926b();
            this.globalCpuQueue.m40926b();
            while (true) {
                if (cVarM42883f == null) {
                    abstractRunnableC11459hM40928e = this.globalCpuQueue.m40928e();
                    if (abstractRunnableC11459hM40928e == null && (abstractRunnableC11459hM40928e = this.globalBlockingQueue.m40928e()) == null) {
                        break;
                    }
                } else {
                    abstractRunnableC11459hM40928e = cVarM42883f.m42898e(true);
                    if (abstractRunnableC11459hM40928e == null) {
                        abstractRunnableC11459hM40928e = this.globalCpuQueue.m40928e();
                        if (abstractRunnableC11459hM40928e == null) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
                m42889u(abstractRunnableC11459hM40928e);
            }
            if (cVarM42883f != null) {
                cVarM42883f.m42910r(d.TERMINATED);
            }
            f40465i.set(this, 0L);
            f40466j.set(this, 0L);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m42891w(long stateSnapshot) {
        if (m42879I() || m42878F(stateSnapshot)) {
            return;
        }
        m42879I();
    }

    /* JADX INFO: renamed from: y */
    public final void m42892y() {
        if (m42879I() || m42871H(this, 0L, 1, null)) {
            return;
        }
        m42879I();
    }

    /* JADX INFO: renamed from: su.a$c */
    @Metadata(m31664d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u000eJ\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u000eJ\u000f\u0010\u001a\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u0017J\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u000eJ\u000f\u0010\u001f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010\u000eJ\u0011\u0010 \u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u0004\u0018\u00010\u00132\u0006\u0010\"\u001a\u00020\tH\u0002¢\u0006\u0004\b#\u0010\u0015J\u0011\u0010$\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b$\u0010!J\u001d\u0010'\u001a\u0004\u0018\u00010\u00132\n\u0010&\u001a\u00060\u0004j\u0002`%H\u0002¢\u0006\u0004\b'\u0010(R*\u0010)\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u00102\u001a\u00020/8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001c\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0013038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00104R\u0016\u00107\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b#\u00106R\u0016\u0010:\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00109R$\u0010<\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0016\u0010B\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u00109R\u0016\u0010C\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010*R\u0016\u0010\u0012\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b>\u0010DR\b\u0010F\u001a\u00020E8\u0006¨\u0006G"}, m31665d2 = {"Lsu/a$c;", "Ljava/lang/Thread;", "<init>", "(Lsu/a;)V", "", "index", "(Lsu/a;I)V", "Lsu/a$d;", "newState", "", "r", "(Lsu/a$d;)Z", "", "run", "()V", "upperBound", "j", "(I)I", "mayHaveLocalTasks", "Lsu/h;", "e", "(Z)Lsu/h;", "p", "()Z", "m", "q", "i", "task", "b", "(Lsu/h;)V", "k", "t", "d", "()Lsu/h;", "scanLocalQueue", "c", "l", "Lkotlinx/coroutines/scheduling/StealingMode;", "stealingMode", "s", "(I)Lsu/h;", "indexInArray", "I", "f", "()I", "n", "(I)V", "Lsu/l;", "a", "Lsu/l;", "localQueue", "Lkotlin/jvm/internal/c0;", "Lkotlin/jvm/internal/c0;", "stolenTask", "Lsu/a$d;", "state", "", "J", "terminationDeadline", "", "nextParkedWorker", "Ljava/lang/Object;", "g", "()Ljava/lang/Object;", "o", "(Ljava/lang/Object;)V", "minDelayUntilStealableTaskNs", "rngState", "Z", "Lkotlinx/atomicfu/AtomicInt;", "workerCtl", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public final class c extends Thread {

        /* JADX INFO: renamed from: i */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f40477i = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl$volatile");

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final C11463l localQueue;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final C7729c0<AbstractRunnableC11459h> stolenTask;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public d state;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public long terminationDeadline;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public long minDelayUntilStealableTaskNs;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public int rngState;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public boolean mayHaveLocalTasks;
        private volatile int indexInArray;

        @Nullable
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public c() {
            setDaemon(true);
            setContextClassLoader(ExecutorC11452a.this.getClass().getClassLoader());
            this.localQueue = new C11463l();
            this.stolenTask = new C7729c0<>();
            this.state = d.DORMANT;
            this.nextParkedWorker = ExecutorC11452a.f40468l;
            int iNanoTime = (int) System.nanoTime();
            this.rngState = iNanoTime == 0 ? 42 : iNanoTime;
        }

        /* JADX INFO: renamed from: b */
        public final void m42895b(AbstractRunnableC11459h task) {
            this.terminationDeadline = 0L;
            if (this.state == d.PARKING) {
                this.state = d.BLOCKING;
            }
            if (!task.taskContext) {
                ExecutorC11452a.this.m42889u(task);
                return;
            }
            if (m42910r(d.BLOCKING)) {
                ExecutorC11452a.this.m42892y();
            }
            ExecutorC11452a.this.m42889u(task);
            ExecutorC11452a.m42874l().addAndGet(ExecutorC11452a.this, -2097152L);
            if (this.state != d.TERMINATED) {
                this.state = d.DORMANT;
            }
        }

        /* JADX INFO: renamed from: c */
        public final AbstractRunnableC11459h m42896c(boolean scanLocalQueue) {
            AbstractRunnableC11459h abstractRunnableC11459hM42904l;
            AbstractRunnableC11459h abstractRunnableC11459hM42904l2;
            if (scanLocalQueue) {
                boolean z10 = m42902j(ExecutorC11452a.this.corePoolSize * 2) == 0;
                if (z10 && (abstractRunnableC11459hM42904l2 = m42904l()) != null) {
                    return abstractRunnableC11459hM42904l2;
                }
                AbstractRunnableC11459h abstractRunnableC11459hM42930k = this.localQueue.m42930k();
                if (abstractRunnableC11459hM42930k != null) {
                    return abstractRunnableC11459hM42930k;
                }
                if (!z10 && (abstractRunnableC11459hM42904l = m42904l()) != null) {
                    return abstractRunnableC11459hM42904l;
                }
            } else {
                AbstractRunnableC11459h abstractRunnableC11459hM42904l3 = m42904l();
                if (abstractRunnableC11459hM42904l3 != null) {
                    return abstractRunnableC11459hM42904l3;
                }
            }
            return m42911s(3);
        }

        /* JADX INFO: renamed from: d */
        public final AbstractRunnableC11459h m42897d() {
            AbstractRunnableC11459h abstractRunnableC11459hM42931l = this.localQueue.m42931l();
            if (abstractRunnableC11459hM42931l != null) {
                return abstractRunnableC11459hM42931l;
            }
            AbstractRunnableC11459h abstractRunnableC11459hM40928e = ExecutorC11452a.this.globalBlockingQueue.m40928e();
            return abstractRunnableC11459hM40928e == null ? m42911s(1) : abstractRunnableC11459hM40928e;
        }

        @Nullable
        /* JADX INFO: renamed from: e */
        public final AbstractRunnableC11459h m42898e(boolean mayHaveLocalTasks) {
            return m42908p() ? m42896c(mayHaveLocalTasks) : m42897d();
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

        /* JADX INFO: renamed from: i */
        public final boolean m42901i() {
            return this.nextParkedWorker != ExecutorC11452a.f40468l;
        }

        /* JADX INFO: renamed from: j */
        public final int m42902j(int upperBound) {
            int i10 = this.rngState;
            int i11 = i10 ^ (i10 << 13);
            int i12 = i11 ^ (i11 >> 17);
            int i13 = i12 ^ (i12 << 5);
            this.rngState = i13;
            int i14 = upperBound - 1;
            return (i14 & upperBound) == 0 ? i13 & i14 : (i13 & Integer.MAX_VALUE) % upperBound;
        }

        /* JADX INFO: renamed from: k */
        public final void m42903k() {
            if (this.terminationDeadline == 0) {
                this.terminationDeadline = System.nanoTime() + ExecutorC11452a.this.idleWorkerKeepAliveNs;
            }
            LockSupport.parkNanos(ExecutorC11452a.this.idleWorkerKeepAliveNs);
            if (System.nanoTime() - this.terminationDeadline >= 0) {
                this.terminationDeadline = 0L;
                m42912t();
            }
        }

        /* JADX INFO: renamed from: l */
        public final AbstractRunnableC11459h m42904l() {
            if (m42902j(2) == 0) {
                AbstractRunnableC11459h abstractRunnableC11459hM40928e = ExecutorC11452a.this.globalCpuQueue.m40928e();
                return abstractRunnableC11459hM40928e != null ? abstractRunnableC11459hM40928e : ExecutorC11452a.this.globalBlockingQueue.m40928e();
            }
            AbstractRunnableC11459h abstractRunnableC11459hM40928e2 = ExecutorC11452a.this.globalBlockingQueue.m40928e();
            return abstractRunnableC11459hM40928e2 != null ? abstractRunnableC11459hM40928e2 : ExecutorC11452a.this.globalCpuQueue.m40928e();
        }

        /* JADX INFO: renamed from: m */
        public final void m42905m() {
            loop0: while (true) {
                boolean z10 = false;
                while (true) {
                    if (ExecutorC11452a.this.isTerminated() || this.state == d.TERMINATED) {
                        break loop0;
                    }
                    AbstractRunnableC11459h abstractRunnableC11459hM42898e = m42898e(this.mayHaveLocalTasks);
                    if (abstractRunnableC11459hM42898e != null) {
                        this.minDelayUntilStealableTaskNs = 0L;
                        m42895b(abstractRunnableC11459hM42898e);
                        break;
                    }
                    this.mayHaveLocalTasks = false;
                    if (this.minDelayUntilStealableTaskNs == 0) {
                        m42909q();
                    } else {
                        if (z10) {
                            m42910r(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.minDelayUntilStealableTaskNs);
                            this.minDelayUntilStealableTaskNs = 0L;
                            break;
                        }
                        z10 = true;
                    }
                }
            }
            m42910r(d.TERMINATED);
        }

        /* JADX INFO: renamed from: n */
        public final void m42906n(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(ExecutorC11452a.this.schedulerName);
            sb2.append("-worker-");
            sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        /* JADX INFO: renamed from: o */
        public final void m42907o(@Nullable Object obj) {
            this.nextParkedWorker = obj;
        }

        /* JADX INFO: renamed from: p */
        public final boolean m42908p() {
            long j10;
            if (this.state == d.CPU_ACQUIRED) {
                return true;
            }
            ExecutorC11452a executorC11452a = ExecutorC11452a.this;
            AtomicLongFieldUpdater atomicLongFieldUpdaterM42874l = ExecutorC11452a.m42874l();
            do {
                j10 = atomicLongFieldUpdaterM42874l.get(executorC11452a);
                if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                    return false;
                }
            } while (!ExecutorC11452a.m42874l().compareAndSet(executorC11452a, j10, j10 - 4398046511104L));
            this.state = d.CPU_ACQUIRED;
            return true;
        }

        /* JADX INFO: renamed from: q */
        public final void m42909q() {
            if (!m42901i()) {
                ExecutorC11452a.this.m42887r(this);
                return;
            }
            f40477i.set(this, -1);
            while (m42901i() && f40477i.get(this) == -1 && !ExecutorC11452a.this.isTerminated() && this.state != d.TERMINATED) {
                m42910r(d.PARKING);
                Thread.interrupted();
                m42903k();
            }
        }

        /* JADX INFO: renamed from: r */
        public final boolean m42910r(@NotNull d newState) {
            d dVar = this.state;
            boolean z10 = dVar == d.CPU_ACQUIRED;
            if (z10) {
                ExecutorC11452a.m42874l().addAndGet(ExecutorC11452a.this, 4398046511104L);
            }
            if (dVar != newState) {
                this.state = newState;
            }
            return z10;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m42905m();
        }

        /* JADX INFO: renamed from: s */
        public final AbstractRunnableC11459h m42911s(int stealingMode) {
            int i10 = (int) (ExecutorC11452a.m42874l().get(ExecutorC11452a.this) & 2097151);
            if (i10 < 2) {
                return null;
            }
            int iM42902j = m42902j(i10);
            ExecutorC11452a executorC11452a = ExecutorC11452a.this;
            long jMin = Long.MAX_VALUE;
            for (int i11 = 0; i11 < i10; i11++) {
                iM42902j++;
                if (iM42902j > i10) {
                    iM42902j = 1;
                }
                c cVarM40959b = executorC11452a.workers.m40959b(iM42902j);
                if (cVarM40959b != null && cVarM40959b != this) {
                    long jM42937r = cVarM40959b.localQueue.m42937r(stealingMode, this.stolenTask);
                    if (jM42937r == -1) {
                        C7729c0<AbstractRunnableC11459h> c7729c0 = this.stolenTask;
                        AbstractRunnableC11459h abstractRunnableC11459h = c7729c0.f29425a;
                        c7729c0.f29425a = null;
                        return abstractRunnableC11459h;
                    }
                    if (jM42937r > 0) {
                        jMin = Math.min(jMin, jM42937r);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.minDelayUntilStealableTaskNs = jMin;
            return null;
        }

        /* JADX INFO: renamed from: t */
        public final void m42912t() {
            ExecutorC11452a executorC11452a = ExecutorC11452a.this;
            synchronized (executorC11452a.workers) {
                try {
                    if (executorC11452a.isTerminated()) {
                        return;
                    }
                    if (((int) (ExecutorC11452a.m42874l().get(executorC11452a) & 2097151)) <= executorC11452a.corePoolSize) {
                        return;
                    }
                    if (f40477i.compareAndSet(this, -1, 1)) {
                        int i10 = this.indexInArray;
                        m42906n(0);
                        executorC11452a.m42888s(this, i10, 0);
                        int andDecrement = (int) (ExecutorC11452a.m42874l().getAndDecrement(executorC11452a) & 2097151);
                        if (andDecrement != i10) {
                            c cVarM40959b = executorC11452a.workers.m40959b(andDecrement);
                            Intrinsics.checkNotNull(cVarM40959b);
                            c cVar = cVarM40959b;
                            executorC11452a.workers.m40960c(i10, cVar);
                            cVar.m42906n(i10);
                            executorC11452a.m42888s(cVar, andDecrement, i10);
                        }
                        executorC11452a.workers.m40960c(andDecrement, null);
                        Unit unit = Unit.f29331a;
                        this.state = d.TERMINATED;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public c(ExecutorC11452a executorC11452a, int i10) {
            this();
            m42906n(i10);
        }
    }
}
