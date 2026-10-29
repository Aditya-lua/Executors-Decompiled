package f6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf6/j0;", "Lf6/w;", "a", "(Lf6/j0;)Lf6/w;", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class o1 {
    @NotNull
    public static final WorkGenerationalId a(@NotNull j0 j0Var) {
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        return new WorkGenerationalId(j0Var.id, j0Var.getGeneration());
    }
}
