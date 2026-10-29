package ft;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static int a(int i10) {
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static <T> HashSet<T> b(int i10) {
        return new HashSet<>(a(i10));
    }

    public static <K, V> LinkedHashMap<K, V> c(int i10) {
        return new LinkedHashMap<>(a(i10));
    }

    public static <T> List<T> d(int i10) {
        return i10 == 0 ? Collections.EMPTY_LIST : new ArrayList(i10);
    }
}
