package p451ts;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7796w;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ts.d */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0015\u0010\f\u001a\u00020\t*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m31665d2 = {"", "", "b", "(Ljava/lang/String;)I", "intOrZero", "", "c", "(Ljava/lang/String;)J", "longOrZero", "", "a", "(Ljava/lang/String;)D", "doubleOrZero", "utils_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11747d {
    /* JADX INFO: renamed from: a */
    public static final double m43981a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Double dM32289r = C7796w.m32289r(str);
        if (dM32289r != null) {
            return dM32289r.doubleValue();
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: b */
    public static final int m43982b(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return (int) m43981a(str);
    }

    /* JADX INFO: renamed from: c */
    public static final long m43983c(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return (long) m43981a(str);
    }
}
