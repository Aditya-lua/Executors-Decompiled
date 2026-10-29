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
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J!\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0082\u0010¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lns/b;", "", "wrappedValue", "", "a", "(Ljava/lang/Object;)Ljava/util/List;", "value", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {
    @NotNull
    default List<Object> a(@Nullable Object wrappedValue) {
        List<Object> listC = ts.a.c(wrappedValue);
        ArrayList arrayList = new ArrayList(q.u(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(b(it.next()));
        }
        return arrayList;
    }

    default Object b(Object value) {
        while (!(value instanceof Number)) {
            if (value instanceof String) {
                return w.r((String) value);
            }
            if (!(value instanceof List)) {
                return null;
            }
            value = CollectionsKt.firstOrNull((List) value);
        }
        return Double.valueOf(((Number) value).doubleValue());
    }
}
