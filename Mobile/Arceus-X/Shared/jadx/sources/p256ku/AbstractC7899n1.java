package p256ku;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7764d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p395qu.C10741p0;
import p395qu.C10744r;
import p395qu.InterfaceC10743q0;
import p563y1.C12996b;

/* JADX INFO: renamed from: ku.n1 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u00002\u00020\u00012\u00020\u0002:\u0004@AB0B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u0004J%\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00132\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\"\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u00132\n\u0010 \u001a\u00060\u0005j\u0002`\u0006H\u0004¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0013H\u0016¢\u0006\u0004\b$\u0010%J!\u0010(\u001a\u00020\r2\u0006\u0010'\u001a\u00020&2\n\u0010 \u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b(\u0010)J\u001b\u0010*\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016¢\u0006\u0004\b*\u0010+J\u001d\u0010,\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\rH\u0004¢\u0006\u0004\b.\u0010\u0004R$\u00104\u001a\u00020\b2\u0006\u0010/\u001a\u00020\b8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0014\u00106\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b5\u00101R\u0014\u00108\u001a\u00020\u00138TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b7\u0010%R\u0013\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010:098\u0002X\u0082\u0004R\u0013\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010<098\u0002X\u0082\u0004R\u000b\u0010?\u001a\u00020>8\u0002X\u0082\u0004¨\u0006C"}, m31665d2 = {"Lku/n1;", "Lku/o1;", "Lku/y0;", "<init>", "()V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "task", "", "L0", "(Ljava/lang/Runnable;)Z", "F0", "()Ljava/lang/Runnable;", "", "J0", "E0", "Lku/n1$c;", "Y0", "(Lku/n1$c;)Z", "", "now", "delayedTask", "", "V0", "(JLku/n1$c;)I", "R0", "shutdown", "timeMillis", "Lku/n;", "continuation", "o", "(JLku/n;)V", "block", "Lku/i1;", "W0", "(JLjava/lang/Runnable;)Lku/i1;", "r0", "()J", "Lkotlin/coroutines/CoroutineContext;", "context", "w", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "H0", "(Ljava/lang/Runnable;)V", "T0", "(JLku/n1$c;)V", "S0", "value", "d", "()Z", "X0", "(Z)V", "isCompleted", "Q0", "isEmpty", "b0", "nextTime", "Lkotlinx/atomicfu/AtomicRef;", "", "_queue", "Lku/n1$d;", "_delayed", "Lkotlinx/atomicfu/AtomicBoolean;", "_isCompleted", "c", "a", "b", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public abstract class AbstractC7899n1 extends AbstractC7903o1 implements InterfaceC7942y0 {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29772f = AtomicReferenceFieldUpdater.newUpdater(AbstractC7899n1.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29773g = AtomicReferenceFieldUpdater.newUpdater(AbstractC7899n1.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f29774h = AtomicIntegerFieldUpdater.newUpdater(AbstractC7899n1.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX INFO: renamed from: ku.n1$a */
    @Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m31665d2 = {"Lku/n1$a;", "Lku/n1$c;", "", "nanoTime", "Lku/n;", "", "cont", "<init>", "(Lku/n1;JLku/n;)V", "run", "()V", "", "toString", "()Ljava/lang/String;", "c", "Lku/n;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public final class a extends c {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC7897n<Unit> cont;

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: ku.n<? super kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull long j10, InterfaceC7897n<? super Unit> interfaceC7897n) {
            super(j10);
            this.cont = interfaceC7897n;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.cont.mo32818x(AbstractC7899n1.this, Unit.f29331a);
        }

        @Override // p256ku.AbstractC7899n1.c
        @NotNull
        public String toString() {
            return super.toString() + this.cont;
        }
    }

    /* JADX INFO: renamed from: ku.n1$b */
    @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m31665d2 = {"Lku/n1$b;", "Lku/n1$c;", "", "nanoTime", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "<init>", "(JLjava/lang/Runnable;)V", "", "run", "()V", "", "toString", "()Ljava/lang/String;", "c", "Ljava/lang/Runnable;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class b extends c {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
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

        @Override // p256ku.AbstractC7899n1.c
        @NotNull
        public String toString() {
            return super.toString() + this.block;
        }
    }

    /* JADX INFO: renamed from: ku.n1$c */
    @Metadata(m31664d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u00052\u00060\u0006j\u0002`\u0007B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010)\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R0\u0010/\u001a\b\u0012\u0002\b\u0003\u0018\u00010*2\f\u0010+\u001a\b\u0012\u0002\b\u0003\u0018\u00010*8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b#\u0010.¨\u00060"}, m31665d2 = {"Lku/n1$c;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Lku/i1;", "Lqu/q0;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "", "nanoTime", "<init>", "(J)V", "other", "", "e", "(Lku/n1$c;)I", "now", "", "j", "(J)Z", "Lku/n1$d;", "delayed", "Lku/n1;", "eventLoop", "h", "(JLku/n1$d;Lku/n1;)I", "", "a", "()V", "", "toString", "()Ljava/lang/String;", "J", "_heap", "Ljava/lang/Object;", "b", "I", "getIndex", "()I", "setIndex", "(I)V", "index", "Lqu/p0;", "value", "d", "()Lqu/p0;", "(Lqu/p0;)V", "heap", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static abstract class c implements Runnable, Comparable<c>, InterfaceC7874i1, InterfaceC10743q0 {

        @Nullable
        private volatile Object _heap;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public long nanoTime;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int index = -1;

        public c(long j10) {
            this.nanoTime = j10;
        }

        @Override // p256ku.InterfaceC7874i1
        /* JADX INFO: renamed from: a */
        public final void mo32664a() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    if (obj == C7911q1.f29791a) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        dVar.m40917h(this);
                    }
                    this._heap = C7911q1.f29791a;
                    Unit unit = Unit.f29331a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p395qu.InterfaceC10743q0
        /* JADX INFO: renamed from: b */
        public void mo32842b(@Nullable C10741p0<?> c10741p0) {
            if (this._heap == C7911q1.f29791a) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = c10741p0;
        }

        @Override // p395qu.InterfaceC10743q0
        @Nullable
        /* JADX INFO: renamed from: d */
        public C10741p0<?> mo32843d() {
            Object obj = this._heap;
            if (obj instanceof C10741p0) {
                return (C10741p0) obj;
            }
            return null;
        }

        /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compareTo(@NotNull c other) {
            long j10 = this.nanoTime - other.nanoTime;
            if (j10 > 0) {
                return 1;
            }
            return j10 < 0 ? -1 : 0;
        }

        @Override // p395qu.InterfaceC10743q0
        public int getIndex() {
            return this.index;
        }

        /* JADX INFO: renamed from: h */
        public final int m32845h(long now, @NotNull d delayed, @NotNull AbstractC7899n1 eventLoop) {
            synchronized (this) {
                if (this._heap == C7911q1.f29791a) {
                    return 2;
                }
                synchronized (delayed) {
                    try {
                        c cVarM40912b = delayed.m40912b();
                        if (eventLoop.m32826d()) {
                            return 1;
                        }
                        if (cVarM40912b == null) {
                            delayed.timeNow = now;
                        } else {
                            long j10 = cVarM40912b.nanoTime;
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
                        delayed.m40911a(this);
                        return 0;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: j */
        public final boolean m32846j(long now) {
            return now - this.nanoTime >= 0;
        }

        @Override // p395qu.InterfaceC10743q0
        public void setIndex(int i10) {
            this.index = i10;
        }

        @NotNull
        public String toString() {
            return "Delayed[nanos=" + this.nanoTime + ']';
        }
    }

    /* JADX INFO: renamed from: ku.n1$d */
    @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Lku/n1$d;", "Lqu/p0;", "Lku/n1$c;", "", "timeNow", "<init>", "(J)V", "c", "J", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class d extends C10741p0<c> {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public long timeNow;

        public d(long j10) {
            this.timeNow = j10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final boolean m32826d() {
        return f29774h.get(this) == 1;
    }

    /* JADX INFO: renamed from: E0 */
    public final void m32827E0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29772f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (C12996b.m48310a(f29772f, this, null, C7911q1.f29792b)) {
                    return;
                }
            } else if (obj instanceof C10744r) {
                ((C10744r) obj).m40934d();
                return;
            } else {
                if (obj == C7911q1.f29792b) {
                    return;
                }
                C10744r c10744r = new C10744r(8, true);
                Intrinsics.m31981d(obj, "null cannot be cast to non-null type java.lang.Runnable");
                c10744r.m40931a((Runnable) obj);
                if (C12996b.m48310a(f29772f, this, obj, c10744r)) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final Runnable m32828F0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29772f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof C10744r) {
                Intrinsics.m31981d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                C10744r c10744r = (C10744r) obj;
                Object objM40941m = c10744r.m40941m();
                if (objM40941m != C10744r.f38313h) {
                    return (Runnable) objM40941m;
                }
                C12996b.m48310a(f29772f, this, obj, c10744r.m40940l());
            } else {
                if (obj == C7911q1.f29792b) {
                    return null;
                }
                if (C12996b.m48310a(f29772f, this, obj, null)) {
                    Intrinsics.m31981d(obj, "null cannot be cast to non-null type java.lang.Runnable");
                    return (Runnable) obj;
                }
            }
        }
    }

    /* JADX INFO: renamed from: H0 */
    public void mo32829H0(@NotNull Runnable task) {
        m32830J0();
        if (m32831L0(task)) {
            m32849A0();
        } else {
            RunnableC7926u0.f29805i.mo32829H0(task);
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final void m32830J0() {
        c cVarM40918i;
        d dVar = (d) f29773g.get(this);
        if (dVar == null || dVar.m40914e()) {
            return;
        }
        C7842c.m32577a();
        long jNanoTime = System.nanoTime();
        do {
            synchronized (dVar) {
                try {
                    c cVarM40912b = dVar.m40912b();
                    cVarM40918i = null;
                    if (cVarM40912b != null) {
                        c cVar = cVarM40912b;
                        cVarM40918i = cVar.m32846j(jNanoTime) ? m32831L0(cVar) : false ? dVar.m40918i(0) : null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (cVarM40918i != null);
    }

    /* JADX INFO: renamed from: L0 */
    public final boolean m32831L0(Runnable task) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29772f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (m32826d()) {
                return false;
            }
            if (obj == null) {
                if (C12996b.m48310a(f29772f, this, null, task)) {
                    return true;
                }
            } else if (obj instanceof C10744r) {
                Intrinsics.m31981d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                C10744r c10744r = (C10744r) obj;
                int iM40931a = c10744r.m40931a(task);
                if (iM40931a == 0) {
                    return true;
                }
                if (iM40931a == 1) {
                    C12996b.m48310a(f29772f, this, obj, c10744r.m40940l());
                } else if (iM40931a == 2) {
                    return false;
                }
            } else {
                if (obj == C7911q1.f29792b) {
                    return false;
                }
                C10744r c10744r2 = new C10744r(8, true);
                Intrinsics.m31981d(obj, "null cannot be cast to non-null type java.lang.Runnable");
                c10744r2.m40931a((Runnable) obj);
                c10744r2.m40931a(task);
                if (C12996b.m48310a(f29772f, this, obj, c10744r2)) {
                    return true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public boolean m32832Q0() {
        if (!m32804l0()) {
            return false;
        }
        d dVar = (d) f29773g.get(this);
        if (dVar != null && !dVar.m40914e()) {
            return false;
        }
        Object obj = f29772f.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof C10744r) {
            return ((C10744r) obj).m40938j();
        }
        return obj == C7911q1.f29792b;
    }

    /* JADX INFO: renamed from: R0 */
    public final void m32833R0() {
        c cVarM40919j;
        C7842c.m32577a();
        long jNanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) f29773g.get(this);
            if (dVar == null || (cVarM40919j = dVar.m40919j()) == null) {
                return;
            } else {
                mo32850z0(jNanoTime, cVarM40919j);
            }
        }
    }

    /* JADX INFO: renamed from: S0 */
    public final void m32834S0() {
        f29772f.set(this, null);
        f29773g.set(this, null);
    }

    /* JADX INFO: renamed from: T0 */
    public final void m32835T0(long now, @NotNull c delayedTask) {
        int iM32836V0 = m32836V0(now, delayedTask);
        if (iM32836V0 == 0) {
            if (m32839Y0(delayedTask)) {
                m32849A0();
            }
        } else if (iM32836V0 == 1) {
            mo32850z0(now, delayedTask);
        } else if (iM32836V0 != 2) {
            throw new IllegalStateException("unexpected result");
        }
    }

    /* JADX INFO: renamed from: V0 */
    public final int m32836V0(long now, c delayedTask) {
        if (m32826d()) {
            return 1;
        }
        d dVar = (d) f29773g.get(this);
        if (dVar == null) {
            C12996b.m48310a(f29773g, this, null, new d(now));
            Object obj = f29773g.get(this);
            Intrinsics.checkNotNull(obj);
            dVar = (d) obj;
        }
        return delayedTask.m32845h(now, dVar, this);
    }

    @NotNull
    /* JADX INFO: renamed from: W0 */
    public final InterfaceC7874i1 m32837W0(long timeMillis, @NotNull Runnable block) {
        long jM32897c = C7911q1.m32897c(timeMillis);
        if (jM32897c >= 4611686018427387903L) {
            return C7912q2.f29793a;
        }
        C7842c.m32577a();
        long jNanoTime = System.nanoTime();
        b bVar = new b(jM32897c + jNanoTime, block);
        m32835T0(jNanoTime, bVar);
        return bVar;
    }

    /* JADX INFO: renamed from: X0 */
    public final void m32838X0(boolean z10) {
        f29774h.set(this, z10 ? 1 : 0);
    }

    /* JADX INFO: renamed from: Y0 */
    public final boolean m32839Y0(c task) {
        d dVar = (d) f29773g.get(this);
        return (dVar != null ? dVar.m40915f() : null) == task;
    }

    @Override // p256ku.AbstractC7894m1
    /* JADX INFO: renamed from: b0 */
    public long mo32801b0() {
        c cVarM40915f;
        if (super.mo32801b0() == 0) {
            return 0L;
        }
        Object obj = f29772f.get(this);
        if (obj != null) {
            if (!(obj instanceof C10744r)) {
                return obj == C7911q1.f29792b ? Long.MAX_VALUE : 0L;
            }
            if (!((C10744r) obj).m40938j()) {
                return 0L;
            }
        }
        d dVar = (d) f29773g.get(this);
        if (dVar == null || (cVarM40915f = dVar.m40915f()) == null) {
            return Long.MAX_VALUE;
        }
        long j10 = cVarM40915f.nanoTime;
        C7842c.m32577a();
        return C7764d.m32079d(j10 - System.nanoTime(), 0L);
    }

    @Override // p256ku.InterfaceC7942y0
    @NotNull
    /* JADX INFO: renamed from: f */
    public InterfaceC7874i1 mo32840f(long j10, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        return InterfaceC7942y0.a.m32932a(this, j10, runnable, coroutineContext);
    }

    @Override // p256ku.InterfaceC7942y0
    /* JADX INFO: renamed from: o */
    public void mo32841o(long timeMillis, @NotNull InterfaceC7897n<? super Unit> continuation) {
        long jM32897c = C7911q1.m32897c(timeMillis);
        if (jM32897c < 4611686018427387903L) {
            C7842c.m32577a();
            long jNanoTime = System.nanoTime();
            a aVar = new a(jM32897c + jNanoTime, continuation);
            m32835T0(jNanoTime, aVar);
            C7913r.m32899a(continuation, aVar);
        }
    }

    @Override // p256ku.AbstractC7894m1
    /* JADX INFO: renamed from: r0 */
    public long mo32805r0() {
        if (m32806t0()) {
            return 0L;
        }
        m32830J0();
        Runnable runnableM32828F0 = m32828F0();
        if (runnableM32828F0 == null) {
            return mo32801b0();
        }
        runnableM32828F0.run();
        return 0L;
    }

    @Override // p256ku.AbstractC7894m1
    public void shutdown() {
        C7846c3.f29696a.m32588c();
        m32838X0(true);
        m32827E0();
        while (mo32805r0() <= 0) {
        }
        m32833R0();
    }

    @Override // p256ku.AbstractC7888l0
    /* JADX INFO: renamed from: w */
    public final void mo6246w(@NotNull CoroutineContext context, @NotNull Runnable block) {
        mo32829H0(block);
    }
}
