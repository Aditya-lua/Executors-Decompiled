package su;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0017\u001a\u00020\u00162\n\u0010\n\u001a\u00060\bj\u0002`\t2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u001f*\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\"\u0010\u001eJ!\u0010$\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\r¢\u0006\u0004\b$\u0010%J)\u0010&\u001a\u00020\u00162\n\u0010\n\u001a\u00060\bj\u0002`\t2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014¢\u0006\u0004\b&\u0010\u0018J\u000f\u0010'\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b'\u0010\u001eJ\u0015\u0010)\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u0019¢\u0006\u0004\b)\u0010*R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010,R\u0014\u00100\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b1\u0010/R\u0013\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004038\u0002X\u0082\u0004R\u000b\u00106\u001a\u0002058\u0002X\u0082\u0004R\u000b\u00107\u001a\u0002058\u0002X\u0082\u0004R\u000b\u00108\u001a\u0002058\u0002X\u0082\u0004¨\u00069"}, d2 = {"Lsu/l;", "", "<init>", "()V", "Lsu/h;", "task", "b", "(Lsu/h;)Lsu/h;", "", "Lkotlinx/coroutines/scheduling/StealingMode;", "stealingMode", "p", "(I)Lsu/h;", "", "onlyBlocking", "o", "(Z)Lsu/h;", "index", "q", "(IZ)Lsu/h;", "Lkotlin/jvm/internal/c0;", "stolenTaskRef", "", "s", "(ILkotlin/jvm/internal/c0;)J", "Lsu/d;", "queue", "n", "(Lsu/d;)Z", "m", "()Lsu/h;", "", "c", "(Lsu/h;)V", "k", "fair", "a", "(Lsu/h;Z)Lsu/h;", "r", "l", "globalQueue", "j", "(Lsu/d;)V", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "buffer", "e", "()I", "bufferSize", "i", "size", "Lkotlinx/atomicfu/AtomicRef;", "lastScheduledTask", "Lkotlinx/atomicfu/AtomicInt;", "producerIndex", "consumerIndex", "blockingTasksInBuffer", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f31337c = AtomicIntegerFieldUpdater.newUpdater(l.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f31338d = AtomicIntegerFieldUpdater.newUpdater(l.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f31339e = AtomicIntegerFieldUpdater.newUpdater(l.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AtomicReferenceArray<h> buffer = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    @Nullable
    public final h a(@NotNull h task, boolean fair) {
        if (fair) {
            return b(task);
        }
        h hVar = (h) b.getAndSet(this, task);
        if (hVar == null) {
            return null;
        }
        return b(hVar);
    }

    public final h b(h task) {
        if (e() == 127) {
            return task;
        }
        if (task.taskContext) {
            f31339e.incrementAndGet(this);
        }
        int i10 = f31337c.get(this) & 127;
        while (this.buffer.get(i10) != null) {
            Thread.yield();
        }
        this.buffer.lazySet(i10, task);
        f31337c.incrementAndGet(this);
        return null;
    }

    public final void c(h hVar) {
        if (hVar == null || !hVar.taskContext) {
            return;
        }
        f31339e.decrementAndGet(this);
    }

    public final int e() {
        return f31337c.get(this) - f31338d.get(this);
    }

    public final int i() {
        return b.get(this) != null ? e() + 1 : e();
    }

    public final void j(@NotNull d globalQueue) {
        h hVar = (h) b.getAndSet(this, null);
        if (hVar != null) {
            globalQueue.a(hVar);
        }
        while (n(globalQueue)) {
        }
    }

    @Nullable
    public final h k() {
        h hVar = (h) b.getAndSet(this, null);
        return hVar == null ? m() : hVar;
    }

    @Nullable
    public final h l() {
        return o(true);
    }

    public final h m() {
        h andSet;
        while (true) {
            int i10 = f31338d.get(this);
            if (i10 - f31337c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (f31338d.compareAndSet(this, i10, i10 + 1) && (andSet = this.buffer.getAndSet(i11, null)) != null) {
                c(andSet);
                return andSet;
            }
        }
    }

    public final boolean n(d queue) {
        h hVarM = m();
        if (hVarM == null) {
            return false;
        }
        queue.a(hVarM);
        return true;
    }

    public final h o(boolean onlyBlocking) {
        h hVar;
        do {
            hVar = (h) b.get(this);
            if (hVar == null || hVar.taskContext != onlyBlocking) {
                int i10 = f31338d.get(this);
                int i11 = f31337c.get(this);
                while (i10 != i11) {
                    if (onlyBlocking && f31339e.get(this) == 0) {
                        return null;
                    }
                    i11--;
                    h hVarQ = q(i11, onlyBlocking);
                    if (hVarQ != null) {
                        return hVarQ;
                    }
                }
                return null;
            }
        } while (!y1.b.a(b, this, hVar, null));
        return hVar;
    }

    public final h p(int stealingMode) {
        int i10 = f31338d.get(this);
        int i11 = f31337c.get(this);
        boolean z10 = stealingMode == 1;
        while (i10 != i11) {
            if (z10 && f31339e.get(this) == 0) {
                return null;
            }
            int i12 = i10 + 1;
            h hVarQ = q(i10, z10);
            if (hVarQ != null) {
                return hVarQ;
            }
            i10 = i12;
        }
        return null;
    }

    public final h q(int index, boolean onlyBlocking) {
        int i10 = index & 127;
        h hVar = this.buffer.get(i10);
        if (hVar == null || hVar.taskContext != onlyBlocking || !mu.l.a(this.buffer, i10, hVar, null)) {
            return null;
        }
        if (onlyBlocking) {
            f31339e.decrementAndGet(this);
        }
        return hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long r(int stealingMode, @NotNull c0<h> stolenTaskRef) {
        h hVarP;
        T t8;
        h hVarM;
        if (stealingMode == 3) {
            hVarM = m();
        } else {
            hVarP = p(stealingMode);
        }
        if (t8 == 0) {
            t8 = hVarP;
            t8 = hVarM;
            return s(stealingMode, stolenTaskRef);
        }
        t8 = hVarP;
        t8 = hVarM;
        stolenTaskRef.f22552a = t8;
        return -1L;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object, su.h] */
    public final long s(int stealingMode, c0<h> stolenTaskRef) {
        ?? r8;
        do {
            r8 = (h) b.get(this);
            if (r8 == 0) {
                return -2L;
            }
            if (((r8.taskContext ? 1 : 2) & stealingMode) == 0) {
                return -2L;
            }
            long jA = j.f31335f.a() - r8.submissionTime;
            long j10 = j.b;
            if (jA < j10) {
                return j10 - jA;
            }
        } while (!y1.b.a(b, this, r8, null));
        stolenTaskRef.f22552a = r8;
        return -1L;
    }
}
