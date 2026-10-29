package ks;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.text.w;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\b\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lks/a;", "", "wrappedValue", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "f", "(Ljava/util/List;)Ljava/lang/Object;", "p", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    @Nullable
    default Object a(@Nullable Object wrappedValue) {
        if (wrappedValue instanceof Number) {
            return Double.valueOf(((Number) wrappedValue).doubleValue());
        }
        if (wrappedValue instanceof String) {
            Double dR = w.r((String) wrappedValue);
            return dR == null ? wrappedValue : dR;
        }
        if (!(wrappedValue instanceof List)) {
            return wrappedValue instanceof Boolean ? Double.valueOf(ts.b.a(((Boolean) wrappedValue).booleanValue())) : wrappedValue;
        }
        Object objF = f((List) wrappedValue);
        return objF == null ? wrappedValue : objF;
    }

    default Object f(List<?> list) {
        if (ts.a.g(list)) {
            return Double.valueOf(0.0d);
        }
        return list.isEmpty() ? "" : p(list);
    }

    default Object p(List<?> list) {
        if (((list.size() != 1 || (CollectionsKt.firstOrNull(list) instanceof Boolean)) ? null : list) != null) {
            return a(CollectionsKt.firstOrNull(list));
        }
        return null;
    }
}
