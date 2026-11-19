package y4;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ly4/m;", BuildConfig.FLAVOR, "sql", BuildConfig.FLAVOR, "b", "(Ly4/m;Ljava/lang/String;Leu/b;)Ljava/lang/Object;", "room-runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i0 {
    @Nullable
    public static final Object b(@NotNull m mVar, @NotNull String str, @NotNull eu.b<? super Unit> bVar) {
        Object objA = mVar.a(str, new Function1() { // from class: y4.h0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(i0.c((g5.d) obj));
            }
        }, bVar);
        return objA == fu.c.e() ? objA : Unit.f21506a;
    }

    public static final boolean c(g5.d it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.n3();
    }
}
