package p001ou;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.h0;
import nt.b;
import nu.h;
import nu.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.c;
import pt.a;
import qu.l0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001aZ\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00028\u00012\b\b\u0002\u0010\u000e\u001a\u00020\r2\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000fH\u0080@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"T", "Lnu/h;", "Lou/e;", "b", "(Lnu/h;)Lou/e;", "Lnu/i;", "Lkotlin/coroutines/CoroutineContext;", "emitContext", "e", "(Lnu/i;Lkotlin/coroutines/CoroutineContext;)Lnu/i;", "V", "newContext", "value", "", "countOrElement", "Lkotlin/Function2;", "Lnt/b;", "block", "c", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f {
    @NotNull
    public static final <T> e<T> b(@NotNull h<? extends T> hVar) {
        e<T> eVar = hVar instanceof e ? (e) hVar : null;
        if (eVar == null) {
            return new h(hVar, null, 0, null, 14, null);
        }
        return eVar;
    }

    @Nullable
    public static final <T, V> Object c(@NotNull CoroutineContext coroutineContext, V v5, @NotNull Object obj, @NotNull Function2<? super V, ? super b<? super T>, ? extends Object> function2, @NotNull b<? super T> bVar) {
        Object objI = l0.i(coroutineContext, obj);
        try {
            a0 a0Var = new a0(bVar, coroutineContext);
            Object objD = !(function2 instanceof a) ? ot.b.d(function2, v5, a0Var) : ((Function2) h0.e(function2, 2)).invoke(v5, a0Var);
            l0.f(coroutineContext, objI);
            if (objD == c.e()) {
                pt.h.c(bVar);
            }
            return objD;
        } catch (Throwable th2) {
            l0.f(coroutineContext, objI);
            throw th2;
        }
    }

    public static /* synthetic */ Object d(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, b bVar, int i10, Object obj3) {
        if ((i10 & 4) != 0) {
            obj2 = l0.g(coroutineContext);
        }
        return c(coroutineContext, obj, obj2, function2, bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> i<T> e(i<? super T> iVar, CoroutineContext coroutineContext) {
        return ((iVar instanceof z) || (iVar instanceof s)) ? iVar : new c0(iVar, coroutineContext);
    }
}
