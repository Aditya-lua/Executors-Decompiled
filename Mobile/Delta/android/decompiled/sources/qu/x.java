package qu;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aE\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a?\u0010\u000b\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f**\b\u0000\u0010\r\u001a\u0004\b\u0000\u0010\u0000\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u000e"}, d2 = {"E", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "element", "Lqu/s0;", "undeliveredElementException", "b", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lqu/s0;)Lqu/s0;", "Lkotlin/coroutines/CoroutineContext;", "context", "a", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", "OnUndeliveredElement", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class x {
    public static final <E> void a(@NotNull Function1<? super E, Unit> function1, E e10, @NotNull CoroutineContext coroutineContext) {
        s0 s0VarB = b(function1, e10, null);
        if (s0VarB != null) {
            ku.n0.a(coroutineContext, s0VarB);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <E> s0 b(@NotNull Function1<? super E, Unit> function1, E e10, @Nullable s0 s0Var) {
        try {
            function1.invoke(e10);
            return s0Var;
        } catch (Throwable th2) {
            if (s0Var != null && s0Var.getCause() != th2) {
                jt.a.a(s0Var, th2);
                return s0Var;
            }
            return new s0("Exception in undelivered element handler for " + e10, th2);
        }
    }

    public static /* synthetic */ s0 c(Function1 function1, Object obj, s0 s0Var, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            s0Var = null;
        }
        return b(function1, obj, s0Var);
    }
}
