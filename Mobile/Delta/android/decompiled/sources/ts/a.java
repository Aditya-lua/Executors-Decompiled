package ts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.o;
import kotlin.collections.q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000f\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u00020\u0004*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0007\u0010\u0006\"\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\b*\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\b\t\u0010\n\")\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\f0\b*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\b8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\" \u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f*\u0004\u0018\u00010\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u001f\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\b*\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\n\"(\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\b*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u0018"}, d2 = {"", "", "h", "(Ljava/lang/Object;)Ljava/lang/String;", "", "g", "(Ljava/lang/Object;)Z", "f", "", "c", "(Ljava/lang/Object;)Ljava/util/List;", "asList", "", "d", "(Ljava/util/List;)Ljava/util/List;", "comparableList", "a", "(Ljava/lang/Object;)Ljava/lang/Comparable;", "asComparable", "", "b", "asDoubleList", "e", "doubleList", "utils_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {
    public static final Comparable<?> a(Object obj) {
        if (obj instanceof Comparable) {
            return (Comparable) obj;
        }
        if (obj instanceof List) {
            return new rs.a((List) obj);
        }
        return null;
    }

    @NotNull
    public static final List<Double> b(@Nullable Object obj) {
        return e(c(obj));
    }

    @NotNull
    public static final List<Object> c(@Nullable Object obj) {
        List list = obj instanceof List ? (List) obj : null;
        return list != null ? new rs.a(list) : new rs.a(o.d(obj));
    }

    @NotNull
    public static final List<Comparable<?>> d(@NotNull List<? extends Object> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<Object> listC = c(list);
        ArrayList arrayList = new ArrayList(q.u(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(a(it.next()));
        }
        return arrayList;
    }

    public static final List<Double> e(List<? extends Object> list) {
        List<? extends Object> list2 = list;
        ArrayList arrayList = new ArrayList(q.u(list2, 10));
        for (Object obj : list2) {
            arrayList.add(obj instanceof Number ? Double.valueOf(((Number) obj).doubleValue()) : obj instanceof String ? w.r((String) obj) : null);
        }
        return arrayList;
    }

    public static final boolean f(@Nullable Object obj) {
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map != null && !map.isEmpty()) {
            Set setKeySet = map.keySet();
            if ((setKeySet instanceof Collection) && setKeySet.isEmpty()) {
                return true;
            }
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof String)) {
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean g(@Nullable Object obj) {
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        return list.size() == 1 && CollectionsKt.d0(list) == null;
    }

    @NotNull
    public static final String h(@Nullable Object obj) {
        String string = obj != null ? obj.toString() : null;
        return string == null ? "" : string;
    }
}
