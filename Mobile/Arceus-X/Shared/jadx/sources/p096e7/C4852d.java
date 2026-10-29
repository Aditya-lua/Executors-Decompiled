package p096e7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7690k0;
import kotlin.collections.C7699p;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: e7.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000,\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u001aC\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001a7\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m31665d2 = {"", "K", "V", "", "initialCapacity", "", "loadFactor", "", "a", "(IF)Ljava/util/Map;", "", "d", "(Ljava/util/Map;)Ljava/util/Map;", "T", "", "c", "(Ljava/util/List;)Ljava/util/List;", "coil-core_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4852d {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <K, V> Map<K, V> m23421a(int i10, float f10) {
        return new LinkedHashMap(i10, f10, true);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Map m23422b(int i10, float f10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            f10 = 0.75f;
        }
        return m23421a(i10, f10);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final <T> List<T> m23423c(@NotNull List<? extends T> list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(CollectionsKt.m31706d0(list));
        }
        return C7699p.m31892k();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final <K, V> Map<K, V> m23424d(@NotNull Map<K, ? extends V> map) {
        int size = map.size();
        if (size == 0) {
            return C7690k0.m31795j();
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) CollectionsKt.m31705c0(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }
}
