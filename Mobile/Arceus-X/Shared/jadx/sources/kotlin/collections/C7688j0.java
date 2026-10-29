package kotlin.collections;

import java.util.Collections;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p255kt.C7827d;

/* JADX INFO: renamed from: kotlin.collections.j0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a9\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\u0001¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\r\u001a;\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007H\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001aA\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0013\u0010\u0014\u001a9\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0000¢\u0006\u0004\b\u0015\u0010\u0010\u001a\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0001¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m31665d2 = {"K", "V", "Lkotlin/Pair;", "pair", "", "g", "(Lkotlin/Pair;)Ljava/util/Map;", "", "d", "()Ljava/util/Map;", "", "capacity", "e", "(I)Ljava/util/Map;", "builder", "c", "(Ljava/util/Map;)Ljava/util/Map;", "", "Ljava/util/SortedMap;", "i", "(Ljava/util/Map;)Ljava/util/SortedMap;", "h", "expectedSize", "f", "(I)I", "kotlin-stdlib"}, m31666k = 5, m31667mv = {2, 2, 0}, m31669xi = 49, m31670xs = "kotlin/collections/MapsKt")
public class C7688j0 extends C7686i0 {
    @NotNull
    /* JADX INFO: renamed from: c */
    public static <K, V> Map<K, V> m31787c(@NotNull Map<K, V> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return ((C7827d) builder).m32520l();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static <K, V> Map<K, V> m31788d() {
        return new C7827d();
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static <K, V> Map<K, V> m31789e(int i10) {
        return new C7827d(i10);
    }

    /* JADX INFO: renamed from: f */
    public static int m31790f(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static <K, V> Map<K, V> m31791g(@NotNull Pair<? extends K, ? extends V> pair) {
        Intrinsics.checkNotNullParameter(pair, "pair");
        Map<K, V> mapSingletonMap = Collections.singletonMap(pair.m31673c(), pair.m31674d());
        Intrinsics.checkNotNullExpressionValue(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final <K, V> Map<K, V> m31792h(@NotNull Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> mapSingletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        Intrinsics.checkNotNullExpressionValue(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static <K extends Comparable<? super K>, V> SortedMap<K, V> m31793i(@NotNull Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return new TreeMap(map);
    }
}
