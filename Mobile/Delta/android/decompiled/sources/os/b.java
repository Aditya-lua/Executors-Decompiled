package os;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.o;
import kotlin.collections.q;
import kotlin.collections.u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0015\u0010\u000b\u001a\u00020\u0004*\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\t¨\u0006\fÀ\u0006\u0003"}, d2 = {"Los/b;", "", "wrappedValue", "", "", "a", "(Ljava/lang/Object;)Ljava/util/List;", "value", "d", "(Ljava/lang/Object;)Ljava/lang/String;", "c", "b", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {
    @NotNull
    default List<String> a(@Nullable Object wrappedValue) {
        List<Object> listC = ts.a.c(wrappedValue);
        ArrayList arrayList = new ArrayList(q.u(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(d(it.next()));
        }
        return arrayList;
    }

    default String b(Object obj) {
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if (number.doubleValue() == number.intValue()) {
                return String.valueOf(number.intValue());
            }
        }
        return ts.a.h(obj);
    }

    default List<String> c(Object obj) {
        List list = obj instanceof List ? (List) obj : null;
        if (list == null) {
            return o.d(b(obj));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            u.z(arrayList, c(it.next()));
        }
        return arrayList;
    }

    default String d(Object value) {
        List list = value instanceof List ? (List) value : null;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                u.z(arrayList, c(it.next()));
            }
            String strM0 = CollectionsKt.m0(arrayList, ",", null, null, 0, null, null, 62, null);
            if (strM0 != null) {
                return strM0;
            }
        }
        return b(value);
    }
}
