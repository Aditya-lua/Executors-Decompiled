package qv;

import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import nv.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010!\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000f¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000f¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0018\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010$\u001a\u0004\b%\u0010 R\"\u0010*\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010&\u001a\u0004\b'\u0010\u001e\"\u0004\b(\u0010)R$\u00101\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R \u00106\u001a\b\u0012\u0004\u0012\u00020\b028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u00103\u001a\u0004\b4\u00105R\"\u00109\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b7\u0010&\u001a\u0004\b7\u0010\u001e\"\u0004\b8\u0010)¨\u0006:"}, d2 = {"Lqv/c;", BuildConfig.FLAVOR, "Lqv/d;", "taskRunner", BuildConfig.FLAVOR, "name", "<init>", "(Lqv/d;Ljava/lang/String;)V", "Lqv/a;", "task", BuildConfig.FLAVOR, "delayNanos", BuildConfig.FLAVOR, "l", "(Lqv/a;J)V", "Lkotlin/Function0;", "block", "k", "(Ljava/lang/String;JLkotlin/jvm/functions/Function0;)V", BuildConfig.FLAVOR, "cancelable", "c", "(Ljava/lang/String;JZLkotlin/jvm/functions/Function0;)V", "recurrence", "n", "(Lqv/a;JZ)Z", "a", "()V", "q", "b", "()Z", "toString", "()Ljava/lang/String;", "Lqv/d;", "j", "()Lqv/d;", "Ljava/lang/String;", "h", "Z", "i", "setShutdown$okhttp", "(Z)V", "shutdown", "d", "Lqv/a;", "e", "()Lqv/a;", "o", "(Lqv/a;)V", "activeTask", BuildConfig.FLAVOR, "Ljava/util/List;", "g", "()Ljava/util/List;", "futureTasks", "f", "p", "cancelActiveTask", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final d taskRunner;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean shutdown;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public qv.a activeTask;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<qv.a> futureTasks;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean cancelActiveTask;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"qv/c$a", "Lqv/a;", BuildConfig.FLAVOR, "f", "()J", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends qv.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f30478e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, boolean z10, Function0<Unit> function0) {
            super(str, z10);
            this.f30478e = function0;
        }

        @Override // qv.a
        public long f() {
            this.f30478e.invoke();
            return -1L;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"qv/c$b", "Lqv/a;", BuildConfig.FLAVOR, "f", "()J", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends qv.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Function0<Long> f30479e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Function0<Long> function0) {
            super(str, false, 2, null);
            this.f30479e = function0;
        }

        @Override // qv.a
        public long f() {
            return this.f30479e.invoke().longValue();
        }
    }

    public c(@NotNull d taskRunner, @NotNull String name) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(name, "name");
        this.taskRunner = taskRunner;
        this.name = name;
        this.futureTasks = new ArrayList();
    }

    public static /* synthetic */ void d(c cVar, String str, long j10, boolean z10, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        long j11 = j10;
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        cVar.c(str, j11, z10, function0);
    }

    public static /* synthetic */ void m(c cVar, qv.a aVar, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        cVar.l(aVar, j10);
    }

    public final void a() {
        d dVar = this.taskRunner;
        if (q.b && Thread.holdsLock(dVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + dVar);
        }
        synchronized (this.taskRunner) {
            try {
                if (b()) {
                    this.taskRunner.j(this);
                }
                Unit unit = Unit.f21506a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        qv.a aVar = this.activeTask;
        if (aVar != null) {
            Intrinsics.checkNotNull(aVar);
            if (aVar.getCancelable()) {
                this.cancelActiveTask = true;
            }
        }
        boolean z10 = false;
        for (int size = this.futureTasks.size() - 1; -1 < size; size--) {
            if (this.futureTasks.get(size).getCancelable()) {
                Logger logger = this.taskRunner.getLogger();
                qv.a aVar2 = this.futureTasks.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    qv.b.c(logger, aVar2, this, "canceled");
                }
                this.futureTasks.remove(size);
                z10 = true;
            }
        }
        return z10;
    }

    public final void c(@NotNull String name, long delayNanos, boolean cancelable, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block, "block");
        l(new a(name, cancelable, block), delayNanos);
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final qv.a getActiveTask() {
        return this.activeTask;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getCancelActiveTask() {
        return this.cancelActiveTask;
    }

    @NotNull
    public final List<qv.a> g() {
        return this.futureTasks;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getShutdown() {
        return this.shutdown;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final d getTaskRunner() {
        return this.taskRunner;
    }

    public final void k(@NotNull String name, long delayNanos, @NotNull Function0<Long> block) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block, "block");
        l(new b(name, block), delayNanos);
    }

    public final void l(@NotNull qv.a task, long delayNanos) {
        Intrinsics.checkNotNullParameter(task, "task");
        synchronized (this.taskRunner) {
            if (!this.shutdown) {
                if (n(task, delayNanos, false)) {
                    this.taskRunner.j(this);
                }
                Unit unit = Unit.f21506a;
            } else if (task.getCancelable()) {
                Logger logger = this.taskRunner.getLogger();
                if (logger.isLoggable(Level.FINE)) {
                    qv.b.c(logger, task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                Logger logger2 = this.taskRunner.getLogger();
                if (logger2.isLoggable(Level.FINE)) {
                    qv.b.c(logger2, task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean n(@NotNull qv.a task, long delayNanos, boolean recurrence) {
        String str;
        Intrinsics.checkNotNullParameter(task, "task");
        task.e(this);
        long jC = this.taskRunner.getBackend().c();
        long j10 = jC + delayNanos;
        int iIndexOf = this.futureTasks.indexOf(task);
        if (iIndexOf != -1) {
            if (task.getNextExecuteNanoTime() <= j10) {
                Logger logger = this.taskRunner.getLogger();
                if (logger.isLoggable(Level.FINE)) {
                    qv.b.c(logger, task, this, "already scheduled");
                }
                return false;
            }
            this.futureTasks.remove(iIndexOf);
        }
        task.g(j10);
        Logger logger2 = this.taskRunner.getLogger();
        if (logger2.isLoggable(Level.FINE)) {
            if (recurrence) {
                str = "run again after " + qv.b.b(j10 - jC);
            } else {
                str = "scheduled after " + qv.b.b(j10 - jC);
            }
            qv.b.c(logger2, task, this, str);
        }
        Iterator<qv.a> it = this.futureTasks.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (it.next().getNextExecuteNanoTime() - jC > delayNanos) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.futureTasks.size();
        }
        this.futureTasks.add(size, task);
        return size == 0;
    }

    public final void o(@Nullable qv.a aVar) {
        this.activeTask = aVar;
    }

    public final void p(boolean z10) {
        this.cancelActiveTask = z10;
    }

    public final void q() {
        d dVar = this.taskRunner;
        if (q.b && Thread.holdsLock(dVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + dVar);
        }
        synchronized (this.taskRunner) {
            try {
                this.shutdown = true;
                if (b()) {
                    this.taskRunner.j(this);
                }
                Unit unit = Unit.f21506a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NotNull
    public String toString() {
        return this.name;
    }
}
