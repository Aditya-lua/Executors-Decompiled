package p136ft;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: ft.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C5828b {
    /* JADX INFO: renamed from: a */
    public static int m26174a(int i10) {
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: b */
    public static <T> HashSet<T> m26175b(int i10) {
        return new HashSet<>(m26174a(i10));
    }

    /* JADX INFO: renamed from: c */
    public static <K, V> LinkedHashMap<K, V> m26176c(int i10) {
        return new LinkedHashMap<>(m26174a(i10));
    }

    /* JADX INFO: renamed from: d */
    public static <T> List<T> m26177d(int i10) {
        return i10 == 0 ? Collections.EMPTY_LIST : new ArrayList(i10);
    }
}
