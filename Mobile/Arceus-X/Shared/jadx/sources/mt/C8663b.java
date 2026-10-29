package mt;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: mt.b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\b\n\u0002\u0010\u000f\n\u0002\b\u0006\u001a/\u0010\u0004\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m31665d2 = {"", "T", "a", "b", "d", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "kotlin-stdlib"}, m31666k = 5, m31667mv = {2, 2, 0}, m31669xi = 49, m31670xs = "kotlin/comparisons/ComparisonsKt")
public class C8663b extends C8662a {
    @NotNull
    /* JADX INFO: renamed from: d */
    public static <T extends Comparable<? super T>> T m34746d(@NotNull T a10, @NotNull T b) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return a10.compareTo(b) >= 0 ? a10 : b;
    }
}
