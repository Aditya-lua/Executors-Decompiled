package p256ku;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p315nt.InterfaceC9557b;
import p344ot.C10046b;
import p344ot.C10047c;
import p395qu.C10726i;
import p395qu.C10728j;
import pt.C10346h;

/* JADX INFO: renamed from: ku.m3 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m31665d2 = {"", "a", "(Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C7896m3 {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Object m32808a(@NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objM38805e;
        CoroutineContext context = interfaceC9557b.getContext();
        C7865g2.m32652f(context);
        InterfaceC9557b interfaceC9557bM38803c = C10046b.m38803c(interfaceC9557b);
        C10726i c10726i = interfaceC9557bM38803c instanceof C10726i ? (C10726i) interfaceC9557bM38803c : null;
        if (c10726i == null) {
            objM38805e = Unit.f29331a;
        } else {
            if (C10728j.m40869d(c10726i.dispatcher, context)) {
                c10726i.m40860q(context, Unit.f29331a);
            } else {
                C7891l3 c7891l3 = new C7891l3();
                CoroutineContext coroutineContextPlus = context.plus(c7891l3);
                Unit unit = Unit.f29331a;
                c10726i.m40860q(coroutineContextPlus, unit);
                objM38805e = (!c7891l3.dispatcherWasUnconfined || C10728j.m40870e(c10726i)) ? C10047c.m38805e() : unit;
            }
            objM38805e = C10047c.m38805e();
        }
        if (objM38805e == C10047c.m38805e()) {
            C10346h.m39673c(interfaceC9557b);
        }
        return objM38805e == C10047c.m38805e() ? objM38805e : Unit.f29331a;
    }
}
