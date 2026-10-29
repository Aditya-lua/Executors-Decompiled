package p120f6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: f6.o1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"Lf6/j0;", "Lf6/w;", "a", "(Lf6/j0;)Lf6/w;", "work-runtime_release"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C5406o1 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final WorkGenerationalId m24872a(@NotNull C5390j0 c5390j0) {
        Intrinsics.checkNotNullParameter(c5390j0, "<this>");
        return new WorkGenerationalId(c5390j0.id, c5390j0.getGeneration());
    }
}
