package p535x4;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p119f5.InterfaceC5361d;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;

/* JADX INFO: renamed from: x4.i0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m31665d2 = {"Lx4/m;", "", "sql", "", "b", "(Lx4/m;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "room-runtime"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C12667i0 {
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final Object m47178b(@NotNull InterfaceC12674m interfaceC12674m, @NotNull String str, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objMo47227a = interfaceC12674m.mo47227a(str, new Function1() { // from class: x4.h0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C12667i0.m47179c((InterfaceC5361d) obj));
            }
        }, interfaceC9557b);
        return objMo47227a == C10047c.m38805e() ? objMo47227a : Unit.f29331a;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m47179c(InterfaceC5361d it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.mo24704g3();
    }
}
