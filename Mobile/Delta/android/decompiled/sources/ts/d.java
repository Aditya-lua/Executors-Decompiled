package ts;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0015\u0010\f\u001a\u00020\t*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"", "", "b", "(Ljava/lang/String;)I", "intOrZero", "", "c", "(Ljava/lang/String;)J", "longOrZero", "", "a", "(Ljava/lang/String;)D", "doubleOrZero", "utils_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {
    public static final double a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Double dR = w.r(str);
        if (dR != null) {
            return dR.doubleValue();
        }
        return 0.0d;
    }

    public static final int b(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return (int) a(str);
    }

    public static final long c(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return (long) a(str);
    }
}
