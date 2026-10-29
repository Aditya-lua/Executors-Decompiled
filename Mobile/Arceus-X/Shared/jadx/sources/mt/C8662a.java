package mt;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: mt.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0010\u000f\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0002\u001a\u00020\u0004\"\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00002\b\u0010\u0002\u001a\u0004\u0018\u00018\u00002\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0002\u0010\u0005\u001a-\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0006j\b\u0012\u0004\u0012\u00028\u0000`\u0007\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u0003\u0010\b\u001a-\u0010\t\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0006j\b\u0012\u0004\u0012\u00028\u0000`\u0007\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, m31665d2 = {"", "T", "a", "b", "", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)I", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "()Ljava/util/Comparator;", "c", "kotlin-stdlib"}, m31666k = 5, m31667mv = {2, 2, 0}, m31669xi = 49, m31670xs = "kotlin/comparisons/ComparisonsKt")
public class C8662a {
    /* JADX INFO: renamed from: a */
    public static <T extends Comparable<?>> int m34743a(@Nullable T t8, @Nullable T t10) {
        if (t8 == t10) {
            return 0;
        }
        if (t8 == null) {
            return -1;
        }
        if (t10 == null) {
            return 1;
        }
        return t8.compareTo(t10);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static <T extends Comparable<? super T>> Comparator<T> m34744b() {
        C8664c c8664c = C8664c.f31646a;
        Intrinsics.m31981d(c8664c, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>");
        return c8664c;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static <T extends Comparable<? super T>> Comparator<T> m34745c() {
        C8665d c8665d = C8665d.f31647a;
        Intrinsics.m31981d(c8665d, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>");
        return c8665d;
    }
}
