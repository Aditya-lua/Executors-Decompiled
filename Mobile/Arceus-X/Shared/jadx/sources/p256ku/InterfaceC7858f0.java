package p256ku;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ku.f0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0015\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"Lku/f0;", "S", "Lku/a3;", "copyForChild", "()Lku/f0;", "Lkotlin/coroutines/CoroutineContext$Element;", "overwritingElement", "Lkotlin/coroutines/CoroutineContext;", "mergeForChild", "(Lkotlin/coroutines/CoroutineContext$Element;)Lkotlin/coroutines/CoroutineContext;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public interface InterfaceC7858f0<S> extends InterfaceC7836a3<S> {

    /* JADX INFO: renamed from: ku.f0$a */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static <S, R> R m32634a(@NotNull InterfaceC7858f0<S> interfaceC7858f0, R r8, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) InterfaceC7836a3.a.m32565a(interfaceC7858f0, r8, function2);
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public static <S, E extends CoroutineContext.Element> E m32635b(@NotNull InterfaceC7858f0<S> interfaceC7858f0, @NotNull CoroutineContext.InterfaceC7716b<E> interfaceC7716b) {
            return (E) InterfaceC7836a3.a.m32566b(interfaceC7858f0, interfaceC7716b);
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public static <S> CoroutineContext m32636c(@NotNull InterfaceC7858f0<S> interfaceC7858f0, @NotNull CoroutineContext.InterfaceC7716b<?> interfaceC7716b) {
            return InterfaceC7836a3.a.m32567c(interfaceC7858f0, interfaceC7716b);
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public static <S> CoroutineContext m32637d(@NotNull InterfaceC7858f0<S> interfaceC7858f0, @NotNull CoroutineContext coroutineContext) {
            return InterfaceC7836a3.a.m32568d(interfaceC7858f0, coroutineContext);
        }
    }

    @NotNull
    InterfaceC7858f0<S> copyForChild();

    @NotNull
    CoroutineContext mergeForChild(@NotNull CoroutineContext.Element overwritingElement);
}
