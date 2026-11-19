package ew;

import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lew/l0;", "Lew/g;", "c", "(Lew/l0;)Lew/g;", "Lew/j0;", "Lew/f;", "b", "(Lew/j0;)Lew/f;", "a", "()Lew/j0;", "okio"}, k = 5, mv = {2, 2, 0}, xi = 48, xs = "okio/Okio")
public final /* synthetic */ class x {
    @NotNull
    public static final j0 a() {
        return new d();
    }

    @NotNull
    public static final f b(@NotNull j0 j0Var) {
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        return new buffer(j0Var);
    }

    @NotNull
    public static final g c(@NotNull l0 l0Var) {
        Intrinsics.checkNotNullParameter(l0Var, "<this>");
        return new buffer(l0Var);
    }
}
