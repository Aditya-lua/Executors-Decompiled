package av;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {BuildConfig.FLAVOR, "a", "(Leu/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m3 {
    @Nullable
    public static final Object a(@NotNull eu.b<? super Unit> bVar) {
        Object objE;
        CoroutineContext context = bVar.getContext();
        g2.i(context);
        eu.b bVarC = fu.b.c(bVar);
        gv.i iVar = bVarC instanceof gv.i ? (gv.i) bVarC : null;
        if (iVar == null) {
            objE = Unit.f21506a;
        } else {
            if (gv.j.d(iVar.dispatcher, context)) {
                iVar.o(context, Unit.f21506a);
            } else {
                l3 l3Var = new l3();
                CoroutineContext coroutineContextPlus = context.plus(l3Var);
                Unit unit = Unit.f21506a;
                iVar.o(coroutineContextPlus, unit);
                objE = (!l3Var.dispatcherWasUnconfined || gv.j.e(iVar)) ? fu.c.e() : unit;
            }
            objE = fu.c.e();
        }
        if (objE == fu.c.e()) {
            gu.h.c(bVar);
        }
        return objE == fu.c.e() ? objE : Unit.f21506a;
    }
}
