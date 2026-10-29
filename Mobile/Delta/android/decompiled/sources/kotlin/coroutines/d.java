package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\bg\u0018\u0000 \n2\u00020\u0001:\u0001\u000bJ)\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lkotlin/coroutines/d;", "Lkotlin/coroutines/CoroutineContext$Element;", "T", "Lnt/b;", "continuation", "v", "(Lnt/b;)Lnt/b;", "", "M", "(Lnt/b;)V", "Ko", "b", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends CoroutineContext.Element {

    /* JADX INFO: renamed from: Ko, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f22524a;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        @Nullable
        public static <E extends CoroutineContext.Element> E a(@NotNull d dVar, @NotNull CoroutineContext.b<E> key) {
            Intrinsics.checkNotNullParameter(key, "key");
            if (!(key instanceof b)) {
                if (d.INSTANCE != key) {
                    return null;
                }
                Intrinsics.d(dVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return dVar;
            }
            b bVar = (b) key;
            if (bVar.a(dVar.getKey())) {
                E e10 = (E) bVar.b(dVar);
                if (e10 instanceof CoroutineContext.Element) {
                    return e10;
                }
            }
            return null;
        }

        @NotNull
        public static CoroutineContext b(@NotNull d dVar, @NotNull CoroutineContext.b<?> key) {
            Intrinsics.checkNotNullParameter(key, "key");
            if (!(key instanceof b)) {
                return d.INSTANCE == key ? e.f22525a : dVar;
            }
            b bVar = (b) key;
            return (!bVar.a(dVar.getKey()) || bVar.b(dVar) == null) ? dVar : e.f22525a;
        }
    }

    /* JADX INFO: renamed from: kotlin.coroutines.d$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/coroutines/d$b;", "Lkotlin/coroutines/CoroutineContext$b;", "Lkotlin/coroutines/d;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements CoroutineContext.b<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f22524a = new Companion();
    }

    void M(@NotNull nt.b<?> continuation);

    @NotNull
    <T> nt.b<T> v(@NotNull nt.b<? super T> continuation);
}
