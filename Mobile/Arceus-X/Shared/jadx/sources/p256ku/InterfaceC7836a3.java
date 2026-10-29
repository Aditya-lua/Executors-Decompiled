package p256ku;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ku.a3 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"Lku/a3;", "S", "Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext;", "context", "updateThreadContext", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/Object;", "oldState", "", "restoreThreadContext", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public interface InterfaceC7836a3<S> extends CoroutineContext.Element {

    /* JADX INFO: renamed from: ku.a3$a */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static <S, R> R m32565a(@NotNull InterfaceC7836a3<S> interfaceC7836a3, R r8, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) CoroutineContext.Element.C7714a.m31947a(interfaceC7836a3, r8, function2);
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public static <S, E extends CoroutineContext.Element> E m32566b(@NotNull InterfaceC7836a3<S> interfaceC7836a3, @NotNull CoroutineContext.InterfaceC7716b<E> interfaceC7716b) {
            return (E) CoroutineContext.Element.C7714a.m31948b(interfaceC7836a3, interfaceC7716b);
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public static <S> CoroutineContext m32567c(@NotNull InterfaceC7836a3<S> interfaceC7836a3, @NotNull CoroutineContext.InterfaceC7716b<?> interfaceC7716b) {
            return CoroutineContext.Element.C7714a.m31949c(interfaceC7836a3, interfaceC7716b);
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public static <S> CoroutineContext m32568d(@NotNull InterfaceC7836a3<S> interfaceC7836a3, @NotNull CoroutineContext coroutineContext) {
            return CoroutineContext.Element.C7714a.m31950d(interfaceC7836a3, coroutineContext);
        }
    }

    void restoreThreadContext(@NotNull CoroutineContext context, S oldState);

    S updateThreadContext(@NotNull CoroutineContext context);
}
