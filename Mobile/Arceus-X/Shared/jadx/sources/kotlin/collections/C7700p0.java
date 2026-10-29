package kotlin.collections;

import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p255kt.C7831h;

/* JADX INFO: renamed from: kotlin.collections.p0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0006\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a)\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m31665d2 = {"T", "element", "", "c", "(Ljava/lang/Object;)Ljava/util/Set;", "E", "", "b", "()Ljava/util/Set;", "builder", "a", "(Ljava/util/Set;)Ljava/util/Set;", "kotlin-stdlib"}, m31666k = 5, m31667mv = {2, 2, 0}, m31669xi = 49, m31670xs = "kotlin/collections/SetsKt")
public class C7700p0 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static <E> Set<E> m31902a(@NotNull Set<E> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return ((C7831h) builder).m32549b();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static <E> Set<E> m31903b() {
        return new C7831h();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static <T> Set<T> m31904c(T t8) {
        Set<T> setSingleton = Collections.singleton(t8);
        Intrinsics.checkNotNullExpressionValue(setSingleton, "singleton(...)");
        return setSingleton;
    }
}
