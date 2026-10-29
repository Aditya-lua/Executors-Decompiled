package p314ns;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7701q;
import kotlin.collections.CollectionsKt;
import kotlin.text.C7796w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p451ts.C11744a;
import p451ts.C11745b;

/* JADX INFO: renamed from: ns.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\b\b`\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u0004*\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, m31665d2 = {"Lns/a;", "", "wrappedValue", "", "", "c", "(Ljava/lang/Object;)Ljava/util/List;", "value", "b", "(Ljava/lang/Object;)Ljava/lang/Double;", "d", "(Ljava/util/List;)Ljava/lang/Double;", "core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC9554a {
    /* JADX INFO: renamed from: b */
    default Double m37697b(Object value) {
        if (value instanceof Number) {
            return Double.valueOf(((Number) value).doubleValue());
        }
        if (value instanceof String) {
            return C7796w.m32289r((String) value);
        }
        if (value instanceof List) {
            return m37698d((List) value);
        }
        if (value instanceof Boolean) {
            return Double.valueOf(C11745b.m43977a(((Boolean) value).booleanValue()));
        }
        if (value == null) {
            return Double.valueOf(0.0d);
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    default List<Double> mo33628c(@Nullable Object wrappedValue) {
        List<Object> listM43971c = C11744a.m43971c(wrappedValue);
        ArrayList arrayList = new ArrayList(C7701q.m31905u(listM43971c, 10));
        Iterator<T> it = listM43971c.iterator();
        while (it.hasNext()) {
            arrayList.add(m37697b(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    default Double m37698d(List<?> list) {
        int size = list.size();
        if (size == 0) {
            return Double.valueOf(0.0d);
        }
        if (size != 1) {
            return null;
        }
        return m37697b(CollectionsKt.m31706d0(list));
    }
}
