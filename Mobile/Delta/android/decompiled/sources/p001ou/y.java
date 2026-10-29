package p001ou;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.d2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qu.a0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\"\u0010\b\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0080\u0010¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lou/v;", "Lkotlin/coroutines/CoroutineContext;", "currentContext", "", "b", "(Lou/v;Lkotlin/coroutines/CoroutineContext;)V", "Lku/d2;", "collectJob", "d", "(Lku/d2;Lku/d2;)Lku/d2;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class y {
    public static final void b(@NotNull final v<?> vVar, @NotNull CoroutineContext coroutineContext) {
        if (((Number) coroutineContext.fold(0, new Function2() { // from class: ou.x
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(y.c(vVar, ((Integer) obj).intValue(), (CoroutineContext.Element) obj2));
            }
        })).intValue() == vVar.collectContextSize) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + vVar.collectContext + ",\n\t\tbut emission happened in " + coroutineContext + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final int c(v vVar, int i10, CoroutineContext.Element element) {
        CoroutineContext.b<?> key = element.getKey();
        CoroutineContext.Element element2 = vVar.collectContext.get(key);
        if (key != d2.INSTANCE) {
            if (element != element2) {
                return Integer.MIN_VALUE;
            }
            return i10 + 1;
        }
        d2 d2Var = (d2) element2;
        Intrinsics.d(element, "null cannot be cast to non-null type kotlinx.coroutines.Job");
        d2 d2VarD = d((d2) element, d2Var);
        if (d2VarD == d2Var) {
            return d2Var == null ? i10 : i10 + 1;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + d2VarD + ", expected child of " + d2Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }

    @Nullable
    public static final d2 d(@Nullable d2 d2Var, @Nullable d2 d2Var2) {
        while (d2Var != null) {
            if (d2Var == d2Var2 || !(d2Var instanceof a0)) {
                return d2Var;
            }
            d2Var = ((a0) d2Var).j0();
        }
        return null;
    }
}
