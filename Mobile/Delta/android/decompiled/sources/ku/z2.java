package ku;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001aG\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00052\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006H\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lku/d2;", "parent", "Lku/a0;", "a", "(Lku/d2;)Lku/a0;", "R", "Lkotlin/Function2;", "Lku/p0;", "Lnt/b;", "", "block", "c", "(Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class z2 {
    @NotNull
    public static final a0 a(@Nullable d2 d2Var) {
        return new y2(d2Var);
    }

    public static /* synthetic */ a0 b(d2 d2Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d2Var = null;
        }
        return a(d2Var);
    }

    @Nullable
    public static final <R> Object c(@NotNull Function2<? super p0, ? super nt.b<? super R>, ? extends Object> function2, @NotNull nt.b<? super R> bVar) {
        x2 x2Var = new x2(bVar.getContext(), bVar);
        Object objD = ru.b.d(x2Var, x2Var, function2);
        if (objD == ot.c.e()) {
            pt.h.c(bVar);
        }
        return objD;
    }
}
