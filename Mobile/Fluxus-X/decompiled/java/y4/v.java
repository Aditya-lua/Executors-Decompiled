package y4;

import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"y4/w", "y4/x"}, d2 = {}, k = 4, mv = {2, 1, 0}, xi = 48)
public final class v {
    @Nullable
    public static final <R> Object a(@NotNull u uVar, @NotNull Function1<? super eu.b<? super R>, ? extends Object> function1, @NotNull eu.b<? super R> bVar) {
        return x.b(uVar, function1, bVar);
    }

    public static final void b(@NotNull u uVar, @NotNull c cVar) {
        w.a(uVar, cVar);
    }

    public static final void c(@NotNull Set<Integer> set, @NotNull Set<Integer> set2) {
        w.b(set, set2);
    }

    public static final void d(@NotNull u uVar, @NotNull c cVar) {
        w.c(uVar, cVar);
    }

    @Nullable
    public static final <R> Object e(@NotNull u uVar, @NotNull Function1<? super eu.b<? super R>, ? extends Object> function1, @NotNull eu.b<? super R> bVar) {
        return x.e(uVar, function1, bVar);
    }
}
