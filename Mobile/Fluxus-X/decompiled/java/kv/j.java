package kv;

import av.k3;
import av.p;
import av.r;
import com.github.luben.zstd.BuildConfig;
import gv.b0;
import gv.c0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.coroutines.CoroutineContext;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import pu.n;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u0010*\u00020\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\u0018\u0010\tJ\u001d\u0010\u001a\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019H\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR,\u0010#\u001a\u001a\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00070\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0011\u0010$\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b!\u0010\u000bR\u0011\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004R\u000b\u0010)\u001a\u00020(8\u0002X\u0082\u0004R\u0011\u0010*\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004R\u000b\u0010+\u001a\u00020(8\u0002X\u0082\u0004R\u000b\u0010-\u001a\u00020,8\u0002X\u0082\u0004¨\u0006."}, d2 = {"Lkv/j;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "permits", "acquiredPermits", "<init>", "(II)V", BuildConfig.FLAVOR, "j", "(Leu/b;)Ljava/lang/Object;", "m", "()I", "l", "()V", "Lav/k3;", "waiter", BuildConfig.FLAVOR, "k", "(Lav/k3;)Z", "v", "()Z", "u", "(Ljava/lang/Object;)Z", "t", "c", "Lav/n;", "i", "(Lav/n;)V", "a", "I", "Lkotlin/Function3;", BuildConfig.FLAVOR, "Lkotlin/coroutines/CoroutineContext;", "b", "Lpu/n;", "onCancellationRelease", "availablePermits", "Lkotlinx/atomicfu/AtomicRef;", "Lkv/m;", "head", "Lkotlinx/atomicfu/AtomicLong;", "deqIdx", "tail", "enqIdx", "Lkotlinx/atomicfu/AtomicInt;", "_availablePermits", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f21812c = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f21813d = AtomicLongFieldUpdater.newUpdater(j.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f21814e = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f21815f = AtomicLongFieldUpdater.newUpdater(j.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f21816g = AtomicIntegerFieldUpdater.newUpdater(j.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int permits;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final n<Throwable, Unit, CoroutineContext, Unit> onCancellationRelease;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a extends p001kotlin.jvm.internal.k implements Function2<Long, m, m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f21818a = new a();

        public a() {
            super(2, l.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final m d(long j10, m mVar) {
            return l.j(j10, mVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ m invoke(Long l10, m mVar) {
            return d(l10.longValue(), mVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b extends p001kotlin.jvm.internal.k implements Function2<Long, m, m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f21819a = new b();

        public b() {
            super(2, l.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final m d(long j10, m mVar) {
            return l.j(j10, mVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ m invoke(Long l10, m mVar) {
            return d(l10.longValue(), mVar);
        }
    }

    public j(int i10, int i11) {
        this.permits = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i10).toString());
        }
        if (i11 < 0 || i11 > i10) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i10).toString());
        }
        m mVar = new m(0L, null, 2);
        this.head$volatile = mVar;
        this.tail$volatile = mVar;
        this._availablePermits$volatile = i10 - i11;
        this.onCancellationRelease = new n() { // from class: kv.i
            @Override // pu.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return j.s(this.f21811a, (Throwable) obj, (Unit) obj2, (CoroutineContext) obj3);
            }
        };
    }

    public static final Unit s(j jVar, Throwable th2, Unit unit, CoroutineContext coroutineContext) {
        jVar.a();
        return Unit.f21506a;
    }

    public final void a() {
        do {
            int andIncrement = f21816g.getAndIncrement(this);
            if (andIncrement >= this.permits) {
                l();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.permits).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!v());
    }

    public final int b() {
        return Math.max(f21816g.get(this), 0);
    }

    @Nullable
    public final Object c(@NotNull eu.b<? super Unit> bVar) {
        Object objJ;
        return (m() <= 0 && (objJ = j(bVar)) == fu.c.e()) ? objJ : Unit.f21506a;
    }

    public final void i(@NotNull av.n<? super Unit> waiter) {
        while (m() <= 0) {
            Intrinsics.d(waiter, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (k((k3) waiter)) {
                return;
            }
        }
        waiter.C(Unit.f21506a, this.onCancellationRelease);
    }

    public final Object j(eu.b<? super Unit> bVar) {
        p pVarB = r.b(fu.b.c(bVar));
        try {
            if (!k(pVarB)) {
                i(pVarB);
            }
            Object objY = pVarB.y();
            if (objY == fu.c.e()) {
                gu.h.c(bVar);
            }
            return objY == fu.c.e() ? objY : Unit.f21506a;
        } catch (Throwable th2) {
            pVarB.Q();
            throw th2;
        }
    }

    public final boolean k(k3 waiter) {
        Object objC;
        m mVar = (m) f21814e.get(this);
        long andIncrement = f21815f.getAndIncrement(this);
        a aVar = a.f21818a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21814e;
        long j10 = andIncrement / ((long) l.f21824f);
        loop0: while (true) {
            objC = gv.b.c(mVar, j10, aVar);
            if (!c0.c(objC)) {
                b0 b0VarB = c0.b(objC);
                while (true) {
                    b0 b0Var = (b0) atomicReferenceFieldUpdater.get(this);
                    if (b0Var.id >= b0VarB.id) {
                        break loop0;
                    }
                    if (!b0VarB.u()) {
                        break;
                    }
                    if (y1.b.a(atomicReferenceFieldUpdater, this, b0Var, b0VarB)) {
                        if (!b0Var.p()) {
                            break loop0;
                        }
                        b0Var.n();
                        break loop0;
                    }
                    if (b0VarB.p()) {
                        b0VarB.n();
                    }
                }
            } else {
                break;
            }
        }
        m mVar2 = (m) c0.b(objC);
        int i10 = (int) (andIncrement % ((long) l.f21824f));
        if (cv.l.a(mVar2.getF21825e(), i10, null, waiter)) {
            waiter.c(mVar2, i10);
            return true;
        }
        if (!cv.l.a(mVar2.getF21825e(), i10, l.b, l.f21821c)) {
            return false;
        }
        if (waiter instanceof av.n) {
            Intrinsics.d(waiter, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((av.n) waiter).C(Unit.f21506a, this.onCancellationRelease);
        } else {
            if (!(waiter instanceof jv.l)) {
                throw new IllegalStateException(("unexpected: " + waiter).toString());
            }
            ((jv.l) waiter).e(Unit.f21506a);
        }
        return true;
    }

    public final void l() {
        int i10;
        do {
            i10 = f21816g.get(this);
            if (i10 <= this.permits) {
                return;
            }
        } while (!f21816g.compareAndSet(this, i10, this.permits));
    }

    public final int m() {
        int andDecrement;
        do {
            andDecrement = f21816g.getAndDecrement(this);
        } while (andDecrement > this.permits);
        return andDecrement;
    }

    public final boolean t() {
        while (true) {
            int i10 = f21816g.get(this);
            if (i10 > this.permits) {
                l();
            } else {
                if (i10 <= 0) {
                    return false;
                }
                if (f21816g.compareAndSet(this, i10, i10 - 1)) {
                    return true;
                }
            }
        }
    }

    public final boolean u(Object obj) {
        if (!(obj instanceof av.n)) {
            if (obj instanceof jv.l) {
                return ((jv.l) obj).f(this, Unit.f21506a);
            }
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        av.n nVar = (av.n) obj;
        Object objJ = nVar.J(Unit.f21506a, null, this.onCancellationRelease);
        if (objJ == null) {
            return false;
        }
        nVar.L(objJ);
        return true;
    }

    public final boolean v() {
        Object objC;
        m mVar = (m) f21812c.get(this);
        long andIncrement = f21813d.getAndIncrement(this);
        long j10 = andIncrement / ((long) l.f21824f);
        b bVar = b.f21819a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21812c;
        loop0: while (true) {
            objC = gv.b.c(mVar, j10, bVar);
            if (c0.c(objC)) {
                break;
            }
            b0 b0VarB = c0.b(objC);
            while (true) {
                b0 b0Var = (b0) atomicReferenceFieldUpdater.get(this);
                if (b0Var.id >= b0VarB.id) {
                    break loop0;
                }
                if (!b0VarB.u()) {
                    break;
                }
                if (y1.b.a(atomicReferenceFieldUpdater, this, b0Var, b0VarB)) {
                    if (!b0Var.p()) {
                        break loop0;
                    }
                    b0Var.n();
                    break loop0;
                }
                if (b0VarB.p()) {
                    b0VarB.n();
                }
            }
        }
        m mVar2 = (m) c0.b(objC);
        mVar2.b();
        if (mVar2.id > j10) {
            return false;
        }
        int i10 = (int) (andIncrement % ((long) l.f21824f));
        Object andSet = mVar2.getF21825e().getAndSet(i10, l.b);
        if (andSet != null) {
            if (andSet == l.f21823e) {
                return false;
            }
            return u(andSet);
        }
        int i11 = l.f21820a;
        for (int i12 = 0; i12 < i11; i12++) {
            if (mVar2.getF21825e().get(i10) == l.f21821c) {
                return true;
            }
        }
        return !cv.l.a(mVar2.getF21825e(), i10, l.b, l.f21822d);
    }
}
