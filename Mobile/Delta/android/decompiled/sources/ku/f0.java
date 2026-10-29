package ku;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0015\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lku/f0;", "S", "Lku/a3;", "copyForChild", "()Lku/f0;", "Lkotlin/coroutines/CoroutineContext$Element;", "overwritingElement", "Lkotlin/coroutines/CoroutineContext;", "mergeForChild", "(Lkotlin/coroutines/CoroutineContext$Element;)Lkotlin/coroutines/CoroutineContext;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface f0<S> extends a3<S> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static <S, R> R a(@NotNull f0<S> f0Var, R r8, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) a3.a.a(f0Var, r8, function2);
        }

        @Nullable
        public static <S, E extends CoroutineContext.Element> E b(@NotNull f0<S> f0Var, @NotNull CoroutineContext.b<E> bVar) {
            return (E) a3.a.b(f0Var, bVar);
        }

        @NotNull
        public static <S> CoroutineContext c(@NotNull f0<S> f0Var, @NotNull CoroutineContext.b<?> bVar) {
            return a3.a.c(f0Var, bVar);
        }

        @NotNull
        public static <S> CoroutineContext d(@NotNull f0<S> f0Var, @NotNull CoroutineContext coroutineContext) {
            return a3.a.d(f0Var, coroutineContext);
        }
    }

    @NotNull
    f0<S> copyForChild();

    @NotNull
    CoroutineContext mergeForChild(@NotNull CoroutineContext.Element overwritingElement);
}
