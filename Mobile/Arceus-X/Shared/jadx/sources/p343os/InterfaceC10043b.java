package p343os;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7697o;
import kotlin.collections.C7701q;
import kotlin.collections.C7708u;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p451ts.C11744a;

/* JADX INFO: renamed from: os.b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0015\u0010\u000b\u001a\u00020\u0004*\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\t¨\u0006\fÀ\u0006\u0003"}, m31665d2 = {"Los/b;", "", "wrappedValue", "", "", "a", "(Ljava/lang/Object;)Ljava/util/List;", "value", "d", "(Ljava/lang/Object;)Ljava/lang/String;", "c", "b", "core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC10043b {
    @NotNull
    /* JADX INFO: renamed from: a */
    default List<String> mo38787a(@Nullable Object wrappedValue) {
        List<Object> listM43971c = C11744a.m43971c(wrappedValue);
        ArrayList arrayList = new ArrayList(C7701q.m31905u(listM43971c, 10));
        Iterator<T> it = listM43971c.iterator();
        while (it.hasNext()) {
            arrayList.add(m38790d(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    default String m38788b(Object obj) {
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if (number.doubleValue() == number.intValue()) {
                return String.valueOf(number.intValue());
            }
        }
        return C11744a.m43976h(obj);
    }

    /* JADX INFO: renamed from: c */
    default List<String> m38789c(Object obj) {
        List list = obj instanceof List ? (List) obj : null;
        if (list == null) {
            return C7697o.m31878d(m38788b(obj));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7708u.m31931z(arrayList, m38789c(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    default String m38790d(Object value) {
        List list = value instanceof List ? (List) value : null;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C7708u.m31931z(arrayList, m38789c(it.next()));
            }
            String strM0 = CollectionsKt.m31715m0(arrayList, ",", null, null, 0, null, null, 62, null);
            if (strM0 != null) {
                return strM0;
            }
        }
        return m38788b(value);
    }
}
