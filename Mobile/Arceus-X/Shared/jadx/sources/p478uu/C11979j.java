package p478uu;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.Intrinsics;
import mu.C8677l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p256ku.C7905p;
import p256ku.C7913r;
import p256ku.InterfaceC7886k3;
import p256ku.InterfaceC7897n;
import p315nt.InterfaceC9557b;
import p344ot.C10046b;
import p344ot.C10047c;
import p395qu.AbstractC10713b0;
import p395qu.C10712b;
import p395qu.C10715c0;
import p452tu.InterfaceC11760l;
import p563y1.C12996b;
import p615zt.InterfaceC14057n;
import pt.C10346h;

/* JADX INFO: renamed from: uu.j */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u0010*\u00020\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\u0018\u0010\tJ\u001d\u0010\u001a\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019H\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR,\u0010\"\u001a\u001a\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00070\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010!R\u0011\u0010$\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b#\u0010\u000bR\u0011\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004R\u000b\u0010)\u001a\u00020(8\u0002X\u0082\u0004R\u0011\u0010*\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004R\u000b\u0010+\u001a\u00020(8\u0002X\u0082\u0004R\u000b\u0010-\u001a\u00020,8\u0002X\u0082\u0004¨\u0006."}, m31665d2 = {"Luu/j;", "", "", "permits", "acquiredPermits", "<init>", "(II)V", "", "j", "(Lnt/b;)Ljava/lang/Object;", "m", "()I", "l", "()V", "Lku/k3;", "waiter", "", "k", "(Lku/k3;)Z", "v", "()Z", "u", "(Ljava/lang/Object;)Z", "t", "b", "Lku/n;", "i", "(Lku/n;)V", "a", "I", "Lkotlin/Function3;", "", "Lkotlin/coroutines/CoroutineContext;", "Lzt/n;", "onCancellationRelease", "c", "availablePermits", "Lkotlinx/atomicfu/AtomicRef;", "Luu/m;", "head", "Lkotlinx/atomicfu/AtomicLong;", "deqIdx", "tail", "enqIdx", "Lkotlinx/atomicfu/AtomicInt;", "_availablePermits", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public class C11979j {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f42434c = AtomicReferenceFieldUpdater.newUpdater(C11979j.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicLongFieldUpdater f42435d = AtomicLongFieldUpdater.newUpdater(C11979j.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f42436e = AtomicReferenceFieldUpdater.newUpdater(C11979j.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f42437f = AtomicLongFieldUpdater.newUpdater(C11979j.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f42438g = AtomicIntegerFieldUpdater.newUpdater(C11979j.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int permits;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC14057n<Throwable, Unit, CoroutineContext, Unit> onCancellationRelease;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* JADX INFO: renamed from: uu.j$a */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public /* synthetic */ class a extends C7744k implements Function2<Long, C11982m, C11982m> {

        /* JADX INFO: renamed from: a */
        public static final a f42441a = new a();

        public a() {
            super(2, C11981l.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        /* JADX DEBUG: Class process forced to load method for inline: uu.l.c(long, uu.m):uu.m */
        /* JADX INFO: renamed from: d */
        public final C11982m m44721d(long j10, C11982m c11982m) {
            return C11981l.m44732j(j10, c11982m);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ C11982m invoke(Long l10, C11982m c11982m) {
            return m44721d(l10.longValue(), c11982m);
        }
    }

    /* JADX INFO: renamed from: uu.j$b */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public /* synthetic */ class b extends C7744k implements Function2<Long, C11982m, C11982m> {

        /* JADX INFO: renamed from: a */
        public static final b f42442a = new b();

        public b() {
            super(2, C11981l.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        /* JADX INFO: renamed from: d */
        public final C11982m m44722d(long j10, C11982m c11982m) {
            return C11981l.m44732j(j10, c11982m);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ C11982m invoke(Long l10, C11982m c11982m) {
            return m44722d(l10.longValue(), c11982m);
        }
    }

    public C11979j(int i10, int i11) {
        this.permits = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i10).toString());
        }
        if (i11 < 0 || i11 > i10) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i10).toString());
        }
        C11982m c11982m = new C11982m(0L, null, 2);
        this.head$volatile = c11982m;
        this.tail$volatile = c11982m;
        this._availablePermits$volatile = i10 - i11;
        this.onCancellationRelease = new InterfaceC14057n() { // from class: uu.i
            @Override // p615zt.InterfaceC14057n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return C11979j.m44709s(this.f42433a, (Throwable) obj, (Unit) obj2, (CoroutineContext) obj3);
            }
        };
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m44709s(C11979j c11979j, Throwable th2, Unit unit, CoroutineContext coroutineContext) {
        c11979j.m44710a();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: a */
    public final void m44710a() {
        do {
            int andIncrement = f42438g.getAndIncrement(this);
            if (andIncrement >= this.permits) {
                m44716l();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.permits).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!m44720v());
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Object m44711b(@NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objM44714j;
        return (m44717m() <= 0 && (objM44714j = m44714j(interfaceC9557b)) == C10047c.m38805e()) ? objM44714j : Unit.f29331a;
    }

    /* JADX INFO: renamed from: c */
    public final int m44712c() {
        return Math.max(f42438g.get(this), 0);
    }

    /* JADX INFO: renamed from: i */
    public final void m44713i(@NotNull InterfaceC7897n<? super Unit> waiter) {
        while (m44717m() <= 0) {
            Intrinsics.m31981d(waiter, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (m44715k((InterfaceC7886k3) waiter)) {
                return;
            }
        }
        waiter.mo32814k(Unit.f29331a, this.onCancellationRelease);
    }

    /* JADX INFO: renamed from: j */
    public final Object m44714j(InterfaceC9557b<? super Unit> interfaceC9557b) {
        C7905p c7905pM32900b = C7913r.m32900b(C10046b.m38803c(interfaceC9557b));
        try {
            if (!m44715k(c7905pM32900b)) {
                m44713i(c7905pM32900b);
            }
            Object objM32857A = c7905pM32900b.m32857A();
            if (objM32857A == C10047c.m38805e()) {
                C10346h.m39673c(interfaceC9557b);
            }
            return objM32857A == C10047c.m38805e() ? objM32857A : Unit.f29331a;
        } catch (Throwable th2) {
            c7905pM32900b.m32867Q();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m44715k(InterfaceC7886k3 waiter) {
        Object objM40813c;
        C11982m c11982m = (C11982m) f42436e.get(this);
        long andIncrement = f42437f.getAndIncrement(this);
        a aVar = a.f42441a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42436e;
        long j10 = andIncrement / ((long) C11981l.f42448f);
        loop0: while (true) {
            objM40813c = C10712b.m40813c(c11982m, j10, aVar);
            if (!C10715c0.m40834c(objM40813c)) {
                AbstractC10713b0 abstractC10713b0M40833b = C10715c0.m40833b(objM40813c);
                while (true) {
                    AbstractC10713b0 abstractC10713b0 = (AbstractC10713b0) atomicReferenceFieldUpdater.get(this);
                    if (abstractC10713b0.id >= abstractC10713b0M40833b.id) {
                        break loop0;
                    }
                    if (!abstractC10713b0M40833b.m40818u()) {
                        break;
                    }
                    if (C12996b.m48310a(atomicReferenceFieldUpdater, this, abstractC10713b0, abstractC10713b0M40833b)) {
                        if (!abstractC10713b0.m40816p()) {
                            break loop0;
                        }
                        abstractC10713b0.m40830n();
                        break loop0;
                    }
                    if (abstractC10713b0M40833b.m40816p()) {
                        abstractC10713b0M40833b.m40830n();
                    }
                }
            } else {
                break;
            }
        }
        C11982m c11982m2 = (C11982m) C10715c0.m40833b(objM40813c);
        int i10 = (int) (andIncrement % ((long) C11981l.f42448f));
        if (C8677l.m34942a(c11982m2.getF42449e(), i10, null, waiter)) {
            waiter.mo32790e(c11982m2, i10);
            return true;
        }
        if (!C8677l.m34942a(c11982m2.getF42449e(), i10, C11981l.f42444b, C11981l.f42445c)) {
            return false;
        }
        if (waiter instanceof InterfaceC7897n) {
            Intrinsics.m31981d(waiter, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((InterfaceC7897n) waiter).mo32814k(Unit.f29331a, this.onCancellationRelease);
        } else {
            if (!(waiter instanceof InterfaceC11760l)) {
                throw new IllegalStateException(("unexpected: " + waiter).toString());
            }
            ((InterfaceC11760l) waiter).mo44010b(Unit.f29331a);
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final void m44716l() {
        int i10;
        do {
            i10 = f42438g.get(this);
            if (i10 <= this.permits) {
                return;
            }
        } while (!f42438g.compareAndSet(this, i10, this.permits));
    }

    /* JADX INFO: renamed from: m */
    public final int m44717m() {
        int andDecrement;
        do {
            andDecrement = f42438g.getAndDecrement(this);
        } while (andDecrement > this.permits);
        return andDecrement;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m44718t() {
        while (true) {
            int i10 = f42438g.get(this);
            if (i10 > this.permits) {
                m44716l();
            } else {
                if (i10 <= 0) {
                    return false;
                }
                if (f42438g.compareAndSet(this, i10, i10 - 1)) {
                    return true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final boolean m44719u(Object obj) {
        if (!(obj instanceof InterfaceC7897n)) {
            if (obj instanceof InterfaceC11760l) {
                return ((InterfaceC11760l) obj).mo44011f(this, Unit.f29331a);
            }
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        Intrinsics.m31981d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        InterfaceC7897n interfaceC7897n = (InterfaceC7897n) obj;
        Object objMo32809G = interfaceC7897n.mo32809G(Unit.f29331a, null, this.onCancellationRelease);
        if (objMo32809G == null) {
            return false;
        }
        interfaceC7897n.mo32810J(objMo32809G);
        return true;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m44720v() {
        Object objM40813c;
        C11982m c11982m = (C11982m) f42434c.get(this);
        long andIncrement = f42435d.getAndIncrement(this);
        long j10 = andIncrement / ((long) C11981l.f42448f);
        b bVar = b.f42442a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42434c;
        loop0: while (true) {
            objM40813c = C10712b.m40813c(c11982m, j10, bVar);
            if (C10715c0.m40834c(objM40813c)) {
                break;
            }
            AbstractC10713b0 abstractC10713b0M40833b = C10715c0.m40833b(objM40813c);
            while (true) {
                AbstractC10713b0 abstractC10713b0 = (AbstractC10713b0) atomicReferenceFieldUpdater.get(this);
                if (abstractC10713b0.id >= abstractC10713b0M40833b.id) {
                    break loop0;
                }
                if (!abstractC10713b0M40833b.m40818u()) {
                    break;
                }
                if (C12996b.m48310a(atomicReferenceFieldUpdater, this, abstractC10713b0, abstractC10713b0M40833b)) {
                    if (!abstractC10713b0.m40816p()) {
                        break loop0;
                    }
                    abstractC10713b0.m40830n();
                    break loop0;
                }
                if (abstractC10713b0M40833b.m40816p()) {
                    abstractC10713b0M40833b.m40830n();
                }
            }
        }
        C11982m c11982m2 = (C11982m) C10715c0.m40833b(objM40813c);
        c11982m2.m40822c();
        if (c11982m2.id > j10) {
            return false;
        }
        int i10 = (int) (andIncrement % ((long) C11981l.f42448f));
        Object andSet = c11982m2.getF42449e().getAndSet(i10, C11981l.f42444b);
        if (andSet != null) {
            if (andSet == C11981l.f42447e) {
                return false;
            }
            return m44719u(andSet);
        }
        int i11 = C11981l.f42443a;
        for (int i12 = 0; i12 < i11; i12++) {
            if (c11982m2.getF42449e().get(i10) == C11981l.f42445c) {
                return true;
            }
        }
        return !C8677l.m34942a(c11982m2.getF42449e(), i10, C11981l.f42444b, C11981l.f42446d);
    }
}
