package c5;

import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x4.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"c5/b", "c5/c"}, d2 = {}, k = 4, mv = {2, 1, 0}, xi = 48)
public final class a {
    public static final void a(@NotNull f5.b bVar) {
        b.a(bVar);
    }

    @Nullable
    public static final Object b(@NotNull u uVar, boolean z10, @NotNull nt.b<? super CoroutineContext> bVar) {
        return c.a(uVar, z10, bVar);
    }

    public static final <R> R c(@NotNull u uVar, boolean z10, boolean z11, @NotNull Function1<? super f5.b, ? extends R> function1) {
        return (R) c.b(uVar, z10, z11, function1);
    }

    @Nullable
    public static final <R> Object d(@NotNull u uVar, @NotNull Function1<? super nt.b<? super R>, ? extends Object> function1, @NotNull nt.b<? super R> bVar) {
        return c.c(uVar, function1, bVar);
    }

    @Nullable
    public static final <R> Object e(@NotNull u uVar, boolean z10, boolean z11, @NotNull Function1<? super f5.b, ? extends R> function1, @NotNull nt.b<? super R> bVar) {
        return c.d(uVar, z10, z11, function1, bVar);
    }

    public static final int f(@NotNull File file) {
        return c.e(file);
    }
}
