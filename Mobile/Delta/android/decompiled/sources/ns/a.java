package ns;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q;
import kotlin.text.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\b\b`\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u0004*\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lns/a;", "", "wrappedValue", "", "", "c", "(Ljava/lang/Object;)Ljava/util/List;", "value", "b", "(Ljava/lang/Object;)Ljava/lang/Double;", "d", "(Ljava/util/List;)Ljava/lang/Double;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    default Double b(Object value) {
        if (value instanceof Number) {
            return Double.valueOf(((Number) value).doubleValue());
        }
        if (value instanceof String) {
            return w.r((String) value);
        }
        if (value instanceof List) {
            return d((List) value);
        }
        if (value instanceof Boolean) {
            return Double.valueOf(ts.b.a(((Boolean) value).booleanValue()));
        }
        if (value == null) {
            return Double.valueOf(0.0d);
        }
        return null;
    }

    @NotNull
    default List<Double> c(@Nullable Object wrappedValue) {
        List<Object> listC = ts.a.c(wrappedValue);
        ArrayList arrayList = new ArrayList(q.u(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(b(it.next()));
        }
        return arrayList;
    }

    default Double d(List<?> list) {
        int size = list.size();
        if (size == 0) {
            return Double.valueOf(0.0d);
        }
        if (size != 1) {
            return null;
        }
        return b(CollectionsKt.d0(list));
    }
}
