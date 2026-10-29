package ku;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qu.CoroutineScope;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u001c\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\r\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001aG\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bH\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\f\u0010\r\u001a\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0014\u001a\u00020\u0013*\u00020\u00002\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011¢\u0006\u0004\b\u0014\u0010\u0015\u001a%\u0010\u0019\u001a\u00020\u0013*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0011\u0010\u001b\u001a\u00020\u0013*\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001c\"\u001b\u0010!\u001a\u00020\u001d*\u00020\u00008F¢\u0006\f\u0012\u0004\b \u0010\u001c\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lku/p0;", "Lkotlin/coroutines/CoroutineContext;", "context", "j", "(Lku/p0;Lkotlin/coroutines/CoroutineContext;)Lku/p0;", "b", "()Lku/p0;", "R", "Lkotlin/Function2;", "Lnt/b;", "", "block", "g", "(Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "a", "(Lkotlin/coroutines/CoroutineContext;)Lku/p0;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "", "d", "(Lku/p0;Ljava/util/concurrent/CancellationException;)V", "", "message", "", "c", "(Lku/p0;Ljava/lang/String;Ljava/lang/Throwable;)V", "h", "(Lku/p0;)V", "", "i", "(Lku/p0;)Z", "isActive$annotations", "isActive", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class q0 {
    @NotNull
    public static final p0 a(@NotNull CoroutineContext coroutineContext) {
        if (coroutineContext.get(d2.INSTANCE) == null) {
            coroutineContext = coroutineContext.plus(h2.b(null, 1, null));
        }
        return new CoroutineScope(coroutineContext);
    }

    @NotNull
    public static final p0 b() {
        return new CoroutineScope(z2.b(null, 1, null).plus(g1.c()));
    }

    public static final void c(@NotNull p0 p0Var, @NotNull String str, @Nullable Throwable th2) {
        d(p0Var, r1.a(str, th2));
    }

    public static final void d(@NotNull p0 p0Var, @Nullable CancellationException cancellationException) {
        d2 d2Var = (d2) p0Var.getCoroutineContext().get(d2.INSTANCE);
        if (d2Var != null) {
            d2Var.c(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + p0Var).toString());
    }

    public static /* synthetic */ void e(p0 p0Var, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        c(p0Var, str, th2);
    }

    public static /* synthetic */ void f(p0 p0Var, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        d(p0Var, cancellationException);
    }

    @Nullable
    public static final <R> Object g(@NotNull Function2<? super p0, ? super nt.b<? super R>, ? extends Object> function2, @NotNull nt.b<? super R> bVar) {
        qu.a0 a0Var = new qu.a0(bVar.getContext(), bVar);
        Object objD = ru.b.d(a0Var, a0Var, function2);
        if (objD == ot.c.e()) {
            pt.h.c(bVar);
        }
        return objD;
    }

    public static final void h(@NotNull p0 p0Var) {
        g2.f(p0Var.getCoroutineContext());
    }

    public static final boolean i(@NotNull p0 p0Var) {
        d2 d2Var = (d2) p0Var.getCoroutineContext().get(d2.INSTANCE);
        if (d2Var != null) {
            return d2Var.b();
        }
        return true;
    }

    @NotNull
    public static final p0 j(@NotNull p0 p0Var, @NotNull CoroutineContext coroutineContext) {
        return new CoroutineScope(p0Var.getCoroutineContext().plus(coroutineContext));
    }
}
