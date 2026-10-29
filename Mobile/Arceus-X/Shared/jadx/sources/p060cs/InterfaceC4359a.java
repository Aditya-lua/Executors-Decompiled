package p060cs;

import kotlin.Metadata;
import kotlin.text.C7796w;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: cs.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006À\u0006\u0003"}, m31665d2 = {"Lcs/a;", "", "wrappedValue", "", "b", "(Ljava/lang/Object;)Ljava/lang/Boolean;", "core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC4359a {
    @Nullable
    /* JADX INFO: renamed from: b */
    default Boolean mo22006b(@Nullable Object wrappedValue) {
        Double dM32289r;
        if (wrappedValue instanceof Boolean) {
            return (Boolean) wrappedValue;
        }
        if (wrappedValue instanceof Number) {
            return Boolean.valueOf(((Number) wrappedValue).longValue() > 0);
        }
        if (!(wrappedValue instanceof String) || (dM32289r = C7796w.m32289r((String) wrappedValue)) == null) {
            return null;
        }
        return Boolean.valueOf(((long) dM32289r.doubleValue()) > 0);
    }
}
