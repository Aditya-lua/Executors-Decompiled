package androidx.p000lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ku.g1;
import ku.z2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/l;", "Landroidx/lifecycle/m;", "a", "(Landroidx/lifecycle/l;)Landroidx/lifecycle/m;", "coroutineScope", "lifecycle-common"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class q {
    @NotNull
    public static final m a(@NotNull l lVar) {
        n nVar;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        do {
            n nVar2 = (n) lVar.c().b();
            if (nVar2 != null) {
                return nVar2;
            }
            nVar = new n(lVar, z2.b(null, 1, null).plus(g1.c().X()));
        } while (!lVar.c().a(null, nVar));
        nVar.c();
        return nVar;
    }
}
