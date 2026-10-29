package p617ou;

import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p256ku.InterfaceC7850d2;
import p395qu.C10711a0;

/* JADX INFO: renamed from: ou.y */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\"\u0010\b\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0080\u0010¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"Lou/v;", "Lkotlin/coroutines/CoroutineContext;", "currentContext", "", "b", "(Lou/v;Lkotlin/coroutines/CoroutineContext;)V", "Lku/d2;", "collectJob", "d", "(Lku/d2;Lku/d2;)Lku/d2;", "kotlinx-coroutines-core"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C10075y {
    /* JADX INFO: renamed from: b */
    public static final void m38844b(@NotNull final C10072v<?> c10072v, @NotNull CoroutineContext coroutineContext) {
        if (((Number) coroutineContext.fold(0, new Function2() { // from class: ou.x
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(C10075y.m38845c(c10072v, ((Integer) obj).intValue(), (CoroutineContext.Element) obj2));
            }
        })).intValue() == c10072v.collectContextSize) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + c10072v.collectContext + ",\n\t\tbut emission happened in " + coroutineContext + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    /* JADX INFO: renamed from: c */
    public static final int m38845c(C10072v c10072v, int i10, CoroutineContext.Element element) {
        CoroutineContext.InterfaceC7716b<?> key = element.getKey();
        CoroutineContext.Element element2 = c10072v.collectContext.get(key);
        if (key != InterfaceC7850d2.INSTANCE) {
            return element != element2 ? EditorInfoCompat.IME_FLAG_FORCE_ASCII : i10 + 1;
        }
        InterfaceC7850d2 interfaceC7850d2 = (InterfaceC7850d2) element2;
        Intrinsics.m31981d(element, "null cannot be cast to non-null type kotlinx.coroutines.Job");
        InterfaceC7850d2 interfaceC7850d2M38846d = m38846d((InterfaceC7850d2) element, interfaceC7850d2);
        if (interfaceC7850d2M38846d == interfaceC7850d2) {
            return interfaceC7850d2 == null ? i10 : i10 + 1;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + interfaceC7850d2M38846d + ", expected child of " + interfaceC7850d2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static final InterfaceC7850d2 m38846d(@Nullable InterfaceC7850d2 interfaceC7850d2, @Nullable InterfaceC7850d2 interfaceC7850d3) {
        while (interfaceC7850d2 != null) {
            if (interfaceC7850d2 == interfaceC7850d3 || !(interfaceC7850d2 instanceof C10711a0)) {
                return interfaceC7850d2;
            }
            interfaceC7850d2 = ((C10711a0) interfaceC7850d2).m32748j0();
        }
        return null;
    }
}
