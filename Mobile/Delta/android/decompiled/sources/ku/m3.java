package ku;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "a", "(Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m3 {
    @Nullable
    public static final Object a(@NotNull nt.b<? super Unit> bVar) {
        Object objE;
        CoroutineContext context = bVar.getContext();
        g2.f(context);
        nt.b bVarC = ot.b.c(bVar);
        qu.i iVar = bVarC instanceof qu.i ? (qu.i) bVarC : null;
        if (iVar == null) {
            objE = Unit.f22483a;
        } else {
            if (qu.j.d(iVar.dispatcher, context)) {
                iVar.q(context, Unit.f22483a);
            } else {
                l3 l3Var = new l3();
                CoroutineContext coroutineContextPlus = context.plus(l3Var);
                Unit unit = Unit.f22483a;
                iVar.q(coroutineContextPlus, unit);
                objE = (!l3Var.dispatcherWasUnconfined || qu.j.e(iVar)) ? ot.c.e() : unit;
            }
            objE = ot.c.e();
        }
        if (objE == ot.c.e()) {
            pt.h.c(bVar);
        }
        return objE == ot.c.e() ? objE : Unit.f22483a;
    }
}
