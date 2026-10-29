package p256ku;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.C10346h;
import ru.C11137b;

/* JADX INFO: renamed from: ku.z2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001aG\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00052\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006H\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m31665d2 = {"Lku/d2;", "parent", "Lku/a0;", "a", "(Lku/d2;)Lku/a0;", "R", "Lkotlin/Function2;", "Lku/p0;", "Lnt/b;", "", "block", "c", "(Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C7948z2 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InterfaceC7833a0 m32942a(@Nullable InterfaceC7850d2 interfaceC7850d2) {
        return new C7944y2(interfaceC7850d2);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC7833a0 m32943b(InterfaceC7850d2 interfaceC7850d2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC7850d2 = null;
        }
        return m32942a(interfaceC7850d2);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final <R> Object m32944c(@NotNull Function2<? super InterfaceC7906p0, ? super InterfaceC9557b<? super R>, ? extends Object> function2, @NotNull InterfaceC9557b<? super R> interfaceC9557b) {
        C7940x2 c7940x2 = new C7940x2(interfaceC9557b.getContext(), interfaceC9557b);
        Object objM41914d = C11137b.m41914d(c7940x2, c7940x2, function2);
        if (objM41914d == C10047c.m38805e()) {
            C10346h.m39673c(interfaceC9557b);
        }
        return objM41914d;
    }
}
