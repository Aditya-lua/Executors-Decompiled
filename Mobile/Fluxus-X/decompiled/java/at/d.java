package at;

import com.github.luben.zstd.BuildConfig;
import java.util.Collection;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lat/d;", BuildConfig.FLAVOR, "wrappedValue", BuildConfig.FLAVOR, "b", "(Ljava/lang/Object;)Z", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d {
    default boolean b(@Nullable Object wrappedValue) {
        if (wrappedValue == null) {
            return false;
        }
        if (wrappedValue instanceof Boolean) {
            return ((Boolean) wrappedValue).booleanValue();
        }
        if (wrappedValue instanceof Number) {
            return ((Number) wrappedValue).doubleValue() != 0.0d;
        }
        if (wrappedValue instanceof String) {
            return (((CharSequence) wrappedValue).length() <= 0 || Intrinsics.c(wrappedValue, "[]") || Intrinsics.c(wrappedValue, "null")) ? false : true;
        }
        if (wrappedValue instanceof Collection) {
            return !((Collection) wrappedValue).isEmpty();
        }
        return ((wrappedValue instanceof Object[]) && ((Object[]) wrappedValue).length == 0) ? false : true;
    }
}
