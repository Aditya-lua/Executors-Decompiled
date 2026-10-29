package ps;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.Nullable;
import p451ts.C11744a;

/* JADX INFO: renamed from: ps.o */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006À\u0006\u0003"}, m31665d2 = {"Lps/o;", "", "wrappedValue", "", "a", "(Ljava/lang/Object;)Ljava/lang/String;", "operations-stdlib_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC10333o {
    @Nullable
    /* JADX INFO: renamed from: a */
    default String mo39631a(@Nullable Object wrappedValue) {
        List<Object> listM43971c = C11744a.m43971c(wrappedValue);
        if (listM43971c.size() <= 1) {
            Object objFirstOrNull = CollectionsKt.firstOrNull(listM43971c);
            if (objFirstOrNull instanceof String) {
                return (String) objFirstOrNull;
            }
        }
        return null;
    }
}
