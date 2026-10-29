package p254ks;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7796w;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ks.c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007À\u0006\u0003"}, m31665d2 = {"Lks/c;", "", "value", "k", "(Ljava/lang/Object;)Ljava/lang/Object;", "o", "g", "core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC7822c {
    /* JADX INFO: renamed from: g */
    default Object m32438g(Object value) {
        String string;
        Integer intOrNull;
        Object objM32289r = null;
        String str = value instanceof String ? (String) value : null;
        if (str != null && (intOrNull = StringsKt.toIntOrNull(str)) != null) {
            objM32289r = intOrNull;
        } else if (str != null) {
            objM32289r = C7796w.m32289r(str);
        }
        return (objM32289r == null || (string = objM32289r.toString()) == null) ? value : string;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    default Object mo29342k(@Nullable Object value) {
        Object objM32439o = m32439o(value);
        return !Intrinsics.m31980c(objM32439o, value) ? new SingleNestedValue(m32438g(objM32439o)) : m32438g(value);
    }

    /* JADX INFO: renamed from: o */
    default Object m32439o(Object obj) {
        if (!(obj instanceof List)) {
            return obj;
        }
        List list = (List) obj;
        return list.size() == 1 ? m32439o(CollectionsKt.firstOrNull(list)) : obj;
    }
}
