package xu;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lxu/r0;", "Lxu/g;", "c", "(Lxu/r0;)Lxu/g;", "Lxu/p0;", "Lxu/f;", "b", "(Lxu/p0;)Lxu/f;", "a", "()Lxu/p0;", "okio"}, k = 5, mv = {2, 2, 0}, xi = 48, xs = "okio/Okio")
public final /* synthetic */ class d0 {
    @NotNull
    public static final p0 a() {
        return new d();
    }

    @NotNull
    public static final f b(@NotNull p0 p0Var) {
        Intrinsics.checkNotNullParameter(p0Var, "<this>");
        return new buffer(p0Var);
    }

    @NotNull
    public static final g c(@NotNull r0 r0Var) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        return new buffer(r0Var);
    }
}
