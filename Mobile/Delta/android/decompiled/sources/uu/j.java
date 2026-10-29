package uu;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.k3;
import ku.p;
import ku.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qu.b0;
import qu.c0;
import zt.n;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u0010*\u00020\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\u0018\u0010\tJ\u001d\u0010\u001a\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019H\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR,\u0010\"\u001a\u001a\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00070\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010!R\u0011\u0010$\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b#\u0010\u000bR\u0011\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004R\u000b\u0010)\u001a\u00020(8\u0002X\u0082\u0004R\u0011\u0010*\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004R\u000b\u0010+\u001a\u00020(8\u0002X\u0082\u0004R\u000b\u0010-\u001a\u00020,8\u0002X\u0082\u0004¨\u0006."}, d2 = {"Luu/j;", "", "", "permits", "acquiredPermits", "<init>", "(II)V", "", "j", "(Lnt/b;)Ljava/lang/Object;", "m", "()I", "l", "()V", "Lku/k3;", "waiter", "", "k", "(Lku/k3;)Z", "v", "()Z", "u", "(Ljava/lang/Object;)Z", "t", "b", "Lku/n;", "i", "(Lku/n;)V", "a", "I", "Lkotlin/Function3;", "", "Lkotlin/coroutines/CoroutineContext;", "Lzt/n;", "onCancellationRelease", "c", "availablePermits", "Lkotlinx/atomicfu/AtomicRef;", "Luu/m;", "head", "Lkotlinx/atomicfu/AtomicLong;", "deqIdx", "tail", "enqIdx", "Lkotlinx/atomicfu/AtomicInt;", "_availablePermits", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f32656c = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f32657d = AtomicLongFieldUpdater.newUpdater(j.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f32658e = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f32659f = AtomicLongFieldUpdater.newUpdater(j.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f32660g = AtomicIntegerFieldUpdater.newUpdater(j.class, "_availablePermits$volatile");
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
    public /* synthetic */ class a extends kotlin.jvm.internal.k implements Function2<Long, m, m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f32662a = new a();

        public a() {
            super(2, l.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final m d(long j10, m mVar) {
            return l.j(j10, mVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ m invoke(Long l10, m mVar) {
            return d(l10.longValue(), mVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b extends kotlin.jvm.internal.k implements Function2<Long, m, m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f32663a = new b();

        public b() {
            super(2, l.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final m d(long j10, m mVar) {
            return l.j(j10, mVar);
        }

        @Override // kotlin.jvm.functions.Function2
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
        this.onCancellationRelease = new n() { // from class: uu.i
            @Override // zt.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return j.s(this.f32655a, (Throwable) obj, (Unit) obj2, (CoroutineContext) obj3);
            }
        };
    }

    public static final Unit s(j jVar, Throwable th2, Unit unit, CoroutineContext coroutineContext) {
        jVar.a();
        return Unit.f22483a;
    }

    public final void a() {
        do {
            int andIncrement = f32660g.getAndIncrement(this);
            if (andIncrement >= this.permits) {
                l();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.permits).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!v());
    }

    @Nullable
    public final Object b(@NotNull nt.b<? super Unit> bVar) {
        Object objJ;
        return (m() <= 0 && (objJ = j(bVar)) == ot.c.e()) ? objJ : Unit.f22483a;
    }

    public final int c() {
        return Math.max(f32660g.get(this), 0);
    }

    public final void i(@NotNull ku.n<? super Unit> waiter) {
        while (m() <= 0) {
            Intrinsics.d(waiter, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (k((k3) waiter)) {
                return;
            }
        }
        waiter.k(Unit.f22483a, this.onCancellationRelease);
    }

    public final Object j(nt.b<? super Unit> bVar) {
        p pVarB = r.b(ot.b.c(bVar));
        try {
            if (!k(pVarB)) {
                i(pVarB);
            }
            Object objA = pVarB.A();
            if (objA == ot.c.e()) {
                pt.h.c(bVar);
            }
            return objA == ot.c.e() ? objA : Unit.f22483a;
        } catch (Throwable th2) {
            pVarB.Q();
            throw th2;
        }
    }

    public final boolean k(k3 waiter) {
        Object objC;
        m mVar = (m) f32658e.get(this);
        long andIncrement = f32659f.getAndIncrement(this);
        a aVar = a.f32662a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32658e;
        long j10 = andIncrement / ((long) l.f32668f);
        loop0: while (true) {
            objC = qu.b.c(mVar, j10, aVar);
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
        int i10 = (int) (andIncrement % ((long) l.f32668f));
        if (mu.l.a(mVar2.getF32669e(), i10, null, waiter)) {
            waiter.e(mVar2, i10);
            return true;
        }
        if (!mu.l.a(mVar2.getF32669e(), i10, l.b, l.f32665c)) {
            return false;
        }
        if (waiter instanceof ku.n) {
            Intrinsics.d(waiter, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((ku.n) waiter).k(Unit.f22483a, this.onCancellationRelease);
        } else {
            if (!(waiter instanceof tu.l)) {
                throw new IllegalStateException(("unexpected: " + waiter).toString());
            }
            ((tu.l) waiter).b(Unit.f22483a);
        }
        return true;
    }

    public final void l() {
        int i10;
        do {
            i10 = f32660g.get(this);
            if (i10 <= this.permits) {
                return;
            }
        } while (!f32660g.compareAndSet(this, i10, this.permits));
    }

    public final int m() {
        int andDecrement;
        do {
            andDecrement = f32660g.getAndDecrement(this);
        } while (andDecrement > this.permits);
        return andDecrement;
    }

    public final boolean t() {
        while (true) {
            int i10 = f32660g.get(this);
            if (i10 > this.permits) {
                l();
            } else {
                if (i10 <= 0) {
                    return false;
                }
                if (f32660g.compareAndSet(this, i10, i10 - 1)) {
                    return true;
                }
            }
        }
    }

    public final boolean u(Object obj) {
        if (!(obj instanceof ku.n)) {
            if (obj instanceof tu.l) {
                return ((tu.l) obj).f(this, Unit.f22483a);
            }
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        ku.n nVar = (ku.n) obj;
        Object objG = nVar.G(Unit.f22483a, null, this.onCancellationRelease);
        if (objG == null) {
            return false;
        }
        nVar.J(objG);
        return true;
    }

    public final boolean v() {
        Object objC;
        m mVar = (m) f32656c.get(this);
        long andIncrement = f32657d.getAndIncrement(this);
        long j10 = andIncrement / ((long) l.f32668f);
        b bVar = b.f32663a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f32656c;
        loop0: while (true) {
            objC = qu.b.c(mVar, j10, bVar);
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
        mVar2.c();
        if (mVar2.id > j10) {
            return false;
        }
        int i10 = (int) (andIncrement % ((long) l.f32668f));
        Object andSet = mVar2.getF32669e().getAndSet(i10, l.b);
        if (andSet != null) {
            if (andSet == l.f32667e) {
                return false;
            }
            return u(andSet);
        }
        int i11 = l.f32664a;
        for (int i12 = 0; i12 < i11; i12++) {
            if (mVar2.getF32669e().get(i10) == l.f32665c) {
                return true;
            }
        }
        return !mu.l.a(mVar2.getF32669e(), i10, l.b, l.f32666d);
    }
}
