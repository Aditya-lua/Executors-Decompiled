package ku;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aI\u0010\u000b\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0004\b\u000b\u0010\f\u001aU\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\r*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0004\b\u000f\u0010\u0010\u001aO\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lku/p0;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lku/r0;", "start", "Lkotlin/Function2;", "Lnt/b;", "", "", "block", "Lku/d2;", "c", "(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;)Lku/d2;", "T", "Lku/w0;", "a", "(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;)Lku/w0;", "e", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/BuildersKt")
public final /* synthetic */ class k {
    @NotNull
    public static final <T> w0<T> a(@NotNull p0 p0Var, @NotNull CoroutineContext coroutineContext, @NotNull r0 r0Var, @NotNull Function2<? super p0, ? super nt.b<? super T>, ? extends Object> function2) {
        CoroutineContext coroutineContextK = j0.k(p0Var, coroutineContext);
        x0 l2Var = r0Var.c() ? new l2(coroutineContextK, function2) : new x0(coroutineContextK, true);
        ((a) l2Var).W0(r0Var, l2Var, function2);
        return (w0<T>) l2Var;
    }

    public static /* synthetic */ w0 b(p0 p0Var, CoroutineContext coroutineContext, r0 r0Var, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.e.f22525a;
        }
        if ((i10 & 2) != 0) {
            r0Var = r0.DEFAULT;
        }
        return i.a(p0Var, coroutineContext, r0Var, function2);
    }

    @NotNull
    public static final d2 c(@NotNull p0 p0Var, @NotNull CoroutineContext coroutineContext, @NotNull r0 r0Var, @NotNull Function2<? super p0, ? super nt.b<? super Unit>, ? extends Object> function2) {
        CoroutineContext coroutineContextK = j0.k(p0Var, coroutineContext);
        a m2Var = r0Var.c() ? new m2(coroutineContextK, function2) : new w2(coroutineContextK, true);
        m2Var.W0(r0Var, m2Var, function2);
        return m2Var;
    }

    public static /* synthetic */ d2 d(p0 p0Var, CoroutineContext coroutineContext, r0 r0Var, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.e.f22525a;
        }
        if ((i10 & 2) != 0) {
            r0Var = r0.DEFAULT;
        }
        return i.c(p0Var, coroutineContext, r0Var, function2);
    }

    @Nullable
    public static final <T> Object e(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super p0, ? super nt.b<? super T>, ? extends Object> function2, @NotNull nt.b<? super T> bVar) {
        Object objY0;
        CoroutineContext context = bVar.getContext();
        CoroutineContext coroutineContextJ = j0.j(context, coroutineContext);
        g2.f(coroutineContextJ);
        if (coroutineContextJ == context) {
            qu.a0 a0Var = new qu.a0(coroutineContextJ, bVar);
            objY0 = ru.b.d(a0Var, a0Var, function2);
        } else {
            kotlin.coroutines.d.Companion bVar2 = kotlin.coroutines.d.INSTANCE;
            if (Intrinsics.c(coroutineContextJ.get(bVar2), context.get(bVar2))) {
                i3 i3Var = new i3(coroutineContextJ, bVar);
                CoroutineContext context2 = i3Var.getContext();
                Object objI = qu.l0.i(context2, null);
                try {
                    Object objD = ru.b.d(i3Var, i3Var, function2);
                    qu.l0.f(context2, objI);
                    objY0 = objD;
                } catch (Throwable th2) {
                    qu.l0.f(context2, objI);
                    throw th2;
                }
            } else {
                c1 c1Var = new c1(coroutineContextJ, bVar);
                ru.a.b(function2, c1Var, c1Var);
                objY0 = c1Var.Y0();
            }
        }
        if (objY0 == ot.c.e()) {
            pt.h.c(bVar);
        }
        return objY0;
    }
}
