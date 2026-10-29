package su;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.C7729c0;
import mu.C8677l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p563y1.C12996b;

/* JADX INFO: renamed from: su.l */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0017\u001a\u00020\u00162\n\u0010\n\u001a\u00060\bj\u0002`\t2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u001f*\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\"\u0010\u001eJ!\u0010$\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\r¢\u0006\u0004\b$\u0010%J)\u0010&\u001a\u00020\u00162\n\u0010\n\u001a\u00060\bj\u0002`\t2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014¢\u0006\u0004\b&\u0010\u0018J\u000f\u0010'\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b'\u0010\u001eJ\u0015\u0010)\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u0019¢\u0006\u0004\b)\u0010*R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010,R\u0014\u00100\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b1\u0010/R\u0013\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004038\u0002X\u0082\u0004R\u000b\u00106\u001a\u0002058\u0002X\u0082\u0004R\u000b\u00107\u001a\u0002058\u0002X\u0082\u0004R\u000b\u00108\u001a\u0002058\u0002X\u0082\u0004¨\u00069"}, m31665d2 = {"Lsu/l;", "", "<init>", "()V", "Lsu/h;", "task", "b", "(Lsu/h;)Lsu/h;", "", "Lkotlinx/coroutines/scheduling/StealingMode;", "stealingMode", "p", "(I)Lsu/h;", "", "onlyBlocking", "o", "(Z)Lsu/h;", "index", "q", "(IZ)Lsu/h;", "Lkotlin/jvm/internal/c0;", "stolenTaskRef", "", "s", "(ILkotlin/jvm/internal/c0;)J", "Lsu/d;", "queue", "n", "(Lsu/d;)Z", "m", "()Lsu/h;", "", "c", "(Lsu/h;)V", "k", "fair", "a", "(Lsu/h;Z)Lsu/h;", "r", "l", "globalQueue", "j", "(Lsu/d;)V", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "buffer", "e", "()I", "bufferSize", "i", "size", "Lkotlinx/atomicfu/AtomicRef;", "lastScheduledTask", "Lkotlinx/atomicfu/AtomicInt;", "producerIndex", "consumerIndex", "blockingTasksInBuffer", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C11463l {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f40512b = AtomicReferenceFieldUpdater.newUpdater(C11463l.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f40513c = AtomicIntegerFieldUpdater.newUpdater(C11463l.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f40514d = AtomicIntegerFieldUpdater.newUpdater(C11463l.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f40515e = AtomicIntegerFieldUpdater.newUpdater(C11463l.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AtomicReferenceArray<AbstractRunnableC11459h> buffer = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    @Nullable
    /* JADX INFO: renamed from: a */
    public final AbstractRunnableC11459h m42924a(@NotNull AbstractRunnableC11459h task, boolean fair) {
        if (fair) {
            return m42925b(task);
        }
        AbstractRunnableC11459h abstractRunnableC11459h = (AbstractRunnableC11459h) f40512b.getAndSet(this, task);
        if (abstractRunnableC11459h == null) {
            return null;
        }
        return m42925b(abstractRunnableC11459h);
    }

    /* JADX INFO: renamed from: b */
    public final AbstractRunnableC11459h m42925b(AbstractRunnableC11459h task) {
        if (m42927e() == 127) {
            return task;
        }
        if (task.taskContext) {
            f40515e.incrementAndGet(this);
        }
        int i10 = f40513c.get(this) & 127;
        while (this.buffer.get(i10) != null) {
            Thread.yield();
        }
        this.buffer.lazySet(i10, task);
        f40513c.incrementAndGet(this);
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m42926c(AbstractRunnableC11459h abstractRunnableC11459h) {
        if (abstractRunnableC11459h == null || !abstractRunnableC11459h.taskContext) {
            return;
        }
        f40515e.decrementAndGet(this);
    }

    /* JADX INFO: renamed from: e */
    public final int m42927e() {
        return f40513c.get(this) - f40514d.get(this);
    }

    /* JADX INFO: renamed from: i */
    public final int m42928i() {
        return f40512b.get(this) != null ? m42927e() + 1 : m42927e();
    }

    /* JADX INFO: renamed from: j */
    public final void m42929j(@NotNull C11455d globalQueue) {
        AbstractRunnableC11459h abstractRunnableC11459h = (AbstractRunnableC11459h) f40512b.getAndSet(this, null);
        if (abstractRunnableC11459h != null) {
            globalQueue.m40925a(abstractRunnableC11459h);
        }
        while (m42933n(globalQueue)) {
        }
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public final AbstractRunnableC11459h m42930k() {
        AbstractRunnableC11459h abstractRunnableC11459h = (AbstractRunnableC11459h) f40512b.getAndSet(this, null);
        return abstractRunnableC11459h == null ? m42932m() : abstractRunnableC11459h;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public final AbstractRunnableC11459h m42931l() {
        return m42934o(true);
    }

    /* JADX INFO: renamed from: m */
    public final AbstractRunnableC11459h m42932m() {
        AbstractRunnableC11459h andSet;
        while (true) {
            int i10 = f40514d.get(this);
            if (i10 - f40513c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (f40514d.compareAndSet(this, i10, i10 + 1) && (andSet = this.buffer.getAndSet(i11, null)) != null) {
                m42926c(andSet);
                return andSet;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m42933n(C11455d queue) {
        AbstractRunnableC11459h abstractRunnableC11459hM42932m = m42932m();
        if (abstractRunnableC11459hM42932m == null) {
            return false;
        }
        queue.m40925a(abstractRunnableC11459hM42932m);
        return true;
    }

    /* JADX INFO: renamed from: o */
    public final AbstractRunnableC11459h m42934o(boolean onlyBlocking) {
        AbstractRunnableC11459h abstractRunnableC11459h;
        do {
            abstractRunnableC11459h = (AbstractRunnableC11459h) f40512b.get(this);
            if (abstractRunnableC11459h == null || abstractRunnableC11459h.taskContext != onlyBlocking) {
                int i10 = f40514d.get(this);
                int i11 = f40513c.get(this);
                while (i10 != i11) {
                    if (onlyBlocking && f40515e.get(this) == 0) {
                        return null;
                    }
                    i11--;
                    AbstractRunnableC11459h abstractRunnableC11459hM42936q = m42936q(i11, onlyBlocking);
                    if (abstractRunnableC11459hM42936q != null) {
                        return abstractRunnableC11459hM42936q;
                    }
                }
                return null;
            }
        } while (!C12996b.m48310a(f40512b, this, abstractRunnableC11459h, null));
        return abstractRunnableC11459h;
    }

    /* JADX INFO: renamed from: p */
    public final AbstractRunnableC11459h m42935p(int stealingMode) {
        int i10 = f40514d.get(this);
        int i11 = f40513c.get(this);
        boolean z10 = stealingMode == 1;
        while (i10 != i11) {
            if (z10 && f40515e.get(this) == 0) {
                return null;
            }
            int i12 = i10 + 1;
            AbstractRunnableC11459h abstractRunnableC11459hM42936q = m42936q(i10, z10);
            if (abstractRunnableC11459hM42936q != null) {
                return abstractRunnableC11459hM42936q;
            }
            i10 = i12;
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final AbstractRunnableC11459h m42936q(int index, boolean onlyBlocking) {
        int i10 = index & 127;
        AbstractRunnableC11459h abstractRunnableC11459h = this.buffer.get(i10);
        if (abstractRunnableC11459h == null || abstractRunnableC11459h.taskContext != onlyBlocking || !C8677l.m34942a(this.buffer, i10, abstractRunnableC11459h, null)) {
            return null;
        }
        if (onlyBlocking) {
            f40515e.decrementAndGet(this);
        }
        return abstractRunnableC11459h;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public final long m42937r(int stealingMode, @NotNull C7729c0<AbstractRunnableC11459h> stolenTaskRef) {
        AbstractRunnableC11459h abstractRunnableC11459hM42935p;
        T t8;
        AbstractRunnableC11459h abstractRunnableC11459hM42932m;
        if (stealingMode == 3) {
            abstractRunnableC11459hM42932m = m42932m();
        } else {
            abstractRunnableC11459hM42935p = m42935p(stealingMode);
        }
        if (t8 == 0) {
            t8 = abstractRunnableC11459hM42935p;
            t8 = abstractRunnableC11459hM42932m;
            return m42938s(stealingMode, stolenTaskRef);
        }
        t8 = abstractRunnableC11459hM42935p;
        t8 = abstractRunnableC11459hM42932m;
        stolenTaskRef.f29425a = t8;
        return -1L;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object, su.h] */
    /* JADX INFO: renamed from: s */
    public final long m42938s(int stealingMode, C7729c0<AbstractRunnableC11459h> stolenTaskRef) {
        ?? r8;
        do {
            r8 = (AbstractRunnableC11459h) f40512b.get(this);
            if (r8 == 0) {
                return -2L;
            }
            if (((r8.taskContext ? 1 : 2) & stealingMode) == 0) {
                return -2L;
            }
            long jMo42914a = C11461j.f40510f.mo42914a() - r8.submissionTime;
            long j10 = C11461j.f40506b;
            if (jMo42914a < j10) {
                return j10 - jMo42914a;
            }
        } while (!C12996b.m48310a(f40512b, this, r8, null));
        stolenTaskRef.f29425a = r8;
        return -1L;
    }
}
