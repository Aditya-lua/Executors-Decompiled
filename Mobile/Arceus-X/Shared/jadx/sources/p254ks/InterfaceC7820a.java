package p254ks;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.text.C7796w;
import org.jetbrains.annotations.Nullable;
import p451ts.C11744a;
import p451ts.C11745b;

/* JADX INFO: renamed from: ks.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\b\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007¨\u0006\tÀ\u0006\u0003"}, m31665d2 = {"Lks/a;", "", "wrappedValue", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "f", "(Ljava/util/List;)Ljava/lang/Object;", "p", "core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC7820a {
    @Nullable
    /* JADX INFO: renamed from: a */
    default Object mo29340a(@Nullable Object wrappedValue) {
        if (wrappedValue instanceof Number) {
            return Double.valueOf(((Number) wrappedValue).doubleValue());
        }
        if (wrappedValue instanceof String) {
            Double dM32289r = C7796w.m32289r((String) wrappedValue);
            return dM32289r == null ? wrappedValue : dM32289r;
        }
        if (!(wrappedValue instanceof List)) {
            return wrappedValue instanceof Boolean ? Double.valueOf(C11745b.m43977a(((Boolean) wrappedValue).booleanValue())) : wrappedValue;
        }
        Object objM32436f = m32436f((List) wrappedValue);
        return objM32436f == null ? wrappedValue : objM32436f;
    }

    /* JADX INFO: renamed from: f */
    default Object m32436f(List<?> list) {
        if (C11744a.m43975g(list)) {
            return Double.valueOf(0.0d);
        }
        return list.isEmpty() ? "" : m32437p(list);
    }

    /* JADX INFO: renamed from: p */
    default Object m32437p(List<?> list) {
        if (((list.size() != 1 || (CollectionsKt.firstOrNull(list) instanceof Boolean)) ? null : list) != null) {
            return mo29340a(CollectionsKt.firstOrNull(list));
        }
        return null;
    }
}
