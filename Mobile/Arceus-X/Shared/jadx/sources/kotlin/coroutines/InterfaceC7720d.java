package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p315nt.InterfaceC9557b;

/* JADX INFO: renamed from: kotlin.coroutines.d */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\bg\u0018\u0000 \n2\u00020\u0001:\u0001\u000bJ)\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, m31665d2 = {"Lkotlin/coroutines/d;", "Lkotlin/coroutines/CoroutineContext$Element;", "T", "Lnt/b;", "continuation", "v", "(Lnt/b;)Lnt/b;", "", "M", "(Lnt/b;)V", "Ko", "b", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC7720d extends CoroutineContext.Element {

    /* JADX INFO: renamed from: Ko, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f29392a;

    /* JADX INFO: renamed from: kotlin.coroutines.d$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a {
        @Nullable
        /* JADX INFO: renamed from: a */
        public static <E extends CoroutineContext.Element> E m31963a(@NotNull InterfaceC7720d interfaceC7720d, @NotNull CoroutineContext.InterfaceC7716b<E> key) {
            Intrinsics.checkNotNullParameter(key, "key");
            if (!(key instanceof AbstractC7718b)) {
                if (InterfaceC7720d.INSTANCE != key) {
                    return null;
                }
                Intrinsics.m31981d(interfaceC7720d, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return interfaceC7720d;
            }
            AbstractC7718b abstractC7718b = (AbstractC7718b) key;
            if (abstractC7718b.m31954a(interfaceC7720d.getKey())) {
                E e10 = (E) abstractC7718b.m31955b(interfaceC7720d);
                if (e10 instanceof CoroutineContext.Element) {
                    return e10;
                }
            }
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public static CoroutineContext m31964b(@NotNull InterfaceC7720d interfaceC7720d, @NotNull CoroutineContext.InterfaceC7716b<?> key) {
            Intrinsics.checkNotNullParameter(key, "key");
            if (!(key instanceof AbstractC7718b)) {
                return InterfaceC7720d.INSTANCE == key ? C7721e.f29393a : interfaceC7720d;
            }
            AbstractC7718b abstractC7718b = (AbstractC7718b) key;
            return (!abstractC7718b.m31954a(interfaceC7720d.getKey()) || abstractC7718b.m31955b(interfaceC7720d) == null) ? interfaceC7720d : C7721e.f29393a;
        }
    }

    /* JADX INFO: renamed from: kotlin.coroutines.d$b, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31665d2 = {"Lkotlin/coroutines/d$b;", "Lkotlin/coroutines/CoroutineContext$b;", "Lkotlin/coroutines/d;", "<init>", "()V", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion implements CoroutineContext.InterfaceC7716b<InterfaceC7720d> {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f29392a = new Companion();
    }

    /* JADX INFO: renamed from: M */
    void mo31961M(@NotNull InterfaceC9557b<?> continuation);

    @NotNull
    /* JADX INFO: renamed from: v */
    <T> InterfaceC9557b<T> mo31962v(@NotNull InterfaceC9557b<? super T> continuation);
}
