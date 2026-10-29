package gk;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a%\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\f\u0012\u0004\u0012\u00020\u0001\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\f\u0012\u0004\u0012\u00020\u0001\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "", "key", "", "b", "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;", "", "a", "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Integer;", "NativeShell_googleProdRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class q {
    @Nullable
    public static final Integer a(@NotNull Map<String, ?> map, @NotNull String key) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Object intOrNull = map.get(key);
        Object obj = null;
        if (intOrNull != null) {
            if (!(intOrNull instanceof Integer) && (intOrNull = StringsKt.toIntOrNull(intOrNull.toString())) == null) {
                intOrNull = null;
            }
            obj = intOrNull;
        }
        return (Integer) obj;
    }

    @Nullable
    public static final Long b(@NotNull Map<String, ?> map, @NotNull String key) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Object objT = map.get(key);
        Object obj = null;
        if (objT != null) {
            if (!(objT instanceof Long) && (objT = StringsKt.t(objT.toString())) == null) {
                objT = null;
            }
            obj = objT;
        }
        return (Long) obj;
    }
}
