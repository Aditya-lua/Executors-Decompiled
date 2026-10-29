package ku;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"ku/j", "ku/k"}, d2 = {}, k = 4, mv = {2, 1, 0}, xi = 48)
public final class i {
    @NotNull
    public static final <T> w0<T> a(@NotNull p0 p0Var, @NotNull CoroutineContext coroutineContext, @NotNull r0 r0Var, @NotNull Function2<? super p0, ? super nt.b<? super T>, ? extends Object> function2) {
        return k.a(p0Var, coroutineContext, r0Var, function2);
    }

    @NotNull
    public static final d2 c(@NotNull p0 p0Var, @NotNull CoroutineContext coroutineContext, @NotNull r0 r0Var, @NotNull Function2<? super p0, ? super nt.b<? super Unit>, ? extends Object> function2) {
        return k.c(p0Var, coroutineContext, r0Var, function2);
    }

    public static final <T> T e(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super p0, ? super nt.b<? super T>, ? extends Object> function2) {
        return (T) j.a(coroutineContext, function2);
    }

    @Nullable
    public static final <T> Object g(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super p0, ? super nt.b<? super T>, ? extends Object> function2, @NotNull nt.b<? super T> bVar) {
        return k.e(coroutineContext, function2, bVar);
    }
}
