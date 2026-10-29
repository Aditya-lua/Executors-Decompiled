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

/* JADX INFO: renamed from: ns.b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J!\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0082\u0010¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m31665d2 = {"Lns/b;", "", "wrappedValue", "", "a", "(Ljava/lang/Object;)Ljava/util/List;", "value", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC9555b {
    @NotNull
    /* JADX INFO: renamed from: a */
    default List<Object> mo33625a(@Nullable Object wrappedValue) {
        List<Object> listM43971c = C11744a.m43971c(wrappedValue);
        ArrayList arrayList = new ArrayList(C7701q.m31905u(listM43971c, 10));
        Iterator<T> it = listM43971c.iterator();
        while (it.hasNext()) {
            arrayList.add(m37699b(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    default Object m37699b(Object value) {
        while (!(value instanceof Number)) {
            if (value instanceof String) {
                return C7796w.m32289r((String) value);
            }
            if (!(value instanceof List)) {
                return null;
            }
            value = CollectionsKt.firstOrNull((List) value);
        }
        return Double.valueOf(((Number) value).doubleValue());
    }
}
