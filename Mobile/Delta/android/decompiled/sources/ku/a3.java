package ku;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lku/a3;", "S", "Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext;", "context", "updateThreadContext", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/Object;", "oldState", "", "restoreThreadContext", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a3<S> extends CoroutineContext.Element {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static <S, R> R a(@NotNull a3<S> a3Var, R r8, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) CoroutineContext.Element.a.a(a3Var, r8, function2);
        }

        @Nullable
        public static <S, E extends CoroutineContext.Element> E b(@NotNull a3<S> a3Var, @NotNull CoroutineContext.b<E> bVar) {
            return (E) CoroutineContext.Element.a.b(a3Var, bVar);
        }

        @NotNull
        public static <S> CoroutineContext c(@NotNull a3<S> a3Var, @NotNull CoroutineContext.b<?> bVar) {
            return CoroutineContext.Element.a.c(a3Var, bVar);
        }

        @NotNull
        public static <S> CoroutineContext d(@NotNull a3<S> a3Var, @NotNull CoroutineContext coroutineContext) {
            return CoroutineContext.Element.a.d(a3Var, coroutineContext);
        }
    }

    void restoreThreadContext(@NotNull CoroutineContext context, S oldState);

    S updateThreadContext(@NotNull CoroutineContext context);
}
