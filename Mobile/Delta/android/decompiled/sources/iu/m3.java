package iu;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "a", "(Llt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m3 {
    @Nullable
    public static final Object a(@NotNull lt.b<? super Unit> bVar) {
        Object objE;
        CoroutineContext context = bVar.getContext();
        g2.g(context);
        lt.b bVarC = mt.b.c(bVar);
        ou.i iVar = bVarC instanceof ou.i ? (ou.i) bVarC : null;
        if (iVar == null) {
            objE = Unit.f22938a;
        } else {
            if (ou.j.d(iVar.dispatcher, context)) {
                iVar.m(context, Unit.f22938a);
            } else {
                l3 l3Var = new l3();
                CoroutineContext coroutineContextPlus = context.plus(l3Var);
                Unit unit = Unit.f22938a;
                iVar.m(coroutineContextPlus, unit);
                objE = (!l3Var.dispatcherWasUnconfined || ou.j.e(iVar)) ? mt.c.e() : unit;
            }
            objE = mt.c.e();
        }
        if (objE == mt.c.e()) {
            nt.h.c(bVar);
        }
        return objE == mt.c.e() ? objE : Unit.f22938a;
    }
}
