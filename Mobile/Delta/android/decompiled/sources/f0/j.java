package f0;

import g0.g0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n0.n1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\"\"\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lg0/g0;", "Lf0/i;", "a", "(Lg0/g0;)Lf0/i;", "Ln0/n1$a;", "Ln0/n1$a;", "getOPTION_CAPTURE_REQUEST_CONFIGURATOR", "()Ln0/n1$a;", "OPTION_CAPTURE_REQUEST_CONFIGURATOR", "camera-camera2_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final n1.a<i> f15797a;

    static {
        n1.a<i> aVarA = n1.a.a("camerax.core.appConfig.captureRequestConfigurator", i.class);
        Intrinsics.checkNotNullExpressionValue(aVarA, "create(...)");
        f15797a = aVarA;
    }

    @Nullable
    public static final i a(@NotNull g0 g0Var) {
        Intrinsics.checkNotNullParameter(g0Var, "<this>");
        return (i) g0Var.n().h(f15797a, null);
    }
}
