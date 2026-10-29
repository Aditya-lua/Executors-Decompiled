package ku;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0010\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\n\u0010\u0007\u001a\u0013\u0010\u000b\u001a\u00020\u0003*\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u0018\u0010\u0011\u001a\u00020\u000e*\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"", "a", "(Lnt/b;)Ljava/lang/Object;", "", "timeMillis", "", "b", "(JLnt/b;)Ljava/lang/Object;", "Lkotlin/time/a;", "duration", "c", "e", "(J)J", "Lkotlin/coroutines/CoroutineContext;", "Lku/y0;", "d", "(Lkotlin/coroutines/CoroutineContext;)Lku/y0;", "delay", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class z0 {

    @pt.f(c = "kotlinx.coroutines.DelayKt", f = "Delay.kt", l = {160}, m = "awaitCancellation")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f22871t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f22872u;

        public a(nt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f22871t = obj;
            this.f22872u |= Integer.MIN_VALUE;
            return z0.a(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object a(@NotNull nt.b<?> bVar) {
        a aVar;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f22872u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f22872u = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object obj = aVar.f22871t;
        Object objE = ot.c.e();
        int i11 = aVar.f22872u;
        if (i11 == 0) {
            jt.o.b(obj);
            aVar.f22872u = 1;
            p pVar = new p(ot.b.c(aVar), 1);
            pVar.H();
            Object objA = pVar.A();
            if (objA == ot.c.e()) {
                pt.h.c(aVar);
            }
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(obj);
        }
        throw new jt.d();
    }

    @Nullable
    public static final Object b(long j10, @NotNull nt.b<? super Unit> bVar) {
        if (j10 <= 0) {
            return Unit.f22483a;
        }
        p pVar = new p(ot.b.c(bVar), 1);
        pVar.H();
        if (j10 < Long.MAX_VALUE) {
            d(pVar.getContext()).o(j10, pVar);
        }
        Object objA = pVar.A();
        if (objA == ot.c.e()) {
            pt.h.c(bVar);
        }
        return objA == ot.c.e() ? objA : Unit.f22483a;
    }

    @Nullable
    public static final Object c(long j10, @NotNull nt.b<? super Unit> bVar) {
        Object objB = b(e(j10), bVar);
        return objB == ot.c.e() ? objB : Unit.f22483a;
    }

    @NotNull
    public static final y0 d(@NotNull CoroutineContext coroutineContext) {
        CoroutineContext.Element element = coroutineContext.get(kotlin.coroutines.d.INSTANCE);
        y0 y0Var = element instanceof y0 ? (y0) element : null;
        return y0Var == null ? v0.a() : y0Var;
    }

    public static final long e(long j10) {
        boolean zK = kotlin.time.a.K(j10);
        if (zK) {
            return kotlin.time.a.w(kotlin.time.a.M(j10, kotlin.time.b.q(999999L, ju.b.NANOSECONDS)));
        }
        if (zK) {
            throw new jt.l();
        }
        return 0L;
    }
}
