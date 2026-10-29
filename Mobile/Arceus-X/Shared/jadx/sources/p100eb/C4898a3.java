package p100eb;

import java.util.Comparator;
import java.util.Objects;

/* JADX INFO: renamed from: eb.a3 */
/* JADX INFO: loaded from: classes.dex */
public final class C4898a3 {

    /* JADX INFO: renamed from: a */
    public static final String f19626a;

    /* JADX INFO: renamed from: b */
    public static final Comparator f19627b;

    static {
        Comparator comparator;
        String strConcat = C4898a3.class.getName().concat("$UnsafeComparator");
        f19626a = strConcat;
        try {
            Object[] enumConstants = Class.forName(strConcat).getEnumConstants();
            Objects.requireNonNull(enumConstants);
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable unused) {
            comparator = EnumC5046z2.INSTANCE;
        }
        f19627b = comparator;
    }
}
