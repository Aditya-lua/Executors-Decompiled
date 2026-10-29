package eb;

import java.util.Comparator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f15250a;
    public static final Comparator b;

    static {
        Comparator comparator;
        String strConcat = a3.class.getName().concat("$UnsafeComparator");
        f15250a = strConcat;
        try {
            Object[] enumConstants = Class.forName(strConcat).getEnumConstants();
            Objects.requireNonNull(enumConstants);
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable unused) {
            comparator = z2.INSTANCE;
        }
        b = comparator;
    }
}
