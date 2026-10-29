package ku;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u001a'\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\u000b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u0018\u0010\u0011\u001a\u00020\t*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0018\u0010\u0013\u001a\u00020\t*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {"T", "Lku/d1;", "", "mode", "", "a", "(Lku/d1;I)V", "Lnt/b;", "delegate", "", "undispatched", "d", "(Lku/d1;Lnt/b;Z)V", "e", "(Lku/d1;)V", "b", "(I)Z", "isCancellableMode", "c", "isReusableMode", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e1 {
    public static final <T> void a(@NotNull d1<? super T> d1Var, int i10) {
        nt.b<? super T> bVarC = d1Var.c();
        boolean z10 = i10 == 4;
        if (z10 || !(bVarC instanceof qu.i) || b(i10) != b(d1Var.resumeMode)) {
            d(d1Var, bVarC, z10);
            return;
        }
        qu.i iVar = (qu.i) bVarC;
        l0 l0Var = iVar.dispatcher;
        CoroutineContext context = iVar.getContext();
        if (qu.j.d(l0Var, context)) {
            qu.j.c(l0Var, context, d1Var);
        } else {
            e(d1Var);
        }
    }

    public static final boolean b(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public static final boolean c(int i10) {
        return i10 == 2;
    }

    public static final <T> void d(@NotNull d1<? super T> d1Var, @NotNull nt.b<? super T> bVar, boolean z10) {
        Object objH;
        Object objJ = d1Var.j();
        Throwable thG = d1Var.g(objJ);
        if (thG != null) {
            jt.n.Companion companion = jt.n.INSTANCE;
            objH = jt.o.a(thG);
        } else {
            jt.n.Companion companion2 = jt.n.INSTANCE;
            objH = d1Var.h(objJ);
        }
        Object objB = jt.n.b(objH);
        if (!z10) {
            bVar.resumeWith(objB);
            return;
        }
        Intrinsics.d(bVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        qu.i iVar = (qu.i) bVar;
        nt.b<T> bVar2 = iVar.continuation;
        Object obj = iVar.countOrElement;
        CoroutineContext context = bVar2.getContext();
        Object objI = qu.l0.i(context, obj);
        i3<?> i3VarM = objI != qu.l0.f29659a ? j0.m(bVar2, context, objI) : null;
        try {
            iVar.continuation.resumeWith(objB);
            Unit unit = Unit.f22483a;
        } finally {
            if (i3VarM == null || i3VarM.Y0()) {
                qu.l0.f(context, objI);
            }
        }
    }

    public static final void e(d1<?> d1Var) {
        m1 m1VarB = c3.f22770a.b();
        if (m1VarB.i0()) {
            m1VarB.a0(d1Var);
            return;
        }
        m1VarB.e0(true);
        try {
            d(d1Var, d1Var.c(), true);
            do {
            } while (m1VarB.t0());
        } catch (Throwable th2) {
            try {
                d1Var.i(th2);
            } finally {
                m1VarB.X(true);
            }
        }
    }
}
