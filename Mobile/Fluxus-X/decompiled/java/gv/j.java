package gv;

import av.b1;
import av.c3;
import av.d2;
import av.i3;
import av.m1;
import com.github.luben.zstd.BuildConfig;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\u0010\u001a\u00020\u0006\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0019\u0010\u0013\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00060\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u0019\u001a\u00020\u00158\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017¨\u0006\u001a"}, d2 = {"Lav/l0;", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "runnable", BuildConfig.FLAVOR, "c", "(Lav/l0;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", BuildConfig.FLAVOR, "d", "(Lav/l0;Lkotlin/coroutines/CoroutineContext;)Z", "T", "Leu/b;", "Lzt/n;", "result", "b", "(Leu/b;Ljava/lang/Object;)V", "Lgv/i;", "e", "(Lgv/i;)Z", "Lgv/e0;", "a", "Lgv/e0;", "UNDEFINED", "REUSABLE_CLAIMED", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e0 f17959a = new e0("UNDEFINED");

    @NotNull
    public static final e0 b = new e0("REUSABLE_CLAIMED");

    public static final <T> void b(@NotNull eu.b<? super T> bVar, @NotNull Object obj) throws b1 {
        if (!(bVar instanceof i)) {
            bVar.resumeWith(obj);
            return;
        }
        i iVar = (i) bVar;
        Object objB = av.e0.b(obj);
        if (d(iVar.dispatcher, iVar.getContext())) {
            iVar._state = objB;
            iVar.resumeMode = 1;
            c(iVar.dispatcher, iVar.getContext(), iVar);
            return;
        }
        m1 m1VarB = c3.f3387a.b();
        if (m1VarB.i0()) {
            iVar._state = objB;
            iVar.resumeMode = 1;
            m1VarB.d0(iVar);
            return;
        }
        m1VarB.f0(true);
        try {
            d2 d2Var = (d2) iVar.getContext().get(d2.INSTANCE);
            if (d2Var == null || d2Var.b()) {
                eu.b<T> bVar2 = iVar.continuation;
                Object obj2 = iVar.countOrElement;
                CoroutineContext context = bVar2.getContext();
                Object objI = l0.i(context, obj2);
                i3<?> i3VarM = objI != l0.f17968a ? av.j0.m(bVar2, context, objI) : null;
                try {
                    iVar.continuation.resumeWith(obj);
                    Unit unit = Unit.f21506a;
                    if (i3VarM == null || i3VarM.Y0()) {
                        l0.f(context, objI);
                    }
                } catch (Throwable th2) {
                    if (i3VarM == null || i3VarM.Y0()) {
                        l0.f(context, objI);
                    }
                    throw th2;
                }
            } else {
                CancellationException cancellationExceptionK = d2Var.k();
                iVar.a(objB, cancellationExceptionK);
                zt.n.Companion companion = zt.n.INSTANCE;
                iVar.resumeWith(zt.n.b(zt.o.a(cancellationExceptionK)));
            }
            while (m1VarB.s0()) {
            }
        } catch (Throwable th3) {
            try {
                iVar.h(th3);
            } finally {
                m1VarB.Y(true);
            }
        }
    }

    public static final void c(@NotNull av.l0 l0Var, @NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) throws b1 {
        try {
            l0Var.I(coroutineContext, runnable);
        } catch (Throwable th2) {
            throw new b1(th2, l0Var, coroutineContext);
        }
    }

    public static final boolean d(@NotNull av.l0 l0Var, @NotNull CoroutineContext coroutineContext) throws b1 {
        try {
            return l0Var.N(coroutineContext);
        } catch (Throwable th2) {
            throw new b1(th2, l0Var, coroutineContext);
        }
    }

    public static final boolean e(@NotNull i<? super Unit> iVar) {
        Unit unit = Unit.f21506a;
        m1 m1VarB = c3.f3387a.b();
        if (m1VarB.k0()) {
            return false;
        }
        if (m1VarB.i0()) {
            iVar._state = unit;
            iVar.resumeMode = 1;
            m1VarB.d0(iVar);
            return true;
        }
        m1VarB.f0(true);
        try {
            iVar.run();
            do {
            } while (m1VarB.s0());
        } catch (Throwable th2) {
            try {
                iVar.h(th2);
            } finally {
                m1VarB.Y(true);
            }
        }
        return false;
    }
}
