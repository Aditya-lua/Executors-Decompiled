package av;

import com.github.luben.zstd.BuildConfig;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.coroutines.CoroutineContext;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u00002\u00020\u00012\u00020\u0002:\u0004@AB0B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u0004J%\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00132\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\"\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u00132\n\u0010 \u001a\u00060\u0005j\u0002`\u0006H\u0004¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0013H\u0016¢\u0006\u0004\b$\u0010%J!\u0010(\u001a\u00020\r2\u0006\u0010'\u001a\u00020&2\n\u0010 \u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b(\u0010)J\u001b\u0010*\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016¢\u0006\u0004\b*\u0010+J\u001d\u0010,\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\rH\u0004¢\u0006\u0004\b.\u0010\u0004R$\u00104\u001a\u00020\b2\u0006\u0010/\u001a\u00020\b8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0014\u00106\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b5\u00101R\u0014\u00108\u001a\u00020\u00138TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b7\u0010%R\u0013\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010:098\u0002X\u0082\u0004R\u0013\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010<098\u0002X\u0082\u0004R\u000b\u0010?\u001a\u00020>8\u0002X\u0082\u0004¨\u0006C"}, d2 = {"Lav/n1;", "Lav/o1;", "Lav/y0;", "<init>", "()V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "task", BuildConfig.FLAVOR, "M0", "(Ljava/lang/Runnable;)Z", "G0", "()Ljava/lang/Runnable;", BuildConfig.FLAVOR, "K0", "F0", "Lav/n1$c;", "Y0", "(Lav/n1$c;)Z", BuildConfig.FLAVOR, "now", "delayedTask", BuildConfig.FLAVOR, "V0", "(JLav/n1$c;)I", "S0", "shutdown", "timeMillis", "Lav/n;", "continuation", "A", "(JLav/n;)V", "block", "Lav/i1;", "W0", "(JLjava/lang/Runnable;)Lav/i1;", "n0", "()J", "Lkotlin/coroutines/CoroutineContext;", "context", "I", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "I0", "(Ljava/lang/Runnable;)V", "U0", "(JLav/n1$c;)V", "T0", "value", "d", "()Z", "X0", "(Z)V", "isCompleted", "R0", "isEmpty", "e0", "nextTime", "Lkotlinx/atomicfu/AtomicRef;", BuildConfig.FLAVOR, "_queue", "Lav/n1$d;", "_delayed", "Lkotlinx/atomicfu/AtomicBoolean;", "_isCompleted", "c", "a", "b", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class n1 extends o1 implements y0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3457f = AtomicReferenceFieldUpdater.newUpdater(n1.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3458g = AtomicReferenceFieldUpdater.newUpdater(n1.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3459h = AtomicIntegerFieldUpdater.newUpdater(n1.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lav/n1$a;", "Lav/n1$c;", BuildConfig.FLAVOR, "nanoTime", "Lav/n;", BuildConfig.FLAVOR, "cont", "<init>", "(Lav/n1;JLav/n;)V", "run", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "c", "Lav/n;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final n<Unit> cont;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull long j10, n<? super Unit> nVar) {
            super(j10);
            this.cont = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.cont.D(n1.this, Unit.f21506a);
        }

        @Override // av.n1.c
        @NotNull
        public String toString() {
            return super.toString() + this.cont;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lav/n1$b;", "Lav/n1$c;", BuildConfig.FLAVOR, "nanoTime", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "<init>", "(JLjava/lang/Runnable;)V", BuildConfig.FLAVOR, "run", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "c", "Ljava/lang/Runnable;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Runnable block;

        public b(long j10, @NotNull Runnable runnable) {
            super(j10);
            this.block = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.block.run();
        }

        @Override // av.n1.c
        @NotNull
        public String toString() {
            return super.toString() + this.block;
        }
    }

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u00052\u00060\u0006j\u0002`\u0007B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010)\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R0\u0010/\u001a\b\u0012\u0002\b\u0003\u0018\u00010*2\f\u0010+\u001a\b\u0012\u0002\b\u0003\u0018\u00010*8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b#\u0010,\"\u0004\b-\u0010.¨\u00060"}, d2 = {"Lav/n1$c;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", BuildConfig.FLAVOR, "Lav/i1;", "Lgv/q0;", BuildConfig.FLAVOR, "Lkotlinx/coroutines/internal/SynchronizedObject;", BuildConfig.FLAVOR, "nanoTime", "<init>", "(J)V", "other", BuildConfig.FLAVOR, "e", "(Lav/n1$c;)I", "now", BuildConfig.FLAVOR, "k", "(J)Z", "Lav/n1$d;", "delayed", "Lav/n1;", "eventLoop", "h", "(JLav/n1$d;Lav/n1;)I", BuildConfig.FLAVOR, "a", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "J", "_heap", "Ljava/lang/Object;", "b", "I", "getIndex", "()I", "setIndex", "(I)V", "index", "Lgv/p0;", "value", "()Lgv/p0;", "d", "(Lgv/p0;)V", "heap", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class c implements Runnable, Comparable<c>, i1, gv.q0 {

        @Nullable
        private volatile Object _heap;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public long nanoTime;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int index = -1;

        public c(long j10) {
            this.nanoTime = j10;
        }

        @Override // av.i1
        public final void a() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    if (obj == q1.f3473a) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        dVar.h(this);
                    }
                    this._heap = q1.f3473a;
                    Unit unit = Unit.f21506a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // gv.q0
        @Nullable
        public gv.p0<?> b() {
            Object obj = this._heap;
            if (obj instanceof gv.p0) {
                return (gv.p0) obj;
            }
            return null;
        }

        @Override // gv.q0
        public void d(@Nullable gv.p0<?> p0Var) {
            if (this._heap == q1.f3473a) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = p0Var;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compareTo(@NotNull c other) {
            long j10 = this.nanoTime - other.nanoTime;
            if (j10 > 0) {
                return 1;
            }
            return j10 < 0 ? -1 : 0;
        }

        @Override // gv.q0
        public int getIndex() {
            return this.index;
        }

        public final int h(long now, @NotNull d delayed, @NotNull n1 eventLoop) {
            synchronized (this) {
                if (this._heap == q1.f3473a) {
                    return 2;
                }
                synchronized (delayed) {
                    try {
                        c cVarB = delayed.b();
                        if (eventLoop.d()) {
                            return 1;
                        }
                        if (cVarB == null) {
                            delayed.timeNow = now;
                        } else {
                            long j10 = cVarB.nanoTime;
                            if (j10 - now < 0) {
                                now = j10;
                            }
                            if (now - delayed.timeNow > 0) {
                                delayed.timeNow = now;
                            }
                        }
                        long j11 = this.nanoTime;
                        long j12 = delayed.timeNow;
                        if (j11 - j12 < 0) {
                            this.nanoTime = j12;
                        }
                        delayed.a(this);
                        return 0;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        public final boolean k(long now) {
            return now - this.nanoTime >= 0;
        }

        @Override // gv.q0
        public void setIndex(int i10) {
            this.index = i10;
        }

        @NotNull
        public String toString() {
            return "Delayed[nanos=" + this.nanoTime + ']';
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lav/n1$d;", "Lgv/p0;", "Lav/n1$c;", BuildConfig.FLAVOR, "timeNow", "<init>", "(J)V", "c", "J", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends gv.p0<c> {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public long timeNow;

        public d(long j10) {
            this.timeNow = j10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean d() {
        return f3459h.get(this) == 1;
    }

    @Override // av.y0
    public void A(long timeMillis, @NotNull n<? super Unit> continuation) {
        long jC = q1.c(timeMillis);
        if (jC < 4611686018427387903L) {
            av.c.a();
            long jNanoTime = System.nanoTime();
            a aVar = new a(jC + jNanoTime, continuation);
            U0(jNanoTime, aVar);
            r.a(continuation, aVar);
        }
    }

    public final void F0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3457f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (y1.b.a(f3457f, this, null, q1.b)) {
                    return;
                }
            } else if (obj instanceof gv.r) {
                ((gv.r) obj).d();
                return;
            } else {
                if (obj == q1.b) {
                    return;
                }
                gv.r rVar = new gv.r(8, true);
                Intrinsics.d(obj, "null cannot be cast to non-null type java.lang.Runnable");
                rVar.a((Runnable) obj);
                if (y1.b.a(f3457f, this, obj, rVar)) {
                    return;
                }
            }
        }
    }

    public final Runnable G0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3457f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof gv.r) {
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                gv.r rVar = (gv.r) obj;
                Object objM = rVar.m();
                if (objM != gv.r.f17982h) {
                    return (Runnable) objM;
                }
                y1.b.a(f3457f, this, obj, rVar.l());
            } else {
                if (obj == q1.b) {
                    return null;
                }
                if (y1.b.a(f3457f, this, obj, null)) {
                    Intrinsics.d(obj, "null cannot be cast to non-null type java.lang.Runnable");
                    return (Runnable) obj;
                }
            }
        }
    }

    @Override // av.l0
    public final void I(@NotNull CoroutineContext context, @NotNull Runnable block) {
        I0(block);
    }

    public void I0(@NotNull Runnable task) {
        K0();
        if (M0(task)) {
            A0();
        } else {
            u0.f3485i.I0(task);
        }
    }

    public final void K0() {
        c cVarI;
        d dVar = (d) f3458g.get(this);
        if (dVar == null || dVar.e()) {
            return;
        }
        av.c.a();
        long jNanoTime = System.nanoTime();
        do {
            synchronized (dVar) {
                try {
                    c cVarB = dVar.b();
                    cVarI = null;
                    if (cVarB != null) {
                        c cVar = cVarB;
                        cVarI = cVar.k(jNanoTime) ? M0(cVar) : false ? dVar.i(0) : null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (cVarI != null);
    }

    public final boolean M0(Runnable task) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3457f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (d()) {
                return false;
            }
            if (obj == null) {
                if (y1.b.a(f3457f, this, null, task)) {
                    return true;
                }
            } else if (obj instanceof gv.r) {
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                gv.r rVar = (gv.r) obj;
                int iA = rVar.a(task);
                if (iA == 0) {
                    return true;
                }
                if (iA == 1) {
                    y1.b.a(f3457f, this, obj, rVar.l());
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (obj == q1.b) {
                    return false;
                }
                gv.r rVar2 = new gv.r(8, true);
                Intrinsics.d(obj, "null cannot be cast to non-null type java.lang.Runnable");
                rVar2.a((Runnable) obj);
                rVar2.a(task);
                if (y1.b.a(f3457f, this, obj, rVar2)) {
                    return true;
                }
            }
        }
    }

    public boolean R0() {
        if (!k0()) {
            return false;
        }
        d dVar = (d) f3458g.get(this);
        if (dVar != null && !dVar.e()) {
            return false;
        }
        Object obj = f3457f.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof gv.r) {
            return ((gv.r) obj).j();
        }
        return obj == q1.b;
    }

    public final void S0() {
        c cVarJ;
        av.c.a();
        long jNanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) f3458g.get(this);
            if (dVar == null || (cVarJ = dVar.j()) == null) {
                return;
            } else {
                z0(jNanoTime, cVarJ);
            }
        }
    }

    public final void T0() {
        f3457f.set(this, null);
        f3458g.set(this, null);
    }

    public final void U0(long now, @NotNull c delayedTask) {
        int iV0 = V0(now, delayedTask);
        if (iV0 == 0) {
            if (Y0(delayedTask)) {
                A0();
            }
        } else if (iV0 == 1) {
            z0(now, delayedTask);
        } else if (iV0 != 2) {
            throw new IllegalStateException("unexpected result");
        }
    }

    public final int V0(long now, c delayedTask) {
        if (d()) {
            return 1;
        }
        d dVar = (d) f3458g.get(this);
        if (dVar == null) {
            y1.b.a(f3458g, this, null, new d(now));
            Object obj = f3458g.get(this);
            Intrinsics.checkNotNull(obj);
            dVar = (d) obj;
        }
        return delayedTask.h(now, dVar, this);
    }

    @NotNull
    public final i1 W0(long timeMillis, @NotNull Runnable block) {
        long jC = q1.c(timeMillis);
        if (jC >= 4611686018427387903L) {
            return q2.f3474a;
        }
        av.c.a();
        long jNanoTime = System.nanoTime();
        b bVar = new b(jC + jNanoTime, block);
        U0(jNanoTime, bVar);
        return bVar;
    }

    public final void X0(boolean z10) {
        f3459h.set(this, z10 ? 1 : 0);
    }

    public final boolean Y0(c task) {
        d dVar = (d) f3458g.get(this);
        return (dVar != null ? dVar.f() : null) == task;
    }

    @Override // av.m1
    public long e0() {
        c cVarF;
        if (super.e0() == 0) {
            return 0L;
        }
        Object obj = f3457f.get(this);
        if (obj != null) {
            if (!(obj instanceof gv.r)) {
                return obj == q1.b ? Long.MAX_VALUE : 0L;
            }
            if (!((gv.r) obj).j()) {
                return 0L;
            }
        }
        d dVar = (d) f3458g.get(this);
        if (dVar == null || (cVarF = dVar.f()) == null) {
            return Long.MAX_VALUE;
        }
        long j10 = cVarF.nanoTime;
        av.c.a();
        return p001kotlin.ranges.d.d(j10 - System.nanoTime(), 0L);
    }

    @Override // av.y0
    @NotNull
    public i1 g(long j10, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        return y0.a.a(this, j10, runnable, coroutineContext);
    }

    @Override // av.m1
    public long n0() {
        if (s0()) {
            return 0L;
        }
        K0();
        Runnable runnableG0 = G0();
        if (runnableG0 == null) {
            return e0();
        }
        runnableG0.run();
        return 0L;
    }

    @Override // av.m1
    public void shutdown() {
        c3.f3387a.c();
        X0(true);
        F0();
        while (n0() <= 0) {
        }
        S0();
    }
}
